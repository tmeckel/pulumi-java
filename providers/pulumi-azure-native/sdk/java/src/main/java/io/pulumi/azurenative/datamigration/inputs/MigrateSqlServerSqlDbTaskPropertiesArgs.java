// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlDbTaskInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for the task that migrates on-prem SQL Server databases to Azure SQL Database
 * 
 */
public final class MigrateSqlServerSqlDbTaskPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrateSqlServerSqlDbTaskPropertiesArgs Empty = new MigrateSqlServerSqlDbTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @InputImport(name="input")
      private final @Nullable Input<MigrateSqlServerSqlDbTaskInputArgs> input;

    public Input<MigrateSqlServerSqlDbTaskInputArgs> getInput() {
        return this.input == null ? Input.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'Migrate.SqlServer.SqlDb'.
     * 
     */
    @InputImport(name="taskType", required=true)
      private final Input<String> taskType;

    public Input<String> getTaskType() {
        return this.taskType;
    }

    public MigrateSqlServerSqlDbTaskPropertiesArgs(
        @Nullable Input<MigrateSqlServerSqlDbTaskInputArgs> input,
        Input<String> taskType) {
        this.input = input;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private MigrateSqlServerSqlDbTaskPropertiesArgs() {
        this.input = Input.empty();
        this.taskType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MigrateSqlServerSqlDbTaskInputArgs> input;
        private Input<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbTaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder input(@Nullable Input<MigrateSqlServerSqlDbTaskInputArgs> input) {
            this.input = input;
            return this;
        }

        public Builder input(@Nullable MigrateSqlServerSqlDbTaskInputArgs input) {
            this.input = Input.ofNullable(input);
            return this;
        }

        public Builder taskType(Input<String> taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }

        public Builder taskType(String taskType) {
            this.taskType = Input.of(Objects.requireNonNull(taskType));
            return this;
        }
        public MigrateSqlServerSqlDbTaskPropertiesArgs build() {
            return new MigrateSqlServerSqlDbTaskPropertiesArgs(input, taskType);
        }
    }
}
