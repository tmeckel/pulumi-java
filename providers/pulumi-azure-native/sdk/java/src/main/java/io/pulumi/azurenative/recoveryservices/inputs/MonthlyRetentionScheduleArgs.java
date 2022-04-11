// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.RetentionScheduleFormat;
import io.pulumi.azurenative.recoveryservices.inputs.DailyRetentionFormatArgs;
import io.pulumi.azurenative.recoveryservices.inputs.RetentionDurationArgs;
import io.pulumi.azurenative.recoveryservices.inputs.WeeklyRetentionFormatArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Monthly retention schedule.
 * 
 */
public final class MonthlyRetentionScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonthlyRetentionScheduleArgs Empty = new MonthlyRetentionScheduleArgs();

    /**
     * Retention duration of retention Policy.
     * 
     */
    @Import(name="retentionDuration")
      private final @Nullable Output<RetentionDurationArgs> retentionDuration;

    public Output<RetentionDurationArgs> getRetentionDuration() {
        return this.retentionDuration == null ? Codegen.empty() : this.retentionDuration;
    }

    /**
     * Daily retention format for monthly retention policy.
     * 
     */
    @Import(name="retentionScheduleDaily")
      private final @Nullable Output<DailyRetentionFormatArgs> retentionScheduleDaily;

    public Output<DailyRetentionFormatArgs> getRetentionScheduleDaily() {
        return this.retentionScheduleDaily == null ? Codegen.empty() : this.retentionScheduleDaily;
    }

    /**
     * Retention schedule format type for monthly retention policy.
     * 
     */
    @Import(name="retentionScheduleFormatType")
      private final @Nullable Output<Either<String,RetentionScheduleFormat>> retentionScheduleFormatType;

    public Output<Either<String,RetentionScheduleFormat>> getRetentionScheduleFormatType() {
        return this.retentionScheduleFormatType == null ? Codegen.empty() : this.retentionScheduleFormatType;
    }

    /**
     * Weekly retention format for monthly retention policy.
     * 
     */
    @Import(name="retentionScheduleWeekly")
      private final @Nullable Output<WeeklyRetentionFormatArgs> retentionScheduleWeekly;

    public Output<WeeklyRetentionFormatArgs> getRetentionScheduleWeekly() {
        return this.retentionScheduleWeekly == null ? Codegen.empty() : this.retentionScheduleWeekly;
    }

    /**
     * Retention times of retention policy.
     * 
     */
    @Import(name="retentionTimes")
      private final @Nullable Output<List<String>> retentionTimes;

    public Output<List<String>> getRetentionTimes() {
        return this.retentionTimes == null ? Codegen.empty() : this.retentionTimes;
    }

    public MonthlyRetentionScheduleArgs(
        @Nullable Output<RetentionDurationArgs> retentionDuration,
        @Nullable Output<DailyRetentionFormatArgs> retentionScheduleDaily,
        @Nullable Output<Either<String,RetentionScheduleFormat>> retentionScheduleFormatType,
        @Nullable Output<WeeklyRetentionFormatArgs> retentionScheduleWeekly,
        @Nullable Output<List<String>> retentionTimes) {
        this.retentionDuration = retentionDuration;
        this.retentionScheduleDaily = retentionScheduleDaily;
        this.retentionScheduleFormatType = retentionScheduleFormatType;
        this.retentionScheduleWeekly = retentionScheduleWeekly;
        this.retentionTimes = retentionTimes;
    }

    private MonthlyRetentionScheduleArgs() {
        this.retentionDuration = Codegen.empty();
        this.retentionScheduleDaily = Codegen.empty();
        this.retentionScheduleFormatType = Codegen.empty();
        this.retentionScheduleWeekly = Codegen.empty();
        this.retentionTimes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonthlyRetentionScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RetentionDurationArgs> retentionDuration;
        private @Nullable Output<DailyRetentionFormatArgs> retentionScheduleDaily;
        private @Nullable Output<Either<String,RetentionScheduleFormat>> retentionScheduleFormatType;
        private @Nullable Output<WeeklyRetentionFormatArgs> retentionScheduleWeekly;
        private @Nullable Output<List<String>> retentionTimes;

        public Builder() {
    	      // Empty
        }

        public Builder(MonthlyRetentionScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retentionDuration = defaults.retentionDuration;
    	      this.retentionScheduleDaily = defaults.retentionScheduleDaily;
    	      this.retentionScheduleFormatType = defaults.retentionScheduleFormatType;
    	      this.retentionScheduleWeekly = defaults.retentionScheduleWeekly;
    	      this.retentionTimes = defaults.retentionTimes;
        }

        public Builder retentionDuration(@Nullable Output<RetentionDurationArgs> retentionDuration) {
            this.retentionDuration = retentionDuration;
            return this;
        }
        public Builder retentionDuration(@Nullable RetentionDurationArgs retentionDuration) {
            this.retentionDuration = Codegen.ofNullable(retentionDuration);
            return this;
        }
        public Builder retentionScheduleDaily(@Nullable Output<DailyRetentionFormatArgs> retentionScheduleDaily) {
            this.retentionScheduleDaily = retentionScheduleDaily;
            return this;
        }
        public Builder retentionScheduleDaily(@Nullable DailyRetentionFormatArgs retentionScheduleDaily) {
            this.retentionScheduleDaily = Codegen.ofNullable(retentionScheduleDaily);
            return this;
        }
        public Builder retentionScheduleFormatType(@Nullable Output<Either<String,RetentionScheduleFormat>> retentionScheduleFormatType) {
            this.retentionScheduleFormatType = retentionScheduleFormatType;
            return this;
        }
        public Builder retentionScheduleFormatType(@Nullable Either<String,RetentionScheduleFormat> retentionScheduleFormatType) {
            this.retentionScheduleFormatType = Codegen.ofNullable(retentionScheduleFormatType);
            return this;
        }
        public Builder retentionScheduleWeekly(@Nullable Output<WeeklyRetentionFormatArgs> retentionScheduleWeekly) {
            this.retentionScheduleWeekly = retentionScheduleWeekly;
            return this;
        }
        public Builder retentionScheduleWeekly(@Nullable WeeklyRetentionFormatArgs retentionScheduleWeekly) {
            this.retentionScheduleWeekly = Codegen.ofNullable(retentionScheduleWeekly);
            return this;
        }
        public Builder retentionTimes(@Nullable Output<List<String>> retentionTimes) {
            this.retentionTimes = retentionTimes;
            return this;
        }
        public Builder retentionTimes(@Nullable List<String> retentionTimes) {
            this.retentionTimes = Codegen.ofNullable(retentionTimes);
            return this;
        }
        public Builder retentionTimes(String... retentionTimes) {
            return retentionTimes(List.of(retentionTimes));
        }        public MonthlyRetentionScheduleArgs build() {
            return new MonthlyRetentionScheduleArgs(retentionDuration, retentionScheduleDaily, retentionScheduleFormatType, retentionScheduleWeekly, retentionTimes);
        }
    }
}
