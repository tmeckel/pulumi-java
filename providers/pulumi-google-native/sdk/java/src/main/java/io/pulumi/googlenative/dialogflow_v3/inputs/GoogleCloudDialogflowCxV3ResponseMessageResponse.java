// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ResponseMessageEndInteractionResponse;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ResponseMessageTextResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Represents a response message that can be returned by a conversational agent. Response messages are also used for output audio synthesis. The approach is as follows: * If at least one OutputAudioText response is present, then all OutputAudioText responses are linearly concatenated, and the result is used for output audio synthesis. * If the OutputAudioText responses are a mixture of text and SSML, then the concatenated result is treated as SSML; otherwise, the result is treated as either text or SSML as appropriate. The agent designer should ideally use either text or SSML consistently throughout the bot design. * Otherwise, all Text responses are linearly concatenated, and the result is used for output audio synthesis. This approach allows for more sophisticated user experience scenarios, where the text displayed to the user may differ from what is heard.
 * 
 */
public final class GoogleCloudDialogflowCxV3ResponseMessageResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3ResponseMessageResponse Empty = new GoogleCloudDialogflowCxV3ResponseMessageResponse();

    /**
     * Indicates that the conversation succeeded.
     * 
     */
    @InputImport(name="conversationSuccess", required=true)
    private final GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse conversationSuccess;

    public GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse getConversationSuccess() {
        return this.conversationSuccess;
    }

    /**
     * A signal that indicates the interaction with the Dialogflow agent has ended. This message is generated by Dialogflow only when the conversation reaches `END_SESSION` page. It is not supposed to be defined by the user. It's guaranteed that there is at most one such message in each response.
     * 
     */
    @InputImport(name="endInteraction", required=true)
    private final GoogleCloudDialogflowCxV3ResponseMessageEndInteractionResponse endInteraction;

    public GoogleCloudDialogflowCxV3ResponseMessageEndInteractionResponse getEndInteraction() {
        return this.endInteraction;
    }

    /**
     * Hands off conversation to a human agent.
     * 
     */
    @InputImport(name="liveAgentHandoff", required=true)
    private final GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse liveAgentHandoff;

    public GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse getLiveAgentHandoff() {
        return this.liveAgentHandoff;
    }

    /**
     * An audio response message composed of both the synthesized Dialogflow agent responses and responses defined via play_audio. This message is generated by Dialogflow only and not supposed to be defined by the user.
     * 
     */
    @InputImport(name="mixedAudio", required=true)
    private final GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse mixedAudio;

    public GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse getMixedAudio() {
        return this.mixedAudio;
    }

    /**
     * A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     * 
     */
    @InputImport(name="outputAudioText", required=true)
    private final GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse outputAudioText;

    public GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse getOutputAudioText() {
        return this.outputAudioText;
    }

    /**
     * Returns a response containing a custom, platform-specific payload.
     * 
     */
    @InputImport(name="payload", required=true)
    private final Map<String,String> payload;

    public Map<String,String> getPayload() {
        return this.payload;
    }

    /**
     * Signal that the client should play an audio clip hosted at a client-specific URI. Dialogflow uses this to construct mixed_audio. However, Dialogflow itself does not try to read or process the URI in any way.
     * 
     */
    @InputImport(name="playAudio", required=true)
    private final GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse playAudio;

    public GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse getPlayAudio() {
        return this.playAudio;
    }

    /**
     * A signal that the client should transfer the phone call connected to this agent to a third-party endpoint.
     * 
     */
    @InputImport(name="telephonyTransferCall", required=true)
    private final GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse telephonyTransferCall;

    public GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse getTelephonyTransferCall() {
        return this.telephonyTransferCall;
    }

    /**
     * Returns a text response.
     * 
     */
    @InputImport(name="text", required=true)
    private final GoogleCloudDialogflowCxV3ResponseMessageTextResponse text;

    public GoogleCloudDialogflowCxV3ResponseMessageTextResponse getText() {
        return this.text;
    }

    public GoogleCloudDialogflowCxV3ResponseMessageResponse(
        GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse conversationSuccess,
        GoogleCloudDialogflowCxV3ResponseMessageEndInteractionResponse endInteraction,
        GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse liveAgentHandoff,
        GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse mixedAudio,
        GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse outputAudioText,
        Map<String,String> payload,
        GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse playAudio,
        GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse telephonyTransferCall,
        GoogleCloudDialogflowCxV3ResponseMessageTextResponse text) {
        this.conversationSuccess = Objects.requireNonNull(conversationSuccess, "expected parameter 'conversationSuccess' to be non-null");
        this.endInteraction = Objects.requireNonNull(endInteraction, "expected parameter 'endInteraction' to be non-null");
        this.liveAgentHandoff = Objects.requireNonNull(liveAgentHandoff, "expected parameter 'liveAgentHandoff' to be non-null");
        this.mixedAudio = Objects.requireNonNull(mixedAudio, "expected parameter 'mixedAudio' to be non-null");
        this.outputAudioText = Objects.requireNonNull(outputAudioText, "expected parameter 'outputAudioText' to be non-null");
        this.payload = Objects.requireNonNull(payload, "expected parameter 'payload' to be non-null");
        this.playAudio = Objects.requireNonNull(playAudio, "expected parameter 'playAudio' to be non-null");
        this.telephonyTransferCall = Objects.requireNonNull(telephonyTransferCall, "expected parameter 'telephonyTransferCall' to be non-null");
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
    }

    private GoogleCloudDialogflowCxV3ResponseMessageResponse() {
        this.conversationSuccess = null;
        this.endInteraction = null;
        this.liveAgentHandoff = null;
        this.mixedAudio = null;
        this.outputAudioText = null;
        this.payload = Map.of();
        this.playAudio = null;
        this.telephonyTransferCall = null;
        this.text = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse conversationSuccess;
        private GoogleCloudDialogflowCxV3ResponseMessageEndInteractionResponse endInteraction;
        private GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse liveAgentHandoff;
        private GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse mixedAudio;
        private GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse outputAudioText;
        private Map<String,String> payload;
        private GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse playAudio;
        private GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse telephonyTransferCall;
        private GoogleCloudDialogflowCxV3ResponseMessageTextResponse text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversationSuccess = defaults.conversationSuccess;
    	      this.endInteraction = defaults.endInteraction;
    	      this.liveAgentHandoff = defaults.liveAgentHandoff;
    	      this.mixedAudio = defaults.mixedAudio;
    	      this.outputAudioText = defaults.outputAudioText;
    	      this.payload = defaults.payload;
    	      this.playAudio = defaults.playAudio;
    	      this.telephonyTransferCall = defaults.telephonyTransferCall;
    	      this.text = defaults.text;
        }

        public Builder setConversationSuccess(GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse conversationSuccess) {
            this.conversationSuccess = Objects.requireNonNull(conversationSuccess);
            return this;
        }

        public Builder setEndInteraction(GoogleCloudDialogflowCxV3ResponseMessageEndInteractionResponse endInteraction) {
            this.endInteraction = Objects.requireNonNull(endInteraction);
            return this;
        }

        public Builder setLiveAgentHandoff(GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse liveAgentHandoff) {
            this.liveAgentHandoff = Objects.requireNonNull(liveAgentHandoff);
            return this;
        }

        public Builder setMixedAudio(GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse mixedAudio) {
            this.mixedAudio = Objects.requireNonNull(mixedAudio);
            return this;
        }

        public Builder setOutputAudioText(GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse outputAudioText) {
            this.outputAudioText = Objects.requireNonNull(outputAudioText);
            return this;
        }

        public Builder setPayload(Map<String,String> payload) {
            this.payload = Objects.requireNonNull(payload);
            return this;
        }

        public Builder setPlayAudio(GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse playAudio) {
            this.playAudio = Objects.requireNonNull(playAudio);
            return this;
        }

        public Builder setTelephonyTransferCall(GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse telephonyTransferCall) {
            this.telephonyTransferCall = Objects.requireNonNull(telephonyTransferCall);
            return this;
        }

        public Builder setText(GoogleCloudDialogflowCxV3ResponseMessageTextResponse text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }

        public GoogleCloudDialogflowCxV3ResponseMessageResponse build() {
            return new GoogleCloudDialogflowCxV3ResponseMessageResponse(conversationSuccess, endInteraction, liveAgentHandoff, mixedAudio, outputAudioText, payload, playAudio, telephonyTransferCall, text);
        }
    }
}
