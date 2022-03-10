// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.LoadBalancerBackendAddressResponse;
import io.pulumi.azurenative.network.outputs.NetworkInterfaceIPConfigurationResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLoadBalancerBackendAddressPoolResult {
    /**
     * An array of references to IP addresses defined in network interfaces.
     * 
     */
    private final List<NetworkInterfaceIPConfigurationResponse> backendIPConfigurations;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * An array of backend addresses.
     * 
     */
    private final @Nullable List<LoadBalancerBackendAddressResponse> loadBalancerBackendAddresses;
    /**
     * An array of references to load balancing rules that use this backend address pool.
     * 
     */
    private final List<SubResourceResponse> loadBalancingRules;
    /**
     * The location of the backend address pool.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource that is unique within the set of backend address pools used by the load balancer. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * A reference to an outbound rule that uses this backend address pool.
     * 
     */
    private final SubResourceResponse outboundRule;
    /**
     * An array of references to outbound rules that use this backend address pool.
     * 
     */
    private final List<SubResourceResponse> outboundRules;
    /**
     * The provisioning state of the backend address pool resource.
     * 
     */
    private final String provisioningState;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetLoadBalancerBackendAddressPoolResult(
        @OutputCustomType.Parameter("backendIPConfigurations") List<NetworkInterfaceIPConfigurationResponse> backendIPConfigurations,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("loadBalancerBackendAddresses") @Nullable List<LoadBalancerBackendAddressResponse> loadBalancerBackendAddresses,
        @OutputCustomType.Parameter("loadBalancingRules") List<SubResourceResponse> loadBalancingRules,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("outboundRule") SubResourceResponse outboundRule,
        @OutputCustomType.Parameter("outboundRules") List<SubResourceResponse> outboundRules,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("type") String type) {
        this.backendIPConfigurations = backendIPConfigurations;
        this.etag = etag;
        this.id = id;
        this.loadBalancerBackendAddresses = loadBalancerBackendAddresses;
        this.loadBalancingRules = loadBalancingRules;
        this.location = location;
        this.name = name;
        this.outboundRule = outboundRule;
        this.outboundRules = outboundRules;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * An array of references to IP addresses defined in network interfaces.
     * 
    */
    public List<NetworkInterfaceIPConfigurationResponse> getBackendIPConfigurations() {
        return this.backendIPConfigurations;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * An array of backend addresses.
     * 
    */
    public List<LoadBalancerBackendAddressResponse> getLoadBalancerBackendAddresses() {
        return this.loadBalancerBackendAddresses == null ? List.of() : this.loadBalancerBackendAddresses;
    }
    /**
     * An array of references to load balancing rules that use this backend address pool.
     * 
    */
    public List<SubResourceResponse> getLoadBalancingRules() {
        return this.loadBalancingRules;
    }
    /**
     * The location of the backend address pool.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource that is unique within the set of backend address pools used by the load balancer. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * A reference to an outbound rule that uses this backend address pool.
     * 
    */
    public SubResourceResponse getOutboundRule() {
        return this.outboundRule;
    }
    /**
     * An array of references to outbound rules that use this backend address pool.
     * 
    */
    public List<SubResourceResponse> getOutboundRules() {
        return this.outboundRules;
    }
    /**
     * The provisioning state of the backend address pool resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerBackendAddressPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<NetworkInterfaceIPConfigurationResponse> backendIPConfigurations;
        private String etag;
        private @Nullable String id;
        private @Nullable List<LoadBalancerBackendAddressResponse> loadBalancerBackendAddresses;
        private List<SubResourceResponse> loadBalancingRules;
        private @Nullable String location;
        private @Nullable String name;
        private SubResourceResponse outboundRule;
        private List<SubResourceResponse> outboundRules;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerBackendAddressPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendIPConfigurations = defaults.backendIPConfigurations;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.loadBalancerBackendAddresses = defaults.loadBalancerBackendAddresses;
    	      this.loadBalancingRules = defaults.loadBalancingRules;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.outboundRule = defaults.outboundRule;
    	      this.outboundRules = defaults.outboundRules;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder backendIPConfigurations(List<NetworkInterfaceIPConfigurationResponse> backendIPConfigurations) {
            this.backendIPConfigurations = Objects.requireNonNull(backendIPConfigurations);
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder loadBalancerBackendAddresses(@Nullable List<LoadBalancerBackendAddressResponse> loadBalancerBackendAddresses) {
            this.loadBalancerBackendAddresses = loadBalancerBackendAddresses;
            return this;
        }

        public Builder loadBalancingRules(List<SubResourceResponse> loadBalancingRules) {
            this.loadBalancingRules = Objects.requireNonNull(loadBalancingRules);
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder outboundRule(SubResourceResponse outboundRule) {
            this.outboundRule = Objects.requireNonNull(outboundRule);
            return this;
        }

        public Builder outboundRules(List<SubResourceResponse> outboundRules) {
            this.outboundRules = Objects.requireNonNull(outboundRules);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetLoadBalancerBackendAddressPoolResult build() {
            return new GetLoadBalancerBackendAddressPoolResult(backendIPConfigurations, etag, id, loadBalancerBackendAddresses, loadBalancingRules, location, name, outboundRule, outboundRules, provisioningState, type);
        }
    }
}
