// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Defines autoscaling behaviour.
     * 
     */
    @EnumType
    public enum ClusterAutoscalingAutoscalingProfile {
        /**
         * No change to autoscaling configuration.
         * 
         */
        ProfileUnspecified("PROFILE_UNSPECIFIED"),
        /**
         * Prioritize optimizing utilization of resources.
         * 
         */
        OptimizeUtilization("OPTIMIZE_UTILIZATION"),
        /**
         * Use default (balanced) autoscaling configuration.
         * 
         */
        Balanced("BALANCED");

        private final String value;

        ClusterAutoscalingAutoscalingProfile(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ClusterAutoscalingAutoscalingProfile[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
