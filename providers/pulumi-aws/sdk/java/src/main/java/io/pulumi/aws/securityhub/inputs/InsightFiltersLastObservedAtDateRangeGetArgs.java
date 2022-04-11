// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InsightFiltersLastObservedAtDateRangeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InsightFiltersLastObservedAtDateRangeGetArgs Empty = new InsightFiltersLastObservedAtDateRangeGetArgs();

    /**
     * A date range unit for the date filter. Valid values: `DAYS`.
     * 
     */
    @Import(name="unit", required=true)
      private final Output<String> unit;

    public Output<String> getUnit() {
        return this.unit;
    }

    /**
     * A date range value for the date filter, provided as an Integer.
     * 
     */
    @Import(name="value", required=true)
      private final Output<Integer> value;

    public Output<Integer> getValue() {
        return this.value;
    }

    public InsightFiltersLastObservedAtDateRangeGetArgs(
        Output<String> unit,
        Output<Integer> value) {
        this.unit = Objects.requireNonNull(unit, "expected parameter 'unit' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private InsightFiltersLastObservedAtDateRangeGetArgs() {
        this.unit = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersLastObservedAtDateRangeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> unit;
        private Output<Integer> value;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersLastObservedAtDateRangeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder unit(Output<String> unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }
        public Builder unit(String unit) {
            this.unit = Output.of(Objects.requireNonNull(unit));
            return this;
        }
        public Builder value(Output<Integer> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(Integer value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public InsightFiltersLastObservedAtDateRangeGetArgs build() {
            return new InsightFiltersLastObservedAtDateRangeGetArgs(unit, value);
        }
    }
}
