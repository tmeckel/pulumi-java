// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1beta1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Either READ_ONLY, for allowing only read requests on the exported directory, or READ_WRITE, for allowing both read and write requests. The default is READ_WRITE.
     * 
     */
    @EnumType
    public enum NfsExportOptionsAccessMode {
        /**
         * AccessMode not set.
         * 
         */
        AccessModeUnspecified("ACCESS_MODE_UNSPECIFIED"),
        /**
         * The client can only read the file share.
         * 
         */
        ReadOnly("READ_ONLY"),
        /**
         * The client can read and write the file share (default).
         * 
         */
        ReadWrite("READ_WRITE");

        private final String value;

        NfsExportOptionsAccessMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NfsExportOptionsAccessMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
