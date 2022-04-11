// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class FunctionDeadLetterConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionDeadLetterConfigGetArgs Empty = new FunctionDeadLetterConfigGetArgs();

    /**
     * ARN of an SNS topic or SQS queue to notify when an invocation fails. If this option is used, the function's IAM role must be granted suitable access to write to the target object, which means allowing either the `sns:Publish` or `sqs:SendMessage` action on this ARN, depending on which service is targeted.
     * 
     */
    @Import(name="targetArn", required=true)
      private final Output<String> targetArn;

    public Output<String> getTargetArn() {
        return this.targetArn;
    }

    public FunctionDeadLetterConfigGetArgs(Output<String> targetArn) {
        this.targetArn = Objects.requireNonNull(targetArn, "expected parameter 'targetArn' to be non-null");
    }

    private FunctionDeadLetterConfigGetArgs() {
        this.targetArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionDeadLetterConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionDeadLetterConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetArn = defaults.targetArn;
        }

        public Builder targetArn(Output<String> targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }
        public Builder targetArn(String targetArn) {
            this.targetArn = Output.of(Objects.requireNonNull(targetArn));
            return this;
        }        public FunctionDeadLetterConfigGetArgs build() {
            return new FunctionDeadLetterConfigGetArgs(targetArn);
        }
    }
}
