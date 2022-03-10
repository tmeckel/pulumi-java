// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptionsArgs Empty = new FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptionsArgs();

    /**
     * Enables or disables the logging. Defaults to `false`.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The CloudWatch group name for logging. This value is required if `enabled` is true.
     * 
     */
    @InputImport(name="logGroupName")
      private final @Nullable Input<String> logGroupName;

    public Input<String> getLogGroupName() {
        return this.logGroupName == null ? Input.empty() : this.logGroupName;
    }

    /**
     * The CloudWatch log stream name for logging. This value is required if `enabled` is true.
     * 
     */
    @InputImport(name="logStreamName")
      private final @Nullable Input<String> logStreamName;

    public Input<String> getLogStreamName() {
        return this.logStreamName == null ? Input.empty() : this.logStreamName;
    }

    public FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptionsArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> logGroupName,
        @Nullable Input<String> logStreamName) {
        this.enabled = enabled;
        this.logGroupName = logGroupName;
        this.logStreamName = logStreamName;
    }

    private FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptionsArgs() {
        this.enabled = Input.empty();
        this.logGroupName = Input.empty();
        this.logStreamName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> logGroupName;
        private @Nullable Input<String> logStreamName;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logGroupName = defaults.logGroupName;
    	      this.logStreamName = defaults.logStreamName;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder logGroupName(@Nullable Input<String> logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }

        public Builder logGroupName(@Nullable String logGroupName) {
            this.logGroupName = Input.ofNullable(logGroupName);
            return this;
        }

        public Builder logStreamName(@Nullable Input<String> logStreamName) {
            this.logStreamName = logStreamName;
            return this;
        }

        public Builder logStreamName(@Nullable String logStreamName) {
            this.logStreamName = Input.ofNullable(logStreamName);
            return this;
        }
        public FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptionsArgs build() {
            return new FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptionsArgs(enabled, logGroupName, logStreamName);
        }
    }
}
