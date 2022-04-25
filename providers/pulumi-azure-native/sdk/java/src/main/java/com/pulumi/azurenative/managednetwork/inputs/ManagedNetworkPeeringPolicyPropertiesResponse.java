// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managednetwork.inputs;

import com.pulumi.azurenative.managednetwork.inputs.ResourceIdResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a Managed Network Peering Policy
 * 
 */
public final class ManagedNetworkPeeringPolicyPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedNetworkPeeringPolicyPropertiesResponse Empty = new ManagedNetworkPeeringPolicyPropertiesResponse();

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
     * Gets or sets the hub virtual network ID
     * 
     */
    @Import(name="hub")
    private @Nullable ResourceIdResponse hub;

    /**
     * @return Gets or sets the hub virtual network ID
     * 
     */
    public Optional<ResourceIdResponse> hub() {
        return Optional.ofNullable(this.hub);
    }

    /**
     * Gets or sets the mesh group IDs
     * 
     */
    @Import(name="mesh")
    private @Nullable List<ResourceIdResponse> mesh;

    /**
     * @return Gets or sets the mesh group IDs
     * 
     */
    public Optional<List<ResourceIdResponse>> mesh() {
        return Optional.ofNullable(this.mesh);
    }

    /**
     * Provisioning state of the ManagedNetwork resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return Provisioning state of the ManagedNetwork resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Gets or sets the spokes group IDs
     * 
     */
    @Import(name="spokes")
    private @Nullable List<ResourceIdResponse> spokes;

    /**
     * @return Gets or sets the spokes group IDs
     * 
     */
    public Optional<List<ResourceIdResponse>> spokes() {
        return Optional.ofNullable(this.spokes);
    }

    /**
     * Gets or sets the connectivity type of a network structure policy
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Gets or sets the connectivity type of a network structure policy
     * 
     */
    public String type() {
        return this.type;
    }

    private ManagedNetworkPeeringPolicyPropertiesResponse() {}

    private ManagedNetworkPeeringPolicyPropertiesResponse(ManagedNetworkPeeringPolicyPropertiesResponse $) {
        this.etag = $.etag;
        this.hub = $.hub;
        this.mesh = $.mesh;
        this.provisioningState = $.provisioningState;
        this.spokes = $.spokes;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedNetworkPeeringPolicyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedNetworkPeeringPolicyPropertiesResponse $;

        public Builder() {
            $ = new ManagedNetworkPeeringPolicyPropertiesResponse();
        }

        public Builder(ManagedNetworkPeeringPolicyPropertiesResponse defaults) {
            $ = new ManagedNetworkPeeringPolicyPropertiesResponse(Objects.requireNonNull(defaults));
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
         * @param hub Gets or sets the hub virtual network ID
         * 
         * @return builder
         * 
         */
        public Builder hub(@Nullable ResourceIdResponse hub) {
            $.hub = hub;
            return this;
        }

        /**
         * @param mesh Gets or sets the mesh group IDs
         * 
         * @return builder
         * 
         */
        public Builder mesh(@Nullable List<ResourceIdResponse> mesh) {
            $.mesh = mesh;
            return this;
        }

        /**
         * @param mesh Gets or sets the mesh group IDs
         * 
         * @return builder
         * 
         */
        public Builder mesh(ResourceIdResponse... mesh) {
            return mesh(List.of(mesh));
        }

        /**
         * @param provisioningState Provisioning state of the ManagedNetwork resource.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param spokes Gets or sets the spokes group IDs
         * 
         * @return builder
         * 
         */
        public Builder spokes(@Nullable List<ResourceIdResponse> spokes) {
            $.spokes = spokes;
            return this;
        }

        /**
         * @param spokes Gets or sets the spokes group IDs
         * 
         * @return builder
         * 
         */
        public Builder spokes(ResourceIdResponse... spokes) {
            return spokes(List.of(spokes));
        }

        /**
         * @param type Gets or sets the connectivity type of a network structure policy
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ManagedNetworkPeeringPolicyPropertiesResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
