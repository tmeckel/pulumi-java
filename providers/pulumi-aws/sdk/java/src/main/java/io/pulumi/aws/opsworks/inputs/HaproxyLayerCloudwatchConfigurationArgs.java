// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.aws.opsworks.inputs.HaproxyLayerCloudwatchConfigurationLogStreamArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HaproxyLayerCloudwatchConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final HaproxyLayerCloudwatchConfigurationArgs Empty = new HaproxyLayerCloudwatchConfigurationArgs();

    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    @Import(name="logStreams")
      private final @Nullable Output<List<HaproxyLayerCloudwatchConfigurationLogStreamArgs>> logStreams;

    public Output<List<HaproxyLayerCloudwatchConfigurationLogStreamArgs>> getLogStreams() {
        return this.logStreams == null ? Codegen.empty() : this.logStreams;
    }

    public HaproxyLayerCloudwatchConfigurationArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<List<HaproxyLayerCloudwatchConfigurationLogStreamArgs>> logStreams) {
        this.enabled = enabled;
        this.logStreams = logStreams;
    }

    private HaproxyLayerCloudwatchConfigurationArgs() {
        this.enabled = Codegen.empty();
        this.logStreams = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HaproxyLayerCloudwatchConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<List<HaproxyLayerCloudwatchConfigurationLogStreamArgs>> logStreams;

        public Builder() {
    	      // Empty
        }

        public Builder(HaproxyLayerCloudwatchConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logStreams = defaults.logStreams;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder logStreams(@Nullable Output<List<HaproxyLayerCloudwatchConfigurationLogStreamArgs>> logStreams) {
            this.logStreams = logStreams;
            return this;
        }
        public Builder logStreams(@Nullable List<HaproxyLayerCloudwatchConfigurationLogStreamArgs> logStreams) {
            this.logStreams = Codegen.ofNullable(logStreams);
            return this;
        }
        public Builder logStreams(HaproxyLayerCloudwatchConfigurationLogStreamArgs... logStreams) {
            return logStreams(List.of(logStreams));
        }        public HaproxyLayerCloudwatchConfigurationArgs build() {
            return new HaproxyLayerCloudwatchConfigurationArgs(enabled, logStreams);
        }
    }
}
