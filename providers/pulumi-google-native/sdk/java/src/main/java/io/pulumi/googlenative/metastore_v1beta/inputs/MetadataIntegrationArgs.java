// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.metastore_v1beta.inputs.DataCatalogConfigArgs;
import io.pulumi.googlenative.metastore_v1beta.inputs.DataplexConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies how metastore metadata should be integrated with external services.
 * 
 */
public final class MetadataIntegrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetadataIntegrationArgs Empty = new MetadataIntegrationArgs();

    /**
     * The integration config for the Data Catalog service.
     * 
     */
    @InputImport(name="dataCatalogConfig")
      private final @Nullable Input<DataCatalogConfigArgs> dataCatalogConfig;

    public Input<DataCatalogConfigArgs> getDataCatalogConfig() {
        return this.dataCatalogConfig == null ? Input.empty() : this.dataCatalogConfig;
    }

    /**
     * The integration config for the Dataplex service.
     * 
     */
    @InputImport(name="dataplexConfig")
      private final @Nullable Input<DataplexConfigArgs> dataplexConfig;

    public Input<DataplexConfigArgs> getDataplexConfig() {
        return this.dataplexConfig == null ? Input.empty() : this.dataplexConfig;
    }

    public MetadataIntegrationArgs(
        @Nullable Input<DataCatalogConfigArgs> dataCatalogConfig,
        @Nullable Input<DataplexConfigArgs> dataplexConfig) {
        this.dataCatalogConfig = dataCatalogConfig;
        this.dataplexConfig = dataplexConfig;
    }

    private MetadataIntegrationArgs() {
        this.dataCatalogConfig = Input.empty();
        this.dataplexConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DataCatalogConfigArgs> dataCatalogConfig;
        private @Nullable Input<DataplexConfigArgs> dataplexConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataIntegrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCatalogConfig = defaults.dataCatalogConfig;
    	      this.dataplexConfig = defaults.dataplexConfig;
        }

        public Builder dataCatalogConfig(@Nullable Input<DataCatalogConfigArgs> dataCatalogConfig) {
            this.dataCatalogConfig = dataCatalogConfig;
            return this;
        }

        public Builder dataCatalogConfig(@Nullable DataCatalogConfigArgs dataCatalogConfig) {
            this.dataCatalogConfig = Input.ofNullable(dataCatalogConfig);
            return this;
        }

        public Builder dataplexConfig(@Nullable Input<DataplexConfigArgs> dataplexConfig) {
            this.dataplexConfig = dataplexConfig;
            return this;
        }

        public Builder dataplexConfig(@Nullable DataplexConfigArgs dataplexConfig) {
            this.dataplexConfig = Input.ofNullable(dataplexConfig);
            return this;
        }
        public MetadataIntegrationArgs build() {
            return new MetadataIntegrationArgs(dataCatalogConfig, dataplexConfig);
        }
    }
}
