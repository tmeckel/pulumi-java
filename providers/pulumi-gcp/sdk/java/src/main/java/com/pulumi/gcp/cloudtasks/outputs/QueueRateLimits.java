// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudtasks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QueueRateLimits {
    /**
     * @return -
     * The max burst size.
     * Max burst size limits how fast tasks in queue are processed when many tasks are
     * in the queue and the rate is high. This field allows the queue to have a high
     * rate so processing starts shortly after a task is enqueued, but still limits
     * resource usage when many tasks are enqueued in a short period of time.
     * 
     */
    private final @Nullable Integer maxBurstSize;
    /**
     * @return The maximum number of concurrent tasks that Cloud Tasks allows to
     * be dispatched for this queue. After this threshold has been
     * reached, Cloud Tasks stops dispatching tasks until the number of
     * concurrent requests decreases.
     * 
     */
    private final @Nullable Integer maxConcurrentDispatches;
    /**
     * @return The maximum rate at which tasks are dispatched from this queue.
     * If unspecified when the queue is created, Cloud Tasks will pick the default.
     * 
     */
    private final @Nullable Double maxDispatchesPerSecond;

    @CustomType.Constructor
    private QueueRateLimits(
        @CustomType.Parameter("maxBurstSize") @Nullable Integer maxBurstSize,
        @CustomType.Parameter("maxConcurrentDispatches") @Nullable Integer maxConcurrentDispatches,
        @CustomType.Parameter("maxDispatchesPerSecond") @Nullable Double maxDispatchesPerSecond) {
        this.maxBurstSize = maxBurstSize;
        this.maxConcurrentDispatches = maxConcurrentDispatches;
        this.maxDispatchesPerSecond = maxDispatchesPerSecond;
    }

    /**
     * @return -
     * The max burst size.
     * Max burst size limits how fast tasks in queue are processed when many tasks are
     * in the queue and the rate is high. This field allows the queue to have a high
     * rate so processing starts shortly after a task is enqueued, but still limits
     * resource usage when many tasks are enqueued in a short period of time.
     * 
     */
    public Optional<Integer> maxBurstSize() {
        return Optional.ofNullable(this.maxBurstSize);
    }
    /**
     * @return The maximum number of concurrent tasks that Cloud Tasks allows to
     * be dispatched for this queue. After this threshold has been
     * reached, Cloud Tasks stops dispatching tasks until the number of
     * concurrent requests decreases.
     * 
     */
    public Optional<Integer> maxConcurrentDispatches() {
        return Optional.ofNullable(this.maxConcurrentDispatches);
    }
    /**
     * @return The maximum rate at which tasks are dispatched from this queue.
     * If unspecified when the queue is created, Cloud Tasks will pick the default.
     * 
     */
    public Optional<Double> maxDispatchesPerSecond() {
        return Optional.ofNullable(this.maxDispatchesPerSecond);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueRateLimits defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxBurstSize;
        private @Nullable Integer maxConcurrentDispatches;
        private @Nullable Double maxDispatchesPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueRateLimits defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxBurstSize = defaults.maxBurstSize;
    	      this.maxConcurrentDispatches = defaults.maxConcurrentDispatches;
    	      this.maxDispatchesPerSecond = defaults.maxDispatchesPerSecond;
        }

        public Builder maxBurstSize(@Nullable Integer maxBurstSize) {
            this.maxBurstSize = maxBurstSize;
            return this;
        }
        public Builder maxConcurrentDispatches(@Nullable Integer maxConcurrentDispatches) {
            this.maxConcurrentDispatches = maxConcurrentDispatches;
            return this;
        }
        public Builder maxDispatchesPerSecond(@Nullable Double maxDispatchesPerSecond) {
            this.maxDispatchesPerSecond = maxDispatchesPerSecond;
            return this;
        }        public QueueRateLimits build() {
            return new QueueRateLimits(maxBurstSize, maxConcurrentDispatches, maxDispatchesPerSecond);
        }
    }
}
