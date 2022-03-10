// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.aws.opsworks.inputs.NodejsAppLayerCloudwatchConfigurationLogStreamGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodejsAppLayerCloudwatchConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodejsAppLayerCloudwatchConfigurationGetArgs Empty = new NodejsAppLayerCloudwatchConfigurationGetArgs();

    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="logStreams")
      private final @Nullable Input<List<NodejsAppLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams;

    public Input<List<NodejsAppLayerCloudwatchConfigurationLogStreamGetArgs>> getLogStreams() {
        return this.logStreams == null ? Input.empty() : this.logStreams;
    }

    public NodejsAppLayerCloudwatchConfigurationGetArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<List<NodejsAppLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams) {
        this.enabled = enabled;
        this.logStreams = logStreams;
    }

    private NodejsAppLayerCloudwatchConfigurationGetArgs() {
        this.enabled = Input.empty();
        this.logStreams = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodejsAppLayerCloudwatchConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<List<NodejsAppLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams;

        public Builder() {
    	      // Empty
        }

        public Builder(NodejsAppLayerCloudwatchConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logStreams = defaults.logStreams;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder logStreams(@Nullable Input<List<NodejsAppLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams) {
            this.logStreams = logStreams;
            return this;
        }

        public Builder logStreams(@Nullable List<NodejsAppLayerCloudwatchConfigurationLogStreamGetArgs> logStreams) {
            this.logStreams = Input.ofNullable(logStreams);
            return this;
        }
        public NodejsAppLayerCloudwatchConfigurationGetArgs build() {
            return new NodejsAppLayerCloudwatchConfigurationGetArgs(enabled, logStreams);
        }
    }
}
