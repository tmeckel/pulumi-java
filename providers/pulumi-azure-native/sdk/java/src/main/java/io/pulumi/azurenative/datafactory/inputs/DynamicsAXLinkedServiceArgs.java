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
 * Dynamics AX linked service.
 * 
 */
public final class DynamicsAXLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DynamicsAXLinkedServiceArgs Empty = new DynamicsAXLinkedServiceArgs();

    /**
     * Specify the resource you are requesting authorization. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="aadResourceId", required=true)
      private final Input<Object> aadResourceId;

    public Input<Object> getAadResourceId() {
        return this.aadResourceId;
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
     * Specify the application's client ID. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="servicePrincipalId", required=true)
      private final Input<Object> servicePrincipalId;

    public Input<Object> getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Specify the application's key. Mark this field as a SecureString to store it securely in Data Factory, or reference a secret stored in Azure Key Vault. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="servicePrincipalKey", required=true)
      private final Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Specify the tenant information (domain name or tenant ID) under which your application resides. Retrieve it by hovering the mouse in the top-right corner of the Azure portal. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="tenant", required=true)
      private final Input<Object> tenant;

    public Input<Object> getTenant() {
        return this.tenant;
    }

    /**
     * Type of linked service.
     * Expected value is 'DynamicsAX'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The Dynamics AX (or Dynamics 365 Finance and Operations) instance OData endpoint.
     * 
     */
    @InputImport(name="url", required=true)
      private final Input<Object> url;

    public Input<Object> getUrl() {
        return this.url;
    }

    public DynamicsAXLinkedServiceArgs(
        Input<Object> aadResourceId,
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        Input<Object> servicePrincipalId,
        Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey,
        Input<Object> tenant,
        Input<String> type,
        Input<Object> url) {
        this.aadResourceId = Objects.requireNonNull(aadResourceId, "expected parameter 'aadResourceId' to be non-null");
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.servicePrincipalId = Objects.requireNonNull(servicePrincipalId, "expected parameter 'servicePrincipalId' to be non-null");
        this.servicePrincipalKey = Objects.requireNonNull(servicePrincipalKey, "expected parameter 'servicePrincipalKey' to be non-null");
        this.tenant = Objects.requireNonNull(tenant, "expected parameter 'tenant' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private DynamicsAXLinkedServiceArgs() {
        this.aadResourceId = Input.empty();
        this.annotations = Input.empty();
        this.connectVia = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.parameters = Input.empty();
        this.servicePrincipalId = Input.empty();
        this.servicePrincipalKey = Input.empty();
        this.tenant = Input.empty();
        this.type = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicsAXLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Object> aadResourceId;
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private Input<Object> servicePrincipalId;
        private Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;
        private Input<Object> tenant;
        private Input<String> type;
        private Input<Object> url;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicsAXLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadResourceId = defaults.aadResourceId;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
        }

        public Builder aadResourceId(Input<Object> aadResourceId) {
            this.aadResourceId = Objects.requireNonNull(aadResourceId);
            return this;
        }

        public Builder aadResourceId(Object aadResourceId) {
            this.aadResourceId = Input.of(Objects.requireNonNull(aadResourceId));
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

        public Builder servicePrincipalId(Input<Object> servicePrincipalId) {
            this.servicePrincipalId = Objects.requireNonNull(servicePrincipalId);
            return this;
        }

        public Builder servicePrincipalId(Object servicePrincipalId) {
            this.servicePrincipalId = Input.of(Objects.requireNonNull(servicePrincipalId));
            return this;
        }

        public Builder servicePrincipalKey(Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            this.servicePrincipalKey = Objects.requireNonNull(servicePrincipalKey);
            return this;
        }

        public Builder servicePrincipalKey(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            this.servicePrincipalKey = Input.of(Objects.requireNonNull(servicePrincipalKey));
            return this;
        }

        public Builder tenant(Input<Object> tenant) {
            this.tenant = Objects.requireNonNull(tenant);
            return this;
        }

        public Builder tenant(Object tenant) {
            this.tenant = Input.of(Objects.requireNonNull(tenant));
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

        public Builder url(Input<Object> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder url(Object url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }
        public DynamicsAXLinkedServiceArgs build() {
            return new DynamicsAXLinkedServiceArgs(aadResourceId, annotations, connectVia, description, encryptedCredential, parameters, servicePrincipalId, servicePrincipalKey, tenant, type, url);
        }
    }
}
