// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.InstanceReservationAffinitySpecificReservationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceReservationAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceReservationAffinityArgs Empty = new InstanceReservationAffinityArgs();

    /**
     * Specifies the label selector for the reservation to use..
     * Structure is documented below.
     * 
     */
    @InputImport(name="specificReservation")
      private final @Nullable Input<InstanceReservationAffinitySpecificReservationArgs> specificReservation;

    public Input<InstanceReservationAffinitySpecificReservationArgs> getSpecificReservation() {
        return this.specificReservation == null ? Input.empty() : this.specificReservation;
    }

    /**
     * The type of reservation from which this instance can consume resources.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public InstanceReservationAffinityArgs(
        @Nullable Input<InstanceReservationAffinitySpecificReservationArgs> specificReservation,
        Input<String> type) {
        this.specificReservation = specificReservation;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private InstanceReservationAffinityArgs() {
        this.specificReservation = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceReservationAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InstanceReservationAffinitySpecificReservationArgs> specificReservation;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceReservationAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.specificReservation = defaults.specificReservation;
    	      this.type = defaults.type;
        }

        public Builder specificReservation(@Nullable Input<InstanceReservationAffinitySpecificReservationArgs> specificReservation) {
            this.specificReservation = specificReservation;
            return this;
        }

        public Builder specificReservation(@Nullable InstanceReservationAffinitySpecificReservationArgs specificReservation) {
            this.specificReservation = Input.ofNullable(specificReservation);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public InstanceReservationAffinityArgs build() {
            return new InstanceReservationAffinityArgs(specificReservation, type);
        }
    }
}
