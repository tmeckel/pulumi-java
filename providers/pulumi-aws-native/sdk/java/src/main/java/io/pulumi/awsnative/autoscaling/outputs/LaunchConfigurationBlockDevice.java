// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.autoscaling.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LaunchConfigurationBlockDevice {
    /**
     * Indicates whether the volume is deleted on instance termination.
     * 
     */
    private final @Nullable Boolean deleteOnTermination;
    /**
     * Specifies whether the volume should be encrypted.
     * 
     */
    private final @Nullable Boolean encrypted;
    /**
     * The number of input/output (I/O) operations per second (IOPS) to provision for the volume.
     * 
     */
    private final @Nullable Integer iops;
    /**
     * The snapshot ID of the volume to use.
     * 
     */
    private final @Nullable String snapshotId;
    /**
     * The throughput (MiBps) to provision for a gp3 volume.
     * 
     */
    private final @Nullable Integer throughput;
    /**
     * The volume size, in GiBs.
     * 
     */
    private final @Nullable Integer volumeSize;
    /**
     * The volume type.
     * 
     */
    private final @Nullable String volumeType;

    @OutputCustomType.Constructor
    private LaunchConfigurationBlockDevice(
        @OutputCustomType.Parameter("deleteOnTermination") @Nullable Boolean deleteOnTermination,
        @OutputCustomType.Parameter("encrypted") @Nullable Boolean encrypted,
        @OutputCustomType.Parameter("iops") @Nullable Integer iops,
        @OutputCustomType.Parameter("snapshotId") @Nullable String snapshotId,
        @OutputCustomType.Parameter("throughput") @Nullable Integer throughput,
        @OutputCustomType.Parameter("volumeSize") @Nullable Integer volumeSize,
        @OutputCustomType.Parameter("volumeType") @Nullable String volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.encrypted = encrypted;
        this.iops = iops;
        this.snapshotId = snapshotId;
        this.throughput = throughput;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    /**
     * Indicates whether the volume is deleted on instance termination.
     * 
    */
    public Optional<Boolean> getDeleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    /**
     * Specifies whether the volume should be encrypted.
     * 
    */
    public Optional<Boolean> getEncrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * The number of input/output (I/O) operations per second (IOPS) to provision for the volume.
     * 
    */
    public Optional<Integer> getIops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * The snapshot ID of the volume to use.
     * 
    */
    public Optional<String> getSnapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }
    /**
     * The throughput (MiBps) to provision for a gp3 volume.
     * 
    */
    public Optional<Integer> getThroughput() {
        return Optional.ofNullable(this.throughput);
    }
    /**
     * The volume size, in GiBs.
     * 
    */
    public Optional<Integer> getVolumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }
    /**
     * The volume type.
     * 
    */
    public Optional<String> getVolumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchConfigurationBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean deleteOnTermination;
        private @Nullable Boolean encrypted;
        private @Nullable Integer iops;
        private @Nullable String snapshotId;
        private @Nullable Integer throughput;
        private @Nullable Integer volumeSize;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchConfigurationBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.snapshotId = defaults.snapshotId;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder deleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }

        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder iops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }

        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public Builder throughput(@Nullable Integer throughput) {
            this.throughput = throughput;
            return this;
        }

        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }

        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public LaunchConfigurationBlockDevice build() {
            return new LaunchConfigurationBlockDevice(deleteOnTermination, encrypted, iops, snapshotId, throughput, volumeSize, volumeType);
        }
    }
}
