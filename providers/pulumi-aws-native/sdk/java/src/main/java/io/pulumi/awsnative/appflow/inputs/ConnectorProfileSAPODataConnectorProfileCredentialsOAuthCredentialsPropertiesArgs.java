// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.ConnectorProfileConnectorOAuthRequestArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs Empty = new ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs();

    @Import(name="accessToken")
      private final @Nullable Output<String> accessToken;

    public Output<String> getAccessToken() {
        return this.accessToken == null ? Codegen.empty() : this.accessToken;
    }

    @Import(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId == null ? Codegen.empty() : this.clientId;
    }

    @Import(name="clientSecret")
      private final @Nullable Output<String> clientSecret;

    public Output<String> getClientSecret() {
        return this.clientSecret == null ? Codegen.empty() : this.clientSecret;
    }

    @Import(name="connectorOAuthRequest")
      private final @Nullable Output<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest;

    public Output<ConnectorProfileConnectorOAuthRequestArgs> getConnectorOAuthRequest() {
        return this.connectorOAuthRequest == null ? Codegen.empty() : this.connectorOAuthRequest;
    }

    @Import(name="refreshToken")
      private final @Nullable Output<String> refreshToken;

    public Output<String> getRefreshToken() {
        return this.refreshToken == null ? Codegen.empty() : this.refreshToken;
    }

    public ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs(
        @Nullable Output<String> accessToken,
        @Nullable Output<String> clientId,
        @Nullable Output<String> clientSecret,
        @Nullable Output<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest,
        @Nullable Output<String> refreshToken) {
        this.accessToken = accessToken;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.connectorOAuthRequest = connectorOAuthRequest;
        this.refreshToken = refreshToken;
    }

    private ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs() {
        this.accessToken = Codegen.empty();
        this.clientId = Codegen.empty();
        this.clientSecret = Codegen.empty();
        this.connectorOAuthRequest = Codegen.empty();
        this.refreshToken = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessToken;
        private @Nullable Output<String> clientId;
        private @Nullable Output<String> clientSecret;
        private @Nullable Output<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest;
        private @Nullable Output<String> refreshToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectorOAuthRequest = defaults.connectorOAuthRequest;
    	      this.refreshToken = defaults.refreshToken;
        }

        public Builder accessToken(@Nullable Output<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = Codegen.ofNullable(accessToken);
            return this;
        }
        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = Codegen.ofNullable(clientId);
            return this;
        }
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = Codegen.ofNullable(clientSecret);
            return this;
        }
        public Builder connectorOAuthRequest(@Nullable Output<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest) {
            this.connectorOAuthRequest = connectorOAuthRequest;
            return this;
        }
        public Builder connectorOAuthRequest(@Nullable ConnectorProfileConnectorOAuthRequestArgs connectorOAuthRequest) {
            this.connectorOAuthRequest = Codegen.ofNullable(connectorOAuthRequest);
            return this;
        }
        public Builder refreshToken(@Nullable Output<String> refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public Builder refreshToken(@Nullable String refreshToken) {
            this.refreshToken = Codegen.ofNullable(refreshToken);
            return this;
        }        public ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs build() {
            return new ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs(accessToken, clientId, clientSecret, connectorOAuthRequest, refreshToken);
        }
    }
}
