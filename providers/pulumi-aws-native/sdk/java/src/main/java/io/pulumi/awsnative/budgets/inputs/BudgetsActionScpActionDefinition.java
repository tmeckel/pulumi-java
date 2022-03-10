// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.budgets.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BudgetsActionScpActionDefinition extends io.pulumi.resources.InvokeArgs {

    public static final BudgetsActionScpActionDefinition Empty = new BudgetsActionScpActionDefinition();

    @InputImport(name="policyId", required=true)
      private final String policyId;

    public String getPolicyId() {
        return this.policyId;
    }

    @InputImport(name="targetIds", required=true)
      private final List<String> targetIds;

    public List<String> getTargetIds() {
        return this.targetIds;
    }

    public BudgetsActionScpActionDefinition(
        String policyId,
        List<String> targetIds) {
        this.policyId = Objects.requireNonNull(policyId, "expected parameter 'policyId' to be non-null");
        this.targetIds = Objects.requireNonNull(targetIds, "expected parameter 'targetIds' to be non-null");
    }

    private BudgetsActionScpActionDefinition() {
        this.policyId = null;
        this.targetIds = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetsActionScpActionDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String policyId;
        private List<String> targetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetsActionScpActionDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyId = defaults.policyId;
    	      this.targetIds = defaults.targetIds;
        }

        public Builder policyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }

        public Builder targetIds(List<String> targetIds) {
            this.targetIds = Objects.requireNonNull(targetIds);
            return this;
        }
        public BudgetsActionScpActionDefinition build() {
            return new BudgetsActionScpActionDefinition(policyId, targetIds);
        }
    }
}
