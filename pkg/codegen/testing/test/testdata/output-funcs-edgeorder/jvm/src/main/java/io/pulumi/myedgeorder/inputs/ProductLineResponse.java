// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.myedgeorder.inputs.AvailabilityInformationResponse;
import io.pulumi.myedgeorder.inputs.CostInformationResponse;
import io.pulumi.myedgeorder.inputs.DescriptionResponse;
import io.pulumi.myedgeorder.inputs.FilterablePropertyResponse;
import io.pulumi.myedgeorder.inputs.HierarchyInformationResponse;
import io.pulumi.myedgeorder.inputs.ImageInformationResponse;
import io.pulumi.myedgeorder.inputs.ProductResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Product line
 * 
 */
public final class ProductLineResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProductLineResponse Empty = new ProductLineResponse();

    /**
     * Availability information of the product system.
     * 
     */
    @InputImport(name="availabilityInformation", required=true)
      private final AvailabilityInformationResponse availabilityInformation;

    public AvailabilityInformationResponse getAvailabilityInformation() {
        return this.availabilityInformation;
    }

    /**
     * Cost information for the product system.
     * 
     */
    @InputImport(name="costInformation", required=true)
      private final CostInformationResponse costInformation;

    public CostInformationResponse getCostInformation() {
        return this.costInformation;
    }

    /**
     * Description related to the product system.
     * 
     */
    @InputImport(name="description", required=true)
      private final DescriptionResponse description;

    public DescriptionResponse getDescription() {
        return this.description;
    }

    /**
     * Display Name for the product system.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * list of filters supported for a product
     * 
     */
    @InputImport(name="filterableProperties", required=true)
      private final List<FilterablePropertyResponse> filterableProperties;

    public List<FilterablePropertyResponse> getFilterableProperties() {
        return this.filterableProperties;
    }

    /**
     * Hierarchy information of a product.
     * 
     */
    @InputImport(name="hierarchyInformation", required=true)
      private final HierarchyInformationResponse hierarchyInformation;

    public HierarchyInformationResponse getHierarchyInformation() {
        return this.hierarchyInformation;
    }

    /**
     * Image information for the product system.
     * 
     */
    @InputImport(name="imageInformation", required=true)
      private final List<ImageInformationResponse> imageInformation;

    public List<ImageInformationResponse> getImageInformation() {
        return this.imageInformation;
    }

    /**
     * List of products in the product line
     * 
     */
    @InputImport(name="products", required=true)
      private final List<ProductResponse> products;

    public List<ProductResponse> getProducts() {
        return this.products;
    }

    public ProductLineResponse(
        AvailabilityInformationResponse availabilityInformation,
        CostInformationResponse costInformation,
        DescriptionResponse description,
        String displayName,
        List<FilterablePropertyResponse> filterableProperties,
        HierarchyInformationResponse hierarchyInformation,
        List<ImageInformationResponse> imageInformation,
        List<ProductResponse> products) {
        this.availabilityInformation = Objects.requireNonNull(availabilityInformation, "expected parameter 'availabilityInformation' to be non-null");
        this.costInformation = Objects.requireNonNull(costInformation, "expected parameter 'costInformation' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.filterableProperties = Objects.requireNonNull(filterableProperties, "expected parameter 'filterableProperties' to be non-null");
        this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation, "expected parameter 'hierarchyInformation' to be non-null");
        this.imageInformation = Objects.requireNonNull(imageInformation, "expected parameter 'imageInformation' to be non-null");
        this.products = Objects.requireNonNull(products, "expected parameter 'products' to be non-null");
    }

    private ProductLineResponse() {
        this.availabilityInformation = null;
        this.costInformation = null;
        this.description = null;
        this.displayName = null;
        this.filterableProperties = List.of();
        this.hierarchyInformation = null;
        this.imageInformation = List.of();
        this.products = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductLineResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvailabilityInformationResponse availabilityInformation;
        private CostInformationResponse costInformation;
        private DescriptionResponse description;
        private String displayName;
        private List<FilterablePropertyResponse> filterableProperties;
        private HierarchyInformationResponse hierarchyInformation;
        private List<ImageInformationResponse> imageInformation;
        private List<ProductResponse> products;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductLineResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityInformation = defaults.availabilityInformation;
    	      this.costInformation = defaults.costInformation;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.filterableProperties = defaults.filterableProperties;
    	      this.hierarchyInformation = defaults.hierarchyInformation;
    	      this.imageInformation = defaults.imageInformation;
    	      this.products = defaults.products;
        }

        public Builder availabilityInformation(AvailabilityInformationResponse availabilityInformation) {
            this.availabilityInformation = Objects.requireNonNull(availabilityInformation);
            return this;
        }

        public Builder costInformation(CostInformationResponse costInformation) {
            this.costInformation = Objects.requireNonNull(costInformation);
            return this;
        }

        public Builder description(DescriptionResponse description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder filterableProperties(List<FilterablePropertyResponse> filterableProperties) {
            this.filterableProperties = Objects.requireNonNull(filterableProperties);
            return this;
        }

        public Builder hierarchyInformation(HierarchyInformationResponse hierarchyInformation) {
            this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation);
            return this;
        }

        public Builder imageInformation(List<ImageInformationResponse> imageInformation) {
            this.imageInformation = Objects.requireNonNull(imageInformation);
            return this;
        }

        public Builder products(List<ProductResponse> products) {
            this.products = Objects.requireNonNull(products);
            return this;
        }
        public ProductLineResponse build() {
            return new ProductLineResponse(availabilityInformation, costInformation, description, displayName, filterableProperties, hierarchyInformation, imageInformation, products);
        }
    }
}
