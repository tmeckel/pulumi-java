// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Frequency of the specified amount. Default is CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED.
     * 
     */
    @EnumType
    public enum CompensationEntryUnit {
        /**
         * Default value.
         * 
         */
        CompensationUnitUnspecified("COMPENSATION_UNIT_UNSPECIFIED"),
        /**
         * Hourly.
         * 
         */
        Hourly("HOURLY"),
        /**
         * Daily.
         * 
         */
        Daily("DAILY"),
        /**
         * Weekly
         * 
         */
        Weekly("WEEKLY"),
        /**
         * Monthly.
         * 
         */
        Monthly("MONTHLY"),
        /**
         * Yearly.
         * 
         */
        Yearly("YEARLY"),
        /**
         * One time.
         * 
         */
        OneTime("ONE_TIME"),
        /**
         * Other compensation units.
         * 
         */
        OtherCompensationUnit("OTHER_COMPENSATION_UNIT");

        private final String value;

        CompensationEntryUnit(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CompensationEntryUnit[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
