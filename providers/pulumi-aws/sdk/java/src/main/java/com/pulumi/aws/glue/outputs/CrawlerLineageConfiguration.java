// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CrawlerLineageConfiguration {
    /**
     * @return Specifies whether data lineage is enabled for the crawler. Valid values are: `ENABLE` and `DISABLE`. Default value is `Disable`.
     * 
     */
    private final @Nullable String crawlerLineageSettings;

    @CustomType.Constructor
    private CrawlerLineageConfiguration(@CustomType.Parameter("crawlerLineageSettings") @Nullable String crawlerLineageSettings) {
        this.crawlerLineageSettings = crawlerLineageSettings;
    }

    /**
     * @return Specifies whether data lineage is enabled for the crawler. Valid values are: `ENABLE` and `DISABLE`. Default value is `Disable`.
     * 
     */
    public Optional<String> crawlerLineageSettings() {
        return Optional.ofNullable(this.crawlerLineageSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrawlerLineageConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String crawlerLineageSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(CrawlerLineageConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crawlerLineageSettings = defaults.crawlerLineageSettings;
        }

        public Builder crawlerLineageSettings(@Nullable String crawlerLineageSettings) {
            this.crawlerLineageSettings = crawlerLineageSettings;
            return this;
        }        public CrawlerLineageConfiguration build() {
            return new CrawlerLineageConfiguration(crawlerLineageSettings);
        }
    }
}
