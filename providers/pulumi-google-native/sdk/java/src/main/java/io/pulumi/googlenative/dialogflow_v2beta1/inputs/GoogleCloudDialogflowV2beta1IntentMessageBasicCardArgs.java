// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageImageArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The basic card message. Useful for displaying information.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs();

    /**
     * Optional. The collection of card buttons.
     * 
     */
    @InputImport(name="buttons")
    private final @Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>> buttons;

    public Input<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>> getButtons() {
        return this.buttons == null ? Input.empty() : this.buttons;
    }

    /**
     * Required, unless image is present. The body text of the card.
     * 
     */
    @InputImport(name="formattedText")
    private final @Nullable Input<String> formattedText;

    public Input<String> getFormattedText() {
        return this.formattedText == null ? Input.empty() : this.formattedText;
    }

    /**
     * Optional. The image for the card.
     * 
     */
    @InputImport(name="image")
    private final @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image;

    public Input<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> getImage() {
        return this.image == null ? Input.empty() : this.image;
    }

    /**
     * Optional. The subtitle of the card.
     * 
     */
    @InputImport(name="subtitle")
    private final @Nullable Input<String> subtitle;

    public Input<String> getSubtitle() {
        return this.subtitle == null ? Input.empty() : this.subtitle;
    }

    /**
     * Optional. The title of the card.
     * 
     */
    @InputImport(name="title")
    private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs(
        @Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>> buttons,
        @Nullable Input<String> formattedText,
        @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image,
        @Nullable Input<String> subtitle,
        @Nullable Input<String> title) {
        this.buttons = buttons;
        this.formattedText = formattedText;
        this.image = image;
        this.subtitle = subtitle;
        this.title = title;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs() {
        this.buttons = Input.empty();
        this.formattedText = Input.empty();
        this.image = Input.empty();
        this.subtitle = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>> buttons;
        private @Nullable Input<String> formattedText;
        private @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image;
        private @Nullable Input<String> subtitle;
        private @Nullable Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttons = defaults.buttons;
    	      this.formattedText = defaults.formattedText;
    	      this.image = defaults.image;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder setButtons(@Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>> buttons) {
            this.buttons = buttons;
            return this;
        }

        public Builder setButtons(@Nullable List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs> buttons) {
            this.buttons = Input.ofNullable(buttons);
            return this;
        }

        public Builder setFormattedText(@Nullable Input<String> formattedText) {
            this.formattedText = formattedText;
            return this;
        }

        public Builder setFormattedText(@Nullable String formattedText) {
            this.formattedText = Input.ofNullable(formattedText);
            return this;
        }

        public Builder setImage(@Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image) {
            this.image = image;
            return this;
        }

        public Builder setImage(@Nullable GoogleCloudDialogflowV2beta1IntentMessageImageArgs image) {
            this.image = Input.ofNullable(image);
            return this;
        }

        public Builder setSubtitle(@Nullable Input<String> subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public Builder setSubtitle(@Nullable String subtitle) {
            this.subtitle = Input.ofNullable(subtitle);
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs(buttons, formattedText, image, subtitle, title);
        }
    }
}
