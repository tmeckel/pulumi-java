// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.BootDiagnosticsInstanceViewResponse;
import io.pulumi.azurenative.compute.inputs.DiskInstanceViewResponse;
import io.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import io.pulumi.azurenative.compute.inputs.MaintenanceRedeployStatusResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineAgentInstanceViewResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineExtensionInstanceViewResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineHealthStatusResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The instance view of a virtual machine scale set VM.
 * 
 */
public final class VirtualMachineScaleSetVMInstanceViewResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetVMInstanceViewResponse Empty = new VirtualMachineScaleSetVMInstanceViewResponse();

    /**
     * Resource id of the dedicated host, on which the virtual machine is allocated through automatic placement, when the virtual machine is associated with a dedicated host group that has automatic placement enabled. <br><br>Minimum api-version: 2020-06-01.
     * 
     */
    @InputImport(name="assignedHost", required=true)
      private final String assignedHost;

    public String getAssignedHost() {
        return this.assignedHost;
    }

    /**
     * Boot Diagnostics is a debugging feature which allows you to view Console Output and Screenshot to diagnose VM status. <br><br> You can easily view the output of your console log. <br><br> Azure also enables you to see a screenshot of the VM from the hypervisor.
     * 
     */
    @InputImport(name="bootDiagnostics")
      private final @Nullable BootDiagnosticsInstanceViewResponse bootDiagnostics;

    public Optional<BootDiagnosticsInstanceViewResponse> getBootDiagnostics() {
        return this.bootDiagnostics == null ? Optional.empty() : Optional.ofNullable(this.bootDiagnostics);
    }

    /**
     * The disks information.
     * 
     */
    @InputImport(name="disks")
      private final @Nullable List<DiskInstanceViewResponse> disks;

    public List<DiskInstanceViewResponse> getDisks() {
        return this.disks == null ? List.of() : this.disks;
    }

    /**
     * The extensions information.
     * 
     */
    @InputImport(name="extensions")
      private final @Nullable List<VirtualMachineExtensionInstanceViewResponse> extensions;

    public List<VirtualMachineExtensionInstanceViewResponse> getExtensions() {
        return this.extensions == null ? List.of() : this.extensions;
    }

    /**
     * The Maintenance Operation status on the virtual machine.
     * 
     */
    @InputImport(name="maintenanceRedeployStatus")
      private final @Nullable MaintenanceRedeployStatusResponse maintenanceRedeployStatus;

    public Optional<MaintenanceRedeployStatusResponse> getMaintenanceRedeployStatus() {
        return this.maintenanceRedeployStatus == null ? Optional.empty() : Optional.ofNullable(this.maintenanceRedeployStatus);
    }

    /**
     * The placement group in which the VM is running. If the VM is deallocated it will not have a placementGroupId.
     * 
     */
    @InputImport(name="placementGroupId")
      private final @Nullable String placementGroupId;

    public Optional<String> getPlacementGroupId() {
        return this.placementGroupId == null ? Optional.empty() : Optional.ofNullable(this.placementGroupId);
    }

    /**
     * The Fault Domain count.
     * 
     */
    @InputImport(name="platformFaultDomain")
      private final @Nullable Integer platformFaultDomain;

    public Optional<Integer> getPlatformFaultDomain() {
        return this.platformFaultDomain == null ? Optional.empty() : Optional.ofNullable(this.platformFaultDomain);
    }

    /**
     * The Update Domain count.
     * 
     */
    @InputImport(name="platformUpdateDomain")
      private final @Nullable Integer platformUpdateDomain;

    public Optional<Integer> getPlatformUpdateDomain() {
        return this.platformUpdateDomain == null ? Optional.empty() : Optional.ofNullable(this.platformUpdateDomain);
    }

    /**
     * The Remote desktop certificate thumbprint.
     * 
     */
    @InputImport(name="rdpThumbPrint")
      private final @Nullable String rdpThumbPrint;

    public Optional<String> getRdpThumbPrint() {
        return this.rdpThumbPrint == null ? Optional.empty() : Optional.ofNullable(this.rdpThumbPrint);
    }

    /**
     * The resource status information.
     * 
     */
    @InputImport(name="statuses")
      private final @Nullable List<InstanceViewStatusResponse> statuses;

    public List<InstanceViewStatusResponse> getStatuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    /**
     * The VM Agent running on the virtual machine.
     * 
     */
    @InputImport(name="vmAgent")
      private final @Nullable VirtualMachineAgentInstanceViewResponse vmAgent;

    public Optional<VirtualMachineAgentInstanceViewResponse> getVmAgent() {
        return this.vmAgent == null ? Optional.empty() : Optional.ofNullable(this.vmAgent);
    }

    /**
     * The health status for the VM.
     * 
     */
    @InputImport(name="vmHealth", required=true)
      private final VirtualMachineHealthStatusResponse vmHealth;

    public VirtualMachineHealthStatusResponse getVmHealth() {
        return this.vmHealth;
    }

    public VirtualMachineScaleSetVMInstanceViewResponse(
        String assignedHost,
        @Nullable BootDiagnosticsInstanceViewResponse bootDiagnostics,
        @Nullable List<DiskInstanceViewResponse> disks,
        @Nullable List<VirtualMachineExtensionInstanceViewResponse> extensions,
        @Nullable MaintenanceRedeployStatusResponse maintenanceRedeployStatus,
        @Nullable String placementGroupId,
        @Nullable Integer platformFaultDomain,
        @Nullable Integer platformUpdateDomain,
        @Nullable String rdpThumbPrint,
        @Nullable List<InstanceViewStatusResponse> statuses,
        @Nullable VirtualMachineAgentInstanceViewResponse vmAgent,
        VirtualMachineHealthStatusResponse vmHealth) {
        this.assignedHost = Objects.requireNonNull(assignedHost, "expected parameter 'assignedHost' to be non-null");
        this.bootDiagnostics = bootDiagnostics;
        this.disks = disks;
        this.extensions = extensions;
        this.maintenanceRedeployStatus = maintenanceRedeployStatus;
        this.placementGroupId = placementGroupId;
        this.platformFaultDomain = platformFaultDomain;
        this.platformUpdateDomain = platformUpdateDomain;
        this.rdpThumbPrint = rdpThumbPrint;
        this.statuses = statuses;
        this.vmAgent = vmAgent;
        this.vmHealth = Objects.requireNonNull(vmHealth, "expected parameter 'vmHealth' to be non-null");
    }

    private VirtualMachineScaleSetVMInstanceViewResponse() {
        this.assignedHost = null;
        this.bootDiagnostics = null;
        this.disks = List.of();
        this.extensions = List.of();
        this.maintenanceRedeployStatus = null;
        this.placementGroupId = null;
        this.platformFaultDomain = null;
        this.platformUpdateDomain = null;
        this.rdpThumbPrint = null;
        this.statuses = List.of();
        this.vmAgent = null;
        this.vmHealth = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetVMInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assignedHost;
        private @Nullable BootDiagnosticsInstanceViewResponse bootDiagnostics;
        private @Nullable List<DiskInstanceViewResponse> disks;
        private @Nullable List<VirtualMachineExtensionInstanceViewResponse> extensions;
        private @Nullable MaintenanceRedeployStatusResponse maintenanceRedeployStatus;
        private @Nullable String placementGroupId;
        private @Nullable Integer platformFaultDomain;
        private @Nullable Integer platformUpdateDomain;
        private @Nullable String rdpThumbPrint;
        private @Nullable List<InstanceViewStatusResponse> statuses;
        private @Nullable VirtualMachineAgentInstanceViewResponse vmAgent;
        private VirtualMachineHealthStatusResponse vmHealth;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetVMInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignedHost = defaults.assignedHost;
    	      this.bootDiagnostics = defaults.bootDiagnostics;
    	      this.disks = defaults.disks;
    	      this.extensions = defaults.extensions;
    	      this.maintenanceRedeployStatus = defaults.maintenanceRedeployStatus;
    	      this.placementGroupId = defaults.placementGroupId;
    	      this.platformFaultDomain = defaults.platformFaultDomain;
    	      this.platformUpdateDomain = defaults.platformUpdateDomain;
    	      this.rdpThumbPrint = defaults.rdpThumbPrint;
    	      this.statuses = defaults.statuses;
    	      this.vmAgent = defaults.vmAgent;
    	      this.vmHealth = defaults.vmHealth;
        }

        public Builder assignedHost(String assignedHost) {
            this.assignedHost = Objects.requireNonNull(assignedHost);
            return this;
        }

        public Builder bootDiagnostics(@Nullable BootDiagnosticsInstanceViewResponse bootDiagnostics) {
            this.bootDiagnostics = bootDiagnostics;
            return this;
        }

        public Builder disks(@Nullable List<DiskInstanceViewResponse> disks) {
            this.disks = disks;
            return this;
        }

        public Builder extensions(@Nullable List<VirtualMachineExtensionInstanceViewResponse> extensions) {
            this.extensions = extensions;
            return this;
        }

        public Builder maintenanceRedeployStatus(@Nullable MaintenanceRedeployStatusResponse maintenanceRedeployStatus) {
            this.maintenanceRedeployStatus = maintenanceRedeployStatus;
            return this;
        }

        public Builder placementGroupId(@Nullable String placementGroupId) {
            this.placementGroupId = placementGroupId;
            return this;
        }

        public Builder platformFaultDomain(@Nullable Integer platformFaultDomain) {
            this.platformFaultDomain = platformFaultDomain;
            return this;
        }

        public Builder platformUpdateDomain(@Nullable Integer platformUpdateDomain) {
            this.platformUpdateDomain = platformUpdateDomain;
            return this;
        }

        public Builder rdpThumbPrint(@Nullable String rdpThumbPrint) {
            this.rdpThumbPrint = rdpThumbPrint;
            return this;
        }

        public Builder statuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }

        public Builder vmAgent(@Nullable VirtualMachineAgentInstanceViewResponse vmAgent) {
            this.vmAgent = vmAgent;
            return this;
        }

        public Builder vmHealth(VirtualMachineHealthStatusResponse vmHealth) {
            this.vmHealth = Objects.requireNonNull(vmHealth);
            return this;
        }
        public VirtualMachineScaleSetVMInstanceViewResponse build() {
            return new VirtualMachineScaleSetVMInstanceViewResponse(assignedHost, bootDiagnostics, disks, extensions, maintenanceRedeployStatus, placementGroupId, platformFaultDomain, platformUpdateDomain, rdpThumbPrint, statuses, vmAgent, vmHealth);
        }
    }
}
