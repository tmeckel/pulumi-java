// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
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
 * Jira Service linked service.
 * 
 */
public final class JiraLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final JiraLinkedServiceArgs Empty = new JiraLinkedServiceArgs();

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
     * The IP address or host name of the Jira service. (e.g. jira.example.com)
     * 
     */
    @Import(name="host", required=true)
    private Output<Object> host;

    /**
     * @return The IP address or host name of the Jira service. (e.g. jira.example.com)
     * 
     */
    public Output<Object> host() {
        return this.host;
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
     * The password corresponding to the user name that you provided in the username field.
     * 
     */
    @Import(name="password")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    /**
     * @return The password corresponding to the user name that you provided in the username field.
     * 
     */
    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The TCP port that the Jira server uses to listen for client connections. The default value is 443 if connecting through HTTPS, or 8080 if connecting through HTTP.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Object> port;

    /**
     * @return The TCP port that the Jira server uses to listen for client connections. The default value is 443 if connecting through HTTPS, or 8080 if connecting through HTTP.
     * 
     */
    public Optional<Output<Object>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;Jira&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;Jira&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    @Import(name="useEncryptedEndpoints")
    private @Nullable Output<Object> useEncryptedEndpoints;

    /**
     * @return Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    public Optional<Output<Object>> useEncryptedEndpoints() {
        return Optional.ofNullable(this.useEncryptedEndpoints);
    }

    /**
     * Specifies whether to require the host name in the server&#39;s certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="useHostVerification")
    private @Nullable Output<Object> useHostVerification;

    /**
     * @return Specifies whether to require the host name in the server&#39;s certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
     */
    public Optional<Output<Object>> useHostVerification() {
        return Optional.ofNullable(this.useHostVerification);
    }

    /**
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="usePeerVerification")
    private @Nullable Output<Object> usePeerVerification;

    /**
     * @return Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
     */
    public Optional<Output<Object>> usePeerVerification() {
        return Optional.ofNullable(this.usePeerVerification);
    }

    /**
     * The user name that you use to access Jira Service.
     * 
     */
    @Import(name="username", required=true)
    private Output<Object> username;

    /**
     * @return The user name that you use to access Jira Service.
     * 
     */
    public Output<Object> username() {
        return this.username;
    }

    private JiraLinkedServiceArgs() {}

    private JiraLinkedServiceArgs(JiraLinkedServiceArgs $) {
        this.annotations = $.annotations;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.host = $.host;
        this.parameters = $.parameters;
        this.password = $.password;
        this.port = $.port;
        this.type = $.type;
        this.useEncryptedEndpoints = $.useEncryptedEndpoints;
        this.useHostVerification = $.useHostVerification;
        this.usePeerVerification = $.usePeerVerification;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JiraLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JiraLinkedServiceArgs $;

        public Builder() {
            $ = new JiraLinkedServiceArgs();
        }

        public Builder(JiraLinkedServiceArgs defaults) {
            $ = new JiraLinkedServiceArgs(Objects.requireNonNull(defaults));
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
         * @param host The IP address or host name of the Jira service. (e.g. jira.example.com)
         * 
         * @return builder
         * 
         */
        public Builder host(Output<Object> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The IP address or host name of the Jira service. (e.g. jira.example.com)
         * 
         * @return builder
         * 
         */
        public Builder host(Object host) {
            return host(Output.of(host));
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
         * @param password The password corresponding to the user name that you provided in the username field.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password corresponding to the user name that you provided in the username field.
         * 
         * @return builder
         * 
         */
        public Builder password(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            return password(Output.of(password));
        }

        /**
         * @param password The password corresponding to the user name that you provided in the username field.
         * 
         * @return builder
         * 
         */
        public Builder password(AzureKeyVaultSecretReferenceArgs password) {
            return password(Either.ofLeft(password));
        }

        /**
         * @param password The password corresponding to the user name that you provided in the username field.
         * 
         * @return builder
         * 
         */
        public Builder password(SecureStringArgs password) {
            return password(Either.ofRight(password));
        }

        /**
         * @param port The TCP port that the Jira server uses to listen for client connections. The default value is 443 if connecting through HTTPS, or 8080 if connecting through HTTP.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Object> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The TCP port that the Jira server uses to listen for client connections. The default value is 443 if connecting through HTTPS, or 8080 if connecting through HTTP.
         * 
         * @return builder
         * 
         */
        public Builder port(Object port) {
            return port(Output.of(port));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;Jira&#39;.
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
         * Expected value is &#39;Jira&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param useEncryptedEndpoints Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
         * 
         * @return builder
         * 
         */
        public Builder useEncryptedEndpoints(@Nullable Output<Object> useEncryptedEndpoints) {
            $.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }

        /**
         * @param useEncryptedEndpoints Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
         * 
         * @return builder
         * 
         */
        public Builder useEncryptedEndpoints(Object useEncryptedEndpoints) {
            return useEncryptedEndpoints(Output.of(useEncryptedEndpoints));
        }

        /**
         * @param useHostVerification Specifies whether to require the host name in the server&#39;s certificate to match the host name of the server when connecting over SSL. The default value is true.
         * 
         * @return builder
         * 
         */
        public Builder useHostVerification(@Nullable Output<Object> useHostVerification) {
            $.useHostVerification = useHostVerification;
            return this;
        }

        /**
         * @param useHostVerification Specifies whether to require the host name in the server&#39;s certificate to match the host name of the server when connecting over SSL. The default value is true.
         * 
         * @return builder
         * 
         */
        public Builder useHostVerification(Object useHostVerification) {
            return useHostVerification(Output.of(useHostVerification));
        }

        /**
         * @param usePeerVerification Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
         * 
         * @return builder
         * 
         */
        public Builder usePeerVerification(@Nullable Output<Object> usePeerVerification) {
            $.usePeerVerification = usePeerVerification;
            return this;
        }

        /**
         * @param usePeerVerification Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
         * 
         * @return builder
         * 
         */
        public Builder usePeerVerification(Object usePeerVerification) {
            return usePeerVerification(Output.of(usePeerVerification));
        }

        /**
         * @param username The user name that you use to access Jira Service.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<Object> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The user name that you use to access Jira Service.
         * 
         * @return builder
         * 
         */
        public Builder username(Object username) {
            return username(Output.of(username));
        }

        public JiraLinkedServiceArgs build() {
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
