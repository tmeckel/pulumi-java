// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Service network profile payload
 * 
 */
public final class NetworkProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkProfileArgs Empty = new NetworkProfileArgs();

    /**
     * Name of the resource group containing network resources of Azure Spring Cloud Apps
     * 
     */
    @InputImport(name="appNetworkResourceGroup")
      private final @Nullable Input<String> appNetworkResourceGroup;

    public Input<String> getAppNetworkResourceGroup() {
        return this.appNetworkResourceGroup == null ? Input.empty() : this.appNetworkResourceGroup;
    }

    /**
     * Fully qualified resource Id of the subnet to host Azure Spring Cloud Apps
     * 
     */
    @InputImport(name="appSubnetId")
      private final @Nullable Input<String> appSubnetId;

    public Input<String> getAppSubnetId() {
        return this.appSubnetId == null ? Input.empty() : this.appSubnetId;
    }

    /**
     * Azure Spring Cloud service reserved CIDR
     * 
     */
    @InputImport(name="serviceCidr")
      private final @Nullable Input<String> serviceCidr;

    public Input<String> getServiceCidr() {
        return this.serviceCidr == null ? Input.empty() : this.serviceCidr;
    }

    /**
     * Name of the resource group containing network resources of Azure Spring Cloud Service Runtime
     * 
     */
    @InputImport(name="serviceRuntimeNetworkResourceGroup")
      private final @Nullable Input<String> serviceRuntimeNetworkResourceGroup;

    public Input<String> getServiceRuntimeNetworkResourceGroup() {
        return this.serviceRuntimeNetworkResourceGroup == null ? Input.empty() : this.serviceRuntimeNetworkResourceGroup;
    }

    /**
     * Fully qualified resource Id of the subnet to host Azure Spring Cloud Service Runtime
     * 
     */
    @InputImport(name="serviceRuntimeSubnetId")
      private final @Nullable Input<String> serviceRuntimeSubnetId;

    public Input<String> getServiceRuntimeSubnetId() {
        return this.serviceRuntimeSubnetId == null ? Input.empty() : this.serviceRuntimeSubnetId;
    }

    public NetworkProfileArgs(
        @Nullable Input<String> appNetworkResourceGroup,
        @Nullable Input<String> appSubnetId,
        @Nullable Input<String> serviceCidr,
        @Nullable Input<String> serviceRuntimeNetworkResourceGroup,
        @Nullable Input<String> serviceRuntimeSubnetId) {
        this.appNetworkResourceGroup = appNetworkResourceGroup;
        this.appSubnetId = appSubnetId;
        this.serviceCidr = serviceCidr;
        this.serviceRuntimeNetworkResourceGroup = serviceRuntimeNetworkResourceGroup;
        this.serviceRuntimeSubnetId = serviceRuntimeSubnetId;
    }

    private NetworkProfileArgs() {
        this.appNetworkResourceGroup = Input.empty();
        this.appSubnetId = Input.empty();
        this.serviceCidr = Input.empty();
        this.serviceRuntimeNetworkResourceGroup = Input.empty();
        this.serviceRuntimeSubnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appNetworkResourceGroup;
        private @Nullable Input<String> appSubnetId;
        private @Nullable Input<String> serviceCidr;
        private @Nullable Input<String> serviceRuntimeNetworkResourceGroup;
        private @Nullable Input<String> serviceRuntimeSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appNetworkResourceGroup = defaults.appNetworkResourceGroup;
    	      this.appSubnetId = defaults.appSubnetId;
    	      this.serviceCidr = defaults.serviceCidr;
    	      this.serviceRuntimeNetworkResourceGroup = defaults.serviceRuntimeNetworkResourceGroup;
    	      this.serviceRuntimeSubnetId = defaults.serviceRuntimeSubnetId;
        }

        public Builder appNetworkResourceGroup(@Nullable Input<String> appNetworkResourceGroup) {
            this.appNetworkResourceGroup = appNetworkResourceGroup;
            return this;
        }

        public Builder appNetworkResourceGroup(@Nullable String appNetworkResourceGroup) {
            this.appNetworkResourceGroup = Input.ofNullable(appNetworkResourceGroup);
            return this;
        }

        public Builder appSubnetId(@Nullable Input<String> appSubnetId) {
            this.appSubnetId = appSubnetId;
            return this;
        }

        public Builder appSubnetId(@Nullable String appSubnetId) {
            this.appSubnetId = Input.ofNullable(appSubnetId);
            return this;
        }

        public Builder serviceCidr(@Nullable Input<String> serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }

        public Builder serviceCidr(@Nullable String serviceCidr) {
            this.serviceCidr = Input.ofNullable(serviceCidr);
            return this;
        }

        public Builder serviceRuntimeNetworkResourceGroup(@Nullable Input<String> serviceRuntimeNetworkResourceGroup) {
            this.serviceRuntimeNetworkResourceGroup = serviceRuntimeNetworkResourceGroup;
            return this;
        }

        public Builder serviceRuntimeNetworkResourceGroup(@Nullable String serviceRuntimeNetworkResourceGroup) {
            this.serviceRuntimeNetworkResourceGroup = Input.ofNullable(serviceRuntimeNetworkResourceGroup);
            return this;
        }

        public Builder serviceRuntimeSubnetId(@Nullable Input<String> serviceRuntimeSubnetId) {
            this.serviceRuntimeSubnetId = serviceRuntimeSubnetId;
            return this;
        }

        public Builder serviceRuntimeSubnetId(@Nullable String serviceRuntimeSubnetId) {
            this.serviceRuntimeSubnetId = Input.ofNullable(serviceRuntimeSubnetId);
            return this;
        }
        public NetworkProfileArgs build() {
            return new NetworkProfileArgs(appNetworkResourceGroup, appSubnetId, serviceCidr, serviceRuntimeNetworkResourceGroup, serviceRuntimeSubnetId);
        }
    }
}
