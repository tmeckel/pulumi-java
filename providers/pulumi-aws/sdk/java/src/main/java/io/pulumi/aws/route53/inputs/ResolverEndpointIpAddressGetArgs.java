// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverEndpointIpAddressGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverEndpointIpAddressGetArgs Empty = new ResolverEndpointIpAddressGetArgs();

    /**
     * The IP address in the subnet that you want to use for DNS queries.
     * 
     */
    @InputImport(name="ip")
      private final @Nullable Input<String> ip;

    public Input<String> getIp() {
        return this.ip == null ? Input.empty() : this.ip;
    }

    @InputImport(name="ipId")
      private final @Nullable Input<String> ipId;

    public Input<String> getIpId() {
        return this.ipId == null ? Input.empty() : this.ipId;
    }

    /**
     * The ID of the subnet that contains the IP address.
     * 
     */
    @InputImport(name="subnetId", required=true)
      private final Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId;
    }

    public ResolverEndpointIpAddressGetArgs(
        @Nullable Input<String> ip,
        @Nullable Input<String> ipId,
        Input<String> subnetId) {
        this.ip = ip;
        this.ipId = ipId;
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private ResolverEndpointIpAddressGetArgs() {
        this.ip = Input.empty();
        this.ipId = Input.empty();
        this.subnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverEndpointIpAddressGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ip;
        private @Nullable Input<String> ipId;
        private Input<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverEndpointIpAddressGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.ipId = defaults.ipId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder ip(@Nullable Input<String> ip) {
            this.ip = ip;
            return this;
        }

        public Builder ip(@Nullable String ip) {
            this.ip = Input.ofNullable(ip);
            return this;
        }

        public Builder ipId(@Nullable Input<String> ipId) {
            this.ipId = ipId;
            return this;
        }

        public Builder ipId(@Nullable String ipId) {
            this.ipId = Input.ofNullable(ipId);
            return this;
        }

        public Builder subnetId(Input<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder subnetId(String subnetId) {
            this.subnetId = Input.of(Objects.requireNonNull(subnetId));
            return this;
        }
        public ResolverEndpointIpAddressGetArgs build() {
            return new ResolverEndpointIpAddressGetArgs(ip, ipId, subnetId);
        }
    }
}
