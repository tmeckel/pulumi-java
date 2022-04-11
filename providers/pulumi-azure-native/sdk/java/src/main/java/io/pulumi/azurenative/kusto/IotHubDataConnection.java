// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kusto.IotHubDataConnectionArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Class representing an iot hub data connection.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:kusto:IotHubDataConnection KustoClusterRPTest4/KustoDatabase8/DataConnections8 /subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Kusto/Clusters/KustoClusterRPTest4/Databases/KustoDatabase8/DataConnections/DataConnections8 
 * ```
 * 
 */
@ResourceType(type="azure-native:kusto:IotHubDataConnection")
public class IotHubDataConnection extends io.pulumi.resources.CustomResource {
    /**
     * The iot hub consumer group.
     * 
     */
    @Export(name="consumerGroup", type=String.class, parameters={})
    private Output<String> consumerGroup;

    /**
     * @return The iot hub consumer group.
     * 
     */
    public Output<String> getConsumerGroup() {
        return this.consumerGroup;
    }
    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    @Export(name="dataFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataFormat;

    /**
     * @return The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    public Output</* @Nullable */ String> getDataFormat() {
        return this.dataFormat;
    }
    /**
     * System properties of the iot hub
     * 
     */
    @Export(name="eventSystemProperties", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> eventSystemProperties;

    /**
     * @return System properties of the iot hub
     * 
     */
    public Output</* @Nullable */ List<String>> getEventSystemProperties() {
        return this.eventSystemProperties;
    }
    /**
     * The resource ID of the Iot hub to be used to create a data connection.
     * 
     */
    @Export(name="iotHubResourceId", type=String.class, parameters={})
    private Output<String> iotHubResourceId;

    /**
     * @return The resource ID of the Iot hub to be used to create a data connection.
     * 
     */
    public Output<String> getIotHubResourceId() {
        return this.iotHubResourceId;
    }
    /**
     * Kind of the endpoint for the data connection
     * Expected value is 'IotHub'.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of the endpoint for the data connection
     * Expected value is 'IotHub'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    @Export(name="mappingRuleName", type=String.class, parameters={})
    private Output</* @Nullable */ String> mappingRuleName;

    /**
     * @return The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    public Output</* @Nullable */ String> getMappingRuleName() {
        return this.mappingRuleName;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioned state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioned state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The name of the share access policy
     * 
     */
    @Export(name="sharedAccessPolicyName", type=String.class, parameters={})
    private Output<String> sharedAccessPolicyName;

    /**
     * @return The name of the share access policy
     * 
     */
    public Output<String> getSharedAccessPolicyName() {
        return this.sharedAccessPolicyName;
    }
    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    @Export(name="tableName", type=String.class, parameters={})
    private Output</* @Nullable */ String> tableName;

    /**
     * @return The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    public Output</* @Nullable */ String> getTableName() {
        return this.tableName;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IotHubDataConnection(String name) {
        this(name, IotHubDataConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IotHubDataConnection(String name, IotHubDataConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IotHubDataConnection(String name, IotHubDataConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:IotHubDataConnection", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private IotHubDataConnection(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:IotHubDataConnection", name, null, makeResourceOptions(options, id));
    }

    private static IotHubDataConnectionArgs makeArgs(IotHubDataConnectionArgs args) {
        var builder = args == null ? IotHubDataConnectionArgs.builder() : IotHubDataConnectionArgs.builder(args);
        return builder
            .kind("IotHub")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:kusto/v20190121:IotHubDataConnection").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20190515:IotHubDataConnection").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20190907:IotHubDataConnection").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20191109:IotHubDataConnection").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20200215:IotHubDataConnection").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20200614:IotHubDataConnection").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20200918:IotHubDataConnection").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20210101:IotHubDataConnection").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20210827:IotHubDataConnection").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static IotHubDataConnection get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IotHubDataConnection(name, id, options);
    }
}
