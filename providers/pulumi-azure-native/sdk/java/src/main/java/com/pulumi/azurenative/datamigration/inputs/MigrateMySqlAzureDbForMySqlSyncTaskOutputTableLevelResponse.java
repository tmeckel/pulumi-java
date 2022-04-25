// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse extends com.pulumi.resources.InvokeArgs {

    public static final MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse Empty = new MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse();

    /**
     * Number of applied deletes
     * 
     */
    @Import(name="cdcDeleteCounter", required=true)
    private String cdcDeleteCounter;

    /**
     * @return Number of applied deletes
     * 
     */
    public String cdcDeleteCounter() {
        return this.cdcDeleteCounter;
    }

    /**
     * Number of applied inserts
     * 
     */
    @Import(name="cdcInsertCounter", required=true)
    private String cdcInsertCounter;

    /**
     * @return Number of applied inserts
     * 
     */
    public String cdcInsertCounter() {
        return this.cdcInsertCounter;
    }

    /**
     * Number of applied updates
     * 
     */
    @Import(name="cdcUpdateCounter", required=true)
    private String cdcUpdateCounter;

    /**
     * @return Number of applied updates
     * 
     */
    public String cdcUpdateCounter() {
        return this.cdcUpdateCounter;
    }

    /**
     * Number of data errors occurred
     * 
     */
    @Import(name="dataErrorsCounter", required=true)
    private Double dataErrorsCounter;

    /**
     * @return Number of data errors occurred
     * 
     */
    public Double dataErrorsCounter() {
        return this.dataErrorsCounter;
    }

    /**
     * Name of the database
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    /**
     * @return Name of the database
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Full load end time
     * 
     */
    @Import(name="fullLoadEndedOn", required=true)
    private String fullLoadEndedOn;

    /**
     * @return Full load end time
     * 
     */
    public String fullLoadEndedOn() {
        return this.fullLoadEndedOn;
    }

    /**
     * Estimate to finish full load
     * 
     */
    @Import(name="fullLoadEstFinishTime", required=true)
    private String fullLoadEstFinishTime;

    /**
     * @return Estimate to finish full load
     * 
     */
    public String fullLoadEstFinishTime() {
        return this.fullLoadEstFinishTime;
    }

    /**
     * Full load start time
     * 
     */
    @Import(name="fullLoadStartedOn", required=true)
    private String fullLoadStartedOn;

    /**
     * @return Full load start time
     * 
     */
    public String fullLoadStartedOn() {
        return this.fullLoadStartedOn;
    }

    /**
     * Number of rows applied in full load
     * 
     */
    @Import(name="fullLoadTotalRows", required=true)
    private Double fullLoadTotalRows;

    /**
     * @return Number of rows applied in full load
     * 
     */
    public Double fullLoadTotalRows() {
        return this.fullLoadTotalRows;
    }

    /**
     * Result identifier
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Result identifier
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Last modified time on target
     * 
     */
    @Import(name="lastModifiedTime", required=true)
    private String lastModifiedTime;

    /**
     * @return Last modified time on target
     * 
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Result type
     * Expected value is &#39;TableLevelOutput&#39;.
     * 
     */
    @Import(name="resultType", required=true)
    private String resultType;

    /**
     * @return Result type
     * Expected value is &#39;TableLevelOutput&#39;.
     * 
     */
    public String resultType() {
        return this.resultType;
    }

    /**
     * Current state of the table migration
     * 
     */
    @Import(name="state", required=true)
    private String state;

    /**
     * @return Current state of the table migration
     * 
     */
    public String state() {
        return this.state;
    }

    /**
     * Name of the table
     * 
     */
    @Import(name="tableName", required=true)
    private String tableName;

    /**
     * @return Name of the table
     * 
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * Total number of applied changes
     * 
     */
    @Import(name="totalChangesApplied", required=true)
    private Double totalChangesApplied;

    /**
     * @return Total number of applied changes
     * 
     */
    public Double totalChangesApplied() {
        return this.totalChangesApplied;
    }

    private MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse() {}

    private MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse(MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse $) {
        this.cdcDeleteCounter = $.cdcDeleteCounter;
        this.cdcInsertCounter = $.cdcInsertCounter;
        this.cdcUpdateCounter = $.cdcUpdateCounter;
        this.dataErrorsCounter = $.dataErrorsCounter;
        this.databaseName = $.databaseName;
        this.fullLoadEndedOn = $.fullLoadEndedOn;
        this.fullLoadEstFinishTime = $.fullLoadEstFinishTime;
        this.fullLoadStartedOn = $.fullLoadStartedOn;
        this.fullLoadTotalRows = $.fullLoadTotalRows;
        this.id = $.id;
        this.lastModifiedTime = $.lastModifiedTime;
        this.resultType = $.resultType;
        this.state = $.state;
        this.tableName = $.tableName;
        this.totalChangesApplied = $.totalChangesApplied;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse $;

        public Builder() {
            $ = new MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse();
        }

        public Builder(MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse defaults) {
            $ = new MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param cdcDeleteCounter Number of applied deletes
         * 
         * @return builder
         * 
         */
        public Builder cdcDeleteCounter(String cdcDeleteCounter) {
            $.cdcDeleteCounter = cdcDeleteCounter;
            return this;
        }

        /**
         * @param cdcInsertCounter Number of applied inserts
         * 
         * @return builder
         * 
         */
        public Builder cdcInsertCounter(String cdcInsertCounter) {
            $.cdcInsertCounter = cdcInsertCounter;
            return this;
        }

        /**
         * @param cdcUpdateCounter Number of applied updates
         * 
         * @return builder
         * 
         */
        public Builder cdcUpdateCounter(String cdcUpdateCounter) {
            $.cdcUpdateCounter = cdcUpdateCounter;
            return this;
        }

        /**
         * @param dataErrorsCounter Number of data errors occurred
         * 
         * @return builder
         * 
         */
        public Builder dataErrorsCounter(Double dataErrorsCounter) {
            $.dataErrorsCounter = dataErrorsCounter;
            return this;
        }

        /**
         * @param databaseName Name of the database
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param fullLoadEndedOn Full load end time
         * 
         * @return builder
         * 
         */
        public Builder fullLoadEndedOn(String fullLoadEndedOn) {
            $.fullLoadEndedOn = fullLoadEndedOn;
            return this;
        }

        /**
         * @param fullLoadEstFinishTime Estimate to finish full load
         * 
         * @return builder
         * 
         */
        public Builder fullLoadEstFinishTime(String fullLoadEstFinishTime) {
            $.fullLoadEstFinishTime = fullLoadEstFinishTime;
            return this;
        }

        /**
         * @param fullLoadStartedOn Full load start time
         * 
         * @return builder
         * 
         */
        public Builder fullLoadStartedOn(String fullLoadStartedOn) {
            $.fullLoadStartedOn = fullLoadStartedOn;
            return this;
        }

        /**
         * @param fullLoadTotalRows Number of rows applied in full load
         * 
         * @return builder
         * 
         */
        public Builder fullLoadTotalRows(Double fullLoadTotalRows) {
            $.fullLoadTotalRows = fullLoadTotalRows;
            return this;
        }

        /**
         * @param id Result identifier
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param lastModifiedTime Last modified time on target
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            $.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * @param resultType Result type
         * Expected value is &#39;TableLevelOutput&#39;.
         * 
         * @return builder
         * 
         */
        public Builder resultType(String resultType) {
            $.resultType = resultType;
            return this;
        }

        /**
         * @param state Current state of the table migration
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            $.state = state;
            return this;
        }

        /**
         * @param tableName Name of the table
         * 
         * @return builder
         * 
         */
        public Builder tableName(String tableName) {
            $.tableName = tableName;
            return this;
        }

        /**
         * @param totalChangesApplied Total number of applied changes
         * 
         * @return builder
         * 
         */
        public Builder totalChangesApplied(Double totalChangesApplied) {
            $.totalChangesApplied = totalChangesApplied;
            return this;
        }

        public MigrateMySqlAzureDbForMySqlSyncTaskOutputTableLevelResponse build() {
            $.cdcDeleteCounter = Objects.requireNonNull($.cdcDeleteCounter, "expected parameter 'cdcDeleteCounter' to be non-null");
            $.cdcInsertCounter = Objects.requireNonNull($.cdcInsertCounter, "expected parameter 'cdcInsertCounter' to be non-null");
            $.cdcUpdateCounter = Objects.requireNonNull($.cdcUpdateCounter, "expected parameter 'cdcUpdateCounter' to be non-null");
            $.dataErrorsCounter = Objects.requireNonNull($.dataErrorsCounter, "expected parameter 'dataErrorsCounter' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.fullLoadEndedOn = Objects.requireNonNull($.fullLoadEndedOn, "expected parameter 'fullLoadEndedOn' to be non-null");
            $.fullLoadEstFinishTime = Objects.requireNonNull($.fullLoadEstFinishTime, "expected parameter 'fullLoadEstFinishTime' to be non-null");
            $.fullLoadStartedOn = Objects.requireNonNull($.fullLoadStartedOn, "expected parameter 'fullLoadStartedOn' to be non-null");
            $.fullLoadTotalRows = Objects.requireNonNull($.fullLoadTotalRows, "expected parameter 'fullLoadTotalRows' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.lastModifiedTime = Objects.requireNonNull($.lastModifiedTime, "expected parameter 'lastModifiedTime' to be non-null");
            $.resultType = Codegen.stringProp("resultType").arg($.resultType).require();
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            $.totalChangesApplied = Objects.requireNonNull($.totalChangesApplied, "expected parameter 'totalChangesApplied' to be non-null");
            return $;
        }
    }

}
