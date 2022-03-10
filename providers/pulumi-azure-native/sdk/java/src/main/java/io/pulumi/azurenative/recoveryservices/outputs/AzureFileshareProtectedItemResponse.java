// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.AzureFileshareProtectedItemExtendedInfoResponse;
import io.pulumi.azurenative.recoveryservices.outputs.KPIResourceHealthDetailsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureFileshareProtectedItemResponse {
    /**
     * Type of backup management for the backed up item.
     * 
     */
    private final @Nullable String backupManagementType;
    /**
     * Name of the backup set the backup item belongs to
     * 
     */
    private final @Nullable String backupSetName;
    /**
     * Unique name of container
     * 
     */
    private final @Nullable String containerName;
    /**
     * Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
     */
    private final @Nullable String createMode;
    /**
     * Time for deferred deletion in UTC
     * 
     */
    private final @Nullable String deferredDeleteTimeInUTC;
    /**
     * Time remaining before the DS marked for deferred delete is permanently deleted
     * 
     */
    private final @Nullable String deferredDeleteTimeRemaining;
    /**
     * Additional information with this backup item.
     * 
     */
    private final @Nullable AzureFileshareProtectedItemExtendedInfoResponse extendedInfo;
    /**
     * Friendly name of the fileshare represented by this backup item.
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * Flag to identify whether the deferred deleted DS is to be purged soon
     * 
     */
    private final @Nullable Boolean isDeferredDeleteScheduleUpcoming;
    /**
     * Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
     */
    private final @Nullable Boolean isRehydrate;
    /**
     * Flag to identify whether the DS is scheduled for deferred delete
     * 
     */
    private final @Nullable Boolean isScheduledForDeferredDelete;
    /**
     * Health details of different KPIs
     * 
     */
    private final @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths;
    /**
     * Last backup operation status. Possible values: Healthy, Unhealthy.
     * 
     */
    private final @Nullable String lastBackupStatus;
    /**
     * Timestamp of the last backup operation on this backup item.
     * 
     */
    private final @Nullable String lastBackupTime;
    /**
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
     */
    private final @Nullable String lastRecoveryPoint;
    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    private final @Nullable String policyId;
    /**
     * backup item type.
     * Expected value is 'AzureFileShareProtectedItem'.
     * 
     */
    private final String protectedItemType;
    /**
     * Backup state of this backup item.
     * 
     */
    private final @Nullable String protectionState;
    /**
     * Backup status of this backup item.
     * 
     */
    private final @Nullable String protectionStatus;
    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    private final @Nullable String sourceResourceId;
    /**
     * Type of workload this item represents.
     * 
     */
    private final @Nullable String workloadType;

    @OutputCustomType.Constructor
    private AzureFileshareProtectedItemResponse(
        @OutputCustomType.Parameter("backupManagementType") @Nullable String backupManagementType,
        @OutputCustomType.Parameter("backupSetName") @Nullable String backupSetName,
        @OutputCustomType.Parameter("containerName") @Nullable String containerName,
        @OutputCustomType.Parameter("createMode") @Nullable String createMode,
        @OutputCustomType.Parameter("deferredDeleteTimeInUTC") @Nullable String deferredDeleteTimeInUTC,
        @OutputCustomType.Parameter("deferredDeleteTimeRemaining") @Nullable String deferredDeleteTimeRemaining,
        @OutputCustomType.Parameter("extendedInfo") @Nullable AzureFileshareProtectedItemExtendedInfoResponse extendedInfo,
        @OutputCustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @OutputCustomType.Parameter("isDeferredDeleteScheduleUpcoming") @Nullable Boolean isDeferredDeleteScheduleUpcoming,
        @OutputCustomType.Parameter("isRehydrate") @Nullable Boolean isRehydrate,
        @OutputCustomType.Parameter("isScheduledForDeferredDelete") @Nullable Boolean isScheduledForDeferredDelete,
        @OutputCustomType.Parameter("kpisHealths") @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths,
        @OutputCustomType.Parameter("lastBackupStatus") @Nullable String lastBackupStatus,
        @OutputCustomType.Parameter("lastBackupTime") @Nullable String lastBackupTime,
        @OutputCustomType.Parameter("lastRecoveryPoint") @Nullable String lastRecoveryPoint,
        @OutputCustomType.Parameter("policyId") @Nullable String policyId,
        @OutputCustomType.Parameter("protectedItemType") String protectedItemType,
        @OutputCustomType.Parameter("protectionState") @Nullable String protectionState,
        @OutputCustomType.Parameter("protectionStatus") @Nullable String protectionStatus,
        @OutputCustomType.Parameter("sourceResourceId") @Nullable String sourceResourceId,
        @OutputCustomType.Parameter("workloadType") @Nullable String workloadType) {
        this.backupManagementType = backupManagementType;
        this.backupSetName = backupSetName;
        this.containerName = containerName;
        this.createMode = createMode;
        this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        this.extendedInfo = extendedInfo;
        this.friendlyName = friendlyName;
        this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = isRehydrate;
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        this.kpisHealths = kpisHealths;
        this.lastBackupStatus = lastBackupStatus;
        this.lastBackupTime = lastBackupTime;
        this.lastRecoveryPoint = lastRecoveryPoint;
        this.policyId = policyId;
        this.protectedItemType = protectedItemType;
        this.protectionState = protectionState;
        this.protectionStatus = protectionStatus;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    /**
     * Type of backup management for the backed up item.
     * 
    */
    public Optional<String> getBackupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }
    /**
     * Name of the backup set the backup item belongs to
     * 
    */
    public Optional<String> getBackupSetName() {
        return Optional.ofNullable(this.backupSetName);
    }
    /**
     * Unique name of container
     * 
    */
    public Optional<String> getContainerName() {
        return Optional.ofNullable(this.containerName);
    }
    /**
     * Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
    */
    public Optional<String> getCreateMode() {
        return Optional.ofNullable(this.createMode);
    }
    /**
     * Time for deferred deletion in UTC
     * 
    */
    public Optional<String> getDeferredDeleteTimeInUTC() {
        return Optional.ofNullable(this.deferredDeleteTimeInUTC);
    }
    /**
     * Time remaining before the DS marked for deferred delete is permanently deleted
     * 
    */
    public Optional<String> getDeferredDeleteTimeRemaining() {
        return Optional.ofNullable(this.deferredDeleteTimeRemaining);
    }
    /**
     * Additional information with this backup item.
     * 
    */
    public Optional<AzureFileshareProtectedItemExtendedInfoResponse> getExtendedInfo() {
        return Optional.ofNullable(this.extendedInfo);
    }
    /**
     * Friendly name of the fileshare represented by this backup item.
     * 
    */
    public Optional<String> getFriendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * Flag to identify whether the deferred deleted DS is to be purged soon
     * 
    */
    public Optional<Boolean> getIsDeferredDeleteScheduleUpcoming() {
        return Optional.ofNullable(this.isDeferredDeleteScheduleUpcoming);
    }
    /**
     * Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
    */
    public Optional<Boolean> getIsRehydrate() {
        return Optional.ofNullable(this.isRehydrate);
    }
    /**
     * Flag to identify whether the DS is scheduled for deferred delete
     * 
    */
    public Optional<Boolean> getIsScheduledForDeferredDelete() {
        return Optional.ofNullable(this.isScheduledForDeferredDelete);
    }
    /**
     * Health details of different KPIs
     * 
    */
    public Map<String,KPIResourceHealthDetailsResponse> getKpisHealths() {
        return this.kpisHealths == null ? Map.of() : this.kpisHealths;
    }
    /**
     * Last backup operation status. Possible values: Healthy, Unhealthy.
     * 
    */
    public Optional<String> getLastBackupStatus() {
        return Optional.ofNullable(this.lastBackupStatus);
    }
    /**
     * Timestamp of the last backup operation on this backup item.
     * 
    */
    public Optional<String> getLastBackupTime() {
        return Optional.ofNullable(this.lastBackupTime);
    }
    /**
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
    */
    public Optional<String> getLastRecoveryPoint() {
        return Optional.ofNullable(this.lastRecoveryPoint);
    }
    /**
     * ID of the backup policy with which this item is backed up.
     * 
    */
    public Optional<String> getPolicyId() {
        return Optional.ofNullable(this.policyId);
    }
    /**
     * backup item type.
     * Expected value is 'AzureFileShareProtectedItem'.
     * 
    */
    public String getProtectedItemType() {
        return this.protectedItemType;
    }
    /**
     * Backup state of this backup item.
     * 
    */
    public Optional<String> getProtectionState() {
        return Optional.ofNullable(this.protectionState);
    }
    /**
     * Backup status of this backup item.
     * 
    */
    public Optional<String> getProtectionStatus() {
        return Optional.ofNullable(this.protectionStatus);
    }
    /**
     * ARM ID of the resource to be backed up.
     * 
    */
    public Optional<String> getSourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }
    /**
     * Type of workload this item represents.
     * 
    */
    public Optional<String> getWorkloadType() {
        return Optional.ofNullable(this.workloadType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileshareProtectedItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private @Nullable String backupSetName;
        private @Nullable String containerName;
        private @Nullable String createMode;
        private @Nullable String deferredDeleteTimeInUTC;
        private @Nullable String deferredDeleteTimeRemaining;
        private @Nullable AzureFileshareProtectedItemExtendedInfoResponse extendedInfo;
        private @Nullable String friendlyName;
        private @Nullable Boolean isDeferredDeleteScheduleUpcoming;
        private @Nullable Boolean isRehydrate;
        private @Nullable Boolean isScheduledForDeferredDelete;
        private @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths;
        private @Nullable String lastBackupStatus;
        private @Nullable String lastBackupTime;
        private @Nullable String lastRecoveryPoint;
        private @Nullable String policyId;
        private String protectedItemType;
        private @Nullable String protectionState;
        private @Nullable String protectionStatus;
        private @Nullable String sourceResourceId;
        private @Nullable String workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFileshareProtectedItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.backupSetName = defaults.backupSetName;
    	      this.containerName = defaults.containerName;
    	      this.createMode = defaults.createMode;
    	      this.deferredDeleteTimeInUTC = defaults.deferredDeleteTimeInUTC;
    	      this.deferredDeleteTimeRemaining = defaults.deferredDeleteTimeRemaining;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.isDeferredDeleteScheduleUpcoming = defaults.isDeferredDeleteScheduleUpcoming;
    	      this.isRehydrate = defaults.isRehydrate;
    	      this.isScheduledForDeferredDelete = defaults.isScheduledForDeferredDelete;
    	      this.kpisHealths = defaults.kpisHealths;
    	      this.lastBackupStatus = defaults.lastBackupStatus;
    	      this.lastBackupTime = defaults.lastBackupTime;
    	      this.lastRecoveryPoint = defaults.lastRecoveryPoint;
    	      this.policyId = defaults.policyId;
    	      this.protectedItemType = defaults.protectedItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.protectionStatus = defaults.protectionStatus;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.workloadType = defaults.workloadType;
        }

        public Builder backupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder backupSetName(@Nullable String backupSetName) {
            this.backupSetName = backupSetName;
            return this;
        }

        public Builder containerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder createMode(@Nullable String createMode) {
            this.createMode = createMode;
            return this;
        }

        public Builder deferredDeleteTimeInUTC(@Nullable String deferredDeleteTimeInUTC) {
            this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
            return this;
        }

        public Builder deferredDeleteTimeRemaining(@Nullable String deferredDeleteTimeRemaining) {
            this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
            return this;
        }

        public Builder extendedInfo(@Nullable AzureFileshareProtectedItemExtendedInfoResponse extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder isDeferredDeleteScheduleUpcoming(@Nullable Boolean isDeferredDeleteScheduleUpcoming) {
            this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
            return this;
        }

        public Builder isRehydrate(@Nullable Boolean isRehydrate) {
            this.isRehydrate = isRehydrate;
            return this;
        }

        public Builder isScheduledForDeferredDelete(@Nullable Boolean isScheduledForDeferredDelete) {
            this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
            return this;
        }

        public Builder kpisHealths(@Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths) {
            this.kpisHealths = kpisHealths;
            return this;
        }

        public Builder lastBackupStatus(@Nullable String lastBackupStatus) {
            this.lastBackupStatus = lastBackupStatus;
            return this;
        }

        public Builder lastBackupTime(@Nullable String lastBackupTime) {
            this.lastBackupTime = lastBackupTime;
            return this;
        }

        public Builder lastRecoveryPoint(@Nullable String lastRecoveryPoint) {
            this.lastRecoveryPoint = lastRecoveryPoint;
            return this;
        }

        public Builder policyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder protectedItemType(String protectedItemType) {
            this.protectedItemType = Objects.requireNonNull(protectedItemType);
            return this;
        }

        public Builder protectionState(@Nullable String protectionState) {
            this.protectionState = protectionState;
            return this;
        }

        public Builder protectionStatus(@Nullable String protectionStatus) {
            this.protectionStatus = protectionStatus;
            return this;
        }

        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder workloadType(@Nullable String workloadType) {
            this.workloadType = workloadType;
            return this;
        }
        public AzureFileshareProtectedItemResponse build() {
            return new AzureFileshareProtectedItemResponse(backupManagementType, backupSetName, containerName, createMode, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, extendedInfo, friendlyName, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, kpisHealths, lastBackupStatus, lastBackupTime, lastRecoveryPoint, policyId, protectedItemType, protectionState, protectionStatus, sourceResourceId, workloadType);
        }
    }
}
