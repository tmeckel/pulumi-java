// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyDailyMaintenanceWindowArgs;
import com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyMaintenanceExclusionArgs;
import com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyRecurringWindowArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterMaintenancePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterMaintenancePolicyArgs Empty = new ClusterMaintenancePolicyArgs();

    /**
     * Time window specified for daily maintenance operations.
     * Specify `start_time` in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format &#34;HH:MM”,
     * where HH : \[00-23\] and MM : \[00-59\] GMT. For example:
     * 
     */
    @Import(name="dailyMaintenanceWindow")
    private @Nullable Output<ClusterMaintenancePolicyDailyMaintenanceWindowArgs> dailyMaintenanceWindow;

    /**
     * @return Time window specified for daily maintenance operations.
     * Specify `start_time` in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format &#34;HH:MM”,
     * where HH : \[00-23\] and MM : \[00-59\] GMT. For example:
     * 
     */
    public Optional<Output<ClusterMaintenancePolicyDailyMaintenanceWindowArgs>> dailyMaintenanceWindow() {
        return Optional.ofNullable(this.dailyMaintenanceWindow);
    }

    /**
     * Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows. A cluster can have up to three maintenance exclusions at a time [Maintenance Window and Exclusions](https://cloud.google.com/kubernetes-engine/docs/concepts/maintenance-windows-and-exclusions)
     * 
     */
    @Import(name="maintenanceExclusions")
    private @Nullable Output<List<ClusterMaintenancePolicyMaintenanceExclusionArgs>> maintenanceExclusions;

    /**
     * @return Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows. A cluster can have up to three maintenance exclusions at a time [Maintenance Window and Exclusions](https://cloud.google.com/kubernetes-engine/docs/concepts/maintenance-windows-and-exclusions)
     * 
     */
    public Optional<Output<List<ClusterMaintenancePolicyMaintenanceExclusionArgs>>> maintenanceExclusions() {
        return Optional.ofNullable(this.maintenanceExclusions);
    }

    /**
     * Time window for recurring maintenance operations.
     * 
     */
    @Import(name="recurringWindow")
    private @Nullable Output<ClusterMaintenancePolicyRecurringWindowArgs> recurringWindow;

    /**
     * @return Time window for recurring maintenance operations.
     * 
     */
    public Optional<Output<ClusterMaintenancePolicyRecurringWindowArgs>> recurringWindow() {
        return Optional.ofNullable(this.recurringWindow);
    }

    private ClusterMaintenancePolicyArgs() {}

    private ClusterMaintenancePolicyArgs(ClusterMaintenancePolicyArgs $) {
        this.dailyMaintenanceWindow = $.dailyMaintenanceWindow;
        this.maintenanceExclusions = $.maintenanceExclusions;
        this.recurringWindow = $.recurringWindow;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterMaintenancePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterMaintenancePolicyArgs $;

        public Builder() {
            $ = new ClusterMaintenancePolicyArgs();
        }

        public Builder(ClusterMaintenancePolicyArgs defaults) {
            $ = new ClusterMaintenancePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dailyMaintenanceWindow Time window specified for daily maintenance operations.
         * Specify `start_time` in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format &#34;HH:MM”,
         * where HH : \[00-23\] and MM : \[00-59\] GMT. For example:
         * 
         * @return builder
         * 
         */
        public Builder dailyMaintenanceWindow(@Nullable Output<ClusterMaintenancePolicyDailyMaintenanceWindowArgs> dailyMaintenanceWindow) {
            $.dailyMaintenanceWindow = dailyMaintenanceWindow;
            return this;
        }

        /**
         * @param dailyMaintenanceWindow Time window specified for daily maintenance operations.
         * Specify `start_time` in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format &#34;HH:MM”,
         * where HH : \[00-23\] and MM : \[00-59\] GMT. For example:
         * 
         * @return builder
         * 
         */
        public Builder dailyMaintenanceWindow(ClusterMaintenancePolicyDailyMaintenanceWindowArgs dailyMaintenanceWindow) {
            return dailyMaintenanceWindow(Output.of(dailyMaintenanceWindow));
        }

        /**
         * @param maintenanceExclusions Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows. A cluster can have up to three maintenance exclusions at a time [Maintenance Window and Exclusions](https://cloud.google.com/kubernetes-engine/docs/concepts/maintenance-windows-and-exclusions)
         * 
         * @return builder
         * 
         */
        public Builder maintenanceExclusions(@Nullable Output<List<ClusterMaintenancePolicyMaintenanceExclusionArgs>> maintenanceExclusions) {
            $.maintenanceExclusions = maintenanceExclusions;
            return this;
        }

        /**
         * @param maintenanceExclusions Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows. A cluster can have up to three maintenance exclusions at a time [Maintenance Window and Exclusions](https://cloud.google.com/kubernetes-engine/docs/concepts/maintenance-windows-and-exclusions)
         * 
         * @return builder
         * 
         */
        public Builder maintenanceExclusions(List<ClusterMaintenancePolicyMaintenanceExclusionArgs> maintenanceExclusions) {
            return maintenanceExclusions(Output.of(maintenanceExclusions));
        }

        /**
         * @param maintenanceExclusions Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows. A cluster can have up to three maintenance exclusions at a time [Maintenance Window and Exclusions](https://cloud.google.com/kubernetes-engine/docs/concepts/maintenance-windows-and-exclusions)
         * 
         * @return builder
         * 
         */
        public Builder maintenanceExclusions(ClusterMaintenancePolicyMaintenanceExclusionArgs... maintenanceExclusions) {
            return maintenanceExclusions(List.of(maintenanceExclusions));
        }

        /**
         * @param recurringWindow Time window for recurring maintenance operations.
         * 
         * @return builder
         * 
         */
        public Builder recurringWindow(@Nullable Output<ClusterMaintenancePolicyRecurringWindowArgs> recurringWindow) {
            $.recurringWindow = recurringWindow;
            return this;
        }

        /**
         * @param recurringWindow Time window for recurring maintenance operations.
         * 
         * @return builder
         * 
         */
        public Builder recurringWindow(ClusterMaintenancePolicyRecurringWindowArgs recurringWindow) {
            return recurringWindow(Output.of(recurringWindow));
        }

        public ClusterMaintenancePolicyArgs build() {
            return $;
        }
    }

}
