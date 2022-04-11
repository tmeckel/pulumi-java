// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.containerregistry.enums.OS;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AgentPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final AgentPoolArgs Empty = new AgentPoolArgs();

    /**
     * The name of the agent pool.
     * 
     */
    @Import(name="agentPoolName")
      private final @Nullable Output<String> agentPoolName;

    public Output<String> getAgentPoolName() {
        return this.agentPoolName == null ? Codegen.empty() : this.agentPoolName;
    }

    /**
     * The count of agent machine
     * 
     */
    @Import(name="count")
      private final @Nullable Output<Integer> count;

    public Output<Integer> getCount() {
        return this.count == null ? Codegen.empty() : this.count;
    }

    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The OS of agent machine
     * 
     */
    @Import(name="os")
      private final @Nullable Output<Either<String,OS>> os;

    public Output<Either<String,OS>> getOs() {
        return this.os == null ? Codegen.empty() : this.os;
    }

    /**
     * The name of the container registry.
     * 
     */
    @Import(name="registryName", required=true)
      private final Output<String> registryName;

    public Output<String> getRegistryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The Tier of agent machine
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<String> tier;

    public Output<String> getTier() {
        return this.tier == null ? Codegen.empty() : this.tier;
    }

    /**
     * The Virtual Network Subnet Resource Id of the agent machine
     * 
     */
    @Import(name="virtualNetworkSubnetResourceId")
      private final @Nullable Output<String> virtualNetworkSubnetResourceId;

    public Output<String> getVirtualNetworkSubnetResourceId() {
        return this.virtualNetworkSubnetResourceId == null ? Codegen.empty() : this.virtualNetworkSubnetResourceId;
    }

    public AgentPoolArgs(
        @Nullable Output<String> agentPoolName,
        @Nullable Output<Integer> count,
        @Nullable Output<String> location,
        @Nullable Output<Either<String,OS>> os,
        Output<String> registryName,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> tier,
        @Nullable Output<String> virtualNetworkSubnetResourceId) {
        this.agentPoolName = agentPoolName;
        this.count = count;
        this.location = location;
        this.os = os;
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.tier = tier;
        this.virtualNetworkSubnetResourceId = virtualNetworkSubnetResourceId;
    }

    private AgentPoolArgs() {
        this.agentPoolName = Codegen.empty();
        this.count = Codegen.empty();
        this.location = Codegen.empty();
        this.os = Codegen.empty();
        this.registryName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.tier = Codegen.empty();
        this.virtualNetworkSubnetResourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> agentPoolName;
        private @Nullable Output<Integer> count;
        private @Nullable Output<String> location;
        private @Nullable Output<Either<String,OS>> os;
        private Output<String> registryName;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> tier;
        private @Nullable Output<String> virtualNetworkSubnetResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AgentPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.count = defaults.count;
    	      this.location = defaults.location;
    	      this.os = defaults.os;
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.tier = defaults.tier;
    	      this.virtualNetworkSubnetResourceId = defaults.virtualNetworkSubnetResourceId;
        }

        public Builder agentPoolName(@Nullable Output<String> agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }
        public Builder agentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = Codegen.ofNullable(agentPoolName);
            return this;
        }
        public Builder count(@Nullable Output<Integer> count) {
            this.count = count;
            return this;
        }
        public Builder count(@Nullable Integer count) {
            this.count = Codegen.ofNullable(count);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder os(@Nullable Output<Either<String,OS>> os) {
            this.os = os;
            return this;
        }
        public Builder os(@Nullable Either<String,OS> os) {
            this.os = Codegen.ofNullable(os);
            return this;
        }
        public Builder registryName(Output<String> registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }
        public Builder registryName(String registryName) {
            this.registryName = Output.of(Objects.requireNonNull(registryName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
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
        public Builder tier(@Nullable Output<String> tier) {
            this.tier = tier;
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = Codegen.ofNullable(tier);
            return this;
        }
        public Builder virtualNetworkSubnetResourceId(@Nullable Output<String> virtualNetworkSubnetResourceId) {
            this.virtualNetworkSubnetResourceId = virtualNetworkSubnetResourceId;
            return this;
        }
        public Builder virtualNetworkSubnetResourceId(@Nullable String virtualNetworkSubnetResourceId) {
            this.virtualNetworkSubnetResourceId = Codegen.ofNullable(virtualNetworkSubnetResourceId);
            return this;
        }        public AgentPoolArgs build() {
            return new AgentPoolArgs(agentPoolName, count, location, os, registryName, resourceGroupName, tags, tier, virtualNetworkSubnetResourceId);
        }
    }
}
