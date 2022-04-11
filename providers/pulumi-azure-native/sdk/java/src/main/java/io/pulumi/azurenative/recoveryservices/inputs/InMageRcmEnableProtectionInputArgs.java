// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.LicenseType;
import io.pulumi.azurenative.recoveryservices.inputs.InMageRcmDiskInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.InMageRcmDisksDefaultInputArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * InMageRcm specific enable protection input.
 * 
 */
public final class InMageRcmEnableProtectionInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final InMageRcmEnableProtectionInputArgs Empty = new InMageRcmEnableProtectionInputArgs();

    /**
     * The default disk input.
     * 
     */
    @Import(name="disksDefault")
      private final @Nullable Output<InMageRcmDisksDefaultInputArgs> disksDefault;

    public Output<InMageRcmDisksDefaultInputArgs> getDisksDefault() {
        return this.disksDefault == null ? Codegen.empty() : this.disksDefault;
    }

    /**
     * The disks to include list.
     * 
     */
    @Import(name="disksToInclude")
      private final @Nullable Output<List<InMageRcmDiskInputArgs>> disksToInclude;

    public Output<List<InMageRcmDiskInputArgs>> getDisksToInclude() {
        return this.disksToInclude == null ? Codegen.empty() : this.disksToInclude;
    }

    /**
     * The ARM Id of discovered machine.
     * 
     */
    @Import(name="fabricDiscoveryMachineId")
      private final @Nullable Output<String> fabricDiscoveryMachineId;

    public Output<String> getFabricDiscoveryMachineId() {
        return this.fabricDiscoveryMachineId == null ? Codegen.empty() : this.fabricDiscoveryMachineId;
    }

    /**
     * The class type.
     * Expected value is 'InMageRcm'.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    /**
     * The license type.
     * 
     */
    @Import(name="licenseType")
      private final @Nullable Output<Either<String,LicenseType>> licenseType;

    public Output<Either<String,LicenseType>> getLicenseType() {
        return this.licenseType == null ? Codegen.empty() : this.licenseType;
    }

    /**
     * The multi VM group name.
     * 
     */
    @Import(name="multiVmGroupName")
      private final @Nullable Output<String> multiVmGroupName;

    public Output<String> getMultiVmGroupName() {
        return this.multiVmGroupName == null ? Codegen.empty() : this.multiVmGroupName;
    }

    /**
     * The process server Id.
     * 
     */
    @Import(name="processServerId")
      private final @Nullable Output<String> processServerId;

    public Output<String> getProcessServerId() {
        return this.processServerId == null ? Codegen.empty() : this.processServerId;
    }

    /**
     * The run-as account Id.
     * 
     */
    @Import(name="runAsAccountId")
      private final @Nullable Output<String> runAsAccountId;

    public Output<String> getRunAsAccountId() {
        return this.runAsAccountId == null ? Codegen.empty() : this.runAsAccountId;
    }

    /**
     * The target availability set ARM Id.
     * 
     */
    @Import(name="targetAvailabilitySetId")
      private final @Nullable Output<String> targetAvailabilitySetId;

    public Output<String> getTargetAvailabilitySetId() {
        return this.targetAvailabilitySetId == null ? Codegen.empty() : this.targetAvailabilitySetId;
    }

    /**
     * The target availability zone.
     * 
     */
    @Import(name="targetAvailabilityZone")
      private final @Nullable Output<String> targetAvailabilityZone;

    public Output<String> getTargetAvailabilityZone() {
        return this.targetAvailabilityZone == null ? Codegen.empty() : this.targetAvailabilityZone;
    }

    /**
     * The target boot diagnostics storage account ARM Id.
     * 
     */
    @Import(name="targetBootDiagnosticsStorageAccountId")
      private final @Nullable Output<String> targetBootDiagnosticsStorageAccountId;

    public Output<String> getTargetBootDiagnosticsStorageAccountId() {
        return this.targetBootDiagnosticsStorageAccountId == null ? Codegen.empty() : this.targetBootDiagnosticsStorageAccountId;
    }

    /**
     * The selected target network ARM Id.
     * 
     */
    @Import(name="targetNetworkId")
      private final @Nullable Output<String> targetNetworkId;

    public Output<String> getTargetNetworkId() {
        return this.targetNetworkId == null ? Codegen.empty() : this.targetNetworkId;
    }

    /**
     * The target proximity placement group Id.
     * 
     */
    @Import(name="targetProximityPlacementGroupId")
      private final @Nullable Output<String> targetProximityPlacementGroupId;

    public Output<String> getTargetProximityPlacementGroupId() {
        return this.targetProximityPlacementGroupId == null ? Codegen.empty() : this.targetProximityPlacementGroupId;
    }

    /**
     * The target resource group ARM Id.
     * 
     */
    @Import(name="targetResourceGroupId")
      private final @Nullable Output<String> targetResourceGroupId;

    public Output<String> getTargetResourceGroupId() {
        return this.targetResourceGroupId == null ? Codegen.empty() : this.targetResourceGroupId;
    }

    /**
     * The selected target subnet name.
     * 
     */
    @Import(name="targetSubnetName")
      private final @Nullable Output<String> targetSubnetName;

    public Output<String> getTargetSubnetName() {
        return this.targetSubnetName == null ? Codegen.empty() : this.targetSubnetName;
    }

    /**
     * The target VM name.
     * 
     */
    @Import(name="targetVmName")
      private final @Nullable Output<String> targetVmName;

    public Output<String> getTargetVmName() {
        return this.targetVmName == null ? Codegen.empty() : this.targetVmName;
    }

    /**
     * The target VM size.
     * 
     */
    @Import(name="targetVmSize")
      private final @Nullable Output<String> targetVmSize;

    public Output<String> getTargetVmSize() {
        return this.targetVmSize == null ? Codegen.empty() : this.targetVmSize;
    }

    /**
     * The selected test network ARM Id.
     * 
     */
    @Import(name="testNetworkId")
      private final @Nullable Output<String> testNetworkId;

    public Output<String> getTestNetworkId() {
        return this.testNetworkId == null ? Codegen.empty() : this.testNetworkId;
    }

    /**
     * The selected test subnet name.
     * 
     */
    @Import(name="testSubnetName")
      private final @Nullable Output<String> testSubnetName;

    public Output<String> getTestSubnetName() {
        return this.testSubnetName == null ? Codegen.empty() : this.testSubnetName;
    }

    public InMageRcmEnableProtectionInputArgs(
        @Nullable Output<InMageRcmDisksDefaultInputArgs> disksDefault,
        @Nullable Output<List<InMageRcmDiskInputArgs>> disksToInclude,
        @Nullable Output<String> fabricDiscoveryMachineId,
        @Nullable Output<String> instanceType,
        @Nullable Output<Either<String,LicenseType>> licenseType,
        @Nullable Output<String> multiVmGroupName,
        @Nullable Output<String> processServerId,
        @Nullable Output<String> runAsAccountId,
        @Nullable Output<String> targetAvailabilitySetId,
        @Nullable Output<String> targetAvailabilityZone,
        @Nullable Output<String> targetBootDiagnosticsStorageAccountId,
        @Nullable Output<String> targetNetworkId,
        @Nullable Output<String> targetProximityPlacementGroupId,
        @Nullable Output<String> targetResourceGroupId,
        @Nullable Output<String> targetSubnetName,
        @Nullable Output<String> targetVmName,
        @Nullable Output<String> targetVmSize,
        @Nullable Output<String> testNetworkId,
        @Nullable Output<String> testSubnetName) {
        this.disksDefault = disksDefault;
        this.disksToInclude = disksToInclude;
        this.fabricDiscoveryMachineId = fabricDiscoveryMachineId;
        this.instanceType = instanceType;
        this.licenseType = licenseType;
        this.multiVmGroupName = multiVmGroupName;
        this.processServerId = processServerId;
        this.runAsAccountId = runAsAccountId;
        this.targetAvailabilitySetId = targetAvailabilitySetId;
        this.targetAvailabilityZone = targetAvailabilityZone;
        this.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
        this.targetNetworkId = targetNetworkId;
        this.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
        this.targetResourceGroupId = targetResourceGroupId;
        this.targetSubnetName = targetSubnetName;
        this.targetVmName = targetVmName;
        this.targetVmSize = targetVmSize;
        this.testNetworkId = testNetworkId;
        this.testSubnetName = testSubnetName;
    }

    private InMageRcmEnableProtectionInputArgs() {
        this.disksDefault = Codegen.empty();
        this.disksToInclude = Codegen.empty();
        this.fabricDiscoveryMachineId = Codegen.empty();
        this.instanceType = Codegen.empty();
        this.licenseType = Codegen.empty();
        this.multiVmGroupName = Codegen.empty();
        this.processServerId = Codegen.empty();
        this.runAsAccountId = Codegen.empty();
        this.targetAvailabilitySetId = Codegen.empty();
        this.targetAvailabilityZone = Codegen.empty();
        this.targetBootDiagnosticsStorageAccountId = Codegen.empty();
        this.targetNetworkId = Codegen.empty();
        this.targetProximityPlacementGroupId = Codegen.empty();
        this.targetResourceGroupId = Codegen.empty();
        this.targetSubnetName = Codegen.empty();
        this.targetVmName = Codegen.empty();
        this.targetVmSize = Codegen.empty();
        this.testNetworkId = Codegen.empty();
        this.testSubnetName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageRcmEnableProtectionInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InMageRcmDisksDefaultInputArgs> disksDefault;
        private @Nullable Output<List<InMageRcmDiskInputArgs>> disksToInclude;
        private @Nullable Output<String> fabricDiscoveryMachineId;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<Either<String,LicenseType>> licenseType;
        private @Nullable Output<String> multiVmGroupName;
        private @Nullable Output<String> processServerId;
        private @Nullable Output<String> runAsAccountId;
        private @Nullable Output<String> targetAvailabilitySetId;
        private @Nullable Output<String> targetAvailabilityZone;
        private @Nullable Output<String> targetBootDiagnosticsStorageAccountId;
        private @Nullable Output<String> targetNetworkId;
        private @Nullable Output<String> targetProximityPlacementGroupId;
        private @Nullable Output<String> targetResourceGroupId;
        private @Nullable Output<String> targetSubnetName;
        private @Nullable Output<String> targetVmName;
        private @Nullable Output<String> targetVmSize;
        private @Nullable Output<String> testNetworkId;
        private @Nullable Output<String> testSubnetName;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageRcmEnableProtectionInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disksDefault = defaults.disksDefault;
    	      this.disksToInclude = defaults.disksToInclude;
    	      this.fabricDiscoveryMachineId = defaults.fabricDiscoveryMachineId;
    	      this.instanceType = defaults.instanceType;
    	      this.licenseType = defaults.licenseType;
    	      this.multiVmGroupName = defaults.multiVmGroupName;
    	      this.processServerId = defaults.processServerId;
    	      this.runAsAccountId = defaults.runAsAccountId;
    	      this.targetAvailabilitySetId = defaults.targetAvailabilitySetId;
    	      this.targetAvailabilityZone = defaults.targetAvailabilityZone;
    	      this.targetBootDiagnosticsStorageAccountId = defaults.targetBootDiagnosticsStorageAccountId;
    	      this.targetNetworkId = defaults.targetNetworkId;
    	      this.targetProximityPlacementGroupId = defaults.targetProximityPlacementGroupId;
    	      this.targetResourceGroupId = defaults.targetResourceGroupId;
    	      this.targetSubnetName = defaults.targetSubnetName;
    	      this.targetVmName = defaults.targetVmName;
    	      this.targetVmSize = defaults.targetVmSize;
    	      this.testNetworkId = defaults.testNetworkId;
    	      this.testSubnetName = defaults.testSubnetName;
        }

        public Builder disksDefault(@Nullable Output<InMageRcmDisksDefaultInputArgs> disksDefault) {
            this.disksDefault = disksDefault;
            return this;
        }
        public Builder disksDefault(@Nullable InMageRcmDisksDefaultInputArgs disksDefault) {
            this.disksDefault = Codegen.ofNullable(disksDefault);
            return this;
        }
        public Builder disksToInclude(@Nullable Output<List<InMageRcmDiskInputArgs>> disksToInclude) {
            this.disksToInclude = disksToInclude;
            return this;
        }
        public Builder disksToInclude(@Nullable List<InMageRcmDiskInputArgs> disksToInclude) {
            this.disksToInclude = Codegen.ofNullable(disksToInclude);
            return this;
        }
        public Builder disksToInclude(InMageRcmDiskInputArgs... disksToInclude) {
            return disksToInclude(List.of(disksToInclude));
        }
        public Builder fabricDiscoveryMachineId(@Nullable Output<String> fabricDiscoveryMachineId) {
            this.fabricDiscoveryMachineId = fabricDiscoveryMachineId;
            return this;
        }
        public Builder fabricDiscoveryMachineId(@Nullable String fabricDiscoveryMachineId) {
            this.fabricDiscoveryMachineId = Codegen.ofNullable(fabricDiscoveryMachineId);
            return this;
        }
        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Codegen.ofNullable(instanceType);
            return this;
        }
        public Builder licenseType(@Nullable Output<Either<String,LicenseType>> licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Builder licenseType(@Nullable Either<String,LicenseType> licenseType) {
            this.licenseType = Codegen.ofNullable(licenseType);
            return this;
        }
        public Builder multiVmGroupName(@Nullable Output<String> multiVmGroupName) {
            this.multiVmGroupName = multiVmGroupName;
            return this;
        }
        public Builder multiVmGroupName(@Nullable String multiVmGroupName) {
            this.multiVmGroupName = Codegen.ofNullable(multiVmGroupName);
            return this;
        }
        public Builder processServerId(@Nullable Output<String> processServerId) {
            this.processServerId = processServerId;
            return this;
        }
        public Builder processServerId(@Nullable String processServerId) {
            this.processServerId = Codegen.ofNullable(processServerId);
            return this;
        }
        public Builder runAsAccountId(@Nullable Output<String> runAsAccountId) {
            this.runAsAccountId = runAsAccountId;
            return this;
        }
        public Builder runAsAccountId(@Nullable String runAsAccountId) {
            this.runAsAccountId = Codegen.ofNullable(runAsAccountId);
            return this;
        }
        public Builder targetAvailabilitySetId(@Nullable Output<String> targetAvailabilitySetId) {
            this.targetAvailabilitySetId = targetAvailabilitySetId;
            return this;
        }
        public Builder targetAvailabilitySetId(@Nullable String targetAvailabilitySetId) {
            this.targetAvailabilitySetId = Codegen.ofNullable(targetAvailabilitySetId);
            return this;
        }
        public Builder targetAvailabilityZone(@Nullable Output<String> targetAvailabilityZone) {
            this.targetAvailabilityZone = targetAvailabilityZone;
            return this;
        }
        public Builder targetAvailabilityZone(@Nullable String targetAvailabilityZone) {
            this.targetAvailabilityZone = Codegen.ofNullable(targetAvailabilityZone);
            return this;
        }
        public Builder targetBootDiagnosticsStorageAccountId(@Nullable Output<String> targetBootDiagnosticsStorageAccountId) {
            this.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
            return this;
        }
        public Builder targetBootDiagnosticsStorageAccountId(@Nullable String targetBootDiagnosticsStorageAccountId) {
            this.targetBootDiagnosticsStorageAccountId = Codegen.ofNullable(targetBootDiagnosticsStorageAccountId);
            return this;
        }
        public Builder targetNetworkId(@Nullable Output<String> targetNetworkId) {
            this.targetNetworkId = targetNetworkId;
            return this;
        }
        public Builder targetNetworkId(@Nullable String targetNetworkId) {
            this.targetNetworkId = Codegen.ofNullable(targetNetworkId);
            return this;
        }
        public Builder targetProximityPlacementGroupId(@Nullable Output<String> targetProximityPlacementGroupId) {
            this.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
            return this;
        }
        public Builder targetProximityPlacementGroupId(@Nullable String targetProximityPlacementGroupId) {
            this.targetProximityPlacementGroupId = Codegen.ofNullable(targetProximityPlacementGroupId);
            return this;
        }
        public Builder targetResourceGroupId(@Nullable Output<String> targetResourceGroupId) {
            this.targetResourceGroupId = targetResourceGroupId;
            return this;
        }
        public Builder targetResourceGroupId(@Nullable String targetResourceGroupId) {
            this.targetResourceGroupId = Codegen.ofNullable(targetResourceGroupId);
            return this;
        }
        public Builder targetSubnetName(@Nullable Output<String> targetSubnetName) {
            this.targetSubnetName = targetSubnetName;
            return this;
        }
        public Builder targetSubnetName(@Nullable String targetSubnetName) {
            this.targetSubnetName = Codegen.ofNullable(targetSubnetName);
            return this;
        }
        public Builder targetVmName(@Nullable Output<String> targetVmName) {
            this.targetVmName = targetVmName;
            return this;
        }
        public Builder targetVmName(@Nullable String targetVmName) {
            this.targetVmName = Codegen.ofNullable(targetVmName);
            return this;
        }
        public Builder targetVmSize(@Nullable Output<String> targetVmSize) {
            this.targetVmSize = targetVmSize;
            return this;
        }
        public Builder targetVmSize(@Nullable String targetVmSize) {
            this.targetVmSize = Codegen.ofNullable(targetVmSize);
            return this;
        }
        public Builder testNetworkId(@Nullable Output<String> testNetworkId) {
            this.testNetworkId = testNetworkId;
            return this;
        }
        public Builder testNetworkId(@Nullable String testNetworkId) {
            this.testNetworkId = Codegen.ofNullable(testNetworkId);
            return this;
        }
        public Builder testSubnetName(@Nullable Output<String> testSubnetName) {
            this.testSubnetName = testSubnetName;
            return this;
        }
        public Builder testSubnetName(@Nullable String testSubnetName) {
            this.testSubnetName = Codegen.ofNullable(testSubnetName);
            return this;
        }        public InMageRcmEnableProtectionInputArgs build() {
            return new InMageRcmEnableProtectionInputArgs(disksDefault, disksToInclude, fabricDiscoveryMachineId, instanceType, licenseType, multiVmGroupName, processServerId, runAsAccountId, targetAvailabilitySetId, targetAvailabilityZone, targetBootDiagnosticsStorageAccountId, targetNetworkId, targetProximityPlacementGroupId, targetResourceGroupId, targetSubnetName, targetVmName, targetVmSize, testNetworkId, testSubnetName);
        }
    }
}
