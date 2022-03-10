// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.inputs;

import io.pulumi.azurenative.cache.enums.DayOfWeek;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Patch schedule entry for a Premium Redis Cache.
 * 
 */
public final class ScheduleEntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleEntryArgs Empty = new ScheduleEntryArgs();

    /**
     * Day of the week when a cache can be patched.
     * 
     */
    @InputImport(name="dayOfWeek", required=true)
      private final Input<DayOfWeek> dayOfWeek;

    public Input<DayOfWeek> getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * ISO8601 timespan specifying how much time cache patching can take.
     * 
     */
    @InputImport(name="maintenanceWindow")
      private final @Nullable Input<String> maintenanceWindow;

    public Input<String> getMaintenanceWindow() {
        return this.maintenanceWindow == null ? Input.empty() : this.maintenanceWindow;
    }

    /**
     * Start hour after which cache patching can start.
     * 
     */
    @InputImport(name="startHourUtc", required=true)
      private final Input<Integer> startHourUtc;

    public Input<Integer> getStartHourUtc() {
        return this.startHourUtc;
    }

    public ScheduleEntryArgs(
        Input<DayOfWeek> dayOfWeek,
        @Nullable Input<String> maintenanceWindow,
        Input<Integer> startHourUtc) {
        this.dayOfWeek = Objects.requireNonNull(dayOfWeek, "expected parameter 'dayOfWeek' to be non-null");
        this.maintenanceWindow = maintenanceWindow;
        this.startHourUtc = Objects.requireNonNull(startHourUtc, "expected parameter 'startHourUtc' to be non-null");
    }

    private ScheduleEntryArgs() {
        this.dayOfWeek = Input.empty();
        this.maintenanceWindow = Input.empty();
        this.startHourUtc = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DayOfWeek> dayOfWeek;
        private @Nullable Input<String> maintenanceWindow;
        private Input<Integer> startHourUtc;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.startHourUtc = defaults.startHourUtc;
        }

        public Builder dayOfWeek(Input<DayOfWeek> dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }

        public Builder dayOfWeek(DayOfWeek dayOfWeek) {
            this.dayOfWeek = Input.of(Objects.requireNonNull(dayOfWeek));
            return this;
        }

        public Builder maintenanceWindow(@Nullable Input<String> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder maintenanceWindow(@Nullable String maintenanceWindow) {
            this.maintenanceWindow = Input.ofNullable(maintenanceWindow);
            return this;
        }

        public Builder startHourUtc(Input<Integer> startHourUtc) {
            this.startHourUtc = Objects.requireNonNull(startHourUtc);
            return this;
        }

        public Builder startHourUtc(Integer startHourUtc) {
            this.startHourUtc = Input.of(Objects.requireNonNull(startHourUtc));
            return this;
        }
        public ScheduleEntryArgs build() {
            return new ScheduleEntryArgs(dayOfWeek, maintenanceWindow, startHourUtc);
        }
    }
}
