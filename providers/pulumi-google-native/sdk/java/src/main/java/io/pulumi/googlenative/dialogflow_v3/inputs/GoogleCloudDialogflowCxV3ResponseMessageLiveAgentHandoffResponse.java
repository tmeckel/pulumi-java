// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Indicates that the conversation should be handed off to a live agent. Dialogflow only uses this to determine which conversations were handed off to a human agent for measurement purposes. What else to do with this signal is up to you and your handoff procedures. You may set this, for example: * In the entry_fulfillment of a Page if entering the page indicates something went extremely wrong in the conversation. * In a webhook response when you determine that the customer issue can only be handled by a human.
 * 
 */
public final class GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse Empty = new GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse();

    /**
     * Custom metadata for your handoff procedure. Dialogflow doesn't impose any structure on this.
     * 
     */
    @InputImport(name="metadata", required=true)
    private final Map<String,String> metadata;

    public Map<String,String> getMetadata() {
        return this.metadata;
    }

    public GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse(Map<String,String> metadata) {
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
    }

    private GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse() {
        this.metadata = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
        }

        public Builder setMetadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse build() {
            return new GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse(metadata);
        }
    }
}
