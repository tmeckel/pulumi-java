// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocalDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocalDiskArgs Empty = new LocalDiskArgs();

    /**
     * Specifies the number of such disks.
     * 
     */
    @Import(name="diskCount")
    private @Nullable Output<Integer> diskCount;

    /**
     * @return Specifies the number of such disks.
     * 
     */
    public Optional<Output<Integer>> diskCount() {
        return Optional.ofNullable(this.diskCount);
    }

    /**
     * Specifies the size of the disk in base-2 GB.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<Integer> diskSizeGb;

    /**
     * @return Specifies the size of the disk in base-2 GB.
     * 
     */
    public Optional<Output<Integer>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
     * 
     */
    @Import(name="diskType")
    private @Nullable Output<String> diskType;

    /**
     * @return Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
     * 
     */
    public Optional<Output<String>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    private LocalDiskArgs() {}

    private LocalDiskArgs(LocalDiskArgs $) {
        this.diskCount = $.diskCount;
        this.diskSizeGb = $.diskSizeGb;
        this.diskType = $.diskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocalDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocalDiskArgs $;

        public Builder() {
            $ = new LocalDiskArgs();
        }

        public Builder(LocalDiskArgs defaults) {
            $ = new LocalDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskCount Specifies the number of such disks.
         * 
         * @return builder
         * 
         */
        public Builder diskCount(@Nullable Output<Integer> diskCount) {
            $.diskCount = diskCount;
            return this;
        }

        /**
         * @param diskCount Specifies the number of such disks.
         * 
         * @return builder
         * 
         */
        public Builder diskCount(Integer diskCount) {
            return diskCount(Output.of(diskCount));
        }

        /**
         * @param diskSizeGb Specifies the size of the disk in base-2 GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb Specifies the size of the disk in base-2 GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Integer diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param diskType Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
         * 
         * @return builder
         * 
         */
        public Builder diskType(@Nullable Output<String> diskType) {
            $.diskType = diskType;
            return this;
        }

        /**
         * @param diskType Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
         * 
         * @return builder
         * 
         */
        public Builder diskType(String diskType) {
            return diskType(Output.of(diskType));
        }

        public LocalDiskArgs build() {
            return $;
        }
    }

}
