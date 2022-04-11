// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteActionArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteRetryPolicyArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteTimeoutArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecHttp2RouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttp2RouteArgs Empty = new RouteSpecHttp2RouteArgs();

    /**
     * The action to take if a match is determined.
     * 
     */
    @Import(name="action", required=true)
      private final Output<RouteSpecHttp2RouteActionArgs> action;

    public Output<RouteSpecHttp2RouteActionArgs> getAction() {
        return this.action;
    }

    /**
     * The criteria for determining an gRPC request match.
     * 
     */
    @Import(name="match", required=true)
      private final Output<RouteSpecHttp2RouteMatchArgs> match;

    public Output<RouteSpecHttp2RouteMatchArgs> getMatch() {
        return this.match;
    }

    /**
     * The retry policy.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<RouteSpecHttp2RouteRetryPolicyArgs> retryPolicy;

    public Output<RouteSpecHttp2RouteRetryPolicyArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Codegen.empty() : this.retryPolicy;
    }

    /**
     * The types of timeouts.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<RouteSpecHttp2RouteTimeoutArgs> timeout;

    public Output<RouteSpecHttp2RouteTimeoutArgs> getTimeout() {
        return this.timeout == null ? Codegen.empty() : this.timeout;
    }

    public RouteSpecHttp2RouteArgs(
        Output<RouteSpecHttp2RouteActionArgs> action,
        Output<RouteSpecHttp2RouteMatchArgs> match,
        @Nullable Output<RouteSpecHttp2RouteRetryPolicyArgs> retryPolicy,
        @Nullable Output<RouteSpecHttp2RouteTimeoutArgs> timeout) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
    }

    private RouteSpecHttp2RouteArgs() {
        this.action = Codegen.empty();
        this.match = Codegen.empty();
        this.retryPolicy = Codegen.empty();
        this.timeout = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttp2RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RouteSpecHttp2RouteActionArgs> action;
        private Output<RouteSpecHttp2RouteMatchArgs> match;
        private @Nullable Output<RouteSpecHttp2RouteRetryPolicyArgs> retryPolicy;
        private @Nullable Output<RouteSpecHttp2RouteTimeoutArgs> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttp2RouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.match = defaults.match;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
        }

        public Builder action(Output<RouteSpecHttp2RouteActionArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(RouteSpecHttp2RouteActionArgs action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder match(Output<RouteSpecHttp2RouteMatchArgs> match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public Builder match(RouteSpecHttp2RouteMatchArgs match) {
            this.match = Output.of(Objects.requireNonNull(match));
            return this;
        }
        public Builder retryPolicy(@Nullable Output<RouteSpecHttp2RouteRetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder retryPolicy(@Nullable RouteSpecHttp2RouteRetryPolicyArgs retryPolicy) {
            this.retryPolicy = Codegen.ofNullable(retryPolicy);
            return this;
        }
        public Builder timeout(@Nullable Output<RouteSpecHttp2RouteTimeoutArgs> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable RouteSpecHttp2RouteTimeoutArgs timeout) {
            this.timeout = Codegen.ofNullable(timeout);
            return this;
        }        public RouteSpecHttp2RouteArgs build() {
            return new RouteSpecHttp2RouteArgs(action, match, retryPolicy, timeout);
        }
    }
}
