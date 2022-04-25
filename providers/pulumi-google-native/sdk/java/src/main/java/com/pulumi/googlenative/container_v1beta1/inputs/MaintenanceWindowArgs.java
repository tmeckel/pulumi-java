// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1beta1.inputs.DailyMaintenanceWindowArgs;
import com.pulumi.googlenative.container_v1beta1.inputs.RecurringTimeWindowArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MaintenanceWindow defines the maintenance window to be used for the cluster.
 * 
 */
public final class MaintenanceWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowArgs Empty = new MaintenanceWindowArgs();

    /**
     * DailyMaintenanceWindow specifies a daily maintenance operation window.
     * 
     */
    @Import(name="dailyMaintenanceWindow")
    private @Nullable Output<DailyMaintenanceWindowArgs> dailyMaintenanceWindow;

    /**
     * @return DailyMaintenanceWindow specifies a daily maintenance operation window.
     * 
     */
    public Optional<Output<DailyMaintenanceWindowArgs>> dailyMaintenanceWindow() {
        return Optional.ofNullable(this.dailyMaintenanceWindow);
    }

    /**
     * Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows.
     * 
     */
    @Import(name="maintenanceExclusions")
    private @Nullable Output<Map<String,String>> maintenanceExclusions;

    /**
     * @return Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows.
     * 
     */
    public Optional<Output<Map<String,String>>> maintenanceExclusions() {
        return Optional.ofNullable(this.maintenanceExclusions);
    }

    /**
     * RecurringWindow specifies some number of recurring time periods for maintenance to occur. The time windows may be overlapping. If no maintenance windows are set, maintenance can occur at any time.
     * 
     */
    @Import(name="recurringWindow")
    private @Nullable Output<RecurringTimeWindowArgs> recurringWindow;

    /**
     * @return RecurringWindow specifies some number of recurring time periods for maintenance to occur. The time windows may be overlapping. If no maintenance windows are set, maintenance can occur at any time.
     * 
     */
    public Optional<Output<RecurringTimeWindowArgs>> recurringWindow() {
        return Optional.ofNullable(this.recurringWindow);
    }

    private MaintenanceWindowArgs() {}

    private MaintenanceWindowArgs(MaintenanceWindowArgs $) {
        this.dailyMaintenanceWindow = $.dailyMaintenanceWindow;
        this.maintenanceExclusions = $.maintenanceExclusions;
        this.recurringWindow = $.recurringWindow;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceWindowArgs $;

        public Builder() {
            $ = new MaintenanceWindowArgs();
        }

        public Builder(MaintenanceWindowArgs defaults) {
            $ = new MaintenanceWindowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dailyMaintenanceWindow DailyMaintenanceWindow specifies a daily maintenance operation window.
         * 
         * @return builder
         * 
         */
        public Builder dailyMaintenanceWindow(@Nullable Output<DailyMaintenanceWindowArgs> dailyMaintenanceWindow) {
            $.dailyMaintenanceWindow = dailyMaintenanceWindow;
            return this;
        }

        /**
         * @param dailyMaintenanceWindow DailyMaintenanceWindow specifies a daily maintenance operation window.
         * 
         * @return builder
         * 
         */
        public Builder dailyMaintenanceWindow(DailyMaintenanceWindowArgs dailyMaintenanceWindow) {
            return dailyMaintenanceWindow(Output.of(dailyMaintenanceWindow));
        }

        /**
         * @param maintenanceExclusions Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceExclusions(@Nullable Output<Map<String,String>> maintenanceExclusions) {
            $.maintenanceExclusions = maintenanceExclusions;
            return this;
        }

        /**
         * @param maintenanceExclusions Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceExclusions(Map<String,String> maintenanceExclusions) {
            return maintenanceExclusions(Output.of(maintenanceExclusions));
        }

        /**
         * @param recurringWindow RecurringWindow specifies some number of recurring time periods for maintenance to occur. The time windows may be overlapping. If no maintenance windows are set, maintenance can occur at any time.
         * 
         * @return builder
         * 
         */
        public Builder recurringWindow(@Nullable Output<RecurringTimeWindowArgs> recurringWindow) {
            $.recurringWindow = recurringWindow;
            return this;
        }

        /**
         * @param recurringWindow RecurringWindow specifies some number of recurring time periods for maintenance to occur. The time windows may be overlapping. If no maintenance windows are set, maintenance can occur at any time.
         * 
         * @return builder
         * 
         */
        public Builder recurringWindow(RecurringTimeWindowArgs recurringWindow) {
            return recurringWindow(Output.of(recurringWindow));
        }

        public MaintenanceWindowArgs build() {
            return $;
        }
    }

}
