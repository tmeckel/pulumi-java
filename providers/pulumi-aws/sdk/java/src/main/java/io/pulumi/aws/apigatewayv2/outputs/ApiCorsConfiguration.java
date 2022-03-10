// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApiCorsConfiguration {
    /**
     * Whether credentials are included in the CORS request.
     * 
     */
    private final @Nullable Boolean allowCredentials;
    /**
     * The set of allowed HTTP headers.
     * 
     */
    private final @Nullable List<String> allowHeaders;
    /**
     * The set of allowed HTTP methods.
     * 
     */
    private final @Nullable List<String> allowMethods;
    /**
     * The set of allowed origins.
     * 
     */
    private final @Nullable List<String> allowOrigins;
    /**
     * The set of exposed HTTP headers.
     * 
     */
    private final @Nullable List<String> exposeHeaders;
    /**
     * The number of seconds that the browser should cache preflight request results.
     * 
     */
    private final @Nullable Integer maxAge;

    @OutputCustomType.Constructor
    private ApiCorsConfiguration(
        @OutputCustomType.Parameter("allowCredentials") @Nullable Boolean allowCredentials,
        @OutputCustomType.Parameter("allowHeaders") @Nullable List<String> allowHeaders,
        @OutputCustomType.Parameter("allowMethods") @Nullable List<String> allowMethods,
        @OutputCustomType.Parameter("allowOrigins") @Nullable List<String> allowOrigins,
        @OutputCustomType.Parameter("exposeHeaders") @Nullable List<String> exposeHeaders,
        @OutputCustomType.Parameter("maxAge") @Nullable Integer maxAge) {
        this.allowCredentials = allowCredentials;
        this.allowHeaders = allowHeaders;
        this.allowMethods = allowMethods;
        this.allowOrigins = allowOrigins;
        this.exposeHeaders = exposeHeaders;
        this.maxAge = maxAge;
    }

    /**
     * Whether credentials are included in the CORS request.
     * 
    */
    public Optional<Boolean> getAllowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }
    /**
     * The set of allowed HTTP headers.
     * 
    */
    public List<String> getAllowHeaders() {
        return this.allowHeaders == null ? List.of() : this.allowHeaders;
    }
    /**
     * The set of allowed HTTP methods.
     * 
    */
    public List<String> getAllowMethods() {
        return this.allowMethods == null ? List.of() : this.allowMethods;
    }
    /**
     * The set of allowed origins.
     * 
    */
    public List<String> getAllowOrigins() {
        return this.allowOrigins == null ? List.of() : this.allowOrigins;
    }
    /**
     * The set of exposed HTTP headers.
     * 
    */
    public List<String> getExposeHeaders() {
        return this.exposeHeaders == null ? List.of() : this.exposeHeaders;
    }
    /**
     * The number of seconds that the browser should cache preflight request results.
     * 
    */
    public Optional<Integer> getMaxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiCorsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowCredentials;
        private @Nullable List<String> allowHeaders;
        private @Nullable List<String> allowMethods;
        private @Nullable List<String> allowOrigins;
        private @Nullable List<String> exposeHeaders;
        private @Nullable Integer maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiCorsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowHeaders = defaults.allowHeaders;
    	      this.allowMethods = defaults.allowMethods;
    	      this.allowOrigins = defaults.allowOrigins;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.maxAge = defaults.maxAge;
        }

        public Builder allowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }

        public Builder allowHeaders(@Nullable List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }

        public Builder allowMethods(@Nullable List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }

        public Builder allowOrigins(@Nullable List<String> allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }

        public Builder exposeHeaders(@Nullable List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }

        public Builder maxAge(@Nullable Integer maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public ApiCorsConfiguration build() {
            return new ApiCorsConfiguration(allowCredentials, allowHeaders, allowMethods, allowOrigins, exposeHeaders, maxAge);
        }
    }
}
