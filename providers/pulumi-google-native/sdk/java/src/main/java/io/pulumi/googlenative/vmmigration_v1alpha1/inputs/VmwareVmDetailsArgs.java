// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.vmmigration_v1alpha1.enums.VmwareVmDetailsPowerState;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VmwareVmDetails describes a VM in vCenter.
 * 
 */
public final class VmwareVmDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VmwareVmDetailsArgs Empty = new VmwareVmDetailsArgs();

    /**
     * The total size of the storage allocated to the VM in MB.
     * 
     */
    @InputImport(name="committedStorage")
    private final @Nullable Input<String> committedStorage;

    public Input<String> getCommittedStorage() {
        return this.committedStorage == null ? Input.empty() : this.committedStorage;
    }

    /**
     * The total size of the storage allocated to the VM in MB.
     * 
     */
    @InputImport(name="committedStorageMb")
    private final @Nullable Input<String> committedStorageMb;

    public Input<String> getCommittedStorageMb() {
        return this.committedStorageMb == null ? Input.empty() : this.committedStorageMb;
    }

    /**
     * The number of cpus in the VM.
     * 
     */
    @InputImport(name="cpuCount")
    private final @Nullable Input<Integer> cpuCount;

    public Input<Integer> getCpuCount() {
        return this.cpuCount == null ? Input.empty() : this.cpuCount;
    }

    /**
     * The descriptive name of the vCenter's datacenter this VM is contained in.
     * 
     */
    @InputImport(name="datacenterDescription")
    private final @Nullable Input<String> datacenterDescription;

    public Input<String> getDatacenterDescription() {
        return this.datacenterDescription == null ? Input.empty() : this.datacenterDescription;
    }

    /**
     * The id of the vCenter's datacenter this VM is contained in.
     * 
     */
    @InputImport(name="datacenterId")
    private final @Nullable Input<String> datacenterId;

    public Input<String> getDatacenterId() {
        return this.datacenterId == null ? Input.empty() : this.datacenterId;
    }

    /**
     * The number of disks the VM has.
     * 
     */
    @InputImport(name="diskCount")
    private final @Nullable Input<Integer> diskCount;

    public Input<Integer> getDiskCount() {
        return this.diskCount == null ? Input.empty() : this.diskCount;
    }

    /**
     * The display name of the VM. Note that this is not necessarily unique.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The VM's OS. See for example https://pubs.vmware.com/vi-sdk/visdk250/ReferenceGuide/vim.vm.GuestOsDescriptor.GuestOsIdentifier.html for types of strings this might hold.
     * 
     */
    @InputImport(name="guestDescription")
    private final @Nullable Input<String> guestDescription;

    public Input<String> getGuestDescription() {
        return this.guestDescription == null ? Input.empty() : this.guestDescription;
    }

    /**
     * The size of the memory of the VM in MB.
     * 
     */
    @InputImport(name="memoryMb")
    private final @Nullable Input<Integer> memoryMb;

    public Input<Integer> getMemoryMb() {
        return this.memoryMb == null ? Input.empty() : this.memoryMb;
    }

    /**
     * The power state of the VM at the moment list was taken.
     * 
     */
    @InputImport(name="powerState")
    private final @Nullable Input<VmwareVmDetailsPowerState> powerState;

    public Input<VmwareVmDetailsPowerState> getPowerState() {
        return this.powerState == null ? Input.empty() : this.powerState;
    }

    /**
     * The unique identifier of the VM in vCenter.
     * 
     */
    @InputImport(name="uuid")
    private final @Nullable Input<String> uuid;

    public Input<String> getUuid() {
        return this.uuid == null ? Input.empty() : this.uuid;
    }

    /**
     * The VM's id in the source (note that this is not the MigratingVm's id). This is the moref id of the VM.
     * 
     */
    @InputImport(name="vmId")
    private final @Nullable Input<String> vmId;

    public Input<String> getVmId() {
        return this.vmId == null ? Input.empty() : this.vmId;
    }

    public VmwareVmDetailsArgs(
        @Nullable Input<String> committedStorage,
        @Nullable Input<String> committedStorageMb,
        @Nullable Input<Integer> cpuCount,
        @Nullable Input<String> datacenterDescription,
        @Nullable Input<String> datacenterId,
        @Nullable Input<Integer> diskCount,
        @Nullable Input<String> displayName,
        @Nullable Input<String> guestDescription,
        @Nullable Input<Integer> memoryMb,
        @Nullable Input<VmwareVmDetailsPowerState> powerState,
        @Nullable Input<String> uuid,
        @Nullable Input<String> vmId) {
        this.committedStorage = committedStorage;
        this.committedStorageMb = committedStorageMb;
        this.cpuCount = cpuCount;
        this.datacenterDescription = datacenterDescription;
        this.datacenterId = datacenterId;
        this.diskCount = diskCount;
        this.displayName = displayName;
        this.guestDescription = guestDescription;
        this.memoryMb = memoryMb;
        this.powerState = powerState;
        this.uuid = uuid;
        this.vmId = vmId;
    }

    private VmwareVmDetailsArgs() {
        this.committedStorage = Input.empty();
        this.committedStorageMb = Input.empty();
        this.cpuCount = Input.empty();
        this.datacenterDescription = Input.empty();
        this.datacenterId = Input.empty();
        this.diskCount = Input.empty();
        this.displayName = Input.empty();
        this.guestDescription = Input.empty();
        this.memoryMb = Input.empty();
        this.powerState = Input.empty();
        this.uuid = Input.empty();
        this.vmId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmwareVmDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> committedStorage;
        private @Nullable Input<String> committedStorageMb;
        private @Nullable Input<Integer> cpuCount;
        private @Nullable Input<String> datacenterDescription;
        private @Nullable Input<String> datacenterId;
        private @Nullable Input<Integer> diskCount;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> guestDescription;
        private @Nullable Input<Integer> memoryMb;
        private @Nullable Input<VmwareVmDetailsPowerState> powerState;
        private @Nullable Input<String> uuid;
        private @Nullable Input<String> vmId;

        public Builder() {
    	      // Empty
        }

        public Builder(VmwareVmDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.committedStorage = defaults.committedStorage;
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

        public Builder setCommittedStorage(@Nullable Input<String> committedStorage) {
            this.committedStorage = committedStorage;
            return this;
        }

        public Builder setCommittedStorage(@Nullable String committedStorage) {
            this.committedStorage = Input.ofNullable(committedStorage);
            return this;
        }

        public Builder setCommittedStorageMb(@Nullable Input<String> committedStorageMb) {
            this.committedStorageMb = committedStorageMb;
            return this;
        }

        public Builder setCommittedStorageMb(@Nullable String committedStorageMb) {
            this.committedStorageMb = Input.ofNullable(committedStorageMb);
            return this;
        }

        public Builder setCpuCount(@Nullable Input<Integer> cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        public Builder setCpuCount(@Nullable Integer cpuCount) {
            this.cpuCount = Input.ofNullable(cpuCount);
            return this;
        }

        public Builder setDatacenterDescription(@Nullable Input<String> datacenterDescription) {
            this.datacenterDescription = datacenterDescription;
            return this;
        }

        public Builder setDatacenterDescription(@Nullable String datacenterDescription) {
            this.datacenterDescription = Input.ofNullable(datacenterDescription);
            return this;
        }

        public Builder setDatacenterId(@Nullable Input<String> datacenterId) {
            this.datacenterId = datacenterId;
            return this;
        }

        public Builder setDatacenterId(@Nullable String datacenterId) {
            this.datacenterId = Input.ofNullable(datacenterId);
            return this;
        }

        public Builder setDiskCount(@Nullable Input<Integer> diskCount) {
            this.diskCount = diskCount;
            return this;
        }

        public Builder setDiskCount(@Nullable Integer diskCount) {
            this.diskCount = Input.ofNullable(diskCount);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setGuestDescription(@Nullable Input<String> guestDescription) {
            this.guestDescription = guestDescription;
            return this;
        }

        public Builder setGuestDescription(@Nullable String guestDescription) {
            this.guestDescription = Input.ofNullable(guestDescription);
            return this;
        }

        public Builder setMemoryMb(@Nullable Input<Integer> memoryMb) {
            this.memoryMb = memoryMb;
            return this;
        }

        public Builder setMemoryMb(@Nullable Integer memoryMb) {
            this.memoryMb = Input.ofNullable(memoryMb);
            return this;
        }

        public Builder setPowerState(@Nullable Input<VmwareVmDetailsPowerState> powerState) {
            this.powerState = powerState;
            return this;
        }

        public Builder setPowerState(@Nullable VmwareVmDetailsPowerState powerState) {
            this.powerState = Input.ofNullable(powerState);
            return this;
        }

        public Builder setUuid(@Nullable Input<String> uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder setUuid(@Nullable String uuid) {
            this.uuid = Input.ofNullable(uuid);
            return this;
        }

        public Builder setVmId(@Nullable Input<String> vmId) {
            this.vmId = vmId;
            return this;
        }

        public Builder setVmId(@Nullable String vmId) {
            this.vmId = Input.ofNullable(vmId);
            return this;
        }

        public VmwareVmDetailsArgs build() {
            return new VmwareVmDetailsArgs(committedStorage, committedStorageMb, cpuCount, datacenterDescription, datacenterId, diskCount, displayName, guestDescription, memoryMb, powerState, uuid, vmId);
        }
    }
}
