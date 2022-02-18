// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The minimum version of SSL protocol that can be used by the clients to establish a connection with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
     * 
     */
    @EnumType
    public enum RegionSslPolicyMinTlsVersion {
        /**
         * TLS 1.0
         * 
         */
        Tls10("TLS_1_0"),
        /**
         * TLS 1.1
         * 
         */
        Tls11("TLS_1_1"),
        /**
         * TLS 1.2
         * 
         */
        Tls12("TLS_1_2");

        private final String value;

        RegionSslPolicyMinTlsVersion(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RegionSslPolicyMinTlsVersion[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
