// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs();

    /**
     * A boolean value.
     * 
     */
    @Import(name="booleanValue")
      private final @Nullable Output<Boolean> booleanValue;

    public Output<Boolean> getBooleanValue() {
        return this.booleanValue == null ? Codegen.empty() : this.booleanValue;
    }

    /**
     * Represents a whole or partial calendar date.
     * Structure is documented below.
     * 
     */
    @Import(name="dateValue")
      private final @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs> dateValue;

    public Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs> getDateValue() {
        return this.dateValue == null ? Codegen.empty() : this.dateValue;
    }

    /**
     * Represents a day of the week.
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    @Import(name="dayOfWeekValue")
      private final @Nullable Output<String> dayOfWeekValue;

    public Output<String> getDayOfWeekValue() {
        return this.dayOfWeekValue == null ? Codegen.empty() : this.dayOfWeekValue;
    }

    /**
     * A float value.
     * 
     */
    @Import(name="floatValue")
      private final @Nullable Output<Double> floatValue;

    public Output<Double> getFloatValue() {
        return this.floatValue == null ? Codegen.empty() : this.floatValue;
    }

    /**
     * An integer value.
     * 
     */
    @Import(name="integerValue")
      private final @Nullable Output<Integer> integerValue;

    public Output<Integer> getIntegerValue() {
        return this.integerValue == null ? Codegen.empty() : this.integerValue;
    }

    /**
     * A string value.
     * 
     */
    @Import(name="stringValue")
      private final @Nullable Output<String> stringValue;

    public Output<String> getStringValue() {
        return this.stringValue == null ? Codegen.empty() : this.stringValue;
    }

    /**
     * Represents a time of day.
     * Structure is documented below.
     * 
     */
    @Import(name="timeValue")
      private final @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs> timeValue;

    public Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs> getTimeValue() {
        return this.timeValue == null ? Codegen.empty() : this.timeValue;
    }

    /**
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
     * Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Import(name="timestampValue")
      private final @Nullable Output<String> timestampValue;

    public Output<String> getTimestampValue() {
        return this.timestampValue == null ? Codegen.empty() : this.timestampValue;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs(
        @Nullable Output<Boolean> booleanValue,
        @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs> dateValue,
        @Nullable Output<String> dayOfWeekValue,
        @Nullable Output<Double> floatValue,
        @Nullable Output<Integer> integerValue,
        @Nullable Output<String> stringValue,
        @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs> timeValue,
        @Nullable Output<String> timestampValue) {
        this.booleanValue = booleanValue;
        this.dateValue = dateValue;
        this.dayOfWeekValue = dayOfWeekValue;
        this.floatValue = floatValue;
        this.integerValue = integerValue;
        this.stringValue = stringValue;
        this.timeValue = timeValue;
        this.timestampValue = timestampValue;
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs() {
        this.booleanValue = Codegen.empty();
        this.dateValue = Codegen.empty();
        this.dayOfWeekValue = Codegen.empty();
        this.floatValue = Codegen.empty();
        this.integerValue = Codegen.empty();
        this.stringValue = Codegen.empty();
        this.timeValue = Codegen.empty();
        this.timestampValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> booleanValue;
        private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs> dateValue;
        private @Nullable Output<String> dayOfWeekValue;
        private @Nullable Output<Double> floatValue;
        private @Nullable Output<Integer> integerValue;
        private @Nullable Output<String> stringValue;
        private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs> timeValue;
        private @Nullable Output<String> timestampValue;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanValue = defaults.booleanValue;
    	      this.dateValue = defaults.dateValue;
    	      this.dayOfWeekValue = defaults.dayOfWeekValue;
    	      this.floatValue = defaults.floatValue;
    	      this.integerValue = defaults.integerValue;
    	      this.stringValue = defaults.stringValue;
    	      this.timeValue = defaults.timeValue;
    	      this.timestampValue = defaults.timestampValue;
        }

        public Builder booleanValue(@Nullable Output<Boolean> booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }
        public Builder booleanValue(@Nullable Boolean booleanValue) {
            this.booleanValue = Codegen.ofNullable(booleanValue);
            return this;
        }
        public Builder dateValue(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs> dateValue) {
            this.dateValue = dateValue;
            return this;
        }
        public Builder dateValue(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs dateValue) {
            this.dateValue = Codegen.ofNullable(dateValue);
            return this;
        }
        public Builder dayOfWeekValue(@Nullable Output<String> dayOfWeekValue) {
            this.dayOfWeekValue = dayOfWeekValue;
            return this;
        }
        public Builder dayOfWeekValue(@Nullable String dayOfWeekValue) {
            this.dayOfWeekValue = Codegen.ofNullable(dayOfWeekValue);
            return this;
        }
        public Builder floatValue(@Nullable Output<Double> floatValue) {
            this.floatValue = floatValue;
            return this;
        }
        public Builder floatValue(@Nullable Double floatValue) {
            this.floatValue = Codegen.ofNullable(floatValue);
            return this;
        }
        public Builder integerValue(@Nullable Output<Integer> integerValue) {
            this.integerValue = integerValue;
            return this;
        }
        public Builder integerValue(@Nullable Integer integerValue) {
            this.integerValue = Codegen.ofNullable(integerValue);
            return this;
        }
        public Builder stringValue(@Nullable Output<String> stringValue) {
            this.stringValue = stringValue;
            return this;
        }
        public Builder stringValue(@Nullable String stringValue) {
            this.stringValue = Codegen.ofNullable(stringValue);
            return this;
        }
        public Builder timeValue(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs> timeValue) {
            this.timeValue = timeValue;
            return this;
        }
        public Builder timeValue(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs timeValue) {
            this.timeValue = Codegen.ofNullable(timeValue);
            return this;
        }
        public Builder timestampValue(@Nullable Output<String> timestampValue) {
            this.timestampValue = timestampValue;
            return this;
        }
        public Builder timestampValue(@Nullable String timestampValue) {
            this.timestampValue = Codegen.ofNullable(timestampValue);
            return this;
        }        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs(booleanValue, dateValue, dayOfWeekValue, floatValue, integerValue, stringValue, timeValue, timestampValue);
        }
    }
}
