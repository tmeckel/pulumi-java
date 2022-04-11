// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.VpnGatewayArgs;
import io.pulumi.googlenative.compute_beta.outputs.VpnGatewayVpnGatewayInterfaceResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a VPN gateway in the specified project and region using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/beta:VpnGateway")
public class VpnGateway extends io.pulumi.resources.CustomResource {
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
     * Type of resource. Always compute#vpnGateway for VPN gateways.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of resource. Always compute#vpnGateway for VPN gateways.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * A fingerprint for the labels being applied to this VpnGateway, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an VpnGateway.
     * 
     */
    @Export(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return A fingerprint for the labels being applied to this VpnGateway, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an VpnGateway.
     * 
     */
    public Output<String> getLabelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
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
     * URL of the network to which this VPN gateway is attached. Provided by the client when the VPN gateway is created.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return URL of the network to which this VPN gateway is attached. Provided by the client when the VPN gateway is created.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * URL of the region where the VPN gateway resides.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URL of the region where the VPN gateway resides.
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
     * The stack type for this VPN gateway to identify the IP protocols that are enabled. If not specified, IPV4_ONLY will be used.
     * 
     */
    @Export(name="stackType", type=String.class, parameters={})
    private Output<String> stackType;

    /**
     * @return The stack type for this VPN gateway to identify the IP protocols that are enabled. If not specified, IPV4_ONLY will be used.
     * 
     */
    public Output<String> getStackType() {
        return this.stackType;
    }
    /**
     * The list of VPN interfaces associated with this VPN gateway.
     * 
     */
    @Export(name="vpnInterfaces", type=List.class, parameters={VpnGatewayVpnGatewayInterfaceResponse.class})
    private Output<List<VpnGatewayVpnGatewayInterfaceResponse>> vpnInterfaces;

    /**
     * @return The list of VPN interfaces associated with this VPN gateway.
     * 
     */
    public Output<List<VpnGatewayVpnGatewayInterfaceResponse>> getVpnInterfaces() {
        return this.vpnInterfaces;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpnGateway(String name) {
        this(name, VpnGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpnGateway(String name, VpnGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpnGateway(String name, VpnGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:VpnGateway", name, args == null ? VpnGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpnGateway(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:VpnGateway", name, null, makeResourceOptions(options, id));
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
    public static VpnGateway get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpnGateway(name, id, options);
    }
}
