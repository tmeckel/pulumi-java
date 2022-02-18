// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The status of discovery for the resource.
     * 
     */
    @EnumType
    public enum DiscoveredAnalysisStatus {
        /**
         * Unknown
         * 
         */
        AnalysisStatusUnspecified("ANALYSIS_STATUS_UNSPECIFIED"),
        /**
         * Resource is known but no action has been taken yet.
         * 
         */
        Pending("PENDING"),
        /**
         * Resource is being analyzed.
         * 
         */
        Scanning("SCANNING"),
        /**
         * Analysis has finished successfully.
         * 
         */
        FinishedSuccess("FINISHED_SUCCESS"),
        /**
         * Analysis has finished unsuccessfully, the analysis itself is in a bad state.
         * 
         */
        FinishedFailed("FINISHED_FAILED"),
        /**
         * The resource is known not to be supported.
         * 
         */
        FinishedUnsupported("FINISHED_UNSUPPORTED");

        private final String value;

        DiscoveredAnalysisStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DiscoveredAnalysisStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
