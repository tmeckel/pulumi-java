// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The text response message.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageTextArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageTextArgs Empty = new GoogleCloudDialogflowV2IntentMessageTextArgs();

    /**
     * Optional. The collection of the agent's responses.
     * 
     */
    @Import(name="text")
      private final @Nullable Output<List<String>> text;

    public Output<List<String>> getText() {
        return this.text == null ? Codegen.empty() : this.text;
    }

    public GoogleCloudDialogflowV2IntentMessageTextArgs(@Nullable Output<List<String>> text) {
        this.text = text;
    }

    private GoogleCloudDialogflowV2IntentMessageTextArgs() {
        this.text = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageTextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageTextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(@Nullable Output<List<String>> text) {
            this.text = text;
            return this;
        }
        public Builder text(@Nullable List<String> text) {
            this.text = Codegen.ofNullable(text);
            return this;
        }
        public Builder text(String... text) {
            return text(List.of(text));
        }        public GoogleCloudDialogflowV2IntentMessageTextArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageTextArgs(text);
        }
    }
}
