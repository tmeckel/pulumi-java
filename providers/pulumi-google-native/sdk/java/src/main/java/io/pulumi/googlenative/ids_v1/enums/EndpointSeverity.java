// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ids_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. Lowest threat severity that this endpoint will alert on.
     * 
     */
    @EnumType
    public enum EndpointSeverity {
        /**
         * Not set.
         * 
         */
        SeverityUnspecified("SEVERITY_UNSPECIFIED"),
        /**
         * Informational alerts.
         * 
         */
        Informational("INFORMATIONAL"),
        /**
         * Low severity alerts.
         * 
         */
        Low("LOW"),
        /**
         * Medium severity alerts.
         * 
         */
        Medium("MEDIUM"),
        /**
         * High severity alerts.
         * 
         */
        High("HIGH"),
        /**
         * Critical severity alerts.
         * 
         */
        Critical("CRITICAL");

        private final String value;

        EndpointSeverity(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EndpointSeverity[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
