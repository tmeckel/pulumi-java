// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSAttackComplexity;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSAttackVector;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSAuthentication;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSAvailabilityImpact;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSConfidentialityImpact;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSIntegrityImpact;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSPrivilegesRequired;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSScope;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSUserInteraction;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Common Vulnerability Scoring System. For details, see https://www.first.org/cvss/specification-document This is a message we will try to use for storing multiple versions of CVSS. The intention is that as new versions of CVSS scores get added, we will be able to modify this message rather than adding new protos for each new version of the score.
 * 
 */
public final class CVSSArgs extends io.pulumi.resources.ResourceArgs {

    public static final CVSSArgs Empty = new CVSSArgs();

    @InputImport(name="attackComplexity")
      private final @Nullable Input<CVSSAttackComplexity> attackComplexity;

    public Input<CVSSAttackComplexity> getAttackComplexity() {
        return this.attackComplexity == null ? Input.empty() : this.attackComplexity;
    }

    /**
     * Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments.
     * 
     */
    @InputImport(name="attackVector")
      private final @Nullable Input<CVSSAttackVector> attackVector;

    public Input<CVSSAttackVector> getAttackVector() {
        return this.attackVector == null ? Input.empty() : this.attackVector;
    }

    @InputImport(name="authentication")
      private final @Nullable Input<CVSSAuthentication> authentication;

    public Input<CVSSAuthentication> getAuthentication() {
        return this.authentication == null ? Input.empty() : this.authentication;
    }

    @InputImport(name="availabilityImpact")
      private final @Nullable Input<CVSSAvailabilityImpact> availabilityImpact;

    public Input<CVSSAvailabilityImpact> getAvailabilityImpact() {
        return this.availabilityImpact == null ? Input.empty() : this.availabilityImpact;
    }

    /**
     * The base score is a function of the base metric scores.
     * 
     */
    @InputImport(name="baseScore")
      private final @Nullable Input<Double> baseScore;

    public Input<Double> getBaseScore() {
        return this.baseScore == null ? Input.empty() : this.baseScore;
    }

    @InputImport(name="confidentialityImpact")
      private final @Nullable Input<CVSSConfidentialityImpact> confidentialityImpact;

    public Input<CVSSConfidentialityImpact> getConfidentialityImpact() {
        return this.confidentialityImpact == null ? Input.empty() : this.confidentialityImpact;
    }

    @InputImport(name="exploitabilityScore")
      private final @Nullable Input<Double> exploitabilityScore;

    public Input<Double> getExploitabilityScore() {
        return this.exploitabilityScore == null ? Input.empty() : this.exploitabilityScore;
    }

    @InputImport(name="impactScore")
      private final @Nullable Input<Double> impactScore;

    public Input<Double> getImpactScore() {
        return this.impactScore == null ? Input.empty() : this.impactScore;
    }

    @InputImport(name="integrityImpact")
      private final @Nullable Input<CVSSIntegrityImpact> integrityImpact;

    public Input<CVSSIntegrityImpact> getIntegrityImpact() {
        return this.integrityImpact == null ? Input.empty() : this.integrityImpact;
    }

    @InputImport(name="privilegesRequired")
      private final @Nullable Input<CVSSPrivilegesRequired> privilegesRequired;

    public Input<CVSSPrivilegesRequired> getPrivilegesRequired() {
        return this.privilegesRequired == null ? Input.empty() : this.privilegesRequired;
    }

    @InputImport(name="scope")
      private final @Nullable Input<CVSSScope> scope;

    public Input<CVSSScope> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    @InputImport(name="userInteraction")
      private final @Nullable Input<CVSSUserInteraction> userInteraction;

    public Input<CVSSUserInteraction> getUserInteraction() {
        return this.userInteraction == null ? Input.empty() : this.userInteraction;
    }

    public CVSSArgs(
        @Nullable Input<CVSSAttackComplexity> attackComplexity,
        @Nullable Input<CVSSAttackVector> attackVector,
        @Nullable Input<CVSSAuthentication> authentication,
        @Nullable Input<CVSSAvailabilityImpact> availabilityImpact,
        @Nullable Input<Double> baseScore,
        @Nullable Input<CVSSConfidentialityImpact> confidentialityImpact,
        @Nullable Input<Double> exploitabilityScore,
        @Nullable Input<Double> impactScore,
        @Nullable Input<CVSSIntegrityImpact> integrityImpact,
        @Nullable Input<CVSSPrivilegesRequired> privilegesRequired,
        @Nullable Input<CVSSScope> scope,
        @Nullable Input<CVSSUserInteraction> userInteraction) {
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

    private CVSSArgs() {
        this.attackComplexity = Input.empty();
        this.attackVector = Input.empty();
        this.authentication = Input.empty();
        this.availabilityImpact = Input.empty();
        this.baseScore = Input.empty();
        this.confidentialityImpact = Input.empty();
        this.exploitabilityScore = Input.empty();
        this.impactScore = Input.empty();
        this.integrityImpact = Input.empty();
        this.privilegesRequired = Input.empty();
        this.scope = Input.empty();
        this.userInteraction = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CVSSArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CVSSAttackComplexity> attackComplexity;
        private @Nullable Input<CVSSAttackVector> attackVector;
        private @Nullable Input<CVSSAuthentication> authentication;
        private @Nullable Input<CVSSAvailabilityImpact> availabilityImpact;
        private @Nullable Input<Double> baseScore;
        private @Nullable Input<CVSSConfidentialityImpact> confidentialityImpact;
        private @Nullable Input<Double> exploitabilityScore;
        private @Nullable Input<Double> impactScore;
        private @Nullable Input<CVSSIntegrityImpact> integrityImpact;
        private @Nullable Input<CVSSPrivilegesRequired> privilegesRequired;
        private @Nullable Input<CVSSScope> scope;
        private @Nullable Input<CVSSUserInteraction> userInteraction;

        public Builder() {
    	      // Empty
        }

        public Builder(CVSSArgs defaults) {
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

        public Builder attackComplexity(@Nullable Input<CVSSAttackComplexity> attackComplexity) {
            this.attackComplexity = attackComplexity;
            return this;
        }

        public Builder attackComplexity(@Nullable CVSSAttackComplexity attackComplexity) {
            this.attackComplexity = Input.ofNullable(attackComplexity);
            return this;
        }

        public Builder attackVector(@Nullable Input<CVSSAttackVector> attackVector) {
            this.attackVector = attackVector;
            return this;
        }

        public Builder attackVector(@Nullable CVSSAttackVector attackVector) {
            this.attackVector = Input.ofNullable(attackVector);
            return this;
        }

        public Builder authentication(@Nullable Input<CVSSAuthentication> authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder authentication(@Nullable CVSSAuthentication authentication) {
            this.authentication = Input.ofNullable(authentication);
            return this;
        }

        public Builder availabilityImpact(@Nullable Input<CVSSAvailabilityImpact> availabilityImpact) {
            this.availabilityImpact = availabilityImpact;
            return this;
        }

        public Builder availabilityImpact(@Nullable CVSSAvailabilityImpact availabilityImpact) {
            this.availabilityImpact = Input.ofNullable(availabilityImpact);
            return this;
        }

        public Builder baseScore(@Nullable Input<Double> baseScore) {
            this.baseScore = baseScore;
            return this;
        }

        public Builder baseScore(@Nullable Double baseScore) {
            this.baseScore = Input.ofNullable(baseScore);
            return this;
        }

        public Builder confidentialityImpact(@Nullable Input<CVSSConfidentialityImpact> confidentialityImpact) {
            this.confidentialityImpact = confidentialityImpact;
            return this;
        }

        public Builder confidentialityImpact(@Nullable CVSSConfidentialityImpact confidentialityImpact) {
            this.confidentialityImpact = Input.ofNullable(confidentialityImpact);
            return this;
        }

        public Builder exploitabilityScore(@Nullable Input<Double> exploitabilityScore) {
            this.exploitabilityScore = exploitabilityScore;
            return this;
        }

        public Builder exploitabilityScore(@Nullable Double exploitabilityScore) {
            this.exploitabilityScore = Input.ofNullable(exploitabilityScore);
            return this;
        }

        public Builder impactScore(@Nullable Input<Double> impactScore) {
            this.impactScore = impactScore;
            return this;
        }

        public Builder impactScore(@Nullable Double impactScore) {
            this.impactScore = Input.ofNullable(impactScore);
            return this;
        }

        public Builder integrityImpact(@Nullable Input<CVSSIntegrityImpact> integrityImpact) {
            this.integrityImpact = integrityImpact;
            return this;
        }

        public Builder integrityImpact(@Nullable CVSSIntegrityImpact integrityImpact) {
            this.integrityImpact = Input.ofNullable(integrityImpact);
            return this;
        }

        public Builder privilegesRequired(@Nullable Input<CVSSPrivilegesRequired> privilegesRequired) {
            this.privilegesRequired = privilegesRequired;
            return this;
        }

        public Builder privilegesRequired(@Nullable CVSSPrivilegesRequired privilegesRequired) {
            this.privilegesRequired = Input.ofNullable(privilegesRequired);
            return this;
        }

        public Builder scope(@Nullable Input<CVSSScope> scope) {
            this.scope = scope;
            return this;
        }

        public Builder scope(@Nullable CVSSScope scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }

        public Builder userInteraction(@Nullable Input<CVSSUserInteraction> userInteraction) {
            this.userInteraction = userInteraction;
            return this;
        }

        public Builder userInteraction(@Nullable CVSSUserInteraction userInteraction) {
            this.userInteraction = Input.ofNullable(userInteraction);
            return this;
        }
        public CVSSArgs build() {
            return new CVSSArgs(attackComplexity, attackVector, authentication, availabilityImpact, baseScore, confidentialityImpact, exploitabilityScore, impactScore, integrityImpact, privilegesRequired, scope, userInteraction);
        }
    }
}
