// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.metastore_v1alpha.enums.ServiceDatabaseType;
import io.pulumi.googlenative.metastore_v1alpha.enums.ServiceReleaseChannel;
import io.pulumi.googlenative.metastore_v1alpha.enums.ServiceTier;
import io.pulumi.googlenative.metastore_v1alpha.inputs.EncryptionConfigArgs;
import io.pulumi.googlenative.metastore_v1alpha.inputs.HiveMetastoreConfigArgs;
import io.pulumi.googlenative.metastore_v1alpha.inputs.MaintenanceWindowArgs;
import io.pulumi.googlenative.metastore_v1alpha.inputs.MetadataIntegrationArgs;
import io.pulumi.googlenative.metastore_v1alpha.inputs.NetworkConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Immutable. The database type that the Metastore service stores its data.
     * 
     */
    @InputImport(name="databaseType")
    private final @Nullable Input<ServiceDatabaseType> databaseType;

    public Input<ServiceDatabaseType> getDatabaseType() {
        return this.databaseType == null ? Input.empty() : this.databaseType;
    }

    /**
     * Immutable. Information used to configure the Dataproc Metastore service to encrypt customer data at rest. Cannot be updated.
     * 
     */
    @InputImport(name="encryptionConfig")
    private final @Nullable Input<EncryptionConfigArgs> encryptionConfig;

    public Input<EncryptionConfigArgs> getEncryptionConfig() {
        return this.encryptionConfig == null ? Input.empty() : this.encryptionConfig;
    }

    /**
     * Configuration information specific to running Hive metastore software as the metastore service.
     * 
     */
    @InputImport(name="hiveMetastoreConfig")
    private final @Nullable Input<HiveMetastoreConfigArgs> hiveMetastoreConfig;

    public Input<HiveMetastoreConfigArgs> getHiveMetastoreConfig() {
        return this.hiveMetastoreConfig == null ? Input.empty() : this.hiveMetastoreConfig;
    }

    /**
     * User-defined labels for the metastore service.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The one hour maintenance window of the metastore service. This specifies when the service can be restarted for maintenance purposes in UTC time. Maintenance window is not needed for services with the SPANNER database type.
     * 
     */
    @InputImport(name="maintenanceWindow")
    private final @Nullable Input<MaintenanceWindowArgs> maintenanceWindow;

    public Input<MaintenanceWindowArgs> getMaintenanceWindow() {
        return this.maintenanceWindow == null ? Input.empty() : this.maintenanceWindow;
    }

    /**
     * The setting that defines how metastore metadata should be integrated with external services and systems.
     * 
     */
    @InputImport(name="metadataIntegration")
    private final @Nullable Input<MetadataIntegrationArgs> metadataIntegration;

    public Input<MetadataIntegrationArgs> getMetadataIntegration() {
        return this.metadataIntegration == null ? Input.empty() : this.metadataIntegration;
    }

    /**
     * Immutable. The relative resource name of the metastore service, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Immutable. The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:projects/{project_number}/global/networks/{network_id}.
     * 
     */
    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * Immutable. The configuration specifying the network settings for the Dataproc Metastore service.
     * 
     */
    @InputImport(name="networkConfig")
    private final @Nullable Input<NetworkConfigArgs> networkConfig;

    public Input<NetworkConfigArgs> getNetworkConfig() {
        return this.networkConfig == null ? Input.empty() : this.networkConfig;
    }

    /**
     * The TCP port at which the metastore service is reached. Default: 9083.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Immutable. The release channel of the service. If unspecified, defaults to STABLE.
     * 
     */
    @InputImport(name="releaseChannel")
    private final @Nullable Input<ServiceReleaseChannel> releaseChannel;

    public Input<ServiceReleaseChannel> getReleaseChannel() {
        return this.releaseChannel == null ? Input.empty() : this.releaseChannel;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    @InputImport(name="serviceId", required=true)
    private final Input<String> serviceId;

    public Input<String> getServiceId() {
        return this.serviceId;
    }

    /**
     * The tier of the service.
     * 
     */
    @InputImport(name="tier")
    private final @Nullable Input<ServiceTier> tier;

    public Input<ServiceTier> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    public ServiceArgs(
        @Nullable Input<ServiceDatabaseType> databaseType,
        @Nullable Input<EncryptionConfigArgs> encryptionConfig,
        @Nullable Input<HiveMetastoreConfigArgs> hiveMetastoreConfig,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<MaintenanceWindowArgs> maintenanceWindow,
        @Nullable Input<MetadataIntegrationArgs> metadataIntegration,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<NetworkConfigArgs> networkConfig,
        @Nullable Input<Integer> port,
        @Nullable Input<String> project,
        @Nullable Input<ServiceReleaseChannel> releaseChannel,
        @Nullable Input<String> requestId,
        Input<String> serviceId,
        @Nullable Input<ServiceTier> tier) {
        this.databaseType = databaseType;
        this.encryptionConfig = encryptionConfig;
        this.hiveMetastoreConfig = hiveMetastoreConfig;
        this.labels = labels;
        this.location = location;
        this.maintenanceWindow = maintenanceWindow;
        this.metadataIntegration = metadataIntegration;
        this.name = name;
        this.network = network;
        this.networkConfig = networkConfig;
        this.port = port;
        this.project = project;
        this.releaseChannel = releaseChannel;
        this.requestId = requestId;
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
        this.tier = tier;
    }

    private ServiceArgs() {
        this.databaseType = Input.empty();
        this.encryptionConfig = Input.empty();
        this.hiveMetastoreConfig = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.maintenanceWindow = Input.empty();
        this.metadataIntegration = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.networkConfig = Input.empty();
        this.port = Input.empty();
        this.project = Input.empty();
        this.releaseChannel = Input.empty();
        this.requestId = Input.empty();
        this.serviceId = Input.empty();
        this.tier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceDatabaseType> databaseType;
        private @Nullable Input<EncryptionConfigArgs> encryptionConfig;
        private @Nullable Input<HiveMetastoreConfigArgs> hiveMetastoreConfig;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<MaintenanceWindowArgs> maintenanceWindow;
        private @Nullable Input<MetadataIntegrationArgs> metadataIntegration;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<NetworkConfigArgs> networkConfig;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> project;
        private @Nullable Input<ServiceReleaseChannel> releaseChannel;
        private @Nullable Input<String> requestId;
        private Input<String> serviceId;
        private @Nullable Input<ServiceTier> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseType = defaults.databaseType;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.hiveMetastoreConfig = defaults.hiveMetastoreConfig;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.metadataIntegration = defaults.metadataIntegration;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkConfig = defaults.networkConfig;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
    	      this.releaseChannel = defaults.releaseChannel;
    	      this.requestId = defaults.requestId;
    	      this.serviceId = defaults.serviceId;
    	      this.tier = defaults.tier;
        }

        public Builder setDatabaseType(@Nullable Input<ServiceDatabaseType> databaseType) {
            this.databaseType = databaseType;
            return this;
        }

        public Builder setDatabaseType(@Nullable ServiceDatabaseType databaseType) {
            this.databaseType = Input.ofNullable(databaseType);
            return this;
        }

        public Builder setEncryptionConfig(@Nullable Input<EncryptionConfigArgs> encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }

        public Builder setEncryptionConfig(@Nullable EncryptionConfigArgs encryptionConfig) {
            this.encryptionConfig = Input.ofNullable(encryptionConfig);
            return this;
        }

        public Builder setHiveMetastoreConfig(@Nullable Input<HiveMetastoreConfigArgs> hiveMetastoreConfig) {
            this.hiveMetastoreConfig = hiveMetastoreConfig;
            return this;
        }

        public Builder setHiveMetastoreConfig(@Nullable HiveMetastoreConfigArgs hiveMetastoreConfig) {
            this.hiveMetastoreConfig = Input.ofNullable(hiveMetastoreConfig);
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

        public Builder setMaintenanceWindow(@Nullable Input<MaintenanceWindowArgs> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder setMaintenanceWindow(@Nullable MaintenanceWindowArgs maintenanceWindow) {
            this.maintenanceWindow = Input.ofNullable(maintenanceWindow);
            return this;
        }

        public Builder setMetadataIntegration(@Nullable Input<MetadataIntegrationArgs> metadataIntegration) {
            this.metadataIntegration = metadataIntegration;
            return this;
        }

        public Builder setMetadataIntegration(@Nullable MetadataIntegrationArgs metadataIntegration) {
            this.metadataIntegration = Input.ofNullable(metadataIntegration);
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

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setNetworkConfig(@Nullable Input<NetworkConfigArgs> networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public Builder setNetworkConfig(@Nullable NetworkConfigArgs networkConfig) {
            this.networkConfig = Input.ofNullable(networkConfig);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
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

        public Builder setReleaseChannel(@Nullable Input<ServiceReleaseChannel> releaseChannel) {
            this.releaseChannel = releaseChannel;
            return this;
        }

        public Builder setReleaseChannel(@Nullable ServiceReleaseChannel releaseChannel) {
            this.releaseChannel = Input.ofNullable(releaseChannel);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setServiceId(Input<String> serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }

        public Builder setServiceId(String serviceId) {
            this.serviceId = Input.of(Objects.requireNonNull(serviceId));
            return this;
        }

        public Builder setTier(@Nullable Input<ServiceTier> tier) {
            this.tier = tier;
            return this;
        }

        public Builder setTier(@Nullable ServiceTier tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }

        public ServiceArgs build() {
            return new ServiceArgs(databaseType, encryptionConfig, hiveMetastoreConfig, labels, location, maintenanceWindow, metadataIntegration, name, network, networkConfig, port, project, releaseChannel, requestId, serviceId, tier);
        }
    }
}
