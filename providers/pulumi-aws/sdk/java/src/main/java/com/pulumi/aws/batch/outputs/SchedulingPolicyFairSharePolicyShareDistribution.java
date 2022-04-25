// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SchedulingPolicyFairSharePolicyShareDistribution {
    /**
     * @return A fair share identifier or fair share identifier prefix. For more information, see [ShareAttributes](https://docs.aws.amazon.com/batch/latest/APIReference/API_ShareAttributes.html).
     * 
     */
    private final String shareIdentifier;
    /**
     * @return The weight factor for the fair share identifier. For more information, see [ShareAttributes](https://docs.aws.amazon.com/batch/latest/APIReference/API_ShareAttributes.html).
     * 
     */
    private final @Nullable Double weightFactor;

    @CustomType.Constructor
    private SchedulingPolicyFairSharePolicyShareDistribution(
        @CustomType.Parameter("shareIdentifier") String shareIdentifier,
        @CustomType.Parameter("weightFactor") @Nullable Double weightFactor) {
        this.shareIdentifier = shareIdentifier;
        this.weightFactor = weightFactor;
    }

    /**
     * @return A fair share identifier or fair share identifier prefix. For more information, see [ShareAttributes](https://docs.aws.amazon.com/batch/latest/APIReference/API_ShareAttributes.html).
     * 
     */
    public String shareIdentifier() {
        return this.shareIdentifier;
    }
    /**
     * @return The weight factor for the fair share identifier. For more information, see [ShareAttributes](https://docs.aws.amazon.com/batch/latest/APIReference/API_ShareAttributes.html).
     * 
     */
    public Optional<Double> weightFactor() {
        return Optional.ofNullable(this.weightFactor);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingPolicyFairSharePolicyShareDistribution defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String shareIdentifier;
        private @Nullable Double weightFactor;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingPolicyFairSharePolicyShareDistribution defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shareIdentifier = defaults.shareIdentifier;
    	      this.weightFactor = defaults.weightFactor;
        }

        public Builder shareIdentifier(String shareIdentifier) {
            this.shareIdentifier = Objects.requireNonNull(shareIdentifier);
            return this;
        }
        public Builder weightFactor(@Nullable Double weightFactor) {
            this.weightFactor = weightFactor;
            return this;
        }        public SchedulingPolicyFairSharePolicyShareDistribution build() {
            return new SchedulingPolicyFairSharePolicyShareDistribution(shareIdentifier, weightFactor);
        }
    }
}
