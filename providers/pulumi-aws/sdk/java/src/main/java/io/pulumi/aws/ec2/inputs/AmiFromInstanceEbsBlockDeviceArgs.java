// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AmiFromInstanceEbsBlockDeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AmiFromInstanceEbsBlockDeviceArgs Empty = new AmiFromInstanceEbsBlockDeviceArgs();

    /**
     * Boolean controlling whether the EBS volumes created to
     * support each created instance will be deleted once that instance is terminated.
     * 
     */
    @Import(name="deleteOnTermination")
      private final @Nullable Output<Boolean> deleteOnTermination;

    public Output<Boolean> getDeleteOnTermination() {
        return this.deleteOnTermination == null ? Codegen.empty() : this.deleteOnTermination;
    }

    /**
     * The path at which the device is exposed to created instances.
     * 
     */
    @Import(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName == null ? Codegen.empty() : this.deviceName;
    }

    /**
     * Boolean controlling whether the created EBS volumes will be encrypted. Can't be used with `snapshot_id`.
     * 
     */
    @Import(name="encrypted")
      private final @Nullable Output<Boolean> encrypted;

    public Output<Boolean> getEncrypted() {
        return this.encrypted == null ? Codegen.empty() : this.encrypted;
    }

    /**
     * Number of I/O operations per second the
     * created volumes will support.
     * 
     */
    @Import(name="iops")
      private final @Nullable Output<Integer> iops;

    public Output<Integer> getIops() {
        return this.iops == null ? Codegen.empty() : this.iops;
    }

    /**
     * The id of an EBS snapshot that will be used to initialize the created
     * EBS volumes. If set, the `volume_size` attribute must be at least as large as the referenced
     * snapshot.
     * 
     */
    @Import(name="snapshotId")
      private final @Nullable Output<String> snapshotId;

    public Output<String> getSnapshotId() {
        return this.snapshotId == null ? Codegen.empty() : this.snapshotId;
    }

    /**
     * The throughput that the EBS volume supports, in MiB/s. Only valid for `volume_type` of `gp3`.
     * 
     */
    @Import(name="throughput")
      private final @Nullable Output<Integer> throughput;

    public Output<Integer> getThroughput() {
        return this.throughput == null ? Codegen.empty() : this.throughput;
    }

    /**
     * The size of created volumes in GiB.
     * If `snapshot_id` is set and `volume_size` is omitted then the volume will have the same size
     * as the selected snapshot.
     * 
     */
    @Import(name="volumeSize")
      private final @Nullable Output<Integer> volumeSize;

    public Output<Integer> getVolumeSize() {
        return this.volumeSize == null ? Codegen.empty() : this.volumeSize;
    }

    /**
     * The type of EBS volume to create. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `standard`).
     * 
     */
    @Import(name="volumeType")
      private final @Nullable Output<String> volumeType;

    public Output<String> getVolumeType() {
        return this.volumeType == null ? Codegen.empty() : this.volumeType;
    }

    public AmiFromInstanceEbsBlockDeviceArgs(
        @Nullable Output<Boolean> deleteOnTermination,
        @Nullable Output<String> deviceName,
        @Nullable Output<Boolean> encrypted,
        @Nullable Output<Integer> iops,
        @Nullable Output<String> snapshotId,
        @Nullable Output<Integer> throughput,
        @Nullable Output<Integer> volumeSize,
        @Nullable Output<String> volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceName = deviceName;
        this.encrypted = encrypted;
        this.iops = iops;
        this.snapshotId = snapshotId;
        this.throughput = throughput;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    private AmiFromInstanceEbsBlockDeviceArgs() {
        this.deleteOnTermination = Codegen.empty();
        this.deviceName = Codegen.empty();
        this.encrypted = Codegen.empty();
        this.iops = Codegen.empty();
        this.snapshotId = Codegen.empty();
        this.throughput = Codegen.empty();
        this.volumeSize = Codegen.empty();
        this.volumeType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmiFromInstanceEbsBlockDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> deleteOnTermination;
        private @Nullable Output<String> deviceName;
        private @Nullable Output<Boolean> encrypted;
        private @Nullable Output<Integer> iops;
        private @Nullable Output<String> snapshotId;
        private @Nullable Output<Integer> throughput;
        private @Nullable Output<Integer> volumeSize;
        private @Nullable Output<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(AmiFromInstanceEbsBlockDeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.snapshotId = defaults.snapshotId;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder deleteOnTermination(@Nullable Output<Boolean> deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }
        public Builder deleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = Codegen.ofNullable(deleteOnTermination);
            return this;
        }
        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Codegen.ofNullable(deviceName);
            return this;
        }
        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = Codegen.ofNullable(encrypted);
            return this;
        }
        public Builder iops(@Nullable Output<Integer> iops) {
            this.iops = iops;
            return this;
        }
        public Builder iops(@Nullable Integer iops) {
            this.iops = Codegen.ofNullable(iops);
            return this;
        }
        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = Codegen.ofNullable(snapshotId);
            return this;
        }
        public Builder throughput(@Nullable Output<Integer> throughput) {
            this.throughput = throughput;
            return this;
        }
        public Builder throughput(@Nullable Integer throughput) {
            this.throughput = Codegen.ofNullable(throughput);
            return this;
        }
        public Builder volumeSize(@Nullable Output<Integer> volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }
        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = Codegen.ofNullable(volumeSize);
            return this;
        }
        public Builder volumeType(@Nullable Output<String> volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = Codegen.ofNullable(volumeType);
            return this;
        }        public AmiFromInstanceEbsBlockDeviceArgs build() {
            return new AmiFromInstanceEbsBlockDeviceArgs(deleteOnTermination, deviceName, encrypted, iops, snapshotId, throughput, volumeSize, volumeType);
        }
    }
}
