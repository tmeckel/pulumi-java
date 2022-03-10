// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationGetArgs;
import io.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigGetArgs;
import io.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetRequestState extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetRequestState Empty = new SpotFleetRequestState();

    /**
     * Indicates how to allocate the target capacity across
     * the Spot pools specified by the Spot fleet request. The default is
     * `lowestPrice`.
     * 
     */
    @InputImport(name="allocationStrategy")
      private final @Nullable Input<String> allocationStrategy;

    public Input<String> getAllocationStrategy() {
        return this.allocationStrategy == null ? Input.empty() : this.allocationStrategy;
    }

    @InputImport(name="clientToken")
      private final @Nullable Input<String> clientToken;

    public Input<String> getClientToken() {
        return this.clientToken == null ? Input.empty() : this.clientToken;
    }

    /**
     * Indicates whether running Spot
     * instances should be terminated if the target capacity of the Spot fleet
     * request is decreased below the current size of the Spot fleet.
     * 
     */
    @InputImport(name="excessCapacityTerminationPolicy")
      private final @Nullable Input<String> excessCapacityTerminationPolicy;

    public Input<String> getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy == null ? Input.empty() : this.excessCapacityTerminationPolicy;
    }

    /**
     * The type of fleet request. Indicates whether the Spot Fleet only requests the target
     * capacity or also attempts to maintain it. Default is `maintain`.
     * 
     */
    @InputImport(name="fleetType")
      private final @Nullable Input<String> fleetType;

    public Input<String> getFleetType() {
        return this.fleetType == null ? Input.empty() : this.fleetType;
    }

    /**
     * Grants the Spot fleet permission to terminate
     * Spot instances on your behalf when you cancel its Spot fleet request using
     * CancelSpotFleetRequests or when the Spot fleet request expires, if you set
     * terminateInstancesWithExpiration.
     * 
     */
    @InputImport(name="iamFleetRole")
      private final @Nullable Input<String> iamFleetRole;

    public Input<String> getIamFleetRole() {
        return this.iamFleetRole == null ? Input.empty() : this.iamFleetRole;
    }

    /**
     * Indicates whether a Spot
     * instance stops or terminates when it is interrupted. Default is
     * `terminate`.
     * 
     */
    @InputImport(name="instanceInterruptionBehaviour")
      private final @Nullable Input<String> instanceInterruptionBehaviour;

    public Input<String> getInstanceInterruptionBehaviour() {
        return this.instanceInterruptionBehaviour == null ? Input.empty() : this.instanceInterruptionBehaviour;
    }

    /**
     * The number of Spot pools across which to allocate your target Spot capacity.
     * Valid only when `allocation_strategy` is set to `lowestPrice`. Spot Fleet selects
     * the cheapest Spot pools and evenly allocates your target Spot capacity across
     * the number of Spot pools that you specify.
     * 
     */
    @InputImport(name="instancePoolsToUseCount")
      private final @Nullable Input<Integer> instancePoolsToUseCount;

    public Input<Integer> getInstancePoolsToUseCount() {
        return this.instancePoolsToUseCount == null ? Input.empty() : this.instancePoolsToUseCount;
    }

    /**
     * Used to define the launch configuration of the
     * spot-fleet request. Can be specified multiple times to define different bids
     * across different markets and instance types. Conflicts with `launch_template_config`. At least one of `launch_specification` or `launch_template_config` is required.
     * 
     */
    @InputImport(name="launchSpecifications")
      private final @Nullable Input<List<SpotFleetRequestLaunchSpecificationGetArgs>> launchSpecifications;

    public Input<List<SpotFleetRequestLaunchSpecificationGetArgs>> getLaunchSpecifications() {
        return this.launchSpecifications == null ? Input.empty() : this.launchSpecifications;
    }

    /**
     * Launch template configuration block. See Launch Template Configs below for more details. Conflicts with `launch_specification`. At least one of `launch_specification` or `launch_template_config` is required.
     * 
     */
    @InputImport(name="launchTemplateConfigs")
      private final @Nullable Input<List<SpotFleetRequestLaunchTemplateConfigGetArgs>> launchTemplateConfigs;

    public Input<List<SpotFleetRequestLaunchTemplateConfigGetArgs>> getLaunchTemplateConfigs() {
        return this.launchTemplateConfigs == null ? Input.empty() : this.launchTemplateConfigs;
    }

    /**
     * A list of elastic load balancer names to add to the Spot fleet.
     * 
     */
    @InputImport(name="loadBalancers")
      private final @Nullable Input<List<String>> loadBalancers;

    public Input<List<String>> getLoadBalancers() {
        return this.loadBalancers == null ? Input.empty() : this.loadBalancers;
    }

    /**
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. the possible values are: `lowestPrice` and `prioritized`. the default is `lowestPrice`.
     * 
     */
    @InputImport(name="onDemandAllocationStrategy")
      private final @Nullable Input<String> onDemandAllocationStrategy;

    public Input<String> getOnDemandAllocationStrategy() {
        return this.onDemandAllocationStrategy == null ? Input.empty() : this.onDemandAllocationStrategy;
    }

    /**
     * The maximum amount per hour for On-Demand Instances that you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
     * 
     */
    @InputImport(name="onDemandMaxTotalPrice")
      private final @Nullable Input<String> onDemandMaxTotalPrice;

    public Input<String> getOnDemandMaxTotalPrice() {
        return this.onDemandMaxTotalPrice == null ? Input.empty() : this.onDemandMaxTotalPrice;
    }

    /**
     * The number of On-Demand units to request. If the request type is `maintain`, you can specify a target capacity of 0 and add capacity later.
     * 
     */
    @InputImport(name="onDemandTargetCapacity")
      private final @Nullable Input<Integer> onDemandTargetCapacity;

    public Input<Integer> getOnDemandTargetCapacity() {
        return this.onDemandTargetCapacity == null ? Input.empty() : this.onDemandTargetCapacity;
    }

    /**
     * Indicates whether Spot fleet should replace unhealthy instances. Default `false`.
     * 
     */
    @InputImport(name="replaceUnhealthyInstances")
      private final @Nullable Input<Boolean> replaceUnhealthyInstances;

    public Input<Boolean> getReplaceUnhealthyInstances() {
        return this.replaceUnhealthyInstances == null ? Input.empty() : this.replaceUnhealthyInstances;
    }

    /**
     * Nested argument containing maintenance strategies for managing your Spot Instances that are at an elevated risk of being interrupted. Defined below.
     * 
     */
    @InputImport(name="spotMaintenanceStrategies")
      private final @Nullable Input<SpotFleetRequestSpotMaintenanceStrategiesGetArgs> spotMaintenanceStrategies;

    public Input<SpotFleetRequestSpotMaintenanceStrategiesGetArgs> getSpotMaintenanceStrategies() {
        return this.spotMaintenanceStrategies == null ? Input.empty() : this.spotMaintenanceStrategies;
    }

    /**
     * The maximum spot bid for this override request.
     * 
     */
    @InputImport(name="spotPrice")
      private final @Nullable Input<String> spotPrice;

    public Input<String> getSpotPrice() {
        return this.spotPrice == null ? Input.empty() : this.spotPrice;
    }

    /**
     * The state of the Spot fleet request.
     * 
     */
    @InputImport(name="spotRequestState")
      private final @Nullable Input<String> spotRequestState;

    public Input<String> getSpotRequestState() {
        return this.spotRequestState == null ? Input.empty() : this.spotRequestState;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The number of units to request. You can choose to set the
     * target capacity in terms of instances or a performance characteristic that is
     * important to your application workload, such as vCPUs, memory, or I/O.
     * 
     */
    @InputImport(name="targetCapacity")
      private final @Nullable Input<Integer> targetCapacity;

    public Input<Integer> getTargetCapacity() {
        return this.targetCapacity == null ? Input.empty() : this.targetCapacity;
    }

    /**
     * A list of `aws.alb.TargetGroup` ARNs, for use with Application Load Balancing.
     * 
     */
    @InputImport(name="targetGroupArns")
      private final @Nullable Input<List<String>> targetGroupArns;

    public Input<List<String>> getTargetGroupArns() {
        return this.targetGroupArns == null ? Input.empty() : this.targetGroupArns;
    }

    /**
     * Indicates whether running Spot
     * instances should be terminated when the Spot fleet request expires.
     * 
     */
    @InputImport(name="terminateInstancesWithExpiration")
      private final @Nullable Input<Boolean> terminateInstancesWithExpiration;

    public Input<Boolean> getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration == null ? Input.empty() : this.terminateInstancesWithExpiration;
    }

    /**
     * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
     * 
     */
    @InputImport(name="validFrom")
      private final @Nullable Input<String> validFrom;

    public Input<String> getValidFrom() {
        return this.validFrom == null ? Input.empty() : this.validFrom;
    }

    /**
     * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request.
     * 
     */
    @InputImport(name="validUntil")
      private final @Nullable Input<String> validUntil;

    public Input<String> getValidUntil() {
        return this.validUntil == null ? Input.empty() : this.validUntil;
    }

    /**
     * If set, this provider will
     * wait for the Spot Request to be fulfilled, and will throw an error if the
     * timeout of 10m is reached.
     * 
     */
    @InputImport(name="waitForFulfillment")
      private final @Nullable Input<Boolean> waitForFulfillment;

    public Input<Boolean> getWaitForFulfillment() {
        return this.waitForFulfillment == null ? Input.empty() : this.waitForFulfillment;
    }

    public SpotFleetRequestState(
        @Nullable Input<String> allocationStrategy,
        @Nullable Input<String> clientToken,
        @Nullable Input<String> excessCapacityTerminationPolicy,
        @Nullable Input<String> fleetType,
        @Nullable Input<String> iamFleetRole,
        @Nullable Input<String> instanceInterruptionBehaviour,
        @Nullable Input<Integer> instancePoolsToUseCount,
        @Nullable Input<List<SpotFleetRequestLaunchSpecificationGetArgs>> launchSpecifications,
        @Nullable Input<List<SpotFleetRequestLaunchTemplateConfigGetArgs>> launchTemplateConfigs,
        @Nullable Input<List<String>> loadBalancers,
        @Nullable Input<String> onDemandAllocationStrategy,
        @Nullable Input<String> onDemandMaxTotalPrice,
        @Nullable Input<Integer> onDemandTargetCapacity,
        @Nullable Input<Boolean> replaceUnhealthyInstances,
        @Nullable Input<SpotFleetRequestSpotMaintenanceStrategiesGetArgs> spotMaintenanceStrategies,
        @Nullable Input<String> spotPrice,
        @Nullable Input<String> spotRequestState,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<Integer> targetCapacity,
        @Nullable Input<List<String>> targetGroupArns,
        @Nullable Input<Boolean> terminateInstancesWithExpiration,
        @Nullable Input<String> validFrom,
        @Nullable Input<String> validUntil,
        @Nullable Input<Boolean> waitForFulfillment) {
        this.allocationStrategy = allocationStrategy;
        this.clientToken = clientToken;
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        this.fleetType = fleetType;
        this.iamFleetRole = iamFleetRole;
        this.instanceInterruptionBehaviour = instanceInterruptionBehaviour;
        this.instancePoolsToUseCount = instancePoolsToUseCount;
        this.launchSpecifications = launchSpecifications;
        this.launchTemplateConfigs = launchTemplateConfigs;
        this.loadBalancers = loadBalancers;
        this.onDemandAllocationStrategy = onDemandAllocationStrategy;
        this.onDemandMaxTotalPrice = onDemandMaxTotalPrice;
        this.onDemandTargetCapacity = onDemandTargetCapacity;
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
        this.spotMaintenanceStrategies = spotMaintenanceStrategies;
        this.spotPrice = spotPrice;
        this.spotRequestState = spotRequestState;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.targetCapacity = targetCapacity;
        this.targetGroupArns = targetGroupArns;
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.waitForFulfillment = waitForFulfillment;
    }

    private SpotFleetRequestState() {
        this.allocationStrategy = Input.empty();
        this.clientToken = Input.empty();
        this.excessCapacityTerminationPolicy = Input.empty();
        this.fleetType = Input.empty();
        this.iamFleetRole = Input.empty();
        this.instanceInterruptionBehaviour = Input.empty();
        this.instancePoolsToUseCount = Input.empty();
        this.launchSpecifications = Input.empty();
        this.launchTemplateConfigs = Input.empty();
        this.loadBalancers = Input.empty();
        this.onDemandAllocationStrategy = Input.empty();
        this.onDemandMaxTotalPrice = Input.empty();
        this.onDemandTargetCapacity = Input.empty();
        this.replaceUnhealthyInstances = Input.empty();
        this.spotMaintenanceStrategies = Input.empty();
        this.spotPrice = Input.empty();
        this.spotRequestState = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.targetCapacity = Input.empty();
        this.targetGroupArns = Input.empty();
        this.terminateInstancesWithExpiration = Input.empty();
        this.validFrom = Input.empty();
        this.validUntil = Input.empty();
        this.waitForFulfillment = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetRequestState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> allocationStrategy;
        private @Nullable Input<String> clientToken;
        private @Nullable Input<String> excessCapacityTerminationPolicy;
        private @Nullable Input<String> fleetType;
        private @Nullable Input<String> iamFleetRole;
        private @Nullable Input<String> instanceInterruptionBehaviour;
        private @Nullable Input<Integer> instancePoolsToUseCount;
        private @Nullable Input<List<SpotFleetRequestLaunchSpecificationGetArgs>> launchSpecifications;
        private @Nullable Input<List<SpotFleetRequestLaunchTemplateConfigGetArgs>> launchTemplateConfigs;
        private @Nullable Input<List<String>> loadBalancers;
        private @Nullable Input<String> onDemandAllocationStrategy;
        private @Nullable Input<String> onDemandMaxTotalPrice;
        private @Nullable Input<Integer> onDemandTargetCapacity;
        private @Nullable Input<Boolean> replaceUnhealthyInstances;
        private @Nullable Input<SpotFleetRequestSpotMaintenanceStrategiesGetArgs> spotMaintenanceStrategies;
        private @Nullable Input<String> spotPrice;
        private @Nullable Input<String> spotRequestState;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<Integer> targetCapacity;
        private @Nullable Input<List<String>> targetGroupArns;
        private @Nullable Input<Boolean> terminateInstancesWithExpiration;
        private @Nullable Input<String> validFrom;
        private @Nullable Input<String> validUntil;
        private @Nullable Input<Boolean> waitForFulfillment;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetRequestState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
    	      this.clientToken = defaults.clientToken;
    	      this.excessCapacityTerminationPolicy = defaults.excessCapacityTerminationPolicy;
    	      this.fleetType = defaults.fleetType;
    	      this.iamFleetRole = defaults.iamFleetRole;
    	      this.instanceInterruptionBehaviour = defaults.instanceInterruptionBehaviour;
    	      this.instancePoolsToUseCount = defaults.instancePoolsToUseCount;
    	      this.launchSpecifications = defaults.launchSpecifications;
    	      this.launchTemplateConfigs = defaults.launchTemplateConfigs;
    	      this.loadBalancers = defaults.loadBalancers;
    	      this.onDemandAllocationStrategy = defaults.onDemandAllocationStrategy;
    	      this.onDemandMaxTotalPrice = defaults.onDemandMaxTotalPrice;
    	      this.onDemandTargetCapacity = defaults.onDemandTargetCapacity;
    	      this.replaceUnhealthyInstances = defaults.replaceUnhealthyInstances;
    	      this.spotMaintenanceStrategies = defaults.spotMaintenanceStrategies;
    	      this.spotPrice = defaults.spotPrice;
    	      this.spotRequestState = defaults.spotRequestState;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.targetCapacity = defaults.targetCapacity;
    	      this.targetGroupArns = defaults.targetGroupArns;
    	      this.terminateInstancesWithExpiration = defaults.terminateInstancesWithExpiration;
    	      this.validFrom = defaults.validFrom;
    	      this.validUntil = defaults.validUntil;
    	      this.waitForFulfillment = defaults.waitForFulfillment;
        }

        public Builder allocationStrategy(@Nullable Input<String> allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }

        public Builder allocationStrategy(@Nullable String allocationStrategy) {
            this.allocationStrategy = Input.ofNullable(allocationStrategy);
            return this;
        }

        public Builder clientToken(@Nullable Input<String> clientToken) {
            this.clientToken = clientToken;
            return this;
        }

        public Builder clientToken(@Nullable String clientToken) {
            this.clientToken = Input.ofNullable(clientToken);
            return this;
        }

        public Builder excessCapacityTerminationPolicy(@Nullable Input<String> excessCapacityTerminationPolicy) {
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }

        public Builder excessCapacityTerminationPolicy(@Nullable String excessCapacityTerminationPolicy) {
            this.excessCapacityTerminationPolicy = Input.ofNullable(excessCapacityTerminationPolicy);
            return this;
        }

        public Builder fleetType(@Nullable Input<String> fleetType) {
            this.fleetType = fleetType;
            return this;
        }

        public Builder fleetType(@Nullable String fleetType) {
            this.fleetType = Input.ofNullable(fleetType);
            return this;
        }

        public Builder iamFleetRole(@Nullable Input<String> iamFleetRole) {
            this.iamFleetRole = iamFleetRole;
            return this;
        }

        public Builder iamFleetRole(@Nullable String iamFleetRole) {
            this.iamFleetRole = Input.ofNullable(iamFleetRole);
            return this;
        }

        public Builder instanceInterruptionBehaviour(@Nullable Input<String> instanceInterruptionBehaviour) {
            this.instanceInterruptionBehaviour = instanceInterruptionBehaviour;
            return this;
        }

        public Builder instanceInterruptionBehaviour(@Nullable String instanceInterruptionBehaviour) {
            this.instanceInterruptionBehaviour = Input.ofNullable(instanceInterruptionBehaviour);
            return this;
        }

        public Builder instancePoolsToUseCount(@Nullable Input<Integer> instancePoolsToUseCount) {
            this.instancePoolsToUseCount = instancePoolsToUseCount;
            return this;
        }

        public Builder instancePoolsToUseCount(@Nullable Integer instancePoolsToUseCount) {
            this.instancePoolsToUseCount = Input.ofNullable(instancePoolsToUseCount);
            return this;
        }

        public Builder launchSpecifications(@Nullable Input<List<SpotFleetRequestLaunchSpecificationGetArgs>> launchSpecifications) {
            this.launchSpecifications = launchSpecifications;
            return this;
        }

        public Builder launchSpecifications(@Nullable List<SpotFleetRequestLaunchSpecificationGetArgs> launchSpecifications) {
            this.launchSpecifications = Input.ofNullable(launchSpecifications);
            return this;
        }

        public Builder launchTemplateConfigs(@Nullable Input<List<SpotFleetRequestLaunchTemplateConfigGetArgs>> launchTemplateConfigs) {
            this.launchTemplateConfigs = launchTemplateConfigs;
            return this;
        }

        public Builder launchTemplateConfigs(@Nullable List<SpotFleetRequestLaunchTemplateConfigGetArgs> launchTemplateConfigs) {
            this.launchTemplateConfigs = Input.ofNullable(launchTemplateConfigs);
            return this;
        }

        public Builder loadBalancers(@Nullable Input<List<String>> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }

        public Builder loadBalancers(@Nullable List<String> loadBalancers) {
            this.loadBalancers = Input.ofNullable(loadBalancers);
            return this;
        }

        public Builder onDemandAllocationStrategy(@Nullable Input<String> onDemandAllocationStrategy) {
            this.onDemandAllocationStrategy = onDemandAllocationStrategy;
            return this;
        }

        public Builder onDemandAllocationStrategy(@Nullable String onDemandAllocationStrategy) {
            this.onDemandAllocationStrategy = Input.ofNullable(onDemandAllocationStrategy);
            return this;
        }

        public Builder onDemandMaxTotalPrice(@Nullable Input<String> onDemandMaxTotalPrice) {
            this.onDemandMaxTotalPrice = onDemandMaxTotalPrice;
            return this;
        }

        public Builder onDemandMaxTotalPrice(@Nullable String onDemandMaxTotalPrice) {
            this.onDemandMaxTotalPrice = Input.ofNullable(onDemandMaxTotalPrice);
            return this;
        }

        public Builder onDemandTargetCapacity(@Nullable Input<Integer> onDemandTargetCapacity) {
            this.onDemandTargetCapacity = onDemandTargetCapacity;
            return this;
        }

        public Builder onDemandTargetCapacity(@Nullable Integer onDemandTargetCapacity) {
            this.onDemandTargetCapacity = Input.ofNullable(onDemandTargetCapacity);
            return this;
        }

        public Builder replaceUnhealthyInstances(@Nullable Input<Boolean> replaceUnhealthyInstances) {
            this.replaceUnhealthyInstances = replaceUnhealthyInstances;
            return this;
        }

        public Builder replaceUnhealthyInstances(@Nullable Boolean replaceUnhealthyInstances) {
            this.replaceUnhealthyInstances = Input.ofNullable(replaceUnhealthyInstances);
            return this;
        }

        public Builder spotMaintenanceStrategies(@Nullable Input<SpotFleetRequestSpotMaintenanceStrategiesGetArgs> spotMaintenanceStrategies) {
            this.spotMaintenanceStrategies = spotMaintenanceStrategies;
            return this;
        }

        public Builder spotMaintenanceStrategies(@Nullable SpotFleetRequestSpotMaintenanceStrategiesGetArgs spotMaintenanceStrategies) {
            this.spotMaintenanceStrategies = Input.ofNullable(spotMaintenanceStrategies);
            return this;
        }

        public Builder spotPrice(@Nullable Input<String> spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }

        public Builder spotPrice(@Nullable String spotPrice) {
            this.spotPrice = Input.ofNullable(spotPrice);
            return this;
        }

        public Builder spotRequestState(@Nullable Input<String> spotRequestState) {
            this.spotRequestState = spotRequestState;
            return this;
        }

        public Builder spotRequestState(@Nullable String spotRequestState) {
            this.spotRequestState = Input.ofNullable(spotRequestState);
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

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder targetCapacity(@Nullable Input<Integer> targetCapacity) {
            this.targetCapacity = targetCapacity;
            return this;
        }

        public Builder targetCapacity(@Nullable Integer targetCapacity) {
            this.targetCapacity = Input.ofNullable(targetCapacity);
            return this;
        }

        public Builder targetGroupArns(@Nullable Input<List<String>> targetGroupArns) {
            this.targetGroupArns = targetGroupArns;
            return this;
        }

        public Builder targetGroupArns(@Nullable List<String> targetGroupArns) {
            this.targetGroupArns = Input.ofNullable(targetGroupArns);
            return this;
        }

        public Builder terminateInstancesWithExpiration(@Nullable Input<Boolean> terminateInstancesWithExpiration) {
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }

        public Builder terminateInstancesWithExpiration(@Nullable Boolean terminateInstancesWithExpiration) {
            this.terminateInstancesWithExpiration = Input.ofNullable(terminateInstancesWithExpiration);
            return this;
        }

        public Builder validFrom(@Nullable Input<String> validFrom) {
            this.validFrom = validFrom;
            return this;
        }

        public Builder validFrom(@Nullable String validFrom) {
            this.validFrom = Input.ofNullable(validFrom);
            return this;
        }

        public Builder validUntil(@Nullable Input<String> validUntil) {
            this.validUntil = validUntil;
            return this;
        }

        public Builder validUntil(@Nullable String validUntil) {
            this.validUntil = Input.ofNullable(validUntil);
            return this;
        }

        public Builder waitForFulfillment(@Nullable Input<Boolean> waitForFulfillment) {
            this.waitForFulfillment = waitForFulfillment;
            return this;
        }

        public Builder waitForFulfillment(@Nullable Boolean waitForFulfillment) {
            this.waitForFulfillment = Input.ofNullable(waitForFulfillment);
            return this;
        }
        public SpotFleetRequestState build() {
            return new SpotFleetRequestState(allocationStrategy, clientToken, excessCapacityTerminationPolicy, fleetType, iamFleetRole, instanceInterruptionBehaviour, instancePoolsToUseCount, launchSpecifications, launchTemplateConfigs, loadBalancers, onDemandAllocationStrategy, onDemandMaxTotalPrice, onDemandTargetCapacity, replaceUnhealthyInstances, spotMaintenanceStrategies, spotPrice, spotRequestState, tags, tagsAll, targetCapacity, targetGroupArns, terminateInstancesWithExpiration, validFrom, validUntil, waitForFulfillment);
        }
    }
}
