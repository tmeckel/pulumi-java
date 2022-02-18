// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datafusion_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datafusion_v1.enums.InstanceType;
import io.pulumi.googlenative.datafusion_v1.inputs.AcceleratorArgs;
import io.pulumi.googlenative.datafusion_v1.inputs.CryptoKeyConfigArgs;
import io.pulumi.googlenative.datafusion_v1.inputs.NetworkConfigArgs;
import io.pulumi.googlenative.datafusion_v1.inputs.VersionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * List of accelerators enabled for this CDF instance.
     * 
     */
    @InputImport(name="accelerators")
    private final @Nullable Input<List<AcceleratorArgs>> accelerators;

    public Input<List<AcceleratorArgs>> getAccelerators() {
        return this.accelerators == null ? Input.empty() : this.accelerators;
    }

    /**
     * Available versions that the instance can be upgraded to using UpdateInstanceRequest.
     * 
     */
    @InputImport(name="availableVersion")
    private final @Nullable Input<List<VersionArgs>> availableVersion;

    public Input<List<VersionArgs>> getAvailableVersion() {
        return this.availableVersion == null ? Input.empty() : this.availableVersion;
    }

    /**
     * The crypto key configuration. This field is used by the Customer-Managed Encryption Keys (CMEK) feature.
     * 
     */
    @InputImport(name="cryptoKeyConfig")
    private final @Nullable Input<CryptoKeyConfigArgs> cryptoKeyConfig;

    public Input<CryptoKeyConfigArgs> getCryptoKeyConfig() {
        return this.cryptoKeyConfig == null ? Input.empty() : this.cryptoKeyConfig;
    }

    /**
     * User-managed service account to set on Dataproc when Cloud Data Fusion creates Dataproc to run data processing pipelines. This allows users to have fine-grained access control on Dataproc's accesses to cloud resources.
     * 
     */
    @InputImport(name="dataprocServiceAccount")
    private final @Nullable Input<String> dataprocServiceAccount;

    public Input<String> getDataprocServiceAccount() {
        return this.dataprocServiceAccount == null ? Input.empty() : this.dataprocServiceAccount;
    }

    /**
     * A description of this instance.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Display name for an instance.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Option to enable granular role-based access control.
     * 
     */
    @InputImport(name="enableRbac")
    private final @Nullable Input<Boolean> enableRbac;

    public Input<Boolean> getEnableRbac() {
        return this.enableRbac == null ? Input.empty() : this.enableRbac;
    }

    /**
     * Option to enable Stackdriver Logging.
     * 
     */
    @InputImport(name="enableStackdriverLogging")
    private final @Nullable Input<Boolean> enableStackdriverLogging;

    public Input<Boolean> getEnableStackdriverLogging() {
        return this.enableStackdriverLogging == null ? Input.empty() : this.enableStackdriverLogging;
    }

    /**
     * Option to enable Stackdriver Monitoring.
     * 
     */
    @InputImport(name="enableStackdriverMonitoring")
    private final @Nullable Input<Boolean> enableStackdriverMonitoring;

    public Input<Boolean> getEnableStackdriverMonitoring() {
        return this.enableStackdriverMonitoring == null ? Input.empty() : this.enableStackdriverMonitoring;
    }

    @InputImport(name="instanceId", required=true)
    private final Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * The resource labels for instance to use to annotate any related underlying resources such as Compute Engine VMs. The character '=' is not allowed to be used within the labels.
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
     * Network configuration options. These are required when a private Data Fusion instance is to be created.
     * 
     */
    @InputImport(name="networkConfig")
    private final @Nullable Input<NetworkConfigArgs> networkConfig;

    public Input<NetworkConfigArgs> getNetworkConfig() {
        return this.networkConfig == null ? Input.empty() : this.networkConfig;
    }

    /**
     * Map of additional options used to configure the behavior of Data Fusion instance.
     * 
     */
    @InputImport(name="options")
    private final @Nullable Input<Map<String,String>> options;

    public Input<Map<String,String>> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    /**
     * Specifies whether the Data Fusion instance should be private. If set to true, all Data Fusion nodes will have private IP addresses and will not be able to access the public internet.
     * 
     */
    @InputImport(name="privateInstance")
    private final @Nullable Input<Boolean> privateInstance;

    public Input<Boolean> getPrivateInstance() {
        return this.privateInstance == null ? Input.empty() : this.privateInstance;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Instance type.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<InstanceType> type;

    public Input<InstanceType> getType() {
        return this.type;
    }

    /**
     * Current version of the Data Fusion. Only specifiable in Update.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    /**
     * Name of the zone in which the Data Fusion instance will be created. Only DEVELOPER instances use this field.
     * 
     */
    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public InstanceArgs(
        @Nullable Input<List<AcceleratorArgs>> accelerators,
        @Nullable Input<List<VersionArgs>> availableVersion,
        @Nullable Input<CryptoKeyConfigArgs> cryptoKeyConfig,
        @Nullable Input<String> dataprocServiceAccount,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<Boolean> enableRbac,
        @Nullable Input<Boolean> enableStackdriverLogging,
        @Nullable Input<Boolean> enableStackdriverMonitoring,
        Input<String> instanceId,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<NetworkConfigArgs> networkConfig,
        @Nullable Input<Map<String,String>> options,
        @Nullable Input<Boolean> privateInstance,
        @Nullable Input<String> project,
        Input<InstanceType> type,
        @Nullable Input<String> version,
        @Nullable Input<String> zone) {
        this.accelerators = accelerators;
        this.availableVersion = availableVersion;
        this.cryptoKeyConfig = cryptoKeyConfig;
        this.dataprocServiceAccount = dataprocServiceAccount;
        this.description = description;
        this.displayName = displayName;
        this.enableRbac = enableRbac;
        this.enableStackdriverLogging = enableStackdriverLogging;
        this.enableStackdriverMonitoring = enableStackdriverMonitoring;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.labels = labels;
        this.location = location;
        this.networkConfig = networkConfig;
        this.options = options;
        this.privateInstance = privateInstance;
        this.project = project;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.version = version;
        this.zone = zone;
    }

    private InstanceArgs() {
        this.accelerators = Input.empty();
        this.availableVersion = Input.empty();
        this.cryptoKeyConfig = Input.empty();
        this.dataprocServiceAccount = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.enableRbac = Input.empty();
        this.enableStackdriverLogging = Input.empty();
        this.enableStackdriverMonitoring = Input.empty();
        this.instanceId = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.networkConfig = Input.empty();
        this.options = Input.empty();
        this.privateInstance = Input.empty();
        this.project = Input.empty();
        this.type = Input.empty();
        this.version = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AcceleratorArgs>> accelerators;
        private @Nullable Input<List<VersionArgs>> availableVersion;
        private @Nullable Input<CryptoKeyConfigArgs> cryptoKeyConfig;
        private @Nullable Input<String> dataprocServiceAccount;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Boolean> enableRbac;
        private @Nullable Input<Boolean> enableStackdriverLogging;
        private @Nullable Input<Boolean> enableStackdriverMonitoring;
        private Input<String> instanceId;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<NetworkConfigArgs> networkConfig;
        private @Nullable Input<Map<String,String>> options;
        private @Nullable Input<Boolean> privateInstance;
        private @Nullable Input<String> project;
        private Input<InstanceType> type;
        private @Nullable Input<String> version;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.availableVersion = defaults.availableVersion;
    	      this.cryptoKeyConfig = defaults.cryptoKeyConfig;
    	      this.dataprocServiceAccount = defaults.dataprocServiceAccount;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enableRbac = defaults.enableRbac;
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
    	      this.enableStackdriverMonitoring = defaults.enableStackdriverMonitoring;
    	      this.instanceId = defaults.instanceId;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.networkConfig = defaults.networkConfig;
    	      this.options = defaults.options;
    	      this.privateInstance = defaults.privateInstance;
    	      this.project = defaults.project;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
    	      this.zone = defaults.zone;
        }

        public Builder setAccelerators(@Nullable Input<List<AcceleratorArgs>> accelerators) {
            this.accelerators = accelerators;
            return this;
        }

        public Builder setAccelerators(@Nullable List<AcceleratorArgs> accelerators) {
            this.accelerators = Input.ofNullable(accelerators);
            return this;
        }

        public Builder setAvailableVersion(@Nullable Input<List<VersionArgs>> availableVersion) {
            this.availableVersion = availableVersion;
            return this;
        }

        public Builder setAvailableVersion(@Nullable List<VersionArgs> availableVersion) {
            this.availableVersion = Input.ofNullable(availableVersion);
            return this;
        }

        public Builder setCryptoKeyConfig(@Nullable Input<CryptoKeyConfigArgs> cryptoKeyConfig) {
            this.cryptoKeyConfig = cryptoKeyConfig;
            return this;
        }

        public Builder setCryptoKeyConfig(@Nullable CryptoKeyConfigArgs cryptoKeyConfig) {
            this.cryptoKeyConfig = Input.ofNullable(cryptoKeyConfig);
            return this;
        }

        public Builder setDataprocServiceAccount(@Nullable Input<String> dataprocServiceAccount) {
            this.dataprocServiceAccount = dataprocServiceAccount;
            return this;
        }

        public Builder setDataprocServiceAccount(@Nullable String dataprocServiceAccount) {
            this.dataprocServiceAccount = Input.ofNullable(dataprocServiceAccount);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setEnableRbac(@Nullable Input<Boolean> enableRbac) {
            this.enableRbac = enableRbac;
            return this;
        }

        public Builder setEnableRbac(@Nullable Boolean enableRbac) {
            this.enableRbac = Input.ofNullable(enableRbac);
            return this;
        }

        public Builder setEnableStackdriverLogging(@Nullable Input<Boolean> enableStackdriverLogging) {
            this.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }

        public Builder setEnableStackdriverLogging(@Nullable Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Input.ofNullable(enableStackdriverLogging);
            return this;
        }

        public Builder setEnableStackdriverMonitoring(@Nullable Input<Boolean> enableStackdriverMonitoring) {
            this.enableStackdriverMonitoring = enableStackdriverMonitoring;
            return this;
        }

        public Builder setEnableStackdriverMonitoring(@Nullable Boolean enableStackdriverMonitoring) {
            this.enableStackdriverMonitoring = Input.ofNullable(enableStackdriverMonitoring);
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

        public Builder setNetworkConfig(@Nullable Input<NetworkConfigArgs> networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public Builder setNetworkConfig(@Nullable NetworkConfigArgs networkConfig) {
            this.networkConfig = Input.ofNullable(networkConfig);
            return this;
        }

        public Builder setOptions(@Nullable Input<Map<String,String>> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable Map<String,String> options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder setPrivateInstance(@Nullable Input<Boolean> privateInstance) {
            this.privateInstance = privateInstance;
            return this;
        }

        public Builder setPrivateInstance(@Nullable Boolean privateInstance) {
            this.privateInstance = Input.ofNullable(privateInstance);
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

        public Builder setType(Input<InstanceType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(InstanceType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public InstanceArgs build() {
            return new InstanceArgs(accelerators, availableVersion, cryptoKeyConfig, dataprocServiceAccount, description, displayName, enableRbac, enableStackdriverLogging, enableStackdriverMonitoring, instanceId, labels, location, networkConfig, options, privateInstance, project, type, version, zone);
        }
    }
}
