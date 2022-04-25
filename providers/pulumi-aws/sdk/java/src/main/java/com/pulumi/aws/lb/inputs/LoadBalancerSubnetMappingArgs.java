// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerSubnetMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerSubnetMappingArgs Empty = new LoadBalancerSubnetMappingArgs();

    /**
     * The allocation ID of the Elastic IP address.
     * 
     */
    @Import(name="allocationId")
    private @Nullable Output<String> allocationId;

    /**
     * @return The allocation ID of the Elastic IP address.
     * 
     */
    public Optional<Output<String>> allocationId() {
        return Optional.ofNullable(this.allocationId);
    }

    /**
     * An ipv6 address within the subnet to assign to the internet-facing load balancer.
     * 
     */
    @Import(name="ipv6Address")
    private @Nullable Output<String> ipv6Address;

    /**
     * @return An ipv6 address within the subnet to assign to the internet-facing load balancer.
     * 
     */
    public Optional<Output<String>> ipv6Address() {
        return Optional.ofNullable(this.ipv6Address);
    }

    @Import(name="outpostId")
    private @Nullable Output<String> outpostId;

    public Optional<Output<String>> outpostId() {
        return Optional.ofNullable(this.outpostId);
    }

    /**
     * A private ipv4 address within the subnet to assign to the internal-facing load balancer.
     * 
     */
    @Import(name="privateIpv4Address")
    private @Nullable Output<String> privateIpv4Address;

    /**
     * @return A private ipv4 address within the subnet to assign to the internal-facing load balancer.
     * 
     */
    public Optional<Output<String>> privateIpv4Address() {
        return Optional.ofNullable(this.privateIpv4Address);
    }

    /**
     * The id of the subnet of which to attach to the load balancer. You can specify only one subnet per Availability Zone.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return The id of the subnet of which to attach to the load balancer. You can specify only one subnet per Availability Zone.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    private LoadBalancerSubnetMappingArgs() {}

    private LoadBalancerSubnetMappingArgs(LoadBalancerSubnetMappingArgs $) {
        this.allocationId = $.allocationId;
        this.ipv6Address = $.ipv6Address;
        this.outpostId = $.outpostId;
        this.privateIpv4Address = $.privateIpv4Address;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerSubnetMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerSubnetMappingArgs $;

        public Builder() {
            $ = new LoadBalancerSubnetMappingArgs();
        }

        public Builder(LoadBalancerSubnetMappingArgs defaults) {
            $ = new LoadBalancerSubnetMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocationId The allocation ID of the Elastic IP address.
         * 
         * @return builder
         * 
         */
        public Builder allocationId(@Nullable Output<String> allocationId) {
            $.allocationId = allocationId;
            return this;
        }

        /**
         * @param allocationId The allocation ID of the Elastic IP address.
         * 
         * @return builder
         * 
         */
        public Builder allocationId(String allocationId) {
            return allocationId(Output.of(allocationId));
        }

        /**
         * @param ipv6Address An ipv6 address within the subnet to assign to the internet-facing load balancer.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Address(@Nullable Output<String> ipv6Address) {
            $.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * @param ipv6Address An ipv6 address within the subnet to assign to the internet-facing load balancer.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Address(String ipv6Address) {
            return ipv6Address(Output.of(ipv6Address));
        }

        public Builder outpostId(@Nullable Output<String> outpostId) {
            $.outpostId = outpostId;
            return this;
        }

        public Builder outpostId(String outpostId) {
            return outpostId(Output.of(outpostId));
        }

        /**
         * @param privateIpv4Address A private ipv4 address within the subnet to assign to the internal-facing load balancer.
         * 
         * @return builder
         * 
         */
        public Builder privateIpv4Address(@Nullable Output<String> privateIpv4Address) {
            $.privateIpv4Address = privateIpv4Address;
            return this;
        }

        /**
         * @param privateIpv4Address A private ipv4 address within the subnet to assign to the internal-facing load balancer.
         * 
         * @return builder
         * 
         */
        public Builder privateIpv4Address(String privateIpv4Address) {
            return privateIpv4Address(Output.of(privateIpv4Address));
        }

        /**
         * @param subnetId The id of the subnet of which to attach to the load balancer. You can specify only one subnet per Availability Zone.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The id of the subnet of which to attach to the load balancer. You can specify only one subnet per Availability Zone.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public LoadBalancerSubnetMappingArgs build() {
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            return $;
        }
    }

}
