// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.aws.opsworks.inputs.PhpAppLayerCloudwatchConfigurationLogStreamGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PhpAppLayerCloudwatchConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PhpAppLayerCloudwatchConfigurationGetArgs Empty = new PhpAppLayerCloudwatchConfigurationGetArgs();

    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="logStreams")
      private final @Nullable Input<List<PhpAppLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams;

    public Input<List<PhpAppLayerCloudwatchConfigurationLogStreamGetArgs>> getLogStreams() {
        return this.logStreams == null ? Input.empty() : this.logStreams;
    }

    public PhpAppLayerCloudwatchConfigurationGetArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<List<PhpAppLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams) {
        this.enabled = enabled;
        this.logStreams = logStreams;
    }

    private PhpAppLayerCloudwatchConfigurationGetArgs() {
        this.enabled = Input.empty();
        this.logStreams = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PhpAppLayerCloudwatchConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<List<PhpAppLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams;

        public Builder() {
    	      // Empty
        }

        public Builder(PhpAppLayerCloudwatchConfigurationGetArgs defaults) {
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

        public Builder logStreams(@Nullable Input<List<PhpAppLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams) {
            this.logStreams = logStreams;
            return this;
        }

        public Builder logStreams(@Nullable List<PhpAppLayerCloudwatchConfigurationLogStreamGetArgs> logStreams) {
            this.logStreams = Input.ofNullable(logStreams);
            return this;
        }
        public PhpAppLayerCloudwatchConfigurationGetArgs build() {
            return new PhpAppLayerCloudwatchConfigurationGetArgs(enabled, logStreams);
        }
    }
}
