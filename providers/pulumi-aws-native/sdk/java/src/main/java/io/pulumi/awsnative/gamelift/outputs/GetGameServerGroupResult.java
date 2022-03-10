// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.outputs;

import io.pulumi.awsnative.gamelift.enums.GameServerGroupBalancingStrategy;
import io.pulumi.awsnative.gamelift.enums.GameServerGroupGameServerProtectionPolicy;
import io.pulumi.awsnative.gamelift.outputs.GameServerGroupAutoScalingPolicy;
import io.pulumi.awsnative.gamelift.outputs.GameServerGroupInstanceDefinition;
import io.pulumi.awsnative.gamelift.outputs.GameServerGroupLaunchTemplate;
import io.pulumi.awsnative.gamelift.outputs.GameServerGroupTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGameServerGroupResult {
    /**
     * A generated unique ID for the EC2 Auto Scaling group that is associated with this game server group.
     * 
     */
    private final @Nullable String autoScalingGroupArn;
    /**
     * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized for game hosting
     * 
     */
    private final @Nullable GameServerGroupAutoScalingPolicy autoScalingPolicy;
    /**
     * The fallback balancing method to use for the game server group when Spot Instances in a Region become unavailable or are not viable for game hosting.
     * 
     */
    private final @Nullable GameServerGroupBalancingStrategy balancingStrategy;
    /**
     * A generated unique ID for the game server group.
     * 
     */
    private final @Nullable String gameServerGroupArn;
    /**
     * An identifier for the new game server group.
     * 
     */
    private final @Nullable String gameServerGroupName;
    /**
     * A flag that indicates whether instances in the game server group are protected from early termination.
     * 
     */
    private final @Nullable GameServerGroupGameServerProtectionPolicy gameServerProtectionPolicy;
    /**
     * A set of EC2 instance types to use when creating instances in the group.
     * 
     */
    private final @Nullable List<GameServerGroupInstanceDefinition> instanceDefinitions;
    /**
     * The EC2 launch template that contains configuration settings and game server code to be deployed to all instances in the game server group.
     * 
     */
    private final @Nullable GameServerGroupLaunchTemplate launchTemplate;
    /**
     * The maximum number of instances allowed in the EC2 Auto Scaling group.
     * 
     */
    private final @Nullable Double maxSize;
    /**
     * The minimum number of instances allowed in the EC2 Auto Scaling group.
     * 
     */
    private final @Nullable Double minSize;
    /**
     * The Amazon Resource Name (ARN) for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
     * 
     */
    private final @Nullable String roleArn;
    /**
     * A list of labels to assign to the new game server group resource.
     * 
     */
    private final @Nullable List<GameServerGroupTag> tags;
    /**
     * A list of virtual private cloud (VPC) subnets to use with instances in the game server group.
     * 
     */
    private final @Nullable List<String> vpcSubnets;

    @OutputCustomType.Constructor
    private GetGameServerGroupResult(
        @OutputCustomType.Parameter("autoScalingGroupArn") @Nullable String autoScalingGroupArn,
        @OutputCustomType.Parameter("autoScalingPolicy") @Nullable GameServerGroupAutoScalingPolicy autoScalingPolicy,
        @OutputCustomType.Parameter("balancingStrategy") @Nullable GameServerGroupBalancingStrategy balancingStrategy,
        @OutputCustomType.Parameter("gameServerGroupArn") @Nullable String gameServerGroupArn,
        @OutputCustomType.Parameter("gameServerGroupName") @Nullable String gameServerGroupName,
        @OutputCustomType.Parameter("gameServerProtectionPolicy") @Nullable GameServerGroupGameServerProtectionPolicy gameServerProtectionPolicy,
        @OutputCustomType.Parameter("instanceDefinitions") @Nullable List<GameServerGroupInstanceDefinition> instanceDefinitions,
        @OutputCustomType.Parameter("launchTemplate") @Nullable GameServerGroupLaunchTemplate launchTemplate,
        @OutputCustomType.Parameter("maxSize") @Nullable Double maxSize,
        @OutputCustomType.Parameter("minSize") @Nullable Double minSize,
        @OutputCustomType.Parameter("roleArn") @Nullable String roleArn,
        @OutputCustomType.Parameter("tags") @Nullable List<GameServerGroupTag> tags,
        @OutputCustomType.Parameter("vpcSubnets") @Nullable List<String> vpcSubnets) {
        this.autoScalingGroupArn = autoScalingGroupArn;
        this.autoScalingPolicy = autoScalingPolicy;
        this.balancingStrategy = balancingStrategy;
        this.gameServerGroupArn = gameServerGroupArn;
        this.gameServerGroupName = gameServerGroupName;
        this.gameServerProtectionPolicy = gameServerProtectionPolicy;
        this.instanceDefinitions = instanceDefinitions;
        this.launchTemplate = launchTemplate;
        this.maxSize = maxSize;
        this.minSize = minSize;
        this.roleArn = roleArn;
        this.tags = tags;
        this.vpcSubnets = vpcSubnets;
    }

    /**
     * A generated unique ID for the EC2 Auto Scaling group that is associated with this game server group.
     * 
    */
    public Optional<String> getAutoScalingGroupArn() {
        return Optional.ofNullable(this.autoScalingGroupArn);
    }
    /**
     * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized for game hosting
     * 
    */
    public Optional<GameServerGroupAutoScalingPolicy> getAutoScalingPolicy() {
        return Optional.ofNullable(this.autoScalingPolicy);
    }
    /**
     * The fallback balancing method to use for the game server group when Spot Instances in a Region become unavailable or are not viable for game hosting.
     * 
    */
    public Optional<GameServerGroupBalancingStrategy> getBalancingStrategy() {
        return Optional.ofNullable(this.balancingStrategy);
    }
    /**
     * A generated unique ID for the game server group.
     * 
    */
    public Optional<String> getGameServerGroupArn() {
        return Optional.ofNullable(this.gameServerGroupArn);
    }
    /**
     * An identifier for the new game server group.
     * 
    */
    public Optional<String> getGameServerGroupName() {
        return Optional.ofNullable(this.gameServerGroupName);
    }
    /**
     * A flag that indicates whether instances in the game server group are protected from early termination.
     * 
    */
    public Optional<GameServerGroupGameServerProtectionPolicy> getGameServerProtectionPolicy() {
        return Optional.ofNullable(this.gameServerProtectionPolicy);
    }
    /**
     * A set of EC2 instance types to use when creating instances in the group.
     * 
    */
    public List<GameServerGroupInstanceDefinition> getInstanceDefinitions() {
        return this.instanceDefinitions == null ? List.of() : this.instanceDefinitions;
    }
    /**
     * The EC2 launch template that contains configuration settings and game server code to be deployed to all instances in the game server group.
     * 
    */
    public Optional<GameServerGroupLaunchTemplate> getLaunchTemplate() {
        return Optional.ofNullable(this.launchTemplate);
    }
    /**
     * The maximum number of instances allowed in the EC2 Auto Scaling group.
     * 
    */
    public Optional<Double> getMaxSize() {
        return Optional.ofNullable(this.maxSize);
    }
    /**
     * The minimum number of instances allowed in the EC2 Auto Scaling group.
     * 
    */
    public Optional<Double> getMinSize() {
        return Optional.ofNullable(this.minSize);
    }
    /**
     * The Amazon Resource Name (ARN) for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
     * 
    */
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * A list of labels to assign to the new game server group resource.
     * 
    */
    public List<GameServerGroupTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * A list of virtual private cloud (VPC) subnets to use with instances in the game server group.
     * 
    */
    public List<String> getVpcSubnets() {
        return this.vpcSubnets == null ? List.of() : this.vpcSubnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGameServerGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String autoScalingGroupArn;
        private @Nullable GameServerGroupAutoScalingPolicy autoScalingPolicy;
        private @Nullable GameServerGroupBalancingStrategy balancingStrategy;
        private @Nullable String gameServerGroupArn;
        private @Nullable String gameServerGroupName;
        private @Nullable GameServerGroupGameServerProtectionPolicy gameServerProtectionPolicy;
        private @Nullable List<GameServerGroupInstanceDefinition> instanceDefinitions;
        private @Nullable GameServerGroupLaunchTemplate launchTemplate;
        private @Nullable Double maxSize;
        private @Nullable Double minSize;
        private @Nullable String roleArn;
        private @Nullable List<GameServerGroupTag> tags;
        private @Nullable List<String> vpcSubnets;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGameServerGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingGroupArn = defaults.autoScalingGroupArn;
    	      this.autoScalingPolicy = defaults.autoScalingPolicy;
    	      this.balancingStrategy = defaults.balancingStrategy;
    	      this.gameServerGroupArn = defaults.gameServerGroupArn;
    	      this.gameServerGroupName = defaults.gameServerGroupName;
    	      this.gameServerProtectionPolicy = defaults.gameServerProtectionPolicy;
    	      this.instanceDefinitions = defaults.instanceDefinitions;
    	      this.launchTemplate = defaults.launchTemplate;
    	      this.maxSize = defaults.maxSize;
    	      this.minSize = defaults.minSize;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
    	      this.vpcSubnets = defaults.vpcSubnets;
        }

        public Builder autoScalingGroupArn(@Nullable String autoScalingGroupArn) {
            this.autoScalingGroupArn = autoScalingGroupArn;
            return this;
        }

        public Builder autoScalingPolicy(@Nullable GameServerGroupAutoScalingPolicy autoScalingPolicy) {
            this.autoScalingPolicy = autoScalingPolicy;
            return this;
        }

        public Builder balancingStrategy(@Nullable GameServerGroupBalancingStrategy balancingStrategy) {
            this.balancingStrategy = balancingStrategy;
            return this;
        }

        public Builder gameServerGroupArn(@Nullable String gameServerGroupArn) {
            this.gameServerGroupArn = gameServerGroupArn;
            return this;
        }

        public Builder gameServerGroupName(@Nullable String gameServerGroupName) {
            this.gameServerGroupName = gameServerGroupName;
            return this;
        }

        public Builder gameServerProtectionPolicy(@Nullable GameServerGroupGameServerProtectionPolicy gameServerProtectionPolicy) {
            this.gameServerProtectionPolicy = gameServerProtectionPolicy;
            return this;
        }

        public Builder instanceDefinitions(@Nullable List<GameServerGroupInstanceDefinition> instanceDefinitions) {
            this.instanceDefinitions = instanceDefinitions;
            return this;
        }

        public Builder launchTemplate(@Nullable GameServerGroupLaunchTemplate launchTemplate) {
            this.launchTemplate = launchTemplate;
            return this;
        }

        public Builder maxSize(@Nullable Double maxSize) {
            this.maxSize = maxSize;
            return this;
        }

        public Builder minSize(@Nullable Double minSize) {
            this.minSize = minSize;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder tags(@Nullable List<GameServerGroupTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder vpcSubnets(@Nullable List<String> vpcSubnets) {
            this.vpcSubnets = vpcSubnets;
            return this;
        }
        public GetGameServerGroupResult build() {
            return new GetGameServerGroupResult(autoScalingGroupArn, autoScalingPolicy, balancingStrategy, gameServerGroupArn, gameServerGroupName, gameServerProtectionPolicy, instanceDefinitions, launchTemplate, maxSize, minSize, roleArn, tags, vpcSubnets);
        }
    }
}
