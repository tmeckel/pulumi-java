// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v2.ConversationProfileArgs;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2AutomatedAgentConfigResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2HumanAgentHandoffConfigResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2LoggingConfigResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2NotificationConfigResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2SpeechToTextConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a conversation profile in the specified project. ConversationProfile.CreateTime and ConversationProfile.UpdateTime aren't populated in the response. You can retrieve them via GetConversationProfile API.
 * 
 */
@ResourceType(type="google-native:dialogflow/v2:ConversationProfile")
public class ConversationProfile extends io.pulumi.resources.CustomResource {
    /**
     * Configuration for an automated agent to use with this profile.
     * 
     */
    @OutputExport(name="automatedAgentConfig", type=GoogleCloudDialogflowV2AutomatedAgentConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2AutomatedAgentConfigResponse> automatedAgentConfig;

    /**
     * @return Configuration for an automated agent to use with this profile.
     * 
     */
    public Output<GoogleCloudDialogflowV2AutomatedAgentConfigResponse> getAutomatedAgentConfig() {
        return this.automatedAgentConfig;
    }
    /**
     * Create time of the conversation profile.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Create time of the conversation profile.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Human readable name for this profile. Max length 1024 bytes.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Human readable name for this profile. Max length 1024 bytes.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Configuration for agent assistance to use with this profile.
     * 
     */
    @OutputExport(name="humanAgentAssistantConfig", type=GoogleCloudDialogflowV2HumanAgentAssistantConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigResponse> humanAgentAssistantConfig;

    /**
     * @return Configuration for agent assistance to use with this profile.
     * 
     */
    public Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigResponse> getHumanAgentAssistantConfig() {
        return this.humanAgentAssistantConfig;
    }
    /**
     * Configuration for connecting to a live agent. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    @OutputExport(name="humanAgentHandoffConfig", type=GoogleCloudDialogflowV2HumanAgentHandoffConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2HumanAgentHandoffConfigResponse> humanAgentHandoffConfig;

    /**
     * @return Configuration for connecting to a live agent. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    public Output<GoogleCloudDialogflowV2HumanAgentHandoffConfigResponse> getHumanAgentHandoffConfig() {
        return this.humanAgentHandoffConfig;
    }
    /**
     * Language code for the conversation profile. If not specified, the language is en-US. Language at ConversationProfile should be set for all non en-US languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
     * 
     */
    @OutputExport(name="languageCode", type=String.class, parameters={})
    private Output<String> languageCode;

    /**
     * @return Language code for the conversation profile. If not specified, the language is en-US. Language at ConversationProfile should be set for all non en-US languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
     * 
     */
    public Output<String> getLanguageCode() {
        return this.languageCode;
    }
    /**
     * Configuration for logging conversation lifecycle events.
     * 
     */
    @OutputExport(name="loggingConfig", type=GoogleCloudDialogflowV2LoggingConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2LoggingConfigResponse> loggingConfig;

    /**
     * @return Configuration for logging conversation lifecycle events.
     * 
     */
    public Output<GoogleCloudDialogflowV2LoggingConfigResponse> getLoggingConfig() {
        return this.loggingConfig;
    }
    /**
     * The unique identifier of this conversation profile. Format: `projects//locations//conversationProfiles/`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of this conversation profile. Format: `projects//locations//conversationProfiles/`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Configuration for publishing new message events. Event will be sent in format of ConversationEvent
     * 
     */
    @OutputExport(name="newMessageEventNotificationConfig", type=GoogleCloudDialogflowV2NotificationConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2NotificationConfigResponse> newMessageEventNotificationConfig;

    /**
     * @return Configuration for publishing new message events. Event will be sent in format of ConversationEvent
     * 
     */
    public Output<GoogleCloudDialogflowV2NotificationConfigResponse> getNewMessageEventNotificationConfig() {
        return this.newMessageEventNotificationConfig;
    }
    /**
     * Configuration for publishing conversation lifecycle events.
     * 
     */
    @OutputExport(name="notificationConfig", type=GoogleCloudDialogflowV2NotificationConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2NotificationConfigResponse> notificationConfig;

    /**
     * @return Configuration for publishing conversation lifecycle events.
     * 
     */
    public Output<GoogleCloudDialogflowV2NotificationConfigResponse> getNotificationConfig() {
        return this.notificationConfig;
    }
    /**
     * Name of the CX SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
     */
    @OutputExport(name="securitySettings", type=String.class, parameters={})
    private Output<String> securitySettings;

    /**
     * @return Name of the CX SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
     */
    public Output<String> getSecuritySettings() {
        return this.securitySettings;
    }
    /**
     * Settings for speech transcription.
     * 
     */
    @OutputExport(name="sttConfig", type=GoogleCloudDialogflowV2SpeechToTextConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2SpeechToTextConfigResponse> sttConfig;

    /**
     * @return Settings for speech transcription.
     * 
     */
    public Output<GoogleCloudDialogflowV2SpeechToTextConfigResponse> getSttConfig() {
        return this.sttConfig;
    }
    /**
     * The time zone of this conversational profile from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. Defaults to America/New_York.
     * 
     */
    @OutputExport(name="timeZone", type=String.class, parameters={})
    private Output<String> timeZone;

    /**
     * @return The time zone of this conversational profile from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. Defaults to America/New_York.
     * 
     */
    public Output<String> getTimeZone() {
        return this.timeZone;
    }
    /**
     * Update time of the conversation profile.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Update time of the conversation profile.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConversationProfile(String name, ConversationProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2:ConversationProfile", name, args == null ? ConversationProfileArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ConversationProfile(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2:ConversationProfile", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ConversationProfile get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConversationProfile(name, id, options);
    }
}
