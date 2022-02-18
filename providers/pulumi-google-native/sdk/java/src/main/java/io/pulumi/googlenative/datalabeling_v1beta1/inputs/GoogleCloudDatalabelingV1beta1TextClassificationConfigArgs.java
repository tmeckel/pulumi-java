// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1SentimentConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Config for text classification human labeling task.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs Empty = new GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs();

    /**
     * Optional. If allow_multi_label is true, contributors are able to choose multiple labels for one text segment.
     * 
     */
    @InputImport(name="allowMultiLabel")
    private final @Nullable Input<Boolean> allowMultiLabel;

    public Input<Boolean> getAllowMultiLabel() {
        return this.allowMultiLabel == null ? Input.empty() : this.allowMultiLabel;
    }

    /**
     * Annotation spec set resource name.
     * 
     */
    @InputImport(name="annotationSpecSet", required=true)
    private final Input<String> annotationSpecSet;

    public Input<String> getAnnotationSpecSet() {
        return this.annotationSpecSet;
    }

    /**
     * Optional. Configs for sentiment selection. We deprecate sentiment analysis in data labeling side as it is incompatible with uCAIP.
     * 
     */
    @InputImport(name="sentimentConfig")
    private final @Nullable Input<GoogleCloudDatalabelingV1beta1SentimentConfigArgs> sentimentConfig;

    public Input<GoogleCloudDatalabelingV1beta1SentimentConfigArgs> getSentimentConfig() {
        return this.sentimentConfig == null ? Input.empty() : this.sentimentConfig;
    }

    public GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs(
        @Nullable Input<Boolean> allowMultiLabel,
        Input<String> annotationSpecSet,
        @Nullable Input<GoogleCloudDatalabelingV1beta1SentimentConfigArgs> sentimentConfig) {
        this.allowMultiLabel = allowMultiLabel;
        this.annotationSpecSet = Objects.requireNonNull(annotationSpecSet, "expected parameter 'annotationSpecSet' to be non-null");
        this.sentimentConfig = sentimentConfig;
    }

    private GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs() {
        this.allowMultiLabel = Input.empty();
        this.annotationSpecSet = Input.empty();
        this.sentimentConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowMultiLabel;
        private Input<String> annotationSpecSet;
        private @Nullable Input<GoogleCloudDatalabelingV1beta1SentimentConfigArgs> sentimentConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowMultiLabel = defaults.allowMultiLabel;
    	      this.annotationSpecSet = defaults.annotationSpecSet;
    	      this.sentimentConfig = defaults.sentimentConfig;
        }

        public Builder setAllowMultiLabel(@Nullable Input<Boolean> allowMultiLabel) {
            this.allowMultiLabel = allowMultiLabel;
            return this;
        }

        public Builder setAllowMultiLabel(@Nullable Boolean allowMultiLabel) {
            this.allowMultiLabel = Input.ofNullable(allowMultiLabel);
            return this;
        }

        public Builder setAnnotationSpecSet(Input<String> annotationSpecSet) {
            this.annotationSpecSet = Objects.requireNonNull(annotationSpecSet);
            return this;
        }

        public Builder setAnnotationSpecSet(String annotationSpecSet) {
            this.annotationSpecSet = Input.of(Objects.requireNonNull(annotationSpecSet));
            return this;
        }

        public Builder setSentimentConfig(@Nullable Input<GoogleCloudDatalabelingV1beta1SentimentConfigArgs> sentimentConfig) {
            this.sentimentConfig = sentimentConfig;
            return this;
        }

        public Builder setSentimentConfig(@Nullable GoogleCloudDatalabelingV1beta1SentimentConfigArgs sentimentConfig) {
            this.sentimentConfig = Input.ofNullable(sentimentConfig);
            return this;
        }

        public GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs build() {
            return new GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs(allowMultiLabel, annotationSpecSet, sentimentConfig);
        }
    }
}
