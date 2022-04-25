// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.osconfig_v1.outputs.ExecStepConfigResponse;
import java.util.Objects;

@CustomType
public final class ExecStepResponse {
    /**
     * @return The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     * 
     */
    private final ExecStepConfigResponse linuxExecStepConfig;
    /**
     * @return The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     * 
     */
    private final ExecStepConfigResponse windowsExecStepConfig;

    @CustomType.Constructor
    private ExecStepResponse(
        @CustomType.Parameter("linuxExecStepConfig") ExecStepConfigResponse linuxExecStepConfig,
        @CustomType.Parameter("windowsExecStepConfig") ExecStepConfigResponse windowsExecStepConfig) {
        this.linuxExecStepConfig = linuxExecStepConfig;
        this.windowsExecStepConfig = windowsExecStepConfig;
    }

    /**
     * @return The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     * 
     */
    public ExecStepConfigResponse linuxExecStepConfig() {
        return this.linuxExecStepConfig;
    }
    /**
     * @return The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     * 
     */
    public ExecStepConfigResponse windowsExecStepConfig() {
        return this.windowsExecStepConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecStepConfigResponse linuxExecStepConfig;
        private ExecStepConfigResponse windowsExecStepConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linuxExecStepConfig = defaults.linuxExecStepConfig;
    	      this.windowsExecStepConfig = defaults.windowsExecStepConfig;
        }

        public Builder linuxExecStepConfig(ExecStepConfigResponse linuxExecStepConfig) {
            this.linuxExecStepConfig = Objects.requireNonNull(linuxExecStepConfig);
            return this;
        }
        public Builder windowsExecStepConfig(ExecStepConfigResponse windowsExecStepConfig) {
            this.windowsExecStepConfig = Objects.requireNonNull(windowsExecStepConfig);
            return this;
        }        public ExecStepResponse build() {
            return new ExecStepResponse(linuxExecStepConfig, windowsExecStepConfig);
        }
    }
}
