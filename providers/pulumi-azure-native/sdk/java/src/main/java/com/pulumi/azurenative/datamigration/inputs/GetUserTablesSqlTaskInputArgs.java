// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Input for the task that collects user tables for the given list of databases
 * 
 */
public final class GetUserTablesSqlTaskInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetUserTablesSqlTaskInputArgs Empty = new GetUserTablesSqlTaskInputArgs();

    /**
     * Connection information for SQL Server
     * 
     */
    @Import(name="connectionInfo", required=true)
    private Output<SqlConnectionInfoArgs> connectionInfo;

    /**
     * @return Connection information for SQL Server
     * 
     */
    public Output<SqlConnectionInfoArgs> connectionInfo() {
        return this.connectionInfo;
    }

    /**
     * List of database names to collect tables for
     * 
     */
    @Import(name="selectedDatabases", required=true)
    private Output<List<String>> selectedDatabases;

    /**
     * @return List of database names to collect tables for
     * 
     */
    public Output<List<String>> selectedDatabases() {
        return this.selectedDatabases;
    }

    private GetUserTablesSqlTaskInputArgs() {}

    private GetUserTablesSqlTaskInputArgs(GetUserTablesSqlTaskInputArgs $) {
        this.connectionInfo = $.connectionInfo;
        this.selectedDatabases = $.selectedDatabases;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserTablesSqlTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserTablesSqlTaskInputArgs $;

        public Builder() {
            $ = new GetUserTablesSqlTaskInputArgs();
        }

        public Builder(GetUserTablesSqlTaskInputArgs defaults) {
            $ = new GetUserTablesSqlTaskInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionInfo Connection information for SQL Server
         * 
         * @return builder
         * 
         */
        public Builder connectionInfo(Output<SqlConnectionInfoArgs> connectionInfo) {
            $.connectionInfo = connectionInfo;
            return this;
        }

        /**
         * @param connectionInfo Connection information for SQL Server
         * 
         * @return builder
         * 
         */
        public Builder connectionInfo(SqlConnectionInfoArgs connectionInfo) {
            return connectionInfo(Output.of(connectionInfo));
        }

        /**
         * @param selectedDatabases List of database names to collect tables for
         * 
         * @return builder
         * 
         */
        public Builder selectedDatabases(Output<List<String>> selectedDatabases) {
            $.selectedDatabases = selectedDatabases;
            return this;
        }

        /**
         * @param selectedDatabases List of database names to collect tables for
         * 
         * @return builder
         * 
         */
        public Builder selectedDatabases(List<String> selectedDatabases) {
            return selectedDatabases(Output.of(selectedDatabases));
        }

        /**
         * @param selectedDatabases List of database names to collect tables for
         * 
         * @return builder
         * 
         */
        public Builder selectedDatabases(String... selectedDatabases) {
            return selectedDatabases(List.of(selectedDatabases));
        }

        public GetUserTablesSqlTaskInputArgs build() {
            $.connectionInfo = Objects.requireNonNull($.connectionInfo, "expected parameter 'connectionInfo' to be non-null");
            $.selectedDatabases = Objects.requireNonNull($.selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
            return $;
        }
    }

}
