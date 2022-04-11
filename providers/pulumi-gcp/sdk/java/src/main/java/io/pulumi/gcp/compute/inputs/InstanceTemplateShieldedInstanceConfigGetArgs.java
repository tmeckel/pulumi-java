// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceTemplateShieldedInstanceConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateShieldedInstanceConfigGetArgs Empty = new InstanceTemplateShieldedInstanceConfigGetArgs();

    /**
     * -- Compare the most recent boot measurements to the integrity policy baseline and return a pair of pass/fail results depending on whether they match or not. Defaults to true.
     * 
     */
    @Import(name="enableIntegrityMonitoring")
      private final @Nullable Output<Boolean> enableIntegrityMonitoring;

    public Output<Boolean> getEnableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring == null ? Codegen.empty() : this.enableIntegrityMonitoring;
    }

    /**
     * -- Verify the digital signature of all boot components, and halt the boot process if signature verification fails. Defaults to false.
     * 
     */
    @Import(name="enableSecureBoot")
      private final @Nullable Output<Boolean> enableSecureBoot;

    public Output<Boolean> getEnableSecureBoot() {
        return this.enableSecureBoot == null ? Codegen.empty() : this.enableSecureBoot;
    }

    /**
     * -- Use a virtualized trusted platform module, which is a specialized computer chip you can use to encrypt objects like keys and certificates. Defaults to true.
     * 
     */
    @Import(name="enableVtpm")
      private final @Nullable Output<Boolean> enableVtpm;

    public Output<Boolean> getEnableVtpm() {
        return this.enableVtpm == null ? Codegen.empty() : this.enableVtpm;
    }

    public InstanceTemplateShieldedInstanceConfigGetArgs(
        @Nullable Output<Boolean> enableIntegrityMonitoring,
        @Nullable Output<Boolean> enableSecureBoot,
        @Nullable Output<Boolean> enableVtpm) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
        this.enableVtpm = enableVtpm;
    }

    private InstanceTemplateShieldedInstanceConfigGetArgs() {
        this.enableIntegrityMonitoring = Codegen.empty();
        this.enableSecureBoot = Codegen.empty();
        this.enableVtpm = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateShieldedInstanceConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableIntegrityMonitoring;
        private @Nullable Output<Boolean> enableSecureBoot;
        private @Nullable Output<Boolean> enableVtpm;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateShieldedInstanceConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
    	      this.enableVtpm = defaults.enableVtpm;
        }

        public Builder enableIntegrityMonitoring(@Nullable Output<Boolean> enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }
        public Builder enableIntegrityMonitoring(@Nullable Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = Codegen.ofNullable(enableIntegrityMonitoring);
            return this;
        }
        public Builder enableSecureBoot(@Nullable Output<Boolean> enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }
        public Builder enableSecureBoot(@Nullable Boolean enableSecureBoot) {
            this.enableSecureBoot = Codegen.ofNullable(enableSecureBoot);
            return this;
        }
        public Builder enableVtpm(@Nullable Output<Boolean> enableVtpm) {
            this.enableVtpm = enableVtpm;
            return this;
        }
        public Builder enableVtpm(@Nullable Boolean enableVtpm) {
            this.enableVtpm = Codegen.ofNullable(enableVtpm);
            return this;
        }        public InstanceTemplateShieldedInstanceConfigGetArgs build() {
            return new InstanceTemplateShieldedInstanceConfigGetArgs(enableIntegrityMonitoring, enableSecureBoot, enableVtpm);
        }
    }
}
