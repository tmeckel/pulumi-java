// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. Sets the aggregation interval for collecting flow logs. Increasing the interval time reduces the amount of generated flow logs for long-lasting connections. Default is an interval of 5 seconds per connection. Valid values: INTERVAL_5_SEC, INTERVAL_30_SEC, INTERVAL_1_MIN, INTERVAL_5_MIN, INTERVAL_10_MIN, INTERVAL_15_MIN.
     * 
     */
    @EnumType
    public enum SubnetworkAggregationInterval {
        Interval10Min("INTERVAL_10_MIN"),
        Interval15Min("INTERVAL_15_MIN"),
        Interval1Min("INTERVAL_1_MIN"),
        Interval30Sec("INTERVAL_30_SEC"),
        Interval5Min("INTERVAL_5_MIN"),
        Interval5Sec("INTERVAL_5_SEC");

        private final String value;

        SubnetworkAggregationInterval(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SubnetworkAggregationInterval[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
