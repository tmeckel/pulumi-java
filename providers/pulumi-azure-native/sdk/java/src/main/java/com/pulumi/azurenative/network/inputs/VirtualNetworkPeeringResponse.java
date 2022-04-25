// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.AddressSpaceResponse;
import com.pulumi.azurenative.network.inputs.SubResourceResponse;
import com.pulumi.azurenative.network.inputs.VirtualNetworkBgpCommunitiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Peerings in a virtual network resource.
 * 
 */
public final class VirtualNetworkPeeringResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkPeeringResponse Empty = new VirtualNetworkPeeringResponse();

    /**
     * Whether the forwarded traffic from the VMs in the local virtual network will be allowed/disallowed in remote virtual network.
     * 
     */
    @Import(name="allowForwardedTraffic")
    private @Nullable Boolean allowForwardedTraffic;

    /**
     * @return Whether the forwarded traffic from the VMs in the local virtual network will be allowed/disallowed in remote virtual network.
     * 
     */
    public Optional<Boolean> allowForwardedTraffic() {
        return Optional.ofNullable(this.allowForwardedTraffic);
    }

    /**
     * If gateway links can be used in remote virtual networking to link to this virtual network.
     * 
     */
    @Import(name="allowGatewayTransit")
    private @Nullable Boolean allowGatewayTransit;

    /**
     * @return If gateway links can be used in remote virtual networking to link to this virtual network.
     * 
     */
    public Optional<Boolean> allowGatewayTransit() {
        return Optional.ofNullable(this.allowGatewayTransit);
    }

    /**
     * Whether the VMs in the local virtual network space would be able to access the VMs in remote virtual network space.
     * 
     */
    @Import(name="allowVirtualNetworkAccess")
    private @Nullable Boolean allowVirtualNetworkAccess;

    /**
     * @return Whether the VMs in the local virtual network space would be able to access the VMs in remote virtual network space.
     * 
     */
    public Optional<Boolean> allowVirtualNetworkAccess() {
        return Optional.ofNullable(this.allowVirtualNetworkAccess);
    }

    /**
     * If we need to verify the provisioning state of the remote gateway.
     * 
     */
    @Import(name="doNotVerifyRemoteGateways")
    private @Nullable Boolean doNotVerifyRemoteGateways;

    /**
     * @return If we need to verify the provisioning state of the remote gateway.
     * 
     */
    public Optional<Boolean> doNotVerifyRemoteGateways() {
        return Optional.ofNullable(this.doNotVerifyRemoteGateways);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The status of the virtual network peering.
     * 
     */
    @Import(name="peeringState")
    private @Nullable String peeringState;

    /**
     * @return The status of the virtual network peering.
     * 
     */
    public Optional<String> peeringState() {
        return Optional.ofNullable(this.peeringState);
    }

    /**
     * The provisioning state of the virtual network peering resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return The provisioning state of the virtual network peering resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The reference to the remote virtual network address space.
     * 
     */
    @Import(name="remoteAddressSpace")
    private @Nullable AddressSpaceResponse remoteAddressSpace;

    /**
     * @return The reference to the remote virtual network address space.
     * 
     */
    public Optional<AddressSpaceResponse> remoteAddressSpace() {
        return Optional.ofNullable(this.remoteAddressSpace);
    }

    /**
     * The reference to the remote virtual network&#39;s Bgp Communities.
     * 
     */
    @Import(name="remoteBgpCommunities")
    private @Nullable VirtualNetworkBgpCommunitiesResponse remoteBgpCommunities;

    /**
     * @return The reference to the remote virtual network&#39;s Bgp Communities.
     * 
     */
    public Optional<VirtualNetworkBgpCommunitiesResponse> remoteBgpCommunities() {
        return Optional.ofNullable(this.remoteBgpCommunities);
    }

    /**
     * The reference to the remote virtual network. The remote virtual network can be in the same or different region (preview). See here to register for the preview and learn more (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
     * 
     */
    @Import(name="remoteVirtualNetwork")
    private @Nullable SubResourceResponse remoteVirtualNetwork;

    /**
     * @return The reference to the remote virtual network. The remote virtual network can be in the same or different region (preview). See here to register for the preview and learn more (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
     * 
     */
    public Optional<SubResourceResponse> remoteVirtualNetwork() {
        return Optional.ofNullable(this.remoteVirtualNetwork);
    }

    /**
     * The resourceGuid property of the Virtual Network peering resource.
     * 
     */
    @Import(name="resourceGuid", required=true)
    private String resourceGuid;

    /**
     * @return The resourceGuid property of the Virtual Network peering resource.
     * 
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Resource type.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return Resource type.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * If remote gateways can be used on this virtual network. If the flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network already has a gateway.
     * 
     */
    @Import(name="useRemoteGateways")
    private @Nullable Boolean useRemoteGateways;

    /**
     * @return If remote gateways can be used on this virtual network. If the flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network already has a gateway.
     * 
     */
    public Optional<Boolean> useRemoteGateways() {
        return Optional.ofNullable(this.useRemoteGateways);
    }

    private VirtualNetworkPeeringResponse() {}

    private VirtualNetworkPeeringResponse(VirtualNetworkPeeringResponse $) {
        this.allowForwardedTraffic = $.allowForwardedTraffic;
        this.allowGatewayTransit = $.allowGatewayTransit;
        this.allowVirtualNetworkAccess = $.allowVirtualNetworkAccess;
        this.doNotVerifyRemoteGateways = $.doNotVerifyRemoteGateways;
        this.etag = $.etag;
        this.id = $.id;
        this.name = $.name;
        this.peeringState = $.peeringState;
        this.provisioningState = $.provisioningState;
        this.remoteAddressSpace = $.remoteAddressSpace;
        this.remoteBgpCommunities = $.remoteBgpCommunities;
        this.remoteVirtualNetwork = $.remoteVirtualNetwork;
        this.resourceGuid = $.resourceGuid;
        this.type = $.type;
        this.useRemoteGateways = $.useRemoteGateways;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkPeeringResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkPeeringResponse $;

        public Builder() {
            $ = new VirtualNetworkPeeringResponse();
        }

        public Builder(VirtualNetworkPeeringResponse defaults) {
            $ = new VirtualNetworkPeeringResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowForwardedTraffic Whether the forwarded traffic from the VMs in the local virtual network will be allowed/disallowed in remote virtual network.
         * 
         * @return builder
         * 
         */
        public Builder allowForwardedTraffic(@Nullable Boolean allowForwardedTraffic) {
            $.allowForwardedTraffic = allowForwardedTraffic;
            return this;
        }

        /**
         * @param allowGatewayTransit If gateway links can be used in remote virtual networking to link to this virtual network.
         * 
         * @return builder
         * 
         */
        public Builder allowGatewayTransit(@Nullable Boolean allowGatewayTransit) {
            $.allowGatewayTransit = allowGatewayTransit;
            return this;
        }

        /**
         * @param allowVirtualNetworkAccess Whether the VMs in the local virtual network space would be able to access the VMs in remote virtual network space.
         * 
         * @return builder
         * 
         */
        public Builder allowVirtualNetworkAccess(@Nullable Boolean allowVirtualNetworkAccess) {
            $.allowVirtualNetworkAccess = allowVirtualNetworkAccess;
            return this;
        }

        /**
         * @param doNotVerifyRemoteGateways If we need to verify the provisioning state of the remote gateway.
         * 
         * @return builder
         * 
         */
        public Builder doNotVerifyRemoteGateways(@Nullable Boolean doNotVerifyRemoteGateways) {
            $.doNotVerifyRemoteGateways = doNotVerifyRemoteGateways;
            return this;
        }

        /**
         * @param etag A unique read-only string that changes whenever the resource is updated.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param peeringState The status of the virtual network peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringState(@Nullable String peeringState) {
            $.peeringState = peeringState;
            return this;
        }

        /**
         * @param provisioningState The provisioning state of the virtual network peering resource.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param remoteAddressSpace The reference to the remote virtual network address space.
         * 
         * @return builder
         * 
         */
        public Builder remoteAddressSpace(@Nullable AddressSpaceResponse remoteAddressSpace) {
            $.remoteAddressSpace = remoteAddressSpace;
            return this;
        }

        /**
         * @param remoteBgpCommunities The reference to the remote virtual network&#39;s Bgp Communities.
         * 
         * @return builder
         * 
         */
        public Builder remoteBgpCommunities(@Nullable VirtualNetworkBgpCommunitiesResponse remoteBgpCommunities) {
            $.remoteBgpCommunities = remoteBgpCommunities;
            return this;
        }

        /**
         * @param remoteVirtualNetwork The reference to the remote virtual network. The remote virtual network can be in the same or different region (preview). See here to register for the preview and learn more (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
         * 
         * @return builder
         * 
         */
        public Builder remoteVirtualNetwork(@Nullable SubResourceResponse remoteVirtualNetwork) {
            $.remoteVirtualNetwork = remoteVirtualNetwork;
            return this;
        }

        /**
         * @param resourceGuid The resourceGuid property of the Virtual Network peering resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceGuid(String resourceGuid) {
            $.resourceGuid = resourceGuid;
            return this;
        }

        /**
         * @param type Resource type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        /**
         * @param useRemoteGateways If remote gateways can be used on this virtual network. If the flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network already has a gateway.
         * 
         * @return builder
         * 
         */
        public Builder useRemoteGateways(@Nullable Boolean useRemoteGateways) {
            $.useRemoteGateways = useRemoteGateways;
            return this;
        }

        public VirtualNetworkPeeringResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.resourceGuid = Objects.requireNonNull($.resourceGuid, "expected parameter 'resourceGuid' to be non-null");
            return $;
        }
    }

}
