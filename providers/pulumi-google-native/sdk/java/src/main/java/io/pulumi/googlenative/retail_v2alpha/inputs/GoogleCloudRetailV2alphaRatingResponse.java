// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


/**
 * The rating of a Product.
 * 
 */
public final class GoogleCloudRetailV2alphaRatingResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2alphaRatingResponse Empty = new GoogleCloudRetailV2alphaRatingResponse();

    /**
     * The average rating of the Product. The rating is scaled at 1-5. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @InputImport(name="averageRating", required=true)
      private final Double averageRating;

    public Double getAverageRating() {
        return this.averageRating;
    }

    /**
     * The total number of ratings. This value is independent of the value of rating_histogram. This value must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @InputImport(name="ratingCount", required=true)
      private final Integer ratingCount;

    public Integer getRatingCount() {
        return this.ratingCount;
    }

    /**
     * List of rating counts per rating value (index = rating - 1). The list is empty if there is no rating. If the list is non-empty, its size is always 5. Otherwise, an INVALID_ARGUMENT error is returned. For example, [41, 14, 13, 47, 303]. It means that the Product got 41 ratings with 1 star, 14 ratings with 2 star, and so on.
     * 
     */
    @InputImport(name="ratingHistogram", required=true)
      private final List<Integer> ratingHistogram;

    public List<Integer> getRatingHistogram() {
        return this.ratingHistogram;
    }

    public GoogleCloudRetailV2alphaRatingResponse(
        Double averageRating,
        Integer ratingCount,
        List<Integer> ratingHistogram) {
        this.averageRating = Objects.requireNonNull(averageRating, "expected parameter 'averageRating' to be non-null");
        this.ratingCount = Objects.requireNonNull(ratingCount, "expected parameter 'ratingCount' to be non-null");
        this.ratingHistogram = Objects.requireNonNull(ratingHistogram, "expected parameter 'ratingHistogram' to be non-null");
    }

    private GoogleCloudRetailV2alphaRatingResponse() {
        this.averageRating = null;
        this.ratingCount = null;
        this.ratingHistogram = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRatingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double averageRating;
        private Integer ratingCount;
        private List<Integer> ratingHistogram;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRatingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageRating = defaults.averageRating;
    	      this.ratingCount = defaults.ratingCount;
    	      this.ratingHistogram = defaults.ratingHistogram;
        }

        public Builder averageRating(Double averageRating) {
            this.averageRating = Objects.requireNonNull(averageRating);
            return this;
        }

        public Builder ratingCount(Integer ratingCount) {
            this.ratingCount = Objects.requireNonNull(ratingCount);
            return this;
        }

        public Builder ratingHistogram(List<Integer> ratingHistogram) {
            this.ratingHistogram = Objects.requireNonNull(ratingHistogram);
            return this;
        }
        public GoogleCloudRetailV2alphaRatingResponse build() {
            return new GoogleCloudRetailV2alphaRatingResponse(averageRating, ratingCount, ratingHistogram);
        }
    }
}
