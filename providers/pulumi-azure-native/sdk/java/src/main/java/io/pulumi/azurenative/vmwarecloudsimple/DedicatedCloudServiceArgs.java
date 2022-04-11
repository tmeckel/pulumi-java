// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DedicatedCloudServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DedicatedCloudServiceArgs Empty = new DedicatedCloudServiceArgs();

    /**
     * dedicated cloud Service name
     * 
     */
    @Import(name="dedicatedCloudServiceName")
      private final @Nullable Output<String> dedicatedCloudServiceName;

    public Output<String> getDedicatedCloudServiceName() {
        return this.dedicatedCloudServiceName == null ? Codegen.empty() : this.dedicatedCloudServiceName;
    }

    /**
     * gateway Subnet for the account. It will collect the subnet address and always treat it as /28
     * 
     */
    @Import(name="gatewaySubnet", required=true)
      private final Output<String> gatewaySubnet;

    public Output<String> getGatewaySubnet() {
        return this.gatewaySubnet;
    }

    /**
     * Azure region
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The list of tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public DedicatedCloudServiceArgs(
        @Nullable Output<String> dedicatedCloudServiceName,
        Output<String> gatewaySubnet,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.dedicatedCloudServiceName = dedicatedCloudServiceName;
        this.gatewaySubnet = Objects.requireNonNull(gatewaySubnet, "expected parameter 'gatewaySubnet' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private DedicatedCloudServiceArgs() {
        this.dedicatedCloudServiceName = Codegen.empty();
        this.gatewaySubnet = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedCloudServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dedicatedCloudServiceName;
        private Output<String> gatewaySubnet;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedCloudServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dedicatedCloudServiceName = defaults.dedicatedCloudServiceName;
    	      this.gatewaySubnet = defaults.gatewaySubnet;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder dedicatedCloudServiceName(@Nullable Output<String> dedicatedCloudServiceName) {
            this.dedicatedCloudServiceName = dedicatedCloudServiceName;
            return this;
        }
        public Builder dedicatedCloudServiceName(@Nullable String dedicatedCloudServiceName) {
            this.dedicatedCloudServiceName = Codegen.ofNullable(dedicatedCloudServiceName);
            return this;
        }
        public Builder gatewaySubnet(Output<String> gatewaySubnet) {
            this.gatewaySubnet = Objects.requireNonNull(gatewaySubnet);
            return this;
        }
        public Builder gatewaySubnet(String gatewaySubnet) {
            this.gatewaySubnet = Output.of(Objects.requireNonNull(gatewaySubnet));
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
        }        public DedicatedCloudServiceArgs build() {
            return new DedicatedCloudServiceArgs(dedicatedCloudServiceName, gatewaySubnet, location, resourceGroupName, tags);
        }
    }
}
