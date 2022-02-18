// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datamigration_v1.enums.CloudSqlSettingsActivationPolicy;
import io.pulumi.googlenative.datamigration_v1.enums.CloudSqlSettingsDataDiskType;
import io.pulumi.googlenative.datamigration_v1.enums.CloudSqlSettingsDatabaseVersion;
import io.pulumi.googlenative.datamigration_v1.inputs.SqlIpConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings for creating a Cloud SQL database instance.
 * 
 */
public final class CloudSqlSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudSqlSettingsArgs Empty = new CloudSqlSettingsArgs();

    /**
     * The activation policy specifies when the instance is activated; it is applicable only when the instance state is 'RUNNABLE'. Valid values: 'ALWAYS': The instance is on, and remains so even in the absence of connection requests. `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
     * 
     */
    @InputImport(name="activationPolicy")
    private final @Nullable Input<CloudSqlSettingsActivationPolicy> activationPolicy;

    public Input<CloudSqlSettingsActivationPolicy> getActivationPolicy() {
        return this.activationPolicy == null ? Input.empty() : this.activationPolicy;
    }

    /**
     * [default: ON] If you enable this setting, Cloud SQL checks your available storage every 30 seconds. If the available storage falls below a threshold size, Cloud SQL automatically adds additional storage capacity. If the available storage repeatedly falls below the threshold size, Cloud SQL continues to add storage until it reaches the maximum of 30 TB.
     * 
     */
    @InputImport(name="autoStorageIncrease")
    private final @Nullable Input<Boolean> autoStorageIncrease;

    public Input<Boolean> getAutoStorageIncrease() {
        return this.autoStorageIncrease == null ? Input.empty() : this.autoStorageIncrease;
    }

    /**
     * The KMS key name used for the csql instance.
     * 
     */
    @InputImport(name="cmekKeyName")
    private final @Nullable Input<String> cmekKeyName;

    public Input<String> getCmekKeyName() {
        return this.cmekKeyName == null ? Input.empty() : this.cmekKeyName;
    }

    /**
     * The Cloud SQL default instance level collation.
     * 
     */
    @InputImport(name="collation")
    private final @Nullable Input<String> collation;

    public Input<String> getCollation() {
        return this.collation == null ? Input.empty() : this.collation;
    }

    /**
     * The storage capacity available to the database, in GB. The minimum (and default) size is 10GB.
     * 
     */
    @InputImport(name="dataDiskSizeGb")
    private final @Nullable Input<String> dataDiskSizeGb;

    public Input<String> getDataDiskSizeGb() {
        return this.dataDiskSizeGb == null ? Input.empty() : this.dataDiskSizeGb;
    }

    /**
     * The type of storage: `PD_SSD` (default) or `PD_HDD`.
     * 
     */
    @InputImport(name="dataDiskType")
    private final @Nullable Input<CloudSqlSettingsDataDiskType> dataDiskType;

    public Input<CloudSqlSettingsDataDiskType> getDataDiskType() {
        return this.dataDiskType == null ? Input.empty() : this.dataDiskType;
    }

    /**
     * The database flags passed to the Cloud SQL instance at startup. An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @InputImport(name="databaseFlags")
    private final @Nullable Input<Map<String,String>> databaseFlags;

    public Input<Map<String,String>> getDatabaseFlags() {
        return this.databaseFlags == null ? Input.empty() : this.databaseFlags;
    }

    /**
     * The database engine type and version.
     * 
     */
    @InputImport(name="databaseVersion")
    private final @Nullable Input<CloudSqlSettingsDatabaseVersion> databaseVersion;

    public Input<CloudSqlSettingsDatabaseVersion> getDatabaseVersion() {
        return this.databaseVersion == null ? Input.empty() : this.databaseVersion;
    }

    /**
     * The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled.
     * 
     */
    @InputImport(name="ipConfig")
    private final @Nullable Input<SqlIpConfigArgs> ipConfig;

    public Input<SqlIpConfigArgs> getIpConfig() {
        return this.ipConfig == null ? Input.empty() : this.ipConfig;
    }

    /**
     * Input only. Initial root password.
     * 
     */
    @InputImport(name="rootPassword")
    private final @Nullable Input<String> rootPassword;

    public Input<String> getRootPassword() {
        return this.rootPassword == null ? Input.empty() : this.rootPassword;
    }

    /**
     * The Database Migration Service source connection profile ID, in the format: `projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID`
     * 
     */
    @InputImport(name="sourceId")
    private final @Nullable Input<String> sourceId;

    public Input<String> getSourceId() {
        return this.sourceId == null ? Input.empty() : this.sourceId;
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
     * The tier (or machine type) for this instance, for example: `db-n1-standard-1` (MySQL instances) or `db-custom-1-3840` (PostgreSQL instances). For more information, see [Cloud SQL Instance Settings](https://cloud.google.com/sql/docs/mysql/instance-settings).
     * 
     */
    @InputImport(name="tier")
    private final @Nullable Input<String> tier;

    public Input<String> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    /**
     * The resource labels for a Cloud SQL instance to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name": "wrench", "mass": "18kg", "count": "3" }`.
     * 
     */
    @InputImport(name="userLabels")
    private final @Nullable Input<Map<String,String>> userLabels;

    public Input<Map<String,String>> getUserLabels() {
        return this.userLabels == null ? Input.empty() : this.userLabels;
    }

    /**
     * The Google Cloud Platform zone where your Cloud SQL datdabse instance is located.
     * 
     */
    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public CloudSqlSettingsArgs(
        @Nullable Input<CloudSqlSettingsActivationPolicy> activationPolicy,
        @Nullable Input<Boolean> autoStorageIncrease,
        @Nullable Input<String> cmekKeyName,
        @Nullable Input<String> collation,
        @Nullable Input<String> dataDiskSizeGb,
        @Nullable Input<CloudSqlSettingsDataDiskType> dataDiskType,
        @Nullable Input<Map<String,String>> databaseFlags,
        @Nullable Input<CloudSqlSettingsDatabaseVersion> databaseVersion,
        @Nullable Input<SqlIpConfigArgs> ipConfig,
        @Nullable Input<String> rootPassword,
        @Nullable Input<String> sourceId,
        @Nullable Input<String> storageAutoResizeLimit,
        @Nullable Input<String> tier,
        @Nullable Input<Map<String,String>> userLabels,
        @Nullable Input<String> zone) {
        this.activationPolicy = activationPolicy;
        this.autoStorageIncrease = autoStorageIncrease;
        this.cmekKeyName = cmekKeyName;
        this.collation = collation;
        this.dataDiskSizeGb = dataDiskSizeGb;
        this.dataDiskType = dataDiskType;
        this.databaseFlags = databaseFlags;
        this.databaseVersion = databaseVersion;
        this.ipConfig = ipConfig;
        this.rootPassword = rootPassword;
        this.sourceId = sourceId;
        this.storageAutoResizeLimit = storageAutoResizeLimit;
        this.tier = tier;
        this.userLabels = userLabels;
        this.zone = zone;
    }

    private CloudSqlSettingsArgs() {
        this.activationPolicy = Input.empty();
        this.autoStorageIncrease = Input.empty();
        this.cmekKeyName = Input.empty();
        this.collation = Input.empty();
        this.dataDiskSizeGb = Input.empty();
        this.dataDiskType = Input.empty();
        this.databaseFlags = Input.empty();
        this.databaseVersion = Input.empty();
        this.ipConfig = Input.empty();
        this.rootPassword = Input.empty();
        this.sourceId = Input.empty();
        this.storageAutoResizeLimit = Input.empty();
        this.tier = Input.empty();
        this.userLabels = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudSqlSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CloudSqlSettingsActivationPolicy> activationPolicy;
        private @Nullable Input<Boolean> autoStorageIncrease;
        private @Nullable Input<String> cmekKeyName;
        private @Nullable Input<String> collation;
        private @Nullable Input<String> dataDiskSizeGb;
        private @Nullable Input<CloudSqlSettingsDataDiskType> dataDiskType;
        private @Nullable Input<Map<String,String>> databaseFlags;
        private @Nullable Input<CloudSqlSettingsDatabaseVersion> databaseVersion;
        private @Nullable Input<SqlIpConfigArgs> ipConfig;
        private @Nullable Input<String> rootPassword;
        private @Nullable Input<String> sourceId;
        private @Nullable Input<String> storageAutoResizeLimit;
        private @Nullable Input<String> tier;
        private @Nullable Input<Map<String,String>> userLabels;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudSqlSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationPolicy = defaults.activationPolicy;
    	      this.autoStorageIncrease = defaults.autoStorageIncrease;
    	      this.cmekKeyName = defaults.cmekKeyName;
    	      this.collation = defaults.collation;
    	      this.dataDiskSizeGb = defaults.dataDiskSizeGb;
    	      this.dataDiskType = defaults.dataDiskType;
    	      this.databaseFlags = defaults.databaseFlags;
    	      this.databaseVersion = defaults.databaseVersion;
    	      this.ipConfig = defaults.ipConfig;
    	      this.rootPassword = defaults.rootPassword;
    	      this.sourceId = defaults.sourceId;
    	      this.storageAutoResizeLimit = defaults.storageAutoResizeLimit;
    	      this.tier = defaults.tier;
    	      this.userLabels = defaults.userLabels;
    	      this.zone = defaults.zone;
        }

        public Builder setActivationPolicy(@Nullable Input<CloudSqlSettingsActivationPolicy> activationPolicy) {
            this.activationPolicy = activationPolicy;
            return this;
        }

        public Builder setActivationPolicy(@Nullable CloudSqlSettingsActivationPolicy activationPolicy) {
            this.activationPolicy = Input.ofNullable(activationPolicy);
            return this;
        }

        public Builder setAutoStorageIncrease(@Nullable Input<Boolean> autoStorageIncrease) {
            this.autoStorageIncrease = autoStorageIncrease;
            return this;
        }

        public Builder setAutoStorageIncrease(@Nullable Boolean autoStorageIncrease) {
            this.autoStorageIncrease = Input.ofNullable(autoStorageIncrease);
            return this;
        }

        public Builder setCmekKeyName(@Nullable Input<String> cmekKeyName) {
            this.cmekKeyName = cmekKeyName;
            return this;
        }

        public Builder setCmekKeyName(@Nullable String cmekKeyName) {
            this.cmekKeyName = Input.ofNullable(cmekKeyName);
            return this;
        }

        public Builder setCollation(@Nullable Input<String> collation) {
            this.collation = collation;
            return this;
        }

        public Builder setCollation(@Nullable String collation) {
            this.collation = Input.ofNullable(collation);
            return this;
        }

        public Builder setDataDiskSizeGb(@Nullable Input<String> dataDiskSizeGb) {
            this.dataDiskSizeGb = dataDiskSizeGb;
            return this;
        }

        public Builder setDataDiskSizeGb(@Nullable String dataDiskSizeGb) {
            this.dataDiskSizeGb = Input.ofNullable(dataDiskSizeGb);
            return this;
        }

        public Builder setDataDiskType(@Nullable Input<CloudSqlSettingsDataDiskType> dataDiskType) {
            this.dataDiskType = dataDiskType;
            return this;
        }

        public Builder setDataDiskType(@Nullable CloudSqlSettingsDataDiskType dataDiskType) {
            this.dataDiskType = Input.ofNullable(dataDiskType);
            return this;
        }

        public Builder setDatabaseFlags(@Nullable Input<Map<String,String>> databaseFlags) {
            this.databaseFlags = databaseFlags;
            return this;
        }

        public Builder setDatabaseFlags(@Nullable Map<String,String> databaseFlags) {
            this.databaseFlags = Input.ofNullable(databaseFlags);
            return this;
        }

        public Builder setDatabaseVersion(@Nullable Input<CloudSqlSettingsDatabaseVersion> databaseVersion) {
            this.databaseVersion = databaseVersion;
            return this;
        }

        public Builder setDatabaseVersion(@Nullable CloudSqlSettingsDatabaseVersion databaseVersion) {
            this.databaseVersion = Input.ofNullable(databaseVersion);
            return this;
        }

        public Builder setIpConfig(@Nullable Input<SqlIpConfigArgs> ipConfig) {
            this.ipConfig = ipConfig;
            return this;
        }

        public Builder setIpConfig(@Nullable SqlIpConfigArgs ipConfig) {
            this.ipConfig = Input.ofNullable(ipConfig);
            return this;
        }

        public Builder setRootPassword(@Nullable Input<String> rootPassword) {
            this.rootPassword = rootPassword;
            return this;
        }

        public Builder setRootPassword(@Nullable String rootPassword) {
            this.rootPassword = Input.ofNullable(rootPassword);
            return this;
        }

        public Builder setSourceId(@Nullable Input<String> sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        public Builder setSourceId(@Nullable String sourceId) {
            this.sourceId = Input.ofNullable(sourceId);
            return this;
        }

        public Builder setStorageAutoResizeLimit(@Nullable Input<String> storageAutoResizeLimit) {
            this.storageAutoResizeLimit = storageAutoResizeLimit;
            return this;
        }

        public Builder setStorageAutoResizeLimit(@Nullable String storageAutoResizeLimit) {
            this.storageAutoResizeLimit = Input.ofNullable(storageAutoResizeLimit);
            return this;
        }

        public Builder setTier(@Nullable Input<String> tier) {
            this.tier = tier;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }

        public Builder setUserLabels(@Nullable Input<Map<String,String>> userLabels) {
            this.userLabels = userLabels;
            return this;
        }

        public Builder setUserLabels(@Nullable Map<String,String> userLabels) {
            this.userLabels = Input.ofNullable(userLabels);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public CloudSqlSettingsArgs build() {
            return new CloudSqlSettingsArgs(activationPolicy, autoStorageIncrease, cmekKeyName, collation, dataDiskSizeGb, dataDiskType, databaseFlags, databaseVersion, ipConfig, rootPassword, sourceId, storageAutoResizeLimit, tier, userLabels, zone);
        }
    }
}
