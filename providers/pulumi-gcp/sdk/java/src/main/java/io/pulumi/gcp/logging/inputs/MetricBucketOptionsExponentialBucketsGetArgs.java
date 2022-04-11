// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricBucketOptionsExponentialBucketsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricBucketOptionsExponentialBucketsGetArgs Empty = new MetricBucketOptionsExponentialBucketsGetArgs();

    /**
     * Must be greater than 1.
     * 
     */
    @Import(name="growthFactor")
      private final @Nullable Output<Double> growthFactor;

    public Output<Double> getGrowthFactor() {
        return this.growthFactor == null ? Codegen.empty() : this.growthFactor;
    }

    /**
     * Must be greater than 0.
     * 
     */
    @Import(name="numFiniteBuckets")
      private final @Nullable Output<Integer> numFiniteBuckets;

    public Output<Integer> getNumFiniteBuckets() {
        return this.numFiniteBuckets == null ? Codegen.empty() : this.numFiniteBuckets;
    }

    /**
     * Must be greater than 0.
     * 
     */
    @Import(name="scale")
      private final @Nullable Output<Double> scale;

    public Output<Double> getScale() {
        return this.scale == null ? Codegen.empty() : this.scale;
    }

    public MetricBucketOptionsExponentialBucketsGetArgs(
        @Nullable Output<Double> growthFactor,
        @Nullable Output<Integer> numFiniteBuckets,
        @Nullable Output<Double> scale) {
        this.growthFactor = growthFactor;
        this.numFiniteBuckets = numFiniteBuckets;
        this.scale = scale;
    }

    private MetricBucketOptionsExponentialBucketsGetArgs() {
        this.growthFactor = Codegen.empty();
        this.numFiniteBuckets = Codegen.empty();
        this.scale = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricBucketOptionsExponentialBucketsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> growthFactor;
        private @Nullable Output<Integer> numFiniteBuckets;
        private @Nullable Output<Double> scale;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricBucketOptionsExponentialBucketsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.growthFactor = defaults.growthFactor;
    	      this.numFiniteBuckets = defaults.numFiniteBuckets;
    	      this.scale = defaults.scale;
        }

        public Builder growthFactor(@Nullable Output<Double> growthFactor) {
            this.growthFactor = growthFactor;
            return this;
        }
        public Builder growthFactor(@Nullable Double growthFactor) {
            this.growthFactor = Codegen.ofNullable(growthFactor);
            return this;
        }
        public Builder numFiniteBuckets(@Nullable Output<Integer> numFiniteBuckets) {
            this.numFiniteBuckets = numFiniteBuckets;
            return this;
        }
        public Builder numFiniteBuckets(@Nullable Integer numFiniteBuckets) {
            this.numFiniteBuckets = Codegen.ofNullable(numFiniteBuckets);
            return this;
        }
        public Builder scale(@Nullable Output<Double> scale) {
            this.scale = scale;
            return this;
        }
        public Builder scale(@Nullable Double scale) {
            this.scale = Codegen.ofNullable(scale);
            return this;
        }        public MetricBucketOptionsExponentialBucketsGetArgs build() {
            return new MetricBucketOptionsExponentialBucketsGetArgs(growthFactor, numFiniteBuckets, scale);
        }
    }
}
