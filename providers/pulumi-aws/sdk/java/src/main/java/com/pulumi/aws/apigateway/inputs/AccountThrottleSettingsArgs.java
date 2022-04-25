// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountThrottleSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountThrottleSettingsArgs Empty = new AccountThrottleSettingsArgs();

    /**
     * The absolute maximum number of times API Gateway allows the API to be called per second (RPS).
     * 
     */
    @Import(name="burstLimit")
    private @Nullable Output<Integer> burstLimit;

    /**
     * @return The absolute maximum number of times API Gateway allows the API to be called per second (RPS).
     * 
     */
    public Optional<Output<Integer>> burstLimit() {
        return Optional.ofNullable(this.burstLimit);
    }

    /**
     * The number of times API Gateway allows the API to be called per second on average (RPS).
     * 
     */
    @Import(name="rateLimit")
    private @Nullable Output<Double> rateLimit;

    /**
     * @return The number of times API Gateway allows the API to be called per second on average (RPS).
     * 
     */
    public Optional<Output<Double>> rateLimit() {
        return Optional.ofNullable(this.rateLimit);
    }

    private AccountThrottleSettingsArgs() {}

    private AccountThrottleSettingsArgs(AccountThrottleSettingsArgs $) {
        this.burstLimit = $.burstLimit;
        this.rateLimit = $.rateLimit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountThrottleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountThrottleSettingsArgs $;

        public Builder() {
            $ = new AccountThrottleSettingsArgs();
        }

        public Builder(AccountThrottleSettingsArgs defaults) {
            $ = new AccountThrottleSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param burstLimit The absolute maximum number of times API Gateway allows the API to be called per second (RPS).
         * 
         * @return builder
         * 
         */
        public Builder burstLimit(@Nullable Output<Integer> burstLimit) {
            $.burstLimit = burstLimit;
            return this;
        }

        /**
         * @param burstLimit The absolute maximum number of times API Gateway allows the API to be called per second (RPS).
         * 
         * @return builder
         * 
         */
        public Builder burstLimit(Integer burstLimit) {
            return burstLimit(Output.of(burstLimit));
        }

        /**
         * @param rateLimit The number of times API Gateway allows the API to be called per second on average (RPS).
         * 
         * @return builder
         * 
         */
        public Builder rateLimit(@Nullable Output<Double> rateLimit) {
            $.rateLimit = rateLimit;
            return this;
        }

        /**
         * @param rateLimit The number of times API Gateway allows the API to be called per second on average (RPS).
         * 
         * @return builder
         * 
         */
        public Builder rateLimit(Double rateLimit) {
            return rateLimit(Output.of(rateLimit));
        }

        public AccountThrottleSettingsArgs build() {
            return $;
        }
    }

}
