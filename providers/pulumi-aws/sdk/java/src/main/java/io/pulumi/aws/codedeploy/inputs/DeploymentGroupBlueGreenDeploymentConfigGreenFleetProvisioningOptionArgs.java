// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs Empty = new DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs();

    /**
     * The method used to add instances to a replacement environment.
     * * `DISCOVER_EXISTING`: Use instances that already exist or will be created manually.
     * * `COPY_AUTO_SCALING_GROUP`: Use settings from a specified **Auto Scaling** group to define and create instances in a new Auto Scaling group. _Exactly one Auto Scaling group must be specified_ when selecting `COPY_AUTO_SCALING_GROUP`. Use `autoscaling_groups` to specify the Auto Scaling group.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<String> action;

    public Output<String> getAction() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    public DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs(@Nullable Output<String> action) {
        this.action = action;
    }

    private DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs() {
        this.action = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> action;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
        }

        public Builder action(@Nullable Output<String> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable String action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }        public DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs build() {
            return new DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs(action);
        }
    }
}
