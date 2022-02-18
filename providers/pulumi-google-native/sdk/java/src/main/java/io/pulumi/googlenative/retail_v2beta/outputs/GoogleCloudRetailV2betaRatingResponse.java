// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRetailV2betaRatingResponse {
    /**
     * The average rating of the Product. The rating is scaled at 1-5. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    private final Double averageRating;
    /**
     * The total number of ratings. This value is independent of the value of rating_histogram. This value must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    private final Integer ratingCount;
    /**
     * List of rating counts per rating value (index = rating - 1). The list is empty if there is no rating. If the list is non-empty, its size is always 5. Otherwise, an INVALID_ARGUMENT error is returned. For example, [41, 14, 13, 47, 303]. It means that the Product got 41 ratings with 1 star, 14 ratings with 2 star, and so on.
     * 
     */
    private final List<Integer> ratingHistogram;

    @OutputCustomType.Constructor({"averageRating","ratingCount","ratingHistogram"})
    private GoogleCloudRetailV2betaRatingResponse(
        Double averageRating,
        Integer ratingCount,
        List<Integer> ratingHistogram) {
        this.averageRating = Objects.requireNonNull(averageRating);
        this.ratingCount = Objects.requireNonNull(ratingCount);
        this.ratingHistogram = Objects.requireNonNull(ratingHistogram);
    }

    /**
     * The average rating of the Product. The rating is scaled at 1-5. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    public Double getAverageRating() {
        return this.averageRating;
    }
    /**
     * The total number of ratings. This value is independent of the value of rating_histogram. This value must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    public Integer getRatingCount() {
        return this.ratingCount;
    }
    /**
     * List of rating counts per rating value (index = rating - 1). The list is empty if there is no rating. If the list is non-empty, its size is always 5. Otherwise, an INVALID_ARGUMENT error is returned. For example, [41, 14, 13, 47, 303]. It means that the Product got 41 ratings with 1 star, 14 ratings with 2 star, and so on.
     * 
     */
    public List<Integer> getRatingHistogram() {
        return this.ratingHistogram;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaRatingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double averageRating;
        private Integer ratingCount;
        private List<Integer> ratingHistogram;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaRatingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageRating = defaults.averageRating;
    	      this.ratingCount = defaults.ratingCount;
    	      this.ratingHistogram = defaults.ratingHistogram;
        }

        public Builder setAverageRating(Double averageRating) {
            this.averageRating = Objects.requireNonNull(averageRating);
            return this;
        }

        public Builder setRatingCount(Integer ratingCount) {
            this.ratingCount = Objects.requireNonNull(ratingCount);
            return this;
        }

        public Builder setRatingHistogram(List<Integer> ratingHistogram) {
            this.ratingHistogram = Objects.requireNonNull(ratingHistogram);
            return this;
        }

        public GoogleCloudRetailV2betaRatingResponse build() {
            return new GoogleCloudRetailV2betaRatingResponse(averageRating, ratingCount, ratingHistogram);
        }
    }
}
