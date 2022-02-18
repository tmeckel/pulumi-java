// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of the schema definition.
     * 
     */
    @EnumType
    public enum SchemaType {
        /**
         * Default value. This value is unused.
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * A Protocol Buffer schema definition.
         * 
         */
        ProtocolBuffer("PROTOCOL_BUFFER"),
        /**
         * An Avro schema definition.
         * 
         */
        Avro("AVRO");

        private final String value;

        SchemaType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SchemaType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
