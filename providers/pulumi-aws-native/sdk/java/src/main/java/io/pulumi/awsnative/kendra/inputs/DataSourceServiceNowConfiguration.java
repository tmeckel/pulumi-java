// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.enums.DataSourceServiceNowAuthenticationType;
import io.pulumi.awsnative.kendra.enums.DataSourceServiceNowBuildVersionType;
import io.pulumi.awsnative.kendra.inputs.DataSourceServiceNowKnowledgeArticleConfiguration;
import io.pulumi.awsnative.kendra.inputs.DataSourceServiceNowServiceCatalogConfiguration;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceServiceNowConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceServiceNowConfiguration Empty = new DataSourceServiceNowConfiguration();

    @InputImport(name="authenticationType")
      private final @Nullable DataSourceServiceNowAuthenticationType authenticationType;

    public Optional<DataSourceServiceNowAuthenticationType> getAuthenticationType() {
        return this.authenticationType == null ? Optional.empty() : Optional.ofNullable(this.authenticationType);
    }

    @InputImport(name="hostUrl", required=true)
      private final String hostUrl;

    public String getHostUrl() {
        return this.hostUrl;
    }

    @InputImport(name="knowledgeArticleConfiguration")
      private final @Nullable DataSourceServiceNowKnowledgeArticleConfiguration knowledgeArticleConfiguration;

    public Optional<DataSourceServiceNowKnowledgeArticleConfiguration> getKnowledgeArticleConfiguration() {
        return this.knowledgeArticleConfiguration == null ? Optional.empty() : Optional.ofNullable(this.knowledgeArticleConfiguration);
    }

    @InputImport(name="secretArn", required=true)
      private final String secretArn;

    public String getSecretArn() {
        return this.secretArn;
    }

    @InputImport(name="serviceCatalogConfiguration")
      private final @Nullable DataSourceServiceNowServiceCatalogConfiguration serviceCatalogConfiguration;

    public Optional<DataSourceServiceNowServiceCatalogConfiguration> getServiceCatalogConfiguration() {
        return this.serviceCatalogConfiguration == null ? Optional.empty() : Optional.ofNullable(this.serviceCatalogConfiguration);
    }

    @InputImport(name="serviceNowBuildVersion", required=true)
      private final DataSourceServiceNowBuildVersionType serviceNowBuildVersion;

    public DataSourceServiceNowBuildVersionType getServiceNowBuildVersion() {
        return this.serviceNowBuildVersion;
    }

    public DataSourceServiceNowConfiguration(
        @Nullable DataSourceServiceNowAuthenticationType authenticationType,
        String hostUrl,
        @Nullable DataSourceServiceNowKnowledgeArticleConfiguration knowledgeArticleConfiguration,
        String secretArn,
        @Nullable DataSourceServiceNowServiceCatalogConfiguration serviceCatalogConfiguration,
        DataSourceServiceNowBuildVersionType serviceNowBuildVersion) {
        this.authenticationType = authenticationType;
        this.hostUrl = Objects.requireNonNull(hostUrl, "expected parameter 'hostUrl' to be non-null");
        this.knowledgeArticleConfiguration = knowledgeArticleConfiguration;
        this.secretArn = Objects.requireNonNull(secretArn, "expected parameter 'secretArn' to be non-null");
        this.serviceCatalogConfiguration = serviceCatalogConfiguration;
        this.serviceNowBuildVersion = Objects.requireNonNull(serviceNowBuildVersion, "expected parameter 'serviceNowBuildVersion' to be non-null");
    }

    private DataSourceServiceNowConfiguration() {
        this.authenticationType = null;
        this.hostUrl = null;
        this.knowledgeArticleConfiguration = null;
        this.secretArn = null;
        this.serviceCatalogConfiguration = null;
        this.serviceNowBuildVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceServiceNowConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceServiceNowAuthenticationType authenticationType;
        private String hostUrl;
        private @Nullable DataSourceServiceNowKnowledgeArticleConfiguration knowledgeArticleConfiguration;
        private String secretArn;
        private @Nullable DataSourceServiceNowServiceCatalogConfiguration serviceCatalogConfiguration;
        private DataSourceServiceNowBuildVersionType serviceNowBuildVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceServiceNowConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.hostUrl = defaults.hostUrl;
    	      this.knowledgeArticleConfiguration = defaults.knowledgeArticleConfiguration;
    	      this.secretArn = defaults.secretArn;
    	      this.serviceCatalogConfiguration = defaults.serviceCatalogConfiguration;
    	      this.serviceNowBuildVersion = defaults.serviceNowBuildVersion;
        }

        public Builder authenticationType(@Nullable DataSourceServiceNowAuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder hostUrl(String hostUrl) {
            this.hostUrl = Objects.requireNonNull(hostUrl);
            return this;
        }

        public Builder knowledgeArticleConfiguration(@Nullable DataSourceServiceNowKnowledgeArticleConfiguration knowledgeArticleConfiguration) {
            this.knowledgeArticleConfiguration = knowledgeArticleConfiguration;
            return this;
        }

        public Builder secretArn(String secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }

        public Builder serviceCatalogConfiguration(@Nullable DataSourceServiceNowServiceCatalogConfiguration serviceCatalogConfiguration) {
            this.serviceCatalogConfiguration = serviceCatalogConfiguration;
            return this;
        }

        public Builder serviceNowBuildVersion(DataSourceServiceNowBuildVersionType serviceNowBuildVersion) {
            this.serviceNowBuildVersion = Objects.requireNonNull(serviceNowBuildVersion);
            return this;
        }
        public DataSourceServiceNowConfiguration build() {
            return new DataSourceServiceNowConfiguration(authenticationType, hostUrl, knowledgeArticleConfiguration, secretArn, serviceCatalogConfiguration, serviceNowBuildVersion);
        }
    }
}
