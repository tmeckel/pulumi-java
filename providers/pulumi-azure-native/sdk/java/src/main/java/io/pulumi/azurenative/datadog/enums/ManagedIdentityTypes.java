// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum ManagedIdentityTypes {
        SystemAssigned("SystemAssigned"),
        UserAssigned("UserAssigned");

        private final String value;

        ManagedIdentityTypes(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ManagedIdentityTypes[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
