// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReceiptRuleLambdaActionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleLambdaActionGetArgs Empty = new ReceiptRuleLambdaActionGetArgs();

    /**
     * The ARN of the Lambda function to invoke
     * 
     */
    @Import(name="functionArn", required=true)
    private Output<String> functionArn;

    /**
     * @return The ARN of the Lambda function to invoke
     * 
     */
    public Output<String> functionArn() {
        return this.functionArn;
    }

    /**
     * `Event` or `RequestResponse`
     * 
     */
    @Import(name="invocationType")
    private @Nullable Output<String> invocationType;

    /**
     * @return `Event` or `RequestResponse`
     * 
     */
    public Optional<Output<String>> invocationType() {
        return Optional.ofNullable(this.invocationType);
    }

    /**
     * The position of the action in the receipt rule
     * 
     */
    @Import(name="position", required=true)
    private Output<Integer> position;

    /**
     * @return The position of the action in the receipt rule
     * 
     */
    public Output<Integer> position() {
        return this.position;
    }

    /**
     * The ARN of an SNS topic to notify
     * 
     */
    @Import(name="topicArn")
    private @Nullable Output<String> topicArn;

    /**
     * @return The ARN of an SNS topic to notify
     * 
     */
    public Optional<Output<String>> topicArn() {
        return Optional.ofNullable(this.topicArn);
    }

    private ReceiptRuleLambdaActionGetArgs() {}

    private ReceiptRuleLambdaActionGetArgs(ReceiptRuleLambdaActionGetArgs $) {
        this.functionArn = $.functionArn;
        this.invocationType = $.invocationType;
        this.position = $.position;
        this.topicArn = $.topicArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReceiptRuleLambdaActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReceiptRuleLambdaActionGetArgs $;

        public Builder() {
            $ = new ReceiptRuleLambdaActionGetArgs();
        }

        public Builder(ReceiptRuleLambdaActionGetArgs defaults) {
            $ = new ReceiptRuleLambdaActionGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param functionArn The ARN of the Lambda function to invoke
         * 
         * @return builder
         * 
         */
        public Builder functionArn(Output<String> functionArn) {
            $.functionArn = functionArn;
            return this;
        }

        /**
         * @param functionArn The ARN of the Lambda function to invoke
         * 
         * @return builder
         * 
         */
        public Builder functionArn(String functionArn) {
            return functionArn(Output.of(functionArn));
        }

        /**
         * @param invocationType `Event` or `RequestResponse`
         * 
         * @return builder
         * 
         */
        public Builder invocationType(@Nullable Output<String> invocationType) {
            $.invocationType = invocationType;
            return this;
        }

        /**
         * @param invocationType `Event` or `RequestResponse`
         * 
         * @return builder
         * 
         */
        public Builder invocationType(String invocationType) {
            return invocationType(Output.of(invocationType));
        }

        /**
         * @param position The position of the action in the receipt rule
         * 
         * @return builder
         * 
         */
        public Builder position(Output<Integer> position) {
            $.position = position;
            return this;
        }

        /**
         * @param position The position of the action in the receipt rule
         * 
         * @return builder
         * 
         */
        public Builder position(Integer position) {
            return position(Output.of(position));
        }

        /**
         * @param topicArn The ARN of an SNS topic to notify
         * 
         * @return builder
         * 
         */
        public Builder topicArn(@Nullable Output<String> topicArn) {
            $.topicArn = topicArn;
            return this;
        }

        /**
         * @param topicArn The ARN of an SNS topic to notify
         * 
         * @return builder
         * 
         */
        public Builder topicArn(String topicArn) {
            return topicArn(Output.of(topicArn));
        }

        public ReceiptRuleLambdaActionGetArgs build() {
            $.functionArn = Objects.requireNonNull($.functionArn, "expected parameter 'functionArn' to be non-null");
            $.position = Objects.requireNonNull($.position, "expected parameter 'position' to be non-null");
            return $;
        }
    }

}
