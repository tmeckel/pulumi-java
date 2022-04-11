// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssoadmin.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountAssignmentState extends io.pulumi.resources.ResourceArgs {

    public static final AccountAssignmentState Empty = new AccountAssignmentState();

    /**
     * The Amazon Resource Name (ARN) of the SSO Instance.
     * 
     */
    @Import(name="instanceArn")
      private final @Nullable Output<String> instanceArn;

    public Output<String> getInstanceArn() {
        return this.instanceArn == null ? Codegen.empty() : this.instanceArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Permission Set that the admin wants to grant the principal access to.
     * 
     */
    @Import(name="permissionSetArn")
      private final @Nullable Output<String> permissionSetArn;

    public Output<String> getPermissionSetArn() {
        return this.permissionSetArn == null ? Codegen.empty() : this.permissionSetArn;
    }

    /**
     * An identifier for an object in SSO, such as a user or group. PrincipalIds are GUIDs (For example, `f81d4fae-7dec-11d0-a765-00a0c91e6bf6`).
     * 
     */
    @Import(name="principalId")
      private final @Nullable Output<String> principalId;

    public Output<String> getPrincipalId() {
        return this.principalId == null ? Codegen.empty() : this.principalId;
    }

    /**
     * The entity type for which the assignment will be created. Valid values: `USER`, `GROUP`.
     * 
     */
    @Import(name="principalType")
      private final @Nullable Output<String> principalType;

    public Output<String> getPrincipalType() {
        return this.principalType == null ? Codegen.empty() : this.principalType;
    }

    /**
     * An AWS account identifier, typically a 10-12 digit string.
     * 
     */
    @Import(name="targetId")
      private final @Nullable Output<String> targetId;

    public Output<String> getTargetId() {
        return this.targetId == null ? Codegen.empty() : this.targetId;
    }

    /**
     * The entity type for which the assignment will be created. Valid values: `AWS_ACCOUNT`.
     * 
     */
    @Import(name="targetType")
      private final @Nullable Output<String> targetType;

    public Output<String> getTargetType() {
        return this.targetType == null ? Codegen.empty() : this.targetType;
    }

    public AccountAssignmentState(
        @Nullable Output<String> instanceArn,
        @Nullable Output<String> permissionSetArn,
        @Nullable Output<String> principalId,
        @Nullable Output<String> principalType,
        @Nullable Output<String> targetId,
        @Nullable Output<String> targetType) {
        this.instanceArn = instanceArn;
        this.permissionSetArn = permissionSetArn;
        this.principalId = principalId;
        this.principalType = principalType;
        this.targetId = targetId;
        this.targetType = targetType;
    }

    private AccountAssignmentState() {
        this.instanceArn = Codegen.empty();
        this.permissionSetArn = Codegen.empty();
        this.principalId = Codegen.empty();
        this.principalType = Codegen.empty();
        this.targetId = Codegen.empty();
        this.targetType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountAssignmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instanceArn;
        private @Nullable Output<String> permissionSetArn;
        private @Nullable Output<String> principalId;
        private @Nullable Output<String> principalType;
        private @Nullable Output<String> targetId;
        private @Nullable Output<String> targetType;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountAssignmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceArn = defaults.instanceArn;
    	      this.permissionSetArn = defaults.permissionSetArn;
    	      this.principalId = defaults.principalId;
    	      this.principalType = defaults.principalType;
    	      this.targetId = defaults.targetId;
    	      this.targetType = defaults.targetType;
        }

        public Builder instanceArn(@Nullable Output<String> instanceArn) {
            this.instanceArn = instanceArn;
            return this;
        }
        public Builder instanceArn(@Nullable String instanceArn) {
            this.instanceArn = Codegen.ofNullable(instanceArn);
            return this;
        }
        public Builder permissionSetArn(@Nullable Output<String> permissionSetArn) {
            this.permissionSetArn = permissionSetArn;
            return this;
        }
        public Builder permissionSetArn(@Nullable String permissionSetArn) {
            this.permissionSetArn = Codegen.ofNullable(permissionSetArn);
            return this;
        }
        public Builder principalId(@Nullable Output<String> principalId) {
            this.principalId = principalId;
            return this;
        }
        public Builder principalId(@Nullable String principalId) {
            this.principalId = Codegen.ofNullable(principalId);
            return this;
        }
        public Builder principalType(@Nullable Output<String> principalType) {
            this.principalType = principalType;
            return this;
        }
        public Builder principalType(@Nullable String principalType) {
            this.principalType = Codegen.ofNullable(principalType);
            return this;
        }
        public Builder targetId(@Nullable Output<String> targetId) {
            this.targetId = targetId;
            return this;
        }
        public Builder targetId(@Nullable String targetId) {
            this.targetId = Codegen.ofNullable(targetId);
            return this;
        }
        public Builder targetType(@Nullable Output<String> targetType) {
            this.targetType = targetType;
            return this;
        }
        public Builder targetType(@Nullable String targetType) {
            this.targetType = Codegen.ofNullable(targetType);
            return this;
        }        public AccountAssignmentState build() {
            return new AccountAssignmentState(instanceArn, permissionSetArn, principalId, principalType, targetId, targetType);
        }
    }
}
