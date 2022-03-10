// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.inputs.AbortConfigPropertiesArgs;
import io.pulumi.awsnative.iot.inputs.JobExecutionsRetryConfigPropertiesArgs;
import io.pulumi.awsnative.iot.inputs.JobExecutionsRolloutConfigPropertiesArgs;
import io.pulumi.awsnative.iot.inputs.JobTemplateTagArgs;
import io.pulumi.awsnative.iot.inputs.PresignedUrlConfigPropertiesArgs;
import io.pulumi.awsnative.iot.inputs.TimeoutConfigPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobTemplateArgs Empty = new JobTemplateArgs();

    /**
     * The criteria that determine when and how a job abort takes place.
     * 
     */
    @InputImport(name="abortConfig")
      private final @Nullable Input<AbortConfigPropertiesArgs> abortConfig;

    public Input<AbortConfigPropertiesArgs> getAbortConfig() {
        return this.abortConfig == null ? Input.empty() : this.abortConfig;
    }

    /**
     * A description of the Job Template.
     * 
     */
    @InputImport(name="description", required=true)
      private final Input<String> description;

    public Input<String> getDescription() {
        return this.description;
    }

    /**
     * The job document. Required if you don't specify a value for documentSource.
     * 
     */
    @InputImport(name="document")
      private final @Nullable Input<String> document;

    public Input<String> getDocument() {
        return this.document == null ? Input.empty() : this.document;
    }

    /**
     * An S3 link to the job document to use in the template. Required if you don't specify a value for document.
     * 
     */
    @InputImport(name="documentSource")
      private final @Nullable Input<String> documentSource;

    public Input<String> getDocumentSource() {
        return this.documentSource == null ? Input.empty() : this.documentSource;
    }

    /**
     * Optional for copying a JobTemplate from a pre-existing Job configuration.
     * 
     */
    @InputImport(name="jobArn")
      private final @Nullable Input<String> jobArn;

    public Input<String> getJobArn() {
        return this.jobArn == null ? Input.empty() : this.jobArn;
    }

    @InputImport(name="jobExecutionsRetryConfig")
      private final @Nullable Input<JobExecutionsRetryConfigPropertiesArgs> jobExecutionsRetryConfig;

    public Input<JobExecutionsRetryConfigPropertiesArgs> getJobExecutionsRetryConfig() {
        return this.jobExecutionsRetryConfig == null ? Input.empty() : this.jobExecutionsRetryConfig;
    }

    /**
     * Allows you to create a staged rollout of a job.
     * 
     */
    @InputImport(name="jobExecutionsRolloutConfig")
      private final @Nullable Input<JobExecutionsRolloutConfigPropertiesArgs> jobExecutionsRolloutConfig;

    public Input<JobExecutionsRolloutConfigPropertiesArgs> getJobExecutionsRolloutConfig() {
        return this.jobExecutionsRolloutConfig == null ? Input.empty() : this.jobExecutionsRolloutConfig;
    }

    @InputImport(name="jobTemplateId", required=true)
      private final Input<String> jobTemplateId;

    public Input<String> getJobTemplateId() {
        return this.jobTemplateId;
    }

    /**
     * Configuration for pre-signed S3 URLs.
     * 
     */
    @InputImport(name="presignedUrlConfig")
      private final @Nullable Input<PresignedUrlConfigPropertiesArgs> presignedUrlConfig;

    public Input<PresignedUrlConfigPropertiesArgs> getPresignedUrlConfig() {
        return this.presignedUrlConfig == null ? Input.empty() : this.presignedUrlConfig;
    }

    /**
     * Metadata that can be used to manage the JobTemplate.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<JobTemplateTagArgs>> tags;

    public Input<List<JobTemplateTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Specifies the amount of time each device has to finish its execution of the job.
     * 
     */
    @InputImport(name="timeoutConfig")
      private final @Nullable Input<TimeoutConfigPropertiesArgs> timeoutConfig;

    public Input<TimeoutConfigPropertiesArgs> getTimeoutConfig() {
        return this.timeoutConfig == null ? Input.empty() : this.timeoutConfig;
    }

    public JobTemplateArgs(
        @Nullable Input<AbortConfigPropertiesArgs> abortConfig,
        Input<String> description,
        @Nullable Input<String> document,
        @Nullable Input<String> documentSource,
        @Nullable Input<String> jobArn,
        @Nullable Input<JobExecutionsRetryConfigPropertiesArgs> jobExecutionsRetryConfig,
        @Nullable Input<JobExecutionsRolloutConfigPropertiesArgs> jobExecutionsRolloutConfig,
        Input<String> jobTemplateId,
        @Nullable Input<PresignedUrlConfigPropertiesArgs> presignedUrlConfig,
        @Nullable Input<List<JobTemplateTagArgs>> tags,
        @Nullable Input<TimeoutConfigPropertiesArgs> timeoutConfig) {
        this.abortConfig = abortConfig;
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.document = document;
        this.documentSource = documentSource;
        this.jobArn = jobArn;
        this.jobExecutionsRetryConfig = jobExecutionsRetryConfig;
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
        this.jobTemplateId = Objects.requireNonNull(jobTemplateId, "expected parameter 'jobTemplateId' to be non-null");
        this.presignedUrlConfig = presignedUrlConfig;
        this.tags = tags;
        this.timeoutConfig = timeoutConfig;
    }

    private JobTemplateArgs() {
        this.abortConfig = Input.empty();
        this.description = Input.empty();
        this.document = Input.empty();
        this.documentSource = Input.empty();
        this.jobArn = Input.empty();
        this.jobExecutionsRetryConfig = Input.empty();
        this.jobExecutionsRolloutConfig = Input.empty();
        this.jobTemplateId = Input.empty();
        this.presignedUrlConfig = Input.empty();
        this.tags = Input.empty();
        this.timeoutConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AbortConfigPropertiesArgs> abortConfig;
        private Input<String> description;
        private @Nullable Input<String> document;
        private @Nullable Input<String> documentSource;
        private @Nullable Input<String> jobArn;
        private @Nullable Input<JobExecutionsRetryConfigPropertiesArgs> jobExecutionsRetryConfig;
        private @Nullable Input<JobExecutionsRolloutConfigPropertiesArgs> jobExecutionsRolloutConfig;
        private Input<String> jobTemplateId;
        private @Nullable Input<PresignedUrlConfigPropertiesArgs> presignedUrlConfig;
        private @Nullable Input<List<JobTemplateTagArgs>> tags;
        private @Nullable Input<TimeoutConfigPropertiesArgs> timeoutConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortConfig = defaults.abortConfig;
    	      this.description = defaults.description;
    	      this.document = defaults.document;
    	      this.documentSource = defaults.documentSource;
    	      this.jobArn = defaults.jobArn;
    	      this.jobExecutionsRetryConfig = defaults.jobExecutionsRetryConfig;
    	      this.jobExecutionsRolloutConfig = defaults.jobExecutionsRolloutConfig;
    	      this.jobTemplateId = defaults.jobTemplateId;
    	      this.presignedUrlConfig = defaults.presignedUrlConfig;
    	      this.tags = defaults.tags;
    	      this.timeoutConfig = defaults.timeoutConfig;
        }

        public Builder abortConfig(@Nullable Input<AbortConfigPropertiesArgs> abortConfig) {
            this.abortConfig = abortConfig;
            return this;
        }

        public Builder abortConfig(@Nullable AbortConfigPropertiesArgs abortConfig) {
            this.abortConfig = Input.ofNullable(abortConfig);
            return this;
        }

        public Builder description(Input<String> description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder description(String description) {
            this.description = Input.of(Objects.requireNonNull(description));
            return this;
        }

        public Builder document(@Nullable Input<String> document) {
            this.document = document;
            return this;
        }

        public Builder document(@Nullable String document) {
            this.document = Input.ofNullable(document);
            return this;
        }

        public Builder documentSource(@Nullable Input<String> documentSource) {
            this.documentSource = documentSource;
            return this;
        }

        public Builder documentSource(@Nullable String documentSource) {
            this.documentSource = Input.ofNullable(documentSource);
            return this;
        }

        public Builder jobArn(@Nullable Input<String> jobArn) {
            this.jobArn = jobArn;
            return this;
        }

        public Builder jobArn(@Nullable String jobArn) {
            this.jobArn = Input.ofNullable(jobArn);
            return this;
        }

        public Builder jobExecutionsRetryConfig(@Nullable Input<JobExecutionsRetryConfigPropertiesArgs> jobExecutionsRetryConfig) {
            this.jobExecutionsRetryConfig = jobExecutionsRetryConfig;
            return this;
        }

        public Builder jobExecutionsRetryConfig(@Nullable JobExecutionsRetryConfigPropertiesArgs jobExecutionsRetryConfig) {
            this.jobExecutionsRetryConfig = Input.ofNullable(jobExecutionsRetryConfig);
            return this;
        }

        public Builder jobExecutionsRolloutConfig(@Nullable Input<JobExecutionsRolloutConfigPropertiesArgs> jobExecutionsRolloutConfig) {
            this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
            return this;
        }

        public Builder jobExecutionsRolloutConfig(@Nullable JobExecutionsRolloutConfigPropertiesArgs jobExecutionsRolloutConfig) {
            this.jobExecutionsRolloutConfig = Input.ofNullable(jobExecutionsRolloutConfig);
            return this;
        }

        public Builder jobTemplateId(Input<String> jobTemplateId) {
            this.jobTemplateId = Objects.requireNonNull(jobTemplateId);
            return this;
        }

        public Builder jobTemplateId(String jobTemplateId) {
            this.jobTemplateId = Input.of(Objects.requireNonNull(jobTemplateId));
            return this;
        }

        public Builder presignedUrlConfig(@Nullable Input<PresignedUrlConfigPropertiesArgs> presignedUrlConfig) {
            this.presignedUrlConfig = presignedUrlConfig;
            return this;
        }

        public Builder presignedUrlConfig(@Nullable PresignedUrlConfigPropertiesArgs presignedUrlConfig) {
            this.presignedUrlConfig = Input.ofNullable(presignedUrlConfig);
            return this;
        }

        public Builder tags(@Nullable Input<List<JobTemplateTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<JobTemplateTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder timeoutConfig(@Nullable Input<TimeoutConfigPropertiesArgs> timeoutConfig) {
            this.timeoutConfig = timeoutConfig;
            return this;
        }

        public Builder timeoutConfig(@Nullable TimeoutConfigPropertiesArgs timeoutConfig) {
            this.timeoutConfig = Input.ofNullable(timeoutConfig);
            return this;
        }
        public JobTemplateArgs build() {
            return new JobTemplateArgs(abortConfig, description, document, documentSource, jobArn, jobExecutionsRetryConfig, jobExecutionsRolloutConfig, jobTemplateId, presignedUrlConfig, tags, timeoutConfig);
        }
    }
}
