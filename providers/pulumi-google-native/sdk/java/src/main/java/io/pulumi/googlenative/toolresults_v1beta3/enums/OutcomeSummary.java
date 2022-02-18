// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The simplest way to interpret a result. Required
     * 
     */
    @EnumType
    public enum OutcomeSummary {
        /**
         * Do not use. For proto versioning only.
         * 
         */
        Unset("unset"),
        /**
         * The test matrix run was successful, for instance: - All the test cases passed. - Robo did not detect a crash of the application under test.
         * 
         */
        Success("success"),
        /**
         * A run failed, for instance: - One or more test case failed. - A test timed out. - The application under test crashed.
         * 
         */
        Failure("failure"),
        /**
         * Something unexpected happened. The run should still be considered unsuccessful but this is likely a transient problem and re-running the test might be successful.
         * 
         */
        Inconclusive("inconclusive"),
        /**
         * All tests were skipped, for instance: - All device configurations were incompatible.
         * 
         */
        Skipped("skipped"),
        /**
         * A group of steps that were run with the same configuration had both failure and success outcomes.
         * 
         */
        Flaky("flaky");

        private final String value;

        OutcomeSummary(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OutcomeSummary[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
