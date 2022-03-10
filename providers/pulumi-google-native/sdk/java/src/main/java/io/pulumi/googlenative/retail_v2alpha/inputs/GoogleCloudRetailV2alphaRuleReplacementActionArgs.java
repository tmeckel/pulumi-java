// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Replaces a term in the query. Multiple replacement candidates can be specified. All `query_terms` will be replaced with the replacement term. Example: Replace "gShoe" with "google shoe".
 * 
 */
public final class GoogleCloudRetailV2alphaRuleReplacementActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaRuleReplacementActionArgs Empty = new GoogleCloudRetailV2alphaRuleReplacementActionArgs();

    /**
     * Terms from the search query. Will be replaced by replacement term. Can specify up to 100 terms.
     * 
     */
    @InputImport(name="queryTerms")
      private final @Nullable Input<List<String>> queryTerms;

    public Input<List<String>> getQueryTerms() {
        return this.queryTerms == null ? Input.empty() : this.queryTerms;
    }

    /**
     * Term that will be used for replacement.
     * 
     */
    @InputImport(name="replacementTerm")
      private final @Nullable Input<String> replacementTerm;

    public Input<String> getReplacementTerm() {
        return this.replacementTerm == null ? Input.empty() : this.replacementTerm;
    }

    /**
     * Will be [deprecated = true] post migration;
     * 
     */
    @InputImport(name="term")
      private final @Nullable Input<String> term;

    public Input<String> getTerm() {
        return this.term == null ? Input.empty() : this.term;
    }

    public GoogleCloudRetailV2alphaRuleReplacementActionArgs(
        @Nullable Input<List<String>> queryTerms,
        @Nullable Input<String> replacementTerm,
        @Nullable Input<String> term) {
        this.queryTerms = queryTerms;
        this.replacementTerm = replacementTerm;
        this.term = term;
    }

    private GoogleCloudRetailV2alphaRuleReplacementActionArgs() {
        this.queryTerms = Input.empty();
        this.replacementTerm = Input.empty();
        this.term = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleReplacementActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> queryTerms;
        private @Nullable Input<String> replacementTerm;
        private @Nullable Input<String> term;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleReplacementActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryTerms = defaults.queryTerms;
    	      this.replacementTerm = defaults.replacementTerm;
    	      this.term = defaults.term;
        }

        public Builder queryTerms(@Nullable Input<List<String>> queryTerms) {
            this.queryTerms = queryTerms;
            return this;
        }

        public Builder queryTerms(@Nullable List<String> queryTerms) {
            this.queryTerms = Input.ofNullable(queryTerms);
            return this;
        }

        public Builder replacementTerm(@Nullable Input<String> replacementTerm) {
            this.replacementTerm = replacementTerm;
            return this;
        }

        public Builder replacementTerm(@Nullable String replacementTerm) {
            this.replacementTerm = Input.ofNullable(replacementTerm);
            return this;
        }

        public Builder term(@Nullable Input<String> term) {
            this.term = term;
            return this;
        }

        public Builder term(@Nullable String term) {
            this.term = Input.ofNullable(term);
            return this;
        }
        public GoogleCloudRetailV2alphaRuleReplacementActionArgs build() {
            return new GoogleCloudRetailV2alphaRuleReplacementActionArgs(queryTerms, replacementTerm, term);
        }
    }
}
