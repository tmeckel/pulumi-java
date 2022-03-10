// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the schedule the pipeline runs on.
 * 
 */
public final class GoogleCloudDatapipelinesV1ScheduleSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatapipelinesV1ScheduleSpecResponse Empty = new GoogleCloudDatapipelinesV1ScheduleSpecResponse();

    /**
     * When the next Scheduler job is going to run.
     * 
     */
    @InputImport(name="nextJobTime", required=true)
      private final String nextJobTime;

    public String getNextJobTime() {
        return this.nextJobTime;
    }

    /**
     * Unix-cron format of the schedule. This information is retrieved from the linked Cloud Scheduler.
     * 
     */
    @InputImport(name="schedule", required=true)
      private final String schedule;

    public String getSchedule() {
        return this.schedule;
    }

    /**
     * Timezone ID. This matches the timezone IDs used by the Cloud Scheduler API. If empty, UTC time is assumed.
     * 
     */
    @InputImport(name="timeZone", required=true)
      private final String timeZone;

    public String getTimeZone() {
        return this.timeZone;
    }

    public GoogleCloudDatapipelinesV1ScheduleSpecResponse(
        String nextJobTime,
        String schedule,
        String timeZone) {
        this.nextJobTime = Objects.requireNonNull(nextJobTime, "expected parameter 'nextJobTime' to be non-null");
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.timeZone = Objects.requireNonNull(timeZone, "expected parameter 'timeZone' to be non-null");
    }

    private GoogleCloudDatapipelinesV1ScheduleSpecResponse() {
        this.nextJobTime = null;
        this.schedule = null;
        this.timeZone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatapipelinesV1ScheduleSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextJobTime;
        private String schedule;
        private String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatapipelinesV1ScheduleSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextJobTime = defaults.nextJobTime;
    	      this.schedule = defaults.schedule;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder nextJobTime(String nextJobTime) {
            this.nextJobTime = Objects.requireNonNull(nextJobTime);
            return this;
        }

        public Builder schedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder timeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public GoogleCloudDatapipelinesV1ScheduleSpecResponse build() {
            return new GoogleCloudDatapipelinesV1ScheduleSpecResponse(nextJobTime, schedule, timeZone);
        }
    }
}
