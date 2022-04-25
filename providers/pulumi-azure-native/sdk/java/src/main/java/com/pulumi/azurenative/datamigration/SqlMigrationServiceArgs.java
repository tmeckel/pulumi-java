// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlMigrationServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlMigrationServiceArgs Empty = new SqlMigrationServiceArgs();

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the SQL Migration Service.
     * 
     */
    @Import(name="sqlMigrationServiceName")
    private @Nullable Output<String> sqlMigrationServiceName;

    /**
     * @return Name of the SQL Migration Service.
     * 
     */
    public Optional<Output<String>> sqlMigrationServiceName() {
        return Optional.ofNullable(this.sqlMigrationServiceName);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SqlMigrationServiceArgs() {}

    private SqlMigrationServiceArgs(SqlMigrationServiceArgs $) {
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.sqlMigrationServiceName = $.sqlMigrationServiceName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlMigrationServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlMigrationServiceArgs $;

        public Builder() {
            $ = new SqlMigrationServiceArgs();
        }

        public Builder(SqlMigrationServiceArgs defaults) {
            $ = new SqlMigrationServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sqlMigrationServiceName Name of the SQL Migration Service.
         * 
         * @return builder
         * 
         */
        public Builder sqlMigrationServiceName(@Nullable Output<String> sqlMigrationServiceName) {
            $.sqlMigrationServiceName = sqlMigrationServiceName;
            return this;
        }

        /**
         * @param sqlMigrationServiceName Name of the SQL Migration Service.
         * 
         * @return builder
         * 
         */
        public Builder sqlMigrationServiceName(String sqlMigrationServiceName) {
            return sqlMigrationServiceName(Output.of(sqlMigrationServiceName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SqlMigrationServiceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
