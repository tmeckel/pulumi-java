// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Database specific information for SQL to Azure SQL DB migration task inputs
 * 
 */
public final class MigrateSqlServerSqlDbDatabaseInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrateSqlServerSqlDbDatabaseInputArgs Empty = new MigrateSqlServerSqlDbDatabaseInputArgs();

    /**
     * Whether to set database read only before migration
     * 
     */
    @Import(name="makeSourceDbReadOnly")
      private final @Nullable Output<Boolean> makeSourceDbReadOnly;

    public Output<Boolean> getMakeSourceDbReadOnly() {
        return this.makeSourceDbReadOnly == null ? Codegen.empty() : this.makeSourceDbReadOnly;
    }

    /**
     * Name of the database
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Mapping of source to target tables
     * 
     */
    @Import(name="tableMap")
      private final @Nullable Output<Map<String,String>> tableMap;

    public Output<Map<String,String>> getTableMap() {
        return this.tableMap == null ? Codegen.empty() : this.tableMap;
    }

    /**
     * Name of target database. Note: Target database will be truncated before starting migration.
     * 
     */
    @Import(name="targetDatabaseName")
      private final @Nullable Output<String> targetDatabaseName;

    public Output<String> getTargetDatabaseName() {
        return this.targetDatabaseName == null ? Codegen.empty() : this.targetDatabaseName;
    }

    public MigrateSqlServerSqlDbDatabaseInputArgs(
        @Nullable Output<Boolean> makeSourceDbReadOnly,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tableMap,
        @Nullable Output<String> targetDatabaseName) {
        this.makeSourceDbReadOnly = makeSourceDbReadOnly;
        this.name = name;
        this.tableMap = tableMap;
        this.targetDatabaseName = targetDatabaseName;
    }

    private MigrateSqlServerSqlDbDatabaseInputArgs() {
        this.makeSourceDbReadOnly = Codegen.empty();
        this.name = Codegen.empty();
        this.tableMap = Codegen.empty();
        this.targetDatabaseName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbDatabaseInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> makeSourceDbReadOnly;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tableMap;
        private @Nullable Output<String> targetDatabaseName;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbDatabaseInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.makeSourceDbReadOnly = defaults.makeSourceDbReadOnly;
    	      this.name = defaults.name;
    	      this.tableMap = defaults.tableMap;
    	      this.targetDatabaseName = defaults.targetDatabaseName;
        }

        public Builder makeSourceDbReadOnly(@Nullable Output<Boolean> makeSourceDbReadOnly) {
            this.makeSourceDbReadOnly = makeSourceDbReadOnly;
            return this;
        }
        public Builder makeSourceDbReadOnly(@Nullable Boolean makeSourceDbReadOnly) {
            this.makeSourceDbReadOnly = Codegen.ofNullable(makeSourceDbReadOnly);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tableMap(@Nullable Output<Map<String,String>> tableMap) {
            this.tableMap = tableMap;
            return this;
        }
        public Builder tableMap(@Nullable Map<String,String> tableMap) {
            this.tableMap = Codegen.ofNullable(tableMap);
            return this;
        }
        public Builder targetDatabaseName(@Nullable Output<String> targetDatabaseName) {
            this.targetDatabaseName = targetDatabaseName;
            return this;
        }
        public Builder targetDatabaseName(@Nullable String targetDatabaseName) {
            this.targetDatabaseName = Codegen.ofNullable(targetDatabaseName);
            return this;
        }        public MigrateSqlServerSqlDbDatabaseInputArgs build() {
            return new MigrateSqlServerSqlDbDatabaseInputArgs(makeSourceDbReadOnly, name, tableMap, targetDatabaseName);
        }
    }
}
