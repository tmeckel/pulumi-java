// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies a CORS rule for the Blob service.
 * 
 */
public final class CorsRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final CorsRuleResponse Empty = new CorsRuleResponse();

    /**
     * Required if CorsRule element is present. A list of headers allowed to be part of the cross-origin request.
     * 
     */
    @Import(name="allowedHeaders", required=true)
    private List<String> allowedHeaders;

    /**
     * @return Required if CorsRule element is present. A list of headers allowed to be part of the cross-origin request.
     * 
     */
    public List<String> allowedHeaders() {
        return this.allowedHeaders;
    }

    /**
     * Required if CorsRule element is present. A list of HTTP methods that are allowed to be executed by the origin.
     * 
     */
    @Import(name="allowedMethods", required=true)
    private List<String> allowedMethods;

    /**
     * @return Required if CorsRule element is present. A list of HTTP methods that are allowed to be executed by the origin.
     * 
     */
    public List<String> allowedMethods() {
        return this.allowedMethods;
    }

    /**
     * Required if CorsRule element is present. A list of origin domains that will be allowed via CORS, or &#34;*&#34; to allow all domains
     * 
     */
    @Import(name="allowedOrigins", required=true)
    private List<String> allowedOrigins;

    /**
     * @return Required if CorsRule element is present. A list of origin domains that will be allowed via CORS, or &#34;*&#34; to allow all domains
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Required if CorsRule element is present. A list of response headers to expose to CORS clients.
     * 
     */
    @Import(name="exposedHeaders", required=true)
    private List<String> exposedHeaders;

    /**
     * @return Required if CorsRule element is present. A list of response headers to expose to CORS clients.
     * 
     */
    public List<String> exposedHeaders() {
        return this.exposedHeaders;
    }

    /**
     * Required if CorsRule element is present. The number of seconds that the client/browser should cache a preflight response.
     * 
     */
    @Import(name="maxAgeInSeconds", required=true)
    private Integer maxAgeInSeconds;

    /**
     * @return Required if CorsRule element is present. The number of seconds that the client/browser should cache a preflight response.
     * 
     */
    public Integer maxAgeInSeconds() {
        return this.maxAgeInSeconds;
    }

    private CorsRuleResponse() {}

    private CorsRuleResponse(CorsRuleResponse $) {
        this.allowedHeaders = $.allowedHeaders;
        this.allowedMethods = $.allowedMethods;
        this.allowedOrigins = $.allowedOrigins;
        this.exposedHeaders = $.exposedHeaders;
        this.maxAgeInSeconds = $.maxAgeInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CorsRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CorsRuleResponse $;

        public Builder() {
            $ = new CorsRuleResponse();
        }

        public Builder(CorsRuleResponse defaults) {
            $ = new CorsRuleResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedHeaders Required if CorsRule element is present. A list of headers allowed to be part of the cross-origin request.
         * 
         * @return builder
         * 
         */
        public Builder allowedHeaders(List<String> allowedHeaders) {
            $.allowedHeaders = allowedHeaders;
            return this;
        }

        /**
         * @param allowedHeaders Required if CorsRule element is present. A list of headers allowed to be part of the cross-origin request.
         * 
         * @return builder
         * 
         */
        public Builder allowedHeaders(String... allowedHeaders) {
            return allowedHeaders(List.of(allowedHeaders));
        }

        /**
         * @param allowedMethods Required if CorsRule element is present. A list of HTTP methods that are allowed to be executed by the origin.
         * 
         * @return builder
         * 
         */
        public Builder allowedMethods(List<String> allowedMethods) {
            $.allowedMethods = allowedMethods;
            return this;
        }

        /**
         * @param allowedMethods Required if CorsRule element is present. A list of HTTP methods that are allowed to be executed by the origin.
         * 
         * @return builder
         * 
         */
        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }

        /**
         * @param allowedOrigins Required if CorsRule element is present. A list of origin domains that will be allowed via CORS, or &#34;*&#34; to allow all domains
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(List<String> allowedOrigins) {
            $.allowedOrigins = allowedOrigins;
            return this;
        }

        /**
         * @param allowedOrigins Required if CorsRule element is present. A list of origin domains that will be allowed via CORS, or &#34;*&#34; to allow all domains
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }

        /**
         * @param exposedHeaders Required if CorsRule element is present. A list of response headers to expose to CORS clients.
         * 
         * @return builder
         * 
         */
        public Builder exposedHeaders(List<String> exposedHeaders) {
            $.exposedHeaders = exposedHeaders;
            return this;
        }

        /**
         * @param exposedHeaders Required if CorsRule element is present. A list of response headers to expose to CORS clients.
         * 
         * @return builder
         * 
         */
        public Builder exposedHeaders(String... exposedHeaders) {
            return exposedHeaders(List.of(exposedHeaders));
        }

        /**
         * @param maxAgeInSeconds Required if CorsRule element is present. The number of seconds that the client/browser should cache a preflight response.
         * 
         * @return builder
         * 
         */
        public Builder maxAgeInSeconds(Integer maxAgeInSeconds) {
            $.maxAgeInSeconds = maxAgeInSeconds;
            return this;
        }

        public CorsRuleResponse build() {
            $.allowedHeaders = Objects.requireNonNull($.allowedHeaders, "expected parameter 'allowedHeaders' to be non-null");
            $.allowedMethods = Objects.requireNonNull($.allowedMethods, "expected parameter 'allowedMethods' to be non-null");
            $.allowedOrigins = Objects.requireNonNull($.allowedOrigins, "expected parameter 'allowedOrigins' to be non-null");
            $.exposedHeaders = Objects.requireNonNull($.exposedHeaders, "expected parameter 'exposedHeaders' to be non-null");
            $.maxAgeInSeconds = Objects.requireNonNull($.maxAgeInSeconds, "expected parameter 'maxAgeInSeconds' to be non-null");
            return $;
        }
    }

}
