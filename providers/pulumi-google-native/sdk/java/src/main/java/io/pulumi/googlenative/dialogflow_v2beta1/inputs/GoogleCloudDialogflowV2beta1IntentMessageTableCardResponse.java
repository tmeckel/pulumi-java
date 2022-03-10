// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageImageResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Table card for Actions on Google.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse();

    /**
     * Optional. List of buttons for the card.
     * 
     */
    @InputImport(name="buttons", required=true)
      private final List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons;

    public List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> getButtons() {
        return this.buttons;
    }

    /**
     * Optional. Display properties for the columns in this table.
     * 
     */
    @InputImport(name="columnProperties", required=true)
      private final List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse> columnProperties;

    public List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse> getColumnProperties() {
        return this.columnProperties;
    }

    /**
     * Optional. Image which should be displayed on the card.
     * 
     */
    @InputImport(name="image", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;

    public GoogleCloudDialogflowV2beta1IntentMessageImageResponse getImage() {
        return this.image;
    }

    /**
     * Optional. Rows in this table of data.
     * 
     */
    @InputImport(name="rows", required=true)
      private final List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse> rows;

    public List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse> getRows() {
        return this.rows;
    }

    /**
     * Optional. Subtitle to the title.
     * 
     */
    @InputImport(name="subtitle", required=true)
      private final String subtitle;

    public String getSubtitle() {
        return this.subtitle;
    }

    /**
     * Title of the card.
     * 
     */
    @InputImport(name="title", required=true)
      private final String title;

    public String getTitle() {
        return this.title;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse(
        List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons,
        List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse> columnProperties,
        GoogleCloudDialogflowV2beta1IntentMessageImageResponse image,
        List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse> rows,
        String subtitle,
        String title) {
        this.buttons = Objects.requireNonNull(buttons, "expected parameter 'buttons' to be non-null");
        this.columnProperties = Objects.requireNonNull(columnProperties, "expected parameter 'columnProperties' to be non-null");
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.rows = Objects.requireNonNull(rows, "expected parameter 'rows' to be non-null");
        this.subtitle = Objects.requireNonNull(subtitle, "expected parameter 'subtitle' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse() {
        this.buttons = List.of();
        this.columnProperties = List.of();
        this.image = null;
        this.rows = List.of();
        this.subtitle = null;
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons;
        private List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse> columnProperties;
        private GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;
        private List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse> rows;
        private String subtitle;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttons = defaults.buttons;
    	      this.columnProperties = defaults.columnProperties;
    	      this.image = defaults.image;
    	      this.rows = defaults.rows;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder buttons(List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons) {
            this.buttons = Objects.requireNonNull(buttons);
            return this;
        }

        public Builder columnProperties(List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse> columnProperties) {
            this.columnProperties = Objects.requireNonNull(columnProperties);
            return this;
        }

        public Builder image(GoogleCloudDialogflowV2beta1IntentMessageImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder rows(List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse> rows) {
            this.rows = Objects.requireNonNull(rows);
            return this;
        }

        public Builder subtitle(String subtitle) {
            this.subtitle = Objects.requireNonNull(subtitle);
            return this;
        }

        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse(buttons, columnProperties, image, rows, subtitle, title);
        }
    }
}
