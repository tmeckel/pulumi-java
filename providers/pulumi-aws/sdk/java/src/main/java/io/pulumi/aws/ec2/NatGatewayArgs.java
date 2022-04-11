// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NatGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final NatGatewayArgs Empty = new NatGatewayArgs();

    /**
     * The Allocation ID of the Elastic IP address for the gateway. Required for `connectivity_type` of `public`.
     * 
     */
    @Import(name="allocationId")
      private final @Nullable Output<String> allocationId;

    public Output<String> getAllocationId() {
        return this.allocationId == null ? Codegen.empty() : this.allocationId;
    }

    /**
     * Connectivity type for the gateway. Valid values are `private` and `public`. Defaults to `public`.
     * 
     */
    @Import(name="connectivityType")
      private final @Nullable Output<String> connectivityType;

    public Output<String> getConnectivityType() {
        return this.connectivityType == null ? Codegen.empty() : this.connectivityType;
    }

    /**
     * The Subnet ID of the subnet in which to place the gateway.
     * 
     */
    @Import(name="subnetId", required=true)
      private final Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public NatGatewayArgs(
        @Nullable Output<String> allocationId,
        @Nullable Output<String> connectivityType,
        Output<String> subnetId,
        @Nullable Output<Map<String,String>> tags) {
        this.allocationId = allocationId;
        this.connectivityType = connectivityType;
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
        this.tags = tags;
    }

    private NatGatewayArgs() {
        this.allocationId = Codegen.empty();
        this.connectivityType = Codegen.empty();
        this.subnetId = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NatGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> allocationId;
        private @Nullable Output<String> connectivityType;
        private Output<String> subnetId;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NatGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.connectivityType = defaults.connectivityType;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
        }

        public Builder allocationId(@Nullable Output<String> allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public Builder allocationId(@Nullable String allocationId) {
            this.allocationId = Codegen.ofNullable(allocationId);
            return this;
        }
        public Builder connectivityType(@Nullable Output<String> connectivityType) {
            this.connectivityType = connectivityType;
            return this;
        }
        public Builder connectivityType(@Nullable String connectivityType) {
            this.connectivityType = Codegen.ofNullable(connectivityType);
            return this;
        }
        public Builder subnetId(Output<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Output.of(Objects.requireNonNull(subnetId));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public NatGatewayArgs build() {
            return new NatGatewayArgs(allocationId, connectivityType, subnetId, tags);
        }
    }
}
