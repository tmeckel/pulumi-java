// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.orgpolicy_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.orgpolicy_v2.inputs.GoogleCloudOrgpolicyV2PolicySpecArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number}/policies/{constraint_name}` * `folders/{folder_id}/policies/{constraint_name}` * `organizations/{organization_id}/policies/{constraint_name}` For example, "projects/123/policies/compute.disableSerialPortAccess". Note: `projects/{project_id}/policies/{constraint_name}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Basic information about the Organization Policy.
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<GoogleCloudOrgpolicyV2PolicySpecArgs> spec;

    public Output<GoogleCloudOrgpolicyV2PolicySpecArgs> getSpec() {
        return this.spec == null ? Codegen.empty() : this.spec;
    }

    public PolicyArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<GoogleCloudOrgpolicyV2PolicySpecArgs> spec) {
        this.name = name;
        this.project = project;
        this.spec = spec;
    }

    private PolicyArgs() {
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.spec = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<GoogleCloudOrgpolicyV2PolicySpecArgs> spec;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.spec = defaults.spec;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder spec(@Nullable Output<GoogleCloudOrgpolicyV2PolicySpecArgs> spec) {
            this.spec = spec;
            return this;
        }
        public Builder spec(@Nullable GoogleCloudOrgpolicyV2PolicySpecArgs spec) {
            this.spec = Codegen.ofNullable(spec);
            return this;
        }        public PolicyArgs build() {
            return new PolicyArgs(name, project, spec);
        }
    }
}
