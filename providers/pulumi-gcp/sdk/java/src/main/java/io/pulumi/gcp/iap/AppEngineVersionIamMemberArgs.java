// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.iap.inputs.AppEngineVersionIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppEngineVersionIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppEngineVersionIamMemberArgs Empty = new AppEngineVersionIamMemberArgs();

    /**
     * Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="appId", required=true)
      private final Output<String> appId;

    public Output<String> getAppId() {
        return this.appId;
    }

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<AppEngineVersionIamMemberConditionArgs> condition;

    public Output<AppEngineVersionIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    @Import(name="member", required=true)
      private final Output<String> member;

    public Output<String> getMember() {
        return this.member;
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
     * `gcp.iap.AppEngineVersionIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    /**
     * Service id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="service", required=true)
      private final Output<String> service;

    public Output<String> getService() {
        return this.service;
    }

    /**
     * Version id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="versionId", required=true)
      private final Output<String> versionId;

    public Output<String> getVersionId() {
        return this.versionId;
    }

    public AppEngineVersionIamMemberArgs(
        Output<String> appId,
        @Nullable Output<AppEngineVersionIamMemberConditionArgs> condition,
        Output<String> member,
        @Nullable Output<String> project,
        Output<String> role,
        Output<String> service,
        Output<String> versionId) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
        this.versionId = Objects.requireNonNull(versionId, "expected parameter 'versionId' to be non-null");
    }

    private AppEngineVersionIamMemberArgs() {
        this.appId = Codegen.empty();
        this.condition = Codegen.empty();
        this.member = Codegen.empty();
        this.project = Codegen.empty();
        this.role = Codegen.empty();
        this.service = Codegen.empty();
        this.versionId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineVersionIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appId;
        private @Nullable Output<AppEngineVersionIamMemberConditionArgs> condition;
        private Output<String> member;
        private @Nullable Output<String> project;
        private Output<String> role;
        private Output<String> service;
        private Output<String> versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEngineVersionIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.service = defaults.service;
    	      this.versionId = defaults.versionId;
        }

        public Builder appId(Output<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder appId(String appId) {
            this.appId = Output.of(Objects.requireNonNull(appId));
            return this;
        }
        public Builder condition(@Nullable Output<AppEngineVersionIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable AppEngineVersionIamMemberConditionArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder member(Output<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }
        public Builder member(String member) {
            this.member = Output.of(Objects.requireNonNull(member));
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
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public Builder service(Output<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder service(String service) {
            this.service = Output.of(Objects.requireNonNull(service));
            return this;
        }
        public Builder versionId(Output<String> versionId) {
            this.versionId = Objects.requireNonNull(versionId);
            return this;
        }
        public Builder versionId(String versionId) {
            this.versionId = Output.of(Objects.requireNonNull(versionId));
            return this;
        }        public AppEngineVersionIamMemberArgs build() {
            return new AppEngineVersionIamMemberArgs(appId, condition, member, project, role, service, versionId);
        }
    }
}
