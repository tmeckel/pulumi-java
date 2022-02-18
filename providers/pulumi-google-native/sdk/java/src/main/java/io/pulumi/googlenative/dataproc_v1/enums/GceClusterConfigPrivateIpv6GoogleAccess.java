// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. The type of IPv6 access for a cluster.
     * 
     */
    @EnumType
    public enum GceClusterConfigPrivateIpv6GoogleAccess {
        /**
         * If unspecified, Compute Engine default behavior will apply, which is the same as INHERIT_FROM_SUBNETWORK.
         * 
         */
        PrivateIpv6GoogleAccessUnspecified("PRIVATE_IPV6_GOOGLE_ACCESS_UNSPECIFIED"),
        /**
         * Private access to and from Google Services configuration inherited from the subnetwork configuration. This is the default Compute Engine behavior.
         * 
         */
        InheritFromSubnetwork("INHERIT_FROM_SUBNETWORK"),
        /**
         * Enables outbound private IPv6 access to Google Services from the Dataproc cluster.
         * 
         */
        Outbound("OUTBOUND"),
        /**
         * Enables bidirectional private IPv6 access between Google Services and the Dataproc cluster.
         * 
         */
        Bidirectional("BIDIRECTIONAL");

        private final String value;

        GceClusterConfigPrivateIpv6GoogleAccess(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GceClusterConfigPrivateIpv6GoogleAccess[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
