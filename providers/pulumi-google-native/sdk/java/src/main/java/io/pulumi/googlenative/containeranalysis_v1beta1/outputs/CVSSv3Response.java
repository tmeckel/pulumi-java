// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CVSSv3Response {
    private final String attackComplexity;
    /**
     * Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments.
     * 
     */
    private final String attackVector;
    private final String availabilityImpact;
    /**
     * The base score is a function of the base metric scores.
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

    @OutputCustomType.Constructor({"attackComplexity","attackVector","availabilityImpact","baseScore","confidentialityImpact","exploitabilityScore","impactScore","integrityImpact","privilegesRequired","scope","userInteraction"})
    private CVSSv3Response(
        String attackComplexity,
        String attackVector,
        String availabilityImpact,
        Double baseScore,
        String confidentialityImpact,
        Double exploitabilityScore,
        Double impactScore,
        String integrityImpact,
        String privilegesRequired,
        String scope,
        String userInteraction) {
        this.attackComplexity = Objects.requireNonNull(attackComplexity);
        this.attackVector = Objects.requireNonNull(attackVector);
        this.availabilityImpact = Objects.requireNonNull(availabilityImpact);
        this.baseScore = Objects.requireNonNull(baseScore);
        this.confidentialityImpact = Objects.requireNonNull(confidentialityImpact);
        this.exploitabilityScore = Objects.requireNonNull(exploitabilityScore);
        this.impactScore = Objects.requireNonNull(impactScore);
        this.integrityImpact = Objects.requireNonNull(integrityImpact);
        this.privilegesRequired = Objects.requireNonNull(privilegesRequired);
        this.scope = Objects.requireNonNull(scope);
        this.userInteraction = Objects.requireNonNull(userInteraction);
    }

    public String getAttackComplexity() {
        return this.attackComplexity;
    }
    /**
     * Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments.
     * 
     */
    public String getAttackVector() {
        return this.attackVector;
    }
    public String getAvailabilityImpact() {
        return this.availabilityImpact;
    }
    /**
     * The base score is a function of the base metric scores.
     * 
     */
    public Double getBaseScore() {
        return this.baseScore;
    }
    public String getConfidentialityImpact() {
        return this.confidentialityImpact;
    }
    public Double getExploitabilityScore() {
        return this.exploitabilityScore;
    }
    public Double getImpactScore() {
        return this.impactScore;
    }
    public String getIntegrityImpact() {
        return this.integrityImpact;
    }
    public String getPrivilegesRequired() {
        return this.privilegesRequired;
    }
    public String getScope() {
        return this.scope;
    }
    public String getUserInteraction() {
        return this.userInteraction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CVSSv3Response defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attackComplexity;
        private String attackVector;
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

        public Builder(CVSSv3Response defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attackComplexity = defaults.attackComplexity;
    	      this.attackVector = defaults.attackVector;
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

        public Builder setAttackComplexity(String attackComplexity) {
            this.attackComplexity = Objects.requireNonNull(attackComplexity);
            return this;
        }

        public Builder setAttackVector(String attackVector) {
            this.attackVector = Objects.requireNonNull(attackVector);
            return this;
        }

        public Builder setAvailabilityImpact(String availabilityImpact) {
            this.availabilityImpact = Objects.requireNonNull(availabilityImpact);
            return this;
        }

        public Builder setBaseScore(Double baseScore) {
            this.baseScore = Objects.requireNonNull(baseScore);
            return this;
        }

        public Builder setConfidentialityImpact(String confidentialityImpact) {
            this.confidentialityImpact = Objects.requireNonNull(confidentialityImpact);
            return this;
        }

        public Builder setExploitabilityScore(Double exploitabilityScore) {
            this.exploitabilityScore = Objects.requireNonNull(exploitabilityScore);
            return this;
        }

        public Builder setImpactScore(Double impactScore) {
            this.impactScore = Objects.requireNonNull(impactScore);
            return this;
        }

        public Builder setIntegrityImpact(String integrityImpact) {
            this.integrityImpact = Objects.requireNonNull(integrityImpact);
            return this;
        }

        public Builder setPrivilegesRequired(String privilegesRequired) {
            this.privilegesRequired = Objects.requireNonNull(privilegesRequired);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setUserInteraction(String userInteraction) {
            this.userInteraction = Objects.requireNonNull(userInteraction);
            return this;
        }

        public CVSSv3Response build() {
            return new CVSSv3Response(attackComplexity, attackVector, availabilityImpact, baseScore, confidentialityImpact, exploitabilityScore, impactScore, integrityImpact, privilegesRequired, scope, userInteraction);
        }
    }
}
