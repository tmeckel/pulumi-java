// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IssueModelArgs extends io.pulumi.resources.ResourceArgs {

    public static final IssueModelArgs Empty = new IssueModelArgs();

    /**
     * The representative name for the issue model.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Configs for the input data that used to create the issue model.
     * 
     */
    @InputImport(name="inputDataConfig")
    private final @Nullable Input<GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs> inputDataConfig;

    public Input<GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs> getInputDataConfig() {
        return this.inputDataConfig == null ? Input.empty() : this.inputDataConfig;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Immutable. The resource name of the issue model. Format: projects/{project}/locations/{location}/issueModels/{issue_model}
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

    public IssueModelArgs(
        @Nullable Input<String> displayName,
        @Nullable Input<GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs> inputDataConfig,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project) {
        this.displayName = displayName;
        this.inputDataConfig = inputDataConfig;
        this.location = location;
        this.name = name;
        this.project = project;
    }

    private IssueModelArgs() {
        this.displayName = Input.empty();
        this.inputDataConfig = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IssueModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs> inputDataConfig;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(IssueModelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.inputDataConfig = defaults.inputDataConfig;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setInputDataConfig(@Nullable Input<GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs> inputDataConfig) {
            this.inputDataConfig = inputDataConfig;
            return this;
        }

        public Builder setInputDataConfig(@Nullable GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs inputDataConfig) {
            this.inputDataConfig = Input.ofNullable(inputDataConfig);
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

        public IssueModelArgs build() {
            return new IssueModelArgs(displayName, inputDataConfig, location, name, project);
        }
    }
}
