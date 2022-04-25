// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.azurenative.machinelearningservices.outputs.RouteResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InferenceContainerPropertiesResponse {
    /**
     * @return The route to check the liveness of the inference server container.
     * 
     */
    private final @Nullable RouteResponse livenessRoute;
    /**
     * @return The route to check the readiness of the inference server container.
     * 
     */
    private final @Nullable RouteResponse readinessRoute;
    /**
     * @return The port to send the scoring requests to, within the inference server container.
     * 
     */
    private final @Nullable RouteResponse scoringRoute;

    @CustomType.Constructor
    private InferenceContainerPropertiesResponse(
        @CustomType.Parameter("livenessRoute") @Nullable RouteResponse livenessRoute,
        @CustomType.Parameter("readinessRoute") @Nullable RouteResponse readinessRoute,
        @CustomType.Parameter("scoringRoute") @Nullable RouteResponse scoringRoute) {
        this.livenessRoute = livenessRoute;
        this.readinessRoute = readinessRoute;
        this.scoringRoute = scoringRoute;
    }

    /**
     * @return The route to check the liveness of the inference server container.
     * 
     */
    public Optional<RouteResponse> livenessRoute() {
        return Optional.ofNullable(this.livenessRoute);
    }
    /**
     * @return The route to check the readiness of the inference server container.
     * 
     */
    public Optional<RouteResponse> readinessRoute() {
        return Optional.ofNullable(this.readinessRoute);
    }
    /**
     * @return The port to send the scoring requests to, within the inference server container.
     * 
     */
    public Optional<RouteResponse> scoringRoute() {
        return Optional.ofNullable(this.scoringRoute);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InferenceContainerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RouteResponse livenessRoute;
        private @Nullable RouteResponse readinessRoute;
        private @Nullable RouteResponse scoringRoute;

        public Builder() {
    	      // Empty
        }

        public Builder(InferenceContainerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.livenessRoute = defaults.livenessRoute;
    	      this.readinessRoute = defaults.readinessRoute;
    	      this.scoringRoute = defaults.scoringRoute;
        }

        public Builder livenessRoute(@Nullable RouteResponse livenessRoute) {
            this.livenessRoute = livenessRoute;
            return this;
        }
        public Builder readinessRoute(@Nullable RouteResponse readinessRoute) {
            this.readinessRoute = readinessRoute;
            return this;
        }
        public Builder scoringRoute(@Nullable RouteResponse scoringRoute) {
            this.scoringRoute = scoringRoute;
            return this;
        }        public InferenceContainerPropertiesResponse build() {
            return new InferenceContainerPropertiesResponse(livenessRoute, readinessRoute, scoringRoute);
        }
    }
}
