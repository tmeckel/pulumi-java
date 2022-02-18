// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * For LocalSSD disks on VM Instances in STOPPED or SUSPENDED state, this field is set to PRESERVED if the LocalSSD data has been saved to a persistent location by customer request. (see the discard_local_ssd option on Stop/Suspend). Read-only in the api.
     * 
     */
    @EnumType
    public enum AttachedDiskSavedState {
        /**
         * *[Default]* Disk state has not been preserved.
         * 
         */
        DiskSavedStateUnspecified("DISK_SAVED_STATE_UNSPECIFIED"),
        /**
         * Disk state has been preserved.
         * 
         */
        Preserved("PRESERVED");

        private final String value;

        AttachedDiskSavedState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AttachedDiskSavedState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
