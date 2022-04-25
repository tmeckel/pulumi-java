// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.ConnectToSourcePostgreSqlSyncTaskInputResponse;
import com.pulumi.azurenative.datamigration.inputs.ConnectToSourcePostgreSqlSyncTaskOutputResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrateMISyncCompleteCommandPropertiesResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrateSyncCompleteCommandPropertiesResponse;
import com.pulumi.azurenative.datamigration.inputs.ODataErrorResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for the task that validates connection to PostgreSQL server and source server requirements for online migration
 * 
 */
public final class ConnectToSourcePostgreSqlSyncTaskPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConnectToSourcePostgreSqlSyncTaskPropertiesResponse Empty = new ConnectToSourcePostgreSqlSyncTaskPropertiesResponse();

    /**
     * Array of command properties.
     * 
     */
    @Import(name="commands", required=true)
    private List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;

    /**
     * @return Array of command properties.
     * 
     */
    public List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands() {
        return this.commands;
    }

    /**
     * Array of errors. This is ignored if submitted.
     * 
     */
    @Import(name="errors", required=true)
    private List<ODataErrorResponse> errors;

    /**
     * @return Array of errors. This is ignored if submitted.
     * 
     */
    public List<ODataErrorResponse> errors() {
        return this.errors;
    }

    /**
     * Task input
     * 
     */
    @Import(name="input")
    private @Nullable ConnectToSourcePostgreSqlSyncTaskInputResponse input;

    /**
     * @return Task input
     * 
     */
    public Optional<ConnectToSourcePostgreSqlSyncTaskInputResponse> input() {
        return Optional.ofNullable(this.input);
    }

    /**
     * Task output. This is ignored if submitted.
     * 
     */
    @Import(name="output", required=true)
    private List<ConnectToSourcePostgreSqlSyncTaskOutputResponse> output;

    /**
     * @return Task output. This is ignored if submitted.
     * 
     */
    public List<ConnectToSourcePostgreSqlSyncTaskOutputResponse> output() {
        return this.output;
    }

    /**
     * The state of the task. This is ignored if submitted.
     * 
     */
    @Import(name="state", required=true)
    private String state;

    /**
     * @return The state of the task. This is ignored if submitted.
     * 
     */
    public String state() {
        return this.state;
    }

    /**
     * Task type.
     * Expected value is &#39;ConnectToSource.PostgreSql.Sync&#39;.
     * 
     */
    @Import(name="taskType", required=true)
    private String taskType;

    /**
     * @return Task type.
     * Expected value is &#39;ConnectToSource.PostgreSql.Sync&#39;.
     * 
     */
    public String taskType() {
        return this.taskType;
    }

    private ConnectToSourcePostgreSqlSyncTaskPropertiesResponse() {}

    private ConnectToSourcePostgreSqlSyncTaskPropertiesResponse(ConnectToSourcePostgreSqlSyncTaskPropertiesResponse $) {
        this.commands = $.commands;
        this.errors = $.errors;
        this.input = $.input;
        this.output = $.output;
        this.state = $.state;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectToSourcePostgreSqlSyncTaskPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectToSourcePostgreSqlSyncTaskPropertiesResponse $;

        public Builder() {
            $ = new ConnectToSourcePostgreSqlSyncTaskPropertiesResponse();
        }

        public Builder(ConnectToSourcePostgreSqlSyncTaskPropertiesResponse defaults) {
            $ = new ConnectToSourcePostgreSqlSyncTaskPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param commands Array of command properties.
         * 
         * @return builder
         * 
         */
        public Builder commands(List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands) {
            $.commands = commands;
            return this;
        }

        /**
         * @param commands Array of command properties.
         * 
         * @return builder
         * 
         */
        public Builder commands(Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>... commands) {
            return commands(List.of(commands));
        }

        /**
         * @param errors Array of errors. This is ignored if submitted.
         * 
         * @return builder
         * 
         */
        public Builder errors(List<ODataErrorResponse> errors) {
            $.errors = errors;
            return this;
        }

        /**
         * @param errors Array of errors. This is ignored if submitted.
         * 
         * @return builder
         * 
         */
        public Builder errors(ODataErrorResponse... errors) {
            return errors(List.of(errors));
        }

        /**
         * @param input Task input
         * 
         * @return builder
         * 
         */
        public Builder input(@Nullable ConnectToSourcePostgreSqlSyncTaskInputResponse input) {
            $.input = input;
            return this;
        }

        /**
         * @param output Task output. This is ignored if submitted.
         * 
         * @return builder
         * 
         */
        public Builder output(List<ConnectToSourcePostgreSqlSyncTaskOutputResponse> output) {
            $.output = output;
            return this;
        }

        /**
         * @param output Task output. This is ignored if submitted.
         * 
         * @return builder
         * 
         */
        public Builder output(ConnectToSourcePostgreSqlSyncTaskOutputResponse... output) {
            return output(List.of(output));
        }

        /**
         * @param state The state of the task. This is ignored if submitted.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            $.state = state;
            return this;
        }

        /**
         * @param taskType Task type.
         * Expected value is &#39;ConnectToSource.PostgreSql.Sync&#39;.
         * 
         * @return builder
         * 
         */
        public Builder taskType(String taskType) {
            $.taskType = taskType;
            return this;
        }

        public ConnectToSourcePostgreSqlSyncTaskPropertiesResponse build() {
            $.commands = Objects.requireNonNull($.commands, "expected parameter 'commands' to be non-null");
            $.errors = Objects.requireNonNull($.errors, "expected parameter 'errors' to be non-null");
            $.output = Objects.requireNonNull($.output, "expected parameter 'output' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            $.taskType = Codegen.stringProp("taskType").arg($.taskType).require();
            return $;
        }
    }

}
