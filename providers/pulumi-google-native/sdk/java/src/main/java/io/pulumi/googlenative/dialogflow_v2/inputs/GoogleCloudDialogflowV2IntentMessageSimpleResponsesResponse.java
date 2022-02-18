// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageSimpleResponseResponse;
import java.util.List;
import java.util.Objects;


/**
 * The collection of simple response candidates. This message in `QueryResult.fulfillment_messages` and `WebhookResponse.fulfillment_messages` should contain only one `SimpleResponse`.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse Empty = new GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse();

    /**
     * The list of simple responses.
     * 
     */
    @InputImport(name="simpleResponses", required=true)
    private final List<GoogleCloudDialogflowV2IntentMessageSimpleResponseResponse> simpleResponses;

    public List<GoogleCloudDialogflowV2IntentMessageSimpleResponseResponse> getSimpleResponses() {
        return this.simpleResponses;
    }

    public GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse(List<GoogleCloudDialogflowV2IntentMessageSimpleResponseResponse> simpleResponses) {
        this.simpleResponses = Objects.requireNonNull(simpleResponses, "expected parameter 'simpleResponses' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse() {
        this.simpleResponses = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageSimpleResponseResponse> simpleResponses;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.simpleResponses = defaults.simpleResponses;
        }

        public Builder setSimpleResponses(List<GoogleCloudDialogflowV2IntentMessageSimpleResponseResponse> simpleResponses) {
            this.simpleResponses = Objects.requireNonNull(simpleResponses);
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse(simpleResponses);
        }
    }
}
