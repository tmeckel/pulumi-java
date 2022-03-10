// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OnlineRequestSettingsResponse {
    /**
     * The number of requests allowed to queue at once for this deployment.
     * 
     */
    private final @Nullable Integer maxConcurrentRequestsPerInstance;
    /**
     * The maximum queue wait time in ISO 8601 format. Supports millisecond precision.
     * 
     */
    private final @Nullable String maxQueueWait;
    /**
     * The request timeout in ISO 8601 format. Supports millisecond precision.
     * 
     */
    private final @Nullable String requestTimeout;

    @OutputCustomType.Constructor
    private OnlineRequestSettingsResponse(
        @OutputCustomType.Parameter("maxConcurrentRequestsPerInstance") @Nullable Integer maxConcurrentRequestsPerInstance,
        @OutputCustomType.Parameter("maxQueueWait") @Nullable String maxQueueWait,
        @OutputCustomType.Parameter("requestTimeout") @Nullable String requestTimeout) {
        this.maxConcurrentRequestsPerInstance = maxConcurrentRequestsPerInstance;
        this.maxQueueWait = maxQueueWait;
        this.requestTimeout = requestTimeout;
    }

    /**
     * The number of requests allowed to queue at once for this deployment.
     * 
    */
    public Optional<Integer> getMaxConcurrentRequestsPerInstance() {
        return Optional.ofNullable(this.maxConcurrentRequestsPerInstance);
    }
    /**
     * The maximum queue wait time in ISO 8601 format. Supports millisecond precision.
     * 
    */
    public Optional<String> getMaxQueueWait() {
        return Optional.ofNullable(this.maxQueueWait);
    }
    /**
     * The request timeout in ISO 8601 format. Supports millisecond precision.
     * 
    */
    public Optional<String> getRequestTimeout() {
        return Optional.ofNullable(this.requestTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnlineRequestSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxConcurrentRequestsPerInstance;
        private @Nullable String maxQueueWait;
        private @Nullable String requestTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(OnlineRequestSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConcurrentRequestsPerInstance = defaults.maxConcurrentRequestsPerInstance;
    	      this.maxQueueWait = defaults.maxQueueWait;
    	      this.requestTimeout = defaults.requestTimeout;
        }

        public Builder maxConcurrentRequestsPerInstance(@Nullable Integer maxConcurrentRequestsPerInstance) {
            this.maxConcurrentRequestsPerInstance = maxConcurrentRequestsPerInstance;
            return this;
        }

        public Builder maxQueueWait(@Nullable String maxQueueWait) {
            this.maxQueueWait = maxQueueWait;
            return this;
        }

        public Builder requestTimeout(@Nullable String requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }
        public OnlineRequestSettingsResponse build() {
            return new OnlineRequestSettingsResponse(maxConcurrentRequestsPerInstance, maxQueueWait, requestTimeout);
        }
    }
}
