// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1beta1.inputs.TimeWindowArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents an arbitrary window of time that recurs.
 * 
 */
public final class RecurringTimeWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecurringTimeWindowArgs Empty = new RecurringTimeWindowArgs();

    /**
     * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how this window reccurs. They go on for the span of time between the start and end time. For example, to have something repeat every weekday, you'd use: `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR` To repeat some window daily (equivalent to the DailyMaintenanceWindow): `FREQ=DAILY` For the first weekend of every month: `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU` This specifies how frequently the window starts. Eg, if you wanted to have a 9-5 UTC-4 window every weekday, you'd use something like: ```start time = 2019-01-01T09:00:00-0400 end time = 2019-01-01T17:00:00-0400 recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR``` Windows can span multiple days. Eg, to make the window encompass every weekend from midnight Saturday till the last minute of Sunday UTC: ```start time = 2019-01-05T00:00:00Z end time = 2019-01-07T23:59:00Z recurrence = FREQ=WEEKLY;BYDAY=SA``` Note the start and end time's specific dates are largely arbitrary except to specify duration of the window and when it first starts. The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
     * 
     */
    @InputImport(name="recurrence")
      private final @Nullable Input<String> recurrence;

    public Input<String> getRecurrence() {
        return this.recurrence == null ? Input.empty() : this.recurrence;
    }

    /**
     * The window of the first recurrence.
     * 
     */
    @InputImport(name="window")
      private final @Nullable Input<TimeWindowArgs> window;

    public Input<TimeWindowArgs> getWindow() {
        return this.window == null ? Input.empty() : this.window;
    }

    public RecurringTimeWindowArgs(
        @Nullable Input<String> recurrence,
        @Nullable Input<TimeWindowArgs> window) {
        this.recurrence = recurrence;
        this.window = window;
    }

    private RecurringTimeWindowArgs() {
        this.recurrence = Input.empty();
        this.window = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurringTimeWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> recurrence;
        private @Nullable Input<TimeWindowArgs> window;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurringTimeWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrence = defaults.recurrence;
    	      this.window = defaults.window;
        }

        public Builder recurrence(@Nullable Input<String> recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        public Builder recurrence(@Nullable String recurrence) {
            this.recurrence = Input.ofNullable(recurrence);
            return this;
        }

        public Builder window(@Nullable Input<TimeWindowArgs> window) {
            this.window = window;
            return this;
        }

        public Builder window(@Nullable TimeWindowArgs window) {
            this.window = Input.ofNullable(window);
            return this;
        }
        public RecurringTimeWindowArgs build() {
            return new RecurringTimeWindowArgs(recurrence, window);
        }
    }
}
