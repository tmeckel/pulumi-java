// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.InfrastructureEncryptionState;
import io.pulumi.azurenative.recoveryservices.inputs.CmkKekIdentityArgs;
import io.pulumi.azurenative.recoveryservices.inputs.CmkKeyVaultPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="infrastructureEncryption")
      private final @Nullable Input<Either<String,InfrastructureEncryptionState>> infrastructureEncryption;

    public Input<Either<String,InfrastructureEncryptionState>> getInfrastructureEncryption() {
        return this.infrastructureEncryption == null ? Input.empty() : this.infrastructureEncryption;
    }

    /**
     * The details of the identity used for CMK
     * 
     */
    @InputImport(name="kekIdentity")
      private final @Nullable Input<CmkKekIdentityArgs> kekIdentity;

    public Input<CmkKekIdentityArgs> getKekIdentity() {
        return this.kekIdentity == null ? Input.empty() : this.kekIdentity;
    }

    /**
     * The properties of the Key Vault which hosts CMK
     * 
     */
    @InputImport(name="keyVaultProperties")
      private final @Nullable Input<CmkKeyVaultPropertiesArgs> keyVaultProperties;

    public Input<CmkKeyVaultPropertiesArgs> getKeyVaultProperties() {
        return this.keyVaultProperties == null ? Input.empty() : this.keyVaultProperties;
    }

    public VaultPropertiesEncryptionArgs(
        @Nullable Input<Either<String,InfrastructureEncryptionState>> infrastructureEncryption,
        @Nullable Input<CmkKekIdentityArgs> kekIdentity,
        @Nullable Input<CmkKeyVaultPropertiesArgs> keyVaultProperties) {
        this.infrastructureEncryption = infrastructureEncryption;
        this.kekIdentity = kekIdentity;
        this.keyVaultProperties = keyVaultProperties;
    }

    private VaultPropertiesEncryptionArgs() {
        this.infrastructureEncryption = Input.empty();
        this.kekIdentity = Input.empty();
        this.keyVaultProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPropertiesEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,InfrastructureEncryptionState>> infrastructureEncryption;
        private @Nullable Input<CmkKekIdentityArgs> kekIdentity;
        private @Nullable Input<CmkKeyVaultPropertiesArgs> keyVaultProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPropertiesEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infrastructureEncryption = defaults.infrastructureEncryption;
    	      this.kekIdentity = defaults.kekIdentity;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
        }

        public Builder infrastructureEncryption(@Nullable Input<Either<String,InfrastructureEncryptionState>> infrastructureEncryption) {
            this.infrastructureEncryption = infrastructureEncryption;
            return this;
        }

        public Builder infrastructureEncryption(@Nullable Either<String,InfrastructureEncryptionState> infrastructureEncryption) {
            this.infrastructureEncryption = Input.ofNullable(infrastructureEncryption);
            return this;
        }

        public Builder kekIdentity(@Nullable Input<CmkKekIdentityArgs> kekIdentity) {
            this.kekIdentity = kekIdentity;
            return this;
        }

        public Builder kekIdentity(@Nullable CmkKekIdentityArgs kekIdentity) {
            this.kekIdentity = Input.ofNullable(kekIdentity);
            return this;
        }

        public Builder keyVaultProperties(@Nullable Input<CmkKeyVaultPropertiesArgs> keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }

        public Builder keyVaultProperties(@Nullable CmkKeyVaultPropertiesArgs keyVaultProperties) {
            this.keyVaultProperties = Input.ofNullable(keyVaultProperties);
            return this;
        }
        public VaultPropertiesEncryptionArgs build() {
            return new VaultPropertiesEncryptionArgs(infrastructureEncryption, kekIdentity, keyVaultProperties);
        }
    }
}
