// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.MigrateSqlServerSqlDbDatabaseInputResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrationValidationOptionsResponse;
import io.pulumi.azurenative.datamigration.outputs.SqlConnectionInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MigrateSqlServerSqlDbTaskInputResponse {
    /**
     * Databases to migrate
     * 
     */
    private final List<MigrateSqlServerSqlDbDatabaseInputResponse> selectedDatabases;
    /**
     * Information for connecting to source
     * 
     */
    private final SqlConnectionInfoResponse sourceConnectionInfo;
    /**
     * Information for connecting to target
     * 
     */
    private final SqlConnectionInfoResponse targetConnectionInfo;
    /**
     * Options for enabling various post migration validations. Available options,
     *  1.) Data Integrity Check: Performs a checksum based comparison on source and target tables after the migration to ensure the correctness of the data.
     *  2.) Schema Validation: Performs a thorough schema comparison between the source and target tables and provides a list of differences between the source and target database, 3.) Query Analysis: Executes a set of queries picked up automatically either from the Query Plan Cache or Query Store and execute them and compares the execution time between the source and target database.
     * 
     */
    private final @Nullable MigrationValidationOptionsResponse validationOptions;

    @OutputCustomType.Constructor
    private MigrateSqlServerSqlDbTaskInputResponse(
        @OutputCustomType.Parameter("selectedDatabases") List<MigrateSqlServerSqlDbDatabaseInputResponse> selectedDatabases,
        @OutputCustomType.Parameter("sourceConnectionInfo") SqlConnectionInfoResponse sourceConnectionInfo,
        @OutputCustomType.Parameter("targetConnectionInfo") SqlConnectionInfoResponse targetConnectionInfo,
        @OutputCustomType.Parameter("validationOptions") @Nullable MigrationValidationOptionsResponse validationOptions) {
        this.selectedDatabases = selectedDatabases;
        this.sourceConnectionInfo = sourceConnectionInfo;
        this.targetConnectionInfo = targetConnectionInfo;
        this.validationOptions = validationOptions;
    }

    /**
     * Databases to migrate
     * 
    */
    public List<MigrateSqlServerSqlDbDatabaseInputResponse> getSelectedDatabases() {
        return this.selectedDatabases;
    }
    /**
     * Information for connecting to source
     * 
    */
    public SqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }
    /**
     * Information for connecting to target
     * 
    */
    public SqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }
    /**
     * Options for enabling various post migration validations. Available options,
     *  1.) Data Integrity Check: Performs a checksum based comparison on source and target tables after the migration to ensure the correctness of the data.
     *  2.) Schema Validation: Performs a thorough schema comparison between the source and target tables and provides a list of differences between the source and target database, 3.) Query Analysis: Executes a set of queries picked up automatically either from the Query Plan Cache or Query Store and execute them and compares the execution time between the source and target database.
     * 
    */
    public Optional<MigrationValidationOptionsResponse> getValidationOptions() {
        return Optional.ofNullable(this.validationOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MigrateSqlServerSqlDbDatabaseInputResponse> selectedDatabases;
        private SqlConnectionInfoResponse sourceConnectionInfo;
        private SqlConnectionInfoResponse targetConnectionInfo;
        private @Nullable MigrationValidationOptionsResponse validationOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
    	      this.validationOptions = defaults.validationOptions;
        }

        public Builder selectedDatabases(List<MigrateSqlServerSqlDbDatabaseInputResponse> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }

        public Builder sourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder targetConnectionInfo(SqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public Builder validationOptions(@Nullable MigrationValidationOptionsResponse validationOptions) {
            this.validationOptions = validationOptions;
            return this;
        }
        public MigrateSqlServerSqlDbTaskInputResponse build() {
            return new MigrateSqlServerSqlDbTaskInputResponse(selectedDatabases, sourceConnectionInfo, targetConnectionInfo, validationOptions);
        }
    }
}
