// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * VmwareVmDetails describes a VM in vCenter.
 * 
 */
public final class VmwareVmDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VmwareVmDetailsResponse Empty = new VmwareVmDetailsResponse();

    /**
     * The VM Boot Option.
     * 
     */
    @InputImport(name="bootOption", required=true)
      private final String bootOption;

    public String getBootOption() {
        return this.bootOption;
    }

    /**
     * The total size of the storage allocated to the VM in MB.
     * 
     */
    @InputImport(name="committedStorageMb", required=true)
      private final String committedStorageMb;

    public String getCommittedStorageMb() {
        return this.committedStorageMb;
    }

    /**
     * The number of cpus in the VM.
     * 
     */
    @InputImport(name="cpuCount", required=true)
      private final Integer cpuCount;

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    /**
     * The descriptive name of the vCenter's datacenter this VM is contained in.
     * 
     */
    @InputImport(name="datacenterDescription", required=true)
      private final String datacenterDescription;

    public String getDatacenterDescription() {
        return this.datacenterDescription;
    }

    /**
     * The id of the vCenter's datacenter this VM is contained in.
     * 
     */
    @InputImport(name="datacenterId", required=true)
      private final String datacenterId;

    public String getDatacenterId() {
        return this.datacenterId;
    }

    /**
     * The number of disks the VM has.
     * 
     */
    @InputImport(name="diskCount", required=true)
      private final Integer diskCount;

    public Integer getDiskCount() {
        return this.diskCount;
    }

    /**
     * The display name of the VM. Note that this is not necessarily unique.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * The VM's OS. See for example https://pubs.vmware.com/vi-sdk/visdk250/ReferenceGuide/vim.vm.GuestOsDescriptor.GuestOsIdentifier.html for types of strings this might hold.
     * 
     */
    @InputImport(name="guestDescription", required=true)
      private final String guestDescription;

    public String getGuestDescription() {
        return this.guestDescription;
    }

    /**
     * The size of the memory of the VM in MB.
     * 
     */
    @InputImport(name="memoryMb", required=true)
      private final Integer memoryMb;

    public Integer getMemoryMb() {
        return this.memoryMb;
    }

    /**
     * The power state of the VM at the moment list was taken.
     * 
     */
    @InputImport(name="powerState", required=true)
      private final String powerState;

    public String getPowerState() {
        return this.powerState;
    }

    /**
     * The unique identifier of the VM in vCenter.
     * 
     */
    @InputImport(name="uuid", required=true)
      private final String uuid;

    public String getUuid() {
        return this.uuid;
    }

    /**
     * The VM's id in the source (note that this is not the MigratingVm's id). This is the moref id of the VM.
     * 
     */
    @InputImport(name="vmId", required=true)
      private final String vmId;

    public String getVmId() {
        return this.vmId;
    }

    public VmwareVmDetailsResponse(
        String bootOption,
        String committedStorageMb,
        Integer cpuCount,
        String datacenterDescription,
        String datacenterId,
        Integer diskCount,
        String displayName,
        String guestDescription,
        Integer memoryMb,
        String powerState,
        String uuid,
        String vmId) {
        this.bootOption = Objects.requireNonNull(bootOption, "expected parameter 'bootOption' to be non-null");
        this.committedStorageMb = Objects.requireNonNull(committedStorageMb, "expected parameter 'committedStorageMb' to be non-null");
        this.cpuCount = Objects.requireNonNull(cpuCount, "expected parameter 'cpuCount' to be non-null");
        this.datacenterDescription = Objects.requireNonNull(datacenterDescription, "expected parameter 'datacenterDescription' to be non-null");
        this.datacenterId = Objects.requireNonNull(datacenterId, "expected parameter 'datacenterId' to be non-null");
        this.diskCount = Objects.requireNonNull(diskCount, "expected parameter 'diskCount' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.guestDescription = Objects.requireNonNull(guestDescription, "expected parameter 'guestDescription' to be non-null");
        this.memoryMb = Objects.requireNonNull(memoryMb, "expected parameter 'memoryMb' to be non-null");
        this.powerState = Objects.requireNonNull(powerState, "expected parameter 'powerState' to be non-null");
        this.uuid = Objects.requireNonNull(uuid, "expected parameter 'uuid' to be non-null");
        this.vmId = Objects.requireNonNull(vmId, "expected parameter 'vmId' to be non-null");
    }

    private VmwareVmDetailsResponse() {
        this.bootOption = null;
        this.committedStorageMb = null;
        this.cpuCount = null;
        this.datacenterDescription = null;
        this.datacenterId = null;
        this.diskCount = null;
        this.displayName = null;
        this.guestDescription = null;
        this.memoryMb = null;
        this.powerState = null;
        this.uuid = null;
        this.vmId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmwareVmDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bootOption;
        private String committedStorageMb;
        private Integer cpuCount;
        private String datacenterDescription;
        private String datacenterId;
        private Integer diskCount;
        private String displayName;
        private String guestDescription;
        private Integer memoryMb;
        private String powerState;
        private String uuid;
        private String vmId;

        public Builder() {
    	      // Empty
        }

        public Builder(VmwareVmDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootOption = defaults.bootOption;
    	      this.committedStorageMb = defaults.committedStorageMb;
    	      this.cpuCount = defaults.cpuCount;
    	      this.datacenterDescription = defaults.datacenterDescription;
    	      this.datacenterId = defaults.datacenterId;
    	      this.diskCount = defaults.diskCount;
    	      this.displayName = defaults.displayName;
    	      this.guestDescription = defaults.guestDescription;
    	      this.memoryMb = defaults.memoryMb;
    	      this.powerState = defaults.powerState;
    	      this.uuid = defaults.uuid;
    	      this.vmId = defaults.vmId;
        }

        public Builder bootOption(String bootOption) {
            this.bootOption = Objects.requireNonNull(bootOption);
            return this;
        }

        public Builder committedStorageMb(String committedStorageMb) {
            this.committedStorageMb = Objects.requireNonNull(committedStorageMb);
            return this;
        }

        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = Objects.requireNonNull(cpuCount);
            return this;
        }

        public Builder datacenterDescription(String datacenterDescription) {
            this.datacenterDescription = Objects.requireNonNull(datacenterDescription);
            return this;
        }

        public Builder datacenterId(String datacenterId) {
            this.datacenterId = Objects.requireNonNull(datacenterId);
            return this;
        }

        public Builder diskCount(Integer diskCount) {
            this.diskCount = Objects.requireNonNull(diskCount);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder guestDescription(String guestDescription) {
            this.guestDescription = Objects.requireNonNull(guestDescription);
            return this;
        }

        public Builder memoryMb(Integer memoryMb) {
            this.memoryMb = Objects.requireNonNull(memoryMb);
            return this;
        }

        public Builder powerState(String powerState) {
            this.powerState = Objects.requireNonNull(powerState);
            return this;
        }

        public Builder uuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }

        public Builder vmId(String vmId) {
            this.vmId = Objects.requireNonNull(vmId);
            return this;
        }
        public VmwareVmDetailsResponse build() {
            return new VmwareVmDetailsResponse(bootOption, committedStorageMb, cpuCount, datacenterDescription, datacenterId, diskCount, displayName, guestDescription, memoryMb, powerState, uuid, vmId);
        }
    }
}
