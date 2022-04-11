// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.InfrastructureEncryptionState;
import io.pulumi.azurenative.recoveryservices.inputs.CmkKekIdentityArgs;
import io.pulumi.azurenative.recoveryservices.inputs.CmkKeyVaultPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Customer Managed Key details of the resource.
 * 
 */
public final class VaultPropertiesEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VaultPropertiesEncryptionArgs Empty = new VaultPropertiesEncryptionArgs();

    /**
     * Enabling/Disabling the Double Encryption state
     * 
     */
    @Import(name="infrastructureEncryption")
      private final @Nullable Output<Either<String,InfrastructureEncryptionState>> infrastructureEncryption;

    public Output<Either<String,InfrastructureEncryptionState>> getInfrastructureEncryption() {
        return this.infrastructureEncryption == null ? Codegen.empty() : this.infrastructureEncryption;
    }

    /**
     * The details of the identity used for CMK
     * 
     */
    @Import(name="kekIdentity")
      private final @Nullable Output<CmkKekIdentityArgs> kekIdentity;

    public Output<CmkKekIdentityArgs> getKekIdentity() {
        return this.kekIdentity == null ? Codegen.empty() : this.kekIdentity;
    }

    /**
     * The properties of the Key Vault which hosts CMK
     * 
     */
    @Import(name="keyVaultProperties")
      private final @Nullable Output<CmkKeyVaultPropertiesArgs> keyVaultProperties;

    public Output<CmkKeyVaultPropertiesArgs> getKeyVaultProperties() {
        return this.keyVaultProperties == null ? Codegen.empty() : this.keyVaultProperties;
    }

    public VaultPropertiesEncryptionArgs(
        @Nullable Output<Either<String,InfrastructureEncryptionState>> infrastructureEncryption,
        @Nullable Output<CmkKekIdentityArgs> kekIdentity,
        @Nullable Output<CmkKeyVaultPropertiesArgs> keyVaultProperties) {
        this.infrastructureEncryption = infrastructureEncryption;
        this.kekIdentity = kekIdentity;
        this.keyVaultProperties = keyVaultProperties;
    }

    private VaultPropertiesEncryptionArgs() {
        this.infrastructureEncryption = Codegen.empty();
        this.kekIdentity = Codegen.empty();
        this.keyVaultProperties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPropertiesEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,InfrastructureEncryptionState>> infrastructureEncryption;
        private @Nullable Output<CmkKekIdentityArgs> kekIdentity;
        private @Nullable Output<CmkKeyVaultPropertiesArgs> keyVaultProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPropertiesEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infrastructureEncryption = defaults.infrastructureEncryption;
    	      this.kekIdentity = defaults.kekIdentity;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
        }

        public Builder infrastructureEncryption(@Nullable Output<Either<String,InfrastructureEncryptionState>> infrastructureEncryption) {
            this.infrastructureEncryption = infrastructureEncryption;
            return this;
        }
        public Builder infrastructureEncryption(@Nullable Either<String,InfrastructureEncryptionState> infrastructureEncryption) {
            this.infrastructureEncryption = Codegen.ofNullable(infrastructureEncryption);
            return this;
        }
        public Builder kekIdentity(@Nullable Output<CmkKekIdentityArgs> kekIdentity) {
            this.kekIdentity = kekIdentity;
            return this;
        }
        public Builder kekIdentity(@Nullable CmkKekIdentityArgs kekIdentity) {
            this.kekIdentity = Codegen.ofNullable(kekIdentity);
            return this;
        }
        public Builder keyVaultProperties(@Nullable Output<CmkKeyVaultPropertiesArgs> keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }
        public Builder keyVaultProperties(@Nullable CmkKeyVaultPropertiesArgs keyVaultProperties) {
            this.keyVaultProperties = Codegen.ofNullable(keyVaultProperties);
            return this;
        }        public VaultPropertiesEncryptionArgs build() {
            return new VaultPropertiesEncryptionArgs(infrastructureEncryption, kekIdentity, keyVaultProperties);
        }
    }
}
