// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An instance-attached disk resource.
 * 
 */
public final class SavedDiskResponse extends com.pulumi.resources.InvokeArgs {

    public static final SavedDiskResponse Empty = new SavedDiskResponse();

    /**
     * Type of the resource. Always compute#savedDisk for attached disks.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    /**
     * @return Type of the resource. Always compute#savedDisk for attached disks.
     * 
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Specifies a URL of the disk attached to the source instance.
     * 
     */
    @Import(name="sourceDisk", required=true)
    private String sourceDisk;

    /**
     * @return Specifies a URL of the disk attached to the source instance.
     * 
     */
    public String sourceDisk() {
        return this.sourceDisk;
    }

    /**
     * Size of the individual disk snapshot used by this machine image.
     * 
     */
    @Import(name="storageBytes", required=true)
    private String storageBytes;

    /**
     * @return Size of the individual disk snapshot used by this machine image.
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

    private SavedDiskResponse() {}

    private SavedDiskResponse(SavedDiskResponse $) {
        this.kind = $.kind;
        this.sourceDisk = $.sourceDisk;
        this.storageBytes = $.storageBytes;
        this.storageBytesStatus = $.storageBytesStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SavedDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SavedDiskResponse $;

        public Builder() {
            $ = new SavedDiskResponse();
        }

        public Builder(SavedDiskResponse defaults) {
            $ = new SavedDiskResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param kind Type of the resource. Always compute#savedDisk for attached disks.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param sourceDisk Specifies a URL of the disk attached to the source instance.
         * 
         * @return builder
         * 
         */
        public Builder sourceDisk(String sourceDisk) {
            $.sourceDisk = sourceDisk;
            return this;
        }

        /**
         * @param storageBytes Size of the individual disk snapshot used by this machine image.
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

        public SavedDiskResponse build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.sourceDisk = Objects.requireNonNull($.sourceDisk, "expected parameter 'sourceDisk' to be non-null");
            $.storageBytes = Objects.requireNonNull($.storageBytes, "expected parameter 'storageBytes' to be non-null");
            $.storageBytesStatus = Objects.requireNonNull($.storageBytesStatus, "expected parameter 'storageBytesStatus' to be non-null");
            return $;
        }
    }

}
