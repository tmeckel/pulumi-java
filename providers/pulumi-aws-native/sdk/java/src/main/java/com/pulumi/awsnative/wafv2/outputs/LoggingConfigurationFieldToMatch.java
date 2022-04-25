// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.awsnative.wafv2.outputs.LoggingConfigurationFieldToMatchJsonBodyProperties;
import com.pulumi.awsnative.wafv2.outputs.LoggingConfigurationFieldToMatchSingleHeaderProperties;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoggingConfigurationFieldToMatch {
    /**
     * @return Inspect the request body as JSON. The request body immediately follows the request headers. This is the part of a request that contains any additional data that you want to send to your web server as the HTTP request body, such as data from a form.
     * 
     */
    private final @Nullable LoggingConfigurationFieldToMatchJsonBodyProperties jsonBody;
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable Object method;
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a ? character, if any.
     * 
     */
    private final @Nullable Object queryString;
    /**
     * @return Inspect a single header. Provide the name of the header to inspect, for example, User-Agent or Referer. This setting isn&#39;t case sensitive.
     * 
     */
    private final @Nullable LoggingConfigurationFieldToMatchSingleHeaderProperties singleHeader;
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, /images/daily-ad.jpg.
     * 
     */
    private final @Nullable Object uriPath;

    @CustomType.Constructor
    private LoggingConfigurationFieldToMatch(
        @CustomType.Parameter("jsonBody") @Nullable LoggingConfigurationFieldToMatchJsonBodyProperties jsonBody,
        @CustomType.Parameter("method") @Nullable Object method,
        @CustomType.Parameter("queryString") @Nullable Object queryString,
        @CustomType.Parameter("singleHeader") @Nullable LoggingConfigurationFieldToMatchSingleHeaderProperties singleHeader,
        @CustomType.Parameter("uriPath") @Nullable Object uriPath) {
        this.jsonBody = jsonBody;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.uriPath = uriPath;
    }

    /**
     * @return Inspect the request body as JSON. The request body immediately follows the request headers. This is the part of a request that contains any additional data that you want to send to your web server as the HTTP request body, such as data from a form.
     * 
     */
    public Optional<LoggingConfigurationFieldToMatchJsonBodyProperties> jsonBody() {
        return Optional.ofNullable(this.jsonBody);
    }
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<Object> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a ? character, if any.
     * 
     */
    public Optional<Object> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Inspect a single header. Provide the name of the header to inspect, for example, User-Agent or Referer. This setting isn&#39;t case sensitive.
     * 
     */
    public Optional<LoggingConfigurationFieldToMatchSingleHeaderProperties> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, /images/daily-ad.jpg.
     * 
     */
    public Optional<Object> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LoggingConfigurationFieldToMatchJsonBodyProperties jsonBody;
        private @Nullable Object method;
        private @Nullable Object queryString;
        private @Nullable LoggingConfigurationFieldToMatchSingleHeaderProperties singleHeader;
        private @Nullable Object uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonBody = defaults.jsonBody;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder jsonBody(@Nullable LoggingConfigurationFieldToMatchJsonBodyProperties jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }
        public Builder method(@Nullable Object method) {
            this.method = method;
            return this;
        }
        public Builder queryString(@Nullable Object queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder singleHeader(@Nullable LoggingConfigurationFieldToMatchSingleHeaderProperties singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder uriPath(@Nullable Object uriPath) {
            this.uriPath = uriPath;
            return this;
        }        public LoggingConfigurationFieldToMatch build() {
            return new LoggingConfigurationFieldToMatch(jsonBody, method, queryString, singleHeader, uriPath);
        }
    }
}
