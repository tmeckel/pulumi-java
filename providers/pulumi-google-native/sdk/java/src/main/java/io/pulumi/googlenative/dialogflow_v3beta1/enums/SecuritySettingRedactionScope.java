// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Defines the data for which Dialogflow applies redaction. Dialogflow does not redact data that it does not have access to – for example, Cloud logging.
     * 
     */
    @EnumType
    public enum SecuritySettingRedactionScope {
        /**
         * Don't redact any kind of data.
         * 
         */
        RedactionScopeUnspecified("REDACTION_SCOPE_UNSPECIFIED"),
        /**
         * On data to be written to disk or similar devices that are capable of holding data even if power is disconnected. This includes data that are temporarily saved on disk.
         * 
         */
        RedactDiskStorage("REDACT_DISK_STORAGE");

        private final String value;

        SecuritySettingRedactionScope(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SecuritySettingRedactionScope[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
