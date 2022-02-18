// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Denotes the state of etcd encryption.
     * 
     */
    @EnumType
    public enum DatabaseEncryptionState {
        /**
         * Should never be set
         * 
         */
        Unknown("UNKNOWN"),
        /**
         * Secrets in etcd are encrypted.
         * 
         */
        Encrypted("ENCRYPTED"),
        /**
         * Secrets in etcd are stored in plain text (at etcd level) - this is unrelated to Compute Engine level full disk encryption.
         * 
         */
        Decrypted("DECRYPTED");

        private final String value;

        DatabaseEncryptionState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DatabaseEncryptionState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
