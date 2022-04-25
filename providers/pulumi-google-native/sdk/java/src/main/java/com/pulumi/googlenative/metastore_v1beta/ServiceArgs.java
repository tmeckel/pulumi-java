// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.metastore_v1beta.enums.ServiceDatabaseType;
import com.pulumi.googlenative.metastore_v1beta.enums.ServiceReleaseChannel;
import com.pulumi.googlenative.metastore_v1beta.enums.ServiceTier;
import com.pulumi.googlenative.metastore_v1beta.inputs.EncryptionConfigArgs;
import com.pulumi.googlenative.metastore_v1beta.inputs.HiveMetastoreConfigArgs;
import com.pulumi.googlenative.metastore_v1beta.inputs.MaintenanceWindowArgs;
import com.pulumi.googlenative.metastore_v1beta.inputs.MetadataIntegrationArgs;
import com.pulumi.googlenative.metastore_v1beta.inputs.NetworkConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Immutable. The database type that the Metastore service stores its data.
     * 
     */
    @Import(name="databaseType")
    private @Nullable Output<ServiceDatabaseType> databaseType;

    /**
     * @return Immutable. The database type that the Metastore service stores its data.
     * 
     */
    public Optional<Output<ServiceDatabaseType>> databaseType() {
        return Optional.ofNullable(this.databaseType);
    }

    /**
     * Immutable. Information used to configure the Dataproc Metastore service to encrypt customer data at rest. Cannot be updated.
     * 
     */
    @Import(name="encryptionConfig")
    private @Nullable Output<EncryptionConfigArgs> encryptionConfig;

    /**
     * @return Immutable. Information used to configure the Dataproc Metastore service to encrypt customer data at rest. Cannot be updated.
     * 
     */
    public Optional<Output<EncryptionConfigArgs>> encryptionConfig() {
        return Optional.ofNullable(this.encryptionConfig);
    }

    /**
     * Configuration information specific to running Hive metastore software as the metastore service.
     * 
     */
    @Import(name="hiveMetastoreConfig")
    private @Nullable Output<HiveMetastoreConfigArgs> hiveMetastoreConfig;

    /**
     * @return Configuration information specific to running Hive metastore software as the metastore service.
     * 
     */
    public Optional<Output<HiveMetastoreConfigArgs>> hiveMetastoreConfig() {
        return Optional.ofNullable(this.hiveMetastoreConfig);
    }

    /**
     * User-defined labels for the metastore service.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-defined labels for the metastore service.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The one hour maintenance window of the metastore service. This specifies when the service can be restarted for maintenance purposes in UTC time. Maintenance window is not needed for services with the SPANNER database type.
     * 
     */
    @Import(name="maintenanceWindow")
    private @Nullable Output<MaintenanceWindowArgs> maintenanceWindow;

    /**
     * @return The one hour maintenance window of the metastore service. This specifies when the service can be restarted for maintenance purposes in UTC time. Maintenance window is not needed for services with the SPANNER database type.
     * 
     */
    public Optional<Output<MaintenanceWindowArgs>> maintenanceWindow() {
        return Optional.ofNullable(this.maintenanceWindow);
    }

    /**
     * The setting that defines how metastore metadata should be integrated with external services and systems.
     * 
     */
    @Import(name="metadataIntegration")
    private @Nullable Output<MetadataIntegrationArgs> metadataIntegration;

    /**
     * @return The setting that defines how metastore metadata should be integrated with external services and systems.
     * 
     */
    public Optional<Output<MetadataIntegrationArgs>> metadataIntegration() {
        return Optional.ofNullable(this.metadataIntegration);
    }

    /**
     * Immutable. The relative resource name of the metastore service, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Immutable. The relative resource name of the metastore service, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Immutable. The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:projects/{project_number}/global/networks/{network_id}.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return Immutable. The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:projects/{project_number}/global/networks/{network_id}.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * Immutable. The configuration specifying the network settings for the Dataproc Metastore service.
     * 
     */
    @Import(name="networkConfig")
    private @Nullable Output<NetworkConfigArgs> networkConfig;

    /**
     * @return Immutable. The configuration specifying the network settings for the Dataproc Metastore service.
     * 
     */
    public Optional<Output<NetworkConfigArgs>> networkConfig() {
        return Optional.ofNullable(this.networkConfig);
    }

    /**
     * The TCP port at which the metastore service is reached. Default: 9083.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The TCP port at which the metastore service is reached. Default: 9083.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Immutable. The release channel of the service. If unspecified, defaults to STABLE.
     * 
     */
    @Import(name="releaseChannel")
    private @Nullable Output<ServiceReleaseChannel> releaseChannel;

    /**
     * @return Immutable. The release channel of the service. If unspecified, defaults to STABLE.
     * 
     */
    public Optional<Output<ServiceReleaseChannel>> releaseChannel() {
        return Optional.ofNullable(this.releaseChannel);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    public Output<String> serviceId() {
        return this.serviceId;
    }

    /**
     * The tier of the service.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<ServiceTier> tier;

    /**
     * @return The tier of the service.
     * 
     */
    public Optional<Output<ServiceTier>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private ServiceArgs() {}

    private ServiceArgs(ServiceArgs $) {
        this.databaseType = $.databaseType;
        this.encryptionConfig = $.encryptionConfig;
        this.hiveMetastoreConfig = $.hiveMetastoreConfig;
        this.labels = $.labels;
        this.location = $.location;
        this.maintenanceWindow = $.maintenanceWindow;
        this.metadataIntegration = $.metadataIntegration;
        this.name = $.name;
        this.network = $.network;
        this.networkConfig = $.networkConfig;
        this.port = $.port;
        this.project = $.project;
        this.releaseChannel = $.releaseChannel;
        this.requestId = $.requestId;
        this.serviceId = $.serviceId;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceArgs $;

        public Builder() {
            $ = new ServiceArgs();
        }

        public Builder(ServiceArgs defaults) {
            $ = new ServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseType Immutable. The database type that the Metastore service stores its data.
         * 
         * @return builder
         * 
         */
        public Builder databaseType(@Nullable Output<ServiceDatabaseType> databaseType) {
            $.databaseType = databaseType;
            return this;
        }

        /**
         * @param databaseType Immutable. The database type that the Metastore service stores its data.
         * 
         * @return builder
         * 
         */
        public Builder databaseType(ServiceDatabaseType databaseType) {
            return databaseType(Output.of(databaseType));
        }

        /**
         * @param encryptionConfig Immutable. Information used to configure the Dataproc Metastore service to encrypt customer data at rest. Cannot be updated.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfig(@Nullable Output<EncryptionConfigArgs> encryptionConfig) {
            $.encryptionConfig = encryptionConfig;
            return this;
        }

        /**
         * @param encryptionConfig Immutable. Information used to configure the Dataproc Metastore service to encrypt customer data at rest. Cannot be updated.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfig(EncryptionConfigArgs encryptionConfig) {
            return encryptionConfig(Output.of(encryptionConfig));
        }

        /**
         * @param hiveMetastoreConfig Configuration information specific to running Hive metastore software as the metastore service.
         * 
         * @return builder
         * 
         */
        public Builder hiveMetastoreConfig(@Nullable Output<HiveMetastoreConfigArgs> hiveMetastoreConfig) {
            $.hiveMetastoreConfig = hiveMetastoreConfig;
            return this;
        }

        /**
         * @param hiveMetastoreConfig Configuration information specific to running Hive metastore software as the metastore service.
         * 
         * @return builder
         * 
         */
        public Builder hiveMetastoreConfig(HiveMetastoreConfigArgs hiveMetastoreConfig) {
            return hiveMetastoreConfig(Output.of(hiveMetastoreConfig));
        }

        /**
         * @param labels User-defined labels for the metastore service.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels for the metastore service.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param maintenanceWindow The one hour maintenance window of the metastore service. This specifies when the service can be restarted for maintenance purposes in UTC time. Maintenance window is not needed for services with the SPANNER database type.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindow(@Nullable Output<MaintenanceWindowArgs> maintenanceWindow) {
            $.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * @param maintenanceWindow The one hour maintenance window of the metastore service. This specifies when the service can be restarted for maintenance purposes in UTC time. Maintenance window is not needed for services with the SPANNER database type.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindow(MaintenanceWindowArgs maintenanceWindow) {
            return maintenanceWindow(Output.of(maintenanceWindow));
        }

        /**
         * @param metadataIntegration The setting that defines how metastore metadata should be integrated with external services and systems.
         * 
         * @return builder
         * 
         */
        public Builder metadataIntegration(@Nullable Output<MetadataIntegrationArgs> metadataIntegration) {
            $.metadataIntegration = metadataIntegration;
            return this;
        }

        /**
         * @param metadataIntegration The setting that defines how metastore metadata should be integrated with external services and systems.
         * 
         * @return builder
         * 
         */
        public Builder metadataIntegration(MetadataIntegrationArgs metadataIntegration) {
            return metadataIntegration(Output.of(metadataIntegration));
        }

        /**
         * @param name Immutable. The relative resource name of the metastore service, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Immutable. The relative resource name of the metastore service, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network Immutable. The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:projects/{project_number}/global/networks/{network_id}.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Immutable. The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:projects/{project_number}/global/networks/{network_id}.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param networkConfig Immutable. The configuration specifying the network settings for the Dataproc Metastore service.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(@Nullable Output<NetworkConfigArgs> networkConfig) {
            $.networkConfig = networkConfig;
            return this;
        }

        /**
         * @param networkConfig Immutable. The configuration specifying the network settings for the Dataproc Metastore service.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(NetworkConfigArgs networkConfig) {
            return networkConfig(Output.of(networkConfig));
        }

        /**
         * @param port The TCP port at which the metastore service is reached. Default: 9083.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The TCP port at which the metastore service is reached. Default: 9083.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param releaseChannel Immutable. The release channel of the service. If unspecified, defaults to STABLE.
         * 
         * @return builder
         * 
         */
        public Builder releaseChannel(@Nullable Output<ServiceReleaseChannel> releaseChannel) {
            $.releaseChannel = releaseChannel;
            return this;
        }

        /**
         * @param releaseChannel Immutable. The release channel of the service. If unspecified, defaults to STABLE.
         * 
         * @return builder
         * 
         */
        public Builder releaseChannel(ServiceReleaseChannel releaseChannel) {
            return releaseChannel(Output.of(releaseChannel));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        /**
         * @param tier The tier of the service.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<ServiceTier> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The tier of the service.
         * 
         * @return builder
         * 
         */
        public Builder tier(ServiceTier tier) {
            return tier(Output.of(tier));
        }

        public ServiceArgs build() {
            $.serviceId = Objects.requireNonNull($.serviceId, "expected parameter 'serviceId' to be non-null");
            return $;
        }
    }

}
