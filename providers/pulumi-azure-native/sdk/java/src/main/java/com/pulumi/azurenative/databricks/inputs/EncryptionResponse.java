// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The object that contains details of encryption used on the workspace.
 * 
 */
public final class EncryptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final EncryptionResponse Empty = new EncryptionResponse();

    /**
     * The name of KeyVault key.
     * 
     */
    @Import(name="keyName")
    private @Nullable String keyName;

    /**
     * @return The name of KeyVault key.
     * 
     */
    public Optional<String> keyName() {
        return Optional.ofNullable(this.keyName);
    }

    /**
     * The encryption keySource (provider). Possible values (case-insensitive):  Default, Microsoft.Keyvault
     * 
     */
    @Import(name="keySource")
    private @Nullable String keySource;

    /**
     * @return The encryption keySource (provider). Possible values (case-insensitive):  Default, Microsoft.Keyvault
     * 
     */
    public Optional<String> keySource() {
        return Optional.ofNullable(this.keySource);
    }

    /**
     * The Uri of KeyVault.
     * 
     */
    @Import(name="keyVaultUri")
    private @Nullable String keyVaultUri;

    /**
     * @return The Uri of KeyVault.
     * 
     */
    public Optional<String> keyVaultUri() {
        return Optional.ofNullable(this.keyVaultUri);
    }

    /**
     * The version of KeyVault key.
     * 
     */
    @Import(name="keyVersion")
    private @Nullable String keyVersion;

    /**
     * @return The version of KeyVault key.
     * 
     */
    public Optional<String> keyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }

    private EncryptionResponse() {}

    private EncryptionResponse(EncryptionResponse $) {
        this.keyName = $.keyName;
        this.keySource = $.keySource;
        this.keyVaultUri = $.keyVaultUri;
        this.keyVersion = $.keyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionResponse $;

        public Builder() {
            $ = new EncryptionResponse();
        }

        public Builder(EncryptionResponse defaults) {
            $ = new EncryptionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyName The name of KeyVault key.
         * 
         * @return builder
         * 
         */
        public Builder keyName(@Nullable String keyName) {
            $.keyName = keyName;
            return this;
        }

        /**
         * @param keySource The encryption keySource (provider). Possible values (case-insensitive):  Default, Microsoft.Keyvault
         * 
         * @return builder
         * 
         */
        public Builder keySource(@Nullable String keySource) {
            $.keySource = keySource;
            return this;
        }

        /**
         * @param keyVaultUri The Uri of KeyVault.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultUri(@Nullable String keyVaultUri) {
            $.keyVaultUri = keyVaultUri;
            return this;
        }

        /**
         * @param keyVersion The version of KeyVault key.
         * 
         * @return builder
         * 
         */
        public Builder keyVersion(@Nullable String keyVersion) {
            $.keyVersion = keyVersion;
            return this;
        }

        public EncryptionResponse build() {
            $.keySource = Codegen.stringProp("keySource").arg($.keySource).def("Default").getNullable();
            return $;
        }
    }

}
