// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkloadCrrAccessTokenResponse {
    /**
     * @return Access token used for authentication
     * 
     */
    private final @Nullable String accessTokenString;
    /**
     * @return Active region name of BMS Stamp
     * 
     */
    private final @Nullable String bMSActiveRegion;
    /**
     * @return Backup Management Type
     * 
     */
    private final @Nullable String backupManagementType;
    /**
     * @return Container Id
     * 
     */
    private final @Nullable String containerId;
    /**
     * @return Container Unique name
     * 
     */
    private final @Nullable String containerName;
    /**
     * @return Container Type
     * 
     */
    private final @Nullable String containerType;
    /**
     * @return CoordinatorServiceStampId to be used by BCM in restore call
     * 
     */
    private final @Nullable String coordinatorServiceStampId;
    /**
     * @return CoordinatorServiceStampUri to be used by BCM in restore call
     * 
     */
    private final @Nullable String coordinatorServiceStampUri;
    /**
     * @return Datasource Container Unique Name
     * 
     */
    private final @Nullable String datasourceContainerName;
    /**
     * @return Datasource Id
     * 
     */
    private final @Nullable String datasourceId;
    /**
     * @return Datasource Friendly Name
     * 
     */
    private final @Nullable String datasourceName;
    /**
     * @return Datasource Type
     * 
     */
    private final @Nullable String datasourceType;
    /**
     * @return Type of the specific object - used for deserializing
     * Expected value is &#39;WorkloadCrrAccessToken&#39;.
     * 
     */
    private final String objectType;
    /**
     * @return Policy Id
     * 
     */
    private final @Nullable String policyId;
    /**
     * @return Policy Name
     * 
     */
    private final @Nullable String policyName;
    private final @Nullable String protectableObjectContainerHostOsName;
    private final @Nullable String protectableObjectFriendlyName;
    private final @Nullable String protectableObjectParentLogicalContainerName;
    private final @Nullable String protectableObjectProtectionState;
    private final @Nullable String protectableObjectUniqueName;
    private final @Nullable String protectableObjectWorkloadType;
    /**
     * @return Protected item container id
     * 
     */
    private final @Nullable Double protectionContainerId;
    /**
     * @return ProtectionServiceStampId to be used by BCM in restore call
     * 
     */
    private final @Nullable String protectionServiceStampId;
    /**
     * @return ProtectionServiceStampUri to be used by BCM in restore call
     * 
     */
    private final @Nullable String protectionServiceStampUri;
    /**
     * @return Recovery Point Id
     * 
     */
    private final @Nullable String recoveryPointId;
    /**
     * @return Recovery Point Time
     * 
     */
    private final @Nullable String recoveryPointTime;
    /**
     * @return Resource Group name of the source vault
     * 
     */
    private final @Nullable String resourceGroupName;
    /**
     * @return Resource Id of the source vault
     * 
     */
    private final @Nullable String resourceId;
    /**
     * @return Resource Name of the source vault
     * 
     */
    private final @Nullable String resourceName;
    /**
     * @return Recovery point information: Managed virtual machine
     * 
     */
    private final @Nullable Boolean rpIsManagedVirtualMachine;
    /**
     * @return Recovery point information: Original SA option
     * 
     */
    private final @Nullable Boolean rpOriginalSAOption;
    /**
     * @return Recovery point Tier Information
     * 
     */
    private final @Nullable Map<String,String> rpTierInformation;
    /**
     * @return Recovery point information: VM size description
     * 
     */
    private final @Nullable String rpVMSizeDescription;
    /**
     * @return Subscription Id of the source vault
     * 
     */
    private final @Nullable String subscriptionId;
    /**
     * @return Extended Information about the token like FileSpec etc.
     * 
     */
    private final @Nullable String tokenExtendedInformation;

    @CustomType.Constructor
    private WorkloadCrrAccessTokenResponse(
        @CustomType.Parameter("accessTokenString") @Nullable String accessTokenString,
        @CustomType.Parameter("bMSActiveRegion") @Nullable String bMSActiveRegion,
        @CustomType.Parameter("backupManagementType") @Nullable String backupManagementType,
        @CustomType.Parameter("containerId") @Nullable String containerId,
        @CustomType.Parameter("containerName") @Nullable String containerName,
        @CustomType.Parameter("containerType") @Nullable String containerType,
        @CustomType.Parameter("coordinatorServiceStampId") @Nullable String coordinatorServiceStampId,
        @CustomType.Parameter("coordinatorServiceStampUri") @Nullable String coordinatorServiceStampUri,
        @CustomType.Parameter("datasourceContainerName") @Nullable String datasourceContainerName,
        @CustomType.Parameter("datasourceId") @Nullable String datasourceId,
        @CustomType.Parameter("datasourceName") @Nullable String datasourceName,
        @CustomType.Parameter("datasourceType") @Nullable String datasourceType,
        @CustomType.Parameter("objectType") String objectType,
        @CustomType.Parameter("policyId") @Nullable String policyId,
        @CustomType.Parameter("policyName") @Nullable String policyName,
        @CustomType.Parameter("protectableObjectContainerHostOsName") @Nullable String protectableObjectContainerHostOsName,
        @CustomType.Parameter("protectableObjectFriendlyName") @Nullable String protectableObjectFriendlyName,
        @CustomType.Parameter("protectableObjectParentLogicalContainerName") @Nullable String protectableObjectParentLogicalContainerName,
        @CustomType.Parameter("protectableObjectProtectionState") @Nullable String protectableObjectProtectionState,
        @CustomType.Parameter("protectableObjectUniqueName") @Nullable String protectableObjectUniqueName,
        @CustomType.Parameter("protectableObjectWorkloadType") @Nullable String protectableObjectWorkloadType,
        @CustomType.Parameter("protectionContainerId") @Nullable Double protectionContainerId,
        @CustomType.Parameter("protectionServiceStampId") @Nullable String protectionServiceStampId,
        @CustomType.Parameter("protectionServiceStampUri") @Nullable String protectionServiceStampUri,
        @CustomType.Parameter("recoveryPointId") @Nullable String recoveryPointId,
        @CustomType.Parameter("recoveryPointTime") @Nullable String recoveryPointTime,
        @CustomType.Parameter("resourceGroupName") @Nullable String resourceGroupName,
        @CustomType.Parameter("resourceId") @Nullable String resourceId,
        @CustomType.Parameter("resourceName") @Nullable String resourceName,
        @CustomType.Parameter("rpIsManagedVirtualMachine") @Nullable Boolean rpIsManagedVirtualMachine,
        @CustomType.Parameter("rpOriginalSAOption") @Nullable Boolean rpOriginalSAOption,
        @CustomType.Parameter("rpTierInformation") @Nullable Map<String,String> rpTierInformation,
        @CustomType.Parameter("rpVMSizeDescription") @Nullable String rpVMSizeDescription,
        @CustomType.Parameter("subscriptionId") @Nullable String subscriptionId,
        @CustomType.Parameter("tokenExtendedInformation") @Nullable String tokenExtendedInformation) {
        this.accessTokenString = accessTokenString;
        this.bMSActiveRegion = bMSActiveRegion;
        this.backupManagementType = backupManagementType;
        this.containerId = containerId;
        this.containerName = containerName;
        this.containerType = containerType;
        this.coordinatorServiceStampId = coordinatorServiceStampId;
        this.coordinatorServiceStampUri = coordinatorServiceStampUri;
        this.datasourceContainerName = datasourceContainerName;
        this.datasourceId = datasourceId;
        this.datasourceName = datasourceName;
        this.datasourceType = datasourceType;
        this.objectType = objectType;
        this.policyId = policyId;
        this.policyName = policyName;
        this.protectableObjectContainerHostOsName = protectableObjectContainerHostOsName;
        this.protectableObjectFriendlyName = protectableObjectFriendlyName;
        this.protectableObjectParentLogicalContainerName = protectableObjectParentLogicalContainerName;
        this.protectableObjectProtectionState = protectableObjectProtectionState;
        this.protectableObjectUniqueName = protectableObjectUniqueName;
        this.protectableObjectWorkloadType = protectableObjectWorkloadType;
        this.protectionContainerId = protectionContainerId;
        this.protectionServiceStampId = protectionServiceStampId;
        this.protectionServiceStampUri = protectionServiceStampUri;
        this.recoveryPointId = recoveryPointId;
        this.recoveryPointTime = recoveryPointTime;
        this.resourceGroupName = resourceGroupName;
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.rpIsManagedVirtualMachine = rpIsManagedVirtualMachine;
        this.rpOriginalSAOption = rpOriginalSAOption;
        this.rpTierInformation = rpTierInformation;
        this.rpVMSizeDescription = rpVMSizeDescription;
        this.subscriptionId = subscriptionId;
        this.tokenExtendedInformation = tokenExtendedInformation;
    }

    /**
     * @return Access token used for authentication
     * 
     */
    public Optional<String> accessTokenString() {
        return Optional.ofNullable(this.accessTokenString);
    }
    /**
     * @return Active region name of BMS Stamp
     * 
     */
    public Optional<String> bMSActiveRegion() {
        return Optional.ofNullable(this.bMSActiveRegion);
    }
    /**
     * @return Backup Management Type
     * 
     */
    public Optional<String> backupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }
    /**
     * @return Container Id
     * 
     */
    public Optional<String> containerId() {
        return Optional.ofNullable(this.containerId);
    }
    /**
     * @return Container Unique name
     * 
     */
    public Optional<String> containerName() {
        return Optional.ofNullable(this.containerName);
    }
    /**
     * @return Container Type
     * 
     */
    public Optional<String> containerType() {
        return Optional.ofNullable(this.containerType);
    }
    /**
     * @return CoordinatorServiceStampId to be used by BCM in restore call
     * 
     */
    public Optional<String> coordinatorServiceStampId() {
        return Optional.ofNullable(this.coordinatorServiceStampId);
    }
    /**
     * @return CoordinatorServiceStampUri to be used by BCM in restore call
     * 
     */
    public Optional<String> coordinatorServiceStampUri() {
        return Optional.ofNullable(this.coordinatorServiceStampUri);
    }
    /**
     * @return Datasource Container Unique Name
     * 
     */
    public Optional<String> datasourceContainerName() {
        return Optional.ofNullable(this.datasourceContainerName);
    }
    /**
     * @return Datasource Id
     * 
     */
    public Optional<String> datasourceId() {
        return Optional.ofNullable(this.datasourceId);
    }
    /**
     * @return Datasource Friendly Name
     * 
     */
    public Optional<String> datasourceName() {
        return Optional.ofNullable(this.datasourceName);
    }
    /**
     * @return Datasource Type
     * 
     */
    public Optional<String> datasourceType() {
        return Optional.ofNullable(this.datasourceType);
    }
    /**
     * @return Type of the specific object - used for deserializing
     * Expected value is &#39;WorkloadCrrAccessToken&#39;.
     * 
     */
    public String objectType() {
        return this.objectType;
    }
    /**
     * @return Policy Id
     * 
     */
    public Optional<String> policyId() {
        return Optional.ofNullable(this.policyId);
    }
    /**
     * @return Policy Name
     * 
     */
    public Optional<String> policyName() {
        return Optional.ofNullable(this.policyName);
    }
    public Optional<String> protectableObjectContainerHostOsName() {
        return Optional.ofNullable(this.protectableObjectContainerHostOsName);
    }
    public Optional<String> protectableObjectFriendlyName() {
        return Optional.ofNullable(this.protectableObjectFriendlyName);
    }
    public Optional<String> protectableObjectParentLogicalContainerName() {
        return Optional.ofNullable(this.protectableObjectParentLogicalContainerName);
    }
    public Optional<String> protectableObjectProtectionState() {
        return Optional.ofNullable(this.protectableObjectProtectionState);
    }
    public Optional<String> protectableObjectUniqueName() {
        return Optional.ofNullable(this.protectableObjectUniqueName);
    }
    public Optional<String> protectableObjectWorkloadType() {
        return Optional.ofNullable(this.protectableObjectWorkloadType);
    }
    /**
     * @return Protected item container id
     * 
     */
    public Optional<Double> protectionContainerId() {
        return Optional.ofNullable(this.protectionContainerId);
    }
    /**
     * @return ProtectionServiceStampId to be used by BCM in restore call
     * 
     */
    public Optional<String> protectionServiceStampId() {
        return Optional.ofNullable(this.protectionServiceStampId);
    }
    /**
     * @return ProtectionServiceStampUri to be used by BCM in restore call
     * 
     */
    public Optional<String> protectionServiceStampUri() {
        return Optional.ofNullable(this.protectionServiceStampUri);
    }
    /**
     * @return Recovery Point Id
     * 
     */
    public Optional<String> recoveryPointId() {
        return Optional.ofNullable(this.recoveryPointId);
    }
    /**
     * @return Recovery Point Time
     * 
     */
    public Optional<String> recoveryPointTime() {
        return Optional.ofNullable(this.recoveryPointTime);
    }
    /**
     * @return Resource Group name of the source vault
     * 
     */
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    /**
     * @return Resource Id of the source vault
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * @return Resource Name of the source vault
     * 
     */
    public Optional<String> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }
    /**
     * @return Recovery point information: Managed virtual machine
     * 
     */
    public Optional<Boolean> rpIsManagedVirtualMachine() {
        return Optional.ofNullable(this.rpIsManagedVirtualMachine);
    }
    /**
     * @return Recovery point information: Original SA option
     * 
     */
    public Optional<Boolean> rpOriginalSAOption() {
        return Optional.ofNullable(this.rpOriginalSAOption);
    }
    /**
     * @return Recovery point Tier Information
     * 
     */
    public Map<String,String> rpTierInformation() {
        return this.rpTierInformation == null ? Map.of() : this.rpTierInformation;
    }
    /**
     * @return Recovery point information: VM size description
     * 
     */
    public Optional<String> rpVMSizeDescription() {
        return Optional.ofNullable(this.rpVMSizeDescription);
    }
    /**
     * @return Subscription Id of the source vault
     * 
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }
    /**
     * @return Extended Information about the token like FileSpec etc.
     * 
     */
    public Optional<String> tokenExtendedInformation() {
        return Optional.ofNullable(this.tokenExtendedInformation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadCrrAccessTokenResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessTokenString;
        private @Nullable String bMSActiveRegion;
        private @Nullable String backupManagementType;
        private @Nullable String containerId;
        private @Nullable String containerName;
        private @Nullable String containerType;
        private @Nullable String coordinatorServiceStampId;
        private @Nullable String coordinatorServiceStampUri;
        private @Nullable String datasourceContainerName;
        private @Nullable String datasourceId;
        private @Nullable String datasourceName;
        private @Nullable String datasourceType;
        private String objectType;
        private @Nullable String policyId;
        private @Nullable String policyName;
        private @Nullable String protectableObjectContainerHostOsName;
        private @Nullable String protectableObjectFriendlyName;
        private @Nullable String protectableObjectParentLogicalContainerName;
        private @Nullable String protectableObjectProtectionState;
        private @Nullable String protectableObjectUniqueName;
        private @Nullable String protectableObjectWorkloadType;
        private @Nullable Double protectionContainerId;
        private @Nullable String protectionServiceStampId;
        private @Nullable String protectionServiceStampUri;
        private @Nullable String recoveryPointId;
        private @Nullable String recoveryPointTime;
        private @Nullable String resourceGroupName;
        private @Nullable String resourceId;
        private @Nullable String resourceName;
        private @Nullable Boolean rpIsManagedVirtualMachine;
        private @Nullable Boolean rpOriginalSAOption;
        private @Nullable Map<String,String> rpTierInformation;
        private @Nullable String rpVMSizeDescription;
        private @Nullable String subscriptionId;
        private @Nullable String tokenExtendedInformation;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadCrrAccessTokenResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTokenString = defaults.accessTokenString;
    	      this.bMSActiveRegion = defaults.bMSActiveRegion;
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.containerId = defaults.containerId;
    	      this.containerName = defaults.containerName;
    	      this.containerType = defaults.containerType;
    	      this.coordinatorServiceStampId = defaults.coordinatorServiceStampId;
    	      this.coordinatorServiceStampUri = defaults.coordinatorServiceStampUri;
    	      this.datasourceContainerName = defaults.datasourceContainerName;
    	      this.datasourceId = defaults.datasourceId;
    	      this.datasourceName = defaults.datasourceName;
    	      this.datasourceType = defaults.datasourceType;
    	      this.objectType = defaults.objectType;
    	      this.policyId = defaults.policyId;
    	      this.policyName = defaults.policyName;
    	      this.protectableObjectContainerHostOsName = defaults.protectableObjectContainerHostOsName;
    	      this.protectableObjectFriendlyName = defaults.protectableObjectFriendlyName;
    	      this.protectableObjectParentLogicalContainerName = defaults.protectableObjectParentLogicalContainerName;
    	      this.protectableObjectProtectionState = defaults.protectableObjectProtectionState;
    	      this.protectableObjectUniqueName = defaults.protectableObjectUniqueName;
    	      this.protectableObjectWorkloadType = defaults.protectableObjectWorkloadType;
    	      this.protectionContainerId = defaults.protectionContainerId;
    	      this.protectionServiceStampId = defaults.protectionServiceStampId;
    	      this.protectionServiceStampUri = defaults.protectionServiceStampUri;
    	      this.recoveryPointId = defaults.recoveryPointId;
    	      this.recoveryPointTime = defaults.recoveryPointTime;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceName = defaults.resourceName;
    	      this.rpIsManagedVirtualMachine = defaults.rpIsManagedVirtualMachine;
    	      this.rpOriginalSAOption = defaults.rpOriginalSAOption;
    	      this.rpTierInformation = defaults.rpTierInformation;
    	      this.rpVMSizeDescription = defaults.rpVMSizeDescription;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tokenExtendedInformation = defaults.tokenExtendedInformation;
        }

        public Builder accessTokenString(@Nullable String accessTokenString) {
            this.accessTokenString = accessTokenString;
            return this;
        }
        public Builder bMSActiveRegion(@Nullable String bMSActiveRegion) {
            this.bMSActiveRegion = bMSActiveRegion;
            return this;
        }
        public Builder backupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }
        public Builder containerId(@Nullable String containerId) {
            this.containerId = containerId;
            return this;
        }
        public Builder containerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder containerType(@Nullable String containerType) {
            this.containerType = containerType;
            return this;
        }
        public Builder coordinatorServiceStampId(@Nullable String coordinatorServiceStampId) {
            this.coordinatorServiceStampId = coordinatorServiceStampId;
            return this;
        }
        public Builder coordinatorServiceStampUri(@Nullable String coordinatorServiceStampUri) {
            this.coordinatorServiceStampUri = coordinatorServiceStampUri;
            return this;
        }
        public Builder datasourceContainerName(@Nullable String datasourceContainerName) {
            this.datasourceContainerName = datasourceContainerName;
            return this;
        }
        public Builder datasourceId(@Nullable String datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public Builder datasourceName(@Nullable String datasourceName) {
            this.datasourceName = datasourceName;
            return this;
        }
        public Builder datasourceType(@Nullable String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder policyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }
        public Builder policyName(@Nullable String policyName) {
            this.policyName = policyName;
            return this;
        }
        public Builder protectableObjectContainerHostOsName(@Nullable String protectableObjectContainerHostOsName) {
            this.protectableObjectContainerHostOsName = protectableObjectContainerHostOsName;
            return this;
        }
        public Builder protectableObjectFriendlyName(@Nullable String protectableObjectFriendlyName) {
            this.protectableObjectFriendlyName = protectableObjectFriendlyName;
            return this;
        }
        public Builder protectableObjectParentLogicalContainerName(@Nullable String protectableObjectParentLogicalContainerName) {
            this.protectableObjectParentLogicalContainerName = protectableObjectParentLogicalContainerName;
            return this;
        }
        public Builder protectableObjectProtectionState(@Nullable String protectableObjectProtectionState) {
            this.protectableObjectProtectionState = protectableObjectProtectionState;
            return this;
        }
        public Builder protectableObjectUniqueName(@Nullable String protectableObjectUniqueName) {
            this.protectableObjectUniqueName = protectableObjectUniqueName;
            return this;
        }
        public Builder protectableObjectWorkloadType(@Nullable String protectableObjectWorkloadType) {
            this.protectableObjectWorkloadType = protectableObjectWorkloadType;
            return this;
        }
        public Builder protectionContainerId(@Nullable Double protectionContainerId) {
            this.protectionContainerId = protectionContainerId;
            return this;
        }
        public Builder protectionServiceStampId(@Nullable String protectionServiceStampId) {
            this.protectionServiceStampId = protectionServiceStampId;
            return this;
        }
        public Builder protectionServiceStampUri(@Nullable String protectionServiceStampUri) {
            this.protectionServiceStampUri = protectionServiceStampUri;
            return this;
        }
        public Builder recoveryPointId(@Nullable String recoveryPointId) {
            this.recoveryPointId = recoveryPointId;
            return this;
        }
        public Builder recoveryPointTime(@Nullable String recoveryPointTime) {
            this.recoveryPointTime = recoveryPointTime;
            return this;
        }
        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public Builder rpIsManagedVirtualMachine(@Nullable Boolean rpIsManagedVirtualMachine) {
            this.rpIsManagedVirtualMachine = rpIsManagedVirtualMachine;
            return this;
        }
        public Builder rpOriginalSAOption(@Nullable Boolean rpOriginalSAOption) {
            this.rpOriginalSAOption = rpOriginalSAOption;
            return this;
        }
        public Builder rpTierInformation(@Nullable Map<String,String> rpTierInformation) {
            this.rpTierInformation = rpTierInformation;
            return this;
        }
        public Builder rpVMSizeDescription(@Nullable String rpVMSizeDescription) {
            this.rpVMSizeDescription = rpVMSizeDescription;
            return this;
        }
        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Builder tokenExtendedInformation(@Nullable String tokenExtendedInformation) {
            this.tokenExtendedInformation = tokenExtendedInformation;
            return this;
        }        public WorkloadCrrAccessTokenResponse build() {
            return new WorkloadCrrAccessTokenResponse(accessTokenString, bMSActiveRegion, backupManagementType, containerId, containerName, containerType, coordinatorServiceStampId, coordinatorServiceStampUri, datasourceContainerName, datasourceId, datasourceName, datasourceType, objectType, policyId, policyName, protectableObjectContainerHostOsName, protectableObjectFriendlyName, protectableObjectParentLogicalContainerName, protectableObjectProtectionState, protectableObjectUniqueName, protectableObjectWorkloadType, protectionContainerId, protectionServiceStampId, protectionServiceStampUri, recoveryPointId, recoveryPointTime, resourceGroupName, resourceId, resourceName, rpIsManagedVirtualMachine, rpOriginalSAOption, rpTierInformation, rpVMSizeDescription, subscriptionId, tokenExtendedInformation);
        }
    }
}
