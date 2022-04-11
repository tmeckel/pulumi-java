// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rate limits. This message determines the maximum rate that tasks can be dispatched by a queue, regardless of whether the dispatch is a first task attempt or a retry. Note: The debugging command, RunTask, will run a task even if the queue has reached its RateLimits.
 * 
 */
public final class RateLimitsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RateLimitsArgs Empty = new RateLimitsArgs();

    /**
     * The maximum number of concurrent tasks that Cloud Tasks allows to be dispatched for this queue. After this threshold has been reached, Cloud Tasks stops dispatching tasks until the number of concurrent requests decreases. If unspecified when the queue is created, Cloud Tasks will pick the default. The maximum allowed value is 5,000. This field has the same meaning as [max_concurrent_requests in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
     * 
     */
    @Import(name="maxConcurrentDispatches")
      private final @Nullable Output<Integer> maxConcurrentDispatches;

    public Output<Integer> getMaxConcurrentDispatches() {
        return this.maxConcurrentDispatches == null ? Codegen.empty() : this.maxConcurrentDispatches;
    }

    /**
     * The maximum rate at which tasks are dispatched from this queue. If unspecified when the queue is created, Cloud Tasks will pick the default. * The maximum allowed value is 500. This field has the same meaning as [rate in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
     * 
     */
    @Import(name="maxDispatchesPerSecond")
      private final @Nullable Output<Double> maxDispatchesPerSecond;

    public Output<Double> getMaxDispatchesPerSecond() {
        return this.maxDispatchesPerSecond == null ? Codegen.empty() : this.maxDispatchesPerSecond;
    }

    public RateLimitsArgs(
        @Nullable Output<Integer> maxConcurrentDispatches,
        @Nullable Output<Double> maxDispatchesPerSecond) {
        this.maxConcurrentDispatches = maxConcurrentDispatches;
        this.maxDispatchesPerSecond = maxDispatchesPerSecond;
    }

    private RateLimitsArgs() {
        this.maxConcurrentDispatches = Codegen.empty();
        this.maxDispatchesPerSecond = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RateLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxConcurrentDispatches;
        private @Nullable Output<Double> maxDispatchesPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(RateLimitsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConcurrentDispatches = defaults.maxConcurrentDispatches;
    	      this.maxDispatchesPerSecond = defaults.maxDispatchesPerSecond;
        }

        public Builder maxConcurrentDispatches(@Nullable Output<Integer> maxConcurrentDispatches) {
            this.maxConcurrentDispatches = maxConcurrentDispatches;
            return this;
        }
        public Builder maxConcurrentDispatches(@Nullable Integer maxConcurrentDispatches) {
            this.maxConcurrentDispatches = Codegen.ofNullable(maxConcurrentDispatches);
            return this;
        }
        public Builder maxDispatchesPerSecond(@Nullable Output<Double> maxDispatchesPerSecond) {
            this.maxDispatchesPerSecond = maxDispatchesPerSecond;
            return this;
        }
        public Builder maxDispatchesPerSecond(@Nullable Double maxDispatchesPerSecond) {
            this.maxDispatchesPerSecond = Codegen.ofNullable(maxDispatchesPerSecond);
            return this;
        }        public RateLimitsArgs build() {
            return new RateLimitsArgs(maxConcurrentDispatches, maxDispatchesPerSecond);
        }
    }
}
