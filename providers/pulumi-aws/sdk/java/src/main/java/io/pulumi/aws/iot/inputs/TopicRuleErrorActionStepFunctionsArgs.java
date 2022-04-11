// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleErrorActionStepFunctionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionStepFunctionsArgs Empty = new TopicRuleErrorActionStepFunctionsArgs();

    /**
     * The prefix used to generate, along with a UUID, the unique state machine execution name.
     * 
     */
    @Import(name="executionNamePrefix")
      private final @Nullable Output<String> executionNamePrefix;

    public Output<String> getExecutionNamePrefix() {
        return this.executionNamePrefix == null ? Codegen.empty() : this.executionNamePrefix;
    }

    /**
     * The ARN of the IAM role that grants access to start execution of the state machine.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * The name of the Step Functions state machine whose execution will be started.
     * 
     */
    @Import(name="stateMachineName", required=true)
      private final Output<String> stateMachineName;

    public Output<String> getStateMachineName() {
        return this.stateMachineName;
    }

    public TopicRuleErrorActionStepFunctionsArgs(
        @Nullable Output<String> executionNamePrefix,
        Output<String> roleArn,
        Output<String> stateMachineName) {
        this.executionNamePrefix = executionNamePrefix;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.stateMachineName = Objects.requireNonNull(stateMachineName, "expected parameter 'stateMachineName' to be non-null");
    }

    private TopicRuleErrorActionStepFunctionsArgs() {
        this.executionNamePrefix = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.stateMachineName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionStepFunctionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> executionNamePrefix;
        private Output<String> roleArn;
        private Output<String> stateMachineName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionStepFunctionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionNamePrefix = defaults.executionNamePrefix;
    	      this.roleArn = defaults.roleArn;
    	      this.stateMachineName = defaults.stateMachineName;
        }

        public Builder executionNamePrefix(@Nullable Output<String> executionNamePrefix) {
            this.executionNamePrefix = executionNamePrefix;
            return this;
        }
        public Builder executionNamePrefix(@Nullable String executionNamePrefix) {
            this.executionNamePrefix = Codegen.ofNullable(executionNamePrefix);
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder stateMachineName(Output<String> stateMachineName) {
            this.stateMachineName = Objects.requireNonNull(stateMachineName);
            return this;
        }
        public Builder stateMachineName(String stateMachineName) {
            this.stateMachineName = Output.of(Objects.requireNonNull(stateMachineName));
            return this;
        }        public TopicRuleErrorActionStepFunctionsArgs build() {
            return new TopicRuleErrorActionStepFunctionsArgs(executionNamePrefix, roleArn, stateMachineName);
        }
    }
}
