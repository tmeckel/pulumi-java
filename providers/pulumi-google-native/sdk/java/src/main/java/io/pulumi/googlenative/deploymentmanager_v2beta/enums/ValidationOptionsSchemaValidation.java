// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Customize how deployment manager will validate the resource against schema errors.
     * 
     */
    @EnumType
    public enum ValidationOptionsSchemaValidation {
        Unknown("UNKNOWN"),
        /**
         * Ignore schema failures.
         * 
         */
        Ignore("IGNORE"),
        /**
         * Ignore schema failures but display them as warnings.
         * 
         */
        IgnoreWithWarnings("IGNORE_WITH_WARNINGS"),
        /**
         * Fail the resource if the schema is not valid, this is the default behavior.
         * 
         */
        Fail("FAIL");

        private final String value;

        ValidationOptionsSchemaValidation(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ValidationOptionsSchemaValidation[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
