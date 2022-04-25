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
 * SAP Business Warehouse Linked Service.
 * 
 */
public final class SapBWLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SapBWLinkedServiceResponse Empty = new SapBWLinkedServiceResponse();

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
     * Client ID of the client on the BW system. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clientId", required=true)
    private Object clientId;

    /**
     * @return Client ID of the client on the BW system. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     * 
     */
    public Object clientId() {
        return this.clientId;
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
     * Password to access the SAP BW server.
     * 
     */
    @Import(name="password")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    /**
     * @return Password to access the SAP BW server.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Host name of the SAP BW instance. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="server", required=true)
    private Object server;

    /**
     * @return Host name of the SAP BW instance. Type: string (or Expression with resultType string).
     * 
     */
    public Object server() {
        return this.server;
    }

    /**
     * System number of the BW system. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="systemNumber", required=true)
    private Object systemNumber;

    /**
     * @return System number of the BW system. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
     */
    public Object systemNumber() {
        return this.systemNumber;
    }

    /**
     * Type of linked service.
     * Expected value is &#39;SapBW&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;SapBW&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * Username to access the SAP BW server. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
    private @Nullable Object userName;

    /**
     * @return Username to access the SAP BW server. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> userName() {
        return Optional.ofNullable(this.userName);
    }

    private SapBWLinkedServiceResponse() {}

    private SapBWLinkedServiceResponse(SapBWLinkedServiceResponse $) {
        this.annotations = $.annotations;
        this.clientId = $.clientId;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.password = $.password;
        this.server = $.server;
        this.systemNumber = $.systemNumber;
        this.type = $.type;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SapBWLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SapBWLinkedServiceResponse $;

        public Builder() {
            $ = new SapBWLinkedServiceResponse();
        }

        public Builder(SapBWLinkedServiceResponse defaults) {
            $ = new SapBWLinkedServiceResponse(Objects.requireNonNull(defaults));
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
         * @param clientId Client ID of the client on the BW system. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder clientId(Object clientId) {
            $.clientId = clientId;
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
         * @param password Password to access the SAP BW server.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password to access the SAP BW server.
         * 
         * @return builder
         * 
         */
        public Builder password(AzureKeyVaultSecretReferenceResponse password) {
            return password(Either.ofLeft(password));
        }

        /**
         * @param password Password to access the SAP BW server.
         * 
         * @return builder
         * 
         */
        public Builder password(SecureStringResponse password) {
            return password(Either.ofRight(password));
        }

        /**
         * @param server Host name of the SAP BW instance. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder server(Object server) {
            $.server = server;
            return this;
        }

        /**
         * @param systemNumber System number of the BW system. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder systemNumber(Object systemNumber) {
            $.systemNumber = systemNumber;
            return this;
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;SapBW&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param userName Username to access the SAP BW server. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Object userName) {
            $.userName = userName;
            return this;
        }

        public SapBWLinkedServiceResponse build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.server = Objects.requireNonNull($.server, "expected parameter 'server' to be non-null");
            $.systemNumber = Objects.requireNonNull($.systemNumber, "expected parameter 'systemNumber' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
