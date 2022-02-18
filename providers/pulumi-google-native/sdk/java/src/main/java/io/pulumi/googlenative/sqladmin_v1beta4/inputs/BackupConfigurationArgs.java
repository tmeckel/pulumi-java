// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.BackupRetentionSettingsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Database instance backup configuration.
 * 
 */
public final class BackupConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupConfigurationArgs Empty = new BackupConfigurationArgs();

    /**
     * Backup retention settings.
     * 
     */
    @InputImport(name="backupRetentionSettings")
    private final @Nullable Input<BackupRetentionSettingsArgs> backupRetentionSettings;

    public Input<BackupRetentionSettingsArgs> getBackupRetentionSettings() {
        return this.backupRetentionSettings == null ? Input.empty() : this.backupRetentionSettings;
    }

    /**
     * (MySQL only) Whether binary log is enabled. If backup configuration is disabled, binarylog must be disabled as well.
     * 
     */
    @InputImport(name="binaryLogEnabled")
    private final @Nullable Input<Boolean> binaryLogEnabled;

    public Input<Boolean> getBinaryLogEnabled() {
        return this.binaryLogEnabled == null ? Input.empty() : this.binaryLogEnabled;
    }

    /**
     * Whether this configuration is enabled.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * This is always `sql#backupConfiguration`.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Location of the backup
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * (Postgres only) Whether point in time recovery is enabled.
     * 
     */
    @InputImport(name="pointInTimeRecoveryEnabled")
    private final @Nullable Input<Boolean> pointInTimeRecoveryEnabled;

    public Input<Boolean> getPointInTimeRecoveryEnabled() {
        return this.pointInTimeRecoveryEnabled == null ? Input.empty() : this.pointInTimeRecoveryEnabled;
    }

    /**
     * Reserved for future use.
     * 
     */
    @InputImport(name="replicationLogArchivingEnabled")
    private final @Nullable Input<Boolean> replicationLogArchivingEnabled;

    public Input<Boolean> getReplicationLogArchivingEnabled() {
        return this.replicationLogArchivingEnabled == null ? Input.empty() : this.replicationLogArchivingEnabled;
    }

    /**
     * Start time for the daily backup configuration in UTC timezone in the 24 hour format - `HH:MM`.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * The number of days of transaction logs we retain for point in time restore, from 1-7.
     * 
     */
    @InputImport(name="transactionLogRetentionDays")
    private final @Nullable Input<Integer> transactionLogRetentionDays;

    public Input<Integer> getTransactionLogRetentionDays() {
        return this.transactionLogRetentionDays == null ? Input.empty() : this.transactionLogRetentionDays;
    }

    public BackupConfigurationArgs(
        @Nullable Input<BackupRetentionSettingsArgs> backupRetentionSettings,
        @Nullable Input<Boolean> binaryLogEnabled,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<Boolean> pointInTimeRecoveryEnabled,
        @Nullable Input<Boolean> replicationLogArchivingEnabled,
        @Nullable Input<String> startTime,
        @Nullable Input<Integer> transactionLogRetentionDays) {
        this.backupRetentionSettings = backupRetentionSettings;
        this.binaryLogEnabled = binaryLogEnabled;
        this.enabled = enabled;
        this.kind = kind;
        this.location = location;
        this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
        this.replicationLogArchivingEnabled = replicationLogArchivingEnabled;
        this.startTime = startTime;
        this.transactionLogRetentionDays = transactionLogRetentionDays;
    }

    private BackupConfigurationArgs() {
        this.backupRetentionSettings = Input.empty();
        this.binaryLogEnabled = Input.empty();
        this.enabled = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.pointInTimeRecoveryEnabled = Input.empty();
        this.replicationLogArchivingEnabled = Input.empty();
        this.startTime = Input.empty();
        this.transactionLogRetentionDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BackupRetentionSettingsArgs> backupRetentionSettings;
        private @Nullable Input<Boolean> binaryLogEnabled;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<Boolean> pointInTimeRecoveryEnabled;
        private @Nullable Input<Boolean> replicationLogArchivingEnabled;
        private @Nullable Input<String> startTime;
        private @Nullable Input<Integer> transactionLogRetentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupRetentionSettings = defaults.backupRetentionSettings;
    	      this.binaryLogEnabled = defaults.binaryLogEnabled;
    	      this.enabled = defaults.enabled;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.pointInTimeRecoveryEnabled = defaults.pointInTimeRecoveryEnabled;
    	      this.replicationLogArchivingEnabled = defaults.replicationLogArchivingEnabled;
    	      this.startTime = defaults.startTime;
    	      this.transactionLogRetentionDays = defaults.transactionLogRetentionDays;
        }

        public Builder setBackupRetentionSettings(@Nullable Input<BackupRetentionSettingsArgs> backupRetentionSettings) {
            this.backupRetentionSettings = backupRetentionSettings;
            return this;
        }

        public Builder setBackupRetentionSettings(@Nullable BackupRetentionSettingsArgs backupRetentionSettings) {
            this.backupRetentionSettings = Input.ofNullable(backupRetentionSettings);
            return this;
        }

        public Builder setBinaryLogEnabled(@Nullable Input<Boolean> binaryLogEnabled) {
            this.binaryLogEnabled = binaryLogEnabled;
            return this;
        }

        public Builder setBinaryLogEnabled(@Nullable Boolean binaryLogEnabled) {
            this.binaryLogEnabled = Input.ofNullable(binaryLogEnabled);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPointInTimeRecoveryEnabled(@Nullable Input<Boolean> pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
            return this;
        }

        public Builder setPointInTimeRecoveryEnabled(@Nullable Boolean pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = Input.ofNullable(pointInTimeRecoveryEnabled);
            return this;
        }

        public Builder setReplicationLogArchivingEnabled(@Nullable Input<Boolean> replicationLogArchivingEnabled) {
            this.replicationLogArchivingEnabled = replicationLogArchivingEnabled;
            return this;
        }

        public Builder setReplicationLogArchivingEnabled(@Nullable Boolean replicationLogArchivingEnabled) {
            this.replicationLogArchivingEnabled = Input.ofNullable(replicationLogArchivingEnabled);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setTransactionLogRetentionDays(@Nullable Input<Integer> transactionLogRetentionDays) {
            this.transactionLogRetentionDays = transactionLogRetentionDays;
            return this;
        }

        public Builder setTransactionLogRetentionDays(@Nullable Integer transactionLogRetentionDays) {
            this.transactionLogRetentionDays = Input.ofNullable(transactionLogRetentionDays);
            return this;
        }

        public BackupConfigurationArgs build() {
            return new BackupConfigurationArgs(backupRetentionSettings, binaryLogEnabled, enabled, kind, location, pointInTimeRecoveryEnabled, replicationLogArchivingEnabled, startTime, transactionLogRetentionDays);
        }
    }
}
