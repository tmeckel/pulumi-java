// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Zoho server linked service.
 * 
 */
public final class ZohoLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ZohoLinkedServiceArgs Empty = new ZohoLinkedServiceArgs();

    /**
     * The access token for Zoho authentication.
     * 
     */
    @InputImport(name="accessToken")
      private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getAccessToken() {
        return this.accessToken == null ? Input.empty() : this.accessToken;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @InputImport(name="annotations")
      private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
      private final @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;

    public Input<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Input.empty() : this.connectVia;
    }

    /**
     * Properties used to connect to Zoho. It is mutually exclusive with any other properties in the linked service. Type: object.
     * 
     */
    @InputImport(name="connectionProperties")
      private final @Nullable Input<Object> connectionProperties;

    public Input<Object> getConnectionProperties() {
        return this.connectionProperties == null ? Input.empty() : this.connectionProperties;
    }

    /**
     * Linked service description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
      private final @Nullable Input<Object> encryptedCredential;

    public Input<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Input.empty() : this.encryptedCredential;
    }

    /**
     * The endpoint of the Zoho server. (i.e. crm.zoho.com/crm/private)
     * 
     */
    @InputImport(name="endpoint")
      private final @Nullable Input<Object> endpoint;

    public Input<Object> getEndpoint() {
        return this.endpoint == null ? Input.empty() : this.endpoint;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Type of linked service.
     * Expected value is 'Zoho'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    @InputImport(name="useEncryptedEndpoints")
      private final @Nullable Input<Object> useEncryptedEndpoints;

    public Input<Object> getUseEncryptedEndpoints() {
        return this.useEncryptedEndpoints == null ? Input.empty() : this.useEncryptedEndpoints;
    }

    /**
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
     */
    @InputImport(name="useHostVerification")
      private final @Nullable Input<Object> useHostVerification;

    public Input<Object> getUseHostVerification() {
        return this.useHostVerification == null ? Input.empty() : this.useHostVerification;
    }

    /**
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
     */
    @InputImport(name="usePeerVerification")
      private final @Nullable Input<Object> usePeerVerification;

    public Input<Object> getUsePeerVerification() {
        return this.usePeerVerification == null ? Input.empty() : this.usePeerVerification;
    }

    public ZohoLinkedServiceArgs(
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken,
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<Object> connectionProperties,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Object> endpoint,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        Input<String> type,
        @Nullable Input<Object> useEncryptedEndpoints,
        @Nullable Input<Object> useHostVerification,
        @Nullable Input<Object> usePeerVerification) {
        this.accessToken = accessToken;
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.connectionProperties = connectionProperties;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.endpoint = endpoint;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
    }

    private ZohoLinkedServiceArgs() {
        this.accessToken = Input.empty();
        this.annotations = Input.empty();
        this.connectVia = Input.empty();
        this.connectionProperties = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.endpoint = Input.empty();
        this.parameters = Input.empty();
        this.type = Input.empty();
        this.useEncryptedEndpoints = Input.empty();
        this.useHostVerification = Input.empty();
        this.usePeerVerification = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZohoLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken;
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<Object> connectionProperties;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Object> endpoint;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private Input<String> type;
        private @Nullable Input<Object> useEncryptedEndpoints;
        private @Nullable Input<Object> useHostVerification;
        private @Nullable Input<Object> usePeerVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(ZohoLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.endpoint = defaults.endpoint;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
        }

        public Builder accessToken(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder accessToken(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> accessToken) {
            this.accessToken = Input.ofNullable(accessToken);
            return this;
        }

        public Builder annotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder connectVia(@Nullable Input<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Input.ofNullable(connectVia);
            return this;
        }

        public Builder connectionProperties(@Nullable Input<Object> connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }

        public Builder connectionProperties(@Nullable Object connectionProperties) {
            this.connectionProperties = Input.ofNullable(connectionProperties);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder encryptedCredential(@Nullable Input<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Input.ofNullable(encryptedCredential);
            return this;
        }

        public Builder endpoint(@Nullable Input<Object> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(@Nullable Object endpoint) {
            this.endpoint = Input.ofNullable(endpoint);
            return this;
        }

        public Builder parameters(@Nullable Input<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder useEncryptedEndpoints(@Nullable Input<Object> useEncryptedEndpoints) {
            this.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }

        public Builder useEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            this.useEncryptedEndpoints = Input.ofNullable(useEncryptedEndpoints);
            return this;
        }

        public Builder useHostVerification(@Nullable Input<Object> useHostVerification) {
            this.useHostVerification = useHostVerification;
            return this;
        }

        public Builder useHostVerification(@Nullable Object useHostVerification) {
            this.useHostVerification = Input.ofNullable(useHostVerification);
            return this;
        }

        public Builder usePeerVerification(@Nullable Input<Object> usePeerVerification) {
            this.usePeerVerification = usePeerVerification;
            return this;
        }

        public Builder usePeerVerification(@Nullable Object usePeerVerification) {
            this.usePeerVerification = Input.ofNullable(usePeerVerification);
            return this;
        }
        public ZohoLinkedServiceArgs build() {
            return new ZohoLinkedServiceArgs(accessToken, annotations, connectVia, connectionProperties, description, encryptedCredential, endpoint, parameters, type, useEncryptedEndpoints, useHostVerification, usePeerVerification);
        }
    }
}
