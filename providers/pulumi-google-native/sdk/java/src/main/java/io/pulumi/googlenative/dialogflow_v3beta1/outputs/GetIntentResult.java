// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1IntentParameterResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetIntentResult {
    /**
     * Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
     * 
     */
    private final String description;
    /**
     * The human-readable name of the intent, unique within the agent.
     * 
     */
    private final String displayName;
    /**
     * Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation. Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
     * 
     */
    private final Boolean isFallback;
    /**
     * The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols '-' and '_'. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes. Prefix "sys-" is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. "sys-head" means the intent is a head intent. "sys-contextual" means the intent is a contextual intent.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The unique identifier of the intent. Required for the Intents.UpdateIntent method. Intents.CreateIntent populates the name automatically. Format: `projects//locations//agents//intents/`.
     * 
     */
    private final String name;
    /**
     * The collection of parameters associated with the intent.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1IntentParameterResponse> parameters;
    /**
     * The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    private final Integer priority;
    /**
     * The collection of training phrases the agent is trained on to identify the intent.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse> trainingPhrases;

    @OutputCustomType.Constructor({"description","displayName","isFallback","labels","name","parameters","priority","trainingPhrases"})
    private GetIntentResult(
        String description,
        String displayName,
        Boolean isFallback,
        Map<String,String> labels,
        String name,
        List<GoogleCloudDialogflowCxV3beta1IntentParameterResponse> parameters,
        Integer priority,
        List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse> trainingPhrases) {
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.isFallback = Objects.requireNonNull(isFallback);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.parameters = Objects.requireNonNull(parameters);
        this.priority = Objects.requireNonNull(priority);
        this.trainingPhrases = Objects.requireNonNull(trainingPhrases);
    }

    /**
     * Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The human-readable name of the intent, unique within the agent.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation. Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
     * 
     */
    public Boolean getIsFallback() {
        return this.isFallback;
    }
    /**
     * The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols '-' and '_'. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes. Prefix "sys-" is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. "sys-head" means the intent is a head intent. "sys-contextual" means the intent is a contextual intent.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The unique identifier of the intent. Required for the Intents.UpdateIntent method. Intents.CreateIntent populates the name automatically. Format: `projects//locations//agents//intents/`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The collection of parameters associated with the intent.
     * 
     */
    public List<GoogleCloudDialogflowCxV3beta1IntentParameterResponse> getParameters() {
        return this.parameters;
    }
    /**
     * The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * The collection of training phrases the agent is trained on to identify the intent.
     * 
     */
    public List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse> getTrainingPhrases() {
        return this.trainingPhrases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String displayName;
        private Boolean isFallback;
        private Map<String,String> labels;
        private String name;
        private List<GoogleCloudDialogflowCxV3beta1IntentParameterResponse> parameters;
        private Integer priority;
        private List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse> trainingPhrases;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.isFallback = defaults.isFallback;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.priority = defaults.priority;
    	      this.trainingPhrases = defaults.trainingPhrases;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setIsFallback(Boolean isFallback) {
            this.isFallback = Objects.requireNonNull(isFallback);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(List<GoogleCloudDialogflowCxV3beta1IntentParameterResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setTrainingPhrases(List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse> trainingPhrases) {
            this.trainingPhrases = Objects.requireNonNull(trainingPhrases);
            return this;
        }

        public GetIntentResult build() {
            return new GetIntentResult(description, displayName, isFallback, labels, name, parameters, priority, trainingPhrases);
        }
    }
}
