// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Standalone Rich Business Messaging (RBM) rich card. Rich cards allow you to respond to users with more vivid content, e.g. with media and suggestions. You can group multiple rich cards into one using RbmCarouselCard but carousel cards will give you less control over the card layout.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse();

    /**
     * Card content.
     * 
     */
    @InputImport(name="cardContent", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse cardContent;

    public GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse getCardContent() {
        return this.cardContent;
    }

    /**
     * Orientation of the card.
     * 
     */
    @InputImport(name="cardOrientation", required=true)
      private final String cardOrientation;

    public String getCardOrientation() {
        return this.cardOrientation;
    }

    /**
     * Required if orientation is horizontal. Image preview alignment for standalone cards with horizontal layout.
     * 
     */
    @InputImport(name="thumbnailImageAlignment", required=true)
      private final String thumbnailImageAlignment;

    public String getThumbnailImageAlignment() {
        return this.thumbnailImageAlignment;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse(
        GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse cardContent,
        String cardOrientation,
        String thumbnailImageAlignment) {
        this.cardContent = Objects.requireNonNull(cardContent, "expected parameter 'cardContent' to be non-null");
        this.cardOrientation = Objects.requireNonNull(cardOrientation, "expected parameter 'cardOrientation' to be non-null");
        this.thumbnailImageAlignment = Objects.requireNonNull(thumbnailImageAlignment, "expected parameter 'thumbnailImageAlignment' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse() {
        this.cardContent = null;
        this.cardOrientation = null;
        this.thumbnailImageAlignment = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse cardContent;
        private String cardOrientation;
        private String thumbnailImageAlignment;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cardContent = defaults.cardContent;
    	      this.cardOrientation = defaults.cardOrientation;
    	      this.thumbnailImageAlignment = defaults.thumbnailImageAlignment;
        }

        public Builder cardContent(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse cardContent) {
            this.cardContent = Objects.requireNonNull(cardContent);
            return this;
        }

        public Builder cardOrientation(String cardOrientation) {
            this.cardOrientation = Objects.requireNonNull(cardOrientation);
            return this;
        }

        public Builder thumbnailImageAlignment(String thumbnailImageAlignment) {
            this.thumbnailImageAlignment = Objects.requireNonNull(thumbnailImageAlignment);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse(cardContent, cardOrientation, thumbnailImageAlignment);
        }
    }
}
