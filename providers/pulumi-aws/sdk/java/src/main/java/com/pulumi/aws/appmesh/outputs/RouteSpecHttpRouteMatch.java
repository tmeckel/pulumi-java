// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.RouteSpecHttpRouteMatchHeader;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RouteSpecHttpRouteMatch {
    /**
     * @return The client request headers to match on.
     * 
     */
    private final @Nullable List<RouteSpecHttpRouteMatchHeader> headers;
    /**
     * @return The client request header method to match on. Valid values: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`.
     * 
     */
    private final @Nullable String method;
    /**
     * @return The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
     * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
     * 
     */
    private final String prefix;
    /**
     * @return The client request header scheme to match on. Valid values: `http`, `https`.
     * 
     */
    private final @Nullable String scheme;

    @CustomType.Constructor
    private RouteSpecHttpRouteMatch(
        @CustomType.Parameter("headers") @Nullable List<RouteSpecHttpRouteMatchHeader> headers,
        @CustomType.Parameter("method") @Nullable String method,
        @CustomType.Parameter("prefix") String prefix,
        @CustomType.Parameter("scheme") @Nullable String scheme) {
        this.headers = headers;
        this.method = method;
        this.prefix = prefix;
        this.scheme = scheme;
    }

    /**
     * @return The client request headers to match on.
     * 
     */
    public List<RouteSpecHttpRouteMatchHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return The client request header method to match on. Valid values: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`.
     * 
     */
    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
     * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
     * 
     */
    public String prefix() {
        return this.prefix;
    }
    /**
     * @return The client request header scheme to match on. Valid values: `http`, `https`.
     * 
     */
    public Optional<String> scheme() {
        return Optional.ofNullable(this.scheme);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RouteSpecHttpRouteMatchHeader> headers;
        private @Nullable String method;
        private String prefix;
        private @Nullable String scheme;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRouteMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.method = defaults.method;
    	      this.prefix = defaults.prefix;
    	      this.scheme = defaults.scheme;
        }

        public Builder headers(@Nullable List<RouteSpecHttpRouteMatchHeader> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(RouteSpecHttpRouteMatchHeader... headers) {
            return headers(List.of(headers));
        }
        public Builder method(@Nullable String method) {
            this.method = method;
            return this;
        }
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        public Builder scheme(@Nullable String scheme) {
            this.scheme = scheme;
            return this;
        }        public RouteSpecHttpRouteMatch build() {
            return new RouteSpecHttpRouteMatch(headers, method, prefix, scheme);
        }
    }
}
