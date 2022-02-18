// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * **Beta Feature** The logging verbosity for device activity. If unspecified, DeviceRegistry.log_level will be used.
     * 
     */
    @EnumType
    public enum DeviceLogLevel {
        /**
         * No logging specified. If not specified, logging will be disabled.
         * 
         */
        LogLevelUnspecified("LOG_LEVEL_UNSPECIFIED"),
        /**
         * Disables logging.
         * 
         */
        None("NONE"),
        /**
         * Error events will be logged.
         * 
         */
        Error("ERROR"),
        /**
         * Informational events will be logged, such as connections and disconnections.
         * 
         */
        Info("INFO"),
        /**
         * All events will be logged.
         * 
         */
        Debug("DEBUG");

        private final String value;

        DeviceLogLevel(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DeviceLogLevel[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
