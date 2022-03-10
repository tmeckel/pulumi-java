// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OracleCloudStorageLinkedServiceResponse {
    /**
     * The access key identifier of the Oracle Cloud Storage Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object accessKeyId;
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The secret access key of the Oracle Cloud Storage Identity and Access Management (IAM) user.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey;
    /**
     * This value specifies the endpoint to access with the Oracle Cloud Storage Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object serviceUrl;
    /**
     * Type of linked service.
     * Expected value is 'OracleCloudStorage'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private OracleCloudStorageLinkedServiceResponse(
        @OutputCustomType.Parameter("accessKeyId") @Nullable Object accessKeyId,
        @OutputCustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @OutputCustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @OutputCustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @OutputCustomType.Parameter("secretAccessKey") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey,
        @OutputCustomType.Parameter("serviceUrl") @Nullable Object serviceUrl,
        @OutputCustomType.Parameter("type") String type) {
        this.accessKeyId = accessKeyId;
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.secretAccessKey = secretAccessKey;
        this.serviceUrl = serviceUrl;
        this.type = type;
    }

    /**
     * The access key identifier of the Oracle Cloud Storage Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getAccessKeyId() {
        return Optional.ofNullable(this.accessKeyId);
    }
    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The secret access key of the Oracle Cloud Storage Identity and Access Management (IAM) user.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getSecretAccessKey() {
        return Optional.ofNullable(this.secretAccessKey);
    }
    /**
     * This value specifies the endpoint to access with the Oracle Cloud Storage Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getServiceUrl() {
        return Optional.ofNullable(this.serviceUrl);
    }
    /**
     * Type of linked service.
     * Expected value is 'OracleCloudStorage'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleCloudStorageLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object accessKeyId;
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey;
        private @Nullable Object serviceUrl;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleCloudStorageLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.secretAccessKey = defaults.secretAccessKey;
    	      this.serviceUrl = defaults.serviceUrl;
    	      this.type = defaults.type;
        }

        public Builder accessKeyId(@Nullable Object accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder secretAccessKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey) {
            this.secretAccessKey = secretAccessKey;
            return this;
        }

        public Builder serviceUrl(@Nullable Object serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public OracleCloudStorageLinkedServiceResponse build() {
            return new OracleCloudStorageLinkedServiceResponse(accessKeyId, annotations, connectVia, description, encryptedCredential, parameters, secretAccessKey, serviceUrl, type);
        }
    }
}
