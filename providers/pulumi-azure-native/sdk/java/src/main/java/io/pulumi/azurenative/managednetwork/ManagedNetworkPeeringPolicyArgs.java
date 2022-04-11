// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork;

import io.pulumi.azurenative.managednetwork.inputs.ManagedNetworkPeeringPolicyPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedNetworkPeeringPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedNetworkPeeringPolicyArgs Empty = new ManagedNetworkPeeringPolicyArgs();

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the Managed Network.
     * 
     */
    @Import(name="managedNetworkName", required=true)
      private final Output<String> managedNetworkName;

    public Output<String> getManagedNetworkName() {
        return this.managedNetworkName;
    }

    /**
     * The name of the Managed Network Peering Policy.
     * 
     */
    @Import(name="managedNetworkPeeringPolicyName")
      private final @Nullable Output<String> managedNetworkPeeringPolicyName;

    public Output<String> getManagedNetworkPeeringPolicyName() {
        return this.managedNetworkPeeringPolicyName == null ? Codegen.empty() : this.managedNetworkPeeringPolicyName;
    }

    /**
     * Gets or sets the properties of a Managed Network Policy
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<ManagedNetworkPeeringPolicyPropertiesArgs> properties;

    public Output<ManagedNetworkPeeringPolicyPropertiesArgs> getProperties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ManagedNetworkPeeringPolicyArgs(
        @Nullable Output<String> location,
        Output<String> managedNetworkName,
        @Nullable Output<String> managedNetworkPeeringPolicyName,
        @Nullable Output<ManagedNetworkPeeringPolicyPropertiesArgs> properties,
        Output<String> resourceGroupName) {
        this.location = location;
        this.managedNetworkName = Objects.requireNonNull(managedNetworkName, "expected parameter 'managedNetworkName' to be non-null");
        this.managedNetworkPeeringPolicyName = managedNetworkPeeringPolicyName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ManagedNetworkPeeringPolicyArgs() {
        this.location = Codegen.empty();
        this.managedNetworkName = Codegen.empty();
        this.managedNetworkPeeringPolicyName = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedNetworkPeeringPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private Output<String> managedNetworkName;
        private @Nullable Output<String> managedNetworkPeeringPolicyName;
        private @Nullable Output<ManagedNetworkPeeringPolicyPropertiesArgs> properties;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedNetworkPeeringPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.managedNetworkName = defaults.managedNetworkName;
    	      this.managedNetworkPeeringPolicyName = defaults.managedNetworkPeeringPolicyName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder managedNetworkName(Output<String> managedNetworkName) {
            this.managedNetworkName = Objects.requireNonNull(managedNetworkName);
            return this;
        }
        public Builder managedNetworkName(String managedNetworkName) {
            this.managedNetworkName = Output.of(Objects.requireNonNull(managedNetworkName));
            return this;
        }
        public Builder managedNetworkPeeringPolicyName(@Nullable Output<String> managedNetworkPeeringPolicyName) {
            this.managedNetworkPeeringPolicyName = managedNetworkPeeringPolicyName;
            return this;
        }
        public Builder managedNetworkPeeringPolicyName(@Nullable String managedNetworkPeeringPolicyName) {
            this.managedNetworkPeeringPolicyName = Codegen.ofNullable(managedNetworkPeeringPolicyName);
            return this;
        }
        public Builder properties(@Nullable Output<ManagedNetworkPeeringPolicyPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable ManagedNetworkPeeringPolicyPropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public ManagedNetworkPeeringPolicyArgs build() {
            return new ManagedNetworkPeeringPolicyArgs(location, managedNetworkName, managedNetworkPeeringPolicyName, properties, resourceGroupName);
        }
    }
}
