// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobRetryConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobRetryConfigArgs Empty = new JobRetryConfigArgs();

    /**
     * The maximum amount of time to wait before retrying a job after it fails.
     * A duration in seconds with up to nine fractional digits, terminated by 's'.
     * 
     */
    @InputImport(name="maxBackoffDuration")
      private final @Nullable Input<String> maxBackoffDuration;

    public Input<String> getMaxBackoffDuration() {
        return this.maxBackoffDuration == null ? Input.empty() : this.maxBackoffDuration;
    }

    /**
     * The time between retries will double maxDoublings times.
     * A job's retry interval starts at minBackoffDuration,
     * then doubles maxDoublings times, then increases linearly,
     * and finally retries retries at intervals of maxBackoffDuration up to retryCount times.
     * 
     */
    @InputImport(name="maxDoublings")
      private final @Nullable Input<Integer> maxDoublings;

    public Input<Integer> getMaxDoublings() {
        return this.maxDoublings == null ? Input.empty() : this.maxDoublings;
    }

    /**
     * The time limit for retrying a failed job, measured from time when an execution was first attempted.
     * If specified with retryCount, the job will be retried until both limits are reached.
     * A duration in seconds with up to nine fractional digits, terminated by 's'.
     * 
     */
    @InputImport(name="maxRetryDuration")
      private final @Nullable Input<String> maxRetryDuration;

    public Input<String> getMaxRetryDuration() {
        return this.maxRetryDuration == null ? Input.empty() : this.maxRetryDuration;
    }

    /**
     * The minimum amount of time to wait before retrying a job after it fails.
     * A duration in seconds with up to nine fractional digits, terminated by 's'.
     * 
     */
    @InputImport(name="minBackoffDuration")
      private final @Nullable Input<String> minBackoffDuration;

    public Input<String> getMinBackoffDuration() {
        return this.minBackoffDuration == null ? Input.empty() : this.minBackoffDuration;
    }

    /**
     * The number of attempts that the system will make to run a
     * job using the exponential backoff procedure described by maxDoublings.
     * Values greater than 5 and negative values are not allowed.
     * 
     */
    @InputImport(name="retryCount")
      private final @Nullable Input<Integer> retryCount;

    public Input<Integer> getRetryCount() {
        return this.retryCount == null ? Input.empty() : this.retryCount;
    }

    public JobRetryConfigArgs(
        @Nullable Input<String> maxBackoffDuration,
        @Nullable Input<Integer> maxDoublings,
        @Nullable Input<String> maxRetryDuration,
        @Nullable Input<String> minBackoffDuration,
        @Nullable Input<Integer> retryCount) {
        this.maxBackoffDuration = maxBackoffDuration;
        this.maxDoublings = maxDoublings;
        this.maxRetryDuration = maxRetryDuration;
        this.minBackoffDuration = minBackoffDuration;
        this.retryCount = retryCount;
    }

    private JobRetryConfigArgs() {
        this.maxBackoffDuration = Input.empty();
        this.maxDoublings = Input.empty();
        this.maxRetryDuration = Input.empty();
        this.minBackoffDuration = Input.empty();
        this.retryCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobRetryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> maxBackoffDuration;
        private @Nullable Input<Integer> maxDoublings;
        private @Nullable Input<String> maxRetryDuration;
        private @Nullable Input<String> minBackoffDuration;
        private @Nullable Input<Integer> retryCount;

        public Builder() {
    	      // Empty
        }

        public Builder(JobRetryConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxBackoffDuration = defaults.maxBackoffDuration;
    	      this.maxDoublings = defaults.maxDoublings;
    	      this.maxRetryDuration = defaults.maxRetryDuration;
    	      this.minBackoffDuration = defaults.minBackoffDuration;
    	      this.retryCount = defaults.retryCount;
        }

        public Builder maxBackoffDuration(@Nullable Input<String> maxBackoffDuration) {
            this.maxBackoffDuration = maxBackoffDuration;
            return this;
        }

        public Builder maxBackoffDuration(@Nullable String maxBackoffDuration) {
            this.maxBackoffDuration = Input.ofNullable(maxBackoffDuration);
            return this;
        }

        public Builder maxDoublings(@Nullable Input<Integer> maxDoublings) {
            this.maxDoublings = maxDoublings;
            return this;
        }

        public Builder maxDoublings(@Nullable Integer maxDoublings) {
            this.maxDoublings = Input.ofNullable(maxDoublings);
            return this;
        }

        public Builder maxRetryDuration(@Nullable Input<String> maxRetryDuration) {
            this.maxRetryDuration = maxRetryDuration;
            return this;
        }

        public Builder maxRetryDuration(@Nullable String maxRetryDuration) {
            this.maxRetryDuration = Input.ofNullable(maxRetryDuration);
            return this;
        }

        public Builder minBackoffDuration(@Nullable Input<String> minBackoffDuration) {
            this.minBackoffDuration = minBackoffDuration;
            return this;
        }

        public Builder minBackoffDuration(@Nullable String minBackoffDuration) {
            this.minBackoffDuration = Input.ofNullable(minBackoffDuration);
            return this;
        }

        public Builder retryCount(@Nullable Input<Integer> retryCount) {
            this.retryCount = retryCount;
            return this;
        }

        public Builder retryCount(@Nullable Integer retryCount) {
            this.retryCount = Input.ofNullable(retryCount);
            return this;
        }
        public JobRetryConfigArgs build() {
            return new JobRetryConfigArgs(maxBackoffDuration, maxDoublings, maxRetryDuration, minBackoffDuration, retryCount);
        }
    }
}
