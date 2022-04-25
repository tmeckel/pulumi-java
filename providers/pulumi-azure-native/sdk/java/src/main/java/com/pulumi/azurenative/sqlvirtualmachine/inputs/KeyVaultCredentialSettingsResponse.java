// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configure your SQL virtual machine to be able to connect to the Azure Key Vault service.
 * 
 */
public final class KeyVaultCredentialSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final KeyVaultCredentialSettingsResponse Empty = new KeyVaultCredentialSettingsResponse();

    /**
     * Azure Key Vault url.
     * 
     */
    @Import(name="azureKeyVaultUrl")
    private @Nullable String azureKeyVaultUrl;

    /**
     * @return Azure Key Vault url.
     * 
     */
    public Optional<String> azureKeyVaultUrl() {
        return Optional.ofNullable(this.azureKeyVaultUrl);
    }

    /**
     * Credential name.
     * 
     */
    @Import(name="credentialName")
    private @Nullable String credentialName;

    /**
     * @return Credential name.
     * 
     */
    public Optional<String> credentialName() {
        return Optional.ofNullable(this.credentialName);
    }

    /**
     * Enable or disable key vault credential setting.
     * 
     */
    @Import(name="enable")
    private @Nullable Boolean enable;

    /**
     * @return Enable or disable key vault credential setting.
     * 
     */
    public Optional<Boolean> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * Service principal name to access key vault.
     * 
     */
    @Import(name="servicePrincipalName")
    private @Nullable String servicePrincipalName;

    /**
     * @return Service principal name to access key vault.
     * 
     */
    public Optional<String> servicePrincipalName() {
        return Optional.ofNullable(this.servicePrincipalName);
    }

    private KeyVaultCredentialSettingsResponse() {}

    private KeyVaultCredentialSettingsResponse(KeyVaultCredentialSettingsResponse $) {
        this.azureKeyVaultUrl = $.azureKeyVaultUrl;
        this.credentialName = $.credentialName;
        this.enable = $.enable;
        this.servicePrincipalName = $.servicePrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyVaultCredentialSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultCredentialSettingsResponse $;

        public Builder() {
            $ = new KeyVaultCredentialSettingsResponse();
        }

        public Builder(KeyVaultCredentialSettingsResponse defaults) {
            $ = new KeyVaultCredentialSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureKeyVaultUrl Azure Key Vault url.
         * 
         * @return builder
         * 
         */
        public Builder azureKeyVaultUrl(@Nullable String azureKeyVaultUrl) {
            $.azureKeyVaultUrl = azureKeyVaultUrl;
            return this;
        }

        /**
         * @param credentialName Credential name.
         * 
         * @return builder
         * 
         */
        public Builder credentialName(@Nullable String credentialName) {
            $.credentialName = credentialName;
            return this;
        }

        /**
         * @param enable Enable or disable key vault credential setting.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Boolean enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param servicePrincipalName Service principal name to access key vault.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalName(@Nullable String servicePrincipalName) {
            $.servicePrincipalName = servicePrincipalName;
            return this;
        }

        public KeyVaultCredentialSettingsResponse build() {
            return $;
        }
    }

}
