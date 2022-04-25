// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleErrorActionSqsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionSqsGetArgs Empty = new TopicRuleErrorActionSqsGetArgs();

    /**
     * The URL of the Amazon SQS queue.
     * 
     */
    @Import(name="queueUrl", required=true)
    private Output<String> queueUrl;

    /**
     * @return The URL of the Amazon SQS queue.
     * 
     */
    public Output<String> queueUrl() {
        return this.queueUrl;
    }

    /**
     * The ARN of the IAM role that grants access.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The ARN of the IAM role that grants access.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * Specifies whether to use Base64 encoding.
     * 
     */
    @Import(name="useBase64", required=true)
    private Output<Boolean> useBase64;

    /**
     * @return Specifies whether to use Base64 encoding.
     * 
     */
    public Output<Boolean> useBase64() {
        return this.useBase64;
    }

    private TopicRuleErrorActionSqsGetArgs() {}

    private TopicRuleErrorActionSqsGetArgs(TopicRuleErrorActionSqsGetArgs $) {
        this.queueUrl = $.queueUrl;
        this.roleArn = $.roleArn;
        this.useBase64 = $.useBase64;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleErrorActionSqsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleErrorActionSqsGetArgs $;

        public Builder() {
            $ = new TopicRuleErrorActionSqsGetArgs();
        }

        public Builder(TopicRuleErrorActionSqsGetArgs defaults) {
            $ = new TopicRuleErrorActionSqsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param queueUrl The URL of the Amazon SQS queue.
         * 
         * @return builder
         * 
         */
        public Builder queueUrl(Output<String> queueUrl) {
            $.queueUrl = queueUrl;
            return this;
        }

        /**
         * @param queueUrl The URL of the Amazon SQS queue.
         * 
         * @return builder
         * 
         */
        public Builder queueUrl(String queueUrl) {
            return queueUrl(Output.of(queueUrl));
        }

        /**
         * @param roleArn The ARN of the IAM role that grants access.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of the IAM role that grants access.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param useBase64 Specifies whether to use Base64 encoding.
         * 
         * @return builder
         * 
         */
        public Builder useBase64(Output<Boolean> useBase64) {
            $.useBase64 = useBase64;
            return this;
        }

        /**
         * @param useBase64 Specifies whether to use Base64 encoding.
         * 
         * @return builder
         * 
         */
        public Builder useBase64(Boolean useBase64) {
            return useBase64(Output.of(useBase64));
        }

        public TopicRuleErrorActionSqsGetArgs build() {
            $.queueUrl = Objects.requireNonNull($.queueUrl, "expected parameter 'queueUrl' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.useBase64 = Objects.requireNonNull($.useBase64, "expected parameter 'useBase64' to be non-null");
            return $;
        }
    }

}
