// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
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
 * Linked service for an HTTP source.
 * 
 */
public final class HttpLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final HttpLinkedServiceResponse Empty = new HttpLinkedServiceResponse();

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
     * The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
     * 
     */
    @Import(name="authHeaders")
    private @Nullable Object authHeaders;

    /**
     * @return The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
     * 
     */
    public Optional<Object> authHeaders() {
        return Optional.ofNullable(this.authHeaders);
    }

    /**
     * The authentication type to be used to connect to the HTTP server.
     * 
     */
    @Import(name="authenticationType")
    private @Nullable String authenticationType;

    /**
     * @return The authentication type to be used to connect to the HTTP server.
     * 
     */
    public Optional<String> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    /**
     * Thumbprint of certificate for ClientCertificate authentication. Only valid for on-premises copy. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="certThumbprint")
    private @Nullable Object certThumbprint;

    /**
     * @return Thumbprint of certificate for ClientCertificate authentication. Only valid for on-premises copy. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> certThumbprint() {
        return Optional.ofNullable(this.certThumbprint);
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
     * Base64 encoded certificate data for ClientCertificate authentication. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="embeddedCertData")
    private @Nullable Object embeddedCertData;

    /**
     * @return Base64 encoded certificate data for ClientCertificate authentication. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> embeddedCertData() {
        return Optional.ofNullable(this.embeddedCertData);
    }

    /**
     * If true, validate the HTTPS server SSL certificate. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="enableServerCertificateValidation")
    private @Nullable Object enableServerCertificateValidation;

    /**
     * @return If true, validate the HTTPS server SSL certificate. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> enableServerCertificateValidation() {
        return Optional.ofNullable(this.enableServerCertificateValidation);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Object encryptedCredential;

    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> encryptedCredential() {
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
     * Password for Basic, Digest, Windows, or ClientCertificate with EmbeddedCertData authentication.
     * 
     */
    @Import(name="password")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    /**
     * @return Password for Basic, Digest, Windows, or ClientCertificate with EmbeddedCertData authentication.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;HttpServer&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;HttpServer&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * The base URL of the HTTP endpoint, e.g. http://www.microsoft.com. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="url", required=true)
    private Object url;

    /**
     * @return The base URL of the HTTP endpoint, e.g. http://www.microsoft.com. Type: string (or Expression with resultType string).
     * 
     */
    public Object url() {
        return this.url;
    }

    /**
     * User name for Basic, Digest, or Windows authentication. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
    private @Nullable Object userName;

    /**
     * @return User name for Basic, Digest, or Windows authentication. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> userName() {
        return Optional.ofNullable(this.userName);
    }

    private HttpLinkedServiceResponse() {}

    private HttpLinkedServiceResponse(HttpLinkedServiceResponse $) {
        this.annotations = $.annotations;
        this.authHeaders = $.authHeaders;
        this.authenticationType = $.authenticationType;
        this.certThumbprint = $.certThumbprint;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.embeddedCertData = $.embeddedCertData;
        this.enableServerCertificateValidation = $.enableServerCertificateValidation;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.password = $.password;
        this.type = $.type;
        this.url = $.url;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpLinkedServiceResponse $;

        public Builder() {
            $ = new HttpLinkedServiceResponse();
        }

        public Builder(HttpLinkedServiceResponse defaults) {
            $ = new HttpLinkedServiceResponse(Objects.requireNonNull(defaults));
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
         * @param authHeaders The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
         * 
         * @return builder
         * 
         */
        public Builder authHeaders(@Nullable Object authHeaders) {
            $.authHeaders = authHeaders;
            return this;
        }

        /**
         * @param authenticationType The authentication type to be used to connect to the HTTP server.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(@Nullable String authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param certThumbprint Thumbprint of certificate for ClientCertificate authentication. Only valid for on-premises copy. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder certThumbprint(@Nullable Object certThumbprint) {
            $.certThumbprint = certThumbprint;
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
         * @param embeddedCertData Base64 encoded certificate data for ClientCertificate authentication. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder embeddedCertData(@Nullable Object embeddedCertData) {
            $.embeddedCertData = embeddedCertData;
            return this;
        }

        /**
         * @param enableServerCertificateValidation If true, validate the HTTPS server SSL certificate. Default value is true. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder enableServerCertificateValidation(@Nullable Object enableServerCertificateValidation) {
            $.enableServerCertificateValidation = enableServerCertificateValidation;
            return this;
        }

        /**
         * @param encryptedCredential The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
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
         * @param password Password for Basic, Digest, Windows, or ClientCertificate with EmbeddedCertData authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for Basic, Digest, Windows, or ClientCertificate with EmbeddedCertData authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(AzureKeyVaultSecretReferenceResponse password) {
            return password(Either.ofLeft(password));
        }

        /**
         * @param password Password for Basic, Digest, Windows, or ClientCertificate with EmbeddedCertData authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(SecureStringResponse password) {
            return password(Either.ofRight(password));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;HttpServer&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param url The base URL of the HTTP endpoint, e.g. http://www.microsoft.com. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder url(Object url) {
            $.url = url;
            return this;
        }

        /**
         * @param userName User name for Basic, Digest, or Windows authentication. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Object userName) {
            $.userName = userName;
            return this;
        }

        public HttpLinkedServiceResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
