// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.inputs;

import io.pulumi.azurenative.blueprint.enums.ManagedServiceIdentityType;
import io.pulumi.azurenative.blueprint.inputs.UserAssignedIdentityArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Managed identity generic object.
 * 
 */
public final class ManagedServiceIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedServiceIdentityArgs Empty = new ManagedServiceIdentityArgs();

    /**
     * Azure Active Directory principal ID associated with this Identity.
     * 
     */
    @Import(name="principalId")
      private final @Nullable Output<String> principalId;

    public Output<String> getPrincipalId() {
        return this.principalId == null ? Codegen.empty() : this.principalId;
    }

    /**
     * ID of the Azure Active Directory.
     * 
     */
    @Import(name="tenantId")
      private final @Nullable Output<String> tenantId;

    public Output<String> getTenantId() {
        return this.tenantId == null ? Codegen.empty() : this.tenantId;
    }

    /**
     * Type of the managed identity.
     * 
     */
    @Import(name="type", required=true)
      private final Output<Either<String,ManagedServiceIdentityType>> type;

    public Output<Either<String,ManagedServiceIdentityType>> getType() {
        return this.type;
    }

    /**
     * The list of user-assigned managed identities associated with the resource. Key is the Azure resource Id of the managed identity.
     * 
     */
    @Import(name="userAssignedIdentities")
      private final @Nullable Output<Map<String,UserAssignedIdentityArgs>> userAssignedIdentities;

    public Output<Map<String,UserAssignedIdentityArgs>> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Codegen.empty() : this.userAssignedIdentities;
    }

    public ManagedServiceIdentityArgs(
        @Nullable Output<String> principalId,
        @Nullable Output<String> tenantId,
        Output<Either<String,ManagedServiceIdentityType>> type,
        @Nullable Output<Map<String,UserAssignedIdentityArgs>> userAssignedIdentities) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private ManagedServiceIdentityArgs() {
        this.principalId = Codegen.empty();
        this.tenantId = Codegen.empty();
        this.type = Codegen.empty();
        this.userAssignedIdentities = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedServiceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> principalId;
        private @Nullable Output<String> tenantId;
        private Output<Either<String,ManagedServiceIdentityType>> type;
        private @Nullable Output<Map<String,UserAssignedIdentityArgs>> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedServiceIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder principalId(@Nullable Output<String> principalId) {
            this.principalId = principalId;
            return this;
        }
        public Builder principalId(@Nullable String principalId) {
            this.principalId = Codegen.ofNullable(principalId);
            return this;
        }
        public Builder tenantId(@Nullable Output<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Codegen.ofNullable(tenantId);
            return this;
        }
        public Builder type(Output<Either<String,ManagedServiceIdentityType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(Either<String,ManagedServiceIdentityType> type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Output<Map<String,UserAssignedIdentityArgs>> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Map<String,UserAssignedIdentityArgs> userAssignedIdentities) {
            this.userAssignedIdentities = Codegen.ofNullable(userAssignedIdentities);
            return this;
        }        public ManagedServiceIdentityArgs build() {
            return new ManagedServiceIdentityArgs(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
