// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.LogSchedulePolicyResponse;
import com.pulumi.azurenative.recoveryservices.inputs.LongTermRetentionPolicyResponse;
import com.pulumi.azurenative.recoveryservices.inputs.LongTermSchedulePolicyResponse;
import com.pulumi.azurenative.recoveryservices.inputs.SimpleRetentionPolicyResponse;
import com.pulumi.azurenative.recoveryservices.inputs.SimpleSchedulePolicyResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Mab container-specific backup policy.
 * 
 */
public final class MabProtectionPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final MabProtectionPolicyResponse Empty = new MabProtectionPolicyResponse();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is &#39;MAB&#39;.
     * 
     */
    @Import(name="backupManagementType", required=true)
    private String backupManagementType;

    /**
     * @return This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is &#39;MAB&#39;.
     * 
     */
    public String backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Number of items associated with this policy.
     * 
     */
    @Import(name="protectedItemsCount")
    private @Nullable Integer protectedItemsCount;

    /**
     * @return Number of items associated with this policy.
     * 
     */
    public Optional<Integer> protectedItemsCount() {
        return Optional.ofNullable(this.protectedItemsCount);
    }

    /**
     * Retention policy details.
     * 
     */
    @Import(name="retentionPolicy")
    private @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy;

    /**
     * @return Retention policy details.
     * 
     */
    public Optional<Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse>> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }

    /**
     * Backup schedule of backup policy.
     * 
     */
    @Import(name="schedulePolicy")
    private @Nullable Object schedulePolicy;

    /**
     * @return Backup schedule of backup policy.
     * 
     */
    public Optional<Object> schedulePolicy() {
        return Optional.ofNullable(this.schedulePolicy);
    }

    private MabProtectionPolicyResponse() {}

    private MabProtectionPolicyResponse(MabProtectionPolicyResponse $) {
        this.backupManagementType = $.backupManagementType;
        this.protectedItemsCount = $.protectedItemsCount;
        this.retentionPolicy = $.retentionPolicy;
        this.schedulePolicy = $.schedulePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MabProtectionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MabProtectionPolicyResponse $;

        public Builder() {
            $ = new MabProtectionPolicyResponse();
        }

        public Builder(MabProtectionPolicyResponse defaults) {
            $ = new MabProtectionPolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupManagementType This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
         * Expected value is &#39;MAB&#39;.
         * 
         * @return builder
         * 
         */
        public Builder backupManagementType(String backupManagementType) {
            $.backupManagementType = backupManagementType;
            return this;
        }

        /**
         * @param protectedItemsCount Number of items associated with this policy.
         * 
         * @return builder
         * 
         */
        public Builder protectedItemsCount(@Nullable Integer protectedItemsCount) {
            $.protectedItemsCount = protectedItemsCount;
            return this;
        }

        /**
         * @param retentionPolicy Retention policy details.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(@Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy) {
            $.retentionPolicy = retentionPolicy;
            return this;
        }

        /**
         * @param retentionPolicy Retention policy details.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(LongTermRetentionPolicyResponse retentionPolicy) {
            return retentionPolicy(Either.ofLeft(retentionPolicy));
        }

        /**
         * @param retentionPolicy Retention policy details.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(SimpleRetentionPolicyResponse retentionPolicy) {
            return retentionPolicy(Either.ofRight(retentionPolicy));
        }

        /**
         * @param schedulePolicy Backup schedule of backup policy.
         * 
         * @return builder
         * 
         */
        public Builder schedulePolicy(@Nullable Object schedulePolicy) {
            $.schedulePolicy = schedulePolicy;
            return this;
        }

        public MabProtectionPolicyResponse build() {
            $.backupManagementType = Codegen.stringProp("backupManagementType").arg($.backupManagementType).require();
            return $;
        }
    }

}
