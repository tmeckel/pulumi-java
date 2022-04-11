// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptionsGetArgs Empty = new FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptionsGetArgs();

    /**
     * Enables or disables the logging. Defaults to `false`.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * The CloudWatch group name for logging. This value is required if `enabled` is true.
     * 
     */
    @Import(name="logGroupName")
      private final @Nullable Output<String> logGroupName;

    public Output<String> getLogGroupName() {
        return this.logGroupName == null ? Codegen.empty() : this.logGroupName;
    }

    /**
     * The CloudWatch log stream name for logging. This value is required if `enabled` is true.
     * 
     */
    @Import(name="logStreamName")
      private final @Nullable Output<String> logStreamName;

    public Output<String> getLogStreamName() {
        return this.logStreamName == null ? Codegen.empty() : this.logStreamName;
    }

    public FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptionsGetArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> logGroupName,
        @Nullable Output<String> logStreamName) {
        this.enabled = enabled;
        this.logGroupName = logGroupName;
        this.logStreamName = logStreamName;
    }

    private FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptionsGetArgs() {
        this.enabled = Codegen.empty();
        this.logGroupName = Codegen.empty();
        this.logStreamName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> logGroupName;
        private @Nullable Output<String> logStreamName;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logGroupName = defaults.logGroupName;
    	      this.logStreamName = defaults.logStreamName;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder logGroupName(@Nullable Output<String> logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }
        public Builder logGroupName(@Nullable String logGroupName) {
            this.logGroupName = Codegen.ofNullable(logGroupName);
            return this;
        }
        public Builder logStreamName(@Nullable Output<String> logStreamName) {
            this.logStreamName = logStreamName;
            return this;
        }
        public Builder logStreamName(@Nullable String logStreamName) {
            this.logStreamName = Codegen.ofNullable(logStreamName);
            return this;
        }        public FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptionsGetArgs build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptionsGetArgs(enabled, logGroupName, logStreamName);
        }
    }
}
