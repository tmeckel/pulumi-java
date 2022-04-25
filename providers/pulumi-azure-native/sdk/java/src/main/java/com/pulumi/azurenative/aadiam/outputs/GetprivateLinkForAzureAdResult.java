// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aadiam.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetprivateLinkForAzureAdResult {
    /**
     * @return Flag indicating whether all tenants are allowed
     * 
     */
    private final @Nullable Boolean allTenants;
    /**
     * @return String Id used to locate any resource on Azure.
     * 
     */
    private final String id;
    /**
     * @return Name of this resource.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Guid of the owner tenant
     * 
     */
    private final @Nullable String ownerTenantId;
    /**
     * @return Name of the resource group
     * 
     */
    private final @Nullable String resourceGroup;
    /**
     * @return Name of the private link policy resource
     * 
     */
    private final @Nullable String resourceName;
    /**
     * @return Subscription Identifier
     * 
     */
    private final @Nullable String subscriptionId;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The list of tenantIds.
     * 
     */
    private final @Nullable List<String> tenants;
    /**
     * @return Type of this resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetprivateLinkForAzureAdResult(
        @CustomType.Parameter("allTenants") @Nullable Boolean allTenants,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("ownerTenantId") @Nullable String ownerTenantId,
        @CustomType.Parameter("resourceGroup") @Nullable String resourceGroup,
        @CustomType.Parameter("resourceName") @Nullable String resourceName,
        @CustomType.Parameter("subscriptionId") @Nullable String subscriptionId,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("tenants") @Nullable List<String> tenants,
        @CustomType.Parameter("type") String type) {
        this.allTenants = allTenants;
        this.id = id;
        this.name = name;
        this.ownerTenantId = ownerTenantId;
        this.resourceGroup = resourceGroup;
        this.resourceName = resourceName;
        this.subscriptionId = subscriptionId;
        this.tags = tags;
        this.tenants = tenants;
        this.type = type;
    }

    /**
     * @return Flag indicating whether all tenants are allowed
     * 
     */
    public Optional<Boolean> allTenants() {
        return Optional.ofNullable(this.allTenants);
    }
    /**
     * @return String Id used to locate any resource on Azure.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of this resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Guid of the owner tenant
     * 
     */
    public Optional<String> ownerTenantId() {
        return Optional.ofNullable(this.ownerTenantId);
    }
    /**
     * @return Name of the resource group
     * 
     */
    public Optional<String> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * @return Name of the private link policy resource
     * 
     */
    public Optional<String> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }
    /**
     * @return Subscription Identifier
     * 
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The list of tenantIds.
     * 
     */
    public List<String> tenants() {
        return this.tenants == null ? List.of() : this.tenants;
    }
    /**
     * @return Type of this resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetprivateLinkForAzureAdResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allTenants;
        private String id;
        private @Nullable String name;
        private @Nullable String ownerTenantId;
        private @Nullable String resourceGroup;
        private @Nullable String resourceName;
        private @Nullable String subscriptionId;
        private @Nullable Map<String,String> tags;
        private @Nullable List<String> tenants;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetprivateLinkForAzureAdResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allTenants = defaults.allTenants;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.ownerTenantId = defaults.ownerTenantId;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceName = defaults.resourceName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tags = defaults.tags;
    	      this.tenants = defaults.tenants;
    	      this.type = defaults.type;
        }

        public Builder allTenants(@Nullable Boolean allTenants) {
            this.allTenants = allTenants;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder ownerTenantId(@Nullable String ownerTenantId) {
            this.ownerTenantId = ownerTenantId;
            return this;
        }
        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tenants(@Nullable List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public Builder tenants(String... tenants) {
            return tenants(List.of(tenants));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetprivateLinkForAzureAdResult build() {
            return new GetprivateLinkForAzureAdResult(allTenants, id, name, ownerTenantId, resourceGroup, resourceName, subscriptionId, tags, tenants, type);
        }
    }
}
