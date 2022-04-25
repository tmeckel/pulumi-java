// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Agent Assist Smart Compose suggestion data.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse Empty = new GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse();

    /**
     * The system&#39;s confidence score that this suggestion is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    @Import(name="confidenceScore", required=true)
    private Double confidenceScore;

    /**
     * @return The system&#39;s confidence score that this suggestion is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    public Double confidenceScore() {
        return this.confidenceScore;
    }

    /**
     * Map that contains metadata about the Smart Compose suggestion and the document from which it originates.
     * 
     */
    @Import(name="metadata", required=true)
    private Map<String,String> metadata;

    /**
     * @return Map that contains metadata about the Smart Compose suggestion and the document from which it originates.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }

    /**
     * Name of the query record. Format: projects/{project}/locations/{location}/queryRecords/{query_record}
     * 
     */
    @Import(name="queryRecord", required=true)
    private String queryRecord;

    /**
     * @return Name of the query record. Format: projects/{project}/locations/{location}/queryRecords/{query_record}
     * 
     */
    public String queryRecord() {
        return this.queryRecord;
    }

    /**
     * The content of the suggestion.
     * 
     */
    @Import(name="suggestion", required=true)
    private String suggestion;

    /**
     * @return The content of the suggestion.
     * 
     */
    public String suggestion() {
        return this.suggestion;
    }

    private GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse() {}

    private GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse(GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse $) {
        this.confidenceScore = $.confidenceScore;
        this.metadata = $.metadata;
        this.queryRecord = $.queryRecord;
        this.suggestion = $.suggestion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse $;

        public Builder() {
            $ = new GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse();
        }

        public Builder(GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse defaults) {
            $ = new GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param confidenceScore The system&#39;s confidence score that this suggestion is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
         * 
         * @return builder
         * 
         */
        public Builder confidenceScore(Double confidenceScore) {
            $.confidenceScore = confidenceScore;
            return this;
        }

        /**
         * @param metadata Map that contains metadata about the Smart Compose suggestion and the document from which it originates.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param queryRecord Name of the query record. Format: projects/{project}/locations/{location}/queryRecords/{query_record}
         * 
         * @return builder
         * 
         */
        public Builder queryRecord(String queryRecord) {
            $.queryRecord = queryRecord;
            return this;
        }

        /**
         * @param suggestion The content of the suggestion.
         * 
         * @return builder
         * 
         */
        public Builder suggestion(String suggestion) {
            $.suggestion = suggestion;
            return this;
        }

        public GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse build() {
            $.confidenceScore = Objects.requireNonNull($.confidenceScore, "expected parameter 'confidenceScore' to be non-null");
            $.metadata = Objects.requireNonNull($.metadata, "expected parameter 'metadata' to be non-null");
            $.queryRecord = Objects.requireNonNull($.queryRecord, "expected parameter 'queryRecord' to be non-null");
            $.suggestion = Objects.requireNonNull($.suggestion, "expected parameter 'suggestion' to be non-null");
            return $;
        }
    }

}
