// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of a user's secret store.
 * 
 */
public final class UserSecretStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserSecretStoreArgs Empty = new UserSecretStoreArgs();

    /**
     * The ID of the user's Key vault.
     * 
     */
    @Import(name="keyVaultId")
      private final @Nullable Output<String> keyVaultId;

    public Output<String> getKeyVaultId() {
        return this.keyVaultId == null ? Codegen.empty() : this.keyVaultId;
    }

    /**
     * The URI of the user's Key vault.
     * 
     */
    @Import(name="keyVaultUri")
      private final @Nullable Output<String> keyVaultUri;

    public Output<String> getKeyVaultUri() {
        return this.keyVaultUri == null ? Codegen.empty() : this.keyVaultUri;
    }

    public UserSecretStoreArgs(
        @Nullable Output<String> keyVaultId,
        @Nullable Output<String> keyVaultUri) {
        this.keyVaultId = keyVaultId;
        this.keyVaultUri = keyVaultUri;
    }

    private UserSecretStoreArgs() {
        this.keyVaultId = Codegen.empty();
        this.keyVaultUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserSecretStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyVaultId;
        private @Nullable Output<String> keyVaultUri;

        public Builder() {
    	      // Empty
        }

        public Builder(UserSecretStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.keyVaultUri = defaults.keyVaultUri;
        }

        public Builder keyVaultId(@Nullable Output<String> keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }
        public Builder keyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = Codegen.ofNullable(keyVaultId);
            return this;
        }
        public Builder keyVaultUri(@Nullable Output<String> keyVaultUri) {
            this.keyVaultUri = keyVaultUri;
            return this;
        }
        public Builder keyVaultUri(@Nullable String keyVaultUri) {
            this.keyVaultUri = Codegen.ofNullable(keyVaultUri);
            return this;
        }        public UserSecretStoreArgs build() {
            return new UserSecretStoreArgs(keyVaultId, keyVaultUri);
        }
    }
}
