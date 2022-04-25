// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse {
    /**
     * @return Custom metadata. Dialogflow doesn&#39;t impose any structure on this.
     * 
     */
    private final Map<String,String> metadata;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse(@CustomType.Parameter("metadata") Map<String,String> metadata) {
        this.metadata = metadata;
    }

    /**
     * @return Custom metadata. Dialogflow doesn&#39;t impose any structure on this.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
        }

        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }        public GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse build() {
            return new GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse(metadata);
        }
    }
}
