// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.aws.glue.inputs.ConnectionPhysicalConnectionRequirementsGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionState Empty = new ConnectionState();

    /**
     * The ARN of the Glue Connection.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the Glue Connection.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
     * 
     */
    @Import(name="catalogId")
    private @Nullable Output<String> catalogId;

    /**
     * @return The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
     * 
     */
    public Optional<Output<String>> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }

    /**
     * A map of key-value pairs used as parameters for this connection.
     * 
     */
    @Import(name="connectionProperties")
    private @Nullable Output<Map<String,String>> connectionProperties;

    /**
     * @return A map of key-value pairs used as parameters for this connection.
     * 
     */
    public Optional<Output<Map<String,String>>> connectionProperties() {
        return Optional.ofNullable(this.connectionProperties);
    }

    /**
     * The type of the connection. Supported are: `JDBC`, `MONGODB`, `KAFKA`, and `NETWORK`. Defaults to `JBDC`.
     * 
     */
    @Import(name="connectionType")
    private @Nullable Output<String> connectionType;

    /**
     * @return The type of the connection. Supported are: `JDBC`, `MONGODB`, `KAFKA`, and `NETWORK`. Defaults to `JBDC`.
     * 
     */
    public Optional<Output<String>> connectionType() {
        return Optional.ofNullable(this.connectionType);
    }

    /**
     * Description of the connection.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the connection.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A list of criteria that can be used in selecting this connection.
     * 
     */
    @Import(name="matchCriterias")
    private @Nullable Output<List<String>> matchCriterias;

    /**
     * @return A list of criteria that can be used in selecting this connection.
     * 
     */
    public Optional<Output<List<String>>> matchCriterias() {
        return Optional.ofNullable(this.matchCriterias);
    }

    /**
     * The name of the connection.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the connection.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
     * 
     */
    @Import(name="physicalConnectionRequirements")
    private @Nullable Output<ConnectionPhysicalConnectionRequirementsGetArgs> physicalConnectionRequirements;

    /**
     * @return A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
     * 
     */
    public Optional<Output<ConnectionPhysicalConnectionRequirementsGetArgs>> physicalConnectionRequirements() {
        return Optional.ofNullable(this.physicalConnectionRequirements);
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private ConnectionState() {}

    private ConnectionState(ConnectionState $) {
        this.arn = $.arn;
        this.catalogId = $.catalogId;
        this.connectionProperties = $.connectionProperties;
        this.connectionType = $.connectionType;
        this.description = $.description;
        this.matchCriterias = $.matchCriterias;
        this.name = $.name;
        this.physicalConnectionRequirements = $.physicalConnectionRequirements;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionState $;

        public Builder() {
            $ = new ConnectionState();
        }

        public Builder(ConnectionState defaults) {
            $ = new ConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the Glue Connection.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the Glue Connection.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param catalogId The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(@Nullable Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        /**
         * @param catalogId The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        /**
         * @param connectionProperties A map of key-value pairs used as parameters for this connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionProperties(@Nullable Output<Map<String,String>> connectionProperties) {
            $.connectionProperties = connectionProperties;
            return this;
        }

        /**
         * @param connectionProperties A map of key-value pairs used as parameters for this connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionProperties(Map<String,String> connectionProperties) {
            return connectionProperties(Output.of(connectionProperties));
        }

        /**
         * @param connectionType The type of the connection. Supported are: `JDBC`, `MONGODB`, `KAFKA`, and `NETWORK`. Defaults to `JBDC`.
         * 
         * @return builder
         * 
         */
        public Builder connectionType(@Nullable Output<String> connectionType) {
            $.connectionType = connectionType;
            return this;
        }

        /**
         * @param connectionType The type of the connection. Supported are: `JDBC`, `MONGODB`, `KAFKA`, and `NETWORK`. Defaults to `JBDC`.
         * 
         * @return builder
         * 
         */
        public Builder connectionType(String connectionType) {
            return connectionType(Output.of(connectionType));
        }

        /**
         * @param description Description of the connection.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the connection.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param matchCriterias A list of criteria that can be used in selecting this connection.
         * 
         * @return builder
         * 
         */
        public Builder matchCriterias(@Nullable Output<List<String>> matchCriterias) {
            $.matchCriterias = matchCriterias;
            return this;
        }

        /**
         * @param matchCriterias A list of criteria that can be used in selecting this connection.
         * 
         * @return builder
         * 
         */
        public Builder matchCriterias(List<String> matchCriterias) {
            return matchCriterias(Output.of(matchCriterias));
        }

        /**
         * @param matchCriterias A list of criteria that can be used in selecting this connection.
         * 
         * @return builder
         * 
         */
        public Builder matchCriterias(String... matchCriterias) {
            return matchCriterias(List.of(matchCriterias));
        }

        /**
         * @param name The name of the connection.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the connection.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param physicalConnectionRequirements A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder physicalConnectionRequirements(@Nullable Output<ConnectionPhysicalConnectionRequirementsGetArgs> physicalConnectionRequirements) {
            $.physicalConnectionRequirements = physicalConnectionRequirements;
            return this;
        }

        /**
         * @param physicalConnectionRequirements A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder physicalConnectionRequirements(ConnectionPhysicalConnectionRequirementsGetArgs physicalConnectionRequirements) {
            return physicalConnectionRequirements(Output.of(physicalConnectionRequirements));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public ConnectionState build() {
            return $;
        }
    }

}
