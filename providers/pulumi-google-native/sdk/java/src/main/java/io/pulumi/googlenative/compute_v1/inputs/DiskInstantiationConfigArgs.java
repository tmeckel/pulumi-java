// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.DiskInstantiationConfigInstantiateFrom;
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
    @InputImport(name="autoDelete")
    private final @Nullable Input<Boolean> autoDelete;

    public Input<Boolean> getAutoDelete() {
        return this.autoDelete == null ? Input.empty() : this.autoDelete;
    }

    /**
     * The custom source image to be used to restore this disk when instantiating this instance template.
     * 
     */
    @InputImport(name="customImage")
    private final @Nullable Input<String> customImage;

    public Input<String> getCustomImage() {
        return this.customImage == null ? Input.empty() : this.customImage;
    }

    /**
     * Specifies the device name of the disk to which the configurations apply to.
     * 
     */
    @InputImport(name="deviceName")
    private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    /**
     * Specifies whether to include the disk and what image to use. Possible values are: - source-image: to use the same image that was used to create the source instance's corresponding disk. Applicable to the boot disk and additional read-write disks. - source-image-family: to use the same image family that was used to create the source instance's corresponding disk. Applicable to the boot disk and additional read-write disks. - custom-image: to use a user-provided image url for disk creation. Applicable to the boot disk and additional read-write disks. - attach-read-only: to attach a read-only disk. Applicable to read-only disks. - do-not-include: to exclude a disk from the template. Applicable to additional read-write disks, local SSDs, and read-only disks.
     * 
     */
    @InputImport(name="instantiateFrom")
    private final @Nullable Input<DiskInstantiationConfigInstantiateFrom> instantiateFrom;

    public Input<DiskInstantiationConfigInstantiateFrom> getInstantiateFrom() {
        return this.instantiateFrom == null ? Input.empty() : this.instantiateFrom;
    }

    public DiskInstantiationConfigArgs(
        @Nullable Input<Boolean> autoDelete,
        @Nullable Input<String> customImage,
        @Nullable Input<String> deviceName,
        @Nullable Input<DiskInstantiationConfigInstantiateFrom> instantiateFrom) {
        this.autoDelete = autoDelete;
        this.customImage = customImage;
        this.deviceName = deviceName;
        this.instantiateFrom = instantiateFrom;
    }

    private DiskInstantiationConfigArgs() {
        this.autoDelete = Input.empty();
        this.customImage = Input.empty();
        this.deviceName = Input.empty();
        this.instantiateFrom = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskInstantiationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoDelete;
        private @Nullable Input<String> customImage;
        private @Nullable Input<String> deviceName;
        private @Nullable Input<DiskInstantiationConfigInstantiateFrom> instantiateFrom;

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

        public Builder setAutoDelete(@Nullable Input<Boolean> autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }

        public Builder setAutoDelete(@Nullable Boolean autoDelete) {
            this.autoDelete = Input.ofNullable(autoDelete);
            return this;
        }

        public Builder setCustomImage(@Nullable Input<String> customImage) {
            this.customImage = customImage;
            return this;
        }

        public Builder setCustomImage(@Nullable String customImage) {
            this.customImage = Input.ofNullable(customImage);
            return this;
        }

        public Builder setDeviceName(@Nullable Input<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = Input.ofNullable(deviceName);
            return this;
        }

        public Builder setInstantiateFrom(@Nullable Input<DiskInstantiationConfigInstantiateFrom> instantiateFrom) {
            this.instantiateFrom = instantiateFrom;
            return this;
        }

        public Builder setInstantiateFrom(@Nullable DiskInstantiationConfigInstantiateFrom instantiateFrom) {
            this.instantiateFrom = Input.ofNullable(instantiateFrom);
            return this;
        }

        public DiskInstantiationConfigArgs build() {
            return new DiskInstantiationConfigArgs(autoDelete, customImage, deviceName, instantiateFrom);
        }
    }
}
