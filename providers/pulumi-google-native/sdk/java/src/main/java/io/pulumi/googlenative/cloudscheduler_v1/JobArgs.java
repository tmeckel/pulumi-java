// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudscheduler_v1.inputs.AppEngineHttpTargetArgs;
import io.pulumi.googlenative.cloudscheduler_v1.inputs.HttpTargetArgs;
import io.pulumi.googlenative.cloudscheduler_v1.inputs.PubsubTargetArgs;
import io.pulumi.googlenative.cloudscheduler_v1.inputs.RetryConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * App Engine HTTP target.
     * 
     */
    @InputImport(name="appEngineHttpTarget")
      private final @Nullable Input<AppEngineHttpTargetArgs> appEngineHttpTarget;

    public Input<AppEngineHttpTargetArgs> getAppEngineHttpTarget() {
        return this.appEngineHttpTarget == null ? Input.empty() : this.appEngineHttpTarget;
    }

    /**
     * The deadline for job attempts. If the request handler does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. The failed attempt can be viewed in execution logs. Cloud Scheduler will retry the job according to the RetryConfig. The allowed duration for this deadline is: * For HTTP targets, between 15 seconds and 30 minutes. * For App Engine HTTP targets, between 15 seconds and 24 hours 15 seconds.
     * 
     */
    @InputImport(name="attemptDeadline")
      private final @Nullable Input<String> attemptDeadline;

    public Input<String> getAttemptDeadline() {
        return this.attemptDeadline == null ? Input.empty() : this.attemptDeadline;
    }

    /**
     * Optionally caller-specified in CreateJob or UpdateJob. A human-readable description for the job. This string must not contain more than 500 characters.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * HTTP target.
     * 
     */
    @InputImport(name="httpTarget")
      private final @Nullable Input<HttpTargetArgs> httpTarget;

    public Input<HttpTargetArgs> getHttpTarget() {
        return this.httpTarget == null ? Input.empty() : this.httpTarget;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optionally caller-specified in CreateJob, after which it becomes output only. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the job's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Pub/Sub target.
     * 
     */
    @InputImport(name="pubsubTarget")
      private final @Nullable Input<PubsubTargetArgs> pubsubTarget;

    public Input<PubsubTargetArgs> getPubsubTarget() {
        return this.pubsubTarget == null ? Input.empty() : this.pubsubTarget;
    }

    /**
     * Settings that determine the retry behavior.
     * 
     */
    @InputImport(name="retryConfig")
      private final @Nullable Input<RetryConfigArgs> retryConfig;

    public Input<RetryConfigArgs> getRetryConfig() {
        return this.retryConfig == null ? Input.empty() : this.retryConfig;
    }

    /**
     * Required, except when used with UpdateJob. Describes the schedule on which the job will be executed. The schedule can be either of the following types: * [Crontab](http://en.wikipedia.org/wiki/Cron#Overview) * English-like [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules) As a general rule, execution `n + 1` of a job will not begin until execution `n` has finished. Cloud Scheduler will never allow two simultaneously outstanding executions. For example, this implies that if the `n+1`th execution is scheduled to run at 16:00 but the `n`th execution takes until 16:15, the `n+1`th execution will not start until `16:15`. A scheduled start time will be delayed if the previous execution has not ended when its scheduled time occurs. If retry_count > 0 and a job attempt fails, the job will be tried a total of retry_count times, with exponential backoff, until the next scheduled start time.
     * 
     */
    @InputImport(name="schedule")
      private final @Nullable Input<String> schedule;

    public Input<String> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    /**
     * Specifies the time zone to be used in interpreting schedule. The value of this field must be a time zone name from the [tz database](http://en.wikipedia.org/wiki/Tz_database). Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string "utc". If a time zone is not specified, the default will be in UTC (also known as GMT).
     * 
     */
    @InputImport(name="timeZone")
      private final @Nullable Input<String> timeZone;

    public Input<String> getTimeZone() {
        return this.timeZone == null ? Input.empty() : this.timeZone;
    }

    public JobArgs(
        @Nullable Input<AppEngineHttpTargetArgs> appEngineHttpTarget,
        @Nullable Input<String> attemptDeadline,
        @Nullable Input<String> description,
        @Nullable Input<HttpTargetArgs> httpTarget,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<PubsubTargetArgs> pubsubTarget,
        @Nullable Input<RetryConfigArgs> retryConfig,
        @Nullable Input<String> schedule,
        @Nullable Input<String> timeZone) {
        this.appEngineHttpTarget = appEngineHttpTarget;
        this.attemptDeadline = attemptDeadline;
        this.description = description;
        this.httpTarget = httpTarget;
        this.location = location;
        this.name = name;
        this.project = project;
        this.pubsubTarget = pubsubTarget;
        this.retryConfig = retryConfig;
        this.schedule = schedule;
        this.timeZone = timeZone;
    }

    private JobArgs() {
        this.appEngineHttpTarget = Input.empty();
        this.attemptDeadline = Input.empty();
        this.description = Input.empty();
        this.httpTarget = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.pubsubTarget = Input.empty();
        this.retryConfig = Input.empty();
        this.schedule = Input.empty();
        this.timeZone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AppEngineHttpTargetArgs> appEngineHttpTarget;
        private @Nullable Input<String> attemptDeadline;
        private @Nullable Input<String> description;
        private @Nullable Input<HttpTargetArgs> httpTarget;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<PubsubTargetArgs> pubsubTarget;
        private @Nullable Input<RetryConfigArgs> retryConfig;
        private @Nullable Input<String> schedule;
        private @Nullable Input<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineHttpTarget = defaults.appEngineHttpTarget;
    	      this.attemptDeadline = defaults.attemptDeadline;
    	      this.description = defaults.description;
    	      this.httpTarget = defaults.httpTarget;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pubsubTarget = defaults.pubsubTarget;
    	      this.retryConfig = defaults.retryConfig;
    	      this.schedule = defaults.schedule;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder appEngineHttpTarget(@Nullable Input<AppEngineHttpTargetArgs> appEngineHttpTarget) {
            this.appEngineHttpTarget = appEngineHttpTarget;
            return this;
        }

        public Builder appEngineHttpTarget(@Nullable AppEngineHttpTargetArgs appEngineHttpTarget) {
            this.appEngineHttpTarget = Input.ofNullable(appEngineHttpTarget);
            return this;
        }

        public Builder attemptDeadline(@Nullable Input<String> attemptDeadline) {
            this.attemptDeadline = attemptDeadline;
            return this;
        }

        public Builder attemptDeadline(@Nullable String attemptDeadline) {
            this.attemptDeadline = Input.ofNullable(attemptDeadline);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder httpTarget(@Nullable Input<HttpTargetArgs> httpTarget) {
            this.httpTarget = httpTarget;
            return this;
        }

        public Builder httpTarget(@Nullable HttpTargetArgs httpTarget) {
            this.httpTarget = Input.ofNullable(httpTarget);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder pubsubTarget(@Nullable Input<PubsubTargetArgs> pubsubTarget) {
            this.pubsubTarget = pubsubTarget;
            return this;
        }

        public Builder pubsubTarget(@Nullable PubsubTargetArgs pubsubTarget) {
            this.pubsubTarget = Input.ofNullable(pubsubTarget);
            return this;
        }

        public Builder retryConfig(@Nullable Input<RetryConfigArgs> retryConfig) {
            this.retryConfig = retryConfig;
            return this;
        }

        public Builder retryConfig(@Nullable RetryConfigArgs retryConfig) {
            this.retryConfig = Input.ofNullable(retryConfig);
            return this;
        }

        public Builder schedule(@Nullable Input<String> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder schedule(@Nullable String schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder timeZone(@Nullable Input<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Input.ofNullable(timeZone);
            return this;
        }
        public JobArgs build() {
            return new JobArgs(appEngineHttpTarget, attemptDeadline, description, httpTarget, location, name, project, pubsubTarget, retryConfig, schedule, timeZone);
        }
    }
}
