// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.AcceleratorConfigResponse;
import io.pulumi.googlenative.compute_v1.inputs.AdvancedMachineFeaturesResponse;
import io.pulumi.googlenative.compute_v1.inputs.AttachedDiskResponse;
import io.pulumi.googlenative.compute_v1.inputs.ConfidentialInstanceConfigResponse;
import io.pulumi.googlenative.compute_v1.inputs.MetadataResponse;
import io.pulumi.googlenative.compute_v1.inputs.NetworkInterfaceResponse;
import io.pulumi.googlenative.compute_v1.inputs.NetworkPerformanceConfigResponse;
import io.pulumi.googlenative.compute_v1.inputs.ReservationAffinityResponse;
import io.pulumi.googlenative.compute_v1.inputs.SchedulingResponse;
import io.pulumi.googlenative.compute_v1.inputs.ServiceAccountResponse;
import io.pulumi.googlenative.compute_v1.inputs.ShieldedInstanceConfigResponse;
import io.pulumi.googlenative.compute_v1.inputs.TagsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class InstancePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstancePropertiesResponse Empty = new InstancePropertiesResponse();

    /**
     * Controls for advanced machine-related behavior features. Note that for MachineImage, this is not supported yet.
     * 
     */
    @InputImport(name="advancedMachineFeatures", required=true)
    private final AdvancedMachineFeaturesResponse advancedMachineFeatures;

    public AdvancedMachineFeaturesResponse getAdvancedMachineFeatures() {
        return this.advancedMachineFeatures;
    }

    /**
     * Enables instances created based on these properties to send packets with source IP addresses other than their own and receive packets with destination IP addresses other than their own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation for more information.
     * 
     */
    @InputImport(name="canIpForward", required=true)
    private final Boolean canIpForward;

    public Boolean getCanIpForward() {
        return this.canIpForward;
    }

    /**
     * Specifies the Confidential Instance options. Note that for MachineImage, this is not supported yet.
     * 
     */
    @InputImport(name="confidentialInstanceConfig", required=true)
    private final ConfidentialInstanceConfigResponse confidentialInstanceConfig;

    public ConfidentialInstanceConfigResponse getConfidentialInstanceConfig() {
        return this.confidentialInstanceConfig;
    }

    /**
     * An optional text description for the instances that are created from these properties.
     * 
     */
    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * An array of disks that are associated with the instances that are created from these properties.
     * 
     */
    @InputImport(name="disks", required=true)
    private final List<AttachedDiskResponse> disks;

    public List<AttachedDiskResponse> getDisks() {
        return this.disks;
    }

    /**
     * A list of guest accelerator cards' type and count to use for instances created from these properties.
     * 
     */
    @InputImport(name="guestAccelerators", required=true)
    private final List<AcceleratorConfigResponse> guestAccelerators;

    public List<AcceleratorConfigResponse> getGuestAccelerators() {
        return this.guestAccelerators;
    }

    /**
     * Labels to apply to instances that are created from these properties.
     * 
     */
    @InputImport(name="labels", required=true)
    private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    /**
     * The machine type to use for instances that are created from these properties.
     * 
     */
    @InputImport(name="machineType", required=true)
    private final String machineType;

    public String getMachineType() {
        return this.machineType;
    }

    /**
     * The metadata key/value pairs to assign to instances that are created from these properties. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
     * 
     */
    @InputImport(name="metadata", required=true)
    private final MetadataResponse metadata;

    public MetadataResponse getMetadata() {
        return this.metadata;
    }

    /**
     * Minimum cpu/platform to be used by instances. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more information, read Specifying a Minimum CPU Platform.
     * 
     */
    @InputImport(name="minCpuPlatform", required=true)
    private final String minCpuPlatform;

    public String getMinCpuPlatform() {
        return this.minCpuPlatform;
    }

    /**
     * An array of network access configurations for this interface.
     * 
     */
    @InputImport(name="networkInterfaces", required=true)
    private final List<NetworkInterfaceResponse> networkInterfaces;

    public List<NetworkInterfaceResponse> getNetworkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Note that for MachineImage, this is not supported yet.
     * 
     */
    @InputImport(name="networkPerformanceConfig", required=true)
    private final NetworkPerformanceConfigResponse networkPerformanceConfig;

    public NetworkPerformanceConfigResponse getNetworkPerformanceConfig() {
        return this.networkPerformanceConfig;
    }

    /**
     * The private IPv6 google access type for VMs. If not specified, use INHERIT_FROM_SUBNETWORK as default. Note that for MachineImage, this is not supported yet.
     * 
     */
    @InputImport(name="privateIpv6GoogleAccess", required=true)
    private final String privateIpv6GoogleAccess;

    public String getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess;
    }

    /**
     * Specifies the reservations that instances can consume from. Note that for MachineImage, this is not supported yet.
     * 
     */
    @InputImport(name="reservationAffinity", required=true)
    private final ReservationAffinityResponse reservationAffinity;

    public ReservationAffinityResponse getReservationAffinity() {
        return this.reservationAffinity;
    }

    /**
     * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT & PATCH) when empty.
     * 
     */
    @InputImport(name="resourceManagerTags", required=true)
    private final Map<String,String> resourceManagerTags;

    public Map<String,String> getResourceManagerTags() {
        return this.resourceManagerTags;
    }

    /**
     * Resource policies (names, not URLs) applied to instances created from these properties. Note that for MachineImage, this is not supported yet.
     * 
     */
    @InputImport(name="resourcePolicies", required=true)
    private final List<String> resourcePolicies;

    public List<String> getResourcePolicies() {
        return this.resourcePolicies;
    }

    /**
     * Specifies the scheduling options for the instances that are created from these properties.
     * 
     */
    @InputImport(name="scheduling", required=true)
    private final SchedulingResponse scheduling;

    public SchedulingResponse getScheduling() {
        return this.scheduling;
    }

    /**
     * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from these properties. Use metadata queries to obtain the access tokens for these instances.
     * 
     */
    @InputImport(name="serviceAccounts", required=true)
    private final List<ServiceAccountResponse> serviceAccounts;

    public List<ServiceAccountResponse> getServiceAccounts() {
        return this.serviceAccounts;
    }

    /**
     * Note that for MachineImage, this is not supported yet.
     * 
     */
    @InputImport(name="shieldedInstanceConfig", required=true)
    private final ShieldedInstanceConfigResponse shieldedInstanceConfig;

    public ShieldedInstanceConfigResponse getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }

    /**
     * A list of tags to apply to the instances that are created from these properties. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
     * 
     */
    @InputImport(name="tags", required=true)
    private final TagsResponse tags;

    public TagsResponse getTags() {
        return this.tags;
    }

    public InstancePropertiesResponse(
        AdvancedMachineFeaturesResponse advancedMachineFeatures,
        Boolean canIpForward,
        ConfidentialInstanceConfigResponse confidentialInstanceConfig,
        String description,
        List<AttachedDiskResponse> disks,
        List<AcceleratorConfigResponse> guestAccelerators,
        Map<String,String> labels,
        String machineType,
        MetadataResponse metadata,
        String minCpuPlatform,
        List<NetworkInterfaceResponse> networkInterfaces,
        NetworkPerformanceConfigResponse networkPerformanceConfig,
        String privateIpv6GoogleAccess,
        ReservationAffinityResponse reservationAffinity,
        Map<String,String> resourceManagerTags,
        List<String> resourcePolicies,
        SchedulingResponse scheduling,
        List<ServiceAccountResponse> serviceAccounts,
        ShieldedInstanceConfigResponse shieldedInstanceConfig,
        TagsResponse tags) {
        this.advancedMachineFeatures = Objects.requireNonNull(advancedMachineFeatures, "expected parameter 'advancedMachineFeatures' to be non-null");
        this.canIpForward = Objects.requireNonNull(canIpForward, "expected parameter 'canIpForward' to be non-null");
        this.confidentialInstanceConfig = Objects.requireNonNull(confidentialInstanceConfig, "expected parameter 'confidentialInstanceConfig' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.disks = Objects.requireNonNull(disks, "expected parameter 'disks' to be non-null");
        this.guestAccelerators = Objects.requireNonNull(guestAccelerators, "expected parameter 'guestAccelerators' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform, "expected parameter 'minCpuPlatform' to be non-null");
        this.networkInterfaces = Objects.requireNonNull(networkInterfaces, "expected parameter 'networkInterfaces' to be non-null");
        this.networkPerformanceConfig = Objects.requireNonNull(networkPerformanceConfig, "expected parameter 'networkPerformanceConfig' to be non-null");
        this.privateIpv6GoogleAccess = Objects.requireNonNull(privateIpv6GoogleAccess, "expected parameter 'privateIpv6GoogleAccess' to be non-null");
        this.reservationAffinity = Objects.requireNonNull(reservationAffinity, "expected parameter 'reservationAffinity' to be non-null");
        this.resourceManagerTags = Objects.requireNonNull(resourceManagerTags, "expected parameter 'resourceManagerTags' to be non-null");
        this.resourcePolicies = Objects.requireNonNull(resourcePolicies, "expected parameter 'resourcePolicies' to be non-null");
        this.scheduling = Objects.requireNonNull(scheduling, "expected parameter 'scheduling' to be non-null");
        this.serviceAccounts = Objects.requireNonNull(serviceAccounts, "expected parameter 'serviceAccounts' to be non-null");
        this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig, "expected parameter 'shieldedInstanceConfig' to be non-null");
        this.tags = Objects.requireNonNull(tags, "expected parameter 'tags' to be non-null");
    }

    private InstancePropertiesResponse() {
        this.advancedMachineFeatures = null;
        this.canIpForward = null;
        this.confidentialInstanceConfig = null;
        this.description = null;
        this.disks = List.of();
        this.guestAccelerators = List.of();
        this.labels = Map.of();
        this.machineType = null;
        this.metadata = null;
        this.minCpuPlatform = null;
        this.networkInterfaces = List.of();
        this.networkPerformanceConfig = null;
        this.privateIpv6GoogleAccess = null;
        this.reservationAffinity = null;
        this.resourceManagerTags = Map.of();
        this.resourcePolicies = List.of();
        this.scheduling = null;
        this.serviceAccounts = List.of();
        this.shieldedInstanceConfig = null;
        this.tags = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdvancedMachineFeaturesResponse advancedMachineFeatures;
        private Boolean canIpForward;
        private ConfidentialInstanceConfigResponse confidentialInstanceConfig;
        private String description;
        private List<AttachedDiskResponse> disks;
        private List<AcceleratorConfigResponse> guestAccelerators;
        private Map<String,String> labels;
        private String machineType;
        private MetadataResponse metadata;
        private String minCpuPlatform;
        private List<NetworkInterfaceResponse> networkInterfaces;
        private NetworkPerformanceConfigResponse networkPerformanceConfig;
        private String privateIpv6GoogleAccess;
        private ReservationAffinityResponse reservationAffinity;
        private Map<String,String> resourceManagerTags;
        private List<String> resourcePolicies;
        private SchedulingResponse scheduling;
        private List<ServiceAccountResponse> serviceAccounts;
        private ShieldedInstanceConfigResponse shieldedInstanceConfig;
        private TagsResponse tags;

        public Builder() {
    	      // Empty
        }

        public Builder(InstancePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedMachineFeatures = defaults.advancedMachineFeatures;
    	      this.canIpForward = defaults.canIpForward;
    	      this.confidentialInstanceConfig = defaults.confidentialInstanceConfig;
    	      this.description = defaults.description;
    	      this.disks = defaults.disks;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.networkPerformanceConfig = defaults.networkPerformanceConfig;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.resourceManagerTags = defaults.resourceManagerTags;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.scheduling = defaults.scheduling;
    	      this.serviceAccounts = defaults.serviceAccounts;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.tags = defaults.tags;
        }

        public Builder setAdvancedMachineFeatures(AdvancedMachineFeaturesResponse advancedMachineFeatures) {
            this.advancedMachineFeatures = Objects.requireNonNull(advancedMachineFeatures);
            return this;
        }

        public Builder setCanIpForward(Boolean canIpForward) {
            this.canIpForward = Objects.requireNonNull(canIpForward);
            return this;
        }

        public Builder setConfidentialInstanceConfig(ConfidentialInstanceConfigResponse confidentialInstanceConfig) {
            this.confidentialInstanceConfig = Objects.requireNonNull(confidentialInstanceConfig);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisks(List<AttachedDiskResponse> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }

        public Builder setGuestAccelerators(List<AcceleratorConfigResponse> guestAccelerators) {
            this.guestAccelerators = Objects.requireNonNull(guestAccelerators);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setMetadata(MetadataResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setMinCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }

        public Builder setNetworkInterfaces(List<NetworkInterfaceResponse> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }

        public Builder setNetworkPerformanceConfig(NetworkPerformanceConfigResponse networkPerformanceConfig) {
            this.networkPerformanceConfig = Objects.requireNonNull(networkPerformanceConfig);
            return this;
        }

        public Builder setPrivateIpv6GoogleAccess(String privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Objects.requireNonNull(privateIpv6GoogleAccess);
            return this;
        }

        public Builder setReservationAffinity(ReservationAffinityResponse reservationAffinity) {
            this.reservationAffinity = Objects.requireNonNull(reservationAffinity);
            return this;
        }

        public Builder setResourceManagerTags(Map<String,String> resourceManagerTags) {
            this.resourceManagerTags = Objects.requireNonNull(resourceManagerTags);
            return this;
        }

        public Builder setResourcePolicies(List<String> resourcePolicies) {
            this.resourcePolicies = Objects.requireNonNull(resourcePolicies);
            return this;
        }

        public Builder setScheduling(SchedulingResponse scheduling) {
            this.scheduling = Objects.requireNonNull(scheduling);
            return this;
        }

        public Builder setServiceAccounts(List<ServiceAccountResponse> serviceAccounts) {
            this.serviceAccounts = Objects.requireNonNull(serviceAccounts);
            return this;
        }

        public Builder setShieldedInstanceConfig(ShieldedInstanceConfigResponse shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig);
            return this;
        }

        public Builder setTags(TagsResponse tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public InstancePropertiesResponse build() {
            return new InstancePropertiesResponse(advancedMachineFeatures, canIpForward, confidentialInstanceConfig, description, disks, guestAccelerators, labels, machineType, metadata, minCpuPlatform, networkInterfaces, networkPerformanceConfig, privateIpv6GoogleAccess, reservationAffinity, resourceManagerTags, resourcePolicies, scheduling, serviceAccounts, shieldedInstanceConfig, tags);
        }
    }
}
