// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.CreationDataResponse;
import io.pulumi.azurenative.compute.outputs.DiskSecurityProfileResponse;
import io.pulumi.azurenative.compute.outputs.DiskSkuResponse;
import io.pulumi.azurenative.compute.outputs.EncryptionResponse;
import io.pulumi.azurenative.compute.outputs.EncryptionSettingsCollectionResponse;
import io.pulumi.azurenative.compute.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.compute.outputs.PropertyUpdatesInProgressResponse;
import io.pulumi.azurenative.compute.outputs.PurchasePlanResponse;
import io.pulumi.azurenative.compute.outputs.ShareInfoElementResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDiskResult {
    /**
     * Set to true to enable bursting beyond the provisioned performance target of the disk. Bursting is disabled by default. Does not apply to Ultra disks.
     * 
     */
    private final @Nullable Boolean burstingEnabled;
    /**
     * Disk source information. CreationData information cannot be changed after the disk has been created.
     * 
     */
    private final CreationDataResponse creationData;
    /**
     * ARM id of the DiskAccess resource for using private endpoints on disks.
     * 
     */
    private final @Nullable String diskAccessId;
    /**
     * The total number of IOPS that will be allowed across all VMs mounting the shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     * 
     */
    private final @Nullable Double diskIOPSReadOnly;
    /**
     * The number of IOPS allowed for this disk; only settable for UltraSSD disks. One operation can transfer between 4k and 256k bytes.
     * 
     */
    private final @Nullable Double diskIOPSReadWrite;
    /**
     * The total throughput (MBps) that will be allowed across all VMs mounting the shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     * 
     */
    private final @Nullable Double diskMBpsReadOnly;
    /**
     * The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     * 
     */
    private final @Nullable Double diskMBpsReadWrite;
    /**
     * The size of the disk in bytes. This field is read only.
     * 
     */
    private final Double diskSizeBytes;
    /**
     * If creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     * 
     */
    private final @Nullable Integer diskSizeGB;
    /**
     * The state of the disk.
     * 
     */
    private final String diskState;
    /**
     * Encryption property can be used to encrypt data at rest with customer managed keys or platform managed keys.
     * 
     */
    private final @Nullable EncryptionResponse encryption;
    /**
     * Encryption settings collection used for Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot.
     * 
     */
    private final @Nullable EncryptionSettingsCollectionResponse encryptionSettingsCollection;
    /**
     * The extended location where the disk will be created. Extended location cannot be changed.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     * 
     */
    private final @Nullable String hyperVGeneration;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * A relative URI containing the ID of the VM that has the disk attached.
     * 
     */
    private final String managedBy;
    /**
     * List of relative URIs containing the IDs of the VMs that have the disk attached. maxShares should be set to a value greater than one for disks to allow attaching them to multiple VMs.
     * 
     */
    private final List<String> managedByExtended;
    /**
     * The maximum number of VMs that can attach to the disk at the same time. Value greater than one indicates a disk that can be mounted on multiple VMs at the same time.
     * 
     */
    private final @Nullable Integer maxShares;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Policy for accessing the disk via network.
     * 
     */
    private final @Nullable String networkAccessPolicy;
    /**
     * The Operating System type.
     * 
     */
    private final @Nullable String osType;
    /**
     * Properties of the disk for which update is pending.
     * 
     */
    private final PropertyUpdatesInProgressResponse propertyUpdatesInProgress;
    /**
     * The disk provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * Purchase plan information for the the image from which the OS disk was created. E.g. - {name: 2019-Datacenter, publisher: MicrosoftWindowsServer, product: WindowsServer}
     * 
     */
    private final @Nullable PurchasePlanResponse purchasePlan;
    /**
     * Contains the security related information for the resource.
     * 
     */
    private final @Nullable DiskSecurityProfileResponse securityProfile;
    /**
     * Details of the list of all VMs that have the disk attached. maxShares should be set to a value greater than one for disks to allow attaching them to multiple VMs.
     * 
     */
    private final List<ShareInfoElementResponse> shareInfo;
    /**
     * The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, UltraSSD_LRS, Premium_ZRS, or StandardSSD_ZRS.
     * 
     */
    private final @Nullable DiskSkuResponse sku;
    /**
     * Indicates the OS on a disk supports hibernation.
     * 
     */
    private final @Nullable Boolean supportsHibernation;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Performance tier of the disk (e.g, P4, S10) as described here: https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     * 
     */
    private final @Nullable String tier;
    /**
     * The time when the disk was created.
     * 
     */
    private final String timeCreated;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * Unique Guid identifying the resource.
     * 
     */
    private final String uniqueId;
    /**
     * The Logical zone list for Disk.
     * 
     */
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor
    private GetDiskResult(
        @OutputCustomType.Parameter("burstingEnabled") @Nullable Boolean burstingEnabled,
        @OutputCustomType.Parameter("creationData") CreationDataResponse creationData,
        @OutputCustomType.Parameter("diskAccessId") @Nullable String diskAccessId,
        @OutputCustomType.Parameter("diskIOPSReadOnly") @Nullable Double diskIOPSReadOnly,
        @OutputCustomType.Parameter("diskIOPSReadWrite") @Nullable Double diskIOPSReadWrite,
        @OutputCustomType.Parameter("diskMBpsReadOnly") @Nullable Double diskMBpsReadOnly,
        @OutputCustomType.Parameter("diskMBpsReadWrite") @Nullable Double diskMBpsReadWrite,
        @OutputCustomType.Parameter("diskSizeBytes") Double diskSizeBytes,
        @OutputCustomType.Parameter("diskSizeGB") @Nullable Integer diskSizeGB,
        @OutputCustomType.Parameter("diskState") String diskState,
        @OutputCustomType.Parameter("encryption") @Nullable EncryptionResponse encryption,
        @OutputCustomType.Parameter("encryptionSettingsCollection") @Nullable EncryptionSettingsCollectionResponse encryptionSettingsCollection,
        @OutputCustomType.Parameter("extendedLocation") @Nullable ExtendedLocationResponse extendedLocation,
        @OutputCustomType.Parameter("hyperVGeneration") @Nullable String hyperVGeneration,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("managedBy") String managedBy,
        @OutputCustomType.Parameter("managedByExtended") List<String> managedByExtended,
        @OutputCustomType.Parameter("maxShares") @Nullable Integer maxShares,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("networkAccessPolicy") @Nullable String networkAccessPolicy,
        @OutputCustomType.Parameter("osType") @Nullable String osType,
        @OutputCustomType.Parameter("propertyUpdatesInProgress") PropertyUpdatesInProgressResponse propertyUpdatesInProgress,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("purchasePlan") @Nullable PurchasePlanResponse purchasePlan,
        @OutputCustomType.Parameter("securityProfile") @Nullable DiskSecurityProfileResponse securityProfile,
        @OutputCustomType.Parameter("shareInfo") List<ShareInfoElementResponse> shareInfo,
        @OutputCustomType.Parameter("sku") @Nullable DiskSkuResponse sku,
        @OutputCustomType.Parameter("supportsHibernation") @Nullable Boolean supportsHibernation,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("tier") @Nullable String tier,
        @OutputCustomType.Parameter("timeCreated") String timeCreated,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("uniqueId") String uniqueId,
        @OutputCustomType.Parameter("zones") @Nullable List<String> zones) {
        this.burstingEnabled = burstingEnabled;
        this.creationData = creationData;
        this.diskAccessId = diskAccessId;
        this.diskIOPSReadOnly = diskIOPSReadOnly;
        this.diskIOPSReadWrite = diskIOPSReadWrite;
        this.diskMBpsReadOnly = diskMBpsReadOnly;
        this.diskMBpsReadWrite = diskMBpsReadWrite;
        this.diskSizeBytes = diskSizeBytes;
        this.diskSizeGB = diskSizeGB;
        this.diskState = diskState;
        this.encryption = encryption;
        this.encryptionSettingsCollection = encryptionSettingsCollection;
        this.extendedLocation = extendedLocation;
        this.hyperVGeneration = hyperVGeneration;
        this.id = id;
        this.location = location;
        this.managedBy = managedBy;
        this.managedByExtended = managedByExtended;
        this.maxShares = maxShares;
        this.name = name;
        this.networkAccessPolicy = networkAccessPolicy;
        this.osType = osType;
        this.propertyUpdatesInProgress = propertyUpdatesInProgress;
        this.provisioningState = provisioningState;
        this.purchasePlan = purchasePlan;
        this.securityProfile = securityProfile;
        this.shareInfo = shareInfo;
        this.sku = sku;
        this.supportsHibernation = supportsHibernation;
        this.tags = tags;
        this.tier = tier;
        this.timeCreated = timeCreated;
        this.type = type;
        this.uniqueId = uniqueId;
        this.zones = zones;
    }

    /**
     * Set to true to enable bursting beyond the provisioned performance target of the disk. Bursting is disabled by default. Does not apply to Ultra disks.
     * 
    */
    public Optional<Boolean> getBurstingEnabled() {
        return Optional.ofNullable(this.burstingEnabled);
    }
    /**
     * Disk source information. CreationData information cannot be changed after the disk has been created.
     * 
    */
    public CreationDataResponse getCreationData() {
        return this.creationData;
    }
    /**
     * ARM id of the DiskAccess resource for using private endpoints on disks.
     * 
    */
    public Optional<String> getDiskAccessId() {
        return Optional.ofNullable(this.diskAccessId);
    }
    /**
     * The total number of IOPS that will be allowed across all VMs mounting the shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     * 
    */
    public Optional<Double> getDiskIOPSReadOnly() {
        return Optional.ofNullable(this.diskIOPSReadOnly);
    }
    /**
     * The number of IOPS allowed for this disk; only settable for UltraSSD disks. One operation can transfer between 4k and 256k bytes.
     * 
    */
    public Optional<Double> getDiskIOPSReadWrite() {
        return Optional.ofNullable(this.diskIOPSReadWrite);
    }
    /**
     * The total throughput (MBps) that will be allowed across all VMs mounting the shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     * 
    */
    public Optional<Double> getDiskMBpsReadOnly() {
        return Optional.ofNullable(this.diskMBpsReadOnly);
    }
    /**
     * The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     * 
    */
    public Optional<Double> getDiskMBpsReadWrite() {
        return Optional.ofNullable(this.diskMBpsReadWrite);
    }
    /**
     * The size of the disk in bytes. This field is read only.
     * 
    */
    public Double getDiskSizeBytes() {
        return this.diskSizeBytes;
    }
    /**
     * If creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     * 
    */
    public Optional<Integer> getDiskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }
    /**
     * The state of the disk.
     * 
    */
    public String getDiskState() {
        return this.diskState;
    }
    /**
     * Encryption property can be used to encrypt data at rest with customer managed keys or platform managed keys.
     * 
    */
    public Optional<EncryptionResponse> getEncryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * Encryption settings collection used for Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot.
     * 
    */
    public Optional<EncryptionSettingsCollectionResponse> getEncryptionSettingsCollection() {
        return Optional.ofNullable(this.encryptionSettingsCollection);
    }
    /**
     * The extended location where the disk will be created. Extended location cannot be changed.
     * 
    */
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     * 
    */
    public Optional<String> getHyperVGeneration() {
        return Optional.ofNullable(this.hyperVGeneration);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * A relative URI containing the ID of the VM that has the disk attached.
     * 
    */
    public String getManagedBy() {
        return this.managedBy;
    }
    /**
     * List of relative URIs containing the IDs of the VMs that have the disk attached. maxShares should be set to a value greater than one for disks to allow attaching them to multiple VMs.
     * 
    */
    public List<String> getManagedByExtended() {
        return this.managedByExtended;
    }
    /**
     * The maximum number of VMs that can attach to the disk at the same time. Value greater than one indicates a disk that can be mounted on multiple VMs at the same time.
     * 
    */
    public Optional<Integer> getMaxShares() {
        return Optional.ofNullable(this.maxShares);
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Policy for accessing the disk via network.
     * 
    */
    public Optional<String> getNetworkAccessPolicy() {
        return Optional.ofNullable(this.networkAccessPolicy);
    }
    /**
     * The Operating System type.
     * 
    */
    public Optional<String> getOsType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * Properties of the disk for which update is pending.
     * 
    */
    public PropertyUpdatesInProgressResponse getPropertyUpdatesInProgress() {
        return this.propertyUpdatesInProgress;
    }
    /**
     * The disk provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Purchase plan information for the the image from which the OS disk was created. E.g. - {name: 2019-Datacenter, publisher: MicrosoftWindowsServer, product: WindowsServer}
     * 
    */
    public Optional<PurchasePlanResponse> getPurchasePlan() {
        return Optional.ofNullable(this.purchasePlan);
    }
    /**
     * Contains the security related information for the resource.
     * 
    */
    public Optional<DiskSecurityProfileResponse> getSecurityProfile() {
        return Optional.ofNullable(this.securityProfile);
    }
    /**
     * Details of the list of all VMs that have the disk attached. maxShares should be set to a value greater than one for disks to allow attaching them to multiple VMs.
     * 
    */
    public List<ShareInfoElementResponse> getShareInfo() {
        return this.shareInfo;
    }
    /**
     * The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, UltraSSD_LRS, Premium_ZRS, or StandardSSD_ZRS.
     * 
    */
    public Optional<DiskSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Indicates the OS on a disk supports hibernation.
     * 
    */
    public Optional<Boolean> getSupportsHibernation() {
        return Optional.ofNullable(this.supportsHibernation);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Performance tier of the disk (e.g, P4, S10) as described here: https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     * 
    */
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }
    /**
     * The time when the disk was created.
     * 
    */
    public String getTimeCreated() {
        return this.timeCreated;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Unique Guid identifying the resource.
     * 
    */
    public String getUniqueId() {
        return this.uniqueId;
    }
    /**
     * The Logical zone list for Disk.
     * 
    */
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean burstingEnabled;
        private CreationDataResponse creationData;
        private @Nullable String diskAccessId;
        private @Nullable Double diskIOPSReadOnly;
        private @Nullable Double diskIOPSReadWrite;
        private @Nullable Double diskMBpsReadOnly;
        private @Nullable Double diskMBpsReadWrite;
        private Double diskSizeBytes;
        private @Nullable Integer diskSizeGB;
        private String diskState;
        private @Nullable EncryptionResponse encryption;
        private @Nullable EncryptionSettingsCollectionResponse encryptionSettingsCollection;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private @Nullable String hyperVGeneration;
        private String id;
        private String location;
        private String managedBy;
        private List<String> managedByExtended;
        private @Nullable Integer maxShares;
        private String name;
        private @Nullable String networkAccessPolicy;
        private @Nullable String osType;
        private PropertyUpdatesInProgressResponse propertyUpdatesInProgress;
        private String provisioningState;
        private @Nullable PurchasePlanResponse purchasePlan;
        private @Nullable DiskSecurityProfileResponse securityProfile;
        private List<ShareInfoElementResponse> shareInfo;
        private @Nullable DiskSkuResponse sku;
        private @Nullable Boolean supportsHibernation;
        private @Nullable Map<String,String> tags;
        private @Nullable String tier;
        private String timeCreated;
        private String type;
        private String uniqueId;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiskResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burstingEnabled = defaults.burstingEnabled;
    	      this.creationData = defaults.creationData;
    	      this.diskAccessId = defaults.diskAccessId;
    	      this.diskIOPSReadOnly = defaults.diskIOPSReadOnly;
    	      this.diskIOPSReadWrite = defaults.diskIOPSReadWrite;
    	      this.diskMBpsReadOnly = defaults.diskMBpsReadOnly;
    	      this.diskMBpsReadWrite = defaults.diskMBpsReadWrite;
    	      this.diskSizeBytes = defaults.diskSizeBytes;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.diskState = defaults.diskState;
    	      this.encryption = defaults.encryption;
    	      this.encryptionSettingsCollection = defaults.encryptionSettingsCollection;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.hyperVGeneration = defaults.hyperVGeneration;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.managedBy = defaults.managedBy;
    	      this.managedByExtended = defaults.managedByExtended;
    	      this.maxShares = defaults.maxShares;
    	      this.name = defaults.name;
    	      this.networkAccessPolicy = defaults.networkAccessPolicy;
    	      this.osType = defaults.osType;
    	      this.propertyUpdatesInProgress = defaults.propertyUpdatesInProgress;
    	      this.provisioningState = defaults.provisioningState;
    	      this.purchasePlan = defaults.purchasePlan;
    	      this.securityProfile = defaults.securityProfile;
    	      this.shareInfo = defaults.shareInfo;
    	      this.sku = defaults.sku;
    	      this.supportsHibernation = defaults.supportsHibernation;
    	      this.tags = defaults.tags;
    	      this.tier = defaults.tier;
    	      this.timeCreated = defaults.timeCreated;
    	      this.type = defaults.type;
    	      this.uniqueId = defaults.uniqueId;
    	      this.zones = defaults.zones;
        }

        public Builder burstingEnabled(@Nullable Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        public Builder creationData(CreationDataResponse creationData) {
            this.creationData = Objects.requireNonNull(creationData);
            return this;
        }

        public Builder diskAccessId(@Nullable String diskAccessId) {
            this.diskAccessId = diskAccessId;
            return this;
        }

        public Builder diskIOPSReadOnly(@Nullable Double diskIOPSReadOnly) {
            this.diskIOPSReadOnly = diskIOPSReadOnly;
            return this;
        }

        public Builder diskIOPSReadWrite(@Nullable Double diskIOPSReadWrite) {
            this.diskIOPSReadWrite = diskIOPSReadWrite;
            return this;
        }

        public Builder diskMBpsReadOnly(@Nullable Double diskMBpsReadOnly) {
            this.diskMBpsReadOnly = diskMBpsReadOnly;
            return this;
        }

        public Builder diskMBpsReadWrite(@Nullable Double diskMBpsReadWrite) {
            this.diskMBpsReadWrite = diskMBpsReadWrite;
            return this;
        }

        public Builder diskSizeBytes(Double diskSizeBytes) {
            this.diskSizeBytes = Objects.requireNonNull(diskSizeBytes);
            return this;
        }

        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder diskState(String diskState) {
            this.diskState = Objects.requireNonNull(diskState);
            return this;
        }

        public Builder encryption(@Nullable EncryptionResponse encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder encryptionSettingsCollection(@Nullable EncryptionSettingsCollectionResponse encryptionSettingsCollection) {
            this.encryptionSettingsCollection = encryptionSettingsCollection;
            return this;
        }

        public Builder extendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder hyperVGeneration(@Nullable String hyperVGeneration) {
            this.hyperVGeneration = hyperVGeneration;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder managedBy(String managedBy) {
            this.managedBy = Objects.requireNonNull(managedBy);
            return this;
        }

        public Builder managedByExtended(List<String> managedByExtended) {
            this.managedByExtended = Objects.requireNonNull(managedByExtended);
            return this;
        }

        public Builder maxShares(@Nullable Integer maxShares) {
            this.maxShares = maxShares;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder networkAccessPolicy(@Nullable String networkAccessPolicy) {
            this.networkAccessPolicy = networkAccessPolicy;
            return this;
        }

        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder propertyUpdatesInProgress(PropertyUpdatesInProgressResponse propertyUpdatesInProgress) {
            this.propertyUpdatesInProgress = Objects.requireNonNull(propertyUpdatesInProgress);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder purchasePlan(@Nullable PurchasePlanResponse purchasePlan) {
            this.purchasePlan = purchasePlan;
            return this;
        }

        public Builder securityProfile(@Nullable DiskSecurityProfileResponse securityProfile) {
            this.securityProfile = securityProfile;
            return this;
        }

        public Builder shareInfo(List<ShareInfoElementResponse> shareInfo) {
            this.shareInfo = Objects.requireNonNull(shareInfo);
            return this;
        }

        public Builder sku(@Nullable DiskSkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder supportsHibernation(@Nullable Boolean supportsHibernation) {
            this.supportsHibernation = supportsHibernation;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }

        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder uniqueId(String uniqueId) {
            this.uniqueId = Objects.requireNonNull(uniqueId);
            return this;
        }

        public Builder zones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public GetDiskResult build() {
            return new GetDiskResult(burstingEnabled, creationData, diskAccessId, diskIOPSReadOnly, diskIOPSReadWrite, diskMBpsReadOnly, diskMBpsReadWrite, diskSizeBytes, diskSizeGB, diskState, encryption, encryptionSettingsCollection, extendedLocation, hyperVGeneration, id, location, managedBy, managedByExtended, maxShares, name, networkAccessPolicy, osType, propertyUpdatesInProgress, provisioningState, purchasePlan, securityProfile, shareInfo, sku, supportsHibernation, tags, tier, timeCreated, type, uniqueId, zones);
        }
    }
}
