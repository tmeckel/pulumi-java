// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * ranking_method is applied to each time series independently to produce the value which will be used to compare the time series to other time series.
     * 
     */
    @EnumType
    public enum PickTimeSeriesFilterRankingMethod {
        /**
         * Not allowed. You must specify a different Method if you specify a PickTimeSeriesFilter.
         * 
         */
        MethodUnspecified("METHOD_UNSPECIFIED"),
        /**
         * Select the mean of all values.
         * 
         */
        MethodMean("METHOD_MEAN"),
        /**
         * Select the maximum value.
         * 
         */
        MethodMax("METHOD_MAX"),
        /**
         * Select the minimum value.
         * 
         */
        MethodMin("METHOD_MIN"),
        /**
         * Compute the sum of all values.
         * 
         */
        MethodSum("METHOD_SUM"),
        /**
         * Select the most recent value.
         * 
         */
        MethodLatest("METHOD_LATEST");

        private final String value;

        PickTimeSeriesFilterRankingMethod(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PickTimeSeriesFilterRankingMethod[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
