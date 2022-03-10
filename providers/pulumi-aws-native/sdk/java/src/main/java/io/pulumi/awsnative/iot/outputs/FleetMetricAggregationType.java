// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class FleetMetricAggregationType {
    /**
     * Fleet Indexing aggregation type names such as Statistics, Percentiles and Cardinality
     * 
     */
    private final String name;
    /**
     * Fleet Indexing aggregation type values
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor
    private FleetMetricAggregationType(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("values") List<String> values) {
        this.name = name;
        this.values = values;
    }

    /**
     * Fleet Indexing aggregation type names such as Statistics, Percentiles and Cardinality
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Fleet Indexing aggregation type values
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetMetricAggregationType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetMetricAggregationType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public FleetMetricAggregationType build() {
            return new FleetMetricAggregationType(name, values);
        }
    }
}
