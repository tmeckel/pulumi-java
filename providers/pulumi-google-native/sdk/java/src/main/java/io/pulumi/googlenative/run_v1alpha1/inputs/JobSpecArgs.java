// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v1alpha1.inputs.InstanceTemplateSpecArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * JobSpec describes how the job execution will look like.
 * 
 */
public final class JobSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobSpecArgs Empty = new JobSpecArgs();

    /**
     * Optional. Not supported. Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it. If set to zero, the system will never attempt to terminate the job based on time. Otherwise, the value must be positive integer. +optional
     * 
     */
    @InputImport(name="activeDeadlineSeconds")
    private final @Nullable Input<String> activeDeadlineSeconds;

    public Input<String> getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds == null ? Input.empty() : this.activeDeadlineSeconds;
    }

    /**
     * Optional. Specifies the number of retries per instance, before marking this job failed. If set to zero, instances will never retry on failure. +optional
     * 
     */
    @InputImport(name="backoffLimit")
    private final @Nullable Input<Integer> backoffLimit;

    public Input<Integer> getBackoffLimit() {
        return this.backoffLimit == null ? Input.empty() : this.backoffLimit;
    }

    /**
     * Optional. Specifies the desired number of successfully finished instances the job should be run with. Setting to 1 means that parallelism is limited to 1 and the success of that instance signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
     */
    @InputImport(name="completions")
    private final @Nullable Input<Integer> completions;

    public Input<Integer> getCompletions() {
        return this.completions == null ? Input.empty() : this.completions;
    }

    /**
     * Optional. Specifies the maximum desired number of instances the job should run at any given time. Must be <= completions. The actual number of instances running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
     */
    @InputImport(name="parallelism")
    private final @Nullable Input<Integer> parallelism;

    public Input<Integer> getParallelism() {
        return this.parallelism == null ? Input.empty() : this.parallelism;
    }

    /**
     * Optional. Describes the instance that will be created when executing a job.
     * 
     */
    @InputImport(name="template")
    private final @Nullable Input<InstanceTemplateSpecArgs> template;

    public Input<InstanceTemplateSpecArgs> getTemplate() {
        return this.template == null ? Input.empty() : this.template;
    }

    /**
     * Optional. Not supported. ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is set to zero, the Job won't be automatically deleted. +optional
     * 
     */
    @InputImport(name="ttlSecondsAfterFinished")
    private final @Nullable Input<Integer> ttlSecondsAfterFinished;

    public Input<Integer> getTtlSecondsAfterFinished() {
        return this.ttlSecondsAfterFinished == null ? Input.empty() : this.ttlSecondsAfterFinished;
    }

    public JobSpecArgs(
        @Nullable Input<String> activeDeadlineSeconds,
        @Nullable Input<Integer> backoffLimit,
        @Nullable Input<Integer> completions,
        @Nullable Input<Integer> parallelism,
        @Nullable Input<InstanceTemplateSpecArgs> template,
        @Nullable Input<Integer> ttlSecondsAfterFinished) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        this.backoffLimit = backoffLimit;
        this.completions = completions;
        this.parallelism = parallelism;
        this.template = template;
        this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    }

    private JobSpecArgs() {
        this.activeDeadlineSeconds = Input.empty();
        this.backoffLimit = Input.empty();
        this.completions = Input.empty();
        this.parallelism = Input.empty();
        this.template = Input.empty();
        this.ttlSecondsAfterFinished = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> activeDeadlineSeconds;
        private @Nullable Input<Integer> backoffLimit;
        private @Nullable Input<Integer> completions;
        private @Nullable Input<Integer> parallelism;
        private @Nullable Input<InstanceTemplateSpecArgs> template;
        private @Nullable Input<Integer> ttlSecondsAfterFinished;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDeadlineSeconds = defaults.activeDeadlineSeconds;
    	      this.backoffLimit = defaults.backoffLimit;
    	      this.completions = defaults.completions;
    	      this.parallelism = defaults.parallelism;
    	      this.template = defaults.template;
    	      this.ttlSecondsAfterFinished = defaults.ttlSecondsAfterFinished;
        }

        public Builder setActiveDeadlineSeconds(@Nullable Input<String> activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }

        public Builder setActiveDeadlineSeconds(@Nullable String activeDeadlineSeconds) {
            this.activeDeadlineSeconds = Input.ofNullable(activeDeadlineSeconds);
            return this;
        }

        public Builder setBackoffLimit(@Nullable Input<Integer> backoffLimit) {
            this.backoffLimit = backoffLimit;
            return this;
        }

        public Builder setBackoffLimit(@Nullable Integer backoffLimit) {
            this.backoffLimit = Input.ofNullable(backoffLimit);
            return this;
        }

        public Builder setCompletions(@Nullable Input<Integer> completions) {
            this.completions = completions;
            return this;
        }

        public Builder setCompletions(@Nullable Integer completions) {
            this.completions = Input.ofNullable(completions);
            return this;
        }

        public Builder setParallelism(@Nullable Input<Integer> parallelism) {
            this.parallelism = parallelism;
            return this;
        }

        public Builder setParallelism(@Nullable Integer parallelism) {
            this.parallelism = Input.ofNullable(parallelism);
            return this;
        }

        public Builder setTemplate(@Nullable Input<InstanceTemplateSpecArgs> template) {
            this.template = template;
            return this;
        }

        public Builder setTemplate(@Nullable InstanceTemplateSpecArgs template) {
            this.template = Input.ofNullable(template);
            return this;
        }

        public Builder setTtlSecondsAfterFinished(@Nullable Input<Integer> ttlSecondsAfterFinished) {
            this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
            return this;
        }

        public Builder setTtlSecondsAfterFinished(@Nullable Integer ttlSecondsAfterFinished) {
            this.ttlSecondsAfterFinished = Input.ofNullable(ttlSecondsAfterFinished);
            return this;
        }

        public JobSpecArgs build() {
            return new JobSpecArgs(activeDeadlineSeconds, backoffLimit, completions, parallelism, template, ttlSecondsAfterFinished);
        }
    }
}
