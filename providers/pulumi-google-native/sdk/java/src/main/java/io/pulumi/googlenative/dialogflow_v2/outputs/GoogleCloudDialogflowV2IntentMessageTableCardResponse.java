// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageImageResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageTableCardRowResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2IntentMessageTableCardResponse {
    /**
     * Optional. List of buttons for the card.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse> buttons;
    /**
     * Optional. Display properties for the columns in this table.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse> columnProperties;
    /**
     * Optional. Image which should be displayed on the card.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageImageResponse image;
    /**
     * Optional. Rows in this table of data.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentMessageTableCardRowResponse> rows;
    /**
     * Optional. Subtitle to the title.
     * 
     */
    private final String subtitle;
    /**
     * Title of the card.
     * 
     */
    private final String title;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageTableCardResponse(
        @OutputCustomType.Parameter("buttons") List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse> buttons,
        @OutputCustomType.Parameter("columnProperties") List<GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse> columnProperties,
        @OutputCustomType.Parameter("image") GoogleCloudDialogflowV2IntentMessageImageResponse image,
        @OutputCustomType.Parameter("rows") List<GoogleCloudDialogflowV2IntentMessageTableCardRowResponse> rows,
        @OutputCustomType.Parameter("subtitle") String subtitle,
        @OutputCustomType.Parameter("title") String title) {
        this.buttons = buttons;
        this.columnProperties = columnProperties;
        this.image = image;
        this.rows = rows;
        this.subtitle = subtitle;
        this.title = title;
    }

    /**
     * Optional. List of buttons for the card.
     * 
    */
    public List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse> getButtons() {
        return this.buttons;
    }
    /**
     * Optional. Display properties for the columns in this table.
     * 
    */
    public List<GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse> getColumnProperties() {
        return this.columnProperties;
    }
    /**
     * Optional. Image which should be displayed on the card.
     * 
    */
    public GoogleCloudDialogflowV2IntentMessageImageResponse getImage() {
        return this.image;
    }
    /**
     * Optional. Rows in this table of data.
     * 
    */
    public List<GoogleCloudDialogflowV2IntentMessageTableCardRowResponse> getRows() {
        return this.rows;
    }
    /**
     * Optional. Subtitle to the title.
     * 
    */
    public String getSubtitle() {
        return this.subtitle;
    }
    /**
     * Title of the card.
     * 
    */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageTableCardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse> buttons;
        private List<GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse> columnProperties;
        private GoogleCloudDialogflowV2IntentMessageImageResponse image;
        private List<GoogleCloudDialogflowV2IntentMessageTableCardRowResponse> rows;
        private String subtitle;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageTableCardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttons = defaults.buttons;
    	      this.columnProperties = defaults.columnProperties;
    	      this.image = defaults.image;
    	      this.rows = defaults.rows;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder buttons(List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse> buttons) {
            this.buttons = Objects.requireNonNull(buttons);
            return this;
        }

        public Builder columnProperties(List<GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse> columnProperties) {
            this.columnProperties = Objects.requireNonNull(columnProperties);
            return this;
        }

        public Builder image(GoogleCloudDialogflowV2IntentMessageImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder rows(List<GoogleCloudDialogflowV2IntentMessageTableCardRowResponse> rows) {
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
        public GoogleCloudDialogflowV2IntentMessageTableCardResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageTableCardResponse(buttons, columnProperties, image, rows, subtitle, title);
        }
    }
}
