// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * How the parameter should be scaled. Leave unset for categorical parameters.
     * 
     */
    @EnumType
    public enum GoogleCloudMlV1_StudyConfig_ParameterSpecScaleType {
        /**
         * By default, no scaling is applied.
         * 
         */
        ScaleTypeUnspecified("SCALE_TYPE_UNSPECIFIED"),
        /**
         * Scales the feasible space to (0, 1) linearly.
         * 
         */
        UnitLinearScale("UNIT_LINEAR_SCALE"),
        /**
         * Scales the feasible space logarithmically to (0, 1). The entire feasible space must be strictly positive.
         * 
         */
        UnitLogScale("UNIT_LOG_SCALE"),
        /**
         * Scales the feasible space "reverse" logarithmically to (0, 1). The result is that values close to the top of the feasible space are spread out more than points near the bottom. The entire feasible space must be strictly positive.
         * 
         */
        UnitReverseLogScale("UNIT_REVERSE_LOG_SCALE");

        private final String value;

        GoogleCloudMlV1_StudyConfig_ParameterSpecScaleType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudMlV1_StudyConfig_ParameterSpecScaleType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
