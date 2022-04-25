// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UsagePlanApiStageThrottleArgs extends com.pulumi.resources.ResourceArgs {

    public static final UsagePlanApiStageThrottleArgs Empty = new UsagePlanApiStageThrottleArgs();

    /**
     * The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
     * 
     */
    @Import(name="burstLimit")
    private @Nullable Output<Integer> burstLimit;

    /**
     * @return The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
     * 
     */
    public Optional<Output<Integer>> burstLimit() {
        return Optional.ofNullable(this.burstLimit);
    }

    /**
     * The method to apply the throttle settings for. Specfiy the path and method, for example `/test/GET`.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return The method to apply the throttle settings for. Specfiy the path and method, for example `/test/GET`.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * The API request steady-state rate limit.
     * 
     */
    @Import(name="rateLimit")
    private @Nullable Output<Double> rateLimit;

    /**
     * @return The API request steady-state rate limit.
     * 
     */
    public Optional<Output<Double>> rateLimit() {
        return Optional.ofNullable(this.rateLimit);
    }

    private UsagePlanApiStageThrottleArgs() {}

    private UsagePlanApiStageThrottleArgs(UsagePlanApiStageThrottleArgs $) {
        this.burstLimit = $.burstLimit;
        this.path = $.path;
        this.rateLimit = $.rateLimit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UsagePlanApiStageThrottleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UsagePlanApiStageThrottleArgs $;

        public Builder() {
            $ = new UsagePlanApiStageThrottleArgs();
        }

        public Builder(UsagePlanApiStageThrottleArgs defaults) {
            $ = new UsagePlanApiStageThrottleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param burstLimit The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
         * 
         * @return builder
         * 
         */
        public Builder burstLimit(@Nullable Output<Integer> burstLimit) {
            $.burstLimit = burstLimit;
            return this;
        }

        /**
         * @param burstLimit The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
         * 
         * @return builder
         * 
         */
        public Builder burstLimit(Integer burstLimit) {
            return burstLimit(Output.of(burstLimit));
        }

        /**
         * @param path The method to apply the throttle settings for. Specfiy the path and method, for example `/test/GET`.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The method to apply the throttle settings for. Specfiy the path and method, for example `/test/GET`.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param rateLimit The API request steady-state rate limit.
         * 
         * @return builder
         * 
         */
        public Builder rateLimit(@Nullable Output<Double> rateLimit) {
            $.rateLimit = rateLimit;
            return this;
        }

        /**
         * @param rateLimit The API request steady-state rate limit.
         * 
         * @return builder
         * 
         */
        public Builder rateLimit(Double rateLimit) {
            return rateLimit(Output.of(rateLimit));
        }

        public UsagePlanApiStageThrottleArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
