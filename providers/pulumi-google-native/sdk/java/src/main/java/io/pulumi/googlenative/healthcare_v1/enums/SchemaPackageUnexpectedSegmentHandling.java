// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Determines how unexpected segments (segments not matched to the schema) are handled.
     * 
     */
    @EnumType
    public enum SchemaPackageUnexpectedSegmentHandling {
        /**
         * Unspecified handling mode, equivalent to FAIL.
         * 
         */
        UnexpectedSegmentHandlingModeUnspecified("UNEXPECTED_SEGMENT_HANDLING_MODE_UNSPECIFIED"),
        /**
         * Unexpected segments fail to parse and return an error.
         * 
         */
        Fail("FAIL"),
        /**
         * Unexpected segments do not fail, but are omitted from the output.
         * 
         */
        Skip("SKIP"),
        /**
         * Unexpected segments do not fail, but are parsed in place and added to the current group. If a segment has a type definition, it is used, otherwise it is parsed as VARIES.
         * 
         */
        Parse("PARSE");

        private final String value;

        SchemaPackageUnexpectedSegmentHandling(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SchemaPackageUnexpectedSegmentHandling[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
