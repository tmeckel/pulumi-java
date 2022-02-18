// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.retail_v2.outputs.GoogleCloudRetailV2IntervalResponse;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRetailV2PriceInfoPriceRangeResponse {
    /**
     * The inclusive Product.pricing_info.original_price internal of all variant Product having the same Product.primary_product_id.
     * 
     */
    private final GoogleCloudRetailV2IntervalResponse originalPrice;
    /**
     * The inclusive Product.pricing_info.price interval of all variant Product having the same Product.primary_product_id.
     * 
     */
    private final GoogleCloudRetailV2IntervalResponse price;

    @OutputCustomType.Constructor({"originalPrice","price"})
    private GoogleCloudRetailV2PriceInfoPriceRangeResponse(
        GoogleCloudRetailV2IntervalResponse originalPrice,
        GoogleCloudRetailV2IntervalResponse price) {
        this.originalPrice = Objects.requireNonNull(originalPrice);
        this.price = Objects.requireNonNull(price);
    }

    /**
     * The inclusive Product.pricing_info.original_price internal of all variant Product having the same Product.primary_product_id.
     * 
     */
    public GoogleCloudRetailV2IntervalResponse getOriginalPrice() {
        return this.originalPrice;
    }
    /**
     * The inclusive Product.pricing_info.price interval of all variant Product having the same Product.primary_product_id.
     * 
     */
    public GoogleCloudRetailV2IntervalResponse getPrice() {
        return this.price;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2PriceInfoPriceRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2IntervalResponse originalPrice;
        private GoogleCloudRetailV2IntervalResponse price;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2PriceInfoPriceRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originalPrice = defaults.originalPrice;
    	      this.price = defaults.price;
        }

        public Builder setOriginalPrice(GoogleCloudRetailV2IntervalResponse originalPrice) {
            this.originalPrice = Objects.requireNonNull(originalPrice);
            return this;
        }

        public Builder setPrice(GoogleCloudRetailV2IntervalResponse price) {
            this.price = Objects.requireNonNull(price);
            return this;
        }

        public GoogleCloudRetailV2PriceInfoPriceRangeResponse build() {
            return new GoogleCloudRetailV2PriceInfoPriceRangeResponse(originalPrice, price);
        }
    }
}
