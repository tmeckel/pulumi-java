// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.CustomerEncryptionKeyResponse;
import com.pulumi.googlenative.compute_alpha.inputs.GuestOsFeatureResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * DEPRECATED: Please use compute#savedDisk instead. An instance-attached disk resource.
 * 
 */
public final class SavedAttachedDiskResponse extends com.pulumi.resources.InvokeArgs {

    public static final SavedAttachedDiskResponse Empty = new SavedAttachedDiskResponse();

    /**
     * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    @Import(name="autoDelete", required=true)
    private Boolean autoDelete;

    /**
     * @return Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    public Boolean autoDelete() {
        return this.autoDelete;
    }

    /**
     * Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    @Import(name="boot", required=true)
    private Boolean boot;

    /**
     * @return Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    public Boolean boot() {
        return this.boot;
    }

    /**
     * Specifies the name of the disk attached to the source instance.
     * 
     */
    @Import(name="deviceName", required=true)
    private String deviceName;

    /**
     * @return Specifies the name of the disk attached to the source instance.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }

    /**
     * The encryption key for the disk.
     * 
     */
    @Import(name="diskEncryptionKey", required=true)
    private CustomerEncryptionKeyResponse diskEncryptionKey;

    /**
     * @return The encryption key for the disk.
     * 
     */
    public CustomerEncryptionKeyResponse diskEncryptionKey() {
        return this.diskEncryptionKey;
    }

    /**
     * The size of the disk in base-2 GB.
     * 
     */
    @Import(name="diskSizeGb", required=true)
    private String diskSizeGb;

    /**
     * @return The size of the disk in base-2 GB.
     * 
     */
    public String diskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * URL of the disk type resource. For example: projects/project /zones/zone/diskTypes/pd-standard or pd-ssd
     * 
     */
    @Import(name="diskType", required=true)
    private String diskType;

    /**
     * @return URL of the disk type resource. For example: projects/project /zones/zone/diskTypes/pd-standard or pd-ssd
     * 
     */
    public String diskType() {
        return this.diskType;
    }

    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    @Import(name="guestOsFeatures", required=true)
    private List<GuestOsFeatureResponse> guestOsFeatures;

    /**
     * @return A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    public List<GuestOsFeatureResponse> guestOsFeatures() {
        return this.guestOsFeatures;
    }

    /**
     * Specifies zero-based index of the disk that is attached to the source instance.
     * 
     */
    @Import(name="index", required=true)
    private Integer index;

    /**
     * @return Specifies zero-based index of the disk that is attached to the source instance.
     * 
     */
    public Integer index() {
        return this.index;
    }

    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
     * 
     */
    @Import(name="interface", required=true)
    private String interface_;

    /**
     * @return Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
     * 
     */
    public String interface_() {
        return this.interface_;
    }

    /**
     * Type of the resource. Always compute#attachedDisk for attached disks.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    /**
     * @return Type of the resource. Always compute#attachedDisk for attached disks.
     * 
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Any valid publicly visible licenses.
     * 
     */
    @Import(name="licenses", required=true)
    private List<String> licenses;

    /**
     * @return Any valid publicly visible licenses.
     * 
     */
    public List<String> licenses() {
        return this.licenses;
    }

    /**
     * The mode in which this disk is attached to the source instance, either READ_WRITE or READ_ONLY.
     * 
     */
    @Import(name="mode", required=true)
    private String mode;

    /**
     * @return The mode in which this disk is attached to the source instance, either READ_WRITE or READ_ONLY.
     * 
     */
    public String mode() {
        return this.mode;
    }

    /**
     * Specifies a URL of the disk attached to the source instance.
     * 
     */
    @Import(name="source", required=true)
    private String source;

    /**
     * @return Specifies a URL of the disk attached to the source instance.
     * 
     */
    public String source() {
        return this.source;
    }

    /**
     * A size of the storage used by the disk&#39;s snapshot by this machine image.
     * 
     */
    @Import(name="storageBytes", required=true)
    private String storageBytes;

    /**
     * @return A size of the storage used by the disk&#39;s snapshot by this machine image.
     * 
     */
    public String storageBytes() {
        return this.storageBytes;
    }

    /**
     * An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
     * 
     */
    @Import(name="storageBytesStatus", required=true)
    private String storageBytesStatus;

    /**
     * @return An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
     * 
     */
    public String storageBytesStatus() {
        return this.storageBytesStatus;
    }

    /**
     * Specifies the type of the attached disk, either SCRATCH or PERSISTENT.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Specifies the type of the attached disk, either SCRATCH or PERSISTENT.
     * 
     */
    public String type() {
        return this.type;
    }

    private SavedAttachedDiskResponse() {}

    private SavedAttachedDiskResponse(SavedAttachedDiskResponse $) {
        this.autoDelete = $.autoDelete;
        this.boot = $.boot;
        this.deviceName = $.deviceName;
        this.diskEncryptionKey = $.diskEncryptionKey;
        this.diskSizeGb = $.diskSizeGb;
        this.diskType = $.diskType;
        this.guestOsFeatures = $.guestOsFeatures;
        this.index = $.index;
        this.interface_ = $.interface_;
        this.kind = $.kind;
        this.licenses = $.licenses;
        this.mode = $.mode;
        this.source = $.source;
        this.storageBytes = $.storageBytes;
        this.storageBytesStatus = $.storageBytesStatus;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SavedAttachedDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SavedAttachedDiskResponse $;

        public Builder() {
            $ = new SavedAttachedDiskResponse();
        }

        public Builder(SavedAttachedDiskResponse defaults) {
            $ = new SavedAttachedDiskResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoDelete Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
         * 
         * @return builder
         * 
         */
        public Builder autoDelete(Boolean autoDelete) {
            $.autoDelete = autoDelete;
            return this;
        }

        /**
         * @param boot Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
         * 
         * @return builder
         * 
         */
        public Builder boot(Boolean boot) {
            $.boot = boot;
            return this;
        }

        /**
         * @param deviceName Specifies the name of the disk attached to the source instance.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param diskEncryptionKey The encryption key for the disk.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionKey(CustomerEncryptionKeyResponse diskEncryptionKey) {
            $.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        /**
         * @param diskSizeGb The size of the disk in base-2 GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(String diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskType URL of the disk type resource. For example: projects/project /zones/zone/diskTypes/pd-standard or pd-ssd
         * 
         * @return builder
         * 
         */
        public Builder diskType(String diskType) {
            $.diskType = diskType;
            return this;
        }

        /**
         * @param guestOsFeatures A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
         * 
         * @return builder
         * 
         */
        public Builder guestOsFeatures(List<GuestOsFeatureResponse> guestOsFeatures) {
            $.guestOsFeatures = guestOsFeatures;
            return this;
        }

        /**
         * @param guestOsFeatures A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
         * 
         * @return builder
         * 
         */
        public Builder guestOsFeatures(GuestOsFeatureResponse... guestOsFeatures) {
            return guestOsFeatures(List.of(guestOsFeatures));
        }

        /**
         * @param index Specifies zero-based index of the disk that is attached to the source instance.
         * 
         * @return builder
         * 
         */
        public Builder index(Integer index) {
            $.index = index;
            return this;
        }

        /**
         * @param interface_ Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
         * 
         * @return builder
         * 
         */
        public Builder interface_(String interface_) {
            $.interface_ = interface_;
            return this;
        }

        /**
         * @param kind Type of the resource. Always compute#attachedDisk for attached disks.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param licenses Any valid publicly visible licenses.
         * 
         * @return builder
         * 
         */
        public Builder licenses(List<String> licenses) {
            $.licenses = licenses;
            return this;
        }

        /**
         * @param licenses Any valid publicly visible licenses.
         * 
         * @return builder
         * 
         */
        public Builder licenses(String... licenses) {
            return licenses(List.of(licenses));
        }

        /**
         * @param mode The mode in which this disk is attached to the source instance, either READ_WRITE or READ_ONLY.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param source Specifies a URL of the disk attached to the source instance.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            $.source = source;
            return this;
        }

        /**
         * @param storageBytes A size of the storage used by the disk&#39;s snapshot by this machine image.
         * 
         * @return builder
         * 
         */
        public Builder storageBytes(String storageBytes) {
            $.storageBytes = storageBytes;
            return this;
        }

        /**
         * @param storageBytesStatus An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
         * 
         * @return builder
         * 
         */
        public Builder storageBytesStatus(String storageBytesStatus) {
            $.storageBytesStatus = storageBytesStatus;
            return this;
        }

        /**
         * @param type Specifies the type of the attached disk, either SCRATCH or PERSISTENT.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public SavedAttachedDiskResponse build() {
            $.autoDelete = Objects.requireNonNull($.autoDelete, "expected parameter 'autoDelete' to be non-null");
            $.boot = Objects.requireNonNull($.boot, "expected parameter 'boot' to be non-null");
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.diskEncryptionKey = Objects.requireNonNull($.diskEncryptionKey, "expected parameter 'diskEncryptionKey' to be non-null");
            $.diskSizeGb = Objects.requireNonNull($.diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
            $.diskType = Objects.requireNonNull($.diskType, "expected parameter 'diskType' to be non-null");
            $.guestOsFeatures = Objects.requireNonNull($.guestOsFeatures, "expected parameter 'guestOsFeatures' to be non-null");
            $.index = Objects.requireNonNull($.index, "expected parameter 'index' to be non-null");
            $.interface_ = Objects.requireNonNull($.interface_, "expected parameter 'interface' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.licenses = Objects.requireNonNull($.licenses, "expected parameter 'licenses' to be non-null");
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            $.storageBytes = Objects.requireNonNull($.storageBytes, "expected parameter 'storageBytes' to be non-null");
            $.storageBytesStatus = Objects.requireNonNull($.storageBytesStatus, "expected parameter 'storageBytesStatus' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
