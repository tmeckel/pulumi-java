// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoBackupSettingsResponse {
    /**
     * @return Backup schedule type.
     * 
     */
    private final @Nullable String backupScheduleType;
    /**
     * @return Include or exclude system databases from auto backup.
     * 
     */
    private final @Nullable Boolean backupSystemDbs;
    /**
     * @return Enable or disable autobackup on SQL virtual machine.
     * 
     */
    private final @Nullable Boolean enable;
    /**
     * @return Enable or disable encryption for backup on SQL virtual machine.
     * 
     */
    private final @Nullable Boolean enableEncryption;
    /**
     * @return Frequency of full backups. In both cases, full backups begin during the next scheduled time window.
     * 
     */
    private final @Nullable String fullBackupFrequency;
    /**
     * @return Start time of a given day during which full backups can take place. 0-23 hours.
     * 
     */
    private final @Nullable Integer fullBackupStartTime;
    /**
     * @return Duration of the time window of a given day during which full backups can take place. 1-23 hours.
     * 
     */
    private final @Nullable Integer fullBackupWindowHours;
    /**
     * @return Frequency of log backups. 5-60 minutes.
     * 
     */
    private final @Nullable Integer logBackupFrequency;
    /**
     * @return Retention period of backup: 1-30 days.
     * 
     */
    private final @Nullable Integer retentionPeriod;
    /**
     * @return Storage account url where backup will be taken to.
     * 
     */
    private final @Nullable String storageAccountUrl;

    @CustomType.Constructor
    private AutoBackupSettingsResponse(
        @CustomType.Parameter("backupScheduleType") @Nullable String backupScheduleType,
        @CustomType.Parameter("backupSystemDbs") @Nullable Boolean backupSystemDbs,
        @CustomType.Parameter("enable") @Nullable Boolean enable,
        @CustomType.Parameter("enableEncryption") @Nullable Boolean enableEncryption,
        @CustomType.Parameter("fullBackupFrequency") @Nullable String fullBackupFrequency,
        @CustomType.Parameter("fullBackupStartTime") @Nullable Integer fullBackupStartTime,
        @CustomType.Parameter("fullBackupWindowHours") @Nullable Integer fullBackupWindowHours,
        @CustomType.Parameter("logBackupFrequency") @Nullable Integer logBackupFrequency,
        @CustomType.Parameter("retentionPeriod") @Nullable Integer retentionPeriod,
        @CustomType.Parameter("storageAccountUrl") @Nullable String storageAccountUrl) {
        this.backupScheduleType = backupScheduleType;
        this.backupSystemDbs = backupSystemDbs;
        this.enable = enable;
        this.enableEncryption = enableEncryption;
        this.fullBackupFrequency = fullBackupFrequency;
        this.fullBackupStartTime = fullBackupStartTime;
        this.fullBackupWindowHours = fullBackupWindowHours;
        this.logBackupFrequency = logBackupFrequency;
        this.retentionPeriod = retentionPeriod;
        this.storageAccountUrl = storageAccountUrl;
    }

    /**
     * @return Backup schedule type.
     * 
     */
    public Optional<String> backupScheduleType() {
        return Optional.ofNullable(this.backupScheduleType);
    }
    /**
     * @return Include or exclude system databases from auto backup.
     * 
     */
    public Optional<Boolean> backupSystemDbs() {
        return Optional.ofNullable(this.backupSystemDbs);
    }
    /**
     * @return Enable or disable autobackup on SQL virtual machine.
     * 
     */
    public Optional<Boolean> enable() {
        return Optional.ofNullable(this.enable);
    }
    /**
     * @return Enable or disable encryption for backup on SQL virtual machine.
     * 
     */
    public Optional<Boolean> enableEncryption() {
        return Optional.ofNullable(this.enableEncryption);
    }
    /**
     * @return Frequency of full backups. In both cases, full backups begin during the next scheduled time window.
     * 
     */
    public Optional<String> fullBackupFrequency() {
        return Optional.ofNullable(this.fullBackupFrequency);
    }
    /**
     * @return Start time of a given day during which full backups can take place. 0-23 hours.
     * 
     */
    public Optional<Integer> fullBackupStartTime() {
        return Optional.ofNullable(this.fullBackupStartTime);
    }
    /**
     * @return Duration of the time window of a given day during which full backups can take place. 1-23 hours.
     * 
     */
    public Optional<Integer> fullBackupWindowHours() {
        return Optional.ofNullable(this.fullBackupWindowHours);
    }
    /**
     * @return Frequency of log backups. 5-60 minutes.
     * 
     */
    public Optional<Integer> logBackupFrequency() {
        return Optional.ofNullable(this.logBackupFrequency);
    }
    /**
     * @return Retention period of backup: 1-30 days.
     * 
     */
    public Optional<Integer> retentionPeriod() {
        return Optional.ofNullable(this.retentionPeriod);
    }
    /**
     * @return Storage account url where backup will be taken to.
     * 
     */
    public Optional<String> storageAccountUrl() {
        return Optional.ofNullable(this.storageAccountUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoBackupSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupScheduleType;
        private @Nullable Boolean backupSystemDbs;
        private @Nullable Boolean enable;
        private @Nullable Boolean enableEncryption;
        private @Nullable String fullBackupFrequency;
        private @Nullable Integer fullBackupStartTime;
        private @Nullable Integer fullBackupWindowHours;
        private @Nullable Integer logBackupFrequency;
        private @Nullable Integer retentionPeriod;
        private @Nullable String storageAccountUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoBackupSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupScheduleType = defaults.backupScheduleType;
    	      this.backupSystemDbs = defaults.backupSystemDbs;
    	      this.enable = defaults.enable;
    	      this.enableEncryption = defaults.enableEncryption;
    	      this.fullBackupFrequency = defaults.fullBackupFrequency;
    	      this.fullBackupStartTime = defaults.fullBackupStartTime;
    	      this.fullBackupWindowHours = defaults.fullBackupWindowHours;
    	      this.logBackupFrequency = defaults.logBackupFrequency;
    	      this.retentionPeriod = defaults.retentionPeriod;
    	      this.storageAccountUrl = defaults.storageAccountUrl;
        }

        public Builder backupScheduleType(@Nullable String backupScheduleType) {
            this.backupScheduleType = backupScheduleType;
            return this;
        }
        public Builder backupSystemDbs(@Nullable Boolean backupSystemDbs) {
            this.backupSystemDbs = backupSystemDbs;
            return this;
        }
        public Builder enable(@Nullable Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Builder enableEncryption(@Nullable Boolean enableEncryption) {
            this.enableEncryption = enableEncryption;
            return this;
        }
        public Builder fullBackupFrequency(@Nullable String fullBackupFrequency) {
            this.fullBackupFrequency = fullBackupFrequency;
            return this;
        }
        public Builder fullBackupStartTime(@Nullable Integer fullBackupStartTime) {
            this.fullBackupStartTime = fullBackupStartTime;
            return this;
        }
        public Builder fullBackupWindowHours(@Nullable Integer fullBackupWindowHours) {
            this.fullBackupWindowHours = fullBackupWindowHours;
            return this;
        }
        public Builder logBackupFrequency(@Nullable Integer logBackupFrequency) {
            this.logBackupFrequency = logBackupFrequency;
            return this;
        }
        public Builder retentionPeriod(@Nullable Integer retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }
        public Builder storageAccountUrl(@Nullable String storageAccountUrl) {
            this.storageAccountUrl = storageAccountUrl;
            return this;
        }        public AutoBackupSettingsResponse build() {
            return new AutoBackupSettingsResponse(backupScheduleType, backupSystemDbs, enable, enableEncryption, fullBackupFrequency, fullBackupStartTime, fullBackupWindowHours, logBackupFrequency, retentionPeriod, storageAccountUrl);
        }
    }
}
