// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.NetworkEndpointGroupArgs;
import io.pulumi.gcp.compute.inputs.NetworkEndpointGroupState;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Network endpoint groups (NEGs) are zonal resources that represent
 * collections of IP address and port combinations for GCP resources within a
 * single subnet. Each IP address and port combination is called a network
 * endpoint.
 * 
 * Network endpoint groups can be used as backends in backend services for
 * HTTP(S), TCP proxy, and SSL proxy load balancers. You cannot use NEGs as a
 * backend with internal load balancers. Because NEG backends allow you to
 * specify IP addresses and ports, you can distribute traffic in a granular
 * fashion among applications or containers running within VM instances.
 * 
 * Recreating a network endpoint group that's in use by another resource will give a
 * `resourceInUseByAnotherResource` error. Use `lifecycle.create_before_destroy`
 * to avoid this type of error.
 * 
 * To get more information about NetworkEndpointGroup, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/networkEndpointGroups)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/load-balancing/docs/negs/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * NetworkEndpointGroup can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/networkEndpointGroup:NetworkEndpointGroup default projects/{{project}}/zones/{{zone}}/networkEndpointGroups/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/networkEndpointGroup:NetworkEndpointGroup default {{project}}/{{zone}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/networkEndpointGroup:NetworkEndpointGroup default {{zone}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/networkEndpointGroup:NetworkEndpointGroup default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/networkEndpointGroup:NetworkEndpointGroup")
public class NetworkEndpointGroup extends io.pulumi.resources.CustomResource {
    /**
     * The default port used if the port number is not specified in the
     * network endpoint.
     * 
     */
    @Export(name="defaultPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> defaultPort;

    /**
     * @return The default port used if the port number is not specified in the
     * network endpoint.
     * 
     */
    public Output</* @Nullable */ Integer> getDefaultPort() {
        return this.defaultPort;
    }
    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The network to which all network endpoints in the NEG belong.
     * Uses "default" project network if unspecified.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The network to which all network endpoints in the NEG belong.
     * Uses "default" project network if unspecified.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * Type of network endpoints in this network endpoint group.
     * Default value is `GCE_VM_IP_PORT`.
     * Possible values are `GCE_VM_IP_PORT`.
     * 
     */
    @Export(name="networkEndpointType", type=String.class, parameters={})
    private Output</* @Nullable */ String> networkEndpointType;

    /**
     * @return Type of network endpoints in this network endpoint group.
     * Default value is `GCE_VM_IP_PORT`.
     * Possible values are `GCE_VM_IP_PORT`.
     * 
     */
    public Output</* @Nullable */ String> getNetworkEndpointType() {
        return this.networkEndpointType;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Number of network endpoints in the network endpoint group.
     * 
     */
    @Export(name="size", type=Integer.class, parameters={})
    private Output<Integer> size;

    /**
     * @return Number of network endpoints in the network endpoint group.
     * 
     */
    public Output<Integer> getSize() {
        return this.size;
    }
    /**
     * Optional subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    @Export(name="subnetwork", type=String.class, parameters={})
    private Output</* @Nullable */ String> subnetwork;

    /**
     * @return Optional subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    public Output</* @Nullable */ String> getSubnetwork() {
        return this.subnetwork;
    }
    /**
     * Zone where the network endpoint group is located.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return Zone where the network endpoint group is located.
     * 
     */
    public Output<String> getZone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkEndpointGroup(String name) {
        this(name, NetworkEndpointGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkEndpointGroup(String name, NetworkEndpointGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkEndpointGroup(String name, NetworkEndpointGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/networkEndpointGroup:NetworkEndpointGroup", name, args == null ? NetworkEndpointGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkEndpointGroup(String name, Output<String> id, @Nullable NetworkEndpointGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/networkEndpointGroup:NetworkEndpointGroup", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NetworkEndpointGroup get(String name, Output<String> id, @Nullable NetworkEndpointGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkEndpointGroup(name, id, state, options);
    }
}
