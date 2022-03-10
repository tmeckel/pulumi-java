// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.InstancePrivateIpv6GoogleAccess;
import io.pulumi.googlenative.compute_v1.inputs.AcceleratorConfigArgs;
import io.pulumi.googlenative.compute_v1.inputs.AdvancedMachineFeaturesArgs;
import io.pulumi.googlenative.compute_v1.inputs.AttachedDiskArgs;
import io.pulumi.googlenative.compute_v1.inputs.ConfidentialInstanceConfigArgs;
import io.pulumi.googlenative.compute_v1.inputs.CustomerEncryptionKeyArgs;
import io.pulumi.googlenative.compute_v1.inputs.DisplayDeviceArgs;
import io.pulumi.googlenative.compute_v1.inputs.MetadataArgs;
import io.pulumi.googlenative.compute_v1.inputs.NetworkInterfaceArgs;
import io.pulumi.googlenative.compute_v1.inputs.NetworkPerformanceConfigArgs;
import io.pulumi.googlenative.compute_v1.inputs.ReservationAffinityArgs;
import io.pulumi.googlenative.compute_v1.inputs.SchedulingArgs;
import io.pulumi.googlenative.compute_v1.inputs.ServiceAccountArgs;
import io.pulumi.googlenative.compute_v1.inputs.ShieldedInstanceConfigArgs;
import io.pulumi.googlenative.compute_v1.inputs.ShieldedInstanceIntegrityPolicyArgs;
import io.pulumi.googlenative.compute_v1.inputs.TagsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * Controls for advanced machine-related behavior features.
     * 
     */
    @InputImport(name="advancedMachineFeatures")
      private final @Nullable Input<AdvancedMachineFeaturesArgs> advancedMachineFeatures;

    public Input<AdvancedMachineFeaturesArgs> getAdvancedMachineFeatures() {
        return this.advancedMachineFeatures == null ? Input.empty() : this.advancedMachineFeatures;
    }

    /**
     * Allows this instance to send and receive packets with non-matching destination or source IPs. This is required if you plan to use this instance to forward routes. For more information, see Enabling IP Forwarding .
     * 
     */
    @InputImport(name="canIpForward")
      private final @Nullable Input<Boolean> canIpForward;

    public Input<Boolean> getCanIpForward() {
        return this.canIpForward == null ? Input.empty() : this.canIpForward;
    }

    @InputImport(name="confidentialInstanceConfig")
      private final @Nullable Input<ConfidentialInstanceConfigArgs> confidentialInstanceConfig;

    public Input<ConfidentialInstanceConfigArgs> getConfidentialInstanceConfig() {
        return this.confidentialInstanceConfig == null ? Input.empty() : this.confidentialInstanceConfig;
    }

    /**
     * Whether the resource should be protected against deletion.
     * 
     */
    @InputImport(name="deletionProtection")
      private final @Nullable Input<Boolean> deletionProtection;

    public Input<Boolean> getDeletionProtection() {
        return this.deletionProtection == null ? Input.empty() : this.deletionProtection;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Array of disks associated with this instance. Persistent disks must be created before you can assign them.
     * 
     */
    @InputImport(name="disks")
      private final @Nullable Input<List<AttachedDiskArgs>> disks;

    public Input<List<AttachedDiskArgs>> getDisks() {
        return this.disks == null ? Input.empty() : this.disks;
    }

    /**
     * Enables display device for the instance.
     * 
     */
    @InputImport(name="displayDevice")
      private final @Nullable Input<DisplayDeviceArgs> displayDevice;

    public Input<DisplayDeviceArgs> getDisplayDevice() {
        return this.displayDevice == null ? Input.empty() : this.displayDevice;
    }

    /**
     * A list of the type and count of accelerator cards attached to the instance.
     * 
     */
    @InputImport(name="guestAccelerators")
      private final @Nullable Input<List<AcceleratorConfigArgs>> guestAccelerators;

    public Input<List<AcceleratorConfigArgs>> getGuestAccelerators() {
        return this.guestAccelerators == null ? Input.empty() : this.guestAccelerators;
    }

    /**
     * Specifies the hostname of the instance. The specified hostname must be RFC1035 compliant. If hostname is not specified, the default hostname is [INSTANCE_NAME].c.[PROJECT_ID].internal when using the global DNS, and [INSTANCE_NAME].[ZONE].c.[PROJECT_ID].internal when using zonal DNS.
     * 
     */
    @InputImport(name="hostname")
      private final @Nullable Input<String> hostname;

    public Input<String> getHostname() {
        return this.hostname == null ? Input.empty() : this.hostname;
    }

    /**
     * Labels to apply to this instance. These can be later modified by the setLabels method.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Full or partial URL of the machine type resource to use for this instance, in the format: zones/zone/machineTypes/machine-type. This is provided by the client when the instance is created. For example, the following is a valid partial url to a predefined machine type: zones/us-central1-f/machineTypes/n1-standard-1 To create a custom machine type, provide a URL to a machine type in the following format, where CPUS is 1 or an even number up to 32 (2, 4, 6, ... 24, etc), and MEMORY is the total memory for this instance. Memory must be a multiple of 256 MB and must be supplied in MB (e.g. 5 GB of memory is 5120 MB): zones/zone/machineTypes/custom-CPUS-MEMORY For example: zones/us-central1-f/machineTypes/custom-4-5120 For a full list of restrictions, read the Specifications for custom machine types.
     * 
     */
    @InputImport(name="machineType")
      private final @Nullable Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType == null ? Input.empty() : this.machineType;
    }

    /**
     * The metadata key/value pairs assigned to this instance. This includes custom metadata and predefined keys.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<MetadataArgs> metadata;

    public Input<MetadataArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge".
     * 
     */
    @InputImport(name="minCpuPlatform")
      private final @Nullable Input<String> minCpuPlatform;

    public Input<String> getMinCpuPlatform() {
        return this.minCpuPlatform == null ? Input.empty() : this.minCpuPlatform;
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * An array of network configurations for this instance. These specify how interfaces are configured to interact with other network services, such as connecting to the internet. Multiple interfaces are supported per instance.
     * 
     */
    @InputImport(name="networkInterfaces")
      private final @Nullable Input<List<NetworkInterfaceArgs>> networkInterfaces;

    public Input<List<NetworkInterfaceArgs>> getNetworkInterfaces() {
        return this.networkInterfaces == null ? Input.empty() : this.networkInterfaces;
    }

    @InputImport(name="networkPerformanceConfig")
      private final @Nullable Input<NetworkPerformanceConfigArgs> networkPerformanceConfig;

    public Input<NetworkPerformanceConfigArgs> getNetworkPerformanceConfig() {
        return this.networkPerformanceConfig == null ? Input.empty() : this.networkPerformanceConfig;
    }

    /**
     * The private IPv6 google access type for the VM. If not specified, use INHERIT_FROM_SUBNETWORK as default.
     * 
     */
    @InputImport(name="privateIpv6GoogleAccess")
      private final @Nullable Input<InstancePrivateIpv6GoogleAccess> privateIpv6GoogleAccess;

    public Input<InstancePrivateIpv6GoogleAccess> getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess == null ? Input.empty() : this.privateIpv6GoogleAccess;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Specifies the reservations that this instance can consume from.
     * 
     */
    @InputImport(name="reservationAffinity")
      private final @Nullable Input<ReservationAffinityArgs> reservationAffinity;

    public Input<ReservationAffinityArgs> getReservationAffinity() {
        return this.reservationAffinity == null ? Input.empty() : this.reservationAffinity;
    }

    /**
     * Resource policies applied to this instance.
     * 
     */
    @InputImport(name="resourcePolicies")
      private final @Nullable Input<List<String>> resourcePolicies;

    public Input<List<String>> getResourcePolicies() {
        return this.resourcePolicies == null ? Input.empty() : this.resourcePolicies;
    }

    /**
     * Sets the scheduling options for this instance.
     * 
     */
    @InputImport(name="scheduling")
      private final @Nullable Input<SchedulingArgs> scheduling;

    public Input<SchedulingArgs> getScheduling() {
        return this.scheduling == null ? Input.empty() : this.scheduling;
    }

    /**
     * A list of service accounts, with their specified scopes, authorized for this instance. Only one service account per VM instance is supported. Service accounts generate access tokens that can be accessed through the metadata server and used to authenticate applications on the instance. See Service Accounts for more information.
     * 
     */
    @InputImport(name="serviceAccounts")
      private final @Nullable Input<List<ServiceAccountArgs>> serviceAccounts;

    public Input<List<ServiceAccountArgs>> getServiceAccounts() {
        return this.serviceAccounts == null ? Input.empty() : this.serviceAccounts;
    }

    @InputImport(name="shieldedInstanceConfig")
      private final @Nullable Input<ShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Input<ShieldedInstanceConfigArgs> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Input.empty() : this.shieldedInstanceConfig;
    }

    @InputImport(name="shieldedInstanceIntegrityPolicy")
      private final @Nullable Input<ShieldedInstanceIntegrityPolicyArgs> shieldedInstanceIntegrityPolicy;

    public Input<ShieldedInstanceIntegrityPolicyArgs> getShieldedInstanceIntegrityPolicy() {
        return this.shieldedInstanceIntegrityPolicy == null ? Input.empty() : this.shieldedInstanceIntegrityPolicy;
    }

    @InputImport(name="sourceInstanceTemplate")
      private final @Nullable Input<String> sourceInstanceTemplate;

    public Input<String> getSourceInstanceTemplate() {
        return this.sourceInstanceTemplate == null ? Input.empty() : this.sourceInstanceTemplate;
    }

    /**
     * Source machine image
     * 
     */
    @InputImport(name="sourceMachineImage")
      private final @Nullable Input<String> sourceMachineImage;

    public Input<String> getSourceMachineImage() {
        return this.sourceMachineImage == null ? Input.empty() : this.sourceMachineImage;
    }

    /**
     * Source machine image encryption key when creating an instance from a machine image.
     * 
     */
    @InputImport(name="sourceMachineImageEncryptionKey")
      private final @Nullable Input<CustomerEncryptionKeyArgs> sourceMachineImageEncryptionKey;

    public Input<CustomerEncryptionKeyArgs> getSourceMachineImageEncryptionKey() {
        return this.sourceMachineImageEncryptionKey == null ? Input.empty() : this.sourceMachineImageEncryptionKey;
    }

    /**
     * Tags to apply to this instance. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during instance creation. The tags can be later modified by the setTags method. Each tag within the list must comply with RFC1035. Multiple tags can be specified via the 'tags.items' field.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<TagsArgs> tags;

    public Input<TagsArgs> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="zone")
      private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public InstanceArgs(
        @Nullable Input<AdvancedMachineFeaturesArgs> advancedMachineFeatures,
        @Nullable Input<Boolean> canIpForward,
        @Nullable Input<ConfidentialInstanceConfigArgs> confidentialInstanceConfig,
        @Nullable Input<Boolean> deletionProtection,
        @Nullable Input<String> description,
        @Nullable Input<List<AttachedDiskArgs>> disks,
        @Nullable Input<DisplayDeviceArgs> displayDevice,
        @Nullable Input<List<AcceleratorConfigArgs>> guestAccelerators,
        @Nullable Input<String> hostname,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> machineType,
        @Nullable Input<MetadataArgs> metadata,
        @Nullable Input<String> minCpuPlatform,
        @Nullable Input<String> name,
        @Nullable Input<List<NetworkInterfaceArgs>> networkInterfaces,
        @Nullable Input<NetworkPerformanceConfigArgs> networkPerformanceConfig,
        @Nullable Input<InstancePrivateIpv6GoogleAccess> privateIpv6GoogleAccess,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<ReservationAffinityArgs> reservationAffinity,
        @Nullable Input<List<String>> resourcePolicies,
        @Nullable Input<SchedulingArgs> scheduling,
        @Nullable Input<List<ServiceAccountArgs>> serviceAccounts,
        @Nullable Input<ShieldedInstanceConfigArgs> shieldedInstanceConfig,
        @Nullable Input<ShieldedInstanceIntegrityPolicyArgs> shieldedInstanceIntegrityPolicy,
        @Nullable Input<String> sourceInstanceTemplate,
        @Nullable Input<String> sourceMachineImage,
        @Nullable Input<CustomerEncryptionKeyArgs> sourceMachineImageEncryptionKey,
        @Nullable Input<TagsArgs> tags,
        @Nullable Input<String> zone) {
        this.advancedMachineFeatures = advancedMachineFeatures;
        this.canIpForward = canIpForward;
        this.confidentialInstanceConfig = confidentialInstanceConfig;
        this.deletionProtection = deletionProtection;
        this.description = description;
        this.disks = disks;
        this.displayDevice = displayDevice;
        this.guestAccelerators = guestAccelerators;
        this.hostname = hostname;
        this.labels = labels;
        this.machineType = machineType;
        this.metadata = metadata;
        this.minCpuPlatform = minCpuPlatform;
        this.name = name;
        this.networkInterfaces = networkInterfaces;
        this.networkPerformanceConfig = networkPerformanceConfig;
        this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
        this.project = project;
        this.requestId = requestId;
        this.reservationAffinity = reservationAffinity;
        this.resourcePolicies = resourcePolicies;
        this.scheduling = scheduling;
        this.serviceAccounts = serviceAccounts;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.shieldedInstanceIntegrityPolicy = shieldedInstanceIntegrityPolicy;
        this.sourceInstanceTemplate = sourceInstanceTemplate;
        this.sourceMachineImage = sourceMachineImage;
        this.sourceMachineImageEncryptionKey = sourceMachineImageEncryptionKey;
        this.tags = tags;
        this.zone = zone;
    }

    private InstanceArgs() {
        this.advancedMachineFeatures = Input.empty();
        this.canIpForward = Input.empty();
        this.confidentialInstanceConfig = Input.empty();
        this.deletionProtection = Input.empty();
        this.description = Input.empty();
        this.disks = Input.empty();
        this.displayDevice = Input.empty();
        this.guestAccelerators = Input.empty();
        this.hostname = Input.empty();
        this.labels = Input.empty();
        this.machineType = Input.empty();
        this.metadata = Input.empty();
        this.minCpuPlatform = Input.empty();
        this.name = Input.empty();
        this.networkInterfaces = Input.empty();
        this.networkPerformanceConfig = Input.empty();
        this.privateIpv6GoogleAccess = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.reservationAffinity = Input.empty();
        this.resourcePolicies = Input.empty();
        this.scheduling = Input.empty();
        this.serviceAccounts = Input.empty();
        this.shieldedInstanceConfig = Input.empty();
        this.shieldedInstanceIntegrityPolicy = Input.empty();
        this.sourceInstanceTemplate = Input.empty();
        this.sourceMachineImage = Input.empty();
        this.sourceMachineImageEncryptionKey = Input.empty();
        this.tags = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AdvancedMachineFeaturesArgs> advancedMachineFeatures;
        private @Nullable Input<Boolean> canIpForward;
        private @Nullable Input<ConfidentialInstanceConfigArgs> confidentialInstanceConfig;
        private @Nullable Input<Boolean> deletionProtection;
        private @Nullable Input<String> description;
        private @Nullable Input<List<AttachedDiskArgs>> disks;
        private @Nullable Input<DisplayDeviceArgs> displayDevice;
        private @Nullable Input<List<AcceleratorConfigArgs>> guestAccelerators;
        private @Nullable Input<String> hostname;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> machineType;
        private @Nullable Input<MetadataArgs> metadata;
        private @Nullable Input<String> minCpuPlatform;
        private @Nullable Input<String> name;
        private @Nullable Input<List<NetworkInterfaceArgs>> networkInterfaces;
        private @Nullable Input<NetworkPerformanceConfigArgs> networkPerformanceConfig;
        private @Nullable Input<InstancePrivateIpv6GoogleAccess> privateIpv6GoogleAccess;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<ReservationAffinityArgs> reservationAffinity;
        private @Nullable Input<List<String>> resourcePolicies;
        private @Nullable Input<SchedulingArgs> scheduling;
        private @Nullable Input<List<ServiceAccountArgs>> serviceAccounts;
        private @Nullable Input<ShieldedInstanceConfigArgs> shieldedInstanceConfig;
        private @Nullable Input<ShieldedInstanceIntegrityPolicyArgs> shieldedInstanceIntegrityPolicy;
        private @Nullable Input<String> sourceInstanceTemplate;
        private @Nullable Input<String> sourceMachineImage;
        private @Nullable Input<CustomerEncryptionKeyArgs> sourceMachineImageEncryptionKey;
        private @Nullable Input<TagsArgs> tags;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedMachineFeatures = defaults.advancedMachineFeatures;
    	      this.canIpForward = defaults.canIpForward;
    	      this.confidentialInstanceConfig = defaults.confidentialInstanceConfig;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.description = defaults.description;
    	      this.disks = defaults.disks;
    	      this.displayDevice = defaults.displayDevice;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.hostname = defaults.hostname;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.name = defaults.name;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.networkPerformanceConfig = defaults.networkPerformanceConfig;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.scheduling = defaults.scheduling;
    	      this.serviceAccounts = defaults.serviceAccounts;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.shieldedInstanceIntegrityPolicy = defaults.shieldedInstanceIntegrityPolicy;
    	      this.sourceInstanceTemplate = defaults.sourceInstanceTemplate;
    	      this.sourceMachineImage = defaults.sourceMachineImage;
    	      this.sourceMachineImageEncryptionKey = defaults.sourceMachineImageEncryptionKey;
    	      this.tags = defaults.tags;
    	      this.zone = defaults.zone;
        }

        public Builder advancedMachineFeatures(@Nullable Input<AdvancedMachineFeaturesArgs> advancedMachineFeatures) {
            this.advancedMachineFeatures = advancedMachineFeatures;
            return this;
        }

        public Builder advancedMachineFeatures(@Nullable AdvancedMachineFeaturesArgs advancedMachineFeatures) {
            this.advancedMachineFeatures = Input.ofNullable(advancedMachineFeatures);
            return this;
        }

        public Builder canIpForward(@Nullable Input<Boolean> canIpForward) {
            this.canIpForward = canIpForward;
            return this;
        }

        public Builder canIpForward(@Nullable Boolean canIpForward) {
            this.canIpForward = Input.ofNullable(canIpForward);
            return this;
        }

        public Builder confidentialInstanceConfig(@Nullable Input<ConfidentialInstanceConfigArgs> confidentialInstanceConfig) {
            this.confidentialInstanceConfig = confidentialInstanceConfig;
            return this;
        }

        public Builder confidentialInstanceConfig(@Nullable ConfidentialInstanceConfigArgs confidentialInstanceConfig) {
            this.confidentialInstanceConfig = Input.ofNullable(confidentialInstanceConfig);
            return this;
        }

        public Builder deletionProtection(@Nullable Input<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        public Builder deletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Input.ofNullable(deletionProtection);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder disks(@Nullable Input<List<AttachedDiskArgs>> disks) {
            this.disks = disks;
            return this;
        }

        public Builder disks(@Nullable List<AttachedDiskArgs> disks) {
            this.disks = Input.ofNullable(disks);
            return this;
        }

        public Builder displayDevice(@Nullable Input<DisplayDeviceArgs> displayDevice) {
            this.displayDevice = displayDevice;
            return this;
        }

        public Builder displayDevice(@Nullable DisplayDeviceArgs displayDevice) {
            this.displayDevice = Input.ofNullable(displayDevice);
            return this;
        }

        public Builder guestAccelerators(@Nullable Input<List<AcceleratorConfigArgs>> guestAccelerators) {
            this.guestAccelerators = guestAccelerators;
            return this;
        }

        public Builder guestAccelerators(@Nullable List<AcceleratorConfigArgs> guestAccelerators) {
            this.guestAccelerators = Input.ofNullable(guestAccelerators);
            return this;
        }

        public Builder hostname(@Nullable Input<String> hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder hostname(@Nullable String hostname) {
            this.hostname = Input.ofNullable(hostname);
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder machineType(@Nullable Input<String> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder machineType(@Nullable String machineType) {
            this.machineType = Input.ofNullable(machineType);
            return this;
        }

        public Builder metadata(@Nullable Input<MetadataArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable MetadataArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder minCpuPlatform(@Nullable Input<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Input.ofNullable(minCpuPlatform);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder networkInterfaces(@Nullable Input<List<NetworkInterfaceArgs>> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder networkInterfaces(@Nullable List<NetworkInterfaceArgs> networkInterfaces) {
            this.networkInterfaces = Input.ofNullable(networkInterfaces);
            return this;
        }

        public Builder networkPerformanceConfig(@Nullable Input<NetworkPerformanceConfigArgs> networkPerformanceConfig) {
            this.networkPerformanceConfig = networkPerformanceConfig;
            return this;
        }

        public Builder networkPerformanceConfig(@Nullable NetworkPerformanceConfigArgs networkPerformanceConfig) {
            this.networkPerformanceConfig = Input.ofNullable(networkPerformanceConfig);
            return this;
        }

        public Builder privateIpv6GoogleAccess(@Nullable Input<InstancePrivateIpv6GoogleAccess> privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }

        public Builder privateIpv6GoogleAccess(@Nullable InstancePrivateIpv6GoogleAccess privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Input.ofNullable(privateIpv6GoogleAccess);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder requestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder reservationAffinity(@Nullable Input<ReservationAffinityArgs> reservationAffinity) {
            this.reservationAffinity = reservationAffinity;
            return this;
        }

        public Builder reservationAffinity(@Nullable ReservationAffinityArgs reservationAffinity) {
            this.reservationAffinity = Input.ofNullable(reservationAffinity);
            return this;
        }

        public Builder resourcePolicies(@Nullable Input<List<String>> resourcePolicies) {
            this.resourcePolicies = resourcePolicies;
            return this;
        }

        public Builder resourcePolicies(@Nullable List<String> resourcePolicies) {
            this.resourcePolicies = Input.ofNullable(resourcePolicies);
            return this;
        }

        public Builder scheduling(@Nullable Input<SchedulingArgs> scheduling) {
            this.scheduling = scheduling;
            return this;
        }

        public Builder scheduling(@Nullable SchedulingArgs scheduling) {
            this.scheduling = Input.ofNullable(scheduling);
            return this;
        }

        public Builder serviceAccounts(@Nullable Input<List<ServiceAccountArgs>> serviceAccounts) {
            this.serviceAccounts = serviceAccounts;
            return this;
        }

        public Builder serviceAccounts(@Nullable List<ServiceAccountArgs> serviceAccounts) {
            this.serviceAccounts = Input.ofNullable(serviceAccounts);
            return this;
        }

        public Builder shieldedInstanceConfig(@Nullable Input<ShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        public Builder shieldedInstanceConfig(@Nullable ShieldedInstanceConfigArgs shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Input.ofNullable(shieldedInstanceConfig);
            return this;
        }

        public Builder shieldedInstanceIntegrityPolicy(@Nullable Input<ShieldedInstanceIntegrityPolicyArgs> shieldedInstanceIntegrityPolicy) {
            this.shieldedInstanceIntegrityPolicy = shieldedInstanceIntegrityPolicy;
            return this;
        }

        public Builder shieldedInstanceIntegrityPolicy(@Nullable ShieldedInstanceIntegrityPolicyArgs shieldedInstanceIntegrityPolicy) {
            this.shieldedInstanceIntegrityPolicy = Input.ofNullable(shieldedInstanceIntegrityPolicy);
            return this;
        }

        public Builder sourceInstanceTemplate(@Nullable Input<String> sourceInstanceTemplate) {
            this.sourceInstanceTemplate = sourceInstanceTemplate;
            return this;
        }

        public Builder sourceInstanceTemplate(@Nullable String sourceInstanceTemplate) {
            this.sourceInstanceTemplate = Input.ofNullable(sourceInstanceTemplate);
            return this;
        }

        public Builder sourceMachineImage(@Nullable Input<String> sourceMachineImage) {
            this.sourceMachineImage = sourceMachineImage;
            return this;
        }

        public Builder sourceMachineImage(@Nullable String sourceMachineImage) {
            this.sourceMachineImage = Input.ofNullable(sourceMachineImage);
            return this;
        }

        public Builder sourceMachineImageEncryptionKey(@Nullable Input<CustomerEncryptionKeyArgs> sourceMachineImageEncryptionKey) {
            this.sourceMachineImageEncryptionKey = sourceMachineImageEncryptionKey;
            return this;
        }

        public Builder sourceMachineImageEncryptionKey(@Nullable CustomerEncryptionKeyArgs sourceMachineImageEncryptionKey) {
            this.sourceMachineImageEncryptionKey = Input.ofNullable(sourceMachineImageEncryptionKey);
            return this;
        }

        public Builder tags(@Nullable Input<TagsArgs> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable TagsArgs tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder zone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public InstanceArgs build() {
            return new InstanceArgs(advancedMachineFeatures, canIpForward, confidentialInstanceConfig, deletionProtection, description, disks, displayDevice, guestAccelerators, hostname, labels, machineType, metadata, minCpuPlatform, name, networkInterfaces, networkPerformanceConfig, privateIpv6GoogleAccess, project, requestId, reservationAffinity, resourcePolicies, scheduling, serviceAccounts, shieldedInstanceConfig, shieldedInstanceIntegrityPolicy, sourceInstanceTemplate, sourceMachineImage, sourceMachineImageEncryptionKey, tags, zone);
        }
    }
}
