// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkAclRuleState extends io.pulumi.resources.ResourceArgs {

    public static final NetworkAclRuleState Empty = new NetworkAclRuleState();

    /**
     * The network range to allow or deny, in CIDR notation (for example 172.16.0.0/24 ).
     * 
     */
    @Import(name="cidrBlock")
      private final @Nullable Output<String> cidrBlock;

    public Output<String> getCidrBlock() {
        return this.cidrBlock == null ? Codegen.empty() : this.cidrBlock;
    }

    /**
     * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet). Default `false`.
     * 
     */
    @Import(name="egress")
      private final @Nullable Output<Boolean> egress;

    public Output<Boolean> getEgress() {
        return this.egress == null ? Codegen.empty() : this.egress;
    }

    /**
     * The from port to match.
     * 
     */
    @Import(name="fromPort")
      private final @Nullable Output<Integer> fromPort;

    public Output<Integer> getFromPort() {
        return this.fromPort == null ? Codegen.empty() : this.fromPort;
    }

    /**
     * ICMP protocol: The ICMP code. Required if specifying ICMP for the protocolE.g., -1
     * 
     */
    @Import(name="icmpCode")
      private final @Nullable Output<String> icmpCode;

    public Output<String> getIcmpCode() {
        return this.icmpCode == null ? Codegen.empty() : this.icmpCode;
    }

    /**
     * ICMP protocol: The ICMP type. Required if specifying ICMP for the protocolE.g., -1
     * 
     */
    @Import(name="icmpType")
      private final @Nullable Output<String> icmpType;

    public Output<String> getIcmpType() {
        return this.icmpType == null ? Codegen.empty() : this.icmpType;
    }

    /**
     * The IPv6 CIDR block to allow or deny.
     * 
     */
    @Import(name="ipv6CidrBlock")
      private final @Nullable Output<String> ipv6CidrBlock;

    public Output<String> getIpv6CidrBlock() {
        return this.ipv6CidrBlock == null ? Codegen.empty() : this.ipv6CidrBlock;
    }

    /**
     * The ID of the network ACL.
     * 
     */
    @Import(name="networkAclId")
      private final @Nullable Output<String> networkAclId;

    public Output<String> getNetworkAclId() {
        return this.networkAclId == null ? Codegen.empty() : this.networkAclId;
    }

    /**
     * The protocol. A value of -1 means all protocols.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol == null ? Codegen.empty() : this.protocol;
    }

    /**
     * Indicates whether to allow or deny the traffic that matches the rule. Accepted values: `allow` | `deny`
     * 
     */
    @Import(name="ruleAction")
      private final @Nullable Output<String> ruleAction;

    public Output<String> getRuleAction() {
        return this.ruleAction == null ? Codegen.empty() : this.ruleAction;
    }

    /**
     * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number.
     * 
     */
    @Import(name="ruleNumber")
      private final @Nullable Output<Integer> ruleNumber;

    public Output<Integer> getRuleNumber() {
        return this.ruleNumber == null ? Codegen.empty() : this.ruleNumber;
    }

    /**
     * The to port to match.
     * 
     */
    @Import(name="toPort")
      private final @Nullable Output<Integer> toPort;

    public Output<Integer> getToPort() {
        return this.toPort == null ? Codegen.empty() : this.toPort;
    }

    public NetworkAclRuleState(
        @Nullable Output<String> cidrBlock,
        @Nullable Output<Boolean> egress,
        @Nullable Output<Integer> fromPort,
        @Nullable Output<String> icmpCode,
        @Nullable Output<String> icmpType,
        @Nullable Output<String> ipv6CidrBlock,
        @Nullable Output<String> networkAclId,
        @Nullable Output<String> protocol,
        @Nullable Output<String> ruleAction,
        @Nullable Output<Integer> ruleNumber,
        @Nullable Output<Integer> toPort) {
        this.cidrBlock = cidrBlock;
        this.egress = egress;
        this.fromPort = fromPort;
        this.icmpCode = icmpCode;
        this.icmpType = icmpType;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.networkAclId = networkAclId;
        this.protocol = protocol;
        this.ruleAction = ruleAction;
        this.ruleNumber = ruleNumber;
        this.toPort = toPort;
    }

    private NetworkAclRuleState() {
        this.cidrBlock = Codegen.empty();
        this.egress = Codegen.empty();
        this.fromPort = Codegen.empty();
        this.icmpCode = Codegen.empty();
        this.icmpType = Codegen.empty();
        this.ipv6CidrBlock = Codegen.empty();
        this.networkAclId = Codegen.empty();
        this.protocol = Codegen.empty();
        this.ruleAction = Codegen.empty();
        this.ruleNumber = Codegen.empty();
        this.toPort = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkAclRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cidrBlock;
        private @Nullable Output<Boolean> egress;
        private @Nullable Output<Integer> fromPort;
        private @Nullable Output<String> icmpCode;
        private @Nullable Output<String> icmpType;
        private @Nullable Output<String> ipv6CidrBlock;
        private @Nullable Output<String> networkAclId;
        private @Nullable Output<String> protocol;
        private @Nullable Output<String> ruleAction;
        private @Nullable Output<Integer> ruleNumber;
        private @Nullable Output<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkAclRuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.egress = defaults.egress;
    	      this.fromPort = defaults.fromPort;
    	      this.icmpCode = defaults.icmpCode;
    	      this.icmpType = defaults.icmpType;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.networkAclId = defaults.networkAclId;
    	      this.protocol = defaults.protocol;
    	      this.ruleAction = defaults.ruleAction;
    	      this.ruleNumber = defaults.ruleNumber;
    	      this.toPort = defaults.toPort;
        }

        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Codegen.ofNullable(cidrBlock);
            return this;
        }
        public Builder egress(@Nullable Output<Boolean> egress) {
            this.egress = egress;
            return this;
        }
        public Builder egress(@Nullable Boolean egress) {
            this.egress = Codegen.ofNullable(egress);
            return this;
        }
        public Builder fromPort(@Nullable Output<Integer> fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Builder fromPort(@Nullable Integer fromPort) {
            this.fromPort = Codegen.ofNullable(fromPort);
            return this;
        }
        public Builder icmpCode(@Nullable Output<String> icmpCode) {
            this.icmpCode = icmpCode;
            return this;
        }
        public Builder icmpCode(@Nullable String icmpCode) {
            this.icmpCode = Codegen.ofNullable(icmpCode);
            return this;
        }
        public Builder icmpType(@Nullable Output<String> icmpType) {
            this.icmpType = icmpType;
            return this;
        }
        public Builder icmpType(@Nullable String icmpType) {
            this.icmpType = Codegen.ofNullable(icmpType);
            return this;
        }
        public Builder ipv6CidrBlock(@Nullable Output<String> ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public Builder ipv6CidrBlock(@Nullable String ipv6CidrBlock) {
            this.ipv6CidrBlock = Codegen.ofNullable(ipv6CidrBlock);
            return this;
        }
        public Builder networkAclId(@Nullable Output<String> networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }
        public Builder networkAclId(@Nullable String networkAclId) {
            this.networkAclId = Codegen.ofNullable(networkAclId);
            return this;
        }
        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = Codegen.ofNullable(protocol);
            return this;
        }
        public Builder ruleAction(@Nullable Output<String> ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public Builder ruleAction(@Nullable String ruleAction) {
            this.ruleAction = Codegen.ofNullable(ruleAction);
            return this;
        }
        public Builder ruleNumber(@Nullable Output<Integer> ruleNumber) {
            this.ruleNumber = ruleNumber;
            return this;
        }
        public Builder ruleNumber(@Nullable Integer ruleNumber) {
            this.ruleNumber = Codegen.ofNullable(ruleNumber);
            return this;
        }
        public Builder toPort(@Nullable Output<Integer> toPort) {
            this.toPort = toPort;
            return this;
        }
        public Builder toPort(@Nullable Integer toPort) {
            this.toPort = Codegen.ofNullable(toPort);
            return this;
        }        public NetworkAclRuleState build() {
            return new NetworkAclRuleState(cidrBlock, egress, fromPort, icmpCode, icmpType, ipv6CidrBlock, networkAclId, protocol, ruleAction, ruleNumber, toPort);
        }
    }
}
