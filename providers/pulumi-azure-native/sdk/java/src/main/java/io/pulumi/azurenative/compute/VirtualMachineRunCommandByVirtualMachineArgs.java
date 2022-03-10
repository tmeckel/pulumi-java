// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.compute.inputs.RunCommandInputParameterArgs;
import io.pulumi.azurenative.compute.inputs.VirtualMachineRunCommandScriptSourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMachineRunCommandByVirtualMachineArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineRunCommandByVirtualMachineArgs Empty = new VirtualMachineRunCommandByVirtualMachineArgs();

    /**
     * Optional. If set to true, provisioning will complete as soon as the script starts and will not wait for script to complete.
     * 
     */
    @InputImport(name="asyncExecution")
      private final @Nullable Input<Boolean> asyncExecution;

    public Input<Boolean> getAsyncExecution() {
        return this.asyncExecution == null ? Input.empty() : this.asyncExecution;
    }

    /**
     * Specifies the Azure storage blob where script error stream will be uploaded.
     * 
     */
    @InputImport(name="errorBlobUri")
      private final @Nullable Input<String> errorBlobUri;

    public Input<String> getErrorBlobUri() {
        return this.errorBlobUri == null ? Input.empty() : this.errorBlobUri;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Specifies the Azure storage blob where script output stream will be uploaded.
     * 
     */
    @InputImport(name="outputBlobUri")
      private final @Nullable Input<String> outputBlobUri;

    public Input<String> getOutputBlobUri() {
        return this.outputBlobUri == null ? Input.empty() : this.outputBlobUri;
    }

    /**
     * The parameters used by the script.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<List<RunCommandInputParameterArgs>> parameters;

    public Input<List<RunCommandInputParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * The parameters used by the script.
     * 
     */
    @InputImport(name="protectedParameters")
      private final @Nullable Input<List<RunCommandInputParameterArgs>> protectedParameters;

    public Input<List<RunCommandInputParameterArgs>> getProtectedParameters() {
        return this.protectedParameters == null ? Input.empty() : this.protectedParameters;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the user account password on the VM when executing the run command.
     * 
     */
    @InputImport(name="runAsPassword")
      private final @Nullable Input<String> runAsPassword;

    public Input<String> getRunAsPassword() {
        return this.runAsPassword == null ? Input.empty() : this.runAsPassword;
    }

    /**
     * Specifies the user account on the VM when executing the run command.
     * 
     */
    @InputImport(name="runAsUser")
      private final @Nullable Input<String> runAsUser;

    public Input<String> getRunAsUser() {
        return this.runAsUser == null ? Input.empty() : this.runAsUser;
    }

    /**
     * The name of the virtual machine run command.
     * 
     */
    @InputImport(name="runCommandName")
      private final @Nullable Input<String> runCommandName;

    public Input<String> getRunCommandName() {
        return this.runCommandName == null ? Input.empty() : this.runCommandName;
    }

    /**
     * The source of the run command script.
     * 
     */
    @InputImport(name="source")
      private final @Nullable Input<VirtualMachineRunCommandScriptSourceArgs> source;

    public Input<VirtualMachineRunCommandScriptSourceArgs> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The timeout in seconds to execute the run command.
     * 
     */
    @InputImport(name="timeoutInSeconds")
      private final @Nullable Input<Integer> timeoutInSeconds;

    public Input<Integer> getTimeoutInSeconds() {
        return this.timeoutInSeconds == null ? Input.empty() : this.timeoutInSeconds;
    }

    /**
     * The name of the virtual machine where the run command should be created or updated.
     * 
     */
    @InputImport(name="vmName", required=true)
      private final Input<String> vmName;

    public Input<String> getVmName() {
        return this.vmName;
    }

    public VirtualMachineRunCommandByVirtualMachineArgs(
        @Nullable Input<Boolean> asyncExecution,
        @Nullable Input<String> errorBlobUri,
        @Nullable Input<String> location,
        @Nullable Input<String> outputBlobUri,
        @Nullable Input<List<RunCommandInputParameterArgs>> parameters,
        @Nullable Input<List<RunCommandInputParameterArgs>> protectedParameters,
        Input<String> resourceGroupName,
        @Nullable Input<String> runAsPassword,
        @Nullable Input<String> runAsUser,
        @Nullable Input<String> runCommandName,
        @Nullable Input<VirtualMachineRunCommandScriptSourceArgs> source,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Integer> timeoutInSeconds,
        Input<String> vmName) {
        this.asyncExecution = asyncExecution == null ? Input.ofNullable(false) : asyncExecution;
        this.errorBlobUri = errorBlobUri;
        this.location = location;
        this.outputBlobUri = outputBlobUri;
        this.parameters = parameters;
        this.protectedParameters = protectedParameters;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.runAsPassword = runAsPassword;
        this.runAsUser = runAsUser;
        this.runCommandName = runCommandName;
        this.source = source;
        this.tags = tags;
        this.timeoutInSeconds = timeoutInSeconds;
        this.vmName = Objects.requireNonNull(vmName, "expected parameter 'vmName' to be non-null");
    }

    private VirtualMachineRunCommandByVirtualMachineArgs() {
        this.asyncExecution = Input.empty();
        this.errorBlobUri = Input.empty();
        this.location = Input.empty();
        this.outputBlobUri = Input.empty();
        this.parameters = Input.empty();
        this.protectedParameters = Input.empty();
        this.resourceGroupName = Input.empty();
        this.runAsPassword = Input.empty();
        this.runAsUser = Input.empty();
        this.runCommandName = Input.empty();
        this.source = Input.empty();
        this.tags = Input.empty();
        this.timeoutInSeconds = Input.empty();
        this.vmName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineRunCommandByVirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> asyncExecution;
        private @Nullable Input<String> errorBlobUri;
        private @Nullable Input<String> location;
        private @Nullable Input<String> outputBlobUri;
        private @Nullable Input<List<RunCommandInputParameterArgs>> parameters;
        private @Nullable Input<List<RunCommandInputParameterArgs>> protectedParameters;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> runAsPassword;
        private @Nullable Input<String> runAsUser;
        private @Nullable Input<String> runCommandName;
        private @Nullable Input<VirtualMachineRunCommandScriptSourceArgs> source;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Integer> timeoutInSeconds;
        private Input<String> vmName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineRunCommandByVirtualMachineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asyncExecution = defaults.asyncExecution;
    	      this.errorBlobUri = defaults.errorBlobUri;
    	      this.location = defaults.location;
    	      this.outputBlobUri = defaults.outputBlobUri;
    	      this.parameters = defaults.parameters;
    	      this.protectedParameters = defaults.protectedParameters;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.runAsPassword = defaults.runAsPassword;
    	      this.runAsUser = defaults.runAsUser;
    	      this.runCommandName = defaults.runCommandName;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.vmName = defaults.vmName;
        }

        public Builder asyncExecution(@Nullable Input<Boolean> asyncExecution) {
            this.asyncExecution = asyncExecution;
            return this;
        }

        public Builder asyncExecution(@Nullable Boolean asyncExecution) {
            this.asyncExecution = Input.ofNullable(asyncExecution);
            return this;
        }

        public Builder errorBlobUri(@Nullable Input<String> errorBlobUri) {
            this.errorBlobUri = errorBlobUri;
            return this;
        }

        public Builder errorBlobUri(@Nullable String errorBlobUri) {
            this.errorBlobUri = Input.ofNullable(errorBlobUri);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder outputBlobUri(@Nullable Input<String> outputBlobUri) {
            this.outputBlobUri = outputBlobUri;
            return this;
        }

        public Builder outputBlobUri(@Nullable String outputBlobUri) {
            this.outputBlobUri = Input.ofNullable(outputBlobUri);
            return this;
        }

        public Builder parameters(@Nullable Input<List<RunCommandInputParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable List<RunCommandInputParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder protectedParameters(@Nullable Input<List<RunCommandInputParameterArgs>> protectedParameters) {
            this.protectedParameters = protectedParameters;
            return this;
        }

        public Builder protectedParameters(@Nullable List<RunCommandInputParameterArgs> protectedParameters) {
            this.protectedParameters = Input.ofNullable(protectedParameters);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder runAsPassword(@Nullable Input<String> runAsPassword) {
            this.runAsPassword = runAsPassword;
            return this;
        }

        public Builder runAsPassword(@Nullable String runAsPassword) {
            this.runAsPassword = Input.ofNullable(runAsPassword);
            return this;
        }

        public Builder runAsUser(@Nullable Input<String> runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }

        public Builder runAsUser(@Nullable String runAsUser) {
            this.runAsUser = Input.ofNullable(runAsUser);
            return this;
        }

        public Builder runCommandName(@Nullable Input<String> runCommandName) {
            this.runCommandName = runCommandName;
            return this;
        }

        public Builder runCommandName(@Nullable String runCommandName) {
            this.runCommandName = Input.ofNullable(runCommandName);
            return this;
        }

        public Builder source(@Nullable Input<VirtualMachineRunCommandScriptSourceArgs> source) {
            this.source = source;
            return this;
        }

        public Builder source(@Nullable VirtualMachineRunCommandScriptSourceArgs source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder timeoutInSeconds(@Nullable Input<Integer> timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public Builder timeoutInSeconds(@Nullable Integer timeoutInSeconds) {
            this.timeoutInSeconds = Input.ofNullable(timeoutInSeconds);
            return this;
        }

        public Builder vmName(Input<String> vmName) {
            this.vmName = Objects.requireNonNull(vmName);
            return this;
        }

        public Builder vmName(String vmName) {
            this.vmName = Input.of(Objects.requireNonNull(vmName));
            return this;
        }
        public VirtualMachineRunCommandByVirtualMachineArgs build() {
            return new VirtualMachineRunCommandByVirtualMachineArgs(asyncExecution, errorBlobUri, location, outputBlobUri, parameters, protectedParameters, resourceGroupName, runAsPassword, runAsUser, runCommandName, source, tags, timeoutInSeconds, vmName);
        }
    }
}
