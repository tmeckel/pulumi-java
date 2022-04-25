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
 * Linked service for Salesforce.
 * 
 */
public final class SalesforceLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SalesforceLinkedServiceArgs Empty = new SalesforceLinkedServiceArgs();

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
     * The Salesforce API version used in ADF. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<Object> apiVersion;

    /**
     * @return The Salesforce API version used in ADF. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
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
     * The URL of Salesforce instance. Default is &#39;https://login.salesforce.com&#39;. To copy data from sandbox, specify &#39;https://test.salesforce.com&#39;. To copy data from custom domain, specify, for example, &#39;https://[domain].my.salesforce.com&#39;. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="environmentUrl")
    private @Nullable Output<Object> environmentUrl;

    /**
     * @return The URL of Salesforce instance. Default is &#39;https://login.salesforce.com&#39;. To copy data from sandbox, specify &#39;https://test.salesforce.com&#39;. To copy data from custom domain, specify, for example, &#39;https://[domain].my.salesforce.com&#39;. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> environmentUrl() {
        return Optional.ofNullable(this.environmentUrl);
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
     * The password for Basic authentication of the Salesforce instance.
     * 
     */
    @Import(name="password")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    /**
     * @return The password for Basic authentication of the Salesforce instance.
     * 
     */
    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The security token is optional to remotely access Salesforce instance.
     * 
     */
    @Import(name="securityToken")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> securityToken;

    /**
     * @return The security token is optional to remotely access Salesforce instance.
     * 
     */
    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> securityToken() {
        return Optional.ofNullable(this.securityToken);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;Salesforce&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;Salesforce&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The username for Basic authentication of the Salesforce instance. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="username")
    private @Nullable Output<Object> username;

    /**
     * @return The username for Basic authentication of the Salesforce instance. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> username() {
        return Optional.ofNullable(this.username);
    }

    private SalesforceLinkedServiceArgs() {}

    private SalesforceLinkedServiceArgs(SalesforceLinkedServiceArgs $) {
        this.annotations = $.annotations;
        this.apiVersion = $.apiVersion;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.environmentUrl = $.environmentUrl;
        this.parameters = $.parameters;
        this.password = $.password;
        this.securityToken = $.securityToken;
        this.type = $.type;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SalesforceLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SalesforceLinkedServiceArgs $;

        public Builder() {
            $ = new SalesforceLinkedServiceArgs();
        }

        public Builder(SalesforceLinkedServiceArgs defaults) {
            $ = new SalesforceLinkedServiceArgs(Objects.requireNonNull(defaults));
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
         * @param apiVersion The Salesforce API version used in ADF. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<Object> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion The Salesforce API version used in ADF. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(Object apiVersion) {
            return apiVersion(Output.of(apiVersion));
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
         * @param environmentUrl The URL of Salesforce instance. Default is &#39;https://login.salesforce.com&#39;. To copy data from sandbox, specify &#39;https://test.salesforce.com&#39;. To copy data from custom domain, specify, for example, &#39;https://[domain].my.salesforce.com&#39;. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder environmentUrl(@Nullable Output<Object> environmentUrl) {
            $.environmentUrl = environmentUrl;
            return this;
        }

        /**
         * @param environmentUrl The URL of Salesforce instance. Default is &#39;https://login.salesforce.com&#39;. To copy data from sandbox, specify &#39;https://test.salesforce.com&#39;. To copy data from custom domain, specify, for example, &#39;https://[domain].my.salesforce.com&#39;. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder environmentUrl(Object environmentUrl) {
            return environmentUrl(Output.of(environmentUrl));
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
         * @param password The password for Basic authentication of the Salesforce instance.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password for Basic authentication of the Salesforce instance.
         * 
         * @return builder
         * 
         */
        public Builder password(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            return password(Output.of(password));
        }

        /**
         * @param password The password for Basic authentication of the Salesforce instance.
         * 
         * @return builder
         * 
         */
        public Builder password(AzureKeyVaultSecretReferenceArgs password) {
            return password(Either.ofLeft(password));
        }

        /**
         * @param password The password for Basic authentication of the Salesforce instance.
         * 
         * @return builder
         * 
         */
        public Builder password(SecureStringArgs password) {
            return password(Either.ofRight(password));
        }

        /**
         * @param securityToken The security token is optional to remotely access Salesforce instance.
         * 
         * @return builder
         * 
         */
        public Builder securityToken(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> securityToken) {
            $.securityToken = securityToken;
            return this;
        }

        /**
         * @param securityToken The security token is optional to remotely access Salesforce instance.
         * 
         * @return builder
         * 
         */
        public Builder securityToken(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> securityToken) {
            return securityToken(Output.of(securityToken));
        }

        /**
         * @param securityToken The security token is optional to remotely access Salesforce instance.
         * 
         * @return builder
         * 
         */
        public Builder securityToken(AzureKeyVaultSecretReferenceArgs securityToken) {
            return securityToken(Either.ofLeft(securityToken));
        }

        /**
         * @param securityToken The security token is optional to remotely access Salesforce instance.
         * 
         * @return builder
         * 
         */
        public Builder securityToken(SecureStringArgs securityToken) {
            return securityToken(Either.ofRight(securityToken));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;Salesforce&#39;.
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
         * Expected value is &#39;Salesforce&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param username The username for Basic authentication of the Salesforce instance. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<Object> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username for Basic authentication of the Salesforce instance. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder username(Object username) {
            return username(Output.of(username));
        }

        public SalesforceLinkedServiceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
