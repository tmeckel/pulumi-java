// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricValueStatus {
    /**
     * currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
     * 
     */
    private final @Nullable Integer averageUtilization;
    /**
     * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    private final @Nullable String averageValue;
    /**
     * value is the current value of the metric (as a quantity).
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor
    private MetricValueStatus(
        @OutputCustomType.Parameter("averageUtilization") @Nullable Integer averageUtilization,
        @OutputCustomType.Parameter("averageValue") @Nullable String averageValue,
        @OutputCustomType.Parameter("value") @Nullable String value) {
        this.averageUtilization = averageUtilization;
        this.averageValue = averageValue;
        this.value = value;
    }

    /**
     * currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
     * 
    */
    public Optional<Integer> getAverageUtilization() {
        return Optional.ofNullable(this.averageUtilization);
    }
    /**
     * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
     * 
    */
    public Optional<String> getAverageValue() {
        return Optional.ofNullable(this.averageValue);
    }
    /**
     * value is the current value of the metric (as a quantity).
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricValueStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer averageUtilization;
        private @Nullable String averageValue;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricValueStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageUtilization = defaults.averageUtilization;
    	      this.averageValue = defaults.averageValue;
    	      this.value = defaults.value;
        }

        public Builder averageUtilization(@Nullable Integer averageUtilization) {
            this.averageUtilization = averageUtilization;
            return this;
        }

        public Builder averageValue(@Nullable String averageValue) {
            this.averageValue = averageValue;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public MetricValueStatus build() {
            return new MetricValueStatus(averageUtilization, averageValue, value);
        }
    }
}
