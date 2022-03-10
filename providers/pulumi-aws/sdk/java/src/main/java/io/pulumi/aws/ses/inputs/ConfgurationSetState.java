// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.aws.ses.inputs.ConfgurationSetDeliveryOptionsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfgurationSetState extends io.pulumi.resources.ResourceArgs {

    public static final ConfgurationSetState Empty = new ConfgurationSetState();

    /**
     * SES configuration set ARN.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="deliveryOptions")
      private final @Nullable Input<ConfgurationSetDeliveryOptionsGetArgs> deliveryOptions;

    public Input<ConfgurationSetDeliveryOptionsGetArgs> getDeliveryOptions() {
        return this.deliveryOptions == null ? Input.empty() : this.deliveryOptions;
    }

    /**
     * The date and time at which the reputation metrics for the configuration set were last reset. Resetting these metrics is known as a fresh start.
     * 
     */
    @InputImport(name="lastFreshStart")
      private final @Nullable Input<String> lastFreshStart;

    public Input<String> getLastFreshStart() {
        return this.lastFreshStart == null ? Input.empty() : this.lastFreshStart;
    }

    /**
     * Name of the configuration set.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce and complaint rates, to Amazon CloudWatch. The default value is `false`.
     * 
     */
    @InputImport(name="reputationMetricsEnabled")
      private final @Nullable Input<Boolean> reputationMetricsEnabled;

    public Input<Boolean> getReputationMetricsEnabled() {
        return this.reputationMetricsEnabled == null ? Input.empty() : this.reputationMetricsEnabled;
    }

    /**
     * Whether email sending is enabled or disabled for the configuration set. The default value is `true`.
     * 
     */
    @InputImport(name="sendingEnabled")
      private final @Nullable Input<Boolean> sendingEnabled;

    public Input<Boolean> getSendingEnabled() {
        return this.sendingEnabled == null ? Input.empty() : this.sendingEnabled;
    }

    public ConfgurationSetState(
        @Nullable Input<String> arn,
        @Nullable Input<ConfgurationSetDeliveryOptionsGetArgs> deliveryOptions,
        @Nullable Input<String> lastFreshStart,
        @Nullable Input<String> name,
        @Nullable Input<Boolean> reputationMetricsEnabled,
        @Nullable Input<Boolean> sendingEnabled) {
        this.arn = arn;
        this.deliveryOptions = deliveryOptions;
        this.lastFreshStart = lastFreshStart;
        this.name = name;
        this.reputationMetricsEnabled = reputationMetricsEnabled;
        this.sendingEnabled = sendingEnabled;
    }

    private ConfgurationSetState() {
        this.arn = Input.empty();
        this.deliveryOptions = Input.empty();
        this.lastFreshStart = Input.empty();
        this.name = Input.empty();
        this.reputationMetricsEnabled = Input.empty();
        this.sendingEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfgurationSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<ConfgurationSetDeliveryOptionsGetArgs> deliveryOptions;
        private @Nullable Input<String> lastFreshStart;
        private @Nullable Input<String> name;
        private @Nullable Input<Boolean> reputationMetricsEnabled;
        private @Nullable Input<Boolean> sendingEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfgurationSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.deliveryOptions = defaults.deliveryOptions;
    	      this.lastFreshStart = defaults.lastFreshStart;
    	      this.name = defaults.name;
    	      this.reputationMetricsEnabled = defaults.reputationMetricsEnabled;
    	      this.sendingEnabled = defaults.sendingEnabled;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder deliveryOptions(@Nullable Input<ConfgurationSetDeliveryOptionsGetArgs> deliveryOptions) {
            this.deliveryOptions = deliveryOptions;
            return this;
        }

        public Builder deliveryOptions(@Nullable ConfgurationSetDeliveryOptionsGetArgs deliveryOptions) {
            this.deliveryOptions = Input.ofNullable(deliveryOptions);
            return this;
        }

        public Builder lastFreshStart(@Nullable Input<String> lastFreshStart) {
            this.lastFreshStart = lastFreshStart;
            return this;
        }

        public Builder lastFreshStart(@Nullable String lastFreshStart) {
            this.lastFreshStart = Input.ofNullable(lastFreshStart);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder reputationMetricsEnabled(@Nullable Input<Boolean> reputationMetricsEnabled) {
            this.reputationMetricsEnabled = reputationMetricsEnabled;
            return this;
        }

        public Builder reputationMetricsEnabled(@Nullable Boolean reputationMetricsEnabled) {
            this.reputationMetricsEnabled = Input.ofNullable(reputationMetricsEnabled);
            return this;
        }

        public Builder sendingEnabled(@Nullable Input<Boolean> sendingEnabled) {
            this.sendingEnabled = sendingEnabled;
            return this;
        }

        public Builder sendingEnabled(@Nullable Boolean sendingEnabled) {
            this.sendingEnabled = Input.ofNullable(sendingEnabled);
            return this;
        }
        public ConfgurationSetState build() {
            return new ConfgurationSetState(arn, deliveryOptions, lastFreshStart, name, reputationMetricsEnabled, sendingEnabled);
        }
    }
}
