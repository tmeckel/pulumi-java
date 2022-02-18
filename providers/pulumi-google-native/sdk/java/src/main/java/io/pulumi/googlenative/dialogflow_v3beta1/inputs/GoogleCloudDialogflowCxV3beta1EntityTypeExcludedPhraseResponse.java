// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * An excluded entity phrase that should not be matched.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse Empty = new GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse();

    /**
     * The word or phrase to be excluded.
     * 
     */
    @InputImport(name="value", required=true)
    private final String value;

    public String getValue() {
        return this.value;
    }

    public GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse(String value) {
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse() {
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse build() {
            return new GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse(value);
        }
    }
}
