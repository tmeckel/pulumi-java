// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.synthetics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CanaryRunConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final CanaryRunConfigArgs Empty = new CanaryRunConfigArgs();

    /**
     * Whether this canary is to use active AWS X-Ray tracing when it runs. You can enable active tracing only for canaries that use version syn-nodejs-2.0 or later for their canary runtime.
     * 
     */
    @InputImport(name="activeTracing")
      private final @Nullable Input<Boolean> activeTracing;

    public Input<Boolean> getActiveTracing() {
        return this.activeTracing == null ? Input.empty() : this.activeTracing;
    }

    /**
     * Maximum amount of memory available to the canary while it is running, in MB. The value you specify must be a multiple of 64.
     * 
     */
    @InputImport(name="memoryInMb")
      private final @Nullable Input<Integer> memoryInMb;

    public Input<Integer> getMemoryInMb() {
        return this.memoryInMb == null ? Input.empty() : this.memoryInMb;
    }

    /**
     * Number of seconds the canary is allowed to run before it must stop. If you omit this field, the frequency of the canary is used, up to a maximum of 840 (14 minutes).
     * 
     */
    @InputImport(name="timeoutInSeconds")
      private final @Nullable Input<Integer> timeoutInSeconds;

    public Input<Integer> getTimeoutInSeconds() {
        return this.timeoutInSeconds == null ? Input.empty() : this.timeoutInSeconds;
    }

    public CanaryRunConfigArgs(
        @Nullable Input<Boolean> activeTracing,
        @Nullable Input<Integer> memoryInMb,
        @Nullable Input<Integer> timeoutInSeconds) {
        this.activeTracing = activeTracing;
        this.memoryInMb = memoryInMb;
        this.timeoutInSeconds = timeoutInSeconds;
    }

    private CanaryRunConfigArgs() {
        this.activeTracing = Input.empty();
        this.memoryInMb = Input.empty();
        this.timeoutInSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryRunConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> activeTracing;
        private @Nullable Input<Integer> memoryInMb;
        private @Nullable Input<Integer> timeoutInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryRunConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeTracing = defaults.activeTracing;
    	      this.memoryInMb = defaults.memoryInMb;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
        }

        public Builder activeTracing(@Nullable Input<Boolean> activeTracing) {
            this.activeTracing = activeTracing;
            return this;
        }

        public Builder activeTracing(@Nullable Boolean activeTracing) {
            this.activeTracing = Input.ofNullable(activeTracing);
            return this;
        }

        public Builder memoryInMb(@Nullable Input<Integer> memoryInMb) {
            this.memoryInMb = memoryInMb;
            return this;
        }

        public Builder memoryInMb(@Nullable Integer memoryInMb) {
            this.memoryInMb = Input.ofNullable(memoryInMb);
            return this;
        }

        public Builder timeoutInSeconds(@Nullable Input<Integer> timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public Builder timeoutInSeconds(@Nullable Integer timeoutInSeconds) {
            this.timeoutInSeconds = Input.ofNullable(timeoutInSeconds);
            return this;
        }
        public CanaryRunConfigArgs build() {
            return new CanaryRunConfigArgs(activeTracing, memoryInMb, timeoutInSeconds);
        }
    }
}
