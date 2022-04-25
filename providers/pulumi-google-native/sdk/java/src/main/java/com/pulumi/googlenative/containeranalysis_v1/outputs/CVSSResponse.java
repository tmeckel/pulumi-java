// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CVSSResponse {
    private final String attackComplexity;
    /**
     * @return Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments.
     * 
     */
    private final String attackVector;
    private final String authentication;
    private final String availabilityImpact;
    /**
     * @return The base score is a function of the base metric scores.
     * 
     */
    private final Double baseScore;
    private final String confidentialityImpact;
    private final Double exploitabilityScore;
    private final Double impactScore;
    private final String integrityImpact;
    private final String privilegesRequired;
    private final String scope;
    private final String userInteraction;

    @CustomType.Constructor
    private CVSSResponse(
        @CustomType.Parameter("attackComplexity") String attackComplexity,
        @CustomType.Parameter("attackVector") String attackVector,
        @CustomType.Parameter("authentication") String authentication,
        @CustomType.Parameter("availabilityImpact") String availabilityImpact,
        @CustomType.Parameter("baseScore") Double baseScore,
        @CustomType.Parameter("confidentialityImpact") String confidentialityImpact,
        @CustomType.Parameter("exploitabilityScore") Double exploitabilityScore,
        @CustomType.Parameter("impactScore") Double impactScore,
        @CustomType.Parameter("integrityImpact") String integrityImpact,
        @CustomType.Parameter("privilegesRequired") String privilegesRequired,
        @CustomType.Parameter("scope") String scope,
        @CustomType.Parameter("userInteraction") String userInteraction) {
        this.attackComplexity = attackComplexity;
        this.attackVector = attackVector;
        this.authentication = authentication;
        this.availabilityImpact = availabilityImpact;
        this.baseScore = baseScore;
        this.confidentialityImpact = confidentialityImpact;
        this.exploitabilityScore = exploitabilityScore;
        this.impactScore = impactScore;
        this.integrityImpact = integrityImpact;
        this.privilegesRequired = privilegesRequired;
        this.scope = scope;
        this.userInteraction = userInteraction;
    }

    public String attackComplexity() {
        return this.attackComplexity;
    }
    /**
     * @return Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments.
     * 
     */
    public String attackVector() {
        return this.attackVector;
    }
    public String authentication() {
        return this.authentication;
    }
    public String availabilityImpact() {
        return this.availabilityImpact;
    }
    /**
     * @return The base score is a function of the base metric scores.
     * 
     */
    public Double baseScore() {
        return this.baseScore;
    }
    public String confidentialityImpact() {
        return this.confidentialityImpact;
    }
    public Double exploitabilityScore() {
        return this.exploitabilityScore;
    }
    public Double impactScore() {
        return this.impactScore;
    }
    public String integrityImpact() {
        return this.integrityImpact;
    }
    public String privilegesRequired() {
        return this.privilegesRequired;
    }
    public String scope() {
        return this.scope;
    }
    public String userInteraction() {
        return this.userInteraction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CVSSResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attackComplexity;
        private String attackVector;
        private String authentication;
        private String availabilityImpact;
        private Double baseScore;
        private String confidentialityImpact;
        private Double exploitabilityScore;
        private Double impactScore;
        private String integrityImpact;
        private String privilegesRequired;
        private String scope;
        private String userInteraction;

        public Builder() {
    	      // Empty
        }

        public Builder(CVSSResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attackComplexity = defaults.attackComplexity;
    	      this.attackVector = defaults.attackVector;
    	      this.authentication = defaults.authentication;
    	      this.availabilityImpact = defaults.availabilityImpact;
    	      this.baseScore = defaults.baseScore;
    	      this.confidentialityImpact = defaults.confidentialityImpact;
    	      this.exploitabilityScore = defaults.exploitabilityScore;
    	      this.impactScore = defaults.impactScore;
    	      this.integrityImpact = defaults.integrityImpact;
    	      this.privilegesRequired = defaults.privilegesRequired;
    	      this.scope = defaults.scope;
    	      this.userInteraction = defaults.userInteraction;
        }

        public Builder attackComplexity(String attackComplexity) {
            this.attackComplexity = Objects.requireNonNull(attackComplexity);
            return this;
        }
        public Builder attackVector(String attackVector) {
            this.attackVector = Objects.requireNonNull(attackVector);
            return this;
        }
        public Builder authentication(String authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }
        public Builder availabilityImpact(String availabilityImpact) {
            this.availabilityImpact = Objects.requireNonNull(availabilityImpact);
            return this;
        }
        public Builder baseScore(Double baseScore) {
            this.baseScore = Objects.requireNonNull(baseScore);
            return this;
        }
        public Builder confidentialityImpact(String confidentialityImpact) {
            this.confidentialityImpact = Objects.requireNonNull(confidentialityImpact);
            return this;
        }
        public Builder exploitabilityScore(Double exploitabilityScore) {
            this.exploitabilityScore = Objects.requireNonNull(exploitabilityScore);
            return this;
        }
        public Builder impactScore(Double impactScore) {
            this.impactScore = Objects.requireNonNull(impactScore);
            return this;
        }
        public Builder integrityImpact(String integrityImpact) {
            this.integrityImpact = Objects.requireNonNull(integrityImpact);
            return this;
        }
        public Builder privilegesRequired(String privilegesRequired) {
            this.privilegesRequired = Objects.requireNonNull(privilegesRequired);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder userInteraction(String userInteraction) {
            this.userInteraction = Objects.requireNonNull(userInteraction);
            return this;
        }        public CVSSResponse build() {
            return new CVSSResponse(attackComplexity, attackVector, authentication, availabilityImpact, baseScore, confidentialityImpact, exploitabilityScore, impactScore, integrityImpact, privilegesRequired, scope, userInteraction);
        }
    }
}
