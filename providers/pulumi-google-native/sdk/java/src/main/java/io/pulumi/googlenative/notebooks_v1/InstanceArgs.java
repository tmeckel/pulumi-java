// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.notebooks_v1.enums.InstanceBootDiskType;
import io.pulumi.googlenative.notebooks_v1.enums.InstanceDataDiskType;
import io.pulumi.googlenative.notebooks_v1.enums.InstanceDiskEncryption;
import io.pulumi.googlenative.notebooks_v1.enums.InstanceNicType;
import io.pulumi.googlenative.notebooks_v1.inputs.AcceleratorConfigArgs;
import io.pulumi.googlenative.notebooks_v1.inputs.ContainerImageArgs;
import io.pulumi.googlenative.notebooks_v1.inputs.ReservationAffinityArgs;
import io.pulumi.googlenative.notebooks_v1.inputs.ShieldedInstanceConfigArgs;
import io.pulumi.googlenative.notebooks_v1.inputs.UpgradeHistoryEntryArgs;
import io.pulumi.googlenative.notebooks_v1.inputs.VmImageArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The hardware accelerator used on this instance. If you use accelerators, make sure that your configuration has [enough vCPUs and memory to support the `machine_type` you have selected](/compute/docs/gpus/#gpus-list).
     * 
     */
    @InputImport(name="acceleratorConfig")
      private final @Nullable Input<AcceleratorConfigArgs> acceleratorConfig;

    public Input<AcceleratorConfigArgs> getAcceleratorConfig() {
        return this.acceleratorConfig == null ? Input.empty() : this.acceleratorConfig;
    }

    /**
     * Input only. The size of the boot disk in GB attached to this instance, up to a maximum of 64000 GB (64 TB). The minimum recommended value is 100 GB. If not specified, this defaults to 100.
     * 
     */
    @InputImport(name="bootDiskSizeGb")
      private final @Nullable Input<String> bootDiskSizeGb;

    public Input<String> getBootDiskSizeGb() {
        return this.bootDiskSizeGb == null ? Input.empty() : this.bootDiskSizeGb;
    }

    /**
     * Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
     * 
     */
    @InputImport(name="bootDiskType")
      private final @Nullable Input<InstanceBootDiskType> bootDiskType;

    public Input<InstanceBootDiskType> getBootDiskType() {
        return this.bootDiskType == null ? Input.empty() : this.bootDiskType;
    }

    /**
     * Use a container image to start the notebook instance.
     * 
     */
    @InputImport(name="containerImage")
      private final @Nullable Input<ContainerImageArgs> containerImage;

    public Input<ContainerImageArgs> getContainerImage() {
        return this.containerImage == null ? Input.empty() : this.containerImage;
    }

    /**
     * Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we'll automatically choose from official GPU drivers.
     * 
     */
    @InputImport(name="customGpuDriverPath")
      private final @Nullable Input<String> customGpuDriverPath;

    public Input<String> getCustomGpuDriverPath() {
        return this.customGpuDriverPath == null ? Input.empty() : this.customGpuDriverPath;
    }

    /**
     * Input only. The size of the data disk in GB attached to this instance, up to a maximum of 64000 GB (64 TB). You can choose the size of the data disk based on how big your notebooks and data are. If not specified, this defaults to 100.
     * 
     */
    @InputImport(name="dataDiskSizeGb")
      private final @Nullable Input<String> dataDiskSizeGb;

    public Input<String> getDataDiskSizeGb() {
        return this.dataDiskSizeGb == null ? Input.empty() : this.dataDiskSizeGb;
    }

    /**
     * Input only. The type of the data disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
     * 
     */
    @InputImport(name="dataDiskType")
      private final @Nullable Input<InstanceDataDiskType> dataDiskType;

    public Input<InstanceDataDiskType> getDataDiskType() {
        return this.dataDiskType == null ? Input.empty() : this.dataDiskType;
    }

    /**
     * Input only. Disk encryption method used on the boot and data disks, defaults to GMEK.
     * 
     */
    @InputImport(name="diskEncryption")
      private final @Nullable Input<InstanceDiskEncryption> diskEncryption;

    public Input<InstanceDiskEncryption> getDiskEncryption() {
        return this.diskEncryption == null ? Input.empty() : this.diskEncryption;
    }

    /**
     * Whether the end user authorizes Google Cloud to install GPU driver on this instance. If this field is empty or set to false, the GPU driver won't be installed. Only applicable to instances with GPUs.
     * 
     */
    @InputImport(name="installGpuDriver")
      private final @Nullable Input<Boolean> installGpuDriver;

    public Input<Boolean> getInstallGpuDriver() {
        return this.installGpuDriver == null ? Input.empty() : this.installGpuDriver;
    }

    @InputImport(name="instanceId", required=true)
      private final Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * Input only. The owner of this instance after creation. Format: `alias@example.com` Currently supports one owner only. If not specified, all of the service account users of your VM instance's service account can use the instance.
     * 
     */
    @InputImport(name="instanceOwners")
      private final @Nullable Input<List<String>> instanceOwners;

    public Input<List<String>> getInstanceOwners() {
        return this.instanceOwners == null ? Input.empty() : this.instanceOwners;
    }

    /**
     * Input only. The KMS key used to encrypt the disks, only applicable if disk_encryption is CMEK. Format: `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}` Learn more about [using your own encryption keys](/kms/docs/quickstart).
     * 
     */
    @InputImport(name="kmsKey")
      private final @Nullable Input<String> kmsKey;

    public Input<String> getKmsKey() {
        return this.kmsKey == null ? Input.empty() : this.kmsKey;
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

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The [Compute Engine machine type](/compute/docs/machine-types) of this instance.
     * 
     */
    @InputImport(name="machineType", required=true)
      private final Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType;
    }

    /**
     * Custom metadata to apply to this instance.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * The name of the VPC that this instance is in. Format: `projects/{project_id}/global/networks/{network_id}`
     * 
     */
    @InputImport(name="network")
      private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    @InputImport(name="nicType")
      private final @Nullable Input<InstanceNicType> nicType;

    public Input<InstanceNicType> getNicType() {
        return this.nicType == null ? Input.empty() : this.nicType;
    }

    /**
     * If true, the notebook instance will not register with the proxy.
     * 
     */
    @InputImport(name="noProxyAccess")
      private final @Nullable Input<Boolean> noProxyAccess;

    public Input<Boolean> getNoProxyAccess() {
        return this.noProxyAccess == null ? Input.empty() : this.noProxyAccess;
    }

    /**
     * If true, no public IP will be assigned to this instance.
     * 
     */
    @InputImport(name="noPublicIp")
      private final @Nullable Input<Boolean> noPublicIp;

    public Input<Boolean> getNoPublicIp() {
        return this.noPublicIp == null ? Input.empty() : this.noPublicIp;
    }

    /**
     * Input only. If true, the data disk will not be auto deleted when deleting the instance.
     * 
     */
    @InputImport(name="noRemoveDataDisk")
      private final @Nullable Input<Boolean> noRemoveDataDisk;

    public Input<Boolean> getNoRemoveDataDisk() {
        return this.noRemoveDataDisk == null ? Input.empty() : this.noRemoveDataDisk;
    }

    /**
     * Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path (`gs://path-to-file/file-name`).
     * 
     */
    @InputImport(name="postStartupScript")
      private final @Nullable Input<String> postStartupScript;

    public Input<String> getPostStartupScript() {
        return this.postStartupScript == null ? Input.empty() : this.postStartupScript;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Optional. The optional reservation affinity. Setting this field will apply the specified [Zonal Compute Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources) to this notebook instance.
     * 
     */
    @InputImport(name="reservationAffinity")
      private final @Nullable Input<ReservationAffinityArgs> reservationAffinity;

    public Input<ReservationAffinityArgs> getReservationAffinity() {
        return this.reservationAffinity == null ? Input.empty() : this.reservationAffinity;
    }

    /**
     * The service account on this instance, giving access to other Google Cloud services. You can use any service account within the same project, but you must have the service account user permission to use the instance. If not specified, the [Compute Engine default service account](https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
     * 
     */
    @InputImport(name="serviceAccount")
      private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * Optional. The URIs of service account scopes to be included in Compute Engine instances. If not specified, the following [scopes](https://cloud.google.com/compute/docs/access/service-accounts#accesscopesiam) are defined: - https://www.googleapis.com/auth/cloud-platform - https://www.googleapis.com/auth/userinfo.email If not using default scopes, you need at least: https://www.googleapis.com/auth/compute
     * 
     */
    @InputImport(name="serviceAccountScopes")
      private final @Nullable Input<List<String>> serviceAccountScopes;

    public Input<List<String>> getServiceAccountScopes() {
        return this.serviceAccountScopes == null ? Input.empty() : this.serviceAccountScopes;
    }

    /**
     * Optional. Shielded VM configuration. [Images using supported Shielded VM features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm).
     * 
     */
    @InputImport(name="shieldedInstanceConfig")
      private final @Nullable Input<ShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Input<ShieldedInstanceConfigArgs> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Input.empty() : this.shieldedInstanceConfig;
    }

    /**
     * The name of the subnet that this instance is in. Format: `projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}`
     * 
     */
    @InputImport(name="subnet")
      private final @Nullable Input<String> subnet;

    public Input<String> getSubnet() {
        return this.subnet == null ? Input.empty() : this.subnet;
    }

    /**
     * Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<String>> tags;

    public Input<List<String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The upgrade history of this instance.
     * 
     */
    @InputImport(name="upgradeHistory")
      private final @Nullable Input<List<UpgradeHistoryEntryArgs>> upgradeHistory;

    public Input<List<UpgradeHistoryEntryArgs>> getUpgradeHistory() {
        return this.upgradeHistory == null ? Input.empty() : this.upgradeHistory;
    }

    /**
     * Use a Compute Engine VM image to start the notebook instance.
     * 
     */
    @InputImport(name="vmImage")
      private final @Nullable Input<VmImageArgs> vmImage;

    public Input<VmImageArgs> getVmImage() {
        return this.vmImage == null ? Input.empty() : this.vmImage;
    }

    public InstanceArgs(
        @Nullable Input<AcceleratorConfigArgs> acceleratorConfig,
        @Nullable Input<String> bootDiskSizeGb,
        @Nullable Input<InstanceBootDiskType> bootDiskType,
        @Nullable Input<ContainerImageArgs> containerImage,
        @Nullable Input<String> customGpuDriverPath,
        @Nullable Input<String> dataDiskSizeGb,
        @Nullable Input<InstanceDataDiskType> dataDiskType,
        @Nullable Input<InstanceDiskEncryption> diskEncryption,
        @Nullable Input<Boolean> installGpuDriver,
        Input<String> instanceId,
        @Nullable Input<List<String>> instanceOwners,
        @Nullable Input<String> kmsKey,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        Input<String> machineType,
        @Nullable Input<Map<String,String>> metadata,
        @Nullable Input<String> network,
        @Nullable Input<InstanceNicType> nicType,
        @Nullable Input<Boolean> noProxyAccess,
        @Nullable Input<Boolean> noPublicIp,
        @Nullable Input<Boolean> noRemoveDataDisk,
        @Nullable Input<String> postStartupScript,
        @Nullable Input<String> project,
        @Nullable Input<ReservationAffinityArgs> reservationAffinity,
        @Nullable Input<String> serviceAccount,
        @Nullable Input<List<String>> serviceAccountScopes,
        @Nullable Input<ShieldedInstanceConfigArgs> shieldedInstanceConfig,
        @Nullable Input<String> subnet,
        @Nullable Input<List<String>> tags,
        @Nullable Input<List<UpgradeHistoryEntryArgs>> upgradeHistory,
        @Nullable Input<VmImageArgs> vmImage) {
        this.acceleratorConfig = acceleratorConfig;
        this.bootDiskSizeGb = bootDiskSizeGb;
        this.bootDiskType = bootDiskType;
        this.containerImage = containerImage;
        this.customGpuDriverPath = customGpuDriverPath;
        this.dataDiskSizeGb = dataDiskSizeGb;
        this.dataDiskType = dataDiskType;
        this.diskEncryption = diskEncryption;
        this.installGpuDriver = installGpuDriver;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.instanceOwners = instanceOwners;
        this.kmsKey = kmsKey;
        this.labels = labels;
        this.location = location;
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.metadata = metadata;
        this.network = network;
        this.nicType = nicType;
        this.noProxyAccess = noProxyAccess;
        this.noPublicIp = noPublicIp;
        this.noRemoveDataDisk = noRemoveDataDisk;
        this.postStartupScript = postStartupScript;
        this.project = project;
        this.reservationAffinity = reservationAffinity;
        this.serviceAccount = serviceAccount;
        this.serviceAccountScopes = serviceAccountScopes;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.subnet = subnet;
        this.tags = tags;
        this.upgradeHistory = upgradeHistory;
        this.vmImage = vmImage;
    }

    private InstanceArgs() {
        this.acceleratorConfig = Input.empty();
        this.bootDiskSizeGb = Input.empty();
        this.bootDiskType = Input.empty();
        this.containerImage = Input.empty();
        this.customGpuDriverPath = Input.empty();
        this.dataDiskSizeGb = Input.empty();
        this.dataDiskType = Input.empty();
        this.diskEncryption = Input.empty();
        this.installGpuDriver = Input.empty();
        this.instanceId = Input.empty();
        this.instanceOwners = Input.empty();
        this.kmsKey = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.machineType = Input.empty();
        this.metadata = Input.empty();
        this.network = Input.empty();
        this.nicType = Input.empty();
        this.noProxyAccess = Input.empty();
        this.noPublicIp = Input.empty();
        this.noRemoveDataDisk = Input.empty();
        this.postStartupScript = Input.empty();
        this.project = Input.empty();
        this.reservationAffinity = Input.empty();
        this.serviceAccount = Input.empty();
        this.serviceAccountScopes = Input.empty();
        this.shieldedInstanceConfig = Input.empty();
        this.subnet = Input.empty();
        this.tags = Input.empty();
        this.upgradeHistory = Input.empty();
        this.vmImage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AcceleratorConfigArgs> acceleratorConfig;
        private @Nullable Input<String> bootDiskSizeGb;
        private @Nullable Input<InstanceBootDiskType> bootDiskType;
        private @Nullable Input<ContainerImageArgs> containerImage;
        private @Nullable Input<String> customGpuDriverPath;
        private @Nullable Input<String> dataDiskSizeGb;
        private @Nullable Input<InstanceDataDiskType> dataDiskType;
        private @Nullable Input<InstanceDiskEncryption> diskEncryption;
        private @Nullable Input<Boolean> installGpuDriver;
        private Input<String> instanceId;
        private @Nullable Input<List<String>> instanceOwners;
        private @Nullable Input<String> kmsKey;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private Input<String> machineType;
        private @Nullable Input<Map<String,String>> metadata;
        private @Nullable Input<String> network;
        private @Nullable Input<InstanceNicType> nicType;
        private @Nullable Input<Boolean> noProxyAccess;
        private @Nullable Input<Boolean> noPublicIp;
        private @Nullable Input<Boolean> noRemoveDataDisk;
        private @Nullable Input<String> postStartupScript;
        private @Nullable Input<String> project;
        private @Nullable Input<ReservationAffinityArgs> reservationAffinity;
        private @Nullable Input<String> serviceAccount;
        private @Nullable Input<List<String>> serviceAccountScopes;
        private @Nullable Input<ShieldedInstanceConfigArgs> shieldedInstanceConfig;
        private @Nullable Input<String> subnet;
        private @Nullable Input<List<String>> tags;
        private @Nullable Input<List<UpgradeHistoryEntryArgs>> upgradeHistory;
        private @Nullable Input<VmImageArgs> vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.bootDiskType = defaults.bootDiskType;
    	      this.containerImage = defaults.containerImage;
    	      this.customGpuDriverPath = defaults.customGpuDriverPath;
    	      this.dataDiskSizeGb = defaults.dataDiskSizeGb;
    	      this.dataDiskType = defaults.dataDiskType;
    	      this.diskEncryption = defaults.diskEncryption;
    	      this.installGpuDriver = defaults.installGpuDriver;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceOwners = defaults.instanceOwners;
    	      this.kmsKey = defaults.kmsKey;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.network = defaults.network;
    	      this.nicType = defaults.nicType;
    	      this.noProxyAccess = defaults.noProxyAccess;
    	      this.noPublicIp = defaults.noPublicIp;
    	      this.noRemoveDataDisk = defaults.noRemoveDataDisk;
    	      this.postStartupScript = defaults.postStartupScript;
    	      this.project = defaults.project;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceAccountScopes = defaults.serviceAccountScopes;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.subnet = defaults.subnet;
    	      this.tags = defaults.tags;
    	      this.upgradeHistory = defaults.upgradeHistory;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder acceleratorConfig(@Nullable Input<AcceleratorConfigArgs> acceleratorConfig) {
            this.acceleratorConfig = acceleratorConfig;
            return this;
        }

        public Builder acceleratorConfig(@Nullable AcceleratorConfigArgs acceleratorConfig) {
            this.acceleratorConfig = Input.ofNullable(acceleratorConfig);
            return this;
        }

        public Builder bootDiskSizeGb(@Nullable Input<String> bootDiskSizeGb) {
            this.bootDiskSizeGb = bootDiskSizeGb;
            return this;
        }

        public Builder bootDiskSizeGb(@Nullable String bootDiskSizeGb) {
            this.bootDiskSizeGb = Input.ofNullable(bootDiskSizeGb);
            return this;
        }

        public Builder bootDiskType(@Nullable Input<InstanceBootDiskType> bootDiskType) {
            this.bootDiskType = bootDiskType;
            return this;
        }

        public Builder bootDiskType(@Nullable InstanceBootDiskType bootDiskType) {
            this.bootDiskType = Input.ofNullable(bootDiskType);
            return this;
        }

        public Builder containerImage(@Nullable Input<ContainerImageArgs> containerImage) {
            this.containerImage = containerImage;
            return this;
        }

        public Builder containerImage(@Nullable ContainerImageArgs containerImage) {
            this.containerImage = Input.ofNullable(containerImage);
            return this;
        }

        public Builder customGpuDriverPath(@Nullable Input<String> customGpuDriverPath) {
            this.customGpuDriverPath = customGpuDriverPath;
            return this;
        }

        public Builder customGpuDriverPath(@Nullable String customGpuDriverPath) {
            this.customGpuDriverPath = Input.ofNullable(customGpuDriverPath);
            return this;
        }

        public Builder dataDiskSizeGb(@Nullable Input<String> dataDiskSizeGb) {
            this.dataDiskSizeGb = dataDiskSizeGb;
            return this;
        }

        public Builder dataDiskSizeGb(@Nullable String dataDiskSizeGb) {
            this.dataDiskSizeGb = Input.ofNullable(dataDiskSizeGb);
            return this;
        }

        public Builder dataDiskType(@Nullable Input<InstanceDataDiskType> dataDiskType) {
            this.dataDiskType = dataDiskType;
            return this;
        }

        public Builder dataDiskType(@Nullable InstanceDataDiskType dataDiskType) {
            this.dataDiskType = Input.ofNullable(dataDiskType);
            return this;
        }

        public Builder diskEncryption(@Nullable Input<InstanceDiskEncryption> diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }

        public Builder diskEncryption(@Nullable InstanceDiskEncryption diskEncryption) {
            this.diskEncryption = Input.ofNullable(diskEncryption);
            return this;
        }

        public Builder installGpuDriver(@Nullable Input<Boolean> installGpuDriver) {
            this.installGpuDriver = installGpuDriver;
            return this;
        }

        public Builder installGpuDriver(@Nullable Boolean installGpuDriver) {
            this.installGpuDriver = Input.ofNullable(installGpuDriver);
            return this;
        }

        public Builder instanceId(Input<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder instanceId(String instanceId) {
            this.instanceId = Input.of(Objects.requireNonNull(instanceId));
            return this;
        }

        public Builder instanceOwners(@Nullable Input<List<String>> instanceOwners) {
            this.instanceOwners = instanceOwners;
            return this;
        }

        public Builder instanceOwners(@Nullable List<String> instanceOwners) {
            this.instanceOwners = Input.ofNullable(instanceOwners);
            return this;
        }

        public Builder kmsKey(@Nullable Input<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }

        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = Input.ofNullable(kmsKey);
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

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder machineType(Input<String> machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder machineType(String machineType) {
            this.machineType = Input.of(Objects.requireNonNull(machineType));
            return this;
        }

        public Builder metadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder network(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder nicType(@Nullable Input<InstanceNicType> nicType) {
            this.nicType = nicType;
            return this;
        }

        public Builder nicType(@Nullable InstanceNicType nicType) {
            this.nicType = Input.ofNullable(nicType);
            return this;
        }

        public Builder noProxyAccess(@Nullable Input<Boolean> noProxyAccess) {
            this.noProxyAccess = noProxyAccess;
            return this;
        }

        public Builder noProxyAccess(@Nullable Boolean noProxyAccess) {
            this.noProxyAccess = Input.ofNullable(noProxyAccess);
            return this;
        }

        public Builder noPublicIp(@Nullable Input<Boolean> noPublicIp) {
            this.noPublicIp = noPublicIp;
            return this;
        }

        public Builder noPublicIp(@Nullable Boolean noPublicIp) {
            this.noPublicIp = Input.ofNullable(noPublicIp);
            return this;
        }

        public Builder noRemoveDataDisk(@Nullable Input<Boolean> noRemoveDataDisk) {
            this.noRemoveDataDisk = noRemoveDataDisk;
            return this;
        }

        public Builder noRemoveDataDisk(@Nullable Boolean noRemoveDataDisk) {
            this.noRemoveDataDisk = Input.ofNullable(noRemoveDataDisk);
            return this;
        }

        public Builder postStartupScript(@Nullable Input<String> postStartupScript) {
            this.postStartupScript = postStartupScript;
            return this;
        }

        public Builder postStartupScript(@Nullable String postStartupScript) {
            this.postStartupScript = Input.ofNullable(postStartupScript);
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

        public Builder reservationAffinity(@Nullable Input<ReservationAffinityArgs> reservationAffinity) {
            this.reservationAffinity = reservationAffinity;
            return this;
        }

        public Builder reservationAffinity(@Nullable ReservationAffinityArgs reservationAffinity) {
            this.reservationAffinity = Input.ofNullable(reservationAffinity);
            return this;
        }

        public Builder serviceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder serviceAccountScopes(@Nullable Input<List<String>> serviceAccountScopes) {
            this.serviceAccountScopes = serviceAccountScopes;
            return this;
        }

        public Builder serviceAccountScopes(@Nullable List<String> serviceAccountScopes) {
            this.serviceAccountScopes = Input.ofNullable(serviceAccountScopes);
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

        public Builder subnet(@Nullable Input<String> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder subnet(@Nullable String subnet) {
            this.subnet = Input.ofNullable(subnet);
            return this;
        }

        public Builder tags(@Nullable Input<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder upgradeHistory(@Nullable Input<List<UpgradeHistoryEntryArgs>> upgradeHistory) {
            this.upgradeHistory = upgradeHistory;
            return this;
        }

        public Builder upgradeHistory(@Nullable List<UpgradeHistoryEntryArgs> upgradeHistory) {
            this.upgradeHistory = Input.ofNullable(upgradeHistory);
            return this;
        }

        public Builder vmImage(@Nullable Input<VmImageArgs> vmImage) {
            this.vmImage = vmImage;
            return this;
        }

        public Builder vmImage(@Nullable VmImageArgs vmImage) {
            this.vmImage = Input.ofNullable(vmImage);
            return this;
        }
        public InstanceArgs build() {
            return new InstanceArgs(acceleratorConfig, bootDiskSizeGb, bootDiskType, containerImage, customGpuDriverPath, dataDiskSizeGb, dataDiskType, diskEncryption, installGpuDriver, instanceId, instanceOwners, kmsKey, labels, location, machineType, metadata, network, nicType, noProxyAccess, noPublicIp, noRemoveDataDisk, postStartupScript, project, reservationAffinity, serviceAccount, serviceAccountScopes, shieldedInstanceConfig, subnet, tags, upgradeHistory, vmImage);
        }
    }
}
