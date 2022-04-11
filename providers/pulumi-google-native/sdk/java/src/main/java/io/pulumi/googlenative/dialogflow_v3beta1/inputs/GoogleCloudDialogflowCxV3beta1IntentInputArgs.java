// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Represents the intent to trigger programmatically rather than as a result of natural language processing.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1IntentInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1IntentInputArgs Empty = new GoogleCloudDialogflowCxV3beta1IntentInputArgs();

    /**
     * The unique identifier of the intent. Format: `projects//locations//agents//intents/`.
     * 
     */
    @Import(name="intent", required=true)
      private final Output<String> intent;

    public Output<String> getIntent() {
        return this.intent;
    }

    public GoogleCloudDialogflowCxV3beta1IntentInputArgs(Output<String> intent) {
        this.intent = Objects.requireNonNull(intent, "expected parameter 'intent' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1IntentInputArgs() {
        this.intent = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1IntentInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> intent;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1IntentInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intent = defaults.intent;
        }

        public Builder intent(Output<String> intent) {
            this.intent = Objects.requireNonNull(intent);
            return this;
        }
        public Builder intent(String intent) {
            this.intent = Output.of(Objects.requireNonNull(intent));
            return this;
        }        public GoogleCloudDialogflowCxV3beta1IntentInputArgs build() {
            return new GoogleCloudDialogflowCxV3beta1IntentInputArgs(intent);
        }
    }
}
