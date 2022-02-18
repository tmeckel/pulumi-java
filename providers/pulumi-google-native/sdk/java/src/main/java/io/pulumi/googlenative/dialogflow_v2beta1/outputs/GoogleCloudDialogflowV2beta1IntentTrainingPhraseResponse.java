// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1IntentTrainingPhraseResponse {
    /**
     * The unique identifier of this training phrase.
     * 
     */
    private final String name;
    /**
     * The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase. Note: The API does not automatically annotate training phrases like the Dialogflow Console does. Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated. If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set. If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways: - `Part.text` is set to a part of the phrase that has no parameters. - `Part.text` is set to a part of the phrase that you want to annotate, and the `entity_type`, `alias`, and `user_defined` fields are all set.
     * 
     */
    private final List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartResponse> parts;
    /**
     * Optional. Indicates how many times this example was added to the intent. Each time a developer adds an existing sample by editing an intent or training, this counter is increased.
     * 
     */
    private final Integer timesAddedCount;
    /**
     * The type of the training phrase.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"name","parts","timesAddedCount","type"})
    private GoogleCloudDialogflowV2beta1IntentTrainingPhraseResponse(
        String name,
        List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartResponse> parts,
        Integer timesAddedCount,
        String type) {
        this.name = Objects.requireNonNull(name);
        this.parts = Objects.requireNonNull(parts);
        this.timesAddedCount = Objects.requireNonNull(timesAddedCount);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The unique identifier of this training phrase.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase. Note: The API does not automatically annotate training phrases like the Dialogflow Console does. Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated. If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set. If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways: - `Part.text` is set to a part of the phrase that has no parameters. - `Part.text` is set to a part of the phrase that you want to annotate, and the `entity_type`, `alias`, and `user_defined` fields are all set.
     * 
     */
    public List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartResponse> getParts() {
        return this.parts;
    }
    /**
     * Optional. Indicates how many times this example was added to the intent. Each time a developer adds an existing sample by editing an intent or training, this counter is increased.
     * 
     */
    public Integer getTimesAddedCount() {
        return this.timesAddedCount;
    }
    /**
     * The type of the training phrase.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentTrainingPhraseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartResponse> parts;
        private Integer timesAddedCount;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentTrainingPhraseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parts = defaults.parts;
    	      this.timesAddedCount = defaults.timesAddedCount;
    	      this.type = defaults.type;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParts(List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartResponse> parts) {
            this.parts = Objects.requireNonNull(parts);
            return this;
        }

        public Builder setTimesAddedCount(Integer timesAddedCount) {
            this.timesAddedCount = Objects.requireNonNull(timesAddedCount);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentTrainingPhraseResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentTrainingPhraseResponse(name, parts, timesAddedCount, type);
        }
    }
}
