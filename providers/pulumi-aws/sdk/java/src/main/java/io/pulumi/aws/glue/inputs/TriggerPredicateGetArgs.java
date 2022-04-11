// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.TriggerPredicateConditionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerPredicateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerPredicateGetArgs Empty = new TriggerPredicateGetArgs();

    /**
     * A list of the conditions that determine when the trigger will fire. See Conditions.
     * 
     */
    @Import(name="conditions", required=true)
      private final Output<List<TriggerPredicateConditionGetArgs>> conditions;

    public Output<List<TriggerPredicateConditionGetArgs>> getConditions() {
        return this.conditions;
    }

    /**
     * How to handle multiple conditions. Defaults to `AND`. Valid values are `AND` or `ANY`.
     * 
     */
    @Import(name="logical")
      private final @Nullable Output<String> logical;

    public Output<String> getLogical() {
        return this.logical == null ? Codegen.empty() : this.logical;
    }

    public TriggerPredicateGetArgs(
        Output<List<TriggerPredicateConditionGetArgs>> conditions,
        @Nullable Output<String> logical) {
        this.conditions = Objects.requireNonNull(conditions, "expected parameter 'conditions' to be non-null");
        this.logical = logical;
    }

    private TriggerPredicateGetArgs() {
        this.conditions = Codegen.empty();
        this.logical = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerPredicateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<TriggerPredicateConditionGetArgs>> conditions;
        private @Nullable Output<String> logical;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerPredicateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.logical = defaults.logical;
        }

        public Builder conditions(Output<List<TriggerPredicateConditionGetArgs>> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(List<TriggerPredicateConditionGetArgs> conditions) {
            this.conditions = Output.of(Objects.requireNonNull(conditions));
            return this;
        }
        public Builder conditions(TriggerPredicateConditionGetArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder logical(@Nullable Output<String> logical) {
            this.logical = logical;
            return this;
        }
        public Builder logical(@Nullable String logical) {
            this.logical = Codegen.ofNullable(logical);
            return this;
        }        public TriggerPredicateGetArgs build() {
            return new TriggerPredicateGetArgs(conditions, logical);
        }
    }
}
