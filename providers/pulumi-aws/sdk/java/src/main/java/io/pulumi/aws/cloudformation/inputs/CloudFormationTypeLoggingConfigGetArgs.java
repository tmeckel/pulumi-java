// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudformation.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class CloudFormationTypeLoggingConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudFormationTypeLoggingConfigGetArgs Empty = new CloudFormationTypeLoggingConfigGetArgs();

    /**
     * Name of the CloudWatch Log Group where CloudFormation sends error logging information when invoking the type's handlers.
     * 
     */
    @Import(name="logGroupName", required=true)
      private final Output<String> logGroupName;

    public Output<String> getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role CloudFormation assumes when sending error logging information to CloudWatch Logs.
     * 
     */
    @Import(name="logRoleArn", required=true)
      private final Output<String> logRoleArn;

    public Output<String> getLogRoleArn() {
        return this.logRoleArn;
    }

    public CloudFormationTypeLoggingConfigGetArgs(
        Output<String> logGroupName,
        Output<String> logRoleArn) {
        this.logGroupName = Objects.requireNonNull(logGroupName, "expected parameter 'logGroupName' to be non-null");
        this.logRoleArn = Objects.requireNonNull(logRoleArn, "expected parameter 'logRoleArn' to be non-null");
    }

    private CloudFormationTypeLoggingConfigGetArgs() {
        this.logGroupName = Codegen.empty();
        this.logRoleArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudFormationTypeLoggingConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> logGroupName;
        private Output<String> logRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudFormationTypeLoggingConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
    	      this.logRoleArn = defaults.logRoleArn;
        }

        public Builder logGroupName(Output<String> logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }
        public Builder logGroupName(String logGroupName) {
            this.logGroupName = Output.of(Objects.requireNonNull(logGroupName));
            return this;
        }
        public Builder logRoleArn(Output<String> logRoleArn) {
            this.logRoleArn = Objects.requireNonNull(logRoleArn);
            return this;
        }
        public Builder logRoleArn(String logRoleArn) {
            this.logRoleArn = Output.of(Objects.requireNonNull(logRoleArn));
            return this;
        }        public CloudFormationTypeLoggingConfigGetArgs build() {
            return new CloudFormationTypeLoggingConfigGetArgs(logGroupName, logRoleArn);
        }
    }
}
