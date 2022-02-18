// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Fleet configs for Agones.
 * 
 */
public final class FleetConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetConfigArgs Empty = new FleetConfigArgs();

    /**
     * Agones fleet spec. Example spec: `https://agones.dev/site/docs/reference/fleet/`.
     * 
     */
    @InputImport(name="fleetSpec")
    private final @Nullable Input<String> fleetSpec;

    public Input<String> getFleetSpec() {
        return this.fleetSpec == null ? Input.empty() : this.fleetSpec;
    }

    /**
     * The name of the FleetConfig.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public FleetConfigArgs(
        @Nullable Input<String> fleetSpec,
        @Nullable Input<String> name) {
        this.fleetSpec = fleetSpec;
        this.name = name;
    }

    private FleetConfigArgs() {
        this.fleetSpec = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fleetSpec;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetSpec = defaults.fleetSpec;
    	      this.name = defaults.name;
        }

        public Builder setFleetSpec(@Nullable Input<String> fleetSpec) {
            this.fleetSpec = fleetSpec;
            return this;
        }

        public Builder setFleetSpec(@Nullable String fleetSpec) {
            this.fleetSpec = Input.ofNullable(fleetSpec);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public FleetConfigArgs build() {
            return new FleetConfigArgs(fleetSpec, name);
        }
    }
}
