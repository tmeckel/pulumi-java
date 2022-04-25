// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.FlowLogResponse;
import com.pulumi.azurenative.network.outputs.NetworkInterfaceResponse;
import com.pulumi.azurenative.network.outputs.SecurityRuleResponse;
import com.pulumi.azurenative.network.outputs.SubnetResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworkSecurityGroupResult {
    /**
     * @return The default security rules of network security group.
     * 
     */
    private final List<SecurityRuleResponse> defaultSecurityRules;
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return A collection of references to flow log resources.
     * 
     */
    private final List<FlowLogResponse> flowLogs;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return A collection of references to network interfaces.
     * 
     */
    private final List<NetworkInterfaceResponse> networkInterfaces;
    /**
     * @return The provisioning state of the network security group resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return The resource GUID property of the network security group resource.
     * 
     */
    private final String resourceGuid;
    /**
     * @return A collection of security rules of the network security group.
     * 
     */
    private final @Nullable List<SecurityRuleResponse> securityRules;
    /**
     * @return A collection of references to subnets.
     * 
     */
    private final List<SubnetResponse> subnets;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetNetworkSecurityGroupResult(
        @CustomType.Parameter("defaultSecurityRules") List<SecurityRuleResponse> defaultSecurityRules,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("flowLogs") List<FlowLogResponse> flowLogs,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkInterfaces") List<NetworkInterfaceResponse> networkInterfaces,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceGuid") String resourceGuid,
        @CustomType.Parameter("securityRules") @Nullable List<SecurityRuleResponse> securityRules,
        @CustomType.Parameter("subnets") List<SubnetResponse> subnets,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.defaultSecurityRules = defaultSecurityRules;
        this.etag = etag;
        this.flowLogs = flowLogs;
        this.id = id;
        this.location = location;
        this.name = name;
        this.networkInterfaces = networkInterfaces;
        this.provisioningState = provisioningState;
        this.resourceGuid = resourceGuid;
        this.securityRules = securityRules;
        this.subnets = subnets;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return The default security rules of network security group.
     * 
     */
    public List<SecurityRuleResponse> defaultSecurityRules() {
        return this.defaultSecurityRules;
    }
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return A collection of references to flow log resources.
     * 
     */
    public List<FlowLogResponse> flowLogs() {
        return this.flowLogs;
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Resource location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A collection of references to network interfaces.
     * 
     */
    public List<NetworkInterfaceResponse> networkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * @return The provisioning state of the network security group resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The resource GUID property of the network security group resource.
     * 
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * @return A collection of security rules of the network security group.
     * 
     */
    public List<SecurityRuleResponse> securityRules() {
        return this.securityRules == null ? List.of() : this.securityRules;
    }
    /**
     * @return A collection of references to subnets.
     * 
     */
    public List<SubnetResponse> subnets() {
        return this.subnets;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkSecurityGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SecurityRuleResponse> defaultSecurityRules;
        private String etag;
        private List<FlowLogResponse> flowLogs;
        private @Nullable String id;
        private @Nullable String location;
        private String name;
        private List<NetworkInterfaceResponse> networkInterfaces;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable List<SecurityRuleResponse> securityRules;
        private List<SubnetResponse> subnets;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkSecurityGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultSecurityRules = defaults.defaultSecurityRules;
    	      this.etag = defaults.etag;
    	      this.flowLogs = defaults.flowLogs;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.securityRules = defaults.securityRules;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder defaultSecurityRules(List<SecurityRuleResponse> defaultSecurityRules) {
            this.defaultSecurityRules = Objects.requireNonNull(defaultSecurityRules);
            return this;
        }
        public Builder defaultSecurityRules(SecurityRuleResponse... defaultSecurityRules) {
            return defaultSecurityRules(List.of(defaultSecurityRules));
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder flowLogs(List<FlowLogResponse> flowLogs) {
            this.flowLogs = Objects.requireNonNull(flowLogs);
            return this;
        }
        public Builder flowLogs(FlowLogResponse... flowLogs) {
            return flowLogs(List.of(flowLogs));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkInterfaces(List<NetworkInterfaceResponse> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }
        public Builder networkInterfaces(NetworkInterfaceResponse... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }
        public Builder securityRules(@Nullable List<SecurityRuleResponse> securityRules) {
            this.securityRules = securityRules;
            return this;
        }
        public Builder securityRules(SecurityRuleResponse... securityRules) {
            return securityRules(List.of(securityRules));
        }
        public Builder subnets(List<SubnetResponse> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public Builder subnets(SubnetResponse... subnets) {
            return subnets(List.of(subnets));
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetNetworkSecurityGroupResult build() {
            return new GetNetworkSecurityGroupResult(defaultSecurityRules, etag, flowLogs, id, location, name, networkInterfaces, provisioningState, resourceGuid, securityRules, subnets, tags, type);
        }
    }
}
