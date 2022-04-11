// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.PrivateEndpointConnectionArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.IdentityResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.PrivateEndpointResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.SkuResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.SystemDataResponse;
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
 * The Private Endpoint Connection resource.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:machinelearningservices:PrivateEndpointConnection {privateEndpointConnectionName} /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/rg-1234/providers/Microsoft.MachineLearningServices/workspaces/testworkspace/privateEndpointConnections/{privateEndpointConnectionName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:machinelearningservices:PrivateEndpointConnection")
public class PrivateEndpointConnection extends io.pulumi.resources.CustomResource {
    /**
     * The identity of the resource.
     * 
     */
    @Export(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return The identity of the resource.
     * 
     */
    public Output</* @Nullable */ IdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Specifies the location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Specifies the location of the resource.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Specifies the name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The resource of private end point.
     * 
     */
    @Export(name="privateEndpoint", type=PrivateEndpointResponse.class, parameters={})
    private Output</* @Nullable */ PrivateEndpointResponse> privateEndpoint;

    /**
     * @return The resource of private end point.
     * 
     */
    public Output</* @Nullable */ PrivateEndpointResponse> getPrivateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @Export(name="privateLinkServiceConnectionState", type=PrivateLinkServiceConnectionStateResponse.class, parameters={})
    private Output<PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState;

    /**
     * @return A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    public Output<PrivateLinkServiceConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }
    /**
     * The provisioning state of the private endpoint connection resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the private endpoint connection resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The sku of the workspace.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The sku of the workspace.
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Read only system data
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Contains resource tags defined as key/value pairs.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Specifies the type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Specifies the type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateEndpointConnection(String name) {
        this(name, PrivateEndpointConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:PrivateEndpointConnection", name, args == null ? PrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateEndpointConnection(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:PrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20200101:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20200218preview:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20200301:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20200401:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20200501preview:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20200515preview:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20200601:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20200801:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20200901preview:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20210101:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20210301preview:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20210401:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20210701:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20220101preview:PrivateEndpointConnection").build())
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
    public static PrivateEndpointConnection get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateEndpointConnection(name, id, options);
    }
}
