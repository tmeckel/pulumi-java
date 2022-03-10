// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3QueryInputArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The input from the human user.
 * 
 */
public final class GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs Empty = new GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs();

    /**
     * Whether sentiment analysis is enabled.
     * 
     */
    @InputImport(name="enableSentimentAnalysis")
      private final @Nullable Input<Boolean> enableSentimentAnalysis;

    public Input<Boolean> getEnableSentimentAnalysis() {
        return this.enableSentimentAnalysis == null ? Input.empty() : this.enableSentimentAnalysis;
    }

    /**
     * Parameters that need to be injected into the conversation during intent detection.
     * 
     */
    @InputImport(name="injectedParameters")
      private final @Nullable Input<Map<String,String>> injectedParameters;

    public Input<Map<String,String>> getInjectedParameters() {
        return this.injectedParameters == null ? Input.empty() : this.injectedParameters;
    }

    /**
     * Supports text input, event input, dtmf input in the test case.
     * 
     */
    @InputImport(name="input")
      private final @Nullable Input<GoogleCloudDialogflowCxV3QueryInputArgs> input;

    public Input<GoogleCloudDialogflowCxV3QueryInputArgs> getInput() {
        return this.input == null ? Input.empty() : this.input;
    }

    /**
     * If webhooks should be allowed to trigger in response to the user utterance. Often if parameters are injected, webhooks should not be enabled.
     * 
     */
    @InputImport(name="isWebhookEnabled")
      private final @Nullable Input<Boolean> isWebhookEnabled;

    public Input<Boolean> getIsWebhookEnabled() {
        return this.isWebhookEnabled == null ? Input.empty() : this.isWebhookEnabled;
    }

    public GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs(
        @Nullable Input<Boolean> enableSentimentAnalysis,
        @Nullable Input<Map<String,String>> injectedParameters,
        @Nullable Input<GoogleCloudDialogflowCxV3QueryInputArgs> input,
        @Nullable Input<Boolean> isWebhookEnabled) {
        this.enableSentimentAnalysis = enableSentimentAnalysis;
        this.injectedParameters = injectedParameters;
        this.input = input;
        this.isWebhookEnabled = isWebhookEnabled;
    }

    private GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs() {
        this.enableSentimentAnalysis = Input.empty();
        this.injectedParameters = Input.empty();
        this.input = Input.empty();
        this.isWebhookEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableSentimentAnalysis;
        private @Nullable Input<Map<String,String>> injectedParameters;
        private @Nullable Input<GoogleCloudDialogflowCxV3QueryInputArgs> input;
        private @Nullable Input<Boolean> isWebhookEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableSentimentAnalysis = defaults.enableSentimentAnalysis;
    	      this.injectedParameters = defaults.injectedParameters;
    	      this.input = defaults.input;
    	      this.isWebhookEnabled = defaults.isWebhookEnabled;
        }

        public Builder enableSentimentAnalysis(@Nullable Input<Boolean> enableSentimentAnalysis) {
            this.enableSentimentAnalysis = enableSentimentAnalysis;
            return this;
        }

        public Builder enableSentimentAnalysis(@Nullable Boolean enableSentimentAnalysis) {
            this.enableSentimentAnalysis = Input.ofNullable(enableSentimentAnalysis);
            return this;
        }

        public Builder injectedParameters(@Nullable Input<Map<String,String>> injectedParameters) {
            this.injectedParameters = injectedParameters;
            return this;
        }

        public Builder injectedParameters(@Nullable Map<String,String> injectedParameters) {
            this.injectedParameters = Input.ofNullable(injectedParameters);
            return this;
        }

        public Builder input(@Nullable Input<GoogleCloudDialogflowCxV3QueryInputArgs> input) {
            this.input = input;
            return this;
        }

        public Builder input(@Nullable GoogleCloudDialogflowCxV3QueryInputArgs input) {
            this.input = Input.ofNullable(input);
            return this;
        }

        public Builder isWebhookEnabled(@Nullable Input<Boolean> isWebhookEnabled) {
            this.isWebhookEnabled = isWebhookEnabled;
            return this;
        }

        public Builder isWebhookEnabled(@Nullable Boolean isWebhookEnabled) {
            this.isWebhookEnabled = Input.ofNullable(isWebhookEnabled);
            return this;
        }
        public GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs build() {
            return new GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs(enableSentimentAnalysis, injectedParameters, input, isWebhookEnabled);
        }
    }
}
