// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.metastore_v1alpha.inputs.DataCatalogConfigResponse;
import io.pulumi.googlenative.metastore_v1alpha.inputs.DataplexConfigResponse;
import java.util.Objects;


/**
 * Specifies how metastore metadata should be integrated with external services.
 * 
 */
public final class MetadataIntegrationResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetadataIntegrationResponse Empty = new MetadataIntegrationResponse();

    /**
     * The integration config for the Data Catalog service.
     * 
     */
    @InputImport(name="dataCatalogConfig", required=true)
    private final DataCatalogConfigResponse dataCatalogConfig;

    public DataCatalogConfigResponse getDataCatalogConfig() {
        return this.dataCatalogConfig;
    }

    /**
     * The integration config for the Dataplex service.
     * 
     */
    @InputImport(name="dataplexConfig", required=true)
    private final DataplexConfigResponse dataplexConfig;

    public DataplexConfigResponse getDataplexConfig() {
        return this.dataplexConfig;
    }

    public MetadataIntegrationResponse(
        DataCatalogConfigResponse dataCatalogConfig,
        DataplexConfigResponse dataplexConfig) {
        this.dataCatalogConfig = Objects.requireNonNull(dataCatalogConfig, "expected parameter 'dataCatalogConfig' to be non-null");
        this.dataplexConfig = Objects.requireNonNull(dataplexConfig, "expected parameter 'dataplexConfig' to be non-null");
    }

    private MetadataIntegrationResponse() {
        this.dataCatalogConfig = null;
        this.dataplexConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataIntegrationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCatalogConfigResponse dataCatalogConfig;
        private DataplexConfigResponse dataplexConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataIntegrationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCatalogConfig = defaults.dataCatalogConfig;
    	      this.dataplexConfig = defaults.dataplexConfig;
        }

        public Builder setDataCatalogConfig(DataCatalogConfigResponse dataCatalogConfig) {
            this.dataCatalogConfig = Objects.requireNonNull(dataCatalogConfig);
            return this;
        }

        public Builder setDataplexConfig(DataplexConfigResponse dataplexConfig) {
            this.dataplexConfig = Objects.requireNonNull(dataplexConfig);
            return this;
        }

        public MetadataIntegrationResponse build() {
            return new MetadataIntegrationResponse(dataCatalogConfig, dataplexConfig);
        }
    }
}
