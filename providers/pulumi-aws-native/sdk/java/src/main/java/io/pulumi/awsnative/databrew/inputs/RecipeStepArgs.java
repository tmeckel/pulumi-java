// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.RecipeActionArgs;
import io.pulumi.awsnative.databrew.inputs.RecipeConditionExpressionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RecipeStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecipeStepArgs Empty = new RecipeStepArgs();

    @Import(name="action", required=true)
      private final Output<RecipeActionArgs> action;

    public Output<RecipeActionArgs> getAction() {
        return this.action;
    }

    /**
     * Condition expressions applied to the step action
     * 
     */
    @Import(name="conditionExpressions")
      private final @Nullable Output<List<RecipeConditionExpressionArgs>> conditionExpressions;

    public Output<List<RecipeConditionExpressionArgs>> getConditionExpressions() {
        return this.conditionExpressions == null ? Codegen.empty() : this.conditionExpressions;
    }

    public RecipeStepArgs(
        Output<RecipeActionArgs> action,
        @Nullable Output<List<RecipeConditionExpressionArgs>> conditionExpressions) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.conditionExpressions = conditionExpressions;
    }

    private RecipeStepArgs() {
        this.action = Codegen.empty();
        this.conditionExpressions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecipeStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RecipeActionArgs> action;
        private @Nullable Output<List<RecipeConditionExpressionArgs>> conditionExpressions;

        public Builder() {
    	      // Empty
        }

        public Builder(RecipeStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.conditionExpressions = defaults.conditionExpressions;
        }

        public Builder action(Output<RecipeActionArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(RecipeActionArgs action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder conditionExpressions(@Nullable Output<List<RecipeConditionExpressionArgs>> conditionExpressions) {
            this.conditionExpressions = conditionExpressions;
            return this;
        }
        public Builder conditionExpressions(@Nullable List<RecipeConditionExpressionArgs> conditionExpressions) {
            this.conditionExpressions = Codegen.ofNullable(conditionExpressions);
            return this;
        }
        public Builder conditionExpressions(RecipeConditionExpressionArgs... conditionExpressions) {
            return conditionExpressions(List.of(conditionExpressions));
        }        public RecipeStepArgs build() {
            return new RecipeStepArgs(action, conditionExpressions);
        }
    }
}
