// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRetailV2alphaRuleReplacementActionResponse {
    /**
     * Terms from the search query. Will be replaced by replacement term. Can specify up to 100 terms.
     * 
     */
    private final List<String> queryTerms;
    /**
     * Term that will be used for replacement.
     * 
     */
    private final String replacementTerm;
    /**
     * Will be [deprecated = true] post migration;
     * 
     */
    private final String term;

    @OutputCustomType.Constructor({"queryTerms","replacementTerm","term"})
    private GoogleCloudRetailV2alphaRuleReplacementActionResponse(
        List<String> queryTerms,
        String replacementTerm,
        String term) {
        this.queryTerms = Objects.requireNonNull(queryTerms);
        this.replacementTerm = Objects.requireNonNull(replacementTerm);
        this.term = Objects.requireNonNull(term);
    }

    /**
     * Terms from the search query. Will be replaced by replacement term. Can specify up to 100 terms.
     * 
     */
    public List<String> getQueryTerms() {
        return this.queryTerms;
    }
    /**
     * Term that will be used for replacement.
     * 
     */
    public String getReplacementTerm() {
        return this.replacementTerm;
    }
    /**
     * Will be [deprecated = true] post migration;
     * 
     */
    public String getTerm() {
        return this.term;
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
