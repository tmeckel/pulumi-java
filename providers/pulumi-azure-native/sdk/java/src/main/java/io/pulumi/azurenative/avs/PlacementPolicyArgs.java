// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.avs.inputs.VmHostPlacementPolicyPropertiesArgs;
import io.pulumi.azurenative.avs.inputs.VmVmPlacementPolicyPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PlacementPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PlacementPolicyArgs Empty = new PlacementPolicyArgs();

    /**
     * Name of the cluster in the private cloud
     * 
     */
    @InputImport(name="clusterName", required=true)
      private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * Name of the VMware vSphere Distributed Resource Scheduler (DRS) placement policy
     * 
     */
    @InputImport(name="placementPolicyName")
      private final @Nullable Input<String> placementPolicyName;

    public Input<String> getPlacementPolicyName() {
        return this.placementPolicyName == null ? Input.empty() : this.placementPolicyName;
    }

    /**
     * Name of the private cloud
     * 
     */
    @InputImport(name="privateCloudName", required=true)
      private final Input<String> privateCloudName;

    public Input<String> getPrivateCloudName() {
        return this.privateCloudName;
    }

    /**
     * placement policy properties
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Either<VmHostPlacementPolicyPropertiesArgs,VmVmPlacementPolicyPropertiesArgs>> properties;

    public Input<Either<VmHostPlacementPolicyPropertiesArgs,VmVmPlacementPolicyPropertiesArgs>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public PlacementPolicyArgs(
        Input<String> clusterName,
        @Nullable Input<String> placementPolicyName,
        Input<String> privateCloudName,
        @Nullable Input<Either<VmHostPlacementPolicyPropertiesArgs,VmVmPlacementPolicyPropertiesArgs>> properties,
        Input<String> resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.placementPolicyName = placementPolicyName;
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private PlacementPolicyArgs() {
        this.clusterName = Input.empty();
        this.placementPolicyName = Input.empty();
        this.privateCloudName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlacementPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterName;
        private @Nullable Input<String> placementPolicyName;
        private Input<String> privateCloudName;
        private @Nullable Input<Either<VmHostPlacementPolicyPropertiesArgs,VmVmPlacementPolicyPropertiesArgs>> properties;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PlacementPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.placementPolicyName = defaults.placementPolicyName;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder clusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder placementPolicyName(@Nullable Input<String> placementPolicyName) {
            this.placementPolicyName = placementPolicyName;
            return this;
        }

        public Builder placementPolicyName(@Nullable String placementPolicyName) {
            this.placementPolicyName = Input.ofNullable(placementPolicyName);
            return this;
        }

        public Builder privateCloudName(Input<String> privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }

        public Builder privateCloudName(String privateCloudName) {
            this.privateCloudName = Input.of(Objects.requireNonNull(privateCloudName));
            return this;
        }

        public Builder properties(@Nullable Input<Either<VmHostPlacementPolicyPropertiesArgs,VmVmPlacementPolicyPropertiesArgs>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable Either<VmHostPlacementPolicyPropertiesArgs,VmVmPlacementPolicyPropertiesArgs> properties) {
            this.properties = Input.ofNullable(properties);
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
        public PlacementPolicyArgs build() {
            return new PlacementPolicyArgs(clusterName, placementPolicyName, privateCloudName, properties, resourceGroupName);
        }
    }
}
