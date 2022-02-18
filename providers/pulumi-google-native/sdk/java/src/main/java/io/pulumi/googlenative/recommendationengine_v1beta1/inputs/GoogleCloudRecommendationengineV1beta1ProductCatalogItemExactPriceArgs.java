// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Exact product price.
 * 
 */
public final class GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs Empty = new GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs();

    /**
     * Optional. Display price of the product.
     * 
     */
    @InputImport(name="displayPrice")
    private final @Nullable Input<Double> displayPrice;

    public Input<Double> getDisplayPrice() {
        return this.displayPrice == null ? Input.empty() : this.displayPrice;
    }

    /**
     * Optional. Price of the product without any discount. If zero, by default set to be the 'displayPrice'.
     * 
     */
    @InputImport(name="originalPrice")
    private final @Nullable Input<Double> originalPrice;

    public Input<Double> getOriginalPrice() {
        return this.originalPrice == null ? Input.empty() : this.originalPrice;
    }

    public GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs(
        @Nullable Input<Double> displayPrice,
        @Nullable Input<Double> originalPrice) {
        this.displayPrice = displayPrice;
        this.originalPrice = originalPrice;
    }

    private GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs() {
        this.displayPrice = Input.empty();
        this.originalPrice = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> displayPrice;
        private @Nullable Input<Double> originalPrice;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayPrice = defaults.displayPrice;
    	      this.originalPrice = defaults.originalPrice;
        }

        public Builder setDisplayPrice(@Nullable Input<Double> displayPrice) {
            this.displayPrice = displayPrice;
            return this;
        }

        public Builder setDisplayPrice(@Nullable Double displayPrice) {
            this.displayPrice = Input.ofNullable(displayPrice);
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

        public GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs build() {
            return new GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs(displayPrice, originalPrice);
        }
    }
}
