// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Whether the resource is continuously analyzed.
     * 
     */
    @EnumType
    public enum DiscoveryOccurrenceContinuousAnalysis {
        /**
         * Unknown.
         * 
         */
        ContinuousAnalysisUnspecified("CONTINUOUS_ANALYSIS_UNSPECIFIED"),
        /**
         * The resource is continuously analyzed.
         * 
         */
        Active("ACTIVE"),
        /**
         * The resource is ignored for continuous analysis.
         * 
         */
        Inactive("INACTIVE");

        private final String value;

        DiscoveryOccurrenceContinuousAnalysis(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DiscoveryOccurrenceContinuousAnalysis[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
