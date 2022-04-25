// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudidentity_v1.inputs.MembershipRoleRestrictionEvaluationArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Evaluations of restrictions applied to parent group on this membership.
 * 
 */
public final class RestrictionEvaluationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RestrictionEvaluationsArgs Empty = new RestrictionEvaluationsArgs();

    /**
     * Evaluation of the member restriction applied to this membership. Empty if the user lacks permission to view the restriction evaluation.
     * 
     */
    @Import(name="memberRestrictionEvaluation")
    private @Nullable Output<MembershipRoleRestrictionEvaluationArgs> memberRestrictionEvaluation;

    /**
     * @return Evaluation of the member restriction applied to this membership. Empty if the user lacks permission to view the restriction evaluation.
     * 
     */
    public Optional<Output<MembershipRoleRestrictionEvaluationArgs>> memberRestrictionEvaluation() {
        return Optional.ofNullable(this.memberRestrictionEvaluation);
    }

    private RestrictionEvaluationsArgs() {}

    private RestrictionEvaluationsArgs(RestrictionEvaluationsArgs $) {
        this.memberRestrictionEvaluation = $.memberRestrictionEvaluation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestrictionEvaluationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestrictionEvaluationsArgs $;

        public Builder() {
            $ = new RestrictionEvaluationsArgs();
        }

        public Builder(RestrictionEvaluationsArgs defaults) {
            $ = new RestrictionEvaluationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param memberRestrictionEvaluation Evaluation of the member restriction applied to this membership. Empty if the user lacks permission to view the restriction evaluation.
         * 
         * @return builder
         * 
         */
        public Builder memberRestrictionEvaluation(@Nullable Output<MembershipRoleRestrictionEvaluationArgs> memberRestrictionEvaluation) {
            $.memberRestrictionEvaluation = memberRestrictionEvaluation;
            return this;
        }

        /**
         * @param memberRestrictionEvaluation Evaluation of the member restriction applied to this membership. Empty if the user lacks permission to view the restriction evaluation.
         * 
         * @return builder
         * 
         */
        public Builder memberRestrictionEvaluation(MembershipRoleRestrictionEvaluationArgs memberRestrictionEvaluation) {
            return memberRestrictionEvaluation(Output.of(memberRestrictionEvaluation));
        }

        public RestrictionEvaluationsArgs build() {
            return $;
        }
    }

}
