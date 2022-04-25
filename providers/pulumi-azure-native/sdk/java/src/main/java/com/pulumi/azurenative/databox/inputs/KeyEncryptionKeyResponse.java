// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.inputs.IdentityPropertiesResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encryption key containing details about key to encrypt different keys.
 * 
 */
public final class KeyEncryptionKeyResponse extends com.pulumi.resources.InvokeArgs {

    public static final KeyEncryptionKeyResponse Empty = new KeyEncryptionKeyResponse();

    /**
     * Managed identity properties used for key encryption.
     * 
     */
    @Import(name="identityProperties")
    private @Nullable IdentityPropertiesResponse identityProperties;

    /**
     * @return Managed identity properties used for key encryption.
     * 
     */
    public Optional<IdentityPropertiesResponse> identityProperties() {
        return Optional.ofNullable(this.identityProperties);
    }

    /**
     * Type of encryption key used for key encryption.
     * 
     */
    @Import(name="kekType", required=true)
    private String kekType;

    /**
     * @return Type of encryption key used for key encryption.
     * 
     */
    public String kekType() {
        return this.kekType;
    }

    /**
     * Key encryption key. It is required in case of Customer managed KekType.
     * 
     */
    @Import(name="kekUrl")
    private @Nullable String kekUrl;

    /**
     * @return Key encryption key. It is required in case of Customer managed KekType.
     * 
     */
    public Optional<String> kekUrl() {
        return Optional.ofNullable(this.kekUrl);
    }

    /**
     * Kek vault resource id. It is required in case of Customer managed KekType.
     * 
     */
    @Import(name="kekVaultResourceID")
    private @Nullable String kekVaultResourceID;

    /**
     * @return Kek vault resource id. It is required in case of Customer managed KekType.
     * 
     */
    public Optional<String> kekVaultResourceID() {
        return Optional.ofNullable(this.kekVaultResourceID);
    }

    private KeyEncryptionKeyResponse() {}

    private KeyEncryptionKeyResponse(KeyEncryptionKeyResponse $) {
        this.identityProperties = $.identityProperties;
        this.kekType = $.kekType;
        this.kekUrl = $.kekUrl;
        this.kekVaultResourceID = $.kekVaultResourceID;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyEncryptionKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyEncryptionKeyResponse $;

        public Builder() {
            $ = new KeyEncryptionKeyResponse();
        }

        public Builder(KeyEncryptionKeyResponse defaults) {
            $ = new KeyEncryptionKeyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityProperties Managed identity properties used for key encryption.
         * 
         * @return builder
         * 
         */
        public Builder identityProperties(@Nullable IdentityPropertiesResponse identityProperties) {
            $.identityProperties = identityProperties;
            return this;
        }

        /**
         * @param kekType Type of encryption key used for key encryption.
         * 
         * @return builder
         * 
         */
        public Builder kekType(String kekType) {
            $.kekType = kekType;
            return this;
        }

        /**
         * @param kekUrl Key encryption key. It is required in case of Customer managed KekType.
         * 
         * @return builder
         * 
         */
        public Builder kekUrl(@Nullable String kekUrl) {
            $.kekUrl = kekUrl;
            return this;
        }

        /**
         * @param kekVaultResourceID Kek vault resource id. It is required in case of Customer managed KekType.
         * 
         * @return builder
         * 
         */
        public Builder kekVaultResourceID(@Nullable String kekVaultResourceID) {
            $.kekVaultResourceID = kekVaultResourceID;
            return this;
        }

        public KeyEncryptionKeyResponse build() {
            $.kekType = Codegen.stringProp("kekType").arg($.kekType).def("MicrosoftManaged").require();
            return $;
        }
    }

}
