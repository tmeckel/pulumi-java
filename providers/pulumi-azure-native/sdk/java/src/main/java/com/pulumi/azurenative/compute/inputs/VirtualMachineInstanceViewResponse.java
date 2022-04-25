// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.BootDiagnosticsInstanceViewResponse;
import com.pulumi.azurenative.compute.inputs.DiskInstanceViewResponse;
import com.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import com.pulumi.azurenative.compute.inputs.MaintenanceRedeployStatusResponse;
import com.pulumi.azurenative.compute.inputs.VirtualMachineAgentInstanceViewResponse;
import com.pulumi.azurenative.compute.inputs.VirtualMachineExtensionInstanceViewResponse;
import com.pulumi.azurenative.compute.inputs.VirtualMachineHealthStatusResponse;
import com.pulumi.azurenative.compute.inputs.VirtualMachinePatchStatusResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The instance view of a virtual machine.
 * 
 */
public final class VirtualMachineInstanceViewResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualMachineInstanceViewResponse Empty = new VirtualMachineInstanceViewResponse();

    /**
     * Resource id of the dedicated host, on which the virtual machine is allocated through automatic placement, when the virtual machine is associated with a dedicated host group that has automatic placement enabled. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     * 
     */
    @Import(name="assignedHost", required=true)
    private String assignedHost;

    /**
     * @return Resource id of the dedicated host, on which the virtual machine is allocated through automatic placement, when the virtual machine is associated with a dedicated host group that has automatic placement enabled. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     * 
     */
    public String assignedHost() {
        return this.assignedHost;
    }

    /**
     * Boot Diagnostics is a debugging feature which allows you to view Console Output and Screenshot to diagnose VM status. &lt;br&gt;&lt;br&gt; You can easily view the output of your console log. &lt;br&gt;&lt;br&gt; Azure also enables you to see a screenshot of the VM from the hypervisor.
     * 
     */
    @Import(name="bootDiagnostics")
    private @Nullable BootDiagnosticsInstanceViewResponse bootDiagnostics;

    /**
     * @return Boot Diagnostics is a debugging feature which allows you to view Console Output and Screenshot to diagnose VM status. &lt;br&gt;&lt;br&gt; You can easily view the output of your console log. &lt;br&gt;&lt;br&gt; Azure also enables you to see a screenshot of the VM from the hypervisor.
     * 
     */
    public Optional<BootDiagnosticsInstanceViewResponse> bootDiagnostics() {
        return Optional.ofNullable(this.bootDiagnostics);
    }

    /**
     * The computer name assigned to the virtual machine.
     * 
     */
    @Import(name="computerName")
    private @Nullable String computerName;

    /**
     * @return The computer name assigned to the virtual machine.
     * 
     */
    public Optional<String> computerName() {
        return Optional.ofNullable(this.computerName);
    }

    /**
     * The virtual machine disk information.
     * 
     */
    @Import(name="disks")
    private @Nullable List<DiskInstanceViewResponse> disks;

    /**
     * @return The virtual machine disk information.
     * 
     */
    public Optional<List<DiskInstanceViewResponse>> disks() {
        return Optional.ofNullable(this.disks);
    }

    /**
     * The extensions information.
     * 
     */
    @Import(name="extensions")
    private @Nullable List<VirtualMachineExtensionInstanceViewResponse> extensions;

    /**
     * @return The extensions information.
     * 
     */
    public Optional<List<VirtualMachineExtensionInstanceViewResponse>> extensions() {
        return Optional.ofNullable(this.extensions);
    }

    /**
     * Specifies the HyperVGeneration Type associated with a resource
     * 
     */
    @Import(name="hyperVGeneration")
    private @Nullable String hyperVGeneration;

    /**
     * @return Specifies the HyperVGeneration Type associated with a resource
     * 
     */
    public Optional<String> hyperVGeneration() {
        return Optional.ofNullable(this.hyperVGeneration);
    }

    /**
     * The Maintenance Operation status on the virtual machine.
     * 
     */
    @Import(name="maintenanceRedeployStatus")
    private @Nullable MaintenanceRedeployStatusResponse maintenanceRedeployStatus;

    /**
     * @return The Maintenance Operation status on the virtual machine.
     * 
     */
    public Optional<MaintenanceRedeployStatusResponse> maintenanceRedeployStatus() {
        return Optional.ofNullable(this.maintenanceRedeployStatus);
    }

    /**
     * The Operating System running on the virtual machine.
     * 
     */
    @Import(name="osName")
    private @Nullable String osName;

    /**
     * @return The Operating System running on the virtual machine.
     * 
     */
    public Optional<String> osName() {
        return Optional.ofNullable(this.osName);
    }

    /**
     * The version of Operating System running on the virtual machine.
     * 
     */
    @Import(name="osVersion")
    private @Nullable String osVersion;

    /**
     * @return The version of Operating System running on the virtual machine.
     * 
     */
    public Optional<String> osVersion() {
        return Optional.ofNullable(this.osVersion);
    }

    /**
     * [Preview Feature] The status of virtual machine patch operations.
     * 
     */
    @Import(name="patchStatus")
    private @Nullable VirtualMachinePatchStatusResponse patchStatus;

    /**
     * @return [Preview Feature] The status of virtual machine patch operations.
     * 
     */
    public Optional<VirtualMachinePatchStatusResponse> patchStatus() {
        return Optional.ofNullable(this.patchStatus);
    }

    /**
     * Specifies the fault domain of the virtual machine.
     * 
     */
    @Import(name="platformFaultDomain")
    private @Nullable Integer platformFaultDomain;

    /**
     * @return Specifies the fault domain of the virtual machine.
     * 
     */
    public Optional<Integer> platformFaultDomain() {
        return Optional.ofNullable(this.platformFaultDomain);
    }

    /**
     * Specifies the update domain of the virtual machine.
     * 
     */
    @Import(name="platformUpdateDomain")
    private @Nullable Integer platformUpdateDomain;

    /**
     * @return Specifies the update domain of the virtual machine.
     * 
     */
    public Optional<Integer> platformUpdateDomain() {
        return Optional.ofNullable(this.platformUpdateDomain);
    }

    /**
     * The Remote desktop certificate thumbprint.
     * 
     */
    @Import(name="rdpThumbPrint")
    private @Nullable String rdpThumbPrint;

    /**
     * @return The Remote desktop certificate thumbprint.
     * 
     */
    public Optional<String> rdpThumbPrint() {
        return Optional.ofNullable(this.rdpThumbPrint);
    }

    /**
     * The resource status information.
     * 
     */
    @Import(name="statuses")
    private @Nullable List<InstanceViewStatusResponse> statuses;

    /**
     * @return The resource status information.
     * 
     */
    public Optional<List<InstanceViewStatusResponse>> statuses() {
        return Optional.ofNullable(this.statuses);
    }

    /**
     * The VM Agent running on the virtual machine.
     * 
     */
    @Import(name="vmAgent")
    private @Nullable VirtualMachineAgentInstanceViewResponse vmAgent;

    /**
     * @return The VM Agent running on the virtual machine.
     * 
     */
    public Optional<VirtualMachineAgentInstanceViewResponse> vmAgent() {
        return Optional.ofNullable(this.vmAgent);
    }

    /**
     * The health status for the VM.
     * 
     */
    @Import(name="vmHealth", required=true)
    private VirtualMachineHealthStatusResponse vmHealth;

    /**
     * @return The health status for the VM.
     * 
     */
    public VirtualMachineHealthStatusResponse vmHealth() {
        return this.vmHealth;
    }

    private VirtualMachineInstanceViewResponse() {}

    private VirtualMachineInstanceViewResponse(VirtualMachineInstanceViewResponse $) {
        this.assignedHost = $.assignedHost;
        this.bootDiagnostics = $.bootDiagnostics;
        this.computerName = $.computerName;
        this.disks = $.disks;
        this.extensions = $.extensions;
        this.hyperVGeneration = $.hyperVGeneration;
        this.maintenanceRedeployStatus = $.maintenanceRedeployStatus;
        this.osName = $.osName;
        this.osVersion = $.osVersion;
        this.patchStatus = $.patchStatus;
        this.platformFaultDomain = $.platformFaultDomain;
        this.platformUpdateDomain = $.platformUpdateDomain;
        this.rdpThumbPrint = $.rdpThumbPrint;
        this.statuses = $.statuses;
        this.vmAgent = $.vmAgent;
        this.vmHealth = $.vmHealth;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineInstanceViewResponse $;

        public Builder() {
            $ = new VirtualMachineInstanceViewResponse();
        }

        public Builder(VirtualMachineInstanceViewResponse defaults) {
            $ = new VirtualMachineInstanceViewResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignedHost Resource id of the dedicated host, on which the virtual machine is allocated through automatic placement, when the virtual machine is associated with a dedicated host group that has automatic placement enabled. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
         * 
         * @return builder
         * 
         */
        public Builder assignedHost(String assignedHost) {
            $.assignedHost = assignedHost;
            return this;
        }

        /**
         * @param bootDiagnostics Boot Diagnostics is a debugging feature which allows you to view Console Output and Screenshot to diagnose VM status. &lt;br&gt;&lt;br&gt; You can easily view the output of your console log. &lt;br&gt;&lt;br&gt; Azure also enables you to see a screenshot of the VM from the hypervisor.
         * 
         * @return builder
         * 
         */
        public Builder bootDiagnostics(@Nullable BootDiagnosticsInstanceViewResponse bootDiagnostics) {
            $.bootDiagnostics = bootDiagnostics;
            return this;
        }

        /**
         * @param computerName The computer name assigned to the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder computerName(@Nullable String computerName) {
            $.computerName = computerName;
            return this;
        }

        /**
         * @param disks The virtual machine disk information.
         * 
         * @return builder
         * 
         */
        public Builder disks(@Nullable List<DiskInstanceViewResponse> disks) {
            $.disks = disks;
            return this;
        }

        /**
         * @param disks The virtual machine disk information.
         * 
         * @return builder
         * 
         */
        public Builder disks(DiskInstanceViewResponse... disks) {
            return disks(List.of(disks));
        }

        /**
         * @param extensions The extensions information.
         * 
         * @return builder
         * 
         */
        public Builder extensions(@Nullable List<VirtualMachineExtensionInstanceViewResponse> extensions) {
            $.extensions = extensions;
            return this;
        }

        /**
         * @param extensions The extensions information.
         * 
         * @return builder
         * 
         */
        public Builder extensions(VirtualMachineExtensionInstanceViewResponse... extensions) {
            return extensions(List.of(extensions));
        }

        /**
         * @param hyperVGeneration Specifies the HyperVGeneration Type associated with a resource
         * 
         * @return builder
         * 
         */
        public Builder hyperVGeneration(@Nullable String hyperVGeneration) {
            $.hyperVGeneration = hyperVGeneration;
            return this;
        }

        /**
         * @param maintenanceRedeployStatus The Maintenance Operation status on the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceRedeployStatus(@Nullable MaintenanceRedeployStatusResponse maintenanceRedeployStatus) {
            $.maintenanceRedeployStatus = maintenanceRedeployStatus;
            return this;
        }

        /**
         * @param osName The Operating System running on the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder osName(@Nullable String osName) {
            $.osName = osName;
            return this;
        }

        /**
         * @param osVersion The version of Operating System running on the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder osVersion(@Nullable String osVersion) {
            $.osVersion = osVersion;
            return this;
        }

        /**
         * @param patchStatus [Preview Feature] The status of virtual machine patch operations.
         * 
         * @return builder
         * 
         */
        public Builder patchStatus(@Nullable VirtualMachinePatchStatusResponse patchStatus) {
            $.patchStatus = patchStatus;
            return this;
        }

        /**
         * @param platformFaultDomain Specifies the fault domain of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder platformFaultDomain(@Nullable Integer platformFaultDomain) {
            $.platformFaultDomain = platformFaultDomain;
            return this;
        }

        /**
         * @param platformUpdateDomain Specifies the update domain of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder platformUpdateDomain(@Nullable Integer platformUpdateDomain) {
            $.platformUpdateDomain = platformUpdateDomain;
            return this;
        }

        /**
         * @param rdpThumbPrint The Remote desktop certificate thumbprint.
         * 
         * @return builder
         * 
         */
        public Builder rdpThumbPrint(@Nullable String rdpThumbPrint) {
            $.rdpThumbPrint = rdpThumbPrint;
            return this;
        }

        /**
         * @param statuses The resource status information.
         * 
         * @return builder
         * 
         */
        public Builder statuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            $.statuses = statuses;
            return this;
        }

        /**
         * @param statuses The resource status information.
         * 
         * @return builder
         * 
         */
        public Builder statuses(InstanceViewStatusResponse... statuses) {
            return statuses(List.of(statuses));
        }

        /**
         * @param vmAgent The VM Agent running on the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder vmAgent(@Nullable VirtualMachineAgentInstanceViewResponse vmAgent) {
            $.vmAgent = vmAgent;
            return this;
        }

        /**
         * @param vmHealth The health status for the VM.
         * 
         * @return builder
         * 
         */
        public Builder vmHealth(VirtualMachineHealthStatusResponse vmHealth) {
            $.vmHealth = vmHealth;
            return this;
        }

        public VirtualMachineInstanceViewResponse build() {
            $.assignedHost = Objects.requireNonNull($.assignedHost, "expected parameter 'assignedHost' to be non-null");
            $.vmHealth = Objects.requireNonNull($.vmHealth, "expected parameter 'vmHealth' to be non-null");
            return $;
        }
    }

}
