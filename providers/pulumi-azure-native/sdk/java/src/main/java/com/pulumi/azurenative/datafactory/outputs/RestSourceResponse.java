// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RestSourceResponse {
    /**
     * @return Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    private final @Nullable Object additionalColumns;
    /**
     * @return The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object additionalHeaders;
    /**
     * @return If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * @return The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object httpRequestTimeout;
    /**
     * @return The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * @return The pagination rules to compose next page requests. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object paginationRules;
    /**
     * @return The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object requestBody;
    /**
     * @return The time to await before sending next page request.
     * 
     */
    private final @Nullable Object requestInterval;
    /**
     * @return The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object requestMethod;
    /**
     * @return Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object sourceRetryCount;
    /**
     * @return Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object sourceRetryWait;
    /**
     * @return Copy source type.
     * Expected value is &#39;RestSource&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private RestSourceResponse(
        @CustomType.Parameter("additionalColumns") @Nullable Object additionalColumns,
        @CustomType.Parameter("additionalHeaders") @Nullable Object additionalHeaders,
        @CustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @CustomType.Parameter("httpRequestTimeout") @Nullable Object httpRequestTimeout,
        @CustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @CustomType.Parameter("paginationRules") @Nullable Object paginationRules,
        @CustomType.Parameter("requestBody") @Nullable Object requestBody,
        @CustomType.Parameter("requestInterval") @Nullable Object requestInterval,
        @CustomType.Parameter("requestMethod") @Nullable Object requestMethod,
        @CustomType.Parameter("sourceRetryCount") @Nullable Object sourceRetryCount,
        @CustomType.Parameter("sourceRetryWait") @Nullable Object sourceRetryWait,
        @CustomType.Parameter("type") String type) {
        this.additionalColumns = additionalColumns;
        this.additionalHeaders = additionalHeaders;
        this.disableMetricsCollection = disableMetricsCollection;
        this.httpRequestTimeout = httpRequestTimeout;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.paginationRules = paginationRules;
        this.requestBody = requestBody;
        this.requestInterval = requestInterval;
        this.requestMethod = requestMethod;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = type;
    }

    /**
     * @return Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    public Optional<Object> additionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }
    /**
     * @return The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> additionalHeaders() {
        return Optional.ofNullable(this.additionalHeaders);
    }
    /**
     * @return If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * @return The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Object> httpRequestTimeout() {
        return Optional.ofNullable(this.httpRequestTimeout);
    }
    /**
     * @return The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * @return The pagination rules to compose next page requests. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> paginationRules() {
        return Optional.ofNullable(this.paginationRules);
    }
    /**
     * @return The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> requestBody() {
        return Optional.ofNullable(this.requestBody);
    }
    /**
     * @return The time to await before sending next page request.
     * 
     */
    public Optional<Object> requestInterval() {
        return Optional.ofNullable(this.requestInterval);
    }
    /**
     * @return The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> requestMethod() {
        return Optional.ofNullable(this.requestMethod);
    }
    /**
     * @return Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> sourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }
    /**
     * @return Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Object> sourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }
    /**
     * @return Copy source type.
     * Expected value is &#39;RestSource&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object additionalHeaders;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object httpRequestTimeout;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object paginationRules;
        private @Nullable Object requestBody;
        private @Nullable Object requestInterval;
        private @Nullable Object requestMethod;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RestSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.additionalHeaders = defaults.additionalHeaders;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.httpRequestTimeout = defaults.httpRequestTimeout;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.paginationRules = defaults.paginationRules;
    	      this.requestBody = defaults.requestBody;
    	      this.requestInterval = defaults.requestInterval;
    	      this.requestMethod = defaults.requestMethod;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder additionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }
        public Builder additionalHeaders(@Nullable Object additionalHeaders) {
            this.additionalHeaders = additionalHeaders;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder httpRequestTimeout(@Nullable Object httpRequestTimeout) {
            this.httpRequestTimeout = httpRequestTimeout;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder paginationRules(@Nullable Object paginationRules) {
            this.paginationRules = paginationRules;
            return this;
        }
        public Builder requestBody(@Nullable Object requestBody) {
            this.requestBody = requestBody;
            return this;
        }
        public Builder requestInterval(@Nullable Object requestInterval) {
            this.requestInterval = requestInterval;
            return this;
        }
        public Builder requestMethod(@Nullable Object requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }
        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public RestSourceResponse build() {
            return new RestSourceResponse(additionalColumns, additionalHeaders, disableMetricsCollection, httpRequestTimeout, maxConcurrentConnections, paginationRules, requestBody, requestInterval, requestMethod, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
