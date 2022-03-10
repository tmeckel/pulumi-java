// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.enums.DataSourceDatabaseEngineType;
import io.pulumi.awsnative.kendra.outputs.DataSourceAclConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceColumnConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceConnectionConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceSqlConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceVpcConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceDatabaseConfiguration {
    private final @Nullable DataSourceAclConfiguration aclConfiguration;
    private final DataSourceColumnConfiguration columnConfiguration;
    private final DataSourceConnectionConfiguration connectionConfiguration;
    private final DataSourceDatabaseEngineType databaseEngineType;
    private final @Nullable DataSourceSqlConfiguration sqlConfiguration;
    private final @Nullable DataSourceVpcConfiguration vpcConfiguration;

    @OutputCustomType.Constructor
    private DataSourceDatabaseConfiguration(
        @OutputCustomType.Parameter("aclConfiguration") @Nullable DataSourceAclConfiguration aclConfiguration,
        @OutputCustomType.Parameter("columnConfiguration") DataSourceColumnConfiguration columnConfiguration,
        @OutputCustomType.Parameter("connectionConfiguration") DataSourceConnectionConfiguration connectionConfiguration,
        @OutputCustomType.Parameter("databaseEngineType") DataSourceDatabaseEngineType databaseEngineType,
        @OutputCustomType.Parameter("sqlConfiguration") @Nullable DataSourceSqlConfiguration sqlConfiguration,
        @OutputCustomType.Parameter("vpcConfiguration") @Nullable DataSourceVpcConfiguration vpcConfiguration) {
        this.aclConfiguration = aclConfiguration;
        this.columnConfiguration = columnConfiguration;
        this.connectionConfiguration = connectionConfiguration;
        this.databaseEngineType = databaseEngineType;
        this.sqlConfiguration = sqlConfiguration;
        this.vpcConfiguration = vpcConfiguration;
    }

    public Optional<DataSourceAclConfiguration> getAclConfiguration() {
        return Optional.ofNullable(this.aclConfiguration);
    }
    public DataSourceColumnConfiguration getColumnConfiguration() {
        return this.columnConfiguration;
    }
    public DataSourceConnectionConfiguration getConnectionConfiguration() {
        return this.connectionConfiguration;
    }
    public DataSourceDatabaseEngineType getDatabaseEngineType() {
        return this.databaseEngineType;
    }
    public Optional<DataSourceSqlConfiguration> getSqlConfiguration() {
        return Optional.ofNullable(this.sqlConfiguration);
    }
    public Optional<DataSourceVpcConfiguration> getVpcConfiguration() {
        return Optional.ofNullable(this.vpcConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceDatabaseConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceAclConfiguration aclConfiguration;
        private DataSourceColumnConfiguration columnConfiguration;
        private DataSourceConnectionConfiguration connectionConfiguration;
        private DataSourceDatabaseEngineType databaseEngineType;
        private @Nullable DataSourceSqlConfiguration sqlConfiguration;
        private @Nullable DataSourceVpcConfiguration vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceDatabaseConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclConfiguration = defaults.aclConfiguration;
    	      this.columnConfiguration = defaults.columnConfiguration;
    	      this.connectionConfiguration = defaults.connectionConfiguration;
    	      this.databaseEngineType = defaults.databaseEngineType;
    	      this.sqlConfiguration = defaults.sqlConfiguration;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder aclConfiguration(@Nullable DataSourceAclConfiguration aclConfiguration) {
            this.aclConfiguration = aclConfiguration;
            return this;
        }

        public Builder columnConfiguration(DataSourceColumnConfiguration columnConfiguration) {
            this.columnConfiguration = Objects.requireNonNull(columnConfiguration);
            return this;
        }

        public Builder connectionConfiguration(DataSourceConnectionConfiguration connectionConfiguration) {
            this.connectionConfiguration = Objects.requireNonNull(connectionConfiguration);
            return this;
        }

        public Builder databaseEngineType(DataSourceDatabaseEngineType databaseEngineType) {
            this.databaseEngineType = Objects.requireNonNull(databaseEngineType);
            return this;
        }

        public Builder sqlConfiguration(@Nullable DataSourceSqlConfiguration sqlConfiguration) {
            this.sqlConfiguration = sqlConfiguration;
            return this;
        }

        public Builder vpcConfiguration(@Nullable DataSourceVpcConfiguration vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }
        public DataSourceDatabaseConfiguration build() {
            return new DataSourceDatabaseConfiguration(aclConfiguration, columnConfiguration, connectionConfiguration, databaseEngineType, sqlConfiguration, vpcConfiguration);
        }
    }
}
