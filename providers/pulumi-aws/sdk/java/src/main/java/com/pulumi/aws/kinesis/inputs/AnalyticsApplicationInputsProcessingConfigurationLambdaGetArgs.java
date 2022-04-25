// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs Empty = new AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs();

    /**
     * The ARN of the Lambda function.
     * 
     */
    @Import(name="resourceArn", required=true)
    private Output<String> resourceArn;

    /**
     * @return The ARN of the Lambda function.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    /**
     * The ARN of the IAM Role used to access the Lambda function.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The ARN of the IAM Role used to access the Lambda function.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    private AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs() {}

    private AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs(AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs $) {
        this.resourceArn = $.resourceArn;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs $;

        public Builder() {
            $ = new AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs();
        }

        public Builder(AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs defaults) {
            $ = new AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceArn The ARN of the Lambda function.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        /**
         * @param resourceArn The ARN of the Lambda function.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        /**
         * @param roleArn The ARN of the IAM Role used to access the Lambda function.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of the IAM Role used to access the Lambda function.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs build() {
            $.resourceArn = Objects.requireNonNull($.resourceArn, "expected parameter 'resourceArn' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
