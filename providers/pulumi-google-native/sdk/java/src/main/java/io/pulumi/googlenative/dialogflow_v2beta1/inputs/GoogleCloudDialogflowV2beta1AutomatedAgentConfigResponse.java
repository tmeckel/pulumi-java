// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the Automated Agent to connect to a conversation.
 * 
 */
public final class GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse Empty = new GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse();

    /**
     * ID of the Dialogflow agent environment to use. This project needs to either be the same project as the conversation or you need to grant `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow API Service Agent` role in this project. - For ES agents, use format: `projects//locations//agent/environments/`. If environment is not specified, the default `draft` environment is used. Refer to [DetectIntentRequest](/dialogflow/docs/reference/rpc/google.cloud.dialogflow.v2beta1#google.cloud.dialogflow.v2beta1.DetectIntentRequest) for more details. - For CX agents, use format `projects//locations//agents//environments/`. If environment is not specified, the default `draft` environment is used.
     * 
     */
    @InputImport(name="agent", required=true)
    private final String agent;

    public String getAgent() {
        return this.agent;
    }

    public GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse(String agent) {
        this.agent = Objects.requireNonNull(agent, "expected parameter 'agent' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse() {
        this.agent = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agent;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agent = defaults.agent;
        }

        public Builder setAgent(String agent) {
            this.agent = Objects.requireNonNull(agent);
            return this;
        }

        public GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse build() {
            return new GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse(agent);
        }
    }
}
