// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricBucketOptionsExponentialBuckets {
    /**
     * Must be greater than 1.
     * 
     */
    private final @Nullable Double growthFactor;
    /**
     * Must be greater than 0.
     * 
     */
    private final @Nullable Integer numFiniteBuckets;
    /**
     * Must be greater than 0.
     * 
     */
    private final @Nullable Double scale;

    @OutputCustomType.Constructor
    private MetricBucketOptionsExponentialBuckets(
        @OutputCustomType.Parameter("growthFactor") @Nullable Double growthFactor,
        @OutputCustomType.Parameter("numFiniteBuckets") @Nullable Integer numFiniteBuckets,
        @OutputCustomType.Parameter("scale") @Nullable Double scale) {
        this.growthFactor = growthFactor;
        this.numFiniteBuckets = numFiniteBuckets;
        this.scale = scale;
    }

    /**
     * Must be greater than 1.
     * 
    */
    public Optional<Double> getGrowthFactor() {
        return Optional.ofNullable(this.growthFactor);
    }
    /**
     * Must be greater than 0.
     * 
    */
    public Optional<Integer> getNumFiniteBuckets() {
        return Optional.ofNullable(this.numFiniteBuckets);
    }
    /**
     * Must be greater than 0.
     * 
    */
    public Optional<Double> getScale() {
        return Optional.ofNullable(this.scale);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricBucketOptionsExponentialBuckets defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double growthFactor;
        private @Nullable Integer numFiniteBuckets;
        private @Nullable Double scale;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricBucketOptionsExponentialBuckets defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.growthFactor = defaults.growthFactor;
    	      this.numFiniteBuckets = defaults.numFiniteBuckets;
    	      this.scale = defaults.scale;
        }

        public Builder growthFactor(@Nullable Double growthFactor) {
            this.growthFactor = growthFactor;
            return this;
        }

        public Builder numFiniteBuckets(@Nullable Integer numFiniteBuckets) {
            this.numFiniteBuckets = numFiniteBuckets;
            return this;
        }

        public Builder scale(@Nullable Double scale) {
            this.scale = scale;
            return this;
        }
        public MetricBucketOptionsExponentialBuckets build() {
            return new MetricBucketOptionsExponentialBuckets(growthFactor, numFiniteBuckets, scale);
        }
    }
}
