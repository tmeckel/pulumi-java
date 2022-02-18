// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.AttachedDiskInterface;
import io.pulumi.googlenative.compute_beta.enums.AttachedDiskMode;
import io.pulumi.googlenative.compute_beta.enums.AttachedDiskType;
import io.pulumi.googlenative.compute_beta.inputs.AttachedDiskInitializeParamsArgs;
import io.pulumi.googlenative.compute_beta.inputs.CustomerEncryptionKeyArgs;
import io.pulumi.googlenative.compute_beta.inputs.GuestOsFeatureArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An instance-attached disk resource.
 * 
 */
public final class AttachedDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttachedDiskArgs Empty = new AttachedDiskArgs();

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
     * Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    @InputImport(name="boot")
    private final @Nullable Input<Boolean> boot;

    public Input<Boolean> getBoot() {
        return this.boot == null ? Input.empty() : this.boot;
    }

    /**
     * Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
     * 
     */
    @InputImport(name="deviceName")
    private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    /**
     * Encrypts or decrypts a disk using a customer-supplied encryption key. If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this field decrypts the disk using the customer-supplied encryption key. If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance. If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later. Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group.
     * 
     */
    @InputImport(name="diskEncryptionKey")
    private final @Nullable Input<CustomerEncryptionKeyArgs> diskEncryptionKey;

    public Input<CustomerEncryptionKeyArgs> getDiskEncryptionKey() {
        return this.diskEncryptionKey == null ? Input.empty() : this.diskEncryptionKey;
    }

    /**
     * The size of the disk in GB.
     * 
     */
    @InputImport(name="diskSizeGb")
    private final @Nullable Input<String> diskSizeGb;

    public Input<String> getDiskSizeGb() {
        return this.diskSizeGb == null ? Input.empty() : this.diskSizeGb;
    }

    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    @InputImport(name="guestOsFeatures")
    private final @Nullable Input<List<GuestOsFeatureArgs>> guestOsFeatures;

    public Input<List<GuestOsFeatureArgs>> getGuestOsFeatures() {
        return this.guestOsFeatures == null ? Input.empty() : this.guestOsFeatures;
    }

    /**
     * [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
     * 
     */
    @InputImport(name="initializeParams")
    private final @Nullable Input<AttachedDiskInitializeParamsArgs> initializeParams;

    public Input<AttachedDiskInitializeParamsArgs> getInitializeParams() {
        return this.initializeParams == null ? Input.empty() : this.initializeParams;
    }

    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * 
     */
    @InputImport(name="interface")
    private final @Nullable Input<AttachedDiskInterface> $interface;

    public Input<AttachedDiskInterface> get$interface() {
        return this.$interface == null ? Input.empty() : this.$interface;
    }

    /**
     * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode.
     * 
     */
    @InputImport(name="mode")
    private final @Nullable Input<AttachedDiskMode> mode;

    public Input<AttachedDiskMode> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. If desired, you can also attach existing non-root persistent disks using this property. This field is only applicable for persistent disks. Note that for InstanceTemplate, specify the disk name for zonal disk, and the URL for regional disk.
     * 
     */
    @InputImport(name="source")
    private final @Nullable Input<String> source;

    public Input<String> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    /**
     * Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<AttachedDiskType> type;

    public Input<AttachedDiskType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public AttachedDiskArgs(
        @Nullable Input<Boolean> autoDelete,
        @Nullable Input<Boolean> boot,
        @Nullable Input<String> deviceName,
        @Nullable Input<CustomerEncryptionKeyArgs> diskEncryptionKey,
        @Nullable Input<String> diskSizeGb,
        @Nullable Input<List<GuestOsFeatureArgs>> guestOsFeatures,
        @Nullable Input<AttachedDiskInitializeParamsArgs> initializeParams,
        @Nullable Input<AttachedDiskInterface> $interface,
        @Nullable Input<AttachedDiskMode> mode,
        @Nullable Input<String> source,
        @Nullable Input<AttachedDiskType> type) {
        this.autoDelete = autoDelete;
        this.boot = boot;
        this.deviceName = deviceName;
        this.diskEncryptionKey = diskEncryptionKey;
        this.diskSizeGb = diskSizeGb;
        this.guestOsFeatures = guestOsFeatures;
        this.initializeParams = initializeParams;
        this.$interface = $interface;
        this.mode = mode;
        this.source = source;
        this.type = type;
    }

    private AttachedDiskArgs() {
        this.autoDelete = Input.empty();
        this.boot = Input.empty();
        this.deviceName = Input.empty();
        this.diskEncryptionKey = Input.empty();
        this.diskSizeGb = Input.empty();
        this.guestOsFeatures = Input.empty();
        this.initializeParams = Input.empty();
        this.$interface = Input.empty();
        this.mode = Input.empty();
        this.source = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoDelete;
        private @Nullable Input<Boolean> boot;
        private @Nullable Input<String> deviceName;
        private @Nullable Input<CustomerEncryptionKeyArgs> diskEncryptionKey;
        private @Nullable Input<String> diskSizeGb;
        private @Nullable Input<List<GuestOsFeatureArgs>> guestOsFeatures;
        private @Nullable Input<AttachedDiskInitializeParamsArgs> initializeParams;
        private @Nullable Input<AttachedDiskInterface> $interface;
        private @Nullable Input<AttachedDiskMode> mode;
        private @Nullable Input<String> source;
        private @Nullable Input<AttachedDiskType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachedDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.initializeParams = defaults.initializeParams;
    	      this.$interface = defaults.$interface;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
        }

        public Builder setAutoDelete(@Nullable Input<Boolean> autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }

        public Builder setAutoDelete(@Nullable Boolean autoDelete) {
            this.autoDelete = Input.ofNullable(autoDelete);
            return this;
        }

        public Builder setBoot(@Nullable Input<Boolean> boot) {
            this.boot = boot;
            return this;
        }

        public Builder setBoot(@Nullable Boolean boot) {
            this.boot = Input.ofNullable(boot);
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

        public Builder setDiskEncryptionKey(@Nullable Input<CustomerEncryptionKeyArgs> diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        public Builder setDiskEncryptionKey(@Nullable CustomerEncryptionKeyArgs diskEncryptionKey) {
            this.diskEncryptionKey = Input.ofNullable(diskEncryptionKey);
            return this;
        }

        public Builder setDiskSizeGb(@Nullable Input<String> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder setDiskSizeGb(@Nullable String diskSizeGb) {
            this.diskSizeGb = Input.ofNullable(diskSizeGb);
            return this;
        }

        public Builder setGuestOsFeatures(@Nullable Input<List<GuestOsFeatureArgs>> guestOsFeatures) {
            this.guestOsFeatures = guestOsFeatures;
            return this;
        }

        public Builder setGuestOsFeatures(@Nullable List<GuestOsFeatureArgs> guestOsFeatures) {
            this.guestOsFeatures = Input.ofNullable(guestOsFeatures);
            return this;
        }

        public Builder setInitializeParams(@Nullable Input<AttachedDiskInitializeParamsArgs> initializeParams) {
            this.initializeParams = initializeParams;
            return this;
        }

        public Builder setInitializeParams(@Nullable AttachedDiskInitializeParamsArgs initializeParams) {
            this.initializeParams = Input.ofNullable(initializeParams);
            return this;
        }

        public Builder set$interface(@Nullable Input<AttachedDiskInterface> $interface) {
            this.$interface = $interface;
            return this;
        }

        public Builder set$interface(@Nullable AttachedDiskInterface $interface) {
            this.$interface = Input.ofNullable($interface);
            return this;
        }

        public Builder setMode(@Nullable Input<AttachedDiskMode> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable AttachedDiskMode mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setSource(@Nullable Input<String> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder setType(@Nullable Input<AttachedDiskType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable AttachedDiskType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public AttachedDiskArgs build() {
            return new AttachedDiskArgs(autoDelete, boot, deviceName, diskEncryptionKey, diskSizeGb, guestOsFeatures, initializeParams, $interface, mode, source, type);
        }
    }
}
