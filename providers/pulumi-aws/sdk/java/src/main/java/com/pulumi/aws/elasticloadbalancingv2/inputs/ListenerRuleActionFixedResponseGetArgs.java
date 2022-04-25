// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancingv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleActionFixedResponseGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionFixedResponseGetArgs Empty = new ListenerRuleActionFixedResponseGetArgs();

    /**
     * The content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
     * 
     */
    @Import(name="contentType", required=true)
    private Output<String> contentType;

    /**
     * @return The content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }

    /**
     * The message body.
     * 
     */
    @Import(name="messageBody")
    private @Nullable Output<String> messageBody;

    /**
     * @return The message body.
     * 
     */
    public Optional<Output<String>> messageBody() {
        return Optional.ofNullable(this.messageBody);
    }

    /**
     * The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
     * 
     */
    @Import(name="statusCode")
    private @Nullable Output<String> statusCode;

    /**
     * @return The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
     * 
     */
    public Optional<Output<String>> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }

    private ListenerRuleActionFixedResponseGetArgs() {}

    private ListenerRuleActionFixedResponseGetArgs(ListenerRuleActionFixedResponseGetArgs $) {
        this.contentType = $.contentType;
        this.messageBody = $.messageBody;
        this.statusCode = $.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleActionFixedResponseGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleActionFixedResponseGetArgs $;

        public Builder() {
            $ = new ListenerRuleActionFixedResponseGetArgs();
        }

        public Builder(ListenerRuleActionFixedResponseGetArgs defaults) {
            $ = new ListenerRuleActionFixedResponseGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentType The content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
         * 
         * @return builder
         * 
         */
        public Builder contentType(Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param messageBody The message body.
         * 
         * @return builder
         * 
         */
        public Builder messageBody(@Nullable Output<String> messageBody) {
            $.messageBody = messageBody;
            return this;
        }

        /**
         * @param messageBody The message body.
         * 
         * @return builder
         * 
         */
        public Builder messageBody(String messageBody) {
            return messageBody(Output.of(messageBody));
        }

        /**
         * @param statusCode The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
         * 
         * @return builder
         * 
         */
        public Builder statusCode(@Nullable Output<String> statusCode) {
            $.statusCode = statusCode;
            return this;
        }

        /**
         * @param statusCode The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
         * 
         * @return builder
         * 
         */
        public Builder statusCode(String statusCode) {
            return statusCode(Output.of(statusCode));
        }

        public ListenerRuleActionFixedResponseGetArgs build() {
            $.contentType = Objects.requireNonNull($.contentType, "expected parameter 'contentType' to be non-null");
            return $;
        }
    }

}
