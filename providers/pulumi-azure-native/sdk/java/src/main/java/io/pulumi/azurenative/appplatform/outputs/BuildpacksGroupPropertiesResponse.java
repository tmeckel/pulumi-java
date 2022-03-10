// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.azurenative.appplatform.outputs.BuildpackPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BuildpacksGroupPropertiesResponse {
    /**
     * Buildpacks in the buildpack group
     * 
     */
    private final @Nullable List<BuildpackPropertiesResponse> buildpacks;
    /**
     * Buildpack group name
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor
    private BuildpacksGroupPropertiesResponse(
        @OutputCustomType.Parameter("buildpacks") @Nullable List<BuildpackPropertiesResponse> buildpacks,
        @OutputCustomType.Parameter("name") @Nullable String name) {
        this.buildpacks = buildpacks;
        this.name = name;
    }

    /**
     * Buildpacks in the buildpack group
     * 
    */
    public List<BuildpackPropertiesResponse> getBuildpacks() {
        return this.buildpacks == null ? List.of() : this.buildpacks;
    }
    /**
     * Buildpack group name
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildpacksGroupPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BuildpackPropertiesResponse> buildpacks;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildpacksGroupPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildpacks = defaults.buildpacks;
    	      this.name = defaults.name;
        }

        public Builder buildpacks(@Nullable List<BuildpackPropertiesResponse> buildpacks) {
            this.buildpacks = buildpacks;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public BuildpacksGroupPropertiesResponse build() {
            return new BuildpacksGroupPropertiesResponse(buildpacks, name);
        }
    }
}
