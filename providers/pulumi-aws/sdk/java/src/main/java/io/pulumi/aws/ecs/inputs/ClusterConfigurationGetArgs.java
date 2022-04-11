// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.aws.ecs.inputs.ClusterConfigurationExecuteCommandConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterConfigurationGetArgs Empty = new ClusterConfigurationGetArgs();

    /**
     * The details of the execute command configuration. Detailed below.
     * 
     */
    @Import(name="executeCommandConfiguration")
      private final @Nullable Output<ClusterConfigurationExecuteCommandConfigurationGetArgs> executeCommandConfiguration;

    public Output<ClusterConfigurationExecuteCommandConfigurationGetArgs> getExecuteCommandConfiguration() {
        return this.executeCommandConfiguration == null ? Codegen.empty() : this.executeCommandConfiguration;
    }

    public ClusterConfigurationGetArgs(@Nullable Output<ClusterConfigurationExecuteCommandConfigurationGetArgs> executeCommandConfiguration) {
        this.executeCommandConfiguration = executeCommandConfiguration;
    }

    private ClusterConfigurationGetArgs() {
        this.executeCommandConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClusterConfigurationExecuteCommandConfigurationGetArgs> executeCommandConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executeCommandConfiguration = defaults.executeCommandConfiguration;
        }

        public Builder executeCommandConfiguration(@Nullable Output<ClusterConfigurationExecuteCommandConfigurationGetArgs> executeCommandConfiguration) {
            this.executeCommandConfiguration = executeCommandConfiguration;
            return this;
        }
        public Builder executeCommandConfiguration(@Nullable ClusterConfigurationExecuteCommandConfigurationGetArgs executeCommandConfiguration) {
            this.executeCommandConfiguration = Codegen.ofNullable(executeCommandConfiguration);
            return this;
        }        public ClusterConfigurationGetArgs build() {
            return new ClusterConfigurationGetArgs(executeCommandConfiguration);
        }
    }
}
