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
 * AzureStorage backup policy.
 * 
 */
public final class AzureFileShareProtectionPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureFileShareProtectionPolicyResponse Empty = new AzureFileShareProtectionPolicyResponse();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is &#39;AzureStorage&#39;.
     * 
     */
    @Import(name="backupManagementType", required=true)
    private String backupManagementType;

    /**
     * @return This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is &#39;AzureStorage&#39;.
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
     * Retention policy with the details on backup copy retention ranges.
     * 
     */
    @Import(name="retentionPolicy")
    private @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy;

    /**
     * @return Retention policy with the details on backup copy retention ranges.
     * 
     */
    public Optional<Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse>> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }

    /**
     * Backup schedule specified as part of backup policy.
     * 
     */
    @Import(name="schedulePolicy")
    private @Nullable Object schedulePolicy;

    /**
     * @return Backup schedule specified as part of backup policy.
     * 
     */
    public Optional<Object> schedulePolicy() {
        return Optional.ofNullable(this.schedulePolicy);
    }

    /**
     * TimeZone optional input as string. For example: TimeZone = &#34;Pacific Standard Time&#34;.
     * 
     */
    @Import(name="timeZone")
    private @Nullable String timeZone;

    /**
     * @return TimeZone optional input as string. For example: TimeZone = &#34;Pacific Standard Time&#34;.
     * 
     */
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    /**
     * Type of workload for the backup management
     * 
     */
    @Import(name="workLoadType")
    private @Nullable String workLoadType;

    /**
     * @return Type of workload for the backup management
     * 
     */
    public Optional<String> workLoadType() {
        return Optional.ofNullable(this.workLoadType);
    }

    private AzureFileShareProtectionPolicyResponse() {}

    private AzureFileShareProtectionPolicyResponse(AzureFileShareProtectionPolicyResponse $) {
        this.backupManagementType = $.backupManagementType;
        this.protectedItemsCount = $.protectedItemsCount;
        this.retentionPolicy = $.retentionPolicy;
        this.schedulePolicy = $.schedulePolicy;
        this.timeZone = $.timeZone;
        this.workLoadType = $.workLoadType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFileShareProtectionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFileShareProtectionPolicyResponse $;

        public Builder() {
            $ = new AzureFileShareProtectionPolicyResponse();
        }

        public Builder(AzureFileShareProtectionPolicyResponse defaults) {
            $ = new AzureFileShareProtectionPolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupManagementType This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
         * Expected value is &#39;AzureStorage&#39;.
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
         * @param retentionPolicy Retention policy with the details on backup copy retention ranges.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(@Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy) {
            $.retentionPolicy = retentionPolicy;
            return this;
        }

        /**
         * @param retentionPolicy Retention policy with the details on backup copy retention ranges.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(LongTermRetentionPolicyResponse retentionPolicy) {
            return retentionPolicy(Either.ofLeft(retentionPolicy));
        }

        /**
         * @param retentionPolicy Retention policy with the details on backup copy retention ranges.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(SimpleRetentionPolicyResponse retentionPolicy) {
            return retentionPolicy(Either.ofRight(retentionPolicy));
        }

        /**
         * @param schedulePolicy Backup schedule specified as part of backup policy.
         * 
         * @return builder
         * 
         */
        public Builder schedulePolicy(@Nullable Object schedulePolicy) {
            $.schedulePolicy = schedulePolicy;
            return this;
        }

        /**
         * @param timeZone TimeZone optional input as string. For example: TimeZone = &#34;Pacific Standard Time&#34;.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable String timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param workLoadType Type of workload for the backup management
         * 
         * @return builder
         * 
         */
        public Builder workLoadType(@Nullable String workLoadType) {
            $.workLoadType = workLoadType;
            return this;
        }

        public AzureFileShareProtectionPolicyResponse build() {
            $.backupManagementType = Codegen.stringProp("backupManagementType").arg($.backupManagementType).require();
            return $;
        }
    }

}
