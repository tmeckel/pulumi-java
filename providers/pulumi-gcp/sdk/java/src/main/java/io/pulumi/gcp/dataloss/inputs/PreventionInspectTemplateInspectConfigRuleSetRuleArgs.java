// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleArgs();

    /**
     * The rule that specifies conditions when findings of infoTypes specified in InspectionRuleSet are removed from results.
     * Structure is documented below.
     * 
     */
    @Import(name="exclusionRule")
      private final @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs> exclusionRule;

    public Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs> getExclusionRule() {
        return this.exclusionRule == null ? Codegen.empty() : this.exclusionRule;
    }

    /**
     * Hotword-based detection rule.
     * Structure is documented below.
     * 
     */
    @Import(name="hotwordRule")
      private final @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs> hotwordRule;

    public Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs> getHotwordRule() {
        return this.hotwordRule == null ? Codegen.empty() : this.hotwordRule;
    }

    public PreventionInspectTemplateInspectConfigRuleSetRuleArgs(
        @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs> exclusionRule,
        @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs> hotwordRule) {
        this.exclusionRule = exclusionRule;
        this.hotwordRule = hotwordRule;
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleArgs() {
        this.exclusionRule = Codegen.empty();
        this.hotwordRule = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs> exclusionRule;
        private @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs> hotwordRule;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclusionRule = defaults.exclusionRule;
    	      this.hotwordRule = defaults.hotwordRule;
        }

        public Builder exclusionRule(@Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs> exclusionRule) {
            this.exclusionRule = exclusionRule;
            return this;
        }
        public Builder exclusionRule(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs exclusionRule) {
            this.exclusionRule = Codegen.ofNullable(exclusionRule);
            return this;
        }
        public Builder hotwordRule(@Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs> hotwordRule) {
            this.hotwordRule = hotwordRule;
            return this;
        }
        public Builder hotwordRule(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs hotwordRule) {
            this.hotwordRule = Codegen.ofNullable(hotwordRule);
            return this;
        }        public PreventionInspectTemplateInspectConfigRuleSetRuleArgs build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleArgs(exclusionRule, hotwordRule);
        }
    }
}
