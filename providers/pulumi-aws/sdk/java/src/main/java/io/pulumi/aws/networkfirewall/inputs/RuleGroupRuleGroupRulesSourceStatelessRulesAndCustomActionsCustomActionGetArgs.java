// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs Empty = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs();

    /**
     * A configuration block describing the custom action associated with the `action_name`. See Action Definition below for details.
     * 
     */
    @Import(name="actionDefinition", required=true)
      private final Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionGetArgs> actionDefinition;

    public Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionGetArgs> getActionDefinition() {
        return this.actionDefinition;
    }

    /**
     * A friendly name of the custom action.
     * 
     */
    @Import(name="actionName", required=true)
      private final Output<String> actionName;

    public Output<String> getActionName() {
        return this.actionName;
    }

    public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs(
        Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionGetArgs> actionDefinition,
        Output<String> actionName) {
        this.actionDefinition = Objects.requireNonNull(actionDefinition, "expected parameter 'actionDefinition' to be non-null");
        this.actionName = Objects.requireNonNull(actionName, "expected parameter 'actionName' to be non-null");
    }

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs() {
        this.actionDefinition = Codegen.empty();
        this.actionName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionGetArgs> actionDefinition;
        private Output<String> actionName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionDefinition = defaults.actionDefinition;
    	      this.actionName = defaults.actionName;
        }

        public Builder actionDefinition(Output<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionGetArgs> actionDefinition) {
            this.actionDefinition = Objects.requireNonNull(actionDefinition);
            return this;
        }
        public Builder actionDefinition(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionGetArgs actionDefinition) {
            this.actionDefinition = Output.of(Objects.requireNonNull(actionDefinition));
            return this;
        }
        public Builder actionName(Output<String> actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }
        public Builder actionName(String actionName) {
            this.actionName = Output.of(Objects.requireNonNull(actionName));
            return this;
        }        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs(actionDefinition, actionName);
        }
    }
}
