// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.CredentialArgs;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.DeploymentLabelEntryArgs;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.TargetConfigurationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentArgs Empty = new DeploymentArgs();

    @InputImport(name="createPolicy")
    private final @Nullable Input<String> createPolicy;

    public Input<String> getCreatePolicy() {
        return this.createPolicy == null ? Input.empty() : this.createPolicy;
    }

    /**
     * User provided default credential for the deployment.
     * 
     */
    @InputImport(name="credential")
    private final @Nullable Input<CredentialArgs> credential;

    public Input<CredentialArgs> getCredential() {
        return this.credential == null ? Input.empty() : this.credential;
    }

    /**
     * An optional user-provided description of the deployment.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<List<DeploymentLabelEntryArgs>> labels;

    public Input<List<DeploymentLabelEntryArgs>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="preview")
    private final @Nullable Input<String> preview;

    public Input<String> getPreview() {
        return this.preview == null ? Input.empty() : this.preview;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * [Input Only] The parameters that define your deployment, including the deployment configuration and relevant templates.
     * 
     */
    @InputImport(name="target")
    private final @Nullable Input<TargetConfigurationArgs> target;

    public Input<TargetConfigurationArgs> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    public DeploymentArgs(
        @Nullable Input<String> createPolicy,
        @Nullable Input<CredentialArgs> credential,
        @Nullable Input<String> description,
        @Nullable Input<String> id,
        @Nullable Input<List<DeploymentLabelEntryArgs>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> preview,
        @Nullable Input<String> project,
        @Nullable Input<TargetConfigurationArgs> target) {
        this.createPolicy = createPolicy;
        this.credential = credential;
        this.description = description;
        this.id = id;
        this.labels = labels;
        this.name = name;
        this.preview = preview;
        this.project = project;
        this.target = target;
    }

    private DeploymentArgs() {
        this.createPolicy = Input.empty();
        this.credential = Input.empty();
        this.description = Input.empty();
        this.id = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.preview = Input.empty();
        this.project = Input.empty();
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createPolicy;
        private @Nullable Input<CredentialArgs> credential;
        private @Nullable Input<String> description;
        private @Nullable Input<String> id;
        private @Nullable Input<List<DeploymentLabelEntryArgs>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> preview;
        private @Nullable Input<String> project;
        private @Nullable Input<TargetConfigurationArgs> target;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createPolicy = defaults.createPolicy;
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.preview = defaults.preview;
    	      this.project = defaults.project;
    	      this.target = defaults.target;
        }

        public Builder setCreatePolicy(@Nullable Input<String> createPolicy) {
            this.createPolicy = createPolicy;
            return this;
        }

        public Builder setCreatePolicy(@Nullable String createPolicy) {
            this.createPolicy = Input.ofNullable(createPolicy);
            return this;
        }

        public Builder setCredential(@Nullable Input<CredentialArgs> credential) {
            this.credential = credential;
            return this;
        }

        public Builder setCredential(@Nullable CredentialArgs credential) {
            this.credential = Input.ofNullable(credential);
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

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setLabels(@Nullable Input<List<DeploymentLabelEntryArgs>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable List<DeploymentLabelEntryArgs> labels) {
            this.labels = Input.ofNullable(labels);
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

        public Builder setPreview(@Nullable Input<String> preview) {
            this.preview = preview;
            return this;
        }

        public Builder setPreview(@Nullable String preview) {
            this.preview = Input.ofNullable(preview);
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

        public Builder setTarget(@Nullable Input<TargetConfigurationArgs> target) {
            this.target = target;
            return this;
        }

        public Builder setTarget(@Nullable TargetConfigurationArgs target) {
            this.target = Input.ofNullable(target);
            return this;
        }

        public DeploymentArgs build() {
            return new DeploymentArgs(createPolicy, credential, description, id, labels, name, preview, project, target);
        }
    }
}
