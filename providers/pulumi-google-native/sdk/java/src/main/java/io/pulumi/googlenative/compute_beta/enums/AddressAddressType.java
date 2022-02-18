// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to EXTERNAL.
     * 
     */
    @EnumType
    public enum AddressAddressType {
        /**
         * A publicly visible external IP address.
         * 
         */
        External("EXTERNAL"),
        /**
         * A private network IP address, for use with an Instance or Internal Load Balancer forwarding rule.
         * 
         */
        Internal("INTERNAL"),
        UnspecifiedType("UNSPECIFIED_TYPE");

        private final String value;

        AddressAddressType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AddressAddressType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
