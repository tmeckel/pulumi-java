// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageSuggestionArgs;
import java.util.List;
import java.util.Objects;


/**
 * The collection of suggestions.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs();

    /**
     * The list of suggested replies.
     * 
     */
    @InputImport(name="suggestions", required=true)
    private final Input<List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionArgs>> suggestions;

    public Input<List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionArgs>> getSuggestions() {
        return this.suggestions;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs(Input<List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionArgs>> suggestions) {
        this.suggestions = Objects.requireNonNull(suggestions, "expected parameter 'suggestions' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs() {
        this.suggestions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionArgs>> suggestions;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.suggestions = defaults.suggestions;
        }

        public Builder setSuggestions(Input<List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionArgs>> suggestions) {
            this.suggestions = Objects.requireNonNull(suggestions);
            return this;
        }

        public Builder setSuggestions(List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionArgs> suggestions) {
            this.suggestions = Input.of(Objects.requireNonNull(suggestions));
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageSuggestionsArgs(suggestions);
        }
    }
}
