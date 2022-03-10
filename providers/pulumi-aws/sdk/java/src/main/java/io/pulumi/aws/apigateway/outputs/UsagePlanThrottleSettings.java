// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UsagePlanThrottleSettings {
    /**
     * The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
     * 
     */
    private final @Nullable Integer burstLimit;
    /**
     * The API request steady-state rate limit.
     * 
     */
    private final @Nullable Double rateLimit;

    @OutputCustomType.Constructor
    private UsagePlanThrottleSettings(
        @OutputCustomType.Parameter("burstLimit") @Nullable Integer burstLimit,
        @OutputCustomType.Parameter("rateLimit") @Nullable Double rateLimit) {
        this.burstLimit = burstLimit;
        this.rateLimit = rateLimit;
    }

    /**
     * The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
     * 
    */
    public Optional<Integer> getBurstLimit() {
        return Optional.ofNullable(this.burstLimit);
    }
    /**
     * The API request steady-state rate limit.
     * 
    */
    public Optional<Double> getRateLimit() {
        return Optional.ofNullable(this.rateLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanThrottleSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer burstLimit;
        private @Nullable Double rateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanThrottleSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burstLimit = defaults.burstLimit;
    	      this.rateLimit = defaults.rateLimit;
        }

        public Builder burstLimit(@Nullable Integer burstLimit) {
            this.burstLimit = burstLimit;
            return this;
        }

        public Builder rateLimit(@Nullable Double rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }
        public UsagePlanThrottleSettings build() {
            return new UsagePlanThrottleSettings(burstLimit, rateLimit);
        }
    }
}
