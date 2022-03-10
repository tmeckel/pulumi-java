// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2ConversationPhoneNumberResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetConversationResult {
    /**
     * The Conversation Profile to be used to configure this Conversation. This field cannot be updated. Format: `projects//locations//conversationProfiles/`.
     * 
     */
    private final String conversationProfile;
    /**
     * The stage of a conversation. It indicates whether the virtual agent or a human agent is handling the conversation. If the conversation is created with the conversation profile that has Dialogflow config set, defaults to ConversationStage.VIRTUAL_AGENT_STAGE; Otherwise, defaults to ConversationStage.HUMAN_ASSIST_STAGE. If the conversation is created with the conversation profile that has Dialogflow config set but explicitly sets conversation_stage to ConversationStage.HUMAN_ASSIST_STAGE, it skips ConversationStage.VIRTUAL_AGENT_STAGE stage and directly goes to ConversationStage.HUMAN_ASSIST_STAGE.
     * 
     */
    private final String conversationStage;
    /**
     * The time the conversation was finished.
     * 
     */
    private final String endTime;
    /**
     * The current state of the Conversation.
     * 
     */
    private final String lifecycleState;
    /**
     * The unique identifier of this conversation. Format: `projects//locations//conversations/`.
     * 
     */
    private final String name;
    /**
     * It will not be empty if the conversation is to be connected over telephony.
     * 
     */
    private final GoogleCloudDialogflowV2ConversationPhoneNumberResponse phoneNumber;
    /**
     * The time the conversation was started.
     * 
     */
    private final String startTime;

    @OutputCustomType.Constructor
    private GetConversationResult(
        @OutputCustomType.Parameter("conversationProfile") String conversationProfile,
        @OutputCustomType.Parameter("conversationStage") String conversationStage,
        @OutputCustomType.Parameter("endTime") String endTime,
        @OutputCustomType.Parameter("lifecycleState") String lifecycleState,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("phoneNumber") GoogleCloudDialogflowV2ConversationPhoneNumberResponse phoneNumber,
        @OutputCustomType.Parameter("startTime") String startTime) {
        this.conversationProfile = conversationProfile;
        this.conversationStage = conversationStage;
        this.endTime = endTime;
        this.lifecycleState = lifecycleState;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.startTime = startTime;
    }

    /**
     * The Conversation Profile to be used to configure this Conversation. This field cannot be updated. Format: `projects//locations//conversationProfiles/`.
     * 
    */
    public String getConversationProfile() {
        return this.conversationProfile;
    }
    /**
     * The stage of a conversation. It indicates whether the virtual agent or a human agent is handling the conversation. If the conversation is created with the conversation profile that has Dialogflow config set, defaults to ConversationStage.VIRTUAL_AGENT_STAGE; Otherwise, defaults to ConversationStage.HUMAN_ASSIST_STAGE. If the conversation is created with the conversation profile that has Dialogflow config set but explicitly sets conversation_stage to ConversationStage.HUMAN_ASSIST_STAGE, it skips ConversationStage.VIRTUAL_AGENT_STAGE stage and directly goes to ConversationStage.HUMAN_ASSIST_STAGE.
     * 
    */
    public String getConversationStage() {
        return this.conversationStage;
    }
    /**
     * The time the conversation was finished.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * The current state of the Conversation.
     * 
    */
    public String getLifecycleState() {
        return this.lifecycleState;
    }
    /**
     * The unique identifier of this conversation. Format: `projects//locations//conversations/`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * It will not be empty if the conversation is to be connected over telephony.
     * 
    */
    public GoogleCloudDialogflowV2ConversationPhoneNumberResponse getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * The time the conversation was started.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConversationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String conversationProfile;
        private String conversationStage;
        private String endTime;
        private String lifecycleState;
        private String name;
        private GoogleCloudDialogflowV2ConversationPhoneNumberResponse phoneNumber;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConversationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversationProfile = defaults.conversationProfile;
    	      this.conversationStage = defaults.conversationStage;
    	      this.endTime = defaults.endTime;
    	      this.lifecycleState = defaults.lifecycleState;
    	      this.name = defaults.name;
    	      this.phoneNumber = defaults.phoneNumber;
    	      this.startTime = defaults.startTime;
        }

        public Builder conversationProfile(String conversationProfile) {
            this.conversationProfile = Objects.requireNonNull(conversationProfile);
            return this;
        }

        public Builder conversationStage(String conversationStage) {
            this.conversationStage = Objects.requireNonNull(conversationStage);
            return this;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder lifecycleState(String lifecycleState) {
            this.lifecycleState = Objects.requireNonNull(lifecycleState);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder phoneNumber(GoogleCloudDialogflowV2ConversationPhoneNumberResponse phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public GetConversationResult build() {
            return new GetConversationResult(conversationProfile, conversationStage, endTime, lifecycleState, name, phoneNumber, startTime);
        }
    }
}
