// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorProfileSAPODataConnectorProfileCredentialsBasicAuthCredentialsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileSAPODataConnectorProfileCredentialsBasicAuthCredentialsPropertiesArgs Empty = new ConnectorProfileSAPODataConnectorProfileCredentialsBasicAuthCredentialsPropertiesArgs();

    /**
     * The password that corresponds to the username.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The name of the user.
     * 
     */
    @InputImport(name="username")
      private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public ConnectorProfileSAPODataConnectorProfileCredentialsBasicAuthCredentialsPropertiesArgs(
        @Nullable Input<String> password,
        @Nullable Input<String> username) {
        this.password = password;
        this.username = username;
    }

    private ConnectorProfileSAPODataConnectorProfileCredentialsBasicAuthCredentialsPropertiesArgs() {
        this.password = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileSAPODataConnectorProfileCredentialsBasicAuthCredentialsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> password;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileSAPODataConnectorProfileCredentialsBasicAuthCredentialsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder username(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }
        public ConnectorProfileSAPODataConnectorProfileCredentialsBasicAuthCredentialsPropertiesArgs build() {
            return new ConnectorProfileSAPODataConnectorProfileCredentialsBasicAuthCredentialsPropertiesArgs(password, username);
        }
    }
}
