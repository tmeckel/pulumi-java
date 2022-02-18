// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.LocationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class InstallationResponse {
    /**
     * All of the places within the filesystem versions of this package have been found.
     * 
     */
    private final List<LocationResponse> location;
    /**
     * The name of the installed package.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"location","name"})
    private InstallationResponse(
        List<LocationResponse> location,
        String name) {
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * All of the places within the filesystem versions of this package have been found.
     * 
     */
    public List<LocationResponse> getLocation() {
        return this.location;
    }
    /**
     * The name of the installed package.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstallationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<LocationResponse> location;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(InstallationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.name = defaults.name;
        }

        public Builder setLocation(List<LocationResponse> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public InstallationResponse build() {
            return new InstallationResponse(location, name);
        }
    }
}
