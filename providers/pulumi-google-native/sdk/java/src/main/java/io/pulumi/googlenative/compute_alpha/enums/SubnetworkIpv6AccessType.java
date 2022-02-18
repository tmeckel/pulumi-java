// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet cannot enable direct path.
     * 
     */
    @EnumType
    public enum SubnetworkIpv6AccessType {
        /**
         * VMs on this subnet will be assigned IPv6 addresses that are accesible via the Internet, as well as the VPC network.
         * 
         */
        External("EXTERNAL"),
        /**
         * VMs on this subnet will be assigned IPv6 addresses that are only accessible over the VPC network.
         * 
         */
        Internal("INTERNAL"),
        /**
         * IPv6 access type not set. Means this subnet hasn't been turned on IPv6 yet.
         * 
         */
        UnspecifiedIpv6AccessType("UNSPECIFIED_IPV6_ACCESS_TYPE");

        private final String value;

        SubnetworkIpv6AccessType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SubnetworkIpv6AccessType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
