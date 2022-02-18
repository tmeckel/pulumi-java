// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The power state of the VM at the moment list was taken.
     * 
     */
    @EnumType
    public enum VmwareVmDetailsPowerState {
        /**
         * Power state is not specified.
         * 
         */
        PowerStateUnspecified("POWER_STATE_UNSPECIFIED"),
        /**
         * The VM is turned ON.
         * 
         */
        On("ON"),
        /**
         * The VM is turned OFF.
         * 
         */
        Off("OFF"),
        /**
         * The VM is suspended. This is similar to hibernation or sleep mode.
         * 
         */
        Suspended("SUSPENDED");

        private final String value;

        VmwareVmDetailsPowerState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "VmwareVmDetailsPowerState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
