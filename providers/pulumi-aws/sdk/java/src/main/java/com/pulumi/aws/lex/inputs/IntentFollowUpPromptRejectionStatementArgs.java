// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.aws.lex.inputs.IntentFollowUpPromptRejectionStatementMessageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntentFollowUpPromptRejectionStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntentFollowUpPromptRejectionStatementArgs Empty = new IntentFollowUpPromptRejectionStatementArgs();

    /**
     * A set of messages, each of which provides a message string and its type.
     * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
     * Attributes are documented under message. Must contain between 1 and 15 messages.
     * 
     */
    @Import(name="messages", required=true)
    private Output<List<IntentFollowUpPromptRejectionStatementMessageArgs>> messages;

    /**
     * @return A set of messages, each of which provides a message string and its type.
     * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
     * Attributes are documented under message. Must contain between 1 and 15 messages.
     * 
     */
    public Output<List<IntentFollowUpPromptRejectionStatementMessageArgs>> messages() {
        return this.messages;
    }

    /**
     * The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
     * 
     */
    @Import(name="responseCard")
    private @Nullable Output<String> responseCard;

    /**
     * @return The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
     * 
     */
    public Optional<Output<String>> responseCard() {
        return Optional.ofNullable(this.responseCard);
    }

    private IntentFollowUpPromptRejectionStatementArgs() {}

    private IntentFollowUpPromptRejectionStatementArgs(IntentFollowUpPromptRejectionStatementArgs $) {
        this.messages = $.messages;
        this.responseCard = $.responseCard;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntentFollowUpPromptRejectionStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntentFollowUpPromptRejectionStatementArgs $;

        public Builder() {
            $ = new IntentFollowUpPromptRejectionStatementArgs();
        }

        public Builder(IntentFollowUpPromptRejectionStatementArgs defaults) {
            $ = new IntentFollowUpPromptRejectionStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param messages A set of messages, each of which provides a message string and its type.
         * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
         * Attributes are documented under message. Must contain between 1 and 15 messages.
         * 
         * @return builder
         * 
         */
        public Builder messages(Output<List<IntentFollowUpPromptRejectionStatementMessageArgs>> messages) {
            $.messages = messages;
            return this;
        }

        /**
         * @param messages A set of messages, each of which provides a message string and its type.
         * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
         * Attributes are documented under message. Must contain between 1 and 15 messages.
         * 
         * @return builder
         * 
         */
        public Builder messages(List<IntentFollowUpPromptRejectionStatementMessageArgs> messages) {
            return messages(Output.of(messages));
        }

        /**
         * @param messages A set of messages, each of which provides a message string and its type.
         * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
         * Attributes are documented under message. Must contain between 1 and 15 messages.
         * 
         * @return builder
         * 
         */
        public Builder messages(IntentFollowUpPromptRejectionStatementMessageArgs... messages) {
            return messages(List.of(messages));
        }

        /**
         * @param responseCard The response card. Amazon Lex will substitute session attributes and
         * slot values into the response card. For more information, see
         * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder responseCard(@Nullable Output<String> responseCard) {
            $.responseCard = responseCard;
            return this;
        }

        /**
         * @param responseCard The response card. Amazon Lex will substitute session attributes and
         * slot values into the response card. For more information, see
         * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder responseCard(String responseCard) {
            return responseCard(Output.of(responseCard));
        }

        public IntentFollowUpPromptRejectionStatementArgs build() {
            $.messages = Objects.requireNonNull($.messages, "expected parameter 'messages' to be non-null");
            return $;
        }
    }

}
