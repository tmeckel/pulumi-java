// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Replaces a term in the query. Multiple replacement candidates can be specified. All `query_terms` will be replaced with the replacement term. Example: Replace "gShoe" with "google shoe".
 * 
 */
public final class GoogleCloudRetailV2alphaRuleReplacementActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2alphaRuleReplacementActionResponse Empty = new GoogleCloudRetailV2alphaRuleReplacementActionResponse();

    /**
     * Terms from the search query. Will be replaced by replacement term. Can specify up to 100 terms.
     * 
     */
    @InputImport(name="queryTerms", required=true)
    private final List<String> queryTerms;

    public List<String> getQueryTerms() {
        return this.queryTerms;
    }

    /**
     * Term that will be used for replacement.
     * 
     */
    @InputImport(name="replacementTerm", required=true)
    private final String replacementTerm;

    public String getReplacementTerm() {
        return this.replacementTerm;
    }

    /**
     * Will be [deprecated = true] post migration;
     * 
     */
    @InputImport(name="term", required=true)
    private final String term;

    public String getTerm() {
        return this.term;
    }

    public GoogleCloudRetailV2alphaRuleReplacementActionResponse(
        List<String> queryTerms,
        String replacementTerm,
        String term) {
        this.queryTerms = Objects.requireNonNull(queryTerms, "expected parameter 'queryTerms' to be non-null");
        this.replacementTerm = Objects.requireNonNull(replacementTerm, "expected parameter 'replacementTerm' to be non-null");
        this.term = Objects.requireNonNull(term, "expected parameter 'term' to be non-null");
    }

    private GoogleCloudRetailV2alphaRuleReplacementActionResponse() {
        this.queryTerms = List.of();
        this.replacementTerm = null;
        this.term = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleReplacementActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> queryTerms;
        private String replacementTerm;
        private String term;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleReplacementActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryTerms = defaults.queryTerms;
    	      this.replacementTerm = defaults.replacementTerm;
    	      this.term = defaults.term;
        }

        public Builder setQueryTerms(List<String> queryTerms) {
            this.queryTerms = Objects.requireNonNull(queryTerms);
            return this;
        }

        public Builder setReplacementTerm(String replacementTerm) {
            this.replacementTerm = Objects.requireNonNull(replacementTerm);
            return this;
        }

        public Builder setTerm(String term) {
            this.term = Objects.requireNonNull(term);
            return this;
        }

        public GoogleCloudRetailV2alphaRuleReplacementActionResponse build() {
            return new GoogleCloudRetailV2alphaRuleReplacementActionResponse(queryTerms, replacementTerm, term);
        }
    }
}
