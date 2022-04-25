// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.RestServiceAuthenticationType;
import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
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
 * Rest Service linked service.
 * 
 */
public final class RestServiceLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RestServiceLinkedServiceArgs Empty = new RestServiceLinkedServiceArgs();

    /**
     * The resource you are requesting authorization to use.
     * 
     */
    @Import(name="aadResourceId")
    private @Nullable Output<Object> aadResourceId;

    /**
     * @return The resource you are requesting authorization to use.
     * 
     */
    public Optional<Output<Object>> aadResourceId() {
        return Optional.ofNullable(this.aadResourceId);
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
     * 
     */
    @Import(name="authHeaders")
    private @Nullable Output<Object> authHeaders;

    /**
     * @return The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
     * 
     */
    public Optional<Output<Object>> authHeaders() {
        return Optional.ofNullable(this.authHeaders);
    }

    /**
     * Type of authentication used to connect to the REST service.
     * 
     */
    @Import(name="authenticationType", required=true)
    private Output<Either<String,RestServiceAuthenticationType>> authenticationType;

    /**
     * @return Type of authentication used to connect to the REST service.
     * 
     */
    public Output<Either<String,RestServiceAuthenticationType>> authenticationType() {
        return this.authenticationType;
    }

    /**
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="azureCloudType")
    private @Nullable Output<Object> azureCloudType;

    /**
     * @return Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> azureCloudType() {
        return Optional.ofNullable(this.azureCloudType);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    /**
     * @return The integration runtime reference.
     * 
     */
    public Optional<Output<IntegrationRuntimeReferenceArgs>> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
    private @Nullable Output<CredentialReferenceArgs> credential;

    /**
     * @return The credential reference containing authentication information.
     * 
     */
    public Optional<Output<CredentialReferenceArgs>> credential() {
        return Optional.ofNullable(this.credential);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Linked service description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether to validate server side SSL certificate when connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="enableServerCertificateValidation")
    private @Nullable Output<Object> enableServerCertificateValidation;

    /**
     * @return Whether to validate server side SSL certificate when connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> enableServerCertificateValidation() {
        return Optional.ofNullable(this.enableServerCertificateValidation);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Output<Object> encryptedCredential;

    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    /**
     * @return Parameters for linked service.
     * 
     */
    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The password used in Basic authentication type.
     * 
     */
    @Import(name="password")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    /**
     * @return The password used in Basic authentication type.
     * 
     */
    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The application&#39;s client ID used in AadServicePrincipal authentication type.
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Output<Object> servicePrincipalId;

    /**
     * @return The application&#39;s client ID used in AadServicePrincipal authentication type.
     * 
     */
    public Optional<Output<Object>> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The application&#39;s key used in AadServicePrincipal authentication type.
     * 
     */
    @Import(name="servicePrincipalKey")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    /**
     * @return The application&#39;s key used in AadServicePrincipal authentication type.
     * 
     */
    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> servicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }

    /**
     * The tenant information (domain name or tenant ID) used in AadServicePrincipal authentication type under which your application resides.
     * 
     */
    @Import(name="tenant")
    private @Nullable Output<Object> tenant;

    /**
     * @return The tenant information (domain name or tenant ID) used in AadServicePrincipal authentication type under which your application resides.
     * 
     */
    public Optional<Output<Object>> tenant() {
        return Optional.ofNullable(this.tenant);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;RestService&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;RestService&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The base URL of the REST service.
     * 
     */
    @Import(name="url", required=true)
    private Output<Object> url;

    /**
     * @return The base URL of the REST service.
     * 
     */
    public Output<Object> url() {
        return this.url;
    }

    /**
     * The user name used in Basic authentication type.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<Object> userName;

    /**
     * @return The user name used in Basic authentication type.
     * 
     */
    public Optional<Output<Object>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private RestServiceLinkedServiceArgs() {}

    private RestServiceLinkedServiceArgs(RestServiceLinkedServiceArgs $) {
        this.aadResourceId = $.aadResourceId;
        this.annotations = $.annotations;
        this.authHeaders = $.authHeaders;
        this.authenticationType = $.authenticationType;
        this.azureCloudType = $.azureCloudType;
        this.connectVia = $.connectVia;
        this.credential = $.credential;
        this.description = $.description;
        this.enableServerCertificateValidation = $.enableServerCertificateValidation;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.password = $.password;
        this.servicePrincipalId = $.servicePrincipalId;
        this.servicePrincipalKey = $.servicePrincipalKey;
        this.tenant = $.tenant;
        this.type = $.type;
        this.url = $.url;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestServiceLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestServiceLinkedServiceArgs $;

        public Builder() {
            $ = new RestServiceLinkedServiceArgs();
        }

        public Builder(RestServiceLinkedServiceArgs defaults) {
            $ = new RestServiceLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aadResourceId The resource you are requesting authorization to use.
         * 
         * @return builder
         * 
         */
        public Builder aadResourceId(@Nullable Output<Object> aadResourceId) {
            $.aadResourceId = aadResourceId;
            return this;
        }

        /**
         * @param aadResourceId The resource you are requesting authorization to use.
         * 
         * @return builder
         * 
         */
        public Builder aadResourceId(Object aadResourceId) {
            return aadResourceId(Output.of(aadResourceId));
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
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
         * @param authHeaders The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
         * 
         * @return builder
         * 
         */
        public Builder authHeaders(@Nullable Output<Object> authHeaders) {
            $.authHeaders = authHeaders;
            return this;
        }

        /**
         * @param authHeaders The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
         * 
         * @return builder
         * 
         */
        public Builder authHeaders(Object authHeaders) {
            return authHeaders(Output.of(authHeaders));
        }

        /**
         * @param authenticationType Type of authentication used to connect to the REST service.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(Output<Either<String,RestServiceAuthenticationType>> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param authenticationType Type of authentication used to connect to the REST service.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(Either<String,RestServiceAuthenticationType> authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        /**
         * @param authenticationType Type of authentication used to connect to the REST service.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(String authenticationType) {
            return authenticationType(Either.ofLeft(authenticationType));
        }

        /**
         * @param authenticationType Type of authentication used to connect to the REST service.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(RestServiceAuthenticationType authenticationType) {
            return authenticationType(Either.ofRight(authenticationType));
        }

        /**
         * @param azureCloudType Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder azureCloudType(@Nullable Output<Object> azureCloudType) {
            $.azureCloudType = azureCloudType;
            return this;
        }

        /**
         * @param azureCloudType Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder azureCloudType(Object azureCloudType) {
            return azureCloudType(Output.of(azureCloudType));
        }

        /**
         * @param connectVia The integration runtime reference.
         * 
         * @return builder
         * 
         */
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        /**
         * @param connectVia The integration runtime reference.
         * 
         * @return builder
         * 
         */
        public Builder connectVia(IntegrationRuntimeReferenceArgs connectVia) {
            return connectVia(Output.of(connectVia));
        }

        /**
         * @param credential The credential reference containing authentication information.
         * 
         * @return builder
         * 
         */
        public Builder credential(@Nullable Output<CredentialReferenceArgs> credential) {
            $.credential = credential;
            return this;
        }

        /**
         * @param credential The credential reference containing authentication information.
         * 
         * @return builder
         * 
         */
        public Builder credential(CredentialReferenceArgs credential) {
            return credential(Output.of(credential));
        }

        /**
         * @param description Linked service description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Linked service description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enableServerCertificateValidation Whether to validate server side SSL certificate when connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder enableServerCertificateValidation(@Nullable Output<Object> enableServerCertificateValidation) {
            $.enableServerCertificateValidation = enableServerCertificateValidation;
            return this;
        }

        /**
         * @param enableServerCertificateValidation Whether to validate server side SSL certificate when connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder enableServerCertificateValidation(Object enableServerCertificateValidation) {
            return enableServerCertificateValidation(Output.of(enableServerCertificateValidation));
        }

        /**
         * @param encryptedCredential The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        /**
         * @param encryptedCredential The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder encryptedCredential(Object encryptedCredential) {
            return encryptedCredential(Output.of(encryptedCredential));
        }

        /**
         * @param parameters Parameters for linked service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters for linked service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param password The password used in Basic authentication type.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password used in Basic authentication type.
         * 
         * @return builder
         * 
         */
        public Builder password(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            return password(Output.of(password));
        }

        /**
         * @param password The password used in Basic authentication type.
         * 
         * @return builder
         * 
         */
        public Builder password(AzureKeyVaultSecretReferenceArgs password) {
            return password(Either.ofLeft(password));
        }

        /**
         * @param password The password used in Basic authentication type.
         * 
         * @return builder
         * 
         */
        public Builder password(SecureStringArgs password) {
            return password(Either.ofRight(password));
        }

        /**
         * @param servicePrincipalId The application&#39;s client ID used in AadServicePrincipal authentication type.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(@Nullable Output<Object> servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        /**
         * @param servicePrincipalId The application&#39;s client ID used in AadServicePrincipal authentication type.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(Object servicePrincipalId) {
            return servicePrincipalId(Output.of(servicePrincipalId));
        }

        /**
         * @param servicePrincipalKey The application&#39;s key used in AadServicePrincipal authentication type.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            $.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        /**
         * @param servicePrincipalKey The application&#39;s key used in AadServicePrincipal authentication type.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            return servicePrincipalKey(Output.of(servicePrincipalKey));
        }

        /**
         * @param servicePrincipalKey The application&#39;s key used in AadServicePrincipal authentication type.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(AzureKeyVaultSecretReferenceArgs servicePrincipalKey) {
            return servicePrincipalKey(Either.ofLeft(servicePrincipalKey));
        }

        /**
         * @param servicePrincipalKey The application&#39;s key used in AadServicePrincipal authentication type.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(SecureStringArgs servicePrincipalKey) {
            return servicePrincipalKey(Either.ofRight(servicePrincipalKey));
        }

        /**
         * @param tenant The tenant information (domain name or tenant ID) used in AadServicePrincipal authentication type under which your application resides.
         * 
         * @return builder
         * 
         */
        public Builder tenant(@Nullable Output<Object> tenant) {
            $.tenant = tenant;
            return this;
        }

        /**
         * @param tenant The tenant information (domain name or tenant ID) used in AadServicePrincipal authentication type under which your application resides.
         * 
         * @return builder
         * 
         */
        public Builder tenant(Object tenant) {
            return tenant(Output.of(tenant));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;RestService&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;RestService&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param url The base URL of the REST service.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<Object> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The base URL of the REST service.
         * 
         * @return builder
         * 
         */
        public Builder url(Object url) {
            return url(Output.of(url));
        }

        /**
         * @param userName The user name used in Basic authentication type.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<Object> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The user name used in Basic authentication type.
         * 
         * @return builder
         * 
         */
        public Builder userName(Object userName) {
            return userName(Output.of(userName));
        }

        public RestServiceLinkedServiceArgs build() {
            $.authenticationType = Objects.requireNonNull($.authenticationType, "expected parameter 'authenticationType' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
