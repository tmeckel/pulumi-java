// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


/**
 * Rate limits. This message determines the maximum rate that tasks can be dispatched by a queue, regardless of whether the dispatch is a first task attempt or a retry. Note: The debugging command, RunTask, will run a task even if the queue has reached its RateLimits.
 * 
 */
public final class RateLimitsResponse extends io.pulumi.resources.InvokeArgs {

    public static final RateLimitsResponse Empty = new RateLimitsResponse();

    /**
     * The max burst size. Max burst size limits how fast tasks in queue are processed when many tasks are in the queue and the rate is high. This field allows the queue to have a high rate so processing starts shortly after a task is enqueued, but still limits resource usage when many tasks are enqueued in a short period of time. The [token bucket](https://wikipedia.org/wiki/Token_Bucket) algorithm is used to control the rate of task dispatches. Each queue has a token bucket that holds tokens, up to the maximum specified by `max_burst_size`. Each time a task is dispatched, a token is removed from the bucket. Tasks will be dispatched until the queue's bucket runs out of tokens. The bucket will be continuously refilled with new tokens based on max_dispatches_per_second. The default value of `max_burst_size` is picked by Cloud Tasks based on the value of max_dispatches_per_second. The maximum value of `max_burst_size` is 500. For App Engine queues that were created or updated using `queue.yaml/xml`, `max_burst_size` is equal to [bucket_size](https://cloud.google.com/appengine/docs/standard/python/config/queueref#bucket_size). If UpdateQueue is called on a queue without explicitly setting a value for `max_burst_size`, `max_burst_size` value will get updated if UpdateQueue is updating max_dispatches_per_second.
     * 
     */
    @InputImport(name="maxBurstSize", required=true)
      private final Integer maxBurstSize;

    public Integer getMaxBurstSize() {
        return this.maxBurstSize;
    }

    /**
     * The maximum number of concurrent tasks that Cloud Tasks allows to be dispatched for this queue. After this threshold has been reached, Cloud Tasks stops dispatching tasks until the number of concurrent requests decreases. If unspecified when the queue is created, Cloud Tasks will pick the default. The maximum allowed value is 5,000. This field has the same meaning as [max_concurrent_requests in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
     * 
     */
    @InputImport(name="maxConcurrentDispatches", required=true)
      private final Integer maxConcurrentDispatches;

    public Integer getMaxConcurrentDispatches() {
        return this.maxConcurrentDispatches;
    }

    /**
     * The maximum rate at which tasks are dispatched from this queue. If unspecified when the queue is created, Cloud Tasks will pick the default. * For App Engine queues, the maximum allowed value is 500. This field has the same meaning as [rate in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
     * 
     */
    @InputImport(name="maxDispatchesPerSecond", required=true)
      private final Double maxDispatchesPerSecond;

    public Double getMaxDispatchesPerSecond() {
        return this.maxDispatchesPerSecond;
    }

    public RateLimitsResponse(
        Integer maxBurstSize,
        Integer maxConcurrentDispatches,
        Double maxDispatchesPerSecond) {
        this.maxBurstSize = Objects.requireNonNull(maxBurstSize, "expected parameter 'maxBurstSize' to be non-null");
        this.maxConcurrentDispatches = Objects.requireNonNull(maxConcurrentDispatches, "expected parameter 'maxConcurrentDispatches' to be non-null");
        this.maxDispatchesPerSecond = Objects.requireNonNull(maxDispatchesPerSecond, "expected parameter 'maxDispatchesPerSecond' to be non-null");
    }

    private RateLimitsResponse() {
        this.maxBurstSize = null;
        this.maxConcurrentDispatches = null;
        this.maxDispatchesPerSecond = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RateLimitsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxBurstSize;
        private Integer maxConcurrentDispatches;
        private Double maxDispatchesPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(RateLimitsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxBurstSize = defaults.maxBurstSize;
    	      this.maxConcurrentDispatches = defaults.maxConcurrentDispatches;
    	      this.maxDispatchesPerSecond = defaults.maxDispatchesPerSecond;
        }

        public Builder maxBurstSize(Integer maxBurstSize) {
            this.maxBurstSize = Objects.requireNonNull(maxBurstSize);
            return this;
        }

        public Builder maxConcurrentDispatches(Integer maxConcurrentDispatches) {
            this.maxConcurrentDispatches = Objects.requireNonNull(maxConcurrentDispatches);
            return this;
        }

        public Builder maxDispatchesPerSecond(Double maxDispatchesPerSecond) {
            this.maxDispatchesPerSecond = Objects.requireNonNull(maxDispatchesPerSecond);
            return this;
        }
        public RateLimitsResponse build() {
            return new RateLimitsResponse(maxBurstSize, maxConcurrentDispatches, maxDispatchesPerSecond);
        }
    }
}
