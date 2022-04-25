// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionRetryPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionRetryPolicyArgs Empty = new SubscriptionRetryPolicyArgs();

    /**
     * The maximum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 600 seconds.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="maximumBackoff")
    private @Nullable Output<String> maximumBackoff;

    /**
     * @return The maximum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 600 seconds.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<Output<String>> maximumBackoff() {
        return Optional.ofNullable(this.maximumBackoff);
    }

    /**
     * The minimum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 10 seconds.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="minimumBackoff")
    private @Nullable Output<String> minimumBackoff;

    /**
     * @return The minimum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 10 seconds.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<Output<String>> minimumBackoff() {
        return Optional.ofNullable(this.minimumBackoff);
    }

    private SubscriptionRetryPolicyArgs() {}

    private SubscriptionRetryPolicyArgs(SubscriptionRetryPolicyArgs $) {
        this.maximumBackoff = $.maximumBackoff;
        this.minimumBackoff = $.minimumBackoff;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionRetryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionRetryPolicyArgs $;

        public Builder() {
            $ = new SubscriptionRetryPolicyArgs();
        }

        public Builder(SubscriptionRetryPolicyArgs defaults) {
            $ = new SubscriptionRetryPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maximumBackoff The maximum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 600 seconds.
         * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder maximumBackoff(@Nullable Output<String> maximumBackoff) {
            $.maximumBackoff = maximumBackoff;
            return this;
        }

        /**
         * @param maximumBackoff The maximum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 600 seconds.
         * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder maximumBackoff(String maximumBackoff) {
            return maximumBackoff(Output.of(maximumBackoff));
        }

        /**
         * @param minimumBackoff The minimum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 10 seconds.
         * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder minimumBackoff(@Nullable Output<String> minimumBackoff) {
            $.minimumBackoff = minimumBackoff;
            return this;
        }

        /**
         * @param minimumBackoff The minimum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 10 seconds.
         * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder minimumBackoff(String minimumBackoff) {
            return minimumBackoff(Output.of(minimumBackoff));
        }

        public SubscriptionRetryPolicyArgs build() {
            return $;
        }
    }

}
