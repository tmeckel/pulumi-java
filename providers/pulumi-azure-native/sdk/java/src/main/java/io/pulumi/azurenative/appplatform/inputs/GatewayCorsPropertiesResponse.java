// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cross-Origin Resource Sharing property
 * 
 */
public final class GatewayCorsPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GatewayCorsPropertiesResponse Empty = new GatewayCorsPropertiesResponse();

    /**
     * Whether user credentials are supported on cross-site requests. Valid values: `true`, `false`.
     * 
     */
    @InputImport(name="allowCredentials")
      private final @Nullable Boolean allowCredentials;

    public Optional<Boolean> getAllowCredentials() {
        return this.allowCredentials == null ? Optional.empty() : Optional.ofNullable(this.allowCredentials);
    }

    /**
     * Allowed headers in cross-site requests. The special value `*` allows actual requests to send any header.
     * 
     */
    @InputImport(name="allowedHeaders")
      private final @Nullable List<String> allowedHeaders;

    public List<String> getAllowedHeaders() {
        return this.allowedHeaders == null ? List.of() : this.allowedHeaders;
    }

    /**
     * Allowed HTTP methods on cross-site requests. The special value `*` allows all methods. If not set, `GET` and `HEAD` are allowed by default.
     * 
     */
    @InputImport(name="allowedMethods")
      private final @Nullable List<String> allowedMethods;

    public List<String> getAllowedMethods() {
        return this.allowedMethods == null ? List.of() : this.allowedMethods;
    }

    /**
     * Allowed origins to make cross-site requests. The special value `*` allows all domains.
     * 
     */
    @InputImport(name="allowedOrigins")
      private final @Nullable List<String> allowedOrigins;

    public List<String> getAllowedOrigins() {
        return this.allowedOrigins == null ? List.of() : this.allowedOrigins;
    }

    /**
     * HTTP response headers to expose for cross-site requests.
     * 
     */
    @InputImport(name="exposedHeaders")
      private final @Nullable List<String> exposedHeaders;

    public List<String> getExposedHeaders() {
        return this.exposedHeaders == null ? List.of() : this.exposedHeaders;
    }

    /**
     * How long, in seconds, the response from a pre-flight request can be cached by clients.
     * 
     */
    @InputImport(name="maxAge")
      private final @Nullable Integer maxAge;

    public Optional<Integer> getMaxAge() {
        return this.maxAge == null ? Optional.empty() : Optional.ofNullable(this.maxAge);
    }

    public GatewayCorsPropertiesResponse(
        @Nullable Boolean allowCredentials,
        @Nullable List<String> allowedHeaders,
        @Nullable List<String> allowedMethods,
        @Nullable List<String> allowedOrigins,
        @Nullable List<String> exposedHeaders,
        @Nullable Integer maxAge) {
        this.allowCredentials = allowCredentials;
        this.allowedHeaders = allowedHeaders;
        this.allowedMethods = allowedMethods;
        this.allowedOrigins = allowedOrigins;
        this.exposedHeaders = exposedHeaders;
        this.maxAge = maxAge;
    }

    private GatewayCorsPropertiesResponse() {
        this.allowCredentials = null;
        this.allowedHeaders = List.of();
        this.allowedMethods = List.of();
        this.allowedOrigins = List.of();
        this.exposedHeaders = List.of();
        this.maxAge = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayCorsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowCredentials;
        private @Nullable List<String> allowedHeaders;
        private @Nullable List<String> allowedMethods;
        private @Nullable List<String> allowedOrigins;
        private @Nullable List<String> exposedHeaders;
        private @Nullable Integer maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayCorsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposedHeaders = defaults.exposedHeaders;
    	      this.maxAge = defaults.maxAge;
        }

        public Builder allowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }

        public Builder allowedHeaders(@Nullable List<String> allowedHeaders) {
            this.allowedHeaders = allowedHeaders;
            return this;
        }

        public Builder allowedMethods(@Nullable List<String> allowedMethods) {
            this.allowedMethods = allowedMethods;
            return this;
        }

        public Builder allowedOrigins(@Nullable List<String> allowedOrigins) {
            this.allowedOrigins = allowedOrigins;
            return this;
        }

        public Builder exposedHeaders(@Nullable List<String> exposedHeaders) {
            this.exposedHeaders = exposedHeaders;
            return this;
        }

        public Builder maxAge(@Nullable Integer maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public GatewayCorsPropertiesResponse build() {
            return new GatewayCorsPropertiesResponse(allowCredentials, allowedHeaders, allowedMethods, allowedOrigins, exposedHeaders, maxAge);
        }
    }
}
