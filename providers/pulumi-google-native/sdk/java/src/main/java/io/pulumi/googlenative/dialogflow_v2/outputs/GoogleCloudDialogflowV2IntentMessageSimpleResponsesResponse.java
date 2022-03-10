// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageSimpleResponseResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse {
    /**
     * The list of simple responses.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentMessageSimpleResponseResponse> simpleResponses;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse(@OutputCustomType.Parameter("simpleResponses") List<GoogleCloudDialogflowV2IntentMessageSimpleResponseResponse> simpleResponses) {
        this.simpleResponses = simpleResponses;
    }

    /**
     * The list of simple responses.
     * 
    */
    public List<GoogleCloudDialogflowV2IntentMessageSimpleResponseResponse> getSimpleResponses() {
        return this.simpleResponses;
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

        public Builder simpleResponses(List<GoogleCloudDialogflowV2IntentMessageSimpleResponseResponse> simpleResponses) {
            this.simpleResponses = Objects.requireNonNull(simpleResponses);
            return this;
        }
        public GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse(simpleResponses);
        }
    }
}
