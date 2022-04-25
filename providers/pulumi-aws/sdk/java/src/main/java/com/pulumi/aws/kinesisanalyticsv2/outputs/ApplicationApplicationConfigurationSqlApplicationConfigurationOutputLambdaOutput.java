// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput {
    /**
     * @return The ARN of the destination Lambda function to write to.
     * 
     */
    private final String resourceArn;

    @CustomType.Constructor
    private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput(@CustomType.Parameter("resourceArn") String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * @return The ARN of the destination Lambda function to write to.
     * 
     */
    public String resourceArn() {
        return this.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }        public ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput(resourceArn);
        }
    }
}
