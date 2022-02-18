// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1ConversationTurnResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1TestCaseResultResponse {
    /**
     * The conversation turns uttered during the test case replay in chronological order.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1ConversationTurnResponse> conversationTurns;
    /**
     * Environment where the test was run. If not set, it indicates the draft environment.
     * 
     */
    private final String environment;
    /**
     * The resource name for the test case result. Format: `projects//locations//agents//testCases/ /results/`.
     * 
     */
    private final String name;
    /**
     * Whether the test case passed in the agent environment.
     * 
     */
    private final String testResult;
    /**
     * The time that the test was run.
     * 
     */
    private final String testTime;

    @OutputCustomType.Constructor({"conversationTurns","environment","name","testResult","testTime"})
    private GoogleCloudDialogflowCxV3beta1TestCaseResultResponse(
        List<GoogleCloudDialogflowCxV3beta1ConversationTurnResponse> conversationTurns,
        String environment,
        String name,
        String testResult,
        String testTime) {
        this.conversationTurns = Objects.requireNonNull(conversationTurns);
        this.environment = Objects.requireNonNull(environment);
        this.name = Objects.requireNonNull(name);
        this.testResult = Objects.requireNonNull(testResult);
        this.testTime = Objects.requireNonNull(testTime);
    }

    /**
     * The conversation turns uttered during the test case replay in chronological order.
     * 
     */
    public List<GoogleCloudDialogflowCxV3beta1ConversationTurnResponse> getConversationTurns() {
        return this.conversationTurns;
    }
    /**
     * Environment where the test was run. If not set, it indicates the draft environment.
     * 
     */
    public String getEnvironment() {
        return this.environment;
    }
    /**
     * The resource name for the test case result. Format: `projects//locations//agents//testCases/ /results/`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Whether the test case passed in the agent environment.
     * 
     */
    public String getTestResult() {
        return this.testResult;
    }
    /**
     * The time that the test was run.
     * 
     */
    public String getTestTime() {
        return this.testTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1TestCaseResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3beta1ConversationTurnResponse> conversationTurns;
        private String environment;
        private String name;
        private String testResult;
        private String testTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1TestCaseResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversationTurns = defaults.conversationTurns;
    	      this.environment = defaults.environment;
    	      this.name = defaults.name;
    	      this.testResult = defaults.testResult;
    	      this.testTime = defaults.testTime;
        }

        public Builder setConversationTurns(List<GoogleCloudDialogflowCxV3beta1ConversationTurnResponse> conversationTurns) {
            this.conversationTurns = Objects.requireNonNull(conversationTurns);
            return this;
        }

        public Builder setEnvironment(String environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTestResult(String testResult) {
            this.testResult = Objects.requireNonNull(testResult);
            return this;
        }

        public Builder setTestTime(String testTime) {
            this.testTime = Objects.requireNonNull(testTime);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1TestCaseResultResponse build() {
            return new GoogleCloudDialogflowCxV3beta1TestCaseResultResponse(conversationTurns, environment, name, testResult, testTime);
        }
    }
}
