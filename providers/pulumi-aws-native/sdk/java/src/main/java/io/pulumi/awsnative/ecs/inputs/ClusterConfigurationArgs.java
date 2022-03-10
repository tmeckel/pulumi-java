// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.inputs.ClusterExecuteCommandConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configurations to be set at cluster level.
 * 
 */
public final class ClusterConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterConfigurationArgs Empty = new ClusterConfigurationArgs();

    @InputImport(name="executeCommandConfiguration")
      private final @Nullable Input<ClusterExecuteCommandConfigurationArgs> executeCommandConfiguration;

    public Input<ClusterExecuteCommandConfigurationArgs> getExecuteCommandConfiguration() {
        return this.executeCommandConfiguration == null ? Input.empty() : this.executeCommandConfiguration;
    }

    public ClusterConfigurationArgs(@Nullable Input<ClusterExecuteCommandConfigurationArgs> executeCommandConfiguration) {
        this.executeCommandConfiguration = executeCommandConfiguration;
    }

    private ClusterConfigurationArgs() {
        this.executeCommandConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClusterExecuteCommandConfigurationArgs> executeCommandConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executeCommandConfiguration = defaults.executeCommandConfiguration;
        }

        public Builder executeCommandConfiguration(@Nullable Input<ClusterExecuteCommandConfigurationArgs> executeCommandConfiguration) {
            this.executeCommandConfiguration = executeCommandConfiguration;
            return this;
        }

        public Builder executeCommandConfiguration(@Nullable ClusterExecuteCommandConfigurationArgs executeCommandConfiguration) {
            this.executeCommandConfiguration = Input.ofNullable(executeCommandConfiguration);
            return this;
        }
        public ClusterConfigurationArgs build() {
            return new ClusterConfigurationArgs(executeCommandConfiguration);
        }
    }
}
