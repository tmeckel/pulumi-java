// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy.inputs;

import com.pulumi.aws.codedeploy.inputs.DeploymentConfigTrafficRoutingConfigTimeBasedCanaryArgs;
import com.pulumi.aws.codedeploy.inputs.DeploymentConfigTrafficRoutingConfigTimeBasedLinearArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentConfigTrafficRoutingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentConfigTrafficRoutingConfigArgs Empty = new DeploymentConfigTrafficRoutingConfigArgs();

    /**
     * The time based canary configuration information. If `type` is `TimeBasedLinear`, use `time_based_linear` instead.
     * 
     */
    @Import(name="timeBasedCanary")
    private @Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedCanaryArgs> timeBasedCanary;

    /**
     * @return The time based canary configuration information. If `type` is `TimeBasedLinear`, use `time_based_linear` instead.
     * 
     */
    public Optional<Output<DeploymentConfigTrafficRoutingConfigTimeBasedCanaryArgs>> timeBasedCanary() {
        return Optional.ofNullable(this.timeBasedCanary);
    }

    /**
     * The time based linear configuration information. If `type` is `TimeBasedCanary`, use `time_based_canary` instead.
     * 
     */
    @Import(name="timeBasedLinear")
    private @Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedLinearArgs> timeBasedLinear;

    /**
     * @return The time based linear configuration information. If `type` is `TimeBasedCanary`, use `time_based_canary` instead.
     * 
     */
    public Optional<Output<DeploymentConfigTrafficRoutingConfigTimeBasedLinearArgs>> timeBasedLinear() {
        return Optional.ofNullable(this.timeBasedLinear);
    }

    /**
     * Type of traffic routing config. One of `TimeBasedCanary`, `TimeBasedLinear`, `AllAtOnce`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of traffic routing config. One of `TimeBasedCanary`, `TimeBasedLinear`, `AllAtOnce`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private DeploymentConfigTrafficRoutingConfigArgs() {}

    private DeploymentConfigTrafficRoutingConfigArgs(DeploymentConfigTrafficRoutingConfigArgs $) {
        this.timeBasedCanary = $.timeBasedCanary;
        this.timeBasedLinear = $.timeBasedLinear;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentConfigTrafficRoutingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentConfigTrafficRoutingConfigArgs $;

        public Builder() {
            $ = new DeploymentConfigTrafficRoutingConfigArgs();
        }

        public Builder(DeploymentConfigTrafficRoutingConfigArgs defaults) {
            $ = new DeploymentConfigTrafficRoutingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param timeBasedCanary The time based canary configuration information. If `type` is `TimeBasedLinear`, use `time_based_linear` instead.
         * 
         * @return builder
         * 
         */
        public Builder timeBasedCanary(@Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedCanaryArgs> timeBasedCanary) {
            $.timeBasedCanary = timeBasedCanary;
            return this;
        }

        /**
         * @param timeBasedCanary The time based canary configuration information. If `type` is `TimeBasedLinear`, use `time_based_linear` instead.
         * 
         * @return builder
         * 
         */
        public Builder timeBasedCanary(DeploymentConfigTrafficRoutingConfigTimeBasedCanaryArgs timeBasedCanary) {
            return timeBasedCanary(Output.of(timeBasedCanary));
        }

        /**
         * @param timeBasedLinear The time based linear configuration information. If `type` is `TimeBasedCanary`, use `time_based_canary` instead.
         * 
         * @return builder
         * 
         */
        public Builder timeBasedLinear(@Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedLinearArgs> timeBasedLinear) {
            $.timeBasedLinear = timeBasedLinear;
            return this;
        }

        /**
         * @param timeBasedLinear The time based linear configuration information. If `type` is `TimeBasedCanary`, use `time_based_canary` instead.
         * 
         * @return builder
         * 
         */
        public Builder timeBasedLinear(DeploymentConfigTrafficRoutingConfigTimeBasedLinearArgs timeBasedLinear) {
            return timeBasedLinear(Output.of(timeBasedLinear));
        }

        /**
         * @param type Type of traffic routing config. One of `TimeBasedCanary`, `TimeBasedLinear`, `AllAtOnce`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of traffic routing config. One of `TimeBasedCanary`, `TimeBasedLinear`, `AllAtOnce`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DeploymentConfigTrafficRoutingConfigArgs build() {
            return $;
        }
    }

}
