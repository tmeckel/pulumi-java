// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The X12 message identifier.
 * 
 */
public final class X12MessageIdentifierResponse extends com.pulumi.resources.InvokeArgs {

    public static final X12MessageIdentifierResponse Empty = new X12MessageIdentifierResponse();

    /**
     * The message id.
     * 
     */
    @Import(name="messageId", required=true)
    private String messageId;

    /**
     * @return The message id.
     * 
     */
    public String messageId() {
        return this.messageId;
    }

    private X12MessageIdentifierResponse() {}

    private X12MessageIdentifierResponse(X12MessageIdentifierResponse $) {
        this.messageId = $.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(X12MessageIdentifierResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12MessageIdentifierResponse $;

        public Builder() {
            $ = new X12MessageIdentifierResponse();
        }

        public Builder(X12MessageIdentifierResponse defaults) {
            $ = new X12MessageIdentifierResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param messageId The message id.
         * 
         * @return builder
         * 
         */
        public Builder messageId(String messageId) {
            $.messageId = messageId;
            return this;
        }

        public X12MessageIdentifierResponse build() {
            $.messageId = Objects.requireNonNull($.messageId, "expected parameter 'messageId' to be non-null");
            return $;
        }
    }

}
