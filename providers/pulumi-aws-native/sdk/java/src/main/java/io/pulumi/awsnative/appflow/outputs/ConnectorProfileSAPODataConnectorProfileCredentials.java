// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.outputs.ConnectorProfileSAPODataConnectorProfileCredentialsBasicAuthCredentialsProperties;
import io.pulumi.awsnative.appflow.outputs.ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsProperties;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorProfileSAPODataConnectorProfileCredentials {
    private final @Nullable ConnectorProfileSAPODataConnectorProfileCredentialsBasicAuthCredentialsProperties basicAuthCredentials;
    private final @Nullable ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsProperties oAuthCredentials;

    @OutputCustomType.Constructor
    private ConnectorProfileSAPODataConnectorProfileCredentials(
        @OutputCustomType.Parameter("basicAuthCredentials") @Nullable ConnectorProfileSAPODataConnectorProfileCredentialsBasicAuthCredentialsProperties basicAuthCredentials,
        @OutputCustomType.Parameter("oAuthCredentials") @Nullable ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsProperties oAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
        this.oAuthCredentials = oAuthCredentials;
    }

    public Optional<ConnectorProfileSAPODataConnectorProfileCredentialsBasicAuthCredentialsProperties> getBasicAuthCredentials() {
        return Optional.ofNullable(this.basicAuthCredentials);
    }
    public Optional<ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsProperties> getOAuthCredentials() {
        return Optional.ofNullable(this.oAuthCredentials);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileSAPODataConnectorProfileCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConnectorProfileSAPODataConnectorProfileCredentialsBasicAuthCredentialsProperties basicAuthCredentials;
        private @Nullable ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsProperties oAuthCredentials;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileSAPODataConnectorProfileCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicAuthCredentials = defaults.basicAuthCredentials;
    	      this.oAuthCredentials = defaults.oAuthCredentials;
        }

        public Builder basicAuthCredentials(@Nullable ConnectorProfileSAPODataConnectorProfileCredentialsBasicAuthCredentialsProperties basicAuthCredentials) {
            this.basicAuthCredentials = basicAuthCredentials;
            return this;
        }

        public Builder oAuthCredentials(@Nullable ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsProperties oAuthCredentials) {
            this.oAuthCredentials = oAuthCredentials;
            return this;
        }
        public ConnectorProfileSAPODataConnectorProfileCredentials build() {
            return new ConnectorProfileSAPODataConnectorProfileCredentials(basicAuthCredentials, oAuthCredentials);
        }
    }
}
