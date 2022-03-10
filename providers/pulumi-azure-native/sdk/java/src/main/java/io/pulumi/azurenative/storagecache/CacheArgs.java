// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache;

import io.pulumi.azurenative.storagecache.enums.ProvisioningStateType;
import io.pulumi.azurenative.storagecache.inputs.CacheDirectorySettingsArgs;
import io.pulumi.azurenative.storagecache.inputs.CacheEncryptionSettingsArgs;
import io.pulumi.azurenative.storagecache.inputs.CacheIdentityArgs;
import io.pulumi.azurenative.storagecache.inputs.CacheNetworkSettingsArgs;
import io.pulumi.azurenative.storagecache.inputs.CacheSecuritySettingsArgs;
import io.pulumi.azurenative.storagecache.inputs.CacheSkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CacheArgs extends io.pulumi.resources.ResourceArgs {

    public static final CacheArgs Empty = new CacheArgs();

    /**
     * Name of Cache. Length of name must not be greater than 80 and chars must be from the [-0-9a-zA-Z_] char class.
     * 
     */
    @InputImport(name="cacheName")
      private final @Nullable Input<String> cacheName;

    public Input<String> getCacheName() {
        return this.cacheName == null ? Input.empty() : this.cacheName;
    }

    /**
     * The size of this Cache, in GB.
     * 
     */
    @InputImport(name="cacheSizeGB")
      private final @Nullable Input<Integer> cacheSizeGB;

    public Input<Integer> getCacheSizeGB() {
        return this.cacheSizeGB == null ? Input.empty() : this.cacheSizeGB;
    }

    /**
     * Specifies Directory Services settings of the cache.
     * 
     */
    @InputImport(name="directoryServicesSettings")
      private final @Nullable Input<CacheDirectorySettingsArgs> directoryServicesSettings;

    public Input<CacheDirectorySettingsArgs> getDirectoryServicesSettings() {
        return this.directoryServicesSettings == null ? Input.empty() : this.directoryServicesSettings;
    }

    /**
     * Specifies encryption settings of the cache.
     * 
     */
    @InputImport(name="encryptionSettings")
      private final @Nullable Input<CacheEncryptionSettingsArgs> encryptionSettings;

    public Input<CacheEncryptionSettingsArgs> getEncryptionSettings() {
        return this.encryptionSettings == null ? Input.empty() : this.encryptionSettings;
    }

    /**
     * The identity of the cache, if configured.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<CacheIdentityArgs> identity;

    public Input<CacheIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Region name string.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Specifies network settings of the cache.
     * 
     */
    @InputImport(name="networkSettings")
      private final @Nullable Input<CacheNetworkSettingsArgs> networkSettings;

    public Input<CacheNetworkSettingsArgs> getNetworkSettings() {
        return this.networkSettings == null ? Input.empty() : this.networkSettings;
    }

    /**
     * ARM provisioning state, see https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property
     * 
     */
    @InputImport(name="provisioningState")
      private final @Nullable Input<Either<String,ProvisioningStateType>> provisioningState;

    public Input<Either<String,ProvisioningStateType>> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    /**
     * Target resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies security settings of the cache.
     * 
     */
    @InputImport(name="securitySettings")
      private final @Nullable Input<CacheSecuritySettingsArgs> securitySettings;

    public Input<CacheSecuritySettingsArgs> getSecuritySettings() {
        return this.securitySettings == null ? Input.empty() : this.securitySettings;
    }

    /**
     * SKU for the Cache.
     * 
     */
    @InputImport(name="sku")
      private final @Nullable Input<CacheSkuArgs> sku;

    public Input<CacheSkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * Subnet used for the Cache.
     * 
     */
    @InputImport(name="subnet")
      private final @Nullable Input<String> subnet;

    public Input<String> getSubnet() {
        return this.subnet == null ? Input.empty() : this.subnet;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public CacheArgs(
        @Nullable Input<String> cacheName,
        @Nullable Input<Integer> cacheSizeGB,
        @Nullable Input<CacheDirectorySettingsArgs> directoryServicesSettings,
        @Nullable Input<CacheEncryptionSettingsArgs> encryptionSettings,
        @Nullable Input<CacheIdentityArgs> identity,
        @Nullable Input<String> location,
        @Nullable Input<CacheNetworkSettingsArgs> networkSettings,
        @Nullable Input<Either<String,ProvisioningStateType>> provisioningState,
        Input<String> resourceGroupName,
        @Nullable Input<CacheSecuritySettingsArgs> securitySettings,
        @Nullable Input<CacheSkuArgs> sku,
        @Nullable Input<String> subnet,
        @Nullable Input<Map<String,String>> tags) {
        this.cacheName = cacheName;
        this.cacheSizeGB = cacheSizeGB;
        this.directoryServicesSettings = directoryServicesSettings;
        this.encryptionSettings = encryptionSettings;
        this.identity = identity;
        this.location = location;
        this.networkSettings = networkSettings;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.securitySettings = securitySettings;
        this.sku = sku;
        this.subnet = subnet;
        this.tags = tags;
    }

    private CacheArgs() {
        this.cacheName = Input.empty();
        this.cacheSizeGB = Input.empty();
        this.directoryServicesSettings = Input.empty();
        this.encryptionSettings = Input.empty();
        this.identity = Input.empty();
        this.location = Input.empty();
        this.networkSettings = Input.empty();
        this.provisioningState = Input.empty();
        this.resourceGroupName = Input.empty();
        this.securitySettings = Input.empty();
        this.sku = Input.empty();
        this.subnet = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cacheName;
        private @Nullable Input<Integer> cacheSizeGB;
        private @Nullable Input<CacheDirectorySettingsArgs> directoryServicesSettings;
        private @Nullable Input<CacheEncryptionSettingsArgs> encryptionSettings;
        private @Nullable Input<CacheIdentityArgs> identity;
        private @Nullable Input<String> location;
        private @Nullable Input<CacheNetworkSettingsArgs> networkSettings;
        private @Nullable Input<Either<String,ProvisioningStateType>> provisioningState;
        private Input<String> resourceGroupName;
        private @Nullable Input<CacheSecuritySettingsArgs> securitySettings;
        private @Nullable Input<CacheSkuArgs> sku;
        private @Nullable Input<String> subnet;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheName = defaults.cacheName;
    	      this.cacheSizeGB = defaults.cacheSizeGB;
    	      this.directoryServicesSettings = defaults.directoryServicesSettings;
    	      this.encryptionSettings = defaults.encryptionSettings;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.networkSettings = defaults.networkSettings;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.securitySettings = defaults.securitySettings;
    	      this.sku = defaults.sku;
    	      this.subnet = defaults.subnet;
    	      this.tags = defaults.tags;
        }

        public Builder cacheName(@Nullable Input<String> cacheName) {
            this.cacheName = cacheName;
            return this;
        }

        public Builder cacheName(@Nullable String cacheName) {
            this.cacheName = Input.ofNullable(cacheName);
            return this;
        }

        public Builder cacheSizeGB(@Nullable Input<Integer> cacheSizeGB) {
            this.cacheSizeGB = cacheSizeGB;
            return this;
        }

        public Builder cacheSizeGB(@Nullable Integer cacheSizeGB) {
            this.cacheSizeGB = Input.ofNullable(cacheSizeGB);
            return this;
        }

        public Builder directoryServicesSettings(@Nullable Input<CacheDirectorySettingsArgs> directoryServicesSettings) {
            this.directoryServicesSettings = directoryServicesSettings;
            return this;
        }

        public Builder directoryServicesSettings(@Nullable CacheDirectorySettingsArgs directoryServicesSettings) {
            this.directoryServicesSettings = Input.ofNullable(directoryServicesSettings);
            return this;
        }

        public Builder encryptionSettings(@Nullable Input<CacheEncryptionSettingsArgs> encryptionSettings) {
            this.encryptionSettings = encryptionSettings;
            return this;
        }

        public Builder encryptionSettings(@Nullable CacheEncryptionSettingsArgs encryptionSettings) {
            this.encryptionSettings = Input.ofNullable(encryptionSettings);
            return this;
        }

        public Builder identity(@Nullable Input<CacheIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder identity(@Nullable CacheIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder networkSettings(@Nullable Input<CacheNetworkSettingsArgs> networkSettings) {
            this.networkSettings = networkSettings;
            return this;
        }

        public Builder networkSettings(@Nullable CacheNetworkSettingsArgs networkSettings) {
            this.networkSettings = Input.ofNullable(networkSettings);
            return this;
        }

        public Builder provisioningState(@Nullable Input<Either<String,ProvisioningStateType>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(@Nullable Either<String,ProvisioningStateType> provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder securitySettings(@Nullable Input<CacheSecuritySettingsArgs> securitySettings) {
            this.securitySettings = securitySettings;
            return this;
        }

        public Builder securitySettings(@Nullable CacheSecuritySettingsArgs securitySettings) {
            this.securitySettings = Input.ofNullable(securitySettings);
            return this;
        }

        public Builder sku(@Nullable Input<CacheSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder sku(@Nullable CacheSkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder subnet(@Nullable Input<String> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder subnet(@Nullable String subnet) {
            this.subnet = Input.ofNullable(subnet);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public CacheArgs build() {
            return new CacheArgs(cacheName, cacheSizeGB, directoryServicesSettings, encryptionSettings, identity, location, networkSettings, provisioningState, resourceGroupName, securitySettings, sku, subnet, tags);
        }
    }
}
