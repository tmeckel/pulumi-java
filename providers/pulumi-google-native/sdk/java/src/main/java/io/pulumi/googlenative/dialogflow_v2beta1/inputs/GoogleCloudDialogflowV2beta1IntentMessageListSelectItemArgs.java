// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageImageArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An item in the list.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs();

    /**
     * Optional. The main text describing the item.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Optional. The image to display.
     * 
     */
    @InputImport(name="image")
    private final @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image;

    public Input<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> getImage() {
        return this.image == null ? Input.empty() : this.image;
    }

    /**
     * Additional information about this option.
     * 
     */
    @InputImport(name="info", required=true)
    private final Input<GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs> info;

    public Input<GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs> getInfo() {
        return this.info;
    }

    /**
     * The title of the list item.
     * 
     */
    @InputImport(name="title", required=true)
    private final Input<String> title;

    public Input<String> getTitle() {
        return this.title;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs(
        @Nullable Input<String> description,
        @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image,
        Input<GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs> info,
        Input<String> title) {
        this.description = description;
        this.image = image;
        this.info = Objects.requireNonNull(info, "expected parameter 'info' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs() {
        this.description = Input.empty();
        this.image = Input.empty();
        this.info = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image;
        private Input<GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs> info;
        private Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.image = defaults.image;
    	      this.info = defaults.info;
    	      this.title = defaults.title;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setInfo(Input<GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs> info) {
            this.info = Objects.requireNonNull(info);
            return this;
        }

        public Builder setInfo(GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs info) {
            this.info = Input.of(Objects.requireNonNull(info));
            return this;
        }

        public Builder setTitle(Input<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Input.of(Objects.requireNonNull(title));
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs(description, image, info, title);
        }
    }
}
