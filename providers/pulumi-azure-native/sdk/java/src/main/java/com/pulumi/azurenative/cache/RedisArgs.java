// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cache;

import com.pulumi.azurenative.cache.enums.PublicNetworkAccess;
import com.pulumi.azurenative.cache.enums.TlsVersion;
import com.pulumi.azurenative.cache.inputs.RedisCommonPropertiesRedisConfigurationArgs;
import com.pulumi.azurenative.cache.inputs.SkuArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RedisArgs extends com.pulumi.resources.ResourceArgs {

    public static final RedisArgs Empty = new RedisArgs();

    /**
     * Specifies whether the non-ssl Redis server port (6379) is enabled.
     * 
     */
    @Import(name="enableNonSslPort")
    private @Nullable Output<Boolean> enableNonSslPort;

    /**
     * @return Specifies whether the non-ssl Redis server port (6379) is enabled.
     * 
     */
    public Optional<Output<Boolean>> enableNonSslPort() {
        return Optional.ofNullable(this.enableNonSslPort);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Optional: requires clients to use a specified TLS version (or higher) to connect (e,g, &#39;1.0&#39;, &#39;1.1&#39;, &#39;1.2&#39;)
     * 
     */
    @Import(name="minimumTlsVersion")
    private @Nullable Output<Either<String,TlsVersion>> minimumTlsVersion;

    /**
     * @return Optional: requires clients to use a specified TLS version (or higher) to connect (e,g, &#39;1.0&#39;, &#39;1.1&#39;, &#39;1.2&#39;)
     * 
     */
    public Optional<Output<Either<String,TlsVersion>>> minimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }

    /**
     * The name of the Redis cache.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Redis cache.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether or not public endpoint access is allowed for this cache.  Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;. If &#39;Disabled&#39;, private endpoints are the exclusive access method. Default value is &#39;Enabled&#39;
     * 
     */
    @Import(name="publicNetworkAccess")
    private @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    /**
     * @return Whether or not public endpoint access is allowed for this cache.  Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;. If &#39;Disabled&#39;, private endpoints are the exclusive access method. Default value is &#39;Enabled&#39;
     * 
     */
    public Optional<Output<Either<String,PublicNetworkAccess>>> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }

    /**
     * All Redis Settings. Few possible keys: rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value etc.
     * 
     */
    @Import(name="redisConfiguration")
    private @Nullable Output<RedisCommonPropertiesRedisConfigurationArgs> redisConfiguration;

    /**
     * @return All Redis Settings. Few possible keys: rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value etc.
     * 
     */
    public Optional<Output<RedisCommonPropertiesRedisConfigurationArgs>> redisConfiguration() {
        return Optional.ofNullable(this.redisConfiguration);
    }

    /**
     * The number of replicas to be created per master.
     * 
     */
    @Import(name="replicasPerMaster")
    private @Nullable Output<Integer> replicasPerMaster;

    /**
     * @return The number of replicas to be created per master.
     * 
     */
    public Optional<Output<Integer>> replicasPerMaster() {
        return Optional.ofNullable(this.replicasPerMaster);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The number of shards to be created on a Premium Cluster Cache.
     * 
     */
    @Import(name="shardCount")
    private @Nullable Output<Integer> shardCount;

    /**
     * @return The number of shards to be created on a Premium Cluster Cache.
     * 
     */
    public Optional<Output<Integer>> shardCount() {
        return Optional.ofNullable(this.shardCount);
    }

    /**
     * The SKU of the Redis cache to deploy.
     * 
     */
    @Import(name="sku", required=true)
    private Output<SkuArgs> sku;

    /**
     * @return The SKU of the Redis cache to deploy.
     * 
     */
    public Output<SkuArgs> sku() {
        return this.sku;
    }

    /**
     * Static IP address. Optionally, may be specified when deploying a Redis cache inside an existing Azure Virtual Network; auto assigned by default.
     * 
     */
    @Import(name="staticIP")
    private @Nullable Output<String> staticIP;

    /**
     * @return Static IP address. Optionally, may be specified when deploying a Redis cache inside an existing Azure Virtual Network; auto assigned by default.
     * 
     */
    public Optional<Output<String>> staticIP() {
        return Optional.ofNullable(this.staticIP);
    }

    /**
     * The full resource ID of a subnet in a virtual network to deploy the Redis cache in. Example format: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The full resource ID of a subnet in a virtual network to deploy the Redis cache in. Example format: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A dictionary of tenant settings
     * 
     */
    @Import(name="tenantSettings")
    private @Nullable Output<Map<String,String>> tenantSettings;

    /**
     * @return A dictionary of tenant settings
     * 
     */
    public Optional<Output<Map<String,String>>> tenantSettings() {
        return Optional.ofNullable(this.tenantSettings);
    }

    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return A list of availability zones denoting where the resource needs to come from.
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private RedisArgs() {}

    private RedisArgs(RedisArgs $) {
        this.enableNonSslPort = $.enableNonSslPort;
        this.location = $.location;
        this.minimumTlsVersion = $.minimumTlsVersion;
        this.name = $.name;
        this.publicNetworkAccess = $.publicNetworkAccess;
        this.redisConfiguration = $.redisConfiguration;
        this.replicasPerMaster = $.replicasPerMaster;
        this.resourceGroupName = $.resourceGroupName;
        this.shardCount = $.shardCount;
        this.sku = $.sku;
        this.staticIP = $.staticIP;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
        this.tenantSettings = $.tenantSettings;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RedisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedisArgs $;

        public Builder() {
            $ = new RedisArgs();
        }

        public Builder(RedisArgs defaults) {
            $ = new RedisArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableNonSslPort Specifies whether the non-ssl Redis server port (6379) is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableNonSslPort(@Nullable Output<Boolean> enableNonSslPort) {
            $.enableNonSslPort = enableNonSslPort;
            return this;
        }

        /**
         * @param enableNonSslPort Specifies whether the non-ssl Redis server port (6379) is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableNonSslPort(Boolean enableNonSslPort) {
            return enableNonSslPort(Output.of(enableNonSslPort));
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param minimumTlsVersion Optional: requires clients to use a specified TLS version (or higher) to connect (e,g, &#39;1.0&#39;, &#39;1.1&#39;, &#39;1.2&#39;)
         * 
         * @return builder
         * 
         */
        public Builder minimumTlsVersion(@Nullable Output<Either<String,TlsVersion>> minimumTlsVersion) {
            $.minimumTlsVersion = minimumTlsVersion;
            return this;
        }

        /**
         * @param minimumTlsVersion Optional: requires clients to use a specified TLS version (or higher) to connect (e,g, &#39;1.0&#39;, &#39;1.1&#39;, &#39;1.2&#39;)
         * 
         * @return builder
         * 
         */
        public Builder minimumTlsVersion(Either<String,TlsVersion> minimumTlsVersion) {
            return minimumTlsVersion(Output.of(minimumTlsVersion));
        }

        /**
         * @param minimumTlsVersion Optional: requires clients to use a specified TLS version (or higher) to connect (e,g, &#39;1.0&#39;, &#39;1.1&#39;, &#39;1.2&#39;)
         * 
         * @return builder
         * 
         */
        public Builder minimumTlsVersion(String minimumTlsVersion) {
            return minimumTlsVersion(Either.ofLeft(minimumTlsVersion));
        }

        /**
         * @param minimumTlsVersion Optional: requires clients to use a specified TLS version (or higher) to connect (e,g, &#39;1.0&#39;, &#39;1.1&#39;, &#39;1.2&#39;)
         * 
         * @return builder
         * 
         */
        public Builder minimumTlsVersion(TlsVersion minimumTlsVersion) {
            return minimumTlsVersion(Either.ofRight(minimumTlsVersion));
        }

        /**
         * @param name The name of the Redis cache.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Redis cache.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publicNetworkAccess Whether or not public endpoint access is allowed for this cache.  Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;. If &#39;Disabled&#39;, private endpoints are the exclusive access method. Default value is &#39;Enabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            $.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        /**
         * @param publicNetworkAccess Whether or not public endpoint access is allowed for this cache.  Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;. If &#39;Disabled&#39;, private endpoints are the exclusive access method. Default value is &#39;Enabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(Either<String,PublicNetworkAccess> publicNetworkAccess) {
            return publicNetworkAccess(Output.of(publicNetworkAccess));
        }

        /**
         * @param publicNetworkAccess Whether or not public endpoint access is allowed for this cache.  Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;. If &#39;Disabled&#39;, private endpoints are the exclusive access method. Default value is &#39;Enabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(String publicNetworkAccess) {
            return publicNetworkAccess(Either.ofLeft(publicNetworkAccess));
        }

        /**
         * @param publicNetworkAccess Whether or not public endpoint access is allowed for this cache.  Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;. If &#39;Disabled&#39;, private endpoints are the exclusive access method. Default value is &#39;Enabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
            return publicNetworkAccess(Either.ofRight(publicNetworkAccess));
        }

        /**
         * @param redisConfiguration All Redis Settings. Few possible keys: rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value etc.
         * 
         * @return builder
         * 
         */
        public Builder redisConfiguration(@Nullable Output<RedisCommonPropertiesRedisConfigurationArgs> redisConfiguration) {
            $.redisConfiguration = redisConfiguration;
            return this;
        }

        /**
         * @param redisConfiguration All Redis Settings. Few possible keys: rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value etc.
         * 
         * @return builder
         * 
         */
        public Builder redisConfiguration(RedisCommonPropertiesRedisConfigurationArgs redisConfiguration) {
            return redisConfiguration(Output.of(redisConfiguration));
        }

        /**
         * @param replicasPerMaster The number of replicas to be created per master.
         * 
         * @return builder
         * 
         */
        public Builder replicasPerMaster(@Nullable Output<Integer> replicasPerMaster) {
            $.replicasPerMaster = replicasPerMaster;
            return this;
        }

        /**
         * @param replicasPerMaster The number of replicas to be created per master.
         * 
         * @return builder
         * 
         */
        public Builder replicasPerMaster(Integer replicasPerMaster) {
            return replicasPerMaster(Output.of(replicasPerMaster));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param shardCount The number of shards to be created on a Premium Cluster Cache.
         * 
         * @return builder
         * 
         */
        public Builder shardCount(@Nullable Output<Integer> shardCount) {
            $.shardCount = shardCount;
            return this;
        }

        /**
         * @param shardCount The number of shards to be created on a Premium Cluster Cache.
         * 
         * @return builder
         * 
         */
        public Builder shardCount(Integer shardCount) {
            return shardCount(Output.of(shardCount));
        }

        /**
         * @param sku The SKU of the Redis cache to deploy.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The SKU of the Redis cache to deploy.
         * 
         * @return builder
         * 
         */
        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param staticIP Static IP address. Optionally, may be specified when deploying a Redis cache inside an existing Azure Virtual Network; auto assigned by default.
         * 
         * @return builder
         * 
         */
        public Builder staticIP(@Nullable Output<String> staticIP) {
            $.staticIP = staticIP;
            return this;
        }

        /**
         * @param staticIP Static IP address. Optionally, may be specified when deploying a Redis cache inside an existing Azure Virtual Network; auto assigned by default.
         * 
         * @return builder
         * 
         */
        public Builder staticIP(String staticIP) {
            return staticIP(Output.of(staticIP));
        }

        /**
         * @param subnetId The full resource ID of a subnet in a virtual network to deploy the Redis cache in. Example format: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The full resource ID of a subnet in a virtual network to deploy the Redis cache in. Example format: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tenantSettings A dictionary of tenant settings
         * 
         * @return builder
         * 
         */
        public Builder tenantSettings(@Nullable Output<Map<String,String>> tenantSettings) {
            $.tenantSettings = tenantSettings;
            return this;
        }

        /**
         * @param tenantSettings A dictionary of tenant settings
         * 
         * @return builder
         * 
         */
        public Builder tenantSettings(Map<String,String> tenantSettings) {
            return tenantSettings(Output.of(tenantSettings));
        }

        /**
         * @param zones A list of availability zones denoting where the resource needs to come from.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones A list of availability zones denoting where the resource needs to come from.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones A list of availability zones denoting where the resource needs to come from.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public RedisArgs build() {
            $.enableNonSslPort = Codegen.booleanProp("enableNonSslPort").output().arg($.enableNonSslPort).def(false).getNullable();
            $.publicNetworkAccess = Codegen.stringProp("publicNetworkAccess").left(PublicNetworkAccess.class).output().arg($.publicNetworkAccess).def("Enabled").getNullable();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
