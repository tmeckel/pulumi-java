// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vision_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.vision_v1.outputs.KeyValueResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetProductResult {
    /**
     * User-provided metadata to be stored with this product. Must be at most 4096 characters long.
     * 
     */
    private final String description;
    /**
     * The user-provided name for this Product. Must not be empty. Must be at most 4096 characters long.
     * 
     */
    private final String displayName;
    /**
     * The resource name of the product. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`. This field is ignored when creating a product.
     * 
     */
    private final String name;
    /**
     * Immutable. The category for the product identified by the reference image. This should be one of "homegoods-v2", "apparel-v2", "toys-v2", "packagedgoods-v1" or "general-v1". The legacy categories "homegoods", "apparel", and "toys" are still supported, but these should not be used for new products.
     * 
     */
    private final String productCategory;
    /**
     * Key-value pairs that can be attached to a product. At query time, constraints can be specified based on the product_labels. Note that integer values can be provided as strings, e.g. "1199". Only strings with integer values can match a range-based restriction which is to be supported soon. Multiple values can be assigned to the same key. One product may have up to 500 product_labels. Notice that the total number of distinct product_labels over all products in one ProductSet cannot exceed 1M, otherwise the product search pipeline will refuse to work for that ProductSet.
     * 
     */
    private final List<KeyValueResponse> productLabels;

    @OutputCustomType.Constructor({"description","displayName","name","productCategory","productLabels"})
    private GetProductResult(
        String description,
        String displayName,
        String name,
        String productCategory,
        List<KeyValueResponse> productLabels) {
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.name = Objects.requireNonNull(name);
        this.productCategory = Objects.requireNonNull(productCategory);
        this.productLabels = Objects.requireNonNull(productLabels);
    }

    /**
     * User-provided metadata to be stored with this product. Must be at most 4096 characters long.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The user-provided name for this Product. Must not be empty. Must be at most 4096 characters long.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The resource name of the product. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`. This field is ignored when creating a product.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Immutable. The category for the product identified by the reference image. This should be one of "homegoods-v2", "apparel-v2", "toys-v2", "packagedgoods-v1" or "general-v1". The legacy categories "homegoods", "apparel", and "toys" are still supported, but these should not be used for new products.
     * 
     */
    public String getProductCategory() {
        return this.productCategory;
    }
    /**
     * Key-value pairs that can be attached to a product. At query time, constraints can be specified based on the product_labels. Note that integer values can be provided as strings, e.g. "1199". Only strings with integer values can match a range-based restriction which is to be supported soon. Multiple values can be assigned to the same key. One product may have up to 500 product_labels. Notice that the total number of distinct product_labels over all products in one ProductSet cannot exceed 1M, otherwise the product search pipeline will refuse to work for that ProductSet.
     * 
     */
    public List<KeyValueResponse> getProductLabels() {
        return this.productLabels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String displayName;
        private String name;
        private String productCategory;
        private List<KeyValueResponse> productLabels;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProductResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.productCategory = defaults.productCategory;
    	      this.productLabels = defaults.productLabels;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProductCategory(String productCategory) {
            this.productCategory = Objects.requireNonNull(productCategory);
            return this;
        }

        public Builder setProductLabels(List<KeyValueResponse> productLabels) {
            this.productLabels = Objects.requireNonNull(productLabels);
            return this;
        }

        public GetProductResult build() {
            return new GetProductResult(description, displayName, name, productCategory, productLabels);
        }
    }
}
