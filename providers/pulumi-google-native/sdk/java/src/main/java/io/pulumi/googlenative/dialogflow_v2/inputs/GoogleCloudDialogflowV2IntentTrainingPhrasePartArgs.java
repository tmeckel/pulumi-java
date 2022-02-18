// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a part of a training phrase.
 * 
 */
public final class GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs Empty = new GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs();

    /**
     * Optional. The parameter name for the value extracted from the annotated part of the example. This field is required for annotated parts of the training phrase.
     * 
     */
    @InputImport(name="alias")
    private final @Nullable Input<String> alias;

    public Input<String> getAlias() {
        return this.alias == null ? Input.empty() : this.alias;
    }

    /**
     * Optional. The entity type name prefixed with `@`. This field is required for annotated parts of the training phrase.
     * 
     */
    @InputImport(name="entityType")
    private final @Nullable Input<String> entityType;

    public Input<String> getEntityType() {
        return this.entityType == null ? Input.empty() : this.entityType;
    }

    /**
     * The text for this part.
     * 
     */
    @InputImport(name="text", required=true)
    private final Input<String> text;

    public Input<String> getText() {
        return this.text;
    }

    /**
     * Optional. Indicates whether the text was manually annotated. This field is set to true when the Dialogflow Console is used to manually annotate the part. When creating an annotated part with the API, you must set this to true.
     * 
     */
    @InputImport(name="userDefined")
    private final @Nullable Input<Boolean> userDefined;

    public Input<Boolean> getUserDefined() {
        return this.userDefined == null ? Input.empty() : this.userDefined;
    }

    public GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs(
        @Nullable Input<String> alias,
        @Nullable Input<String> entityType,
        Input<String> text,
        @Nullable Input<Boolean> userDefined) {
        this.alias = alias;
        this.entityType = entityType;
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
        this.userDefined = userDefined;
    }

    private GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs() {
        this.alias = Input.empty();
        this.entityType = Input.empty();
        this.text = Input.empty();
        this.userDefined = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> alias;
        private @Nullable Input<String> entityType;
        private Input<String> text;
        private @Nullable Input<Boolean> userDefined;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.entityType = defaults.entityType;
    	      this.text = defaults.text;
    	      this.userDefined = defaults.userDefined;
        }

        public Builder setAlias(@Nullable Input<String> alias) {
            this.alias = alias;
            return this;
        }

        public Builder setAlias(@Nullable String alias) {
            this.alias = Input.ofNullable(alias);
            return this;
        }

        public Builder setEntityType(@Nullable Input<String> entityType) {
            this.entityType = entityType;
            return this;
        }

        public Builder setEntityType(@Nullable String entityType) {
            this.entityType = Input.ofNullable(entityType);
            return this;
        }

        public Builder setText(Input<String> text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }

        public Builder setText(String text) {
            this.text = Input.of(Objects.requireNonNull(text));
            return this;
        }

        public Builder setUserDefined(@Nullable Input<Boolean> userDefined) {
            this.userDefined = userDefined;
            return this;
        }

        public Builder setUserDefined(@Nullable Boolean userDefined) {
            this.userDefined = Input.ofNullable(userDefined);
            return this;
        }

        public GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs build() {
            return new GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs(alias, entityType, text, userDefined);
        }
    }
}
