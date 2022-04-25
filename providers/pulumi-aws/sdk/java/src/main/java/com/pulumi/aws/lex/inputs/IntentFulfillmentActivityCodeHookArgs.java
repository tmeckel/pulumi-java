// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class IntentFulfillmentActivityCodeHookArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntentFulfillmentActivityCodeHookArgs Empty = new IntentFulfillmentActivityCodeHookArgs();

    /**
     * The version of the request-response that you want Amazon Lex to use
     * to invoke your Lambda function. For more information, see
     * [Using Lambda Functions](https://docs.aws.amazon.com/lex/latest/dg/using-lambda.html). Must be less than or equal to 5 characters in length.
     * 
     */
    @Import(name="messageVersion", required=true)
    private Output<String> messageVersion;

    /**
     * @return The version of the request-response that you want Amazon Lex to use
     * to invoke your Lambda function. For more information, see
     * [Using Lambda Functions](https://docs.aws.amazon.com/lex/latest/dg/using-lambda.html). Must be less than or equal to 5 characters in length.
     * 
     */
    public Output<String> messageVersion() {
        return this.messageVersion;
    }

    /**
     * The Amazon Resource Name (ARN) of the Lambda function.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return The Amazon Resource Name (ARN) of the Lambda function.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    private IntentFulfillmentActivityCodeHookArgs() {}

    private IntentFulfillmentActivityCodeHookArgs(IntentFulfillmentActivityCodeHookArgs $) {
        this.messageVersion = $.messageVersion;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntentFulfillmentActivityCodeHookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntentFulfillmentActivityCodeHookArgs $;

        public Builder() {
            $ = new IntentFulfillmentActivityCodeHookArgs();
        }

        public Builder(IntentFulfillmentActivityCodeHookArgs defaults) {
            $ = new IntentFulfillmentActivityCodeHookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param messageVersion The version of the request-response that you want Amazon Lex to use
         * to invoke your Lambda function. For more information, see
         * [Using Lambda Functions](https://docs.aws.amazon.com/lex/latest/dg/using-lambda.html). Must be less than or equal to 5 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder messageVersion(Output<String> messageVersion) {
            $.messageVersion = messageVersion;
            return this;
        }

        /**
         * @param messageVersion The version of the request-response that you want Amazon Lex to use
         * to invoke your Lambda function. For more information, see
         * [Using Lambda Functions](https://docs.aws.amazon.com/lex/latest/dg/using-lambda.html). Must be less than or equal to 5 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder messageVersion(String messageVersion) {
            return messageVersion(Output.of(messageVersion));
        }

        /**
         * @param uri The Amazon Resource Name (ARN) of the Lambda function.
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The Amazon Resource Name (ARN) of the Lambda function.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public IntentFulfillmentActivityCodeHookArgs build() {
            $.messageVersion = Objects.requireNonNull($.messageVersion, "expected parameter 'messageVersion' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
