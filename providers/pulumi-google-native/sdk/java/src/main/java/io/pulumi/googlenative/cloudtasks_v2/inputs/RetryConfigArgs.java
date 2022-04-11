// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Retry config. These settings determine when a failed task attempt is retried.
 * 
 */
public final class RetryConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final RetryConfigArgs Empty = new RetryConfigArgs();

    /**
     * Number of attempts per task. Cloud Tasks will attempt the task `max_attempts` times (that is, if the first attempt fails, then there will be `max_attempts - 1` retries). Must be >= -1. If unspecified when the queue is created, Cloud Tasks will pick the default. -1 indicates unlimited attempts. This field has the same meaning as [task_retry_limit in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    @Import(name="maxAttempts")
      private final @Nullable Output<Integer> maxAttempts;

    public Output<Integer> getMaxAttempts() {
        return this.maxAttempts == null ? Codegen.empty() : this.maxAttempts;
    }

    /**
     * A task will be scheduled for retry between min_backoff and max_backoff duration after it fails, if the queue's RetryConfig specifies that the task should be retried. If unspecified when the queue is created, Cloud Tasks will pick the default. `max_backoff` will be truncated to the nearest second. This field has the same meaning as [max_backoff_seconds in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    @Import(name="maxBackoff")
      private final @Nullable Output<String> maxBackoff;

    public Output<String> getMaxBackoff() {
        return this.maxBackoff == null ? Codegen.empty() : this.maxBackoff;
    }

    /**
     * The time between retries will double `max_doublings` times. A task's retry interval starts at min_backoff, then doubles `max_doublings` times, then increases linearly, and finally retries at intervals of max_backoff up to max_attempts times. For example, if min_backoff is 10s, max_backoff is 300s, and `max_doublings` is 3, then the a task will first be retried in 10s. The retry interval will double three times, and then increase linearly by 2^3 * 10s. Finally, the task will retry at intervals of max_backoff until the task has been attempted max_attempts times. Thus, the requests will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s, 300s, .... If unspecified when the queue is created, Cloud Tasks will pick the default. This field has the same meaning as [max_doublings in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    @Import(name="maxDoublings")
      private final @Nullable Output<Integer> maxDoublings;

    public Output<Integer> getMaxDoublings() {
        return this.maxDoublings == null ? Codegen.empty() : this.maxDoublings;
    }

    /**
     * If positive, `max_retry_duration` specifies the time limit for retrying a failed task, measured from when the task was first attempted. Once `max_retry_duration` time has passed *and* the task has been attempted max_attempts times, no further attempts will be made and the task will be deleted. If zero, then the task age is unlimited. If unspecified when the queue is created, Cloud Tasks will pick the default. `max_retry_duration` will be truncated to the nearest second. This field has the same meaning as [task_age_limit in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    @Import(name="maxRetryDuration")
      private final @Nullable Output<String> maxRetryDuration;

    public Output<String> getMaxRetryDuration() {
        return this.maxRetryDuration == null ? Codegen.empty() : this.maxRetryDuration;
    }

    /**
     * A task will be scheduled for retry between min_backoff and max_backoff duration after it fails, if the queue's RetryConfig specifies that the task should be retried. If unspecified when the queue is created, Cloud Tasks will pick the default. `min_backoff` will be truncated to the nearest second. This field has the same meaning as [min_backoff_seconds in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    @Import(name="minBackoff")
      private final @Nullable Output<String> minBackoff;

    public Output<String> getMinBackoff() {
        return this.minBackoff == null ? Codegen.empty() : this.minBackoff;
    }

    public RetryConfigArgs(
        @Nullable Output<Integer> maxAttempts,
        @Nullable Output<String> maxBackoff,
        @Nullable Output<Integer> maxDoublings,
        @Nullable Output<String> maxRetryDuration,
        @Nullable Output<String> minBackoff) {
        this.maxAttempts = maxAttempts;
        this.maxBackoff = maxBackoff;
        this.maxDoublings = maxDoublings;
        this.maxRetryDuration = maxRetryDuration;
        this.minBackoff = minBackoff;
    }

    private RetryConfigArgs() {
        this.maxAttempts = Codegen.empty();
        this.maxBackoff = Codegen.empty();
        this.maxDoublings = Codegen.empty();
        this.maxRetryDuration = Codegen.empty();
        this.minBackoff = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxAttempts;
        private @Nullable Output<String> maxBackoff;
        private @Nullable Output<Integer> maxDoublings;
        private @Nullable Output<String> maxRetryDuration;
        private @Nullable Output<String> minBackoff;

        public Builder() {
    	      // Empty
        }

        public Builder(RetryConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxAttempts = defaults.maxAttempts;
    	      this.maxBackoff = defaults.maxBackoff;
    	      this.maxDoublings = defaults.maxDoublings;
    	      this.maxRetryDuration = defaults.maxRetryDuration;
    	      this.minBackoff = defaults.minBackoff;
        }

        public Builder maxAttempts(@Nullable Output<Integer> maxAttempts) {
            this.maxAttempts = maxAttempts;
            return this;
        }
        public Builder maxAttempts(@Nullable Integer maxAttempts) {
            this.maxAttempts = Codegen.ofNullable(maxAttempts);
            return this;
        }
        public Builder maxBackoff(@Nullable Output<String> maxBackoff) {
            this.maxBackoff = maxBackoff;
            return this;
        }
        public Builder maxBackoff(@Nullable String maxBackoff) {
            this.maxBackoff = Codegen.ofNullable(maxBackoff);
            return this;
        }
        public Builder maxDoublings(@Nullable Output<Integer> maxDoublings) {
            this.maxDoublings = maxDoublings;
            return this;
        }
        public Builder maxDoublings(@Nullable Integer maxDoublings) {
            this.maxDoublings = Codegen.ofNullable(maxDoublings);
            return this;
        }
        public Builder maxRetryDuration(@Nullable Output<String> maxRetryDuration) {
            this.maxRetryDuration = maxRetryDuration;
            return this;
        }
        public Builder maxRetryDuration(@Nullable String maxRetryDuration) {
            this.maxRetryDuration = Codegen.ofNullable(maxRetryDuration);
            return this;
        }
        public Builder minBackoff(@Nullable Output<String> minBackoff) {
            this.minBackoff = minBackoff;
            return this;
        }
        public Builder minBackoff(@Nullable String minBackoff) {
            this.minBackoff = Codegen.ofNullable(minBackoff);
            return this;
        }        public RetryConfigArgs build() {
            return new RetryConfigArgs(maxAttempts, maxBackoff, maxDoublings, maxRetryDuration, minBackoff);
        }
    }
}
