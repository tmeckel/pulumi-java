// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network Virtual Appliance Sku Properties.
 * 
 */
public final class VirtualApplianceSkuPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualApplianceSkuPropertiesArgs Empty = new VirtualApplianceSkuPropertiesArgs();

    /**
     * Virtual Appliance Scale Unit.
     * 
     */
    @Import(name="bundledScaleUnit")
    private @Nullable Output<String> bundledScaleUnit;

    /**
     * @return Virtual Appliance Scale Unit.
     * 
     */
    public Optional<Output<String>> bundledScaleUnit() {
        return Optional.ofNullable(this.bundledScaleUnit);
    }

    /**
     * Virtual Appliance Version.
     * 
     */
    @Import(name="marketPlaceVersion")
    private @Nullable Output<String> marketPlaceVersion;

    /**
     * @return Virtual Appliance Version.
     * 
     */
    public Optional<Output<String>> marketPlaceVersion() {
        return Optional.ofNullable(this.marketPlaceVersion);
    }

    /**
     * Virtual Appliance Vendor.
     * 
     */
    @Import(name="vendor")
    private @Nullable Output<String> vendor;

    /**
     * @return Virtual Appliance Vendor.
     * 
     */
    public Optional<Output<String>> vendor() {
        return Optional.ofNullable(this.vendor);
    }

    private VirtualApplianceSkuPropertiesArgs() {}

    private VirtualApplianceSkuPropertiesArgs(VirtualApplianceSkuPropertiesArgs $) {
        this.bundledScaleUnit = $.bundledScaleUnit;
        this.marketPlaceVersion = $.marketPlaceVersion;
        this.vendor = $.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualApplianceSkuPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualApplianceSkuPropertiesArgs $;

        public Builder() {
            $ = new VirtualApplianceSkuPropertiesArgs();
        }

        public Builder(VirtualApplianceSkuPropertiesArgs defaults) {
            $ = new VirtualApplianceSkuPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bundledScaleUnit Virtual Appliance Scale Unit.
         * 
         * @return builder
         * 
         */
        public Builder bundledScaleUnit(@Nullable Output<String> bundledScaleUnit) {
            $.bundledScaleUnit = bundledScaleUnit;
            return this;
        }

        /**
         * @param bundledScaleUnit Virtual Appliance Scale Unit.
         * 
         * @return builder
         * 
         */
        public Builder bundledScaleUnit(String bundledScaleUnit) {
            return bundledScaleUnit(Output.of(bundledScaleUnit));
        }

        /**
         * @param marketPlaceVersion Virtual Appliance Version.
         * 
         * @return builder
         * 
         */
        public Builder marketPlaceVersion(@Nullable Output<String> marketPlaceVersion) {
            $.marketPlaceVersion = marketPlaceVersion;
            return this;
        }

        /**
         * @param marketPlaceVersion Virtual Appliance Version.
         * 
         * @return builder
         * 
         */
        public Builder marketPlaceVersion(String marketPlaceVersion) {
            return marketPlaceVersion(Output.of(marketPlaceVersion));
        }

        /**
         * @param vendor Virtual Appliance Vendor.
         * 
         * @return builder
         * 
         */
        public Builder vendor(@Nullable Output<String> vendor) {
            $.vendor = vendor;
            return this;
        }

        /**
         * @param vendor Virtual Appliance Vendor.
         * 
         * @return builder
         * 
         */
        public Builder vendor(String vendor) {
            return vendor(Output.of(vendor));
        }

        public VirtualApplianceSkuPropertiesArgs build() {
            return $;
        }
    }

}
