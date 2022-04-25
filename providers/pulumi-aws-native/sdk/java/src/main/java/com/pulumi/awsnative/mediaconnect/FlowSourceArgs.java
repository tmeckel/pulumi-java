// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediaconnect;

import com.pulumi.awsnative.mediaconnect.enums.FlowSourceProtocol;
import com.pulumi.awsnative.mediaconnect.inputs.FlowSourceEncryptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowSourceArgs Empty = new FlowSourceArgs();

    /**
     * The type of encryption that is used on the content ingested from this source.
     * 
     */
    @Import(name="decryption")
    private @Nullable Output<FlowSourceEncryptionArgs> decryption;

    /**
     * @return The type of encryption that is used on the content ingested from this source.
     * 
     */
    public Optional<Output<FlowSourceEncryptionArgs>> decryption() {
        return Optional.ofNullable(this.decryption);
    }

    /**
     * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The entitlement is set by the content originator and the ARN is generated as part of the originator&#39;s flow.
     * 
     */
    @Import(name="entitlementArn")
    private @Nullable Output<String> entitlementArn;

    /**
     * @return The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The entitlement is set by the content originator and the ARN is generated as part of the originator&#39;s flow.
     * 
     */
    public Optional<Output<String>> entitlementArn() {
        return Optional.ofNullable(this.entitlementArn);
    }

    /**
     * The ARN of the flow.
     * 
     */
    @Import(name="flowArn")
    private @Nullable Output<String> flowArn;

    /**
     * @return The ARN of the flow.
     * 
     */
    public Optional<Output<String>> flowArn() {
        return Optional.ofNullable(this.flowArn);
    }

    /**
     * The port that the flow will be listening on for incoming content.
     * 
     */
    @Import(name="ingestPort")
    private @Nullable Output<Integer> ingestPort;

    /**
     * @return The port that the flow will be listening on for incoming content.
     * 
     */
    public Optional<Output<Integer>> ingestPort() {
        return Optional.ofNullable(this.ingestPort);
    }

    /**
     * The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
     * 
     */
    @Import(name="maxBitrate")
    private @Nullable Output<Integer> maxBitrate;

    /**
     * @return The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
     * 
     */
    public Optional<Output<Integer>> maxBitrate() {
        return Optional.ofNullable(this.maxBitrate);
    }

    /**
     * The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
     * 
     */
    @Import(name="maxLatency")
    private @Nullable Output<Integer> maxLatency;

    /**
     * @return The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
     * 
     */
    public Optional<Output<Integer>> maxLatency() {
        return Optional.ofNullable(this.maxLatency);
    }

    /**
     * The name of the source.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the source.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The protocol that is used by the source.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<FlowSourceProtocol> protocol;

    /**
     * @return The protocol that is used by the source.
     * 
     */
    public Optional<Output<FlowSourceProtocol>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     * 
     */
    @Import(name="streamId")
    private @Nullable Output<String> streamId;

    /**
     * @return The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     * 
     */
    public Optional<Output<String>> streamId() {
        return Optional.ofNullable(this.streamId);
    }

    /**
     * The name of the VPC Interface this Source is configured with.
     * 
     */
    @Import(name="vpcInterfaceName")
    private @Nullable Output<String> vpcInterfaceName;

    /**
     * @return The name of the VPC Interface this Source is configured with.
     * 
     */
    public Optional<Output<String>> vpcInterfaceName() {
        return Optional.ofNullable(this.vpcInterfaceName);
    }

    /**
     * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     */
    @Import(name="whitelistCidr")
    private @Nullable Output<String> whitelistCidr;

    /**
     * @return The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     */
    public Optional<Output<String>> whitelistCidr() {
        return Optional.ofNullable(this.whitelistCidr);
    }

    private FlowSourceArgs() {}

    private FlowSourceArgs(FlowSourceArgs $) {
        this.decryption = $.decryption;
        this.description = $.description;
        this.entitlementArn = $.entitlementArn;
        this.flowArn = $.flowArn;
        this.ingestPort = $.ingestPort;
        this.maxBitrate = $.maxBitrate;
        this.maxLatency = $.maxLatency;
        this.name = $.name;
        this.protocol = $.protocol;
        this.streamId = $.streamId;
        this.vpcInterfaceName = $.vpcInterfaceName;
        this.whitelistCidr = $.whitelistCidr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowSourceArgs $;

        public Builder() {
            $ = new FlowSourceArgs();
        }

        public Builder(FlowSourceArgs defaults) {
            $ = new FlowSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param decryption The type of encryption that is used on the content ingested from this source.
         * 
         * @return builder
         * 
         */
        public Builder decryption(@Nullable Output<FlowSourceEncryptionArgs> decryption) {
            $.decryption = decryption;
            return this;
        }

        /**
         * @param decryption The type of encryption that is used on the content ingested from this source.
         * 
         * @return builder
         * 
         */
        public Builder decryption(FlowSourceEncryptionArgs decryption) {
            return decryption(Output.of(decryption));
        }

        /**
         * @param description A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param entitlementArn The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The entitlement is set by the content originator and the ARN is generated as part of the originator&#39;s flow.
         * 
         * @return builder
         * 
         */
        public Builder entitlementArn(@Nullable Output<String> entitlementArn) {
            $.entitlementArn = entitlementArn;
            return this;
        }

        /**
         * @param entitlementArn The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The entitlement is set by the content originator and the ARN is generated as part of the originator&#39;s flow.
         * 
         * @return builder
         * 
         */
        public Builder entitlementArn(String entitlementArn) {
            return entitlementArn(Output.of(entitlementArn));
        }

        /**
         * @param flowArn The ARN of the flow.
         * 
         * @return builder
         * 
         */
        public Builder flowArn(@Nullable Output<String> flowArn) {
            $.flowArn = flowArn;
            return this;
        }

        /**
         * @param flowArn The ARN of the flow.
         * 
         * @return builder
         * 
         */
        public Builder flowArn(String flowArn) {
            return flowArn(Output.of(flowArn));
        }

        /**
         * @param ingestPort The port that the flow will be listening on for incoming content.
         * 
         * @return builder
         * 
         */
        public Builder ingestPort(@Nullable Output<Integer> ingestPort) {
            $.ingestPort = ingestPort;
            return this;
        }

        /**
         * @param ingestPort The port that the flow will be listening on for incoming content.
         * 
         * @return builder
         * 
         */
        public Builder ingestPort(Integer ingestPort) {
            return ingestPort(Output.of(ingestPort));
        }

        /**
         * @param maxBitrate The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
         * 
         * @return builder
         * 
         */
        public Builder maxBitrate(@Nullable Output<Integer> maxBitrate) {
            $.maxBitrate = maxBitrate;
            return this;
        }

        /**
         * @param maxBitrate The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
         * 
         * @return builder
         * 
         */
        public Builder maxBitrate(Integer maxBitrate) {
            return maxBitrate(Output.of(maxBitrate));
        }

        /**
         * @param maxLatency The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
         * 
         * @return builder
         * 
         */
        public Builder maxLatency(@Nullable Output<Integer> maxLatency) {
            $.maxLatency = maxLatency;
            return this;
        }

        /**
         * @param maxLatency The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
         * 
         * @return builder
         * 
         */
        public Builder maxLatency(Integer maxLatency) {
            return maxLatency(Output.of(maxLatency));
        }

        /**
         * @param name The name of the source.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the source.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protocol The protocol that is used by the source.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<FlowSourceProtocol> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol that is used by the source.
         * 
         * @return builder
         * 
         */
        public Builder protocol(FlowSourceProtocol protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param streamId The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
         * 
         * @return builder
         * 
         */
        public Builder streamId(@Nullable Output<String> streamId) {
            $.streamId = streamId;
            return this;
        }

        /**
         * @param streamId The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
         * 
         * @return builder
         * 
         */
        public Builder streamId(String streamId) {
            return streamId(Output.of(streamId));
        }

        /**
         * @param vpcInterfaceName The name of the VPC Interface this Source is configured with.
         * 
         * @return builder
         * 
         */
        public Builder vpcInterfaceName(@Nullable Output<String> vpcInterfaceName) {
            $.vpcInterfaceName = vpcInterfaceName;
            return this;
        }

        /**
         * @param vpcInterfaceName The name of the VPC Interface this Source is configured with.
         * 
         * @return builder
         * 
         */
        public Builder vpcInterfaceName(String vpcInterfaceName) {
            return vpcInterfaceName(Output.of(vpcInterfaceName));
        }

        /**
         * @param whitelistCidr The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
         * 
         * @return builder
         * 
         */
        public Builder whitelistCidr(@Nullable Output<String> whitelistCidr) {
            $.whitelistCidr = whitelistCidr;
            return this;
        }

        /**
         * @param whitelistCidr The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
         * 
         * @return builder
         * 
         */
        public Builder whitelistCidr(String whitelistCidr) {
            return whitelistCidr(Output.of(whitelistCidr));
        }

        public FlowSourceArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            return $;
        }
    }

}
