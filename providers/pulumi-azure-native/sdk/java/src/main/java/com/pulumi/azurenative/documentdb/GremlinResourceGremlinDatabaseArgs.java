// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb;

import com.pulumi.azurenative.documentdb.inputs.CreateUpdateOptionsArgs;
import com.pulumi.azurenative.documentdb.inputs.GremlinDatabaseResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GremlinResourceGremlinDatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final GremlinResourceGremlinDatabaseArgs Empty = new GremlinResourceGremlinDatabaseArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return Cosmos DB database account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Cosmos DB database name.
     * 
     */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    /**
     * @return Cosmos DB database name.
     * 
     */
    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the resource group to which the resource belongs.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
     * 
     */
    @Import(name="options")
    private @Nullable Output<CreateUpdateOptionsArgs> options;

    /**
     * @return A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
     * 
     */
    public Optional<Output<CreateUpdateOptionsArgs>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * The standard JSON format of a Gremlin database
     * 
     */
    @Import(name="resource", required=true)
    private Output<GremlinDatabaseResourceArgs> resource;

    /**
     * @return The standard JSON format of a Gremlin database
     * 
     */
    public Output<GremlinDatabaseResourceArgs> resource() {
        return this.resource;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with &#34;defaultExperience&#34;: &#34;Cassandra&#34;. Current &#34;defaultExperience&#34; values also include &#34;Table&#34;, &#34;Graph&#34;, &#34;DocumentDB&#34;, and &#34;MongoDB&#34;.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with &#34;defaultExperience&#34;: &#34;Cassandra&#34;. Current &#34;defaultExperience&#34; values also include &#34;Table&#34;, &#34;Graph&#34;, &#34;DocumentDB&#34;, and &#34;MongoDB&#34;.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GremlinResourceGremlinDatabaseArgs() {}

    private GremlinResourceGremlinDatabaseArgs(GremlinResourceGremlinDatabaseArgs $) {
        this.accountName = $.accountName;
        this.databaseName = $.databaseName;
        this.location = $.location;
        this.options = $.options;
        this.resource = $.resource;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GremlinResourceGremlinDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GremlinResourceGremlinDatabaseArgs $;

        public Builder() {
            $ = new GremlinResourceGremlinDatabaseArgs();
        }

        public Builder(GremlinResourceGremlinDatabaseArgs defaults) {
            $ = new GremlinResourceGremlinDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Cosmos DB database account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName Cosmos DB database account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param databaseName Cosmos DB database name.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName Cosmos DB database name.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param location The location of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param options A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<CreateUpdateOptionsArgs> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
         * 
         * @return builder
         * 
         */
        public Builder options(CreateUpdateOptionsArgs options) {
            return options(Output.of(options));
        }

        /**
         * @param resource The standard JSON format of a Gremlin database
         * 
         * @return builder
         * 
         */
        public Builder resource(Output<GremlinDatabaseResourceArgs> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource The standard JSON format of a Gremlin database
         * 
         * @return builder
         * 
         */
        public Builder resource(GremlinDatabaseResourceArgs resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with &#34;defaultExperience&#34;: &#34;Cassandra&#34;. Current &#34;defaultExperience&#34; values also include &#34;Table&#34;, &#34;Graph&#34;, &#34;DocumentDB&#34;, and &#34;MongoDB&#34;.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with &#34;defaultExperience&#34;: &#34;Cassandra&#34;. Current &#34;defaultExperience&#34; values also include &#34;Table&#34;, &#34;Graph&#34;, &#34;DocumentDB&#34;, and &#34;MongoDB&#34;.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GremlinResourceGremlinDatabaseArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resource = Objects.requireNonNull($.resource, "expected parameter 'resource' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
