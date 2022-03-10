// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs Empty = new CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs();

    /**
     * A collection of text responses.
     * 
     */
    @InputImport(name="text")
      private final @Nullable Input<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs> text;

    public Input<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs> getText() {
        return this.text == null ? Input.empty() : this.text;
    }

    public CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs(@Nullable Input<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs> text) {
        this.text = text;
    }

    private CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs() {
        this.text = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs> text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(@Nullable Input<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs> text) {
            this.text = text;
            return this;
        }

        public Builder text(@Nullable CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs text) {
            this.text = Input.ofNullable(text);
            return this;
        }
        public CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs build() {
            return new CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs(text);
        }
    }
}
