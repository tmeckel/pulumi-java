// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegistryCredentialsResponse {
    /**
     * The name of the Secret that contains the registry login password
     * 
     */
    private final @Nullable String passwordSecretRef;
    /**
     * Container Registry Server
     * 
     */
    private final @Nullable String server;
    /**
     * Container Registry Username
     * 
     */
    private final @Nullable String username;

    @OutputCustomType.Constructor
    private RegistryCredentialsResponse(
        @OutputCustomType.Parameter("passwordSecretRef") @Nullable String passwordSecretRef,
        @OutputCustomType.Parameter("server") @Nullable String server,
        @OutputCustomType.Parameter("username") @Nullable String username) {
        this.passwordSecretRef = passwordSecretRef;
        this.server = server;
        this.username = username;
    }

    /**
     * The name of the Secret that contains the registry login password
     * 
    */
    public Optional<String> getPasswordSecretRef() {
        return Optional.ofNullable(this.passwordSecretRef);
    }
    /**
     * Container Registry Server
     * 
    */
    public Optional<String> getServer() {
        return Optional.ofNullable(this.server);
    }
    /**
     * Container Registry Username
     * 
    */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String passwordSecretRef;
        private @Nullable String server;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passwordSecretRef = defaults.passwordSecretRef;
    	      this.server = defaults.server;
    	      this.username = defaults.username;
        }

        public Builder passwordSecretRef(@Nullable String passwordSecretRef) {
            this.passwordSecretRef = passwordSecretRef;
            return this;
        }

        public Builder server(@Nullable String server) {
            this.server = server;
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        public RegistryCredentialsResponse build() {
            return new RegistryCredentialsResponse(passwordSecretRef, server, username);
        }
    }
}
