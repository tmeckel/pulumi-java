// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IPAMAllocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final IPAMAllocationArgs Empty = new IPAMAllocationArgs();

    @InputImport(name="cidr")
      private final @Nullable Input<String> cidr;

    public Input<String> getCidr() {
        return this.cidr == null ? Input.empty() : this.cidr;
    }

    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Id of the IPAM Pool.
     * 
     */
    @InputImport(name="ipamPoolId", required=true)
      private final Input<String> ipamPoolId;

    public Input<String> getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * The desired netmask length of the allocation. If set, IPAM will choose a block of free space with this size and return the CIDR representing it.
     * 
     */
    @InputImport(name="netmaskLength")
      private final @Nullable Input<Integer> netmaskLength;

    public Input<Integer> getNetmaskLength() {
        return this.netmaskLength == null ? Input.empty() : this.netmaskLength;
    }

    public IPAMAllocationArgs(
        @Nullable Input<String> cidr,
        @Nullable Input<String> description,
        Input<String> ipamPoolId,
        @Nullable Input<Integer> netmaskLength) {
        this.cidr = cidr;
        this.description = description;
        this.ipamPoolId = Objects.requireNonNull(ipamPoolId, "expected parameter 'ipamPoolId' to be non-null");
        this.netmaskLength = netmaskLength;
    }

    private IPAMAllocationArgs() {
        this.cidr = Input.empty();
        this.description = Input.empty();
        this.ipamPoolId = Input.empty();
        this.netmaskLength = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAMAllocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cidr;
        private @Nullable Input<String> description;
        private Input<String> ipamPoolId;
        private @Nullable Input<Integer> netmaskLength;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAMAllocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.description = defaults.description;
    	      this.ipamPoolId = defaults.ipamPoolId;
    	      this.netmaskLength = defaults.netmaskLength;
        }

        public Builder cidr(@Nullable Input<String> cidr) {
            this.cidr = cidr;
            return this;
        }

        public Builder cidr(@Nullable String cidr) {
            this.cidr = Input.ofNullable(cidr);
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

        public Builder ipamPoolId(Input<String> ipamPoolId) {
            this.ipamPoolId = Objects.requireNonNull(ipamPoolId);
            return this;
        }

        public Builder ipamPoolId(String ipamPoolId) {
            this.ipamPoolId = Input.of(Objects.requireNonNull(ipamPoolId));
            return this;
        }

        public Builder netmaskLength(@Nullable Input<Integer> netmaskLength) {
            this.netmaskLength = netmaskLength;
            return this;
        }

        public Builder netmaskLength(@Nullable Integer netmaskLength) {
            this.netmaskLength = Input.ofNullable(netmaskLength);
            return this;
        }
        public IPAMAllocationArgs build() {
            return new IPAMAllocationArgs(cidr, description, ipamPoolId, netmaskLength);
        }
    }
}
