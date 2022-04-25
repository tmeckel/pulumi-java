// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SalesforceServiceCloudLinkedServiceResponse {
    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * @return The Salesforce API version used in ADF. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object apiVersion;
    /**
     * @return The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * @return Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * @return The URL of Salesforce Service Cloud instance. Default is &#39;https://login.salesforce.com&#39;. To copy data from sandbox, specify &#39;https://test.salesforce.com&#39;. To copy data from custom domain, specify, for example, &#39;https://[domain].my.salesforce.com&#39;. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object environmentUrl;
    /**
     * @return Extended properties appended to the connection string. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object extendedProperties;
    /**
     * @return Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * @return The password for Basic authentication of the Salesforce instance.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * @return The security token is optional to remotely access Salesforce instance.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> securityToken;
    /**
     * @return Type of linked service.
     * Expected value is &#39;SalesforceServiceCloud&#39;.
     * 
     */
    private final String type;
    /**
     * @return The username for Basic authentication of the Salesforce instance. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object username;

    @CustomType.Constructor
    private SalesforceServiceCloudLinkedServiceResponse(
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("apiVersion") @Nullable Object apiVersion,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("environmentUrl") @Nullable Object environmentUrl,
        @CustomType.Parameter("extendedProperties") @Nullable Object extendedProperties,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("password") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @CustomType.Parameter("securityToken") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> securityToken,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("username") @Nullable Object username) {
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
        this.type = type;
        this.username = username;
    }

    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * @return The Salesforce API version used in ADF. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return The integration runtime reference.
     * 
     */
    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * @return Linked service description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * @return The URL of Salesforce Service Cloud instance. Default is &#39;https://login.salesforce.com&#39;. To copy data from sandbox, specify &#39;https://test.salesforce.com&#39;. To copy data from custom domain, specify, for example, &#39;https://[domain].my.salesforce.com&#39;. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> environmentUrl() {
        return Optional.ofNullable(this.environmentUrl);
    }
    /**
     * @return Extended properties appended to the connection string. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> extendedProperties() {
        return Optional.ofNullable(this.extendedProperties);
    }
    /**
     * @return Parameters for linked service.
     * 
     */
    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * @return The password for Basic authentication of the Salesforce instance.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return The security token is optional to remotely access Salesforce instance.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> securityToken() {
        return Optional.ofNullable(this.securityToken);
    }
    /**
     * @return Type of linked service.
     * Expected value is &#39;SalesforceServiceCloud&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The username for Basic authentication of the Salesforce instance. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> username() {
        return Optional.ofNullable(this.username);
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
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
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
        }        public SalesforceServiceCloudLinkedServiceResponse build() {
            return new SalesforceServiceCloudLinkedServiceResponse(annotations, apiVersion, connectVia, description, encryptedCredential, environmentUrl, extendedProperties, parameters, password, securityToken, type, username);
        }
    }
}
