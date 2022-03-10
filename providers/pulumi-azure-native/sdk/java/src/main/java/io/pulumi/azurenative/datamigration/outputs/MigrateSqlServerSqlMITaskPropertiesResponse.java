// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.MigrateMISyncCompleteCommandPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateSqlServerSqlMITaskInputResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateSqlServerSqlMITaskOutputAgentJobLevelResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateSqlServerSqlMITaskOutputDatabaseLevelResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateSqlServerSqlMITaskOutputErrorResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateSqlServerSqlMITaskOutputLoginLevelResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateSqlServerSqlMITaskOutputMigrationLevelResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateSyncCompleteCommandPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.ODataErrorResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MigrateSqlServerSqlMITaskPropertiesResponse {
    /**
     * Array of command properties.
     * 
     */
    private final List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;
    /**
     * Array of errors. This is ignored if submitted.
     * 
     */
    private final List<ODataErrorResponse> errors;
    /**
     * Task input
     * 
     */
    private final @Nullable MigrateSqlServerSqlMITaskInputResponse input;
    /**
     * Task output. This is ignored if submitted.
     * 
     */
    private final List<Object> output;
    /**
     * The state of the task. This is ignored if submitted.
     * 
     */
    private final String state;
    /**
     * Task type.
     * Expected value is 'Migrate.SqlServer.AzureSqlDbMI'.
     * 
     */
    private final String taskType;

    @OutputCustomType.Constructor
    private MigrateSqlServerSqlMITaskPropertiesResponse(
        @OutputCustomType.Parameter("commands") List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands,
        @OutputCustomType.Parameter("errors") List<ODataErrorResponse> errors,
        @OutputCustomType.Parameter("input") @Nullable MigrateSqlServerSqlMITaskInputResponse input,
        @OutputCustomType.Parameter("output") List<Object> output,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("taskType") String taskType) {
        this.commands = commands;
        this.errors = errors;
        this.input = input;
        this.output = output;
        this.state = state;
        this.taskType = taskType;
    }

    /**
     * Array of command properties.
     * 
    */
    public List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> getCommands() {
        return this.commands;
    }
    /**
     * Array of errors. This is ignored if submitted.
     * 
    */
    public List<ODataErrorResponse> getErrors() {
        return this.errors;
    }
    /**
     * Task input
     * 
    */
    public Optional<MigrateSqlServerSqlMITaskInputResponse> getInput() {
        return Optional.ofNullable(this.input);
    }
    /**
     * Task output. This is ignored if submitted.
     * 
    */
    public List<Object> getOutput() {
        return this.output;
    }
    /**
     * The state of the task. This is ignored if submitted.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Task type.
     * Expected value is 'Migrate.SqlServer.AzureSqlDbMI'.
     * 
    */
    public String getTaskType() {
        return this.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMITaskPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;
        private List<ODataErrorResponse> errors;
        private @Nullable MigrateSqlServerSqlMITaskInputResponse input;
        private List<Object> output;
        private String state;
        private String taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMITaskPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commands = defaults.commands;
    	      this.errors = defaults.errors;
    	      this.input = defaults.input;
    	      this.output = defaults.output;
    	      this.state = defaults.state;
    	      this.taskType = defaults.taskType;
        }

        public Builder commands(List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands) {
            this.commands = Objects.requireNonNull(commands);
            return this;
        }

        public Builder errors(List<ODataErrorResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder input(@Nullable MigrateSqlServerSqlMITaskInputResponse input) {
            this.input = input;
            return this;
        }

        public Builder output(List<Object> output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder taskType(String taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }
        public MigrateSqlServerSqlMITaskPropertiesResponse build() {
            return new MigrateSqlServerSqlMITaskPropertiesResponse(commands, errors, input, output, state, taskType);
        }
    }
}
