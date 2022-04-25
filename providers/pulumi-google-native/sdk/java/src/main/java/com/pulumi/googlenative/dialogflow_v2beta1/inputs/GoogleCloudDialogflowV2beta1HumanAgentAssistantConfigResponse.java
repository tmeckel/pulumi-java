// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1NotificationConfigResponse;
import java.util.Objects;


/**
 * Defines the Human Agent Assistant to connect to a conversation.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse();

    /**
     * Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    @Import(name="endUserSuggestionConfig", required=true)
    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse endUserSuggestionConfig;

    /**
     * @return Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse endUserSuggestionConfig() {
        return this.endUserSuggestionConfig;
    }

    /**
     * Configuration for agent assistance of human agent participant.
     * 
     */
    @Import(name="humanAgentSuggestionConfig", required=true)
    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse humanAgentSuggestionConfig;

    /**
     * @return Configuration for agent assistance of human agent participant.
     * 
     */
    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse humanAgentSuggestionConfig() {
        return this.humanAgentSuggestionConfig;
    }

    /**
     * Configuration for message analysis.
     * 
     */
    @Import(name="messageAnalysisConfig", required=true)
    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse messageAnalysisConfig;

    /**
     * @return Configuration for message analysis.
     * 
     */
    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse messageAnalysisConfig() {
        return this.messageAnalysisConfig;
    }

    /**
     * Pub/Sub topic on which to publish new agent assistant events.
     * 
     */
    @Import(name="notificationConfig", required=true)
    private GoogleCloudDialogflowV2beta1NotificationConfigResponse notificationConfig;

    /**
     * @return Pub/Sub topic on which to publish new agent assistant events.
     * 
     */
    public GoogleCloudDialogflowV2beta1NotificationConfigResponse notificationConfig() {
        return this.notificationConfig;
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse() {}

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse $) {
        this.endUserSuggestionConfig = $.endUserSuggestionConfig;
        this.humanAgentSuggestionConfig = $.humanAgentSuggestionConfig;
        this.messageAnalysisConfig = $.messageAnalysisConfig;
        this.notificationConfig = $.notificationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse();
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse defaults) {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param endUserSuggestionConfig Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
         * 
         * @return builder
         * 
         */
        public Builder endUserSuggestionConfig(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse endUserSuggestionConfig) {
            $.endUserSuggestionConfig = endUserSuggestionConfig;
            return this;
        }

        /**
         * @param humanAgentSuggestionConfig Configuration for agent assistance of human agent participant.
         * 
         * @return builder
         * 
         */
        public Builder humanAgentSuggestionConfig(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse humanAgentSuggestionConfig) {
            $.humanAgentSuggestionConfig = humanAgentSuggestionConfig;
            return this;
        }

        /**
         * @param messageAnalysisConfig Configuration for message analysis.
         * 
         * @return builder
         * 
         */
        public Builder messageAnalysisConfig(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse messageAnalysisConfig) {
            $.messageAnalysisConfig = messageAnalysisConfig;
            return this;
        }

        /**
         * @param notificationConfig Pub/Sub topic on which to publish new agent assistant events.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfig(GoogleCloudDialogflowV2beta1NotificationConfigResponse notificationConfig) {
            $.notificationConfig = notificationConfig;
            return this;
        }

        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse build() {
            $.endUserSuggestionConfig = Objects.requireNonNull($.endUserSuggestionConfig, "expected parameter 'endUserSuggestionConfig' to be non-null");
            $.humanAgentSuggestionConfig = Objects.requireNonNull($.humanAgentSuggestionConfig, "expected parameter 'humanAgentSuggestionConfig' to be non-null");
            $.messageAnalysisConfig = Objects.requireNonNull($.messageAnalysisConfig, "expected parameter 'messageAnalysisConfig' to be non-null");
            $.notificationConfig = Objects.requireNonNull($.notificationConfig, "expected parameter 'notificationConfig' to be non-null");
            return $;
        }
    }

}
