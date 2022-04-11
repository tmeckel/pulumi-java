// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigAutoRollbackConfigurationArgs;
import io.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointDeploymentConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointDeploymentConfigArgs Empty = new EndpointDeploymentConfigArgs();

    /**
     * Automatic rollback configuration for handling endpoint deployment failures and recovery. See Auto Rollback Configuration.
     * 
     */
    @Import(name="autoRollbackConfiguration")
      private final @Nullable Output<EndpointDeploymentConfigAutoRollbackConfigurationArgs> autoRollbackConfiguration;

    public Output<EndpointDeploymentConfigAutoRollbackConfigurationArgs> getAutoRollbackConfiguration() {
        return this.autoRollbackConfiguration == null ? Codegen.empty() : this.autoRollbackConfiguration;
    }

    /**
     * Update policy for a blue/green deployment. If this update policy is specified, SageMaker creates a new fleet during the deployment while maintaining the old fleet. See Blue Green Update Config.
     * 
     */
    @Import(name="blueGreenUpdatePolicy", required=true)
      private final Output<EndpointDeploymentConfigBlueGreenUpdatePolicyArgs> blueGreenUpdatePolicy;

    public Output<EndpointDeploymentConfigBlueGreenUpdatePolicyArgs> getBlueGreenUpdatePolicy() {
        return this.blueGreenUpdatePolicy;
    }

    public EndpointDeploymentConfigArgs(
        @Nullable Output<EndpointDeploymentConfigAutoRollbackConfigurationArgs> autoRollbackConfiguration,
        Output<EndpointDeploymentConfigBlueGreenUpdatePolicyArgs> blueGreenUpdatePolicy) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
        this.blueGreenUpdatePolicy = Objects.requireNonNull(blueGreenUpdatePolicy, "expected parameter 'blueGreenUpdatePolicy' to be non-null");
    }

    private EndpointDeploymentConfigArgs() {
        this.autoRollbackConfiguration = Codegen.empty();
        this.blueGreenUpdatePolicy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeploymentConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EndpointDeploymentConfigAutoRollbackConfigurationArgs> autoRollbackConfiguration;
        private Output<EndpointDeploymentConfigBlueGreenUpdatePolicyArgs> blueGreenUpdatePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointDeploymentConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRollbackConfiguration = defaults.autoRollbackConfiguration;
    	      this.blueGreenUpdatePolicy = defaults.blueGreenUpdatePolicy;
        }

        public Builder autoRollbackConfiguration(@Nullable Output<EndpointDeploymentConfigAutoRollbackConfigurationArgs> autoRollbackConfiguration) {
            this.autoRollbackConfiguration = autoRollbackConfiguration;
            return this;
        }
        public Builder autoRollbackConfiguration(@Nullable EndpointDeploymentConfigAutoRollbackConfigurationArgs autoRollbackConfiguration) {
            this.autoRollbackConfiguration = Codegen.ofNullable(autoRollbackConfiguration);
            return this;
        }
        public Builder blueGreenUpdatePolicy(Output<EndpointDeploymentConfigBlueGreenUpdatePolicyArgs> blueGreenUpdatePolicy) {
            this.blueGreenUpdatePolicy = Objects.requireNonNull(blueGreenUpdatePolicy);
            return this;
        }
        public Builder blueGreenUpdatePolicy(EndpointDeploymentConfigBlueGreenUpdatePolicyArgs blueGreenUpdatePolicy) {
            this.blueGreenUpdatePolicy = Output.of(Objects.requireNonNull(blueGreenUpdatePolicy));
            return this;
        }        public EndpointDeploymentConfigArgs build() {
            return new EndpointDeploymentConfigArgs(autoRollbackConfiguration, blueGreenUpdatePolicy);
        }
    }
}
