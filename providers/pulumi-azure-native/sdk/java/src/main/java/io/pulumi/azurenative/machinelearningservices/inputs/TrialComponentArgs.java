// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.InputDataBindingArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.MpiArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.OutputDataBindingArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.PyTorchArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.TensorFlowArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Trial component definition.
 * 
 */
public final class TrialComponentArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrialComponentArgs Empty = new TrialComponentArgs();

    /**
     * ARM resource ID of the code asset.
     * 
     */
    @InputImport(name="codeId")
      private final @Nullable Input<String> codeId;

    public Input<String> getCodeId() {
        return this.codeId == null ? Input.empty() : this.codeId;
    }

    /**
     * The command to execute on startup of the job. eg. "python train.py"
     * 
     */
    @InputImport(name="command", required=true)
      private final Input<String> command;

    public Input<String> getCommand() {
        return this.command;
    }

    /**
     * Distribution configuration of the job. If set, this should be one of Mpi, Tensorflow, PyTorch, or null.
     * 
     */
    @InputImport(name="distribution")
      private final @Nullable Input<Object> distribution;

    public Input<Object> getDistribution() {
        return this.distribution == null ? Input.empty() : this.distribution;
    }

    /**
     * The ARM resource ID of the Environment specification for the job.
     * 
     */
    @InputImport(name="environmentId")
      private final @Nullable Input<String> environmentId;

    public Input<String> getEnvironmentId() {
        return this.environmentId == null ? Input.empty() : this.environmentId;
    }

    /**
     * Environment variables included in the job.
     * 
     */
    @InputImport(name="environmentVariables")
      private final @Nullable Input<Map<String,String>> environmentVariables;

    public Input<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    /**
     * Mapping of input data bindings used in the job.
     * 
     */
    @InputImport(name="inputDataBindings")
      private final @Nullable Input<Map<String,InputDataBindingArgs>> inputDataBindings;

    public Input<Map<String,InputDataBindingArgs>> getInputDataBindings() {
        return this.inputDataBindings == null ? Input.empty() : this.inputDataBindings;
    }

    /**
     * Mapping of output data bindings used in the job.
     * 
     */
    @InputImport(name="outputDataBindings")
      private final @Nullable Input<Map<String,OutputDataBindingArgs>> outputDataBindings;

    public Input<Map<String,OutputDataBindingArgs>> getOutputDataBindings() {
        return this.outputDataBindings == null ? Input.empty() : this.outputDataBindings;
    }

    /**
     * The max run duration in ISO 8601 format, after which the trial component will be cancelled.
     * Only supports duration with precision as low as Seconds.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Input<String> timeout;

    public Input<String> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    public TrialComponentArgs(
        @Nullable Input<String> codeId,
        Input<String> command,
        @Nullable Input<Object> distribution,
        @Nullable Input<String> environmentId,
        @Nullable Input<Map<String,String>> environmentVariables,
        @Nullable Input<Map<String,InputDataBindingArgs>> inputDataBindings,
        @Nullable Input<Map<String,OutputDataBindingArgs>> outputDataBindings,
        @Nullable Input<String> timeout) {
        this.codeId = codeId;
        this.command = Objects.requireNonNull(command, "expected parameter 'command' to be non-null");
        this.distribution = distribution;
        this.environmentId = environmentId;
        this.environmentVariables = environmentVariables;
        this.inputDataBindings = inputDataBindings;
        this.outputDataBindings = outputDataBindings;
        this.timeout = timeout;
    }

    private TrialComponentArgs() {
        this.codeId = Input.empty();
        this.command = Input.empty();
        this.distribution = Input.empty();
        this.environmentId = Input.empty();
        this.environmentVariables = Input.empty();
        this.inputDataBindings = Input.empty();
        this.outputDataBindings = Input.empty();
        this.timeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrialComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> codeId;
        private Input<String> command;
        private @Nullable Input<Object> distribution;
        private @Nullable Input<String> environmentId;
        private @Nullable Input<Map<String,String>> environmentVariables;
        private @Nullable Input<Map<String,InputDataBindingArgs>> inputDataBindings;
        private @Nullable Input<Map<String,OutputDataBindingArgs>> outputDataBindings;
        private @Nullable Input<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(TrialComponentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeId = defaults.codeId;
    	      this.command = defaults.command;
    	      this.distribution = defaults.distribution;
    	      this.environmentId = defaults.environmentId;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.inputDataBindings = defaults.inputDataBindings;
    	      this.outputDataBindings = defaults.outputDataBindings;
    	      this.timeout = defaults.timeout;
        }

        public Builder codeId(@Nullable Input<String> codeId) {
            this.codeId = codeId;
            return this;
        }

        public Builder codeId(@Nullable String codeId) {
            this.codeId = Input.ofNullable(codeId);
            return this;
        }

        public Builder command(Input<String> command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }

        public Builder command(String command) {
            this.command = Input.of(Objects.requireNonNull(command));
            return this;
        }

        public Builder distribution(@Nullable Input<Object> distribution) {
            this.distribution = distribution;
            return this;
        }

        public Builder distribution(@Nullable Object distribution) {
            this.distribution = Input.ofNullable(distribution);
            return this;
        }

        public Builder environmentId(@Nullable Input<String> environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(@Nullable String environmentId) {
            this.environmentId = Input.ofNullable(environmentId);
            return this;
        }

        public Builder environmentVariables(@Nullable Input<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder inputDataBindings(@Nullable Input<Map<String,InputDataBindingArgs>> inputDataBindings) {
            this.inputDataBindings = inputDataBindings;
            return this;
        }

        public Builder inputDataBindings(@Nullable Map<String,InputDataBindingArgs> inputDataBindings) {
            this.inputDataBindings = Input.ofNullable(inputDataBindings);
            return this;
        }

        public Builder outputDataBindings(@Nullable Input<Map<String,OutputDataBindingArgs>> outputDataBindings) {
            this.outputDataBindings = outputDataBindings;
            return this;
        }

        public Builder outputDataBindings(@Nullable Map<String,OutputDataBindingArgs> outputDataBindings) {
            this.outputDataBindings = Input.ofNullable(outputDataBindings);
            return this;
        }

        public Builder timeout(@Nullable Input<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable String timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }
        public TrialComponentArgs build() {
            return new TrialComponentArgs(codeId, command, distribution, environmentId, environmentVariables, inputDataBindings, outputDataBindings, timeout);
        }
    }
}
