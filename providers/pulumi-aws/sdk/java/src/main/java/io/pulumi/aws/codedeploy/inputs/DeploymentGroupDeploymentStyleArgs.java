// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentGroupDeploymentStyleArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupDeploymentStyleArgs Empty = new DeploymentGroupDeploymentStyleArgs();

    /**
     * Indicates whether to route deployment traffic behind a load balancer. Valid Values are `WITH_TRAFFIC_CONTROL` or `WITHOUT_TRAFFIC_CONTROL`. Default is `WITHOUT_TRAFFIC_CONTROL`.
     * 
     */
    @InputImport(name="deploymentOption")
      private final @Nullable Input<String> deploymentOption;

    public Input<String> getDeploymentOption() {
        return this.deploymentOption == null ? Input.empty() : this.deploymentOption;
    }

    /**
     * Indicates whether to run an in-place deployment or a blue/green deployment. Valid Values are `IN_PLACE` or `BLUE_GREEN`. Default is `IN_PLACE`.
     * 
     */
    @InputImport(name="deploymentType")
      private final @Nullable Input<String> deploymentType;

    public Input<String> getDeploymentType() {
        return this.deploymentType == null ? Input.empty() : this.deploymentType;
    }

    public DeploymentGroupDeploymentStyleArgs(
        @Nullable Input<String> deploymentOption,
        @Nullable Input<String> deploymentType) {
        this.deploymentOption = deploymentOption;
        this.deploymentType = deploymentType;
    }

    private DeploymentGroupDeploymentStyleArgs() {
        this.deploymentOption = Input.empty();
        this.deploymentType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupDeploymentStyleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deploymentOption;
        private @Nullable Input<String> deploymentType;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupDeploymentStyleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentOption = defaults.deploymentOption;
    	      this.deploymentType = defaults.deploymentType;
        }

        public Builder deploymentOption(@Nullable Input<String> deploymentOption) {
            this.deploymentOption = deploymentOption;
            return this;
        }

        public Builder deploymentOption(@Nullable String deploymentOption) {
            this.deploymentOption = Input.ofNullable(deploymentOption);
            return this;
        }

        public Builder deploymentType(@Nullable Input<String> deploymentType) {
            this.deploymentType = deploymentType;
            return this;
        }

        public Builder deploymentType(@Nullable String deploymentType) {
            this.deploymentType = Input.ofNullable(deploymentType);
            return this;
        }
        public DeploymentGroupDeploymentStyleArgs build() {
            return new DeploymentGroupDeploymentStyleArgs(deploymentOption, deploymentType);
        }
    }
}
