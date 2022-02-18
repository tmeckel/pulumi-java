// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.ResourceStatusSchedulingResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ResourceStatusUpcomingMaintenanceResponse;
import java.util.Objects;

@OutputCustomType
public final class ResourceStatusResponse {
    private final ResourceStatusSchedulingResponse scheduling;
    private final ResourceStatusUpcomingMaintenanceResponse upcomingMaintenance;

    @OutputCustomType.Constructor({"scheduling","upcomingMaintenance"})
    private ResourceStatusResponse(
        ResourceStatusSchedulingResponse scheduling,
        ResourceStatusUpcomingMaintenanceResponse upcomingMaintenance) {
        this.scheduling = Objects.requireNonNull(scheduling);
        this.upcomingMaintenance = Objects.requireNonNull(upcomingMaintenance);
    }

    public ResourceStatusSchedulingResponse getScheduling() {
        return this.scheduling;
    }
    public ResourceStatusUpcomingMaintenanceResponse getUpcomingMaintenance() {
        return this.upcomingMaintenance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceStatusSchedulingResponse scheduling;
        private ResourceStatusUpcomingMaintenanceResponse upcomingMaintenance;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduling = defaults.scheduling;
    	      this.upcomingMaintenance = defaults.upcomingMaintenance;
        }

        public Builder setScheduling(ResourceStatusSchedulingResponse scheduling) {
            this.scheduling = Objects.requireNonNull(scheduling);
            return this;
        }

        public Builder setUpcomingMaintenance(ResourceStatusUpcomingMaintenanceResponse upcomingMaintenance) {
            this.upcomingMaintenance = Objects.requireNonNull(upcomingMaintenance);
            return this;
        }

        public ResourceStatusResponse build() {
            return new ResourceStatusResponse(scheduling, upcomingMaintenance);
        }
    }
}
