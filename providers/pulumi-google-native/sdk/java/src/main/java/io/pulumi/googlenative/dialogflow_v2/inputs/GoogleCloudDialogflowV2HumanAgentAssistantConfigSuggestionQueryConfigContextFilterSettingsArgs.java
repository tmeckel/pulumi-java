// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings that determine how to filter recent conversation context when generating suggestions.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs();

    /**
     * If set to true, the last message from virtual agent (hand off message) and the message before it (trigger message of hand off) are dropped.
     * 
     */
    @InputImport(name="dropHandoffMessages")
      private final @Nullable Input<Boolean> dropHandoffMessages;

    public Input<Boolean> getDropHandoffMessages() {
        return this.dropHandoffMessages == null ? Input.empty() : this.dropHandoffMessages;
    }

    /**
     * If set to true, all messages from ivr stage are dropped.
     * 
     */
    @InputImport(name="dropIvrMessages")
      private final @Nullable Input<Boolean> dropIvrMessages;

    public Input<Boolean> getDropIvrMessages() {
        return this.dropIvrMessages == null ? Input.empty() : this.dropIvrMessages;
    }

    /**
     * If set to true, all messages from virtual agent are dropped.
     * 
     */
    @InputImport(name="dropVirtualAgentMessages")
      private final @Nullable Input<Boolean> dropVirtualAgentMessages;

    public Input<Boolean> getDropVirtualAgentMessages() {
        return this.dropVirtualAgentMessages == null ? Input.empty() : this.dropVirtualAgentMessages;
    }

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs(
        @Nullable Input<Boolean> dropHandoffMessages,
        @Nullable Input<Boolean> dropIvrMessages,
        @Nullable Input<Boolean> dropVirtualAgentMessages) {
        this.dropHandoffMessages = dropHandoffMessages;
        this.dropIvrMessages = dropIvrMessages;
        this.dropVirtualAgentMessages = dropVirtualAgentMessages;
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs() {
        this.dropHandoffMessages = Input.empty();
        this.dropIvrMessages = Input.empty();
        this.dropVirtualAgentMessages = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> dropHandoffMessages;
        private @Nullable Input<Boolean> dropIvrMessages;
        private @Nullable Input<Boolean> dropVirtualAgentMessages;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dropHandoffMessages = defaults.dropHandoffMessages;
    	      this.dropIvrMessages = defaults.dropIvrMessages;
    	      this.dropVirtualAgentMessages = defaults.dropVirtualAgentMessages;
        }

        public Builder dropHandoffMessages(@Nullable Input<Boolean> dropHandoffMessages) {
            this.dropHandoffMessages = dropHandoffMessages;
            return this;
        }

        public Builder dropHandoffMessages(@Nullable Boolean dropHandoffMessages) {
            this.dropHandoffMessages = Input.ofNullable(dropHandoffMessages);
            return this;
        }

        public Builder dropIvrMessages(@Nullable Input<Boolean> dropIvrMessages) {
            this.dropIvrMessages = dropIvrMessages;
            return this;
        }

        public Builder dropIvrMessages(@Nullable Boolean dropIvrMessages) {
            this.dropIvrMessages = Input.ofNullable(dropIvrMessages);
            return this;
        }

        public Builder dropVirtualAgentMessages(@Nullable Input<Boolean> dropVirtualAgentMessages) {
            this.dropVirtualAgentMessages = dropVirtualAgentMessages;
            return this;
        }

        public Builder dropVirtualAgentMessages(@Nullable Boolean dropVirtualAgentMessages) {
            this.dropVirtualAgentMessages = Input.ofNullable(dropVirtualAgentMessages);
            return this;
        }
        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs(dropHandoffMessages, dropIvrMessages, dropVirtualAgentMessages);
        }
    }
}
