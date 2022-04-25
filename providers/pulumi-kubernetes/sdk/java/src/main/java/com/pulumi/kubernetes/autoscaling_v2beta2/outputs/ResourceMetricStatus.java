// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v2beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.autoscaling_v2beta2.outputs.MetricValueStatus;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourceMetricStatus {
    /**
     * @return current contains the current value for the given metric
     * 
     */
    private final MetricValueStatus current;
    /**
     * @return Name is the name of the resource in question.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private ResourceMetricStatus(
        @CustomType.Parameter("current") MetricValueStatus current,
        @CustomType.Parameter("name") String name) {
        this.current = current;
        this.name = name;
    }

    /**
     * @return current contains the current value for the given metric
     * 
     */
    public MetricValueStatus current() {
        return this.current;
    }
    /**
     * @return Name is the name of the resource in question.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceMetricStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricValueStatus current;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceMetricStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.current = defaults.current;
    	      this.name = defaults.name;
        }

        public Builder current(MetricValueStatus current) {
            this.current = Objects.requireNonNull(current);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ResourceMetricStatus build() {
            return new ResourceMetricStatus(current, name);
        }
    }
}
