// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse {
    /**
     * @return The word or phrase to be excluded.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse(@CustomType.Parameter("value") String value) {
        this.value = value;
    }

    /**
     * @return The word or phrase to be excluded.
     * 
     */
    public String value() {
        return this.value;
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

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse build() {
            return new GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse(value);
        }
    }
}
