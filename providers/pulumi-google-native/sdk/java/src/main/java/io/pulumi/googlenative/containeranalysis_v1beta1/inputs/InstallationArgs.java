// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.LocationArgs;
import java.util.List;
import java.util.Objects;


/**
 * This represents how a particular software package may be installed on a system.
 * 
 */
public final class InstallationArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstallationArgs Empty = new InstallationArgs();

    /**
     * All of the places within the filesystem versions of this package have been found.
     * 
     */
    @Import(name="location", required=true)
      private final Output<List<LocationArgs>> location;

    public Output<List<LocationArgs>> getLocation() {
        return this.location;
    }

    public InstallationArgs(Output<List<LocationArgs>> location) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
    }

    private InstallationArgs() {
        this.location = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstallationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<LocationArgs>> location;

        public Builder() {
    	      // Empty
        }

        public Builder(InstallationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
        }

        public Builder location(Output<List<LocationArgs>> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(List<LocationArgs> location) {
            this.location = Output.of(Objects.requireNonNull(location));
            return this;
        }
        public Builder location(LocationArgs... location) {
            return location(List.of(location));
        }        public InstallationArgs build() {
            return new InstallationArgs(location);
        }
    }
}
