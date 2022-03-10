// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2SuggestionFeatureResponse {
    /**
     * Type of Human Agent Assistant API feature to request.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowV2SuggestionFeatureResponse(@OutputCustomType.Parameter("type") String type) {
        this.type = type;
    }

    /**
     * Type of Human Agent Assistant API feature to request.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2SuggestionFeatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2SuggestionFeatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GoogleCloudDialogflowV2SuggestionFeatureResponse build() {
            return new GoogleCloudDialogflowV2SuggestionFeatureResponse(type);
        }
    }
}
