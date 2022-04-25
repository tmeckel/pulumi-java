// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information about code hooks that Amazon Lex calls during a conversation.
 * 
 */
public final class BotAliasLambdaCodeHookArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotAliasLambdaCodeHookArgs Empty = new BotAliasLambdaCodeHookArgs();

    /**
     * The version of the request-response that you want Amazon Lex to use to invoke your Lambda function.
     * 
     */
    @Import(name="codeHookInterfaceVersion", required=true)
    private Output<String> codeHookInterfaceVersion;

    /**
     * @return The version of the request-response that you want Amazon Lex to use to invoke your Lambda function.
     * 
     */
    public Output<String> codeHookInterfaceVersion() {
        return this.codeHookInterfaceVersion;
    }

    /**
     * The Amazon Resource Name (ARN) of the Lambda function.
     * 
     */
    @Import(name="lambdaArn", required=true)
    private Output<String> lambdaArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Lambda function.
     * 
     */
    public Output<String> lambdaArn() {
        return this.lambdaArn;
    }

    private BotAliasLambdaCodeHookArgs() {}

    private BotAliasLambdaCodeHookArgs(BotAliasLambdaCodeHookArgs $) {
        this.codeHookInterfaceVersion = $.codeHookInterfaceVersion;
        this.lambdaArn = $.lambdaArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotAliasLambdaCodeHookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAliasLambdaCodeHookArgs $;

        public Builder() {
            $ = new BotAliasLambdaCodeHookArgs();
        }

        public Builder(BotAliasLambdaCodeHookArgs defaults) {
            $ = new BotAliasLambdaCodeHookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param codeHookInterfaceVersion The version of the request-response that you want Amazon Lex to use to invoke your Lambda function.
         * 
         * @return builder
         * 
         */
        public Builder codeHookInterfaceVersion(Output<String> codeHookInterfaceVersion) {
            $.codeHookInterfaceVersion = codeHookInterfaceVersion;
            return this;
        }

        /**
         * @param codeHookInterfaceVersion The version of the request-response that you want Amazon Lex to use to invoke your Lambda function.
         * 
         * @return builder
         * 
         */
        public Builder codeHookInterfaceVersion(String codeHookInterfaceVersion) {
            return codeHookInterfaceVersion(Output.of(codeHookInterfaceVersion));
        }

        /**
         * @param lambdaArn The Amazon Resource Name (ARN) of the Lambda function.
         * 
         * @return builder
         * 
         */
        public Builder lambdaArn(Output<String> lambdaArn) {
            $.lambdaArn = lambdaArn;
            return this;
        }

        /**
         * @param lambdaArn The Amazon Resource Name (ARN) of the Lambda function.
         * 
         * @return builder
         * 
         */
        public Builder lambdaArn(String lambdaArn) {
            return lambdaArn(Output.of(lambdaArn));
        }

        public BotAliasLambdaCodeHookArgs build() {
            $.codeHookInterfaceVersion = Objects.requireNonNull($.codeHookInterfaceVersion, "expected parameter 'codeHookInterfaceVersion' to be non-null");
            $.lambdaArn = Objects.requireNonNull($.lambdaArn, "expected parameter 'lambdaArn' to be non-null");
            return $;
        }
    }

}
