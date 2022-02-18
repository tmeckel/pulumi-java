// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.enums.GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardImageDisplayOptions;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Browse Carousel Card for Actions on Google. https://developers.google.com/actions/assistant/responses#browsing_carousel
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardArgs Empty = new GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardArgs();

    /**
     * Optional. Settings for displaying the image. Applies to every image in items.
     * 
     */
    @InputImport(name="imageDisplayOptions")
    private final @Nullable Input<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardImageDisplayOptions> imageDisplayOptions;

    public Input<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardImageDisplayOptions> getImageDisplayOptions() {
        return this.imageDisplayOptions == null ? Input.empty() : this.imageDisplayOptions;
    }

    /**
     * List of items in the Browse Carousel Card. Minimum of two items, maximum of ten.
     * 
     */
    @InputImport(name="items", required=true)
    private final Input<List<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs>> items;

    public Input<List<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs>> getItems() {
        return this.items;
    }

    public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardArgs(
        @Nullable Input<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardImageDisplayOptions> imageDisplayOptions,
        Input<List<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs>> items) {
        this.imageDisplayOptions = imageDisplayOptions;
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardArgs() {
        this.imageDisplayOptions = Input.empty();
        this.items = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardImageDisplayOptions> imageDisplayOptions;
        private Input<List<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageDisplayOptions = defaults.imageDisplayOptions;
    	      this.items = defaults.items;
        }

        public Builder setImageDisplayOptions(@Nullable Input<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardImageDisplayOptions> imageDisplayOptions) {
            this.imageDisplayOptions = imageDisplayOptions;
            return this;
        }

        public Builder setImageDisplayOptions(@Nullable GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardImageDisplayOptions imageDisplayOptions) {
            this.imageDisplayOptions = Input.ofNullable(imageDisplayOptions);
            return this;
        }

        public Builder setItems(Input<List<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder setItems(List<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs> items) {
            this.items = Input.of(Objects.requireNonNull(items));
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardArgs(imageDisplayOptions, items);
        }
    }
}
