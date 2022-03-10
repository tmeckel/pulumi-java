// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupActionDefinitionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupCustomActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupCustomActionArgs Empty = new RuleGroupCustomActionArgs();

    @InputImport(name="actionDefinition", required=true)
      private final Input<RuleGroupActionDefinitionArgs> actionDefinition;

    public Input<RuleGroupActionDefinitionArgs> getActionDefinition() {
        return this.actionDefinition;
    }

    @InputImport(name="actionName", required=true)
      private final Input<String> actionName;

    public Input<String> getActionName() {
        return this.actionName;
    }

    public RuleGroupCustomActionArgs(
        Input<RuleGroupActionDefinitionArgs> actionDefinition,
        Input<String> actionName) {
        this.actionDefinition = Objects.requireNonNull(actionDefinition, "expected parameter 'actionDefinition' to be non-null");
        this.actionName = Objects.requireNonNull(actionName, "expected parameter 'actionName' to be non-null");
    }

    private RuleGroupCustomActionArgs() {
        this.actionDefinition = Input.empty();
        this.actionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupCustomActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RuleGroupActionDefinitionArgs> actionDefinition;
        private Input<String> actionName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupCustomActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionDefinition = defaults.actionDefinition;
    	      this.actionName = defaults.actionName;
        }

        public Builder actionDefinition(Input<RuleGroupActionDefinitionArgs> actionDefinition) {
            this.actionDefinition = Objects.requireNonNull(actionDefinition);
            return this;
        }

        public Builder actionDefinition(RuleGroupActionDefinitionArgs actionDefinition) {
            this.actionDefinition = Input.of(Objects.requireNonNull(actionDefinition));
            return this;
        }

        public Builder actionName(Input<String> actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }

        public Builder actionName(String actionName) {
            this.actionName = Input.of(Objects.requireNonNull(actionName));
            return this;
        }
        public RuleGroupCustomActionArgs build() {
            return new RuleGroupCustomActionArgs(actionDefinition, actionName);
        }
    }
}
