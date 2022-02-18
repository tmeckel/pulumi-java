// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.spanner_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.spanner_v1.outputs.EncryptionConfigResponse;
import io.pulumi.googlenative.spanner_v1.outputs.EncryptionInfoResponse;
import io.pulumi.googlenative.spanner_v1.outputs.RestoreInfoResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetDatabaseResult {
    /**
     * If exists, the time at which the database creation started.
     * 
     */
    private final String createTime;
    /**
     * The dialect of the Cloud Spanner Database.
     * 
     */
    private final String databaseDialect;
    /**
     * The read-write region which contains the database's leader replicas. This is the same as the value of default_leader database option set using DatabaseAdmin.CreateDatabase or DatabaseAdmin.UpdateDatabaseDdl. If not explicitly set, this is empty.
     * 
     */
    private final String defaultLeader;
    /**
     * Earliest timestamp at which older versions of the data can be read. This value is continuously updated by Cloud Spanner and becomes stale the moment it is queried. If you are using this value to recover data, make sure to account for the time from the moment when the value is queried to the moment when you initiate the recovery.
     * 
     */
    private final String earliestVersionTime;
    /**
     * For databases that are using customer managed encryption, this field contains the encryption configuration for the database. For databases that are using Google default or other types of encryption, this field is empty.
     * 
     */
    private final EncryptionConfigResponse encryptionConfig;
    /**
     * For databases that are using customer managed encryption, this field contains the encryption information for the database, such as encryption state and the Cloud KMS key versions that are in use. For databases that are using Google default or other types of encryption, this field is empty. This field is propagated lazily from the backend. There might be a delay from when a key version is being used and when it appears in this field.
     * 
     */
    private final List<EncryptionInfoResponse> encryptionInfo;
    /**
     * The name of the database. Values are of the form `projects//instances//databases/`, where `` is as specified in the `CREATE DATABASE` statement. This name can be passed to other API methods to identify the database.
     * 
     */
    private final String name;
    /**
     * Applicable only for restored databases. Contains information about the restore source.
     * 
     */
    private final RestoreInfoResponse restoreInfo;
    /**
     * The current database state.
     * 
     */
    private final String state;
    /**
     * The period in which Cloud Spanner retains all versions of data for the database. This is the same as the value of version_retention_period database option set using UpdateDatabaseDdl. Defaults to 1 hour, if not set.
     * 
     */
    private final String versionRetentionPeriod;

    @OutputCustomType.Constructor({"createTime","databaseDialect","defaultLeader","earliestVersionTime","encryptionConfig","encryptionInfo","name","restoreInfo","state","versionRetentionPeriod"})
    private GetDatabaseResult(
        String createTime,
        String databaseDialect,
        String defaultLeader,
        String earliestVersionTime,
        EncryptionConfigResponse encryptionConfig,
        List<EncryptionInfoResponse> encryptionInfo,
        String name,
        RestoreInfoResponse restoreInfo,
        String state,
        String versionRetentionPeriod) {
        this.createTime = Objects.requireNonNull(createTime);
        this.databaseDialect = Objects.requireNonNull(databaseDialect);
        this.defaultLeader = Objects.requireNonNull(defaultLeader);
        this.earliestVersionTime = Objects.requireNonNull(earliestVersionTime);
        this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
        this.encryptionInfo = Objects.requireNonNull(encryptionInfo);
        this.name = Objects.requireNonNull(name);
        this.restoreInfo = Objects.requireNonNull(restoreInfo);
        this.state = Objects.requireNonNull(state);
        this.versionRetentionPeriod = Objects.requireNonNull(versionRetentionPeriod);
    }

    /**
     * If exists, the time at which the database creation started.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The dialect of the Cloud Spanner Database.
     * 
     */
    public String getDatabaseDialect() {
        return this.databaseDialect;
    }
    /**
     * The read-write region which contains the database's leader replicas. This is the same as the value of default_leader database option set using DatabaseAdmin.CreateDatabase or DatabaseAdmin.UpdateDatabaseDdl. If not explicitly set, this is empty.
     * 
     */
    public String getDefaultLeader() {
        return this.defaultLeader;
    }
    /**
     * Earliest timestamp at which older versions of the data can be read. This value is continuously updated by Cloud Spanner and becomes stale the moment it is queried. If you are using this value to recover data, make sure to account for the time from the moment when the value is queried to the moment when you initiate the recovery.
     * 
     */
    public String getEarliestVersionTime() {
        return this.earliestVersionTime;
    }
    /**
     * For databases that are using customer managed encryption, this field contains the encryption configuration for the database. For databases that are using Google default or other types of encryption, this field is empty.
     * 
     */
    public EncryptionConfigResponse getEncryptionConfig() {
        return this.encryptionConfig;
    }
    /**
     * For databases that are using customer managed encryption, this field contains the encryption information for the database, such as encryption state and the Cloud KMS key versions that are in use. For databases that are using Google default or other types of encryption, this field is empty. This field is propagated lazily from the backend. There might be a delay from when a key version is being used and when it appears in this field.
     * 
     */
    public List<EncryptionInfoResponse> getEncryptionInfo() {
        return this.encryptionInfo;
    }
    /**
     * The name of the database. Values are of the form `projects//instances//databases/`, where `` is as specified in the `CREATE DATABASE` statement. This name can be passed to other API methods to identify the database.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Applicable only for restored databases. Contains information about the restore source.
     * 
     */
    public RestoreInfoResponse getRestoreInfo() {
        return this.restoreInfo;
    }
    /**
     * The current database state.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * The period in which Cloud Spanner retains all versions of data for the database. This is the same as the value of version_retention_period database option set using UpdateDatabaseDdl. Defaults to 1 hour, if not set.
     * 
     */
    public String getVersionRetentionPeriod() {
        return this.versionRetentionPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String databaseDialect;
        private String defaultLeader;
        private String earliestVersionTime;
        private EncryptionConfigResponse encryptionConfig;
        private List<EncryptionInfoResponse> encryptionInfo;
        private String name;
        private RestoreInfoResponse restoreInfo;
        private String state;
        private String versionRetentionPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.databaseDialect = defaults.databaseDialect;
    	      this.defaultLeader = defaults.defaultLeader;
    	      this.earliestVersionTime = defaults.earliestVersionTime;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.encryptionInfo = defaults.encryptionInfo;
    	      this.name = defaults.name;
    	      this.restoreInfo = defaults.restoreInfo;
    	      this.state = defaults.state;
    	      this.versionRetentionPeriod = defaults.versionRetentionPeriod;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDatabaseDialect(String databaseDialect) {
            this.databaseDialect = Objects.requireNonNull(databaseDialect);
            return this;
        }

        public Builder setDefaultLeader(String defaultLeader) {
            this.defaultLeader = Objects.requireNonNull(defaultLeader);
            return this;
        }

        public Builder setEarliestVersionTime(String earliestVersionTime) {
            this.earliestVersionTime = Objects.requireNonNull(earliestVersionTime);
            return this;
        }

        public Builder setEncryptionConfig(EncryptionConfigResponse encryptionConfig) {
            this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
            return this;
        }

        public Builder setEncryptionInfo(List<EncryptionInfoResponse> encryptionInfo) {
            this.encryptionInfo = Objects.requireNonNull(encryptionInfo);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRestoreInfo(RestoreInfoResponse restoreInfo) {
            this.restoreInfo = Objects.requireNonNull(restoreInfo);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setVersionRetentionPeriod(String versionRetentionPeriod) {
            this.versionRetentionPeriod = Objects.requireNonNull(versionRetentionPeriod);
            return this;
        }

        public GetDatabaseResult build() {
            return new GetDatabaseResult(createTime, databaseDialect, defaultLeader, earliestVersionTime, encryptionConfig, encryptionInfo, name, restoreInfo, state, versionRetentionPeriod);
        }
    }
}
