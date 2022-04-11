// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.notebooks.inputs.InstanceIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceIamMemberArgs Empty = new InstanceIamMemberArgs();

    @Import(name="condition")
      private final @Nullable Output<InstanceIamMemberConditionArgs> condition;

    public Output<InstanceIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="instanceName", required=true)
      private final Output<String> instanceName;

    public Output<String> getInstanceName() {
        return this.instanceName;
    }

    /**
     * A reference to the zone where the machine resides. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
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
     * `gcp.notebooks.InstanceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public InstanceIamMemberArgs(
        @Nullable Output<InstanceIamMemberConditionArgs> condition,
        Output<String> instanceName,
        @Nullable Output<String> location,
        Output<String> member,
        @Nullable Output<String> project,
        Output<String> role) {
        this.condition = condition;
        this.instanceName = Objects.requireNonNull(instanceName, "expected parameter 'instanceName' to be non-null");
        this.location = location;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private InstanceIamMemberArgs() {
        this.condition = Codegen.empty();
        this.instanceName = Codegen.empty();
        this.location = Codegen.empty();
        this.member = Codegen.empty();
        this.project = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceIamMemberConditionArgs> condition;
        private Output<String> instanceName;
        private @Nullable Output<String> location;
        private Output<String> member;
        private @Nullable Output<String> project;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.instanceName = defaults.instanceName;
    	      this.location = defaults.location;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<InstanceIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable InstanceIamMemberConditionArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder instanceName(Output<String> instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }
        public Builder instanceName(String instanceName) {
            this.instanceName = Output.of(Objects.requireNonNull(instanceName));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
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
        }        public InstanceIamMemberArgs build() {
            return new InstanceIamMemberArgs(condition, instanceName, location, member, project, role);
        }
    }
}
