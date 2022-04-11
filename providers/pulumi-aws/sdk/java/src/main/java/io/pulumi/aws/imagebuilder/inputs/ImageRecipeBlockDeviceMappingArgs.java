// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.aws.imagebuilder.inputs.ImageRecipeBlockDeviceMappingEbsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageRecipeBlockDeviceMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageRecipeBlockDeviceMappingArgs Empty = new ImageRecipeBlockDeviceMappingArgs();

    /**
     * Name of the device. For example, `/dev/sda` or `/dev/xvdb`.
     * 
     */
    @Import(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName == null ? Codegen.empty() : this.deviceName;
    }

    /**
     * Configuration block with Elastic Block Storage (EBS) block device mapping settings. Detailed below.
     * 
     */
    @Import(name="ebs")
      private final @Nullable Output<ImageRecipeBlockDeviceMappingEbsArgs> ebs;

    public Output<ImageRecipeBlockDeviceMappingEbsArgs> getEbs() {
        return this.ebs == null ? Codegen.empty() : this.ebs;
    }

    /**
     * Set to `true` to remove a mapping from the parent image.
     * 
     */
    @Import(name="noDevice")
      private final @Nullable Output<Boolean> noDevice;

    public Output<Boolean> getNoDevice() {
        return this.noDevice == null ? Codegen.empty() : this.noDevice;
    }

    /**
     * Virtual device name. For example, `ephemeral0`. Instance store volumes are numbered starting from 0.
     * 
     */
    @Import(name="virtualName")
      private final @Nullable Output<String> virtualName;

    public Output<String> getVirtualName() {
        return this.virtualName == null ? Codegen.empty() : this.virtualName;
    }

    public ImageRecipeBlockDeviceMappingArgs(
        @Nullable Output<String> deviceName,
        @Nullable Output<ImageRecipeBlockDeviceMappingEbsArgs> ebs,
        @Nullable Output<Boolean> noDevice,
        @Nullable Output<String> virtualName) {
        this.deviceName = deviceName;
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    private ImageRecipeBlockDeviceMappingArgs() {
        this.deviceName = Codegen.empty();
        this.ebs = Codegen.empty();
        this.noDevice = Codegen.empty();
        this.virtualName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeBlockDeviceMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deviceName;
        private @Nullable Output<ImageRecipeBlockDeviceMappingEbsArgs> ebs;
        private @Nullable Output<Boolean> noDevice;
        private @Nullable Output<String> virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeBlockDeviceMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Codegen.ofNullable(deviceName);
            return this;
        }
        public Builder ebs(@Nullable Output<ImageRecipeBlockDeviceMappingEbsArgs> ebs) {
            this.ebs = ebs;
            return this;
        }
        public Builder ebs(@Nullable ImageRecipeBlockDeviceMappingEbsArgs ebs) {
            this.ebs = Codegen.ofNullable(ebs);
            return this;
        }
        public Builder noDevice(@Nullable Output<Boolean> noDevice) {
            this.noDevice = noDevice;
            return this;
        }
        public Builder noDevice(@Nullable Boolean noDevice) {
            this.noDevice = Codegen.ofNullable(noDevice);
            return this;
        }
        public Builder virtualName(@Nullable Output<String> virtualName) {
            this.virtualName = virtualName;
            return this;
        }
        public Builder virtualName(@Nullable String virtualName) {
            this.virtualName = Codegen.ofNullable(virtualName);
            return this;
        }        public ImageRecipeBlockDeviceMappingArgs build() {
            return new ImageRecipeBlockDeviceMappingArgs(deviceName, ebs, noDevice, virtualName);
        }
    }
}
