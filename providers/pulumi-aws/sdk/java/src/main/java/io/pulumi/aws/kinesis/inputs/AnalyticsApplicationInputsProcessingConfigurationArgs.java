// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsProcessingConfigurationLambdaArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class AnalyticsApplicationInputsProcessingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationInputsProcessingConfigurationArgs Empty = new AnalyticsApplicationInputsProcessingConfigurationArgs();

    /**
     * The Lambda function configuration. See Lambda below for more details.
     * 
     */
    @InputImport(name="lambda", required=true)
      private final Input<AnalyticsApplicationInputsProcessingConfigurationLambdaArgs> lambda;

    public Input<AnalyticsApplicationInputsProcessingConfigurationLambdaArgs> getLambda() {
        return this.lambda;
    }

    public AnalyticsApplicationInputsProcessingConfigurationArgs(Input<AnalyticsApplicationInputsProcessingConfigurationLambdaArgs> lambda) {
        this.lambda = Objects.requireNonNull(lambda, "expected parameter 'lambda' to be non-null");
    }

    private AnalyticsApplicationInputsProcessingConfigurationArgs() {
        this.lambda = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsProcessingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AnalyticsApplicationInputsProcessingConfigurationLambdaArgs> lambda;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsProcessingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambda = defaults.lambda;
        }

        public Builder lambda(Input<AnalyticsApplicationInputsProcessingConfigurationLambdaArgs> lambda) {
            this.lambda = Objects.requireNonNull(lambda);
            return this;
        }

        public Builder lambda(AnalyticsApplicationInputsProcessingConfigurationLambdaArgs lambda) {
            this.lambda = Input.of(Objects.requireNonNull(lambda));
            return this;
        }
        public AnalyticsApplicationInputsProcessingConfigurationArgs build() {
            return new AnalyticsApplicationInputsProcessingConfigurationArgs(lambda);
        }
    }
}
