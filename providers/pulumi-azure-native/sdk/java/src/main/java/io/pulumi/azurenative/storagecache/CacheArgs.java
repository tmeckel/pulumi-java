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
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="cacheName")
      private final @Nullable Output<String> cacheName;

    public Output<String> getCacheName() {
        return this.cacheName == null ? Codegen.empty() : this.cacheName;
    }

    /**
     * The size of this Cache, in GB.
     * 
     */
    @Import(name="cacheSizeGB")
      private final @Nullable Output<Integer> cacheSizeGB;

    public Output<Integer> getCacheSizeGB() {
        return this.cacheSizeGB == null ? Codegen.empty() : this.cacheSizeGB;
    }

    /**
     * Specifies Directory Services settings of the cache.
     * 
     */
    @Import(name="directoryServicesSettings")
      private final @Nullable Output<CacheDirectorySettingsArgs> directoryServicesSettings;

    public Output<CacheDirectorySettingsArgs> getDirectoryServicesSettings() {
        return this.directoryServicesSettings == null ? Codegen.empty() : this.directoryServicesSettings;
    }

    /**
     * Specifies encryption settings of the cache.
     * 
     */
    @Import(name="encryptionSettings")
      private final @Nullable Output<CacheEncryptionSettingsArgs> encryptionSettings;

    public Output<CacheEncryptionSettingsArgs> getEncryptionSettings() {
        return this.encryptionSettings == null ? Codegen.empty() : this.encryptionSettings;
    }

    /**
     * The identity of the cache, if configured.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<CacheIdentityArgs> identity;

    public Output<CacheIdentityArgs> getIdentity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * Region name string.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Specifies network settings of the cache.
     * 
     */
    @Import(name="networkSettings")
      private final @Nullable Output<CacheNetworkSettingsArgs> networkSettings;

    public Output<CacheNetworkSettingsArgs> getNetworkSettings() {
        return this.networkSettings == null ? Codegen.empty() : this.networkSettings;
    }

    /**
     * ARM provisioning state, see https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<Either<String,ProvisioningStateType>> provisioningState;

    public Output<Either<String,ProvisioningStateType>> getProvisioningState() {
        return this.provisioningState == null ? Codegen.empty() : this.provisioningState;
    }

    /**
     * Target resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies security settings of the cache.
     * 
     */
    @Import(name="securitySettings")
      private final @Nullable Output<CacheSecuritySettingsArgs> securitySettings;

    public Output<CacheSecuritySettingsArgs> getSecuritySettings() {
        return this.securitySettings == null ? Codegen.empty() : this.securitySettings;
    }

    /**
     * SKU for the Cache.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<CacheSkuArgs> sku;

    public Output<CacheSkuArgs> getSku() {
        return this.sku == null ? Codegen.empty() : this.sku;
    }

    /**
     * Subnet used for the Cache.
     * 
     */
    @Import(name="subnet")
      private final @Nullable Output<String> subnet;

    public Output<String> getSubnet() {
        return this.subnet == null ? Codegen.empty() : this.subnet;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public CacheArgs(
        @Nullable Output<String> cacheName,
        @Nullable Output<Integer> cacheSizeGB,
        @Nullable Output<CacheDirectorySettingsArgs> directoryServicesSettings,
        @Nullable Output<CacheEncryptionSettingsArgs> encryptionSettings,
        @Nullable Output<CacheIdentityArgs> identity,
        @Nullable Output<String> location,
        @Nullable Output<CacheNetworkSettingsArgs> networkSettings,
        @Nullable Output<Either<String,ProvisioningStateType>> provisioningState,
        Output<String> resourceGroupName,
        @Nullable Output<CacheSecuritySettingsArgs> securitySettings,
        @Nullable Output<CacheSkuArgs> sku,
        @Nullable Output<String> subnet,
        @Nullable Output<Map<String,String>> tags) {
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
        this.cacheName = Codegen.empty();
        this.cacheSizeGB = Codegen.empty();
        this.directoryServicesSettings = Codegen.empty();
        this.encryptionSettings = Codegen.empty();
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.networkSettings = Codegen.empty();
        this.provisioningState = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.securitySettings = Codegen.empty();
        this.sku = Codegen.empty();
        this.subnet = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cacheName;
        private @Nullable Output<Integer> cacheSizeGB;
        private @Nullable Output<CacheDirectorySettingsArgs> directoryServicesSettings;
        private @Nullable Output<CacheEncryptionSettingsArgs> encryptionSettings;
        private @Nullable Output<CacheIdentityArgs> identity;
        private @Nullable Output<String> location;
        private @Nullable Output<CacheNetworkSettingsArgs> networkSettings;
        private @Nullable Output<Either<String,ProvisioningStateType>> provisioningState;
        private Output<String> resourceGroupName;
        private @Nullable Output<CacheSecuritySettingsArgs> securitySettings;
        private @Nullable Output<CacheSkuArgs> sku;
        private @Nullable Output<String> subnet;
        private @Nullable Output<Map<String,String>> tags;

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

        public Builder cacheName(@Nullable Output<String> cacheName) {
            this.cacheName = cacheName;
            return this;
        }
        public Builder cacheName(@Nullable String cacheName) {
            this.cacheName = Codegen.ofNullable(cacheName);
            return this;
        }
        public Builder cacheSizeGB(@Nullable Output<Integer> cacheSizeGB) {
            this.cacheSizeGB = cacheSizeGB;
            return this;
        }
        public Builder cacheSizeGB(@Nullable Integer cacheSizeGB) {
            this.cacheSizeGB = Codegen.ofNullable(cacheSizeGB);
            return this;
        }
        public Builder directoryServicesSettings(@Nullable Output<CacheDirectorySettingsArgs> directoryServicesSettings) {
            this.directoryServicesSettings = directoryServicesSettings;
            return this;
        }
        public Builder directoryServicesSettings(@Nullable CacheDirectorySettingsArgs directoryServicesSettings) {
            this.directoryServicesSettings = Codegen.ofNullable(directoryServicesSettings);
            return this;
        }
        public Builder encryptionSettings(@Nullable Output<CacheEncryptionSettingsArgs> encryptionSettings) {
            this.encryptionSettings = encryptionSettings;
            return this;
        }
        public Builder encryptionSettings(@Nullable CacheEncryptionSettingsArgs encryptionSettings) {
            this.encryptionSettings = Codegen.ofNullable(encryptionSettings);
            return this;
        }
        public Builder identity(@Nullable Output<CacheIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable CacheIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder networkSettings(@Nullable Output<CacheNetworkSettingsArgs> networkSettings) {
            this.networkSettings = networkSettings;
            return this;
        }
        public Builder networkSettings(@Nullable CacheNetworkSettingsArgs networkSettings) {
            this.networkSettings = Codegen.ofNullable(networkSettings);
            return this;
        }
        public Builder provisioningState(@Nullable Output<Either<String,ProvisioningStateType>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder provisioningState(@Nullable Either<String,ProvisioningStateType> provisioningState) {
            this.provisioningState = Codegen.ofNullable(provisioningState);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder securitySettings(@Nullable Output<CacheSecuritySettingsArgs> securitySettings) {
            this.securitySettings = securitySettings;
            return this;
        }
        public Builder securitySettings(@Nullable CacheSecuritySettingsArgs securitySettings) {
            this.securitySettings = Codegen.ofNullable(securitySettings);
            return this;
        }
        public Builder sku(@Nullable Output<CacheSkuArgs> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable CacheSkuArgs sku) {
            this.sku = Codegen.ofNullable(sku);
            return this;
        }
        public Builder subnet(@Nullable Output<String> subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder subnet(@Nullable String subnet) {
            this.subnet = Codegen.ofNullable(subnet);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public CacheArgs build() {
            return new CacheArgs(cacheName, cacheSizeGB, directoryServicesSettings, encryptionSettings, identity, location, networkSettings, provisioningState, resourceGroupName, securitySettings, sku, subnet, tags);
        }
    }
}
