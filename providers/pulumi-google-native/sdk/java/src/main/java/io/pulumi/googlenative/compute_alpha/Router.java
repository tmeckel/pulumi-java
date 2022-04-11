// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.RouterArgs;
import io.pulumi.googlenative.compute_alpha.outputs.RouterBgpPeerResponse;
import io.pulumi.googlenative.compute_alpha.outputs.RouterBgpResponse;
import io.pulumi.googlenative.compute_alpha.outputs.RouterInterfaceResponse;
import io.pulumi.googlenative.compute_alpha.outputs.RouterMd5AuthenticationKeyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.RouterNatResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a Router resource in the specified project and region using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/alpha:Router")
public class Router extends io.pulumi.resources.CustomResource {
    /**
     * BGP information specific to this router.
     * 
     */
    @Export(name="bgp", type=RouterBgpResponse.class, parameters={})
    private Output<RouterBgpResponse> bgp;

    /**
     * @return BGP information specific to this router.
     * 
     */
    public Output<RouterBgpResponse> getBgp() {
        return this.bgp;
    }
    /**
     * BGP information that must be configured into the routing stack to establish BGP peering. This information must specify the peer ASN and either the interface name, IP address, or peer IP address. Please refer to RFC4273.
     * 
     */
    @Export(name="bgpPeers", type=List.class, parameters={RouterBgpPeerResponse.class})
    private Output<List<RouterBgpPeerResponse>> bgpPeers;

    /**
     * @return BGP information that must be configured into the routing stack to establish BGP peering. This information must specify the peer ASN and either the interface name, IP address, or peer IP address. Please refer to RFC4273.
     * 
     */
    public Output<List<RouterBgpPeerResponse>> getBgpPeers() {
        return this.bgpPeers;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Indicates if a router is dedicated for use with encrypted VLAN attachments (interconnectAttachments). Not currently available publicly.
     * 
     */
    @Export(name="encryptedInterconnectRouter", type=Boolean.class, parameters={})
    private Output<Boolean> encryptedInterconnectRouter;

    /**
     * @return Indicates if a router is dedicated for use with encrypted VLAN attachments (interconnectAttachments). Not currently available publicly.
     * 
     */
    public Output<Boolean> getEncryptedInterconnectRouter() {
        return this.encryptedInterconnectRouter;
    }
    /**
     * Router interfaces. Each interface requires either one linked resource, (for example, linkedVpnTunnel), or IP address and IP address range (for example, ipRange), or both.
     * 
     */
    @Export(name="interfaces", type=List.class, parameters={RouterInterfaceResponse.class})
    private Output<List<RouterInterfaceResponse>> interfaces;

    /**
     * @return Router interfaces. Each interface requires either one linked resource, (for example, linkedVpnTunnel), or IP address and IP address range (for example, ipRange), or both.
     * 
     */
    public Output<List<RouterInterfaceResponse>> getInterfaces() {
        return this.interfaces;
    }
    /**
     * Type of resource. Always compute#router for routers.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of resource. Always compute#router for routers.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Keys used for MD5 authentication.
     * 
     */
    @Export(name="md5AuthenticationKeys", type=List.class, parameters={RouterMd5AuthenticationKeyResponse.class})
    private Output<List<RouterMd5AuthenticationKeyResponse>> md5AuthenticationKeys;

    /**
     * @return Keys used for MD5 authentication.
     * 
     */
    public Output<List<RouterMd5AuthenticationKeyResponse>> getMd5AuthenticationKeys() {
        return this.md5AuthenticationKeys;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A list of NAT services created in this router.
     * 
     */
    @Export(name="nats", type=List.class, parameters={RouterNatResponse.class})
    private Output<List<RouterNatResponse>> nats;

    /**
     * @return A list of NAT services created in this router.
     * 
     */
    public Output<List<RouterNatResponse>> getNats() {
        return this.nats;
    }
    /**
     * URI of the network to which this router belongs.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return URI of the network to which this router belongs.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * URI of the region where the router resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URI of the region where the router resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @Export(name="selfLinkWithId", type=String.class, parameters={})
    private Output<String> selfLinkWithId;

    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public Output<String> getSelfLinkWithId() {
        return this.selfLinkWithId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Router(String name) {
        this(name, RouterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Router(String name, RouterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Router(String name, RouterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:Router", name, args == null ? RouterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Router(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:Router", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Router get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Router(name, id, options);
    }
}
