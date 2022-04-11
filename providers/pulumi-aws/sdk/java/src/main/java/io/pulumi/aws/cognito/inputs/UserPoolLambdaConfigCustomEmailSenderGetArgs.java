// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class UserPoolLambdaConfigCustomEmailSenderGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolLambdaConfigCustomEmailSenderGetArgs Empty = new UserPoolLambdaConfigCustomEmailSenderGetArgs();

    /**
     * The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send SMS notifications to users.
     * 
     */
    @Import(name="lambdaArn", required=true)
      private final Output<String> lambdaArn;

    public Output<String> getLambdaArn() {
        return this.lambdaArn;
    }

    /**
     * The Lambda version represents the signature of the "request" attribute in the "event" information Amazon Cognito passes to your custom SMS Lambda function. The only supported value is `V1_0`.
     * 
     */
    @Import(name="lambdaVersion", required=true)
      private final Output<String> lambdaVersion;

    public Output<String> getLambdaVersion() {
        return this.lambdaVersion;
    }

    public UserPoolLambdaConfigCustomEmailSenderGetArgs(
        Output<String> lambdaArn,
        Output<String> lambdaVersion) {
        this.lambdaArn = Objects.requireNonNull(lambdaArn, "expected parameter 'lambdaArn' to be non-null");
        this.lambdaVersion = Objects.requireNonNull(lambdaVersion, "expected parameter 'lambdaVersion' to be non-null");
    }

    private UserPoolLambdaConfigCustomEmailSenderGetArgs() {
        this.lambdaArn = Codegen.empty();
        this.lambdaVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolLambdaConfigCustomEmailSenderGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> lambdaArn;
        private Output<String> lambdaVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolLambdaConfigCustomEmailSenderGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambdaArn = defaults.lambdaArn;
    	      this.lambdaVersion = defaults.lambdaVersion;
        }

        public Builder lambdaArn(Output<String> lambdaArn) {
            this.lambdaArn = Objects.requireNonNull(lambdaArn);
            return this;
        }
        public Builder lambdaArn(String lambdaArn) {
            this.lambdaArn = Output.of(Objects.requireNonNull(lambdaArn));
            return this;
        }
        public Builder lambdaVersion(Output<String> lambdaVersion) {
            this.lambdaVersion = Objects.requireNonNull(lambdaVersion);
            return this;
        }
        public Builder lambdaVersion(String lambdaVersion) {
            this.lambdaVersion = Output.of(Objects.requireNonNull(lambdaVersion));
            return this;
        }        public UserPoolLambdaConfigCustomEmailSenderGetArgs build() {
            return new UserPoolLambdaConfigCustomEmailSenderGetArgs(lambdaArn, lambdaVersion);
        }
    }
}
