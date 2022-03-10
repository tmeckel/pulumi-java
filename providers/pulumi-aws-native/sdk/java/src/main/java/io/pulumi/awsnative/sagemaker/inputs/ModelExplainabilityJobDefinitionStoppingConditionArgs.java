// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Specifies a time limit for how long the monitoring job is allowed to run.
 * 
 */
public final class ModelExplainabilityJobDefinitionStoppingConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelExplainabilityJobDefinitionStoppingConditionArgs Empty = new ModelExplainabilityJobDefinitionStoppingConditionArgs();

    /**
     * The maximum runtime allowed in seconds.
     * 
     */
    @InputImport(name="maxRuntimeInSeconds", required=true)
      private final Input<Integer> maxRuntimeInSeconds;

    public Input<Integer> getMaxRuntimeInSeconds() {
        return this.maxRuntimeInSeconds;
    }

    public ModelExplainabilityJobDefinitionStoppingConditionArgs(Input<Integer> maxRuntimeInSeconds) {
        this.maxRuntimeInSeconds = Objects.requireNonNull(maxRuntimeInSeconds, "expected parameter 'maxRuntimeInSeconds' to be non-null");
    }

    private ModelExplainabilityJobDefinitionStoppingConditionArgs() {
        this.maxRuntimeInSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelExplainabilityJobDefinitionStoppingConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maxRuntimeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelExplainabilityJobDefinitionStoppingConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRuntimeInSeconds = defaults.maxRuntimeInSeconds;
        }

        public Builder maxRuntimeInSeconds(Input<Integer> maxRuntimeInSeconds) {
            this.maxRuntimeInSeconds = Objects.requireNonNull(maxRuntimeInSeconds);
            return this;
        }

        public Builder maxRuntimeInSeconds(Integer maxRuntimeInSeconds) {
            this.maxRuntimeInSeconds = Input.of(Objects.requireNonNull(maxRuntimeInSeconds));
            return this;
        }
        public ModelExplainabilityJobDefinitionStoppingConditionArgs build() {
            return new ModelExplainabilityJobDefinitionStoppingConditionArgs(maxRuntimeInSeconds);
        }
    }
}
