// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto;

import com.pulumi.azurenative.kusto.enums.DataConnectionKind;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataConnectionArgs Empty = new DataConnectionArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the Kusto cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the data connection.
     * 
     */
    @Import(name="dataConnectionName")
    private @Nullable Output<String> dataConnectionName;

    /**
     * @return The name of the data connection.
     * 
     */
    public Optional<Output<String>> dataConnectionName() {
        return Optional.ofNullable(this.dataConnectionName);
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The name of the database in the Kusto cluster.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * Kind of the endpoint for the data connection
     * 
     */
    @Import(name="kind", required=true)
    private Output<Either<String,DataConnectionKind>> kind;

    /**
     * @return Kind of the endpoint for the data connection
     * 
     */
    public Output<Either<String,DataConnectionKind>> kind() {
        return this.kind;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group containing the Kusto cluster.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private DataConnectionArgs() {}

    private DataConnectionArgs(DataConnectionArgs $) {
        this.clusterName = $.clusterName;
        this.dataConnectionName = $.dataConnectionName;
        this.databaseName = $.databaseName;
        this.kind = $.kind;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataConnectionArgs $;

        public Builder() {
            $ = new DataConnectionArgs();
        }

        public Builder(DataConnectionArgs defaults) {
            $ = new DataConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param dataConnectionName The name of the data connection.
         * 
         * @return builder
         * 
         */
        public Builder dataConnectionName(@Nullable Output<String> dataConnectionName) {
            $.dataConnectionName = dataConnectionName;
            return this;
        }

        /**
         * @param dataConnectionName The name of the data connection.
         * 
         * @return builder
         * 
         */
        public Builder dataConnectionName(String dataConnectionName) {
            return dataConnectionName(Output.of(dataConnectionName));
        }

        /**
         * @param databaseName The name of the database in the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database in the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param kind Kind of the endpoint for the data connection
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<Either<String,DataConnectionKind>> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of the endpoint for the data connection
         * 
         * @return builder
         * 
         */
        public Builder kind(Either<String,DataConnectionKind> kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param kind Kind of the endpoint for the data connection
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Either.ofLeft(kind));
        }

        /**
         * @param kind Kind of the endpoint for the data connection
         * 
         * @return builder
         * 
         */
        public Builder kind(DataConnectionKind kind) {
            return kind(Either.ofRight(kind));
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group containing the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group containing the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public DataConnectionArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
