// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasedatabase_v1beta.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The database's lifecycle state. Read-only.
     * 
     */
    @EnumType
    public enum InstanceState {
        /**
         * Unspecified state, likely the result of an error on the backend. This is only used for distinguishing unset values.
         * 
         */
        LifecycleStateUnspecified("LIFECYCLE_STATE_UNSPECIFIED"),
        /**
         * The normal and active state.
         * 
         */
        Active("ACTIVE"),
        /**
         * The database is in a disabled state. It can be re-enabled later.
         * 
         */
        Disabled("DISABLED"),
        /**
         * The database is in a deleted state.
         * 
         */
        Deleted("DELETED");

        private final String value;

        InstanceState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
