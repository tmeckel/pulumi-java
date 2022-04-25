// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.outputs;

import com.pulumi.azurenative.kusto.outputs.PrivateEndpointPropertyResponse;
import com.pulumi.azurenative.kusto.outputs.PrivateLinkServiceConnectionStatePropertyResponse;
import com.pulumi.azurenative.kusto.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPrivateEndpointConnectionResult {
    /**
     * @return Group id of the private endpoint.
     * 
     */
    private final String groupId;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Private endpoint which the connection belongs to.
     * 
     */
    private final PrivateEndpointPropertyResponse privateEndpoint;
    /**
     * @return Connection State of the Private Endpoint Connection.
     * 
     */
    private final PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;
    /**
     * @return Provisioning state of the private endpoint.
     * 
     */
    private final String provisioningState;
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetPrivateEndpointConnectionResult(
        @CustomType.Parameter("groupId") String groupId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateEndpoint") PrivateEndpointPropertyResponse privateEndpoint,
        @CustomType.Parameter("privateLinkServiceConnectionState") PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.groupId = groupId;
        this.id = id;
        this.name = name;
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * @return Group id of the private endpoint.
     * 
     */
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Private endpoint which the connection belongs to.
     * 
     */
    public PrivateEndpointPropertyResponse privateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * @return Connection State of the Private Endpoint Connection.
     * 
     */
    public PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }
    /**
     * @return Provisioning state of the private endpoint.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupId;
        private String id;
        private String name;
        private PrivateEndpointPropertyResponse privateEndpoint;
        private PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateEndpoint(PrivateEndpointPropertyResponse privateEndpoint) {
            this.privateEndpoint = Objects.requireNonNull(privateEndpoint);
            return this;
        }
        public Builder privateLinkServiceConnectionState(PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetPrivateEndpointConnectionResult build() {
            return new GetPrivateEndpointConnectionResult(groupId, id, name, privateEndpoint, privateLinkServiceConnectionState, provisioningState, systemData, type);
        }
    }
}
