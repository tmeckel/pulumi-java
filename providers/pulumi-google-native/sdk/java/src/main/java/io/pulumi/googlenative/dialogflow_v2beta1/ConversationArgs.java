// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.enums.ConversationConversationStage;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConversationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConversationArgs Empty = new ConversationArgs();

    @InputImport(name="conversationId")
      private final @Nullable Input<String> conversationId;

    public Input<String> getConversationId() {
        return this.conversationId == null ? Input.empty() : this.conversationId;
    }

    /**
     * The Conversation Profile to be used to configure this Conversation. This field cannot be updated. Format: `projects//locations//conversationProfiles/`.
     * 
     */
    @InputImport(name="conversationProfile", required=true)
      private final Input<String> conversationProfile;

    public Input<String> getConversationProfile() {
        return this.conversationProfile;
    }

    /**
     * The stage of a conversation. It indicates whether the virtual agent or a human agent is handling the conversation. If the conversation is created with the conversation profile that has Dialogflow config set, defaults to ConversationStage.VIRTUAL_AGENT_STAGE; Otherwise, defaults to ConversationStage.HUMAN_ASSIST_STAGE. If the conversation is created with the conversation profile that has Dialogflow config set but explicitly sets conversation_stage to ConversationStage.HUMAN_ASSIST_STAGE, it skips ConversationStage.VIRTUAL_AGENT_STAGE stage and directly goes to ConversationStage.HUMAN_ASSIST_STAGE.
     * 
     */
    @InputImport(name="conversationStage")
      private final @Nullable Input<ConversationConversationStage> conversationStage;

    public Input<ConversationConversationStage> getConversationStage() {
        return this.conversationStage == null ? Input.empty() : this.conversationStage;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public ConversationArgs(
        @Nullable Input<String> conversationId,
        Input<String> conversationProfile,
        @Nullable Input<ConversationConversationStage> conversationStage,
        @Nullable Input<String> location,
        @Nullable Input<String> project) {
        this.conversationId = conversationId;
        this.conversationProfile = Objects.requireNonNull(conversationProfile, "expected parameter 'conversationProfile' to be non-null");
        this.conversationStage = conversationStage;
        this.location = location;
        this.project = project;
    }

    private ConversationArgs() {
        this.conversationId = Input.empty();
        this.conversationProfile = Input.empty();
        this.conversationStage = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConversationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> conversationId;
        private Input<String> conversationProfile;
        private @Nullable Input<ConversationConversationStage> conversationStage;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ConversationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversationId = defaults.conversationId;
    	      this.conversationProfile = defaults.conversationProfile;
    	      this.conversationStage = defaults.conversationStage;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder conversationId(@Nullable Input<String> conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        public Builder conversationId(@Nullable String conversationId) {
            this.conversationId = Input.ofNullable(conversationId);
            return this;
        }

        public Builder conversationProfile(Input<String> conversationProfile) {
            this.conversationProfile = Objects.requireNonNull(conversationProfile);
            return this;
        }

        public Builder conversationProfile(String conversationProfile) {
            this.conversationProfile = Input.of(Objects.requireNonNull(conversationProfile));
            return this;
        }

        public Builder conversationStage(@Nullable Input<ConversationConversationStage> conversationStage) {
            this.conversationStage = conversationStage;
            return this;
        }

        public Builder conversationStage(@Nullable ConversationConversationStage conversationStage) {
            this.conversationStage = Input.ofNullable(conversationStage);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public ConversationArgs build() {
            return new ConversationArgs(conversationId, conversationProfile, conversationStage, location, project);
        }
    }
}
