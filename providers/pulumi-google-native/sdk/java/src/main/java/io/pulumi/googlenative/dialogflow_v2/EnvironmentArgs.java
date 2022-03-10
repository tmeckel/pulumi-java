// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2FulfillmentArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2TextToSpeechSettingsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * Optional. The agent version loaded into this environment. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
     * 
     */
    @InputImport(name="agentVersion")
      private final @Nullable Input<String> agentVersion;

    public Input<String> getAgentVersion() {
        return this.agentVersion == null ? Input.empty() : this.agentVersion;
    }

    /**
     * Optional. The developer-provided description for this environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="environmentId", required=true)
      private final Input<String> environmentId;

    public Input<String> getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * Optional. The fulfillment settings to use for this environment.
     * 
     */
    @InputImport(name="fulfillment")
      private final @Nullable Input<GoogleCloudDialogflowV2FulfillmentArgs> fulfillment;

    public Input<GoogleCloudDialogflowV2FulfillmentArgs> getFulfillment() {
        return this.fulfillment == null ? Input.empty() : this.fulfillment;
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

    /**
     * Optional. Text to speech settings for this environment.
     * 
     */
    @InputImport(name="textToSpeechSettings")
      private final @Nullable Input<GoogleCloudDialogflowV2TextToSpeechSettingsArgs> textToSpeechSettings;

    public Input<GoogleCloudDialogflowV2TextToSpeechSettingsArgs> getTextToSpeechSettings() {
        return this.textToSpeechSettings == null ? Input.empty() : this.textToSpeechSettings;
    }

    public EnvironmentArgs(
        @Nullable Input<String> agentVersion,
        @Nullable Input<String> description,
        Input<String> environmentId,
        @Nullable Input<GoogleCloudDialogflowV2FulfillmentArgs> fulfillment,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        @Nullable Input<GoogleCloudDialogflowV2TextToSpeechSettingsArgs> textToSpeechSettings) {
        this.agentVersion = agentVersion;
        this.description = description;
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.fulfillment = fulfillment;
        this.location = location;
        this.project = project;
        this.textToSpeechSettings = textToSpeechSettings;
    }

    private EnvironmentArgs() {
        this.agentVersion = Input.empty();
        this.description = Input.empty();
        this.environmentId = Input.empty();
        this.fulfillment = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.textToSpeechSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> agentVersion;
        private @Nullable Input<String> description;
        private Input<String> environmentId;
        private @Nullable Input<GoogleCloudDialogflowV2FulfillmentArgs> fulfillment;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private @Nullable Input<GoogleCloudDialogflowV2TextToSpeechSettingsArgs> textToSpeechSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentVersion = defaults.agentVersion;
    	      this.description = defaults.description;
    	      this.environmentId = defaults.environmentId;
    	      this.fulfillment = defaults.fulfillment;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.textToSpeechSettings = defaults.textToSpeechSettings;
        }

        public Builder agentVersion(@Nullable Input<String> agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }

        public Builder agentVersion(@Nullable String agentVersion) {
            this.agentVersion = Input.ofNullable(agentVersion);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder environmentId(Input<String> environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }

        public Builder environmentId(String environmentId) {
            this.environmentId = Input.of(Objects.requireNonNull(environmentId));
            return this;
        }

        public Builder fulfillment(@Nullable Input<GoogleCloudDialogflowV2FulfillmentArgs> fulfillment) {
            this.fulfillment = fulfillment;
            return this;
        }

        public Builder fulfillment(@Nullable GoogleCloudDialogflowV2FulfillmentArgs fulfillment) {
            this.fulfillment = Input.ofNullable(fulfillment);
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

        public Builder textToSpeechSettings(@Nullable Input<GoogleCloudDialogflowV2TextToSpeechSettingsArgs> textToSpeechSettings) {
            this.textToSpeechSettings = textToSpeechSettings;
            return this;
        }

        public Builder textToSpeechSettings(@Nullable GoogleCloudDialogflowV2TextToSpeechSettingsArgs textToSpeechSettings) {
            this.textToSpeechSettings = Input.ofNullable(textToSpeechSettings);
            return this;
        }
        public EnvironmentArgs build() {
            return new EnvironmentArgs(agentVersion, description, environmentId, fulfillment, location, project, textToSpeechSettings);
        }
    }
}
