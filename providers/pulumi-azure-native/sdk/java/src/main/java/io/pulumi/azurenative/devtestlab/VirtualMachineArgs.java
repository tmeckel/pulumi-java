// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.devtestlab.inputs.ArtifactInstallPropertiesArgs;
import io.pulumi.azurenative.devtestlab.inputs.DataDiskPropertiesArgs;
import io.pulumi.azurenative.devtestlab.inputs.GalleryImageReferenceArgs;
import io.pulumi.azurenative.devtestlab.inputs.NetworkInterfacePropertiesArgs;
import io.pulumi.azurenative.devtestlab.inputs.ScheduleCreationParameterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMachineArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineArgs Empty = new VirtualMachineArgs();

    /**
     * Indicates whether another user can take ownership of the virtual machine
     * 
     */
    @Import(name="allowClaim")
      private final @Nullable Output<Boolean> allowClaim;

    public Output<Boolean> getAllowClaim() {
        return this.allowClaim == null ? Codegen.empty() : this.allowClaim;
    }

    /**
     * The artifacts to be installed on the virtual machine.
     * 
     */
    @Import(name="artifacts")
      private final @Nullable Output<List<ArtifactInstallPropertiesArgs>> artifacts;

    public Output<List<ArtifactInstallPropertiesArgs>> getArtifacts() {
        return this.artifacts == null ? Codegen.empty() : this.artifacts;
    }

    /**
     * The creation date of the virtual machine.
     * 
     */
    @Import(name="createdDate")
      private final @Nullable Output<String> createdDate;

    public Output<String> getCreatedDate() {
        return this.createdDate == null ? Codegen.empty() : this.createdDate;
    }

    /**
     * The custom image identifier of the virtual machine.
     * 
     */
    @Import(name="customImageId")
      private final @Nullable Output<String> customImageId;

    public Output<String> getCustomImageId() {
        return this.customImageId == null ? Codegen.empty() : this.customImageId;
    }

    /**
     * New or existing data disks to attach to the virtual machine after creation
     * 
     */
    @Import(name="dataDiskParameters")
      private final @Nullable Output<List<DataDiskPropertiesArgs>> dataDiskParameters;

    public Output<List<DataDiskPropertiesArgs>> getDataDiskParameters() {
        return this.dataDiskParameters == null ? Codegen.empty() : this.dataDiskParameters;
    }

    /**
     * Indicates whether the virtual machine is to be created without a public IP address.
     * 
     */
    @Import(name="disallowPublicIpAddress")
      private final @Nullable Output<Boolean> disallowPublicIpAddress;

    public Output<Boolean> getDisallowPublicIpAddress() {
        return this.disallowPublicIpAddress == null ? Codegen.empty() : this.disallowPublicIpAddress;
    }

    /**
     * The resource ID of the environment that contains this virtual machine, if any.
     * 
     */
    @Import(name="environmentId")
      private final @Nullable Output<String> environmentId;

    public Output<String> getEnvironmentId() {
        return this.environmentId == null ? Codegen.empty() : this.environmentId;
    }

    /**
     * The expiration date for VM.
     * 
     */
    @Import(name="expirationDate")
      private final @Nullable Output<String> expirationDate;

    public Output<String> getExpirationDate() {
        return this.expirationDate == null ? Codegen.empty() : this.expirationDate;
    }

    /**
     * The Microsoft Azure Marketplace image reference of the virtual machine.
     * 
     */
    @Import(name="galleryImageReference")
      private final @Nullable Output<GalleryImageReferenceArgs> galleryImageReference;

    public Output<GalleryImageReferenceArgs> getGalleryImageReference() {
        return this.galleryImageReference == null ? Codegen.empty() : this.galleryImageReference;
    }

    /**
     * Indicates whether this virtual machine uses an SSH key for authentication.
     * 
     */
    @Import(name="isAuthenticationWithSshKey")
      private final @Nullable Output<Boolean> isAuthenticationWithSshKey;

    public Output<Boolean> getIsAuthenticationWithSshKey() {
        return this.isAuthenticationWithSshKey == null ? Codegen.empty() : this.isAuthenticationWithSshKey;
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="labName", required=true)
      private final Output<String> labName;

    public Output<String> getLabName() {
        return this.labName;
    }

    /**
     * The lab subnet name of the virtual machine.
     * 
     */
    @Import(name="labSubnetName")
      private final @Nullable Output<String> labSubnetName;

    public Output<String> getLabSubnetName() {
        return this.labSubnetName == null ? Codegen.empty() : this.labSubnetName;
    }

    /**
     * The lab virtual network identifier of the virtual machine.
     * 
     */
    @Import(name="labVirtualNetworkId")
      private final @Nullable Output<String> labVirtualNetworkId;

    public Output<String> getLabVirtualNetworkId() {
        return this.labVirtualNetworkId == null ? Codegen.empty() : this.labVirtualNetworkId;
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the virtual machine.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The network interface properties.
     * 
     */
    @Import(name="networkInterface")
      private final @Nullable Output<NetworkInterfacePropertiesArgs> networkInterface;

    public Output<NetworkInterfacePropertiesArgs> getNetworkInterface() {
        return this.networkInterface == null ? Codegen.empty() : this.networkInterface;
    }

    /**
     * The notes of the virtual machine.
     * 
     */
    @Import(name="notes")
      private final @Nullable Output<String> notes;

    public Output<String> getNotes() {
        return this.notes == null ? Codegen.empty() : this.notes;
    }

    /**
     * The object identifier of the owner of the virtual machine.
     * 
     */
    @Import(name="ownerObjectId")
      private final @Nullable Output<String> ownerObjectId;

    public Output<String> getOwnerObjectId() {
        return this.ownerObjectId == null ? Codegen.empty() : this.ownerObjectId;
    }

    /**
     * The user principal name of the virtual machine owner.
     * 
     */
    @Import(name="ownerUserPrincipalName")
      private final @Nullable Output<String> ownerUserPrincipalName;

    public Output<String> getOwnerUserPrincipalName() {
        return this.ownerUserPrincipalName == null ? Codegen.empty() : this.ownerUserPrincipalName;
    }

    /**
     * The password of the virtual machine administrator.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The id of the plan associated with the virtual machine image
     * 
     */
    @Import(name="planId")
      private final @Nullable Output<String> planId;

    public Output<String> getPlanId() {
        return this.planId == null ? Codegen.empty() : this.planId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Virtual Machine schedules to be created
     * 
     */
    @Import(name="scheduleParameters")
      private final @Nullable Output<List<ScheduleCreationParameterArgs>> scheduleParameters;

    public Output<List<ScheduleCreationParameterArgs>> getScheduleParameters() {
        return this.scheduleParameters == null ? Codegen.empty() : this.scheduleParameters;
    }

    /**
     * The size of the virtual machine.
     * 
     */
    @Import(name="size")
      private final @Nullable Output<String> size;

    public Output<String> getSize() {
        return this.size == null ? Codegen.empty() : this.size;
    }

    /**
     * The SSH key of the virtual machine administrator.
     * 
     */
    @Import(name="sshKey")
      private final @Nullable Output<String> sshKey;

    public Output<String> getSshKey() {
        return this.sshKey == null ? Codegen.empty() : this.sshKey;
    }

    /**
     * Storage type to use for virtual machine (i.e. Standard, Premium).
     * 
     */
    @Import(name="storageType")
      private final @Nullable Output<String> storageType;

    public Output<String> getStorageType() {
        return this.storageType == null ? Codegen.empty() : this.storageType;
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The user name of the virtual machine.
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<String> userName;

    public Output<String> getUserName() {
        return this.userName == null ? Codegen.empty() : this.userName;
    }

    public VirtualMachineArgs(
        @Nullable Output<Boolean> allowClaim,
        @Nullable Output<List<ArtifactInstallPropertiesArgs>> artifacts,
        @Nullable Output<String> createdDate,
        @Nullable Output<String> customImageId,
        @Nullable Output<List<DataDiskPropertiesArgs>> dataDiskParameters,
        @Nullable Output<Boolean> disallowPublicIpAddress,
        @Nullable Output<String> environmentId,
        @Nullable Output<String> expirationDate,
        @Nullable Output<GalleryImageReferenceArgs> galleryImageReference,
        @Nullable Output<Boolean> isAuthenticationWithSshKey,
        Output<String> labName,
        @Nullable Output<String> labSubnetName,
        @Nullable Output<String> labVirtualNetworkId,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<NetworkInterfacePropertiesArgs> networkInterface,
        @Nullable Output<String> notes,
        @Nullable Output<String> ownerObjectId,
        @Nullable Output<String> ownerUserPrincipalName,
        @Nullable Output<String> password,
        @Nullable Output<String> planId,
        Output<String> resourceGroupName,
        @Nullable Output<List<ScheduleCreationParameterArgs>> scheduleParameters,
        @Nullable Output<String> size,
        @Nullable Output<String> sshKey,
        @Nullable Output<String> storageType,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> userName) {
        this.allowClaim = allowClaim == null ? Codegen.ofNullable(false) : allowClaim;
        this.artifacts = artifacts;
        this.createdDate = createdDate;
        this.customImageId = customImageId;
        this.dataDiskParameters = dataDiskParameters;
        this.disallowPublicIpAddress = disallowPublicIpAddress == null ? Codegen.ofNullable(false) : disallowPublicIpAddress;
        this.environmentId = environmentId;
        this.expirationDate = expirationDate;
        this.galleryImageReference = galleryImageReference;
        this.isAuthenticationWithSshKey = isAuthenticationWithSshKey;
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.labSubnetName = labSubnetName;
        this.labVirtualNetworkId = labVirtualNetworkId;
        this.location = location;
        this.name = name;
        this.networkInterface = networkInterface;
        this.notes = notes;
        this.ownerObjectId = ownerObjectId == null ? Codegen.ofNullable("dynamicValue") : ownerObjectId;
        this.ownerUserPrincipalName = ownerUserPrincipalName;
        this.password = password;
        this.planId = planId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scheduleParameters = scheduleParameters;
        this.size = size;
        this.sshKey = sshKey;
        this.storageType = storageType == null ? Codegen.ofNullable("labStorageType") : storageType;
        this.tags = tags;
        this.userName = userName;
    }

    private VirtualMachineArgs() {
        this.allowClaim = Codegen.empty();
        this.artifacts = Codegen.empty();
        this.createdDate = Codegen.empty();
        this.customImageId = Codegen.empty();
        this.dataDiskParameters = Codegen.empty();
        this.disallowPublicIpAddress = Codegen.empty();
        this.environmentId = Codegen.empty();
        this.expirationDate = Codegen.empty();
        this.galleryImageReference = Codegen.empty();
        this.isAuthenticationWithSshKey = Codegen.empty();
        this.labName = Codegen.empty();
        this.labSubnetName = Codegen.empty();
        this.labVirtualNetworkId = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.networkInterface = Codegen.empty();
        this.notes = Codegen.empty();
        this.ownerObjectId = Codegen.empty();
        this.ownerUserPrincipalName = Codegen.empty();
        this.password = Codegen.empty();
        this.planId = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.scheduleParameters = Codegen.empty();
        this.size = Codegen.empty();
        this.sshKey = Codegen.empty();
        this.storageType = Codegen.empty();
        this.tags = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowClaim;
        private @Nullable Output<List<ArtifactInstallPropertiesArgs>> artifacts;
        private @Nullable Output<String> createdDate;
        private @Nullable Output<String> customImageId;
        private @Nullable Output<List<DataDiskPropertiesArgs>> dataDiskParameters;
        private @Nullable Output<Boolean> disallowPublicIpAddress;
        private @Nullable Output<String> environmentId;
        private @Nullable Output<String> expirationDate;
        private @Nullable Output<GalleryImageReferenceArgs> galleryImageReference;
        private @Nullable Output<Boolean> isAuthenticationWithSshKey;
        private Output<String> labName;
        private @Nullable Output<String> labSubnetName;
        private @Nullable Output<String> labVirtualNetworkId;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<NetworkInterfacePropertiesArgs> networkInterface;
        private @Nullable Output<String> notes;
        private @Nullable Output<String> ownerObjectId;
        private @Nullable Output<String> ownerUserPrincipalName;
        private @Nullable Output<String> password;
        private @Nullable Output<String> planId;
        private Output<String> resourceGroupName;
        private @Nullable Output<List<ScheduleCreationParameterArgs>> scheduleParameters;
        private @Nullable Output<String> size;
        private @Nullable Output<String> sshKey;
        private @Nullable Output<String> storageType;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowClaim = defaults.allowClaim;
    	      this.artifacts = defaults.artifacts;
    	      this.createdDate = defaults.createdDate;
    	      this.customImageId = defaults.customImageId;
    	      this.dataDiskParameters = defaults.dataDiskParameters;
    	      this.disallowPublicIpAddress = defaults.disallowPublicIpAddress;
    	      this.environmentId = defaults.environmentId;
    	      this.expirationDate = defaults.expirationDate;
    	      this.galleryImageReference = defaults.galleryImageReference;
    	      this.isAuthenticationWithSshKey = defaults.isAuthenticationWithSshKey;
    	      this.labName = defaults.labName;
    	      this.labSubnetName = defaults.labSubnetName;
    	      this.labVirtualNetworkId = defaults.labVirtualNetworkId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkInterface = defaults.networkInterface;
    	      this.notes = defaults.notes;
    	      this.ownerObjectId = defaults.ownerObjectId;
    	      this.ownerUserPrincipalName = defaults.ownerUserPrincipalName;
    	      this.password = defaults.password;
    	      this.planId = defaults.planId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scheduleParameters = defaults.scheduleParameters;
    	      this.size = defaults.size;
    	      this.sshKey = defaults.sshKey;
    	      this.storageType = defaults.storageType;
    	      this.tags = defaults.tags;
    	      this.userName = defaults.userName;
        }

        public Builder allowClaim(@Nullable Output<Boolean> allowClaim) {
            this.allowClaim = allowClaim;
            return this;
        }
        public Builder allowClaim(@Nullable Boolean allowClaim) {
            this.allowClaim = Codegen.ofNullable(allowClaim);
            return this;
        }
        public Builder artifacts(@Nullable Output<List<ArtifactInstallPropertiesArgs>> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public Builder artifacts(@Nullable List<ArtifactInstallPropertiesArgs> artifacts) {
            this.artifacts = Codegen.ofNullable(artifacts);
            return this;
        }
        public Builder artifacts(ArtifactInstallPropertiesArgs... artifacts) {
            return artifacts(List.of(artifacts));
        }
        public Builder createdDate(@Nullable Output<String> createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public Builder createdDate(@Nullable String createdDate) {
            this.createdDate = Codegen.ofNullable(createdDate);
            return this;
        }
        public Builder customImageId(@Nullable Output<String> customImageId) {
            this.customImageId = customImageId;
            return this;
        }
        public Builder customImageId(@Nullable String customImageId) {
            this.customImageId = Codegen.ofNullable(customImageId);
            return this;
        }
        public Builder dataDiskParameters(@Nullable Output<List<DataDiskPropertiesArgs>> dataDiskParameters) {
            this.dataDiskParameters = dataDiskParameters;
            return this;
        }
        public Builder dataDiskParameters(@Nullable List<DataDiskPropertiesArgs> dataDiskParameters) {
            this.dataDiskParameters = Codegen.ofNullable(dataDiskParameters);
            return this;
        }
        public Builder dataDiskParameters(DataDiskPropertiesArgs... dataDiskParameters) {
            return dataDiskParameters(List.of(dataDiskParameters));
        }
        public Builder disallowPublicIpAddress(@Nullable Output<Boolean> disallowPublicIpAddress) {
            this.disallowPublicIpAddress = disallowPublicIpAddress;
            return this;
        }
        public Builder disallowPublicIpAddress(@Nullable Boolean disallowPublicIpAddress) {
            this.disallowPublicIpAddress = Codegen.ofNullable(disallowPublicIpAddress);
            return this;
        }
        public Builder environmentId(@Nullable Output<String> environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public Builder environmentId(@Nullable String environmentId) {
            this.environmentId = Codegen.ofNullable(environmentId);
            return this;
        }
        public Builder expirationDate(@Nullable Output<String> expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public Builder expirationDate(@Nullable String expirationDate) {
            this.expirationDate = Codegen.ofNullable(expirationDate);
            return this;
        }
        public Builder galleryImageReference(@Nullable Output<GalleryImageReferenceArgs> galleryImageReference) {
            this.galleryImageReference = galleryImageReference;
            return this;
        }
        public Builder galleryImageReference(@Nullable GalleryImageReferenceArgs galleryImageReference) {
            this.galleryImageReference = Codegen.ofNullable(galleryImageReference);
            return this;
        }
        public Builder isAuthenticationWithSshKey(@Nullable Output<Boolean> isAuthenticationWithSshKey) {
            this.isAuthenticationWithSshKey = isAuthenticationWithSshKey;
            return this;
        }
        public Builder isAuthenticationWithSshKey(@Nullable Boolean isAuthenticationWithSshKey) {
            this.isAuthenticationWithSshKey = Codegen.ofNullable(isAuthenticationWithSshKey);
            return this;
        }
        public Builder labName(Output<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }
        public Builder labName(String labName) {
            this.labName = Output.of(Objects.requireNonNull(labName));
            return this;
        }
        public Builder labSubnetName(@Nullable Output<String> labSubnetName) {
            this.labSubnetName = labSubnetName;
            return this;
        }
        public Builder labSubnetName(@Nullable String labSubnetName) {
            this.labSubnetName = Codegen.ofNullable(labSubnetName);
            return this;
        }
        public Builder labVirtualNetworkId(@Nullable Output<String> labVirtualNetworkId) {
            this.labVirtualNetworkId = labVirtualNetworkId;
            return this;
        }
        public Builder labVirtualNetworkId(@Nullable String labVirtualNetworkId) {
            this.labVirtualNetworkId = Codegen.ofNullable(labVirtualNetworkId);
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder networkInterface(@Nullable Output<NetworkInterfacePropertiesArgs> networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }
        public Builder networkInterface(@Nullable NetworkInterfacePropertiesArgs networkInterface) {
            this.networkInterface = Codegen.ofNullable(networkInterface);
            return this;
        }
        public Builder notes(@Nullable Output<String> notes) {
            this.notes = notes;
            return this;
        }
        public Builder notes(@Nullable String notes) {
            this.notes = Codegen.ofNullable(notes);
            return this;
        }
        public Builder ownerObjectId(@Nullable Output<String> ownerObjectId) {
            this.ownerObjectId = ownerObjectId;
            return this;
        }
        public Builder ownerObjectId(@Nullable String ownerObjectId) {
            this.ownerObjectId = Codegen.ofNullable(ownerObjectId);
            return this;
        }
        public Builder ownerUserPrincipalName(@Nullable Output<String> ownerUserPrincipalName) {
            this.ownerUserPrincipalName = ownerUserPrincipalName;
            return this;
        }
        public Builder ownerUserPrincipalName(@Nullable String ownerUserPrincipalName) {
            this.ownerUserPrincipalName = Codegen.ofNullable(ownerUserPrincipalName);
            return this;
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder planId(@Nullable Output<String> planId) {
            this.planId = planId;
            return this;
        }
        public Builder planId(@Nullable String planId) {
            this.planId = Codegen.ofNullable(planId);
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
        public Builder scheduleParameters(@Nullable Output<List<ScheduleCreationParameterArgs>> scheduleParameters) {
            this.scheduleParameters = scheduleParameters;
            return this;
        }
        public Builder scheduleParameters(@Nullable List<ScheduleCreationParameterArgs> scheduleParameters) {
            this.scheduleParameters = Codegen.ofNullable(scheduleParameters);
            return this;
        }
        public Builder scheduleParameters(ScheduleCreationParameterArgs... scheduleParameters) {
            return scheduleParameters(List.of(scheduleParameters));
        }
        public Builder size(@Nullable Output<String> size) {
            this.size = size;
            return this;
        }
        public Builder size(@Nullable String size) {
            this.size = Codegen.ofNullable(size);
            return this;
        }
        public Builder sshKey(@Nullable Output<String> sshKey) {
            this.sshKey = sshKey;
            return this;
        }
        public Builder sshKey(@Nullable String sshKey) {
            this.sshKey = Codegen.ofNullable(sshKey);
            return this;
        }
        public Builder storageType(@Nullable Output<String> storageType) {
            this.storageType = storageType;
            return this;
        }
        public Builder storageType(@Nullable String storageType) {
            this.storageType = Codegen.ofNullable(storageType);
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
        public Builder userName(@Nullable Output<String> userName) {
            this.userName = userName;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = Codegen.ofNullable(userName);
            return this;
        }        public VirtualMachineArgs build() {
            return new VirtualMachineArgs(allowClaim, artifacts, createdDate, customImageId, dataDiskParameters, disallowPublicIpAddress, environmentId, expirationDate, galleryImageReference, isAuthenticationWithSshKey, labName, labSubnetName, labVirtualNetworkId, location, name, networkInterface, notes, ownerObjectId, ownerUserPrincipalName, password, planId, resourceGroupName, scheduleParameters, size, sshKey, storageType, tags, userName);
        }
    }
}
