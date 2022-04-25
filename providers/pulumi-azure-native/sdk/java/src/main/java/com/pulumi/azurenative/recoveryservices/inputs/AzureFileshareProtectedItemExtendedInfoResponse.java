// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional information about Azure File Share backup item.
 * 
 */
public final class AzureFileshareProtectedItemExtendedInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureFileshareProtectedItemExtendedInfoResponse Empty = new AzureFileshareProtectedItemExtendedInfoResponse();

    /**
     * The oldest backup copy available for this item in the service.
     * 
     */
    @Import(name="oldestRecoveryPoint")
    private @Nullable String oldestRecoveryPoint;

    /**
     * @return The oldest backup copy available for this item in the service.
     * 
     */
    public Optional<String> oldestRecoveryPoint() {
        return Optional.ofNullable(this.oldestRecoveryPoint);
    }

    /**
     * Indicates consistency of policy object and policy applied to this backup item.
     * 
     */
    @Import(name="policyState")
    private @Nullable String policyState;

    /**
     * @return Indicates consistency of policy object and policy applied to this backup item.
     * 
     */
    public Optional<String> policyState() {
        return Optional.ofNullable(this.policyState);
    }

    /**
     * Number of available backup copies associated with this backup item.
     * 
     */
    @Import(name="recoveryPointCount")
    private @Nullable Integer recoveryPointCount;

    /**
     * @return Number of available backup copies associated with this backup item.
     * 
     */
    public Optional<Integer> recoveryPointCount() {
        return Optional.ofNullable(this.recoveryPointCount);
    }

    /**
     * Indicates the state of this resource. Possible values are from enum ResourceState {Invalid, Active, SoftDeleted, Deleted}
     * 
     */
    @Import(name="resourceState", required=true)
    private String resourceState;

    /**
     * @return Indicates the state of this resource. Possible values are from enum ResourceState {Invalid, Active, SoftDeleted, Deleted}
     * 
     */
    public String resourceState() {
        return this.resourceState;
    }

    /**
     * The resource state sync time for this backup item.
     * 
     */
    @Import(name="resourceStateSyncTime", required=true)
    private String resourceStateSyncTime;

    /**
     * @return The resource state sync time for this backup item.
     * 
     */
    public String resourceStateSyncTime() {
        return this.resourceStateSyncTime;
    }

    private AzureFileshareProtectedItemExtendedInfoResponse() {}

    private AzureFileshareProtectedItemExtendedInfoResponse(AzureFileshareProtectedItemExtendedInfoResponse $) {
        this.oldestRecoveryPoint = $.oldestRecoveryPoint;
        this.policyState = $.policyState;
        this.recoveryPointCount = $.recoveryPointCount;
        this.resourceState = $.resourceState;
        this.resourceStateSyncTime = $.resourceStateSyncTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFileshareProtectedItemExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFileshareProtectedItemExtendedInfoResponse $;

        public Builder() {
            $ = new AzureFileshareProtectedItemExtendedInfoResponse();
        }

        public Builder(AzureFileshareProtectedItemExtendedInfoResponse defaults) {
            $ = new AzureFileshareProtectedItemExtendedInfoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param oldestRecoveryPoint The oldest backup copy available for this item in the service.
         * 
         * @return builder
         * 
         */
        public Builder oldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            $.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }

        /**
         * @param policyState Indicates consistency of policy object and policy applied to this backup item.
         * 
         * @return builder
         * 
         */
        public Builder policyState(@Nullable String policyState) {
            $.policyState = policyState;
            return this;
        }

        /**
         * @param recoveryPointCount Number of available backup copies associated with this backup item.
         * 
         * @return builder
         * 
         */
        public Builder recoveryPointCount(@Nullable Integer recoveryPointCount) {
            $.recoveryPointCount = recoveryPointCount;
            return this;
        }

        /**
         * @param resourceState Indicates the state of this resource. Possible values are from enum ResourceState {Invalid, Active, SoftDeleted, Deleted}
         * 
         * @return builder
         * 
         */
        public Builder resourceState(String resourceState) {
            $.resourceState = resourceState;
            return this;
        }

        /**
         * @param resourceStateSyncTime The resource state sync time for this backup item.
         * 
         * @return builder
         * 
         */
        public Builder resourceStateSyncTime(String resourceStateSyncTime) {
            $.resourceStateSyncTime = resourceStateSyncTime;
            return this;
        }

        public AzureFileshareProtectedItemExtendedInfoResponse build() {
            $.resourceState = Objects.requireNonNull($.resourceState, "expected parameter 'resourceState' to be non-null");
            $.resourceStateSyncTime = Objects.requireNonNull($.resourceStateSyncTime, "expected parameter 'resourceStateSyncTime' to be non-null");
            return $;
        }
    }

}
