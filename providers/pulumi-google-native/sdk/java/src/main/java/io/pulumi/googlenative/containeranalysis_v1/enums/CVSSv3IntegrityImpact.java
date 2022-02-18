// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum CVSSv3IntegrityImpact {
        ImpactUnspecified("IMPACT_UNSPECIFIED"),
        ImpactHigh("IMPACT_HIGH"),
        ImpactLow("IMPACT_LOW"),
        ImpactNone("IMPACT_NONE");

        private final String value;

        CVSSv3IntegrityImpact(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CVSSv3IntegrityImpact[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
