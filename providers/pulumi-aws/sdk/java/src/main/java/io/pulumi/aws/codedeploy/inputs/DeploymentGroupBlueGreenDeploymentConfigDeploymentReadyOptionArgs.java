// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionArgs Empty = new DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionArgs();

    /**
     * When to reroute traffic from an original environment to a replacement environment in a blue/green deployment.
     * * `CONTINUE_DEPLOYMENT`: Register new instances with the load balancer immediately after the new application revision is installed on the instances in the replacement environment.
     * * `STOP_DEPLOYMENT`: Do not register new instances with load balancer unless traffic is rerouted manually. If traffic is not rerouted manually before the end of the specified wait period, the deployment status is changed to Stopped.
     * 
     */
    @InputImport(name="actionOnTimeout")
      private final @Nullable Input<String> actionOnTimeout;

    public Input<String> getActionOnTimeout() {
        return this.actionOnTimeout == null ? Input.empty() : this.actionOnTimeout;
    }

    /**
     * The number of minutes to wait before the status of a blue/green deployment changed to Stopped if rerouting is not started manually. Applies only to the `STOP_DEPLOYMENT` option for `action_on_timeout`.
     * 
     */
    @InputImport(name="waitTimeInMinutes")
      private final @Nullable Input<Integer> waitTimeInMinutes;

    public Input<Integer> getWaitTimeInMinutes() {
        return this.waitTimeInMinutes == null ? Input.empty() : this.waitTimeInMinutes;
    }

    public DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionArgs(
        @Nullable Input<String> actionOnTimeout,
        @Nullable Input<Integer> waitTimeInMinutes) {
        this.actionOnTimeout = actionOnTimeout;
        this.waitTimeInMinutes = waitTimeInMinutes;
    }

    private DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionArgs() {
        this.actionOnTimeout = Input.empty();
        this.waitTimeInMinutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> actionOnTimeout;
        private @Nullable Input<Integer> waitTimeInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionOnTimeout = defaults.actionOnTimeout;
    	      this.waitTimeInMinutes = defaults.waitTimeInMinutes;
        }

        public Builder actionOnTimeout(@Nullable Input<String> actionOnTimeout) {
            this.actionOnTimeout = actionOnTimeout;
            return this;
        }

        public Builder actionOnTimeout(@Nullable String actionOnTimeout) {
            this.actionOnTimeout = Input.ofNullable(actionOnTimeout);
            return this;
        }

        public Builder waitTimeInMinutes(@Nullable Input<Integer> waitTimeInMinutes) {
            this.waitTimeInMinutes = waitTimeInMinutes;
            return this;
        }

        public Builder waitTimeInMinutes(@Nullable Integer waitTimeInMinutes) {
            this.waitTimeInMinutes = Input.ofNullable(waitTimeInMinutes);
            return this;
        }
        public DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionArgs build() {
            return new DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionArgs(actionOnTimeout, waitTimeInMinutes);
        }
    }
}
