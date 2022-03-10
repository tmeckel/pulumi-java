// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeploymentScaleSettingsResponse {
    /**
     * Deployment capacity.
     * 
     */
    private final @Nullable Integer capacity;
    /**
     * Deployment scale type.
     * 
     */
    private final @Nullable String scaleType;

    @OutputCustomType.Constructor
    private DeploymentScaleSettingsResponse(
        @OutputCustomType.Parameter("capacity") @Nullable Integer capacity,
        @OutputCustomType.Parameter("scaleType") @Nullable String scaleType) {
        this.capacity = capacity;
        this.scaleType = scaleType;
    }

    /**
     * Deployment capacity.
     * 
    */
    public Optional<Integer> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * Deployment scale type.
     * 
    */
    public Optional<String> getScaleType() {
        return Optional.ofNullable(this.scaleType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentScaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable String scaleType;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentScaleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.scaleType = defaults.scaleType;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder scaleType(@Nullable String scaleType) {
            this.scaleType = scaleType;
            return this;
        }
        public DeploymentScaleSettingsResponse build() {
            return new DeploymentScaleSettingsResponse(capacity, scaleType);
        }
    }
}
