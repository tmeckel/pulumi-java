// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot;

import com.pulumi.awsnative.iot.inputs.AbortConfigPropertiesArgs;
import com.pulumi.awsnative.iot.inputs.JobExecutionsRetryConfigPropertiesArgs;
import com.pulumi.awsnative.iot.inputs.JobExecutionsRolloutConfigPropertiesArgs;
import com.pulumi.awsnative.iot.inputs.JobTemplateTagArgs;
import com.pulumi.awsnative.iot.inputs.PresignedUrlConfigPropertiesArgs;
import com.pulumi.awsnative.iot.inputs.TimeoutConfigPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTemplateArgs Empty = new JobTemplateArgs();

    /**
     * The criteria that determine when and how a job abort takes place.
     * 
     */
    @Import(name="abortConfig")
    private @Nullable Output<AbortConfigPropertiesArgs> abortConfig;

    /**
     * @return The criteria that determine when and how a job abort takes place.
     * 
     */
    public Optional<Output<AbortConfigPropertiesArgs>> abortConfig() {
        return Optional.ofNullable(this.abortConfig);
    }

    /**
     * A description of the Job Template.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return A description of the Job Template.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * The job document. Required if you don&#39;t specify a value for documentSource.
     * 
     */
    @Import(name="document")
    private @Nullable Output<String> document;

    /**
     * @return The job document. Required if you don&#39;t specify a value for documentSource.
     * 
     */
    public Optional<Output<String>> document() {
        return Optional.ofNullable(this.document);
    }

    /**
     * An S3 link to the job document to use in the template. Required if you don&#39;t specify a value for document.
     * 
     */
    @Import(name="documentSource")
    private @Nullable Output<String> documentSource;

    /**
     * @return An S3 link to the job document to use in the template. Required if you don&#39;t specify a value for document.
     * 
     */
    public Optional<Output<String>> documentSource() {
        return Optional.ofNullable(this.documentSource);
    }

    /**
     * Optional for copying a JobTemplate from a pre-existing Job configuration.
     * 
     */
    @Import(name="jobArn")
    private @Nullable Output<String> jobArn;

    /**
     * @return Optional for copying a JobTemplate from a pre-existing Job configuration.
     * 
     */
    public Optional<Output<String>> jobArn() {
        return Optional.ofNullable(this.jobArn);
    }

    @Import(name="jobExecutionsRetryConfig")
    private @Nullable Output<JobExecutionsRetryConfigPropertiesArgs> jobExecutionsRetryConfig;

    public Optional<Output<JobExecutionsRetryConfigPropertiesArgs>> jobExecutionsRetryConfig() {
        return Optional.ofNullable(this.jobExecutionsRetryConfig);
    }

    /**
     * Allows you to create a staged rollout of a job.
     * 
     */
    @Import(name="jobExecutionsRolloutConfig")
    private @Nullable Output<JobExecutionsRolloutConfigPropertiesArgs> jobExecutionsRolloutConfig;

    /**
     * @return Allows you to create a staged rollout of a job.
     * 
     */
    public Optional<Output<JobExecutionsRolloutConfigPropertiesArgs>> jobExecutionsRolloutConfig() {
        return Optional.ofNullable(this.jobExecutionsRolloutConfig);
    }

    @Import(name="jobTemplateId", required=true)
    private Output<String> jobTemplateId;

    public Output<String> jobTemplateId() {
        return this.jobTemplateId;
    }

    /**
     * Configuration for pre-signed S3 URLs.
     * 
     */
    @Import(name="presignedUrlConfig")
    private @Nullable Output<PresignedUrlConfigPropertiesArgs> presignedUrlConfig;

    /**
     * @return Configuration for pre-signed S3 URLs.
     * 
     */
    public Optional<Output<PresignedUrlConfigPropertiesArgs>> presignedUrlConfig() {
        return Optional.ofNullable(this.presignedUrlConfig);
    }

    /**
     * Metadata that can be used to manage the JobTemplate.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<JobTemplateTagArgs>> tags;

    /**
     * @return Metadata that can be used to manage the JobTemplate.
     * 
     */
    public Optional<Output<List<JobTemplateTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies the amount of time each device has to finish its execution of the job.
     * 
     */
    @Import(name="timeoutConfig")
    private @Nullable Output<TimeoutConfigPropertiesArgs> timeoutConfig;

    /**
     * @return Specifies the amount of time each device has to finish its execution of the job.
     * 
     */
    public Optional<Output<TimeoutConfigPropertiesArgs>> timeoutConfig() {
        return Optional.ofNullable(this.timeoutConfig);
    }

    private JobTemplateArgs() {}

    private JobTemplateArgs(JobTemplateArgs $) {
        this.abortConfig = $.abortConfig;
        this.description = $.description;
        this.document = $.document;
        this.documentSource = $.documentSource;
        this.jobArn = $.jobArn;
        this.jobExecutionsRetryConfig = $.jobExecutionsRetryConfig;
        this.jobExecutionsRolloutConfig = $.jobExecutionsRolloutConfig;
        this.jobTemplateId = $.jobTemplateId;
        this.presignedUrlConfig = $.presignedUrlConfig;
        this.tags = $.tags;
        this.timeoutConfig = $.timeoutConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTemplateArgs $;

        public Builder() {
            $ = new JobTemplateArgs();
        }

        public Builder(JobTemplateArgs defaults) {
            $ = new JobTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param abortConfig The criteria that determine when and how a job abort takes place.
         * 
         * @return builder
         * 
         */
        public Builder abortConfig(@Nullable Output<AbortConfigPropertiesArgs> abortConfig) {
            $.abortConfig = abortConfig;
            return this;
        }

        /**
         * @param abortConfig The criteria that determine when and how a job abort takes place.
         * 
         * @return builder
         * 
         */
        public Builder abortConfig(AbortConfigPropertiesArgs abortConfig) {
            return abortConfig(Output.of(abortConfig));
        }

        /**
         * @param description A description of the Job Template.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the Job Template.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param document The job document. Required if you don&#39;t specify a value for documentSource.
         * 
         * @return builder
         * 
         */
        public Builder document(@Nullable Output<String> document) {
            $.document = document;
            return this;
        }

        /**
         * @param document The job document. Required if you don&#39;t specify a value for documentSource.
         * 
         * @return builder
         * 
         */
        public Builder document(String document) {
            return document(Output.of(document));
        }

        /**
         * @param documentSource An S3 link to the job document to use in the template. Required if you don&#39;t specify a value for document.
         * 
         * @return builder
         * 
         */
        public Builder documentSource(@Nullable Output<String> documentSource) {
            $.documentSource = documentSource;
            return this;
        }

        /**
         * @param documentSource An S3 link to the job document to use in the template. Required if you don&#39;t specify a value for document.
         * 
         * @return builder
         * 
         */
        public Builder documentSource(String documentSource) {
            return documentSource(Output.of(documentSource));
        }

        /**
         * @param jobArn Optional for copying a JobTemplate from a pre-existing Job configuration.
         * 
         * @return builder
         * 
         */
        public Builder jobArn(@Nullable Output<String> jobArn) {
            $.jobArn = jobArn;
            return this;
        }

        /**
         * @param jobArn Optional for copying a JobTemplate from a pre-existing Job configuration.
         * 
         * @return builder
         * 
         */
        public Builder jobArn(String jobArn) {
            return jobArn(Output.of(jobArn));
        }

        public Builder jobExecutionsRetryConfig(@Nullable Output<JobExecutionsRetryConfigPropertiesArgs> jobExecutionsRetryConfig) {
            $.jobExecutionsRetryConfig = jobExecutionsRetryConfig;
            return this;
        }

        public Builder jobExecutionsRetryConfig(JobExecutionsRetryConfigPropertiesArgs jobExecutionsRetryConfig) {
            return jobExecutionsRetryConfig(Output.of(jobExecutionsRetryConfig));
        }

        /**
         * @param jobExecutionsRolloutConfig Allows you to create a staged rollout of a job.
         * 
         * @return builder
         * 
         */
        public Builder jobExecutionsRolloutConfig(@Nullable Output<JobExecutionsRolloutConfigPropertiesArgs> jobExecutionsRolloutConfig) {
            $.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
            return this;
        }

        /**
         * @param jobExecutionsRolloutConfig Allows you to create a staged rollout of a job.
         * 
         * @return builder
         * 
         */
        public Builder jobExecutionsRolloutConfig(JobExecutionsRolloutConfigPropertiesArgs jobExecutionsRolloutConfig) {
            return jobExecutionsRolloutConfig(Output.of(jobExecutionsRolloutConfig));
        }

        public Builder jobTemplateId(Output<String> jobTemplateId) {
            $.jobTemplateId = jobTemplateId;
            return this;
        }

        public Builder jobTemplateId(String jobTemplateId) {
            return jobTemplateId(Output.of(jobTemplateId));
        }

        /**
         * @param presignedUrlConfig Configuration for pre-signed S3 URLs.
         * 
         * @return builder
         * 
         */
        public Builder presignedUrlConfig(@Nullable Output<PresignedUrlConfigPropertiesArgs> presignedUrlConfig) {
            $.presignedUrlConfig = presignedUrlConfig;
            return this;
        }

        /**
         * @param presignedUrlConfig Configuration for pre-signed S3 URLs.
         * 
         * @return builder
         * 
         */
        public Builder presignedUrlConfig(PresignedUrlConfigPropertiesArgs presignedUrlConfig) {
            return presignedUrlConfig(Output.of(presignedUrlConfig));
        }

        /**
         * @param tags Metadata that can be used to manage the JobTemplate.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<JobTemplateTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Metadata that can be used to manage the JobTemplate.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<JobTemplateTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Metadata that can be used to manage the JobTemplate.
         * 
         * @return builder
         * 
         */
        public Builder tags(JobTemplateTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param timeoutConfig Specifies the amount of time each device has to finish its execution of the job.
         * 
         * @return builder
         * 
         */
        public Builder timeoutConfig(@Nullable Output<TimeoutConfigPropertiesArgs> timeoutConfig) {
            $.timeoutConfig = timeoutConfig;
            return this;
        }

        /**
         * @param timeoutConfig Specifies the amount of time each device has to finish its execution of the job.
         * 
         * @return builder
         * 
         */
        public Builder timeoutConfig(TimeoutConfigPropertiesArgs timeoutConfig) {
            return timeoutConfig(Output.of(timeoutConfig));
        }

        public JobTemplateArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.jobTemplateId = Objects.requireNonNull($.jobTemplateId, "expected parameter 'jobTemplateId' to be non-null");
            return $;
        }
    }

}
