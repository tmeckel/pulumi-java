// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaIntervalResponse;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRetailV2alphaPriceInfoPriceRangeResponse {
    /**
     * The inclusive Product.pricing_info.original_price internal of all variant Product having the same Product.primary_product_id.
     * 
     */
    private final GoogleCloudRetailV2alphaIntervalResponse originalPrice;
    /**
     * The inclusive Product.pricing_info.price interval of all variant Product having the same Product.primary_product_id.
     * 
     */
    private final GoogleCloudRetailV2alphaIntervalResponse price;

    @OutputCustomType.Constructor({"originalPrice","price"})
    private GoogleCloudRetailV2alphaPriceInfoPriceRangeResponse(
        GoogleCloudRetailV2alphaIntervalResponse originalPrice,
        GoogleCloudRetailV2alphaIntervalResponse price) {
        this.originalPrice = Objects.requireNonNull(originalPrice);
        this.price = Objects.requireNonNull(price);
    }

    /**
     * The inclusive Product.pricing_info.original_price internal of all variant Product having the same Product.primary_product_id.
     * 
     */
    public GoogleCloudRetailV2alphaIntervalResponse getOriginalPrice() {
        return this.originalPrice;
    }
    /**
     * The inclusive Product.pricing_info.price interval of all variant Product having the same Product.primary_product_id.
     * 
     */
    public GoogleCloudRetailV2alphaIntervalResponse getPrice() {
        return this.price;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaPriceInfoPriceRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2alphaIntervalResponse originalPrice;
        private GoogleCloudRetailV2alphaIntervalResponse price;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaPriceInfoPriceRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originalPrice = defaults.originalPrice;
    	      this.price = defaults.price;
        }

        public Builder setOriginalPrice(GoogleCloudRetailV2alphaIntervalResponse originalPrice) {
            this.originalPrice = Objects.requireNonNull(originalPrice);
            return this;
        }

        public Builder setPrice(GoogleCloudRetailV2alphaIntervalResponse price) {
            this.price = Objects.requireNonNull(price);
            return this;
        }

        public GoogleCloudRetailV2alphaPriceInfoPriceRangeResponse build() {
            return new GoogleCloudRetailV2alphaPriceInfoPriceRangeResponse(originalPrice, price);
        }
    }
}
