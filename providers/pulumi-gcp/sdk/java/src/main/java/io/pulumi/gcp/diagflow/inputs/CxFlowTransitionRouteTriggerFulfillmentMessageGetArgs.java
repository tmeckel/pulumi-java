// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs Empty = new CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs();

    /**
     * A collection of text responses.
     * 
     */
    @InputImport(name="text")
      private final @Nullable Input<CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs> text;

    public Input<CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs> getText() {
        return this.text == null ? Input.empty() : this.text;
    }

    public CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs(@Nullable Input<CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs> text) {
        this.text = text;
    }

    private CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs() {
        this.text = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs> text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(@Nullable Input<CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs> text) {
            this.text = text;
            return this;
        }

        public Builder text(@Nullable CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs text) {
            this.text = Input.ofNullable(text);
            return this;
        }
        public CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs build() {
            return new CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs(text);
        }
    }
}
