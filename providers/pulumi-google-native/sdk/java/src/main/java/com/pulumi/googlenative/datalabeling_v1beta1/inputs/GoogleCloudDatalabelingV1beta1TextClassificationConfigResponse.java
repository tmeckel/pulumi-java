// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1SentimentConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Config for text classification human labeling task.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse Empty = new GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse();

    /**
     * Optional. If allow_multi_label is true, contributors are able to choose multiple labels for one text segment.
     * 
     */
    @Import(name="allowMultiLabel", required=true)
    private Boolean allowMultiLabel;

    /**
     * @return Optional. If allow_multi_label is true, contributors are able to choose multiple labels for one text segment.
     * 
     */
    public Boolean allowMultiLabel() {
        return this.allowMultiLabel;
    }

    /**
     * Annotation spec set resource name.
     * 
     */
    @Import(name="annotationSpecSet", required=true)
    private String annotationSpecSet;

    /**
     * @return Annotation spec set resource name.
     * 
     */
    public String annotationSpecSet() {
        return this.annotationSpecSet;
    }

    /**
     * Optional. Configs for sentiment selection. We deprecate sentiment analysis in data labeling side as it is incompatible with uCAIP.
     * 
     */
    @Import(name="sentimentConfig", required=true)
    private GoogleCloudDatalabelingV1beta1SentimentConfigResponse sentimentConfig;

    /**
     * @return Optional. Configs for sentiment selection. We deprecate sentiment analysis in data labeling side as it is incompatible with uCAIP.
     * 
     */
    public GoogleCloudDatalabelingV1beta1SentimentConfigResponse sentimentConfig() {
        return this.sentimentConfig;
    }

    private GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse() {}

    private GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse(GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse $) {
        this.allowMultiLabel = $.allowMultiLabel;
        this.annotationSpecSet = $.annotationSpecSet;
        this.sentimentConfig = $.sentimentConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse $;

        public Builder() {
            $ = new GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse();
        }

        public Builder(GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse defaults) {
            $ = new GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowMultiLabel Optional. If allow_multi_label is true, contributors are able to choose multiple labels for one text segment.
         * 
         * @return builder
         * 
         */
        public Builder allowMultiLabel(Boolean allowMultiLabel) {
            $.allowMultiLabel = allowMultiLabel;
            return this;
        }

        /**
         * @param annotationSpecSet Annotation spec set resource name.
         * 
         * @return builder
         * 
         */
        public Builder annotationSpecSet(String annotationSpecSet) {
            $.annotationSpecSet = annotationSpecSet;
            return this;
        }

        /**
         * @param sentimentConfig Optional. Configs for sentiment selection. We deprecate sentiment analysis in data labeling side as it is incompatible with uCAIP.
         * 
         * @return builder
         * 
         */
        public Builder sentimentConfig(GoogleCloudDatalabelingV1beta1SentimentConfigResponse sentimentConfig) {
            $.sentimentConfig = sentimentConfig;
            return this;
        }

        public GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse build() {
            $.allowMultiLabel = Objects.requireNonNull($.allowMultiLabel, "expected parameter 'allowMultiLabel' to be non-null");
            $.annotationSpecSet = Objects.requireNonNull($.annotationSpecSet, "expected parameter 'annotationSpecSet' to be non-null");
            $.sentimentConfig = Objects.requireNonNull($.sentimentConfig, "expected parameter 'sentimentConfig' to be non-null");
            return $;
        }
    }

}
