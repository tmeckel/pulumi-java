// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.storsimple.enums.Kind;
import io.pulumi.azurenative.storsimple.inputs.AsymmetricEncryptedSecretArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VolumeContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeContainerArgs Empty = new VolumeContainerArgs();

    /**
     * The bandwidth-rate set on the volume container.
     * 
     */
    @InputImport(name="bandWidthRateInMbps")
      private final @Nullable Input<Integer> bandWidthRateInMbps;

    public Input<Integer> getBandWidthRateInMbps() {
        return this.bandWidthRateInMbps == null ? Input.empty() : this.bandWidthRateInMbps;
    }

    /**
     * The ID of the bandwidth setting associated with the volume container.
     * 
     */
    @InputImport(name="bandwidthSettingId")
      private final @Nullable Input<String> bandwidthSettingId;

    public Input<String> getBandwidthSettingId() {
        return this.bandwidthSettingId == null ? Input.empty() : this.bandwidthSettingId;
    }

    /**
     * The device name
     * 
     */
    @InputImport(name="deviceName", required=true)
      private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * The key used to encrypt data in the volume container. It is required when property 'EncryptionStatus' is "Enabled".
     * 
     */
    @InputImport(name="encryptionKey")
      private final @Nullable Input<AsymmetricEncryptedSecretArgs> encryptionKey;

    public Input<AsymmetricEncryptedSecretArgs> getEncryptionKey() {
        return this.encryptionKey == null ? Input.empty() : this.encryptionKey;
    }

    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<Kind> kind;

    public Input<Kind> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The manager name
     * 
     */
    @InputImport(name="managerName", required=true)
      private final Input<String> managerName;

    public Input<String> getManagerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The path ID of storage account associated with the volume container.
     * 
     */
    @InputImport(name="storageAccountCredentialId", required=true)
      private final Input<String> storageAccountCredentialId;

    public Input<String> getStorageAccountCredentialId() {
        return this.storageAccountCredentialId;
    }

    /**
     * The name of the volume container.
     * 
     */
    @InputImport(name="volumeContainerName")
      private final @Nullable Input<String> volumeContainerName;

    public Input<String> getVolumeContainerName() {
        return this.volumeContainerName == null ? Input.empty() : this.volumeContainerName;
    }

    public VolumeContainerArgs(
        @Nullable Input<Integer> bandWidthRateInMbps,
        @Nullable Input<String> bandwidthSettingId,
        Input<String> deviceName,
        @Nullable Input<AsymmetricEncryptedSecretArgs> encryptionKey,
        @Nullable Input<Kind> kind,
        Input<String> managerName,
        Input<String> resourceGroupName,
        Input<String> storageAccountCredentialId,
        @Nullable Input<String> volumeContainerName) {
        this.bandWidthRateInMbps = bandWidthRateInMbps;
        this.bandwidthSettingId = bandwidthSettingId;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.encryptionKey = encryptionKey;
        this.kind = kind;
        this.managerName = Objects.requireNonNull(managerName, "expected parameter 'managerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageAccountCredentialId = Objects.requireNonNull(storageAccountCredentialId, "expected parameter 'storageAccountCredentialId' to be non-null");
        this.volumeContainerName = volumeContainerName;
    }

    private VolumeContainerArgs() {
        this.bandWidthRateInMbps = Input.empty();
        this.bandwidthSettingId = Input.empty();
        this.deviceName = Input.empty();
        this.encryptionKey = Input.empty();
        this.kind = Input.empty();
        this.managerName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.storageAccountCredentialId = Input.empty();
        this.volumeContainerName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> bandWidthRateInMbps;
        private @Nullable Input<String> bandwidthSettingId;
        private Input<String> deviceName;
        private @Nullable Input<AsymmetricEncryptedSecretArgs> encryptionKey;
        private @Nullable Input<Kind> kind;
        private Input<String> managerName;
        private Input<String> resourceGroupName;
        private Input<String> storageAccountCredentialId;
        private @Nullable Input<String> volumeContainerName;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandWidthRateInMbps = defaults.bandWidthRateInMbps;
    	      this.bandwidthSettingId = defaults.bandwidthSettingId;
    	      this.deviceName = defaults.deviceName;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.kind = defaults.kind;
    	      this.managerName = defaults.managerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageAccountCredentialId = defaults.storageAccountCredentialId;
    	      this.volumeContainerName = defaults.volumeContainerName;
        }

        public Builder bandWidthRateInMbps(@Nullable Input<Integer> bandWidthRateInMbps) {
            this.bandWidthRateInMbps = bandWidthRateInMbps;
            return this;
        }

        public Builder bandWidthRateInMbps(@Nullable Integer bandWidthRateInMbps) {
            this.bandWidthRateInMbps = Input.ofNullable(bandWidthRateInMbps);
            return this;
        }

        public Builder bandwidthSettingId(@Nullable Input<String> bandwidthSettingId) {
            this.bandwidthSettingId = bandwidthSettingId;
            return this;
        }

        public Builder bandwidthSettingId(@Nullable String bandwidthSettingId) {
            this.bandwidthSettingId = Input.ofNullable(bandwidthSettingId);
            return this;
        }

        public Builder deviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder encryptionKey(@Nullable Input<AsymmetricEncryptedSecretArgs> encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        public Builder encryptionKey(@Nullable AsymmetricEncryptedSecretArgs encryptionKey) {
            this.encryptionKey = Input.ofNullable(encryptionKey);
            return this;
        }

        public Builder kind(@Nullable Input<Kind> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable Kind kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder managerName(Input<String> managerName) {
            this.managerName = Objects.requireNonNull(managerName);
            return this;
        }

        public Builder managerName(String managerName) {
            this.managerName = Input.of(Objects.requireNonNull(managerName));
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder storageAccountCredentialId(Input<String> storageAccountCredentialId) {
            this.storageAccountCredentialId = Objects.requireNonNull(storageAccountCredentialId);
            return this;
        }

        public Builder storageAccountCredentialId(String storageAccountCredentialId) {
            this.storageAccountCredentialId = Input.of(Objects.requireNonNull(storageAccountCredentialId));
            return this;
        }

        public Builder volumeContainerName(@Nullable Input<String> volumeContainerName) {
            this.volumeContainerName = volumeContainerName;
            return this;
        }

        public Builder volumeContainerName(@Nullable String volumeContainerName) {
            this.volumeContainerName = Input.ofNullable(volumeContainerName);
            return this;
        }
        public VolumeContainerArgs build() {
            return new VolumeContainerArgs(bandWidthRateInMbps, bandwidthSettingId, deviceName, encryptionKey, kind, managerName, resourceGroupName, storageAccountCredentialId, volumeContainerName);
        }
    }
}
