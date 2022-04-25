// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcIpamPoolCidrAllocationState extends com.pulumi.resources.ResourceArgs {

    public static final VpcIpamPoolCidrAllocationState Empty = new VpcIpamPoolCidrAllocationState();

    /**
     * The CIDR you want to assign to the pool.
     * 
     */
    @Import(name="cidr")
    private @Nullable Output<String> cidr;

    /**
     * @return The CIDR you want to assign to the pool.
     * 
     */
    public Optional<Output<String>> cidr() {
        return Optional.ofNullable(this.cidr);
    }

    /**
     * The description for the allocation.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the allocation.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Exclude a particular CIDR range from being returned by the pool.
     * 
     */
    @Import(name="disallowedCidrs")
    private @Nullable Output<List<String>> disallowedCidrs;

    /**
     * @return Exclude a particular CIDR range from being returned by the pool.
     * 
     */
    public Optional<Output<List<String>>> disallowedCidrs() {
        return Optional.ofNullable(this.disallowedCidrs);
    }

    @Import(name="ipamPoolAllocationId")
    private @Nullable Output<String> ipamPoolAllocationId;

    public Optional<Output<String>> ipamPoolAllocationId() {
        return Optional.ofNullable(this.ipamPoolAllocationId);
    }

    /**
     * The ID of the pool to which you want to assign a CIDR.
     * 
     */
    @Import(name="ipamPoolId")
    private @Nullable Output<String> ipamPoolId;

    /**
     * @return The ID of the pool to which you want to assign a CIDR.
     * 
     */
    public Optional<Output<String>> ipamPoolId() {
        return Optional.ofNullable(this.ipamPoolId);
    }

    /**
     * The netmask length of the CIDR you would like to allocate to the IPAM pool. Valid Values: `0-32`.
     * 
     */
    @Import(name="netmaskLength")
    private @Nullable Output<Integer> netmaskLength;

    /**
     * @return The netmask length of the CIDR you would like to allocate to the IPAM pool. Valid Values: `0-32`.
     * 
     */
    public Optional<Output<Integer>> netmaskLength() {
        return Optional.ofNullable(this.netmaskLength);
    }

    /**
     * The ID of the resource.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return The ID of the resource.
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * The owner of the resource.
     * 
     */
    @Import(name="resourceOwner")
    private @Nullable Output<String> resourceOwner;

    /**
     * @return The owner of the resource.
     * 
     */
    public Optional<Output<String>> resourceOwner() {
        return Optional.ofNullable(this.resourceOwner);
    }

    /**
     * The type of the resource.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return The type of the resource.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    private VpcIpamPoolCidrAllocationState() {}

    private VpcIpamPoolCidrAllocationState(VpcIpamPoolCidrAllocationState $) {
        this.cidr = $.cidr;
        this.description = $.description;
        this.disallowedCidrs = $.disallowedCidrs;
        this.ipamPoolAllocationId = $.ipamPoolAllocationId;
        this.ipamPoolId = $.ipamPoolId;
        this.netmaskLength = $.netmaskLength;
        this.resourceId = $.resourceId;
        this.resourceOwner = $.resourceOwner;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcIpamPoolCidrAllocationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcIpamPoolCidrAllocationState $;

        public Builder() {
            $ = new VpcIpamPoolCidrAllocationState();
        }

        public Builder(VpcIpamPoolCidrAllocationState defaults) {
            $ = new VpcIpamPoolCidrAllocationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidr The CIDR you want to assign to the pool.
         * 
         * @return builder
         * 
         */
        public Builder cidr(@Nullable Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr The CIDR you want to assign to the pool.
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        /**
         * @param description The description for the allocation.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the allocation.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disallowedCidrs Exclude a particular CIDR range from being returned by the pool.
         * 
         * @return builder
         * 
         */
        public Builder disallowedCidrs(@Nullable Output<List<String>> disallowedCidrs) {
            $.disallowedCidrs = disallowedCidrs;
            return this;
        }

        /**
         * @param disallowedCidrs Exclude a particular CIDR range from being returned by the pool.
         * 
         * @return builder
         * 
         */
        public Builder disallowedCidrs(List<String> disallowedCidrs) {
            return disallowedCidrs(Output.of(disallowedCidrs));
        }

        /**
         * @param disallowedCidrs Exclude a particular CIDR range from being returned by the pool.
         * 
         * @return builder
         * 
         */
        public Builder disallowedCidrs(String... disallowedCidrs) {
            return disallowedCidrs(List.of(disallowedCidrs));
        }

        public Builder ipamPoolAllocationId(@Nullable Output<String> ipamPoolAllocationId) {
            $.ipamPoolAllocationId = ipamPoolAllocationId;
            return this;
        }

        public Builder ipamPoolAllocationId(String ipamPoolAllocationId) {
            return ipamPoolAllocationId(Output.of(ipamPoolAllocationId));
        }

        /**
         * @param ipamPoolId The ID of the pool to which you want to assign a CIDR.
         * 
         * @return builder
         * 
         */
        public Builder ipamPoolId(@Nullable Output<String> ipamPoolId) {
            $.ipamPoolId = ipamPoolId;
            return this;
        }

        /**
         * @param ipamPoolId The ID of the pool to which you want to assign a CIDR.
         * 
         * @return builder
         * 
         */
        public Builder ipamPoolId(String ipamPoolId) {
            return ipamPoolId(Output.of(ipamPoolId));
        }

        /**
         * @param netmaskLength The netmask length of the CIDR you would like to allocate to the IPAM pool. Valid Values: `0-32`.
         * 
         * @return builder
         * 
         */
        public Builder netmaskLength(@Nullable Output<Integer> netmaskLength) {
            $.netmaskLength = netmaskLength;
            return this;
        }

        /**
         * @param netmaskLength The netmask length of the CIDR you would like to allocate to the IPAM pool. Valid Values: `0-32`.
         * 
         * @return builder
         * 
         */
        public Builder netmaskLength(Integer netmaskLength) {
            return netmaskLength(Output.of(netmaskLength));
        }

        /**
         * @param resourceId The ID of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The ID of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param resourceOwner The owner of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceOwner(@Nullable Output<String> resourceOwner) {
            $.resourceOwner = resourceOwner;
            return this;
        }

        /**
         * @param resourceOwner The owner of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceOwner(String resourceOwner) {
            return resourceOwner(Output.of(resourceOwner));
        }

        /**
         * @param resourceType The type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public VpcIpamPoolCidrAllocationState build() {
            return $;
        }
    }

}
