// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FunctionDeadLetterConfig {
    /**
     * ARN of an SNS topic or SQS queue to notify when an invocation fails. If this option is used, the function's IAM role must be granted suitable access to write to the target object, which means allowing either the `sns:Publish` or `sqs:SendMessage` action on this ARN, depending on which service is targeted.
     * 
     */
    private final String targetArn;

    @OutputCustomType.Constructor
    private FunctionDeadLetterConfig(@OutputCustomType.Parameter("targetArn") String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * ARN of an SNS topic or SQS queue to notify when an invocation fails. If this option is used, the function's IAM role must be granted suitable access to write to the target object, which means allowing either the `sns:Publish` or `sqs:SendMessage` action on this ARN, depending on which service is targeted.
     * 
    */
    public String getTargetArn() {
        return this.targetArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionDeadLetterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionDeadLetterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetArn = defaults.targetArn;
        }

        public Builder targetArn(String targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }
        public FunctionDeadLetterConfig build() {
            return new FunctionDeadLetterConfig(targetArn);
        }
    }
}
