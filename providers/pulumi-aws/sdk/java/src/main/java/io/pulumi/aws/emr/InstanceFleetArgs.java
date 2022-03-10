// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr;

import io.pulumi.aws.emr.inputs.InstanceFleetInstanceTypeConfigArgs;
import io.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFleetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFleetArgs Empty = new InstanceFleetArgs();

    /**
     * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
     * 
     */
    @InputImport(name="clusterId", required=true)
      private final Input<String> clusterId;

    public Input<String> getClusterId() {
        return this.clusterId;
    }

    /**
     * Configuration block for instance fleet
     * 
     */
    @InputImport(name="instanceTypeConfigs")
      private final @Nullable Input<List<InstanceFleetInstanceTypeConfigArgs>> instanceTypeConfigs;

    public Input<List<InstanceFleetInstanceTypeConfigArgs>> getInstanceTypeConfigs() {
        return this.instanceTypeConfigs == null ? Input.empty() : this.instanceTypeConfigs;
    }

    /**
     * Configuration block for launch specification
     * 
     */
    @InputImport(name="launchSpecifications")
      private final @Nullable Input<InstanceFleetLaunchSpecificationsArgs> launchSpecifications;

    public Input<InstanceFleetLaunchSpecificationsArgs> getLaunchSpecifications() {
        return this.launchSpecifications == null ? Input.empty() : this.launchSpecifications;
    }

    /**
     * Friendly name given to the instance fleet.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
     * 
     */
    @InputImport(name="targetOnDemandCapacity")
      private final @Nullable Input<Integer> targetOnDemandCapacity;

    public Input<Integer> getTargetOnDemandCapacity() {
        return this.targetOnDemandCapacity == null ? Input.empty() : this.targetOnDemandCapacity;
    }

    /**
     * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
     * 
     */
    @InputImport(name="targetSpotCapacity")
      private final @Nullable Input<Integer> targetSpotCapacity;

    public Input<Integer> getTargetSpotCapacity() {
        return this.targetSpotCapacity == null ? Input.empty() : this.targetSpotCapacity;
    }

    public InstanceFleetArgs(
        Input<String> clusterId,
        @Nullable Input<List<InstanceFleetInstanceTypeConfigArgs>> instanceTypeConfigs,
        @Nullable Input<InstanceFleetLaunchSpecificationsArgs> launchSpecifications,
        @Nullable Input<String> name,
        @Nullable Input<Integer> targetOnDemandCapacity,
        @Nullable Input<Integer> targetSpotCapacity) {
        this.clusterId = Objects.requireNonNull(clusterId, "expected parameter 'clusterId' to be non-null");
        this.instanceTypeConfigs = instanceTypeConfigs;
        this.launchSpecifications = launchSpecifications;
        this.name = name;
        this.targetOnDemandCapacity = targetOnDemandCapacity;
        this.targetSpotCapacity = targetSpotCapacity;
    }

    private InstanceFleetArgs() {
        this.clusterId = Input.empty();
        this.instanceTypeConfigs = Input.empty();
        this.launchSpecifications = Input.empty();
        this.name = Input.empty();
        this.targetOnDemandCapacity = Input.empty();
        this.targetSpotCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterId;
        private @Nullable Input<List<InstanceFleetInstanceTypeConfigArgs>> instanceTypeConfigs;
        private @Nullable Input<InstanceFleetLaunchSpecificationsArgs> launchSpecifications;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> targetOnDemandCapacity;
        private @Nullable Input<Integer> targetSpotCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.instanceTypeConfigs = defaults.instanceTypeConfigs;
    	      this.launchSpecifications = defaults.launchSpecifications;
    	      this.name = defaults.name;
    	      this.targetOnDemandCapacity = defaults.targetOnDemandCapacity;
    	      this.targetSpotCapacity = defaults.targetSpotCapacity;
        }

        public Builder clusterId(Input<String> clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder clusterId(String clusterId) {
            this.clusterId = Input.of(Objects.requireNonNull(clusterId));
            return this;
        }

        public Builder instanceTypeConfigs(@Nullable Input<List<InstanceFleetInstanceTypeConfigArgs>> instanceTypeConfigs) {
            this.instanceTypeConfigs = instanceTypeConfigs;
            return this;
        }

        public Builder instanceTypeConfigs(@Nullable List<InstanceFleetInstanceTypeConfigArgs> instanceTypeConfigs) {
            this.instanceTypeConfigs = Input.ofNullable(instanceTypeConfigs);
            return this;
        }

        public Builder launchSpecifications(@Nullable Input<InstanceFleetLaunchSpecificationsArgs> launchSpecifications) {
            this.launchSpecifications = launchSpecifications;
            return this;
        }

        public Builder launchSpecifications(@Nullable InstanceFleetLaunchSpecificationsArgs launchSpecifications) {
            this.launchSpecifications = Input.ofNullable(launchSpecifications);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder targetOnDemandCapacity(@Nullable Input<Integer> targetOnDemandCapacity) {
            this.targetOnDemandCapacity = targetOnDemandCapacity;
            return this;
        }

        public Builder targetOnDemandCapacity(@Nullable Integer targetOnDemandCapacity) {
            this.targetOnDemandCapacity = Input.ofNullable(targetOnDemandCapacity);
            return this;
        }

        public Builder targetSpotCapacity(@Nullable Input<Integer> targetSpotCapacity) {
            this.targetSpotCapacity = targetSpotCapacity;
            return this;
        }

        public Builder targetSpotCapacity(@Nullable Integer targetSpotCapacity) {
            this.targetSpotCapacity = Input.ofNullable(targetSpotCapacity);
            return this;
        }
        public InstanceFleetArgs build() {
            return new InstanceFleetArgs(clusterId, instanceTypeConfigs, launchSpecifications, name, targetOnDemandCapacity, targetSpotCapacity);
        }
    }
}
