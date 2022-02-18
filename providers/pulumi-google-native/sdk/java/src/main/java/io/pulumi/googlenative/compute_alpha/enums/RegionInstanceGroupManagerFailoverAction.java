// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The action to perform in case of zone failure. Only one value is supported, NO_FAILOVER. The default is NO_FAILOVER.
     * 
     */
    @EnumType
    public enum RegionInstanceGroupManagerFailoverAction {
        NoFailover("NO_FAILOVER"),
        Unknown("UNKNOWN");

        private final String value;

        RegionInstanceGroupManagerFailoverAction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RegionInstanceGroupManagerFailoverAction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
