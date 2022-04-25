// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a user&#39;s secret store.
 * 
 */
public final class UserSecretStoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserSecretStoreArgs Empty = new UserSecretStoreArgs();

    /**
     * The ID of the user&#39;s Key vault.
     * 
     */
    @Import(name="keyVaultId")
    private @Nullable Output<String> keyVaultId;

    /**
     * @return The ID of the user&#39;s Key vault.
     * 
     */
    public Optional<Output<String>> keyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
    }

    /**
     * The URI of the user&#39;s Key vault.
     * 
     */
    @Import(name="keyVaultUri")
    private @Nullable Output<String> keyVaultUri;

    /**
     * @return The URI of the user&#39;s Key vault.
     * 
     */
    public Optional<Output<String>> keyVaultUri() {
        return Optional.ofNullable(this.keyVaultUri);
    }

    private UserSecretStoreArgs() {}

    private UserSecretStoreArgs(UserSecretStoreArgs $) {
        this.keyVaultId = $.keyVaultId;
        this.keyVaultUri = $.keyVaultUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserSecretStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserSecretStoreArgs $;

        public Builder() {
            $ = new UserSecretStoreArgs();
        }

        public Builder(UserSecretStoreArgs defaults) {
            $ = new UserSecretStoreArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyVaultId The ID of the user&#39;s Key vault.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(@Nullable Output<String> keyVaultId) {
            $.keyVaultId = keyVaultId;
            return this;
        }

        /**
         * @param keyVaultId The ID of the user&#39;s Key vault.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(String keyVaultId) {
            return keyVaultId(Output.of(keyVaultId));
        }

        /**
         * @param keyVaultUri The URI of the user&#39;s Key vault.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultUri(@Nullable Output<String> keyVaultUri) {
            $.keyVaultUri = keyVaultUri;
            return this;
        }

        /**
         * @param keyVaultUri The URI of the user&#39;s Key vault.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultUri(String keyVaultUri) {
            return keyVaultUri(Output.of(keyVaultUri));
        }

        public UserSecretStoreArgs build() {
            return $;
        }
    }

}
