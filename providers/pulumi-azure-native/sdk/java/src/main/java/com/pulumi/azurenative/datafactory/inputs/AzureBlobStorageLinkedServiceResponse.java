// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.CredentialReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The azure blob storage linked service.
 * 
 */
public final class AzureBlobStorageLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureBlobStorageLinkedServiceResponse Empty = new AzureBlobStorageLinkedServiceResponse();

    /**
     * The Azure key vault secret reference of accountKey in connection string.
     * 
     */
    @Import(name="accountKey")
    private @Nullable AzureKeyVaultSecretReferenceResponse accountKey;

    /**
     * @return The Azure key vault secret reference of accountKey in connection string.
     * 
     */
    public Optional<AzureKeyVaultSecretReferenceResponse> accountKey() {
        return Optional.ofNullable(this.accountKey);
    }

    /**
     * Specify the kind of your storage account. Allowed values are: Storage (general purpose v1), StorageV2 (general purpose v2), BlobStorage, or BlockBlobStorage. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="accountKind")
    private @Nullable String accountKind;

    /**
     * @return Specify the kind of your storage account. Allowed values are: Storage (general purpose v1), StorageV2 (general purpose v2), BlobStorage, or BlockBlobStorage. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<String> accountKind() {
        return Optional.ofNullable(this.accountKind);
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable List<Object> annotations;

    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    public Optional<List<Object>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="azureCloudType")
    private @Nullable Object azureCloudType;

    /**
     * @return Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> azureCloudType() {
        return Optional.ofNullable(this.azureCloudType);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable IntegrationRuntimeReferenceResponse connectVia;

    /**
     * @return The integration runtime reference.
     * 
     */
    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * The connection string. It is mutually exclusive with sasUri, serviceEndpoint property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Object connectionString;

    /**
     * @return The connection string. It is mutually exclusive with sasUri, serviceEndpoint property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    public Optional<Object> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
    private @Nullable CredentialReferenceResponse credential;

    /**
     * @return The credential reference containing authentication information.
     * 
     */
    public Optional<CredentialReferenceResponse> credential() {
        return Optional.ofNullable(this.credential);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Linked service description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable String encryptedCredential;

    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<String> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Map<String,ParameterSpecificationResponse> parameters;

    /**
     * @return Parameters for linked service.
     * 
     */
    public Optional<Map<String,ParameterSpecificationResponse>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The Azure key vault secret reference of sasToken in sas uri.
     * 
     */
    @Import(name="sasToken")
    private @Nullable AzureKeyVaultSecretReferenceResponse sasToken;

    /**
     * @return The Azure key vault secret reference of sasToken in sas uri.
     * 
     */
    public Optional<AzureKeyVaultSecretReferenceResponse> sasToken() {
        return Optional.ofNullable(this.sasToken);
    }

    /**
     * SAS URI of the Azure Blob Storage resource. It is mutually exclusive with connectionString, serviceEndpoint property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="sasUri")
    private @Nullable Object sasUri;

    /**
     * @return SAS URI of the Azure Blob Storage resource. It is mutually exclusive with connectionString, serviceEndpoint property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    public Optional<Object> sasUri() {
        return Optional.ofNullable(this.sasUri);
    }

    /**
     * Blob service endpoint of the Azure Blob Storage resource. It is mutually exclusive with connectionString, sasUri property.
     * 
     */
    @Import(name="serviceEndpoint")
    private @Nullable String serviceEndpoint;

    /**
     * @return Blob service endpoint of the Azure Blob Storage resource. It is mutually exclusive with connectionString, sasUri property.
     * 
     */
    public Optional<String> serviceEndpoint() {
        return Optional.ofNullable(this.serviceEndpoint);
    }

    /**
     * The ID of the service principal used to authenticate against Azure SQL Data Warehouse. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Object servicePrincipalId;

    /**
     * @return The ID of the service principal used to authenticate against Azure SQL Data Warehouse. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The key of the service principal used to authenticate against Azure SQL Data Warehouse.
     * 
     */
    @Import(name="servicePrincipalKey")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;

    /**
     * @return The key of the service principal used to authenticate against Azure SQL Data Warehouse.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> servicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant")
    private @Nullable Object tenant;

    /**
     * @return The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> tenant() {
        return Optional.ofNullable(this.tenant);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;AzureBlobStorage&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;AzureBlobStorage&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private AzureBlobStorageLinkedServiceResponse() {}

    private AzureBlobStorageLinkedServiceResponse(AzureBlobStorageLinkedServiceResponse $) {
        this.accountKey = $.accountKey;
        this.accountKind = $.accountKind;
        this.annotations = $.annotations;
        this.azureCloudType = $.azureCloudType;
        this.connectVia = $.connectVia;
        this.connectionString = $.connectionString;
        this.credential = $.credential;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.sasToken = $.sasToken;
        this.sasUri = $.sasUri;
        this.serviceEndpoint = $.serviceEndpoint;
        this.servicePrincipalId = $.servicePrincipalId;
        this.servicePrincipalKey = $.servicePrincipalKey;
        this.tenant = $.tenant;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureBlobStorageLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureBlobStorageLinkedServiceResponse $;

        public Builder() {
            $ = new AzureBlobStorageLinkedServiceResponse();
        }

        public Builder(AzureBlobStorageLinkedServiceResponse defaults) {
            $ = new AzureBlobStorageLinkedServiceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountKey The Azure key vault secret reference of accountKey in connection string.
         * 
         * @return builder
         * 
         */
        public Builder accountKey(@Nullable AzureKeyVaultSecretReferenceResponse accountKey) {
            $.accountKey = accountKey;
            return this;
        }

        /**
         * @param accountKind Specify the kind of your storage account. Allowed values are: Storage (general purpose v1), StorageV2 (general purpose v2), BlobStorage, or BlockBlobStorage. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder accountKind(@Nullable String accountKind) {
            $.accountKind = accountKind;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param azureCloudType Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder azureCloudType(@Nullable Object azureCloudType) {
            $.azureCloudType = azureCloudType;
            return this;
        }

        /**
         * @param connectVia The integration runtime reference.
         * 
         * @return builder
         * 
         */
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        /**
         * @param connectionString The connection string. It is mutually exclusive with sasUri, serviceEndpoint property. Type: string, SecureString or AzureKeyVaultSecretReference.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(@Nullable Object connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param credential The credential reference containing authentication information.
         * 
         * @return builder
         * 
         */
        public Builder credential(@Nullable CredentialReferenceResponse credential) {
            $.credential = credential;
            return this;
        }

        /**
         * @param description Linked service description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param encryptedCredential The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder encryptedCredential(@Nullable String encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        /**
         * @param parameters Parameters for linked service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param sasToken The Azure key vault secret reference of sasToken in sas uri.
         * 
         * @return builder
         * 
         */
        public Builder sasToken(@Nullable AzureKeyVaultSecretReferenceResponse sasToken) {
            $.sasToken = sasToken;
            return this;
        }

        /**
         * @param sasUri SAS URI of the Azure Blob Storage resource. It is mutually exclusive with connectionString, serviceEndpoint property. Type: string, SecureString or AzureKeyVaultSecretReference.
         * 
         * @return builder
         * 
         */
        public Builder sasUri(@Nullable Object sasUri) {
            $.sasUri = sasUri;
            return this;
        }

        /**
         * @param serviceEndpoint Blob service endpoint of the Azure Blob Storage resource. It is mutually exclusive with connectionString, sasUri property.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpoint(@Nullable String serviceEndpoint) {
            $.serviceEndpoint = serviceEndpoint;
            return this;
        }

        /**
         * @param servicePrincipalId The ID of the service principal used to authenticate against Azure SQL Data Warehouse. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        /**
         * @param servicePrincipalKey The key of the service principal used to authenticate against Azure SQL Data Warehouse.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            $.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        /**
         * @param servicePrincipalKey The key of the service principal used to authenticate against Azure SQL Data Warehouse.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(AzureKeyVaultSecretReferenceResponse servicePrincipalKey) {
            return servicePrincipalKey(Either.ofLeft(servicePrincipalKey));
        }

        /**
         * @param servicePrincipalKey The key of the service principal used to authenticate against Azure SQL Data Warehouse.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(SecureStringResponse servicePrincipalKey) {
            return servicePrincipalKey(Either.ofRight(servicePrincipalKey));
        }

        /**
         * @param tenant The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder tenant(@Nullable Object tenant) {
            $.tenant = tenant;
            return this;
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;AzureBlobStorage&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public AzureBlobStorageLinkedServiceResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
