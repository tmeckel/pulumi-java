// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.SqlUpsertSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.StoredProcedureParameterResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureSqlSinkResponse {
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object preCopyScript;
    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object sinkRetryCount;
    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object sinkRetryWait;
    /**
     * SQL writer stored procedure name. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object sqlWriterStoredProcedureName;
    /**
     * SQL writer table type. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object sqlWriterTableType;
    /**
     * Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object sqlWriterUseTableLock;
    /**
     * SQL stored procedure parameters.
     * 
     */
    private final @Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters;
    /**
     * The stored procedure parameter name of the table type. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object storedProcedureTableTypeParameterName;
    /**
     * The option to handle sink table, such as autoCreate. For now only 'autoCreate' value is supported. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object tableOption;
    /**
     * Copy sink type.
     * Expected value is 'AzureSqlSink'.
     * 
     */
    private final String type;
    /**
     * SQL upsert settings.
     * 
     */
    private final @Nullable SqlUpsertSettingsResponse upsertSettings;
    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    private final @Nullable Object writeBatchSize;
    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object writeBatchTimeout;
    /**
     * Write behavior when copying data into Azure SQL. Type: SqlWriteBehaviorEnum (or Expression with resultType SqlWriteBehaviorEnum)
     * 
     */
    private final @Nullable Object writeBehavior;

    @OutputCustomType.Constructor
    private AzureSqlSinkResponse(
        @OutputCustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @OutputCustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @OutputCustomType.Parameter("preCopyScript") @Nullable Object preCopyScript,
        @OutputCustomType.Parameter("sinkRetryCount") @Nullable Object sinkRetryCount,
        @OutputCustomType.Parameter("sinkRetryWait") @Nullable Object sinkRetryWait,
        @OutputCustomType.Parameter("sqlWriterStoredProcedureName") @Nullable Object sqlWriterStoredProcedureName,
        @OutputCustomType.Parameter("sqlWriterTableType") @Nullable Object sqlWriterTableType,
        @OutputCustomType.Parameter("sqlWriterUseTableLock") @Nullable Object sqlWriterUseTableLock,
        @OutputCustomType.Parameter("storedProcedureParameters") @Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters,
        @OutputCustomType.Parameter("storedProcedureTableTypeParameterName") @Nullable Object storedProcedureTableTypeParameterName,
        @OutputCustomType.Parameter("tableOption") @Nullable Object tableOption,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("upsertSettings") @Nullable SqlUpsertSettingsResponse upsertSettings,
        @OutputCustomType.Parameter("writeBatchSize") @Nullable Object writeBatchSize,
        @OutputCustomType.Parameter("writeBatchTimeout") @Nullable Object writeBatchTimeout,
        @OutputCustomType.Parameter("writeBehavior") @Nullable Object writeBehavior) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.preCopyScript = preCopyScript;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.sqlWriterStoredProcedureName = sqlWriterStoredProcedureName;
        this.sqlWriterTableType = sqlWriterTableType;
        this.sqlWriterUseTableLock = sqlWriterUseTableLock;
        this.storedProcedureParameters = storedProcedureParameters;
        this.storedProcedureTableTypeParameterName = storedProcedureTableTypeParameterName;
        this.tableOption = tableOption;
        this.type = type;
        this.upsertSettings = upsertSettings;
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
        this.writeBehavior = writeBehavior;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getPreCopyScript() {
        return Optional.ofNullable(this.preCopyScript);
    }
    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getSinkRetryCount() {
        return Optional.ofNullable(this.sinkRetryCount);
    }
    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getSinkRetryWait() {
        return Optional.ofNullable(this.sinkRetryWait);
    }
    /**
     * SQL writer stored procedure name. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getSqlWriterStoredProcedureName() {
        return Optional.ofNullable(this.sqlWriterStoredProcedureName);
    }
    /**
     * SQL writer table type. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getSqlWriterTableType() {
        return Optional.ofNullable(this.sqlWriterTableType);
    }
    /**
     * Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getSqlWriterUseTableLock() {
        return Optional.ofNullable(this.sqlWriterUseTableLock);
    }
    /**
     * SQL stored procedure parameters.
     * 
    */
    public Map<String,StoredProcedureParameterResponse> getStoredProcedureParameters() {
        return this.storedProcedureParameters == null ? Map.of() : this.storedProcedureParameters;
    }
    /**
     * The stored procedure parameter name of the table type. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getStoredProcedureTableTypeParameterName() {
        return Optional.ofNullable(this.storedProcedureTableTypeParameterName);
    }
    /**
     * The option to handle sink table, such as autoCreate. For now only 'autoCreate' value is supported. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getTableOption() {
        return Optional.ofNullable(this.tableOption);
    }
    /**
     * Copy sink type.
     * Expected value is 'AzureSqlSink'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * SQL upsert settings.
     * 
    */
    public Optional<SqlUpsertSettingsResponse> getUpsertSettings() {
        return Optional.ofNullable(this.upsertSettings);
    }
    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
    */
    public Optional<Object> getWriteBatchSize() {
        return Optional.ofNullable(this.writeBatchSize);
    }
    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getWriteBatchTimeout() {
        return Optional.ofNullable(this.writeBatchTimeout);
    }
    /**
     * Write behavior when copying data into Azure SQL. Type: SqlWriteBehaviorEnum (or Expression with resultType SqlWriteBehaviorEnum)
     * 
    */
    public Optional<Object> getWriteBehavior() {
        return Optional.ofNullable(this.writeBehavior);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object preCopyScript;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private @Nullable Object sqlWriterStoredProcedureName;
        private @Nullable Object sqlWriterTableType;
        private @Nullable Object sqlWriterUseTableLock;
        private @Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters;
        private @Nullable Object storedProcedureTableTypeParameterName;
        private @Nullable Object tableOption;
        private String type;
        private @Nullable SqlUpsertSettingsResponse upsertSettings;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;
        private @Nullable Object writeBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.preCopyScript = defaults.preCopyScript;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.sqlWriterStoredProcedureName = defaults.sqlWriterStoredProcedureName;
    	      this.sqlWriterTableType = defaults.sqlWriterTableType;
    	      this.sqlWriterUseTableLock = defaults.sqlWriterUseTableLock;
    	      this.storedProcedureParameters = defaults.storedProcedureParameters;
    	      this.storedProcedureTableTypeParameterName = defaults.storedProcedureTableTypeParameterName;
    	      this.tableOption = defaults.tableOption;
    	      this.type = defaults.type;
    	      this.upsertSettings = defaults.upsertSettings;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
    	      this.writeBehavior = defaults.writeBehavior;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder preCopyScript(@Nullable Object preCopyScript) {
            this.preCopyScript = preCopyScript;
            return this;
        }

        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder sqlWriterStoredProcedureName(@Nullable Object sqlWriterStoredProcedureName) {
            this.sqlWriterStoredProcedureName = sqlWriterStoredProcedureName;
            return this;
        }

        public Builder sqlWriterTableType(@Nullable Object sqlWriterTableType) {
            this.sqlWriterTableType = sqlWriterTableType;
            return this;
        }

        public Builder sqlWriterUseTableLock(@Nullable Object sqlWriterUseTableLock) {
            this.sqlWriterUseTableLock = sqlWriterUseTableLock;
            return this;
        }

        public Builder storedProcedureParameters(@Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters) {
            this.storedProcedureParameters = storedProcedureParameters;
            return this;
        }

        public Builder storedProcedureTableTypeParameterName(@Nullable Object storedProcedureTableTypeParameterName) {
            this.storedProcedureTableTypeParameterName = storedProcedureTableTypeParameterName;
            return this;
        }

        public Builder tableOption(@Nullable Object tableOption) {
            this.tableOption = tableOption;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder upsertSettings(@Nullable SqlUpsertSettingsResponse upsertSettings) {
            this.upsertSettings = upsertSettings;
            return this;
        }

        public Builder writeBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        public Builder writeBehavior(@Nullable Object writeBehavior) {
            this.writeBehavior = writeBehavior;
            return this;
        }
        public AzureSqlSinkResponse build() {
            return new AzureSqlSinkResponse(disableMetricsCollection, maxConcurrentConnections, preCopyScript, sinkRetryCount, sinkRetryWait, sqlWriterStoredProcedureName, sqlWriterTableType, sqlWriterUseTableLock, storedProcedureParameters, storedProcedureTableTypeParameterName, tableOption, type, upsertSettings, writeBatchSize, writeBatchTimeout, writeBehavior);
        }
    }
}
