// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigqueryconnection_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Credential info for the Cloud SQL.
 * 
 */
public final class CloudSqlCredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudSqlCredentialArgs Empty = new CloudSqlCredentialArgs();

    /**
     * The password for the credential.
     * 
     */
    @InputImport(name="password")
    private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The username for the credential.
     * 
     */
    @InputImport(name="username")
    private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public CloudSqlCredentialArgs(
        @Nullable Input<String> password,
        @Nullable Input<String> username) {
        this.password = password;
        this.username = username;
    }

    private CloudSqlCredentialArgs() {
        this.password = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudSqlCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> password;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudSqlCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setUsername(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }

        public CloudSqlCredentialArgs build() {
            return new CloudSqlCredentialArgs(password, username);
        }
    }
}
