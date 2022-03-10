// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.outputs;

import io.pulumi.azurenative.keyvault.outputs.PrivateEndpointResponse;
import io.pulumi.azurenative.keyvault.outputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPrivateEndpointConnectionResult {
    /**
     * Modified whenever there is a change in the state of private endpoint connection.
     * 
     */
    private final @Nullable String etag;
    /**
     * Fully qualified identifier of the key vault resource.
     * 
     */
    private final String id;
    /**
     * Azure location of the key vault resource.
     * 
     */
    private final String location;
    /**
     * Name of the key vault resource.
     * 
     */
    private final String name;
    /**
     * Properties of the private endpoint object.
     * 
     */
    private final @Nullable PrivateEndpointResponse privateEndpoint;
    /**
     * Approval state of the private link connection.
     * 
     */
    private final @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
    /**
     * Provisioning state of the private endpoint connection.
     * 
     */
    private final String provisioningState;
    /**
     * Tags assigned to the key vault resource.
     * 
     */
    private final Map<String,String> tags;
    /**
     * Resource type of the key vault resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetPrivateEndpointConnectionResult(
        @OutputCustomType.Parameter("etag") @Nullable String etag,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("privateEndpoint") @Nullable PrivateEndpointResponse privateEndpoint,
        @OutputCustomType.Parameter("privateLinkServiceConnectionState") @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("tags") Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Modified whenever there is a change in the state of private endpoint connection.
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Fully qualified identifier of the key vault resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Azure location of the key vault resource.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Name of the key vault resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Properties of the private endpoint object.
     * 
    */
    public Optional<PrivateEndpointResponse> getPrivateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * Approval state of the private link connection.
     * 
    */
    public Optional<PrivateLinkServiceConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    /**
     * Provisioning state of the private endpoint connection.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Tags assigned to the key vault resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * Resource type of the key vault resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private String location;
        private String name;
        private @Nullable PrivateEndpointResponse privateEndpoint;
        private @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;
        private Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder privateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPrivateEndpointConnectionResult build() {
            return new GetPrivateEndpointConnectionResult(etag, id, location, name, privateEndpoint, privateLinkServiceConnectionState, provisioningState, tags, type);
        }
    }
}
