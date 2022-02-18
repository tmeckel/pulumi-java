// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.AttachedDiskInitializeParamsArchitecture;
import io.pulumi.googlenative.compute_alpha.enums.AttachedDiskInitializeParamsOnUpdateAction;
import io.pulumi.googlenative.compute_alpha.inputs.CustomerEncryptionKeyArgs;
import io.pulumi.googlenative.compute_alpha.inputs.GuestOsFeatureArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
 * 
 */
public final class AttachedDiskInitializeParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttachedDiskInitializeParamsArgs Empty = new AttachedDiskInitializeParamsArgs();

    /**
     * The architecture of the attached disk. Valid values are arm64 or x86_64.
     * 
     */
    @InputImport(name="architecture")
    private final @Nullable Input<AttachedDiskInitializeParamsArchitecture> architecture;

    public Input<AttachedDiskInitializeParamsArchitecture> getArchitecture() {
        return this.architecture == null ? Input.empty() : this.architecture;
    }

    /**
     * An optional description. Provide this property when creating the disk.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Specifies the disk name. If not specified, the default is to use the name of the instance. If a disk with the same name already exists in the given region, the existing disk is attached to the new instance and the new disk is not created.
     * 
     */
    @InputImport(name="diskName")
    private final @Nullable Input<String> diskName;

    public Input<String> getDiskName() {
        return this.diskName == null ? Input.empty() : this.diskName;
    }

    /**
     * Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify a sourceImage, which is required for boot disks, the default size is the size of the sourceImage. If you do not specify a sourceImage, the default disk size is 500 GB.
     * 
     */
    @InputImport(name="diskSizeGb")
    private final @Nullable Input<String> diskSizeGb;

    public Input<String> getDiskSizeGb() {
        return this.diskSizeGb == null ? Input.empty() : this.diskSizeGb;
    }

    /**
     * Specifies the disk type to use to create the instance. If not specified, the default is pd-standard, specified using the full URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/pd-standard For a full list of acceptable values, see Persistent disk types. If you define this field, you can provide either the full or partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/diskType - projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for InstanceTemplate, this is the name of the disk type, not URL.
     * 
     */
    @InputImport(name="diskType")
    private final @Nullable Input<String> diskType;

    public Input<String> getDiskType() {
        return this.diskType == null ? Input.empty() : this.diskType;
    }

    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options. Guest OS features are applied by merging initializeParams.guestOsFeatures and disks.guestOsFeatures
     * 
     */
    @InputImport(name="guestOsFeatures")
    private final @Nullable Input<List<GuestOsFeatureArgs>> guestOsFeatures;

    public Input<List<GuestOsFeatureArgs>> getGuestOsFeatures() {
        return this.guestOsFeatures == null ? Input.empty() : this.guestOsFeatures;
    }

    /**
     * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Integer license codes indicating which licenses are attached to this disk.
     * 
     */
    @InputImport(name="licenseCodes")
    private final @Nullable Input<List<String>> licenseCodes;

    public Input<List<String>> getLicenseCodes() {
        return this.licenseCodes == null ? Input.empty() : this.licenseCodes;
    }

    /**
     * A list of publicly visible licenses. Reserved for Google's use.
     * 
     */
    @InputImport(name="licenses")
    private final @Nullable Input<List<String>> licenses;

    public Input<List<String>> getLicenses() {
        return this.licenses == null ? Input.empty() : this.licenses;
    }

    /**
     * Indicates whether or not the disk can be read/write attached to more than one instance.
     * 
     */
    @InputImport(name="multiWriter")
    private final @Nullable Input<Boolean> multiWriter;

    public Input<Boolean> getMultiWriter() {
        return this.multiWriter == null ? Input.empty() : this.multiWriter;
    }

    /**
     * Specifies which action to take on instance update with this disk. Default is to use the existing disk.
     * 
     */
    @InputImport(name="onUpdateAction")
    private final @Nullable Input<AttachedDiskInitializeParamsOnUpdateAction> onUpdateAction;

    public Input<AttachedDiskInitializeParamsOnUpdateAction> getOnUpdateAction() {
        return this.onUpdateAction == null ? Input.empty() : this.onUpdateAction;
    }

    /**
     * Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
     * 
     */
    @InputImport(name="provisionedIops")
    private final @Nullable Input<String> provisionedIops;

    public Input<String> getProvisionedIops() {
        return this.provisionedIops == null ? Input.empty() : this.provisionedIops;
    }

    /**
     * URLs of the zones where the disk should be replicated to. Only applicable for regional resources.
     * 
     */
    @InputImport(name="replicaZones")
    private final @Nullable Input<List<String>> replicaZones;

    public Input<List<String>> getReplicaZones() {
        return this.replicaZones == null ? Input.empty() : this.replicaZones;
    }

    /**
     * Resource policies applied to this disk for automatic snapshot creations. Specified using the full or partial URL. For instance template, specify only the resource policy name.
     * 
     */
    @InputImport(name="resourcePolicies")
    private final @Nullable Input<List<String>> resourcePolicies;

    public Input<List<String>> getResourcePolicies() {
        return this.resourcePolicies == null ? Input.empty() : this.resourcePolicies;
    }

    /**
     * The source image to create this disk. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific version of a public operating system image: projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image name in the following format: global/images/my-custom-image You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name: global/images/family/my-image-family If the source image is deleted later, this field will not be set.
     * 
     */
    @InputImport(name="sourceImage")
    private final @Nullable Input<String> sourceImage;

    public Input<String> getSourceImage() {
        return this.sourceImage == null ? Input.empty() : this.sourceImage;
    }

    /**
     * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key. Instance templates do not store customer-supplied encryption keys, so you cannot create disks for instances in a managed instance group if the source images are encrypted with your own keys.
     * 
     */
    @InputImport(name="sourceImageEncryptionKey")
    private final @Nullable Input<CustomerEncryptionKeyArgs> sourceImageEncryptionKey;

    public Input<CustomerEncryptionKeyArgs> getSourceImageEncryptionKey() {
        return this.sourceImageEncryptionKey == null ? Input.empty() : this.sourceImageEncryptionKey;
    }

    /**
     * The source instant-snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceInstantSnapshot initializeParams.sourceImage or disks.source is required except for local SSD. To create a disk with a snapshot that you created, specify the snapshot name in the following format: us-central1-a/instantSnapshots/my-backup If the source instant-snapshot is deleted later, this field will not be set.
     * 
     */
    @InputImport(name="sourceInstantSnapshot")
    private final @Nullable Input<String> sourceInstantSnapshot;

    public Input<String> getSourceInstantSnapshot() {
        return this.sourceInstantSnapshot == null ? Input.empty() : this.sourceInstantSnapshot;
    }

    /**
     * The source snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required except for local SSD. To create a disk with a snapshot that you created, specify the snapshot name in the following format: global/snapshots/my-backup If the source snapshot is deleted later, this field will not be set.
     * 
     */
    @InputImport(name="sourceSnapshot")
    private final @Nullable Input<String> sourceSnapshot;

    public Input<String> getSourceSnapshot() {
        return this.sourceSnapshot == null ? Input.empty() : this.sourceSnapshot;
    }

    /**
     * The customer-supplied encryption key of the source snapshot.
     * 
     */
    @InputImport(name="sourceSnapshotEncryptionKey")
    private final @Nullable Input<CustomerEncryptionKeyArgs> sourceSnapshotEncryptionKey;

    public Input<CustomerEncryptionKeyArgs> getSourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey == null ? Input.empty() : this.sourceSnapshotEncryptionKey;
    }

    public AttachedDiskInitializeParamsArgs(
        @Nullable Input<AttachedDiskInitializeParamsArchitecture> architecture,
        @Nullable Input<String> description,
        @Nullable Input<String> diskName,
        @Nullable Input<String> diskSizeGb,
        @Nullable Input<String> diskType,
        @Nullable Input<List<GuestOsFeatureArgs>> guestOsFeatures,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<List<String>> licenseCodes,
        @Nullable Input<List<String>> licenses,
        @Nullable Input<Boolean> multiWriter,
        @Nullable Input<AttachedDiskInitializeParamsOnUpdateAction> onUpdateAction,
        @Nullable Input<String> provisionedIops,
        @Nullable Input<List<String>> replicaZones,
        @Nullable Input<List<String>> resourcePolicies,
        @Nullable Input<String> sourceImage,
        @Nullable Input<CustomerEncryptionKeyArgs> sourceImageEncryptionKey,
        @Nullable Input<String> sourceInstantSnapshot,
        @Nullable Input<String> sourceSnapshot,
        @Nullable Input<CustomerEncryptionKeyArgs> sourceSnapshotEncryptionKey) {
        this.architecture = architecture;
        this.description = description;
        this.diskName = diskName;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
        this.guestOsFeatures = guestOsFeatures;
        this.labels = labels;
        this.licenseCodes = licenseCodes;
        this.licenses = licenses;
        this.multiWriter = multiWriter;
        this.onUpdateAction = onUpdateAction;
        this.provisionedIops = provisionedIops;
        this.replicaZones = replicaZones;
        this.resourcePolicies = resourcePolicies;
        this.sourceImage = sourceImage;
        this.sourceImageEncryptionKey = sourceImageEncryptionKey;
        this.sourceInstantSnapshot = sourceInstantSnapshot;
        this.sourceSnapshot = sourceSnapshot;
        this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
    }

    private AttachedDiskInitializeParamsArgs() {
        this.architecture = Input.empty();
        this.description = Input.empty();
        this.diskName = Input.empty();
        this.diskSizeGb = Input.empty();
        this.diskType = Input.empty();
        this.guestOsFeatures = Input.empty();
        this.labels = Input.empty();
        this.licenseCodes = Input.empty();
        this.licenses = Input.empty();
        this.multiWriter = Input.empty();
        this.onUpdateAction = Input.empty();
        this.provisionedIops = Input.empty();
        this.replicaZones = Input.empty();
        this.resourcePolicies = Input.empty();
        this.sourceImage = Input.empty();
        this.sourceImageEncryptionKey = Input.empty();
        this.sourceInstantSnapshot = Input.empty();
        this.sourceSnapshot = Input.empty();
        this.sourceSnapshotEncryptionKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedDiskInitializeParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AttachedDiskInitializeParamsArchitecture> architecture;
        private @Nullable Input<String> description;
        private @Nullable Input<String> diskName;
        private @Nullable Input<String> diskSizeGb;
        private @Nullable Input<String> diskType;
        private @Nullable Input<List<GuestOsFeatureArgs>> guestOsFeatures;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<List<String>> licenseCodes;
        private @Nullable Input<List<String>> licenses;
        private @Nullable Input<Boolean> multiWriter;
        private @Nullable Input<AttachedDiskInitializeParamsOnUpdateAction> onUpdateAction;
        private @Nullable Input<String> provisionedIops;
        private @Nullable Input<List<String>> replicaZones;
        private @Nullable Input<List<String>> resourcePolicies;
        private @Nullable Input<String> sourceImage;
        private @Nullable Input<CustomerEncryptionKeyArgs> sourceImageEncryptionKey;
        private @Nullable Input<String> sourceInstantSnapshot;
        private @Nullable Input<String> sourceSnapshot;
        private @Nullable Input<CustomerEncryptionKeyArgs> sourceSnapshotEncryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachedDiskInitializeParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.description = defaults.description;
    	      this.diskName = defaults.diskName;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.labels = defaults.labels;
    	      this.licenseCodes = defaults.licenseCodes;
    	      this.licenses = defaults.licenses;
    	      this.multiWriter = defaults.multiWriter;
    	      this.onUpdateAction = defaults.onUpdateAction;
    	      this.provisionedIops = defaults.provisionedIops;
    	      this.replicaZones = defaults.replicaZones;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.sourceImage = defaults.sourceImage;
    	      this.sourceImageEncryptionKey = defaults.sourceImageEncryptionKey;
    	      this.sourceInstantSnapshot = defaults.sourceInstantSnapshot;
    	      this.sourceSnapshot = defaults.sourceSnapshot;
    	      this.sourceSnapshotEncryptionKey = defaults.sourceSnapshotEncryptionKey;
        }

        public Builder setArchitecture(@Nullable Input<AttachedDiskInitializeParamsArchitecture> architecture) {
            this.architecture = architecture;
            return this;
        }

        public Builder setArchitecture(@Nullable AttachedDiskInitializeParamsArchitecture architecture) {
            this.architecture = Input.ofNullable(architecture);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDiskName(@Nullable Input<String> diskName) {
            this.diskName = diskName;
            return this;
        }

        public Builder setDiskName(@Nullable String diskName) {
            this.diskName = Input.ofNullable(diskName);
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

        public Builder setDiskType(@Nullable Input<String> diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder setDiskType(@Nullable String diskType) {
            this.diskType = Input.ofNullable(diskType);
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

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLicenseCodes(@Nullable Input<List<String>> licenseCodes) {
            this.licenseCodes = licenseCodes;
            return this;
        }

        public Builder setLicenseCodes(@Nullable List<String> licenseCodes) {
            this.licenseCodes = Input.ofNullable(licenseCodes);
            return this;
        }

        public Builder setLicenses(@Nullable Input<List<String>> licenses) {
            this.licenses = licenses;
            return this;
        }

        public Builder setLicenses(@Nullable List<String> licenses) {
            this.licenses = Input.ofNullable(licenses);
            return this;
        }

        public Builder setMultiWriter(@Nullable Input<Boolean> multiWriter) {
            this.multiWriter = multiWriter;
            return this;
        }

        public Builder setMultiWriter(@Nullable Boolean multiWriter) {
            this.multiWriter = Input.ofNullable(multiWriter);
            return this;
        }

        public Builder setOnUpdateAction(@Nullable Input<AttachedDiskInitializeParamsOnUpdateAction> onUpdateAction) {
            this.onUpdateAction = onUpdateAction;
            return this;
        }

        public Builder setOnUpdateAction(@Nullable AttachedDiskInitializeParamsOnUpdateAction onUpdateAction) {
            this.onUpdateAction = Input.ofNullable(onUpdateAction);
            return this;
        }

        public Builder setProvisionedIops(@Nullable Input<String> provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }

        public Builder setProvisionedIops(@Nullable String provisionedIops) {
            this.provisionedIops = Input.ofNullable(provisionedIops);
            return this;
        }

        public Builder setReplicaZones(@Nullable Input<List<String>> replicaZones) {
            this.replicaZones = replicaZones;
            return this;
        }

        public Builder setReplicaZones(@Nullable List<String> replicaZones) {
            this.replicaZones = Input.ofNullable(replicaZones);
            return this;
        }

        public Builder setResourcePolicies(@Nullable Input<List<String>> resourcePolicies) {
            this.resourcePolicies = resourcePolicies;
            return this;
        }

        public Builder setResourcePolicies(@Nullable List<String> resourcePolicies) {
            this.resourcePolicies = Input.ofNullable(resourcePolicies);
            return this;
        }

        public Builder setSourceImage(@Nullable Input<String> sourceImage) {
            this.sourceImage = sourceImage;
            return this;
        }

        public Builder setSourceImage(@Nullable String sourceImage) {
            this.sourceImage = Input.ofNullable(sourceImage);
            return this;
        }

        public Builder setSourceImageEncryptionKey(@Nullable Input<CustomerEncryptionKeyArgs> sourceImageEncryptionKey) {
            this.sourceImageEncryptionKey = sourceImageEncryptionKey;
            return this;
        }

        public Builder setSourceImageEncryptionKey(@Nullable CustomerEncryptionKeyArgs sourceImageEncryptionKey) {
            this.sourceImageEncryptionKey = Input.ofNullable(sourceImageEncryptionKey);
            return this;
        }

        public Builder setSourceInstantSnapshot(@Nullable Input<String> sourceInstantSnapshot) {
            this.sourceInstantSnapshot = sourceInstantSnapshot;
            return this;
        }

        public Builder setSourceInstantSnapshot(@Nullable String sourceInstantSnapshot) {
            this.sourceInstantSnapshot = Input.ofNullable(sourceInstantSnapshot);
            return this;
        }

        public Builder setSourceSnapshot(@Nullable Input<String> sourceSnapshot) {
            this.sourceSnapshot = sourceSnapshot;
            return this;
        }

        public Builder setSourceSnapshot(@Nullable String sourceSnapshot) {
            this.sourceSnapshot = Input.ofNullable(sourceSnapshot);
            return this;
        }

        public Builder setSourceSnapshotEncryptionKey(@Nullable Input<CustomerEncryptionKeyArgs> sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
            return this;
        }

        public Builder setSourceSnapshotEncryptionKey(@Nullable CustomerEncryptionKeyArgs sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = Input.ofNullable(sourceSnapshotEncryptionKey);
            return this;
        }

        public AttachedDiskInitializeParamsArgs build() {
            return new AttachedDiskInitializeParamsArgs(architecture, description, diskName, diskSizeGb, diskType, guestOsFeatures, labels, licenseCodes, licenses, multiWriter, onUpdateAction, provisionedIops, replicaZones, resourcePolicies, sourceImage, sourceImageEncryptionKey, sourceInstantSnapshot, sourceSnapshot, sourceSnapshotEncryptionKey);
        }
    }
}
