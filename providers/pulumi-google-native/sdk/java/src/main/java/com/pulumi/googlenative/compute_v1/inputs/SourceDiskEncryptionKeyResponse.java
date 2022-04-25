// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.inputs.CustomerEncryptionKeyResponse;
import java.lang.String;
import java.util.Objects;


public final class SourceDiskEncryptionKeyResponse extends com.pulumi.resources.InvokeArgs {

    public static final SourceDiskEncryptionKeyResponse Empty = new SourceDiskEncryptionKeyResponse();

    /**
     * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    @Import(name="diskEncryptionKey", required=true)
    private CustomerEncryptionKeyResponse diskEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    public CustomerEncryptionKeyResponse diskEncryptionKey() {
        return this.diskEncryptionKey;
    }

    /**
     * URL of the disk attached to the source instance. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
     * 
     */
    @Import(name="sourceDisk", required=true)
    private String sourceDisk;

    /**
     * @return URL of the disk attached to the source instance. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
     * 
     */
    public String sourceDisk() {
        return this.sourceDisk;
    }

    private SourceDiskEncryptionKeyResponse() {}

    private SourceDiskEncryptionKeyResponse(SourceDiskEncryptionKeyResponse $) {
        this.diskEncryptionKey = $.diskEncryptionKey;
        this.sourceDisk = $.sourceDisk;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceDiskEncryptionKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceDiskEncryptionKeyResponse $;

        public Builder() {
            $ = new SourceDiskEncryptionKeyResponse();
        }

        public Builder(SourceDiskEncryptionKeyResponse defaults) {
            $ = new SourceDiskEncryptionKeyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskEncryptionKey The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionKey(CustomerEncryptionKeyResponse diskEncryptionKey) {
            $.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        /**
         * @param sourceDisk URL of the disk attached to the source instance. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
         * 
         * @return builder
         * 
         */
        public Builder sourceDisk(String sourceDisk) {
            $.sourceDisk = sourceDisk;
            return this;
        }

        public SourceDiskEncryptionKeyResponse build() {
            $.diskEncryptionKey = Objects.requireNonNull($.diskEncryptionKey, "expected parameter 'diskEncryptionKey' to be non-null");
            $.sourceDisk = Objects.requireNonNull($.sourceDisk, "expected parameter 'sourceDisk' to be non-null");
            return $;
        }
    }

}
