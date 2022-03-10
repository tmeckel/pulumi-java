// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.outputs;

import io.pulumi.azurenative.aad.outputs.ForestTrustResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceForestSettingsResponse {
    /**
     * Resource Forest
     * 
     */
    private final @Nullable String resourceForest;
    /**
     * List of settings for Resource Forest
     * 
     */
    private final @Nullable List<ForestTrustResponse> settings;

    @OutputCustomType.Constructor
    private ResourceForestSettingsResponse(
        @OutputCustomType.Parameter("resourceForest") @Nullable String resourceForest,
        @OutputCustomType.Parameter("settings") @Nullable List<ForestTrustResponse> settings) {
        this.resourceForest = resourceForest;
        this.settings = settings;
    }

    /**
     * Resource Forest
     * 
    */
    public Optional<String> getResourceForest() {
        return Optional.ofNullable(this.resourceForest);
    }
    /**
     * List of settings for Resource Forest
     * 
    */
    public List<ForestTrustResponse> getSettings() {
        return this.settings == null ? List.of() : this.settings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceForestSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceForest;
        private @Nullable List<ForestTrustResponse> settings;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceForestSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceForest = defaults.resourceForest;
    	      this.settings = defaults.settings;
        }

        public Builder resourceForest(@Nullable String resourceForest) {
            this.resourceForest = resourceForest;
            return this;
        }

        public Builder settings(@Nullable List<ForestTrustResponse> settings) {
            this.settings = settings;
            return this;
        }
        public ResourceForestSettingsResponse build() {
            return new ResourceForestSettingsResponse(resourceForest, settings);
        }
    }
}
