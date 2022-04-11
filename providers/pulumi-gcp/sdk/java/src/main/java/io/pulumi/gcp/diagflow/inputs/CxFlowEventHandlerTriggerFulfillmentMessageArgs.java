// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageTextArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxFlowEventHandlerTriggerFulfillmentMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxFlowEventHandlerTriggerFulfillmentMessageArgs Empty = new CxFlowEventHandlerTriggerFulfillmentMessageArgs();

    /**
     * A collection of text responses.
     * 
     */
    @Import(name="text")
      private final @Nullable Output<CxFlowEventHandlerTriggerFulfillmentMessageTextArgs> text;

    public Output<CxFlowEventHandlerTriggerFulfillmentMessageTextArgs> getText() {
        return this.text == null ? Codegen.empty() : this.text;
    }

    public CxFlowEventHandlerTriggerFulfillmentMessageArgs(@Nullable Output<CxFlowEventHandlerTriggerFulfillmentMessageTextArgs> text) {
        this.text = text;
    }

    private CxFlowEventHandlerTriggerFulfillmentMessageArgs() {
        this.text = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxFlowEventHandlerTriggerFulfillmentMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CxFlowEventHandlerTriggerFulfillmentMessageTextArgs> text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxFlowEventHandlerTriggerFulfillmentMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(@Nullable Output<CxFlowEventHandlerTriggerFulfillmentMessageTextArgs> text) {
            this.text = text;
            return this;
        }
        public Builder text(@Nullable CxFlowEventHandlerTriggerFulfillmentMessageTextArgs text) {
            this.text = Codegen.ofNullable(text);
            return this;
        }        public CxFlowEventHandlerTriggerFulfillmentMessageArgs build() {
            return new CxFlowEventHandlerTriggerFulfillmentMessageArgs(text);
        }
    }
}
