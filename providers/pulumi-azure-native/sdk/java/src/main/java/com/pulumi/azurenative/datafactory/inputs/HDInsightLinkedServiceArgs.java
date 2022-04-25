// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
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
 * HDInsight linked service.
 * 
 */
public final class HDInsightLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final HDInsightLinkedServiceArgs Empty = new HDInsightLinkedServiceArgs();

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
     * HDInsight cluster URI. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clusterUri", required=true)
    private Output<Object> clusterUri;

    /**
     * @return HDInsight cluster URI. Type: string (or Expression with resultType string).
     * 
     */
    public Output<Object> clusterUri() {
        return this.clusterUri;
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
     * Specify the FileSystem if the main storage for the HDInsight is ADLS Gen2. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileSystem")
    private @Nullable Output<Object> fileSystem;

    /**
     * @return Specify the FileSystem if the main storage for the HDInsight is ADLS Gen2. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> fileSystem() {
        return Optional.ofNullable(this.fileSystem);
    }

    /**
     * A reference to the Azure SQL linked service that points to the HCatalog database.
     * 
     */
    @Import(name="hcatalogLinkedServiceName")
    private @Nullable Output<LinkedServiceReferenceArgs> hcatalogLinkedServiceName;

    /**
     * @return A reference to the Azure SQL linked service that points to the HCatalog database.
     * 
     */
    public Optional<Output<LinkedServiceReferenceArgs>> hcatalogLinkedServiceName() {
        return Optional.ofNullable(this.hcatalogLinkedServiceName);
    }

    /**
     * Specify if the HDInsight is created with ESP (Enterprise Security Package). Type: Boolean.
     * 
     */
    @Import(name="isEspEnabled")
    private @Nullable Output<Object> isEspEnabled;

    /**
     * @return Specify if the HDInsight is created with ESP (Enterprise Security Package). Type: Boolean.
     * 
     */
    public Optional<Output<Object>> isEspEnabled() {
        return Optional.ofNullable(this.isEspEnabled);
    }

    /**
     * The Azure Storage linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
    private @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;

    /**
     * @return The Azure Storage linked service reference.
     * 
     */
    public Optional<Output<LinkedServiceReferenceArgs>> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
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
     * HDInsight cluster password.
     * 
     */
    @Import(name="password")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    /**
     * @return HDInsight cluster password.
     * 
     */
    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;HDInsight&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;HDInsight&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * HDInsight cluster user name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
    private @Nullable Output<Object> userName;

    /**
     * @return HDInsight cluster user name. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private HDInsightLinkedServiceArgs() {}

    private HDInsightLinkedServiceArgs(HDInsightLinkedServiceArgs $) {
        this.annotations = $.annotations;
        this.clusterUri = $.clusterUri;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.fileSystem = $.fileSystem;
        this.hcatalogLinkedServiceName = $.hcatalogLinkedServiceName;
        this.isEspEnabled = $.isEspEnabled;
        this.linkedServiceName = $.linkedServiceName;
        this.parameters = $.parameters;
        this.password = $.password;
        this.type = $.type;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HDInsightLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HDInsightLinkedServiceArgs $;

        public Builder() {
            $ = new HDInsightLinkedServiceArgs();
        }

        public Builder(HDInsightLinkedServiceArgs defaults) {
            $ = new HDInsightLinkedServiceArgs(Objects.requireNonNull(defaults));
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
         * @param clusterUri HDInsight cluster URI. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder clusterUri(Output<Object> clusterUri) {
            $.clusterUri = clusterUri;
            return this;
        }

        /**
         * @param clusterUri HDInsight cluster URI. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder clusterUri(Object clusterUri) {
            return clusterUri(Output.of(clusterUri));
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
         * @param fileSystem Specify the FileSystem if the main storage for the HDInsight is ADLS Gen2. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileSystem(@Nullable Output<Object> fileSystem) {
            $.fileSystem = fileSystem;
            return this;
        }

        /**
         * @param fileSystem Specify the FileSystem if the main storage for the HDInsight is ADLS Gen2. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileSystem(Object fileSystem) {
            return fileSystem(Output.of(fileSystem));
        }

        /**
         * @param hcatalogLinkedServiceName A reference to the Azure SQL linked service that points to the HCatalog database.
         * 
         * @return builder
         * 
         */
        public Builder hcatalogLinkedServiceName(@Nullable Output<LinkedServiceReferenceArgs> hcatalogLinkedServiceName) {
            $.hcatalogLinkedServiceName = hcatalogLinkedServiceName;
            return this;
        }

        /**
         * @param hcatalogLinkedServiceName A reference to the Azure SQL linked service that points to the HCatalog database.
         * 
         * @return builder
         * 
         */
        public Builder hcatalogLinkedServiceName(LinkedServiceReferenceArgs hcatalogLinkedServiceName) {
            return hcatalogLinkedServiceName(Output.of(hcatalogLinkedServiceName));
        }

        /**
         * @param isEspEnabled Specify if the HDInsight is created with ESP (Enterprise Security Package). Type: Boolean.
         * 
         * @return builder
         * 
         */
        public Builder isEspEnabled(@Nullable Output<Object> isEspEnabled) {
            $.isEspEnabled = isEspEnabled;
            return this;
        }

        /**
         * @param isEspEnabled Specify if the HDInsight is created with ESP (Enterprise Security Package). Type: Boolean.
         * 
         * @return builder
         * 
         */
        public Builder isEspEnabled(Object isEspEnabled) {
            return isEspEnabled(Output.of(isEspEnabled));
        }

        /**
         * @param linkedServiceName The Azure Storage linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(@Nullable Output<LinkedServiceReferenceArgs> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        /**
         * @param linkedServiceName The Azure Storage linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
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
         * @param password HDInsight cluster password.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password HDInsight cluster password.
         * 
         * @return builder
         * 
         */
        public Builder password(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            return password(Output.of(password));
        }

        /**
         * @param password HDInsight cluster password.
         * 
         * @return builder
         * 
         */
        public Builder password(AzureKeyVaultSecretReferenceArgs password) {
            return password(Either.ofLeft(password));
        }

        /**
         * @param password HDInsight cluster password.
         * 
         * @return builder
         * 
         */
        public Builder password(SecureStringArgs password) {
            return password(Either.ofRight(password));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;HDInsight&#39;.
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
         * Expected value is &#39;HDInsight&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userName HDInsight cluster user name. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<Object> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName HDInsight cluster user name. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder userName(Object userName) {
            return userName(Output.of(userName));
        }

        public HDInsightLinkedServiceArgs build() {
            $.clusterUri = Objects.requireNonNull($.clusterUri, "expected parameter 'clusterUri' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
