// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Creates a set of terms that will be treated as synonyms of each other. Example: synonyms of &#34;sneakers&#34; and &#34;shoes&#34;. * &#34;sneakers&#34; will use a synonym of &#34;shoes&#34;. * &#34;shoes&#34; will use a synonym of &#34;sneakers&#34;.
 * 
 */
public final class GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse Empty = new GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse();

    /**
     * Defines a set of synonyms. Can specify up to 100 synonyms. Must specify at least 2 synonyms.
     * 
     */
    @Import(name="synonyms", required=true)
    private List<String> synonyms;

    /**
     * @return Defines a set of synonyms. Can specify up to 100 synonyms. Must specify at least 2 synonyms.
     * 
     */
    public List<String> synonyms() {
        return this.synonyms;
    }

    private GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse() {}

    private GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse(GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse $) {
        this.synonyms = $.synonyms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse $;

        public Builder() {
            $ = new GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse();
        }

        public Builder(GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse defaults) {
            $ = new GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param synonyms Defines a set of synonyms. Can specify up to 100 synonyms. Must specify at least 2 synonyms.
         * 
         * @return builder
         * 
         */
        public Builder synonyms(List<String> synonyms) {
            $.synonyms = synonyms;
            return this;
        }

        /**
         * @param synonyms Defines a set of synonyms. Can specify up to 100 synonyms. Must specify at least 2 synonyms.
         * 
         * @return builder
         * 
         */
        public Builder synonyms(String... synonyms) {
            return synonyms(List.of(synonyms));
        }

        public GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse build() {
            $.synonyms = Objects.requireNonNull($.synonyms, "expected parameter 'synonyms' to be non-null");
            return $;
        }
    }

}
