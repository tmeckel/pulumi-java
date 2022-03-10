// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseResponse {
    /**
     * The word or phrase to be excluded.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseResponse(@OutputCustomType.Parameter("value") String value) {
        this.value = value;
    }

    /**
     * The word or phrase to be excluded.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseResponse build() {
            return new GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseResponse(value);
        }
    }
}
