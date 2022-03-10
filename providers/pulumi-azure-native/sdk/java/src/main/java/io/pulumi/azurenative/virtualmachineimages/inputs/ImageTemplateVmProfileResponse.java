// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.inputs;

import io.pulumi.azurenative.virtualmachineimages.inputs.VirtualNetworkConfigResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the virtual machine used to build, customize and capture images
 * 
 */
public final class ImageTemplateVmProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageTemplateVmProfileResponse Empty = new ImageTemplateVmProfileResponse();

    /**
     * Size of the OS disk in GB. Omit or specify 0 to use Azure's default OS disk size.
     * 
     */
    @InputImport(name="osDiskSizeGB")
      private final @Nullable Integer osDiskSizeGB;

    public Optional<Integer> getOsDiskSizeGB() {
        return this.osDiskSizeGB == null ? Optional.empty() : Optional.ofNullable(this.osDiskSizeGB);
    }

    /**
     * Size of the virtual machine used to build, customize and capture images. Omit or specify empty string to use the default (Standard_D1_v2 for Gen1 images and Standard_D2ds_v4 for Gen2 images).
     * 
     */
    @InputImport(name="vmSize")
      private final @Nullable String vmSize;

    public Optional<String> getVmSize() {
        return this.vmSize == null ? Optional.empty() : Optional.ofNullable(this.vmSize);
    }

    /**
     * Optional configuration of the virtual network to use to deploy the build virtual machine in. Omit if no specific virtual network needs to be used.
     * 
     */
    @InputImport(name="vnetConfig")
      private final @Nullable VirtualNetworkConfigResponse vnetConfig;

    public Optional<VirtualNetworkConfigResponse> getVnetConfig() {
        return this.vnetConfig == null ? Optional.empty() : Optional.ofNullable(this.vnetConfig);
    }

    public ImageTemplateVmProfileResponse(
        @Nullable Integer osDiskSizeGB,
        @Nullable String vmSize,
        @Nullable VirtualNetworkConfigResponse vnetConfig) {
        this.osDiskSizeGB = osDiskSizeGB == null ? 0 : osDiskSizeGB;
        this.vmSize = vmSize == null ? "" : vmSize;
        this.vnetConfig = vnetConfig;
    }

    private ImageTemplateVmProfileResponse() {
        this.osDiskSizeGB = null;
        this.vmSize = null;
        this.vnetConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateVmProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer osDiskSizeGB;
        private @Nullable String vmSize;
        private @Nullable VirtualNetworkConfigResponse vnetConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateVmProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osDiskSizeGB = defaults.osDiskSizeGB;
    	      this.vmSize = defaults.vmSize;
    	      this.vnetConfig = defaults.vnetConfig;
        }

        public Builder osDiskSizeGB(@Nullable Integer osDiskSizeGB) {
            this.osDiskSizeGB = osDiskSizeGB;
            return this;
        }

        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public Builder vnetConfig(@Nullable VirtualNetworkConfigResponse vnetConfig) {
            this.vnetConfig = vnetConfig;
            return this;
        }
        public ImageTemplateVmProfileResponse build() {
            return new ImageTemplateVmProfileResponse(osDiskSizeGB, vmSize, vnetConfig);
        }
    }
}
