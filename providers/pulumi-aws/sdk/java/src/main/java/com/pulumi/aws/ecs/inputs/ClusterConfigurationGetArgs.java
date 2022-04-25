// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.aws.ecs.inputs.ClusterConfigurationExecuteCommandConfigurationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterConfigurationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterConfigurationGetArgs Empty = new ClusterConfigurationGetArgs();

    /**
     * The details of the execute command configuration. Detailed below.
     * 
     */
    @Import(name="executeCommandConfiguration")
    private @Nullable Output<ClusterConfigurationExecuteCommandConfigurationGetArgs> executeCommandConfiguration;

    /**
     * @return The details of the execute command configuration. Detailed below.
     * 
     */
    public Optional<Output<ClusterConfigurationExecuteCommandConfigurationGetArgs>> executeCommandConfiguration() {
        return Optional.ofNullable(this.executeCommandConfiguration);
    }

    private ClusterConfigurationGetArgs() {}

    private ClusterConfigurationGetArgs(ClusterConfigurationGetArgs $) {
        this.executeCommandConfiguration = $.executeCommandConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterConfigurationGetArgs $;

        public Builder() {
            $ = new ClusterConfigurationGetArgs();
        }

        public Builder(ClusterConfigurationGetArgs defaults) {
            $ = new ClusterConfigurationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param executeCommandConfiguration The details of the execute command configuration. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder executeCommandConfiguration(@Nullable Output<ClusterConfigurationExecuteCommandConfigurationGetArgs> executeCommandConfiguration) {
            $.executeCommandConfiguration = executeCommandConfiguration;
            return this;
        }

        /**
         * @param executeCommandConfiguration The details of the execute command configuration. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder executeCommandConfiguration(ClusterConfigurationExecuteCommandConfigurationGetArgs executeCommandConfiguration) {
            return executeCommandConfiguration(Output.of(executeCommandConfiguration));
        }

        public ClusterConfigurationGetArgs build() {
            return $;
        }
    }

}
