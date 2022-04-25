// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.RouterNatSubnetworkToNatSourceIpRangesToNatItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the IP ranges that want to use NAT for a subnetwork.
 * 
 */
public final class RouterNatSubnetworkToNatArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouterNatSubnetworkToNatArgs Empty = new RouterNatSubnetworkToNatArgs();

    /**
     * URL for the subnetwork resource that will use NAT.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return URL for the subnetwork resource that will use NAT.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be populated only if &#34;LIST_OF_SECONDARY_IP_RANGES&#34; is one of the values in source_ip_ranges_to_nat.
     * 
     */
    @Import(name="secondaryIpRangeNames")
    private @Nullable Output<List<String>> secondaryIpRangeNames;

    /**
     * @return A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be populated only if &#34;LIST_OF_SECONDARY_IP_RANGES&#34; is one of the values in source_ip_ranges_to_nat.
     * 
     */
    public Optional<Output<List<String>>> secondaryIpRangeNames() {
        return Optional.ofNullable(this.secondaryIpRangeNames);
    }

    /**
     * Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is: [&#34;PRIMARY_IP_RANGE&#34;, &#34;LIST_OF_SECONDARY_IP_RANGES&#34;] Default: [ALL_IP_RANGES]
     * 
     */
    @Import(name="sourceIpRangesToNat")
    private @Nullable Output<List<RouterNatSubnetworkToNatSourceIpRangesToNatItem>> sourceIpRangesToNat;

    /**
     * @return Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is: [&#34;PRIMARY_IP_RANGE&#34;, &#34;LIST_OF_SECONDARY_IP_RANGES&#34;] Default: [ALL_IP_RANGES]
     * 
     */
    public Optional<Output<List<RouterNatSubnetworkToNatSourceIpRangesToNatItem>>> sourceIpRangesToNat() {
        return Optional.ofNullable(this.sourceIpRangesToNat);
    }

    private RouterNatSubnetworkToNatArgs() {}

    private RouterNatSubnetworkToNatArgs(RouterNatSubnetworkToNatArgs $) {
        this.name = $.name;
        this.secondaryIpRangeNames = $.secondaryIpRangeNames;
        this.sourceIpRangesToNat = $.sourceIpRangesToNat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouterNatSubnetworkToNatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouterNatSubnetworkToNatArgs $;

        public Builder() {
            $ = new RouterNatSubnetworkToNatArgs();
        }

        public Builder(RouterNatSubnetworkToNatArgs defaults) {
            $ = new RouterNatSubnetworkToNatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name URL for the subnetwork resource that will use NAT.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name URL for the subnetwork resource that will use NAT.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param secondaryIpRangeNames A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be populated only if &#34;LIST_OF_SECONDARY_IP_RANGES&#34; is one of the values in source_ip_ranges_to_nat.
         * 
         * @return builder
         * 
         */
        public Builder secondaryIpRangeNames(@Nullable Output<List<String>> secondaryIpRangeNames) {
            $.secondaryIpRangeNames = secondaryIpRangeNames;
            return this;
        }

        /**
         * @param secondaryIpRangeNames A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be populated only if &#34;LIST_OF_SECONDARY_IP_RANGES&#34; is one of the values in source_ip_ranges_to_nat.
         * 
         * @return builder
         * 
         */
        public Builder secondaryIpRangeNames(List<String> secondaryIpRangeNames) {
            return secondaryIpRangeNames(Output.of(secondaryIpRangeNames));
        }

        /**
         * @param secondaryIpRangeNames A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be populated only if &#34;LIST_OF_SECONDARY_IP_RANGES&#34; is one of the values in source_ip_ranges_to_nat.
         * 
         * @return builder
         * 
         */
        public Builder secondaryIpRangeNames(String... secondaryIpRangeNames) {
            return secondaryIpRangeNames(List.of(secondaryIpRangeNames));
        }

        /**
         * @param sourceIpRangesToNat Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is: [&#34;PRIMARY_IP_RANGE&#34;, &#34;LIST_OF_SECONDARY_IP_RANGES&#34;] Default: [ALL_IP_RANGES]
         * 
         * @return builder
         * 
         */
        public Builder sourceIpRangesToNat(@Nullable Output<List<RouterNatSubnetworkToNatSourceIpRangesToNatItem>> sourceIpRangesToNat) {
            $.sourceIpRangesToNat = sourceIpRangesToNat;
            return this;
        }

        /**
         * @param sourceIpRangesToNat Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is: [&#34;PRIMARY_IP_RANGE&#34;, &#34;LIST_OF_SECONDARY_IP_RANGES&#34;] Default: [ALL_IP_RANGES]
         * 
         * @return builder
         * 
         */
        public Builder sourceIpRangesToNat(List<RouterNatSubnetworkToNatSourceIpRangesToNatItem> sourceIpRangesToNat) {
            return sourceIpRangesToNat(Output.of(sourceIpRangesToNat));
        }

        /**
         * @param sourceIpRangesToNat Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is: [&#34;PRIMARY_IP_RANGE&#34;, &#34;LIST_OF_SECONDARY_IP_RANGES&#34;] Default: [ALL_IP_RANGES]
         * 
         * @return builder
         * 
         */
        public Builder sourceIpRangesToNat(RouterNatSubnetworkToNatSourceIpRangesToNatItem... sourceIpRangesToNat) {
            return sourceIpRangesToNat(List.of(sourceIpRangesToNat));
        }

        public RouterNatSubnetworkToNatArgs build() {
            return $;
        }
    }

}
