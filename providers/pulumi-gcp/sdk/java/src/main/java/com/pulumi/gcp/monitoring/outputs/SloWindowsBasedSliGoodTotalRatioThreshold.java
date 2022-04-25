// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.monitoring.outputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance;
import com.pulumi.gcp.monitoring.outputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformance;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SloWindowsBasedSliGoodTotalRatioThreshold {
    /**
     * @return Basic SLI to evaluate to judge window quality.
     * Structure is documented below.
     * 
     */
    private final @Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance basicSliPerformance;
    /**
     * @return Request-based SLI to evaluate to judge window quality.
     * Structure is documented below.
     * 
     */
    private final @Nullable SloWindowsBasedSliGoodTotalRatioThresholdPerformance performance;
    /**
     * @return A duration string, e.g. 10s.
     * Good service is defined to be the count of requests made to
     * this service that return in no more than threshold.
     * 
     */
    private final @Nullable Double threshold;

    @CustomType.Constructor
    private SloWindowsBasedSliGoodTotalRatioThreshold(
        @CustomType.Parameter("basicSliPerformance") @Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance basicSliPerformance,
        @CustomType.Parameter("performance") @Nullable SloWindowsBasedSliGoodTotalRatioThresholdPerformance performance,
        @CustomType.Parameter("threshold") @Nullable Double threshold) {
        this.basicSliPerformance = basicSliPerformance;
        this.performance = performance;
        this.threshold = threshold;
    }

    /**
     * @return Basic SLI to evaluate to judge window quality.
     * Structure is documented below.
     * 
     */
    public Optional<SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance> basicSliPerformance() {
        return Optional.ofNullable(this.basicSliPerformance);
    }
    /**
     * @return Request-based SLI to evaluate to judge window quality.
     * Structure is documented below.
     * 
     */
    public Optional<SloWindowsBasedSliGoodTotalRatioThresholdPerformance> performance() {
        return Optional.ofNullable(this.performance);
    }
    /**
     * @return A duration string, e.g. 10s.
     * Good service is defined to be the count of requests made to
     * this service that return in no more than threshold.
     * 
     */
    public Optional<Double> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliGoodTotalRatioThreshold defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance basicSliPerformance;
        private @Nullable SloWindowsBasedSliGoodTotalRatioThresholdPerformance performance;
        private @Nullable Double threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliGoodTotalRatioThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicSliPerformance = defaults.basicSliPerformance;
    	      this.performance = defaults.performance;
    	      this.threshold = defaults.threshold;
        }

        public Builder basicSliPerformance(@Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance basicSliPerformance) {
            this.basicSliPerformance = basicSliPerformance;
            return this;
        }
        public Builder performance(@Nullable SloWindowsBasedSliGoodTotalRatioThresholdPerformance performance) {
            this.performance = performance;
            return this;
        }
        public Builder threshold(@Nullable Double threshold) {
            this.threshold = threshold;
            return this;
        }        public SloWindowsBasedSliGoodTotalRatioThreshold build() {
            return new SloWindowsBasedSliGoodTotalRatioThreshold(basicSliPerformance, performance, threshold);
        }
    }
}
