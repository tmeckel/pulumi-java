// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.aws.sagemaker.outputs.FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowDefinitionHumanLoopActivationConfig {
    /**
     * defines under what conditions SageMaker creates a human loop. See Human Loop Activation Conditions Config details below.
     * 
     */
    private final @Nullable FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfig humanLoopActivationConditionsConfig;

    @OutputCustomType.Constructor
    private FlowDefinitionHumanLoopActivationConfig(@OutputCustomType.Parameter("humanLoopActivationConditionsConfig") @Nullable FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfig humanLoopActivationConditionsConfig) {
        this.humanLoopActivationConditionsConfig = humanLoopActivationConditionsConfig;
    }

    /**
     * defines under what conditions SageMaker creates a human loop. See Human Loop Activation Conditions Config details below.
     * 
    */
    public Optional<FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfig> getHumanLoopActivationConditionsConfig() {
        return Optional.ofNullable(this.humanLoopActivationConditionsConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionHumanLoopActivationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfig humanLoopActivationConditionsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDefinitionHumanLoopActivationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.humanLoopActivationConditionsConfig = defaults.humanLoopActivationConditionsConfig;
        }

        public Builder humanLoopActivationConditionsConfig(@Nullable FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfig humanLoopActivationConditionsConfig) {
            this.humanLoopActivationConditionsConfig = humanLoopActivationConditionsConfig;
            return this;
        }
        public FlowDefinitionHumanLoopActivationConfig build() {
            return new FlowDefinitionHumanLoopActivationConfig(humanLoopActivationConditionsConfig);
        }
    }
}
