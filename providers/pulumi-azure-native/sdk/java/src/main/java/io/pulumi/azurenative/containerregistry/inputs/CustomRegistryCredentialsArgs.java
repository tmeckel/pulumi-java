// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.SecretObjectArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the credentials that will be used to access a custom registry during a run.
 * 
 */
public final class CustomRegistryCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomRegistryCredentialsArgs Empty = new CustomRegistryCredentialsArgs();

    /**
     * Indicates the managed identity assigned to the custom credential. If a user-assigned identity
     * this value is the Client ID. If a system-assigned identity, the value will be `system`. In
     * the case of a system-assigned identity, the Client ID will be determined by the runner. This
     * identity may be used to authenticate to key vault to retrieve credentials or it may be the only
     * source of authentication used for accessing the registry.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<String> identity;

    public Input<String> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * The password for logging into the custom registry. The password is a secret
     * object that allows multiple ways of providing the value for it.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<SecretObjectArgs> password;

    public Input<SecretObjectArgs> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The username for logging into the custom registry.
     * 
     */
    @InputImport(name="userName")
      private final @Nullable Input<SecretObjectArgs> userName;

    public Input<SecretObjectArgs> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public CustomRegistryCredentialsArgs(
        @Nullable Input<String> identity,
        @Nullable Input<SecretObjectArgs> password,
        @Nullable Input<SecretObjectArgs> userName) {
        this.identity = identity;
        this.password = password;
        this.userName = userName;
    }

    private CustomRegistryCredentialsArgs() {
        this.identity = Input.empty();
        this.password = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRegistryCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> identity;
        private @Nullable Input<SecretObjectArgs> password;
        private @Nullable Input<SecretObjectArgs> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRegistryCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.password = defaults.password;
    	      this.userName = defaults.userName;
        }

        public Builder identity(@Nullable Input<String> identity) {
            this.identity = identity;
            return this;
        }

        public Builder identity(@Nullable String identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder password(@Nullable Input<SecretObjectArgs> password) {
            this.password = password;
            return this;
        }

        public Builder password(@Nullable SecretObjectArgs password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder userName(@Nullable Input<SecretObjectArgs> userName) {
            this.userName = userName;
            return this;
        }

        public Builder userName(@Nullable SecretObjectArgs userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }
        public CustomRegistryCredentialsArgs build() {
            return new CustomRegistryCredentialsArgs(identity, password, userName);
        }
    }
}
