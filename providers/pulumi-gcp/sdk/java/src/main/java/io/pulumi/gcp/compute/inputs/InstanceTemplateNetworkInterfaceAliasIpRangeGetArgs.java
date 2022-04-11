// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceTemplateNetworkInterfaceAliasIpRangeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateNetworkInterfaceAliasIpRangeGetArgs Empty = new InstanceTemplateNetworkInterfaceAliasIpRangeGetArgs();

    /**
     * The IP CIDR range represented by this alias IP range. This IP CIDR range
     * must belong to the specified subnetwork and cannot contain IP addresses reserved by
     * system or used by other network interfaces. At the time of writing only a
     * netmask (e.g. /24) may be supplied, with a CIDR format resulting in an API
     * error.
     * 
     */
    @Import(name="ipCidrRange", required=true)
      private final Output<String> ipCidrRange;

    public Output<String> getIpCidrRange() {
        return this.ipCidrRange;
    }

    /**
     * The subnetwork secondary range name specifying
     * the secondary range from which to allocate the IP CIDR range for this alias IP
     * range. If left unspecified, the primary range of the subnetwork will be used.
     * 
     */
    @Import(name="subnetworkRangeName")
      private final @Nullable Output<String> subnetworkRangeName;

    public Output<String> getSubnetworkRangeName() {
        return this.subnetworkRangeName == null ? Codegen.empty() : this.subnetworkRangeName;
    }

    public InstanceTemplateNetworkInterfaceAliasIpRangeGetArgs(
        Output<String> ipCidrRange,
        @Nullable Output<String> subnetworkRangeName) {
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange, "expected parameter 'ipCidrRange' to be non-null");
        this.subnetworkRangeName = subnetworkRangeName;
    }

    private InstanceTemplateNetworkInterfaceAliasIpRangeGetArgs() {
        this.ipCidrRange = Codegen.empty();
        this.subnetworkRangeName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateNetworkInterfaceAliasIpRangeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> ipCidrRange;
        private @Nullable Output<String> subnetworkRangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateNetworkInterfaceAliasIpRangeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.subnetworkRangeName = defaults.subnetworkRangeName;
        }

        public Builder ipCidrRange(Output<String> ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }
        public Builder ipCidrRange(String ipCidrRange) {
            this.ipCidrRange = Output.of(Objects.requireNonNull(ipCidrRange));
            return this;
        }
        public Builder subnetworkRangeName(@Nullable Output<String> subnetworkRangeName) {
            this.subnetworkRangeName = subnetworkRangeName;
            return this;
        }
        public Builder subnetworkRangeName(@Nullable String subnetworkRangeName) {
            this.subnetworkRangeName = Codegen.ofNullable(subnetworkRangeName);
            return this;
        }        public InstanceTemplateNetworkInterfaceAliasIpRangeGetArgs build() {
            return new InstanceTemplateNetworkInterfaceAliasIpRangeGetArgs(ipCidrRange, subnetworkRangeName);
        }
    }
}
