// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageImageResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse;
import java.lang.String;
import java.util.Objects;


/**
 * An item in the carousel.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse Empty = new GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse();

    /**
     * Optional. The body text of the card.
     * 
     */
    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * Optional. The image to display.
     * 
     */
    @InputImport(name="image", required=true)
      private final GoogleCloudDialogflowV2IntentMessageImageResponse image;

    public GoogleCloudDialogflowV2IntentMessageImageResponse getImage() {
        return this.image;
    }

    /**
     * Additional info about the option item.
     * 
     */
    @InputImport(name="info", required=true)
      private final GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse info;

    public GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse getInfo() {
        return this.info;
    }

    /**
     * Title of the carousel item.
     * 
     */
    @InputImport(name="title", required=true)
      private final String title;

    public String getTitle() {
        return this.title;
    }

    public GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse(
        String description,
        GoogleCloudDialogflowV2IntentMessageImageResponse image,
        GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse info,
        String title) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.info = Objects.requireNonNull(info, "expected parameter 'info' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse() {
        this.description = null;
        this.image = null;
        this.info = null;
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private GoogleCloudDialogflowV2IntentMessageImageResponse image;
        private GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse info;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.image = defaults.image;
    	      this.info = defaults.info;
    	      this.title = defaults.title;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder image(GoogleCloudDialogflowV2IntentMessageImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder info(GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse info) {
            this.info = Objects.requireNonNull(info);
            return this;
        }

        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse(description, image, info, title);
        }
    }
}
