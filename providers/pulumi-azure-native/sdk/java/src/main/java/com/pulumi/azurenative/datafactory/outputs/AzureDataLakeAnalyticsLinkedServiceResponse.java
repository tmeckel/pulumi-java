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
public final class AzureDataLakeAnalyticsLinkedServiceResponse {
    /**
     * @return The Azure Data Lake Analytics account name. Type: string (or Expression with resultType string).
     * 
     */
    private final Object accountName;
    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * @return The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * @return Azure Data Lake Analytics URI Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object dataLakeAnalyticsUri;
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
     * @return Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * @return Data Lake Analytics account resource group name (if different from Data Factory account). Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object resourceGroupName;
    /**
     * @return The ID of the application used to authenticate against the Azure Data Lake Analytics account. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object servicePrincipalId;
    /**
     * @return The Key of the application used to authenticate against the Azure Data Lake Analytics account.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
    /**
     * @return Data Lake Analytics account subscription ID (if different from Data Factory account). Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object subscriptionId;
    /**
     * @return The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    private final Object tenant;
    /**
     * @return Type of linked service.
     * Expected value is &#39;AzureDataLakeAnalytics&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AzureDataLakeAnalyticsLinkedServiceResponse(
        @CustomType.Parameter("accountName") Object accountName,
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("dataLakeAnalyticsUri") @Nullable Object dataLakeAnalyticsUri,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("resourceGroupName") @Nullable Object resourceGroupName,
        @CustomType.Parameter("servicePrincipalId") @Nullable Object servicePrincipalId,
        @CustomType.Parameter("servicePrincipalKey") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        @CustomType.Parameter("subscriptionId") @Nullable Object subscriptionId,
        @CustomType.Parameter("tenant") Object tenant,
        @CustomType.Parameter("type") String type) {
        this.accountName = accountName;
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.dataLakeAnalyticsUri = dataLakeAnalyticsUri;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.resourceGroupName = resourceGroupName;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.subscriptionId = subscriptionId;
        this.tenant = tenant;
        this.type = type;
    }

    /**
     * @return The Azure Data Lake Analytics account name. Type: string (or Expression with resultType string).
     * 
     */
    public Object accountName() {
        return this.accountName;
    }
    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * @return The integration runtime reference.
     * 
     */
    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * @return Azure Data Lake Analytics URI Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> dataLakeAnalyticsUri() {
        return Optional.ofNullable(this.dataLakeAnalyticsUri);
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
     * @return Parameters for linked service.
     * 
     */
    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * @return Data Lake Analytics account resource group name (if different from Data Factory account). Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    /**
     * @return The ID of the application used to authenticate against the Azure Data Lake Analytics account. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }
    /**
     * @return The Key of the application used to authenticate against the Azure Data Lake Analytics account.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> servicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }
    /**
     * @return Data Lake Analytics account subscription ID (if different from Data Factory account). Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }
    /**
     * @return The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    public Object tenant() {
        return this.tenant;
    }
    /**
     * @return Type of linked service.
     * Expected value is &#39;AzureDataLakeAnalytics&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataLakeAnalyticsLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object accountName;
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable Object dataLakeAnalyticsUri;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object resourceGroupName;
        private @Nullable Object servicePrincipalId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private @Nullable Object subscriptionId;
        private Object tenant;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataLakeAnalyticsLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.dataLakeAnalyticsUri = defaults.dataLakeAnalyticsUri;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder accountName(Object accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder dataLakeAnalyticsUri(@Nullable Object dataLakeAnalyticsUri) {
            this.dataLakeAnalyticsUri = dataLakeAnalyticsUri;
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
        public Builder resourceGroupName(@Nullable Object resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }
        public Builder servicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }
        public Builder subscriptionId(@Nullable Object subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Builder tenant(Object tenant) {
            this.tenant = Objects.requireNonNull(tenant);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AzureDataLakeAnalyticsLinkedServiceResponse build() {
            return new AzureDataLakeAnalyticsLinkedServiceResponse(accountName, annotations, connectVia, dataLakeAnalyticsUri, description, encryptedCredential, parameters, resourceGroupName, servicePrincipalId, servicePrincipalKey, subscriptionId, tenant, type);
        }
    }
}
