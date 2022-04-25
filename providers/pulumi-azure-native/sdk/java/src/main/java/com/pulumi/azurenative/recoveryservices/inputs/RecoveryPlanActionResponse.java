// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.RecoveryPlanAutomationRunbookActionDetailsResponse;
import com.pulumi.azurenative.recoveryservices.inputs.RecoveryPlanManualActionDetailsResponse;
import com.pulumi.azurenative.recoveryservices.inputs.RecoveryPlanScriptActionDetailsResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Recovery plan action details.
 * 
 */
public final class RecoveryPlanActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final RecoveryPlanActionResponse Empty = new RecoveryPlanActionResponse();

    /**
     * The action name.
     * 
     */
    @Import(name="actionName", required=true)
    private String actionName;

    /**
     * @return The action name.
     * 
     */
    public String actionName() {
        return this.actionName;
    }

    /**
     * The custom details.
     * 
     */
    @Import(name="customDetails", required=true)
    private Object customDetails;

    /**
     * @return The custom details.
     * 
     */
    public Object customDetails() {
        return this.customDetails;
    }

    /**
     * The list of failover directions.
     * 
     */
    @Import(name="failoverDirections", required=true)
    private List<String> failoverDirections;

    /**
     * @return The list of failover directions.
     * 
     */
    public List<String> failoverDirections() {
        return this.failoverDirections;
    }

    /**
     * The list of failover types.
     * 
     */
    @Import(name="failoverTypes", required=true)
    private List<String> failoverTypes;

    /**
     * @return The list of failover types.
     * 
     */
    public List<String> failoverTypes() {
        return this.failoverTypes;
    }

    private RecoveryPlanActionResponse() {}

    private RecoveryPlanActionResponse(RecoveryPlanActionResponse $) {
        this.actionName = $.actionName;
        this.customDetails = $.customDetails;
        this.failoverDirections = $.failoverDirections;
        this.failoverTypes = $.failoverTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecoveryPlanActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecoveryPlanActionResponse $;

        public Builder() {
            $ = new RecoveryPlanActionResponse();
        }

        public Builder(RecoveryPlanActionResponse defaults) {
            $ = new RecoveryPlanActionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionName The action name.
         * 
         * @return builder
         * 
         */
        public Builder actionName(String actionName) {
            $.actionName = actionName;
            return this;
        }

        /**
         * @param customDetails The custom details.
         * 
         * @return builder
         * 
         */
        public Builder customDetails(Object customDetails) {
            $.customDetails = customDetails;
            return this;
        }

        /**
         * @param failoverDirections The list of failover directions.
         * 
         * @return builder
         * 
         */
        public Builder failoverDirections(List<String> failoverDirections) {
            $.failoverDirections = failoverDirections;
            return this;
        }

        /**
         * @param failoverDirections The list of failover directions.
         * 
         * @return builder
         * 
         */
        public Builder failoverDirections(String... failoverDirections) {
            return failoverDirections(List.of(failoverDirections));
        }

        /**
         * @param failoverTypes The list of failover types.
         * 
         * @return builder
         * 
         */
        public Builder failoverTypes(List<String> failoverTypes) {
            $.failoverTypes = failoverTypes;
            return this;
        }

        /**
         * @param failoverTypes The list of failover types.
         * 
         * @return builder
         * 
         */
        public Builder failoverTypes(String... failoverTypes) {
            return failoverTypes(List.of(failoverTypes));
        }

        public RecoveryPlanActionResponse build() {
            $.actionName = Objects.requireNonNull($.actionName, "expected parameter 'actionName' to be non-null");
            $.customDetails = Objects.requireNonNull($.customDetails, "expected parameter 'customDetails' to be non-null");
            $.failoverDirections = Objects.requireNonNull($.failoverDirections, "expected parameter 'failoverDirections' to be non-null");
            $.failoverTypes = Objects.requireNonNull($.failoverTypes, "expected parameter 'failoverTypes' to be non-null");
            return $;
        }
    }

}
