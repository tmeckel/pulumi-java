// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentGetArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentGetArgs();

    /**
     * Set the likelihood of a finding to a fixed value. Either this or relative_likelihood can be set.
     * Possible values are `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, and `VERY_LIKELY`.
     * 
     */
    @Import(name="fixedLikelihood")
      private final @Nullable Output<String> fixedLikelihood;

    public Output<String> getFixedLikelihood() {
        return this.fixedLikelihood == null ? Codegen.empty() : this.fixedLikelihood;
    }

    /**
     * Increase or decrease the likelihood by the specified number of levels. For example,
     * if a finding would be POSSIBLE without the detection rule and relativeLikelihood is 1,
     * then it is upgraded to LIKELY, while a value of -1 would downgrade it to UNLIKELY.
     * Likelihood may never drop below VERY_UNLIKELY or exceed VERY_LIKELY, so applying an
     * adjustment of 1 followed by an adjustment of -1 when base likelihood is VERY_LIKELY
     * will result in a final likelihood of LIKELY. Either this or fixed_likelihood can be set.
     * 
     */
    @Import(name="relativeLikelihood")
      private final @Nullable Output<Integer> relativeLikelihood;

    public Output<Integer> getRelativeLikelihood() {
        return this.relativeLikelihood == null ? Codegen.empty() : this.relativeLikelihood;
    }

    public PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentGetArgs(
        @Nullable Output<String> fixedLikelihood,
        @Nullable Output<Integer> relativeLikelihood) {
        this.fixedLikelihood = fixedLikelihood;
        this.relativeLikelihood = relativeLikelihood;
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentGetArgs() {
        this.fixedLikelihood = Codegen.empty();
        this.relativeLikelihood = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fixedLikelihood;
        private @Nullable Output<Integer> relativeLikelihood;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedLikelihood = defaults.fixedLikelihood;
    	      this.relativeLikelihood = defaults.relativeLikelihood;
        }

        public Builder fixedLikelihood(@Nullable Output<String> fixedLikelihood) {
            this.fixedLikelihood = fixedLikelihood;
            return this;
        }
        public Builder fixedLikelihood(@Nullable String fixedLikelihood) {
            this.fixedLikelihood = Codegen.ofNullable(fixedLikelihood);
            return this;
        }
        public Builder relativeLikelihood(@Nullable Output<Integer> relativeLikelihood) {
            this.relativeLikelihood = relativeLikelihood;
            return this;
        }
        public Builder relativeLikelihood(@Nullable Integer relativeLikelihood) {
            this.relativeLikelihood = Codegen.ofNullable(relativeLikelihood);
            return this;
        }        public PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentGetArgs build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentGetArgs(fixedLikelihood, relativeLikelihood);
        }
    }
}
