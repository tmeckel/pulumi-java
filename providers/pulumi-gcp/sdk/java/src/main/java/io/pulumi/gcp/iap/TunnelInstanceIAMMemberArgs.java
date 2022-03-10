// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.iap.inputs.TunnelInstanceIAMMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TunnelInstanceIAMMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final TunnelInstanceIAMMemberArgs Empty = new TunnelInstanceIAMMemberArgs();

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @InputImport(name="condition")
      private final @Nullable Input<TunnelInstanceIAMMemberConditionArgs> condition;

    public Input<TunnelInstanceIAMMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="instance", required=true)
      private final Input<String> instance;

    public Input<String> getInstance() {
        return this.instance;
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
     * `gcp.iap.TunnelInstanceIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
      private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    @InputImport(name="zone")
      private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public TunnelInstanceIAMMemberArgs(
        @Nullable Input<TunnelInstanceIAMMemberConditionArgs> condition,
        Input<String> instance,
        Input<String> member,
        @Nullable Input<String> project,
        Input<String> role,
        @Nullable Input<String> zone) {
        this.condition = condition;
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.zone = zone;
    }

    private TunnelInstanceIAMMemberArgs() {
        this.condition = Input.empty();
        this.instance = Input.empty();
        this.member = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TunnelInstanceIAMMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TunnelInstanceIAMMemberConditionArgs> condition;
        private Input<String> instance;
        private Input<String> member;
        private @Nullable Input<String> project;
        private Input<String> role;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(TunnelInstanceIAMMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.instance = defaults.instance;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.zone = defaults.zone;
        }

        public Builder condition(@Nullable Input<TunnelInstanceIAMMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable TunnelInstanceIAMMemberConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder instance(Input<String> instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder instance(String instance) {
            this.instance = Input.of(Objects.requireNonNull(instance));
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

        public Builder zone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public TunnelInstanceIAMMemberArgs build() {
            return new TunnelInstanceIAMMemberArgs(condition, instance, member, project, role, zone);
        }
    }
}
