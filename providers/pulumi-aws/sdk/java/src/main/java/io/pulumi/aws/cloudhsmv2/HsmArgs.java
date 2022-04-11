// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudhsmv2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HsmArgs extends io.pulumi.resources.ResourceArgs {

    public static final HsmArgs Empty = new HsmArgs();

    /**
     * The IDs of AZ in which HSM module will be located. Do not use together with subnet_id.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Codegen.empty() : this.availabilityZone;
    }

    /**
     * The ID of Cloud HSM v2 cluster to which HSM will be added.
     * 
     */
    @Import(name="clusterId", required=true)
      private final Output<String> clusterId;

    public Output<String> getClusterId() {
        return this.clusterId;
    }

    /**
     * The IP address of HSM module. Must be within the CIDR of selected subnet.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Codegen.empty() : this.ipAddress;
    }

    /**
     * The ID of subnet in which HSM module will be located.
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId == null ? Codegen.empty() : this.subnetId;
    }

    public HsmArgs(
        @Nullable Output<String> availabilityZone,
        Output<String> clusterId,
        @Nullable Output<String> ipAddress,
        @Nullable Output<String> subnetId) {
        this.availabilityZone = availabilityZone;
        this.clusterId = Objects.requireNonNull(clusterId, "expected parameter 'clusterId' to be non-null");
        this.ipAddress = ipAddress;
        this.subnetId = subnetId;
    }

    private HsmArgs() {
        this.availabilityZone = Codegen.empty();
        this.clusterId = Codegen.empty();
        this.ipAddress = Codegen.empty();
        this.subnetId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HsmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> availabilityZone;
        private Output<String> clusterId;
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(HsmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.clusterId = defaults.clusterId;
    	      this.ipAddress = defaults.ipAddress;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Codegen.ofNullable(availabilityZone);
            return this;
        }
        public Builder clusterId(Output<String> clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder clusterId(String clusterId) {
            this.clusterId = Output.of(Objects.requireNonNull(clusterId));
            return this;
        }
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Codegen.ofNullable(ipAddress);
            return this;
        }
        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Codegen.ofNullable(subnetId);
            return this;
        }        public HsmArgs build() {
            return new HsmArgs(availabilityZone, clusterId, ipAddress, subnetId);
        }
    }
}
