// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CapacityReservationPropertiesResponse {
    /**
     * @return The last time Sku was updated.
     * 
     */
    private final String lastSkuUpdate;
    /**
     * @return Minimum CapacityReservation value in GB.
     * 
     */
    private final Double minCapacity;

    @CustomType.Constructor
    private CapacityReservationPropertiesResponse(
        @CustomType.Parameter("lastSkuUpdate") String lastSkuUpdate,
        @CustomType.Parameter("minCapacity") Double minCapacity) {
        this.lastSkuUpdate = lastSkuUpdate;
        this.minCapacity = minCapacity;
    }

    /**
     * @return The last time Sku was updated.
     * 
     */
    public String lastSkuUpdate() {
        return this.lastSkuUpdate;
    }
    /**
     * @return Minimum CapacityReservation value in GB.
     * 
     */
    public Double minCapacity() {
        return this.minCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityReservationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastSkuUpdate;
        private Double minCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityReservationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastSkuUpdate = defaults.lastSkuUpdate;
    	      this.minCapacity = defaults.minCapacity;
        }

        public Builder lastSkuUpdate(String lastSkuUpdate) {
            this.lastSkuUpdate = Objects.requireNonNull(lastSkuUpdate);
            return this;
        }
        public Builder minCapacity(Double minCapacity) {
            this.minCapacity = Objects.requireNonNull(minCapacity);
            return this;
        }        public CapacityReservationPropertiesResponse build() {
            return new CapacityReservationPropertiesResponse(lastSkuUpdate, minCapacity);
        }
    }
}
