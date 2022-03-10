// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PredictionDistributionDefinitionResponseDistributions {
    /**
     * Number of negatives.
     * 
     */
    private final @Nullable Double negatives;
    /**
     * Number of negatives above threshold.
     * 
     */
    private final @Nullable Double negativesAboveThreshold;
    /**
     * Number of positives.
     * 
     */
    private final @Nullable Double positives;
    /**
     * Number of positives above threshold.
     * 
     */
    private final @Nullable Double positivesAboveThreshold;
    /**
     * Score threshold.
     * 
     */
    private final @Nullable Integer scoreThreshold;

    @OutputCustomType.Constructor
    private PredictionDistributionDefinitionResponseDistributions(
        @OutputCustomType.Parameter("negatives") @Nullable Double negatives,
        @OutputCustomType.Parameter("negativesAboveThreshold") @Nullable Double negativesAboveThreshold,
        @OutputCustomType.Parameter("positives") @Nullable Double positives,
        @OutputCustomType.Parameter("positivesAboveThreshold") @Nullable Double positivesAboveThreshold,
        @OutputCustomType.Parameter("scoreThreshold") @Nullable Integer scoreThreshold) {
        this.negatives = negatives;
        this.negativesAboveThreshold = negativesAboveThreshold;
        this.positives = positives;
        this.positivesAboveThreshold = positivesAboveThreshold;
        this.scoreThreshold = scoreThreshold;
    }

    /**
     * Number of negatives.
     * 
    */
    public Optional<Double> getNegatives() {
        return Optional.ofNullable(this.negatives);
    }
    /**
     * Number of negatives above threshold.
     * 
    */
    public Optional<Double> getNegativesAboveThreshold() {
        return Optional.ofNullable(this.negativesAboveThreshold);
    }
    /**
     * Number of positives.
     * 
    */
    public Optional<Double> getPositives() {
        return Optional.ofNullable(this.positives);
    }
    /**
     * Number of positives above threshold.
     * 
    */
    public Optional<Double> getPositivesAboveThreshold() {
        return Optional.ofNullable(this.positivesAboveThreshold);
    }
    /**
     * Score threshold.
     * 
    */
    public Optional<Integer> getScoreThreshold() {
        return Optional.ofNullable(this.scoreThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PredictionDistributionDefinitionResponseDistributions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double negatives;
        private @Nullable Double negativesAboveThreshold;
        private @Nullable Double positives;
        private @Nullable Double positivesAboveThreshold;
        private @Nullable Integer scoreThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(PredictionDistributionDefinitionResponseDistributions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.negatives = defaults.negatives;
    	      this.negativesAboveThreshold = defaults.negativesAboveThreshold;
    	      this.positives = defaults.positives;
    	      this.positivesAboveThreshold = defaults.positivesAboveThreshold;
    	      this.scoreThreshold = defaults.scoreThreshold;
        }

        public Builder negatives(@Nullable Double negatives) {
            this.negatives = negatives;
            return this;
        }

        public Builder negativesAboveThreshold(@Nullable Double negativesAboveThreshold) {
            this.negativesAboveThreshold = negativesAboveThreshold;
            return this;
        }

        public Builder positives(@Nullable Double positives) {
            this.positives = positives;
            return this;
        }

        public Builder positivesAboveThreshold(@Nullable Double positivesAboveThreshold) {
            this.positivesAboveThreshold = positivesAboveThreshold;
            return this;
        }

        public Builder scoreThreshold(@Nullable Integer scoreThreshold) {
            this.scoreThreshold = scoreThreshold;
            return this;
        }
        public PredictionDistributionDefinitionResponseDistributions build() {
            return new PredictionDistributionDefinitionResponseDistributions(negatives, negativesAboveThreshold, positives, positivesAboveThreshold, scoreThreshold);
        }
    }
}
