// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FeatureGroupDataCatalogConfig {
    private final String catalog;
    private final String database;
    private final String tableName;

    @OutputCustomType.Constructor
    private FeatureGroupDataCatalogConfig(
        @OutputCustomType.Parameter("catalog") String catalog,
        @OutputCustomType.Parameter("database") String database,
        @OutputCustomType.Parameter("tableName") String tableName) {
        this.catalog = catalog;
        this.database = database;
        this.tableName = tableName;
    }

    public String getCatalog() {
        return this.catalog;
    }
    public String getDatabase() {
        return this.database;
    }
    public String getTableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupDataCatalogConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalog;
        private String database;
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupDataCatalogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalog = defaults.catalog;
    	      this.database = defaults.database;
    	      this.tableName = defaults.tableName;
        }

        public Builder catalog(String catalog) {
            this.catalog = Objects.requireNonNull(catalog);
            return this;
        }

        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public FeatureGroupDataCatalogConfig build() {
            return new FeatureGroupDataCatalogConfig(catalog, database, tableName);
        }
    }
}
