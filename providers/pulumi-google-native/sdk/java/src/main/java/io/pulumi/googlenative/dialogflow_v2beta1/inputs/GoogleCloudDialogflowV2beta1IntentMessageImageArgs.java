// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The image response message.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageImageArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageImageArgs();

    /**
     * A text description of the image to be used for accessibility, e.g., screen readers. Required if image_uri is set for CarouselSelect.
     * 
     */
    @InputImport(name="accessibilityText")
    private final @Nullable Input<String> accessibilityText;

    public Input<String> getAccessibilityText() {
        return this.accessibilityText == null ? Input.empty() : this.accessibilityText;
    }

    /**
     * Optional. The public URI to an image file.
     * 
     */
    @InputImport(name="imageUri")
    private final @Nullable Input<String> imageUri;

    public Input<String> getImageUri() {
        return this.imageUri == null ? Input.empty() : this.imageUri;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageImageArgs(
        @Nullable Input<String> accessibilityText,
        @Nullable Input<String> imageUri) {
        this.accessibilityText = accessibilityText;
        this.imageUri = imageUri;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageImageArgs() {
        this.accessibilityText = Input.empty();
        this.imageUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessibilityText;
        private @Nullable Input<String> imageUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessibilityText = defaults.accessibilityText;
    	      this.imageUri = defaults.imageUri;
        }

        public Builder setAccessibilityText(@Nullable Input<String> accessibilityText) {
            this.accessibilityText = accessibilityText;
            return this;
        }

        public Builder setAccessibilityText(@Nullable String accessibilityText) {
            this.accessibilityText = Input.ofNullable(accessibilityText);
            return this;
        }

        public Builder setImageUri(@Nullable Input<String> imageUri) {
            this.imageUri = imageUri;
            return this;
        }

        public Builder setImageUri(@Nullable String imageUri) {
            this.imageUri = Input.ofNullable(imageUri);
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageImageArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageImageArgs(accessibilityText, imageUri);
        }
    }
}
