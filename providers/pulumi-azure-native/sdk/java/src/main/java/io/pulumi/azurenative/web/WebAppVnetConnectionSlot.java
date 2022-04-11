// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppVnetConnectionSlotArgs;
import io.pulumi.azurenative.web.outputs.VnetRouteResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Virtual Network information contract.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppVnetConnectionSlot myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/virtualNetworkConnections/{vnetName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppVnetConnectionSlot")
public class WebAppVnetConnectionSlot extends io.pulumi.resources.CustomResource {
    /**
     * A certificate file (.cer) blob containing the public key of the private key used to authenticate a
     * Point-To-Site VPN connection.
     * 
     */
    @Export(name="certBlob", type=String.class, parameters={})
    private Output</* @Nullable */ String> certBlob;

    /**
     * @return A certificate file (.cer) blob containing the public key of the private key used to authenticate a
     * Point-To-Site VPN connection.
     * 
     */
    public Output</* @Nullable */ String> getCertBlob() {
        return this.certBlob;
    }
    /**
     * The client certificate thumbprint.
     * 
     */
    @Export(name="certThumbprint", type=String.class, parameters={})
    private Output<String> certThumbprint;

    /**
     * @return The client certificate thumbprint.
     * 
     */
    public Output<String> getCertThumbprint() {
        return this.certThumbprint;
    }
    /**
     * DNS servers to be used by this Virtual Network. This should be a comma-separated list of IP addresses.
     * 
     */
    @Export(name="dnsServers", type=String.class, parameters={})
    private Output</* @Nullable */ String> dnsServers;

    /**
     * @return DNS servers to be used by this Virtual Network. This should be a comma-separated list of IP addresses.
     * 
     */
    public Output</* @Nullable */ String> getDnsServers() {
        return this.dnsServers;
    }
    /**
     * Flag that is used to denote if this is VNET injection
     * 
     */
    @Export(name="isSwift", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isSwift;

    /**
     * @return Flag that is used to denote if this is VNET injection
     * 
     */
    public Output</* @Nullable */ Boolean> getIsSwift() {
        return this.isSwift;
    }
    /**
     * Kind of resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Resource Name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * <code>true</code> if a resync is required; otherwise, <code>false</code>.
     * 
     */
    @Export(name="resyncRequired", type=Boolean.class, parameters={})
    private Output<Boolean> resyncRequired;

    /**
     * @return <code>true</code> if a resync is required; otherwise, <code>false</code>.
     * 
     */
    public Output<Boolean> getResyncRequired() {
        return this.resyncRequired;
    }
    /**
     * The routes that this Virtual Network connection uses.
     * 
     */
    @Export(name="routes", type=List.class, parameters={VnetRouteResponse.class})
    private Output<List<VnetRouteResponse>> routes;

    /**
     * @return The routes that this Virtual Network connection uses.
     * 
     */
    public Output<List<VnetRouteResponse>> getRoutes() {
        return this.routes;
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
     * The Virtual Network's resource ID.
     * 
     */
    @Export(name="vnetResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vnetResourceId;

    /**
     * @return The Virtual Network's resource ID.
     * 
     */
    public Output</* @Nullable */ String> getVnetResourceId() {
        return this.vnetResourceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppVnetConnectionSlot(String name) {
        this(name, WebAppVnetConnectionSlotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppVnetConnectionSlot(String name, WebAppVnetConnectionSlotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppVnetConnectionSlot(String name, WebAppVnetConnectionSlotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppVnetConnectionSlot", name, args == null ? WebAppVnetConnectionSlotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppVnetConnectionSlot(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppVnetConnectionSlot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20150801:WebAppVnetConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20160801:WebAppVnetConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppVnetConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppVnetConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppVnetConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppVnetConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppVnetConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppVnetConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppVnetConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppVnetConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppVnetConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppVnetConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppVnetConnectionSlot").build())
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
    public static WebAppVnetConnectionSlot get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppVnetConnectionSlot(name, id, options);
    }
}
