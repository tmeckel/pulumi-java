// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.sql.inputs.GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetDatabaseInstanceSettingBackupConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final GetDatabaseInstanceSettingBackupConfiguration Empty = new GetDatabaseInstanceSettingBackupConfiguration();

    @InputImport(name="backupRetentionSettings", required=true)
      private final List<GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting> backupRetentionSettings;

    public List<GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting> getBackupRetentionSettings() {
        return this.backupRetentionSettings;
    }

    @InputImport(name="binaryLogEnabled", required=true)
      private final Boolean binaryLogEnabled;

    public Boolean getBinaryLogEnabled() {
        return this.binaryLogEnabled;
    }

    @InputImport(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="pointInTimeRecoveryEnabled", required=true)
      private final Boolean pointInTimeRecoveryEnabled;

    public Boolean getPointInTimeRecoveryEnabled() {
        return this.pointInTimeRecoveryEnabled;
    }

    @InputImport(name="startTime", required=true)
      private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    @InputImport(name="transactionLogRetentionDays", required=true)
      private final Integer transactionLogRetentionDays;

    public Integer getTransactionLogRetentionDays() {
        return this.transactionLogRetentionDays;
    }

    public GetDatabaseInstanceSettingBackupConfiguration(
        List<GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting> backupRetentionSettings,
        Boolean binaryLogEnabled,
        Boolean enabled,
        String location,
        Boolean pointInTimeRecoveryEnabled,
        String startTime,
        Integer transactionLogRetentionDays) {
        this.backupRetentionSettings = Objects.requireNonNull(backupRetentionSettings, "expected parameter 'backupRetentionSettings' to be non-null");
        this.binaryLogEnabled = Objects.requireNonNull(binaryLogEnabled, "expected parameter 'binaryLogEnabled' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.pointInTimeRecoveryEnabled = Objects.requireNonNull(pointInTimeRecoveryEnabled, "expected parameter 'pointInTimeRecoveryEnabled' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.transactionLogRetentionDays = Objects.requireNonNull(transactionLogRetentionDays, "expected parameter 'transactionLogRetentionDays' to be non-null");
    }

    private GetDatabaseInstanceSettingBackupConfiguration() {
        this.backupRetentionSettings = List.of();
        this.binaryLogEnabled = null;
        this.enabled = null;
        this.location = null;
        this.pointInTimeRecoveryEnabled = null;
        this.startTime = null;
        this.transactionLogRetentionDays = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceSettingBackupConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting> backupRetentionSettings;
        private Boolean binaryLogEnabled;
        private Boolean enabled;
        private String location;
        private Boolean pointInTimeRecoveryEnabled;
        private String startTime;
        private Integer transactionLogRetentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceSettingBackupConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupRetentionSettings = defaults.backupRetentionSettings;
    	      this.binaryLogEnabled = defaults.binaryLogEnabled;
    	      this.enabled = defaults.enabled;
    	      this.location = defaults.location;
    	      this.pointInTimeRecoveryEnabled = defaults.pointInTimeRecoveryEnabled;
    	      this.startTime = defaults.startTime;
    	      this.transactionLogRetentionDays = defaults.transactionLogRetentionDays;
        }

        public Builder backupRetentionSettings(List<GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting> backupRetentionSettings) {
            this.backupRetentionSettings = Objects.requireNonNull(backupRetentionSettings);
            return this;
        }

        public Builder binaryLogEnabled(Boolean binaryLogEnabled) {
            this.binaryLogEnabled = Objects.requireNonNull(binaryLogEnabled);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder pointInTimeRecoveryEnabled(Boolean pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = Objects.requireNonNull(pointInTimeRecoveryEnabled);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder transactionLogRetentionDays(Integer transactionLogRetentionDays) {
            this.transactionLogRetentionDays = Objects.requireNonNull(transactionLogRetentionDays);
            return this;
        }
        public GetDatabaseInstanceSettingBackupConfiguration build() {
            return new GetDatabaseInstanceSettingBackupConfiguration(backupRetentionSettings, binaryLogEnabled, enabled, location, pointInTimeRecoveryEnabled, startTime, transactionLogRetentionDays);
        }
    }
}
