// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.apigateway.inputs.ApiIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiIamMemberArgs Empty = new ApiIamMemberArgs();

    @InputImport(name="api", required=true)
      private final Input<String> api;

    public Input<String> getApi() {
        return this.api;
    }

    @InputImport(name="condition")
      private final @Nullable Input<ApiIamMemberConditionArgs> condition;

    public Input<ApiIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="member", required=true)
      private final Input<String> member;

    public Input<String> getMember() {
        return this.member;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.apigateway.ApiIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
      private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public ApiIamMemberArgs(
        Input<String> api,
        @Nullable Input<ApiIamMemberConditionArgs> condition,
        Input<String> member,
        @Nullable Input<String> project,
        Input<String> role) {
        this.api = Objects.requireNonNull(api, "expected parameter 'api' to be non-null");
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private ApiIamMemberArgs() {
        this.api = Input.empty();
        this.condition = Input.empty();
        this.member = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> api;
        private @Nullable Input<ApiIamMemberConditionArgs> condition;
        private Input<String> member;
        private @Nullable Input<String> project;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.api = defaults.api;
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder api(Input<String> api) {
            this.api = Objects.requireNonNull(api);
            return this;
        }

        public Builder api(String api) {
            this.api = Input.of(Objects.requireNonNull(api));
            return this;
        }

        public Builder condition(@Nullable Input<ApiIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable ApiIamMemberConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder member(Input<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }

        public Builder member(String member) {
            this.member = Input.of(Objects.requireNonNull(member));
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

        public Builder role(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder role(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }
        public ApiIamMemberArgs build() {
            return new ApiIamMemberArgs(api, condition, member, project, role);
        }
    }
}
