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
public final class ShopifyLinkedServiceResponse {
    /**
     * @return The API access token that can be used to access Shopify’s data. The token won&#39;t expire if it is offline mode.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken;
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
     * @return The endpoint of the Shopify server. (i.e. mystore.myshopify.com)
     * 
     */
    private final Object host;
    /**
     * @return Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * @return Type of linked service.
     * Expected value is &#39;Shopify&#39;.
     * 
     */
    private final String type;
    /**
     * @return Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    private final @Nullable Object useEncryptedEndpoints;
    /**
     * @return Specifies whether to require the host name in the server&#39;s certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
     */
    private final @Nullable Object useHostVerification;
    /**
     * @return Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
     */
    private final @Nullable Object usePeerVerification;

    @CustomType.Constructor
    private ShopifyLinkedServiceResponse(
        @CustomType.Parameter("accessToken") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken,
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("host") Object host,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("useEncryptedEndpoints") @Nullable Object useEncryptedEndpoints,
        @CustomType.Parameter("useHostVerification") @Nullable Object useHostVerification,
        @CustomType.Parameter("usePeerVerification") @Nullable Object usePeerVerification) {
        this.accessToken = accessToken;
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.host = host;
        this.parameters = parameters;
        this.type = type;
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
    }

    /**
     * @return The API access token that can be used to access Shopify’s data. The token won&#39;t expire if it is offline mode.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> accessToken() {
        return Optional.ofNullable(this.accessToken);
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
     * @return The endpoint of the Shopify server. (i.e. mystore.myshopify.com)
     * 
     */
    public Object host() {
        return this.host;
    }
    /**
     * @return Parameters for linked service.
     * 
     */
    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * @return Type of linked service.
     * Expected value is &#39;Shopify&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    public Optional<Object> useEncryptedEndpoints() {
        return Optional.ofNullable(this.useEncryptedEndpoints);
    }
    /**
     * @return Specifies whether to require the host name in the server&#39;s certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
     */
    public Optional<Object> useHostVerification() {
        return Optional.ofNullable(this.useHostVerification);
    }
    /**
     * @return Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
     */
    public Optional<Object> usePeerVerification() {
        return Optional.ofNullable(this.usePeerVerification);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShopifyLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken;
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private Object host;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private String type;
        private @Nullable Object useEncryptedEndpoints;
        private @Nullable Object useHostVerification;
        private @Nullable Object usePeerVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(ShopifyLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
        }

        public Builder accessToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken) {
            this.accessToken = accessToken;
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
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder host(Object host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder useEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            this.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }
        public Builder useHostVerification(@Nullable Object useHostVerification) {
            this.useHostVerification = useHostVerification;
            return this;
        }
        public Builder usePeerVerification(@Nullable Object usePeerVerification) {
            this.usePeerVerification = usePeerVerification;
            return this;
        }        public ShopifyLinkedServiceResponse build() {
            return new ShopifyLinkedServiceResponse(accessToken, annotations, connectVia, description, encryptedCredential, host, parameters, type, useEncryptedEndpoints, useHostVerification, usePeerVerification);
        }
    }
}
