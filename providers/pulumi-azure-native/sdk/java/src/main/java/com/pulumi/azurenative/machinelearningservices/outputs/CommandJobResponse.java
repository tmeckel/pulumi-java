// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.azurenative.machinelearningservices.outputs.AmlTokenResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.ComputeConfigurationResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.InputDataBindingResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.JobEndpointResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.JobOutputResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.ManagedIdentityResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.MpiResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.OutputDataBindingResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.PyTorchResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.TensorFlowResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CommandJobResponse {
    /**
     * @return ARM resource ID of the code asset.
     * 
     */
    private final @Nullable String codeId;
    /**
     * @return The command to execute on startup of the job. eg. &#34;python train.py&#34;
     * 
     */
    private final String command;
    /**
     * @return Compute binding for the job.
     * 
     */
    private final ComputeConfigurationResponse compute;
    /**
     * @return The asset description text.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Distribution configuration of the job. If set, this should be one of Mpi, Tensorflow, PyTorch, or null.
     * 
     */
    private final @Nullable Object distribution;
    /**
     * @return The ARM resource ID of the Environment specification for the job.
     * 
     */
    private final @Nullable String environmentId;
    /**
     * @return Environment variables included in the job.
     * 
     */
    private final @Nullable Map<String,String> environmentVariables;
    /**
     * @return The name of the experiment the job belongs to. If not set, the job is placed in the &#34;Default&#34; experiment.
     * 
     */
    private final @Nullable String experimentName;
    /**
     * @return Identity configuration. If set, this should be one of AmlToken, ManagedIdentity, or null.
     * Defaults to AmlToken if null.
     * 
     */
    private final @Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity;
    /**
     * @return Mapping of input data bindings used in the job.
     * 
     */
    private final @Nullable Map<String,InputDataBindingResponse> inputDataBindings;
    /**
     * @return List of JobEndpoints.
     * For local jobs, a job endpoint will have an endpoint value of FileStreamObject.
     * 
     */
    private final Map<String,JobEndpointResponse> interactionEndpoints;
    /**
     * @return Enum to determine the type of job.
     * Expected value is &#39;Command&#39;.
     * 
     */
    private final String jobType;
    /**
     * @return Location of the job output logs and artifacts.
     * 
     */
    private final JobOutputResponse output;
    /**
     * @return Mapping of output data bindings used in the job.
     * 
     */
    private final @Nullable Map<String,OutputDataBindingResponse> outputDataBindings;
    /**
     * @return Input parameters.
     * 
     */
    private final Object parameters;
    /**
     * @return Job priority for scheduling policy. Only applies to AMLCompute.
     * Private preview feature and only available to users on the allow list.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * @return The asset property dictionary.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * @return Specifies the job provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * @return Status of the job.
     * 
     */
    private final String status;
    /**
     * @return Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The max run duration in ISO 8601 format, after which the job will be cancelled. Only supports duration with precision as low as Seconds.
     * 
     */
    private final @Nullable String timeout;

    @CustomType.Constructor
    private CommandJobResponse(
        @CustomType.Parameter("codeId") @Nullable String codeId,
        @CustomType.Parameter("command") String command,
        @CustomType.Parameter("compute") ComputeConfigurationResponse compute,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("distribution") @Nullable Object distribution,
        @CustomType.Parameter("environmentId") @Nullable String environmentId,
        @CustomType.Parameter("environmentVariables") @Nullable Map<String,String> environmentVariables,
        @CustomType.Parameter("experimentName") @Nullable String experimentName,
        @CustomType.Parameter("identity") @Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity,
        @CustomType.Parameter("inputDataBindings") @Nullable Map<String,InputDataBindingResponse> inputDataBindings,
        @CustomType.Parameter("interactionEndpoints") Map<String,JobEndpointResponse> interactionEndpoints,
        @CustomType.Parameter("jobType") String jobType,
        @CustomType.Parameter("output") JobOutputResponse output,
        @CustomType.Parameter("outputDataBindings") @Nullable Map<String,OutputDataBindingResponse> outputDataBindings,
        @CustomType.Parameter("parameters") Object parameters,
        @CustomType.Parameter("priority") @Nullable Integer priority,
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("timeout") @Nullable String timeout) {
        this.codeId = codeId;
        this.command = command;
        this.compute = compute;
        this.description = description;
        this.distribution = distribution;
        this.environmentId = environmentId;
        this.environmentVariables = environmentVariables;
        this.experimentName = experimentName;
        this.identity = identity;
        this.inputDataBindings = inputDataBindings;
        this.interactionEndpoints = interactionEndpoints;
        this.jobType = jobType;
        this.output = output;
        this.outputDataBindings = outputDataBindings;
        this.parameters = parameters;
        this.priority = priority;
        this.properties = properties;
        this.provisioningState = provisioningState;
        this.status = status;
        this.tags = tags;
        this.timeout = timeout;
    }

    /**
     * @return ARM resource ID of the code asset.
     * 
     */
    public Optional<String> codeId() {
        return Optional.ofNullable(this.codeId);
    }
    /**
     * @return The command to execute on startup of the job. eg. &#34;python train.py&#34;
     * 
     */
    public String command() {
        return this.command;
    }
    /**
     * @return Compute binding for the job.
     * 
     */
    public ComputeConfigurationResponse compute() {
        return this.compute;
    }
    /**
     * @return The asset description text.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Distribution configuration of the job. If set, this should be one of Mpi, Tensorflow, PyTorch, or null.
     * 
     */
    public Optional<Object> distribution() {
        return Optional.ofNullable(this.distribution);
    }
    /**
     * @return The ARM resource ID of the Environment specification for the job.
     * 
     */
    public Optional<String> environmentId() {
        return Optional.ofNullable(this.environmentId);
    }
    /**
     * @return Environment variables included in the job.
     * 
     */
    public Map<String,String> environmentVariables() {
        return this.environmentVariables == null ? Map.of() : this.environmentVariables;
    }
    /**
     * @return The name of the experiment the job belongs to. If not set, the job is placed in the &#34;Default&#34; experiment.
     * 
     */
    public Optional<String> experimentName() {
        return Optional.ofNullable(this.experimentName);
    }
    /**
     * @return Identity configuration. If set, this should be one of AmlToken, ManagedIdentity, or null.
     * Defaults to AmlToken if null.
     * 
     */
    public Optional<Either<AmlTokenResponse,ManagedIdentityResponse>> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return Mapping of input data bindings used in the job.
     * 
     */
    public Map<String,InputDataBindingResponse> inputDataBindings() {
        return this.inputDataBindings == null ? Map.of() : this.inputDataBindings;
    }
    /**
     * @return List of JobEndpoints.
     * For local jobs, a job endpoint will have an endpoint value of FileStreamObject.
     * 
     */
    public Map<String,JobEndpointResponse> interactionEndpoints() {
        return this.interactionEndpoints;
    }
    /**
     * @return Enum to determine the type of job.
     * Expected value is &#39;Command&#39;.
     * 
     */
    public String jobType() {
        return this.jobType;
    }
    /**
     * @return Location of the job output logs and artifacts.
     * 
     */
    public JobOutputResponse output() {
        return this.output;
    }
    /**
     * @return Mapping of output data bindings used in the job.
     * 
     */
    public Map<String,OutputDataBindingResponse> outputDataBindings() {
        return this.outputDataBindings == null ? Map.of() : this.outputDataBindings;
    }
    /**
     * @return Input parameters.
     * 
     */
    public Object parameters() {
        return this.parameters;
    }
    /**
     * @return Job priority for scheduling policy. Only applies to AMLCompute.
     * Private preview feature and only available to users on the allow list.
     * 
     */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return The asset property dictionary.
     * 
     */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * @return Specifies the job provisioning state.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Status of the job.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The max run duration in ISO 8601 format, after which the job will be cancelled. Only supports duration with precision as low as Seconds.
     * 
     */
    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommandJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String codeId;
        private String command;
        private ComputeConfigurationResponse compute;
        private @Nullable String description;
        private @Nullable Object distribution;
        private @Nullable String environmentId;
        private @Nullable Map<String,String> environmentVariables;
        private @Nullable String experimentName;
        private @Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity;
        private @Nullable Map<String,InputDataBindingResponse> inputDataBindings;
        private Map<String,JobEndpointResponse> interactionEndpoints;
        private String jobType;
        private JobOutputResponse output;
        private @Nullable Map<String,OutputDataBindingResponse> outputDataBindings;
        private Object parameters;
        private @Nullable Integer priority;
        private @Nullable Map<String,String> properties;
        private String provisioningState;
        private String status;
        private @Nullable Map<String,String> tags;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(CommandJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeId = defaults.codeId;
    	      this.command = defaults.command;
    	      this.compute = defaults.compute;
    	      this.description = defaults.description;
    	      this.distribution = defaults.distribution;
    	      this.environmentId = defaults.environmentId;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.experimentName = defaults.experimentName;
    	      this.identity = defaults.identity;
    	      this.inputDataBindings = defaults.inputDataBindings;
    	      this.interactionEndpoints = defaults.interactionEndpoints;
    	      this.jobType = defaults.jobType;
    	      this.output = defaults.output;
    	      this.outputDataBindings = defaults.outputDataBindings;
    	      this.parameters = defaults.parameters;
    	      this.priority = defaults.priority;
    	      this.properties = defaults.properties;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
        }

        public Builder codeId(@Nullable String codeId) {
            this.codeId = codeId;
            return this;
        }
        public Builder command(String command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }
        public Builder compute(ComputeConfigurationResponse compute) {
            this.compute = Objects.requireNonNull(compute);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder distribution(@Nullable Object distribution) {
            this.distribution = distribution;
            return this;
        }
        public Builder environmentId(@Nullable String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder experimentName(@Nullable String experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public Builder identity(@Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity) {
            this.identity = identity;
            return this;
        }
        public Builder inputDataBindings(@Nullable Map<String,InputDataBindingResponse> inputDataBindings) {
            this.inputDataBindings = inputDataBindings;
            return this;
        }
        public Builder interactionEndpoints(Map<String,JobEndpointResponse> interactionEndpoints) {
            this.interactionEndpoints = Objects.requireNonNull(interactionEndpoints);
            return this;
        }
        public Builder jobType(String jobType) {
            this.jobType = Objects.requireNonNull(jobType);
            return this;
        }
        public Builder output(JobOutputResponse output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }
        public Builder outputDataBindings(@Nullable Map<String,OutputDataBindingResponse> outputDataBindings) {
            this.outputDataBindings = outputDataBindings;
            return this;
        }
        public Builder parameters(Object parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }        public CommandJobResponse build() {
            return new CommandJobResponse(codeId, command, compute, description, distribution, environmentId, environmentVariables, experimentName, identity, inputDataBindings, interactionEndpoints, jobType, output, outputDataBindings, parameters, priority, properties, provisioningState, status, tags, timeout);
        }
    }
}
