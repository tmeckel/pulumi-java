// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KeyVaultCertificateSourceParametersResponse {
    /**
     * @return Describes the action that shall be taken when the certificate is removed from Key Vault.
     * 
     */
    private final String deleteRule;
    private final String odataType;
    /**
     * @return Resource group of the user&#39;s Key Vault containing the SSL certificate
     * 
     */
    private final String resourceGroupName;
    /**
     * @return The name of Key Vault Secret (representing the full certificate PFX) in Key Vault.
     * 
     */
    private final String secretName;
    /**
     * @return The version(GUID) of Key Vault Secret in Key Vault.
     * 
     */
    private final @Nullable String secretVersion;
    /**
     * @return Subscription Id of the user&#39;s Key Vault containing the SSL certificate
     * 
     */
    private final String subscriptionId;
    /**
     * @return Describes the action that shall be taken when the certificate is updated in Key Vault.
     * 
     */
    private final String updateRule;
    /**
     * @return The name of the user&#39;s Key Vault containing the SSL certificate
     * 
     */
    private final String vaultName;

    @CustomType.Constructor
    private KeyVaultCertificateSourceParametersResponse(
        @CustomType.Parameter("deleteRule") String deleteRule,
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("secretName") String secretName,
        @CustomType.Parameter("secretVersion") @Nullable String secretVersion,
        @CustomType.Parameter("subscriptionId") String subscriptionId,
        @CustomType.Parameter("updateRule") String updateRule,
        @CustomType.Parameter("vaultName") String vaultName) {
        this.deleteRule = deleteRule;
        this.odataType = odataType;
        this.resourceGroupName = resourceGroupName;
        this.secretName = secretName;
        this.secretVersion = secretVersion;
        this.subscriptionId = subscriptionId;
        this.updateRule = updateRule;
        this.vaultName = vaultName;
    }

    /**
     * @return Describes the action that shall be taken when the certificate is removed from Key Vault.
     * 
     */
    public String deleteRule() {
        return this.deleteRule;
    }
    public String odataType() {
        return this.odataType;
    }
    /**
     * @return Resource group of the user&#39;s Key Vault containing the SSL certificate
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The name of Key Vault Secret (representing the full certificate PFX) in Key Vault.
     * 
     */
    public String secretName() {
        return this.secretName;
    }
    /**
     * @return The version(GUID) of Key Vault Secret in Key Vault.
     * 
     */
    public Optional<String> secretVersion() {
        return Optional.ofNullable(this.secretVersion);
    }
    /**
     * @return Subscription Id of the user&#39;s Key Vault containing the SSL certificate
     * 
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }
    /**
     * @return Describes the action that shall be taken when the certificate is updated in Key Vault.
     * 
     */
    public String updateRule() {
        return this.updateRule;
    }
    /**
     * @return The name of the user&#39;s Key Vault containing the SSL certificate
     * 
     */
    public String vaultName() {
        return this.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultCertificateSourceParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deleteRule;
        private String odataType;
        private String resourceGroupName;
        private String secretName;
        private @Nullable String secretVersion;
        private String subscriptionId;
        private String updateRule;
        private String vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultCertificateSourceParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteRule = defaults.deleteRule;
    	      this.odataType = defaults.odataType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secretName = defaults.secretName;
    	      this.secretVersion = defaults.secretVersion;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.updateRule = defaults.updateRule;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder deleteRule(String deleteRule) {
            this.deleteRule = Objects.requireNonNull(deleteRule);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder secretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }
        public Builder secretVersion(@Nullable String secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public Builder updateRule(String updateRule) {
            this.updateRule = Objects.requireNonNull(updateRule);
            return this;
        }
        public Builder vaultName(String vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }        public KeyVaultCertificateSourceParametersResponse build() {
            return new KeyVaultCertificateSourceParametersResponse(deleteRule, odataType, resourceGroupName, secretName, secretVersion, subscriptionId, updateRule, vaultName);
        }
    }
}
