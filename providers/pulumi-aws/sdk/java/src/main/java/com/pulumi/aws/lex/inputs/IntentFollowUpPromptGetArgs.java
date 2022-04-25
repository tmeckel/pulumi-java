// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.aws.lex.inputs.IntentFollowUpPromptPromptGetArgs;
import com.pulumi.aws.lex.inputs.IntentFollowUpPromptRejectionStatementGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class IntentFollowUpPromptGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntentFollowUpPromptGetArgs Empty = new IntentFollowUpPromptGetArgs();

    /**
     * Prompts for information from the user. Attributes are documented under prompt.
     * 
     */
    @Import(name="prompt", required=true)
    private Output<IntentFollowUpPromptPromptGetArgs> prompt;

    /**
     * @return Prompts for information from the user. Attributes are documented under prompt.
     * 
     */
    public Output<IntentFollowUpPromptPromptGetArgs> prompt() {
        return this.prompt;
    }

    /**
     * If the user answers &#34;no&#34; to the question defined in the prompt field,
     * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
     * documented below under statement.
     * 
     */
    @Import(name="rejectionStatement", required=true)
    private Output<IntentFollowUpPromptRejectionStatementGetArgs> rejectionStatement;

    /**
     * @return If the user answers &#34;no&#34; to the question defined in the prompt field,
     * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
     * documented below under statement.
     * 
     */
    public Output<IntentFollowUpPromptRejectionStatementGetArgs> rejectionStatement() {
        return this.rejectionStatement;
    }

    private IntentFollowUpPromptGetArgs() {}

    private IntentFollowUpPromptGetArgs(IntentFollowUpPromptGetArgs $) {
        this.prompt = $.prompt;
        this.rejectionStatement = $.rejectionStatement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntentFollowUpPromptGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntentFollowUpPromptGetArgs $;

        public Builder() {
            $ = new IntentFollowUpPromptGetArgs();
        }

        public Builder(IntentFollowUpPromptGetArgs defaults) {
            $ = new IntentFollowUpPromptGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param prompt Prompts for information from the user. Attributes are documented under prompt.
         * 
         * @return builder
         * 
         */
        public Builder prompt(Output<IntentFollowUpPromptPromptGetArgs> prompt) {
            $.prompt = prompt;
            return this;
        }

        /**
         * @param prompt Prompts for information from the user. Attributes are documented under prompt.
         * 
         * @return builder
         * 
         */
        public Builder prompt(IntentFollowUpPromptPromptGetArgs prompt) {
            return prompt(Output.of(prompt));
        }

        /**
         * @param rejectionStatement If the user answers &#34;no&#34; to the question defined in the prompt field,
         * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
         * documented below under statement.
         * 
         * @return builder
         * 
         */
        public Builder rejectionStatement(Output<IntentFollowUpPromptRejectionStatementGetArgs> rejectionStatement) {
            $.rejectionStatement = rejectionStatement;
            return this;
        }

        /**
         * @param rejectionStatement If the user answers &#34;no&#34; to the question defined in the prompt field,
         * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
         * documented below under statement.
         * 
         * @return builder
         * 
         */
        public Builder rejectionStatement(IntentFollowUpPromptRejectionStatementGetArgs rejectionStatement) {
            return rejectionStatement(Output.of(rejectionStatement));
        }

        public IntentFollowUpPromptGetArgs build() {
            $.prompt = Objects.requireNonNull($.prompt, "expected parameter 'prompt' to be non-null");
            $.rejectionStatement = Objects.requireNonNull($.rejectionStatement, "expected parameter 'rejectionStatement' to be non-null");
            return $;
        }
    }

}
