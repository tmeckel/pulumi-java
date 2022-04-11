// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotAliasConversationLogsLogSettingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAliasConversationLogsLogSettingGetArgs Empty = new BotAliasConversationLogsLogSettingGetArgs();

    /**
     * The destination where logs are delivered. Options are `CLOUDWATCH_LOGS` or `S3`.
     * 
     */
    @Import(name="destination", required=true)
      private final Output<String> destination;

    public Output<String> getDestination() {
        return this.destination;
    }

    /**
     * The Amazon Resource Name (ARN) of the key used to encrypt audio logs in an S3 bucket. This can only be specified when `destination` is set to `S3`. Must be between 20 and 2048 characters in length.
     * 
     */
    @Import(name="kmsKeyArn")
      private final @Nullable Output<String> kmsKeyArn;

    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Codegen.empty() : this.kmsKeyArn;
    }

    /**
     * The type of logging that is enabled. Options are `AUDIO` or `TEXT`.
     * 
     */
    @Import(name="logType", required=true)
      private final Output<String> logType;

    public Output<String> getLogType() {
        return this.logType;
    }

    /**
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs are delivered. Must be less than or equal to 2048 characters in length.
     * 
     */
    @Import(name="resourceArn", required=true)
      private final Output<String> resourceArn;

    public Output<String> getResourceArn() {
        return this.resourceArn;
    }

    /**
     * The prefix of the S3 object key for `AUDIO` logs or the log stream name for `TEXT` logs.
     * 
     */
    @Import(name="resourcePrefix")
      private final @Nullable Output<String> resourcePrefix;

    public Output<String> getResourcePrefix() {
        return this.resourcePrefix == null ? Codegen.empty() : this.resourcePrefix;
    }

    public BotAliasConversationLogsLogSettingGetArgs(
        Output<String> destination,
        @Nullable Output<String> kmsKeyArn,
        Output<String> logType,
        Output<String> resourceArn,
        @Nullable Output<String> resourcePrefix) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.kmsKeyArn = kmsKeyArn;
        this.logType = Objects.requireNonNull(logType, "expected parameter 'logType' to be non-null");
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
        this.resourcePrefix = resourcePrefix;
    }

    private BotAliasConversationLogsLogSettingGetArgs() {
        this.destination = Codegen.empty();
        this.kmsKeyArn = Codegen.empty();
        this.logType = Codegen.empty();
        this.resourceArn = Codegen.empty();
        this.resourcePrefix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasConversationLogsLogSettingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> destination;
        private @Nullable Output<String> kmsKeyArn;
        private Output<String> logType;
        private Output<String> resourceArn;
        private @Nullable Output<String> resourcePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasConversationLogsLogSettingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.logType = defaults.logType;
    	      this.resourceArn = defaults.resourceArn;
    	      this.resourcePrefix = defaults.resourcePrefix;
        }

        public Builder destination(Output<String> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder destination(String destination) {
            this.destination = Output.of(Objects.requireNonNull(destination));
            return this;
        }
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Codegen.ofNullable(kmsKeyArn);
            return this;
        }
        public Builder logType(Output<String> logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }
        public Builder logType(String logType) {
            this.logType = Output.of(Objects.requireNonNull(logType));
            return this;
        }
        public Builder resourceArn(Output<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Output.of(Objects.requireNonNull(resourceArn));
            return this;
        }
        public Builder resourcePrefix(@Nullable Output<String> resourcePrefix) {
            this.resourcePrefix = resourcePrefix;
            return this;
        }
        public Builder resourcePrefix(@Nullable String resourcePrefix) {
            this.resourcePrefix = Codegen.ofNullable(resourcePrefix);
            return this;
        }        public BotAliasConversationLogsLogSettingGetArgs build() {
            return new BotAliasConversationLogsLogSettingGetArgs(destination, kmsKeyArn, logType, resourceArn, resourcePrefix);
        }
    }
}
