// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The price information of a Product.
 * 
 */
public final class GoogleCloudRetailV2betaPriceInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaPriceInfoArgs Empty = new GoogleCloudRetailV2betaPriceInfoArgs();

    /**
     * The costs associated with the sale of a particular product. Used for gross profit reporting. * Profit = price - cost Google Merchant Center property [cost_of_goods_sold](https://support.google.com/merchants/answer/9017895).
     * 
     */
    @InputImport(name="cost")
    private final @Nullable Input<Double> cost;

    public Input<Double> getCost() {
        return this.cost == null ? Input.empty() : this.cost;
    }

    /**
     * The 3-letter currency code defined in [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html). If this field is an unrecognizable currency code, an INVALID_ARGUMENT error is returned. The Product.Type.VARIANT Products with the same Product.primary_product_id must share the same currency_code. Otherwise, a FAILED_PRECONDITION error is returned.
     * 
     */
    @InputImport(name="currencyCode")
    private final @Nullable Input<String> currencyCode;

    public Input<String> getCurrencyCode() {
        return this.currencyCode == null ? Input.empty() : this.currencyCode;
    }

    /**
     * Price of the product without any discount. If zero, by default set to be the price.
     * 
     */
    @InputImport(name="originalPrice")
    private final @Nullable Input<Double> originalPrice;

    public Input<Double> getOriginalPrice() {
        return this.originalPrice == null ? Input.empty() : this.originalPrice;
    }

    /**
     * Price of the product. Google Merchant Center property [price](https://support.google.com/merchants/answer/6324371). Schema.org property [Offer.price](https://schema.org/price).
     * 
     */
    @InputImport(name="price")
    private final @Nullable Input<Double> price;

    public Input<Double> getPrice() {
        return this.price == null ? Input.empty() : this.price;
    }

    /**
     * The timestamp when the price starts to be effective. This can be set as a future timestamp, and the price is only used for search after price_effective_time. If so, the original_price must be set and original_price is used before price_effective_time. Do not set if price is always effective because it will cause additional latency during search.
     * 
     */
    @InputImport(name="priceEffectiveTime")
    private final @Nullable Input<String> priceEffectiveTime;

    public Input<String> getPriceEffectiveTime() {
        return this.priceEffectiveTime == null ? Input.empty() : this.priceEffectiveTime;
    }

    /**
     * The timestamp when the price stops to be effective. The price is used for search before price_expire_time. If this field is set, the original_price must be set and original_price is used after price_expire_time. Do not set if price is always effective because it will cause additional latency during search.
     * 
     */
    @InputImport(name="priceExpireTime")
    private final @Nullable Input<String> priceExpireTime;

    public Input<String> getPriceExpireTime() {
        return this.priceExpireTime == null ? Input.empty() : this.priceExpireTime;
    }

    public GoogleCloudRetailV2betaPriceInfoArgs(
        @Nullable Input<Double> cost,
        @Nullable Input<String> currencyCode,
        @Nullable Input<Double> originalPrice,
        @Nullable Input<Double> price,
        @Nullable Input<String> priceEffectiveTime,
        @Nullable Input<String> priceExpireTime) {
        this.cost = cost;
        this.currencyCode = currencyCode;
        this.originalPrice = originalPrice;
        this.price = price;
        this.priceEffectiveTime = priceEffectiveTime;
        this.priceExpireTime = priceExpireTime;
    }

    private GoogleCloudRetailV2betaPriceInfoArgs() {
        this.cost = Input.empty();
        this.currencyCode = Input.empty();
        this.originalPrice = Input.empty();
        this.price = Input.empty();
        this.priceEffectiveTime = Input.empty();
        this.priceExpireTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaPriceInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> cost;
        private @Nullable Input<String> currencyCode;
        private @Nullable Input<Double> originalPrice;
        private @Nullable Input<Double> price;
        private @Nullable Input<String> priceEffectiveTime;
        private @Nullable Input<String> priceExpireTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaPriceInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cost = defaults.cost;
    	      this.currencyCode = defaults.currencyCode;
    	      this.originalPrice = defaults.originalPrice;
    	      this.price = defaults.price;
    	      this.priceEffectiveTime = defaults.priceEffectiveTime;
    	      this.priceExpireTime = defaults.priceExpireTime;
        }

        public Builder setCost(@Nullable Input<Double> cost) {
            this.cost = cost;
            return this;
        }

        public Builder setCost(@Nullable Double cost) {
            this.cost = Input.ofNullable(cost);
            return this;
        }

        public Builder setCurrencyCode(@Nullable Input<String> currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public Builder setCurrencyCode(@Nullable String currencyCode) {
            this.currencyCode = Input.ofNullable(currencyCode);
            return this;
        }

        public Builder setOriginalPrice(@Nullable Input<Double> originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }

        public Builder setOriginalPrice(@Nullable Double originalPrice) {
            this.originalPrice = Input.ofNullable(originalPrice);
            return this;
        }

        public Builder setPrice(@Nullable Input<Double> price) {
            this.price = price;
            return this;
        }

        public Builder setPrice(@Nullable Double price) {
            this.price = Input.ofNullable(price);
            return this;
        }

        public Builder setPriceEffectiveTime(@Nullable Input<String> priceEffectiveTime) {
            this.priceEffectiveTime = priceEffectiveTime;
            return this;
        }

        public Builder setPriceEffectiveTime(@Nullable String priceEffectiveTime) {
            this.priceEffectiveTime = Input.ofNullable(priceEffectiveTime);
            return this;
        }

        public Builder setPriceExpireTime(@Nullable Input<String> priceExpireTime) {
            this.priceExpireTime = priceExpireTime;
            return this;
        }

        public Builder setPriceExpireTime(@Nullable String priceExpireTime) {
            this.priceExpireTime = Input.ofNullable(priceExpireTime);
            return this;
        }

        public GoogleCloudRetailV2betaPriceInfoArgs build() {
            return new GoogleCloudRetailV2betaPriceInfoArgs(cost, currencyCode, originalPrice, price, priceEffectiveTime, priceExpireTime);
        }
    }
}
