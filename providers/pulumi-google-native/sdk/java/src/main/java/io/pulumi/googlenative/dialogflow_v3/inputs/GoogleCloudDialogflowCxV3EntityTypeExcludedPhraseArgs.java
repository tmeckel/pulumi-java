// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * An excluded entity phrase that should not be matched.
 * 
 */
public final class GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs Empty = new GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs();

    /**
     * The word or phrase to be excluded.
     * 
     */
    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs(Input<String> value) {
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs() {
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs build() {
            return new GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs(value);
        }
    }
}
