// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.serviceAccount;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.serviceAccount.inputs.IAMMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final IAMMemberArgs Empty = new IAMMemberArgs();

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<IAMMemberConditionArgs> condition;

    public Output<IAMMemberConditionArgs> getCondition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    @Import(name="member", required=true)
      private final Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.serviceAccount.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    /**
     * The fully-qualified name of the service account to apply policy to.
     * 
     */
    @Import(name="serviceAccountId", required=true)
      private final Output<String> serviceAccountId;

    public Output<String> getServiceAccountId() {
        return this.serviceAccountId;
    }

    public IAMMemberArgs(
        @Nullable Output<IAMMemberConditionArgs> condition,
        Output<String> member,
        Output<String> role,
        Output<String> serviceAccountId) {
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.serviceAccountId = Objects.requireNonNull(serviceAccountId, "expected parameter 'serviceAccountId' to be non-null");
    }

    private IAMMemberArgs() {
        this.condition = Codegen.empty();
        this.member = Codegen.empty();
        this.role = Codegen.empty();
        this.serviceAccountId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IAMMemberConditionArgs> condition;
        private Output<String> member;
        private Output<String> role;
        private Output<String> serviceAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
    	      this.serviceAccountId = defaults.serviceAccountId;
        }

        public Builder condition(@Nullable Output<IAMMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable IAMMemberConditionArgs condition) {
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
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public Builder serviceAccountId(Output<String> serviceAccountId) {
            this.serviceAccountId = Objects.requireNonNull(serviceAccountId);
            return this;
        }
        public Builder serviceAccountId(String serviceAccountId) {
            this.serviceAccountId = Output.of(Objects.requireNonNull(serviceAccountId));
            return this;
        }        public IAMMemberArgs build() {
            return new IAMMemberArgs(condition, member, role, serviceAccountId);
        }
    }
}
