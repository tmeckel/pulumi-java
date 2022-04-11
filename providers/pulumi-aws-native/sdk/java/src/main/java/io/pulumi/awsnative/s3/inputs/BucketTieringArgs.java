// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketTieringAccessTier;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;


public final class BucketTieringArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketTieringArgs Empty = new BucketTieringArgs();

    /**
     * S3 Intelligent-Tiering access tier. See Storage class for automatically optimizing frequently and infrequently accessed objects for a list of access tiers in the S3 Intelligent-Tiering storage class.
     * 
     */
    @Import(name="accessTier", required=true)
      private final Output<BucketTieringAccessTier> accessTier;

    public Output<BucketTieringAccessTier> getAccessTier() {
        return this.accessTier;
    }

    /**
     * The number of consecutive days of no access after which an object will be eligible to be transitioned to the corresponding tier. The minimum number of days specified for Archive Access tier must be at least 90 days and Deep Archive Access tier must be at least 180 days. The maximum can be up to 2 years (730 days).
     * 
     */
    @Import(name="days", required=true)
      private final Output<Integer> days;

    public Output<Integer> getDays() {
        return this.days;
    }

    public BucketTieringArgs(
        Output<BucketTieringAccessTier> accessTier,
        Output<Integer> days) {
        this.accessTier = Objects.requireNonNull(accessTier, "expected parameter 'accessTier' to be non-null");
        this.days = Objects.requireNonNull(days, "expected parameter 'days' to be non-null");
    }

    private BucketTieringArgs() {
        this.accessTier = Codegen.empty();
        this.days = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketTieringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<BucketTieringAccessTier> accessTier;
        private Output<Integer> days;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketTieringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTier = defaults.accessTier;
    	      this.days = defaults.days;
        }

        public Builder accessTier(Output<BucketTieringAccessTier> accessTier) {
            this.accessTier = Objects.requireNonNull(accessTier);
            return this;
        }
        public Builder accessTier(BucketTieringAccessTier accessTier) {
            this.accessTier = Output.of(Objects.requireNonNull(accessTier));
            return this;
        }
        public Builder days(Output<Integer> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }
        public Builder days(Integer days) {
            this.days = Output.of(Objects.requireNonNull(days));
            return this;
        }        public BucketTieringArgs build() {
            return new BucketTieringArgs(accessTier, days);
        }
    }
}
