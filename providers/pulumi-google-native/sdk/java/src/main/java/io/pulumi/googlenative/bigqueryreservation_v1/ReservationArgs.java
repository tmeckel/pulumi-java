// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigqueryreservation_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReservationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationArgs Empty = new ReservationArgs();

    /**
     * If false, any query or pipeline job using this reservation will use idle slots from other reservations within the same admin project. If true, a query or pipeline job using this reservation will execute with the slot capacity specified in the slot_capacity field at most.
     * 
     */
    @Import(name="ignoreIdleSlots")
      private final @Nullable Output<Boolean> ignoreIdleSlots;

    public Output<Boolean> getIgnoreIdleSlots() {
        return this.ignoreIdleSlots == null ? Codegen.empty() : this.ignoreIdleSlots;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The resource name of the reservation, e.g., `projects/*{@literal /}locations/*{@literal /}reservations/team1-prod`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="reservationId")
      private final @Nullable Output<String> reservationId;

    public Output<String> getReservationId() {
        return this.reservationId == null ? Codegen.empty() : this.reservationId;
    }

    /**
     * Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the unit of parallelism. Queries using this reservation might use more slots during runtime if ignore_idle_slots is set to false. If the new reservation's slot capacity exceed the project's slot capacity or if total slot capacity of the new reservation and its siblings exceeds the project's slot capacity, the request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`. NOTE: for reservations in US or EU multi-regions slot capacity constraints are checked separately for default and auxiliary regions. See multi_region_auxiliary flag for more details.
     * 
     */
    @Import(name="slotCapacity")
      private final @Nullable Output<String> slotCapacity;

    public Output<String> getSlotCapacity() {
        return this.slotCapacity == null ? Codegen.empty() : this.slotCapacity;
    }

    public ReservationArgs(
        @Nullable Output<Boolean> ignoreIdleSlots,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> reservationId,
        @Nullable Output<String> slotCapacity) {
        this.ignoreIdleSlots = ignoreIdleSlots;
        this.location = location;
        this.name = name;
        this.project = project;
        this.reservationId = reservationId;
        this.slotCapacity = slotCapacity;
    }

    private ReservationArgs() {
        this.ignoreIdleSlots = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.reservationId = Codegen.empty();
        this.slotCapacity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> ignoreIdleSlots;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> reservationId;
        private @Nullable Output<String> slotCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreIdleSlots = defaults.ignoreIdleSlots;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.reservationId = defaults.reservationId;
    	      this.slotCapacity = defaults.slotCapacity;
        }

        public Builder ignoreIdleSlots(@Nullable Output<Boolean> ignoreIdleSlots) {
            this.ignoreIdleSlots = ignoreIdleSlots;
            return this;
        }
        public Builder ignoreIdleSlots(@Nullable Boolean ignoreIdleSlots) {
            this.ignoreIdleSlots = Codegen.ofNullable(ignoreIdleSlots);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder reservationId(@Nullable Output<String> reservationId) {
            this.reservationId = reservationId;
            return this;
        }
        public Builder reservationId(@Nullable String reservationId) {
            this.reservationId = Codegen.ofNullable(reservationId);
            return this;
        }
        public Builder slotCapacity(@Nullable Output<String> slotCapacity) {
            this.slotCapacity = slotCapacity;
            return this;
        }
        public Builder slotCapacity(@Nullable String slotCapacity) {
            this.slotCapacity = Codegen.ofNullable(slotCapacity);
            return this;
        }        public ReservationArgs build() {
            return new ReservationArgs(ignoreIdleSlots, location, name, project, reservationId, slotCapacity);
        }
    }
}
