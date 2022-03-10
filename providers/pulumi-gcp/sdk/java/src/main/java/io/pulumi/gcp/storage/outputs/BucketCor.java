// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketCor {
    /**
     * The value, in seconds, to return in the [Access-Control-Max-Age header](https://www.w3.org/TR/cors/#access-control-max-age-response-header) used in preflight responses.
     * 
     */
    private final @Nullable Integer maxAgeSeconds;
    /**
     * The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: "*" is permitted in the list of methods, and means "any method".
     * 
     */
    private final @Nullable List<String> methods;
    /**
     * The list of [Origins](https://tools.ietf.org/html/rfc6454) eligible to receive CORS response headers. Note: "*" is permitted in the list of origins, and means "any Origin".
     * 
     */
    private final @Nullable List<String> origins;
    /**
     * The list of HTTP headers other than the [simple response headers](https://www.w3.org/TR/cors/#simple-response-header) to give permission for the user-agent to share across domains.
     * 
     */
    private final @Nullable List<String> responseHeaders;

    @OutputCustomType.Constructor
    private BucketCor(
        @OutputCustomType.Parameter("maxAgeSeconds") @Nullable Integer maxAgeSeconds,
        @OutputCustomType.Parameter("methods") @Nullable List<String> methods,
        @OutputCustomType.Parameter("origins") @Nullable List<String> origins,
        @OutputCustomType.Parameter("responseHeaders") @Nullable List<String> responseHeaders) {
        this.maxAgeSeconds = maxAgeSeconds;
        this.methods = methods;
        this.origins = origins;
        this.responseHeaders = responseHeaders;
    }

    /**
     * The value, in seconds, to return in the [Access-Control-Max-Age header](https://www.w3.org/TR/cors/#access-control-max-age-response-header) used in preflight responses.
     * 
    */
    public Optional<Integer> getMaxAgeSeconds() {
        return Optional.ofNullable(this.maxAgeSeconds);
    }
    /**
     * The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: "*" is permitted in the list of methods, and means "any method".
     * 
    */
    public List<String> getMethods() {
        return this.methods == null ? List.of() : this.methods;
    }
    /**
     * The list of [Origins](https://tools.ietf.org/html/rfc6454) eligible to receive CORS response headers. Note: "*" is permitted in the list of origins, and means "any Origin".
     * 
    */
    public List<String> getOrigins() {
        return this.origins == null ? List.of() : this.origins;
    }
    /**
     * The list of HTTP headers other than the [simple response headers](https://www.w3.org/TR/cors/#simple-response-header) to give permission for the user-agent to share across domains.
     * 
    */
    public List<String> getResponseHeaders() {
        return this.responseHeaders == null ? List.of() : this.responseHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxAgeSeconds;
        private @Nullable List<String> methods;
        private @Nullable List<String> origins;
        private @Nullable List<String> responseHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketCor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxAgeSeconds = defaults.maxAgeSeconds;
    	      this.methods = defaults.methods;
    	      this.origins = defaults.origins;
    	      this.responseHeaders = defaults.responseHeaders;
        }

        public Builder maxAgeSeconds(@Nullable Integer maxAgeSeconds) {
            this.maxAgeSeconds = maxAgeSeconds;
            return this;
        }

        public Builder methods(@Nullable List<String> methods) {
            this.methods = methods;
            return this;
        }

        public Builder origins(@Nullable List<String> origins) {
            this.origins = origins;
            return this;
        }

        public Builder responseHeaders(@Nullable List<String> responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }
        public BucketCor build() {
            return new BucketCor(maxAgeSeconds, methods, origins, responseHeaders);
        }
    }
}
