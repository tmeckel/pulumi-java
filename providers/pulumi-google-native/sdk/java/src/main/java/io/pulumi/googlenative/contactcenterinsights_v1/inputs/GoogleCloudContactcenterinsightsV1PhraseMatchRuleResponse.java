// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The data for a phrase match rule.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1PhraseMatchRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1PhraseMatchRuleResponse Empty = new GoogleCloudContactcenterinsightsV1PhraseMatchRuleResponse();

    /**
     * Provides additional information about the rule that specifies how to apply the rule.
     * 
     */
    @InputImport(name="config", required=true)
    private final GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse config;

    public GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse getConfig() {
        return this.config;
    }

    /**
     * Specifies whether the phrase must be missing from the transcript segment or present in the transcript segment.
     * 
     */
    @InputImport(name="negated", required=true)
    private final Boolean negated;

    public Boolean getNegated() {
        return this.negated;
    }

    /**
     * The phrase to be matched.
     * 
     */
    @InputImport(name="query", required=true)
    private final String query;

    public String getQuery() {
        return this.query;
    }

    public GoogleCloudContactcenterinsightsV1PhraseMatchRuleResponse(
        GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse config,
        Boolean negated,
        String query) {
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.negated = Objects.requireNonNull(negated, "expected parameter 'negated' to be non-null");
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1PhraseMatchRuleResponse() {
        this.config = null;
        this.negated = null;
        this.query = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1PhraseMatchRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse config;
        private Boolean negated;
        private String query;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1PhraseMatchRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.negated = defaults.negated;
    	      this.query = defaults.query;
        }

        public Builder setConfig(GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setNegated(Boolean negated) {
            this.negated = Objects.requireNonNull(negated);
            return this;
        }

        public Builder setQuery(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public GoogleCloudContactcenterinsightsV1PhraseMatchRuleResponse build() {
            return new GoogleCloudContactcenterinsightsV1PhraseMatchRuleResponse(config, negated, query);
        }
    }
}
