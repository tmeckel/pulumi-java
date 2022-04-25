// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings which will be used by the data disks associated to Compute Nodes in the Pool. When using attached data disks, you need to mount and format the disks from within a VM to use them.
 * 
 */
public final class DataDiskResponse extends com.pulumi.resources.InvokeArgs {

    public static final DataDiskResponse Empty = new DataDiskResponse();

    /**
     * Values are:
     * 
     *  none - The caching mode for the disk is not enabled.
     *  readOnly - The caching mode for the disk is read only.
     *  readWrite - The caching mode for the disk is read and write.
     * 
     *  The default value for caching is none. For information about the caching options see: https://blogs.msdn.microsoft.com/windowsazurestorage/2012/06/27/exploring-windows-azure-drives-disks-and-images/.
     * 
     */
    @Import(name="caching")
    private @Nullable String caching;

    /**
     * @return Values are:
     * 
     *  none - The caching mode for the disk is not enabled.
     *  readOnly - The caching mode for the disk is read only.
     *  readWrite - The caching mode for the disk is read and write.
     * 
     *  The default value for caching is none. For information about the caching options see: https://blogs.msdn.microsoft.com/windowsazurestorage/2012/06/27/exploring-windows-azure-drives-disks-and-images/.
     * 
     */
    public Optional<String> caching() {
        return Optional.ofNullable(this.caching);
    }

    @Import(name="diskSizeGB", required=true)
    private Integer diskSizeGB;

    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * The lun is used to uniquely identify each data disk. If attaching multiple disks, each should have a distinct lun. The value must be between 0 and 63, inclusive.
     * 
     */
    @Import(name="lun", required=true)
    private Integer lun;

    /**
     * @return The lun is used to uniquely identify each data disk. If attaching multiple disks, each should have a distinct lun. The value must be between 0 and 63, inclusive.
     * 
     */
    public Integer lun() {
        return this.lun;
    }

    /**
     * If omitted, the default is &#34;Standard_LRS&#34;. Values are:
     * 
     *  Standard_LRS - The data disk should use standard locally redundant storage.
     *  Premium_LRS - The data disk should use premium locally redundant storage.
     * 
     */
    @Import(name="storageAccountType")
    private @Nullable String storageAccountType;

    /**
     * @return If omitted, the default is &#34;Standard_LRS&#34;. Values are:
     * 
     *  Standard_LRS - The data disk should use standard locally redundant storage.
     *  Premium_LRS - The data disk should use premium locally redundant storage.
     * 
     */
    public Optional<String> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    private DataDiskResponse() {}

    private DataDiskResponse(DataDiskResponse $) {
        this.caching = $.caching;
        this.diskSizeGB = $.diskSizeGB;
        this.lun = $.lun;
        this.storageAccountType = $.storageAccountType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataDiskResponse $;

        public Builder() {
            $ = new DataDiskResponse();
        }

        public Builder(DataDiskResponse defaults) {
            $ = new DataDiskResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param caching Values are:
         * 
         *  none - The caching mode for the disk is not enabled.
         *  readOnly - The caching mode for the disk is read only.
         *  readWrite - The caching mode for the disk is read and write.
         * 
         *  The default value for caching is none. For information about the caching options see: https://blogs.msdn.microsoft.com/windowsazurestorage/2012/06/27/exploring-windows-azure-drives-disks-and-images/.
         * 
         * @return builder
         * 
         */
        public Builder caching(@Nullable String caching) {
            $.caching = caching;
            return this;
        }

        public Builder diskSizeGB(Integer diskSizeGB) {
            $.diskSizeGB = diskSizeGB;
            return this;
        }

        /**
         * @param lun The lun is used to uniquely identify each data disk. If attaching multiple disks, each should have a distinct lun. The value must be between 0 and 63, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder lun(Integer lun) {
            $.lun = lun;
            return this;
        }

        /**
         * @param storageAccountType If omitted, the default is &#34;Standard_LRS&#34;. Values are:
         * 
         *  Standard_LRS - The data disk should use standard locally redundant storage.
         *  Premium_LRS - The data disk should use premium locally redundant storage.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountType(@Nullable String storageAccountType) {
            $.storageAccountType = storageAccountType;
            return this;
        }

        public DataDiskResponse build() {
            $.diskSizeGB = Objects.requireNonNull($.diskSizeGB, "expected parameter 'diskSizeGB' to be non-null");
            $.lun = Objects.requireNonNull($.lun, "expected parameter 'lun' to be non-null");
            return $;
        }
    }

}
