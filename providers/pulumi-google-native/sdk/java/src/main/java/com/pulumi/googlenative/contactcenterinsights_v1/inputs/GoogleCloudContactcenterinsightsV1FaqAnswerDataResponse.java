// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Agent Assist frequently-asked-question answer data.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse Empty = new GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse();

    /**
     * The piece of text from the `source` knowledge base document.
     * 
     */
    @Import(name="answer", required=true)
    private String answer;

    /**
     * @return The piece of text from the `source` knowledge base document.
     * 
     */
    public String answer() {
        return this.answer;
    }

    /**
     * The system&#39;s confidence score that this answer is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    @Import(name="confidenceScore", required=true)
    private Double confidenceScore;

    /**
     * @return The system&#39;s confidence score that this answer is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    public Double confidenceScore() {
        return this.confidenceScore;
    }

    /**
     * Map that contains metadata about the FAQ answer and the document that it originates from.
     * 
     */
    @Import(name="metadata", required=true)
    private Map<String,String> metadata;

    /**
     * @return Map that contains metadata about the FAQ answer and the document that it originates from.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }

    /**
     * Name of the query record. Format: projects/{project}/locations/{location}/queryRecords/{query_record}.
     * 
     */
    @Import(name="queryRecord", required=true)
    private String queryRecord;

    /**
     * @return Name of the query record. Format: projects/{project}/locations/{location}/queryRecords/{query_record}.
     * 
     */
    public String queryRecord() {
        return this.queryRecord;
    }

    /**
     * The corresponding FAQ question.
     * 
     */
    @Import(name="question", required=true)
    private String question;

    /**
     * @return The corresponding FAQ question.
     * 
     */
    public String question() {
        return this.question;
    }

    /**
     * The knowledge document that this answer was extracted from. Format: projects/{project}/knowledgeBases/{knowledge_base}/documents/{document}.
     * 
     */
    @Import(name="source", required=true)
    private String source;

    /**
     * @return The knowledge document that this answer was extracted from. Format: projects/{project}/knowledgeBases/{knowledge_base}/documents/{document}.
     * 
     */
    public String source() {
        return this.source;
    }

    private GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse() {}

    private GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse(GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse $) {
        this.answer = $.answer;
        this.confidenceScore = $.confidenceScore;
        this.metadata = $.metadata;
        this.queryRecord = $.queryRecord;
        this.question = $.question;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse $;

        public Builder() {
            $ = new GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse();
        }

        public Builder(GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse defaults) {
            $ = new GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param answer The piece of text from the `source` knowledge base document.
         * 
         * @return builder
         * 
         */
        public Builder answer(String answer) {
            $.answer = answer;
            return this;
        }

        /**
         * @param confidenceScore The system&#39;s confidence score that this answer is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
         * 
         * @return builder
         * 
         */
        public Builder confidenceScore(Double confidenceScore) {
            $.confidenceScore = confidenceScore;
            return this;
        }

        /**
         * @param metadata Map that contains metadata about the FAQ answer and the document that it originates from.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param queryRecord Name of the query record. Format: projects/{project}/locations/{location}/queryRecords/{query_record}.
         * 
         * @return builder
         * 
         */
        public Builder queryRecord(String queryRecord) {
            $.queryRecord = queryRecord;
            return this;
        }

        /**
         * @param question The corresponding FAQ question.
         * 
         * @return builder
         * 
         */
        public Builder question(String question) {
            $.question = question;
            return this;
        }

        /**
         * @param source The knowledge document that this answer was extracted from. Format: projects/{project}/knowledgeBases/{knowledge_base}/documents/{document}.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            $.source = source;
            return this;
        }

        public GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse build() {
            $.answer = Objects.requireNonNull($.answer, "expected parameter 'answer' to be non-null");
            $.confidenceScore = Objects.requireNonNull($.confidenceScore, "expected parameter 'confidenceScore' to be non-null");
            $.metadata = Objects.requireNonNull($.metadata, "expected parameter 'metadata' to be non-null");
            $.queryRecord = Objects.requireNonNull($.queryRecord, "expected parameter 'queryRecord' to be non-null");
            $.question = Objects.requireNonNull($.question, "expected parameter 'question' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}
