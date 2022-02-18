// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Profile specifies the set of SSL features that can be used by the load balancer when negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
     * 
     */
    @EnumType
    public enum SslPolicyProfile {
        /**
         * Compatible profile. Allows the broadset set of clients, even those which support only out-of-date SSL features to negotiate with the load balancer.
         * 
         */
        Compatible("COMPATIBLE"),
        /**
         * Custom profile. Allow only the set of allowed SSL features specified in the customFeatures field.
         * 
         */
        Custom("CUSTOM"),
        /**
         * Modern profile. Supports a wide set of SSL features, allowing modern clients to negotiate SSL with the load balancer.
         * 
         */
        Modern("MODERN"),
        /**
         * Restricted profile. Supports a reduced set of SSL features, intended to meet stricter compliance requirements.
         * 
         */
        Restricted("RESTRICTED");

        private final String value;

        SslPolicyProfile(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SslPolicyProfile[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
