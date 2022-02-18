// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.ImageArchitecture;
import io.pulumi.googlenative.compute_alpha.enums.ImageSourceType;
import io.pulumi.googlenative.compute_alpha.inputs.CustomerEncryptionKeyArgs;
import io.pulumi.googlenative.compute_alpha.inputs.DeprecationStatusArgs;
import io.pulumi.googlenative.compute_alpha.inputs.GuestOsFeatureArgs;
import io.pulumi.googlenative.compute_alpha.inputs.ImageRawDiskArgs;
import io.pulumi.googlenative.compute_alpha.inputs.InitialStateConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.RolloutPolicyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageArgs Empty = new ImageArgs();

    /**
     * The architecture of the image. Valid values are ARM64 or X86_64.
     * 
     */
    @InputImport(name="architecture")
    private final @Nullable Input<ImageArchitecture> architecture;

    public Input<ImageArchitecture> getArchitecture() {
        return this.architecture == null ? Input.empty() : this.architecture;
    }

    /**
     * Size of the image tar.gz archive stored in Google Cloud Storage (in bytes).
     * 
     */
    @InputImport(name="archiveSizeBytes")
    private final @Nullable Input<String> archiveSizeBytes;

    public Input<String> getArchiveSizeBytes() {
        return this.archiveSizeBytes == null ? Input.empty() : this.archiveSizeBytes;
    }

    /**
     * The deprecation status associated with this image.
     * 
     */
    @InputImport(name="deprecated")
    private final @Nullable Input<DeprecationStatusArgs> deprecated;

    public Input<DeprecationStatusArgs> getDeprecated() {
        return this.deprecated == null ? Input.empty() : this.deprecated;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Size of the image when restored onto a persistent disk (in GB).
     * 
     */
    @InputImport(name="diskSizeGb")
    private final @Nullable Input<String> diskSizeGb;

    public Input<String> getDiskSizeGb() {
        return this.diskSizeGb == null ? Input.empty() : this.diskSizeGb;
    }

    /**
     * The name of the image family to which this image belongs. You can create disks by specifying an image family instead of a specific image name. The image family always returns its latest image that is not deprecated. The name of the image family must comply with RFC1035.
     * 
     */
    @InputImport(name="family")
    private final @Nullable Input<String> family;

    public Input<String> getFamily() {
        return this.family == null ? Input.empty() : this.family;
    }

    @InputImport(name="forceCreate")
    private final @Nullable Input<String> forceCreate;

    public Input<String> getForceCreate() {
        return this.forceCreate == null ? Input.empty() : this.forceCreate;
    }

    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. To see a list of available options, see the guestOSfeatures[].type parameter.
     * 
     */
    @InputImport(name="guestOsFeatures")
    private final @Nullable Input<List<GuestOsFeatureArgs>> guestOsFeatures;

    public Input<List<GuestOsFeatureArgs>> getGuestOsFeatures() {
        return this.guestOsFeatures == null ? Input.empty() : this.guestOsFeatures;
    }

    /**
     * Encrypts the image using a customer-supplied encryption key. After you encrypt an image with a customer-supplied key, you must provide the same key if you use the image later (e.g. to create a disk from the image). Customer-supplied encryption keys do not protect access to metadata of the disk. If you do not provide an encryption key when creating the image, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the image later.
     * 
     */
    @InputImport(name="imageEncryptionKey")
    private final @Nullable Input<CustomerEncryptionKeyArgs> imageEncryptionKey;

    public Input<CustomerEncryptionKeyArgs> getImageEncryptionKey() {
        return this.imageEncryptionKey == null ? Input.empty() : this.imageEncryptionKey;
    }

    /**
     * Labels to apply to this image. These can be later modified by the setLabels method.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Integer license codes indicating which licenses are attached to this image.
     * 
     */
    @InputImport(name="licenseCodes")
    private final @Nullable Input<List<String>> licenseCodes;

    public Input<List<String>> getLicenseCodes() {
        return this.licenseCodes == null ? Input.empty() : this.licenseCodes;
    }

    /**
     * Any applicable license URI.
     * 
     */
    @InputImport(name="licenses")
    private final @Nullable Input<List<String>> licenses;

    public Input<List<String>> getLicenses() {
        return this.licenses == null ? Input.empty() : this.licenses;
    }

    /**
     * A flag for marketplace VM disk created from the image, which is designed for marketplace VM disk to prevent the proprietary data on the disk from being accessed unwantedly. The flag will be inherited by the disk created from the image. The disk with locked flag set to true will be prohibited from performing the operations below: - R/W or R/O disk attach - Disk detach, if disk is created via create-on-create - Create images - Create snapshots - Create disk clone (create disk from the current disk) The image with the locked field set to true will be prohibited from performing the operations below: - Create images from the current image - Update the locked field for the current image The instance with at least one disk with locked flag set to true will be prohibited from performing the operations below: - Secondary disk attach - Create instant snapshot - Create machine images - Create instance template - Delete the instance with --keep-disk parameter set to true
     * 
     */
    @InputImport(name="locked")
    private final @Nullable Input<Boolean> locked;

    public Input<Boolean> getLocked() {
        return this.locked == null ? Input.empty() : this.locked;
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The parameters of the raw disk image.
     * 
     */
    @InputImport(name="rawDisk")
    private final @Nullable Input<ImageRawDiskArgs> rawDisk;

    public Input<ImageRawDiskArgs> getRawDisk() {
        return this.rawDisk == null ? Input.empty() : this.rawDisk;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * A rollout policy to apply to this image. When specified, the rollout policy overrides per-zone references to the image via the associated image family. The rollout policy restricts the zones where this image is accessible when using a zonal image family reference. When the rollout policy does not include the user specified zone, or if the zone is rolled out, this image is accessible. The rollout policy for this image is read-only, except for allowlisted users. This field might not be configured. To view the latest non-deprecated image in a specific zone, use the imageFamilyViews.get method.
     * 
     */
    @InputImport(name="rolloutOverride")
    private final @Nullable Input<RolloutPolicyArgs> rolloutOverride;

    public Input<RolloutPolicyArgs> getRolloutOverride() {
        return this.rolloutOverride == null ? Input.empty() : this.rolloutOverride;
    }

    /**
     * Set the secure boot keys of shielded instance.
     * 
     */
    @InputImport(name="shieldedInstanceInitialState")
    private final @Nullable Input<InitialStateConfigArgs> shieldedInstanceInitialState;

    public Input<InitialStateConfigArgs> getShieldedInstanceInitialState() {
        return this.shieldedInstanceInitialState == null ? Input.empty() : this.shieldedInstanceInitialState;
    }

    /**
     * URL of the source disk used to create this image. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    @InputImport(name="sourceDisk")
    private final @Nullable Input<String> sourceDisk;

    public Input<String> getSourceDisk() {
        return this.sourceDisk == null ? Input.empty() : this.sourceDisk;
    }

    /**
     * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    @InputImport(name="sourceDiskEncryptionKey")
    private final @Nullable Input<CustomerEncryptionKeyArgs> sourceDiskEncryptionKey;

    public Input<CustomerEncryptionKeyArgs> getSourceDiskEncryptionKey() {
        return this.sourceDiskEncryptionKey == null ? Input.empty() : this.sourceDiskEncryptionKey;
    }

    /**
     * URL of the source image used to create this image. The following are valid formats for the URL: - https://www.googleapis.com/compute/v1/projects/project_id/global/ images/image_name - projects/project_id/global/images/image_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    @InputImport(name="sourceImage")
    private final @Nullable Input<String> sourceImage;

    public Input<String> getSourceImage() {
        return this.sourceImage == null ? Input.empty() : this.sourceImage;
    }

    /**
     * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
     * 
     */
    @InputImport(name="sourceImageEncryptionKey")
    private final @Nullable Input<CustomerEncryptionKeyArgs> sourceImageEncryptionKey;

    public Input<CustomerEncryptionKeyArgs> getSourceImageEncryptionKey() {
        return this.sourceImageEncryptionKey == null ? Input.empty() : this.sourceImageEncryptionKey;
    }

    /**
     * URL of the source snapshot used to create this image. The following are valid formats for the URL: - https://www.googleapis.com/compute/v1/projects/project_id/global/ snapshots/snapshot_name - projects/project_id/global/snapshots/snapshot_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    @InputImport(name="sourceSnapshot")
    private final @Nullable Input<String> sourceSnapshot;

    public Input<String> getSourceSnapshot() {
        return this.sourceSnapshot == null ? Input.empty() : this.sourceSnapshot;
    }

    /**
     * The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key.
     * 
     */
    @InputImport(name="sourceSnapshotEncryptionKey")
    private final @Nullable Input<CustomerEncryptionKeyArgs> sourceSnapshotEncryptionKey;

    public Input<CustomerEncryptionKeyArgs> getSourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey == null ? Input.empty() : this.sourceSnapshotEncryptionKey;
    }

    /**
     * The type of the image used to create this disk. The default and only value is RAW
     * 
     */
    @InputImport(name="sourceType")
    private final @Nullable Input<ImageSourceType> sourceType;

    public Input<ImageSourceType> getSourceType() {
        return this.sourceType == null ? Input.empty() : this.sourceType;
    }

    /**
     * Cloud Storage bucket storage location of the image (regional or multi-regional).
     * 
     */
    @InputImport(name="storageLocations")
    private final @Nullable Input<List<String>> storageLocations;

    public Input<List<String>> getStorageLocations() {
        return this.storageLocations == null ? Input.empty() : this.storageLocations;
    }

    /**
     * A list of publicly visible user-licenses. Unlike regular licenses, user provided licenses can be modified after the disk is created. This includes a list of URLs to the license resource. For example, to provide a debian license: https://www.googleapis.com/compute/v1/projects/debian-cloud/global/licenses/debian-9-stretch
     * 
     */
    @InputImport(name="userLicenses")
    private final @Nullable Input<List<String>> userLicenses;

    public Input<List<String>> getUserLicenses() {
        return this.userLicenses == null ? Input.empty() : this.userLicenses;
    }

    public ImageArgs(
        @Nullable Input<ImageArchitecture> architecture,
        @Nullable Input<String> archiveSizeBytes,
        @Nullable Input<DeprecationStatusArgs> deprecated,
        @Nullable Input<String> description,
        @Nullable Input<String> diskSizeGb,
        @Nullable Input<String> family,
        @Nullable Input<String> forceCreate,
        @Nullable Input<List<GuestOsFeatureArgs>> guestOsFeatures,
        @Nullable Input<CustomerEncryptionKeyArgs> imageEncryptionKey,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<List<String>> licenseCodes,
        @Nullable Input<List<String>> licenses,
        @Nullable Input<Boolean> locked,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<ImageRawDiskArgs> rawDisk,
        @Nullable Input<String> requestId,
        @Nullable Input<RolloutPolicyArgs> rolloutOverride,
        @Nullable Input<InitialStateConfigArgs> shieldedInstanceInitialState,
        @Nullable Input<String> sourceDisk,
        @Nullable Input<CustomerEncryptionKeyArgs> sourceDiskEncryptionKey,
        @Nullable Input<String> sourceImage,
        @Nullable Input<CustomerEncryptionKeyArgs> sourceImageEncryptionKey,
        @Nullable Input<String> sourceSnapshot,
        @Nullable Input<CustomerEncryptionKeyArgs> sourceSnapshotEncryptionKey,
        @Nullable Input<ImageSourceType> sourceType,
        @Nullable Input<List<String>> storageLocations,
        @Nullable Input<List<String>> userLicenses) {
        this.architecture = architecture;
        this.archiveSizeBytes = archiveSizeBytes;
        this.deprecated = deprecated;
        this.description = description;
        this.diskSizeGb = diskSizeGb;
        this.family = family;
        this.forceCreate = forceCreate;
        this.guestOsFeatures = guestOsFeatures;
        this.imageEncryptionKey = imageEncryptionKey;
        this.labels = labels;
        this.licenseCodes = licenseCodes;
        this.licenses = licenses;
        this.locked = locked;
        this.name = name;
        this.project = project;
        this.rawDisk = rawDisk;
        this.requestId = requestId;
        this.rolloutOverride = rolloutOverride;
        this.shieldedInstanceInitialState = shieldedInstanceInitialState;
        this.sourceDisk = sourceDisk;
        this.sourceDiskEncryptionKey = sourceDiskEncryptionKey;
        this.sourceImage = sourceImage;
        this.sourceImageEncryptionKey = sourceImageEncryptionKey;
        this.sourceSnapshot = sourceSnapshot;
        this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
        this.sourceType = sourceType;
        this.storageLocations = storageLocations;
        this.userLicenses = userLicenses;
    }

    private ImageArgs() {
        this.architecture = Input.empty();
        this.archiveSizeBytes = Input.empty();
        this.deprecated = Input.empty();
        this.description = Input.empty();
        this.diskSizeGb = Input.empty();
        this.family = Input.empty();
        this.forceCreate = Input.empty();
        this.guestOsFeatures = Input.empty();
        this.imageEncryptionKey = Input.empty();
        this.labels = Input.empty();
        this.licenseCodes = Input.empty();
        this.licenses = Input.empty();
        this.locked = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.rawDisk = Input.empty();
        this.requestId = Input.empty();
        this.rolloutOverride = Input.empty();
        this.shieldedInstanceInitialState = Input.empty();
        this.sourceDisk = Input.empty();
        this.sourceDiskEncryptionKey = Input.empty();
        this.sourceImage = Input.empty();
        this.sourceImageEncryptionKey = Input.empty();
        this.sourceSnapshot = Input.empty();
        this.sourceSnapshotEncryptionKey = Input.empty();
        this.sourceType = Input.empty();
        this.storageLocations = Input.empty();
        this.userLicenses = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ImageArchitecture> architecture;
        private @Nullable Input<String> archiveSizeBytes;
        private @Nullable Input<DeprecationStatusArgs> deprecated;
        private @Nullable Input<String> description;
        private @Nullable Input<String> diskSizeGb;
        private @Nullable Input<String> family;
        private @Nullable Input<String> forceCreate;
        private @Nullable Input<List<GuestOsFeatureArgs>> guestOsFeatures;
        private @Nullable Input<CustomerEncryptionKeyArgs> imageEncryptionKey;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<List<String>> licenseCodes;
        private @Nullable Input<List<String>> licenses;
        private @Nullable Input<Boolean> locked;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<ImageRawDiskArgs> rawDisk;
        private @Nullable Input<String> requestId;
        private @Nullable Input<RolloutPolicyArgs> rolloutOverride;
        private @Nullable Input<InitialStateConfigArgs> shieldedInstanceInitialState;
        private @Nullable Input<String> sourceDisk;
        private @Nullable Input<CustomerEncryptionKeyArgs> sourceDiskEncryptionKey;
        private @Nullable Input<String> sourceImage;
        private @Nullable Input<CustomerEncryptionKeyArgs> sourceImageEncryptionKey;
        private @Nullable Input<String> sourceSnapshot;
        private @Nullable Input<CustomerEncryptionKeyArgs> sourceSnapshotEncryptionKey;
        private @Nullable Input<ImageSourceType> sourceType;
        private @Nullable Input<List<String>> storageLocations;
        private @Nullable Input<List<String>> userLicenses;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.archiveSizeBytes = defaults.archiveSizeBytes;
    	      this.deprecated = defaults.deprecated;
    	      this.description = defaults.description;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.family = defaults.family;
    	      this.forceCreate = defaults.forceCreate;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.imageEncryptionKey = defaults.imageEncryptionKey;
    	      this.labels = defaults.labels;
    	      this.licenseCodes = defaults.licenseCodes;
    	      this.licenses = defaults.licenses;
    	      this.locked = defaults.locked;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.rawDisk = defaults.rawDisk;
    	      this.requestId = defaults.requestId;
    	      this.rolloutOverride = defaults.rolloutOverride;
    	      this.shieldedInstanceInitialState = defaults.shieldedInstanceInitialState;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.sourceDiskEncryptionKey = defaults.sourceDiskEncryptionKey;
    	      this.sourceImage = defaults.sourceImage;
    	      this.sourceImageEncryptionKey = defaults.sourceImageEncryptionKey;
    	      this.sourceSnapshot = defaults.sourceSnapshot;
    	      this.sourceSnapshotEncryptionKey = defaults.sourceSnapshotEncryptionKey;
    	      this.sourceType = defaults.sourceType;
    	      this.storageLocations = defaults.storageLocations;
    	      this.userLicenses = defaults.userLicenses;
        }

        public Builder setArchitecture(@Nullable Input<ImageArchitecture> architecture) {
            this.architecture = architecture;
            return this;
        }

        public Builder setArchitecture(@Nullable ImageArchitecture architecture) {
            this.architecture = Input.ofNullable(architecture);
            return this;
        }

        public Builder setArchiveSizeBytes(@Nullable Input<String> archiveSizeBytes) {
            this.archiveSizeBytes = archiveSizeBytes;
            return this;
        }

        public Builder setArchiveSizeBytes(@Nullable String archiveSizeBytes) {
            this.archiveSizeBytes = Input.ofNullable(archiveSizeBytes);
            return this;
        }

        public Builder setDeprecated(@Nullable Input<DeprecationStatusArgs> deprecated) {
            this.deprecated = deprecated;
            return this;
        }

        public Builder setDeprecated(@Nullable DeprecationStatusArgs deprecated) {
            this.deprecated = Input.ofNullable(deprecated);
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

        public Builder setDiskSizeGb(@Nullable Input<String> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder setDiskSizeGb(@Nullable String diskSizeGb) {
            this.diskSizeGb = Input.ofNullable(diskSizeGb);
            return this;
        }

        public Builder setFamily(@Nullable Input<String> family) {
            this.family = family;
            return this;
        }

        public Builder setFamily(@Nullable String family) {
            this.family = Input.ofNullable(family);
            return this;
        }

        public Builder setForceCreate(@Nullable Input<String> forceCreate) {
            this.forceCreate = forceCreate;
            return this;
        }

        public Builder setForceCreate(@Nullable String forceCreate) {
            this.forceCreate = Input.ofNullable(forceCreate);
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

        public Builder setImageEncryptionKey(@Nullable Input<CustomerEncryptionKeyArgs> imageEncryptionKey) {
            this.imageEncryptionKey = imageEncryptionKey;
            return this;
        }

        public Builder setImageEncryptionKey(@Nullable CustomerEncryptionKeyArgs imageEncryptionKey) {
            this.imageEncryptionKey = Input.ofNullable(imageEncryptionKey);
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

        public Builder setLocked(@Nullable Input<Boolean> locked) {
            this.locked = locked;
            return this;
        }

        public Builder setLocked(@Nullable Boolean locked) {
            this.locked = Input.ofNullable(locked);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRawDisk(@Nullable Input<ImageRawDiskArgs> rawDisk) {
            this.rawDisk = rawDisk;
            return this;
        }

        public Builder setRawDisk(@Nullable ImageRawDiskArgs rawDisk) {
            this.rawDisk = Input.ofNullable(rawDisk);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setRolloutOverride(@Nullable Input<RolloutPolicyArgs> rolloutOverride) {
            this.rolloutOverride = rolloutOverride;
            return this;
        }

        public Builder setRolloutOverride(@Nullable RolloutPolicyArgs rolloutOverride) {
            this.rolloutOverride = Input.ofNullable(rolloutOverride);
            return this;
        }

        public Builder setShieldedInstanceInitialState(@Nullable Input<InitialStateConfigArgs> shieldedInstanceInitialState) {
            this.shieldedInstanceInitialState = shieldedInstanceInitialState;
            return this;
        }

        public Builder setShieldedInstanceInitialState(@Nullable InitialStateConfigArgs shieldedInstanceInitialState) {
            this.shieldedInstanceInitialState = Input.ofNullable(shieldedInstanceInitialState);
            return this;
        }

        public Builder setSourceDisk(@Nullable Input<String> sourceDisk) {
            this.sourceDisk = sourceDisk;
            return this;
        }

        public Builder setSourceDisk(@Nullable String sourceDisk) {
            this.sourceDisk = Input.ofNullable(sourceDisk);
            return this;
        }

        public Builder setSourceDiskEncryptionKey(@Nullable Input<CustomerEncryptionKeyArgs> sourceDiskEncryptionKey) {
            this.sourceDiskEncryptionKey = sourceDiskEncryptionKey;
            return this;
        }

        public Builder setSourceDiskEncryptionKey(@Nullable CustomerEncryptionKeyArgs sourceDiskEncryptionKey) {
            this.sourceDiskEncryptionKey = Input.ofNullable(sourceDiskEncryptionKey);
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

        public Builder setSourceType(@Nullable Input<ImageSourceType> sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public Builder setSourceType(@Nullable ImageSourceType sourceType) {
            this.sourceType = Input.ofNullable(sourceType);
            return this;
        }

        public Builder setStorageLocations(@Nullable Input<List<String>> storageLocations) {
            this.storageLocations = storageLocations;
            return this;
        }

        public Builder setStorageLocations(@Nullable List<String> storageLocations) {
            this.storageLocations = Input.ofNullable(storageLocations);
            return this;
        }

        public Builder setUserLicenses(@Nullable Input<List<String>> userLicenses) {
            this.userLicenses = userLicenses;
            return this;
        }

        public Builder setUserLicenses(@Nullable List<String> userLicenses) {
            this.userLicenses = Input.ofNullable(userLicenses);
            return this;
        }

        public ImageArgs build() {
            return new ImageArgs(architecture, archiveSizeBytes, deprecated, description, diskSizeGb, family, forceCreate, guestOsFeatures, imageEncryptionKey, labels, licenseCodes, licenses, locked, name, project, rawDisk, requestId, rolloutOverride, shieldedInstanceInitialState, sourceDisk, sourceDiskEncryptionKey, sourceImage, sourceImageEncryptionKey, sourceSnapshot, sourceSnapshotEncryptionKey, sourceType, storageLocations, userLicenses);
        }
    }
}
