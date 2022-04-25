// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MigrateSqlServerSqlDbSyncDatabaseInputResponse {
    /**
     * @return Unique identifier for database
     * 
     */
    private final @Nullable String id;
    /**
     * @return Migration settings which tune the migration behavior
     * 
     */
    private final @Nullable Map<String,String> migrationSetting;
    /**
     * @return Name of database
     * 
     */
    private final @Nullable String name;
    /**
     * @return Schema name to be migrated
     * 
     */
    private final @Nullable String schemaName;
    /**
     * @return Source settings to tune source endpoint migration behavior
     * 
     */
    private final @Nullable Map<String,String> sourceSetting;
    /**
     * @return Mapping of source to target tables
     * 
     */
    private final @Nullable Map<String,String> tableMap;
    /**
     * @return Target database name
     * 
     */
    private final @Nullable String targetDatabaseName;
    /**
     * @return Target settings to tune target endpoint migration behavior
     * 
     */
    private final @Nullable Map<String,String> targetSetting;

    @CustomType.Constructor
    private MigrateSqlServerSqlDbSyncDatabaseInputResponse(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("migrationSetting") @Nullable Map<String,String> migrationSetting,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("schemaName") @Nullable String schemaName,
        @CustomType.Parameter("sourceSetting") @Nullable Map<String,String> sourceSetting,
        @CustomType.Parameter("tableMap") @Nullable Map<String,String> tableMap,
        @CustomType.Parameter("targetDatabaseName") @Nullable String targetDatabaseName,
        @CustomType.Parameter("targetSetting") @Nullable Map<String,String> targetSetting) {
        this.id = id;
        this.migrationSetting = migrationSetting;
        this.name = name;
        this.schemaName = schemaName;
        this.sourceSetting = sourceSetting;
        this.tableMap = tableMap;
        this.targetDatabaseName = targetDatabaseName;
        this.targetSetting = targetSetting;
    }

    /**
     * @return Unique identifier for database
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Migration settings which tune the migration behavior
     * 
     */
    public Map<String,String> migrationSetting() {
        return this.migrationSetting == null ? Map.of() : this.migrationSetting;
    }
    /**
     * @return Name of database
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Schema name to be migrated
     * 
     */
    public Optional<String> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }
    /**
     * @return Source settings to tune source endpoint migration behavior
     * 
     */
    public Map<String,String> sourceSetting() {
        return this.sourceSetting == null ? Map.of() : this.sourceSetting;
    }
    /**
     * @return Mapping of source to target tables
     * 
     */
    public Map<String,String> tableMap() {
        return this.tableMap == null ? Map.of() : this.tableMap;
    }
    /**
     * @return Target database name
     * 
     */
    public Optional<String> targetDatabaseName() {
        return Optional.ofNullable(this.targetDatabaseName);
    }
    /**
     * @return Target settings to tune target endpoint migration behavior
     * 
     */
    public Map<String,String> targetSetting() {
        return this.targetSetting == null ? Map.of() : this.targetSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbSyncDatabaseInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable Map<String,String> migrationSetting;
        private @Nullable String name;
        private @Nullable String schemaName;
        private @Nullable Map<String,String> sourceSetting;
        private @Nullable Map<String,String> tableMap;
        private @Nullable String targetDatabaseName;
        private @Nullable Map<String,String> targetSetting;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbSyncDatabaseInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.migrationSetting = defaults.migrationSetting;
    	      this.name = defaults.name;
    	      this.schemaName = defaults.schemaName;
    	      this.sourceSetting = defaults.sourceSetting;
    	      this.tableMap = defaults.tableMap;
    	      this.targetDatabaseName = defaults.targetDatabaseName;
    	      this.targetSetting = defaults.targetSetting;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder migrationSetting(@Nullable Map<String,String> migrationSetting) {
            this.migrationSetting = migrationSetting;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder schemaName(@Nullable String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public Builder sourceSetting(@Nullable Map<String,String> sourceSetting) {
            this.sourceSetting = sourceSetting;
            return this;
        }
        public Builder tableMap(@Nullable Map<String,String> tableMap) {
            this.tableMap = tableMap;
            return this;
        }
        public Builder targetDatabaseName(@Nullable String targetDatabaseName) {
            this.targetDatabaseName = targetDatabaseName;
            return this;
        }
        public Builder targetSetting(@Nullable Map<String,String> targetSetting) {
            this.targetSetting = targetSetting;
            return this;
        }        public MigrateSqlServerSqlDbSyncDatabaseInputResponse build() {
            return new MigrateSqlServerSqlDbSyncDatabaseInputResponse(id, migrationSetting, name, schemaName, sourceSetting, tableMap, targetDatabaseName, targetSetting);
        }
    }
}
