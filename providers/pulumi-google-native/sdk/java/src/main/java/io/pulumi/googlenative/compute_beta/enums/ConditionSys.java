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
    public enum ConditionSys {
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        Ip("IP"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        Name("NAME"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        NoAttr("NO_ATTR"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        Region("REGION"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        Service("SERVICE");

        private final String value;

        ConditionSys(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConditionSys[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
