// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse {
    /**
     * A unique key that will be sent back to the agent if this response is given.
     * 
     */
    private final String key;
    /**
     * Optional. A list of synonyms that can also be used to trigger this item in dialog.
     * 
     */
    private final List<String> synonyms;

    @OutputCustomType.Constructor({"key","synonyms"})
    private GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse(
        String key,
        List<String> synonyms) {
        this.key = Objects.requireNonNull(key);
        this.synonyms = Objects.requireNonNull(synonyms);
    }

    /**
     * A unique key that will be sent back to the agent if this response is given.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * Optional. A list of synonyms that can also be used to trigger this item in dialog.
     * 
     */
    public List<String> getSynonyms() {
        return this.synonyms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private List<String> synonyms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.synonyms = defaults.synonyms;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setSynonyms(List<String> synonyms) {
            this.synonyms = Objects.requireNonNull(synonyms);
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse(key, synonyms);
        }
    }
}
