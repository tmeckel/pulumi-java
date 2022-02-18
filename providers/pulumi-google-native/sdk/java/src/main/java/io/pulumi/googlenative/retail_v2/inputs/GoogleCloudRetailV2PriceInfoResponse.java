// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.retail_v2.inputs.GoogleCloudRetailV2PriceInfoPriceRangeResponse;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * The price information of a Product.
 * 
 */
public final class GoogleCloudRetailV2PriceInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2PriceInfoResponse Empty = new GoogleCloudRetailV2PriceInfoResponse();

    /**
     * The costs associated with the sale of a particular product. Used for gross profit reporting. * Profit = price - cost Google Merchant Center property [cost_of_goods_sold](https://support.google.com/merchants/answer/9017895).
     * 
     */
    @InputImport(name="cost", required=true)
    private final Double cost;

    public Double getCost() {
        return this.cost;
    }

    /**
     * The 3-letter currency code defined in [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html). If this field is an unrecognizable currency code, an INVALID_ARGUMENT error is returned. The Product.Type.VARIANT Products with the same Product.primary_product_id must share the same currency_code. Otherwise, a FAILED_PRECONDITION error is returned.
     * 
     */
    @InputImport(name="currencyCode", required=true)
    private final String currencyCode;

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Price of the product without any discount. If zero, by default set to be the price.
     * 
     */
    @InputImport(name="originalPrice", required=true)
    private final Double originalPrice;

    public Double getOriginalPrice() {
        return this.originalPrice;
    }

    /**
     * Price of the product. Google Merchant Center property [price](https://support.google.com/merchants/answer/6324371). Schema.org property [Offer.price](https://schema.org/price).
     * 
     */
    @InputImport(name="price", required=true)
    private final Double price;

    public Double getPrice() {
        return this.price;
    }

    /**
     * The timestamp when the price starts to be effective. This can be set as a future timestamp, and the price is only used for search after price_effective_time. If so, the original_price must be set and original_price is used before price_effective_time. Do not set if price is always effective because it will cause additional latency during search.
     * 
     */
    @InputImport(name="priceEffectiveTime", required=true)
    private final String priceEffectiveTime;

    public String getPriceEffectiveTime() {
        return this.priceEffectiveTime;
    }

    /**
     * The timestamp when the price stops to be effective. The price is used for search before price_expire_time. If this field is set, the original_price must be set and original_price is used after price_expire_time. Do not set if price is always effective because it will cause additional latency during search.
     * 
     */
    @InputImport(name="priceExpireTime", required=true)
    private final String priceExpireTime;

    public String getPriceExpireTime() {
        return this.priceExpireTime;
    }

    /**
     * The price range of all the child Product.Type.VARIANT Products grouped together on the Product.Type.PRIMARY Product. Only populated for Product.Type.PRIMARY Products. Note: This field is OUTPUT_ONLY for ProductService.GetProduct. Do not set this field in API requests.
     * 
     */
    @InputImport(name="priceRange", required=true)
    private final GoogleCloudRetailV2PriceInfoPriceRangeResponse priceRange;

    public GoogleCloudRetailV2PriceInfoPriceRangeResponse getPriceRange() {
        return this.priceRange;
    }

    public GoogleCloudRetailV2PriceInfoResponse(
        Double cost,
        String currencyCode,
        Double originalPrice,
        Double price,
        String priceEffectiveTime,
        String priceExpireTime,
        GoogleCloudRetailV2PriceInfoPriceRangeResponse priceRange) {
        this.cost = Objects.requireNonNull(cost, "expected parameter 'cost' to be non-null");
        this.currencyCode = Objects.requireNonNull(currencyCode, "expected parameter 'currencyCode' to be non-null");
        this.originalPrice = Objects.requireNonNull(originalPrice, "expected parameter 'originalPrice' to be non-null");
        this.price = Objects.requireNonNull(price, "expected parameter 'price' to be non-null");
        this.priceEffectiveTime = Objects.requireNonNull(priceEffectiveTime, "expected parameter 'priceEffectiveTime' to be non-null");
        this.priceExpireTime = Objects.requireNonNull(priceExpireTime, "expected parameter 'priceExpireTime' to be non-null");
        this.priceRange = Objects.requireNonNull(priceRange, "expected parameter 'priceRange' to be non-null");
    }

    private GoogleCloudRetailV2PriceInfoResponse() {
        this.cost = null;
        this.currencyCode = null;
        this.originalPrice = null;
        this.price = null;
        this.priceEffectiveTime = null;
        this.priceExpireTime = null;
        this.priceRange = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2PriceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cost;
        private String currencyCode;
        private Double originalPrice;
        private Double price;
        private String priceEffectiveTime;
        private String priceExpireTime;
        private GoogleCloudRetailV2PriceInfoPriceRangeResponse priceRange;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2PriceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cost = defaults.cost;
    	      this.currencyCode = defaults.currencyCode;
    	      this.originalPrice = defaults.originalPrice;
    	      this.price = defaults.price;
    	      this.priceEffectiveTime = defaults.priceEffectiveTime;
    	      this.priceExpireTime = defaults.priceExpireTime;
    	      this.priceRange = defaults.priceRange;
        }

        public Builder setCost(Double cost) {
            this.cost = Objects.requireNonNull(cost);
            return this;
        }

        public Builder setCurrencyCode(String currencyCode) {
            this.currencyCode = Objects.requireNonNull(currencyCode);
            return this;
        }

        public Builder setOriginalPrice(Double originalPrice) {
            this.originalPrice = Objects.requireNonNull(originalPrice);
            return this;
        }

        public Builder setPrice(Double price) {
            this.price = Objects.requireNonNull(price);
            return this;
        }

        public Builder setPriceEffectiveTime(String priceEffectiveTime) {
            this.priceEffectiveTime = Objects.requireNonNull(priceEffectiveTime);
            return this;
        }

        public Builder setPriceExpireTime(String priceExpireTime) {
            this.priceExpireTime = Objects.requireNonNull(priceExpireTime);
            return this;
        }

        public Builder setPriceRange(GoogleCloudRetailV2PriceInfoPriceRangeResponse priceRange) {
            this.priceRange = Objects.requireNonNull(priceRange);
            return this;
        }

        public GoogleCloudRetailV2PriceInfoResponse build() {
            return new GoogleCloudRetailV2PriceInfoResponse(cost, currencyCode, originalPrice, price, priceEffectiveTime, priceExpireTime, priceRange);
        }
    }
}
