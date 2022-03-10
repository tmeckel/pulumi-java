// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.recommendationengine_v1beta1.outputs.GoogleCloudRecommendationengineV1beta1ImageResponse;
import io.pulumi.googlenative.recommendationengine_v1beta1.outputs.GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceResponse;
import io.pulumi.googlenative.recommendationengine_v1beta1.outputs.GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse {
    /**
     * Optional. The available quantity of the item.
     * 
     */
    private final String availableQuantity;
    /**
     * Optional. Canonical URL directly linking to the item detail page with a length limit of 5 KiB..
     * 
     */
    private final String canonicalProductUri;
    /**
     * Optional. A map to pass the costs associated with the product. For example: {"manufacturing": 45.5} The profit of selling this item is computed like so: * If 'exactPrice' is provided, profit = displayPrice - sum(costs) * If 'priceRange' is provided, profit = minPrice - sum(costs)
     * 
     */
    private final Map<String,String> costs;
    /**
     * Optional. Only required if the price is set. Currency code for price/costs. Use three-character ISO-4217 code.
     * 
     */
    private final String currencyCode;
    /**
     * Optional. The exact product price.
     * 
     */
    private final GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceResponse exactPrice;
    /**
     * Optional. Product images for the catalog item.
     * 
     */
    private final List<GoogleCloudRecommendationengineV1beta1ImageResponse> images;
    /**
     * Optional. The product price range.
     * 
     */
    private final GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse priceRange;
    /**
     * Optional. Online stock state of the catalog item. Default is `IN_STOCK`.
     * 
     */
    private final String stockState;

    @OutputCustomType.Constructor
    private GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse(
        @OutputCustomType.Parameter("availableQuantity") String availableQuantity,
        @OutputCustomType.Parameter("canonicalProductUri") String canonicalProductUri,
        @OutputCustomType.Parameter("costs") Map<String,String> costs,
        @OutputCustomType.Parameter("currencyCode") String currencyCode,
        @OutputCustomType.Parameter("exactPrice") GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceResponse exactPrice,
        @OutputCustomType.Parameter("images") List<GoogleCloudRecommendationengineV1beta1ImageResponse> images,
        @OutputCustomType.Parameter("priceRange") GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse priceRange,
        @OutputCustomType.Parameter("stockState") String stockState) {
        this.availableQuantity = availableQuantity;
        this.canonicalProductUri = canonicalProductUri;
        this.costs = costs;
        this.currencyCode = currencyCode;
        this.exactPrice = exactPrice;
        this.images = images;
        this.priceRange = priceRange;
        this.stockState = stockState;
    }

    /**
     * Optional. The available quantity of the item.
     * 
    */
    public String getAvailableQuantity() {
        return this.availableQuantity;
    }
    /**
     * Optional. Canonical URL directly linking to the item detail page with a length limit of 5 KiB..
     * 
    */
    public String getCanonicalProductUri() {
        return this.canonicalProductUri;
    }
    /**
     * Optional. A map to pass the costs associated with the product. For example: {"manufacturing": 45.5} The profit of selling this item is computed like so: * If 'exactPrice' is provided, profit = displayPrice - sum(costs) * If 'priceRange' is provided, profit = minPrice - sum(costs)
     * 
    */
    public Map<String,String> getCosts() {
        return this.costs;
    }
    /**
     * Optional. Only required if the price is set. Currency code for price/costs. Use three-character ISO-4217 code.
     * 
    */
    public String getCurrencyCode() {
        return this.currencyCode;
    }
    /**
     * Optional. The exact product price.
     * 
    */
    public GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceResponse getExactPrice() {
        return this.exactPrice;
    }
    /**
     * Optional. Product images for the catalog item.
     * 
    */
    public List<GoogleCloudRecommendationengineV1beta1ImageResponse> getImages() {
        return this.images;
    }
    /**
     * Optional. The product price range.
     * 
    */
    public GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse getPriceRange() {
        return this.priceRange;
    }
    /**
     * Optional. Online stock state of the catalog item. Default is `IN_STOCK`.
     * 
    */
    public String getStockState() {
        return this.stockState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availableQuantity;
        private String canonicalProductUri;
        private Map<String,String> costs;
        private String currencyCode;
        private GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceResponse exactPrice;
        private List<GoogleCloudRecommendationengineV1beta1ImageResponse> images;
        private GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse priceRange;
        private String stockState;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableQuantity = defaults.availableQuantity;
    	      this.canonicalProductUri = defaults.canonicalProductUri;
    	      this.costs = defaults.costs;
    	      this.currencyCode = defaults.currencyCode;
    	      this.exactPrice = defaults.exactPrice;
    	      this.images = defaults.images;
    	      this.priceRange = defaults.priceRange;
    	      this.stockState = defaults.stockState;
        }

        public Builder availableQuantity(String availableQuantity) {
            this.availableQuantity = Objects.requireNonNull(availableQuantity);
            return this;
        }

        public Builder canonicalProductUri(String canonicalProductUri) {
            this.canonicalProductUri = Objects.requireNonNull(canonicalProductUri);
            return this;
        }

        public Builder costs(Map<String,String> costs) {
            this.costs = Objects.requireNonNull(costs);
            return this;
        }

        public Builder currencyCode(String currencyCode) {
            this.currencyCode = Objects.requireNonNull(currencyCode);
            return this;
        }

        public Builder exactPrice(GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceResponse exactPrice) {
            this.exactPrice = Objects.requireNonNull(exactPrice);
            return this;
        }

        public Builder images(List<GoogleCloudRecommendationengineV1beta1ImageResponse> images) {
            this.images = Objects.requireNonNull(images);
            return this;
        }

        public Builder priceRange(GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse priceRange) {
            this.priceRange = Objects.requireNonNull(priceRange);
            return this;
        }

        public Builder stockState(String stockState) {
            this.stockState = Objects.requireNonNull(stockState);
            return this;
        }
        public GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse build() {
            return new GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse(availableQuantity, canonicalProductUri, costs, currencyCode, exactPrice, images, priceRange, stockState);
        }
    }
}
