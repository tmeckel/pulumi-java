// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Config for setting up sentiments.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1SentimentConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatalabelingV1beta1SentimentConfigResponse Empty = new GoogleCloudDatalabelingV1beta1SentimentConfigResponse();

    /**
     * If set to true, contributors will have the option to select sentiment of the label they selected, to mark it as negative or positive label. Default is false.
     * 
     */
    @InputImport(name="enableLabelSentimentSelection", required=true)
    private final Boolean enableLabelSentimentSelection;

    public Boolean getEnableLabelSentimentSelection() {
        return this.enableLabelSentimentSelection;
    }

    public GoogleCloudDatalabelingV1beta1SentimentConfigResponse(Boolean enableLabelSentimentSelection) {
        this.enableLabelSentimentSelection = Objects.requireNonNull(enableLabelSentimentSelection, "expected parameter 'enableLabelSentimentSelection' to be non-null");
    }

    private GoogleCloudDatalabelingV1beta1SentimentConfigResponse() {
        this.enableLabelSentimentSelection = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1SentimentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableLabelSentimentSelection;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1SentimentConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableLabelSentimentSelection = defaults.enableLabelSentimentSelection;
        }

        public Builder setEnableLabelSentimentSelection(Boolean enableLabelSentimentSelection) {
            this.enableLabelSentimentSelection = Objects.requireNonNull(enableLabelSentimentSelection);
            return this;
        }

        public GoogleCloudDatalabelingV1beta1SentimentConfigResponse build() {
            return new GoogleCloudDatalabelingV1beta1SentimentConfigResponse(enableLabelSentimentSelection);
        }
    }
}
