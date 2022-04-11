// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.enums.DiskInstantiationConfigInstantiateFrom;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A specification of the desired way to instantiate a disk in the instance template when its created from a source instance.
 * 
 */
public final class DiskInstantiationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskInstantiationConfigArgs Empty = new DiskInstantiationConfigArgs();

    /**
     * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    @Import(name="autoDelete")
      private final @Nullable Output<Boolean> autoDelete;

    public Output<Boolean> getAutoDelete() {
        return this.autoDelete == null ? Codegen.empty() : this.autoDelete;
    }

    /**
     * The custom source image to be used to restore this disk when instantiating this instance template.
     * 
     */
    @Import(name="customImage")
      private final @Nullable Output<String> customImage;

    public Output<String> getCustomImage() {
        return this.customImage == null ? Codegen.empty() : this.customImage;
    }

    /**
     * Specifies the device name of the disk to which the configurations apply to.
     * 
     */
    @Import(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName == null ? Codegen.empty() : this.deviceName;
    }

    /**
     * Specifies whether to include the disk and what image to use. Possible values are: - source-image: to use the same image that was used to create the source instance's corresponding disk. Applicable to the boot disk and additional read-write disks. - source-image-family: to use the same image family that was used to create the source instance's corresponding disk. Applicable to the boot disk and additional read-write disks. - custom-image: to use a user-provided image url for disk creation. Applicable to the boot disk and additional read-write disks. - attach-read-only: to attach a read-only disk. Applicable to read-only disks. - do-not-include: to exclude a disk from the template. Applicable to additional read-write disks, local SSDs, and read-only disks.
     * 
     */
    @Import(name="instantiateFrom")
      private final @Nullable Output<DiskInstantiationConfigInstantiateFrom> instantiateFrom;

    public Output<DiskInstantiationConfigInstantiateFrom> getInstantiateFrom() {
        return this.instantiateFrom == null ? Codegen.empty() : this.instantiateFrom;
    }

    public DiskInstantiationConfigArgs(
        @Nullable Output<Boolean> autoDelete,
        @Nullable Output<String> customImage,
        @Nullable Output<String> deviceName,
        @Nullable Output<DiskInstantiationConfigInstantiateFrom> instantiateFrom) {
        this.autoDelete = autoDelete;
        this.customImage = customImage;
        this.deviceName = deviceName;
        this.instantiateFrom = instantiateFrom;
    }

    private DiskInstantiationConfigArgs() {
        this.autoDelete = Codegen.empty();
        this.customImage = Codegen.empty();
        this.deviceName = Codegen.empty();
        this.instantiateFrom = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskInstantiationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoDelete;
        private @Nullable Output<String> customImage;
        private @Nullable Output<String> deviceName;
        private @Nullable Output<DiskInstantiationConfigInstantiateFrom> instantiateFrom;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskInstantiationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.customImage = defaults.customImage;
    	      this.deviceName = defaults.deviceName;
    	      this.instantiateFrom = defaults.instantiateFrom;
        }

        public Builder autoDelete(@Nullable Output<Boolean> autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }
        public Builder autoDelete(@Nullable Boolean autoDelete) {
            this.autoDelete = Codegen.ofNullable(autoDelete);
            return this;
        }
        public Builder customImage(@Nullable Output<String> customImage) {
            this.customImage = customImage;
            return this;
        }
        public Builder customImage(@Nullable String customImage) {
            this.customImage = Codegen.ofNullable(customImage);
            return this;
        }
        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Codegen.ofNullable(deviceName);
            return this;
        }
        public Builder instantiateFrom(@Nullable Output<DiskInstantiationConfigInstantiateFrom> instantiateFrom) {
            this.instantiateFrom = instantiateFrom;
            return this;
        }
        public Builder instantiateFrom(@Nullable DiskInstantiationConfigInstantiateFrom instantiateFrom) {
            this.instantiateFrom = Codegen.ofNullable(instantiateFrom);
            return this;
        }        public DiskInstantiationConfigArgs build() {
            return new DiskInstantiationConfigArgs(autoDelete, customImage, deviceName, instantiateFrom);
        }
    }
}
