// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Rich Business Messaging (RBM) Card content
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse();

    /**
     * Optional. Description of the card (at most 2000 bytes). At least one of the title, description or media must be set.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    /**
     * @return Optional. Description of the card (at most 2000 bytes). At least one of the title, description or media must be set.
     * 
     */
    public String description() {
        return this.description;
    }

    /**
     * Optional. However at least one of the title, description or media must be set. Media (image, GIF or a video) to include in the card.
     * 
     */
    @Import(name="media", required=true)
    private GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse media;

    /**
     * @return Optional. However at least one of the title, description or media must be set. Media (image, GIF or a video) to include in the card.
     * 
     */
    public GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse media() {
        return this.media;
    }

    /**
     * Optional. List of suggestions to include in the card.
     * 
     */
    @Import(name="suggestions", required=true)
    private List<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse> suggestions;

    /**
     * @return Optional. List of suggestions to include in the card.
     * 
     */
    public List<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse> suggestions() {
        return this.suggestions;
    }

    /**
     * Optional. Title of the card (at most 200 bytes). At least one of the title, description or media must be set.
     * 
     */
    @Import(name="title", required=true)
    private String title;

    /**
     * @return Optional. Title of the card (at most 200 bytes). At least one of the title, description or media must be set.
     * 
     */
    public String title() {
        return this.title;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse() {}

    private GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse $) {
        this.description = $.description;
        this.media = $.media;
        this.suggestions = $.suggestions;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. Description of the card (at most 2000 bytes). At least one of the title, description or media must be set.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            $.description = description;
            return this;
        }

        /**
         * @param media Optional. However at least one of the title, description or media must be set. Media (image, GIF or a video) to include in the card.
         * 
         * @return builder
         * 
         */
        public Builder media(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse media) {
            $.media = media;
            return this;
        }

        /**
         * @param suggestions Optional. List of suggestions to include in the card.
         * 
         * @return builder
         * 
         */
        public Builder suggestions(List<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse> suggestions) {
            $.suggestions = suggestions;
            return this;
        }

        /**
         * @param suggestions Optional. List of suggestions to include in the card.
         * 
         * @return builder
         * 
         */
        public Builder suggestions(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse... suggestions) {
            return suggestions(List.of(suggestions));
        }

        /**
         * @param title Optional. Title of the card (at most 200 bytes). At least one of the title, description or media must be set.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            $.title = title;
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.media = Objects.requireNonNull($.media, "expected parameter 'media' to be non-null");
            $.suggestions = Objects.requireNonNull($.suggestions, "expected parameter 'suggestions' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            return $;
        }
    }

}
