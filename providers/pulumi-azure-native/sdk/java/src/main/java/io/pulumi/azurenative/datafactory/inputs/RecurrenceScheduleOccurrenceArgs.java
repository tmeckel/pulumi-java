// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.DayOfWeek;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The recurrence schedule occurrence.
 * 
 */
public final class RecurrenceScheduleOccurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecurrenceScheduleOccurrenceArgs Empty = new RecurrenceScheduleOccurrenceArgs();

    /**
     * The day of the week.
     * 
     */
    @Import(name="day")
      private final @Nullable Output<DayOfWeek> day;

    public Output<DayOfWeek> getDay() {
        return this.day == null ? Codegen.empty() : this.day;
    }

    /**
     * The occurrence.
     * 
     */
    @Import(name="occurrence")
      private final @Nullable Output<Integer> occurrence;

    public Output<Integer> getOccurrence() {
        return this.occurrence == null ? Codegen.empty() : this.occurrence;
    }

    public RecurrenceScheduleOccurrenceArgs(
        @Nullable Output<DayOfWeek> day,
        @Nullable Output<Integer> occurrence) {
        this.day = day;
        this.occurrence = occurrence;
    }

    private RecurrenceScheduleOccurrenceArgs() {
        this.day = Codegen.empty();
        this.occurrence = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurrenceScheduleOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DayOfWeek> day;
        private @Nullable Output<Integer> occurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurrenceScheduleOccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.occurrence = defaults.occurrence;
        }

        public Builder day(@Nullable Output<DayOfWeek> day) {
            this.day = day;
            return this;
        }
        public Builder day(@Nullable DayOfWeek day) {
            this.day = Codegen.ofNullable(day);
            return this;
        }
        public Builder occurrence(@Nullable Output<Integer> occurrence) {
            this.occurrence = occurrence;
            return this;
        }
        public Builder occurrence(@Nullable Integer occurrence) {
            this.occurrence = Codegen.ofNullable(occurrence);
            return this;
        }        public RecurrenceScheduleOccurrenceArgs build() {
            return new RecurrenceScheduleOccurrenceArgs(day, occurrence);
        }
    }
}
