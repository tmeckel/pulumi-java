// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.enums.IntentDefaultResponsePlatformsItem;
import io.pulumi.googlenative.dialogflow_v2.enums.IntentWebhookState;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2ContextArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentParameterArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentTrainingPhraseArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntentArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntentArgs Empty = new IntentArgs();

    /**
     * Optional. The name of the action associated with the intent. Note: The action name must not contain whitespaces.
     * 
     */
    @InputImport(name="action")
    private final @Nullable Input<String> action;

    public Input<String> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * Optional. The list of platforms for which the first responses will be copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform).
     * 
     */
    @InputImport(name="defaultResponsePlatforms")
    private final @Nullable Input<List<IntentDefaultResponsePlatformsItem>> defaultResponsePlatforms;

    public Input<List<IntentDefaultResponsePlatformsItem>> getDefaultResponsePlatforms() {
        return this.defaultResponsePlatforms == null ? Input.empty() : this.defaultResponsePlatforms;
    }

    /**
     * The name of this intent.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Optional. Indicates that this intent ends an interaction. Some integrations (e.g., Actions on Google or Dialogflow phone gateway) use this information to close interaction with an end user. Default is false.
     * 
     */
    @InputImport(name="endInteraction")
    private final @Nullable Input<Boolean> endInteraction;

    public Input<Boolean> getEndInteraction() {
        return this.endInteraction == null ? Input.empty() : this.endInteraction;
    }

    /**
     * Optional. The collection of event names that trigger the intent. If the collection of input contexts is not empty, all of the contexts must be present in the active user session for an event to trigger this intent. Event names are limited to 150 characters.
     * 
     */
    @InputImport(name="events")
    private final @Nullable Input<List<String>> events;

    public Input<List<String>> getEvents() {
        return this.events == null ? Input.empty() : this.events;
    }

    /**
     * Optional. The list of context names required for this intent to be triggered. Format: `projects//agent/sessions/-/contexts/`.
     * 
     */
    @InputImport(name="inputContextNames")
    private final @Nullable Input<List<String>> inputContextNames;

    public Input<List<String>> getInputContextNames() {
        return this.inputContextNames == null ? Input.empty() : this.inputContextNames;
    }

    @InputImport(name="intentView")
    private final @Nullable Input<String> intentView;

    public Input<String> getIntentView() {
        return this.intentView == null ? Input.empty() : this.intentView;
    }

    /**
     * Optional. Indicates whether this is a fallback intent.
     * 
     */
    @InputImport(name="isFallback")
    private final @Nullable Input<Boolean> isFallback;

    public Input<Boolean> getIsFallback() {
        return this.isFallback == null ? Input.empty() : this.isFallback;
    }

    @InputImport(name="languageCode")
    private final @Nullable Input<String> languageCode;

    public Input<String> getLanguageCode() {
        return this.languageCode == null ? Input.empty() : this.languageCode;
    }

    /**
     * Optional. Indicates that a live agent should be brought in to handle the interaction with the user. In most cases, when you set this flag to true, you would also want to set end_interaction to true as well. Default is false.
     * 
     */
    @InputImport(name="liveAgentHandoff")
    private final @Nullable Input<Boolean> liveAgentHandoff;

    public Input<Boolean> getLiveAgentHandoff() {
        return this.liveAgentHandoff == null ? Input.empty() : this.liveAgentHandoff;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optional. The collection of rich messages corresponding to the `Response` field in the Dialogflow console.
     * 
     */
    @InputImport(name="messages")
    private final @Nullable Input<List<GoogleCloudDialogflowV2IntentMessageArgs>> messages;

    public Input<List<GoogleCloudDialogflowV2IntentMessageArgs>> getMessages() {
        return this.messages == null ? Input.empty() : this.messages;
    }

    /**
     * Optional. Indicates whether Machine Learning is disabled for the intent. Note: If `ml_disabled` setting is set to true, then this intent is not taken into account during inference in `ML ONLY` match mode. Also, auto-markup in the UI is turned off.
     * 
     */
    @InputImport(name="mlDisabled")
    private final @Nullable Input<Boolean> mlDisabled;

    public Input<Boolean> getMlDisabled() {
        return this.mlDisabled == null ? Input.empty() : this.mlDisabled;
    }

    /**
     * Optional. The unique identifier of this intent. Required for Intents.UpdateIntent and Intents.BatchUpdateIntents methods. Format: `projects//agent/intents/`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Optional. The collection of contexts that are activated when the intent is matched. Context messages in this collection should not set the parameters field. Setting the `lifespan_count` to 0 will reset the context when the intent is matched. Format: `projects//agent/sessions/-/contexts/`.
     * 
     */
    @InputImport(name="outputContexts")
    private final @Nullable Input<List<GoogleCloudDialogflowV2ContextArgs>> outputContexts;

    public Input<List<GoogleCloudDialogflowV2ContextArgs>> getOutputContexts() {
        return this.outputContexts == null ? Input.empty() : this.outputContexts;
    }

    /**
     * Optional. The collection of parameters associated with the intent.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<List<GoogleCloudDialogflowV2IntentParameterArgs>> parameters;

    public Input<List<GoogleCloudDialogflowV2IntentParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Read-only after creation. The unique identifier of the parent intent in the chain of followup intents. You can set this field when creating an intent, for example with CreateIntent or BatchUpdateIntents, in order to make this intent a followup intent. It identifies the parent followup intent. Format: `projects//agent/intents/`.
     * 
     */
    @InputImport(name="parentFollowupIntentName")
    private final @Nullable Input<String> parentFollowupIntentName;

    public Input<String> getParentFollowupIntentName() {
        return this.parentFollowupIntentName == null ? Input.empty() : this.parentFollowupIntentName;
    }

    /**
     * Optional. The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Optional. Indicates whether to delete all contexts in the current session when this intent is matched.
     * 
     */
    @InputImport(name="resetContexts")
    private final @Nullable Input<Boolean> resetContexts;

    public Input<Boolean> getResetContexts() {
        return this.resetContexts == null ? Input.empty() : this.resetContexts;
    }

    /**
     * Optional. The collection of examples that the agent is trained on.
     * 
     */
    @InputImport(name="trainingPhrases")
    private final @Nullable Input<List<GoogleCloudDialogflowV2IntentTrainingPhraseArgs>> trainingPhrases;

    public Input<List<GoogleCloudDialogflowV2IntentTrainingPhraseArgs>> getTrainingPhrases() {
        return this.trainingPhrases == null ? Input.empty() : this.trainingPhrases;
    }

    /**
     * Optional. Indicates whether webhooks are enabled for the intent.
     * 
     */
    @InputImport(name="webhookState")
    private final @Nullable Input<IntentWebhookState> webhookState;

    public Input<IntentWebhookState> getWebhookState() {
        return this.webhookState == null ? Input.empty() : this.webhookState;
    }

    public IntentArgs(
        @Nullable Input<String> action,
        @Nullable Input<List<IntentDefaultResponsePlatformsItem>> defaultResponsePlatforms,
        Input<String> displayName,
        @Nullable Input<Boolean> endInteraction,
        @Nullable Input<List<String>> events,
        @Nullable Input<List<String>> inputContextNames,
        @Nullable Input<String> intentView,
        @Nullable Input<Boolean> isFallback,
        @Nullable Input<String> languageCode,
        @Nullable Input<Boolean> liveAgentHandoff,
        @Nullable Input<String> location,
        @Nullable Input<List<GoogleCloudDialogflowV2IntentMessageArgs>> messages,
        @Nullable Input<Boolean> mlDisabled,
        @Nullable Input<String> name,
        @Nullable Input<List<GoogleCloudDialogflowV2ContextArgs>> outputContexts,
        @Nullable Input<List<GoogleCloudDialogflowV2IntentParameterArgs>> parameters,
        @Nullable Input<String> parentFollowupIntentName,
        @Nullable Input<Integer> priority,
        @Nullable Input<String> project,
        @Nullable Input<Boolean> resetContexts,
        @Nullable Input<List<GoogleCloudDialogflowV2IntentTrainingPhraseArgs>> trainingPhrases,
        @Nullable Input<IntentWebhookState> webhookState) {
        this.action = action;
        this.defaultResponsePlatforms = defaultResponsePlatforms;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.endInteraction = endInteraction;
        this.events = events;
        this.inputContextNames = inputContextNames;
        this.intentView = intentView;
        this.isFallback = isFallback;
        this.languageCode = languageCode;
        this.liveAgentHandoff = liveAgentHandoff;
        this.location = location;
        this.messages = messages;
        this.mlDisabled = mlDisabled;
        this.name = name;
        this.outputContexts = outputContexts;
        this.parameters = parameters;
        this.parentFollowupIntentName = parentFollowupIntentName;
        this.priority = priority;
        this.project = project;
        this.resetContexts = resetContexts;
        this.trainingPhrases = trainingPhrases;
        this.webhookState = webhookState;
    }

    private IntentArgs() {
        this.action = Input.empty();
        this.defaultResponsePlatforms = Input.empty();
        this.displayName = Input.empty();
        this.endInteraction = Input.empty();
        this.events = Input.empty();
        this.inputContextNames = Input.empty();
        this.intentView = Input.empty();
        this.isFallback = Input.empty();
        this.languageCode = Input.empty();
        this.liveAgentHandoff = Input.empty();
        this.location = Input.empty();
        this.messages = Input.empty();
        this.mlDisabled = Input.empty();
        this.name = Input.empty();
        this.outputContexts = Input.empty();
        this.parameters = Input.empty();
        this.parentFollowupIntentName = Input.empty();
        this.priority = Input.empty();
        this.project = Input.empty();
        this.resetContexts = Input.empty();
        this.trainingPhrases = Input.empty();
        this.webhookState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> action;
        private @Nullable Input<List<IntentDefaultResponsePlatformsItem>> defaultResponsePlatforms;
        private Input<String> displayName;
        private @Nullable Input<Boolean> endInteraction;
        private @Nullable Input<List<String>> events;
        private @Nullable Input<List<String>> inputContextNames;
        private @Nullable Input<String> intentView;
        private @Nullable Input<Boolean> isFallback;
        private @Nullable Input<String> languageCode;
        private @Nullable Input<Boolean> liveAgentHandoff;
        private @Nullable Input<String> location;
        private @Nullable Input<List<GoogleCloudDialogflowV2IntentMessageArgs>> messages;
        private @Nullable Input<Boolean> mlDisabled;
        private @Nullable Input<String> name;
        private @Nullable Input<List<GoogleCloudDialogflowV2ContextArgs>> outputContexts;
        private @Nullable Input<List<GoogleCloudDialogflowV2IntentParameterArgs>> parameters;
        private @Nullable Input<String> parentFollowupIntentName;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<String> project;
        private @Nullable Input<Boolean> resetContexts;
        private @Nullable Input<List<GoogleCloudDialogflowV2IntentTrainingPhraseArgs>> trainingPhrases;
        private @Nullable Input<IntentWebhookState> webhookState;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.defaultResponsePlatforms = defaults.defaultResponsePlatforms;
    	      this.displayName = defaults.displayName;
    	      this.endInteraction = defaults.endInteraction;
    	      this.events = defaults.events;
    	      this.inputContextNames = defaults.inputContextNames;
    	      this.intentView = defaults.intentView;
    	      this.isFallback = defaults.isFallback;
    	      this.languageCode = defaults.languageCode;
    	      this.liveAgentHandoff = defaults.liveAgentHandoff;
    	      this.location = defaults.location;
    	      this.messages = defaults.messages;
    	      this.mlDisabled = defaults.mlDisabled;
    	      this.name = defaults.name;
    	      this.outputContexts = defaults.outputContexts;
    	      this.parameters = defaults.parameters;
    	      this.parentFollowupIntentName = defaults.parentFollowupIntentName;
    	      this.priority = defaults.priority;
    	      this.project = defaults.project;
    	      this.resetContexts = defaults.resetContexts;
    	      this.trainingPhrases = defaults.trainingPhrases;
    	      this.webhookState = defaults.webhookState;
        }

        public Builder setAction(@Nullable Input<String> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable String action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setDefaultResponsePlatforms(@Nullable Input<List<IntentDefaultResponsePlatformsItem>> defaultResponsePlatforms) {
            this.defaultResponsePlatforms = defaultResponsePlatforms;
            return this;
        }

        public Builder setDefaultResponsePlatforms(@Nullable List<IntentDefaultResponsePlatformsItem> defaultResponsePlatforms) {
            this.defaultResponsePlatforms = Input.ofNullable(defaultResponsePlatforms);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setEndInteraction(@Nullable Input<Boolean> endInteraction) {
            this.endInteraction = endInteraction;
            return this;
        }

        public Builder setEndInteraction(@Nullable Boolean endInteraction) {
            this.endInteraction = Input.ofNullable(endInteraction);
            return this;
        }

        public Builder setEvents(@Nullable Input<List<String>> events) {
            this.events = events;
            return this;
        }

        public Builder setEvents(@Nullable List<String> events) {
            this.events = Input.ofNullable(events);
            return this;
        }

        public Builder setInputContextNames(@Nullable Input<List<String>> inputContextNames) {
            this.inputContextNames = inputContextNames;
            return this;
        }

        public Builder setInputContextNames(@Nullable List<String> inputContextNames) {
            this.inputContextNames = Input.ofNullable(inputContextNames);
            return this;
        }

        public Builder setIntentView(@Nullable Input<String> intentView) {
            this.intentView = intentView;
            return this;
        }

        public Builder setIntentView(@Nullable String intentView) {
            this.intentView = Input.ofNullable(intentView);
            return this;
        }

        public Builder setIsFallback(@Nullable Input<Boolean> isFallback) {
            this.isFallback = isFallback;
            return this;
        }

        public Builder setIsFallback(@Nullable Boolean isFallback) {
            this.isFallback = Input.ofNullable(isFallback);
            return this;
        }

        public Builder setLanguageCode(@Nullable Input<String> languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        public Builder setLanguageCode(@Nullable String languageCode) {
            this.languageCode = Input.ofNullable(languageCode);
            return this;
        }

        public Builder setLiveAgentHandoff(@Nullable Input<Boolean> liveAgentHandoff) {
            this.liveAgentHandoff = liveAgentHandoff;
            return this;
        }

        public Builder setLiveAgentHandoff(@Nullable Boolean liveAgentHandoff) {
            this.liveAgentHandoff = Input.ofNullable(liveAgentHandoff);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMessages(@Nullable Input<List<GoogleCloudDialogflowV2IntentMessageArgs>> messages) {
            this.messages = messages;
            return this;
        }

        public Builder setMessages(@Nullable List<GoogleCloudDialogflowV2IntentMessageArgs> messages) {
            this.messages = Input.ofNullable(messages);
            return this;
        }

        public Builder setMlDisabled(@Nullable Input<Boolean> mlDisabled) {
            this.mlDisabled = mlDisabled;
            return this;
        }

        public Builder setMlDisabled(@Nullable Boolean mlDisabled) {
            this.mlDisabled = Input.ofNullable(mlDisabled);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOutputContexts(@Nullable Input<List<GoogleCloudDialogflowV2ContextArgs>> outputContexts) {
            this.outputContexts = outputContexts;
            return this;
        }

        public Builder setOutputContexts(@Nullable List<GoogleCloudDialogflowV2ContextArgs> outputContexts) {
            this.outputContexts = Input.ofNullable(outputContexts);
            return this;
        }

        public Builder setParameters(@Nullable Input<List<GoogleCloudDialogflowV2IntentParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable List<GoogleCloudDialogflowV2IntentParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setParentFollowupIntentName(@Nullable Input<String> parentFollowupIntentName) {
            this.parentFollowupIntentName = parentFollowupIntentName;
            return this;
        }

        public Builder setParentFollowupIntentName(@Nullable String parentFollowupIntentName) {
            this.parentFollowupIntentName = Input.ofNullable(parentFollowupIntentName);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setResetContexts(@Nullable Input<Boolean> resetContexts) {
            this.resetContexts = resetContexts;
            return this;
        }

        public Builder setResetContexts(@Nullable Boolean resetContexts) {
            this.resetContexts = Input.ofNullable(resetContexts);
            return this;
        }

        public Builder setTrainingPhrases(@Nullable Input<List<GoogleCloudDialogflowV2IntentTrainingPhraseArgs>> trainingPhrases) {
            this.trainingPhrases = trainingPhrases;
            return this;
        }

        public Builder setTrainingPhrases(@Nullable List<GoogleCloudDialogflowV2IntentTrainingPhraseArgs> trainingPhrases) {
            this.trainingPhrases = Input.ofNullable(trainingPhrases);
            return this;
        }

        public Builder setWebhookState(@Nullable Input<IntentWebhookState> webhookState) {
            this.webhookState = webhookState;
            return this;
        }

        public Builder setWebhookState(@Nullable IntentWebhookState webhookState) {
            this.webhookState = Input.ofNullable(webhookState);
            return this;
        }

        public IntentArgs build() {
            return new IntentArgs(action, defaultResponsePlatforms, displayName, endInteraction, events, inputContextNames, intentView, isFallback, languageCode, liveAgentHandoff, location, messages, mlDisabled, name, outputContexts, parameters, parentFollowupIntentName, priority, project, resetContexts, trainingPhrases, webhookState);
        }
    }
}
