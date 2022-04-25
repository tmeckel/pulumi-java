// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityGroupIngressArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityGroupIngressArgs Empty = new SecurityGroupIngressArgs();

    /**
     * List of CIDR blocks.
     * 
     */
    @Import(name="cidrBlocks")
    private @Nullable Output<List<String>> cidrBlocks;

    /**
     * @return List of CIDR blocks.
     * 
     */
    public Optional<Output<List<String>>> cidrBlocks() {
        return Optional.ofNullable(this.cidrBlocks);
    }

    /**
     * Description of this egress rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of this egress rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Start port (or ICMP type number if protocol is `icmp`)
     * 
     */
    @Import(name="fromPort", required=true)
    private Output<Integer> fromPort;

    /**
     * @return Start port (or ICMP type number if protocol is `icmp`)
     * 
     */
    public Output<Integer> fromPort() {
        return this.fromPort;
    }

    /**
     * List of IPv6 CIDR blocks.
     * 
     */
    @Import(name="ipv6CidrBlocks")
    private @Nullable Output<List<String>> ipv6CidrBlocks;

    /**
     * @return List of IPv6 CIDR blocks.
     * 
     */
    public Optional<Output<List<String>>> ipv6CidrBlocks() {
        return Optional.ofNullable(this.ipv6CidrBlocks);
    }

    /**
     * List of Prefix List IDs.
     * 
     */
    @Import(name="prefixListIds")
    private @Nullable Output<List<String>> prefixListIds;

    /**
     * @return List of Prefix List IDs.
     * 
     */
    public Optional<Output<List<String>>> prefixListIds() {
        return Optional.ofNullable(this.prefixListIds);
    }

    /**
     * Protocol. If you select a protocol of `-1` (semantically equivalent to `all`, which is not a valid value here), you must specify a `from_port` and `to_port` equal to 0.  The supported values are defined in the `IpProtocol` argument in the [IpPermission](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IpPermission.html) API reference. This argument is normalized to a lowercase value.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return Protocol. If you select a protocol of `-1` (semantically equivalent to `all`, which is not a valid value here), you must specify a `from_port` and `to_port` equal to 0.  The supported values are defined in the `IpProtocol` argument in the [IpPermission](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IpPermission.html) API reference. This argument is normalized to a lowercase value.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * List of security group Group Names if using EC2-Classic, or Group IDs if using a VPC.
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    /**
     * @return List of security group Group Names if using EC2-Classic, or Group IDs if using a VPC.
     * 
     */
    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * Whether the security group itself will be added as a source to this egress rule.
     * 
     */
    @Import(name="self")
    private @Nullable Output<Boolean> self;

    /**
     * @return Whether the security group itself will be added as a source to this egress rule.
     * 
     */
    public Optional<Output<Boolean>> self() {
        return Optional.ofNullable(this.self);
    }

    /**
     * End range port (or ICMP code if protocol is `icmp`).
     * 
     */
    @Import(name="toPort", required=true)
    private Output<Integer> toPort;

    /**
     * @return End range port (or ICMP code if protocol is `icmp`).
     * 
     */
    public Output<Integer> toPort() {
        return this.toPort;
    }

    private SecurityGroupIngressArgs() {}

    private SecurityGroupIngressArgs(SecurityGroupIngressArgs $) {
        this.cidrBlocks = $.cidrBlocks;
        this.description = $.description;
        this.fromPort = $.fromPort;
        this.ipv6CidrBlocks = $.ipv6CidrBlocks;
        this.prefixListIds = $.prefixListIds;
        this.protocol = $.protocol;
        this.securityGroups = $.securityGroups;
        this.self = $.self;
        this.toPort = $.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityGroupIngressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityGroupIngressArgs $;

        public Builder() {
            $ = new SecurityGroupIngressArgs();
        }

        public Builder(SecurityGroupIngressArgs defaults) {
            $ = new SecurityGroupIngressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidrBlocks List of CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(@Nullable Output<List<String>> cidrBlocks) {
            $.cidrBlocks = cidrBlocks;
            return this;
        }

        /**
         * @param cidrBlocks List of CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(List<String> cidrBlocks) {
            return cidrBlocks(Output.of(cidrBlocks));
        }

        /**
         * @param cidrBlocks List of CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(String... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }

        /**
         * @param description Description of this egress rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of this egress rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fromPort Start port (or ICMP type number if protocol is `icmp`)
         * 
         * @return builder
         * 
         */
        public Builder fromPort(Output<Integer> fromPort) {
            $.fromPort = fromPort;
            return this;
        }

        /**
         * @param fromPort Start port (or ICMP type number if protocol is `icmp`)
         * 
         * @return builder
         * 
         */
        public Builder fromPort(Integer fromPort) {
            return fromPort(Output.of(fromPort));
        }

        /**
         * @param ipv6CidrBlocks List of IPv6 CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder ipv6CidrBlocks(@Nullable Output<List<String>> ipv6CidrBlocks) {
            $.ipv6CidrBlocks = ipv6CidrBlocks;
            return this;
        }

        /**
         * @param ipv6CidrBlocks List of IPv6 CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder ipv6CidrBlocks(List<String> ipv6CidrBlocks) {
            return ipv6CidrBlocks(Output.of(ipv6CidrBlocks));
        }

        /**
         * @param ipv6CidrBlocks List of IPv6 CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder ipv6CidrBlocks(String... ipv6CidrBlocks) {
            return ipv6CidrBlocks(List.of(ipv6CidrBlocks));
        }

        /**
         * @param prefixListIds List of Prefix List IDs.
         * 
         * @return builder
         * 
         */
        public Builder prefixListIds(@Nullable Output<List<String>> prefixListIds) {
            $.prefixListIds = prefixListIds;
            return this;
        }

        /**
         * @param prefixListIds List of Prefix List IDs.
         * 
         * @return builder
         * 
         */
        public Builder prefixListIds(List<String> prefixListIds) {
            return prefixListIds(Output.of(prefixListIds));
        }

        /**
         * @param prefixListIds List of Prefix List IDs.
         * 
         * @return builder
         * 
         */
        public Builder prefixListIds(String... prefixListIds) {
            return prefixListIds(List.of(prefixListIds));
        }

        /**
         * @param protocol Protocol. If you select a protocol of `-1` (semantically equivalent to `all`, which is not a valid value here), you must specify a `from_port` and `to_port` equal to 0.  The supported values are defined in the `IpProtocol` argument in the [IpPermission](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IpPermission.html) API reference. This argument is normalized to a lowercase value.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Protocol. If you select a protocol of `-1` (semantically equivalent to `all`, which is not a valid value here), you must specify a `from_port` and `to_port` equal to 0.  The supported values are defined in the `IpProtocol` argument in the [IpPermission](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IpPermission.html) API reference. This argument is normalized to a lowercase value.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param securityGroups List of security group Group Names if using EC2-Classic, or Group IDs if using a VPC.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups List of security group Group Names if using EC2-Classic, or Group IDs if using a VPC.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups List of security group Group Names if using EC2-Classic, or Group IDs if using a VPC.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param self Whether the security group itself will be added as a source to this egress rule.
         * 
         * @return builder
         * 
         */
        public Builder self(@Nullable Output<Boolean> self) {
            $.self = self;
            return this;
        }

        /**
         * @param self Whether the security group itself will be added as a source to this egress rule.
         * 
         * @return builder
         * 
         */
        public Builder self(Boolean self) {
            return self(Output.of(self));
        }

        /**
         * @param toPort End range port (or ICMP code if protocol is `icmp`).
         * 
         * @return builder
         * 
         */
        public Builder toPort(Output<Integer> toPort) {
            $.toPort = toPort;
            return this;
        }

        /**
         * @param toPort End range port (or ICMP code if protocol is `icmp`).
         * 
         * @return builder
         * 
         */
        public Builder toPort(Integer toPort) {
            return toPort(Output.of(toPort));
        }

        public SecurityGroupIngressArgs build() {
            $.fromPort = Objects.requireNonNull($.fromPort, "expected parameter 'fromPort' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            $.toPort = Objects.requireNonNull($.toPort, "expected parameter 'toPort' to be non-null");
            return $;
        }
    }

}
