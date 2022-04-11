// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetNetworkConfigurationArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetPlacementConstraintArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventTargetEcsTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventTargetEcsTargetArgs Empty = new EventTargetEcsTargetArgs();

    /**
     * Specifies whether to enable Amazon ECS managed tags for the task.
     * 
     */
    @Import(name="enableEcsManagedTags")
      private final @Nullable Output<Boolean> enableEcsManagedTags;

    public Output<Boolean> getEnableEcsManagedTags() {
        return this.enableEcsManagedTags == null ? Codegen.empty() : this.enableEcsManagedTags;
    }

    /**
     * Whether or not to enable the execute command functionality for the containers in this task. If true, this enables execute command functionality on all containers in the task.
     * 
     */
    @Import(name="enableExecuteCommand")
      private final @Nullable Output<Boolean> enableExecuteCommand;

    public Output<Boolean> getEnableExecuteCommand() {
        return this.enableExecuteCommand == null ? Codegen.empty() : this.enableExecuteCommand;
    }

    /**
     * Specifies an ECS task group for the task. The maximum length is 255 characters.
     * 
     */
    @Import(name="group")
      private final @Nullable Output<String> group;

    public Output<String> getGroup() {
        return this.group == null ? Codegen.empty() : this.group;
    }

    /**
     * Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. Valid values include: an empty string `""` (to specify no launch type), `EC2`, or `FARGATE`.
     * 
     */
    @Import(name="launchType")
      private final @Nullable Output<String> launchType;

    public Output<String> getLaunchType() {
        return this.launchType == null ? Codegen.empty() : this.launchType;
    }

    /**
     * Use this if the ECS task uses the awsvpc network mode. This specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. Required if launch_type is FARGATE because the awsvpc mode is required for Fargate tasks.
     * 
     */
    @Import(name="networkConfiguration")
      private final @Nullable Output<EventTargetEcsTargetNetworkConfigurationArgs> networkConfiguration;

    public Output<EventTargetEcsTargetNetworkConfigurationArgs> getNetworkConfiguration() {
        return this.networkConfiguration == null ? Codegen.empty() : this.networkConfiguration;
    }

    /**
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task (including constraints in the task definition and those specified at runtime). See Below.
     * 
     */
    @Import(name="placementConstraints")
      private final @Nullable Output<List<EventTargetEcsTargetPlacementConstraintArgs>> placementConstraints;

    public Output<List<EventTargetEcsTargetPlacementConstraintArgs>> getPlacementConstraints() {
        return this.placementConstraints == null ? Codegen.empty() : this.placementConstraints;
    }

    /**
     * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0. This is used only if LaunchType is FARGATE. For more information about valid platform versions, see [AWS Fargate Platform Versions](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     * 
     */
    @Import(name="platformVersion")
      private final @Nullable Output<String> platformVersion;

    public Output<String> getPlatformVersion() {
        return this.platformVersion == null ? Codegen.empty() : this.platformVersion;
    }

    /**
     * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags are not propagated. Tags can only be propagated to the task during task creation.
     * 
     */
    @Import(name="propagateTags")
      private final @Nullable Output<String> propagateTags;

    public Output<String> getPropagateTags() {
        return this.propagateTags == null ? Codegen.empty() : this.propagateTags;
    }

    /**
     * A map of tags to assign to ecs resources.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The number of tasks to create based on the TaskDefinition. The default is 1.
     * 
     */
    @Import(name="taskCount")
      private final @Nullable Output<Integer> taskCount;

    public Output<Integer> getTaskCount() {
        return this.taskCount == null ? Codegen.empty() : this.taskCount;
    }

    /**
     * The ARN of the task definition to use if the event target is an Amazon ECS cluster.
     * 
     */
    @Import(name="taskDefinitionArn", required=true)
      private final Output<String> taskDefinitionArn;

    public Output<String> getTaskDefinitionArn() {
        return this.taskDefinitionArn;
    }

    public EventTargetEcsTargetArgs(
        @Nullable Output<Boolean> enableEcsManagedTags,
        @Nullable Output<Boolean> enableExecuteCommand,
        @Nullable Output<String> group,
        @Nullable Output<String> launchType,
        @Nullable Output<EventTargetEcsTargetNetworkConfigurationArgs> networkConfiguration,
        @Nullable Output<List<EventTargetEcsTargetPlacementConstraintArgs>> placementConstraints,
        @Nullable Output<String> platformVersion,
        @Nullable Output<String> propagateTags,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Integer> taskCount,
        Output<String> taskDefinitionArn) {
        this.enableEcsManagedTags = enableEcsManagedTags;
        this.enableExecuteCommand = enableExecuteCommand;
        this.group = group;
        this.launchType = launchType;
        this.networkConfiguration = networkConfiguration;
        this.placementConstraints = placementConstraints;
        this.platformVersion = platformVersion;
        this.propagateTags = propagateTags;
        this.tags = tags;
        this.taskCount = taskCount;
        this.taskDefinitionArn = Objects.requireNonNull(taskDefinitionArn, "expected parameter 'taskDefinitionArn' to be non-null");
    }

    private EventTargetEcsTargetArgs() {
        this.enableEcsManagedTags = Codegen.empty();
        this.enableExecuteCommand = Codegen.empty();
        this.group = Codegen.empty();
        this.launchType = Codegen.empty();
        this.networkConfiguration = Codegen.empty();
        this.placementConstraints = Codegen.empty();
        this.platformVersion = Codegen.empty();
        this.propagateTags = Codegen.empty();
        this.tags = Codegen.empty();
        this.taskCount = Codegen.empty();
        this.taskDefinitionArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetEcsTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableEcsManagedTags;
        private @Nullable Output<Boolean> enableExecuteCommand;
        private @Nullable Output<String> group;
        private @Nullable Output<String> launchType;
        private @Nullable Output<EventTargetEcsTargetNetworkConfigurationArgs> networkConfiguration;
        private @Nullable Output<List<EventTargetEcsTargetPlacementConstraintArgs>> placementConstraints;
        private @Nullable Output<String> platformVersion;
        private @Nullable Output<String> propagateTags;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Integer> taskCount;
        private Output<String> taskDefinitionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetEcsTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableEcsManagedTags = defaults.enableEcsManagedTags;
    	      this.enableExecuteCommand = defaults.enableExecuteCommand;
    	      this.group = defaults.group;
    	      this.launchType = defaults.launchType;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.placementConstraints = defaults.placementConstraints;
    	      this.platformVersion = defaults.platformVersion;
    	      this.propagateTags = defaults.propagateTags;
    	      this.tags = defaults.tags;
    	      this.taskCount = defaults.taskCount;
    	      this.taskDefinitionArn = defaults.taskDefinitionArn;
        }

        public Builder enableEcsManagedTags(@Nullable Output<Boolean> enableEcsManagedTags) {
            this.enableEcsManagedTags = enableEcsManagedTags;
            return this;
        }
        public Builder enableEcsManagedTags(@Nullable Boolean enableEcsManagedTags) {
            this.enableEcsManagedTags = Codegen.ofNullable(enableEcsManagedTags);
            return this;
        }
        public Builder enableExecuteCommand(@Nullable Output<Boolean> enableExecuteCommand) {
            this.enableExecuteCommand = enableExecuteCommand;
            return this;
        }
        public Builder enableExecuteCommand(@Nullable Boolean enableExecuteCommand) {
            this.enableExecuteCommand = Codegen.ofNullable(enableExecuteCommand);
            return this;
        }
        public Builder group(@Nullable Output<String> group) {
            this.group = group;
            return this;
        }
        public Builder group(@Nullable String group) {
            this.group = Codegen.ofNullable(group);
            return this;
        }
        public Builder launchType(@Nullable Output<String> launchType) {
            this.launchType = launchType;
            return this;
        }
        public Builder launchType(@Nullable String launchType) {
            this.launchType = Codegen.ofNullable(launchType);
            return this;
        }
        public Builder networkConfiguration(@Nullable Output<EventTargetEcsTargetNetworkConfigurationArgs> networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public Builder networkConfiguration(@Nullable EventTargetEcsTargetNetworkConfigurationArgs networkConfiguration) {
            this.networkConfiguration = Codegen.ofNullable(networkConfiguration);
            return this;
        }
        public Builder placementConstraints(@Nullable Output<List<EventTargetEcsTargetPlacementConstraintArgs>> placementConstraints) {
            this.placementConstraints = placementConstraints;
            return this;
        }
        public Builder placementConstraints(@Nullable List<EventTargetEcsTargetPlacementConstraintArgs> placementConstraints) {
            this.placementConstraints = Codegen.ofNullable(placementConstraints);
            return this;
        }
        public Builder placementConstraints(EventTargetEcsTargetPlacementConstraintArgs... placementConstraints) {
            return placementConstraints(List.of(placementConstraints));
        }
        public Builder platformVersion(@Nullable Output<String> platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }
        public Builder platformVersion(@Nullable String platformVersion) {
            this.platformVersion = Codegen.ofNullable(platformVersion);
            return this;
        }
        public Builder propagateTags(@Nullable Output<String> propagateTags) {
            this.propagateTags = propagateTags;
            return this;
        }
        public Builder propagateTags(@Nullable String propagateTags) {
            this.propagateTags = Codegen.ofNullable(propagateTags);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder taskCount(@Nullable Output<Integer> taskCount) {
            this.taskCount = taskCount;
            return this;
        }
        public Builder taskCount(@Nullable Integer taskCount) {
            this.taskCount = Codegen.ofNullable(taskCount);
            return this;
        }
        public Builder taskDefinitionArn(Output<String> taskDefinitionArn) {
            this.taskDefinitionArn = Objects.requireNonNull(taskDefinitionArn);
            return this;
        }
        public Builder taskDefinitionArn(String taskDefinitionArn) {
            this.taskDefinitionArn = Output.of(Objects.requireNonNull(taskDefinitionArn));
            return this;
        }        public EventTargetEcsTargetArgs build() {
            return new EventTargetEcsTargetArgs(enableEcsManagedTags, enableExecuteCommand, group, launchType, networkConfiguration, placementConstraints, platformVersion, propagateTags, tags, taskCount, taskDefinitionArn);
        }
    }
}
