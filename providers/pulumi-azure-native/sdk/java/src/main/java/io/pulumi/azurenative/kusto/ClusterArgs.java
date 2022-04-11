// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.kusto.enums.EngineType;
import io.pulumi.azurenative.kusto.inputs.AzureSkuArgs;
import io.pulumi.azurenative.kusto.inputs.IdentityArgs;
import io.pulumi.azurenative.kusto.inputs.KeyVaultPropertiesArgs;
import io.pulumi.azurenative.kusto.inputs.OptimizedAutoscaleArgs;
import io.pulumi.azurenative.kusto.inputs.TrustedExternalTenantArgs;
import io.pulumi.azurenative.kusto.inputs.VirtualNetworkConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName")
      private final @Nullable Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName == null ? Codegen.empty() : this.clusterName;
    }

    /**
     * A boolean value that indicates if the cluster's disks are encrypted.
     * 
     */
    @Import(name="enableDiskEncryption")
      private final @Nullable Output<Boolean> enableDiskEncryption;

    public Output<Boolean> getEnableDiskEncryption() {
        return this.enableDiskEncryption == null ? Codegen.empty() : this.enableDiskEncryption;
    }

    /**
     * A boolean value that indicates if double encryption is enabled.
     * 
     */
    @Import(name="enableDoubleEncryption")
      private final @Nullable Output<Boolean> enableDoubleEncryption;

    public Output<Boolean> getEnableDoubleEncryption() {
        return this.enableDoubleEncryption == null ? Codegen.empty() : this.enableDoubleEncryption;
    }

    /**
     * A boolean value that indicates if the purge operations are enabled.
     * 
     */
    @Import(name="enablePurge")
      private final @Nullable Output<Boolean> enablePurge;

    public Output<Boolean> getEnablePurge() {
        return this.enablePurge == null ? Codegen.empty() : this.enablePurge;
    }

    /**
     * A boolean value that indicates if the streaming ingest is enabled.
     * 
     */
    @Import(name="enableStreamingIngest")
      private final @Nullable Output<Boolean> enableStreamingIngest;

    public Output<Boolean> getEnableStreamingIngest() {
        return this.enableStreamingIngest == null ? Codegen.empty() : this.enableStreamingIngest;
    }

    /**
     * The engine type
     * 
     */
    @Import(name="engineType")
      private final @Nullable Output<Either<String,EngineType>> engineType;

    public Output<Either<String,EngineType>> getEngineType() {
        return this.engineType == null ? Codegen.empty() : this.engineType;
    }

    /**
     * The identity of the cluster, if configured.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<IdentityArgs> identity;

    public Output<IdentityArgs> getIdentity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * KeyVault properties for the cluster encryption.
     * 
     */
    @Import(name="keyVaultProperties")
      private final @Nullable Output<KeyVaultPropertiesArgs> keyVaultProperties;

    public Output<KeyVaultPropertiesArgs> getKeyVaultProperties() {
        return this.keyVaultProperties == null ? Codegen.empty() : this.keyVaultProperties;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Optimized auto scale definition.
     * 
     */
    @Import(name="optimizedAutoscale")
      private final @Nullable Output<OptimizedAutoscaleArgs> optimizedAutoscale;

    public Output<OptimizedAutoscaleArgs> getOptimizedAutoscale() {
        return this.optimizedAutoscale == null ? Codegen.empty() : this.optimizedAutoscale;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SKU of the cluster.
     * 
     */
    @Import(name="sku", required=true)
      private final Output<AzureSkuArgs> sku;

    public Output<AzureSkuArgs> getSku() {
        return this.sku;
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

    /**
     * The cluster's external tenants.
     * 
     */
    @Import(name="trustedExternalTenants")
      private final @Nullable Output<List<TrustedExternalTenantArgs>> trustedExternalTenants;

    public Output<List<TrustedExternalTenantArgs>> getTrustedExternalTenants() {
        return this.trustedExternalTenants == null ? Codegen.empty() : this.trustedExternalTenants;
    }

    /**
     * Virtual network definition.
     * 
     */
    @Import(name="virtualNetworkConfiguration")
      private final @Nullable Output<VirtualNetworkConfigurationArgs> virtualNetworkConfiguration;

    public Output<VirtualNetworkConfigurationArgs> getVirtualNetworkConfiguration() {
        return this.virtualNetworkConfiguration == null ? Codegen.empty() : this.virtualNetworkConfiguration;
    }

    /**
     * The availability zones of the cluster.
     * 
     */
    @Import(name="zones")
      private final @Nullable Output<List<String>> zones;

    public Output<List<String>> getZones() {
        return this.zones == null ? Codegen.empty() : this.zones;
    }

    public ClusterArgs(
        @Nullable Output<String> clusterName,
        @Nullable Output<Boolean> enableDiskEncryption,
        @Nullable Output<Boolean> enableDoubleEncryption,
        @Nullable Output<Boolean> enablePurge,
        @Nullable Output<Boolean> enableStreamingIngest,
        @Nullable Output<Either<String,EngineType>> engineType,
        @Nullable Output<IdentityArgs> identity,
        @Nullable Output<KeyVaultPropertiesArgs> keyVaultProperties,
        @Nullable Output<String> location,
        @Nullable Output<OptimizedAutoscaleArgs> optimizedAutoscale,
        Output<String> resourceGroupName,
        Output<AzureSkuArgs> sku,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<TrustedExternalTenantArgs>> trustedExternalTenants,
        @Nullable Output<VirtualNetworkConfigurationArgs> virtualNetworkConfiguration,
        @Nullable Output<List<String>> zones) {
        this.clusterName = clusterName;
        this.enableDiskEncryption = enableDiskEncryption == null ? Codegen.ofNullable(false) : enableDiskEncryption;
        this.enableDoubleEncryption = enableDoubleEncryption == null ? Codegen.ofNullable(false) : enableDoubleEncryption;
        this.enablePurge = enablePurge == null ? Codegen.ofNullable(false) : enablePurge;
        this.enableStreamingIngest = enableStreamingIngest == null ? Codegen.ofNullable(false) : enableStreamingIngest;
        this.engineType = engineType == null ? Output.ofLeft("V3") : engineType;
        this.identity = identity;
        this.keyVaultProperties = keyVaultProperties;
        this.location = location;
        this.optimizedAutoscale = optimizedAutoscale;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
        this.trustedExternalTenants = trustedExternalTenants;
        this.virtualNetworkConfiguration = virtualNetworkConfiguration;
        this.zones = zones;
    }

    private ClusterArgs() {
        this.clusterName = Codegen.empty();
        this.enableDiskEncryption = Codegen.empty();
        this.enableDoubleEncryption = Codegen.empty();
        this.enablePurge = Codegen.empty();
        this.enableStreamingIngest = Codegen.empty();
        this.engineType = Codegen.empty();
        this.identity = Codegen.empty();
        this.keyVaultProperties = Codegen.empty();
        this.location = Codegen.empty();
        this.optimizedAutoscale = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sku = Codegen.empty();
        this.tags = Codegen.empty();
        this.trustedExternalTenants = Codegen.empty();
        this.virtualNetworkConfiguration = Codegen.empty();
        this.zones = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clusterName;
        private @Nullable Output<Boolean> enableDiskEncryption;
        private @Nullable Output<Boolean> enableDoubleEncryption;
        private @Nullable Output<Boolean> enablePurge;
        private @Nullable Output<Boolean> enableStreamingIngest;
        private @Nullable Output<Either<String,EngineType>> engineType;
        private @Nullable Output<IdentityArgs> identity;
        private @Nullable Output<KeyVaultPropertiesArgs> keyVaultProperties;
        private @Nullable Output<String> location;
        private @Nullable Output<OptimizedAutoscaleArgs> optimizedAutoscale;
        private Output<String> resourceGroupName;
        private Output<AzureSkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<TrustedExternalTenantArgs>> trustedExternalTenants;
        private @Nullable Output<VirtualNetworkConfigurationArgs> virtualNetworkConfiguration;
        private @Nullable Output<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.enableDiskEncryption = defaults.enableDiskEncryption;
    	      this.enableDoubleEncryption = defaults.enableDoubleEncryption;
    	      this.enablePurge = defaults.enablePurge;
    	      this.enableStreamingIngest = defaults.enableStreamingIngest;
    	      this.engineType = defaults.engineType;
    	      this.identity = defaults.identity;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
    	      this.location = defaults.location;
    	      this.optimizedAutoscale = defaults.optimizedAutoscale;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.trustedExternalTenants = defaults.trustedExternalTenants;
    	      this.virtualNetworkConfiguration = defaults.virtualNetworkConfiguration;
    	      this.zones = defaults.zones;
        }

        public Builder clusterName(@Nullable Output<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Codegen.ofNullable(clusterName);
            return this;
        }
        public Builder enableDiskEncryption(@Nullable Output<Boolean> enableDiskEncryption) {
            this.enableDiskEncryption = enableDiskEncryption;
            return this;
        }
        public Builder enableDiskEncryption(@Nullable Boolean enableDiskEncryption) {
            this.enableDiskEncryption = Codegen.ofNullable(enableDiskEncryption);
            return this;
        }
        public Builder enableDoubleEncryption(@Nullable Output<Boolean> enableDoubleEncryption) {
            this.enableDoubleEncryption = enableDoubleEncryption;
            return this;
        }
        public Builder enableDoubleEncryption(@Nullable Boolean enableDoubleEncryption) {
            this.enableDoubleEncryption = Codegen.ofNullable(enableDoubleEncryption);
            return this;
        }
        public Builder enablePurge(@Nullable Output<Boolean> enablePurge) {
            this.enablePurge = enablePurge;
            return this;
        }
        public Builder enablePurge(@Nullable Boolean enablePurge) {
            this.enablePurge = Codegen.ofNullable(enablePurge);
            return this;
        }
        public Builder enableStreamingIngest(@Nullable Output<Boolean> enableStreamingIngest) {
            this.enableStreamingIngest = enableStreamingIngest;
            return this;
        }
        public Builder enableStreamingIngest(@Nullable Boolean enableStreamingIngest) {
            this.enableStreamingIngest = Codegen.ofNullable(enableStreamingIngest);
            return this;
        }
        public Builder engineType(@Nullable Output<Either<String,EngineType>> engineType) {
            this.engineType = engineType;
            return this;
        }
        public Builder engineType(@Nullable Either<String,EngineType> engineType) {
            this.engineType = Codegen.ofNullable(engineType);
            return this;
        }
        public Builder identity(@Nullable Output<IdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable IdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder keyVaultProperties(@Nullable Output<KeyVaultPropertiesArgs> keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }
        public Builder keyVaultProperties(@Nullable KeyVaultPropertiesArgs keyVaultProperties) {
            this.keyVaultProperties = Codegen.ofNullable(keyVaultProperties);
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
        public Builder optimizedAutoscale(@Nullable Output<OptimizedAutoscaleArgs> optimizedAutoscale) {
            this.optimizedAutoscale = optimizedAutoscale;
            return this;
        }
        public Builder optimizedAutoscale(@Nullable OptimizedAutoscaleArgs optimizedAutoscale) {
            this.optimizedAutoscale = Codegen.ofNullable(optimizedAutoscale);
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
        public Builder sku(Output<AzureSkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder sku(AzureSkuArgs sku) {
            this.sku = Output.of(Objects.requireNonNull(sku));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder trustedExternalTenants(@Nullable Output<List<TrustedExternalTenantArgs>> trustedExternalTenants) {
            this.trustedExternalTenants = trustedExternalTenants;
            return this;
        }
        public Builder trustedExternalTenants(@Nullable List<TrustedExternalTenantArgs> trustedExternalTenants) {
            this.trustedExternalTenants = Codegen.ofNullable(trustedExternalTenants);
            return this;
        }
        public Builder trustedExternalTenants(TrustedExternalTenantArgs... trustedExternalTenants) {
            return trustedExternalTenants(List.of(trustedExternalTenants));
        }
        public Builder virtualNetworkConfiguration(@Nullable Output<VirtualNetworkConfigurationArgs> virtualNetworkConfiguration) {
            this.virtualNetworkConfiguration = virtualNetworkConfiguration;
            return this;
        }
        public Builder virtualNetworkConfiguration(@Nullable VirtualNetworkConfigurationArgs virtualNetworkConfiguration) {
            this.virtualNetworkConfiguration = Codegen.ofNullable(virtualNetworkConfiguration);
            return this;
        }
        public Builder zones(@Nullable Output<List<String>> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(@Nullable List<String> zones) {
            this.zones = Codegen.ofNullable(zones);
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public ClusterArgs build() {
            return new ClusterArgs(clusterName, enableDiskEncryption, enableDoubleEncryption, enablePurge, enableStreamingIngest, engineType, identity, keyVaultProperties, location, optimizedAutoscale, resourceGroupName, sku, tags, trustedExternalTenants, virtualNetworkConfiguration, zones);
        }
    }
}
