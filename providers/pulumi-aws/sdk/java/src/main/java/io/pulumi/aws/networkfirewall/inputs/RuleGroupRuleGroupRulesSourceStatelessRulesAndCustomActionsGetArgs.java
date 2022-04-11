// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs;
import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs Empty = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs();

    /**
     * Set of configuration blocks containing custom action definitions that are available for use by the set of `stateless rule`. See Custom Action below for details.
     * 
     */
    @Import(name="customActions")
      private final @Nullable Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs>> customActions;

    public Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs>> getCustomActions() {
        return this.customActions == null ? Codegen.empty() : this.customActions;
    }

    /**
     * Set of configuration blocks containing the stateless rules for use in the stateless rule group. See Stateless Rule below for details.
     * 
     */
    @Import(name="statelessRules", required=true)
      private final Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleGetArgs>> statelessRules;

    public Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleGetArgs>> getStatelessRules() {
        return this.statelessRules;
    }

    public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs(
        @Nullable Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs>> customActions,
        Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleGetArgs>> statelessRules) {
        this.customActions = customActions;
        this.statelessRules = Objects.requireNonNull(statelessRules, "expected parameter 'statelessRules' to be non-null");
    }

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs() {
        this.customActions = Codegen.empty();
        this.statelessRules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs>> customActions;
        private Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleGetArgs>> statelessRules;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customActions = defaults.customActions;
    	      this.statelessRules = defaults.statelessRules;
        }

        public Builder customActions(@Nullable Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs>> customActions) {
            this.customActions = customActions;
            return this;
        }
        public Builder customActions(@Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs> customActions) {
            this.customActions = Codegen.ofNullable(customActions);
            return this;
        }
        public Builder customActions(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs... customActions) {
            return customActions(List.of(customActions));
        }
        public Builder statelessRules(Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleGetArgs>> statelessRules) {
            this.statelessRules = Objects.requireNonNull(statelessRules);
            return this;
        }
        public Builder statelessRules(List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleGetArgs> statelessRules) {
            this.statelessRules = Output.of(Objects.requireNonNull(statelessRules));
            return this;
        }
        public Builder statelessRules(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleGetArgs... statelessRules) {
            return statelessRules(List.of(statelessRules));
        }        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs(customActions, statelessRules);
        }
    }
}
