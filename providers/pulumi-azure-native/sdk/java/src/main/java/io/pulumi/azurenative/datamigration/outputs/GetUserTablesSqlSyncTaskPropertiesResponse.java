// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.GetUserTablesSqlSyncTaskInputResponse;
import io.pulumi.azurenative.datamigration.outputs.GetUserTablesSqlSyncTaskOutputResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateMISyncCompleteCommandPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateSyncCompleteCommandPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.ODataErrorResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetUserTablesSqlSyncTaskPropertiesResponse {
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
    private final @Nullable GetUserTablesSqlSyncTaskInputResponse input;
    /**
     * Task output. This is ignored if submitted.
     * 
     */
    private final List<GetUserTablesSqlSyncTaskOutputResponse> output;
    /**
     * The state of the task. This is ignored if submitted.
     * 
     */
    private final String state;
    /**
     * Task type.
     * Expected value is 'GetUserTables.AzureSqlDb.Sync'.
     * 
     */
    private final String taskType;

    @OutputCustomType.Constructor
    private GetUserTablesSqlSyncTaskPropertiesResponse(
        @OutputCustomType.Parameter("commands") List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands,
        @OutputCustomType.Parameter("errors") List<ODataErrorResponse> errors,
        @OutputCustomType.Parameter("input") @Nullable GetUserTablesSqlSyncTaskInputResponse input,
        @OutputCustomType.Parameter("output") List<GetUserTablesSqlSyncTaskOutputResponse> output,
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
    public Optional<GetUserTablesSqlSyncTaskInputResponse> getInput() {
        return Optional.ofNullable(this.input);
    }
    /**
     * Task output. This is ignored if submitted.
     * 
    */
    public List<GetUserTablesSqlSyncTaskOutputResponse> getOutput() {
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
     * Expected value is 'GetUserTables.AzureSqlDb.Sync'.
     * 
    */
    public String getTaskType() {
        return this.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserTablesSqlSyncTaskPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;
        private List<ODataErrorResponse> errors;
        private @Nullable GetUserTablesSqlSyncTaskInputResponse input;
        private List<GetUserTablesSqlSyncTaskOutputResponse> output;
        private String state;
        private String taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserTablesSqlSyncTaskPropertiesResponse defaults) {
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

        public Builder input(@Nullable GetUserTablesSqlSyncTaskInputResponse input) {
            this.input = input;
            return this;
        }

        public Builder output(List<GetUserTablesSqlSyncTaskOutputResponse> output) {
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
        public GetUserTablesSqlSyncTaskPropertiesResponse build() {
            return new GetUserTablesSqlSyncTaskPropertiesResponse(commands, errors, input, output, state, taskType);
        }
    }
}
