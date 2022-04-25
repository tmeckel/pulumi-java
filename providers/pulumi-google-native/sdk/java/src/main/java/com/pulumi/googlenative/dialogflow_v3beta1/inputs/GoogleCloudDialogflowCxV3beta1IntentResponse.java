// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1IntentParameterResponse;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * An intent represents a user&#39;s intent to interact with a conversational agent. You can provide information for the Dialogflow API to use to match user input to an intent by adding training phrases (i.e., examples of user input) to your intent.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1IntentResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1IntentResponse Empty = new GoogleCloudDialogflowCxV3beta1IntentResponse();

    /**
     * Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    /**
     * @return Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
     * 
     */
    public String description() {
        return this.description;
    }

    /**
     * The human-readable name of the intent, unique within the agent.
     * 
     */
    @Import(name="displayName", required=true)
    private String displayName;

    /**
     * @return The human-readable name of the intent, unique within the agent.
     * 
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation. Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
     * 
     */
    @Import(name="isFallback", required=true)
    private Boolean isFallback;

    /**
     * @return Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation. Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
     * 
     */
    public Boolean isFallback() {
        return this.isFallback;
    }

    /**
     * The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols &#39;-&#39; and &#39;_&#39;. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes. Prefix &#34;sys-&#34; is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. &#34;sys-head&#34; means the intent is a head intent. &#34;sys-contextual&#34; means the intent is a contextual intent.
     * 
     */
    @Import(name="labels", required=true)
    private Map<String,String> labels;

    /**
     * @return The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols &#39;-&#39; and &#39;_&#39;. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes. Prefix &#34;sys-&#34; is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. &#34;sys-head&#34; means the intent is a head intent. &#34;sys-contextual&#34; means the intent is a contextual intent.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * The unique identifier of the intent. Required for the Intents.UpdateIntent method. Intents.CreateIntent populates the name automatically. Format: `projects//locations//agents//intents/`.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The unique identifier of the intent. Required for the Intents.UpdateIntent method. Intents.CreateIntent populates the name automatically. Format: `projects//locations//agents//intents/`.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The collection of parameters associated with the intent.
     * 
     */
    @Import(name="parameters", required=true)
    private List<GoogleCloudDialogflowCxV3beta1IntentParameterResponse> parameters;

    /**
     * @return The collection of parameters associated with the intent.
     * 
     */
    public List<GoogleCloudDialogflowCxV3beta1IntentParameterResponse> parameters() {
        return this.parameters;
    }

    /**
     * The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    @Import(name="priority", required=true)
    private Integer priority;

    /**
     * @return The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * The collection of training phrases the agent is trained on to identify the intent.
     * 
     */
    @Import(name="trainingPhrases", required=true)
    private List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse> trainingPhrases;

    /**
     * @return The collection of training phrases the agent is trained on to identify the intent.
     * 
     */
    public List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse> trainingPhrases() {
        return this.trainingPhrases;
    }

    private GoogleCloudDialogflowCxV3beta1IntentResponse() {}

    private GoogleCloudDialogflowCxV3beta1IntentResponse(GoogleCloudDialogflowCxV3beta1IntentResponse $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.isFallback = $.isFallback;
        this.labels = $.labels;
        this.name = $.name;
        this.parameters = $.parameters;
        this.priority = $.priority;
        this.trainingPhrases = $.trainingPhrases;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1IntentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1IntentResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1IntentResponse();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1IntentResponse defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1IntentResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            $.description = description;
            return this;
        }

        /**
         * @param displayName The human-readable name of the intent, unique within the agent.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param isFallback Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation. Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
         * 
         * @return builder
         * 
         */
        public Builder isFallback(Boolean isFallback) {
            $.isFallback = isFallback;
            return this;
        }

        /**
         * @param labels The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols &#39;-&#39; and &#39;_&#39;. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes. Prefix &#34;sys-&#34; is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. &#34;sys-head&#34; means the intent is a head intent. &#34;sys-contextual&#34; means the intent is a contextual intent.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param name The unique identifier of the intent. Required for the Intents.UpdateIntent method. Intents.CreateIntent populates the name automatically. Format: `projects//locations//agents//intents/`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param parameters The collection of parameters associated with the intent.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<GoogleCloudDialogflowCxV3beta1IntentParameterResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The collection of parameters associated with the intent.
         * 
         * @return builder
         * 
         */
        public Builder parameters(GoogleCloudDialogflowCxV3beta1IntentParameterResponse... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param priority The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param trainingPhrases The collection of training phrases the agent is trained on to identify the intent.
         * 
         * @return builder
         * 
         */
        public Builder trainingPhrases(List<GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse> trainingPhrases) {
            $.trainingPhrases = trainingPhrases;
            return this;
        }

        /**
         * @param trainingPhrases The collection of training phrases the agent is trained on to identify the intent.
         * 
         * @return builder
         * 
         */
        public Builder trainingPhrases(GoogleCloudDialogflowCxV3beta1IntentTrainingPhraseResponse... trainingPhrases) {
            return trainingPhrases(List.of(trainingPhrases));
        }

        public GoogleCloudDialogflowCxV3beta1IntentResponse build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.isFallback = Objects.requireNonNull($.isFallback, "expected parameter 'isFallback' to be non-null");
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.trainingPhrases = Objects.requireNonNull($.trainingPhrases, "expected parameter 'trainingPhrases' to be non-null");
            return $;
        }
    }

}
