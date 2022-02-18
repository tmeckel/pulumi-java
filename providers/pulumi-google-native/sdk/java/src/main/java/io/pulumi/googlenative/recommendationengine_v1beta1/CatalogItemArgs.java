// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.recommendationengine_v1beta1.inputs.GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs;
import io.pulumi.googlenative.recommendationengine_v1beta1.inputs.GoogleCloudRecommendationengineV1beta1FeatureMapArgs;
import io.pulumi.googlenative.recommendationengine_v1beta1.inputs.GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CatalogItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final CatalogItemArgs Empty = new CatalogItemArgs();

    @InputImport(name="catalogId", required=true)
    private final Input<String> catalogId;

    public Input<String> getCatalogId() {
        return this.catalogId;
    }

    /**
     * Catalog item categories. This field is repeated for supporting one catalog item belonging to several parallel category hierarchies. For example, if a shoes product belongs to both ["Shoes & Accessories" -> "Shoes"] and ["Sports & Fitness" -> "Athletic Clothing" -> "Shoes"], it could be represented as: "categoryHierarchies": [ { "categories": ["Shoes & Accessories", "Shoes"]}, { "categories": ["Sports & Fitness", "Athletic Clothing", "Shoes"] } ]
     * 
     */
    @InputImport(name="categoryHierarchies", required=true)
    private final Input<List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs>> categoryHierarchies;

    public Input<List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs>> getCategoryHierarchies() {
        return this.categoryHierarchies;
    }

    /**
     * Optional. Catalog item description. UTF-8 encoded string with a length limit of 5 KiB.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Catalog item identifier. UTF-8 encoded string with a length limit of 128 bytes. This id must be unique among all catalog items within the same catalog. It should also be used when logging user events in order for the user events to be joined with the Catalog.
     * 
     */
    @InputImport(name="id", required=true)
    private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * Optional. Highly encouraged. Extra catalog item attributes to be included in the recommendation model. For example, for retail products, this could include the store name, vendor, style, color, etc. These are very strong signals for recommendation model, thus we highly recommend providing the item attributes here.
     * 
     */
    @InputImport(name="itemAttributes")
    private final @Nullable Input<GoogleCloudRecommendationengineV1beta1FeatureMapArgs> itemAttributes;

    public Input<GoogleCloudRecommendationengineV1beta1FeatureMapArgs> getItemAttributes() {
        return this.itemAttributes == null ? Input.empty() : this.itemAttributes;
    }

    /**
     * Optional. Variant group identifier for prediction results. UTF-8 encoded string with a length limit of 128 bytes. This field must be enabled before it can be used. [Learn more](/recommendations-ai/docs/catalog#item-group-id).
     * 
     */
    @InputImport(name="itemGroupId")
    private final @Nullable Input<String> itemGroupId;

    public Input<String> getItemGroupId() {
        return this.itemGroupId == null ? Input.empty() : this.itemGroupId;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optional. Metadata specific to retail products.
     * 
     */
    @InputImport(name="productMetadata")
    private final @Nullable Input<GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs> productMetadata;

    public Input<GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs> getProductMetadata() {
        return this.productMetadata == null ? Input.empty() : this.productMetadata;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Optional. Filtering tags associated with the catalog item. Each tag should be a UTF-8 encoded string with a length limit of 1 KiB. This tag can be used for filtering recommendation results by passing the tag as part of the predict request filter.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<String>> tags;

    public Input<List<String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Catalog item title. UTF-8 encoded string with a length limit of 1 KiB.
     * 
     */
    @InputImport(name="title", required=true)
    private final Input<String> title;

    public Input<String> getTitle() {
        return this.title;
    }

    public CatalogItemArgs(
        Input<String> catalogId,
        Input<List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs>> categoryHierarchies,
        @Nullable Input<String> description,
        Input<String> id,
        @Nullable Input<GoogleCloudRecommendationengineV1beta1FeatureMapArgs> itemAttributes,
        @Nullable Input<String> itemGroupId,
        @Nullable Input<String> location,
        @Nullable Input<GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs> productMetadata,
        @Nullable Input<String> project,
        @Nullable Input<List<String>> tags,
        Input<String> title) {
        this.catalogId = Objects.requireNonNull(catalogId, "expected parameter 'catalogId' to be non-null");
        this.categoryHierarchies = Objects.requireNonNull(categoryHierarchies, "expected parameter 'categoryHierarchies' to be non-null");
        this.description = description;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.itemAttributes = itemAttributes;
        this.itemGroupId = itemGroupId;
        this.location = location;
        this.productMetadata = productMetadata;
        this.project = project;
        this.tags = tags;
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private CatalogItemArgs() {
        this.catalogId = Input.empty();
        this.categoryHierarchies = Input.empty();
        this.description = Input.empty();
        this.id = Input.empty();
        this.itemAttributes = Input.empty();
        this.itemGroupId = Input.empty();
        this.location = Input.empty();
        this.productMetadata = Input.empty();
        this.project = Input.empty();
        this.tags = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> catalogId;
        private Input<List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs>> categoryHierarchies;
        private @Nullable Input<String> description;
        private Input<String> id;
        private @Nullable Input<GoogleCloudRecommendationengineV1beta1FeatureMapArgs> itemAttributes;
        private @Nullable Input<String> itemGroupId;
        private @Nullable Input<String> location;
        private @Nullable Input<GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs> productMetadata;
        private @Nullable Input<String> project;
        private @Nullable Input<List<String>> tags;
        private Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.categoryHierarchies = defaults.categoryHierarchies;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.itemAttributes = defaults.itemAttributes;
    	      this.itemGroupId = defaults.itemGroupId;
    	      this.location = defaults.location;
    	      this.productMetadata = defaults.productMetadata;
    	      this.project = defaults.project;
    	      this.tags = defaults.tags;
    	      this.title = defaults.title;
        }

        public Builder setCatalogId(Input<String> catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }

        public Builder setCatalogId(String catalogId) {
            this.catalogId = Input.of(Objects.requireNonNull(catalogId));
            return this;
        }

        public Builder setCategoryHierarchies(Input<List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs>> categoryHierarchies) {
            this.categoryHierarchies = Objects.requireNonNull(categoryHierarchies);
            return this;
        }

        public Builder setCategoryHierarchies(List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs> categoryHierarchies) {
            this.categoryHierarchies = Input.of(Objects.requireNonNull(categoryHierarchies));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setItemAttributes(@Nullable Input<GoogleCloudRecommendationengineV1beta1FeatureMapArgs> itemAttributes) {
            this.itemAttributes = itemAttributes;
            return this;
        }

        public Builder setItemAttributes(@Nullable GoogleCloudRecommendationengineV1beta1FeatureMapArgs itemAttributes) {
            this.itemAttributes = Input.ofNullable(itemAttributes);
            return this;
        }

        public Builder setItemGroupId(@Nullable Input<String> itemGroupId) {
            this.itemGroupId = itemGroupId;
            return this;
        }

        public Builder setItemGroupId(@Nullable String itemGroupId) {
            this.itemGroupId = Input.ofNullable(itemGroupId);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProductMetadata(@Nullable Input<GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs> productMetadata) {
            this.productMetadata = productMetadata;
            return this;
        }

        public Builder setProductMetadata(@Nullable GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs productMetadata) {
            this.productMetadata = Input.ofNullable(productMetadata);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setTags(@Nullable Input<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTitle(Input<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Input.of(Objects.requireNonNull(title));
            return this;
        }

        public CatalogItemArgs build() {
            return new CatalogItemArgs(catalogId, categoryHierarchies, description, id, itemAttributes, itemGroupId, location, productMetadata, project, tags, title);
        }
    }
}
