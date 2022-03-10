// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGetArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentPatchConfigPreStepGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentPatchConfigPreStepGetArgs Empty = new PatchDeploymentPatchConfigPreStepGetArgs();

    /**
     * The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     * Structure is documented below.
     * 
     */
    @InputImport(name="linuxExecStepConfig")
      private final @Nullable Input<PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGetArgs> linuxExecStepConfig;

    public Input<PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGetArgs> getLinuxExecStepConfig() {
        return this.linuxExecStepConfig == null ? Input.empty() : this.linuxExecStepConfig;
    }

    /**
     * The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     * Structure is documented below.
     * 
     */
    @InputImport(name="windowsExecStepConfig")
      private final @Nullable Input<PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGetArgs> windowsExecStepConfig;

    public Input<PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGetArgs> getWindowsExecStepConfig() {
        return this.windowsExecStepConfig == null ? Input.empty() : this.windowsExecStepConfig;
    }

    public PatchDeploymentPatchConfigPreStepGetArgs(
        @Nullable Input<PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGetArgs> linuxExecStepConfig,
        @Nullable Input<PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGetArgs> windowsExecStepConfig) {
        this.linuxExecStepConfig = linuxExecStepConfig;
        this.windowsExecStepConfig = windowsExecStepConfig;
    }

    private PatchDeploymentPatchConfigPreStepGetArgs() {
        this.linuxExecStepConfig = Input.empty();
        this.windowsExecStepConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigPreStepGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGetArgs> linuxExecStepConfig;
        private @Nullable Input<PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGetArgs> windowsExecStepConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigPreStepGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linuxExecStepConfig = defaults.linuxExecStepConfig;
    	      this.windowsExecStepConfig = defaults.windowsExecStepConfig;
        }

        public Builder linuxExecStepConfig(@Nullable Input<PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGetArgs> linuxExecStepConfig) {
            this.linuxExecStepConfig = linuxExecStepConfig;
            return this;
        }

        public Builder linuxExecStepConfig(@Nullable PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGetArgs linuxExecStepConfig) {
            this.linuxExecStepConfig = Input.ofNullable(linuxExecStepConfig);
            return this;
        }

        public Builder windowsExecStepConfig(@Nullable Input<PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGetArgs> windowsExecStepConfig) {
            this.windowsExecStepConfig = windowsExecStepConfig;
            return this;
        }

        public Builder windowsExecStepConfig(@Nullable PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGetArgs windowsExecStepConfig) {
            this.windowsExecStepConfig = Input.ofNullable(windowsExecStepConfig);
            return this;
        }
        public PatchDeploymentPatchConfigPreStepGetArgs build() {
            return new PatchDeploymentPatchConfigPreStepGetArgs(linuxExecStepConfig, windowsExecStepConfig);
        }
    }
}
