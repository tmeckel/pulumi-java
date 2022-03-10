// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect;

import io.pulumi.awsnative.mediaconnect.enums.FlowOutputProtocol;
import io.pulumi.awsnative.mediaconnect.inputs.FlowOutputEncryptionArgs;
import io.pulumi.awsnative.mediaconnect.inputs.FlowOutputVpcInterfaceAttachmentArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowOutputArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowOutputArgs Empty = new FlowOutputArgs();

    /**
     * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     */
    @InputImport(name="cidrAllowList")
      private final @Nullable Input<List<String>> cidrAllowList;

    public Input<List<String>> getCidrAllowList() {
        return this.cidrAllowList == null ? Input.empty() : this.cidrAllowList;
    }

    /**
     * A description of the output.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The address where you want to send the output.
     * 
     */
    @InputImport(name="destination")
      private final @Nullable Input<String> destination;

    public Input<String> getDestination() {
        return this.destination == null ? Input.empty() : this.destination;
    }

    /**
     * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
     * 
     */
    @InputImport(name="encryption")
      private final @Nullable Input<FlowOutputEncryptionArgs> encryption;

    public Input<FlowOutputEncryptionArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    /**
     * The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
     * 
     */
    @InputImport(name="flowArn", required=true)
      private final Input<String> flowArn;

    public Input<String> getFlowArn() {
        return this.flowArn;
    }

    /**
     * The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
     * 
     */
    @InputImport(name="maxLatency")
      private final @Nullable Input<Integer> maxLatency;

    public Input<Integer> getMaxLatency() {
        return this.maxLatency == null ? Input.empty() : this.maxLatency;
    }

    /**
     * The minimum latency in milliseconds.
     * 
     */
    @InputImport(name="minLatency")
      private final @Nullable Input<Integer> minLatency;

    public Input<Integer> getMinLatency() {
        return this.minLatency == null ? Input.empty() : this.minLatency;
    }

    /**
     * The name of the output. This value must be unique within the current flow.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The port to use when content is distributed to this output.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * The protocol that is used by the source or output.
     * 
     */
    @InputImport(name="protocol", required=true)
      private final Input<FlowOutputProtocol> protocol;

    public Input<FlowOutputProtocol> getProtocol() {
        return this.protocol;
    }

    /**
     * The remote ID for the Zixi-pull stream.
     * 
     */
    @InputImport(name="remoteId")
      private final @Nullable Input<String> remoteId;

    public Input<String> getRemoteId() {
        return this.remoteId == null ? Input.empty() : this.remoteId;
    }

    /**
     * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
     * 
     */
    @InputImport(name="smoothingLatency")
      private final @Nullable Input<Integer> smoothingLatency;

    public Input<Integer> getSmoothingLatency() {
        return this.smoothingLatency == null ? Input.empty() : this.smoothingLatency;
    }

    /**
     * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     * 
     */
    @InputImport(name="streamId")
      private final @Nullable Input<String> streamId;

    public Input<String> getStreamId() {
        return this.streamId == null ? Input.empty() : this.streamId;
    }

    /**
     * The name of the VPC interface attachment to use for this output.
     * 
     */
    @InputImport(name="vpcInterfaceAttachment")
      private final @Nullable Input<FlowOutputVpcInterfaceAttachmentArgs> vpcInterfaceAttachment;

    public Input<FlowOutputVpcInterfaceAttachmentArgs> getVpcInterfaceAttachment() {
        return this.vpcInterfaceAttachment == null ? Input.empty() : this.vpcInterfaceAttachment;
    }

    public FlowOutputArgs(
        @Nullable Input<List<String>> cidrAllowList,
        @Nullable Input<String> description,
        @Nullable Input<String> destination,
        @Nullable Input<FlowOutputEncryptionArgs> encryption,
        Input<String> flowArn,
        @Nullable Input<Integer> maxLatency,
        @Nullable Input<Integer> minLatency,
        @Nullable Input<String> name,
        @Nullable Input<Integer> port,
        Input<FlowOutputProtocol> protocol,
        @Nullable Input<String> remoteId,
        @Nullable Input<Integer> smoothingLatency,
        @Nullable Input<String> streamId,
        @Nullable Input<FlowOutputVpcInterfaceAttachmentArgs> vpcInterfaceAttachment) {
        this.cidrAllowList = cidrAllowList;
        this.description = description;
        this.destination = destination;
        this.encryption = encryption;
        this.flowArn = Objects.requireNonNull(flowArn, "expected parameter 'flowArn' to be non-null");
        this.maxLatency = maxLatency;
        this.minLatency = minLatency;
        this.name = name;
        this.port = port;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.remoteId = remoteId;
        this.smoothingLatency = smoothingLatency;
        this.streamId = streamId;
        this.vpcInterfaceAttachment = vpcInterfaceAttachment;
    }

    private FlowOutputArgs() {
        this.cidrAllowList = Input.empty();
        this.description = Input.empty();
        this.destination = Input.empty();
        this.encryption = Input.empty();
        this.flowArn = Input.empty();
        this.maxLatency = Input.empty();
        this.minLatency = Input.empty();
        this.name = Input.empty();
        this.port = Input.empty();
        this.protocol = Input.empty();
        this.remoteId = Input.empty();
        this.smoothingLatency = Input.empty();
        this.streamId = Input.empty();
        this.vpcInterfaceAttachment = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> cidrAllowList;
        private @Nullable Input<String> description;
        private @Nullable Input<String> destination;
        private @Nullable Input<FlowOutputEncryptionArgs> encryption;
        private Input<String> flowArn;
        private @Nullable Input<Integer> maxLatency;
        private @Nullable Input<Integer> minLatency;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> port;
        private Input<FlowOutputProtocol> protocol;
        private @Nullable Input<String> remoteId;
        private @Nullable Input<Integer> smoothingLatency;
        private @Nullable Input<String> streamId;
        private @Nullable Input<FlowOutputVpcInterfaceAttachmentArgs> vpcInterfaceAttachment;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowOutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrAllowList = defaults.cidrAllowList;
    	      this.description = defaults.description;
    	      this.destination = defaults.destination;
    	      this.encryption = defaults.encryption;
    	      this.flowArn = defaults.flowArn;
    	      this.maxLatency = defaults.maxLatency;
    	      this.minLatency = defaults.minLatency;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.remoteId = defaults.remoteId;
    	      this.smoothingLatency = defaults.smoothingLatency;
    	      this.streamId = defaults.streamId;
    	      this.vpcInterfaceAttachment = defaults.vpcInterfaceAttachment;
        }

        public Builder cidrAllowList(@Nullable Input<List<String>> cidrAllowList) {
            this.cidrAllowList = cidrAllowList;
            return this;
        }

        public Builder cidrAllowList(@Nullable List<String> cidrAllowList) {
            this.cidrAllowList = Input.ofNullable(cidrAllowList);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder destination(@Nullable Input<String> destination) {
            this.destination = destination;
            return this;
        }

        public Builder destination(@Nullable String destination) {
            this.destination = Input.ofNullable(destination);
            return this;
        }

        public Builder encryption(@Nullable Input<FlowOutputEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder encryption(@Nullable FlowOutputEncryptionArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder flowArn(Input<String> flowArn) {
            this.flowArn = Objects.requireNonNull(flowArn);
            return this;
        }

        public Builder flowArn(String flowArn) {
            this.flowArn = Input.of(Objects.requireNonNull(flowArn));
            return this;
        }

        public Builder maxLatency(@Nullable Input<Integer> maxLatency) {
            this.maxLatency = maxLatency;
            return this;
        }

        public Builder maxLatency(@Nullable Integer maxLatency) {
            this.maxLatency = Input.ofNullable(maxLatency);
            return this;
        }

        public Builder minLatency(@Nullable Input<Integer> minLatency) {
            this.minLatency = minLatency;
            return this;
        }

        public Builder minLatency(@Nullable Integer minLatency) {
            this.minLatency = Input.ofNullable(minLatency);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder port(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder protocol(Input<FlowOutputProtocol> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder protocol(FlowOutputProtocol protocol) {
            this.protocol = Input.of(Objects.requireNonNull(protocol));
            return this;
        }

        public Builder remoteId(@Nullable Input<String> remoteId) {
            this.remoteId = remoteId;
            return this;
        }

        public Builder remoteId(@Nullable String remoteId) {
            this.remoteId = Input.ofNullable(remoteId);
            return this;
        }

        public Builder smoothingLatency(@Nullable Input<Integer> smoothingLatency) {
            this.smoothingLatency = smoothingLatency;
            return this;
        }

        public Builder smoothingLatency(@Nullable Integer smoothingLatency) {
            this.smoothingLatency = Input.ofNullable(smoothingLatency);
            return this;
        }

        public Builder streamId(@Nullable Input<String> streamId) {
            this.streamId = streamId;
            return this;
        }

        public Builder streamId(@Nullable String streamId) {
            this.streamId = Input.ofNullable(streamId);
            return this;
        }

        public Builder vpcInterfaceAttachment(@Nullable Input<FlowOutputVpcInterfaceAttachmentArgs> vpcInterfaceAttachment) {
            this.vpcInterfaceAttachment = vpcInterfaceAttachment;
            return this;
        }

        public Builder vpcInterfaceAttachment(@Nullable FlowOutputVpcInterfaceAttachmentArgs vpcInterfaceAttachment) {
            this.vpcInterfaceAttachment = Input.ofNullable(vpcInterfaceAttachment);
            return this;
        }
        public FlowOutputArgs build() {
            return new FlowOutputArgs(cidrAllowList, description, destination, encryption, flowArn, maxLatency, minLatency, name, port, protocol, remoteId, smoothingLatency, streamId, vpcInterfaceAttachment);
        }
    }
}
