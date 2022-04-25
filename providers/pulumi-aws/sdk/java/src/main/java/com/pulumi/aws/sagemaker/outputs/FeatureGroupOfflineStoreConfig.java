// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.aws.sagemaker.outputs.FeatureGroupOfflineStoreConfigDataCatalogConfig;
import com.pulumi.aws.sagemaker.outputs.FeatureGroupOfflineStoreConfigS3StorageConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureGroupOfflineStoreConfig {
    /**
     * @return The meta data of the Glue table that is autogenerated when an OfflineStore is created. See Data Catalog Config Below.
     * 
     */
    private final @Nullable FeatureGroupOfflineStoreConfigDataCatalogConfig dataCatalogConfig;
    /**
     * @return Set to `true` to turn Online Store On.
     * 
     */
    private final @Nullable Boolean disableGlueTableCreation;
    /**
     * @return The Amazon Simple Storage (Amazon S3) location of OfflineStore. See S3 Storage Config Below.
     * 
     */
    private final FeatureGroupOfflineStoreConfigS3StorageConfig s3StorageConfig;

    @CustomType.Constructor
    private FeatureGroupOfflineStoreConfig(
        @CustomType.Parameter("dataCatalogConfig") @Nullable FeatureGroupOfflineStoreConfigDataCatalogConfig dataCatalogConfig,
        @CustomType.Parameter("disableGlueTableCreation") @Nullable Boolean disableGlueTableCreation,
        @CustomType.Parameter("s3StorageConfig") FeatureGroupOfflineStoreConfigS3StorageConfig s3StorageConfig) {
        this.dataCatalogConfig = dataCatalogConfig;
        this.disableGlueTableCreation = disableGlueTableCreation;
        this.s3StorageConfig = s3StorageConfig;
    }

    /**
     * @return The meta data of the Glue table that is autogenerated when an OfflineStore is created. See Data Catalog Config Below.
     * 
     */
    public Optional<FeatureGroupOfflineStoreConfigDataCatalogConfig> dataCatalogConfig() {
        return Optional.ofNullable(this.dataCatalogConfig);
    }
    /**
     * @return Set to `true` to turn Online Store On.
     * 
     */
    public Optional<Boolean> disableGlueTableCreation() {
        return Optional.ofNullable(this.disableGlueTableCreation);
    }
    /**
     * @return The Amazon Simple Storage (Amazon S3) location of OfflineStore. See S3 Storage Config Below.
     * 
     */
    public FeatureGroupOfflineStoreConfigS3StorageConfig s3StorageConfig() {
        return this.s3StorageConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupOfflineStoreConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FeatureGroupOfflineStoreConfigDataCatalogConfig dataCatalogConfig;
        private @Nullable Boolean disableGlueTableCreation;
        private FeatureGroupOfflineStoreConfigS3StorageConfig s3StorageConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupOfflineStoreConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCatalogConfig = defaults.dataCatalogConfig;
    	      this.disableGlueTableCreation = defaults.disableGlueTableCreation;
    	      this.s3StorageConfig = defaults.s3StorageConfig;
        }

        public Builder dataCatalogConfig(@Nullable FeatureGroupOfflineStoreConfigDataCatalogConfig dataCatalogConfig) {
            this.dataCatalogConfig = dataCatalogConfig;
            return this;
        }
        public Builder disableGlueTableCreation(@Nullable Boolean disableGlueTableCreation) {
            this.disableGlueTableCreation = disableGlueTableCreation;
            return this;
        }
        public Builder s3StorageConfig(FeatureGroupOfflineStoreConfigS3StorageConfig s3StorageConfig) {
            this.s3StorageConfig = Objects.requireNonNull(s3StorageConfig);
            return this;
        }        public FeatureGroupOfflineStoreConfig build() {
            return new FeatureGroupOfflineStoreConfig(dataCatalogConfig, disableGlueTableCreation, s3StorageConfig);
        }
    }
}
