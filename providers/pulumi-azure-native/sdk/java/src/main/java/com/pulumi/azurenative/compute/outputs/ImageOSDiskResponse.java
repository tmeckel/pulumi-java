// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.DiskEncryptionSetParametersResponse;
import com.pulumi.azurenative.compute.outputs.SubResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImageOSDiskResponse {
    /**
     * @return The Virtual Hard Disk.
     * 
     */
    private final @Nullable String blobUri;
    /**
     * @return Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite** &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    private final @Nullable String caching;
    /**
     * @return Specifies the customer managed disk encryption set resource id for the managed image disk.
     * 
     */
    private final @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;
    /**
     * @return Specifies the size of empty data disks in gigabytes. This element can be used to overwrite the name of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB
     * 
     */
    private final @Nullable Integer diskSizeGB;
    /**
     * @return The managedDisk.
     * 
     */
    private final @Nullable SubResourceResponse managedDisk;
    /**
     * @return The OS State.
     * 
     */
    private final String osState;
    /**
     * @return This property allows you to specify the type of the OS that is included in the disk if creating a VM from a custom image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**
     * 
     */
    private final String osType;
    /**
     * @return The snapshot.
     * 
     */
    private final @Nullable SubResourceResponse snapshot;
    /**
     * @return Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    private final @Nullable String storageAccountType;

    @CustomType.Constructor
    private ImageOSDiskResponse(
        @CustomType.Parameter("blobUri") @Nullable String blobUri,
        @CustomType.Parameter("caching") @Nullable String caching,
        @CustomType.Parameter("diskEncryptionSet") @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet,
        @CustomType.Parameter("diskSizeGB") @Nullable Integer diskSizeGB,
        @CustomType.Parameter("managedDisk") @Nullable SubResourceResponse managedDisk,
        @CustomType.Parameter("osState") String osState,
        @CustomType.Parameter("osType") String osType,
        @CustomType.Parameter("snapshot") @Nullable SubResourceResponse snapshot,
        @CustomType.Parameter("storageAccountType") @Nullable String storageAccountType) {
        this.blobUri = blobUri;
        this.caching = caching;
        this.diskEncryptionSet = diskEncryptionSet;
        this.diskSizeGB = diskSizeGB;
        this.managedDisk = managedDisk;
        this.osState = osState;
        this.osType = osType;
        this.snapshot = snapshot;
        this.storageAccountType = storageAccountType;
    }

    /**
     * @return The Virtual Hard Disk.
     * 
     */
    public Optional<String> blobUri() {
        return Optional.ofNullable(this.blobUri);
    }
    /**
     * @return Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite** &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    public Optional<String> caching() {
        return Optional.ofNullable(this.caching);
    }
    /**
     * @return Specifies the customer managed disk encryption set resource id for the managed image disk.
     * 
     */
    public Optional<DiskEncryptionSetParametersResponse> diskEncryptionSet() {
        return Optional.ofNullable(this.diskEncryptionSet);
    }
    /**
     * @return Specifies the size of empty data disks in gigabytes. This element can be used to overwrite the name of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB
     * 
     */
    public Optional<Integer> diskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }
    /**
     * @return The managedDisk.
     * 
     */
    public Optional<SubResourceResponse> managedDisk() {
        return Optional.ofNullable(this.managedDisk);
    }
    /**
     * @return The OS State.
     * 
     */
    public String osState() {
        return this.osState;
    }
    /**
     * @return This property allows you to specify the type of the OS that is included in the disk if creating a VM from a custom image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**
     * 
     */
    public String osType() {
        return this.osType;
    }
    /**
     * @return The snapshot.
     * 
     */
    public Optional<SubResourceResponse> snapshot() {
        return Optional.ofNullable(this.snapshot);
    }
    /**
     * @return Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    public Optional<String> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageOSDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blobUri;
        private @Nullable String caching;
        private @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;
        private @Nullable Integer diskSizeGB;
        private @Nullable SubResourceResponse managedDisk;
        private String osState;
        private String osType;
        private @Nullable SubResourceResponse snapshot;
        private @Nullable String storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageOSDiskResponse defaults) {
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

        public Builder blobUri(@Nullable String blobUri) {
            this.blobUri = blobUri;
            return this;
        }
        public Builder caching(@Nullable String caching) {
            this.caching = caching;
            return this;
        }
        public Builder diskEncryptionSet(@Nullable DiskEncryptionSetParametersResponse diskEncryptionSet) {
            this.diskEncryptionSet = diskEncryptionSet;
            return this;
        }
        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }
        public Builder managedDisk(@Nullable SubResourceResponse managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }
        public Builder osState(String osState) {
            this.osState = Objects.requireNonNull(osState);
            return this;
        }
        public Builder osType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }
        public Builder snapshot(@Nullable SubResourceResponse snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public Builder storageAccountType(@Nullable String storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }        public ImageOSDiskResponse build() {
            return new ImageOSDiskResponse(blobUri, caching, diskEncryptionSet, diskSizeGB, managedDisk, osState, osType, snapshot, storageAccountType);
        }
    }
}
