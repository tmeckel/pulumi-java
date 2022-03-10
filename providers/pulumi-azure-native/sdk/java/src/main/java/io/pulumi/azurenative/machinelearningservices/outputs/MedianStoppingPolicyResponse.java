// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MedianStoppingPolicyResponse {
    /**
     * Number of intervals by which to delay the first evaluation.
     * 
     */
    private final @Nullable Integer delayEvaluation;
    /**
     * Interval (number of runs) between policy evaluations.
     * 
     */
    private final @Nullable Integer evaluationInterval;
    /**
     * Expected value is 'MedianStopping'.
     * 
     */
    private final String policyType;

    @OutputCustomType.Constructor
    private MedianStoppingPolicyResponse(
        @OutputCustomType.Parameter("delayEvaluation") @Nullable Integer delayEvaluation,
        @OutputCustomType.Parameter("evaluationInterval") @Nullable Integer evaluationInterval,
        @OutputCustomType.Parameter("policyType") String policyType) {
        this.delayEvaluation = delayEvaluation;
        this.evaluationInterval = evaluationInterval;
        this.policyType = policyType;
    }

    /**
     * Number of intervals by which to delay the first evaluation.
     * 
    */
    public Optional<Integer> getDelayEvaluation() {
        return Optional.ofNullable(this.delayEvaluation);
    }
    /**
     * Interval (number of runs) between policy evaluations.
     * 
    */
    public Optional<Integer> getEvaluationInterval() {
        return Optional.ofNullable(this.evaluationInterval);
    }
    /**
     * Expected value is 'MedianStopping'.
     * 
    */
    public String getPolicyType() {
        return this.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MedianStoppingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer delayEvaluation;
        private @Nullable Integer evaluationInterval;
        private String policyType;

        public Builder() {
    	      // Empty
        }

        public Builder(MedianStoppingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delayEvaluation = defaults.delayEvaluation;
    	      this.evaluationInterval = defaults.evaluationInterval;
    	      this.policyType = defaults.policyType;
        }

        public Builder delayEvaluation(@Nullable Integer delayEvaluation) {
            this.delayEvaluation = delayEvaluation;
            return this;
        }

        public Builder evaluationInterval(@Nullable Integer evaluationInterval) {
            this.evaluationInterval = evaluationInterval;
            return this;
        }

        public Builder policyType(String policyType) {
            this.policyType = Objects.requireNonNull(policyType);
            return this;
        }
        public MedianStoppingPolicyResponse build() {
            return new MedianStoppingPolicyResponse(delayEvaluation, evaluationInterval, policyType);
        }
    }
}
