// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse;
import java.util.Objects;


/**
 * Rich Business Messaging (RBM) suggestion. Suggestions allow user to easily select/click a predefined response or perform an action (like opening a web uri).
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse();

    /**
     * Predefined client side actions that user can choose
     * 
     */
    @InputImport(name="action", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse action;

    public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse getAction() {
        return this.action;
    }

    /**
     * Predefined replies for user to select instead of typing
     * 
     */
    @InputImport(name="reply", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse reply;

    public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse getReply() {
        return this.reply;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse(
        GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse action,
        GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse reply) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.reply = Objects.requireNonNull(reply, "expected parameter 'reply' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse() {
        this.action = null;
        this.reply = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse action;
        private GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse reply;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.reply = defaults.reply;
        }

        public Builder action(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder reply(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse reply) {
            this.reply = Objects.requireNonNull(reply);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionResponse(action, reply);
        }
    }
}
