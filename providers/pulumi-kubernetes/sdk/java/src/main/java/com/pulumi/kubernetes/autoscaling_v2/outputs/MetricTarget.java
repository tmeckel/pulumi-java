// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricTarget {
    /**
     * @return averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type
     * 
     */
    private final @Nullable Integer averageUtilization;
    /**
     * @return averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    private final @Nullable String averageValue;
    /**
     * @return type represents whether the metric type is Utilization, Value, or AverageValue
     * 
     */
    private final String type;
    /**
     * @return value is the target value of the metric (as a quantity).
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private MetricTarget(
        @CustomType.Parameter("averageUtilization") @Nullable Integer averageUtilization,
        @CustomType.Parameter("averageValue") @Nullable String averageValue,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") @Nullable String value) {
        this.averageUtilization = averageUtilization;
        this.averageValue = averageValue;
        this.type = type;
        this.value = value;
    }

    /**
     * @return averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type
     * 
     */
    public Optional<Integer> averageUtilization() {
        return Optional.ofNullable(this.averageUtilization);
    }
    /**
     * @return averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    public Optional<String> averageValue() {
        return Optional.ofNullable(this.averageValue);
    }
    /**
     * @return type represents whether the metric type is Utilization, Value, or AverageValue
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return value is the target value of the metric (as a quantity).
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer averageUtilization;
        private @Nullable String averageValue;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageUtilization = defaults.averageUtilization;
    	      this.averageValue = defaults.averageValue;
    	      this.type = defaults.type;
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
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public MetricTarget build() {
            return new MetricTarget(averageUtilization, averageValue, type, value);
        }
    }
}
