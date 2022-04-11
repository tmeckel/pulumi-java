// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dialogflow_v3.enums.GoogleCloudDialogflowCxV3TestCaseResultTestResult;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ConversationTurnArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a result from running a test case in an agent environment.
 * 
 */
public final class GoogleCloudDialogflowCxV3TestCaseResultArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3TestCaseResultArgs Empty = new GoogleCloudDialogflowCxV3TestCaseResultArgs();

    /**
     * The conversation turns uttered during the test case replay in chronological order.
     * 
     */
    @Import(name="conversationTurns")
      private final @Nullable Output<List<GoogleCloudDialogflowCxV3ConversationTurnArgs>> conversationTurns;

    public Output<List<GoogleCloudDialogflowCxV3ConversationTurnArgs>> getConversationTurns() {
        return this.conversationTurns == null ? Codegen.empty() : this.conversationTurns;
    }

    /**
     * Environment where the test was run. If not set, it indicates the draft environment.
     * 
     */
    @Import(name="environment")
      private final @Nullable Output<String> environment;

    public Output<String> getEnvironment() {
        return this.environment == null ? Codegen.empty() : this.environment;
    }

    /**
     * The resource name for the test case result. Format: `projects//locations//agents//testCases/ /results/`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Whether the test case passed in the agent environment.
     * 
     */
    @Import(name="testResult")
      private final @Nullable Output<GoogleCloudDialogflowCxV3TestCaseResultTestResult> testResult;

    public Output<GoogleCloudDialogflowCxV3TestCaseResultTestResult> getTestResult() {
        return this.testResult == null ? Codegen.empty() : this.testResult;
    }

    /**
     * The time that the test was run.
     * 
     */
    @Import(name="testTime")
      private final @Nullable Output<String> testTime;

    public Output<String> getTestTime() {
        return this.testTime == null ? Codegen.empty() : this.testTime;
    }

    public GoogleCloudDialogflowCxV3TestCaseResultArgs(
        @Nullable Output<List<GoogleCloudDialogflowCxV3ConversationTurnArgs>> conversationTurns,
        @Nullable Output<String> environment,
        @Nullable Output<String> name,
        @Nullable Output<GoogleCloudDialogflowCxV3TestCaseResultTestResult> testResult,
        @Nullable Output<String> testTime) {
        this.conversationTurns = conversationTurns;
        this.environment = environment;
        this.name = name;
        this.testResult = testResult;
        this.testTime = testTime;
    }

    private GoogleCloudDialogflowCxV3TestCaseResultArgs() {
        this.conversationTurns = Codegen.empty();
        this.environment = Codegen.empty();
        this.name = Codegen.empty();
        this.testResult = Codegen.empty();
        this.testTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3TestCaseResultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GoogleCloudDialogflowCxV3ConversationTurnArgs>> conversationTurns;
        private @Nullable Output<String> environment;
        private @Nullable Output<String> name;
        private @Nullable Output<GoogleCloudDialogflowCxV3TestCaseResultTestResult> testResult;
        private @Nullable Output<String> testTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3TestCaseResultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversationTurns = defaults.conversationTurns;
    	      this.environment = defaults.environment;
    	      this.name = defaults.name;
    	      this.testResult = defaults.testResult;
    	      this.testTime = defaults.testTime;
        }

        public Builder conversationTurns(@Nullable Output<List<GoogleCloudDialogflowCxV3ConversationTurnArgs>> conversationTurns) {
            this.conversationTurns = conversationTurns;
            return this;
        }
        public Builder conversationTurns(@Nullable List<GoogleCloudDialogflowCxV3ConversationTurnArgs> conversationTurns) {
            this.conversationTurns = Codegen.ofNullable(conversationTurns);
            return this;
        }
        public Builder conversationTurns(GoogleCloudDialogflowCxV3ConversationTurnArgs... conversationTurns) {
            return conversationTurns(List.of(conversationTurns));
        }
        public Builder environment(@Nullable Output<String> environment) {
            this.environment = environment;
            return this;
        }
        public Builder environment(@Nullable String environment) {
            this.environment = Codegen.ofNullable(environment);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder testResult(@Nullable Output<GoogleCloudDialogflowCxV3TestCaseResultTestResult> testResult) {
            this.testResult = testResult;
            return this;
        }
        public Builder testResult(@Nullable GoogleCloudDialogflowCxV3TestCaseResultTestResult testResult) {
            this.testResult = Codegen.ofNullable(testResult);
            return this;
        }
        public Builder testTime(@Nullable Output<String> testTime) {
            this.testTime = testTime;
            return this;
        }
        public Builder testTime(@Nullable String testTime) {
            this.testTime = Codegen.ofNullable(testTime);
            return this;
        }        public GoogleCloudDialogflowCxV3TestCaseResultArgs build() {
            return new GoogleCloudDialogflowCxV3TestCaseResultArgs(conversationTurns, environment, name, testResult, testTime);
        }
    }
}
