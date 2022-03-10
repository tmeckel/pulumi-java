// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.SettingsActivationPolicy;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.SettingsAvailabilityType;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.SettingsDataDiskType;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.SettingsPricingPlan;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.BackupConfigurationArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.DatabaseFlagsArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.DenyMaintenancePeriodArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.InsightsConfigArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.IpConfigurationArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.LocationPreferenceArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.MaintenanceWindowArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.PasswordValidationPolicyArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.SqlActiveDirectoryConfigArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.SqlServerAuditConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Database instance settings.
 * 
 */
public final class SettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SettingsArgs Empty = new SettingsArgs();

    /**
     * The activation policy specifies when the instance is activated; it is applicable only when the instance state is RUNNABLE. Valid values: * `ALWAYS`: The instance is on, and remains so even in the absence of connection requests. * `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
     * 
     */
    @InputImport(name="activationPolicy")
      private final @Nullable Input<SettingsActivationPolicy> activationPolicy;

    public Input<SettingsActivationPolicy> getActivationPolicy() {
        return this.activationPolicy == null ? Input.empty() : this.activationPolicy;
    }

    /**
     * Active Directory configuration, relevant only for Cloud SQL for SQL Server.
     * 
     */
    @InputImport(name="activeDirectoryConfig")
      private final @Nullable Input<SqlActiveDirectoryConfigArgs> activeDirectoryConfig;

    public Input<SqlActiveDirectoryConfigArgs> getActiveDirectoryConfig() {
        return this.activeDirectoryConfig == null ? Input.empty() : this.activeDirectoryConfig;
    }

    /**
     * Availability type. Potential values: * `ZONAL`: The instance serves data from only one zone. Outages in that zone affect data accessibility. * `REGIONAL`: The instance can serve data from more than one zone in a region (it is highly available)./ For more information, see [Overview of the High Availability Configuration](https://cloud.google.com/sql/docs/mysql/high-availability).
     * 
     */
    @InputImport(name="availabilityType")
      private final @Nullable Input<SettingsAvailabilityType> availabilityType;

    public Input<SettingsAvailabilityType> getAvailabilityType() {
        return this.availabilityType == null ? Input.empty() : this.availabilityType;
    }

    /**
     * The daily backup configuration for the instance.
     * 
     */
    @InputImport(name="backupConfiguration")
      private final @Nullable Input<BackupConfigurationArgs> backupConfiguration;

    public Input<BackupConfigurationArgs> getBackupConfiguration() {
        return this.backupConfiguration == null ? Input.empty() : this.backupConfiguration;
    }

    /**
     * The name of server Instance collation.
     * 
     */
    @InputImport(name="collation")
      private final @Nullable Input<String> collation;

    public Input<String> getCollation() {
        return this.collation == null ? Input.empty() : this.collation;
    }

    /**
     * Configuration specific to read replica instances. Indicates whether database flags for crash-safe replication are enabled. This property was only applicable to First Generation instances.
     * 
     */
    @InputImport(name="crashSafeReplicationEnabled")
      private final @Nullable Input<Boolean> crashSafeReplicationEnabled;

    public Input<Boolean> getCrashSafeReplicationEnabled() {
        return this.crashSafeReplicationEnabled == null ? Input.empty() : this.crashSafeReplicationEnabled;
    }

    /**
     * The size of data disk, in GB. The data disk size minimum is 10GB.
     * 
     */
    @InputImport(name="dataDiskSizeGb")
      private final @Nullable Input<String> dataDiskSizeGb;

    public Input<String> getDataDiskSizeGb() {
        return this.dataDiskSizeGb == null ? Input.empty() : this.dataDiskSizeGb;
    }

    /**
     * The type of data disk: `PD_SSD` (default) or `PD_HDD`. Not used for First Generation instances.
     * 
     */
    @InputImport(name="dataDiskType")
      private final @Nullable Input<SettingsDataDiskType> dataDiskType;

    public Input<SettingsDataDiskType> getDataDiskType() {
        return this.dataDiskType == null ? Input.empty() : this.dataDiskType;
    }

    /**
     * The database flags passed to the instance at startup.
     * 
     */
    @InputImport(name="databaseFlags")
      private final @Nullable Input<List<DatabaseFlagsArgs>> databaseFlags;

    public Input<List<DatabaseFlagsArgs>> getDatabaseFlags() {
        return this.databaseFlags == null ? Input.empty() : this.databaseFlags;
    }

    /**
     * Configuration specific to read replica instances. Indicates whether replication is enabled or not. WARNING: Changing this restarts the instance.
     * 
     */
    @InputImport(name="databaseReplicationEnabled")
      private final @Nullable Input<Boolean> databaseReplicationEnabled;

    public Input<Boolean> getDatabaseReplicationEnabled() {
        return this.databaseReplicationEnabled == null ? Input.empty() : this.databaseReplicationEnabled;
    }

    /**
     * Deny maintenance periods
     * 
     */
    @InputImport(name="denyMaintenancePeriods")
      private final @Nullable Input<List<DenyMaintenancePeriodArgs>> denyMaintenancePeriods;

    public Input<List<DenyMaintenancePeriodArgs>> getDenyMaintenancePeriods() {
        return this.denyMaintenancePeriods == null ? Input.empty() : this.denyMaintenancePeriods;
    }

    /**
     * Insights configuration, for now relevant only for Postgres.
     * 
     */
    @InputImport(name="insightsConfig")
      private final @Nullable Input<InsightsConfigArgs> insightsConfig;

    public Input<InsightsConfigArgs> getInsightsConfig() {
        return this.insightsConfig == null ? Input.empty() : this.insightsConfig;
    }

    /**
     * The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled for Second Generation instances.
     * 
     */
    @InputImport(name="ipConfiguration")
      private final @Nullable Input<IpConfigurationArgs> ipConfiguration;

    public Input<IpConfigurationArgs> getIpConfiguration() {
        return this.ipConfiguration == null ? Input.empty() : this.ipConfiguration;
    }

    /**
     * This is always `sql#settings`.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The location preference settings. This allows the instance to be located as near as possible to either an App Engine app or Compute Engine zone for better performance. App Engine co-location was only applicable to First Generation instances.
     * 
     */
    @InputImport(name="locationPreference")
      private final @Nullable Input<LocationPreferenceArgs> locationPreference;

    public Input<LocationPreferenceArgs> getLocationPreference() {
        return this.locationPreference == null ? Input.empty() : this.locationPreference;
    }

    /**
     * The maintenance window for this instance. This specifies when the instance can be restarted for maintenance purposes.
     * 
     */
    @InputImport(name="maintenanceWindow")
      private final @Nullable Input<MaintenanceWindowArgs> maintenanceWindow;

    public Input<MaintenanceWindowArgs> getMaintenanceWindow() {
        return this.maintenanceWindow == null ? Input.empty() : this.maintenanceWindow;
    }

    /**
     * The local user password validation policy of the instance.
     * 
     */
    @InputImport(name="passwordValidationPolicy")
      private final @Nullable Input<PasswordValidationPolicyArgs> passwordValidationPolicy;

    public Input<PasswordValidationPolicyArgs> getPasswordValidationPolicy() {
        return this.passwordValidationPolicy == null ? Input.empty() : this.passwordValidationPolicy;
    }

    /**
     * The pricing plan for this instance. This can be either `PER_USE` or `PACKAGE`. Only `PER_USE` is supported for Second Generation instances.
     * 
     */
    @InputImport(name="pricingPlan")
      private final @Nullable Input<SettingsPricingPlan> pricingPlan;

    public Input<SettingsPricingPlan> getPricingPlan() {
        return this.pricingPlan == null ? Input.empty() : this.pricingPlan;
    }

    /**
     * The version of instance settings. This is a required field for update method to make sure concurrent updates are handled properly. During update, use the most recent settingsVersion value for this instance and do not try to update this value.
     * 
     */
    @InputImport(name="settingsVersion")
      private final @Nullable Input<String> settingsVersion;

    public Input<String> getSettingsVersion() {
        return this.settingsVersion == null ? Input.empty() : this.settingsVersion;
    }

    /**
     * SQL Server specific audit configuration.
     * 
     */
    @InputImport(name="sqlServerAuditConfig")
      private final @Nullable Input<SqlServerAuditConfigArgs> sqlServerAuditConfig;

    public Input<SqlServerAuditConfigArgs> getSqlServerAuditConfig() {
        return this.sqlServerAuditConfig == null ? Input.empty() : this.sqlServerAuditConfig;
    }

    /**
     * Configuration to increase storage size automatically. The default value is true.
     * 
     */
    @InputImport(name="storageAutoResize")
      private final @Nullable Input<Boolean> storageAutoResize;

    public Input<Boolean> getStorageAutoResize() {
        return this.storageAutoResize == null ? Input.empty() : this.storageAutoResize;
    }

    /**
     * The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
     * 
     */
    @InputImport(name="storageAutoResizeLimit")
      private final @Nullable Input<String> storageAutoResizeLimit;

    public Input<String> getStorageAutoResizeLimit() {
        return this.storageAutoResizeLimit == null ? Input.empty() : this.storageAutoResizeLimit;
    }

    /**
     * The tier (or machine type) for this instance, for example `db-custom-1-3840`. WARNING: Changing this restarts the instance.
     * 
     */
    @InputImport(name="tier")
      private final @Nullable Input<String> tier;

    public Input<String> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    /**
     * User-provided labels, represented as a dictionary where each label is a single key value pair.
     * 
     */
    @InputImport(name="userLabels")
      private final @Nullable Input<Map<String,String>> userLabels;

    public Input<Map<String,String>> getUserLabels() {
        return this.userLabels == null ? Input.empty() : this.userLabels;
    }

    public SettingsArgs(
        @Nullable Input<SettingsActivationPolicy> activationPolicy,
        @Nullable Input<SqlActiveDirectoryConfigArgs> activeDirectoryConfig,
        @Nullable Input<SettingsAvailabilityType> availabilityType,
        @Nullable Input<BackupConfigurationArgs> backupConfiguration,
        @Nullable Input<String> collation,
        @Nullable Input<Boolean> crashSafeReplicationEnabled,
        @Nullable Input<String> dataDiskSizeGb,
        @Nullable Input<SettingsDataDiskType> dataDiskType,
        @Nullable Input<List<DatabaseFlagsArgs>> databaseFlags,
        @Nullable Input<Boolean> databaseReplicationEnabled,
        @Nullable Input<List<DenyMaintenancePeriodArgs>> denyMaintenancePeriods,
        @Nullable Input<InsightsConfigArgs> insightsConfig,
        @Nullable Input<IpConfigurationArgs> ipConfiguration,
        @Nullable Input<String> kind,
        @Nullable Input<LocationPreferenceArgs> locationPreference,
        @Nullable Input<MaintenanceWindowArgs> maintenanceWindow,
        @Nullable Input<PasswordValidationPolicyArgs> passwordValidationPolicy,
        @Nullable Input<SettingsPricingPlan> pricingPlan,
        @Nullable Input<String> settingsVersion,
        @Nullable Input<SqlServerAuditConfigArgs> sqlServerAuditConfig,
        @Nullable Input<Boolean> storageAutoResize,
        @Nullable Input<String> storageAutoResizeLimit,
        @Nullable Input<String> tier,
        @Nullable Input<Map<String,String>> userLabels) {
        this.activationPolicy = activationPolicy;
        this.activeDirectoryConfig = activeDirectoryConfig;
        this.availabilityType = availabilityType;
        this.backupConfiguration = backupConfiguration;
        this.collation = collation;
        this.crashSafeReplicationEnabled = crashSafeReplicationEnabled;
        this.dataDiskSizeGb = dataDiskSizeGb;
        this.dataDiskType = dataDiskType;
        this.databaseFlags = databaseFlags;
        this.databaseReplicationEnabled = databaseReplicationEnabled;
        this.denyMaintenancePeriods = denyMaintenancePeriods;
        this.insightsConfig = insightsConfig;
        this.ipConfiguration = ipConfiguration;
        this.kind = kind;
        this.locationPreference = locationPreference;
        this.maintenanceWindow = maintenanceWindow;
        this.passwordValidationPolicy = passwordValidationPolicy;
        this.pricingPlan = pricingPlan;
        this.settingsVersion = settingsVersion;
        this.sqlServerAuditConfig = sqlServerAuditConfig;
        this.storageAutoResize = storageAutoResize;
        this.storageAutoResizeLimit = storageAutoResizeLimit;
        this.tier = tier;
        this.userLabels = userLabels;
    }

    private SettingsArgs() {
        this.activationPolicy = Input.empty();
        this.activeDirectoryConfig = Input.empty();
        this.availabilityType = Input.empty();
        this.backupConfiguration = Input.empty();
        this.collation = Input.empty();
        this.crashSafeReplicationEnabled = Input.empty();
        this.dataDiskSizeGb = Input.empty();
        this.dataDiskType = Input.empty();
        this.databaseFlags = Input.empty();
        this.databaseReplicationEnabled = Input.empty();
        this.denyMaintenancePeriods = Input.empty();
        this.insightsConfig = Input.empty();
        this.ipConfiguration = Input.empty();
        this.kind = Input.empty();
        this.locationPreference = Input.empty();
        this.maintenanceWindow = Input.empty();
        this.passwordValidationPolicy = Input.empty();
        this.pricingPlan = Input.empty();
        this.settingsVersion = Input.empty();
        this.sqlServerAuditConfig = Input.empty();
        this.storageAutoResize = Input.empty();
        this.storageAutoResizeLimit = Input.empty();
        this.tier = Input.empty();
        this.userLabels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SettingsActivationPolicy> activationPolicy;
        private @Nullable Input<SqlActiveDirectoryConfigArgs> activeDirectoryConfig;
        private @Nullable Input<SettingsAvailabilityType> availabilityType;
        private @Nullable Input<BackupConfigurationArgs> backupConfiguration;
        private @Nullable Input<String> collation;
        private @Nullable Input<Boolean> crashSafeReplicationEnabled;
        private @Nullable Input<String> dataDiskSizeGb;
        private @Nullable Input<SettingsDataDiskType> dataDiskType;
        private @Nullable Input<List<DatabaseFlagsArgs>> databaseFlags;
        private @Nullable Input<Boolean> databaseReplicationEnabled;
        private @Nullable Input<List<DenyMaintenancePeriodArgs>> denyMaintenancePeriods;
        private @Nullable Input<InsightsConfigArgs> insightsConfig;
        private @Nullable Input<IpConfigurationArgs> ipConfiguration;
        private @Nullable Input<String> kind;
        private @Nullable Input<LocationPreferenceArgs> locationPreference;
        private @Nullable Input<MaintenanceWindowArgs> maintenanceWindow;
        private @Nullable Input<PasswordValidationPolicyArgs> passwordValidationPolicy;
        private @Nullable Input<SettingsPricingPlan> pricingPlan;
        private @Nullable Input<String> settingsVersion;
        private @Nullable Input<SqlServerAuditConfigArgs> sqlServerAuditConfig;
        private @Nullable Input<Boolean> storageAutoResize;
        private @Nullable Input<String> storageAutoResizeLimit;
        private @Nullable Input<String> tier;
        private @Nullable Input<Map<String,String>> userLabels;

        public Builder() {
    	      // Empty
        }

        public Builder(SettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationPolicy = defaults.activationPolicy;
    	      this.activeDirectoryConfig = defaults.activeDirectoryConfig;
    	      this.availabilityType = defaults.availabilityType;
    	      this.backupConfiguration = defaults.backupConfiguration;
    	      this.collation = defaults.collation;
    	      this.crashSafeReplicationEnabled = defaults.crashSafeReplicationEnabled;
    	      this.dataDiskSizeGb = defaults.dataDiskSizeGb;
    	      this.dataDiskType = defaults.dataDiskType;
    	      this.databaseFlags = defaults.databaseFlags;
    	      this.databaseReplicationEnabled = defaults.databaseReplicationEnabled;
    	      this.denyMaintenancePeriods = defaults.denyMaintenancePeriods;
    	      this.insightsConfig = defaults.insightsConfig;
    	      this.ipConfiguration = defaults.ipConfiguration;
    	      this.kind = defaults.kind;
    	      this.locationPreference = defaults.locationPreference;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.passwordValidationPolicy = defaults.passwordValidationPolicy;
    	      this.pricingPlan = defaults.pricingPlan;
    	      this.settingsVersion = defaults.settingsVersion;
    	      this.sqlServerAuditConfig = defaults.sqlServerAuditConfig;
    	      this.storageAutoResize = defaults.storageAutoResize;
    	      this.storageAutoResizeLimit = defaults.storageAutoResizeLimit;
    	      this.tier = defaults.tier;
    	      this.userLabels = defaults.userLabels;
        }

        public Builder activationPolicy(@Nullable Input<SettingsActivationPolicy> activationPolicy) {
            this.activationPolicy = activationPolicy;
            return this;
        }

        public Builder activationPolicy(@Nullable SettingsActivationPolicy activationPolicy) {
            this.activationPolicy = Input.ofNullable(activationPolicy);
            return this;
        }

        public Builder activeDirectoryConfig(@Nullable Input<SqlActiveDirectoryConfigArgs> activeDirectoryConfig) {
            this.activeDirectoryConfig = activeDirectoryConfig;
            return this;
        }

        public Builder activeDirectoryConfig(@Nullable SqlActiveDirectoryConfigArgs activeDirectoryConfig) {
            this.activeDirectoryConfig = Input.ofNullable(activeDirectoryConfig);
            return this;
        }

        public Builder availabilityType(@Nullable Input<SettingsAvailabilityType> availabilityType) {
            this.availabilityType = availabilityType;
            return this;
        }

        public Builder availabilityType(@Nullable SettingsAvailabilityType availabilityType) {
            this.availabilityType = Input.ofNullable(availabilityType);
            return this;
        }

        public Builder backupConfiguration(@Nullable Input<BackupConfigurationArgs> backupConfiguration) {
            this.backupConfiguration = backupConfiguration;
            return this;
        }

        public Builder backupConfiguration(@Nullable BackupConfigurationArgs backupConfiguration) {
            this.backupConfiguration = Input.ofNullable(backupConfiguration);
            return this;
        }

        public Builder collation(@Nullable Input<String> collation) {
            this.collation = collation;
            return this;
        }

        public Builder collation(@Nullable String collation) {
            this.collation = Input.ofNullable(collation);
            return this;
        }

        public Builder crashSafeReplicationEnabled(@Nullable Input<Boolean> crashSafeReplicationEnabled) {
            this.crashSafeReplicationEnabled = crashSafeReplicationEnabled;
            return this;
        }

        public Builder crashSafeReplicationEnabled(@Nullable Boolean crashSafeReplicationEnabled) {
            this.crashSafeReplicationEnabled = Input.ofNullable(crashSafeReplicationEnabled);
            return this;
        }

        public Builder dataDiskSizeGb(@Nullable Input<String> dataDiskSizeGb) {
            this.dataDiskSizeGb = dataDiskSizeGb;
            return this;
        }

        public Builder dataDiskSizeGb(@Nullable String dataDiskSizeGb) {
            this.dataDiskSizeGb = Input.ofNullable(dataDiskSizeGb);
            return this;
        }

        public Builder dataDiskType(@Nullable Input<SettingsDataDiskType> dataDiskType) {
            this.dataDiskType = dataDiskType;
            return this;
        }

        public Builder dataDiskType(@Nullable SettingsDataDiskType dataDiskType) {
            this.dataDiskType = Input.ofNullable(dataDiskType);
            return this;
        }

        public Builder databaseFlags(@Nullable Input<List<DatabaseFlagsArgs>> databaseFlags) {
            this.databaseFlags = databaseFlags;
            return this;
        }

        public Builder databaseFlags(@Nullable List<DatabaseFlagsArgs> databaseFlags) {
            this.databaseFlags = Input.ofNullable(databaseFlags);
            return this;
        }

        public Builder databaseReplicationEnabled(@Nullable Input<Boolean> databaseReplicationEnabled) {
            this.databaseReplicationEnabled = databaseReplicationEnabled;
            return this;
        }

        public Builder databaseReplicationEnabled(@Nullable Boolean databaseReplicationEnabled) {
            this.databaseReplicationEnabled = Input.ofNullable(databaseReplicationEnabled);
            return this;
        }

        public Builder denyMaintenancePeriods(@Nullable Input<List<DenyMaintenancePeriodArgs>> denyMaintenancePeriods) {
            this.denyMaintenancePeriods = denyMaintenancePeriods;
            return this;
        }

        public Builder denyMaintenancePeriods(@Nullable List<DenyMaintenancePeriodArgs> denyMaintenancePeriods) {
            this.denyMaintenancePeriods = Input.ofNullable(denyMaintenancePeriods);
            return this;
        }

        public Builder insightsConfig(@Nullable Input<InsightsConfigArgs> insightsConfig) {
            this.insightsConfig = insightsConfig;
            return this;
        }

        public Builder insightsConfig(@Nullable InsightsConfigArgs insightsConfig) {
            this.insightsConfig = Input.ofNullable(insightsConfig);
            return this;
        }

        public Builder ipConfiguration(@Nullable Input<IpConfigurationArgs> ipConfiguration) {
            this.ipConfiguration = ipConfiguration;
            return this;
        }

        public Builder ipConfiguration(@Nullable IpConfigurationArgs ipConfiguration) {
            this.ipConfiguration = Input.ofNullable(ipConfiguration);
            return this;
        }

        public Builder kind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder locationPreference(@Nullable Input<LocationPreferenceArgs> locationPreference) {
            this.locationPreference = locationPreference;
            return this;
        }

        public Builder locationPreference(@Nullable LocationPreferenceArgs locationPreference) {
            this.locationPreference = Input.ofNullable(locationPreference);
            return this;
        }

        public Builder maintenanceWindow(@Nullable Input<MaintenanceWindowArgs> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder maintenanceWindow(@Nullable MaintenanceWindowArgs maintenanceWindow) {
            this.maintenanceWindow = Input.ofNullable(maintenanceWindow);
            return this;
        }

        public Builder passwordValidationPolicy(@Nullable Input<PasswordValidationPolicyArgs> passwordValidationPolicy) {
            this.passwordValidationPolicy = passwordValidationPolicy;
            return this;
        }

        public Builder passwordValidationPolicy(@Nullable PasswordValidationPolicyArgs passwordValidationPolicy) {
            this.passwordValidationPolicy = Input.ofNullable(passwordValidationPolicy);
            return this;
        }

        public Builder pricingPlan(@Nullable Input<SettingsPricingPlan> pricingPlan) {
            this.pricingPlan = pricingPlan;
            return this;
        }

        public Builder pricingPlan(@Nullable SettingsPricingPlan pricingPlan) {
            this.pricingPlan = Input.ofNullable(pricingPlan);
            return this;
        }

        public Builder settingsVersion(@Nullable Input<String> settingsVersion) {
            this.settingsVersion = settingsVersion;
            return this;
        }

        public Builder settingsVersion(@Nullable String settingsVersion) {
            this.settingsVersion = Input.ofNullable(settingsVersion);
            return this;
        }

        public Builder sqlServerAuditConfig(@Nullable Input<SqlServerAuditConfigArgs> sqlServerAuditConfig) {
            this.sqlServerAuditConfig = sqlServerAuditConfig;
            return this;
        }

        public Builder sqlServerAuditConfig(@Nullable SqlServerAuditConfigArgs sqlServerAuditConfig) {
            this.sqlServerAuditConfig = Input.ofNullable(sqlServerAuditConfig);
            return this;
        }

        public Builder storageAutoResize(@Nullable Input<Boolean> storageAutoResize) {
            this.storageAutoResize = storageAutoResize;
            return this;
        }

        public Builder storageAutoResize(@Nullable Boolean storageAutoResize) {
            this.storageAutoResize = Input.ofNullable(storageAutoResize);
            return this;
        }

        public Builder storageAutoResizeLimit(@Nullable Input<String> storageAutoResizeLimit) {
            this.storageAutoResizeLimit = storageAutoResizeLimit;
            return this;
        }

        public Builder storageAutoResizeLimit(@Nullable String storageAutoResizeLimit) {
            this.storageAutoResizeLimit = Input.ofNullable(storageAutoResizeLimit);
            return this;
        }

        public Builder tier(@Nullable Input<String> tier) {
            this.tier = tier;
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }

        public Builder userLabels(@Nullable Input<Map<String,String>> userLabels) {
            this.userLabels = userLabels;
            return this;
        }

        public Builder userLabels(@Nullable Map<String,String> userLabels) {
            this.userLabels = Input.ofNullable(userLabels);
            return this;
        }
        public SettingsArgs build() {
            return new SettingsArgs(activationPolicy, activeDirectoryConfig, availabilityType, backupConfiguration, collation, crashSafeReplicationEnabled, dataDiskSizeGb, dataDiskType, databaseFlags, databaseReplicationEnabled, denyMaintenancePeriods, insightsConfig, ipConfiguration, kind, locationPreference, maintenanceWindow, passwordValidationPolicy, pricingPlan, settingsVersion, sqlServerAuditConfig, storageAutoResize, storageAutoResizeLimit, tier, userLabels);
        }
    }
}
