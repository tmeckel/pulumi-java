// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rich Business Messaging (RBM) suggestion. Suggestions allow user to easily select/click a predefined response or perform an action (like opening a web uri).
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionArgs();

    /**
     * Predefined client side actions that user can choose
     * 
     */
    @InputImport(name="action")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionArgs> action;

    public Input<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionArgs> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * Predefined replies for user to select instead of typing
     * 
     */
    @InputImport(name="reply")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyArgs> reply;

    public Input<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyArgs> getReply() {
        return this.reply == null ? Input.empty() : this.reply;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionArgs(
        @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionArgs> action,
        @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyArgs> reply) {
        this.action = action;
        this.reply = reply;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionArgs() {
        this.action = Input.empty();
        this.reply = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionArgs> action;
        private @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyArgs> reply;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.reply = defaults.reply;
        }

        public Builder action(@Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionArgs> action) {
            this.action = action;
            return this;
        }

        public Builder action(@Nullable GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionArgs action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder reply(@Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyArgs> reply) {
            this.reply = reply;
            return this;
        }

        public Builder reply(@Nullable GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyArgs reply) {
            this.reply = Input.ofNullable(reply);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestionArgs(action, reply);
        }
    }
}
