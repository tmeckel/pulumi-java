// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1alpha.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The result state of the ScanRun. This field is only available after the execution state reaches "FINISHED".
     * 
     */
    @EnumType
    public enum ScanRunResultState {
        /**
         * Default value. This value is returned when the ScanRun is not yet finished.
         * 
         */
        ResultStateUnspecified("RESULT_STATE_UNSPECIFIED"),
        /**
         * The scan finished without errors.
         * 
         */
        Success("SUCCESS"),
        /**
         * The scan finished with errors.
         * 
         */
        Error("ERROR"),
        /**
         * The scan was terminated by user.
         * 
         */
        Killed("KILLED");

        private final String value;

        ScanRunResultState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ScanRunResultState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
