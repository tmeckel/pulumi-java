// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyClusterAdmissionRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyClusterAdmissionRuleGetArgs Empty = new PolicyClusterAdmissionRuleGetArgs();

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @InputImport(name="cluster", required=true)
      private final Input<String> cluster;

    public Input<String> getCluster() {
        return this.cluster;
    }

    /**
     * The action when a pod creation is denied by the admission rule.
     * Possible values are `ENFORCED_BLOCK_AND_AUDIT_LOG` and `DRYRUN_AUDIT_LOG_ONLY`.
     * 
     */
    @InputImport(name="enforcementMode", required=true)
      private final Input<String> enforcementMode;

    public Input<String> getEnforcementMode() {
        return this.enforcementMode;
    }

    /**
     * How this admission rule will be evaluated.
     * Possible values are `ALWAYS_ALLOW`, `REQUIRE_ATTESTATION`, and `ALWAYS_DENY`.
     * 
     */
    @InputImport(name="evaluationMode", required=true)
      private final Input<String> evaluationMode;

    public Input<String> getEvaluationMode() {
        return this.evaluationMode;
    }

    /**
     * The resource names of the attestors that must attest to a
     * container image. If the attestor is in a different project from the
     * policy, it should be specified in the format `projects/*{@literal /}attestors/*`.
     * Each attestor must exist before a policy can reference it. To add an
     * attestor to a policy the principal issuing the policy change
     * request must be able to read the attestor resource.
     * Note: this field must be non-empty when the evaluation_mode field
     * specifies REQUIRE_ATTESTATION, otherwise it must be empty.
     * 
     */
    @InputImport(name="requireAttestationsBies")
      private final @Nullable Input<List<String>> requireAttestationsBies;

    public Input<List<String>> getRequireAttestationsBies() {
        return this.requireAttestationsBies == null ? Input.empty() : this.requireAttestationsBies;
    }

    public PolicyClusterAdmissionRuleGetArgs(
        Input<String> cluster,
        Input<String> enforcementMode,
        Input<String> evaluationMode,
        @Nullable Input<List<String>> requireAttestationsBies) {
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
        this.enforcementMode = Objects.requireNonNull(enforcementMode, "expected parameter 'enforcementMode' to be non-null");
        this.evaluationMode = Objects.requireNonNull(evaluationMode, "expected parameter 'evaluationMode' to be non-null");
        this.requireAttestationsBies = requireAttestationsBies;
    }

    private PolicyClusterAdmissionRuleGetArgs() {
        this.cluster = Input.empty();
        this.enforcementMode = Input.empty();
        this.evaluationMode = Input.empty();
        this.requireAttestationsBies = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyClusterAdmissionRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cluster;
        private Input<String> enforcementMode;
        private Input<String> evaluationMode;
        private @Nullable Input<List<String>> requireAttestationsBies;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyClusterAdmissionRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.enforcementMode = defaults.enforcementMode;
    	      this.evaluationMode = defaults.evaluationMode;
    	      this.requireAttestationsBies = defaults.requireAttestationsBies;
        }

        public Builder cluster(Input<String> cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }

        public Builder cluster(String cluster) {
            this.cluster = Input.of(Objects.requireNonNull(cluster));
            return this;
        }

        public Builder enforcementMode(Input<String> enforcementMode) {
            this.enforcementMode = Objects.requireNonNull(enforcementMode);
            return this;
        }

        public Builder enforcementMode(String enforcementMode) {
            this.enforcementMode = Input.of(Objects.requireNonNull(enforcementMode));
            return this;
        }

        public Builder evaluationMode(Input<String> evaluationMode) {
            this.evaluationMode = Objects.requireNonNull(evaluationMode);
            return this;
        }

        public Builder evaluationMode(String evaluationMode) {
            this.evaluationMode = Input.of(Objects.requireNonNull(evaluationMode));
            return this;
        }

        public Builder requireAttestationsBies(@Nullable Input<List<String>> requireAttestationsBies) {
            this.requireAttestationsBies = requireAttestationsBies;
            return this;
        }

        public Builder requireAttestationsBies(@Nullable List<String> requireAttestationsBies) {
            this.requireAttestationsBies = Input.ofNullable(requireAttestationsBies);
            return this;
        }
        public PolicyClusterAdmissionRuleGetArgs build() {
            return new PolicyClusterAdmissionRuleGetArgs(cluster, enforcementMode, evaluationMode, requireAttestationsBies);
        }
    }
}
