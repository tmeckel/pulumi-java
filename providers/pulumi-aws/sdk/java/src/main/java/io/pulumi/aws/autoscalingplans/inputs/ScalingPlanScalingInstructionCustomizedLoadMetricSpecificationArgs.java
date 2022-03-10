// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscalingplans.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs Empty = new ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs();

    /**
     * The dimensions of the metric.
     * 
     */
    @InputImport(name="dimensions")
      private final @Nullable Input<Map<String,String>> dimensions;

    public Input<Map<String,String>> getDimensions() {
        return this.dimensions == null ? Input.empty() : this.dimensions;
    }

    /**
     * The name of the metric.
     * 
     */
    @InputImport(name="metricName", required=true)
      private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    /**
     * The namespace of the metric.
     * 
     */
    @InputImport(name="namespace", required=true)
      private final Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace;
    }

    /**
     * The statistic of the metric. Currently, the value must always be `Sum`.
     * 
     */
    @InputImport(name="statistic", required=true)
      private final Input<String> statistic;

    public Input<String> getStatistic() {
        return this.statistic;
    }

    /**
     * The unit of the metric.
     * 
     */
    @InputImport(name="unit")
      private final @Nullable Input<String> unit;

    public Input<String> getUnit() {
        return this.unit == null ? Input.empty() : this.unit;
    }

    public ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs(
        @Nullable Input<Map<String,String>> dimensions,
        Input<String> metricName,
        Input<String> namespace,
        Input<String> statistic,
        @Nullable Input<String> unit) {
        this.dimensions = dimensions;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
        this.statistic = Objects.requireNonNull(statistic, "expected parameter 'statistic' to be non-null");
        this.unit = unit;
    }

    private ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs() {
        this.dimensions = Input.empty();
        this.metricName = Input.empty();
        this.namespace = Input.empty();
        this.statistic = Input.empty();
        this.unit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> dimensions;
        private Input<String> metricName;
        private Input<String> namespace;
        private Input<String> statistic;
        private @Nullable Input<String> unit;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
    	      this.statistic = defaults.statistic;
    	      this.unit = defaults.unit;
        }

        public Builder dimensions(@Nullable Input<Map<String,String>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder dimensions(@Nullable Map<String,String> dimensions) {
            this.dimensions = Input.ofNullable(dimensions);
            return this;
        }

        public Builder metricName(Input<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder metricName(String metricName) {
            this.metricName = Input.of(Objects.requireNonNull(metricName));
            return this;
        }

        public Builder namespace(Input<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = Input.of(Objects.requireNonNull(namespace));
            return this;
        }

        public Builder statistic(Input<String> statistic) {
            this.statistic = Objects.requireNonNull(statistic);
            return this;
        }

        public Builder statistic(String statistic) {
            this.statistic = Input.of(Objects.requireNonNull(statistic));
            return this;
        }

        public Builder unit(@Nullable Input<String> unit) {
            this.unit = unit;
            return this;
        }

        public Builder unit(@Nullable String unit) {
            this.unit = Input.ofNullable(unit);
            return this;
        }
        public ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs build() {
            return new ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs(dimensions, metricName, namespace, statistic, unit);
        }
    }
}
