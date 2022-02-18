// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY: Uses only Nat IP addresses provided by customers. When there are not enough specified Nat IPs, the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform; customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be empty.
     * 
     */
    @EnumType
    public enum RouterNatNatIpAllocateOption {
        /**
         * Nat IPs are allocated by GCP; customers can not specify any Nat IPs.
         * 
         */
        AutoOnly("AUTO_ONLY"),
        /**
         * Only use Nat IPs provided by customers. When specified Nat IPs are not enough then the Nat service fails for new VMs.
         * 
         */
        ManualOnly("MANUAL_ONLY");

        private final String value;

        RouterNatNatIpAllocateOption(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RouterNatNatIpAllocateOption[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
