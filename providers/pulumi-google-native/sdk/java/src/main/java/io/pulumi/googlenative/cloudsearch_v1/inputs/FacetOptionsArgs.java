// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies operators to return facet results for. There will be one FacetResult for every source_name/object_type/operator_name combination.
 * 
 */
public final class FacetOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final FacetOptionsArgs Empty = new FacetOptionsArgs();

    /**
     * Maximum number of facet buckets that should be returned for this facet. Defaults to 10. Maximum value is 100.
     * 
     */
    @InputImport(name="numFacetBuckets")
      private final @Nullable Input<Integer> numFacetBuckets;

    public Input<Integer> getNumFacetBuckets() {
        return this.numFacetBuckets == null ? Input.empty() : this.numFacetBuckets;
    }

    /**
     * If object_type is set, only those objects of that type will be used to compute facets. If empty, then all objects will be used to compute facets.
     * 
     */
    @InputImport(name="objectType")
      private final @Nullable Input<String> objectType;

    public Input<String> getObjectType() {
        return this.objectType == null ? Input.empty() : this.objectType;
    }

    /**
     * Name of the operator chosen for faceting. @see cloudsearch.SchemaPropertyOptions
     * 
     */
    @InputImport(name="operatorName")
      private final @Nullable Input<String> operatorName;

    public Input<String> getOperatorName() {
        return this.operatorName == null ? Input.empty() : this.operatorName;
    }

    /**
     * Source name to facet on. Format: datasources/{source_id} If empty, all data sources will be used.
     * 
     */
    @InputImport(name="sourceName")
      private final @Nullable Input<String> sourceName;

    public Input<String> getSourceName() {
        return this.sourceName == null ? Input.empty() : this.sourceName;
    }

    public FacetOptionsArgs(
        @Nullable Input<Integer> numFacetBuckets,
        @Nullable Input<String> objectType,
        @Nullable Input<String> operatorName,
        @Nullable Input<String> sourceName) {
        this.numFacetBuckets = numFacetBuckets;
        this.objectType = objectType;
        this.operatorName = operatorName;
        this.sourceName = sourceName;
    }

    private FacetOptionsArgs() {
        this.numFacetBuckets = Input.empty();
        this.objectType = Input.empty();
        this.operatorName = Input.empty();
        this.sourceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FacetOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> numFacetBuckets;
        private @Nullable Input<String> objectType;
        private @Nullable Input<String> operatorName;
        private @Nullable Input<String> sourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(FacetOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numFacetBuckets = defaults.numFacetBuckets;
    	      this.objectType = defaults.objectType;
    	      this.operatorName = defaults.operatorName;
    	      this.sourceName = defaults.sourceName;
        }

        public Builder numFacetBuckets(@Nullable Input<Integer> numFacetBuckets) {
            this.numFacetBuckets = numFacetBuckets;
            return this;
        }

        public Builder numFacetBuckets(@Nullable Integer numFacetBuckets) {
            this.numFacetBuckets = Input.ofNullable(numFacetBuckets);
            return this;
        }

        public Builder objectType(@Nullable Input<String> objectType) {
            this.objectType = objectType;
            return this;
        }

        public Builder objectType(@Nullable String objectType) {
            this.objectType = Input.ofNullable(objectType);
            return this;
        }

        public Builder operatorName(@Nullable Input<String> operatorName) {
            this.operatorName = operatorName;
            return this;
        }

        public Builder operatorName(@Nullable String operatorName) {
            this.operatorName = Input.ofNullable(operatorName);
            return this;
        }

        public Builder sourceName(@Nullable Input<String> sourceName) {
            this.sourceName = sourceName;
            return this;
        }

        public Builder sourceName(@Nullable String sourceName) {
            this.sourceName = Input.ofNullable(sourceName);
            return this;
        }
        public FacetOptionsArgs build() {
            return new FacetOptionsArgs(numFacetBuckets, objectType, operatorName, sourceName);
        }
    }
}
