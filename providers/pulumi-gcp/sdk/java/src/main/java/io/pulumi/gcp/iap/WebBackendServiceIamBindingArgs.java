// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.iap.inputs.WebBackendServiceIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebBackendServiceIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebBackendServiceIamBindingArgs Empty = new WebBackendServiceIamBindingArgs();

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<WebBackendServiceIamBindingConditionArgs> condition;

    public Output<WebBackendServiceIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    @Import(name="members", required=true)
      private final Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.iap.WebBackendServiceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="webBackendService", required=true)
      private final Output<String> webBackendService;

    public Output<String> getWebBackendService() {
        return this.webBackendService;
    }

    public WebBackendServiceIamBindingArgs(
        @Nullable Output<WebBackendServiceIamBindingConditionArgs> condition,
        Output<List<String>> members,
        @Nullable Output<String> project,
        Output<String> role,
        Output<String> webBackendService) {
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.webBackendService = Objects.requireNonNull(webBackendService, "expected parameter 'webBackendService' to be non-null");
    }

    private WebBackendServiceIamBindingArgs() {
        this.condition = Codegen.empty();
        this.members = Codegen.empty();
        this.project = Codegen.empty();
        this.role = Codegen.empty();
        this.webBackendService = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebBackendServiceIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebBackendServiceIamBindingConditionArgs> condition;
        private Output<List<String>> members;
        private @Nullable Output<String> project;
        private Output<String> role;
        private Output<String> webBackendService;

        public Builder() {
    	      // Empty
        }

        public Builder(WebBackendServiceIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.webBackendService = defaults.webBackendService;
        }

        public Builder condition(@Nullable Output<WebBackendServiceIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable WebBackendServiceIamBindingConditionArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder members(Output<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(List<String> members) {
            this.members = Output.of(Objects.requireNonNull(members));
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public Builder webBackendService(Output<String> webBackendService) {
            this.webBackendService = Objects.requireNonNull(webBackendService);
            return this;
        }
        public Builder webBackendService(String webBackendService) {
            this.webBackendService = Output.of(Objects.requireNonNull(webBackendService));
            return this;
        }        public WebBackendServiceIamBindingArgs build() {
            return new WebBackendServiceIamBindingArgs(condition, members, project, role, webBackendService);
        }
    }
}
