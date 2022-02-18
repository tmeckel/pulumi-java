// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.PacketMirroringMirroredResourceInfoInstanceInfoResponse;
import io.pulumi.googlenative.compute_beta.inputs.PacketMirroringMirroredResourceInfoSubnetInfoResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PacketMirroringMirroredResourceInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final PacketMirroringMirroredResourceInfoResponse Empty = new PacketMirroringMirroredResourceInfoResponse();

    /**
     * A set of virtual machine instances that are being mirrored. They must live in zones contained in the same region as this packetMirroring. Note that this config will apply only to those network interfaces of the Instances that belong to the network specified in this packetMirroring. You may specify a maximum of 50 Instances.
     * 
     */
    @InputImport(name="instances", required=true)
    private final List<PacketMirroringMirroredResourceInfoInstanceInfoResponse> instances;

    public List<PacketMirroringMirroredResourceInfoInstanceInfoResponse> getInstances() {
        return this.instances;
    }

    /**
     * A set of subnetworks for which traffic from/to all VM instances will be mirrored. They must live in the same region as this packetMirroring. You may specify a maximum of 5 subnetworks.
     * 
     */
    @InputImport(name="subnetworks", required=true)
    private final List<PacketMirroringMirroredResourceInfoSubnetInfoResponse> subnetworks;

    public List<PacketMirroringMirroredResourceInfoSubnetInfoResponse> getSubnetworks() {
        return this.subnetworks;
    }

    /**
     * A set of mirrored tags. Traffic from/to all VM instances that have one or more of these tags will be mirrored.
     * 
     */
    @InputImport(name="tags", required=true)
    private final List<String> tags;

    public List<String> getTags() {
        return this.tags;
    }

    public PacketMirroringMirroredResourceInfoResponse(
        List<PacketMirroringMirroredResourceInfoInstanceInfoResponse> instances,
        List<PacketMirroringMirroredResourceInfoSubnetInfoResponse> subnetworks,
        List<String> tags) {
        this.instances = Objects.requireNonNull(instances, "expected parameter 'instances' to be non-null");
        this.subnetworks = Objects.requireNonNull(subnetworks, "expected parameter 'subnetworks' to be non-null");
        this.tags = Objects.requireNonNull(tags, "expected parameter 'tags' to be non-null");
    }

    private PacketMirroringMirroredResourceInfoResponse() {
        this.instances = List.of();
        this.subnetworks = List.of();
        this.tags = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringMirroredResourceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<PacketMirroringMirroredResourceInfoInstanceInfoResponse> instances;
        private List<PacketMirroringMirroredResourceInfoSubnetInfoResponse> subnetworks;
        private List<String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringMirroredResourceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
    	      this.subnetworks = defaults.subnetworks;
    	      this.tags = defaults.tags;
        }

        public Builder setInstances(List<PacketMirroringMirroredResourceInfoInstanceInfoResponse> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder setSubnetworks(List<PacketMirroringMirroredResourceInfoSubnetInfoResponse> subnetworks) {
            this.subnetworks = Objects.requireNonNull(subnetworks);
            return this;
        }

        public Builder setTags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public PacketMirroringMirroredResourceInfoResponse build() {
            return new PacketMirroringMirroredResourceInfoResponse(instances, subnetworks, tags);
        }
    }
}
