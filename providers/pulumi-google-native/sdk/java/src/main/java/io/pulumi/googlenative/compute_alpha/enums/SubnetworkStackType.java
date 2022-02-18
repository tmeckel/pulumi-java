// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The stack type for this subnet to identify whether the IPv6 feature is enabled or not. If not specified IPV4_ONLY will be used. This field can be both set at resource creation time and updated using patch.
     * 
     */
    @EnumType
    public enum SubnetworkStackType {
        /**
         * New VMs in this subnet can have both IPv4 and IPv6 addresses.
         * 
         */
        Ipv4Ipv6("IPV4_IPV6"),
        /**
         * New VMs in this subnet will only be assigned IPv4 addresses.
         * 
         */
        Ipv4Only("IPV4_ONLY"),
        UnspecifiedStackType("UNSPECIFIED_STACK_TYPE");

        private final String value;

        SubnetworkStackType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SubnetworkStackType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
