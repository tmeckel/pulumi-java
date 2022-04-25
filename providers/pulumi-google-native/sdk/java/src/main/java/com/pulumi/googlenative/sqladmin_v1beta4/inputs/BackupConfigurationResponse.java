// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.BackupRetentionSettingsResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Database instance backup configuration.
 * 
 */
public final class BackupConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final BackupConfigurationResponse Empty = new BackupConfigurationResponse();

    /**
     * Backup retention settings.
     * 
     */
    @Import(name="backupRetentionSettings", required=true)
    private BackupRetentionSettingsResponse backupRetentionSettings;

    /**
     * @return Backup retention settings.
     * 
     */
    public BackupRetentionSettingsResponse backupRetentionSettings() {
        return this.backupRetentionSettings;
    }

    /**
     * (MySQL only) Whether binary log is enabled. If backup configuration is disabled, binarylog must be disabled as well.
     * 
     */
    @Import(name="binaryLogEnabled", required=true)
    private Boolean binaryLogEnabled;

    /**
     * @return (MySQL only) Whether binary log is enabled. If backup configuration is disabled, binarylog must be disabled as well.
     * 
     */
    public Boolean binaryLogEnabled() {
        return this.binaryLogEnabled;
    }

    /**
     * Whether this configuration is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Boolean enabled;

    /**
     * @return Whether this configuration is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * This is always `sql#backupConfiguration`.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    /**
     * @return This is always `sql#backupConfiguration`.
     * 
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Location of the backup
     * 
     */
    @Import(name="location", required=true)
    private String location;

    /**
     * @return Location of the backup
     * 
     */
    public String location() {
        return this.location;
    }

    /**
     * (Postgres only) Whether point in time recovery is enabled.
     * 
     */
    @Import(name="pointInTimeRecoveryEnabled", required=true)
    private Boolean pointInTimeRecoveryEnabled;

    /**
     * @return (Postgres only) Whether point in time recovery is enabled.
     * 
     */
    public Boolean pointInTimeRecoveryEnabled() {
        return this.pointInTimeRecoveryEnabled;
    }

    /**
     * Reserved for future use.
     * 
     */
    @Import(name="replicationLogArchivingEnabled", required=true)
    private Boolean replicationLogArchivingEnabled;

    /**
     * @return Reserved for future use.
     * 
     */
    public Boolean replicationLogArchivingEnabled() {
        return this.replicationLogArchivingEnabled;
    }

    /**
     * Start time for the daily backup configuration in UTC timezone in the 24 hour format - `HH:MM`.
     * 
     */
    @Import(name="startTime", required=true)
    private String startTime;

    /**
     * @return Start time for the daily backup configuration in UTC timezone in the 24 hour format - `HH:MM`.
     * 
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * The number of days of transaction logs we retain for point in time restore, from 1-7.
     * 
     */
    @Import(name="transactionLogRetentionDays", required=true)
    private Integer transactionLogRetentionDays;

    /**
     * @return The number of days of transaction logs we retain for point in time restore, from 1-7.
     * 
     */
    public Integer transactionLogRetentionDays() {
        return this.transactionLogRetentionDays;
    }

    private BackupConfigurationResponse() {}

    private BackupConfigurationResponse(BackupConfigurationResponse $) {
        this.backupRetentionSettings = $.backupRetentionSettings;
        this.binaryLogEnabled = $.binaryLogEnabled;
        this.enabled = $.enabled;
        this.kind = $.kind;
        this.location = $.location;
        this.pointInTimeRecoveryEnabled = $.pointInTimeRecoveryEnabled;
        this.replicationLogArchivingEnabled = $.replicationLogArchivingEnabled;
        this.startTime = $.startTime;
        this.transactionLogRetentionDays = $.transactionLogRetentionDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupConfigurationResponse $;

        public Builder() {
            $ = new BackupConfigurationResponse();
        }

        public Builder(BackupConfigurationResponse defaults) {
            $ = new BackupConfigurationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupRetentionSettings Backup retention settings.
         * 
         * @return builder
         * 
         */
        public Builder backupRetentionSettings(BackupRetentionSettingsResponse backupRetentionSettings) {
            $.backupRetentionSettings = backupRetentionSettings;
            return this;
        }

        /**
         * @param binaryLogEnabled (MySQL only) Whether binary log is enabled. If backup configuration is disabled, binarylog must be disabled as well.
         * 
         * @return builder
         * 
         */
        public Builder binaryLogEnabled(Boolean binaryLogEnabled) {
            $.binaryLogEnabled = binaryLogEnabled;
            return this;
        }

        /**
         * @param enabled Whether this configuration is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param kind This is always `sql#backupConfiguration`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param location Location of the backup
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            $.location = location;
            return this;
        }

        /**
         * @param pointInTimeRecoveryEnabled (Postgres only) Whether point in time recovery is enabled.
         * 
         * @return builder
         * 
         */
        public Builder pointInTimeRecoveryEnabled(Boolean pointInTimeRecoveryEnabled) {
            $.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
            return this;
        }

        /**
         * @param replicationLogArchivingEnabled Reserved for future use.
         * 
         * @return builder
         * 
         */
        public Builder replicationLogArchivingEnabled(Boolean replicationLogArchivingEnabled) {
            $.replicationLogArchivingEnabled = replicationLogArchivingEnabled;
            return this;
        }

        /**
         * @param startTime Start time for the daily backup configuration in UTC timezone in the 24 hour format - `HH:MM`.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param transactionLogRetentionDays The number of days of transaction logs we retain for point in time restore, from 1-7.
         * 
         * @return builder
         * 
         */
        public Builder transactionLogRetentionDays(Integer transactionLogRetentionDays) {
            $.transactionLogRetentionDays = transactionLogRetentionDays;
            return this;
        }

        public BackupConfigurationResponse build() {
            $.backupRetentionSettings = Objects.requireNonNull($.backupRetentionSettings, "expected parameter 'backupRetentionSettings' to be non-null");
            $.binaryLogEnabled = Objects.requireNonNull($.binaryLogEnabled, "expected parameter 'binaryLogEnabled' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.pointInTimeRecoveryEnabled = Objects.requireNonNull($.pointInTimeRecoveryEnabled, "expected parameter 'pointInTimeRecoveryEnabled' to be non-null");
            $.replicationLogArchivingEnabled = Objects.requireNonNull($.replicationLogArchivingEnabled, "expected parameter 'replicationLogArchivingEnabled' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            $.transactionLogRetentionDays = Objects.requireNonNull($.transactionLogRetentionDays, "expected parameter 'transactionLogRetentionDays' to be non-null");
            return $;
        }
    }

}
