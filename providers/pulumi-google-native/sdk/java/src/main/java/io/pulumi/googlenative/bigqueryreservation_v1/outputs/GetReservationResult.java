// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigqueryreservation_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetReservationResult {
    /**
     * Creation time of the reservation.
     * 
     */
    private final String creationTime;
    /**
     * If false, any query or pipeline job using this reservation will use idle slots from other reservations within the same admin project. If true, a query or pipeline job using this reservation will execute with the slot capacity specified in the slot_capacity field at most.
     * 
     */
    private final Boolean ignoreIdleSlots;
    /**
     * The resource name of the reservation, e.g., `projects/*{@literal /}locations/*{@literal /}reservations/team1-prod`.
     * 
     */
    private final String name;
    /**
     * Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the unit of parallelism. Queries using this reservation might use more slots during runtime if ignore_idle_slots is set to false. If the new reservation's slot capacity exceed the project's slot capacity or if total slot capacity of the new reservation and its siblings exceeds the project's slot capacity, the request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`. NOTE: for reservations in US or EU multi-regions slot capacity constraints are checked separately for default and auxiliary regions. See multi_region_auxiliary flag for more details.
     * 
     */
    private final String slotCapacity;
    /**
     * Last update time of the reservation.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"creationTime","ignoreIdleSlots","name","slotCapacity","updateTime"})
    private GetReservationResult(
        String creationTime,
        Boolean ignoreIdleSlots,
        String name,
        String slotCapacity,
        String updateTime) {
        this.creationTime = Objects.requireNonNull(creationTime);
        this.ignoreIdleSlots = Objects.requireNonNull(ignoreIdleSlots);
        this.name = Objects.requireNonNull(name);
        this.slotCapacity = Objects.requireNonNull(slotCapacity);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * Creation time of the reservation.
     * 
     */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * If false, any query or pipeline job using this reservation will use idle slots from other reservations within the same admin project. If true, a query or pipeline job using this reservation will execute with the slot capacity specified in the slot_capacity field at most.
     * 
     */
    public Boolean getIgnoreIdleSlots() {
        return this.ignoreIdleSlots;
    }
    /**
     * The resource name of the reservation, e.g., `projects/*{@literal /}locations/*{@literal /}reservations/team1-prod`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the unit of parallelism. Queries using this reservation might use more slots during runtime if ignore_idle_slots is set to false. If the new reservation's slot capacity exceed the project's slot capacity or if total slot capacity of the new reservation and its siblings exceeds the project's slot capacity, the request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`. NOTE: for reservations in US or EU multi-regions slot capacity constraints are checked separately for default and auxiliary regions. See multi_region_auxiliary flag for more details.
     * 
     */
    public String getSlotCapacity() {
        return this.slotCapacity;
    }
    /**
     * Last update time of the reservation.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReservationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private Boolean ignoreIdleSlots;
        private String name;
        private String slotCapacity;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReservationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.ignoreIdleSlots = defaults.ignoreIdleSlots;
    	      this.name = defaults.name;
    	      this.slotCapacity = defaults.slotCapacity;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setIgnoreIdleSlots(Boolean ignoreIdleSlots) {
            this.ignoreIdleSlots = Objects.requireNonNull(ignoreIdleSlots);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSlotCapacity(String slotCapacity) {
            this.slotCapacity = Objects.requireNonNull(slotCapacity);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public GetReservationResult build() {
            return new GetReservationResult(creationTime, ignoreIdleSlots, name, slotCapacity, updateTime);
        }
    }
}
