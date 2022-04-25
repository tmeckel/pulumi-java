// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudscheduler_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudscheduler_v1beta1.inputs.AppEngineHttpTargetArgs;
import com.pulumi.googlenative.cloudscheduler_v1beta1.inputs.HttpTargetArgs;
import com.pulumi.googlenative.cloudscheduler_v1beta1.inputs.PubsubTargetArgs;
import com.pulumi.googlenative.cloudscheduler_v1beta1.inputs.RetryConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * App Engine HTTP target.
     * 
     */
    @Import(name="appEngineHttpTarget")
    private @Nullable Output<AppEngineHttpTargetArgs> appEngineHttpTarget;

    /**
     * @return App Engine HTTP target.
     * 
     */
    public Optional<Output<AppEngineHttpTargetArgs>> appEngineHttpTarget() {
        return Optional.ofNullable(this.appEngineHttpTarget);
    }

    /**
     * The deadline for job attempts. If the request handler does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. The failed attempt can be viewed in execution logs. Cloud Scheduler will retry the job according to the RetryConfig. The allowed duration for this deadline is: * For HTTP targets, between 15 seconds and 30 minutes. * For App Engine HTTP targets, between 15 seconds and 24 hours 15 seconds. * For PubSub targets, this field is ignored.
     * 
     */
    @Import(name="attemptDeadline")
    private @Nullable Output<String> attemptDeadline;

    /**
     * @return The deadline for job attempts. If the request handler does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. The failed attempt can be viewed in execution logs. Cloud Scheduler will retry the job according to the RetryConfig. The allowed duration for this deadline is: * For HTTP targets, between 15 seconds and 30 minutes. * For App Engine HTTP targets, between 15 seconds and 24 hours 15 seconds. * For PubSub targets, this field is ignored.
     * 
     */
    public Optional<Output<String>> attemptDeadline() {
        return Optional.ofNullable(this.attemptDeadline);
    }

    /**
     * Optionally caller-specified in CreateJob or UpdateJob. A human-readable description for the job. This string must not contain more than 500 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optionally caller-specified in CreateJob or UpdateJob. A human-readable description for the job. This string must not contain more than 500 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * HTTP target.
     * 
     */
    @Import(name="httpTarget")
    private @Nullable Output<HttpTargetArgs> httpTarget;

    /**
     * @return HTTP target.
     * 
     */
    public Optional<Output<HttpTargetArgs>> httpTarget() {
        return Optional.ofNullable(this.httpTarget);
    }

    /**
     * Immutable. This field is used to manage the legacy App Engine Cron jobs using the Cloud Scheduler API. If the field is set to true, the job will be considered a legacy job. Note that App Engine Cron jobs have fewer features than Cloud Scheduler jobs, e.g., are only limited to App Engine targets.
     * 
     */
    @Import(name="legacyAppEngineCron")
    private @Nullable Output<Boolean> legacyAppEngineCron;

    /**
     * @return Immutable. This field is used to manage the legacy App Engine Cron jobs using the Cloud Scheduler API. If the field is set to true, the job will be considered a legacy job. Note that App Engine Cron jobs have fewer features than Cloud Scheduler jobs, e.g., are only limited to App Engine targets.
     * 
     */
    public Optional<Output<Boolean>> legacyAppEngineCron() {
        return Optional.ofNullable(this.legacyAppEngineCron);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Optionally caller-specified in CreateJob, after which it becomes output only. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the job&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Optionally caller-specified in CreateJob, after which it becomes output only. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the job&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Pub/Sub target.
     * 
     */
    @Import(name="pubsubTarget")
    private @Nullable Output<PubsubTargetArgs> pubsubTarget;

    /**
     * @return Pub/Sub target.
     * 
     */
    public Optional<Output<PubsubTargetArgs>> pubsubTarget() {
        return Optional.ofNullable(this.pubsubTarget);
    }

    /**
     * Settings that determine the retry behavior.
     * 
     */
    @Import(name="retryConfig")
    private @Nullable Output<RetryConfigArgs> retryConfig;

    /**
     * @return Settings that determine the retry behavior.
     * 
     */
    public Optional<Output<RetryConfigArgs>> retryConfig() {
        return Optional.ofNullable(this.retryConfig);
    }

    /**
     * Required, except when used with UpdateJob. Describes the schedule on which the job will be executed. The schedule can be either of the following types: * [Crontab](http://en.wikipedia.org/wiki/Cron#Overview) * English-like [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules) As a general rule, execution `n + 1` of a job will not begin until execution `n` has finished. Cloud Scheduler will never allow two simultaneously outstanding executions. For example, this implies that if the `n+1`th execution is scheduled to run at 16:00 but the `n`th execution takes until 16:15, the `n+1`th execution will not start until `16:15`. A scheduled start time will be delayed if the previous execution has not ended when its scheduled time occurs. If retry_count &gt; 0 and a job attempt fails, the job will be tried a total of retry_count times, with exponential backoff, until the next scheduled start time.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<String> schedule;

    /**
     * @return Required, except when used with UpdateJob. Describes the schedule on which the job will be executed. The schedule can be either of the following types: * [Crontab](http://en.wikipedia.org/wiki/Cron#Overview) * English-like [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules) As a general rule, execution `n + 1` of a job will not begin until execution `n` has finished. Cloud Scheduler will never allow two simultaneously outstanding executions. For example, this implies that if the `n+1`th execution is scheduled to run at 16:00 but the `n`th execution takes until 16:15, the `n+1`th execution will not start until `16:15`. A scheduled start time will be delayed if the previous execution has not ended when its scheduled time occurs. If retry_count &gt; 0 and a job attempt fails, the job will be tried a total of retry_count times, with exponential backoff, until the next scheduled start time.
     * 
     */
    public Optional<Output<String>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * Specifies the time zone to be used in interpreting schedule. The value of this field must be a time zone name from the [tz database](http://en.wikipedia.org/wiki/Tz_database). Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string &#34;utc&#34;. If a time zone is not specified, the default will be in UTC (also known as GMT).
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return Specifies the time zone to be used in interpreting schedule. The value of this field must be a time zone name from the [tz database](http://en.wikipedia.org/wiki/Tz_database). Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string &#34;utc&#34;. If a time zone is not specified, the default will be in UTC (also known as GMT).
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private JobArgs() {}

    private JobArgs(JobArgs $) {
        this.appEngineHttpTarget = $.appEngineHttpTarget;
        this.attemptDeadline = $.attemptDeadline;
        this.description = $.description;
        this.httpTarget = $.httpTarget;
        this.legacyAppEngineCron = $.legacyAppEngineCron;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.pubsubTarget = $.pubsubTarget;
        this.retryConfig = $.retryConfig;
        this.schedule = $.schedule;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobArgs $;

        public Builder() {
            $ = new JobArgs();
        }

        public Builder(JobArgs defaults) {
            $ = new JobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appEngineHttpTarget App Engine HTTP target.
         * 
         * @return builder
         * 
         */
        public Builder appEngineHttpTarget(@Nullable Output<AppEngineHttpTargetArgs> appEngineHttpTarget) {
            $.appEngineHttpTarget = appEngineHttpTarget;
            return this;
        }

        /**
         * @param appEngineHttpTarget App Engine HTTP target.
         * 
         * @return builder
         * 
         */
        public Builder appEngineHttpTarget(AppEngineHttpTargetArgs appEngineHttpTarget) {
            return appEngineHttpTarget(Output.of(appEngineHttpTarget));
        }

        /**
         * @param attemptDeadline The deadline for job attempts. If the request handler does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. The failed attempt can be viewed in execution logs. Cloud Scheduler will retry the job according to the RetryConfig. The allowed duration for this deadline is: * For HTTP targets, between 15 seconds and 30 minutes. * For App Engine HTTP targets, between 15 seconds and 24 hours 15 seconds. * For PubSub targets, this field is ignored.
         * 
         * @return builder
         * 
         */
        public Builder attemptDeadline(@Nullable Output<String> attemptDeadline) {
            $.attemptDeadline = attemptDeadline;
            return this;
        }

        /**
         * @param attemptDeadline The deadline for job attempts. If the request handler does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. The failed attempt can be viewed in execution logs. Cloud Scheduler will retry the job according to the RetryConfig. The allowed duration for this deadline is: * For HTTP targets, between 15 seconds and 30 minutes. * For App Engine HTTP targets, between 15 seconds and 24 hours 15 seconds. * For PubSub targets, this field is ignored.
         * 
         * @return builder
         * 
         */
        public Builder attemptDeadline(String attemptDeadline) {
            return attemptDeadline(Output.of(attemptDeadline));
        }

        /**
         * @param description Optionally caller-specified in CreateJob or UpdateJob. A human-readable description for the job. This string must not contain more than 500 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optionally caller-specified in CreateJob or UpdateJob. A human-readable description for the job. This string must not contain more than 500 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param httpTarget HTTP target.
         * 
         * @return builder
         * 
         */
        public Builder httpTarget(@Nullable Output<HttpTargetArgs> httpTarget) {
            $.httpTarget = httpTarget;
            return this;
        }

        /**
         * @param httpTarget HTTP target.
         * 
         * @return builder
         * 
         */
        public Builder httpTarget(HttpTargetArgs httpTarget) {
            return httpTarget(Output.of(httpTarget));
        }

        /**
         * @param legacyAppEngineCron Immutable. This field is used to manage the legacy App Engine Cron jobs using the Cloud Scheduler API. If the field is set to true, the job will be considered a legacy job. Note that App Engine Cron jobs have fewer features than Cloud Scheduler jobs, e.g., are only limited to App Engine targets.
         * 
         * @return builder
         * 
         */
        public Builder legacyAppEngineCron(@Nullable Output<Boolean> legacyAppEngineCron) {
            $.legacyAppEngineCron = legacyAppEngineCron;
            return this;
        }

        /**
         * @param legacyAppEngineCron Immutable. This field is used to manage the legacy App Engine Cron jobs using the Cloud Scheduler API. If the field is set to true, the job will be considered a legacy job. Note that App Engine Cron jobs have fewer features than Cloud Scheduler jobs, e.g., are only limited to App Engine targets.
         * 
         * @return builder
         * 
         */
        public Builder legacyAppEngineCron(Boolean legacyAppEngineCron) {
            return legacyAppEngineCron(Output.of(legacyAppEngineCron));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Optionally caller-specified in CreateJob, after which it becomes output only. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the job&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Optionally caller-specified in CreateJob, after which it becomes output only. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the job&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param pubsubTarget Pub/Sub target.
         * 
         * @return builder
         * 
         */
        public Builder pubsubTarget(@Nullable Output<PubsubTargetArgs> pubsubTarget) {
            $.pubsubTarget = pubsubTarget;
            return this;
        }

        /**
         * @param pubsubTarget Pub/Sub target.
         * 
         * @return builder
         * 
         */
        public Builder pubsubTarget(PubsubTargetArgs pubsubTarget) {
            return pubsubTarget(Output.of(pubsubTarget));
        }

        /**
         * @param retryConfig Settings that determine the retry behavior.
         * 
         * @return builder
         * 
         */
        public Builder retryConfig(@Nullable Output<RetryConfigArgs> retryConfig) {
            $.retryConfig = retryConfig;
            return this;
        }

        /**
         * @param retryConfig Settings that determine the retry behavior.
         * 
         * @return builder
         * 
         */
        public Builder retryConfig(RetryConfigArgs retryConfig) {
            return retryConfig(Output.of(retryConfig));
        }

        /**
         * @param schedule Required, except when used with UpdateJob. Describes the schedule on which the job will be executed. The schedule can be either of the following types: * [Crontab](http://en.wikipedia.org/wiki/Cron#Overview) * English-like [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules) As a general rule, execution `n + 1` of a job will not begin until execution `n` has finished. Cloud Scheduler will never allow two simultaneously outstanding executions. For example, this implies that if the `n+1`th execution is scheduled to run at 16:00 but the `n`th execution takes until 16:15, the `n+1`th execution will not start until `16:15`. A scheduled start time will be delayed if the previous execution has not ended when its scheduled time occurs. If retry_count &gt; 0 and a job attempt fails, the job will be tried a total of retry_count times, with exponential backoff, until the next scheduled start time.
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule Required, except when used with UpdateJob. Describes the schedule on which the job will be executed. The schedule can be either of the following types: * [Crontab](http://en.wikipedia.org/wiki/Cron#Overview) * English-like [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules) As a general rule, execution `n + 1` of a job will not begin until execution `n` has finished. Cloud Scheduler will never allow two simultaneously outstanding executions. For example, this implies that if the `n+1`th execution is scheduled to run at 16:00 but the `n`th execution takes until 16:15, the `n+1`th execution will not start until `16:15`. A scheduled start time will be delayed if the previous execution has not ended when its scheduled time occurs. If retry_count &gt; 0 and a job attempt fails, the job will be tried a total of retry_count times, with exponential backoff, until the next scheduled start time.
         * 
         * @return builder
         * 
         */
        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param timeZone Specifies the time zone to be used in interpreting schedule. The value of this field must be a time zone name from the [tz database](http://en.wikipedia.org/wiki/Tz_database). Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string &#34;utc&#34;. If a time zone is not specified, the default will be in UTC (also known as GMT).
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone Specifies the time zone to be used in interpreting schedule. The value of this field must be a time zone name from the [tz database](http://en.wikipedia.org/wiki/Tz_database). Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string &#34;utc&#34;. If a time zone is not specified, the default will be in UTC (also known as GMT).
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public JobArgs build() {
            return $;
        }
    }

}
