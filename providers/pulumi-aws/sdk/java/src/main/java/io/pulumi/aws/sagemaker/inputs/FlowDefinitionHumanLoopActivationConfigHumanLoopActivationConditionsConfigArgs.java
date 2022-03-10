// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigArgs Empty = new FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigArgs();

    /**
     * A JSON expressing use-case specific conditions declaratively. If any condition is matched, atomic tasks are created against the configured work team. For more information about how to structure the JSON, see [JSON Schema for Human Loop Activation Conditions in Amazon Augmented AI](https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-human-fallback-conditions-json-schema.html).
     * 
     */
    @InputImport(name="humanLoopActivationConditions", required=true)
      private final Input<String> humanLoopActivationConditions;

    public Input<String> getHumanLoopActivationConditions() {
        return this.humanLoopActivationConditions;
    }

    public FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigArgs(Input<String> humanLoopActivationConditions) {
        this.humanLoopActivationConditions = Objects.requireNonNull(humanLoopActivationConditions, "expected parameter 'humanLoopActivationConditions' to be non-null");
    }

    private FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigArgs() {
        this.humanLoopActivationConditions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> humanLoopActivationConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.humanLoopActivationConditions = defaults.humanLoopActivationConditions;
        }

        public Builder humanLoopActivationConditions(Input<String> humanLoopActivationConditions) {
            this.humanLoopActivationConditions = Objects.requireNonNull(humanLoopActivationConditions);
            return this;
        }

        public Builder humanLoopActivationConditions(String humanLoopActivationConditions) {
            this.humanLoopActivationConditions = Input.of(Objects.requireNonNull(humanLoopActivationConditions));
            return this;
        }
        public FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigArgs build() {
            return new FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigArgs(humanLoopActivationConditions);
        }
    }
}
