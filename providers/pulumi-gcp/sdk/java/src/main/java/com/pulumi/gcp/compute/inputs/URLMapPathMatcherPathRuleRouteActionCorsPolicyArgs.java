// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs Empty = new URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs();

    /**
     * In response to a preflight request, setting this to true indicates that the actual request can include user credentials.
     * This translates to the Access-Control-Allow-Credentials header.
     * 
     */
    @Import(name="allowCredentials")
    private @Nullable Output<Boolean> allowCredentials;

    /**
     * @return In response to a preflight request, setting this to true indicates that the actual request can include user credentials.
     * This translates to the Access-Control-Allow-Credentials header.
     * 
     */
    public Optional<Output<Boolean>> allowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }

    /**
     * Specifies the content for the Access-Control-Allow-Headers header.
     * 
     */
    @Import(name="allowHeaders")
    private @Nullable Output<List<String>> allowHeaders;

    /**
     * @return Specifies the content for the Access-Control-Allow-Headers header.
     * 
     */
    public Optional<Output<List<String>>> allowHeaders() {
        return Optional.ofNullable(this.allowHeaders);
    }

    /**
     * Specifies the content for the Access-Control-Allow-Methods header.
     * 
     */
    @Import(name="allowMethods")
    private @Nullable Output<List<String>> allowMethods;

    /**
     * @return Specifies the content for the Access-Control-Allow-Methods header.
     * 
     */
    public Optional<Output<List<String>>> allowMethods() {
        return Optional.ofNullable(this.allowMethods);
    }

    /**
     * Specifies the regular expression patterns that match allowed origins. For regular expression grammar
     * please see en.cppreference.com/w/cpp/regex/ecmascript
     * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
     * 
     */
    @Import(name="allowOriginRegexes")
    private @Nullable Output<List<String>> allowOriginRegexes;

    /**
     * @return Specifies the regular expression patterns that match allowed origins. For regular expression grammar
     * please see en.cppreference.com/w/cpp/regex/ecmascript
     * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
     * 
     */
    public Optional<Output<List<String>>> allowOriginRegexes() {
        return Optional.ofNullable(this.allowOriginRegexes);
    }

    /**
     * Specifies the list of origins that will be allowed to do CORS requests.
     * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
     * 
     */
    @Import(name="allowOrigins")
    private @Nullable Output<List<String>> allowOrigins;

    /**
     * @return Specifies the list of origins that will be allowed to do CORS requests.
     * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
     * 
     */
    public Optional<Output<List<String>>> allowOrigins() {
        return Optional.ofNullable(this.allowOrigins);
    }

    /**
     * If true, specifies the CORS policy is disabled. The default value is false, which indicates that the CORS policy is in effect.
     * 
     */
    @Import(name="disabled", required=true)
    private Output<Boolean> disabled;

    /**
     * @return If true, specifies the CORS policy is disabled. The default value is false, which indicates that the CORS policy is in effect.
     * 
     */
    public Output<Boolean> disabled() {
        return this.disabled;
    }

    /**
     * Specifies the content for the Access-Control-Expose-Headers header.
     * 
     */
    @Import(name="exposeHeaders")
    private @Nullable Output<List<String>> exposeHeaders;

    /**
     * @return Specifies the content for the Access-Control-Expose-Headers header.
     * 
     */
    public Optional<Output<List<String>>> exposeHeaders() {
        return Optional.ofNullable(this.exposeHeaders);
    }

    /**
     * Specifies how long results of a preflight request can be cached in seconds.
     * This translates to the Access-Control-Max-Age header.
     * 
     */
    @Import(name="maxAge")
    private @Nullable Output<Integer> maxAge;

    /**
     * @return Specifies how long results of a preflight request can be cached in seconds.
     * This translates to the Access-Control-Max-Age header.
     * 
     */
    public Optional<Output<Integer>> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    private URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs() {}

    private URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs(URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs $) {
        this.allowCredentials = $.allowCredentials;
        this.allowHeaders = $.allowHeaders;
        this.allowMethods = $.allowMethods;
        this.allowOriginRegexes = $.allowOriginRegexes;
        this.allowOrigins = $.allowOrigins;
        this.disabled = $.disabled;
        this.exposeHeaders = $.exposeHeaders;
        this.maxAge = $.maxAge;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs $;

        public Builder() {
            $ = new URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs();
        }

        public Builder(URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs defaults) {
            $ = new URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowCredentials In response to a preflight request, setting this to true indicates that the actual request can include user credentials.
         * This translates to the Access-Control-Allow-Credentials header.
         * 
         * @return builder
         * 
         */
        public Builder allowCredentials(@Nullable Output<Boolean> allowCredentials) {
            $.allowCredentials = allowCredentials;
            return this;
        }

        /**
         * @param allowCredentials In response to a preflight request, setting this to true indicates that the actual request can include user credentials.
         * This translates to the Access-Control-Allow-Credentials header.
         * 
         * @return builder
         * 
         */
        public Builder allowCredentials(Boolean allowCredentials) {
            return allowCredentials(Output.of(allowCredentials));
        }

        /**
         * @param allowHeaders Specifies the content for the Access-Control-Allow-Headers header.
         * 
         * @return builder
         * 
         */
        public Builder allowHeaders(@Nullable Output<List<String>> allowHeaders) {
            $.allowHeaders = allowHeaders;
            return this;
        }

        /**
         * @param allowHeaders Specifies the content for the Access-Control-Allow-Headers header.
         * 
         * @return builder
         * 
         */
        public Builder allowHeaders(List<String> allowHeaders) {
            return allowHeaders(Output.of(allowHeaders));
        }

        /**
         * @param allowHeaders Specifies the content for the Access-Control-Allow-Headers header.
         * 
         * @return builder
         * 
         */
        public Builder allowHeaders(String... allowHeaders) {
            return allowHeaders(List.of(allowHeaders));
        }

        /**
         * @param allowMethods Specifies the content for the Access-Control-Allow-Methods header.
         * 
         * @return builder
         * 
         */
        public Builder allowMethods(@Nullable Output<List<String>> allowMethods) {
            $.allowMethods = allowMethods;
            return this;
        }

        /**
         * @param allowMethods Specifies the content for the Access-Control-Allow-Methods header.
         * 
         * @return builder
         * 
         */
        public Builder allowMethods(List<String> allowMethods) {
            return allowMethods(Output.of(allowMethods));
        }

        /**
         * @param allowMethods Specifies the content for the Access-Control-Allow-Methods header.
         * 
         * @return builder
         * 
         */
        public Builder allowMethods(String... allowMethods) {
            return allowMethods(List.of(allowMethods));
        }

        /**
         * @param allowOriginRegexes Specifies the regular expression patterns that match allowed origins. For regular expression grammar
         * please see en.cppreference.com/w/cpp/regex/ecmascript
         * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
         * 
         * @return builder
         * 
         */
        public Builder allowOriginRegexes(@Nullable Output<List<String>> allowOriginRegexes) {
            $.allowOriginRegexes = allowOriginRegexes;
            return this;
        }

        /**
         * @param allowOriginRegexes Specifies the regular expression patterns that match allowed origins. For regular expression grammar
         * please see en.cppreference.com/w/cpp/regex/ecmascript
         * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
         * 
         * @return builder
         * 
         */
        public Builder allowOriginRegexes(List<String> allowOriginRegexes) {
            return allowOriginRegexes(Output.of(allowOriginRegexes));
        }

        /**
         * @param allowOriginRegexes Specifies the regular expression patterns that match allowed origins. For regular expression grammar
         * please see en.cppreference.com/w/cpp/regex/ecmascript
         * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
         * 
         * @return builder
         * 
         */
        public Builder allowOriginRegexes(String... allowOriginRegexes) {
            return allowOriginRegexes(List.of(allowOriginRegexes));
        }

        /**
         * @param allowOrigins Specifies the list of origins that will be allowed to do CORS requests.
         * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
         * 
         * @return builder
         * 
         */
        public Builder allowOrigins(@Nullable Output<List<String>> allowOrigins) {
            $.allowOrigins = allowOrigins;
            return this;
        }

        /**
         * @param allowOrigins Specifies the list of origins that will be allowed to do CORS requests.
         * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
         * 
         * @return builder
         * 
         */
        public Builder allowOrigins(List<String> allowOrigins) {
            return allowOrigins(Output.of(allowOrigins));
        }

        /**
         * @param allowOrigins Specifies the list of origins that will be allowed to do CORS requests.
         * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
         * 
         * @return builder
         * 
         */
        public Builder allowOrigins(String... allowOrigins) {
            return allowOrigins(List.of(allowOrigins));
        }

        /**
         * @param disabled If true, specifies the CORS policy is disabled. The default value is false, which indicates that the CORS policy is in effect.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled If true, specifies the CORS policy is disabled. The default value is false, which indicates that the CORS policy is in effect.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param exposeHeaders Specifies the content for the Access-Control-Expose-Headers header.
         * 
         * @return builder
         * 
         */
        public Builder exposeHeaders(@Nullable Output<List<String>> exposeHeaders) {
            $.exposeHeaders = exposeHeaders;
            return this;
        }

        /**
         * @param exposeHeaders Specifies the content for the Access-Control-Expose-Headers header.
         * 
         * @return builder
         * 
         */
        public Builder exposeHeaders(List<String> exposeHeaders) {
            return exposeHeaders(Output.of(exposeHeaders));
        }

        /**
         * @param exposeHeaders Specifies the content for the Access-Control-Expose-Headers header.
         * 
         * @return builder
         * 
         */
        public Builder exposeHeaders(String... exposeHeaders) {
            return exposeHeaders(List.of(exposeHeaders));
        }

        /**
         * @param maxAge Specifies how long results of a preflight request can be cached in seconds.
         * This translates to the Access-Control-Max-Age header.
         * 
         * @return builder
         * 
         */
        public Builder maxAge(@Nullable Output<Integer> maxAge) {
            $.maxAge = maxAge;
            return this;
        }

        /**
         * @param maxAge Specifies how long results of a preflight request can be cached in seconds.
         * This translates to the Access-Control-Max-Age header.
         * 
         * @return builder
         * 
         */
        public Builder maxAge(Integer maxAge) {
            return maxAge(Output.of(maxAge));
        }

        public URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs build() {
            $.disabled = Objects.requireNonNull($.disabled, "expected parameter 'disabled' to be non-null");
            return $;
        }
    }

}
