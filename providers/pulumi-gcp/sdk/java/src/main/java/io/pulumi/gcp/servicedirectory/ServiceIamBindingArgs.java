// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicedirectory;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.servicedirectory.inputs.ServiceIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceIamBindingArgs Empty = new ServiceIamBindingArgs();

    @InputImport(name="condition")
      private final @Nullable Input<ServiceIamBindingConditionArgs> condition;

    public Input<ServiceIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="members", required=true)
      private final Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.servicedirectory.ServiceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
      private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public ServiceIamBindingArgs(
        @Nullable Input<ServiceIamBindingConditionArgs> condition,
        Input<List<String>> members,
        @Nullable Input<String> name,
        Input<String> role) {
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.name = name;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private ServiceIamBindingArgs() {
        this.condition = Input.empty();
        this.members = Input.empty();
        this.name = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceIamBindingConditionArgs> condition;
        private Input<List<String>> members;
        private @Nullable Input<String> name;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.name = defaults.name;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Input<ServiceIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable ServiceIamBindingConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder members(Input<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder members(List<String> members) {
            this.members = Input.of(Objects.requireNonNull(members));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
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
        public ServiceIamBindingArgs build() {
            return new ServiceIamBindingArgs(condition, members, name, role);
        }
    }
}
