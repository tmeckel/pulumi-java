// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple;

import com.pulumi.azurenative.storsimple.enums.Kind;
import com.pulumi.azurenative.storsimple.enums.MonitoringStatus;
import com.pulumi.azurenative.storsimple.enums.VolumeStatus;
import com.pulumi.azurenative.storsimple.enums.VolumeType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeArgs Empty = new VolumeArgs();

    /**
     * The IDs of the access control records, associated with the volume.
     * 
     */
    @Import(name="accessControlRecordIds", required=true)
    private Output<List<String>> accessControlRecordIds;

    /**
     * @return The IDs of the access control records, associated with the volume.
     * 
     */
    public Output<List<String>> accessControlRecordIds() {
        return this.accessControlRecordIds;
    }

    /**
     * The device name
     * 
     */
    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    /**
     * @return The device name
     * 
     */
    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    @Import(name="kind")
    private @Nullable Output<Kind> kind;

    /**
     * @return The Kind of the object. Currently only Series8000 is supported
     * 
     */
    public Optional<Output<Kind>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The manager name
     * 
     */
    @Import(name="managerName", required=true)
    private Output<String> managerName;

    /**
     * @return The manager name
     * 
     */
    public Output<String> managerName() {
        return this.managerName;
    }

    /**
     * The monitoring status of the volume.
     * 
     */
    @Import(name="monitoringStatus", required=true)
    private Output<MonitoringStatus> monitoringStatus;

    /**
     * @return The monitoring status of the volume.
     * 
     */
    public Output<MonitoringStatus> monitoringStatus() {
        return this.monitoringStatus;
    }

    /**
     * The resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The size of the volume in bytes.
     * 
     */
    @Import(name="sizeInBytes", required=true)
    private Output<Double> sizeInBytes;

    /**
     * @return The size of the volume in bytes.
     * 
     */
    public Output<Double> sizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * The volume container name.
     * 
     */
    @Import(name="volumeContainerName", required=true)
    private Output<String> volumeContainerName;

    /**
     * @return The volume container name.
     * 
     */
    public Output<String> volumeContainerName() {
        return this.volumeContainerName;
    }

    /**
     * The volume name.
     * 
     */
    @Import(name="volumeName")
    private @Nullable Output<String> volumeName;

    /**
     * @return The volume name.
     * 
     */
    public Optional<Output<String>> volumeName() {
        return Optional.ofNullable(this.volumeName);
    }

    /**
     * The volume status.
     * 
     */
    @Import(name="volumeStatus", required=true)
    private Output<VolumeStatus> volumeStatus;

    /**
     * @return The volume status.
     * 
     */
    public Output<VolumeStatus> volumeStatus() {
        return this.volumeStatus;
    }

    /**
     * The type of the volume.
     * 
     */
    @Import(name="volumeType", required=true)
    private Output<VolumeType> volumeType;

    /**
     * @return The type of the volume.
     * 
     */
    public Output<VolumeType> volumeType() {
        return this.volumeType;
    }

    private VolumeArgs() {}

    private VolumeArgs(VolumeArgs $) {
        this.accessControlRecordIds = $.accessControlRecordIds;
        this.deviceName = $.deviceName;
        this.kind = $.kind;
        this.managerName = $.managerName;
        this.monitoringStatus = $.monitoringStatus;
        this.resourceGroupName = $.resourceGroupName;
        this.sizeInBytes = $.sizeInBytes;
        this.volumeContainerName = $.volumeContainerName;
        this.volumeName = $.volumeName;
        this.volumeStatus = $.volumeStatus;
        this.volumeType = $.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeArgs $;

        public Builder() {
            $ = new VolumeArgs();
        }

        public Builder(VolumeArgs defaults) {
            $ = new VolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessControlRecordIds The IDs of the access control records, associated with the volume.
         * 
         * @return builder
         * 
         */
        public Builder accessControlRecordIds(Output<List<String>> accessControlRecordIds) {
            $.accessControlRecordIds = accessControlRecordIds;
            return this;
        }

        /**
         * @param accessControlRecordIds The IDs of the access control records, associated with the volume.
         * 
         * @return builder
         * 
         */
        public Builder accessControlRecordIds(List<String> accessControlRecordIds) {
            return accessControlRecordIds(Output.of(accessControlRecordIds));
        }

        /**
         * @param accessControlRecordIds The IDs of the access control records, associated with the volume.
         * 
         * @return builder
         * 
         */
        public Builder accessControlRecordIds(String... accessControlRecordIds) {
            return accessControlRecordIds(List.of(accessControlRecordIds));
        }

        /**
         * @param deviceName The device name
         * 
         * @return builder
         * 
         */
        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName The device name
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param kind The Kind of the object. Currently only Series8000 is supported
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<Kind> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The Kind of the object. Currently only Series8000 is supported
         * 
         * @return builder
         * 
         */
        public Builder kind(Kind kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param managerName The manager name
         * 
         * @return builder
         * 
         */
        public Builder managerName(Output<String> managerName) {
            $.managerName = managerName;
            return this;
        }

        /**
         * @param managerName The manager name
         * 
         * @return builder
         * 
         */
        public Builder managerName(String managerName) {
            return managerName(Output.of(managerName));
        }

        /**
         * @param monitoringStatus The monitoring status of the volume.
         * 
         * @return builder
         * 
         */
        public Builder monitoringStatus(Output<MonitoringStatus> monitoringStatus) {
            $.monitoringStatus = monitoringStatus;
            return this;
        }

        /**
         * @param monitoringStatus The monitoring status of the volume.
         * 
         * @return builder
         * 
         */
        public Builder monitoringStatus(MonitoringStatus monitoringStatus) {
            return monitoringStatus(Output.of(monitoringStatus));
        }

        /**
         * @param resourceGroupName The resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sizeInBytes The size of the volume in bytes.
         * 
         * @return builder
         * 
         */
        public Builder sizeInBytes(Output<Double> sizeInBytes) {
            $.sizeInBytes = sizeInBytes;
            return this;
        }

        /**
         * @param sizeInBytes The size of the volume in bytes.
         * 
         * @return builder
         * 
         */
        public Builder sizeInBytes(Double sizeInBytes) {
            return sizeInBytes(Output.of(sizeInBytes));
        }

        /**
         * @param volumeContainerName The volume container name.
         * 
         * @return builder
         * 
         */
        public Builder volumeContainerName(Output<String> volumeContainerName) {
            $.volumeContainerName = volumeContainerName;
            return this;
        }

        /**
         * @param volumeContainerName The volume container name.
         * 
         * @return builder
         * 
         */
        public Builder volumeContainerName(String volumeContainerName) {
            return volumeContainerName(Output.of(volumeContainerName));
        }

        /**
         * @param volumeName The volume name.
         * 
         * @return builder
         * 
         */
        public Builder volumeName(@Nullable Output<String> volumeName) {
            $.volumeName = volumeName;
            return this;
        }

        /**
         * @param volumeName The volume name.
         * 
         * @return builder
         * 
         */
        public Builder volumeName(String volumeName) {
            return volumeName(Output.of(volumeName));
        }

        /**
         * @param volumeStatus The volume status.
         * 
         * @return builder
         * 
         */
        public Builder volumeStatus(Output<VolumeStatus> volumeStatus) {
            $.volumeStatus = volumeStatus;
            return this;
        }

        /**
         * @param volumeStatus The volume status.
         * 
         * @return builder
         * 
         */
        public Builder volumeStatus(VolumeStatus volumeStatus) {
            return volumeStatus(Output.of(volumeStatus));
        }

        /**
         * @param volumeType The type of the volume.
         * 
         * @return builder
         * 
         */
        public Builder volumeType(Output<VolumeType> volumeType) {
            $.volumeType = volumeType;
            return this;
        }

        /**
         * @param volumeType The type of the volume.
         * 
         * @return builder
         * 
         */
        public Builder volumeType(VolumeType volumeType) {
            return volumeType(Output.of(volumeType));
        }

        public VolumeArgs build() {
            $.accessControlRecordIds = Objects.requireNonNull($.accessControlRecordIds, "expected parameter 'accessControlRecordIds' to be non-null");
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.managerName = Objects.requireNonNull($.managerName, "expected parameter 'managerName' to be non-null");
            $.monitoringStatus = Objects.requireNonNull($.monitoringStatus, "expected parameter 'monitoringStatus' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sizeInBytes = Objects.requireNonNull($.sizeInBytes, "expected parameter 'sizeInBytes' to be non-null");
            $.volumeContainerName = Objects.requireNonNull($.volumeContainerName, "expected parameter 'volumeContainerName' to be non-null");
            $.volumeStatus = Objects.requireNonNull($.volumeStatus, "expected parameter 'volumeStatus' to be non-null");
            $.volumeType = Objects.requireNonNull($.volumeType, "expected parameter 'volumeType' to be non-null");
            return $;
        }
    }

}
