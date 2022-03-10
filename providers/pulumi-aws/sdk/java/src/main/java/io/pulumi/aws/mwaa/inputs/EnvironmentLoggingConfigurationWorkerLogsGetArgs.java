// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mwaa.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentLoggingConfigurationWorkerLogsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentLoggingConfigurationWorkerLogsGetArgs Empty = new EnvironmentLoggingConfigurationWorkerLogsGetArgs();

    @InputImport(name="cloudWatchLogGroupArn")
      private final @Nullable Input<String> cloudWatchLogGroupArn;

    public Input<String> getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn == null ? Input.empty() : this.cloudWatchLogGroupArn;
    }

    /**
     * Enabling or disabling the collection of logs
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Logging level. Valid values: `CRITICAL`, `ERROR`, `WARNING`, `INFO`, `DEBUG`. Will be `INFO` by default.
     * 
     */
    @InputImport(name="logLevel")
      private final @Nullable Input<String> logLevel;

    public Input<String> getLogLevel() {
        return this.logLevel == null ? Input.empty() : this.logLevel;
    }

    public EnvironmentLoggingConfigurationWorkerLogsGetArgs(
        @Nullable Input<String> cloudWatchLogGroupArn,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> logLevel) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
        this.enabled = enabled;
        this.logLevel = logLevel;
    }

    private EnvironmentLoggingConfigurationWorkerLogsGetArgs() {
        this.cloudWatchLogGroupArn = Input.empty();
        this.enabled = Input.empty();
        this.logLevel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentLoggingConfigurationWorkerLogsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudWatchLogGroupArn;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> logLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentLoggingConfigurationWorkerLogsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLogGroupArn = defaults.cloudWatchLogGroupArn;
    	      this.enabled = defaults.enabled;
    	      this.logLevel = defaults.logLevel;
        }

        public Builder cloudWatchLogGroupArn(@Nullable Input<String> cloudWatchLogGroupArn) {
            this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
            return this;
        }

        public Builder cloudWatchLogGroupArn(@Nullable String cloudWatchLogGroupArn) {
            this.cloudWatchLogGroupArn = Input.ofNullable(cloudWatchLogGroupArn);
            return this;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder logLevel(@Nullable Input<String> logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Builder logLevel(@Nullable String logLevel) {
            this.logLevel = Input.ofNullable(logLevel);
            return this;
        }
        public EnvironmentLoggingConfigurationWorkerLogsGetArgs build() {
            return new EnvironmentLoggingConfigurationWorkerLogsGetArgs(cloudWatchLogGroupArn, enabled, logLevel);
        }
    }
}
