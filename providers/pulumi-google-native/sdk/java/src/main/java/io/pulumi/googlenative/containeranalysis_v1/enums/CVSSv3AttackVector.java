// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments.
     * 
     */
    @EnumType
    public enum CVSSv3AttackVector {
        AttackVectorUnspecified("ATTACK_VECTOR_UNSPECIFIED"),
        AttackVectorNetwork("ATTACK_VECTOR_NETWORK"),
        AttackVectorAdjacent("ATTACK_VECTOR_ADJACENT"),
        AttackVectorLocal("ATTACK_VECTOR_LOCAL"),
        AttackVectorPhysical("ATTACK_VECTOR_PHYSICAL");

        private final String value;

        CVSSv3AttackVector(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CVSSv3AttackVector[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
