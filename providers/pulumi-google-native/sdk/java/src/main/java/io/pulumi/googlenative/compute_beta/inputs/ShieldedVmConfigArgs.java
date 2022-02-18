// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A set of Shielded VM options.
 * 
 */
public final class ShieldedVmConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ShieldedVmConfigArgs Empty = new ShieldedVmConfigArgs();

    /**
     * Defines whether the instance has integrity monitoring enabled.
     * 
     */
    @InputImport(name="enableIntegrityMonitoring")
    private final @Nullable Input<Boolean> enableIntegrityMonitoring;

    public Input<Boolean> getEnableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring == null ? Input.empty() : this.enableIntegrityMonitoring;
    }

    /**
     * Defines whether the instance has Secure Boot enabled.
     * 
     */
    @InputImport(name="enableSecureBoot")
    private final @Nullable Input<Boolean> enableSecureBoot;

    public Input<Boolean> getEnableSecureBoot() {
        return this.enableSecureBoot == null ? Input.empty() : this.enableSecureBoot;
    }

    /**
     * Defines whether the instance has the vTPM enabled.
     * 
     */
    @InputImport(name="enableVtpm")
    private final @Nullable Input<Boolean> enableVtpm;

    public Input<Boolean> getEnableVtpm() {
        return this.enableVtpm == null ? Input.empty() : this.enableVtpm;
    }

    public ShieldedVmConfigArgs(
        @Nullable Input<Boolean> enableIntegrityMonitoring,
        @Nullable Input<Boolean> enableSecureBoot,
        @Nullable Input<Boolean> enableVtpm) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
        this.enableVtpm = enableVtpm;
    }

    private ShieldedVmConfigArgs() {
        this.enableIntegrityMonitoring = Input.empty();
        this.enableSecureBoot = Input.empty();
        this.enableVtpm = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShieldedVmConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableIntegrityMonitoring;
        private @Nullable Input<Boolean> enableSecureBoot;
        private @Nullable Input<Boolean> enableVtpm;

        public Builder() {
    	      // Empty
        }

        public Builder(ShieldedVmConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
    	      this.enableVtpm = defaults.enableVtpm;
        }

        public Builder setEnableIntegrityMonitoring(@Nullable Input<Boolean> enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }

        public Builder setEnableIntegrityMonitoring(@Nullable Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = Input.ofNullable(enableIntegrityMonitoring);
            return this;
        }

        public Builder setEnableSecureBoot(@Nullable Input<Boolean> enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }

        public Builder setEnableSecureBoot(@Nullable Boolean enableSecureBoot) {
            this.enableSecureBoot = Input.ofNullable(enableSecureBoot);
            return this;
        }

        public Builder setEnableVtpm(@Nullable Input<Boolean> enableVtpm) {
            this.enableVtpm = enableVtpm;
            return this;
        }

        public Builder setEnableVtpm(@Nullable Boolean enableVtpm) {
            this.enableVtpm = Input.ofNullable(enableVtpm);
            return this;
        }

        public ShieldedVmConfigArgs build() {
            return new ShieldedVmConfigArgs(enableIntegrityMonitoring, enableSecureBoot, enableVtpm);
        }
    }
}
