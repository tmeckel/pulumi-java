// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceSalesforceChatterFeedConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.DataSourceSalesforceKnowledgeArticleConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.DataSourceSalesforceStandardObjectAttachmentConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.DataSourceSalesforceStandardObjectConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceSalesforceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceSalesforceConfigurationArgs Empty = new DataSourceSalesforceConfigurationArgs();

    @InputImport(name="chatterFeedConfiguration")
      private final @Nullable Input<DataSourceSalesforceChatterFeedConfigurationArgs> chatterFeedConfiguration;

    public Input<DataSourceSalesforceChatterFeedConfigurationArgs> getChatterFeedConfiguration() {
        return this.chatterFeedConfiguration == null ? Input.empty() : this.chatterFeedConfiguration;
    }

    @InputImport(name="crawlAttachments")
      private final @Nullable Input<Boolean> crawlAttachments;

    public Input<Boolean> getCrawlAttachments() {
        return this.crawlAttachments == null ? Input.empty() : this.crawlAttachments;
    }

    @InputImport(name="excludeAttachmentFilePatterns")
      private final @Nullable Input<List<String>> excludeAttachmentFilePatterns;

    public Input<List<String>> getExcludeAttachmentFilePatterns() {
        return this.excludeAttachmentFilePatterns == null ? Input.empty() : this.excludeAttachmentFilePatterns;
    }

    @InputImport(name="includeAttachmentFilePatterns")
      private final @Nullable Input<List<String>> includeAttachmentFilePatterns;

    public Input<List<String>> getIncludeAttachmentFilePatterns() {
        return this.includeAttachmentFilePatterns == null ? Input.empty() : this.includeAttachmentFilePatterns;
    }

    @InputImport(name="knowledgeArticleConfiguration")
      private final @Nullable Input<DataSourceSalesforceKnowledgeArticleConfigurationArgs> knowledgeArticleConfiguration;

    public Input<DataSourceSalesforceKnowledgeArticleConfigurationArgs> getKnowledgeArticleConfiguration() {
        return this.knowledgeArticleConfiguration == null ? Input.empty() : this.knowledgeArticleConfiguration;
    }

    @InputImport(name="secretArn", required=true)
      private final Input<String> secretArn;

    public Input<String> getSecretArn() {
        return this.secretArn;
    }

    @InputImport(name="serverUrl", required=true)
      private final Input<String> serverUrl;

    public Input<String> getServerUrl() {
        return this.serverUrl;
    }

    @InputImport(name="standardObjectAttachmentConfiguration")
      private final @Nullable Input<DataSourceSalesforceStandardObjectAttachmentConfigurationArgs> standardObjectAttachmentConfiguration;

    public Input<DataSourceSalesforceStandardObjectAttachmentConfigurationArgs> getStandardObjectAttachmentConfiguration() {
        return this.standardObjectAttachmentConfiguration == null ? Input.empty() : this.standardObjectAttachmentConfiguration;
    }

    @InputImport(name="standardObjectConfigurations")
      private final @Nullable Input<List<DataSourceSalesforceStandardObjectConfigurationArgs>> standardObjectConfigurations;

    public Input<List<DataSourceSalesforceStandardObjectConfigurationArgs>> getStandardObjectConfigurations() {
        return this.standardObjectConfigurations == null ? Input.empty() : this.standardObjectConfigurations;
    }

    public DataSourceSalesforceConfigurationArgs(
        @Nullable Input<DataSourceSalesforceChatterFeedConfigurationArgs> chatterFeedConfiguration,
        @Nullable Input<Boolean> crawlAttachments,
        @Nullable Input<List<String>> excludeAttachmentFilePatterns,
        @Nullable Input<List<String>> includeAttachmentFilePatterns,
        @Nullable Input<DataSourceSalesforceKnowledgeArticleConfigurationArgs> knowledgeArticleConfiguration,
        Input<String> secretArn,
        Input<String> serverUrl,
        @Nullable Input<DataSourceSalesforceStandardObjectAttachmentConfigurationArgs> standardObjectAttachmentConfiguration,
        @Nullable Input<List<DataSourceSalesforceStandardObjectConfigurationArgs>> standardObjectConfigurations) {
        this.chatterFeedConfiguration = chatterFeedConfiguration;
        this.crawlAttachments = crawlAttachments;
        this.excludeAttachmentFilePatterns = excludeAttachmentFilePatterns;
        this.includeAttachmentFilePatterns = includeAttachmentFilePatterns;
        this.knowledgeArticleConfiguration = knowledgeArticleConfiguration;
        this.secretArn = Objects.requireNonNull(secretArn, "expected parameter 'secretArn' to be non-null");
        this.serverUrl = Objects.requireNonNull(serverUrl, "expected parameter 'serverUrl' to be non-null");
        this.standardObjectAttachmentConfiguration = standardObjectAttachmentConfiguration;
        this.standardObjectConfigurations = standardObjectConfigurations;
    }

    private DataSourceSalesforceConfigurationArgs() {
        this.chatterFeedConfiguration = Input.empty();
        this.crawlAttachments = Input.empty();
        this.excludeAttachmentFilePatterns = Input.empty();
        this.includeAttachmentFilePatterns = Input.empty();
        this.knowledgeArticleConfiguration = Input.empty();
        this.secretArn = Input.empty();
        this.serverUrl = Input.empty();
        this.standardObjectAttachmentConfiguration = Input.empty();
        this.standardObjectConfigurations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSalesforceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DataSourceSalesforceChatterFeedConfigurationArgs> chatterFeedConfiguration;
        private @Nullable Input<Boolean> crawlAttachments;
        private @Nullable Input<List<String>> excludeAttachmentFilePatterns;
        private @Nullable Input<List<String>> includeAttachmentFilePatterns;
        private @Nullable Input<DataSourceSalesforceKnowledgeArticleConfigurationArgs> knowledgeArticleConfiguration;
        private Input<String> secretArn;
        private Input<String> serverUrl;
        private @Nullable Input<DataSourceSalesforceStandardObjectAttachmentConfigurationArgs> standardObjectAttachmentConfiguration;
        private @Nullable Input<List<DataSourceSalesforceStandardObjectConfigurationArgs>> standardObjectConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSalesforceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chatterFeedConfiguration = defaults.chatterFeedConfiguration;
    	      this.crawlAttachments = defaults.crawlAttachments;
    	      this.excludeAttachmentFilePatterns = defaults.excludeAttachmentFilePatterns;
    	      this.includeAttachmentFilePatterns = defaults.includeAttachmentFilePatterns;
    	      this.knowledgeArticleConfiguration = defaults.knowledgeArticleConfiguration;
    	      this.secretArn = defaults.secretArn;
    	      this.serverUrl = defaults.serverUrl;
    	      this.standardObjectAttachmentConfiguration = defaults.standardObjectAttachmentConfiguration;
    	      this.standardObjectConfigurations = defaults.standardObjectConfigurations;
        }

        public Builder chatterFeedConfiguration(@Nullable Input<DataSourceSalesforceChatterFeedConfigurationArgs> chatterFeedConfiguration) {
            this.chatterFeedConfiguration = chatterFeedConfiguration;
            return this;
        }

        public Builder chatterFeedConfiguration(@Nullable DataSourceSalesforceChatterFeedConfigurationArgs chatterFeedConfiguration) {
            this.chatterFeedConfiguration = Input.ofNullable(chatterFeedConfiguration);
            return this;
        }

        public Builder crawlAttachments(@Nullable Input<Boolean> crawlAttachments) {
            this.crawlAttachments = crawlAttachments;
            return this;
        }

        public Builder crawlAttachments(@Nullable Boolean crawlAttachments) {
            this.crawlAttachments = Input.ofNullable(crawlAttachments);
            return this;
        }

        public Builder excludeAttachmentFilePatterns(@Nullable Input<List<String>> excludeAttachmentFilePatterns) {
            this.excludeAttachmentFilePatterns = excludeAttachmentFilePatterns;
            return this;
        }

        public Builder excludeAttachmentFilePatterns(@Nullable List<String> excludeAttachmentFilePatterns) {
            this.excludeAttachmentFilePatterns = Input.ofNullable(excludeAttachmentFilePatterns);
            return this;
        }

        public Builder includeAttachmentFilePatterns(@Nullable Input<List<String>> includeAttachmentFilePatterns) {
            this.includeAttachmentFilePatterns = includeAttachmentFilePatterns;
            return this;
        }

        public Builder includeAttachmentFilePatterns(@Nullable List<String> includeAttachmentFilePatterns) {
            this.includeAttachmentFilePatterns = Input.ofNullable(includeAttachmentFilePatterns);
            return this;
        }

        public Builder knowledgeArticleConfiguration(@Nullable Input<DataSourceSalesforceKnowledgeArticleConfigurationArgs> knowledgeArticleConfiguration) {
            this.knowledgeArticleConfiguration = knowledgeArticleConfiguration;
            return this;
        }

        public Builder knowledgeArticleConfiguration(@Nullable DataSourceSalesforceKnowledgeArticleConfigurationArgs knowledgeArticleConfiguration) {
            this.knowledgeArticleConfiguration = Input.ofNullable(knowledgeArticleConfiguration);
            return this;
        }

        public Builder secretArn(Input<String> secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }

        public Builder secretArn(String secretArn) {
            this.secretArn = Input.of(Objects.requireNonNull(secretArn));
            return this;
        }

        public Builder serverUrl(Input<String> serverUrl) {
            this.serverUrl = Objects.requireNonNull(serverUrl);
            return this;
        }

        public Builder serverUrl(String serverUrl) {
            this.serverUrl = Input.of(Objects.requireNonNull(serverUrl));
            return this;
        }

        public Builder standardObjectAttachmentConfiguration(@Nullable Input<DataSourceSalesforceStandardObjectAttachmentConfigurationArgs> standardObjectAttachmentConfiguration) {
            this.standardObjectAttachmentConfiguration = standardObjectAttachmentConfiguration;
            return this;
        }

        public Builder standardObjectAttachmentConfiguration(@Nullable DataSourceSalesforceStandardObjectAttachmentConfigurationArgs standardObjectAttachmentConfiguration) {
            this.standardObjectAttachmentConfiguration = Input.ofNullable(standardObjectAttachmentConfiguration);
            return this;
        }

        public Builder standardObjectConfigurations(@Nullable Input<List<DataSourceSalesforceStandardObjectConfigurationArgs>> standardObjectConfigurations) {
            this.standardObjectConfigurations = standardObjectConfigurations;
            return this;
        }

        public Builder standardObjectConfigurations(@Nullable List<DataSourceSalesforceStandardObjectConfigurationArgs> standardObjectConfigurations) {
            this.standardObjectConfigurations = Input.ofNullable(standardObjectConfigurations);
            return this;
        }
        public DataSourceSalesforceConfigurationArgs build() {
            return new DataSourceSalesforceConfigurationArgs(chatterFeedConfiguration, crawlAttachments, excludeAttachmentFilePatterns, includeAttachmentFilePatterns, knowledgeArticleConfiguration, secretArn, serverUrl, standardObjectAttachmentConfiguration, standardObjectConfigurations);
        }
    }
}
