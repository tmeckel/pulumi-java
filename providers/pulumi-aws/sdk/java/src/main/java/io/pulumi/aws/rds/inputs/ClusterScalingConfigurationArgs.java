// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterScalingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterScalingConfigurationArgs Empty = new ClusterScalingConfigurationArgs();

    /**
     * Whether to enable automatic pause. A DB cluster can be paused only when it's idle (it has no connections). If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In this case, the DB cluster is restored when there is a request to connect to it. Defaults to `true`.
     * 
     */
    @Import(name="autoPause")
      private final @Nullable Output<Boolean> autoPause;

    public Output<Boolean> getAutoPause() {
        return this.autoPause == null ? Codegen.empty() : this.autoPause;
    }

    /**
     * The maximum capacity for an Aurora DB cluster in `serverless` DB engine mode. The maximum capacity must be greater than or equal to the minimum capacity. Valid Aurora MySQL capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`. Valid Aurora PostgreSQL capacity values are (`2`, `4`, `8`, `16`, `32`, `64`, `192`, and `384`). Defaults to `16`.
     * 
     */
    @Import(name="maxCapacity")
      private final @Nullable Output<Integer> maxCapacity;

    public Output<Integer> getMaxCapacity() {
        return this.maxCapacity == null ? Codegen.empty() : this.maxCapacity;
    }

    /**
     * The minimum capacity for an Aurora DB cluster in `serverless` DB engine mode. The minimum capacity must be lesser than or equal to the maximum capacity. Valid Aurora MySQL capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`. Valid Aurora PostgreSQL capacity values are (`2`, `4`, `8`, `16`, `32`, `64`, `192`, and `384`). Defaults to `1`.
     * 
     */
    @Import(name="minCapacity")
      private final @Nullable Output<Integer> minCapacity;

    public Output<Integer> getMinCapacity() {
        return this.minCapacity == null ? Codegen.empty() : this.minCapacity;
    }

    /**
     * The time, in seconds, before an Aurora DB cluster in serverless mode is paused. Valid values are `300` through `86400`. Defaults to `300`.
     * 
     */
    @Import(name="secondsUntilAutoPause")
      private final @Nullable Output<Integer> secondsUntilAutoPause;

    public Output<Integer> getSecondsUntilAutoPause() {
        return this.secondsUntilAutoPause == null ? Codegen.empty() : this.secondsUntilAutoPause;
    }

    /**
     * The action to take when the timeout is reached. Valid values: `ForceApplyCapacityChange`, `RollbackCapacityChange`. Defaults to `RollbackCapacityChange`. See [documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.timeout-action).
     * 
     */
    @Import(name="timeoutAction")
      private final @Nullable Output<String> timeoutAction;

    public Output<String> getTimeoutAction() {
        return this.timeoutAction == null ? Codegen.empty() : this.timeoutAction;
    }

    public ClusterScalingConfigurationArgs(
        @Nullable Output<Boolean> autoPause,
        @Nullable Output<Integer> maxCapacity,
        @Nullable Output<Integer> minCapacity,
        @Nullable Output<Integer> secondsUntilAutoPause,
        @Nullable Output<String> timeoutAction) {
        this.autoPause = autoPause;
        this.maxCapacity = maxCapacity;
        this.minCapacity = minCapacity;
        this.secondsUntilAutoPause = secondsUntilAutoPause;
        this.timeoutAction = timeoutAction;
    }

    private ClusterScalingConfigurationArgs() {
        this.autoPause = Codegen.empty();
        this.maxCapacity = Codegen.empty();
        this.minCapacity = Codegen.empty();
        this.secondsUntilAutoPause = Codegen.empty();
        this.timeoutAction = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterScalingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoPause;
        private @Nullable Output<Integer> maxCapacity;
        private @Nullable Output<Integer> minCapacity;
        private @Nullable Output<Integer> secondsUntilAutoPause;
        private @Nullable Output<String> timeoutAction;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterScalingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoPause = defaults.autoPause;
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
    	      this.secondsUntilAutoPause = defaults.secondsUntilAutoPause;
    	      this.timeoutAction = defaults.timeoutAction;
        }

        public Builder autoPause(@Nullable Output<Boolean> autoPause) {
            this.autoPause = autoPause;
            return this;
        }
        public Builder autoPause(@Nullable Boolean autoPause) {
            this.autoPause = Codegen.ofNullable(autoPause);
            return this;
        }
        public Builder maxCapacity(@Nullable Output<Integer> maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Builder maxCapacity(@Nullable Integer maxCapacity) {
            this.maxCapacity = Codegen.ofNullable(maxCapacity);
            return this;
        }
        public Builder minCapacity(@Nullable Output<Integer> minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public Builder minCapacity(@Nullable Integer minCapacity) {
            this.minCapacity = Codegen.ofNullable(minCapacity);
            return this;
        }
        public Builder secondsUntilAutoPause(@Nullable Output<Integer> secondsUntilAutoPause) {
            this.secondsUntilAutoPause = secondsUntilAutoPause;
            return this;
        }
        public Builder secondsUntilAutoPause(@Nullable Integer secondsUntilAutoPause) {
            this.secondsUntilAutoPause = Codegen.ofNullable(secondsUntilAutoPause);
            return this;
        }
        public Builder timeoutAction(@Nullable Output<String> timeoutAction) {
            this.timeoutAction = timeoutAction;
            return this;
        }
        public Builder timeoutAction(@Nullable String timeoutAction) {
            this.timeoutAction = Codegen.ofNullable(timeoutAction);
            return this;
        }        public ClusterScalingConfigurationArgs build() {
            return new ClusterScalingConfigurationArgs(autoPause, maxCapacity, minCapacity, secondsUntilAutoPause, timeoutAction);
        }
    }
}
