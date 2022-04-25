// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.MabFileFolderProtectedItemExtendedInfoResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MAB workload-specific backup item.
 * 
 */
public final class MabFileFolderProtectedItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final MabFileFolderProtectedItemResponse Empty = new MabFileFolderProtectedItemResponse();

    /**
     * Type of backup management for the backed up item.
     * 
     */
    @Import(name="backupManagementType")
    private @Nullable String backupManagementType;

    /**
     * @return Type of backup management for the backed up item.
     * 
     */
    public Optional<String> backupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Name of the backup set the backup item belongs to
     * 
     */
    @Import(name="backupSetName")
    private @Nullable String backupSetName;

    /**
     * @return Name of the backup set the backup item belongs to
     * 
     */
    public Optional<String> backupSetName() {
        return Optional.ofNullable(this.backupSetName);
    }

    /**
     * Name of the computer associated with this backup item.
     * 
     */
    @Import(name="computerName")
    private @Nullable String computerName;

    /**
     * @return Name of the computer associated with this backup item.
     * 
     */
    public Optional<String> computerName() {
        return Optional.ofNullable(this.computerName);
    }

    /**
     * Unique name of container
     * 
     */
    @Import(name="containerName")
    private @Nullable String containerName;

    /**
     * @return Unique name of container
     * 
     */
    public Optional<String> containerName() {
        return Optional.ofNullable(this.containerName);
    }

    /**
     * Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
     */
    @Import(name="createMode")
    private @Nullable String createMode;

    /**
     * @return Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
     */
    public Optional<String> createMode() {
        return Optional.ofNullable(this.createMode);
    }

    /**
     * Sync time for deferred deletion in UTC
     * 
     */
    @Import(name="deferredDeleteSyncTimeInUTC")
    private @Nullable Double deferredDeleteSyncTimeInUTC;

    /**
     * @return Sync time for deferred deletion in UTC
     * 
     */
    public Optional<Double> deferredDeleteSyncTimeInUTC() {
        return Optional.ofNullable(this.deferredDeleteSyncTimeInUTC);
    }

    /**
     * Time for deferred deletion in UTC
     * 
     */
    @Import(name="deferredDeleteTimeInUTC")
    private @Nullable String deferredDeleteTimeInUTC;

    /**
     * @return Time for deferred deletion in UTC
     * 
     */
    public Optional<String> deferredDeleteTimeInUTC() {
        return Optional.ofNullable(this.deferredDeleteTimeInUTC);
    }

    /**
     * Time remaining before the DS marked for deferred delete is permanently deleted
     * 
     */
    @Import(name="deferredDeleteTimeRemaining")
    private @Nullable String deferredDeleteTimeRemaining;

    /**
     * @return Time remaining before the DS marked for deferred delete is permanently deleted
     * 
     */
    public Optional<String> deferredDeleteTimeRemaining() {
        return Optional.ofNullable(this.deferredDeleteTimeRemaining);
    }

    /**
     * Additional information with this backup item.
     * 
     */
    @Import(name="extendedInfo")
    private @Nullable MabFileFolderProtectedItemExtendedInfoResponse extendedInfo;

    /**
     * @return Additional information with this backup item.
     * 
     */
    public Optional<MabFileFolderProtectedItemExtendedInfoResponse> extendedInfo() {
        return Optional.ofNullable(this.extendedInfo);
    }

    /**
     * Friendly name of this backup item.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable String friendlyName;

    /**
     * @return Friendly name of this backup item.
     * 
     */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * Flag to identify whether the deferred deleted DS is to be purged soon
     * 
     */
    @Import(name="isDeferredDeleteScheduleUpcoming")
    private @Nullable Boolean isDeferredDeleteScheduleUpcoming;

    /**
     * @return Flag to identify whether the deferred deleted DS is to be purged soon
     * 
     */
    public Optional<Boolean> isDeferredDeleteScheduleUpcoming() {
        return Optional.ofNullable(this.isDeferredDeleteScheduleUpcoming);
    }

    /**
     * Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
     */
    @Import(name="isRehydrate")
    private @Nullable Boolean isRehydrate;

    /**
     * @return Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
     */
    public Optional<Boolean> isRehydrate() {
        return Optional.ofNullable(this.isRehydrate);
    }

    /**
     * Flag to identify whether the DS is scheduled for deferred delete
     * 
     */
    @Import(name="isScheduledForDeferredDelete")
    private @Nullable Boolean isScheduledForDeferredDelete;

    /**
     * @return Flag to identify whether the DS is scheduled for deferred delete
     * 
     */
    public Optional<Boolean> isScheduledForDeferredDelete() {
        return Optional.ofNullable(this.isScheduledForDeferredDelete);
    }

    /**
     * Status of last backup operation.
     * 
     */
    @Import(name="lastBackupStatus")
    private @Nullable String lastBackupStatus;

    /**
     * @return Status of last backup operation.
     * 
     */
    public Optional<String> lastBackupStatus() {
        return Optional.ofNullable(this.lastBackupStatus);
    }

    /**
     * Timestamp of the last backup operation on this backup item.
     * 
     */
    @Import(name="lastBackupTime")
    private @Nullable String lastBackupTime;

    /**
     * @return Timestamp of the last backup operation on this backup item.
     * 
     */
    public Optional<String> lastBackupTime() {
        return Optional.ofNullable(this.lastBackupTime);
    }

    /**
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
     */
    @Import(name="lastRecoveryPoint")
    private @Nullable String lastRecoveryPoint;

    /**
     * @return Timestamp when the last (latest) backup copy was created for this backup item.
     * 
     */
    public Optional<String> lastRecoveryPoint() {
        return Optional.ofNullable(this.lastRecoveryPoint);
    }

    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    @Import(name="policyId")
    private @Nullable String policyId;

    /**
     * @return ID of the backup policy with which this item is backed up.
     * 
     */
    public Optional<String> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    /**
     * backup item type.
     * Expected value is &#39;MabFileFolderProtectedItem&#39;.
     * 
     */
    @Import(name="protectedItemType", required=true)
    private String protectedItemType;

    /**
     * @return backup item type.
     * Expected value is &#39;MabFileFolderProtectedItem&#39;.
     * 
     */
    public String protectedItemType() {
        return this.protectedItemType;
    }

    /**
     * Protected, ProtectionStopped, IRPending or ProtectionError
     * 
     */
    @Import(name="protectionState")
    private @Nullable String protectionState;

    /**
     * @return Protected, ProtectionStopped, IRPending or ProtectionError
     * 
     */
    public Optional<String> protectionState() {
        return Optional.ofNullable(this.protectionState);
    }

    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    @Import(name="sourceResourceId")
    private @Nullable String sourceResourceId;

    /**
     * @return ARM ID of the resource to be backed up.
     * 
     */
    public Optional<String> sourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }

    /**
     * Type of workload this item represents.
     * 
     */
    @Import(name="workloadType")
    private @Nullable String workloadType;

    /**
     * @return Type of workload this item represents.
     * 
     */
    public Optional<String> workloadType() {
        return Optional.ofNullable(this.workloadType);
    }

    private MabFileFolderProtectedItemResponse() {}

    private MabFileFolderProtectedItemResponse(MabFileFolderProtectedItemResponse $) {
        this.backupManagementType = $.backupManagementType;
        this.backupSetName = $.backupSetName;
        this.computerName = $.computerName;
        this.containerName = $.containerName;
        this.createMode = $.createMode;
        this.deferredDeleteSyncTimeInUTC = $.deferredDeleteSyncTimeInUTC;
        this.deferredDeleteTimeInUTC = $.deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = $.deferredDeleteTimeRemaining;
        this.extendedInfo = $.extendedInfo;
        this.friendlyName = $.friendlyName;
        this.isDeferredDeleteScheduleUpcoming = $.isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = $.isRehydrate;
        this.isScheduledForDeferredDelete = $.isScheduledForDeferredDelete;
        this.lastBackupStatus = $.lastBackupStatus;
        this.lastBackupTime = $.lastBackupTime;
        this.lastRecoveryPoint = $.lastRecoveryPoint;
        this.policyId = $.policyId;
        this.protectedItemType = $.protectedItemType;
        this.protectionState = $.protectionState;
        this.sourceResourceId = $.sourceResourceId;
        this.workloadType = $.workloadType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MabFileFolderProtectedItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MabFileFolderProtectedItemResponse $;

        public Builder() {
            $ = new MabFileFolderProtectedItemResponse();
        }

        public Builder(MabFileFolderProtectedItemResponse defaults) {
            $ = new MabFileFolderProtectedItemResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupManagementType Type of backup management for the backed up item.
         * 
         * @return builder
         * 
         */
        public Builder backupManagementType(@Nullable String backupManagementType) {
            $.backupManagementType = backupManagementType;
            return this;
        }

        /**
         * @param backupSetName Name of the backup set the backup item belongs to
         * 
         * @return builder
         * 
         */
        public Builder backupSetName(@Nullable String backupSetName) {
            $.backupSetName = backupSetName;
            return this;
        }

        /**
         * @param computerName Name of the computer associated with this backup item.
         * 
         * @return builder
         * 
         */
        public Builder computerName(@Nullable String computerName) {
            $.computerName = computerName;
            return this;
        }

        /**
         * @param containerName Unique name of container
         * 
         * @return builder
         * 
         */
        public Builder containerName(@Nullable String containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param createMode Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
         * 
         * @return builder
         * 
         */
        public Builder createMode(@Nullable String createMode) {
            $.createMode = createMode;
            return this;
        }

        /**
         * @param deferredDeleteSyncTimeInUTC Sync time for deferred deletion in UTC
         * 
         * @return builder
         * 
         */
        public Builder deferredDeleteSyncTimeInUTC(@Nullable Double deferredDeleteSyncTimeInUTC) {
            $.deferredDeleteSyncTimeInUTC = deferredDeleteSyncTimeInUTC;
            return this;
        }

        /**
         * @param deferredDeleteTimeInUTC Time for deferred deletion in UTC
         * 
         * @return builder
         * 
         */
        public Builder deferredDeleteTimeInUTC(@Nullable String deferredDeleteTimeInUTC) {
            $.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
            return this;
        }

        /**
         * @param deferredDeleteTimeRemaining Time remaining before the DS marked for deferred delete is permanently deleted
         * 
         * @return builder
         * 
         */
        public Builder deferredDeleteTimeRemaining(@Nullable String deferredDeleteTimeRemaining) {
            $.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
            return this;
        }

        /**
         * @param extendedInfo Additional information with this backup item.
         * 
         * @return builder
         * 
         */
        public Builder extendedInfo(@Nullable MabFileFolderProtectedItemExtendedInfoResponse extendedInfo) {
            $.extendedInfo = extendedInfo;
            return this;
        }

        /**
         * @param friendlyName Friendly name of this backup item.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable String friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param isDeferredDeleteScheduleUpcoming Flag to identify whether the deferred deleted DS is to be purged soon
         * 
         * @return builder
         * 
         */
        public Builder isDeferredDeleteScheduleUpcoming(@Nullable Boolean isDeferredDeleteScheduleUpcoming) {
            $.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
            return this;
        }

        /**
         * @param isRehydrate Flag to identify that deferred deleted DS is to be moved into Pause state
         * 
         * @return builder
         * 
         */
        public Builder isRehydrate(@Nullable Boolean isRehydrate) {
            $.isRehydrate = isRehydrate;
            return this;
        }

        /**
         * @param isScheduledForDeferredDelete Flag to identify whether the DS is scheduled for deferred delete
         * 
         * @return builder
         * 
         */
        public Builder isScheduledForDeferredDelete(@Nullable Boolean isScheduledForDeferredDelete) {
            $.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
            return this;
        }

        /**
         * @param lastBackupStatus Status of last backup operation.
         * 
         * @return builder
         * 
         */
        public Builder lastBackupStatus(@Nullable String lastBackupStatus) {
            $.lastBackupStatus = lastBackupStatus;
            return this;
        }

        /**
         * @param lastBackupTime Timestamp of the last backup operation on this backup item.
         * 
         * @return builder
         * 
         */
        public Builder lastBackupTime(@Nullable String lastBackupTime) {
            $.lastBackupTime = lastBackupTime;
            return this;
        }

        /**
         * @param lastRecoveryPoint Timestamp when the last (latest) backup copy was created for this backup item.
         * 
         * @return builder
         * 
         */
        public Builder lastRecoveryPoint(@Nullable String lastRecoveryPoint) {
            $.lastRecoveryPoint = lastRecoveryPoint;
            return this;
        }

        /**
         * @param policyId ID of the backup policy with which this item is backed up.
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable String policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param protectedItemType backup item type.
         * Expected value is &#39;MabFileFolderProtectedItem&#39;.
         * 
         * @return builder
         * 
         */
        public Builder protectedItemType(String protectedItemType) {
            $.protectedItemType = protectedItemType;
            return this;
        }

        /**
         * @param protectionState Protected, ProtectionStopped, IRPending or ProtectionError
         * 
         * @return builder
         * 
         */
        public Builder protectionState(@Nullable String protectionState) {
            $.protectionState = protectionState;
            return this;
        }

        /**
         * @param sourceResourceId ARM ID of the resource to be backed up.
         * 
         * @return builder
         * 
         */
        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            $.sourceResourceId = sourceResourceId;
            return this;
        }

        /**
         * @param workloadType Type of workload this item represents.
         * 
         * @return builder
         * 
         */
        public Builder workloadType(@Nullable String workloadType) {
            $.workloadType = workloadType;
            return this;
        }

        public MabFileFolderProtectedItemResponse build() {
            $.protectedItemType = Codegen.stringProp("protectedItemType").arg($.protectedItemType).require();
            return $;
        }
    }

}
