// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Admin credentials for virtual machine
 * 
 */
public final class VirtualMachineSshCredentialsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineSshCredentialsResponse Empty = new VirtualMachineSshCredentialsResponse();

    /**
     * Password of admin account
     * 
     */
    @InputImport(name="password")
      private final @Nullable String password;

    public Optional<String> getPassword() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    /**
     * Private key data
     * 
     */
    @InputImport(name="privateKeyData")
      private final @Nullable String privateKeyData;

    public Optional<String> getPrivateKeyData() {
        return this.privateKeyData == null ? Optional.empty() : Optional.ofNullable(this.privateKeyData);
    }

    /**
     * Public key data
     * 
     */
    @InputImport(name="publicKeyData")
      private final @Nullable String publicKeyData;

    public Optional<String> getPublicKeyData() {
        return this.publicKeyData == null ? Optional.empty() : Optional.ofNullable(this.publicKeyData);
    }

    /**
     * Username of admin account
     * 
     */
    @InputImport(name="username")
      private final @Nullable String username;

    public Optional<String> getUsername() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public VirtualMachineSshCredentialsResponse(
        @Nullable String password,
        @Nullable String privateKeyData,
        @Nullable String publicKeyData,
        @Nullable String username) {
        this.password = password;
        this.privateKeyData = privateKeyData;
        this.publicKeyData = publicKeyData;
        this.username = username;
    }

    private VirtualMachineSshCredentialsResponse() {
        this.password = null;
        this.privateKeyData = null;
        this.publicKeyData = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineSshCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private @Nullable String privateKeyData;
        private @Nullable String publicKeyData;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineSshCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.privateKeyData = defaults.privateKeyData;
    	      this.publicKeyData = defaults.publicKeyData;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder privateKeyData(@Nullable String privateKeyData) {
            this.privateKeyData = privateKeyData;
            return this;
        }

        public Builder publicKeyData(@Nullable String publicKeyData) {
            this.publicKeyData = publicKeyData;
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        public VirtualMachineSshCredentialsResponse build() {
            return new VirtualMachineSshCredentialsResponse(password, privateKeyData, publicKeyData, username);
        }
    }
}
