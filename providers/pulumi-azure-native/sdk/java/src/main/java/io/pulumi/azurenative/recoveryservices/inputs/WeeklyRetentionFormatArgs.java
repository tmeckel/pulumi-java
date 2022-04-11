// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.DayOfWeek;
import io.pulumi.azurenative.recoveryservices.enums.WeekOfMonth;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Weekly retention format.
 * 
 */
public final class WeeklyRetentionFormatArgs extends io.pulumi.resources.ResourceArgs {

    public static final WeeklyRetentionFormatArgs Empty = new WeeklyRetentionFormatArgs();

    /**
     * List of days of the week.
     * 
     */
    @Import(name="daysOfTheWeek")
      private final @Nullable Output<List<DayOfWeek>> daysOfTheWeek;

    public Output<List<DayOfWeek>> getDaysOfTheWeek() {
        return this.daysOfTheWeek == null ? Codegen.empty() : this.daysOfTheWeek;
    }

    /**
     * List of weeks of month.
     * 
     */
    @Import(name="weeksOfTheMonth")
      private final @Nullable Output<List<WeekOfMonth>> weeksOfTheMonth;

    public Output<List<WeekOfMonth>> getWeeksOfTheMonth() {
        return this.weeksOfTheMonth == null ? Codegen.empty() : this.weeksOfTheMonth;
    }

    public WeeklyRetentionFormatArgs(
        @Nullable Output<List<DayOfWeek>> daysOfTheWeek,
        @Nullable Output<List<WeekOfMonth>> weeksOfTheMonth) {
        this.daysOfTheWeek = daysOfTheWeek;
        this.weeksOfTheMonth = weeksOfTheMonth;
    }

    private WeeklyRetentionFormatArgs() {
        this.daysOfTheWeek = Codegen.empty();
        this.weeksOfTheMonth = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeeklyRetentionFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DayOfWeek>> daysOfTheWeek;
        private @Nullable Output<List<WeekOfMonth>> weeksOfTheMonth;

        public Builder() {
    	      // Empty
        }

        public Builder(WeeklyRetentionFormatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysOfTheWeek = defaults.daysOfTheWeek;
    	      this.weeksOfTheMonth = defaults.weeksOfTheMonth;
        }

        public Builder daysOfTheWeek(@Nullable Output<List<DayOfWeek>> daysOfTheWeek) {
            this.daysOfTheWeek = daysOfTheWeek;
            return this;
        }
        public Builder daysOfTheWeek(@Nullable List<DayOfWeek> daysOfTheWeek) {
            this.daysOfTheWeek = Codegen.ofNullable(daysOfTheWeek);
            return this;
        }
        public Builder daysOfTheWeek(DayOfWeek... daysOfTheWeek) {
            return daysOfTheWeek(List.of(daysOfTheWeek));
        }
        public Builder weeksOfTheMonth(@Nullable Output<List<WeekOfMonth>> weeksOfTheMonth) {
            this.weeksOfTheMonth = weeksOfTheMonth;
            return this;
        }
        public Builder weeksOfTheMonth(@Nullable List<WeekOfMonth> weeksOfTheMonth) {
            this.weeksOfTheMonth = Codegen.ofNullable(weeksOfTheMonth);
            return this;
        }
        public Builder weeksOfTheMonth(WeekOfMonth... weeksOfTheMonth) {
            return weeksOfTheMonth(List.of(weeksOfTheMonth));
        }        public WeeklyRetentionFormatArgs build() {
            return new WeeklyRetentionFormatArgs(daysOfTheWeek, weeksOfTheMonth);
        }
    }
}
