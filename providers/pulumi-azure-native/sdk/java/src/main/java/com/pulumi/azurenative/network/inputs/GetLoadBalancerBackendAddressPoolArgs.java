// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLoadBalancerBackendAddressPoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerBackendAddressPoolArgs Empty = new GetLoadBalancerBackendAddressPoolArgs();

    /**
     * The name of the backend address pool.
     * 
     */
    @Import(name="backendAddressPoolName", required=true)
    private String backendAddressPoolName;

    /**
     * @return The name of the backend address pool.
     * 
     */
    public String backendAddressPoolName() {
        return this.backendAddressPoolName;
    }

    /**
     * The name of the load balancer.
     * 
     */
    @Import(name="loadBalancerName", required=true)
    private String loadBalancerName;

    /**
     * @return The name of the load balancer.
     * 
     */
    public String loadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetLoadBalancerBackendAddressPoolArgs() {}

    private GetLoadBalancerBackendAddressPoolArgs(GetLoadBalancerBackendAddressPoolArgs $) {
        this.backendAddressPoolName = $.backendAddressPoolName;
        this.loadBalancerName = $.loadBalancerName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadBalancerBackendAddressPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancerBackendAddressPoolArgs $;

        public Builder() {
            $ = new GetLoadBalancerBackendAddressPoolArgs();
        }

        public Builder(GetLoadBalancerBackendAddressPoolArgs defaults) {
            $ = new GetLoadBalancerBackendAddressPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendAddressPoolName The name of the backend address pool.
         * 
         * @return builder
         * 
         */
        public Builder backendAddressPoolName(String backendAddressPoolName) {
            $.backendAddressPoolName = backendAddressPoolName;
            return this;
        }

        /**
         * @param loadBalancerName The name of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(String loadBalancerName) {
            $.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetLoadBalancerBackendAddressPoolArgs build() {
            $.backendAddressPoolName = Objects.requireNonNull($.backendAddressPoolName, "expected parameter 'backendAddressPoolName' to be non-null");
            $.loadBalancerName = Objects.requireNonNull($.loadBalancerName, "expected parameter 'loadBalancerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
