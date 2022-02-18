// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasedatabase_v1beta.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The database instance type. On creation only USER_DATABASE is allowed, which is also the default when omitted.
     * 
     */
    @EnumType
    public enum InstanceType {
        /**
         * Unknown state, likely the result of an error on the backend. This is only used for distinguishing unset values.
         * 
         */
        DatabaseInstanceTypeUnspecified("DATABASE_INSTANCE_TYPE_UNSPECIFIED"),
        /**
         * The default database that is provisioned when a project is created.
         * 
         */
        DefaultDatabase("DEFAULT_DATABASE"),
        /**
         * A database that the user created.
         * 
         */
        UserDatabase("USER_DATABASE");

        private final String value;

        InstanceType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
