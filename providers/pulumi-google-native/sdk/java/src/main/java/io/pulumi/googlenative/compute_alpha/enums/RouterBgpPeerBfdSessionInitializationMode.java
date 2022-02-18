// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is disabled for this BGP peer. The default is PASSIVE.
     * 
     */
    @EnumType
    public enum RouterBgpPeerBfdSessionInitializationMode {
        Active("ACTIVE"),
        Disabled("DISABLED"),
        Passive("PASSIVE");

        private final String value;

        RouterBgpPeerBfdSessionInitializationMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RouterBgpPeerBfdSessionInitializationMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
