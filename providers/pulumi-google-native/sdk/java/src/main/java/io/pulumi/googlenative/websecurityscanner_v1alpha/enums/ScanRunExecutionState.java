// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1alpha.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The execution state of the ScanRun.
     * 
     */
    @EnumType
    public enum ScanRunExecutionState {
        /**
         * Represents an invalid state caused by internal server error. This value should never be returned.
         * 
         */
        ExecutionStateUnspecified("EXECUTION_STATE_UNSPECIFIED"),
        /**
         * The scan is waiting in the queue.
         * 
         */
        Queued("QUEUED"),
        /**
         * The scan is in progress.
         * 
         */
        Scanning("SCANNING"),
        /**
         * The scan is either finished or stopped by user.
         * 
         */
        Finished("FINISHED");

        private final String value;

        ScanRunExecutionState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ScanRunExecutionState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
