// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RetentionVolumeResponse {
    /**
     * The volume capacity.
     * 
     */
    private final @Nullable Double capacityInBytes;
    /**
     * The free space available in this volume.
     * 
     */
    private final @Nullable Double freeSpaceInBytes;
    /**
     * The threshold percentage.
     * 
     */
    private final @Nullable Integer thresholdPercentage;
    /**
     * The volume name.
     * 
     */
    private final @Nullable String volumeName;

    @OutputCustomType.Constructor
    private RetentionVolumeResponse(
        @OutputCustomType.Parameter("capacityInBytes") @Nullable Double capacityInBytes,
        @OutputCustomType.Parameter("freeSpaceInBytes") @Nullable Double freeSpaceInBytes,
        @OutputCustomType.Parameter("thresholdPercentage") @Nullable Integer thresholdPercentage,
        @OutputCustomType.Parameter("volumeName") @Nullable String volumeName) {
        this.capacityInBytes = capacityInBytes;
        this.freeSpaceInBytes = freeSpaceInBytes;
        this.thresholdPercentage = thresholdPercentage;
        this.volumeName = volumeName;
    }

    /**
     * The volume capacity.
     * 
    */
    public Optional<Double> getCapacityInBytes() {
        return Optional.ofNullable(this.capacityInBytes);
    }
    /**
     * The free space available in this volume.
     * 
    */
    public Optional<Double> getFreeSpaceInBytes() {
        return Optional.ofNullable(this.freeSpaceInBytes);
    }
    /**
     * The threshold percentage.
     * 
    */
    public Optional<Integer> getThresholdPercentage() {
        return Optional.ofNullable(this.thresholdPercentage);
    }
    /**
     * The volume name.
     * 
    */
    public Optional<String> getVolumeName() {
        return Optional.ofNullable(this.volumeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionVolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double capacityInBytes;
        private @Nullable Double freeSpaceInBytes;
        private @Nullable Integer thresholdPercentage;
        private @Nullable String volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionVolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityInBytes = defaults.capacityInBytes;
    	      this.freeSpaceInBytes = defaults.freeSpaceInBytes;
    	      this.thresholdPercentage = defaults.thresholdPercentage;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder capacityInBytes(@Nullable Double capacityInBytes) {
            this.capacityInBytes = capacityInBytes;
            return this;
        }

        public Builder freeSpaceInBytes(@Nullable Double freeSpaceInBytes) {
            this.freeSpaceInBytes = freeSpaceInBytes;
            return this;
        }

        public Builder thresholdPercentage(@Nullable Integer thresholdPercentage) {
            this.thresholdPercentage = thresholdPercentage;
            return this;
        }

        public Builder volumeName(@Nullable String volumeName) {
            this.volumeName = volumeName;
            return this;
        }
        public RetentionVolumeResponse build() {
            return new RetentionVolumeResponse(capacityInBytes, freeSpaceInBytes, thresholdPercentage, volumeName);
        }
    }
}
