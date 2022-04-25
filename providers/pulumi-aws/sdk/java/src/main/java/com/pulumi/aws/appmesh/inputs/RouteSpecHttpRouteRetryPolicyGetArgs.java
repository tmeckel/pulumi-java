// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteSpecHttpRouteRetryPolicyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteRetryPolicyGetArgs Empty = new RouteSpecHttpRouteRetryPolicyGetArgs();

    /**
     * List of HTTP retry events.
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * 
     */
    @Import(name="httpRetryEvents")
    private @Nullable Output<List<String>> httpRetryEvents;

    /**
     * @return List of HTTP retry events.
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * 
     */
    public Optional<Output<List<String>>> httpRetryEvents() {
        return Optional.ofNullable(this.httpRetryEvents);
    }

    /**
     * The maximum number of retries.
     * 
     */
    @Import(name="maxRetries", required=true)
    private Output<Integer> maxRetries;

    /**
     * @return The maximum number of retries.
     * 
     */
    public Output<Integer> maxRetries() {
        return this.maxRetries;
    }

    /**
     * The per-retry timeout.
     * 
     */
    @Import(name="perRetryTimeout", required=true)
    private Output<RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs> perRetryTimeout;

    /**
     * @return The per-retry timeout.
     * 
     */
    public Output<RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs> perRetryTimeout() {
        return this.perRetryTimeout;
    }

    /**
     * List of TCP retry events. The only valid value is `connection-error`.
     * 
     */
    @Import(name="tcpRetryEvents")
    private @Nullable Output<List<String>> tcpRetryEvents;

    /**
     * @return List of TCP retry events. The only valid value is `connection-error`.
     * 
     */
    public Optional<Output<List<String>>> tcpRetryEvents() {
        return Optional.ofNullable(this.tcpRetryEvents);
    }

    private RouteSpecHttpRouteRetryPolicyGetArgs() {}

    private RouteSpecHttpRouteRetryPolicyGetArgs(RouteSpecHttpRouteRetryPolicyGetArgs $) {
        this.httpRetryEvents = $.httpRetryEvents;
        this.maxRetries = $.maxRetries;
        this.perRetryTimeout = $.perRetryTimeout;
        this.tcpRetryEvents = $.tcpRetryEvents;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecHttpRouteRetryPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecHttpRouteRetryPolicyGetArgs $;

        public Builder() {
            $ = new RouteSpecHttpRouteRetryPolicyGetArgs();
        }

        public Builder(RouteSpecHttpRouteRetryPolicyGetArgs defaults) {
            $ = new RouteSpecHttpRouteRetryPolicyGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param httpRetryEvents List of HTTP retry events.
         * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
         * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
         * 
         * @return builder
         * 
         */
        public Builder httpRetryEvents(@Nullable Output<List<String>> httpRetryEvents) {
            $.httpRetryEvents = httpRetryEvents;
            return this;
        }

        /**
         * @param httpRetryEvents List of HTTP retry events.
         * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
         * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
         * 
         * @return builder
         * 
         */
        public Builder httpRetryEvents(List<String> httpRetryEvents) {
            return httpRetryEvents(Output.of(httpRetryEvents));
        }

        /**
         * @param httpRetryEvents List of HTTP retry events.
         * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
         * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
         * 
         * @return builder
         * 
         */
        public Builder httpRetryEvents(String... httpRetryEvents) {
            return httpRetryEvents(List.of(httpRetryEvents));
        }

        /**
         * @param maxRetries The maximum number of retries.
         * 
         * @return builder
         * 
         */
        public Builder maxRetries(Output<Integer> maxRetries) {
            $.maxRetries = maxRetries;
            return this;
        }

        /**
         * @param maxRetries The maximum number of retries.
         * 
         * @return builder
         * 
         */
        public Builder maxRetries(Integer maxRetries) {
            return maxRetries(Output.of(maxRetries));
        }

        /**
         * @param perRetryTimeout The per-retry timeout.
         * 
         * @return builder
         * 
         */
        public Builder perRetryTimeout(Output<RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs> perRetryTimeout) {
            $.perRetryTimeout = perRetryTimeout;
            return this;
        }

        /**
         * @param perRetryTimeout The per-retry timeout.
         * 
         * @return builder
         * 
         */
        public Builder perRetryTimeout(RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs perRetryTimeout) {
            return perRetryTimeout(Output.of(perRetryTimeout));
        }

        /**
         * @param tcpRetryEvents List of TCP retry events. The only valid value is `connection-error`.
         * 
         * @return builder
         * 
         */
        public Builder tcpRetryEvents(@Nullable Output<List<String>> tcpRetryEvents) {
            $.tcpRetryEvents = tcpRetryEvents;
            return this;
        }

        /**
         * @param tcpRetryEvents List of TCP retry events. The only valid value is `connection-error`.
         * 
         * @return builder
         * 
         */
        public Builder tcpRetryEvents(List<String> tcpRetryEvents) {
            return tcpRetryEvents(Output.of(tcpRetryEvents));
        }

        /**
         * @param tcpRetryEvents List of TCP retry events. The only valid value is `connection-error`.
         * 
         * @return builder
         * 
         */
        public Builder tcpRetryEvents(String... tcpRetryEvents) {
            return tcpRetryEvents(List.of(tcpRetryEvents));
        }

        public RouteSpecHttpRouteRetryPolicyGetArgs build() {
            $.maxRetries = Objects.requireNonNull($.maxRetries, "expected parameter 'maxRetries' to be non-null");
            $.perRetryTimeout = Objects.requireNonNull($.perRetryTimeout, "expected parameter 'perRetryTimeout' to be non-null");
            return $;
        }
    }

}
