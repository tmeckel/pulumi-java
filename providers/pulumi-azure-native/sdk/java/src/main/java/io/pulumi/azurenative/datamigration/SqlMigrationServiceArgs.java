// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlMigrationServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlMigrationServiceArgs Empty = new SqlMigrationServiceArgs();

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the SQL Migration Service.
     * 
     */
    @InputImport(name="sqlMigrationServiceName")
      private final @Nullable Input<String> sqlMigrationServiceName;

    public Input<String> getSqlMigrationServiceName() {
        return this.sqlMigrationServiceName == null ? Input.empty() : this.sqlMigrationServiceName;
    }

    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public SqlMigrationServiceArgs(
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<String> sqlMigrationServiceName,
        @Nullable Input<Map<String,String>> tags) {
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sqlMigrationServiceName = sqlMigrationServiceName;
        this.tags = tags;
    }

    private SqlMigrationServiceArgs() {
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sqlMigrationServiceName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlMigrationServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> sqlMigrationServiceName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlMigrationServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sqlMigrationServiceName = defaults.sqlMigrationServiceName;
    	      this.tags = defaults.tags;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder sqlMigrationServiceName(@Nullable Input<String> sqlMigrationServiceName) {
            this.sqlMigrationServiceName = sqlMigrationServiceName;
            return this;
        }

        public Builder sqlMigrationServiceName(@Nullable String sqlMigrationServiceName) {
            this.sqlMigrationServiceName = Input.ofNullable(sqlMigrationServiceName);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public SqlMigrationServiceArgs build() {
            return new SqlMigrationServiceArgs(location, resourceGroupName, sqlMigrationServiceName, tags);
        }
    }
}
