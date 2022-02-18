// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Input only. The type of the data disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
     * 
     */
    @EnumType
    public enum InstanceDataDiskType {
        /**
         * Disk type not set.
         * 
         */
        DiskTypeUnspecified("DISK_TYPE_UNSPECIFIED"),
        /**
         * Standard persistent disk type.
         * 
         */
        PdStandard("PD_STANDARD"),
        /**
         * SSD persistent disk type.
         * 
         */
        PdSsd("PD_SSD"),
        /**
         * Balanced persistent disk type.
         * 
         */
        PdBalanced("PD_BALANCED");

        private final String value;

        InstanceDataDiskType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceDataDiskType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
