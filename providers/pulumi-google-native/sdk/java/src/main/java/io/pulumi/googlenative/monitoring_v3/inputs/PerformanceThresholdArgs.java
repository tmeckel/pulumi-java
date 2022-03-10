// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v3.inputs.BasicSliArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.RequestBasedSliArgs;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A PerformanceThreshold is used when each window is good when that window has a sufficiently high performance.
 * 
 */
public final class PerformanceThresholdArgs extends io.pulumi.resources.ResourceArgs {

    public static final PerformanceThresholdArgs Empty = new PerformanceThresholdArgs();

    /**
     * BasicSli to evaluate to judge window quality.
     * 
     */
    @InputImport(name="basicSliPerformance")
      private final @Nullable Input<BasicSliArgs> basicSliPerformance;

    public Input<BasicSliArgs> getBasicSliPerformance() {
        return this.basicSliPerformance == null ? Input.empty() : this.basicSliPerformance;
    }

    /**
     * RequestBasedSli to evaluate to judge window quality.
     * 
     */
    @InputImport(name="performance")
      private final @Nullable Input<RequestBasedSliArgs> performance;

    public Input<RequestBasedSliArgs> getPerformance() {
        return this.performance == null ? Input.empty() : this.performance;
    }

    /**
     * If window performance >= threshold, the window is counted as good.
     * 
     */
    @InputImport(name="threshold")
      private final @Nullable Input<Double> threshold;

    public Input<Double> getThreshold() {
        return this.threshold == null ? Input.empty() : this.threshold;
    }

    public PerformanceThresholdArgs(
        @Nullable Input<BasicSliArgs> basicSliPerformance,
        @Nullable Input<RequestBasedSliArgs> performance,
        @Nullable Input<Double> threshold) {
        this.basicSliPerformance = basicSliPerformance;
        this.performance = performance;
        this.threshold = threshold;
    }

    private PerformanceThresholdArgs() {
        this.basicSliPerformance = Input.empty();
        this.performance = Input.empty();
        this.threshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerformanceThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BasicSliArgs> basicSliPerformance;
        private @Nullable Input<RequestBasedSliArgs> performance;
        private @Nullable Input<Double> threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(PerformanceThresholdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicSliPerformance = defaults.basicSliPerformance;
    	      this.performance = defaults.performance;
    	      this.threshold = defaults.threshold;
        }

        public Builder basicSliPerformance(@Nullable Input<BasicSliArgs> basicSliPerformance) {
            this.basicSliPerformance = basicSliPerformance;
            return this;
        }

        public Builder basicSliPerformance(@Nullable BasicSliArgs basicSliPerformance) {
            this.basicSliPerformance = Input.ofNullable(basicSliPerformance);
            return this;
        }

        public Builder performance(@Nullable Input<RequestBasedSliArgs> performance) {
            this.performance = performance;
            return this;
        }

        public Builder performance(@Nullable RequestBasedSliArgs performance) {
            this.performance = Input.ofNullable(performance);
            return this;
        }

        public Builder threshold(@Nullable Input<Double> threshold) {
            this.threshold = threshold;
            return this;
        }

        public Builder threshold(@Nullable Double threshold) {
            this.threshold = Input.ofNullable(threshold);
            return this;
        }
        public PerformanceThresholdArgs build() {
            return new PerformanceThresholdArgs(basicSliPerformance, performance, threshold);
        }
    }
}
