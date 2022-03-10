// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.SapTablePartitionSettingsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SapTableSourceResponse {
    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    private final @Nullable Object additionalColumns;
    /**
     * Specifies the maximum number of rows that will be retrieved at a time when retrieving data from SAP Table. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object batchSize;
    /**
     * Specifies the custom RFC function module that will be used to read data from SAP Table. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object customRfcReadTableFunctionModule;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * The partition mechanism that will be used for SAP table read in parallel. Possible values include: "None", "PartitionOnInt", "PartitionOnCalendarYear", "PartitionOnCalendarMonth", "PartitionOnCalendarDate", "PartitionOnTime".
     * 
     */
    private final @Nullable Object partitionOption;
    /**
     * The settings that will be leveraged for SAP table source partitioning.
     * 
     */
    private final @Nullable SapTablePartitionSettingsResponse partitionSettings;
    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object queryTimeout;
    /**
     * The fields of the SAP table that will be retrieved. For example, column0, column1. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object rfcTableFields;
    /**
     * The options for the filtering of the SAP Table. For example, COLUMN0 EQ SOME VALUE. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object rfcTableOptions;
    /**
     * The number of rows to be retrieved. Type: integer(or Expression with resultType integer).
     * 
     */
    private final @Nullable Object rowCount;
    /**
     * The number of rows that will be skipped. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object rowSkips;
    /**
     * The single character that will be used as delimiter passed to SAP RFC as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object sapDataColumnDelimiter;
    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object sourceRetryCount;
    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object sourceRetryWait;
    /**
     * Copy source type.
     * Expected value is 'SapTableSource'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private SapTableSourceResponse(
        @OutputCustomType.Parameter("additionalColumns") @Nullable Object additionalColumns,
        @OutputCustomType.Parameter("batchSize") @Nullable Object batchSize,
        @OutputCustomType.Parameter("customRfcReadTableFunctionModule") @Nullable Object customRfcReadTableFunctionModule,
        @OutputCustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @OutputCustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @OutputCustomType.Parameter("partitionOption") @Nullable Object partitionOption,
        @OutputCustomType.Parameter("partitionSettings") @Nullable SapTablePartitionSettingsResponse partitionSettings,
        @OutputCustomType.Parameter("queryTimeout") @Nullable Object queryTimeout,
        @OutputCustomType.Parameter("rfcTableFields") @Nullable Object rfcTableFields,
        @OutputCustomType.Parameter("rfcTableOptions") @Nullable Object rfcTableOptions,
        @OutputCustomType.Parameter("rowCount") @Nullable Object rowCount,
        @OutputCustomType.Parameter("rowSkips") @Nullable Object rowSkips,
        @OutputCustomType.Parameter("sapDataColumnDelimiter") @Nullable Object sapDataColumnDelimiter,
        @OutputCustomType.Parameter("sourceRetryCount") @Nullable Object sourceRetryCount,
        @OutputCustomType.Parameter("sourceRetryWait") @Nullable Object sourceRetryWait,
        @OutputCustomType.Parameter("type") String type) {
        this.additionalColumns = additionalColumns;
        this.batchSize = batchSize;
        this.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.partitionOption = partitionOption;
        this.partitionSettings = partitionSettings;
        this.queryTimeout = queryTimeout;
        this.rfcTableFields = rfcTableFields;
        this.rfcTableOptions = rfcTableOptions;
        this.rowCount = rowCount;
        this.rowSkips = rowSkips;
        this.sapDataColumnDelimiter = sapDataColumnDelimiter;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = type;
    }

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
    */
    public Optional<Object> getAdditionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }
    /**
     * Specifies the maximum number of rows that will be retrieved at a time when retrieving data from SAP Table. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getBatchSize() {
        return Optional.ofNullable(this.batchSize);
    }
    /**
     * Specifies the custom RFC function module that will be used to read data from SAP Table. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getCustomRfcReadTableFunctionModule() {
        return Optional.ofNullable(this.customRfcReadTableFunctionModule);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * The partition mechanism that will be used for SAP table read in parallel. Possible values include: "None", "PartitionOnInt", "PartitionOnCalendarYear", "PartitionOnCalendarMonth", "PartitionOnCalendarDate", "PartitionOnTime".
     * 
    */
    public Optional<Object> getPartitionOption() {
        return Optional.ofNullable(this.partitionOption);
    }
    /**
     * The settings that will be leveraged for SAP table source partitioning.
     * 
    */
    public Optional<SapTablePartitionSettingsResponse> getPartitionSettings() {
        return Optional.ofNullable(this.partitionSettings);
    }
    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getQueryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }
    /**
     * The fields of the SAP table that will be retrieved. For example, column0, column1. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getRfcTableFields() {
        return Optional.ofNullable(this.rfcTableFields);
    }
    /**
     * The options for the filtering of the SAP Table. For example, COLUMN0 EQ SOME VALUE. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getRfcTableOptions() {
        return Optional.ofNullable(this.rfcTableOptions);
    }
    /**
     * The number of rows to be retrieved. Type: integer(or Expression with resultType integer).
     * 
    */
    public Optional<Object> getRowCount() {
        return Optional.ofNullable(this.rowCount);
    }
    /**
     * The number of rows that will be skipped. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getRowSkips() {
        return Optional.ofNullable(this.rowSkips);
    }
    /**
     * The single character that will be used as delimiter passed to SAP RFC as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getSapDataColumnDelimiter() {
        return Optional.ofNullable(this.sapDataColumnDelimiter);
    }
    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getSourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }
    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getSourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }
    /**
     * Copy source type.
     * Expected value is 'SapTableSource'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapTableSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object batchSize;
        private @Nullable Object customRfcReadTableFunctionModule;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object partitionOption;
        private @Nullable SapTablePartitionSettingsResponse partitionSettings;
        private @Nullable Object queryTimeout;
        private @Nullable Object rfcTableFields;
        private @Nullable Object rfcTableOptions;
        private @Nullable Object rowCount;
        private @Nullable Object rowSkips;
        private @Nullable Object sapDataColumnDelimiter;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SapTableSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.batchSize = defaults.batchSize;
    	      this.customRfcReadTableFunctionModule = defaults.customRfcReadTableFunctionModule;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.partitionOption = defaults.partitionOption;
    	      this.partitionSettings = defaults.partitionSettings;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.rfcTableFields = defaults.rfcTableFields;
    	      this.rfcTableOptions = defaults.rfcTableOptions;
    	      this.rowCount = defaults.rowCount;
    	      this.rowSkips = defaults.rowSkips;
    	      this.sapDataColumnDelimiter = defaults.sapDataColumnDelimiter;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder additionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }

        public Builder batchSize(@Nullable Object batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        public Builder customRfcReadTableFunctionModule(@Nullable Object customRfcReadTableFunctionModule) {
            this.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
            return this;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder partitionOption(@Nullable Object partitionOption) {
            this.partitionOption = partitionOption;
            return this;
        }

        public Builder partitionSettings(@Nullable SapTablePartitionSettingsResponse partitionSettings) {
            this.partitionSettings = partitionSettings;
            return this;
        }

        public Builder queryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }

        public Builder rfcTableFields(@Nullable Object rfcTableFields) {
            this.rfcTableFields = rfcTableFields;
            return this;
        }

        public Builder rfcTableOptions(@Nullable Object rfcTableOptions) {
            this.rfcTableOptions = rfcTableOptions;
            return this;
        }

        public Builder rowCount(@Nullable Object rowCount) {
            this.rowCount = rowCount;
            return this;
        }

        public Builder rowSkips(@Nullable Object rowSkips) {
            this.rowSkips = rowSkips;
            return this;
        }

        public Builder sapDataColumnDelimiter(@Nullable Object sapDataColumnDelimiter) {
            this.sapDataColumnDelimiter = sapDataColumnDelimiter;
            return this;
        }

        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SapTableSourceResponse build() {
            return new SapTableSourceResponse(additionalColumns, batchSize, customRfcReadTableFunctionModule, disableMetricsCollection, maxConcurrentConnections, partitionOption, partitionSettings, queryTimeout, rfcTableFields, rfcTableOptions, rowCount, rowSkips, sapDataColumnDelimiter, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
