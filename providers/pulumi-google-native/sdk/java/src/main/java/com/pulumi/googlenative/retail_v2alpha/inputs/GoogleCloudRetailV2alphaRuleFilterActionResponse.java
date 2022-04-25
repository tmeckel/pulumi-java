// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * * Rule Condition: - No Condition provided is a global match. - 1 or more Condition provided is combined with OR operator. * Action Input: The request query and filter that will be applied to the retrieved products, in addition to any filters already provided with the SearchRequest. The AND operator is used to combine the query&#39;s existing filters with the filter rule(s). NOTE: May result in 0 results when filters conflict. * Action Result: Filters the returned objects to be ONLY those that passed the filter.
 * 
 */
public final class GoogleCloudRetailV2alphaRuleFilterActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2alphaRuleFilterActionResponse Empty = new GoogleCloudRetailV2alphaRuleFilterActionResponse();

    /**
     * A filter to apply on the matching condition results. Supported features: * filter must be set. * Filter syntax is identical to SearchRequest.filter. See more details at the Retail Search [user guide](/retail/search/docs/filter-and-order#filter). * To filter products with product ID &#34;product_1&#34; or &#34;product_2&#34;, and color &#34;Red&#34; or &#34;Blue&#34;: *(id: ANY(&#34;product_1&#34;, &#34;product_2&#34;)) * *AND * *(colorFamilies: ANY(&#34;Red&#34;, &#34;Blue&#34;)) *
     * 
     */
    @Import(name="filter", required=true)
    private String filter;

    /**
     * @return A filter to apply on the matching condition results. Supported features: * filter must be set. * Filter syntax is identical to SearchRequest.filter. See more details at the Retail Search [user guide](/retail/search/docs/filter-and-order#filter). * To filter products with product ID &#34;product_1&#34; or &#34;product_2&#34;, and color &#34;Red&#34; or &#34;Blue&#34;: *(id: ANY(&#34;product_1&#34;, &#34;product_2&#34;)) * *AND * *(colorFamilies: ANY(&#34;Red&#34;, &#34;Blue&#34;)) *
     * 
     */
    public String filter() {
        return this.filter;
    }

    private GoogleCloudRetailV2alphaRuleFilterActionResponse() {}

    private GoogleCloudRetailV2alphaRuleFilterActionResponse(GoogleCloudRetailV2alphaRuleFilterActionResponse $) {
        this.filter = $.filter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2alphaRuleFilterActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2alphaRuleFilterActionResponse $;

        public Builder() {
            $ = new GoogleCloudRetailV2alphaRuleFilterActionResponse();
        }

        public Builder(GoogleCloudRetailV2alphaRuleFilterActionResponse defaults) {
            $ = new GoogleCloudRetailV2alphaRuleFilterActionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param filter A filter to apply on the matching condition results. Supported features: * filter must be set. * Filter syntax is identical to SearchRequest.filter. See more details at the Retail Search [user guide](/retail/search/docs/filter-and-order#filter). * To filter products with product ID &#34;product_1&#34; or &#34;product_2&#34;, and color &#34;Red&#34; or &#34;Blue&#34;: *(id: ANY(&#34;product_1&#34;, &#34;product_2&#34;)) * *AND * *(colorFamilies: ANY(&#34;Red&#34;, &#34;Blue&#34;)) *
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            $.filter = filter;
            return this;
        }

        public GoogleCloudRetailV2alphaRuleFilterActionResponse build() {
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            return $;
        }
    }

}
