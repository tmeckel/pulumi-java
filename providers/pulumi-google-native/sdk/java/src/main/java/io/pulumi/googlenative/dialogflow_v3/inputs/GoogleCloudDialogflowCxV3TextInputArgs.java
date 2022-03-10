// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represents the natural language text to be processed.
 * 
 */
public final class GoogleCloudDialogflowCxV3TextInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3TextInputArgs Empty = new GoogleCloudDialogflowCxV3TextInputArgs();

    /**
     * The UTF-8 encoded natural language text to be processed. Text length must not exceed 256 characters.
     * 
     */
    @InputImport(name="text", required=true)
      private final Input<String> text;

    public Input<String> getText() {
        return this.text;
    }

    public GoogleCloudDialogflowCxV3TextInputArgs(Input<String> text) {
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
    }

    private GoogleCloudDialogflowCxV3TextInputArgs() {
        this.text = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3TextInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3TextInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(Input<String> text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }

        public Builder text(String text) {
            this.text = Input.of(Objects.requireNonNull(text));
            return this;
        }
        public GoogleCloudDialogflowCxV3TextInputArgs build() {
            return new GoogleCloudDialogflowCxV3TextInputArgs(text);
        }
    }
}
