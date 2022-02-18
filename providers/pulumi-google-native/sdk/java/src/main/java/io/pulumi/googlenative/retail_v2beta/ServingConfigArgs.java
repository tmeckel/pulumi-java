// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.retail_v2beta.enums.ServingConfigSolutionTypesItem;
import io.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServingConfigArgs Empty = new ServingConfigArgs();

    /**
     * Condition boost specifications. If a product matches multiple conditions in the specifications, boost scores from these specifications are all applied and combined in a non-linear way. Maximum number of specifications is 10. Notice that if both ServingConfig.boost_control_ids and [SearchRequest.boost_spec] are set, the boost conditions from both places are evaluated. If a search request matches multiple boost conditions, the final boost score is equal to the sum of the boost scores from all matched boost conditions. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @InputImport(name="boostControlIds")
    private final @Nullable Input<List<String>> boostControlIds;

    public Input<List<String>> getBoostControlIds() {
        return this.boostControlIds == null ? Input.empty() : this.boostControlIds;
    }

    @InputImport(name="catalogId", required=true)
    private final Input<String> catalogId;

    public Input<String> getCatalogId() {
        return this.catalogId;
    }

    /**
     * The human readable serving config display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * How much diversity to use in recommendation model results e.g. 'medium-diversity' or 'high-diversity'. Currently supported values: * 'no-diversity' * 'low-diversity' * 'medium-diversity' * 'high-diversity' * 'auto-diversity' If not specified, we choose default based on recommendation model type. Default value: 'no-diversity'. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    @InputImport(name="diversityLevel")
    private final @Nullable Input<String> diversityLevel;

    public Input<String> getDiversityLevel() {
        return this.diversityLevel == null ? Input.empty() : this.diversityLevel;
    }

    /**
     * Condition do not associate specifications. If multiple do not associate conditions match, all matching do not associate controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @InputImport(name="doNotAssociateControlIds")
    private final @Nullable Input<List<String>> doNotAssociateControlIds;

    public Input<List<String>> getDoNotAssociateControlIds() {
        return this.doNotAssociateControlIds == null ? Input.empty() : this.doNotAssociateControlIds;
    }

    /**
     * The specification for dynamically generated facets. Notice that only textual facets can be dynamically generated. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @InputImport(name="dynamicFacetSpec")
    private final @Nullable Input<GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs> dynamicFacetSpec;

    public Input<GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs> getDynamicFacetSpec() {
        return this.dynamicFacetSpec == null ? Input.empty() : this.dynamicFacetSpec;
    }

    /**
     * Whether to add additional category filters on the 'similar-items' model. If not specified, we enable it by default. Allowed values are: * 'no-category-match': No additional filtering of original results from the model and the customer's filters. * 'relaxed-category-match': Only keep results with categories that match at least one item categories in the PredictRequests's context item. * If customer also sends filters in the PredictRequest, then the results will satisfy both conditions (user given and category match). Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    @InputImport(name="enableCategoryFilterLevel")
    private final @Nullable Input<String> enableCategoryFilterLevel;

    public Input<String> getEnableCategoryFilterLevel() {
        return this.enableCategoryFilterLevel == null ? Input.empty() : this.enableCategoryFilterLevel;
    }

    /**
     * Facet specifications for faceted search. If empty, no facets are returned. The ids refer to the ids of Control resources with only the Facet control set. These controls are assumed to be in the same Catalog as the ServingConfig. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @InputImport(name="facetControlIds")
    private final @Nullable Input<List<String>> facetControlIds;

    public Input<List<String>> getFacetControlIds() {
        return this.facetControlIds == null ? Input.empty() : this.facetControlIds;
    }

    /**
     * Condition filter specifications. If a product matches multiple conditions in the specifications, filters from these specifications are all applied and combined via the AND operator. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @InputImport(name="filterControlIds")
    private final @Nullable Input<List<String>> filterControlIds;

    public Input<List<String>> getFilterControlIds() {
        return this.filterControlIds == null ? Input.empty() : this.filterControlIds;
    }

    /**
     * Condition ignore specifications. If multiple ignore conditions match, all matching ignore controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @InputImport(name="ignoreControlIds")
    private final @Nullable Input<List<String>> ignoreControlIds;

    public Input<List<String>> getIgnoreControlIds() {
        return this.ignoreControlIds == null ? Input.empty() : this.ignoreControlIds;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The id of the model to use at serving time. Currently only RecommendationModels are supported: https://cloud.google.com/retail/recommendations-ai/docs/create-models Can be changed but only to a compatible model (e.g. others-you-may-like CTR to others-you-may-like CVR). Required when solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    @InputImport(name="modelId")
    private final @Nullable Input<String> modelId;

    public Input<String> getModelId() {
        return this.modelId == null ? Input.empty() : this.modelId;
    }

    /**
     * Immutable. Fully qualified name projects/*{@literal /}locations/global/catalogs/*{@literal /}servingConfig/*
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Condition oneway synonyms specifications. If multiple oneway synonyms conditions match, all matching oneway synonyms controls in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @InputImport(name="onewaySynonymsControlIds")
    private final @Nullable Input<List<String>> onewaySynonymsControlIds;

    public Input<List<String>> getOnewaySynonymsControlIds() {
        return this.onewaySynonymsControlIds == null ? Input.empty() : this.onewaySynonymsControlIds;
    }

    /**
     * How much price ranking we want in serving results. Price reranking causes product items with a similar recommendation probability to be ordered by price, with the highest-priced items first. This setting could result in a decrease in click-through and conversion rates. Allowed values are: * 'no-price-reranking' * 'low-price-raranking' * 'medium-price-reranking' * 'high-price-reranking' If not specified, we choose default based on model type. Default value: 'no-price-reranking'. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    @InputImport(name="priceRerankingLevel")
    private final @Nullable Input<String> priceRerankingLevel;

    public Input<String> getPriceRerankingLevel() {
        return this.priceRerankingLevel == null ? Input.empty() : this.priceRerankingLevel;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Condition redirect specifications. Only the first triggered redirect action is applied, even if multiple apply. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @InputImport(name="redirectControlIds")
    private final @Nullable Input<List<String>> redirectControlIds;

    public Input<List<String>> getRedirectControlIds() {
        return this.redirectControlIds == null ? Input.empty() : this.redirectControlIds;
    }

    /**
     * Condition replacement specifications. - Applied according to the order in the list. - A previously replaced term can not be re-replaced. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @InputImport(name="replacementControlIds")
    private final @Nullable Input<List<String>> replacementControlIds;

    public Input<List<String>> getReplacementControlIds() {
        return this.replacementControlIds == null ? Input.empty() : this.replacementControlIds;
    }

    @InputImport(name="servingConfigId", required=true)
    private final Input<String> servingConfigId;

    public Input<String> getServingConfigId() {
        return this.servingConfigId;
    }

    /**
     * Immutable. Specifies the solution types that a serving config can be associated with. Currently we support setting only one type of solution.
     * 
     */
    @InputImport(name="solutionTypes", required=true)
    private final Input<List<ServingConfigSolutionTypesItem>> solutionTypes;

    public Input<List<ServingConfigSolutionTypesItem>> getSolutionTypes() {
        return this.solutionTypes;
    }

    /**
     * Condition synonyms specifications. If multiple syonyms conditions match, all matching synonyms control in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @InputImport(name="twowaySynonymsControlIds")
    private final @Nullable Input<List<String>> twowaySynonymsControlIds;

    public Input<List<String>> getTwowaySynonymsControlIds() {
        return this.twowaySynonymsControlIds == null ? Input.empty() : this.twowaySynonymsControlIds;
    }

    public ServingConfigArgs(
        @Nullable Input<List<String>> boostControlIds,
        Input<String> catalogId,
        Input<String> displayName,
        @Nullable Input<String> diversityLevel,
        @Nullable Input<List<String>> doNotAssociateControlIds,
        @Nullable Input<GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs> dynamicFacetSpec,
        @Nullable Input<String> enableCategoryFilterLevel,
        @Nullable Input<List<String>> facetControlIds,
        @Nullable Input<List<String>> filterControlIds,
        @Nullable Input<List<String>> ignoreControlIds,
        @Nullable Input<String> location,
        @Nullable Input<String> modelId,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> onewaySynonymsControlIds,
        @Nullable Input<String> priceRerankingLevel,
        @Nullable Input<String> project,
        @Nullable Input<List<String>> redirectControlIds,
        @Nullable Input<List<String>> replacementControlIds,
        Input<String> servingConfigId,
        Input<List<ServingConfigSolutionTypesItem>> solutionTypes,
        @Nullable Input<List<String>> twowaySynonymsControlIds) {
        this.boostControlIds = boostControlIds;
        this.catalogId = Objects.requireNonNull(catalogId, "expected parameter 'catalogId' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.diversityLevel = diversityLevel;
        this.doNotAssociateControlIds = doNotAssociateControlIds;
        this.dynamicFacetSpec = dynamicFacetSpec;
        this.enableCategoryFilterLevel = enableCategoryFilterLevel;
        this.facetControlIds = facetControlIds;
        this.filterControlIds = filterControlIds;
        this.ignoreControlIds = ignoreControlIds;
        this.location = location;
        this.modelId = modelId;
        this.name = name;
        this.onewaySynonymsControlIds = onewaySynonymsControlIds;
        this.priceRerankingLevel = priceRerankingLevel;
        this.project = project;
        this.redirectControlIds = redirectControlIds;
        this.replacementControlIds = replacementControlIds;
        this.servingConfigId = Objects.requireNonNull(servingConfigId, "expected parameter 'servingConfigId' to be non-null");
        this.solutionTypes = Objects.requireNonNull(solutionTypes, "expected parameter 'solutionTypes' to be non-null");
        this.twowaySynonymsControlIds = twowaySynonymsControlIds;
    }

    private ServingConfigArgs() {
        this.boostControlIds = Input.empty();
        this.catalogId = Input.empty();
        this.displayName = Input.empty();
        this.diversityLevel = Input.empty();
        this.doNotAssociateControlIds = Input.empty();
        this.dynamicFacetSpec = Input.empty();
        this.enableCategoryFilterLevel = Input.empty();
        this.facetControlIds = Input.empty();
        this.filterControlIds = Input.empty();
        this.ignoreControlIds = Input.empty();
        this.location = Input.empty();
        this.modelId = Input.empty();
        this.name = Input.empty();
        this.onewaySynonymsControlIds = Input.empty();
        this.priceRerankingLevel = Input.empty();
        this.project = Input.empty();
        this.redirectControlIds = Input.empty();
        this.replacementControlIds = Input.empty();
        this.servingConfigId = Input.empty();
        this.solutionTypes = Input.empty();
        this.twowaySynonymsControlIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> boostControlIds;
        private Input<String> catalogId;
        private Input<String> displayName;
        private @Nullable Input<String> diversityLevel;
        private @Nullable Input<List<String>> doNotAssociateControlIds;
        private @Nullable Input<GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs> dynamicFacetSpec;
        private @Nullable Input<String> enableCategoryFilterLevel;
        private @Nullable Input<List<String>> facetControlIds;
        private @Nullable Input<List<String>> filterControlIds;
        private @Nullable Input<List<String>> ignoreControlIds;
        private @Nullable Input<String> location;
        private @Nullable Input<String> modelId;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> onewaySynonymsControlIds;
        private @Nullable Input<String> priceRerankingLevel;
        private @Nullable Input<String> project;
        private @Nullable Input<List<String>> redirectControlIds;
        private @Nullable Input<List<String>> replacementControlIds;
        private Input<String> servingConfigId;
        private Input<List<ServingConfigSolutionTypesItem>> solutionTypes;
        private @Nullable Input<List<String>> twowaySynonymsControlIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ServingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boostControlIds = defaults.boostControlIds;
    	      this.catalogId = defaults.catalogId;
    	      this.displayName = defaults.displayName;
    	      this.diversityLevel = defaults.diversityLevel;
    	      this.doNotAssociateControlIds = defaults.doNotAssociateControlIds;
    	      this.dynamicFacetSpec = defaults.dynamicFacetSpec;
    	      this.enableCategoryFilterLevel = defaults.enableCategoryFilterLevel;
    	      this.facetControlIds = defaults.facetControlIds;
    	      this.filterControlIds = defaults.filterControlIds;
    	      this.ignoreControlIds = defaults.ignoreControlIds;
    	      this.location = defaults.location;
    	      this.modelId = defaults.modelId;
    	      this.name = defaults.name;
    	      this.onewaySynonymsControlIds = defaults.onewaySynonymsControlIds;
    	      this.priceRerankingLevel = defaults.priceRerankingLevel;
    	      this.project = defaults.project;
    	      this.redirectControlIds = defaults.redirectControlIds;
    	      this.replacementControlIds = defaults.replacementControlIds;
    	      this.servingConfigId = defaults.servingConfigId;
    	      this.solutionTypes = defaults.solutionTypes;
    	      this.twowaySynonymsControlIds = defaults.twowaySynonymsControlIds;
        }

        public Builder setBoostControlIds(@Nullable Input<List<String>> boostControlIds) {
            this.boostControlIds = boostControlIds;
            return this;
        }

        public Builder setBoostControlIds(@Nullable List<String> boostControlIds) {
            this.boostControlIds = Input.ofNullable(boostControlIds);
            return this;
        }

        public Builder setCatalogId(Input<String> catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }

        public Builder setCatalogId(String catalogId) {
            this.catalogId = Input.of(Objects.requireNonNull(catalogId));
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setDiversityLevel(@Nullable Input<String> diversityLevel) {
            this.diversityLevel = diversityLevel;
            return this;
        }

        public Builder setDiversityLevel(@Nullable String diversityLevel) {
            this.diversityLevel = Input.ofNullable(diversityLevel);
            return this;
        }

        public Builder setDoNotAssociateControlIds(@Nullable Input<List<String>> doNotAssociateControlIds) {
            this.doNotAssociateControlIds = doNotAssociateControlIds;
            return this;
        }

        public Builder setDoNotAssociateControlIds(@Nullable List<String> doNotAssociateControlIds) {
            this.doNotAssociateControlIds = Input.ofNullable(doNotAssociateControlIds);
            return this;
        }

        public Builder setDynamicFacetSpec(@Nullable Input<GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs> dynamicFacetSpec) {
            this.dynamicFacetSpec = dynamicFacetSpec;
            return this;
        }

        public Builder setDynamicFacetSpec(@Nullable GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs dynamicFacetSpec) {
            this.dynamicFacetSpec = Input.ofNullable(dynamicFacetSpec);
            return this;
        }

        public Builder setEnableCategoryFilterLevel(@Nullable Input<String> enableCategoryFilterLevel) {
            this.enableCategoryFilterLevel = enableCategoryFilterLevel;
            return this;
        }

        public Builder setEnableCategoryFilterLevel(@Nullable String enableCategoryFilterLevel) {
            this.enableCategoryFilterLevel = Input.ofNullable(enableCategoryFilterLevel);
            return this;
        }

        public Builder setFacetControlIds(@Nullable Input<List<String>> facetControlIds) {
            this.facetControlIds = facetControlIds;
            return this;
        }

        public Builder setFacetControlIds(@Nullable List<String> facetControlIds) {
            this.facetControlIds = Input.ofNullable(facetControlIds);
            return this;
        }

        public Builder setFilterControlIds(@Nullable Input<List<String>> filterControlIds) {
            this.filterControlIds = filterControlIds;
            return this;
        }

        public Builder setFilterControlIds(@Nullable List<String> filterControlIds) {
            this.filterControlIds = Input.ofNullable(filterControlIds);
            return this;
        }

        public Builder setIgnoreControlIds(@Nullable Input<List<String>> ignoreControlIds) {
            this.ignoreControlIds = ignoreControlIds;
            return this;
        }

        public Builder setIgnoreControlIds(@Nullable List<String> ignoreControlIds) {
            this.ignoreControlIds = Input.ofNullable(ignoreControlIds);
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

        public Builder setModelId(@Nullable Input<String> modelId) {
            this.modelId = modelId;
            return this;
        }

        public Builder setModelId(@Nullable String modelId) {
            this.modelId = Input.ofNullable(modelId);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOnewaySynonymsControlIds(@Nullable Input<List<String>> onewaySynonymsControlIds) {
            this.onewaySynonymsControlIds = onewaySynonymsControlIds;
            return this;
        }

        public Builder setOnewaySynonymsControlIds(@Nullable List<String> onewaySynonymsControlIds) {
            this.onewaySynonymsControlIds = Input.ofNullable(onewaySynonymsControlIds);
            return this;
        }

        public Builder setPriceRerankingLevel(@Nullable Input<String> priceRerankingLevel) {
            this.priceRerankingLevel = priceRerankingLevel;
            return this;
        }

        public Builder setPriceRerankingLevel(@Nullable String priceRerankingLevel) {
            this.priceRerankingLevel = Input.ofNullable(priceRerankingLevel);
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

        public Builder setRedirectControlIds(@Nullable Input<List<String>> redirectControlIds) {
            this.redirectControlIds = redirectControlIds;
            return this;
        }

        public Builder setRedirectControlIds(@Nullable List<String> redirectControlIds) {
            this.redirectControlIds = Input.ofNullable(redirectControlIds);
            return this;
        }

        public Builder setReplacementControlIds(@Nullable Input<List<String>> replacementControlIds) {
            this.replacementControlIds = replacementControlIds;
            return this;
        }

        public Builder setReplacementControlIds(@Nullable List<String> replacementControlIds) {
            this.replacementControlIds = Input.ofNullable(replacementControlIds);
            return this;
        }

        public Builder setServingConfigId(Input<String> servingConfigId) {
            this.servingConfigId = Objects.requireNonNull(servingConfigId);
            return this;
        }

        public Builder setServingConfigId(String servingConfigId) {
            this.servingConfigId = Input.of(Objects.requireNonNull(servingConfigId));
            return this;
        }

        public Builder setSolutionTypes(Input<List<ServingConfigSolutionTypesItem>> solutionTypes) {
            this.solutionTypes = Objects.requireNonNull(solutionTypes);
            return this;
        }

        public Builder setSolutionTypes(List<ServingConfigSolutionTypesItem> solutionTypes) {
            this.solutionTypes = Input.of(Objects.requireNonNull(solutionTypes));
            return this;
        }

        public Builder setTwowaySynonymsControlIds(@Nullable Input<List<String>> twowaySynonymsControlIds) {
            this.twowaySynonymsControlIds = twowaySynonymsControlIds;
            return this;
        }

        public Builder setTwowaySynonymsControlIds(@Nullable List<String> twowaySynonymsControlIds) {
            this.twowaySynonymsControlIds = Input.ofNullable(twowaySynonymsControlIds);
            return this;
        }

        public ServingConfigArgs build() {
            return new ServingConfigArgs(boostControlIds, catalogId, displayName, diversityLevel, doNotAssociateControlIds, dynamicFacetSpec, enableCategoryFilterLevel, facetControlIds, filterControlIds, ignoreControlIds, location, modelId, name, onewaySynonymsControlIds, priceRerankingLevel, project, redirectControlIds, replacementControlIds, servingConfigId, solutionTypes, twowaySynonymsControlIds);
        }
    }
}
