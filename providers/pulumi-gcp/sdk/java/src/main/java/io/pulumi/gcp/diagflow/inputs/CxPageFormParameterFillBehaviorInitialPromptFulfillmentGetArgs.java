// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageFormParameterFillBehaviorInitialPromptFulfillmentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageFormParameterFillBehaviorInitialPromptFulfillmentGetArgs Empty = new CxPageFormParameterFillBehaviorInitialPromptFulfillmentGetArgs();

    /**
     * The list of rich message responses to present to the user.
     * Structure is documented below.
     * 
     */
    @Import(name="messages")
      private final @Nullable Output<List<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageGetArgs>> messages;

    public Output<List<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageGetArgs>> getMessages() {
        return this.messages == null ? Codegen.empty() : this.messages;
    }

    /**
     * Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
     * 
     */
    @Import(name="returnPartialResponses")
      private final @Nullable Output<Boolean> returnPartialResponses;

    public Output<Boolean> getReturnPartialResponses() {
        return this.returnPartialResponses == null ? Codegen.empty() : this.returnPartialResponses;
    }

    /**
     * The tag used by the webhook to identify which fulfillment is being called. This field is required if webhook is specified.
     * 
     */
    @Import(name="tag")
      private final @Nullable Output<String> tag;

    public Output<String> getTag() {
        return this.tag == null ? Codegen.empty() : this.tag;
    }

    /**
     * The webhook to call. Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/webhooks/<Webhook ID>.
     * 
     */
    @Import(name="webhook")
      private final @Nullable Output<String> webhook;

    public Output<String> getWebhook() {
        return this.webhook == null ? Codegen.empty() : this.webhook;
    }

    public CxPageFormParameterFillBehaviorInitialPromptFulfillmentGetArgs(
        @Nullable Output<List<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageGetArgs>> messages,
        @Nullable Output<Boolean> returnPartialResponses,
        @Nullable Output<String> tag,
        @Nullable Output<String> webhook) {
        this.messages = messages;
        this.returnPartialResponses = returnPartialResponses;
        this.tag = tag;
        this.webhook = webhook;
    }

    private CxPageFormParameterFillBehaviorInitialPromptFulfillmentGetArgs() {
        this.messages = Codegen.empty();
        this.returnPartialResponses = Codegen.empty();
        this.tag = Codegen.empty();
        this.webhook = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageGetArgs>> messages;
        private @Nullable Output<Boolean> returnPartialResponses;
        private @Nullable Output<String> tag;
        private @Nullable Output<String> webhook;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messages = defaults.messages;
    	      this.returnPartialResponses = defaults.returnPartialResponses;
    	      this.tag = defaults.tag;
    	      this.webhook = defaults.webhook;
        }

        public Builder messages(@Nullable Output<List<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageGetArgs>> messages) {
            this.messages = messages;
            return this;
        }
        public Builder messages(@Nullable List<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageGetArgs> messages) {
            this.messages = Codegen.ofNullable(messages);
            return this;
        }
        public Builder messages(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageGetArgs... messages) {
            return messages(List.of(messages));
        }
        public Builder returnPartialResponses(@Nullable Output<Boolean> returnPartialResponses) {
            this.returnPartialResponses = returnPartialResponses;
            return this;
        }
        public Builder returnPartialResponses(@Nullable Boolean returnPartialResponses) {
            this.returnPartialResponses = Codegen.ofNullable(returnPartialResponses);
            return this;
        }
        public Builder tag(@Nullable Output<String> tag) {
            this.tag = tag;
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = Codegen.ofNullable(tag);
            return this;
        }
        public Builder webhook(@Nullable Output<String> webhook) {
            this.webhook = webhook;
            return this;
        }
        public Builder webhook(@Nullable String webhook) {
            this.webhook = Codegen.ofNullable(webhook);
            return this;
        }        public CxPageFormParameterFillBehaviorInitialPromptFulfillmentGetArgs build() {
            return new CxPageFormParameterFillBehaviorInitialPromptFulfillmentGetArgs(messages, returnPartialResponses, tag, webhook);
        }
    }
}
