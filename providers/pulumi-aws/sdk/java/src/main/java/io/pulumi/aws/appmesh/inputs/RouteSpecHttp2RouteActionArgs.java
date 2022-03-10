// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteActionWeightedTargetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class RouteSpecHttp2RouteActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttp2RouteActionArgs Empty = new RouteSpecHttp2RouteActionArgs();

    /**
     * The targets that traffic is routed to when a request matches the route.
     * You can specify one or more targets and their relative weights with which to distribute traffic.
     * 
     */
    @InputImport(name="weightedTargets", required=true)
      private final Input<List<RouteSpecHttp2RouteActionWeightedTargetArgs>> weightedTargets;

    public Input<List<RouteSpecHttp2RouteActionWeightedTargetArgs>> getWeightedTargets() {
        return this.weightedTargets;
    }

    public RouteSpecHttp2RouteActionArgs(Input<List<RouteSpecHttp2RouteActionWeightedTargetArgs>> weightedTargets) {
        this.weightedTargets = Objects.requireNonNull(weightedTargets, "expected parameter 'weightedTargets' to be non-null");
    }

    private RouteSpecHttp2RouteActionArgs() {
        this.weightedTargets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttp2RouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<RouteSpecHttp2RouteActionWeightedTargetArgs>> weightedTargets;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttp2RouteActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.weightedTargets = defaults.weightedTargets;
        }

        public Builder weightedTargets(Input<List<RouteSpecHttp2RouteActionWeightedTargetArgs>> weightedTargets) {
            this.weightedTargets = Objects.requireNonNull(weightedTargets);
            return this;
        }

        public Builder weightedTargets(List<RouteSpecHttp2RouteActionWeightedTargetArgs> weightedTargets) {
            this.weightedTargets = Input.of(Objects.requireNonNull(weightedTargets));
            return this;
        }
        public RouteSpecHttp2RouteActionArgs build() {
            return new RouteSpecHttp2RouteActionArgs(weightedTargets);
        }
    }
}
