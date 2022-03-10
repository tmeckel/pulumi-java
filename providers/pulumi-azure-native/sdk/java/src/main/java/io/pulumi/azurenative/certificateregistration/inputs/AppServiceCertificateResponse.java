// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.certificateregistration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Key Vault container for a certificate that is purchased through Azure.
 * 
 */
public final class AppServiceCertificateResponse extends io.pulumi.resources.InvokeArgs {

    public static final AppServiceCertificateResponse Empty = new AppServiceCertificateResponse();

    /**
     * Key Vault resource Id.
     * 
     */
    @InputImport(name="keyVaultId")
      private final @Nullable String keyVaultId;

    public Optional<String> getKeyVaultId() {
        return this.keyVaultId == null ? Optional.empty() : Optional.ofNullable(this.keyVaultId);
    }

    /**
     * Key Vault secret name.
     * 
     */
    @InputImport(name="keyVaultSecretName")
      private final @Nullable String keyVaultSecretName;

    public Optional<String> getKeyVaultSecretName() {
        return this.keyVaultSecretName == null ? Optional.empty() : Optional.ofNullable(this.keyVaultSecretName);
    }

    /**
     * Status of the Key Vault secret.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public AppServiceCertificateResponse(
        @Nullable String keyVaultId,
        @Nullable String keyVaultSecretName,
        String provisioningState) {
        this.keyVaultId = keyVaultId;
        this.keyVaultSecretName = keyVaultSecretName;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private AppServiceCertificateResponse() {
        this.keyVaultId = null;
        this.keyVaultSecretName = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppServiceCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyVaultId;
        private @Nullable String keyVaultSecretName;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(AppServiceCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.keyVaultSecretName = defaults.keyVaultSecretName;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder keyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }

        public Builder keyVaultSecretName(@Nullable String keyVaultSecretName) {
            this.keyVaultSecretName = keyVaultSecretName;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public AppServiceCertificateResponse build() {
            return new AppServiceCertificateResponse(keyVaultId, keyVaultSecretName, provisioningState);
        }
    }
}
