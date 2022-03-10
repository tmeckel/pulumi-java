// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RetryPolicyResponse {
    /**
     * Time To Live (in minutes) for events.
     * 
     */
    private final @Nullable Integer eventTimeToLiveInMinutes;
    /**
     * Maximum number of delivery retry attempts for events.
     * 
     */
    private final @Nullable Integer maxDeliveryAttempts;

    @OutputCustomType.Constructor
    private RetryPolicyResponse(
        @OutputCustomType.Parameter("eventTimeToLiveInMinutes") @Nullable Integer eventTimeToLiveInMinutes,
        @OutputCustomType.Parameter("maxDeliveryAttempts") @Nullable Integer maxDeliveryAttempts) {
        this.eventTimeToLiveInMinutes = eventTimeToLiveInMinutes;
        this.maxDeliveryAttempts = maxDeliveryAttempts;
    }

    /**
     * Time To Live (in minutes) for events.
     * 
    */
    public Optional<Integer> getEventTimeToLiveInMinutes() {
        return Optional.ofNullable(this.eventTimeToLiveInMinutes);
    }
    /**
     * Maximum number of delivery retry attempts for events.
     * 
    */
    public Optional<Integer> getMaxDeliveryAttempts() {
        return Optional.ofNullable(this.maxDeliveryAttempts);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetryPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer eventTimeToLiveInMinutes;
        private @Nullable Integer maxDeliveryAttempts;

        public Builder() {
    	      // Empty
        }

        public Builder(RetryPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventTimeToLiveInMinutes = defaults.eventTimeToLiveInMinutes;
    	      this.maxDeliveryAttempts = defaults.maxDeliveryAttempts;
        }

        public Builder eventTimeToLiveInMinutes(@Nullable Integer eventTimeToLiveInMinutes) {
            this.eventTimeToLiveInMinutes = eventTimeToLiveInMinutes;
            return this;
        }

        public Builder maxDeliveryAttempts(@Nullable Integer maxDeliveryAttempts) {
            this.maxDeliveryAttempts = maxDeliveryAttempts;
            return this;
        }
        public RetryPolicyResponse build() {
            return new RetryPolicyResponse(eventTimeToLiveInMinutes, maxDeliveryAttempts);
        }
    }
}
