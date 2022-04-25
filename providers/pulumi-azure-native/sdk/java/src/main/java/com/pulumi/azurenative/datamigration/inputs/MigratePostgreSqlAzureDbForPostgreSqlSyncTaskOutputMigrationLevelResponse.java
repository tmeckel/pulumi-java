// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse extends com.pulumi.resources.InvokeArgs {

    public static final MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse Empty = new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse();

    /**
     * Migration end time
     * 
     */
    @Import(name="endedOn", required=true)
    private String endedOn;

    /**
     * @return Migration end time
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
     * Result type
     * Expected value is &#39;MigrationLevelOutput&#39;.
     * 
     */
    @Import(name="resultType", required=true)
    private String resultType;

    /**
     * @return Result type
     * Expected value is &#39;MigrationLevelOutput&#39;.
     * 
     */
    public String resultType() {
        return this.resultType;
    }

    /**
     * Source server name
     * 
     */
    @Import(name="sourceServer", required=true)
    private String sourceServer;

    /**
     * @return Source server name
     * 
     */
    public String sourceServer() {
        return this.sourceServer;
    }

    /**
     * Source server version
     * 
     */
    @Import(name="sourceServerVersion", required=true)
    private String sourceServerVersion;

    /**
     * @return Source server version
     * 
     */
    public String sourceServerVersion() {
        return this.sourceServerVersion;
    }

    /**
     * Migration start time
     * 
     */
    @Import(name="startedOn", required=true)
    private String startedOn;

    /**
     * @return Migration start time
     * 
     */
    public String startedOn() {
        return this.startedOn;
    }

    /**
     * Target server name
     * 
     */
    @Import(name="targetServer", required=true)
    private String targetServer;

    /**
     * @return Target server name
     * 
     */
    public String targetServer() {
        return this.targetServer;
    }

    /**
     * Target server version
     * 
     */
    @Import(name="targetServerVersion", required=true)
    private String targetServerVersion;

    /**
     * @return Target server version
     * 
     */
    public String targetServerVersion() {
        return this.targetServerVersion;
    }

    private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse() {}

    private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse $) {
        this.endedOn = $.endedOn;
        this.id = $.id;
        this.resultType = $.resultType;
        this.sourceServer = $.sourceServer;
        this.sourceServerVersion = $.sourceServerVersion;
        this.startedOn = $.startedOn;
        this.targetServer = $.targetServer;
        this.targetServerVersion = $.targetServerVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse $;

        public Builder() {
            $ = new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse();
        }

        public Builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse defaults) {
            $ = new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param endedOn Migration end time
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
         * @param resultType Result type
         * Expected value is &#39;MigrationLevelOutput&#39;.
         * 
         * @return builder
         * 
         */
        public Builder resultType(String resultType) {
            $.resultType = resultType;
            return this;
        }

        /**
         * @param sourceServer Source server name
         * 
         * @return builder
         * 
         */
        public Builder sourceServer(String sourceServer) {
            $.sourceServer = sourceServer;
            return this;
        }

        /**
         * @param sourceServerVersion Source server version
         * 
         * @return builder
         * 
         */
        public Builder sourceServerVersion(String sourceServerVersion) {
            $.sourceServerVersion = sourceServerVersion;
            return this;
        }

        /**
         * @param startedOn Migration start time
         * 
         * @return builder
         * 
         */
        public Builder startedOn(String startedOn) {
            $.startedOn = startedOn;
            return this;
        }

        /**
         * @param targetServer Target server name
         * 
         * @return builder
         * 
         */
        public Builder targetServer(String targetServer) {
            $.targetServer = targetServer;
            return this;
        }

        /**
         * @param targetServerVersion Target server version
         * 
         * @return builder
         * 
         */
        public Builder targetServerVersion(String targetServerVersion) {
            $.targetServerVersion = targetServerVersion;
            return this;
        }

        public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputMigrationLevelResponse build() {
            $.endedOn = Objects.requireNonNull($.endedOn, "expected parameter 'endedOn' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.resultType = Codegen.stringProp("resultType").arg($.resultType).require();
            $.sourceServer = Objects.requireNonNull($.sourceServer, "expected parameter 'sourceServer' to be non-null");
            $.sourceServerVersion = Objects.requireNonNull($.sourceServerVersion, "expected parameter 'sourceServerVersion' to be non-null");
            $.startedOn = Objects.requireNonNull($.startedOn, "expected parameter 'startedOn' to be non-null");
            $.targetServer = Objects.requireNonNull($.targetServer, "expected parameter 'targetServer' to be non-null");
            $.targetServerVersion = Objects.requireNonNull($.targetServerVersion, "expected parameter 'targetServerVersion' to be non-null");
            return $;
        }
    }

}
