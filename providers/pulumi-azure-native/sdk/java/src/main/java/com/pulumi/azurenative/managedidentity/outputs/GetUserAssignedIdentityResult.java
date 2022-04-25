// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managedidentity.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetUserAssignedIdentityResult {
    /**
     * @return The id of the app associated with the identity. This is a random generated UUID by MSI.
     * 
     */
    private final String clientId;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return The id of the service principal object associated with the created identity.
     * 
     */
    private final String principalId;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The id of the tenant which the identity belongs to.
     * 
     */
    private final String tenantId;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetUserAssignedIdentityResult(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") String type) {
        this.clientId = clientId;
        this.id = id;
        this.location = location;
        this.name = name;
        this.principalId = principalId;
        this.tags = tags;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * @return The id of the app associated with the identity. This is a random generated UUID by MSI.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The geo-location where the resource lives
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The id of the service principal object associated with the created identity.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The id of the tenant which the identity belongs to.
     * 
     */
    public String tenantId() {
        return this.tenantId;
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

    public static Builder builder(GetUserAssignedIdentityResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String id;
        private String location;
        private String name;
        private String principalId;
        private @Nullable Map<String,String> tags;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserAssignedIdentityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.principalId = defaults.principalId;
    	      this.tags = defaults.tags;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
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
        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetUserAssignedIdentityResult build() {
            return new GetUserAssignedIdentityResult(clientId, id, location, name, principalId, tags, tenantId, type);
        }
    }
}
