// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2AutomatedAgentConfigResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2HumanAgentHandoffConfigResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2LoggingConfigResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2NotificationConfigResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2SpeechToTextConfigResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetConversationProfileResult {
    /**
     * Configuration for an automated agent to use with this profile.
     * 
     */
    private final GoogleCloudDialogflowV2AutomatedAgentConfigResponse automatedAgentConfig;
    /**
     * Create time of the conversation profile.
     * 
     */
    private final String createTime;
    /**
     * Human readable name for this profile. Max length 1024 bytes.
     * 
     */
    private final String displayName;
    /**
     * Configuration for agent assistance to use with this profile.
     * 
     */
    private final GoogleCloudDialogflowV2HumanAgentAssistantConfigResponse humanAgentAssistantConfig;
    /**
     * Configuration for connecting to a live agent. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    private final GoogleCloudDialogflowV2HumanAgentHandoffConfigResponse humanAgentHandoffConfig;
    /**
     * Language code for the conversation profile. If not specified, the language is en-US. Language at ConversationProfile should be set for all non en-US languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
     * 
     */
    private final String languageCode;
    /**
     * Configuration for logging conversation lifecycle events.
     * 
     */
    private final GoogleCloudDialogflowV2LoggingConfigResponse loggingConfig;
    /**
     * The unique identifier of this conversation profile. Format: `projects//locations//conversationProfiles/`.
     * 
     */
    private final String name;
    /**
     * Configuration for publishing new message events. Event will be sent in format of ConversationEvent
     * 
     */
    private final GoogleCloudDialogflowV2NotificationConfigResponse newMessageEventNotificationConfig;
    /**
     * Configuration for publishing conversation lifecycle events.
     * 
     */
    private final GoogleCloudDialogflowV2NotificationConfigResponse notificationConfig;
    /**
     * Name of the CX SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
     */
    private final String securitySettings;
    /**
     * Settings for speech transcription.
     * 
     */
    private final GoogleCloudDialogflowV2SpeechToTextConfigResponse sttConfig;
    /**
     * The time zone of this conversational profile from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. Defaults to America/New_York.
     * 
     */
    private final String timeZone;
    /**
     * Update time of the conversation profile.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"automatedAgentConfig","createTime","displayName","humanAgentAssistantConfig","humanAgentHandoffConfig","languageCode","loggingConfig","name","newMessageEventNotificationConfig","notificationConfig","securitySettings","sttConfig","timeZone","updateTime"})
    private GetConversationProfileResult(
        GoogleCloudDialogflowV2AutomatedAgentConfigResponse automatedAgentConfig,
        String createTime,
        String displayName,
        GoogleCloudDialogflowV2HumanAgentAssistantConfigResponse humanAgentAssistantConfig,
        GoogleCloudDialogflowV2HumanAgentHandoffConfigResponse humanAgentHandoffConfig,
        String languageCode,
        GoogleCloudDialogflowV2LoggingConfigResponse loggingConfig,
        String name,
        GoogleCloudDialogflowV2NotificationConfigResponse newMessageEventNotificationConfig,
        GoogleCloudDialogflowV2NotificationConfigResponse notificationConfig,
        String securitySettings,
        GoogleCloudDialogflowV2SpeechToTextConfigResponse sttConfig,
        String timeZone,
        String updateTime) {
        this.automatedAgentConfig = Objects.requireNonNull(automatedAgentConfig);
        this.createTime = Objects.requireNonNull(createTime);
        this.displayName = Objects.requireNonNull(displayName);
        this.humanAgentAssistantConfig = Objects.requireNonNull(humanAgentAssistantConfig);
        this.humanAgentHandoffConfig = Objects.requireNonNull(humanAgentHandoffConfig);
        this.languageCode = Objects.requireNonNull(languageCode);
        this.loggingConfig = Objects.requireNonNull(loggingConfig);
        this.name = Objects.requireNonNull(name);
        this.newMessageEventNotificationConfig = Objects.requireNonNull(newMessageEventNotificationConfig);
        this.notificationConfig = Objects.requireNonNull(notificationConfig);
        this.securitySettings = Objects.requireNonNull(securitySettings);
        this.sttConfig = Objects.requireNonNull(sttConfig);
        this.timeZone = Objects.requireNonNull(timeZone);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * Configuration for an automated agent to use with this profile.
     * 
     */
    public GoogleCloudDialogflowV2AutomatedAgentConfigResponse getAutomatedAgentConfig() {
        return this.automatedAgentConfig;
    }
    /**
     * Create time of the conversation profile.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Human readable name for this profile. Max length 1024 bytes.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Configuration for agent assistance to use with this profile.
     * 
     */
    public GoogleCloudDialogflowV2HumanAgentAssistantConfigResponse getHumanAgentAssistantConfig() {
        return this.humanAgentAssistantConfig;
    }
    /**
     * Configuration for connecting to a live agent. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    public GoogleCloudDialogflowV2HumanAgentHandoffConfigResponse getHumanAgentHandoffConfig() {
        return this.humanAgentHandoffConfig;
    }
    /**
     * Language code for the conversation profile. If not specified, the language is en-US. Language at ConversationProfile should be set for all non en-US languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
     * 
     */
    public String getLanguageCode() {
        return this.languageCode;
    }
    /**
     * Configuration for logging conversation lifecycle events.
     * 
     */
    public GoogleCloudDialogflowV2LoggingConfigResponse getLoggingConfig() {
        return this.loggingConfig;
    }
    /**
     * The unique identifier of this conversation profile. Format: `projects//locations//conversationProfiles/`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Configuration for publishing new message events. Event will be sent in format of ConversationEvent
     * 
     */
    public GoogleCloudDialogflowV2NotificationConfigResponse getNewMessageEventNotificationConfig() {
        return this.newMessageEventNotificationConfig;
    }
    /**
     * Configuration for publishing conversation lifecycle events.
     * 
     */
    public GoogleCloudDialogflowV2NotificationConfigResponse getNotificationConfig() {
        return this.notificationConfig;
    }
    /**
     * Name of the CX SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
     */
    public String getSecuritySettings() {
        return this.securitySettings;
    }
    /**
     * Settings for speech transcription.
     * 
     */
    public GoogleCloudDialogflowV2SpeechToTextConfigResponse getSttConfig() {
        return this.sttConfig;
    }
    /**
     * The time zone of this conversational profile from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. Defaults to America/New_York.
     * 
     */
    public String getTimeZone() {
        return this.timeZone;
    }
    /**
     * Update time of the conversation profile.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConversationProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2AutomatedAgentConfigResponse automatedAgentConfig;
        private String createTime;
        private String displayName;
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigResponse humanAgentAssistantConfig;
        private GoogleCloudDialogflowV2HumanAgentHandoffConfigResponse humanAgentHandoffConfig;
        private String languageCode;
        private GoogleCloudDialogflowV2LoggingConfigResponse loggingConfig;
        private String name;
        private GoogleCloudDialogflowV2NotificationConfigResponse newMessageEventNotificationConfig;
        private GoogleCloudDialogflowV2NotificationConfigResponse notificationConfig;
        private String securitySettings;
        private GoogleCloudDialogflowV2SpeechToTextConfigResponse sttConfig;
        private String timeZone;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConversationProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatedAgentConfig = defaults.automatedAgentConfig;
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.humanAgentAssistantConfig = defaults.humanAgentAssistantConfig;
    	      this.humanAgentHandoffConfig = defaults.humanAgentHandoffConfig;
    	      this.languageCode = defaults.languageCode;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.name = defaults.name;
    	      this.newMessageEventNotificationConfig = defaults.newMessageEventNotificationConfig;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.securitySettings = defaults.securitySettings;
    	      this.sttConfig = defaults.sttConfig;
    	      this.timeZone = defaults.timeZone;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setAutomatedAgentConfig(GoogleCloudDialogflowV2AutomatedAgentConfigResponse automatedAgentConfig) {
            this.automatedAgentConfig = Objects.requireNonNull(automatedAgentConfig);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setHumanAgentAssistantConfig(GoogleCloudDialogflowV2HumanAgentAssistantConfigResponse humanAgentAssistantConfig) {
            this.humanAgentAssistantConfig = Objects.requireNonNull(humanAgentAssistantConfig);
            return this;
        }

        public Builder setHumanAgentHandoffConfig(GoogleCloudDialogflowV2HumanAgentHandoffConfigResponse humanAgentHandoffConfig) {
            this.humanAgentHandoffConfig = Objects.requireNonNull(humanAgentHandoffConfig);
            return this;
        }

        public Builder setLanguageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }

        public Builder setLoggingConfig(GoogleCloudDialogflowV2LoggingConfigResponse loggingConfig) {
            this.loggingConfig = Objects.requireNonNull(loggingConfig);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNewMessageEventNotificationConfig(GoogleCloudDialogflowV2NotificationConfigResponse newMessageEventNotificationConfig) {
            this.newMessageEventNotificationConfig = Objects.requireNonNull(newMessageEventNotificationConfig);
            return this;
        }

        public Builder setNotificationConfig(GoogleCloudDialogflowV2NotificationConfigResponse notificationConfig) {
            this.notificationConfig = Objects.requireNonNull(notificationConfig);
            return this;
        }

        public Builder setSecuritySettings(String securitySettings) {
            this.securitySettings = Objects.requireNonNull(securitySettings);
            return this;
        }

        public Builder setSttConfig(GoogleCloudDialogflowV2SpeechToTextConfigResponse sttConfig) {
            this.sttConfig = Objects.requireNonNull(sttConfig);
            return this;
        }

        public Builder setTimeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public GetConversationProfileResult build() {
            return new GetConversationProfileResult(automatedAgentConfig, createTime, displayName, humanAgentAssistantConfig, humanAgentHandoffConfig, languageCode, loggingConfig, name, newMessageEventNotificationConfig, notificationConfig, securitySettings, sttConfig, timeZone, updateTime);
        }
    }
}
