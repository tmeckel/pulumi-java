// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.LocationArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


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
    @InputImport(name="location")
    private final @Nullable Input<List<LocationArgs>> location;

    public Input<List<LocationArgs>> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    public InstallationArgs(@Nullable Input<List<LocationArgs>> location) {
        this.location = location;
    }

    private InstallationArgs() {
        this.location = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstallationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<LocationArgs>> location;

        public Builder() {
    	      // Empty
        }

        public Builder(InstallationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
        }

        public Builder setLocation(@Nullable Input<List<LocationArgs>> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable List<LocationArgs> location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public InstallationArgs build() {
            return new InstallationArgs(location);
        }
    }
}
