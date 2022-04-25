// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Aggregation types supported by Fleet Indexing
 * 
 */
public final class FleetMetricAggregationType extends com.pulumi.resources.InvokeArgs {

    public static final FleetMetricAggregationType Empty = new FleetMetricAggregationType();

    /**
     * Fleet Indexing aggregation type names such as Statistics, Percentiles and Cardinality
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Fleet Indexing aggregation type names such as Statistics, Percentiles and Cardinality
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Fleet Indexing aggregation type values
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return Fleet Indexing aggregation type values
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private FleetMetricAggregationType() {}

    private FleetMetricAggregationType(FleetMetricAggregationType $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetMetricAggregationType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetMetricAggregationType $;

        public Builder() {
            $ = new FleetMetricAggregationType();
        }

        public Builder(FleetMetricAggregationType defaults) {
            $ = new FleetMetricAggregationType(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Fleet Indexing aggregation type names such as Statistics, Percentiles and Cardinality
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param values Fleet Indexing aggregation type values
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Fleet Indexing aggregation type values
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public FleetMetricAggregationType build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
