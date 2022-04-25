// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs();

    /**
     * The ARN of the destination Lambda function to write to.
     * 
     */
    @Import(name="resourceArn", required=true)
    private Output<String> resourceArn;

    /**
     * @return The ARN of the destination Lambda function to write to.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs() {}

    private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs $) {
        this.resourceArn = $.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs();
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs defaults) {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceArn The ARN of the destination Lambda function to write to.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        /**
         * @param resourceArn The ARN of the destination Lambda function to write to.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        public ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs build() {
            $.resourceArn = Objects.requireNonNull($.resourceArn, "expected parameter 'resourceArn' to be non-null");
            return $;
        }
    }

}
