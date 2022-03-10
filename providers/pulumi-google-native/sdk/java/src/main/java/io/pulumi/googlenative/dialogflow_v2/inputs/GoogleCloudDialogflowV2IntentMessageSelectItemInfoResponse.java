// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Additional info about the select item for when it is triggered in a dialog.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse Empty = new GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse();

    /**
     * A unique key that will be sent back to the agent if this response is given.
     * 
     */
    @InputImport(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * Optional. A list of synonyms that can also be used to trigger this item in dialog.
     * 
     */
    @InputImport(name="synonyms", required=true)
      private final List<String> synonyms;

    public List<String> getSynonyms() {
        return this.synonyms;
    }

    public GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse(
        String key,
        List<String> synonyms) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.synonyms = Objects.requireNonNull(synonyms, "expected parameter 'synonyms' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse() {
        this.key = null;
        this.synonyms = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private List<String> synonyms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.synonyms = defaults.synonyms;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder synonyms(List<String> synonyms) {
            this.synonyms = Objects.requireNonNull(synonyms);
            return this;
        }
        public GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse(key, synonyms);
        }
    }
}
