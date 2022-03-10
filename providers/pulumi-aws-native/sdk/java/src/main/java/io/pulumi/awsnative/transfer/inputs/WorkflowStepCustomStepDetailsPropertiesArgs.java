// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.transfer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details for a step that invokes a lambda function.
 * 
 */
public final class WorkflowStepCustomStepDetailsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowStepCustomStepDetailsPropertiesArgs Empty = new WorkflowStepCustomStepDetailsPropertiesArgs();

    /**
     * The name of the step, used as an identifier.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ARN for the lambda function that is being called.
     * 
     */
    @InputImport(name="target")
      private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    /**
     * Timeout, in seconds, for the step.
     * 
     */
    @InputImport(name="timeoutSeconds")
      private final @Nullable Input<Integer> timeoutSeconds;

    public Input<Integer> getTimeoutSeconds() {
        return this.timeoutSeconds == null ? Input.empty() : this.timeoutSeconds;
    }

    public WorkflowStepCustomStepDetailsPropertiesArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> target,
        @Nullable Input<Integer> timeoutSeconds) {
        this.name = name;
        this.target = target;
        this.timeoutSeconds = timeoutSeconds;
    }

    private WorkflowStepCustomStepDetailsPropertiesArgs() {
        this.name = Input.empty();
        this.target = Input.empty();
        this.timeoutSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowStepCustomStepDetailsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> target;
        private @Nullable Input<Integer> timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowStepCustomStepDetailsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.target = defaults.target;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder target(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder target(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }

        public Builder timeoutSeconds(@Nullable Input<Integer> timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = Input.ofNullable(timeoutSeconds);
            return this;
        }
        public WorkflowStepCustomStepDetailsPropertiesArgs build() {
            return new WorkflowStepCustomStepDetailsPropertiesArgs(name, target, timeoutSeconds);
        }
    }
}
