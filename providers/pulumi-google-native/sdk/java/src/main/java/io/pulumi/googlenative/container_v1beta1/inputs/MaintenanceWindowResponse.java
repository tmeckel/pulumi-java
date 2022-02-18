// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1beta1.inputs.DailyMaintenanceWindowResponse;
import io.pulumi.googlenative.container_v1beta1.inputs.RecurringTimeWindowResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * MaintenanceWindow defines the maintenance window to be used for the cluster.
 * 
 */
public final class MaintenanceWindowResponse extends io.pulumi.resources.InvokeArgs {

    public static final MaintenanceWindowResponse Empty = new MaintenanceWindowResponse();

    /**
     * DailyMaintenanceWindow specifies a daily maintenance operation window.
     * 
     */
    @InputImport(name="dailyMaintenanceWindow", required=true)
    private final DailyMaintenanceWindowResponse dailyMaintenanceWindow;

    public DailyMaintenanceWindowResponse getDailyMaintenanceWindow() {
        return this.dailyMaintenanceWindow;
    }

    /**
     * Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows.
     * 
     */
    @InputImport(name="maintenanceExclusions", required=true)
    private final Map<String,String> maintenanceExclusions;

    public Map<String,String> getMaintenanceExclusions() {
        return this.maintenanceExclusions;
    }

    /**
     * RecurringWindow specifies some number of recurring time periods for maintenance to occur. The time windows may be overlapping. If no maintenance windows are set, maintenance can occur at any time.
     * 
     */
    @InputImport(name="recurringWindow", required=true)
    private final RecurringTimeWindowResponse recurringWindow;

    public RecurringTimeWindowResponse getRecurringWindow() {
        return this.recurringWindow;
    }

    public MaintenanceWindowResponse(
        DailyMaintenanceWindowResponse dailyMaintenanceWindow,
        Map<String,String> maintenanceExclusions,
        RecurringTimeWindowResponse recurringWindow) {
        this.dailyMaintenanceWindow = Objects.requireNonNull(dailyMaintenanceWindow, "expected parameter 'dailyMaintenanceWindow' to be non-null");
        this.maintenanceExclusions = Objects.requireNonNull(maintenanceExclusions, "expected parameter 'maintenanceExclusions' to be non-null");
        this.recurringWindow = Objects.requireNonNull(recurringWindow, "expected parameter 'recurringWindow' to be non-null");
    }

    private MaintenanceWindowResponse() {
        this.dailyMaintenanceWindow = null;
        this.maintenanceExclusions = Map.of();
        this.recurringWindow = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DailyMaintenanceWindowResponse dailyMaintenanceWindow;
        private Map<String,String> maintenanceExclusions;
        private RecurringTimeWindowResponse recurringWindow;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyMaintenanceWindow = defaults.dailyMaintenanceWindow;
    	      this.maintenanceExclusions = defaults.maintenanceExclusions;
    	      this.recurringWindow = defaults.recurringWindow;
        }

        public Builder setDailyMaintenanceWindow(DailyMaintenanceWindowResponse dailyMaintenanceWindow) {
            this.dailyMaintenanceWindow = Objects.requireNonNull(dailyMaintenanceWindow);
            return this;
        }

        public Builder setMaintenanceExclusions(Map<String,String> maintenanceExclusions) {
            this.maintenanceExclusions = Objects.requireNonNull(maintenanceExclusions);
            return this;
        }

        public Builder setRecurringWindow(RecurringTimeWindowResponse recurringWindow) {
            this.recurringWindow = Objects.requireNonNull(recurringWindow);
            return this;
        }

        public MaintenanceWindowResponse build() {
            return new MaintenanceWindowResponse(dailyMaintenanceWindow, maintenanceExclusions, recurringWindow);
        }
    }
}
