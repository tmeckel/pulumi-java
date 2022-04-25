// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.CustomerEncryptionKeyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SourceDiskEncryptionKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceDiskEncryptionKeyArgs Empty = new SourceDiskEncryptionKeyArgs();

    /**
     * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    @Import(name="diskEncryptionKey")
    private @Nullable Output<CustomerEncryptionKeyArgs> diskEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    public Optional<Output<CustomerEncryptionKeyArgs>> diskEncryptionKey() {
        return Optional.ofNullable(this.diskEncryptionKey);
    }

    /**
     * URL of the disk attached to the source instance. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
     * 
     */
    @Import(name="sourceDisk")
    private @Nullable Output<String> sourceDisk;

    /**
     * @return URL of the disk attached to the source instance. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
     * 
     */
    public Optional<Output<String>> sourceDisk() {
        return Optional.ofNullable(this.sourceDisk);
    }

    private SourceDiskEncryptionKeyArgs() {}

    private SourceDiskEncryptionKeyArgs(SourceDiskEncryptionKeyArgs $) {
        this.diskEncryptionKey = $.diskEncryptionKey;
        this.sourceDisk = $.sourceDisk;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceDiskEncryptionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceDiskEncryptionKeyArgs $;

        public Builder() {
            $ = new SourceDiskEncryptionKeyArgs();
        }

        public Builder(SourceDiskEncryptionKeyArgs defaults) {
            $ = new SourceDiskEncryptionKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskEncryptionKey The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionKey(@Nullable Output<CustomerEncryptionKeyArgs> diskEncryptionKey) {
            $.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        /**
         * @param diskEncryptionKey The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionKey(CustomerEncryptionKeyArgs diskEncryptionKey) {
            return diskEncryptionKey(Output.of(diskEncryptionKey));
        }

        /**
         * @param sourceDisk URL of the disk attached to the source instance. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
         * 
         * @return builder
         * 
         */
        public Builder sourceDisk(@Nullable Output<String> sourceDisk) {
            $.sourceDisk = sourceDisk;
            return this;
        }

        /**
         * @param sourceDisk URL of the disk attached to the source instance. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
         * 
         * @return builder
         * 
         */
        public Builder sourceDisk(String sourceDisk) {
            return sourceDisk(Output.of(sourceDisk));
        }

        public SourceDiskEncryptionKeyArgs build() {
            return $;
        }
    }

}
