// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.ApiEntityReferenceResponse;
import io.pulumi.azurenative.compute.inputs.ManagedDiskParametersResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a data disk.
 * 
 */
public final class RestorePointSourceVMDataDiskResponse extends io.pulumi.resources.InvokeArgs {

    public static final RestorePointSourceVMDataDiskResponse Empty = new RestorePointSourceVMDataDiskResponse();

    /**
     * Gets the caching type.
     * 
     */
    @InputImport(name="caching")
      private final @Nullable String caching;

    public Optional<String> getCaching() {
        return this.caching == null ? Optional.empty() : Optional.ofNullable(this.caching);
    }

    /**
     * Gets the disk restore point Id.
     * 
     */
    @InputImport(name="diskRestorePoint")
      private final @Nullable ApiEntityReferenceResponse diskRestorePoint;

    public Optional<ApiEntityReferenceResponse> getDiskRestorePoint() {
        return this.diskRestorePoint == null ? Optional.empty() : Optional.ofNullable(this.diskRestorePoint);
    }

    /**
     * Gets the initial disk size in GB for blank data disks, and the new desired size for existing OS and Data disks.
     * 
     */
    @InputImport(name="diskSizeGB")
      private final @Nullable Integer diskSizeGB;

    public Optional<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Optional.empty() : Optional.ofNullable(this.diskSizeGB);
    }

    /**
     * Gets the logical unit number.
     * 
     */
    @InputImport(name="lun")
      private final @Nullable Integer lun;

    public Optional<Integer> getLun() {
        return this.lun == null ? Optional.empty() : Optional.ofNullable(this.lun);
    }

    /**
     * Gets the managed disk details
     * 
     */
    @InputImport(name="managedDisk")
      private final @Nullable ManagedDiskParametersResponse managedDisk;

    public Optional<ManagedDiskParametersResponse> getManagedDisk() {
        return this.managedDisk == null ? Optional.empty() : Optional.ofNullable(this.managedDisk);
    }

    /**
     * Gets the disk name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public RestorePointSourceVMDataDiskResponse(
        @Nullable String caching,
        @Nullable ApiEntityReferenceResponse diskRestorePoint,
        @Nullable Integer diskSizeGB,
        @Nullable Integer lun,
        @Nullable ManagedDiskParametersResponse managedDisk,
        @Nullable String name) {
        this.caching = caching;
        this.diskRestorePoint = diskRestorePoint;
        this.diskSizeGB = diskSizeGB;
        this.lun = lun;
        this.managedDisk = managedDisk;
        this.name = name;
    }

    private RestorePointSourceVMDataDiskResponse() {
        this.caching = null;
        this.diskRestorePoint = null;
        this.diskSizeGB = null;
        this.lun = null;
        this.managedDisk = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePointSourceVMDataDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caching;
        private @Nullable ApiEntityReferenceResponse diskRestorePoint;
        private @Nullable Integer diskSizeGB;
        private @Nullable Integer lun;
        private @Nullable ManagedDiskParametersResponse managedDisk;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePointSourceVMDataDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.diskRestorePoint = defaults.diskRestorePoint;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.lun = defaults.lun;
    	      this.managedDisk = defaults.managedDisk;
    	      this.name = defaults.name;
        }

        public Builder caching(@Nullable String caching) {
            this.caching = caching;
            return this;
        }

        public Builder diskRestorePoint(@Nullable ApiEntityReferenceResponse diskRestorePoint) {
            this.diskRestorePoint = diskRestorePoint;
            return this;
        }

        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder lun(@Nullable Integer lun) {
            this.lun = lun;
            return this;
        }

        public Builder managedDisk(@Nullable ManagedDiskParametersResponse managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public RestorePointSourceVMDataDiskResponse build() {
            return new RestorePointSourceVMDataDiskResponse(caching, diskRestorePoint, diskSizeGB, lun, managedDisk, name);
        }
    }
}
