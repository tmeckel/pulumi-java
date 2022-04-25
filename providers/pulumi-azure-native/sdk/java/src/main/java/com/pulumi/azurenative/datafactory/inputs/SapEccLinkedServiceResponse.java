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
 * Linked service for SAP ERP Central Component(SAP ECC).
 * 
 */
public final class SapEccLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SapEccLinkedServiceResponse Empty = new SapEccLinkedServiceResponse();

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
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Either encryptedCredential or username/password must be provided. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable String encryptedCredential;

    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Either encryptedCredential or username/password must be provided. Type: string (or Expression with resultType string).
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
     * The password for Basic authentication.
     * 
     */
    @Import(name="password")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    /**
     * @return The password for Basic authentication.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;SapEcc&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;SapEcc&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * The URL of SAP ECC OData API. For example, &#39;[https://hostname:port/sap/opu/odata/sap/servicename/]&#39;. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="url", required=true)
    private String url;

    /**
     * @return The URL of SAP ECC OData API. For example, &#39;[https://hostname:port/sap/opu/odata/sap/servicename/]&#39;. Type: string (or Expression with resultType string).
     * 
     */
    public String url() {
        return this.url;
    }

    /**
     * The username for Basic authentication. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="username")
    private @Nullable String username;

    /**
     * @return The username for Basic authentication. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    private SapEccLinkedServiceResponse() {}

    private SapEccLinkedServiceResponse(SapEccLinkedServiceResponse $) {
        this.annotations = $.annotations;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.password = $.password;
        this.type = $.type;
        this.url = $.url;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SapEccLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SapEccLinkedServiceResponse $;

        public Builder() {
            $ = new SapEccLinkedServiceResponse();
        }

        public Builder(SapEccLinkedServiceResponse defaults) {
            $ = new SapEccLinkedServiceResponse(Objects.requireNonNull(defaults));
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
         * @param encryptedCredential The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Either encryptedCredential or username/password must be provided. Type: string (or Expression with resultType string).
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
         * @param password The password for Basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password for Basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(AzureKeyVaultSecretReferenceResponse password) {
            return password(Either.ofLeft(password));
        }

        /**
         * @param password The password for Basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(SecureStringResponse password) {
            return password(Either.ofRight(password));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;SapEcc&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param url The URL of SAP ECC OData API. For example, &#39;[https://hostname:port/sap/opu/odata/sap/servicename/]&#39;. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            $.url = url;
            return this;
        }

        /**
         * @param username The username for Basic authentication. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable String username) {
            $.username = username;
            return this;
        }

        public SapEccLinkedServiceResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
