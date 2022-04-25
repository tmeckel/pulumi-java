// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RailsAppLayerEbsVolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final RailsAppLayerEbsVolumeArgs Empty = new RailsAppLayerEbsVolumeArgs();

    @Import(name="encrypted")
    private @Nullable Output<Boolean> encrypted;

    public Optional<Output<Boolean>> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    /**
     * For PIOPS volumes, the IOPS per disk.
     * 
     */
    @Import(name="iops")
    private @Nullable Output<Integer> iops;

    /**
     * @return For PIOPS volumes, the IOPS per disk.
     * 
     */
    public Optional<Output<Integer>> iops() {
        return Optional.ofNullable(this.iops);
    }

    /**
     * The path to mount the EBS volume on the layer&#39;s instances.
     * 
     */
    @Import(name="mountPoint", required=true)
    private Output<String> mountPoint;

    /**
     * @return The path to mount the EBS volume on the layer&#39;s instances.
     * 
     */
    public Output<String> mountPoint() {
        return this.mountPoint;
    }

    /**
     * The number of disks to use for the EBS volume.
     * 
     */
    @Import(name="numberOfDisks", required=true)
    private Output<Integer> numberOfDisks;

    /**
     * @return The number of disks to use for the EBS volume.
     * 
     */
    public Output<Integer> numberOfDisks() {
        return this.numberOfDisks;
    }

    /**
     * The RAID level to use for the volume.
     * 
     */
    @Import(name="raidLevel")
    private @Nullable Output<String> raidLevel;

    /**
     * @return The RAID level to use for the volume.
     * 
     */
    public Optional<Output<String>> raidLevel() {
        return Optional.ofNullable(this.raidLevel);
    }

    /**
     * The size of the volume in gigabytes.
     * 
     */
    @Import(name="size", required=true)
    private Output<Integer> size;

    /**
     * @return The size of the volume in gigabytes.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }

    /**
     * The type of volume to create. This may be `standard` (the default), `io1` or `gp2`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of volume to create. This may be `standard` (the default), `io1` or `gp2`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private RailsAppLayerEbsVolumeArgs() {}

    private RailsAppLayerEbsVolumeArgs(RailsAppLayerEbsVolumeArgs $) {
        this.encrypted = $.encrypted;
        this.iops = $.iops;
        this.mountPoint = $.mountPoint;
        this.numberOfDisks = $.numberOfDisks;
        this.raidLevel = $.raidLevel;
        this.size = $.size;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RailsAppLayerEbsVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RailsAppLayerEbsVolumeArgs $;

        public Builder() {
            $ = new RailsAppLayerEbsVolumeArgs();
        }

        public Builder(RailsAppLayerEbsVolumeArgs defaults) {
            $ = new RailsAppLayerEbsVolumeArgs(Objects.requireNonNull(defaults));
        }

        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        public Builder encrypted(Boolean encrypted) {
            return encrypted(Output.of(encrypted));
        }

        /**
         * @param iops For PIOPS volumes, the IOPS per disk.
         * 
         * @return builder
         * 
         */
        public Builder iops(@Nullable Output<Integer> iops) {
            $.iops = iops;
            return this;
        }

        /**
         * @param iops For PIOPS volumes, the IOPS per disk.
         * 
         * @return builder
         * 
         */
        public Builder iops(Integer iops) {
            return iops(Output.of(iops));
        }

        /**
         * @param mountPoint The path to mount the EBS volume on the layer&#39;s instances.
         * 
         * @return builder
         * 
         */
        public Builder mountPoint(Output<String> mountPoint) {
            $.mountPoint = mountPoint;
            return this;
        }

        /**
         * @param mountPoint The path to mount the EBS volume on the layer&#39;s instances.
         * 
         * @return builder
         * 
         */
        public Builder mountPoint(String mountPoint) {
            return mountPoint(Output.of(mountPoint));
        }

        /**
         * @param numberOfDisks The number of disks to use for the EBS volume.
         * 
         * @return builder
         * 
         */
        public Builder numberOfDisks(Output<Integer> numberOfDisks) {
            $.numberOfDisks = numberOfDisks;
            return this;
        }

        /**
         * @param numberOfDisks The number of disks to use for the EBS volume.
         * 
         * @return builder
         * 
         */
        public Builder numberOfDisks(Integer numberOfDisks) {
            return numberOfDisks(Output.of(numberOfDisks));
        }

        /**
         * @param raidLevel The RAID level to use for the volume.
         * 
         * @return builder
         * 
         */
        public Builder raidLevel(@Nullable Output<String> raidLevel) {
            $.raidLevel = raidLevel;
            return this;
        }

        /**
         * @param raidLevel The RAID level to use for the volume.
         * 
         * @return builder
         * 
         */
        public Builder raidLevel(String raidLevel) {
            return raidLevel(Output.of(raidLevel));
        }

        /**
         * @param size The size of the volume in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder size(Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the volume in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param type The type of volume to create. This may be `standard` (the default), `io1` or `gp2`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of volume to create. This may be `standard` (the default), `io1` or `gp2`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public RailsAppLayerEbsVolumeArgs build() {
            $.mountPoint = Objects.requireNonNull($.mountPoint, "expected parameter 'mountPoint' to be non-null");
            $.numberOfDisks = Objects.requireNonNull($.numberOfDisks, "expected parameter 'numberOfDisks' to be non-null");
            $.size = Objects.requireNonNull($.size, "expected parameter 'size' to be non-null");
            return $;
        }
    }

}
