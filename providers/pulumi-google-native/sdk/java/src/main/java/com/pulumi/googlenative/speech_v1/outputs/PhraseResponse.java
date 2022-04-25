// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.speech_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PhraseResponse {
    /**
     * @return Hint Boost. Overrides the boost set at the phrase set level. Positive value will increase the probability that a specific phrase will be recognized over other similar sounding phrases. The higher the boost, the higher the chance of false positive recognition as well. Negative boost will simply be ignored. Though `boost` can accept a wide range of positive values, most use cases are best served with values between 0 and 20. We recommend using a binary search approach to finding the optimal value for your use case. Speech recognition will skip PhraseSets with a boost value of 0.
     * 
     */
    private final Double boost;
    /**
     * @return The phrase itself.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private PhraseResponse(
        @CustomType.Parameter("boost") Double boost,
        @CustomType.Parameter("value") String value) {
        this.boost = boost;
        this.value = value;
    }

    /**
     * @return Hint Boost. Overrides the boost set at the phrase set level. Positive value will increase the probability that a specific phrase will be recognized over other similar sounding phrases. The higher the boost, the higher the chance of false positive recognition as well. Negative boost will simply be ignored. Though `boost` can accept a wide range of positive values, most use cases are best served with values between 0 and 20. We recommend using a binary search approach to finding the optimal value for your use case. Speech recognition will skip PhraseSets with a boost value of 0.
     * 
     */
    public Double boost() {
        return this.boost;
    }
    /**
     * @return The phrase itself.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PhraseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double boost;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(PhraseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boost = defaults.boost;
    	      this.value = defaults.value;
        }

        public Builder boost(Double boost) {
            this.boost = Objects.requireNonNull(boost);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public PhraseResponse build() {
            return new PhraseResponse(boost, value);
        }
    }
}
