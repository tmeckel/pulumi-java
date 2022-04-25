// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The X12 message filter for odata query.
 * 
 */
public final class X12MessageFilterResponse extends com.pulumi.resources.InvokeArgs {

    public static final X12MessageFilterResponse Empty = new X12MessageFilterResponse();

    /**
     * The message filter type.
     * 
     */
    @Import(name="messageFilterType", required=true)
    private String messageFilterType;

    /**
     * @return The message filter type.
     * 
     */
    public String messageFilterType() {
        return this.messageFilterType;
    }

    private X12MessageFilterResponse() {}

    private X12MessageFilterResponse(X12MessageFilterResponse $) {
        this.messageFilterType = $.messageFilterType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(X12MessageFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12MessageFilterResponse $;

        public Builder() {
            $ = new X12MessageFilterResponse();
        }

        public Builder(X12MessageFilterResponse defaults) {
            $ = new X12MessageFilterResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param messageFilterType The message filter type.
         * 
         * @return builder
         * 
         */
        public Builder messageFilterType(String messageFilterType) {
            $.messageFilterType = messageFilterType;
            return this;
        }

        public X12MessageFilterResponse build() {
            $.messageFilterType = Objects.requireNonNull($.messageFilterType, "expected parameter 'messageFilterType' to be non-null");
            return $;
        }
    }

}
