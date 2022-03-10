// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageBasicCardResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageCardResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageImageResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageListSelectResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageMediaContentResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageSuggestionsResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageTableCardResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageTextResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * A rich response message. Corresponds to the intent `Response` field in the Dialogflow console. For more information, see [Rich response messages](https://cloud.google.com/dialogflow/docs/intents-rich-messages).
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentMessageResponse Empty = new GoogleCloudDialogflowV2IntentMessageResponse();

    /**
     * The basic card response for Actions on Google.
     * 
     */
    @InputImport(name="basicCard", required=true)
      private final GoogleCloudDialogflowV2IntentMessageBasicCardResponse basicCard;

    public GoogleCloudDialogflowV2IntentMessageBasicCardResponse getBasicCard() {
        return this.basicCard;
    }

    /**
     * Browse carousel card for Actions on Google.
     * 
     */
    @InputImport(name="browseCarouselCard", required=true)
      private final GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse browseCarouselCard;

    public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse getBrowseCarouselCard() {
        return this.browseCarouselCard;
    }

    /**
     * The card response.
     * 
     */
    @InputImport(name="card", required=true)
      private final GoogleCloudDialogflowV2IntentMessageCardResponse card;

    public GoogleCloudDialogflowV2IntentMessageCardResponse getCard() {
        return this.card;
    }

    /**
     * The carousel card response for Actions on Google.
     * 
     */
    @InputImport(name="carouselSelect", required=true)
      private final GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse carouselSelect;

    public GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse getCarouselSelect() {
        return this.carouselSelect;
    }

    /**
     * The image response.
     * 
     */
    @InputImport(name="image", required=true)
      private final GoogleCloudDialogflowV2IntentMessageImageResponse image;

    public GoogleCloudDialogflowV2IntentMessageImageResponse getImage() {
        return this.image;
    }

    /**
     * The link out suggestion chip for Actions on Google.
     * 
     */
    @InputImport(name="linkOutSuggestion", required=true)
      private final GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse linkOutSuggestion;

    public GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse getLinkOutSuggestion() {
        return this.linkOutSuggestion;
    }

    /**
     * The list card response for Actions on Google.
     * 
     */
    @InputImport(name="listSelect", required=true)
      private final GoogleCloudDialogflowV2IntentMessageListSelectResponse listSelect;

    public GoogleCloudDialogflowV2IntentMessageListSelectResponse getListSelect() {
        return this.listSelect;
    }

    /**
     * The media content card for Actions on Google.
     * 
     */
    @InputImport(name="mediaContent", required=true)
      private final GoogleCloudDialogflowV2IntentMessageMediaContentResponse mediaContent;

    public GoogleCloudDialogflowV2IntentMessageMediaContentResponse getMediaContent() {
        return this.mediaContent;
    }

    /**
     * A custom platform-specific response.
     * 
     */
    @InputImport(name="payload", required=true)
      private final Map<String,String> payload;

    public Map<String,String> getPayload() {
        return this.payload;
    }

    /**
     * Optional. The platform that this message is intended for.
     * 
     */
    @InputImport(name="platform", required=true)
      private final String platform;

    public String getPlatform() {
        return this.platform;
    }

    /**
     * The quick replies response.
     * 
     */
    @InputImport(name="quickReplies", required=true)
      private final GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse quickReplies;

    public GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse getQuickReplies() {
        return this.quickReplies;
    }

    /**
     * The voice and text-only responses for Actions on Google.
     * 
     */
    @InputImport(name="simpleResponses", required=true)
      private final GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse simpleResponses;

    public GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse getSimpleResponses() {
        return this.simpleResponses;
    }

    /**
     * The suggestion chips for Actions on Google.
     * 
     */
    @InputImport(name="suggestions", required=true)
      private final GoogleCloudDialogflowV2IntentMessageSuggestionsResponse suggestions;

    public GoogleCloudDialogflowV2IntentMessageSuggestionsResponse getSuggestions() {
        return this.suggestions;
    }

    /**
     * Table card for Actions on Google.
     * 
     */
    @InputImport(name="tableCard", required=true)
      private final GoogleCloudDialogflowV2IntentMessageTableCardResponse tableCard;

    public GoogleCloudDialogflowV2IntentMessageTableCardResponse getTableCard() {
        return this.tableCard;
    }

    /**
     * The text response.
     * 
     */
    @InputImport(name="text", required=true)
      private final GoogleCloudDialogflowV2IntentMessageTextResponse text;

    public GoogleCloudDialogflowV2IntentMessageTextResponse getText() {
        return this.text;
    }

    public GoogleCloudDialogflowV2IntentMessageResponse(
        GoogleCloudDialogflowV2IntentMessageBasicCardResponse basicCard,
        GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse browseCarouselCard,
        GoogleCloudDialogflowV2IntentMessageCardResponse card,
        GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse carouselSelect,
        GoogleCloudDialogflowV2IntentMessageImageResponse image,
        GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse linkOutSuggestion,
        GoogleCloudDialogflowV2IntentMessageListSelectResponse listSelect,
        GoogleCloudDialogflowV2IntentMessageMediaContentResponse mediaContent,
        Map<String,String> payload,
        String platform,
        GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse quickReplies,
        GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse simpleResponses,
        GoogleCloudDialogflowV2IntentMessageSuggestionsResponse suggestions,
        GoogleCloudDialogflowV2IntentMessageTableCardResponse tableCard,
        GoogleCloudDialogflowV2IntentMessageTextResponse text) {
        this.basicCard = Objects.requireNonNull(basicCard, "expected parameter 'basicCard' to be non-null");
        this.browseCarouselCard = Objects.requireNonNull(browseCarouselCard, "expected parameter 'browseCarouselCard' to be non-null");
        this.card = Objects.requireNonNull(card, "expected parameter 'card' to be non-null");
        this.carouselSelect = Objects.requireNonNull(carouselSelect, "expected parameter 'carouselSelect' to be non-null");
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.linkOutSuggestion = Objects.requireNonNull(linkOutSuggestion, "expected parameter 'linkOutSuggestion' to be non-null");
        this.listSelect = Objects.requireNonNull(listSelect, "expected parameter 'listSelect' to be non-null");
        this.mediaContent = Objects.requireNonNull(mediaContent, "expected parameter 'mediaContent' to be non-null");
        this.payload = Objects.requireNonNull(payload, "expected parameter 'payload' to be non-null");
        this.platform = Objects.requireNonNull(platform, "expected parameter 'platform' to be non-null");
        this.quickReplies = Objects.requireNonNull(quickReplies, "expected parameter 'quickReplies' to be non-null");
        this.simpleResponses = Objects.requireNonNull(simpleResponses, "expected parameter 'simpleResponses' to be non-null");
        this.suggestions = Objects.requireNonNull(suggestions, "expected parameter 'suggestions' to be non-null");
        this.tableCard = Objects.requireNonNull(tableCard, "expected parameter 'tableCard' to be non-null");
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageResponse() {
        this.basicCard = null;
        this.browseCarouselCard = null;
        this.card = null;
        this.carouselSelect = null;
        this.image = null;
        this.linkOutSuggestion = null;
        this.listSelect = null;
        this.mediaContent = null;
        this.payload = Map.of();
        this.platform = null;
        this.quickReplies = null;
        this.simpleResponses = null;
        this.suggestions = null;
        this.tableCard = null;
        this.text = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageBasicCardResponse basicCard;
        private GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse browseCarouselCard;
        private GoogleCloudDialogflowV2IntentMessageCardResponse card;
        private GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse carouselSelect;
        private GoogleCloudDialogflowV2IntentMessageImageResponse image;
        private GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse linkOutSuggestion;
        private GoogleCloudDialogflowV2IntentMessageListSelectResponse listSelect;
        private GoogleCloudDialogflowV2IntentMessageMediaContentResponse mediaContent;
        private Map<String,String> payload;
        private String platform;
        private GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse quickReplies;
        private GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse simpleResponses;
        private GoogleCloudDialogflowV2IntentMessageSuggestionsResponse suggestions;
        private GoogleCloudDialogflowV2IntentMessageTableCardResponse tableCard;
        private GoogleCloudDialogflowV2IntentMessageTextResponse text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicCard = defaults.basicCard;
    	      this.browseCarouselCard = defaults.browseCarouselCard;
    	      this.card = defaults.card;
    	      this.carouselSelect = defaults.carouselSelect;
    	      this.image = defaults.image;
    	      this.linkOutSuggestion = defaults.linkOutSuggestion;
    	      this.listSelect = defaults.listSelect;
    	      this.mediaContent = defaults.mediaContent;
    	      this.payload = defaults.payload;
    	      this.platform = defaults.platform;
    	      this.quickReplies = defaults.quickReplies;
    	      this.simpleResponses = defaults.simpleResponses;
    	      this.suggestions = defaults.suggestions;
    	      this.tableCard = defaults.tableCard;
    	      this.text = defaults.text;
        }

        public Builder basicCard(GoogleCloudDialogflowV2IntentMessageBasicCardResponse basicCard) {
            this.basicCard = Objects.requireNonNull(basicCard);
            return this;
        }

        public Builder browseCarouselCard(GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse browseCarouselCard) {
            this.browseCarouselCard = Objects.requireNonNull(browseCarouselCard);
            return this;
        }

        public Builder card(GoogleCloudDialogflowV2IntentMessageCardResponse card) {
            this.card = Objects.requireNonNull(card);
            return this;
        }

        public Builder carouselSelect(GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse carouselSelect) {
            this.carouselSelect = Objects.requireNonNull(carouselSelect);
            return this;
        }

        public Builder image(GoogleCloudDialogflowV2IntentMessageImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder linkOutSuggestion(GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse linkOutSuggestion) {
            this.linkOutSuggestion = Objects.requireNonNull(linkOutSuggestion);
            return this;
        }

        public Builder listSelect(GoogleCloudDialogflowV2IntentMessageListSelectResponse listSelect) {
            this.listSelect = Objects.requireNonNull(listSelect);
            return this;
        }

        public Builder mediaContent(GoogleCloudDialogflowV2IntentMessageMediaContentResponse mediaContent) {
            this.mediaContent = Objects.requireNonNull(mediaContent);
            return this;
        }

        public Builder payload(Map<String,String> payload) {
            this.payload = Objects.requireNonNull(payload);
            return this;
        }

        public Builder platform(String platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }

        public Builder quickReplies(GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse quickReplies) {
            this.quickReplies = Objects.requireNonNull(quickReplies);
            return this;
        }

        public Builder simpleResponses(GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse simpleResponses) {
            this.simpleResponses = Objects.requireNonNull(simpleResponses);
            return this;
        }

        public Builder suggestions(GoogleCloudDialogflowV2IntentMessageSuggestionsResponse suggestions) {
            this.suggestions = Objects.requireNonNull(suggestions);
            return this;
        }

        public Builder tableCard(GoogleCloudDialogflowV2IntentMessageTableCardResponse tableCard) {
            this.tableCard = Objects.requireNonNull(tableCard);
            return this;
        }

        public Builder text(GoogleCloudDialogflowV2IntentMessageTextResponse text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public GoogleCloudDialogflowV2IntentMessageResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageResponse(basicCard, browseCarouselCard, card, carouselSelect, image, linkOutSuggestion, listSelect, mediaContent, payload, platform, quickReplies, simpleResponses, suggestions, tableCard, text);
        }
    }
}
