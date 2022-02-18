// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    @InputImport(name="agentId", required=true)
    private final Input<String> agentId;

    public Input<String> getAgentId() {
        return this.agentId;
    }

    /**
     * The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The human-readable name of the environment (unique in an agent). Limit of 64 characters.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the environment. Format: `projects//locations//agents//environments/`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The test cases config for continuous tests of this environment.
     * 
     */
    @InputImport(name="testCasesConfig")
    private final @Nullable Input<GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs> testCasesConfig;

    public Input<GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs> getTestCasesConfig() {
        return this.testCasesConfig == null ? Input.empty() : this.testCasesConfig;
    }

    /**
     * A list of configurations for flow versions. You should include version configs for all flows that are reachable from `Start Flow` in the agent. Otherwise, an error will be returned.
     * 
     */
    @InputImport(name="versionConfigs", required=true)
    private final Input<List<GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs>> versionConfigs;

    public Input<List<GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs>> getVersionConfigs() {
        return this.versionConfigs;
    }

    public EnvironmentArgs(
        Input<String> agentId,
        @Nullable Input<String> description,
        Input<String> displayName,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs> testCasesConfig,
        Input<List<GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs>> versionConfigs) {
        this.agentId = Objects.requireNonNull(agentId, "expected parameter 'agentId' to be non-null");
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.location = location;
        this.name = name;
        this.project = project;
        this.testCasesConfig = testCasesConfig;
        this.versionConfigs = Objects.requireNonNull(versionConfigs, "expected parameter 'versionConfigs' to be non-null");
    }

    private EnvironmentArgs() {
        this.agentId = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.testCasesConfig = Input.empty();
        this.versionConfigs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> agentId;
        private @Nullable Input<String> description;
        private Input<String> displayName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs> testCasesConfig;
        private Input<List<GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs>> versionConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.testCasesConfig = defaults.testCasesConfig;
    	      this.versionConfigs = defaults.versionConfigs;
        }

        public Builder setAgentId(Input<String> agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }

        public Builder setAgentId(String agentId) {
            this.agentId = Input.of(Objects.requireNonNull(agentId));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setTestCasesConfig(@Nullable Input<GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs> testCasesConfig) {
            this.testCasesConfig = testCasesConfig;
            return this;
        }

        public Builder setTestCasesConfig(@Nullable GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs testCasesConfig) {
            this.testCasesConfig = Input.ofNullable(testCasesConfig);
            return this;
        }

        public Builder setVersionConfigs(Input<List<GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs>> versionConfigs) {
            this.versionConfigs = Objects.requireNonNull(versionConfigs);
            return this;
        }

        public Builder setVersionConfigs(List<GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs> versionConfigs) {
            this.versionConfigs = Input.of(Objects.requireNonNull(versionConfigs));
            return this;
        }

        public EnvironmentArgs build() {
            return new EnvironmentArgs(agentId, description, displayName, location, name, project, testCasesConfig, versionConfigs);
        }
    }
}
