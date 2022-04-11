// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppHybridConnectionSlotArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Hybrid Connection contract. This is used to configure a Hybrid Connection.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppHybridConnectionSlot myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/hybridConnectionNamespaces/{namespaceName}/relays/{relayName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppHybridConnectionSlot")
public class WebAppHybridConnectionSlot extends io.pulumi.resources.CustomResource {
    /**
     * The hostname of the endpoint.
     * 
     */
    @Export(name="hostname", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostname;

    /**
     * @return The hostname of the endpoint.
     * 
     */
    public Output</* @Nullable */ String> getHostname() {
        return this.hostname;
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
     * The port of the endpoint.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The port of the endpoint.
     * 
     */
    public Output</* @Nullable */ Integer> getPort() {
        return this.port;
    }
    /**
     * The ARM URI to the Service Bus relay.
     * 
     */
    @Export(name="relayArmUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> relayArmUri;

    /**
     * @return The ARM URI to the Service Bus relay.
     * 
     */
    public Output</* @Nullable */ String> getRelayArmUri() {
        return this.relayArmUri;
    }
    /**
     * The name of the Service Bus relay.
     * 
     */
    @Export(name="relayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> relayName;

    /**
     * @return The name of the Service Bus relay.
     * 
     */
    public Output</* @Nullable */ String> getRelayName() {
        return this.relayName;
    }
    /**
     * The name of the Service Bus key which has Send permissions. This is used to authenticate to Service Bus.
     * 
     */
    @Export(name="sendKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> sendKeyName;

    /**
     * @return The name of the Service Bus key which has Send permissions. This is used to authenticate to Service Bus.
     * 
     */
    public Output</* @Nullable */ String> getSendKeyName() {
        return this.sendKeyName;
    }
    /**
     * The value of the Service Bus key. This is used to authenticate to Service Bus. In ARM this key will not be returned
     * normally, use the POST /listKeys API instead.
     * 
     */
    @Export(name="sendKeyValue", type=String.class, parameters={})
    private Output</* @Nullable */ String> sendKeyValue;

    /**
     * @return The value of the Service Bus key. This is used to authenticate to Service Bus. In ARM this key will not be returned
     * normally, use the POST /listKeys API instead.
     * 
     */
    public Output</* @Nullable */ String> getSendKeyValue() {
        return this.sendKeyValue;
    }
    /**
     * The name of the Service Bus namespace.
     * 
     */
    @Export(name="serviceBusNamespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceBusNamespace;

    /**
     * @return The name of the Service Bus namespace.
     * 
     */
    public Output</* @Nullable */ String> getServiceBusNamespace() {
        return this.serviceBusNamespace;
    }
    /**
     * The suffix for the service bus endpoint. By default this is .servicebus.windows.net
     * 
     */
    @Export(name="serviceBusSuffix", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceBusSuffix;

    /**
     * @return The suffix for the service bus endpoint. By default this is .servicebus.windows.net
     * 
     */
    public Output</* @Nullable */ String> getServiceBusSuffix() {
        return this.serviceBusSuffix;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppHybridConnectionSlot(String name) {
        this(name, WebAppHybridConnectionSlotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppHybridConnectionSlot(String name, WebAppHybridConnectionSlotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppHybridConnectionSlot(String name, WebAppHybridConnectionSlotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppHybridConnectionSlot", name, args == null ? WebAppHybridConnectionSlotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppHybridConnectionSlot(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppHybridConnectionSlot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20160801:WebAppHybridConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppHybridConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppHybridConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppHybridConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppHybridConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppHybridConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppHybridConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppHybridConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppHybridConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppHybridConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppHybridConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppHybridConnectionSlot").build())
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
    public static WebAppHybridConnectionSlot get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppHybridConnectionSlot(name, id, options);
    }
}
