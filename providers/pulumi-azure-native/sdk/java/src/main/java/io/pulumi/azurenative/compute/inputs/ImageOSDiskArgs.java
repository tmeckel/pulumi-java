// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.CachingTypes;
import io.pulumi.azurenative.compute.enums.OperatingSystemStateTypes;
import io.pulumi.azurenative.compute.enums.OperatingSystemTypes;
import io.pulumi.azurenative.compute.enums.StorageAccountTypes;
import io.pulumi.azurenative.compute.inputs.DiskEncryptionSetParametersArgs;
import io.pulumi.azurenative.compute.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes an Operating System disk.
 * 
 */
public final class ImageOSDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageOSDiskArgs Empty = new ImageOSDiskArgs();

    /**
     * The Virtual Hard Disk.
     * 
     */
    @InputImport(name="blobUri")
      private final @Nullable Input<String> blobUri;

    public Input<String> getBlobUri() {
        return this.blobUri == null ? Input.empty() : this.blobUri;
    }

    /**
     * Specifies the caching requirements. <br><br> Possible values are: <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br> Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    @InputImport(name="caching")
      private final @Nullable Input<CachingTypes> caching;

    public Input<CachingTypes> getCaching() {
        return this.caching == null ? Input.empty() : this.caching;
    }

    /**
     * Specifies the customer managed disk encryption set resource id for the managed image disk.
     * 
     */
    @InputImport(name="diskEncryptionSet")
      private final @Nullable Input<DiskEncryptionSetParametersArgs> diskEncryptionSet;

    public Input<DiskEncryptionSetParametersArgs> getDiskEncryptionSet() {
        return this.diskEncryptionSet == null ? Input.empty() : this.diskEncryptionSet;
    }

    /**
     * Specifies the size of empty data disks in gigabytes. This element can be used to overwrite the name of the disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     * 
     */
    @InputImport(name="diskSizeGB")
      private final @Nullable Input<Integer> diskSizeGB;

    public Input<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Input.empty() : this.diskSizeGB;
    }

    /**
     * The managedDisk.
     * 
     */
    @InputImport(name="managedDisk")
      private final @Nullable Input<SubResourceArgs> managedDisk;

    public Input<SubResourceArgs> getManagedDisk() {
        return this.managedDisk == null ? Input.empty() : this.managedDisk;
    }

    /**
     * The OS State.
     * 
     */
    @InputImport(name="osState", required=true)
      private final Input<OperatingSystemStateTypes> osState;

    public Input<OperatingSystemStateTypes> getOsState() {
        return this.osState;
    }

    /**
     * This property allows you to specify the type of the OS that is included in the disk if creating a VM from a custom image. <br><br> Possible values are: <br><br> **Windows** <br><br> **Linux**
     * 
     */
    @InputImport(name="osType", required=true)
      private final Input<OperatingSystemTypes> osType;

    public Input<OperatingSystemTypes> getOsType() {
        return this.osType;
    }

    /**
     * The snapshot.
     * 
     */
    @InputImport(name="snapshot")
      private final @Nullable Input<SubResourceArgs> snapshot;

    public Input<SubResourceArgs> getSnapshot() {
        return this.snapshot == null ? Input.empty() : this.snapshot;
    }

    /**
     * Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    @InputImport(name="storageAccountType")
      private final @Nullable Input<Either<String,StorageAccountTypes>> storageAccountType;

    public Input<Either<String,StorageAccountTypes>> getStorageAccountType() {
        return this.storageAccountType == null ? Input.empty() : this.storageAccountType;
    }

    public ImageOSDiskArgs(
        @Nullable Input<String> blobUri,
        @Nullable Input<CachingTypes> caching,
        @Nullable Input<DiskEncryptionSetParametersArgs> diskEncryptionSet,
        @Nullable Input<Integer> diskSizeGB,
        @Nullable Input<SubResourceArgs> managedDisk,
        Input<OperatingSystemStateTypes> osState,
        Input<OperatingSystemTypes> osType,
        @Nullable Input<SubResourceArgs> snapshot,
        @Nullable Input<Either<String,StorageAccountTypes>> storageAccountType) {
        this.blobUri = blobUri;
        this.caching = caching;
        this.diskEncryptionSet = diskEncryptionSet;
        this.diskSizeGB = diskSizeGB;
        this.managedDisk = managedDisk;
        this.osState = Objects.requireNonNull(osState, "expected parameter 'osState' to be non-null");
        this.osType = Objects.requireNonNull(osType, "expected parameter 'osType' to be non-null");
        this.snapshot = snapshot;
        this.storageAccountType = storageAccountType;
    }

    private ImageOSDiskArgs() {
        this.blobUri = Input.empty();
        this.caching = Input.empty();
        this.diskEncryptionSet = Input.empty();
        this.diskSizeGB = Input.empty();
        this.managedDisk = Input.empty();
        this.osState = Input.empty();
        this.osType = Input.empty();
        this.snapshot = Input.empty();
        this.storageAccountType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageOSDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> blobUri;
        private @Nullable Input<CachingTypes> caching;
        private @Nullable Input<DiskEncryptionSetParametersArgs> diskEncryptionSet;
        private @Nullable Input<Integer> diskSizeGB;
        private @Nullable Input<SubResourceArgs> managedDisk;
        private Input<OperatingSystemStateTypes> osState;
        private Input<OperatingSystemTypes> osType;
        private @Nullable Input<SubResourceArgs> snapshot;
        private @Nullable Input<Either<String,StorageAccountTypes>> storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageOSDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobUri = defaults.blobUri;
    	      this.caching = defaults.caching;
    	      this.diskEncryptionSet = defaults.diskEncryptionSet;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.managedDisk = defaults.managedDisk;
    	      this.osState = defaults.osState;
    	      this.osType = defaults.osType;
    	      this.snapshot = defaults.snapshot;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder blobUri(@Nullable Input<String> blobUri) {
            this.blobUri = blobUri;
            return this;
        }

        public Builder blobUri(@Nullable String blobUri) {
            this.blobUri = Input.ofNullable(blobUri);
            return this;
        }

        public Builder caching(@Nullable Input<CachingTypes> caching) {
            this.caching = caching;
            return this;
        }

        public Builder caching(@Nullable CachingTypes caching) {
            this.caching = Input.ofNullable(caching);
            return this;
        }

        public Builder diskEncryptionSet(@Nullable Input<DiskEncryptionSetParametersArgs> diskEncryptionSet) {
            this.diskEncryptionSet = diskEncryptionSet;
            return this;
        }

        public Builder diskEncryptionSet(@Nullable DiskEncryptionSetParametersArgs diskEncryptionSet) {
            this.diskEncryptionSet = Input.ofNullable(diskEncryptionSet);
            return this;
        }

        public Builder diskSizeGB(@Nullable Input<Integer> diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = Input.ofNullable(diskSizeGB);
            return this;
        }

        public Builder managedDisk(@Nullable Input<SubResourceArgs> managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }

        public Builder managedDisk(@Nullable SubResourceArgs managedDisk) {
            this.managedDisk = Input.ofNullable(managedDisk);
            return this;
        }

        public Builder osState(Input<OperatingSystemStateTypes> osState) {
            this.osState = Objects.requireNonNull(osState);
            return this;
        }

        public Builder osState(OperatingSystemStateTypes osState) {
            this.osState = Input.of(Objects.requireNonNull(osState));
            return this;
        }

        public Builder osType(Input<OperatingSystemTypes> osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder osType(OperatingSystemTypes osType) {
            this.osType = Input.of(Objects.requireNonNull(osType));
            return this;
        }

        public Builder snapshot(@Nullable Input<SubResourceArgs> snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        public Builder snapshot(@Nullable SubResourceArgs snapshot) {
            this.snapshot = Input.ofNullable(snapshot);
            return this;
        }

        public Builder storageAccountType(@Nullable Input<Either<String,StorageAccountTypes>> storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }

        public Builder storageAccountType(@Nullable Either<String,StorageAccountTypes> storageAccountType) {
            this.storageAccountType = Input.ofNullable(storageAccountType);
            return this;
        }
        public ImageOSDiskArgs build() {
            return new ImageOSDiskArgs(blobUri, caching, diskEncryptionSet, diskSizeGB, managedDisk, osState, osType, snapshot, storageAccountType);
        }
    }
}
