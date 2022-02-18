// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse {
    /**
     * Will be [deprecated = true] post migration;
     * 
     */
    private final List<String> onewayTerms;
    /**
     * Terms from the search query. Will treat synonyms as their synonyms. Not themselves synonyms of the synonyms. Can specify up to 100 terms.
     * 
     */
    private final List<String> queryTerms;
    /**
     * Defines a set of synonyms. Cannot contain duplicates. Can specify up to 100 synonyms.
     * 
     */
    private final List<String> synonyms;

    @OutputCustomType.Constructor({"onewayTerms","queryTerms","synonyms"})
    private GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse(
        List<String> onewayTerms,
        List<String> queryTerms,
        List<String> synonyms) {
        this.onewayTerms = Objects.requireNonNull(onewayTerms);
        this.queryTerms = Objects.requireNonNull(queryTerms);
        this.synonyms = Objects.requireNonNull(synonyms);
    }

    /**
     * Will be [deprecated = true] post migration;
     * 
     */
    public List<String> getOnewayTerms() {
        return this.onewayTerms;
    }
    /**
     * Terms from the search query. Will treat synonyms as their synonyms. Not themselves synonyms of the synonyms. Can specify up to 100 terms.
     * 
     */
    public List<String> getQueryTerms() {
        return this.queryTerms;
    }
    /**
     * Defines a set of synonyms. Cannot contain duplicates. Can specify up to 100 synonyms.
     * 
     */
    public List<String> getSynonyms() {
        return this.synonyms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> onewayTerms;
        private List<String> queryTerms;
        private List<String> synonyms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onewayTerms = defaults.onewayTerms;
    	      this.queryTerms = defaults.queryTerms;
    	      this.synonyms = defaults.synonyms;
        }

        public Builder setOnewayTerms(List<String> onewayTerms) {
            this.onewayTerms = Objects.requireNonNull(onewayTerms);
            return this;
        }

        public Builder setQueryTerms(List<String> queryTerms) {
            this.queryTerms = Objects.requireNonNull(queryTerms);
            return this;
        }

        public Builder setSynonyms(List<String> synonyms) {
            this.synonyms = Objects.requireNonNull(synonyms);
            return this;
        }

        public GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse build() {
            return new GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse(onewayTerms, queryTerms, synonyms);
        }
    }
}
