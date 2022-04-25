// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.azurenative.storagecache.inputs.KeyVaultKeyReferenceResponseSourceVault;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a reference to Key Vault Key.
 * 
 */
public final class KeyVaultKeyReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final KeyVaultKeyReferenceResponse Empty = new KeyVaultKeyReferenceResponse();

    /**
     * The URL referencing a key encryption key in Key Vault.
     * 
     */
    @Import(name="keyUrl", required=true)
    private String keyUrl;

    /**
     * @return The URL referencing a key encryption key in Key Vault.
     * 
     */
    public String keyUrl() {
        return this.keyUrl;
    }

    /**
     * Describes a resource Id to source Key Vault.
     * 
     */
    @Import(name="sourceVault", required=true)
    private KeyVaultKeyReferenceResponseSourceVault sourceVault;

    /**
     * @return Describes a resource Id to source Key Vault.
     * 
     */
    public KeyVaultKeyReferenceResponseSourceVault sourceVault() {
        return this.sourceVault;
    }

    private KeyVaultKeyReferenceResponse() {}

    private KeyVaultKeyReferenceResponse(KeyVaultKeyReferenceResponse $) {
        this.keyUrl = $.keyUrl;
        this.sourceVault = $.sourceVault;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyVaultKeyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultKeyReferenceResponse $;

        public Builder() {
            $ = new KeyVaultKeyReferenceResponse();
        }

        public Builder(KeyVaultKeyReferenceResponse defaults) {
            $ = new KeyVaultKeyReferenceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyUrl The URL referencing a key encryption key in Key Vault.
         * 
         * @return builder
         * 
         */
        public Builder keyUrl(String keyUrl) {
            $.keyUrl = keyUrl;
            return this;
        }

        /**
         * @param sourceVault Describes a resource Id to source Key Vault.
         * 
         * @return builder
         * 
         */
        public Builder sourceVault(KeyVaultKeyReferenceResponseSourceVault sourceVault) {
            $.sourceVault = sourceVault;
            return this;
        }

        public KeyVaultKeyReferenceResponse build() {
            $.keyUrl = Objects.requireNonNull($.keyUrl, "expected parameter 'keyUrl' to be non-null");
            $.sourceVault = Objects.requireNonNull($.sourceVault, "expected parameter 'sourceVault' to be non-null");
            return $;
        }
    }

}
