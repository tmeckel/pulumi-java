// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v1alpha1.inputs.InstanceStatusArgs;
import io.pulumi.googlenative.run_v1alpha1.inputs.JobConditionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * JobStatus represents the current state of a Job.
 * 
 */
public final class JobStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobStatusArgs Empty = new JobStatusArgs();

    /**
     * Optional. The number of actively running instances. +optional
     * 
     */
    @InputImport(name="active")
    private final @Nullable Input<Integer> active;

    public Input<Integer> getActive() {
        return this.active == null ? Input.empty() : this.active;
    }

    /**
     * Optional. Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    @InputImport(name="completionTime")
    private final @Nullable Input<String> completionTime;

    public Input<String> getCompletionTime() {
        return this.completionTime == null ? Input.empty() : this.completionTime;
    }

    /**
     * Optional. The latest available observations of a job's current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
     */
    @InputImport(name="conditions")
    private final @Nullable Input<List<JobConditionArgs>> conditions;

    public Input<List<JobConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * Optional. The number of instances which reached phase Failed. +optional
     * 
     */
    @InputImport(name="failed")
    private final @Nullable Input<Integer> failed;

    public Input<Integer> getFailed() {
        return this.failed == null ? Input.empty() : this.failed;
    }

    /**
     * Optional. ImageDigest holds the resolved digest for the image specified within .Spec.Template.Spec.Container.Image. The digest is resolved during the creation of the Job. This field holds the digest value regardless of whether a tag or digest was originally specified in the Container object.
     * 
     */
    @InputImport(name="imageDigest")
    private final @Nullable Input<String> imageDigest;

    public Input<String> getImageDigest() {
        return this.imageDigest == null ? Input.empty() : this.imageDigest;
    }

    /**
     * Optional. Status of completed, failed, and running instances. +optional
     * 
     */
    @InputImport(name="instances")
    private final @Nullable Input<List<InstanceStatusArgs>> instances;

    public Input<List<InstanceStatusArgs>> getInstances() {
        return this.instances == null ? Input.empty() : this.instances;
    }

    /**
     * Optional. The 'generation' of the job that was last processed by the controller.
     * 
     */
    @InputImport(name="observedGeneration")
    private final @Nullable Input<Integer> observedGeneration;

    public Input<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Input.empty() : this.observedGeneration;
    }

    /**
     * Optional. Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * Optional. The number of instances which reached phase Succeeded. +optional
     * 
     */
    @InputImport(name="succeeded")
    private final @Nullable Input<Integer> succeeded;

    public Input<Integer> getSucceeded() {
        return this.succeeded == null ? Input.empty() : this.succeeded;
    }

    public JobStatusArgs(
        @Nullable Input<Integer> active,
        @Nullable Input<String> completionTime,
        @Nullable Input<List<JobConditionArgs>> conditions,
        @Nullable Input<Integer> failed,
        @Nullable Input<String> imageDigest,
        @Nullable Input<List<InstanceStatusArgs>> instances,
        @Nullable Input<Integer> observedGeneration,
        @Nullable Input<String> startTime,
        @Nullable Input<Integer> succeeded) {
        this.active = active;
        this.completionTime = completionTime;
        this.conditions = conditions;
        this.failed = failed;
        this.imageDigest = imageDigest;
        this.instances = instances;
        this.observedGeneration = observedGeneration;
        this.startTime = startTime;
        this.succeeded = succeeded;
    }

    private JobStatusArgs() {
        this.active = Input.empty();
        this.completionTime = Input.empty();
        this.conditions = Input.empty();
        this.failed = Input.empty();
        this.imageDigest = Input.empty();
        this.instances = Input.empty();
        this.observedGeneration = Input.empty();
        this.startTime = Input.empty();
        this.succeeded = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> active;
        private @Nullable Input<String> completionTime;
        private @Nullable Input<List<JobConditionArgs>> conditions;
        private @Nullable Input<Integer> failed;
        private @Nullable Input<String> imageDigest;
        private @Nullable Input<List<InstanceStatusArgs>> instances;
        private @Nullable Input<Integer> observedGeneration;
        private @Nullable Input<String> startTime;
        private @Nullable Input<Integer> succeeded;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.completionTime = defaults.completionTime;
    	      this.conditions = defaults.conditions;
    	      this.failed = defaults.failed;
    	      this.imageDigest = defaults.imageDigest;
    	      this.instances = defaults.instances;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.startTime = defaults.startTime;
    	      this.succeeded = defaults.succeeded;
        }

        public Builder setActive(@Nullable Input<Integer> active) {
            this.active = active;
            return this;
        }

        public Builder setActive(@Nullable Integer active) {
            this.active = Input.ofNullable(active);
            return this;
        }

        public Builder setCompletionTime(@Nullable Input<String> completionTime) {
            this.completionTime = completionTime;
            return this;
        }

        public Builder setCompletionTime(@Nullable String completionTime) {
            this.completionTime = Input.ofNullable(completionTime);
            return this;
        }

        public Builder setConditions(@Nullable Input<List<JobConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<JobConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setFailed(@Nullable Input<Integer> failed) {
            this.failed = failed;
            return this;
        }

        public Builder setFailed(@Nullable Integer failed) {
            this.failed = Input.ofNullable(failed);
            return this;
        }

        public Builder setImageDigest(@Nullable Input<String> imageDigest) {
            this.imageDigest = imageDigest;
            return this;
        }

        public Builder setImageDigest(@Nullable String imageDigest) {
            this.imageDigest = Input.ofNullable(imageDigest);
            return this;
        }

        public Builder setInstances(@Nullable Input<List<InstanceStatusArgs>> instances) {
            this.instances = instances;
            return this;
        }

        public Builder setInstances(@Nullable List<InstanceStatusArgs> instances) {
            this.instances = Input.ofNullable(instances);
            return this;
        }

        public Builder setObservedGeneration(@Nullable Input<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Input.ofNullable(observedGeneration);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setSucceeded(@Nullable Input<Integer> succeeded) {
            this.succeeded = succeeded;
            return this;
        }

        public Builder setSucceeded(@Nullable Integer succeeded) {
            this.succeeded = Input.ofNullable(succeeded);
            return this;
        }

        public JobStatusArgs build() {
            return new JobStatusArgs(active, completionTime, conditions, failed, imageDigest, instances, observedGeneration, startTime, succeeded);
        }
    }
}
