// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry;

import com.pulumi.azurenative.containerregistry.enums.TaskStatus;
import com.pulumi.azurenative.containerregistry.inputs.AgentPropertiesArgs;
import com.pulumi.azurenative.containerregistry.inputs.CredentialsArgs;
import com.pulumi.azurenative.containerregistry.inputs.DockerBuildStepArgs;
import com.pulumi.azurenative.containerregistry.inputs.EncodedTaskStepArgs;
import com.pulumi.azurenative.containerregistry.inputs.FileTaskStepArgs;
import com.pulumi.azurenative.containerregistry.inputs.IdentityPropertiesArgs;
import com.pulumi.azurenative.containerregistry.inputs.PlatformPropertiesArgs;
import com.pulumi.azurenative.containerregistry.inputs.TriggerPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskArgs Empty = new TaskArgs();

    /**
     * The machine configuration of the run agent.
     * 
     */
    @Import(name="agentConfiguration")
    private @Nullable Output<AgentPropertiesArgs> agentConfiguration;

    /**
     * @return The machine configuration of the run agent.
     * 
     */
    public Optional<Output<AgentPropertiesArgs>> agentConfiguration() {
        return Optional.ofNullable(this.agentConfiguration);
    }

    /**
     * The dedicated agent pool for the task.
     * 
     */
    @Import(name="agentPoolName")
    private @Nullable Output<String> agentPoolName;

    /**
     * @return The dedicated agent pool for the task.
     * 
     */
    public Optional<Output<String>> agentPoolName() {
        return Optional.ofNullable(this.agentPoolName);
    }

    /**
     * The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<CredentialsArgs> credentials;

    /**
     * @return The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    public Optional<Output<CredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * Identity for the resource.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<IdentityPropertiesArgs> identity;

    /**
     * @return Identity for the resource.
     * 
     */
    public Optional<Output<IdentityPropertiesArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The value of this property indicates whether the task resource is system task or not.
     * 
     */
    @Import(name="isSystemTask")
    private @Nullable Output<Boolean> isSystemTask;

    /**
     * @return The value of this property indicates whether the task resource is system task or not.
     * 
     */
    public Optional<Output<Boolean>> isSystemTask() {
        return Optional.ofNullable(this.isSystemTask);
    }

    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
     */
    @Import(name="logTemplate")
    private @Nullable Output<String> logTemplate;

    /**
     * @return The template that describes the repository and tag information for run log artifact.
     * 
     */
    public Optional<Output<String>> logTemplate() {
        return Optional.ofNullable(this.logTemplate);
    }

    /**
     * The platform properties against which the run has to happen.
     * 
     */
    @Import(name="platform")
    private @Nullable Output<PlatformPropertiesArgs> platform;

    /**
     * @return The platform properties against which the run has to happen.
     * 
     */
    public Optional<Output<PlatformPropertiesArgs>> platform() {
        return Optional.ofNullable(this.platform);
    }

    /**
     * The name of the container registry.
     * 
     */
    @Import(name="registryName", required=true)
    private Output<String> registryName;

    /**
     * @return The name of the container registry.
     * 
     */
    public Output<String> registryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group to which the container registry belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The current status of task.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,TaskStatus>> status;

    /**
     * @return The current status of task.
     * 
     */
    public Optional<Output<Either<String,TaskStatus>>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The properties of a task step.
     * 
     */
    @Import(name="step")
    private @Nullable Output<Object> step;

    /**
     * @return The properties of a task step.
     * 
     */
    public Optional<Output<Object>> step() {
        return Optional.ofNullable(this.step);
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The name of the container registry task.
     * 
     */
    @Import(name="taskName")
    private @Nullable Output<String> taskName;

    /**
     * @return The name of the container registry task.
     * 
     */
    public Optional<Output<String>> taskName() {
        return Optional.ofNullable(this.taskName);
    }

    /**
     * Run timeout in seconds.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return Run timeout in seconds.
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The properties that describe all triggers for the task.
     * 
     */
    @Import(name="trigger")
    private @Nullable Output<TriggerPropertiesArgs> trigger;

    /**
     * @return The properties that describe all triggers for the task.
     * 
     */
    public Optional<Output<TriggerPropertiesArgs>> trigger() {
        return Optional.ofNullable(this.trigger);
    }

    private TaskArgs() {}

    private TaskArgs(TaskArgs $) {
        this.agentConfiguration = $.agentConfiguration;
        this.agentPoolName = $.agentPoolName;
        this.credentials = $.credentials;
        this.identity = $.identity;
        this.isSystemTask = $.isSystemTask;
        this.location = $.location;
        this.logTemplate = $.logTemplate;
        this.platform = $.platform;
        this.registryName = $.registryName;
        this.resourceGroupName = $.resourceGroupName;
        this.status = $.status;
        this.step = $.step;
        this.tags = $.tags;
        this.taskName = $.taskName;
        this.timeout = $.timeout;
        this.trigger = $.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskArgs $;

        public Builder() {
            $ = new TaskArgs();
        }

        public Builder(TaskArgs defaults) {
            $ = new TaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentConfiguration The machine configuration of the run agent.
         * 
         * @return builder
         * 
         */
        public Builder agentConfiguration(@Nullable Output<AgentPropertiesArgs> agentConfiguration) {
            $.agentConfiguration = agentConfiguration;
            return this;
        }

        /**
         * @param agentConfiguration The machine configuration of the run agent.
         * 
         * @return builder
         * 
         */
        public Builder agentConfiguration(AgentPropertiesArgs agentConfiguration) {
            return agentConfiguration(Output.of(agentConfiguration));
        }

        /**
         * @param agentPoolName The dedicated agent pool for the task.
         * 
         * @return builder
         * 
         */
        public Builder agentPoolName(@Nullable Output<String> agentPoolName) {
            $.agentPoolName = agentPoolName;
            return this;
        }

        /**
         * @param agentPoolName The dedicated agent pool for the task.
         * 
         * @return builder
         * 
         */
        public Builder agentPoolName(String agentPoolName) {
            return agentPoolName(Output.of(agentPoolName));
        }

        /**
         * @param credentials The properties that describes a set of credentials that will be used when this run is invoked.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<CredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The properties that describes a set of credentials that will be used when this run is invoked.
         * 
         * @return builder
         * 
         */
        public Builder credentials(CredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param identity Identity for the resource.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<IdentityPropertiesArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity Identity for the resource.
         * 
         * @return builder
         * 
         */
        public Builder identity(IdentityPropertiesArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param isSystemTask The value of this property indicates whether the task resource is system task or not.
         * 
         * @return builder
         * 
         */
        public Builder isSystemTask(@Nullable Output<Boolean> isSystemTask) {
            $.isSystemTask = isSystemTask;
            return this;
        }

        /**
         * @param isSystemTask The value of this property indicates whether the task resource is system task or not.
         * 
         * @return builder
         * 
         */
        public Builder isSystemTask(Boolean isSystemTask) {
            return isSystemTask(Output.of(isSystemTask));
        }

        /**
         * @param location The location of the resource. This cannot be changed after the resource is created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the resource. This cannot be changed after the resource is created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param logTemplate The template that describes the repository and tag information for run log artifact.
         * 
         * @return builder
         * 
         */
        public Builder logTemplate(@Nullable Output<String> logTemplate) {
            $.logTemplate = logTemplate;
            return this;
        }

        /**
         * @param logTemplate The template that describes the repository and tag information for run log artifact.
         * 
         * @return builder
         * 
         */
        public Builder logTemplate(String logTemplate) {
            return logTemplate(Output.of(logTemplate));
        }

        /**
         * @param platform The platform properties against which the run has to happen.
         * 
         * @return builder
         * 
         */
        public Builder platform(@Nullable Output<PlatformPropertiesArgs> platform) {
            $.platform = platform;
            return this;
        }

        /**
         * @param platform The platform properties against which the run has to happen.
         * 
         * @return builder
         * 
         */
        public Builder platform(PlatformPropertiesArgs platform) {
            return platform(Output.of(platform));
        }

        /**
         * @param registryName The name of the container registry.
         * 
         * @return builder
         * 
         */
        public Builder registryName(Output<String> registryName) {
            $.registryName = registryName;
            return this;
        }

        /**
         * @param registryName The name of the container registry.
         * 
         * @return builder
         * 
         */
        public Builder registryName(String registryName) {
            return registryName(Output.of(registryName));
        }

        /**
         * @param resourceGroupName The name of the resource group to which the container registry belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group to which the container registry belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param status The current status of task.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Either<String,TaskStatus>> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The current status of task.
         * 
         * @return builder
         * 
         */
        public Builder status(Either<String,TaskStatus> status) {
            return status(Output.of(status));
        }

        /**
         * @param status The current status of task.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        /**
         * @param status The current status of task.
         * 
         * @return builder
         * 
         */
        public Builder status(TaskStatus status) {
            return status(Either.ofRight(status));
        }

        /**
         * @param step The properties of a task step.
         * 
         * @return builder
         * 
         */
        public Builder step(@Nullable Output<Object> step) {
            $.step = step;
            return this;
        }

        /**
         * @param step The properties of a task step.
         * 
         * @return builder
         * 
         */
        public Builder step(Object step) {
            return step(Output.of(step));
        }

        /**
         * @param tags The tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param taskName The name of the container registry task.
         * 
         * @return builder
         * 
         */
        public Builder taskName(@Nullable Output<String> taskName) {
            $.taskName = taskName;
            return this;
        }

        /**
         * @param taskName The name of the container registry task.
         * 
         * @return builder
         * 
         */
        public Builder taskName(String taskName) {
            return taskName(Output.of(taskName));
        }

        /**
         * @param timeout Run timeout in seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Run timeout in seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param trigger The properties that describe all triggers for the task.
         * 
         * @return builder
         * 
         */
        public Builder trigger(@Nullable Output<TriggerPropertiesArgs> trigger) {
            $.trigger = trigger;
            return this;
        }

        /**
         * @param trigger The properties that describe all triggers for the task.
         * 
         * @return builder
         * 
         */
        public Builder trigger(TriggerPropertiesArgs trigger) {
            return trigger(Output.of(trigger));
        }

        public TaskArgs build() {
            $.isSystemTask = Codegen.booleanProp("isSystemTask").output().arg($.isSystemTask).def(false).getNullable();
            $.registryName = Objects.requireNonNull($.registryName, "expected parameter 'registryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.timeout = Codegen.integerProp("timeout").output().arg($.timeout).def(3600).getNullable();
            return $;
        }
    }

}
