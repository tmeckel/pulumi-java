// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The algorithm to use for autoscaling.
     * 
     */
    @EnumType
    public enum AutoscalingSettingsAlgorithm {
        /**
         * The algorithm is unknown, or unspecified.
         * 
         */
        AutoscalingAlgorithmUnknown("AUTOSCALING_ALGORITHM_UNKNOWN"),
        /**
         * Disable autoscaling.
         * 
         */
        AutoscalingAlgorithmNone("AUTOSCALING_ALGORITHM_NONE"),
        /**
         * Increase worker count over time to reduce job execution time.
         * 
         */
        AutoscalingAlgorithmBasic("AUTOSCALING_ALGORITHM_BASIC");

        private final String value;

        AutoscalingSettingsAlgorithm(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AutoscalingSettingsAlgorithm[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
