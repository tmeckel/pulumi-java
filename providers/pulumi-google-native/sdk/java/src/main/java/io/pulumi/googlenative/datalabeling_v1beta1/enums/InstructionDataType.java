// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The data type of this instruction.
     * 
     */
    @EnumType
    public enum InstructionDataType {
        /**
         * Data type is unspecified.
         * 
         */
        DataTypeUnspecified("DATA_TYPE_UNSPECIFIED"),
        /**
         * Allowed for continuous evaluation.
         * 
         */
        Image("IMAGE"),
        /**
         * Video data type.
         * 
         */
        Video("VIDEO"),
        /**
         * Allowed for continuous evaluation.
         * 
         */
        Text("TEXT"),
        /**
         * Allowed for continuous evaluation.
         * 
         */
        GeneralData("GENERAL_DATA");

        private final String value;

        InstructionDataType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstructionDataType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
