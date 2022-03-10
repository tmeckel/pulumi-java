// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Linked service for Salesforce Service Cloud.
 * 
 */
public final class SalesforceServiceCloudLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SalesforceServiceCloudLinkedServiceResponse Empty = new SalesforceServiceCloudLinkedServiceResponse();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @InputImport(name="annotations")
      private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * The Salesforce API version used in ADF. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="apiVersion")
      private final @Nullable Object apiVersion;

    public Optional<Object> getApiVersion() {
        return this.apiVersion == null ? Optional.empty() : Optional.ofNullable(this.apiVersion);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
      private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
      private final @Nullable Object encryptedCredential;

    public Optional<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * The URL of Salesforce Service Cloud instance. Default is 'https://login.salesforce.com'. To copy data from sandbox, specify 'https://test.salesforce.com'. To copy data from custom domain, specify, for example, 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="environmentUrl")
      private final @Nullable Object environmentUrl;

    public Optional<Object> getEnvironmentUrl() {
        return this.environmentUrl == null ? Optional.empty() : Optional.ofNullable(this.environmentUrl);
    }

    /**
     * Extended properties appended to the connection string. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="extendedProperties")
      private final @Nullable Object extendedProperties;

    public Optional<Object> getExtendedProperties() {
        return this.extendedProperties == null ? Optional.empty() : Optional.ofNullable(this.extendedProperties);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * The password for Basic authentication of the Salesforce instance.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password == null ? null : this.password;
    }

    /**
     * The security token is optional to remotely access Salesforce instance.
     * 
     */
    @InputImport(name="securityToken")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> securityToken;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getSecurityToken() {
        return this.securityToken == null ? null : this.securityToken;
    }

    /**
     * Type of linked service.
     * Expected value is 'SalesforceServiceCloud'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The username for Basic authentication of the Salesforce instance. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="username")
      private final @Nullable Object username;

    public Optional<Object> getUsername() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public SalesforceServiceCloudLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable Object apiVersion,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Object environmentUrl,
        @Nullable Object extendedProperties,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> securityToken,
        String type,
        @Nullable Object username) {
        this.annotations = annotations;
        this.apiVersion = apiVersion;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.environmentUrl = environmentUrl;
        this.extendedProperties = extendedProperties;
        this.parameters = parameters;
        this.password = password;
        this.securityToken = securityToken;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.username = username;
    }

    private SalesforceServiceCloudLinkedServiceResponse() {
        this.annotations = List.of();
        this.apiVersion = null;
        this.connectVia = null;
        this.description = null;
        this.encryptedCredential = null;
        this.environmentUrl = null;
        this.extendedProperties = null;
        this.parameters = Map.of();
        this.password = null;
        this.securityToken = null;
        this.type = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SalesforceServiceCloudLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object apiVersion;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Object environmentUrl;
        private @Nullable Object extendedProperties;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> securityToken;
        private String type;
        private @Nullable Object username;

        public Builder() {
    	      // Empty
        }

        public Builder(SalesforceServiceCloudLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.apiVersion = defaults.apiVersion;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.environmentUrl = defaults.environmentUrl;
    	      this.extendedProperties = defaults.extendedProperties;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.securityToken = defaults.securityToken;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder apiVersion(@Nullable Object apiVersion) {
            this.apiVersion = apiVersion;
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

        public Builder environmentUrl(@Nullable Object environmentUrl) {
            this.environmentUrl = environmentUrl;
            return this;
        }

        public Builder extendedProperties(@Nullable Object extendedProperties) {
            this.extendedProperties = extendedProperties;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }

        public Builder securityToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder username(@Nullable Object username) {
            this.username = username;
            return this;
        }
        public SalesforceServiceCloudLinkedServiceResponse build() {
            return new SalesforceServiceCloudLinkedServiceResponse(annotations, apiVersion, connectVia, description, encryptedCredential, environmentUrl, extendedProperties, parameters, password, securityToken, type, username);
        }
    }
}
