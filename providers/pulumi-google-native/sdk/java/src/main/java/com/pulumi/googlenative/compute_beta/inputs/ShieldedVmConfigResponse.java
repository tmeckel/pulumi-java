// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * A set of Shielded VM options.
 * 
 */
public final class ShieldedVmConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final ShieldedVmConfigResponse Empty = new ShieldedVmConfigResponse();

    /**
     * Defines whether the instance has integrity monitoring enabled.
     * 
     */
    @Import(name="enableIntegrityMonitoring", required=true)
    private Boolean enableIntegrityMonitoring;

    /**
     * @return Defines whether the instance has integrity monitoring enabled.
     * 
     */
    public Boolean enableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring;
    }

    /**
     * Defines whether the instance has Secure Boot enabled.
     * 
     */
    @Import(name="enableSecureBoot", required=true)
    private Boolean enableSecureBoot;

    /**
     * @return Defines whether the instance has Secure Boot enabled.
     * 
     */
    public Boolean enableSecureBoot() {
        return this.enableSecureBoot;
    }

    /**
     * Defines whether the instance has the vTPM enabled.
     * 
     */
    @Import(name="enableVtpm", required=true)
    private Boolean enableVtpm;

    /**
     * @return Defines whether the instance has the vTPM enabled.
     * 
     */
    public Boolean enableVtpm() {
        return this.enableVtpm;
    }

    private ShieldedVmConfigResponse() {}

    private ShieldedVmConfigResponse(ShieldedVmConfigResponse $) {
        this.enableIntegrityMonitoring = $.enableIntegrityMonitoring;
        this.enableSecureBoot = $.enableSecureBoot;
        this.enableVtpm = $.enableVtpm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShieldedVmConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShieldedVmConfigResponse $;

        public Builder() {
            $ = new ShieldedVmConfigResponse();
        }

        public Builder(ShieldedVmConfigResponse defaults) {
            $ = new ShieldedVmConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableIntegrityMonitoring Defines whether the instance has integrity monitoring enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            $.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }

        /**
         * @param enableSecureBoot Defines whether the instance has Secure Boot enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableSecureBoot(Boolean enableSecureBoot) {
            $.enableSecureBoot = enableSecureBoot;
            return this;
        }

        /**
         * @param enableVtpm Defines whether the instance has the vTPM enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableVtpm(Boolean enableVtpm) {
            $.enableVtpm = enableVtpm;
            return this;
        }

        public ShieldedVmConfigResponse build() {
            $.enableIntegrityMonitoring = Objects.requireNonNull($.enableIntegrityMonitoring, "expected parameter 'enableIntegrityMonitoring' to be non-null");
            $.enableSecureBoot = Objects.requireNonNull($.enableSecureBoot, "expected parameter 'enableSecureBoot' to be non-null");
            $.enableVtpm = Objects.requireNonNull($.enableVtpm, "expected parameter 'enableVtpm' to be non-null");
            return $;
        }
    }

}
