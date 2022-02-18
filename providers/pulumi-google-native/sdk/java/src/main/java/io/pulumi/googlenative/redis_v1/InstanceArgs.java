// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.redis_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.redis_v1.enums.InstanceConnectMode;
import io.pulumi.googlenative.redis_v1.enums.InstanceReadReplicasMode;
import io.pulumi.googlenative.redis_v1.enums.InstanceTier;
import io.pulumi.googlenative.redis_v1.enums.InstanceTransitEncryptionMode;
import io.pulumi.googlenative.redis_v1.inputs.MaintenancePolicyArgs;
import io.pulumi.googlenative.redis_v1.inputs.PersistenceConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * Optional. If specified, at least one node will be provisioned in this zone in addition to the zone specified in location_id. Only applicable to standard tier. If provided, it must be a different zone from the one provided in [location_id]. Additional nodes beyond the first 2 will be placed in zones selected by the service.
     * 
     */
    @InputImport(name="alternativeLocationId")
    private final @Nullable Input<String> alternativeLocationId;

    public Input<String> getAlternativeLocationId() {
        return this.alternativeLocationId == null ? Input.empty() : this.alternativeLocationId;
    }

    /**
     * Optional. Indicates whether OSS Redis AUTH is enabled for the instance. If set to "true" AUTH is enabled on the instance. Default value is "false" meaning AUTH is disabled.
     * 
     */
    @InputImport(name="authEnabled")
    private final @Nullable Input<Boolean> authEnabled;

    public Input<Boolean> getAuthEnabled() {
        return this.authEnabled == null ? Input.empty() : this.authEnabled;
    }

    /**
     * Optional. The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
     * 
     */
    @InputImport(name="authorizedNetwork")
    private final @Nullable Input<String> authorizedNetwork;

    public Input<String> getAuthorizedNetwork() {
        return this.authorizedNetwork == null ? Input.empty() : this.authorizedNetwork;
    }

    /**
     * Optional. The network connect mode of the Redis instance. If not provided, the connect mode defaults to DIRECT_PEERING.
     * 
     */
    @InputImport(name="connectMode")
    private final @Nullable Input<InstanceConnectMode> connectMode;

    public Input<InstanceConnectMode> getConnectMode() {
        return this.connectMode == null ? Input.empty() : this.connectMode;
    }

    /**
     * An arbitrary and optional user-provided name for the instance.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="instanceId", required=true)
    private final Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * Resource labels to represent user provided metadata
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Optional. The zone where the instance will be provisioned. If not provided, the service will choose a zone from the specified region for the instance. For standard tier, additional nodes will be added across multiple zones for protection against zonal failures. If specified, at least one node will be provisioned in this zone.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optional. The maintenance policy for the instance. If not provided, maintenance events can be performed at any time.
     * 
     */
    @InputImport(name="maintenancePolicy")
    private final @Nullable Input<MaintenancePolicyArgs> maintenancePolicy;

    public Input<MaintenancePolicyArgs> getMaintenancePolicy() {
        return this.maintenancePolicy == null ? Input.empty() : this.maintenancePolicy;
    }

    /**
     * Redis memory size in GiB.
     * 
     */
    @InputImport(name="memorySizeGb", required=true)
    private final Input<Integer> memorySizeGb;

    public Input<Integer> getMemorySizeGb() {
        return this.memorySizeGb;
    }

    /**
     * Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Redis instances are managed and addressed at regional level so location_id here refers to a GCP region; however, users may choose which specific zone (or collection of zones for cross-zone instances) an instance should be provisioned in. Refer to location_id and alternative_location_id fields for more details.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Optional. Persistence configuration parameters
     * 
     */
    @InputImport(name="persistenceConfig")
    private final @Nullable Input<PersistenceConfigArgs> persistenceConfig;

    public Input<PersistenceConfigArgs> getPersistenceConfig() {
        return this.persistenceConfig == null ? Input.empty() : this.persistenceConfig;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Optional. Read replica mode. Can only be specified when trying to create the instance.
     * 
     */
    @InputImport(name="readReplicasMode")
    private final @Nullable Input<InstanceReadReplicasMode> readReplicasMode;

    public Input<InstanceReadReplicasMode> getReadReplicasMode() {
        return this.readReplicasMode == null ? Input.empty() : this.readReplicasMode;
    }

    /**
     * Optional. Redis configuration parameters, according to http://redis.io/topics/config. Currently, the only supported parameters are: Redis version 3.2 and newer: * maxmemory-policy * notify-keyspace-events Redis version 4.0 and newer: * activedefrag * lfu-decay-time * lfu-log-factor * maxmemory-gb Redis version 5.0 and newer: * stream-node-max-bytes * stream-node-max-entries
     * 
     */
    @InputImport(name="redisConfigs")
    private final @Nullable Input<Map<String,String>> redisConfigs;

    public Input<Map<String,String>> getRedisConfigs() {
        return this.redisConfigs == null ? Input.empty() : this.redisConfigs;
    }

    /**
     * Optional. The version of Redis software. If not provided, latest supported version will be used. Currently, the supported values are: * `REDIS_3_2` for Redis 3.2 compatibility * `REDIS_4_0` for Redis 4.0 compatibility (default) * `REDIS_5_0` for Redis 5.0 compatibility * `REDIS_6_X` for Redis 6.x compatibility
     * 
     */
    @InputImport(name="redisVersion")
    private final @Nullable Input<String> redisVersion;

    public Input<String> getRedisVersion() {
        return this.redisVersion == null ? Input.empty() : this.redisVersion;
    }

    /**
     * Optional. The number of replica nodes. The valid range for the Standard Tier with read replicas enabled is [1-5] and defaults to 2. If read replicas are not enabled for a Standard Tier instance, the only valid value is 1 and the default is 1. The valid value for basic tier is 0 and the default is also 0.
     * 
     */
    @InputImport(name="replicaCount")
    private final @Nullable Input<Integer> replicaCount;

    public Input<Integer> getReplicaCount() {
        return this.replicaCount == null ? Input.empty() : this.replicaCount;
    }

    /**
     * Optional. For DIRECT_PEERING mode, the CIDR range of internal addresses that are reserved for this instance. Range must be unique and non-overlapping with existing subnets in an authorized network. For PRIVATE_SERVICE_ACCESS mode, the name of one allocated IP address ranges associated with this private service access connection. If not provided, the service will choose an unused /29 block, for example, 10.0.0.0/29 or 192.168.0.0/29. For READ_REPLICAS_ENABLED the default block size is /28.
     * 
     */
    @InputImport(name="reservedIpRange")
    private final @Nullable Input<String> reservedIpRange;

    public Input<String> getReservedIpRange() {
        return this.reservedIpRange == null ? Input.empty() : this.reservedIpRange;
    }

    /**
     * Optional. Additional ip ranges for node placement, beyond those specified in reserved_ip_range. At most 1 secondary IP range is supported. The mask value must not exceed /28. Not supported for BASIC tier. Updates can only add new ranges, once added ranges cannot be changed or deleted. Values in this list cannot overlap with the reserved_ip_range. Not supported during instance creation.
     * 
     */
    @InputImport(name="secondaryIpRange")
    private final @Nullable Input<String> secondaryIpRange;

    public Input<String> getSecondaryIpRange() {
        return this.secondaryIpRange == null ? Input.empty() : this.secondaryIpRange;
    }

    /**
     * The service tier of the instance.
     * 
     */
    @InputImport(name="tier", required=true)
    private final Input<InstanceTier> tier;

    public Input<InstanceTier> getTier() {
        return this.tier;
    }

    /**
     * Optional. The TLS mode of the Redis instance. If not provided, TLS is disabled for the instance.
     * 
     */
    @InputImport(name="transitEncryptionMode")
    private final @Nullable Input<InstanceTransitEncryptionMode> transitEncryptionMode;

    public Input<InstanceTransitEncryptionMode> getTransitEncryptionMode() {
        return this.transitEncryptionMode == null ? Input.empty() : this.transitEncryptionMode;
    }

    public InstanceArgs(
        @Nullable Input<String> alternativeLocationId,
        @Nullable Input<Boolean> authEnabled,
        @Nullable Input<String> authorizedNetwork,
        @Nullable Input<InstanceConnectMode> connectMode,
        @Nullable Input<String> displayName,
        Input<String> instanceId,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<MaintenancePolicyArgs> maintenancePolicy,
        Input<Integer> memorySizeGb,
        @Nullable Input<String> name,
        @Nullable Input<PersistenceConfigArgs> persistenceConfig,
        @Nullable Input<String> project,
        @Nullable Input<InstanceReadReplicasMode> readReplicasMode,
        @Nullable Input<Map<String,String>> redisConfigs,
        @Nullable Input<String> redisVersion,
        @Nullable Input<Integer> replicaCount,
        @Nullable Input<String> reservedIpRange,
        @Nullable Input<String> secondaryIpRange,
        Input<InstanceTier> tier,
        @Nullable Input<InstanceTransitEncryptionMode> transitEncryptionMode) {
        this.alternativeLocationId = alternativeLocationId;
        this.authEnabled = authEnabled;
        this.authorizedNetwork = authorizedNetwork;
        this.connectMode = connectMode;
        this.displayName = displayName;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.labels = labels;
        this.location = location;
        this.maintenancePolicy = maintenancePolicy;
        this.memorySizeGb = Objects.requireNonNull(memorySizeGb, "expected parameter 'memorySizeGb' to be non-null");
        this.name = name;
        this.persistenceConfig = persistenceConfig;
        this.project = project;
        this.readReplicasMode = readReplicasMode;
        this.redisConfigs = redisConfigs;
        this.redisVersion = redisVersion;
        this.replicaCount = replicaCount;
        this.reservedIpRange = reservedIpRange;
        this.secondaryIpRange = secondaryIpRange;
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
        this.transitEncryptionMode = transitEncryptionMode;
    }

    private InstanceArgs() {
        this.alternativeLocationId = Input.empty();
        this.authEnabled = Input.empty();
        this.authorizedNetwork = Input.empty();
        this.connectMode = Input.empty();
        this.displayName = Input.empty();
        this.instanceId = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.maintenancePolicy = Input.empty();
        this.memorySizeGb = Input.empty();
        this.name = Input.empty();
        this.persistenceConfig = Input.empty();
        this.project = Input.empty();
        this.readReplicasMode = Input.empty();
        this.redisConfigs = Input.empty();
        this.redisVersion = Input.empty();
        this.replicaCount = Input.empty();
        this.reservedIpRange = Input.empty();
        this.secondaryIpRange = Input.empty();
        this.tier = Input.empty();
        this.transitEncryptionMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> alternativeLocationId;
        private @Nullable Input<Boolean> authEnabled;
        private @Nullable Input<String> authorizedNetwork;
        private @Nullable Input<InstanceConnectMode> connectMode;
        private @Nullable Input<String> displayName;
        private Input<String> instanceId;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<MaintenancePolicyArgs> maintenancePolicy;
        private Input<Integer> memorySizeGb;
        private @Nullable Input<String> name;
        private @Nullable Input<PersistenceConfigArgs> persistenceConfig;
        private @Nullable Input<String> project;
        private @Nullable Input<InstanceReadReplicasMode> readReplicasMode;
        private @Nullable Input<Map<String,String>> redisConfigs;
        private @Nullable Input<String> redisVersion;
        private @Nullable Input<Integer> replicaCount;
        private @Nullable Input<String> reservedIpRange;
        private @Nullable Input<String> secondaryIpRange;
        private Input<InstanceTier> tier;
        private @Nullable Input<InstanceTransitEncryptionMode> transitEncryptionMode;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternativeLocationId = defaults.alternativeLocationId;
    	      this.authEnabled = defaults.authEnabled;
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.connectMode = defaults.connectMode;
    	      this.displayName = defaults.displayName;
    	      this.instanceId = defaults.instanceId;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.maintenancePolicy = defaults.maintenancePolicy;
    	      this.memorySizeGb = defaults.memorySizeGb;
    	      this.name = defaults.name;
    	      this.persistenceConfig = defaults.persistenceConfig;
    	      this.project = defaults.project;
    	      this.readReplicasMode = defaults.readReplicasMode;
    	      this.redisConfigs = defaults.redisConfigs;
    	      this.redisVersion = defaults.redisVersion;
    	      this.replicaCount = defaults.replicaCount;
    	      this.reservedIpRange = defaults.reservedIpRange;
    	      this.secondaryIpRange = defaults.secondaryIpRange;
    	      this.tier = defaults.tier;
    	      this.transitEncryptionMode = defaults.transitEncryptionMode;
        }

        public Builder setAlternativeLocationId(@Nullable Input<String> alternativeLocationId) {
            this.alternativeLocationId = alternativeLocationId;
            return this;
        }

        public Builder setAlternativeLocationId(@Nullable String alternativeLocationId) {
            this.alternativeLocationId = Input.ofNullable(alternativeLocationId);
            return this;
        }

        public Builder setAuthEnabled(@Nullable Input<Boolean> authEnabled) {
            this.authEnabled = authEnabled;
            return this;
        }

        public Builder setAuthEnabled(@Nullable Boolean authEnabled) {
            this.authEnabled = Input.ofNullable(authEnabled);
            return this;
        }

        public Builder setAuthorizedNetwork(@Nullable Input<String> authorizedNetwork) {
            this.authorizedNetwork = authorizedNetwork;
            return this;
        }

        public Builder setAuthorizedNetwork(@Nullable String authorizedNetwork) {
            this.authorizedNetwork = Input.ofNullable(authorizedNetwork);
            return this;
        }

        public Builder setConnectMode(@Nullable Input<InstanceConnectMode> connectMode) {
            this.connectMode = connectMode;
            return this;
        }

        public Builder setConnectMode(@Nullable InstanceConnectMode connectMode) {
            this.connectMode = Input.ofNullable(connectMode);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setInstanceId(Input<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Input.of(Objects.requireNonNull(instanceId));
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMaintenancePolicy(@Nullable Input<MaintenancePolicyArgs> maintenancePolicy) {
            this.maintenancePolicy = maintenancePolicy;
            return this;
        }

        public Builder setMaintenancePolicy(@Nullable MaintenancePolicyArgs maintenancePolicy) {
            this.maintenancePolicy = Input.ofNullable(maintenancePolicy);
            return this;
        }

        public Builder setMemorySizeGb(Input<Integer> memorySizeGb) {
            this.memorySizeGb = Objects.requireNonNull(memorySizeGb);
            return this;
        }

        public Builder setMemorySizeGb(Integer memorySizeGb) {
            this.memorySizeGb = Input.of(Objects.requireNonNull(memorySizeGb));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPersistenceConfig(@Nullable Input<PersistenceConfigArgs> persistenceConfig) {
            this.persistenceConfig = persistenceConfig;
            return this;
        }

        public Builder setPersistenceConfig(@Nullable PersistenceConfigArgs persistenceConfig) {
            this.persistenceConfig = Input.ofNullable(persistenceConfig);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setReadReplicasMode(@Nullable Input<InstanceReadReplicasMode> readReplicasMode) {
            this.readReplicasMode = readReplicasMode;
            return this;
        }

        public Builder setReadReplicasMode(@Nullable InstanceReadReplicasMode readReplicasMode) {
            this.readReplicasMode = Input.ofNullable(readReplicasMode);
            return this;
        }

        public Builder setRedisConfigs(@Nullable Input<Map<String,String>> redisConfigs) {
            this.redisConfigs = redisConfigs;
            return this;
        }

        public Builder setRedisConfigs(@Nullable Map<String,String> redisConfigs) {
            this.redisConfigs = Input.ofNullable(redisConfigs);
            return this;
        }

        public Builder setRedisVersion(@Nullable Input<String> redisVersion) {
            this.redisVersion = redisVersion;
            return this;
        }

        public Builder setRedisVersion(@Nullable String redisVersion) {
            this.redisVersion = Input.ofNullable(redisVersion);
            return this;
        }

        public Builder setReplicaCount(@Nullable Input<Integer> replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }

        public Builder setReplicaCount(@Nullable Integer replicaCount) {
            this.replicaCount = Input.ofNullable(replicaCount);
            return this;
        }

        public Builder setReservedIpRange(@Nullable Input<String> reservedIpRange) {
            this.reservedIpRange = reservedIpRange;
            return this;
        }

        public Builder setReservedIpRange(@Nullable String reservedIpRange) {
            this.reservedIpRange = Input.ofNullable(reservedIpRange);
            return this;
        }

        public Builder setSecondaryIpRange(@Nullable Input<String> secondaryIpRange) {
            this.secondaryIpRange = secondaryIpRange;
            return this;
        }

        public Builder setSecondaryIpRange(@Nullable String secondaryIpRange) {
            this.secondaryIpRange = Input.ofNullable(secondaryIpRange);
            return this;
        }

        public Builder setTier(Input<InstanceTier> tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }

        public Builder setTier(InstanceTier tier) {
            this.tier = Input.of(Objects.requireNonNull(tier));
            return this;
        }

        public Builder setTransitEncryptionMode(@Nullable Input<InstanceTransitEncryptionMode> transitEncryptionMode) {
            this.transitEncryptionMode = transitEncryptionMode;
            return this;
        }

        public Builder setTransitEncryptionMode(@Nullable InstanceTransitEncryptionMode transitEncryptionMode) {
            this.transitEncryptionMode = Input.ofNullable(transitEncryptionMode);
            return this;
        }

        public InstanceArgs build() {
            return new InstanceArgs(alternativeLocationId, authEnabled, authorizedNetwork, connectMode, displayName, instanceId, labels, location, maintenancePolicy, memorySizeGb, name, persistenceConfig, project, readReplicasMode, redisConfigs, redisVersion, replicaCount, reservedIpRange, secondaryIpRange, tier, transitEncryptionMode);
        }
    }
}
