// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.ExpressRouteGatewayArgs;
import io.pulumi.azurenative.network.outputs.ExpressRouteConnectionResponse;
import io.pulumi.azurenative.network.outputs.ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration;
import io.pulumi.azurenative.network.outputs.VirtualHubIdResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * ExpressRoute gateway resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:ExpressRouteGateway gateway-2 /subscriptions/subid/resourceGroups/resourceGroupName/providers/Microsoft.Network/expressRouteGateways/gateway-2 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:ExpressRouteGateway")
public class ExpressRouteGateway extends io.pulumi.resources.CustomResource {
    /**
     * Configuration for auto scaling.
     * 
     */
    @Export(name="autoScaleConfiguration", type=ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration.class, parameters={})
    private Output</* @Nullable */ ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration> autoScaleConfiguration;

    /**
     * @return Configuration for auto scaling.
     * 
     */
    public Output</* @Nullable */ ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration> getAutoScaleConfiguration() {
        return this.autoScaleConfiguration;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * List of ExpressRoute connections to the ExpressRoute gateway.
     * 
     */
    @Export(name="expressRouteConnections", type=List.class, parameters={ExpressRouteConnectionResponse.class})
    private Output<List<ExpressRouteConnectionResponse>> expressRouteConnections;

    /**
     * @return List of ExpressRoute connections to the ExpressRoute gateway.
     * 
     */
    public Output<List<ExpressRouteConnectionResponse>> getExpressRouteConnections() {
        return this.expressRouteConnections;
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
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning state of the express route gateway resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the express route gateway resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The Virtual Hub where the ExpressRoute gateway is or will be deployed.
     * 
     */
    @Export(name="virtualHub", type=VirtualHubIdResponse.class, parameters={})
    private Output<VirtualHubIdResponse> virtualHub;

    /**
     * @return The Virtual Hub where the ExpressRoute gateway is or will be deployed.
     * 
     */
    public Output<VirtualHubIdResponse> getVirtualHub() {
        return this.virtualHub;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExpressRouteGateway(String name) {
        this(name, ExpressRouteGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExpressRouteGateway(String name, ExpressRouteGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExpressRouteGateway(String name, ExpressRouteGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ExpressRouteGateway", name, args == null ? ExpressRouteGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExpressRouteGateway(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ExpressRouteGateway", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20180801:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:ExpressRouteGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:ExpressRouteGateway").build())
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
    public static ExpressRouteGateway get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ExpressRouteGateway(name, id, options);
    }
}
