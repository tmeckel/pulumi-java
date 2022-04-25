// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PeeringAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final PeeringAttachmentArgs Empty = new PeeringAttachmentArgs();

    /**
     * Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
     * 
     */
    @Import(name="peerAccountId")
    private @Nullable Output<String> peerAccountId;

    /**
     * @return Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
     * 
     */
    public Optional<Output<String>> peerAccountId() {
        return Optional.ofNullable(this.peerAccountId);
    }

    /**
     * Region of EC2 Transit Gateway to peer with.
     * 
     */
    @Import(name="peerRegion", required=true)
    private Output<String> peerRegion;

    /**
     * @return Region of EC2 Transit Gateway to peer with.
     * 
     */
    public Output<String> peerRegion() {
        return this.peerRegion;
    }

    /**
     * Identifier of EC2 Transit Gateway to peer with.
     * 
     */
    @Import(name="peerTransitGatewayId", required=true)
    private Output<String> peerTransitGatewayId;

    /**
     * @return Identifier of EC2 Transit Gateway to peer with.
     * 
     */
    public Output<String> peerTransitGatewayId() {
        return this.peerTransitGatewayId;
    }

    /**
     * Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Identifier of EC2 Transit Gateway.
     * 
     */
    @Import(name="transitGatewayId", required=true)
    private Output<String> transitGatewayId;

    /**
     * @return Identifier of EC2 Transit Gateway.
     * 
     */
    public Output<String> transitGatewayId() {
        return this.transitGatewayId;
    }

    private PeeringAttachmentArgs() {}

    private PeeringAttachmentArgs(PeeringAttachmentArgs $) {
        this.peerAccountId = $.peerAccountId;
        this.peerRegion = $.peerRegion;
        this.peerTransitGatewayId = $.peerTransitGatewayId;
        this.tags = $.tags;
        this.transitGatewayId = $.transitGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PeeringAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PeeringAttachmentArgs $;

        public Builder() {
            $ = new PeeringAttachmentArgs();
        }

        public Builder(PeeringAttachmentArgs defaults) {
            $ = new PeeringAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param peerAccountId Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
         * 
         * @return builder
         * 
         */
        public Builder peerAccountId(@Nullable Output<String> peerAccountId) {
            $.peerAccountId = peerAccountId;
            return this;
        }

        /**
         * @param peerAccountId Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
         * 
         * @return builder
         * 
         */
        public Builder peerAccountId(String peerAccountId) {
            return peerAccountId(Output.of(peerAccountId));
        }

        /**
         * @param peerRegion Region of EC2 Transit Gateway to peer with.
         * 
         * @return builder
         * 
         */
        public Builder peerRegion(Output<String> peerRegion) {
            $.peerRegion = peerRegion;
            return this;
        }

        /**
         * @param peerRegion Region of EC2 Transit Gateway to peer with.
         * 
         * @return builder
         * 
         */
        public Builder peerRegion(String peerRegion) {
            return peerRegion(Output.of(peerRegion));
        }

        /**
         * @param peerTransitGatewayId Identifier of EC2 Transit Gateway to peer with.
         * 
         * @return builder
         * 
         */
        public Builder peerTransitGatewayId(Output<String> peerTransitGatewayId) {
            $.peerTransitGatewayId = peerTransitGatewayId;
            return this;
        }

        /**
         * @param peerTransitGatewayId Identifier of EC2 Transit Gateway to peer with.
         * 
         * @return builder
         * 
         */
        public Builder peerTransitGatewayId(String peerTransitGatewayId) {
            return peerTransitGatewayId(Output.of(peerTransitGatewayId));
        }

        /**
         * @param tags Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param transitGatewayId Identifier of EC2 Transit Gateway.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayId(Output<String> transitGatewayId) {
            $.transitGatewayId = transitGatewayId;
            return this;
        }

        /**
         * @param transitGatewayId Identifier of EC2 Transit Gateway.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayId(String transitGatewayId) {
            return transitGatewayId(Output.of(transitGatewayId));
        }

        public PeeringAttachmentArgs build() {
            $.peerRegion = Objects.requireNonNull($.peerRegion, "expected parameter 'peerRegion' to be non-null");
            $.peerTransitGatewayId = Objects.requireNonNull($.peerTransitGatewayId, "expected parameter 'peerTransitGatewayId' to be non-null");
            $.transitGatewayId = Objects.requireNonNull($.transitGatewayId, "expected parameter 'transitGatewayId' to be non-null");
            return $;
        }
    }

}
