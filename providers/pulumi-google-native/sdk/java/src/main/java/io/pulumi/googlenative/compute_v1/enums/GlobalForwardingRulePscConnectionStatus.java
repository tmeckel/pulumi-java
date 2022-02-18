// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum GlobalForwardingRulePscConnectionStatus {
        /**
         * The connection has been accepted by the producer.
         * 
         */
        Accepted("ACCEPTED"),
        /**
         * The connection has been closed by the producer and will not serve traffic going forward.
         * 
         */
        Closed("CLOSED"),
        /**
         * The connection is pending acceptance by the producer.
         * 
         */
        Pending("PENDING"),
        /**
         * The connection has been rejected by the producer.
         * 
         */
        Rejected("REJECTED"),
        StatusUnspecified("STATUS_UNSPECIFIED");

        private final String value;

        GlobalForwardingRulePscConnectionStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GlobalForwardingRulePscConnectionStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
