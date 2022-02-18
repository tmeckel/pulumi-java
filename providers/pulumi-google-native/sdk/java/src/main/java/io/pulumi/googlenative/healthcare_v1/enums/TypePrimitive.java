// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * If this is a primitive type then this field is the type of the primitive For example, STRING. Leave unspecified for composite types.
     * 
     */
    @EnumType
    public enum TypePrimitive {
        /**
         * Not a primitive.
         * 
         */
        PrimitiveUnspecified("PRIMITIVE_UNSPECIFIED"),
        /**
         * String primitive.
         * 
         */
        String("STRING"),
        /**
         * Element that can have unschematized children.
         * 
         */
        Varies("VARIES"),
        /**
         * Like STRING, but all delimiters below this element are ignored.
         * 
         */
        UnescapedString("UNESCAPED_STRING");

        private final String value;

        TypePrimitive(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TypePrimitive[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
