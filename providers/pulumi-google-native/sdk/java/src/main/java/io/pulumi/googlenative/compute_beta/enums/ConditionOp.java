// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @EnumType
    public enum ConditionOp {
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        Discharged("DISCHARGED"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        Equals("EQUALS"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        In("IN"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        NotEquals("NOT_EQUALS"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        NotIn("NOT_IN"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        NoOp("NO_OP");

        private final String value;

        ConditionOp(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConditionOp[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
