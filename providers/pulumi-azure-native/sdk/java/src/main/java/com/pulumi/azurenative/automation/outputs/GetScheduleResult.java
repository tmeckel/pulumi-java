// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.outputs;

import com.pulumi.azurenative.automation.outputs.AdvancedScheduleResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetScheduleResult {
    /**
     * @return Gets or sets the advanced schedule.
     * 
     */
    private final @Nullable AdvancedScheduleResponse advancedSchedule;
    /**
     * @return Gets or sets the creation time.
     * 
     */
    private final @Nullable String creationTime;
    /**
     * @return Gets or sets the description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Gets or sets the end time of the schedule.
     * 
     */
    private final @Nullable String expiryTime;
    /**
     * @return Gets or sets the expiry time&#39;s offset in minutes.
     * 
     */
    private final @Nullable Double expiryTimeOffsetMinutes;
    /**
     * @return Gets or sets the frequency of the schedule.
     * 
     */
    private final @Nullable String frequency;
    /**
     * @return Fully qualified resource Id for the resource
     * 
     */
    private final String id;
    /**
     * @return Gets or sets the interval of the schedule.
     * 
     */
    private final @Nullable Object interval;
    /**
     * @return Gets or sets a value indicating whether this schedule is enabled.
     * 
     */
    private final @Nullable Boolean isEnabled;
    /**
     * @return Gets or sets the last modified time.
     * 
     */
    private final @Nullable String lastModifiedTime;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Gets or sets the next run time of the schedule.
     * 
     */
    private final @Nullable String nextRun;
    /**
     * @return Gets or sets the next run time&#39;s offset in minutes.
     * 
     */
    private final @Nullable Double nextRunOffsetMinutes;
    /**
     * @return Gets or sets the start time of the schedule.
     * 
     */
    private final @Nullable String startTime;
    /**
     * @return Gets the start time&#39;s offset in minutes.
     * 
     */
    private final Double startTimeOffsetMinutes;
    /**
     * @return Gets or sets the time zone of the schedule.
     * 
     */
    private final @Nullable String timeZone;
    /**
     * @return The type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetScheduleResult(
        @CustomType.Parameter("advancedSchedule") @Nullable AdvancedScheduleResponse advancedSchedule,
        @CustomType.Parameter("creationTime") @Nullable String creationTime,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("expiryTime") @Nullable String expiryTime,
        @CustomType.Parameter("expiryTimeOffsetMinutes") @Nullable Double expiryTimeOffsetMinutes,
        @CustomType.Parameter("frequency") @Nullable String frequency,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("interval") @Nullable Object interval,
        @CustomType.Parameter("isEnabled") @Nullable Boolean isEnabled,
        @CustomType.Parameter("lastModifiedTime") @Nullable String lastModifiedTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nextRun") @Nullable String nextRun,
        @CustomType.Parameter("nextRunOffsetMinutes") @Nullable Double nextRunOffsetMinutes,
        @CustomType.Parameter("startTime") @Nullable String startTime,
        @CustomType.Parameter("startTimeOffsetMinutes") Double startTimeOffsetMinutes,
        @CustomType.Parameter("timeZone") @Nullable String timeZone,
        @CustomType.Parameter("type") String type) {
        this.advancedSchedule = advancedSchedule;
        this.creationTime = creationTime;
        this.description = description;
        this.expiryTime = expiryTime;
        this.expiryTimeOffsetMinutes = expiryTimeOffsetMinutes;
        this.frequency = frequency;
        this.id = id;
        this.interval = interval;
        this.isEnabled = isEnabled;
        this.lastModifiedTime = lastModifiedTime;
        this.name = name;
        this.nextRun = nextRun;
        this.nextRunOffsetMinutes = nextRunOffsetMinutes;
        this.startTime = startTime;
        this.startTimeOffsetMinutes = startTimeOffsetMinutes;
        this.timeZone = timeZone;
        this.type = type;
    }

    /**
     * @return Gets or sets the advanced schedule.
     * 
     */
    public Optional<AdvancedScheduleResponse> advancedSchedule() {
        return Optional.ofNullable(this.advancedSchedule);
    }
    /**
     * @return Gets or sets the creation time.
     * 
     */
    public Optional<String> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * @return Gets or sets the description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Gets or sets the end time of the schedule.
     * 
     */
    public Optional<String> expiryTime() {
        return Optional.ofNullable(this.expiryTime);
    }
    /**
     * @return Gets or sets the expiry time&#39;s offset in minutes.
     * 
     */
    public Optional<Double> expiryTimeOffsetMinutes() {
        return Optional.ofNullable(this.expiryTimeOffsetMinutes);
    }
    /**
     * @return Gets or sets the frequency of the schedule.
     * 
     */
    public Optional<String> frequency() {
        return Optional.ofNullable(this.frequency);
    }
    /**
     * @return Fully qualified resource Id for the resource
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Gets or sets the interval of the schedule.
     * 
     */
    public Optional<Object> interval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * @return Gets or sets a value indicating whether this schedule is enabled.
     * 
     */
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    /**
     * @return Gets or sets the last modified time.
     * 
     */
    public Optional<String> lastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Gets or sets the next run time of the schedule.
     * 
     */
    public Optional<String> nextRun() {
        return Optional.ofNullable(this.nextRun);
    }
    /**
     * @return Gets or sets the next run time&#39;s offset in minutes.
     * 
     */
    public Optional<Double> nextRunOffsetMinutes() {
        return Optional.ofNullable(this.nextRunOffsetMinutes);
    }
    /**
     * @return Gets or sets the start time of the schedule.
     * 
     */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * @return Gets the start time&#39;s offset in minutes.
     * 
     */
    public Double startTimeOffsetMinutes() {
        return this.startTimeOffsetMinutes;
    }
    /**
     * @return Gets or sets the time zone of the schedule.
     * 
     */
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }
    /**
     * @return The type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AdvancedScheduleResponse advancedSchedule;
        private @Nullable String creationTime;
        private @Nullable String description;
        private @Nullable String expiryTime;
        private @Nullable Double expiryTimeOffsetMinutes;
        private @Nullable String frequency;
        private String id;
        private @Nullable Object interval;
        private @Nullable Boolean isEnabled;
        private @Nullable String lastModifiedTime;
        private String name;
        private @Nullable String nextRun;
        private @Nullable Double nextRunOffsetMinutes;
        private @Nullable String startTime;
        private Double startTimeOffsetMinutes;
        private @Nullable String timeZone;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedSchedule = defaults.advancedSchedule;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.expiryTime = defaults.expiryTime;
    	      this.expiryTimeOffsetMinutes = defaults.expiryTimeOffsetMinutes;
    	      this.frequency = defaults.frequency;
    	      this.id = defaults.id;
    	      this.interval = defaults.interval;
    	      this.isEnabled = defaults.isEnabled;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.name = defaults.name;
    	      this.nextRun = defaults.nextRun;
    	      this.nextRunOffsetMinutes = defaults.nextRunOffsetMinutes;
    	      this.startTime = defaults.startTime;
    	      this.startTimeOffsetMinutes = defaults.startTimeOffsetMinutes;
    	      this.timeZone = defaults.timeZone;
    	      this.type = defaults.type;
        }

        public Builder advancedSchedule(@Nullable AdvancedScheduleResponse advancedSchedule) {
            this.advancedSchedule = advancedSchedule;
            return this;
        }
        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder expiryTime(@Nullable String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public Builder expiryTimeOffsetMinutes(@Nullable Double expiryTimeOffsetMinutes) {
            this.expiryTimeOffsetMinutes = expiryTimeOffsetMinutes;
            return this;
        }
        public Builder frequency(@Nullable String frequency) {
            this.frequency = frequency;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder interval(@Nullable Object interval) {
            this.interval = interval;
            return this;
        }
        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Builder lastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nextRun(@Nullable String nextRun) {
            this.nextRun = nextRun;
            return this;
        }
        public Builder nextRunOffsetMinutes(@Nullable Double nextRunOffsetMinutes) {
            this.nextRunOffsetMinutes = nextRunOffsetMinutes;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTimeOffsetMinutes(Double startTimeOffsetMinutes) {
            this.startTimeOffsetMinutes = Objects.requireNonNull(startTimeOffsetMinutes);
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetScheduleResult build() {
            return new GetScheduleResult(advancedSchedule, creationTime, description, expiryTime, expiryTimeOffsetMinutes, frequency, id, interval, isEnabled, lastModifiedTime, name, nextRun, nextRunOffsetMinutes, startTime, startTimeOffsetMinutes, timeZone, type);
        }
    }
}
