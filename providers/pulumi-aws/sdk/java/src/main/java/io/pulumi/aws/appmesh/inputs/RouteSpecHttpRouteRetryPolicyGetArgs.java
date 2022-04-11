// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecHttpRouteRetryPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteRetryPolicyGetArgs Empty = new RouteSpecHttpRouteRetryPolicyGetArgs();

    /**
     * List of HTTP retry events.
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * 
     */
    @Import(name="httpRetryEvents")
      private final @Nullable Output<List<String>> httpRetryEvents;

    public Output<List<String>> getHttpRetryEvents() {
        return this.httpRetryEvents == null ? Codegen.empty() : this.httpRetryEvents;
    }

    /**
     * The maximum number of retries.
     * 
     */
    @Import(name="maxRetries", required=true)
      private final Output<Integer> maxRetries;

    public Output<Integer> getMaxRetries() {
        return this.maxRetries;
    }

    /**
     * The per-retry timeout.
     * 
     */
    @Import(name="perRetryTimeout", required=true)
      private final Output<RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs> perRetryTimeout;

    public Output<RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs> getPerRetryTimeout() {
        return this.perRetryTimeout;
    }

    /**
     * List of TCP retry events. The only valid value is `connection-error`.
     * 
     */
    @Import(name="tcpRetryEvents")
      private final @Nullable Output<List<String>> tcpRetryEvents;

    public Output<List<String>> getTcpRetryEvents() {
        return this.tcpRetryEvents == null ? Codegen.empty() : this.tcpRetryEvents;
    }

    public RouteSpecHttpRouteRetryPolicyGetArgs(
        @Nullable Output<List<String>> httpRetryEvents,
        Output<Integer> maxRetries,
        Output<RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs> perRetryTimeout,
        @Nullable Output<List<String>> tcpRetryEvents) {
        this.httpRetryEvents = httpRetryEvents;
        this.maxRetries = Objects.requireNonNull(maxRetries, "expected parameter 'maxRetries' to be non-null");
        this.perRetryTimeout = Objects.requireNonNull(perRetryTimeout, "expected parameter 'perRetryTimeout' to be non-null");
        this.tcpRetryEvents = tcpRetryEvents;
    }

    private RouteSpecHttpRouteRetryPolicyGetArgs() {
        this.httpRetryEvents = Codegen.empty();
        this.maxRetries = Codegen.empty();
        this.perRetryTimeout = Codegen.empty();
        this.tcpRetryEvents = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteRetryPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> httpRetryEvents;
        private Output<Integer> maxRetries;
        private Output<RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs> perRetryTimeout;
        private @Nullable Output<List<String>> tcpRetryEvents;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRouteRetryPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpRetryEvents = defaults.httpRetryEvents;
    	      this.maxRetries = defaults.maxRetries;
    	      this.perRetryTimeout = defaults.perRetryTimeout;
    	      this.tcpRetryEvents = defaults.tcpRetryEvents;
        }

        public Builder httpRetryEvents(@Nullable Output<List<String>> httpRetryEvents) {
            this.httpRetryEvents = httpRetryEvents;
            return this;
        }
        public Builder httpRetryEvents(@Nullable List<String> httpRetryEvents) {
            this.httpRetryEvents = Codegen.ofNullable(httpRetryEvents);
            return this;
        }
        public Builder httpRetryEvents(String... httpRetryEvents) {
            return httpRetryEvents(List.of(httpRetryEvents));
        }
        public Builder maxRetries(Output<Integer> maxRetries) {
            this.maxRetries = Objects.requireNonNull(maxRetries);
            return this;
        }
        public Builder maxRetries(Integer maxRetries) {
            this.maxRetries = Output.of(Objects.requireNonNull(maxRetries));
            return this;
        }
        public Builder perRetryTimeout(Output<RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs> perRetryTimeout) {
            this.perRetryTimeout = Objects.requireNonNull(perRetryTimeout);
            return this;
        }
        public Builder perRetryTimeout(RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs perRetryTimeout) {
            this.perRetryTimeout = Output.of(Objects.requireNonNull(perRetryTimeout));
            return this;
        }
        public Builder tcpRetryEvents(@Nullable Output<List<String>> tcpRetryEvents) {
            this.tcpRetryEvents = tcpRetryEvents;
            return this;
        }
        public Builder tcpRetryEvents(@Nullable List<String> tcpRetryEvents) {
            this.tcpRetryEvents = Codegen.ofNullable(tcpRetryEvents);
            return this;
        }
        public Builder tcpRetryEvents(String... tcpRetryEvents) {
            return tcpRetryEvents(List.of(tcpRetryEvents));
        }        public RouteSpecHttpRouteRetryPolicyGetArgs build() {
            return new RouteSpecHttpRouteRetryPolicyGetArgs(httpRetryEvents, maxRetries, perRetryTimeout, tcpRetryEvents);
        }
    }
}
