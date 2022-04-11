// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobDefinitionRetryStrategyEvaluateOnExitArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobDefinitionRetryStrategyEvaluateOnExitArgs Empty = new JobDefinitionRetryStrategyEvaluateOnExitArgs();

    /**
     * Specifies the action to take if all of the specified conditions are met. The values are not case sensitive. Valid values: `RETRY`, `EXIT`.
     * 
     */
    @Import(name="action", required=true)
      private final Output<String> action;

    public Output<String> getAction() {
        return this.action;
    }

    /**
     * A glob pattern to match against the decimal representation of the exit code returned for a job.
     * 
     */
    @Import(name="onExitCode")
      private final @Nullable Output<String> onExitCode;

    public Output<String> getOnExitCode() {
        return this.onExitCode == null ? Codegen.empty() : this.onExitCode;
    }

    /**
     * A glob pattern to match against the reason returned for a job.
     * 
     */
    @Import(name="onReason")
      private final @Nullable Output<String> onReason;

    public Output<String> getOnReason() {
        return this.onReason == null ? Codegen.empty() : this.onReason;
    }

    /**
     * A glob pattern to match against the status reason returned for a job.
     * 
     */
    @Import(name="onStatusReason")
      private final @Nullable Output<String> onStatusReason;

    public Output<String> getOnStatusReason() {
        return this.onStatusReason == null ? Codegen.empty() : this.onStatusReason;
    }

    public JobDefinitionRetryStrategyEvaluateOnExitArgs(
        Output<String> action,
        @Nullable Output<String> onExitCode,
        @Nullable Output<String> onReason,
        @Nullable Output<String> onStatusReason) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.onExitCode = onExitCode;
        this.onReason = onReason;
        this.onStatusReason = onStatusReason;
    }

    private JobDefinitionRetryStrategyEvaluateOnExitArgs() {
        this.action = Codegen.empty();
        this.onExitCode = Codegen.empty();
        this.onReason = Codegen.empty();
        this.onStatusReason = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDefinitionRetryStrategyEvaluateOnExitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> action;
        private @Nullable Output<String> onExitCode;
        private @Nullable Output<String> onReason;
        private @Nullable Output<String> onStatusReason;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDefinitionRetryStrategyEvaluateOnExitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.onExitCode = defaults.onExitCode;
    	      this.onReason = defaults.onReason;
    	      this.onStatusReason = defaults.onStatusReason;
        }

        public Builder action(Output<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(String action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder onExitCode(@Nullable Output<String> onExitCode) {
            this.onExitCode = onExitCode;
            return this;
        }
        public Builder onExitCode(@Nullable String onExitCode) {
            this.onExitCode = Codegen.ofNullable(onExitCode);
            return this;
        }
        public Builder onReason(@Nullable Output<String> onReason) {
            this.onReason = onReason;
            return this;
        }
        public Builder onReason(@Nullable String onReason) {
            this.onReason = Codegen.ofNullable(onReason);
            return this;
        }
        public Builder onStatusReason(@Nullable Output<String> onStatusReason) {
            this.onStatusReason = onStatusReason;
            return this;
        }
        public Builder onStatusReason(@Nullable String onStatusReason) {
            this.onStatusReason = Codegen.ofNullable(onStatusReason);
            return this;
        }        public JobDefinitionRetryStrategyEvaluateOnExitArgs build() {
            return new JobDefinitionRetryStrategyEvaluateOnExitArgs(action, onExitCode, onReason, onStatusReason);
        }
    }
}
