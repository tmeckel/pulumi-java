// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of the key, either stored in `public_key` or referenced in `key_id`
     * 
     */
    @EnumType
    public enum BuildSignatureKeyType {
        /**
         * `KeyType` is not set.
         * 
         */
        KeyTypeUnspecified("KEY_TYPE_UNSPECIFIED"),
        /**
         * `PGP ASCII Armored` public key.
         * 
         */
        PgpAsciiArmored("PGP_ASCII_ARMORED"),
        /**
         * `PKIX PEM` public key.
         * 
         */
        PkixPem("PKIX_PEM");

        private final String value;

        BuildSignatureKeyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BuildSignatureKeyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
