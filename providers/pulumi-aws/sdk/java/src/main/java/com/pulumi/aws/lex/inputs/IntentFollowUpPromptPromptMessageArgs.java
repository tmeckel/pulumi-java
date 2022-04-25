// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntentFollowUpPromptPromptMessageArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntentFollowUpPromptPromptMessageArgs Empty = new IntentFollowUpPromptPromptMessageArgs();

    /**
     * The text of the message. Must be less than or equal to 1000 characters in length.
     * 
     */
    @Import(name="content", required=true)
    private Output<String> content;

    /**
     * @return The text of the message. Must be less than or equal to 1000 characters in length.
     * 
     */
    public Output<String> content() {
        return this.content;
    }

    /**
     * The content type of the message string.
     * 
     */
    @Import(name="contentType", required=true)
    private Output<String> contentType;

    /**
     * @return The content type of the message string.
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }

    /**
     * Identifies the message group that the message belongs to. When a group
     * is assigned to a message, Amazon Lex returns one message from each group in the response. Must be a number between 1 and 5 (inclusive).
     * 
     */
    @Import(name="groupNumber")
    private @Nullable Output<Integer> groupNumber;

    /**
     * @return Identifies the message group that the message belongs to. When a group
     * is assigned to a message, Amazon Lex returns one message from each group in the response. Must be a number between 1 and 5 (inclusive).
     * 
     */
    public Optional<Output<Integer>> groupNumber() {
        return Optional.ofNullable(this.groupNumber);
    }

    private IntentFollowUpPromptPromptMessageArgs() {}

    private IntentFollowUpPromptPromptMessageArgs(IntentFollowUpPromptPromptMessageArgs $) {
        this.content = $.content;
        this.contentType = $.contentType;
        this.groupNumber = $.groupNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntentFollowUpPromptPromptMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntentFollowUpPromptPromptMessageArgs $;

        public Builder() {
            $ = new IntentFollowUpPromptPromptMessageArgs();
        }

        public Builder(IntentFollowUpPromptPromptMessageArgs defaults) {
            $ = new IntentFollowUpPromptPromptMessageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The text of the message. Must be less than or equal to 1000 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder content(Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The text of the message. Must be less than or equal to 1000 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param contentType The content type of the message string.
         * 
         * @return builder
         * 
         */
        public Builder contentType(Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The content type of the message string.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param groupNumber Identifies the message group that the message belongs to. When a group
         * is assigned to a message, Amazon Lex returns one message from each group in the response. Must be a number between 1 and 5 (inclusive).
         * 
         * @return builder
         * 
         */
        public Builder groupNumber(@Nullable Output<Integer> groupNumber) {
            $.groupNumber = groupNumber;
            return this;
        }

        /**
         * @param groupNumber Identifies the message group that the message belongs to. When a group
         * is assigned to a message, Amazon Lex returns one message from each group in the response. Must be a number between 1 and 5 (inclusive).
         * 
         * @return builder
         * 
         */
        public Builder groupNumber(Integer groupNumber) {
            return groupNumber(Output.of(groupNumber));
        }

        public IntentFollowUpPromptPromptMessageArgs build() {
            $.content = Objects.requireNonNull($.content, "expected parameter 'content' to be non-null");
            $.contentType = Objects.requireNonNull($.contentType, "expected parameter 'contentType' to be non-null");
            return $;
        }
    }

}
