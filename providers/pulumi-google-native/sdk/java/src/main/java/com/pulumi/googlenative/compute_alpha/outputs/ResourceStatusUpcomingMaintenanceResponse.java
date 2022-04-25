// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ResourceStatusUpcomingMaintenanceResponse {
    /**
     * @return Indicates if the maintenance can be customer triggered. See go/sf-ctm-design for more details
     * 
     */
    private final Boolean canReschedule;

    @CustomType.Constructor
    private ResourceStatusUpcomingMaintenanceResponse(@CustomType.Parameter("canReschedule") Boolean canReschedule) {
        this.canReschedule = canReschedule;
    }

    /**
     * @return Indicates if the maintenance can be customer triggered. See go/sf-ctm-design for more details
     * 
     */
    public Boolean canReschedule() {
        return this.canReschedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceStatusUpcomingMaintenanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean canReschedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceStatusUpcomingMaintenanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canReschedule = defaults.canReschedule;
        }

        public Builder canReschedule(Boolean canReschedule) {
            this.canReschedule = Objects.requireNonNull(canReschedule);
            return this;
        }        public ResourceStatusUpcomingMaintenanceResponse build() {
            return new ResourceStatusUpcomingMaintenanceResponse(canReschedule);
        }
    }
}
