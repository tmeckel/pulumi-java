// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RecommendationConfigurationPropertiesResponse {
    private final String name;
    /**
     * The type of IoT Security recommendation.
     * 
     */
    private final String recommendationType;
    /**
     * Recommendation status. When the recommendation status is disabled recommendations are not generated.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor
    private RecommendationConfigurationPropertiesResponse(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("recommendationType") String recommendationType,
        @OutputCustomType.Parameter("status") String status) {
        this.name = name;
        this.recommendationType = recommendationType;
        this.status = status;
    }

    public String getName() {
        return this.name;
    }
    /**
     * The type of IoT Security recommendation.
     * 
    */
    public String getRecommendationType() {
        return this.recommendationType;
    }
    /**
     * Recommendation status. When the recommendation status is disabled recommendations are not generated.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecommendationConfigurationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String recommendationType;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(RecommendationConfigurationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.recommendationType = defaults.recommendationType;
    	      this.status = defaults.status;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder recommendationType(String recommendationType) {
            this.recommendationType = Objects.requireNonNull(recommendationType);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public RecommendationConfigurationPropertiesResponse build() {
            return new RecommendationConfigurationPropertiesResponse(name, recommendationType, status);
        }
    }
}
