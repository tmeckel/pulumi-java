// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.CosmosDbConnectionMode;
import io.pulumi.azurenative.datafactory.enums.CosmosDbServicePrincipalCredentialType;
import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
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
 * Microsoft Azure Cosmos Database (CosmosDB) linked service.
 * 
 */
public final class CosmosDbLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CosmosDbLinkedServiceArgs Empty = new CosmosDbLinkedServiceArgs();

    /**
     * The endpoint of the Azure CosmosDB account. Type: string (or Expression with resultType string)
     * 
     */
    @InputImport(name="accountEndpoint")
      private final @Nullable Input<Object> accountEndpoint;

    public Input<Object> getAccountEndpoint() {
        return this.accountEndpoint == null ? Input.empty() : this.accountEndpoint;
    }

    /**
     * The account key of the Azure CosmosDB account. Type: SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @InputImport(name="accountKey")
      private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accountKey;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getAccountKey() {
        return this.accountKey == null ? Input.empty() : this.accountKey;
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
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="azureCloudType")
      private final @Nullable Input<Object> azureCloudType;

    public Input<Object> getAzureCloudType() {
        return this.azureCloudType == null ? Input.empty() : this.azureCloudType;
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
     * The connection mode used to access CosmosDB account. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="connectionMode")
      private final @Nullable Input<Either<String,CosmosDbConnectionMode>> connectionMode;

    public Input<Either<String,CosmosDbConnectionMode>> getConnectionMode() {
        return this.connectionMode == null ? Input.empty() : this.connectionMode;
    }

    /**
     * The connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @InputImport(name="connectionString")
      private final @Nullable Input<Object> connectionString;

    public Input<Object> getConnectionString() {
        return this.connectionString == null ? Input.empty() : this.connectionString;
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @InputImport(name="credential")
      private final @Nullable Input<CredentialReferenceArgs> credential;

    public Input<CredentialReferenceArgs> getCredential() {
        return this.credential == null ? Input.empty() : this.credential;
    }

    /**
     * The name of the database. Type: string (or Expression with resultType string)
     * 
     */
    @InputImport(name="database")
      private final @Nullable Input<Object> database;

    public Input<Object> getDatabase() {
        return this.database == null ? Input.empty() : this.database;
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
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert', servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     */
    @InputImport(name="servicePrincipalCredential")
      private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalCredential;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getServicePrincipalCredential() {
        return this.servicePrincipalCredential == null ? Input.empty() : this.servicePrincipalCredential;
    }

    /**
     * The service principal credential type to use in Server-To-Server authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="servicePrincipalCredentialType")
      private final @Nullable Input<Either<String,CosmosDbServicePrincipalCredentialType>> servicePrincipalCredentialType;

    public Input<Either<String,CosmosDbServicePrincipalCredentialType>> getServicePrincipalCredentialType() {
        return this.servicePrincipalCredentialType == null ? Input.empty() : this.servicePrincipalCredentialType;
    }

    /**
     * The client ID of the application in Azure Active Directory used for Server-To-Server authentication. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="servicePrincipalId")
      private final @Nullable Input<Object> servicePrincipalId;

    public Input<Object> getServicePrincipalId() {
        return this.servicePrincipalId == null ? Input.empty() : this.servicePrincipalId;
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="tenant")
      private final @Nullable Input<Object> tenant;

    public Input<Object> getTenant() {
        return this.tenant == null ? Input.empty() : this.tenant;
    }

    /**
     * Type of linked service.
     * Expected value is 'CosmosDb'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public CosmosDbLinkedServiceArgs(
        @Nullable Input<Object> accountEndpoint,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accountKey,
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<Object> azureCloudType,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<Either<String,CosmosDbConnectionMode>> connectionMode,
        @Nullable Input<Object> connectionString,
        @Nullable Input<CredentialReferenceArgs> credential,
        @Nullable Input<Object> database,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalCredential,
        @Nullable Input<Either<String,CosmosDbServicePrincipalCredentialType>> servicePrincipalCredentialType,
        @Nullable Input<Object> servicePrincipalId,
        @Nullable Input<Object> tenant,
        Input<String> type) {
        this.accountEndpoint = accountEndpoint;
        this.accountKey = accountKey;
        this.annotations = annotations;
        this.azureCloudType = azureCloudType;
        this.connectVia = connectVia;
        this.connectionMode = connectionMode;
        this.connectionString = connectionString;
        this.credential = credential;
        this.database = database;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.servicePrincipalCredential = servicePrincipalCredential;
        this.servicePrincipalCredentialType = servicePrincipalCredentialType;
        this.servicePrincipalId = servicePrincipalId;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CosmosDbLinkedServiceArgs() {
        this.accountEndpoint = Input.empty();
        this.accountKey = Input.empty();
        this.annotations = Input.empty();
        this.azureCloudType = Input.empty();
        this.connectVia = Input.empty();
        this.connectionMode = Input.empty();
        this.connectionString = Input.empty();
        this.credential = Input.empty();
        this.database = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.parameters = Input.empty();
        this.servicePrincipalCredential = Input.empty();
        this.servicePrincipalCredentialType = Input.empty();
        this.servicePrincipalId = Input.empty();
        this.tenant = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CosmosDbLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> accountEndpoint;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accountKey;
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<Object> azureCloudType;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<Either<String,CosmosDbConnectionMode>> connectionMode;
        private @Nullable Input<Object> connectionString;
        private @Nullable Input<CredentialReferenceArgs> credential;
        private @Nullable Input<Object> database;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalCredential;
        private @Nullable Input<Either<String,CosmosDbServicePrincipalCredentialType>> servicePrincipalCredentialType;
        private @Nullable Input<Object> servicePrincipalId;
        private @Nullable Input<Object> tenant;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CosmosDbLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountEndpoint = defaults.accountEndpoint;
    	      this.accountKey = defaults.accountKey;
    	      this.annotations = defaults.annotations;
    	      this.azureCloudType = defaults.azureCloudType;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionMode = defaults.connectionMode;
    	      this.connectionString = defaults.connectionString;
    	      this.credential = defaults.credential;
    	      this.database = defaults.database;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.servicePrincipalCredential = defaults.servicePrincipalCredential;
    	      this.servicePrincipalCredentialType = defaults.servicePrincipalCredentialType;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder accountEndpoint(@Nullable Input<Object> accountEndpoint) {
            this.accountEndpoint = accountEndpoint;
            return this;
        }

        public Builder accountEndpoint(@Nullable Object accountEndpoint) {
            this.accountEndpoint = Input.ofNullable(accountEndpoint);
            return this;
        }

        public Builder accountKey(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accountKey) {
            this.accountKey = accountKey;
            return this;
        }

        public Builder accountKey(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> accountKey) {
            this.accountKey = Input.ofNullable(accountKey);
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

        public Builder azureCloudType(@Nullable Input<Object> azureCloudType) {
            this.azureCloudType = azureCloudType;
            return this;
        }

        public Builder azureCloudType(@Nullable Object azureCloudType) {
            this.azureCloudType = Input.ofNullable(azureCloudType);
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

        public Builder connectionMode(@Nullable Input<Either<String,CosmosDbConnectionMode>> connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }

        public Builder connectionMode(@Nullable Either<String,CosmosDbConnectionMode> connectionMode) {
            this.connectionMode = Input.ofNullable(connectionMode);
            return this;
        }

        public Builder connectionString(@Nullable Input<Object> connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder connectionString(@Nullable Object connectionString) {
            this.connectionString = Input.ofNullable(connectionString);
            return this;
        }

        public Builder credential(@Nullable Input<CredentialReferenceArgs> credential) {
            this.credential = credential;
            return this;
        }

        public Builder credential(@Nullable CredentialReferenceArgs credential) {
            this.credential = Input.ofNullable(credential);
            return this;
        }

        public Builder database(@Nullable Input<Object> database) {
            this.database = database;
            return this;
        }

        public Builder database(@Nullable Object database) {
            this.database = Input.ofNullable(database);
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

        public Builder parameters(@Nullable Input<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder servicePrincipalCredential(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalCredential) {
            this.servicePrincipalCredential = servicePrincipalCredential;
            return this;
        }

        public Builder servicePrincipalCredential(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalCredential) {
            this.servicePrincipalCredential = Input.ofNullable(servicePrincipalCredential);
            return this;
        }

        public Builder servicePrincipalCredentialType(@Nullable Input<Either<String,CosmosDbServicePrincipalCredentialType>> servicePrincipalCredentialType) {
            this.servicePrincipalCredentialType = servicePrincipalCredentialType;
            return this;
        }

        public Builder servicePrincipalCredentialType(@Nullable Either<String,CosmosDbServicePrincipalCredentialType> servicePrincipalCredentialType) {
            this.servicePrincipalCredentialType = Input.ofNullable(servicePrincipalCredentialType);
            return this;
        }

        public Builder servicePrincipalId(@Nullable Input<Object> servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = Input.ofNullable(servicePrincipalId);
            return this;
        }

        public Builder tenant(@Nullable Input<Object> tenant) {
            this.tenant = tenant;
            return this;
        }

        public Builder tenant(@Nullable Object tenant) {
            this.tenant = Input.ofNullable(tenant);
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
        public CosmosDbLinkedServiceArgs build() {
            return new CosmosDbLinkedServiceArgs(accountEndpoint, accountKey, annotations, azureCloudType, connectVia, connectionMode, connectionString, credential, database, description, encryptedCredential, parameters, servicePrincipalCredential, servicePrincipalCredentialType, servicePrincipalId, tenant, type);
        }
    }
}
