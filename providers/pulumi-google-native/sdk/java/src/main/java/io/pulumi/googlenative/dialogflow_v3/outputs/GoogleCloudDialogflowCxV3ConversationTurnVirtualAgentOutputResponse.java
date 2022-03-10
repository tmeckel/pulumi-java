// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3IntentResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3PageResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ResponseMessageTextResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3TestRunDifferenceResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleRpcStatusResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse {
    /**
     * The Page on which the utterance was spoken. Only name and displayName will be set.
     * 
     */
    private final GoogleCloudDialogflowCxV3PageResponse currentPage;
    /**
     * Input only. The diagnostic info output for the turn. Required to calculate the testing coverage.
     * 
     */
    private final Map<String,String> diagnosticInfo;
    /**
     * If this is part of a result conversation turn, the list of differences between the original run and the replay for this output, if any.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3TestRunDifferenceResponse> differences;
    /**
     * The session parameters available to the bot at this point.
     * 
     */
    private final Map<String,String> sessionParameters;
    /**
     * Response error from the agent in the test result. If set, other output is empty.
     * 
     */
    private final GoogleRpcStatusResponse status;
    /**
     * The text responses from the agent for the turn.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3ResponseMessageTextResponse> textResponses;
    /**
     * The Intent that triggered the response. Only name and displayName will be set.
     * 
     */
    private final GoogleCloudDialogflowCxV3IntentResponse triggeredIntent;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse(
        @OutputCustomType.Parameter("currentPage") GoogleCloudDialogflowCxV3PageResponse currentPage,
        @OutputCustomType.Parameter("diagnosticInfo") Map<String,String> diagnosticInfo,
        @OutputCustomType.Parameter("differences") List<GoogleCloudDialogflowCxV3TestRunDifferenceResponse> differences,
        @OutputCustomType.Parameter("sessionParameters") Map<String,String> sessionParameters,
        @OutputCustomType.Parameter("status") GoogleRpcStatusResponse status,
        @OutputCustomType.Parameter("textResponses") List<GoogleCloudDialogflowCxV3ResponseMessageTextResponse> textResponses,
        @OutputCustomType.Parameter("triggeredIntent") GoogleCloudDialogflowCxV3IntentResponse triggeredIntent) {
        this.currentPage = currentPage;
        this.diagnosticInfo = diagnosticInfo;
        this.differences = differences;
        this.sessionParameters = sessionParameters;
        this.status = status;
        this.textResponses = textResponses;
        this.triggeredIntent = triggeredIntent;
    }

    /**
     * The Page on which the utterance was spoken. Only name and displayName will be set.
     * 
    */
    public GoogleCloudDialogflowCxV3PageResponse getCurrentPage() {
        return this.currentPage;
    }
    /**
     * Input only. The diagnostic info output for the turn. Required to calculate the testing coverage.
     * 
    */
    public Map<String,String> getDiagnosticInfo() {
        return this.diagnosticInfo;
    }
    /**
     * If this is part of a result conversation turn, the list of differences between the original run and the replay for this output, if any.
     * 
    */
    public List<GoogleCloudDialogflowCxV3TestRunDifferenceResponse> getDifferences() {
        return this.differences;
    }
    /**
     * The session parameters available to the bot at this point.
     * 
    */
    public Map<String,String> getSessionParameters() {
        return this.sessionParameters;
    }
    /**
     * Response error from the agent in the test result. If set, other output is empty.
     * 
    */
    public GoogleRpcStatusResponse getStatus() {
        return this.status;
    }
    /**
     * The text responses from the agent for the turn.
     * 
    */
    public List<GoogleCloudDialogflowCxV3ResponseMessageTextResponse> getTextResponses() {
        return this.textResponses;
    }
    /**
     * The Intent that triggered the response. Only name and displayName will be set.
     * 
    */
    public GoogleCloudDialogflowCxV3IntentResponse getTriggeredIntent() {
        return this.triggeredIntent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3PageResponse currentPage;
        private Map<String,String> diagnosticInfo;
        private List<GoogleCloudDialogflowCxV3TestRunDifferenceResponse> differences;
        private Map<String,String> sessionParameters;
        private GoogleRpcStatusResponse status;
        private List<GoogleCloudDialogflowCxV3ResponseMessageTextResponse> textResponses;
        private GoogleCloudDialogflowCxV3IntentResponse triggeredIntent;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentPage = defaults.currentPage;
    	      this.diagnosticInfo = defaults.diagnosticInfo;
    	      this.differences = defaults.differences;
    	      this.sessionParameters = defaults.sessionParameters;
    	      this.status = defaults.status;
    	      this.textResponses = defaults.textResponses;
    	      this.triggeredIntent = defaults.triggeredIntent;
        }

        public Builder currentPage(GoogleCloudDialogflowCxV3PageResponse currentPage) {
            this.currentPage = Objects.requireNonNull(currentPage);
            return this;
        }

        public Builder diagnosticInfo(Map<String,String> diagnosticInfo) {
            this.diagnosticInfo = Objects.requireNonNull(diagnosticInfo);
            return this;
        }

        public Builder differences(List<GoogleCloudDialogflowCxV3TestRunDifferenceResponse> differences) {
            this.differences = Objects.requireNonNull(differences);
            return this;
        }

        public Builder sessionParameters(Map<String,String> sessionParameters) {
            this.sessionParameters = Objects.requireNonNull(sessionParameters);
            return this;
        }

        public Builder status(GoogleRpcStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder textResponses(List<GoogleCloudDialogflowCxV3ResponseMessageTextResponse> textResponses) {
            this.textResponses = Objects.requireNonNull(textResponses);
            return this;
        }

        public Builder triggeredIntent(GoogleCloudDialogflowCxV3IntentResponse triggeredIntent) {
            this.triggeredIntent = Objects.requireNonNull(triggeredIntent);
            return this;
        }
        public GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse build() {
            return new GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse(currentPage, diagnosticInfo, differences, sessionParameters, status, textResponses, triggeredIntent);
        }
    }
}
