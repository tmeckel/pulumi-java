// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageTextArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxPageEventHandlerTriggerFulfillmentMessageArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxPageEventHandlerTriggerFulfillmentMessageArgs Empty = new CxPageEventHandlerTriggerFulfillmentMessageArgs();

    /**
     * A collection of text responses.
     * 
     */
    @Import(name="text")
    private @Nullable Output<CxPageEventHandlerTriggerFulfillmentMessageTextArgs> text;

    /**
     * @return A collection of text responses.
     * 
     */
    public Optional<Output<CxPageEventHandlerTriggerFulfillmentMessageTextArgs>> text() {
        return Optional.ofNullable(this.text);
    }

    private CxPageEventHandlerTriggerFulfillmentMessageArgs() {}

    private CxPageEventHandlerTriggerFulfillmentMessageArgs(CxPageEventHandlerTriggerFulfillmentMessageArgs $) {
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxPageEventHandlerTriggerFulfillmentMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxPageEventHandlerTriggerFulfillmentMessageArgs $;

        public Builder() {
            $ = new CxPageEventHandlerTriggerFulfillmentMessageArgs();
        }

        public Builder(CxPageEventHandlerTriggerFulfillmentMessageArgs defaults) {
            $ = new CxPageEventHandlerTriggerFulfillmentMessageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param text A collection of text responses.
         * 
         * @return builder
         * 
         */
        public Builder text(@Nullable Output<CxPageEventHandlerTriggerFulfillmentMessageTextArgs> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text A collection of text responses.
         * 
         * @return builder
         * 
         */
        public Builder text(CxPageEventHandlerTriggerFulfillmentMessageTextArgs text) {
            return text(Output.of(text));
        }

        public CxPageEventHandlerTriggerFulfillmentMessageArgs build() {
            return $;
        }
    }

}
