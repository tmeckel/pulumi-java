// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Migration Validation Database level summary result
 * 
 */
public final class MigrationValidationDatabaseSummaryResultResponse extends com.pulumi.resources.InvokeArgs {

    public static final MigrationValidationDatabaseSummaryResultResponse Empty = new MigrationValidationDatabaseSummaryResultResponse();

    /**
     * Validation end time
     * 
     */
    @Import(name="endedOn", required=true)
    private String endedOn;

    /**
     * @return Validation end time
     * 
     */
    public String endedOn() {
        return this.endedOn;
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
     * Migration Identifier
     * 
     */
    @Import(name="migrationId", required=true)
    private String migrationId;

    /**
     * @return Migration Identifier
     * 
     */
    public String migrationId() {
        return this.migrationId;
    }

    /**
     * Name of the source database
     * 
     */
    @Import(name="sourceDatabaseName", required=true)
    private String sourceDatabaseName;

    /**
     * @return Name of the source database
     * 
     */
    public String sourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    /**
     * Validation start time
     * 
     */
    @Import(name="startedOn", required=true)
    private String startedOn;

    /**
     * @return Validation start time
     * 
     */
    public String startedOn() {
        return this.startedOn;
    }

    /**
     * Current status of validation at the database level
     * 
     */
    @Import(name="status", required=true)
    private String status;

    /**
     * @return Current status of validation at the database level
     * 
     */
    public String status() {
        return this.status;
    }

    /**
     * Name of the target database
     * 
     */
    @Import(name="targetDatabaseName", required=true)
    private String targetDatabaseName;

    /**
     * @return Name of the target database
     * 
     */
    public String targetDatabaseName() {
        return this.targetDatabaseName;
    }

    private MigrationValidationDatabaseSummaryResultResponse() {}

    private MigrationValidationDatabaseSummaryResultResponse(MigrationValidationDatabaseSummaryResultResponse $) {
        this.endedOn = $.endedOn;
        this.id = $.id;
        this.migrationId = $.migrationId;
        this.sourceDatabaseName = $.sourceDatabaseName;
        this.startedOn = $.startedOn;
        this.status = $.status;
        this.targetDatabaseName = $.targetDatabaseName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrationValidationDatabaseSummaryResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrationValidationDatabaseSummaryResultResponse $;

        public Builder() {
            $ = new MigrationValidationDatabaseSummaryResultResponse();
        }

        public Builder(MigrationValidationDatabaseSummaryResultResponse defaults) {
            $ = new MigrationValidationDatabaseSummaryResultResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param endedOn Validation end time
         * 
         * @return builder
         * 
         */
        public Builder endedOn(String endedOn) {
            $.endedOn = endedOn;
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
         * @param migrationId Migration Identifier
         * 
         * @return builder
         * 
         */
        public Builder migrationId(String migrationId) {
            $.migrationId = migrationId;
            return this;
        }

        /**
         * @param sourceDatabaseName Name of the source database
         * 
         * @return builder
         * 
         */
        public Builder sourceDatabaseName(String sourceDatabaseName) {
            $.sourceDatabaseName = sourceDatabaseName;
            return this;
        }

        /**
         * @param startedOn Validation start time
         * 
         * @return builder
         * 
         */
        public Builder startedOn(String startedOn) {
            $.startedOn = startedOn;
            return this;
        }

        /**
         * @param status Current status of validation at the database level
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            $.status = status;
            return this;
        }

        /**
         * @param targetDatabaseName Name of the target database
         * 
         * @return builder
         * 
         */
        public Builder targetDatabaseName(String targetDatabaseName) {
            $.targetDatabaseName = targetDatabaseName;
            return this;
        }

        public MigrationValidationDatabaseSummaryResultResponse build() {
            $.endedOn = Objects.requireNonNull($.endedOn, "expected parameter 'endedOn' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.migrationId = Objects.requireNonNull($.migrationId, "expected parameter 'migrationId' to be non-null");
            $.sourceDatabaseName = Objects.requireNonNull($.sourceDatabaseName, "expected parameter 'sourceDatabaseName' to be non-null");
            $.startedOn = Objects.requireNonNull($.startedOn, "expected parameter 'startedOn' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.targetDatabaseName = Objects.requireNonNull($.targetDatabaseName, "expected parameter 'targetDatabaseName' to be non-null");
            return $;
        }
    }

}
