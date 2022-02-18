// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Accelerator model.
     * 
     */
    @EnumType
    public enum RuntimeAcceleratorConfigType {
        /**
         * Accelerator type is not specified.
         * 
         */
        AcceleratorTypeUnspecified("ACCELERATOR_TYPE_UNSPECIFIED"),
        /**
         * Accelerator type is Nvidia Tesla K80.
         * 
         */
        NvidiaTeslaK80("NVIDIA_TESLA_K80"),
        /**
         * Accelerator type is Nvidia Tesla P100.
         * 
         */
        NvidiaTeslaP100("NVIDIA_TESLA_P100"),
        /**
         * Accelerator type is Nvidia Tesla V100.
         * 
         */
        NvidiaTeslaV100("NVIDIA_TESLA_V100"),
        /**
         * Accelerator type is Nvidia Tesla P4.
         * 
         */
        NvidiaTeslaP4("NVIDIA_TESLA_P4"),
        /**
         * Accelerator type is Nvidia Tesla T4.
         * 
         */
        NvidiaTeslaT4("NVIDIA_TESLA_T4"),
        /**
         * Accelerator type is Nvidia Tesla A100.
         * 
         */
        NvidiaTeslaA100("NVIDIA_TESLA_A100"),
        /**
         * (Coming soon) Accelerator type is TPU V2.
         * 
         */
        TpuV2("TPU_V2"),
        /**
         * (Coming soon) Accelerator type is TPU V3.
         * 
         */
        TpuV3("TPU_V3"),
        /**
         * Accelerator type is NVIDIA Tesla T4 Virtual Workstations.
         * 
         */
        NvidiaTeslaT4Vws("NVIDIA_TESLA_T4_VWS"),
        /**
         * Accelerator type is NVIDIA Tesla P100 Virtual Workstations.
         * 
         */
        NvidiaTeslaP100Vws("NVIDIA_TESLA_P100_VWS"),
        /**
         * Accelerator type is NVIDIA Tesla P4 Virtual Workstations.
         * 
         */
        NvidiaTeslaP4Vws("NVIDIA_TESLA_P4_VWS");

        private final String value;

        RuntimeAcceleratorConfigType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RuntimeAcceleratorConfigType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
