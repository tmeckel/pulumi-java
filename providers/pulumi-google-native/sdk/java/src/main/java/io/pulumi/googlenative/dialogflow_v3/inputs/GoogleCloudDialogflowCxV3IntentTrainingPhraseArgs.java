// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents an example that the agent is trained on to identify the intent.
 * 
 */
public final class GoogleCloudDialogflowCxV3IntentTrainingPhraseArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3IntentTrainingPhraseArgs Empty = new GoogleCloudDialogflowCxV3IntentTrainingPhraseArgs();

    /**
     * The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase. Note: The API does not automatically annotate training phrases like the Dialogflow Console does. Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated. If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set. If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways: - `Part.text` is set to a part of the phrase that has no parameters. - `Part.text` is set to a part of the phrase that you want to annotate, and the `parameter_id` field is set.
     * 
     */
    @InputImport(name="parts", required=true)
      private final Input<List<GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs>> parts;

    public Input<List<GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs>> getParts() {
        return this.parts;
    }

    /**
     * Indicates how many times this example was added to the intent.
     * 
     */
    @InputImport(name="repeatCount")
      private final @Nullable Input<Integer> repeatCount;

    public Input<Integer> getRepeatCount() {
        return this.repeatCount == null ? Input.empty() : this.repeatCount;
    }

    public GoogleCloudDialogflowCxV3IntentTrainingPhraseArgs(
        Input<List<GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs>> parts,
        @Nullable Input<Integer> repeatCount) {
        this.parts = Objects.requireNonNull(parts, "expected parameter 'parts' to be non-null");
        this.repeatCount = repeatCount;
    }

    private GoogleCloudDialogflowCxV3IntentTrainingPhraseArgs() {
        this.parts = Input.empty();
        this.repeatCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3IntentTrainingPhraseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs>> parts;
        private @Nullable Input<Integer> repeatCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3IntentTrainingPhraseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parts = defaults.parts;
    	      this.repeatCount = defaults.repeatCount;
        }

        public Builder parts(Input<List<GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs>> parts) {
            this.parts = Objects.requireNonNull(parts);
            return this;
        }

        public Builder parts(List<GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs> parts) {
            this.parts = Input.of(Objects.requireNonNull(parts));
            return this;
        }

        public Builder repeatCount(@Nullable Input<Integer> repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }

        public Builder repeatCount(@Nullable Integer repeatCount) {
            this.repeatCount = Input.ofNullable(repeatCount);
            return this;
        }
        public GoogleCloudDialogflowCxV3IntentTrainingPhraseArgs build() {
            return new GoogleCloudDialogflowCxV3IntentTrainingPhraseArgs(parts, repeatCount);
        }
    }
}
