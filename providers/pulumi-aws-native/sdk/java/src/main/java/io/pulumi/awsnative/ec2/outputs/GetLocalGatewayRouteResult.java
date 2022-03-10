// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLocalGatewayRouteResult {
    /**
     * The state of the route.
     * 
     */
    private final @Nullable String state;
    /**
     * The route type.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private GetLocalGatewayRouteResult(
        @OutputCustomType.Parameter("state") @Nullable String state,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.state = state;
        this.type = type;
    }

    /**
     * The state of the route.
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * The route type.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewayRouteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String state;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocalGatewayRouteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public GetLocalGatewayRouteResult build() {
            return new GetLocalGatewayRouteResult(state, type);
        }
    }
}
