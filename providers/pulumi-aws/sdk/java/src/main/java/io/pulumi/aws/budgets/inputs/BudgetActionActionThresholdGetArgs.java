// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class BudgetActionActionThresholdGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetActionActionThresholdGetArgs Empty = new BudgetActionActionThresholdGetArgs();

    /**
     * The type of threshold for a notification. Valid values are `PERCENTAGE` or `ABSOLUTE_VALUE`.
     * 
     */
    @Import(name="actionThresholdType", required=true)
      private final Output<String> actionThresholdType;

    public Output<String> getActionThresholdType() {
        return this.actionThresholdType;
    }

    /**
     * The threshold of a notification.
     * 
     */
    @Import(name="actionThresholdValue", required=true)
      private final Output<Double> actionThresholdValue;

    public Output<Double> getActionThresholdValue() {
        return this.actionThresholdValue;
    }

    public BudgetActionActionThresholdGetArgs(
        Output<String> actionThresholdType,
        Output<Double> actionThresholdValue) {
        this.actionThresholdType = Objects.requireNonNull(actionThresholdType, "expected parameter 'actionThresholdType' to be non-null");
        this.actionThresholdValue = Objects.requireNonNull(actionThresholdValue, "expected parameter 'actionThresholdValue' to be non-null");
    }

    private BudgetActionActionThresholdGetArgs() {
        this.actionThresholdType = Codegen.empty();
        this.actionThresholdValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetActionActionThresholdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> actionThresholdType;
        private Output<Double> actionThresholdValue;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetActionActionThresholdGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionThresholdType = defaults.actionThresholdType;
    	      this.actionThresholdValue = defaults.actionThresholdValue;
        }

        public Builder actionThresholdType(Output<String> actionThresholdType) {
            this.actionThresholdType = Objects.requireNonNull(actionThresholdType);
            return this;
        }
        public Builder actionThresholdType(String actionThresholdType) {
            this.actionThresholdType = Output.of(Objects.requireNonNull(actionThresholdType));
            return this;
        }
        public Builder actionThresholdValue(Output<Double> actionThresholdValue) {
            this.actionThresholdValue = Objects.requireNonNull(actionThresholdValue);
            return this;
        }
        public Builder actionThresholdValue(Double actionThresholdValue) {
            this.actionThresholdValue = Output.of(Objects.requireNonNull(actionThresholdValue));
            return this;
        }        public BudgetActionActionThresholdGetArgs build() {
            return new BudgetActionActionThresholdGetArgs(actionThresholdType, actionThresholdValue);
        }
    }
}
