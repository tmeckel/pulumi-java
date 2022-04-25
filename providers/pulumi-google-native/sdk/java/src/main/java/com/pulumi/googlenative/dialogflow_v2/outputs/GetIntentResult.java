// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2ContextResponse;
import com.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse;
import com.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageResponse;
import com.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentParameterResponse;
import com.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentTrainingPhraseResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIntentResult {
    /**
     * @return Optional. The name of the action associated with the intent. Note: The action name must not contain whitespaces.
     * 
     */
    private final String action;
    /**
     * @return Optional. The list of platforms for which the first responses will be copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform).
     * 
     */
    private final List<String> defaultResponsePlatforms;
    /**
     * @return The name of this intent.
     * 
     */
    private final String displayName;
    /**
     * @return Optional. Indicates that this intent ends an interaction. Some integrations (e.g., Actions on Google or Dialogflow phone gateway) use this information to close interaction with an end user. Default is false.
     * 
     */
    private final Boolean endInteraction;
    /**
     * @return Optional. The collection of event names that trigger the intent. If the collection of input contexts is not empty, all of the contexts must be present in the active user session for an event to trigger this intent. Event names are limited to 150 characters.
     * 
     */
    private final List<String> events;
    /**
     * @return Read-only. Information about all followup intents that have this intent as a direct or indirect parent. We populate this field only in the output.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse> followupIntentInfo;
    /**
     * @return Optional. The list of context names required for this intent to be triggered. Format: `projects//agent/sessions/-/contexts/`.
     * 
     */
    private final List<String> inputContextNames;
    /**
     * @return Optional. Indicates whether this is a fallback intent.
     * 
     */
    private final Boolean isFallback;
    /**
     * @return Optional. Indicates that a live agent should be brought in to handle the interaction with the user. In most cases, when you set this flag to true, you would also want to set end_interaction to true as well. Default is false.
     * 
     */
    private final Boolean liveAgentHandoff;
    /**
     * @return Optional. The collection of rich messages corresponding to the `Response` field in the Dialogflow console.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentMessageResponse> messages;
    /**
     * @return Optional. Indicates whether Machine Learning is disabled for the intent. Note: If `ml_disabled` setting is set to true, then this intent is not taken into account during inference in `ML ONLY` match mode. Also, auto-markup in the UI is turned off.
     * 
     */
    private final Boolean mlDisabled;
    /**
     * @return Optional. The unique identifier of this intent. Required for Intents.UpdateIntent and Intents.BatchUpdateIntents methods. Format: `projects//agent/intents/`.
     * 
     */
    private final String name;
    /**
     * @return Optional. The collection of contexts that are activated when the intent is matched. Context messages in this collection should not set the parameters field. Setting the `lifespan_count` to 0 will reset the context when the intent is matched. Format: `projects//agent/sessions/-/contexts/`.
     * 
     */
    private final List<GoogleCloudDialogflowV2ContextResponse> outputContexts;
    /**
     * @return Optional. The collection of parameters associated with the intent.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentParameterResponse> parameters;
    /**
     * @return Read-only after creation. The unique identifier of the parent intent in the chain of followup intents. You can set this field when creating an intent, for example with CreateIntent or BatchUpdateIntents, in order to make this intent a followup intent. It identifies the parent followup intent. Format: `projects//agent/intents/`.
     * 
     */
    private final String parentFollowupIntentName;
    /**
     * @return Optional. The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    private final Integer priority;
    /**
     * @return Optional. Indicates whether to delete all contexts in the current session when this intent is matched.
     * 
     */
    private final Boolean resetContexts;
    /**
     * @return Read-only. The unique identifier of the root intent in the chain of followup intents. It identifies the correct followup intents chain for this intent. We populate this field only in the output. Format: `projects//agent/intents/`.
     * 
     */
    private final String rootFollowupIntentName;
    /**
     * @return Optional. The collection of examples that the agent is trained on.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentTrainingPhraseResponse> trainingPhrases;
    /**
     * @return Optional. Indicates whether webhooks are enabled for the intent.
     * 
     */
    private final String webhookState;

    @CustomType.Constructor
    private GetIntentResult(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("defaultResponsePlatforms") List<String> defaultResponsePlatforms,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("endInteraction") Boolean endInteraction,
        @CustomType.Parameter("events") List<String> events,
        @CustomType.Parameter("followupIntentInfo") List<GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse> followupIntentInfo,
        @CustomType.Parameter("inputContextNames") List<String> inputContextNames,
        @CustomType.Parameter("isFallback") Boolean isFallback,
        @CustomType.Parameter("liveAgentHandoff") Boolean liveAgentHandoff,
        @CustomType.Parameter("messages") List<GoogleCloudDialogflowV2IntentMessageResponse> messages,
        @CustomType.Parameter("mlDisabled") Boolean mlDisabled,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("outputContexts") List<GoogleCloudDialogflowV2ContextResponse> outputContexts,
        @CustomType.Parameter("parameters") List<GoogleCloudDialogflowV2IntentParameterResponse> parameters,
        @CustomType.Parameter("parentFollowupIntentName") String parentFollowupIntentName,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("resetContexts") Boolean resetContexts,
        @CustomType.Parameter("rootFollowupIntentName") String rootFollowupIntentName,
        @CustomType.Parameter("trainingPhrases") List<GoogleCloudDialogflowV2IntentTrainingPhraseResponse> trainingPhrases,
        @CustomType.Parameter("webhookState") String webhookState) {
        this.action = action;
        this.defaultResponsePlatforms = defaultResponsePlatforms;
        this.displayName = displayName;
        this.endInteraction = endInteraction;
        this.events = events;
        this.followupIntentInfo = followupIntentInfo;
        this.inputContextNames = inputContextNames;
        this.isFallback = isFallback;
        this.liveAgentHandoff = liveAgentHandoff;
        this.messages = messages;
        this.mlDisabled = mlDisabled;
        this.name = name;
        this.outputContexts = outputContexts;
        this.parameters = parameters;
        this.parentFollowupIntentName = parentFollowupIntentName;
        this.priority = priority;
        this.resetContexts = resetContexts;
        this.rootFollowupIntentName = rootFollowupIntentName;
        this.trainingPhrases = trainingPhrases;
        this.webhookState = webhookState;
    }

    /**
     * @return Optional. The name of the action associated with the intent. Note: The action name must not contain whitespaces.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return Optional. The list of platforms for which the first responses will be copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform).
     * 
     */
    public List<String> defaultResponsePlatforms() {
        return this.defaultResponsePlatforms;
    }
    /**
     * @return The name of this intent.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Optional. Indicates that this intent ends an interaction. Some integrations (e.g., Actions on Google or Dialogflow phone gateway) use this information to close interaction with an end user. Default is false.
     * 
     */
    public Boolean endInteraction() {
        return this.endInteraction;
    }
    /**
     * @return Optional. The collection of event names that trigger the intent. If the collection of input contexts is not empty, all of the contexts must be present in the active user session for an event to trigger this intent. Event names are limited to 150 characters.
     * 
     */
    public List<String> events() {
        return this.events;
    }
    /**
     * @return Read-only. Information about all followup intents that have this intent as a direct or indirect parent. We populate this field only in the output.
     * 
     */
    public List<GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse> followupIntentInfo() {
        return this.followupIntentInfo;
    }
    /**
     * @return Optional. The list of context names required for this intent to be triggered. Format: `projects//agent/sessions/-/contexts/`.
     * 
     */
    public List<String> inputContextNames() {
        return this.inputContextNames;
    }
    /**
     * @return Optional. Indicates whether this is a fallback intent.
     * 
     */
    public Boolean isFallback() {
        return this.isFallback;
    }
    /**
     * @return Optional. Indicates that a live agent should be brought in to handle the interaction with the user. In most cases, when you set this flag to true, you would also want to set end_interaction to true as well. Default is false.
     * 
     */
    public Boolean liveAgentHandoff() {
        return this.liveAgentHandoff;
    }
    /**
     * @return Optional. The collection of rich messages corresponding to the `Response` field in the Dialogflow console.
     * 
     */
    public List<GoogleCloudDialogflowV2IntentMessageResponse> messages() {
        return this.messages;
    }
    /**
     * @return Optional. Indicates whether Machine Learning is disabled for the intent. Note: If `ml_disabled` setting is set to true, then this intent is not taken into account during inference in `ML ONLY` match mode. Also, auto-markup in the UI is turned off.
     * 
     */
    public Boolean mlDisabled() {
        return this.mlDisabled;
    }
    /**
     * @return Optional. The unique identifier of this intent. Required for Intents.UpdateIntent and Intents.BatchUpdateIntents methods. Format: `projects//agent/intents/`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Optional. The collection of contexts that are activated when the intent is matched. Context messages in this collection should not set the parameters field. Setting the `lifespan_count` to 0 will reset the context when the intent is matched. Format: `projects//agent/sessions/-/contexts/`.
     * 
     */
    public List<GoogleCloudDialogflowV2ContextResponse> outputContexts() {
        return this.outputContexts;
    }
    /**
     * @return Optional. The collection of parameters associated with the intent.
     * 
     */
    public List<GoogleCloudDialogflowV2IntentParameterResponse> parameters() {
        return this.parameters;
    }
    /**
     * @return Read-only after creation. The unique identifier of the parent intent in the chain of followup intents. You can set this field when creating an intent, for example with CreateIntent or BatchUpdateIntents, in order to make this intent a followup intent. It identifies the parent followup intent. Format: `projects//agent/intents/`.
     * 
     */
    public String parentFollowupIntentName() {
        return this.parentFollowupIntentName;
    }
    /**
     * @return Optional. The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return Optional. Indicates whether to delete all contexts in the current session when this intent is matched.
     * 
     */
    public Boolean resetContexts() {
        return this.resetContexts;
    }
    /**
     * @return Read-only. The unique identifier of the root intent in the chain of followup intents. It identifies the correct followup intents chain for this intent. We populate this field only in the output. Format: `projects//agent/intents/`.
     * 
     */
    public String rootFollowupIntentName() {
        return this.rootFollowupIntentName;
    }
    /**
     * @return Optional. The collection of examples that the agent is trained on.
     * 
     */
    public List<GoogleCloudDialogflowV2IntentTrainingPhraseResponse> trainingPhrases() {
        return this.trainingPhrases;
    }
    /**
     * @return Optional. Indicates whether webhooks are enabled for the intent.
     * 
     */
    public String webhookState() {
        return this.webhookState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private List<String> defaultResponsePlatforms;
        private String displayName;
        private Boolean endInteraction;
        private List<String> events;
        private List<GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse> followupIntentInfo;
        private List<String> inputContextNames;
        private Boolean isFallback;
        private Boolean liveAgentHandoff;
        private List<GoogleCloudDialogflowV2IntentMessageResponse> messages;
        private Boolean mlDisabled;
        private String name;
        private List<GoogleCloudDialogflowV2ContextResponse> outputContexts;
        private List<GoogleCloudDialogflowV2IntentParameterResponse> parameters;
        private String parentFollowupIntentName;
        private Integer priority;
        private Boolean resetContexts;
        private String rootFollowupIntentName;
        private List<GoogleCloudDialogflowV2IntentTrainingPhraseResponse> trainingPhrases;
        private String webhookState;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.defaultResponsePlatforms = defaults.defaultResponsePlatforms;
    	      this.displayName = defaults.displayName;
    	      this.endInteraction = defaults.endInteraction;
    	      this.events = defaults.events;
    	      this.followupIntentInfo = defaults.followupIntentInfo;
    	      this.inputContextNames = defaults.inputContextNames;
    	      this.isFallback = defaults.isFallback;
    	      this.liveAgentHandoff = defaults.liveAgentHandoff;
    	      this.messages = defaults.messages;
    	      this.mlDisabled = defaults.mlDisabled;
    	      this.name = defaults.name;
    	      this.outputContexts = defaults.outputContexts;
    	      this.parameters = defaults.parameters;
    	      this.parentFollowupIntentName = defaults.parentFollowupIntentName;
    	      this.priority = defaults.priority;
    	      this.resetContexts = defaults.resetContexts;
    	      this.rootFollowupIntentName = defaults.rootFollowupIntentName;
    	      this.trainingPhrases = defaults.trainingPhrases;
    	      this.webhookState = defaults.webhookState;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder defaultResponsePlatforms(List<String> defaultResponsePlatforms) {
            this.defaultResponsePlatforms = Objects.requireNonNull(defaultResponsePlatforms);
            return this;
        }
        public Builder defaultResponsePlatforms(String... defaultResponsePlatforms) {
            return defaultResponsePlatforms(List.of(defaultResponsePlatforms));
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder endInteraction(Boolean endInteraction) {
            this.endInteraction = Objects.requireNonNull(endInteraction);
            return this;
        }
        public Builder events(List<String> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }
        public Builder events(String... events) {
            return events(List.of(events));
        }
        public Builder followupIntentInfo(List<GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse> followupIntentInfo) {
            this.followupIntentInfo = Objects.requireNonNull(followupIntentInfo);
            return this;
        }
        public Builder followupIntentInfo(GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse... followupIntentInfo) {
            return followupIntentInfo(List.of(followupIntentInfo));
        }
        public Builder inputContextNames(List<String> inputContextNames) {
            this.inputContextNames = Objects.requireNonNull(inputContextNames);
            return this;
        }
        public Builder inputContextNames(String... inputContextNames) {
            return inputContextNames(List.of(inputContextNames));
        }
        public Builder isFallback(Boolean isFallback) {
            this.isFallback = Objects.requireNonNull(isFallback);
            return this;
        }
        public Builder liveAgentHandoff(Boolean liveAgentHandoff) {
            this.liveAgentHandoff = Objects.requireNonNull(liveAgentHandoff);
            return this;
        }
        public Builder messages(List<GoogleCloudDialogflowV2IntentMessageResponse> messages) {
            this.messages = Objects.requireNonNull(messages);
            return this;
        }
        public Builder messages(GoogleCloudDialogflowV2IntentMessageResponse... messages) {
            return messages(List.of(messages));
        }
        public Builder mlDisabled(Boolean mlDisabled) {
            this.mlDisabled = Objects.requireNonNull(mlDisabled);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder outputContexts(List<GoogleCloudDialogflowV2ContextResponse> outputContexts) {
            this.outputContexts = Objects.requireNonNull(outputContexts);
            return this;
        }
        public Builder outputContexts(GoogleCloudDialogflowV2ContextResponse... outputContexts) {
            return outputContexts(List.of(outputContexts));
        }
        public Builder parameters(List<GoogleCloudDialogflowV2IntentParameterResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(GoogleCloudDialogflowV2IntentParameterResponse... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder parentFollowupIntentName(String parentFollowupIntentName) {
            this.parentFollowupIntentName = Objects.requireNonNull(parentFollowupIntentName);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder resetContexts(Boolean resetContexts) {
            this.resetContexts = Objects.requireNonNull(resetContexts);
            return this;
        }
        public Builder rootFollowupIntentName(String rootFollowupIntentName) {
            this.rootFollowupIntentName = Objects.requireNonNull(rootFollowupIntentName);
            return this;
        }
        public Builder trainingPhrases(List<GoogleCloudDialogflowV2IntentTrainingPhraseResponse> trainingPhrases) {
            this.trainingPhrases = Objects.requireNonNull(trainingPhrases);
            return this;
        }
        public Builder trainingPhrases(GoogleCloudDialogflowV2IntentTrainingPhraseResponse... trainingPhrases) {
            return trainingPhrases(List.of(trainingPhrases));
        }
        public Builder webhookState(String webhookState) {
            this.webhookState = Objects.requireNonNull(webhookState);
            return this;
        }        public GetIntentResult build() {
            return new GetIntentResult(action, defaultResponsePlatforms, displayName, endInteraction, events, followupIntentInfo, inputContextNames, isFallback, liveAgentHandoff, messages, mlDisabled, name, outputContexts, parameters, parentFollowupIntentName, priority, resetContexts, rootFollowupIntentName, trainingPhrases, webhookState);
        }
    }
}
