// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specify the Nat option, which can take one of the following values: - ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. - ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section in any Router for this network in this region.
     * 
     */
    @EnumType
    public enum RouterNatSourceSubnetworkIpRangesToNat {
        /**
         * All the IP ranges in every Subnetwork are allowed to Nat.
         * 
         */
        AllSubnetworksAllIpRanges("ALL_SUBNETWORKS_ALL_IP_RANGES"),
        /**
         * All the primary IP ranges in every Subnetwork are allowed to Nat.
         * 
         */
        AllSubnetworksAllPrimaryIpRanges("ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES"),
        /**
         * A list of Subnetworks are allowed to Nat (specified in the field subnetwork below)
         * 
         */
        ListOfSubnetworks("LIST_OF_SUBNETWORKS");

        private final String value;

        RouterNatSourceSubnetworkIpRangesToNat(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RouterNatSourceSubnetworkIpRangesToNat[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
