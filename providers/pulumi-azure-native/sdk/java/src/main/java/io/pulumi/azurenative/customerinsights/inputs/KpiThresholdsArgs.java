// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;


/**
 * Defines the KPI Threshold limits.
 * 
 */
public final class KpiThresholdsArgs extends io.pulumi.resources.ResourceArgs {

    public static final KpiThresholdsArgs Empty = new KpiThresholdsArgs();

    /**
     * Whether or not the KPI is an increasing KPI.
     * 
     */
    @Import(name="increasingKpi", required=true)
      private final Output<Boolean> increasingKpi;

    public Output<Boolean> getIncreasingKpi() {
        return this.increasingKpi;
    }

    /**
     * The lower threshold limit.
     * 
     */
    @Import(name="lowerLimit", required=true)
      private final Output<Double> lowerLimit;

    public Output<Double> getLowerLimit() {
        return this.lowerLimit;
    }

    /**
     * The upper threshold limit.
     * 
     */
    @Import(name="upperLimit", required=true)
      private final Output<Double> upperLimit;

    public Output<Double> getUpperLimit() {
        return this.upperLimit;
    }

    public KpiThresholdsArgs(
        Output<Boolean> increasingKpi,
        Output<Double> lowerLimit,
        Output<Double> upperLimit) {
        this.increasingKpi = Objects.requireNonNull(increasingKpi, "expected parameter 'increasingKpi' to be non-null");
        this.lowerLimit = Objects.requireNonNull(lowerLimit, "expected parameter 'lowerLimit' to be non-null");
        this.upperLimit = Objects.requireNonNull(upperLimit, "expected parameter 'upperLimit' to be non-null");
    }

    private KpiThresholdsArgs() {
        this.increasingKpi = Codegen.empty();
        this.lowerLimit = Codegen.empty();
        this.upperLimit = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KpiThresholdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> increasingKpi;
        private Output<Double> lowerLimit;
        private Output<Double> upperLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(KpiThresholdsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.increasingKpi = defaults.increasingKpi;
    	      this.lowerLimit = defaults.lowerLimit;
    	      this.upperLimit = defaults.upperLimit;
        }

        public Builder increasingKpi(Output<Boolean> increasingKpi) {
            this.increasingKpi = Objects.requireNonNull(increasingKpi);
            return this;
        }
        public Builder increasingKpi(Boolean increasingKpi) {
            this.increasingKpi = Output.of(Objects.requireNonNull(increasingKpi));
            return this;
        }
        public Builder lowerLimit(Output<Double> lowerLimit) {
            this.lowerLimit = Objects.requireNonNull(lowerLimit);
            return this;
        }
        public Builder lowerLimit(Double lowerLimit) {
            this.lowerLimit = Output.of(Objects.requireNonNull(lowerLimit));
            return this;
        }
        public Builder upperLimit(Output<Double> upperLimit) {
            this.upperLimit = Objects.requireNonNull(upperLimit);
            return this;
        }
        public Builder upperLimit(Double upperLimit) {
            this.upperLimit = Output.of(Objects.requireNonNull(upperLimit));
            return this;
        }        public KpiThresholdsArgs build() {
            return new KpiThresholdsArgs(increasingKpi, lowerLimit, upperLimit);
        }
    }
}
