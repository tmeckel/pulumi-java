// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recommendationengine_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


/**
 * Product price range when there are a range of prices for different variations of the same product.
 * 
 */
public final class GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse Empty = new GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse();

    /**
     * The maximum product price.
     * 
     */
    @Import(name="max", required=true)
    private Double max;

    /**
     * @return The maximum product price.
     * 
     */
    public Double max() {
        return this.max;
    }

    /**
     * The minimum product price.
     * 
     */
    @Import(name="min", required=true)
    private Double min;

    /**
     * @return The minimum product price.
     * 
     */
    public Double min() {
        return this.min;
    }

    private GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse() {}

    private GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse(GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse $;

        public Builder() {
            $ = new GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse();
        }

        public Builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse defaults) {
            $ = new GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param max The maximum product price.
         * 
         * @return builder
         * 
         */
        public Builder max(Double max) {
            $.max = max;
            return this;
        }

        /**
         * @param min The minimum product price.
         * 
         * @return builder
         * 
         */
        public Builder min(Double min) {
            $.min = min;
            return this;
        }

        public GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse build() {
            $.max = Objects.requireNonNull($.max, "expected parameter 'max' to be non-null");
            $.min = Objects.requireNonNull($.min, "expected parameter 'min' to be non-null");
            return $;
        }
    }

}
