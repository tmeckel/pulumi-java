// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * <p>Amazon Elasticsearch Service parameters.</p>
 * 
 */
public final class DataSourceAmazonElasticsearchParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceAmazonElasticsearchParametersArgs Empty = new DataSourceAmazonElasticsearchParametersArgs();

    /**
     * <p>The Amazon Elasticsearch Service domain.</p>
     * 
     */
    @InputImport(name="domain", required=true)
      private final Input<String> domain;

    public Input<String> getDomain() {
        return this.domain;
    }

    public DataSourceAmazonElasticsearchParametersArgs(Input<String> domain) {
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
    }

    private DataSourceAmazonElasticsearchParametersArgs() {
        this.domain = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceAmazonElasticsearchParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> domain;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceAmazonElasticsearchParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
        }

        public Builder domain(Input<String> domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder domain(String domain) {
            this.domain = Input.of(Objects.requireNonNull(domain));
            return this;
        }
        public DataSourceAmazonElasticsearchParametersArgs build() {
            return new DataSourceAmazonElasticsearchParametersArgs(domain);
        }
    }
}
