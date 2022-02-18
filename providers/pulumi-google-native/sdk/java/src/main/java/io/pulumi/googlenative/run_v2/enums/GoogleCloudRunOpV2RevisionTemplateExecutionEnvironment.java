// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The sandbox environment to host this Revision.
     * 
     */
    @EnumType
    public enum GoogleCloudRunOpV2RevisionTemplateExecutionEnvironment {
        /**
         * Unspecified
         * 
         */
        ExecutionEnvironmentUnspecified("EXECUTION_ENVIRONMENT_UNSPECIFIED"),
        /**
         * Uses the Google-default environment.
         * 
         */
        ExecutionEnvironmentDefault("EXECUTION_ENVIRONMENT_DEFAULT"),
        /**
         * Uses Second Generation environment.
         * 
         */
        ExecutionEnvironmentGen2("EXECUTION_ENVIRONMENT_GEN2");

        private final String value;

        GoogleCloudRunOpV2RevisionTemplateExecutionEnvironment(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudRunOpV2RevisionTemplateExecutionEnvironment[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
