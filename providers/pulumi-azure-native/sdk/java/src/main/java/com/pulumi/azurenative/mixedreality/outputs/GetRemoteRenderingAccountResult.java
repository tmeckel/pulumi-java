// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mixedreality.outputs;

import com.pulumi.azurenative.mixedreality.outputs.IdentityResponse;
import com.pulumi.azurenative.mixedreality.outputs.SkuResponse;
import com.pulumi.azurenative.mixedreality.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRemoteRenderingAccountResult {
    /**
     * @return Correspond domain name of certain Spatial Anchors Account
     * 
     */
    private final String accountDomain;
    /**
     * @return unique id of certain account.
     * 
     */
    private final String accountId;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The identity associated with this account
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * @return The kind of account, if supported
     * 
     */
    private final @Nullable SkuResponse kind;
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
     * @return The plan associated with this account
     * 
     */
    private final @Nullable IdentityResponse plan;
    /**
     * @return The sku associated with this account
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * @return The name of the storage account associated with this accountId
     * 
     */
    private final @Nullable String storageAccountName;
    /**
     * @return System metadata for this account
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetRemoteRenderingAccountResult(
        @CustomType.Parameter("accountDomain") String accountDomain,
        @CustomType.Parameter("accountId") String accountId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityResponse identity,
        @CustomType.Parameter("kind") @Nullable SkuResponse kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("plan") @Nullable IdentityResponse plan,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("storageAccountName") @Nullable String storageAccountName,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.accountDomain = accountDomain;
        this.accountId = accountId;
        this.id = id;
        this.identity = identity;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.plan = plan;
        this.sku = sku;
        this.storageAccountName = storageAccountName;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return Correspond domain name of certain Spatial Anchors Account
     * 
     */
    public String accountDomain() {
        return this.accountDomain;
    }
    /**
     * @return unique id of certain account.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The identity associated with this account
     * 
     */
    public Optional<IdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return The kind of account, if supported
     * 
     */
    public Optional<SkuResponse> kind() {
        return Optional.ofNullable(this.kind);
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
     * @return The plan associated with this account
     * 
     */
    public Optional<IdentityResponse> plan() {
        return Optional.ofNullable(this.plan);
    }
    /**
     * @return The sku associated with this account
     * 
     */
    public Optional<SkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return The name of the storage account associated with this accountId
     * 
     */
    public Optional<String> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }
    /**
     * @return System metadata for this account
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
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

    public static Builder builder(GetRemoteRenderingAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountDomain;
        private String accountId;
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable SkuResponse kind;
        private String location;
        private String name;
        private @Nullable IdentityResponse plan;
        private @Nullable SkuResponse sku;
        private @Nullable String storageAccountName;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRemoteRenderingAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountDomain = defaults.accountDomain;
    	      this.accountId = defaults.accountId;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
    	      this.sku = defaults.sku;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder accountDomain(String accountDomain) {
            this.accountDomain = Objects.requireNonNull(accountDomain);
            return this;
        }
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder kind(@Nullable SkuResponse kind) {
            this.kind = kind;
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
        public Builder plan(@Nullable IdentityResponse plan) {
            this.plan = plan;
            return this;
        }
        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder storageAccountName(@Nullable String storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetRemoteRenderingAccountResult build() {
            return new GetRemoteRenderingAccountResult(accountDomain, accountId, id, identity, kind, location, name, plan, sku, storageAccountName, systemData, tags, type);
        }
    }
}
