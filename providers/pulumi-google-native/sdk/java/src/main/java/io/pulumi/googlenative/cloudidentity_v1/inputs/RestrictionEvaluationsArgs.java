// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudidentity_v1.inputs.MembershipRoleRestrictionEvaluationArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Evaluations of restrictions applied to parent group on this membership.
 * 
 */
public final class RestrictionEvaluationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestrictionEvaluationsArgs Empty = new RestrictionEvaluationsArgs();

    /**
     * Evaluation of the member restriction applied to this membership. Empty if the user lacks permission to view the restriction evaluation.
     * 
     */
    @InputImport(name="memberRestrictionEvaluation")
    private final @Nullable Input<MembershipRoleRestrictionEvaluationArgs> memberRestrictionEvaluation;

    public Input<MembershipRoleRestrictionEvaluationArgs> getMemberRestrictionEvaluation() {
        return this.memberRestrictionEvaluation == null ? Input.empty() : this.memberRestrictionEvaluation;
    }

    public RestrictionEvaluationsArgs(@Nullable Input<MembershipRoleRestrictionEvaluationArgs> memberRestrictionEvaluation) {
        this.memberRestrictionEvaluation = memberRestrictionEvaluation;
    }

    private RestrictionEvaluationsArgs() {
        this.memberRestrictionEvaluation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestrictionEvaluationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MembershipRoleRestrictionEvaluationArgs> memberRestrictionEvaluation;

        public Builder() {
    	      // Empty
        }

        public Builder(RestrictionEvaluationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memberRestrictionEvaluation = defaults.memberRestrictionEvaluation;
        }

        public Builder setMemberRestrictionEvaluation(@Nullable Input<MembershipRoleRestrictionEvaluationArgs> memberRestrictionEvaluation) {
            this.memberRestrictionEvaluation = memberRestrictionEvaluation;
            return this;
        }

        public Builder setMemberRestrictionEvaluation(@Nullable MembershipRoleRestrictionEvaluationArgs memberRestrictionEvaluation) {
            this.memberRestrictionEvaluation = Input.ofNullable(memberRestrictionEvaluation);
            return this;
        }

        public RestrictionEvaluationsArgs build() {
            return new RestrictionEvaluationsArgs(memberRestrictionEvaluation);
        }
    }
}
