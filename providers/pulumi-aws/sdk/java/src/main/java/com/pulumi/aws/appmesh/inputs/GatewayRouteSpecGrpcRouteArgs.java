// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteActionArgs;
import com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteMatchArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class GatewayRouteSpecGrpcRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecGrpcRouteArgs Empty = new GatewayRouteSpecGrpcRouteArgs();

    /**
     * The action to take if a match is determined.
     * 
     */
    @Import(name="action", required=true)
    private Output<GatewayRouteSpecGrpcRouteActionArgs> action;

    /**
     * @return The action to take if a match is determined.
     * 
     */
    public Output<GatewayRouteSpecGrpcRouteActionArgs> action() {
        return this.action;
    }

    /**
     * The criteria for determining a request match.
     * 
     */
    @Import(name="match", required=true)
    private Output<GatewayRouteSpecGrpcRouteMatchArgs> match;

    /**
     * @return The criteria for determining a request match.
     * 
     */
    public Output<GatewayRouteSpecGrpcRouteMatchArgs> match() {
        return this.match;
    }

    private GatewayRouteSpecGrpcRouteArgs() {}

    private GatewayRouteSpecGrpcRouteArgs(GatewayRouteSpecGrpcRouteArgs $) {
        this.action = $.action;
        this.match = $.match;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayRouteSpecGrpcRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecGrpcRouteArgs $;

        public Builder() {
            $ = new GatewayRouteSpecGrpcRouteArgs();
        }

        public Builder(GatewayRouteSpecGrpcRouteArgs defaults) {
            $ = new GatewayRouteSpecGrpcRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action to take if a match is determined.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<GatewayRouteSpecGrpcRouteActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action to take if a match is determined.
         * 
         * @return builder
         * 
         */
        public Builder action(GatewayRouteSpecGrpcRouteActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param match The criteria for determining a request match.
         * 
         * @return builder
         * 
         */
        public Builder match(Output<GatewayRouteSpecGrpcRouteMatchArgs> match) {
            $.match = match;
            return this;
        }

        /**
         * @param match The criteria for determining a request match.
         * 
         * @return builder
         * 
         */
        public Builder match(GatewayRouteSpecGrpcRouteMatchArgs match) {
            return match(Output.of(match));
        }

        public GatewayRouteSpecGrpcRouteArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.match = Objects.requireNonNull($.match, "expected parameter 'match' to be non-null");
            return $;
        }
    }

}
