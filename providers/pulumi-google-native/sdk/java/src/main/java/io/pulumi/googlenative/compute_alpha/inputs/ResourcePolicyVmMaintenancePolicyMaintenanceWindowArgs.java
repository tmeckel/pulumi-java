// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.ResourcePolicyDailyCycleArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A maintenance window for VMs. When set, we restrict our maintenance operations to this window.
 * 
 */
public final class ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs Empty = new ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs();

    @InputImport(name="dailyMaintenanceWindow")
    private final @Nullable Input<ResourcePolicyDailyCycleArgs> dailyMaintenanceWindow;

    public Input<ResourcePolicyDailyCycleArgs> getDailyMaintenanceWindow() {
        return this.dailyMaintenanceWindow == null ? Input.empty() : this.dailyMaintenanceWindow;
    }

    public ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs(@Nullable Input<ResourcePolicyDailyCycleArgs> dailyMaintenanceWindow) {
        this.dailyMaintenanceWindow = dailyMaintenanceWindow;
    }

    private ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs() {
        this.dailyMaintenanceWindow = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourcePolicyDailyCycleArgs> dailyMaintenanceWindow;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyMaintenanceWindow = defaults.dailyMaintenanceWindow;
        }

        public Builder setDailyMaintenanceWindow(@Nullable Input<ResourcePolicyDailyCycleArgs> dailyMaintenanceWindow) {
            this.dailyMaintenanceWindow = dailyMaintenanceWindow;
            return this;
        }

        public Builder setDailyMaintenanceWindow(@Nullable ResourcePolicyDailyCycleArgs dailyMaintenanceWindow) {
            this.dailyMaintenanceWindow = Input.ofNullable(dailyMaintenanceWindow);
            return this;
        }

        public ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs build() {
            return new ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs(dailyMaintenanceWindow);
        }
    }
}
