// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnalyticsApplicationCloudwatchLoggingOptionsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationCloudwatchLoggingOptionsGetArgs Empty = new AnalyticsApplicationCloudwatchLoggingOptionsGetArgs();

    /**
     * The ARN of the Kinesis Analytics Application.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ARN of the Kinesis Analytics Application.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The ARN of the CloudWatch Log Stream.
     * 
     */
    @Import(name="logStreamArn", required=true)
    private Output<String> logStreamArn;

    /**
     * @return The ARN of the CloudWatch Log Stream.
     * 
     */
    public Output<String> logStreamArn() {
        return this.logStreamArn;
    }

    /**
     * The ARN of the IAM Role used to send application messages.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The ARN of the IAM Role used to send application messages.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    private AnalyticsApplicationCloudwatchLoggingOptionsGetArgs() {}

    private AnalyticsApplicationCloudwatchLoggingOptionsGetArgs(AnalyticsApplicationCloudwatchLoggingOptionsGetArgs $) {
        this.id = $.id;
        this.logStreamArn = $.logStreamArn;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalyticsApplicationCloudwatchLoggingOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsApplicationCloudwatchLoggingOptionsGetArgs $;

        public Builder() {
            $ = new AnalyticsApplicationCloudwatchLoggingOptionsGetArgs();
        }

        public Builder(AnalyticsApplicationCloudwatchLoggingOptionsGetArgs defaults) {
            $ = new AnalyticsApplicationCloudwatchLoggingOptionsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ARN of the Kinesis Analytics Application.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ARN of the Kinesis Analytics Application.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param logStreamArn The ARN of the CloudWatch Log Stream.
         * 
         * @return builder
         * 
         */
        public Builder logStreamArn(Output<String> logStreamArn) {
            $.logStreamArn = logStreamArn;
            return this;
        }

        /**
         * @param logStreamArn The ARN of the CloudWatch Log Stream.
         * 
         * @return builder
         * 
         */
        public Builder logStreamArn(String logStreamArn) {
            return logStreamArn(Output.of(logStreamArn));
        }

        /**
         * @param roleArn The ARN of the IAM Role used to send application messages.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of the IAM Role used to send application messages.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public AnalyticsApplicationCloudwatchLoggingOptionsGetArgs build() {
            $.logStreamArn = Objects.requireNonNull($.logStreamArn, "expected parameter 'logStreamArn' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
