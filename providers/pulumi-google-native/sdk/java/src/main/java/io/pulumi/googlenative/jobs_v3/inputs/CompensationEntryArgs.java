// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.jobs_v3.enums.CompensationEntryType;
import io.pulumi.googlenative.jobs_v3.enums.CompensationEntryUnit;
import io.pulumi.googlenative.jobs_v3.inputs.CompensationRangeArgs;
import io.pulumi.googlenative.jobs_v3.inputs.MoneyArgs;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A compensation entry that represents one component of compensation, such as base pay, bonus, or other compensation type. Annualization: One compensation entry can be annualized if - it contains valid amount or range. - and its expected_units_per_year is set or can be derived. Its annualized range is determined as (amount or range) times expected_units_per_year.
 * 
 */
public final class CompensationEntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final CompensationEntryArgs Empty = new CompensationEntryArgs();

    /**
     * Optional. Compensation amount.
     * 
     */
    @InputImport(name="amount")
    private final @Nullable Input<MoneyArgs> amount;

    public Input<MoneyArgs> getAmount() {
        return this.amount == null ? Input.empty() : this.amount;
    }

    /**
     * Optional. Compensation description. For example, could indicate equity terms or provide additional context to an estimated bonus.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Optional. Expected number of units paid each year. If not specified, when Job.employment_types is FULLTIME, a default value is inferred based on unit. Default values: - HOURLY: 2080 - DAILY: 260 - WEEKLY: 52 - MONTHLY: 12 - ANNUAL: 1
     * 
     */
    @InputImport(name="expectedUnitsPerYear")
    private final @Nullable Input<Double> expectedUnitsPerYear;

    public Input<Double> getExpectedUnitsPerYear() {
        return this.expectedUnitsPerYear == null ? Input.empty() : this.expectedUnitsPerYear;
    }

    /**
     * Optional. Compensation range.
     * 
     */
    @InputImport(name="range")
    private final @Nullable Input<CompensationRangeArgs> range;

    public Input<CompensationRangeArgs> getRange() {
        return this.range == null ? Input.empty() : this.range;
    }

    /**
     * Optional. Compensation type. Default is CompensationUnit.COMPENSATION_TYPE_UNSPECIFIED.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<CompensationEntryType> type;

    public Input<CompensationEntryType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * Optional. Frequency of the specified amount. Default is CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED.
     * 
     */
    @InputImport(name="unit")
    private final @Nullable Input<CompensationEntryUnit> unit;

    public Input<CompensationEntryUnit> getUnit() {
        return this.unit == null ? Input.empty() : this.unit;
    }

    public CompensationEntryArgs(
        @Nullable Input<MoneyArgs> amount,
        @Nullable Input<String> description,
        @Nullable Input<Double> expectedUnitsPerYear,
        @Nullable Input<CompensationRangeArgs> range,
        @Nullable Input<CompensationEntryType> type,
        @Nullable Input<CompensationEntryUnit> unit) {
        this.amount = amount;
        this.description = description;
        this.expectedUnitsPerYear = expectedUnitsPerYear;
        this.range = range;
        this.type = type;
        this.unit = unit;
    }

    private CompensationEntryArgs() {
        this.amount = Input.empty();
        this.description = Input.empty();
        this.expectedUnitsPerYear = Input.empty();
        this.range = Input.empty();
        this.type = Input.empty();
        this.unit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompensationEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MoneyArgs> amount;
        private @Nullable Input<String> description;
        private @Nullable Input<Double> expectedUnitsPerYear;
        private @Nullable Input<CompensationRangeArgs> range;
        private @Nullable Input<CompensationEntryType> type;
        private @Nullable Input<CompensationEntryUnit> unit;

        public Builder() {
    	      // Empty
        }

        public Builder(CompensationEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.description = defaults.description;
    	      this.expectedUnitsPerYear = defaults.expectedUnitsPerYear;
    	      this.range = defaults.range;
    	      this.type = defaults.type;
    	      this.unit = defaults.unit;
        }

        public Builder setAmount(@Nullable Input<MoneyArgs> amount) {
            this.amount = amount;
            return this;
        }

        public Builder setAmount(@Nullable MoneyArgs amount) {
            this.amount = Input.ofNullable(amount);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setExpectedUnitsPerYear(@Nullable Input<Double> expectedUnitsPerYear) {
            this.expectedUnitsPerYear = expectedUnitsPerYear;
            return this;
        }

        public Builder setExpectedUnitsPerYear(@Nullable Double expectedUnitsPerYear) {
            this.expectedUnitsPerYear = Input.ofNullable(expectedUnitsPerYear);
            return this;
        }

        public Builder setRange(@Nullable Input<CompensationRangeArgs> range) {
            this.range = range;
            return this;
        }

        public Builder setRange(@Nullable CompensationRangeArgs range) {
            this.range = Input.ofNullable(range);
            return this;
        }

        public Builder setType(@Nullable Input<CompensationEntryType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable CompensationEntryType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setUnit(@Nullable Input<CompensationEntryUnit> unit) {
            this.unit = unit;
            return this;
        }

        public Builder setUnit(@Nullable CompensationEntryUnit unit) {
            this.unit = Input.ofNullable(unit);
            return this;
        }

        public CompensationEntryArgs build() {
            return new CompensationEntryArgs(amount, description, expectedUnitsPerYear, range, type, unit);
        }
    }
}
