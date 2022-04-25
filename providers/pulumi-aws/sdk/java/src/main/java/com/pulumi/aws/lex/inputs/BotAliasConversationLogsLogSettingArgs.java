// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BotAliasConversationLogsLogSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotAliasConversationLogsLogSettingArgs Empty = new BotAliasConversationLogsLogSettingArgs();

    /**
     * The destination where logs are delivered. Options are `CLOUDWATCH_LOGS` or `S3`.
     * 
     */
    @Import(name="destination", required=true)
    private Output<String> destination;

    /**
     * @return The destination where logs are delivered. Options are `CLOUDWATCH_LOGS` or `S3`.
     * 
     */
    public Output<String> destination() {
        return this.destination;
    }

    /**
     * The Amazon Resource Name (ARN) of the key used to encrypt audio logs in an S3 bucket. This can only be specified when `destination` is set to `S3`. Must be between 20 and 2048 characters in length.
     * 
     */
    @Import(name="kmsKeyArn")
    private @Nullable Output<String> kmsKeyArn;

    /**
     * @return The Amazon Resource Name (ARN) of the key used to encrypt audio logs in an S3 bucket. This can only be specified when `destination` is set to `S3`. Must be between 20 and 2048 characters in length.
     * 
     */
    public Optional<Output<String>> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    /**
     * The type of logging that is enabled. Options are `AUDIO` or `TEXT`.
     * 
     */
    @Import(name="logType", required=true)
    private Output<String> logType;

    /**
     * @return The type of logging that is enabled. Options are `AUDIO` or `TEXT`.
     * 
     */
    public Output<String> logType() {
        return this.logType;
    }

    /**
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs are delivered. Must be less than or equal to 2048 characters in length.
     * 
     */
    @Import(name="resourceArn", required=true)
    private Output<String> resourceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs are delivered. Must be less than or equal to 2048 characters in length.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    /**
     * The prefix of the S3 object key for `AUDIO` logs or the log stream name for `TEXT` logs.
     * 
     */
    @Import(name="resourcePrefix")
    private @Nullable Output<String> resourcePrefix;

    /**
     * @return The prefix of the S3 object key for `AUDIO` logs or the log stream name for `TEXT` logs.
     * 
     */
    public Optional<Output<String>> resourcePrefix() {
        return Optional.ofNullable(this.resourcePrefix);
    }

    private BotAliasConversationLogsLogSettingArgs() {}

    private BotAliasConversationLogsLogSettingArgs(BotAliasConversationLogsLogSettingArgs $) {
        this.destination = $.destination;
        this.kmsKeyArn = $.kmsKeyArn;
        this.logType = $.logType;
        this.resourceArn = $.resourceArn;
        this.resourcePrefix = $.resourcePrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotAliasConversationLogsLogSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAliasConversationLogsLogSettingArgs $;

        public Builder() {
            $ = new BotAliasConversationLogsLogSettingArgs();
        }

        public Builder(BotAliasConversationLogsLogSettingArgs defaults) {
            $ = new BotAliasConversationLogsLogSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destination The destination where logs are delivered. Options are `CLOUDWATCH_LOGS` or `S3`.
         * 
         * @return builder
         * 
         */
        public Builder destination(Output<String> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination The destination where logs are delivered. Options are `CLOUDWATCH_LOGS` or `S3`.
         * 
         * @return builder
         * 
         */
        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param kmsKeyArn The Amazon Resource Name (ARN) of the key used to encrypt audio logs in an S3 bucket. This can only be specified when `destination` is set to `S3`. Must be between 20 and 2048 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            $.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * @param kmsKeyArn The Amazon Resource Name (ARN) of the key used to encrypt audio logs in an S3 bucket. This can only be specified when `destination` is set to `S3`. Must be between 20 and 2048 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(String kmsKeyArn) {
            return kmsKeyArn(Output.of(kmsKeyArn));
        }

        /**
         * @param logType The type of logging that is enabled. Options are `AUDIO` or `TEXT`.
         * 
         * @return builder
         * 
         */
        public Builder logType(Output<String> logType) {
            $.logType = logType;
            return this;
        }

        /**
         * @param logType The type of logging that is enabled. Options are `AUDIO` or `TEXT`.
         * 
         * @return builder
         * 
         */
        public Builder logType(String logType) {
            return logType(Output.of(logType));
        }

        /**
         * @param resourceArn The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs are delivered. Must be less than or equal to 2048 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        /**
         * @param resourceArn The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs are delivered. Must be less than or equal to 2048 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        /**
         * @param resourcePrefix The prefix of the S3 object key for `AUDIO` logs or the log stream name for `TEXT` logs.
         * 
         * @return builder
         * 
         */
        public Builder resourcePrefix(@Nullable Output<String> resourcePrefix) {
            $.resourcePrefix = resourcePrefix;
            return this;
        }

        /**
         * @param resourcePrefix The prefix of the S3 object key for `AUDIO` logs or the log stream name for `TEXT` logs.
         * 
         * @return builder
         * 
         */
        public Builder resourcePrefix(String resourcePrefix) {
            return resourcePrefix(Output.of(resourcePrefix));
        }

        public BotAliasConversationLogsLogSettingArgs build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            $.logType = Objects.requireNonNull($.logType, "expected parameter 'logType' to be non-null");
            $.resourceArn = Objects.requireNonNull($.resourceArn, "expected parameter 'resourceArn' to be non-null");
            return $;
        }
    }

}
