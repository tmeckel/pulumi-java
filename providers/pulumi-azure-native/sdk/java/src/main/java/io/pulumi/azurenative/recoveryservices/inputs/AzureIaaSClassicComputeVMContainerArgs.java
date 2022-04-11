// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IaaS VM workload-specific backup item representing a classic virtual machine.
 * 
 */
public final class AzureIaaSClassicComputeVMContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureIaaSClassicComputeVMContainerArgs Empty = new AzureIaaSClassicComputeVMContainerArgs();

    /**
     * Type of backup management for the container.
     * 
     */
    @Import(name="backupManagementType")
      private final @Nullable Output<Either<String,BackupManagementType>> backupManagementType;

    public Output<Either<String,BackupManagementType>> getBackupManagementType() {
        return this.backupManagementType == null ? Codegen.empty() : this.backupManagementType;
    }

    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is 'Microsoft.ClassicCompute/virtualMachines'.
     * 
     */
    @Import(name="containerType", required=true)
      private final Output<String> containerType;

    public Output<String> getContainerType() {
        return this.containerType;
    }

    /**
     * Friendly name of the container.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> getFriendlyName() {
        return this.friendlyName == null ? Codegen.empty() : this.friendlyName;
    }

    /**
     * Status of health of the container.
     * 
     */
    @Import(name="healthStatus")
      private final @Nullable Output<String> healthStatus;

    public Output<String> getHealthStatus() {
        return this.healthStatus == null ? Codegen.empty() : this.healthStatus;
    }

    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @Import(name="registrationStatus")
      private final @Nullable Output<String> registrationStatus;

    public Output<String> getRegistrationStatus() {
        return this.registrationStatus == null ? Codegen.empty() : this.registrationStatus;
    }

    /**
     * Resource group name of Recovery Services Vault.
     * 
     */
    @Import(name="resourceGroup")
      private final @Nullable Output<String> resourceGroup;

    public Output<String> getResourceGroup() {
        return this.resourceGroup == null ? Codegen.empty() : this.resourceGroup;
    }

    /**
     * Fully qualified ARM url of the virtual machine represented by this Azure IaaS VM container.
     * 
     */
    @Import(name="virtualMachineId")
      private final @Nullable Output<String> virtualMachineId;

    public Output<String> getVirtualMachineId() {
        return this.virtualMachineId == null ? Codegen.empty() : this.virtualMachineId;
    }

    /**
     * Specifies whether the container represents a Classic or an Azure Resource Manager VM.
     * 
     */
    @Import(name="virtualMachineVersion")
      private final @Nullable Output<String> virtualMachineVersion;

    public Output<String> getVirtualMachineVersion() {
        return this.virtualMachineVersion == null ? Codegen.empty() : this.virtualMachineVersion;
    }

    public AzureIaaSClassicComputeVMContainerArgs(
        @Nullable Output<Either<String,BackupManagementType>> backupManagementType,
        Output<String> containerType,
        @Nullable Output<String> friendlyName,
        @Nullable Output<String> healthStatus,
        @Nullable Output<String> registrationStatus,
        @Nullable Output<String> resourceGroup,
        @Nullable Output<String> virtualMachineId,
        @Nullable Output<String> virtualMachineVersion) {
        this.backupManagementType = backupManagementType;
        this.containerType = Objects.requireNonNull(containerType, "expected parameter 'containerType' to be non-null");
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.registrationStatus = registrationStatus;
        this.resourceGroup = resourceGroup;
        this.virtualMachineId = virtualMachineId;
        this.virtualMachineVersion = virtualMachineVersion;
    }

    private AzureIaaSClassicComputeVMContainerArgs() {
        this.backupManagementType = Codegen.empty();
        this.containerType = Codegen.empty();
        this.friendlyName = Codegen.empty();
        this.healthStatus = Codegen.empty();
        this.registrationStatus = Codegen.empty();
        this.resourceGroup = Codegen.empty();
        this.virtualMachineId = Codegen.empty();
        this.virtualMachineVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIaaSClassicComputeVMContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,BackupManagementType>> backupManagementType;
        private Output<String> containerType;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<String> healthStatus;
        private @Nullable Output<String> registrationStatus;
        private @Nullable Output<String> resourceGroup;
        private @Nullable Output<String> virtualMachineId;
        private @Nullable Output<String> virtualMachineVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureIaaSClassicComputeVMContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.containerType = defaults.containerType;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.registrationStatus = defaults.registrationStatus;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.virtualMachineId = defaults.virtualMachineId;
    	      this.virtualMachineVersion = defaults.virtualMachineVersion;
        }

        public Builder backupManagementType(@Nullable Output<Either<String,BackupManagementType>> backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }
        public Builder backupManagementType(@Nullable Either<String,BackupManagementType> backupManagementType) {
            this.backupManagementType = Codegen.ofNullable(backupManagementType);
            return this;
        }
        public Builder containerType(Output<String> containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }
        public Builder containerType(String containerType) {
            this.containerType = Output.of(Objects.requireNonNull(containerType));
            return this;
        }
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = Codegen.ofNullable(friendlyName);
            return this;
        }
        public Builder healthStatus(@Nullable Output<String> healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public Builder healthStatus(@Nullable String healthStatus) {
            this.healthStatus = Codegen.ofNullable(healthStatus);
            return this;
        }
        public Builder registrationStatus(@Nullable Output<String> registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }
        public Builder registrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = Codegen.ofNullable(registrationStatus);
            return this;
        }
        public Builder resourceGroup(@Nullable Output<String> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = Codegen.ofNullable(resourceGroup);
            return this;
        }
        public Builder virtualMachineId(@Nullable Output<String> virtualMachineId) {
            this.virtualMachineId = virtualMachineId;
            return this;
        }
        public Builder virtualMachineId(@Nullable String virtualMachineId) {
            this.virtualMachineId = Codegen.ofNullable(virtualMachineId);
            return this;
        }
        public Builder virtualMachineVersion(@Nullable Output<String> virtualMachineVersion) {
            this.virtualMachineVersion = virtualMachineVersion;
            return this;
        }
        public Builder virtualMachineVersion(@Nullable String virtualMachineVersion) {
            this.virtualMachineVersion = Codegen.ofNullable(virtualMachineVersion);
            return this;
        }        public AzureIaaSClassicComputeVMContainerArgs build() {
            return new AzureIaaSClassicComputeVMContainerArgs(backupManagementType, containerType, friendlyName, healthStatus, registrationStatus, resourceGroup, virtualMachineId, virtualMachineVersion);
        }
    }
}
