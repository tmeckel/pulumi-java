// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.gamelift.inputs;

import com.pulumi.aws.gamelift.inputs.FleetEc2InboundPermissionGetArgs;
import com.pulumi.aws.gamelift.inputs.FleetResourceCreationLimitPolicyGetArgs;
import com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FleetState extends com.pulumi.resources.ResourceArgs {

    public static final FleetState Empty = new FleetState();

    /**
     * Fleet ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Fleet ARN.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * ID of the Gamelift Build to be deployed on the fleet.
     * 
     */
    @Import(name="buildId")
    private @Nullable Output<String> buildId;

    /**
     * @return ID of the Gamelift Build to be deployed on the fleet.
     * 
     */
    public Optional<Output<String>> buildId() {
        return Optional.ofNullable(this.buildId);
    }

    /**
     * Human-readable description of the fleet.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Human-readable description of the fleet.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
     * 
     */
    @Import(name="ec2InboundPermissions")
    private @Nullable Output<List<FleetEc2InboundPermissionGetArgs>> ec2InboundPermissions;

    /**
     * @return Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
     * 
     */
    public Optional<Output<List<FleetEc2InboundPermissionGetArgs>>> ec2InboundPermissions() {
        return Optional.ofNullable(this.ec2InboundPermissions);
    }

    /**
     * Name of an EC2 instance typeE.g., `t2.micro`
     * 
     */
    @Import(name="ec2InstanceType")
    private @Nullable Output<String> ec2InstanceType;

    /**
     * @return Name of an EC2 instance typeE.g., `t2.micro`
     * 
     */
    public Optional<Output<String>> ec2InstanceType() {
        return Optional.ofNullable(this.ec2InstanceType);
    }

    /**
     * Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
     * 
     */
    @Import(name="fleetType")
    private @Nullable Output<String> fleetType;

    /**
     * @return Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
     * 
     */
    public Optional<Output<String>> fleetType() {
        return Optional.ofNullable(this.fleetType);
    }

    /**
     * ARN of an IAM role that instances in the fleet can assume.
     * 
     */
    @Import(name="instanceRoleArn")
    private @Nullable Output<String> instanceRoleArn;

    /**
     * @return ARN of an IAM role that instances in the fleet can assume.
     * 
     */
    public Optional<Output<String>> instanceRoleArn() {
        return Optional.ofNullable(this.instanceRoleArn);
    }

    @Import(name="logPaths")
    private @Nullable Output<List<String>> logPaths;

    public Optional<Output<List<String>>> logPaths() {
        return Optional.ofNullable(this.logPaths);
    }

    /**
     * List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
     * 
     */
    @Import(name="metricGroups")
    private @Nullable Output<List<String>> metricGroups;

    /**
     * @return List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
     * 
     */
    public Optional<Output<List<String>>> metricGroups() {
        return Optional.ofNullable(this.metricGroups);
    }

    /**
     * The name of the fleet.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the fleet.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Game session protection policy to apply to all instances in this fleetE.g., `FullProtection`. Defaults to `NoProtection`.
     * 
     */
    @Import(name="newGameSessionProtectionPolicy")
    private @Nullable Output<String> newGameSessionProtectionPolicy;

    /**
     * @return Game session protection policy to apply to all instances in this fleetE.g., `FullProtection`. Defaults to `NoProtection`.
     * 
     */
    public Optional<Output<String>> newGameSessionProtectionPolicy() {
        return Optional.ofNullable(this.newGameSessionProtectionPolicy);
    }

    /**
     * Operating system of the fleet&#39;s computing resources.
     * 
     */
    @Import(name="operatingSystem")
    private @Nullable Output<String> operatingSystem;

    /**
     * @return Operating system of the fleet&#39;s computing resources.
     * 
     */
    public Optional<Output<String>> operatingSystem() {
        return Optional.ofNullable(this.operatingSystem);
    }

    /**
     * Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
     * 
     */
    @Import(name="resourceCreationLimitPolicy")
    private @Nullable Output<FleetResourceCreationLimitPolicyGetArgs> resourceCreationLimitPolicy;

    /**
     * @return Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
     * 
     */
    public Optional<Output<FleetResourceCreationLimitPolicyGetArgs>> resourceCreationLimitPolicy() {
        return Optional.ofNullable(this.resourceCreationLimitPolicy);
    }

    /**
     * Instructions for launching server processes on each instance in the fleet. See below.
     * 
     */
    @Import(name="runtimeConfiguration")
    private @Nullable Output<FleetRuntimeConfigurationGetArgs> runtimeConfiguration;

    /**
     * @return Instructions for launching server processes on each instance in the fleet. See below.
     * 
     */
    public Optional<Output<FleetRuntimeConfigurationGetArgs>> runtimeConfiguration() {
        return Optional.ofNullable(this.runtimeConfiguration);
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private FleetState() {}

    private FleetState(FleetState $) {
        this.arn = $.arn;
        this.buildId = $.buildId;
        this.description = $.description;
        this.ec2InboundPermissions = $.ec2InboundPermissions;
        this.ec2InstanceType = $.ec2InstanceType;
        this.fleetType = $.fleetType;
        this.instanceRoleArn = $.instanceRoleArn;
        this.logPaths = $.logPaths;
        this.metricGroups = $.metricGroups;
        this.name = $.name;
        this.newGameSessionProtectionPolicy = $.newGameSessionProtectionPolicy;
        this.operatingSystem = $.operatingSystem;
        this.resourceCreationLimitPolicy = $.resourceCreationLimitPolicy;
        this.runtimeConfiguration = $.runtimeConfiguration;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetState $;

        public Builder() {
            $ = new FleetState();
        }

        public Builder(FleetState defaults) {
            $ = new FleetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Fleet ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Fleet ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param buildId ID of the Gamelift Build to be deployed on the fleet.
         * 
         * @return builder
         * 
         */
        public Builder buildId(@Nullable Output<String> buildId) {
            $.buildId = buildId;
            return this;
        }

        /**
         * @param buildId ID of the Gamelift Build to be deployed on the fleet.
         * 
         * @return builder
         * 
         */
        public Builder buildId(String buildId) {
            return buildId(Output.of(buildId));
        }

        /**
         * @param description Human-readable description of the fleet.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Human-readable description of the fleet.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param ec2InboundPermissions Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
         * 
         * @return builder
         * 
         */
        public Builder ec2InboundPermissions(@Nullable Output<List<FleetEc2InboundPermissionGetArgs>> ec2InboundPermissions) {
            $.ec2InboundPermissions = ec2InboundPermissions;
            return this;
        }

        /**
         * @param ec2InboundPermissions Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
         * 
         * @return builder
         * 
         */
        public Builder ec2InboundPermissions(List<FleetEc2InboundPermissionGetArgs> ec2InboundPermissions) {
            return ec2InboundPermissions(Output.of(ec2InboundPermissions));
        }

        /**
         * @param ec2InboundPermissions Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
         * 
         * @return builder
         * 
         */
        public Builder ec2InboundPermissions(FleetEc2InboundPermissionGetArgs... ec2InboundPermissions) {
            return ec2InboundPermissions(List.of(ec2InboundPermissions));
        }

        /**
         * @param ec2InstanceType Name of an EC2 instance typeE.g., `t2.micro`
         * 
         * @return builder
         * 
         */
        public Builder ec2InstanceType(@Nullable Output<String> ec2InstanceType) {
            $.ec2InstanceType = ec2InstanceType;
            return this;
        }

        /**
         * @param ec2InstanceType Name of an EC2 instance typeE.g., `t2.micro`
         * 
         * @return builder
         * 
         */
        public Builder ec2InstanceType(String ec2InstanceType) {
            return ec2InstanceType(Output.of(ec2InstanceType));
        }

        /**
         * @param fleetType Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
         * 
         * @return builder
         * 
         */
        public Builder fleetType(@Nullable Output<String> fleetType) {
            $.fleetType = fleetType;
            return this;
        }

        /**
         * @param fleetType Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
         * 
         * @return builder
         * 
         */
        public Builder fleetType(String fleetType) {
            return fleetType(Output.of(fleetType));
        }

        /**
         * @param instanceRoleArn ARN of an IAM role that instances in the fleet can assume.
         * 
         * @return builder
         * 
         */
        public Builder instanceRoleArn(@Nullable Output<String> instanceRoleArn) {
            $.instanceRoleArn = instanceRoleArn;
            return this;
        }

        /**
         * @param instanceRoleArn ARN of an IAM role that instances in the fleet can assume.
         * 
         * @return builder
         * 
         */
        public Builder instanceRoleArn(String instanceRoleArn) {
            return instanceRoleArn(Output.of(instanceRoleArn));
        }

        public Builder logPaths(@Nullable Output<List<String>> logPaths) {
            $.logPaths = logPaths;
            return this;
        }

        public Builder logPaths(List<String> logPaths) {
            return logPaths(Output.of(logPaths));
        }

        public Builder logPaths(String... logPaths) {
            return logPaths(List.of(logPaths));
        }

        /**
         * @param metricGroups List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
         * 
         * @return builder
         * 
         */
        public Builder metricGroups(@Nullable Output<List<String>> metricGroups) {
            $.metricGroups = metricGroups;
            return this;
        }

        /**
         * @param metricGroups List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
         * 
         * @return builder
         * 
         */
        public Builder metricGroups(List<String> metricGroups) {
            return metricGroups(Output.of(metricGroups));
        }

        /**
         * @param metricGroups List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
         * 
         * @return builder
         * 
         */
        public Builder metricGroups(String... metricGroups) {
            return metricGroups(List.of(metricGroups));
        }

        /**
         * @param name The name of the fleet.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the fleet.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param newGameSessionProtectionPolicy Game session protection policy to apply to all instances in this fleetE.g., `FullProtection`. Defaults to `NoProtection`.
         * 
         * @return builder
         * 
         */
        public Builder newGameSessionProtectionPolicy(@Nullable Output<String> newGameSessionProtectionPolicy) {
            $.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy;
            return this;
        }

        /**
         * @param newGameSessionProtectionPolicy Game session protection policy to apply to all instances in this fleetE.g., `FullProtection`. Defaults to `NoProtection`.
         * 
         * @return builder
         * 
         */
        public Builder newGameSessionProtectionPolicy(String newGameSessionProtectionPolicy) {
            return newGameSessionProtectionPolicy(Output.of(newGameSessionProtectionPolicy));
        }

        /**
         * @param operatingSystem Operating system of the fleet&#39;s computing resources.
         * 
         * @return builder
         * 
         */
        public Builder operatingSystem(@Nullable Output<String> operatingSystem) {
            $.operatingSystem = operatingSystem;
            return this;
        }

        /**
         * @param operatingSystem Operating system of the fleet&#39;s computing resources.
         * 
         * @return builder
         * 
         */
        public Builder operatingSystem(String operatingSystem) {
            return operatingSystem(Output.of(operatingSystem));
        }

        /**
         * @param resourceCreationLimitPolicy Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
         * 
         * @return builder
         * 
         */
        public Builder resourceCreationLimitPolicy(@Nullable Output<FleetResourceCreationLimitPolicyGetArgs> resourceCreationLimitPolicy) {
            $.resourceCreationLimitPolicy = resourceCreationLimitPolicy;
            return this;
        }

        /**
         * @param resourceCreationLimitPolicy Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
         * 
         * @return builder
         * 
         */
        public Builder resourceCreationLimitPolicy(FleetResourceCreationLimitPolicyGetArgs resourceCreationLimitPolicy) {
            return resourceCreationLimitPolicy(Output.of(resourceCreationLimitPolicy));
        }

        /**
         * @param runtimeConfiguration Instructions for launching server processes on each instance in the fleet. See below.
         * 
         * @return builder
         * 
         */
        public Builder runtimeConfiguration(@Nullable Output<FleetRuntimeConfigurationGetArgs> runtimeConfiguration) {
            $.runtimeConfiguration = runtimeConfiguration;
            return this;
        }

        /**
         * @param runtimeConfiguration Instructions for launching server processes on each instance in the fleet. See below.
         * 
         * @return builder
         * 
         */
        public Builder runtimeConfiguration(FleetRuntimeConfigurationGetArgs runtimeConfiguration) {
            return runtimeConfiguration(Output.of(runtimeConfiguration));
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public FleetState build() {
            return $;
        }
    }

}
