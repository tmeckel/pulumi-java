// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1beta.inputs.ExecStepConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A step that runs an executable for a PatchJob.
 * 
 */
public final class ExecStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExecStepArgs Empty = new ExecStepArgs();

    /**
     * The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     * 
     */
    @InputImport(name="linuxExecStepConfig")
      private final @Nullable Input<ExecStepConfigArgs> linuxExecStepConfig;

    public Input<ExecStepConfigArgs> getLinuxExecStepConfig() {
        return this.linuxExecStepConfig == null ? Input.empty() : this.linuxExecStepConfig;
    }

    /**
     * The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     * 
     */
    @InputImport(name="windowsExecStepConfig")
      private final @Nullable Input<ExecStepConfigArgs> windowsExecStepConfig;

    public Input<ExecStepConfigArgs> getWindowsExecStepConfig() {
        return this.windowsExecStepConfig == null ? Input.empty() : this.windowsExecStepConfig;
    }

    public ExecStepArgs(
        @Nullable Input<ExecStepConfigArgs> linuxExecStepConfig,
        @Nullable Input<ExecStepConfigArgs> windowsExecStepConfig) {
        this.linuxExecStepConfig = linuxExecStepConfig;
        this.windowsExecStepConfig = windowsExecStepConfig;
    }

    private ExecStepArgs() {
        this.linuxExecStepConfig = Input.empty();
        this.windowsExecStepConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ExecStepConfigArgs> linuxExecStepConfig;
        private @Nullable Input<ExecStepConfigArgs> windowsExecStepConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linuxExecStepConfig = defaults.linuxExecStepConfig;
    	      this.windowsExecStepConfig = defaults.windowsExecStepConfig;
        }

        public Builder linuxExecStepConfig(@Nullable Input<ExecStepConfigArgs> linuxExecStepConfig) {
            this.linuxExecStepConfig = linuxExecStepConfig;
            return this;
        }

        public Builder linuxExecStepConfig(@Nullable ExecStepConfigArgs linuxExecStepConfig) {
            this.linuxExecStepConfig = Input.ofNullable(linuxExecStepConfig);
            return this;
        }

        public Builder windowsExecStepConfig(@Nullable Input<ExecStepConfigArgs> windowsExecStepConfig) {
            this.windowsExecStepConfig = windowsExecStepConfig;
            return this;
        }

        public Builder windowsExecStepConfig(@Nullable ExecStepConfigArgs windowsExecStepConfig) {
            this.windowsExecStepConfig = Input.ofNullable(windowsExecStepConfig);
            return this;
        }
        public ExecStepArgs build() {
            return new ExecStepArgs(linuxExecStepConfig, windowsExecStepConfig);
        }
    }
}
