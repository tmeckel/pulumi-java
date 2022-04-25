// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.VirtualMachineEvictionPolicyTypes;
import com.pulumi.azurenative.compute.enums.VirtualMachinePriorityTypes;
import com.pulumi.azurenative.compute.inputs.BillingProfileArgs;
import com.pulumi.azurenative.compute.inputs.DiagnosticsProfileArgs;
import com.pulumi.azurenative.compute.inputs.ScheduledEventsProfileArgs;
import com.pulumi.azurenative.compute.inputs.SecurityProfileArgs;
import com.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetExtensionProfileArgs;
import com.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetNetworkProfileArgs;
import com.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetOSProfileArgs;
import com.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetStorageProfileArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set virtual machine profile.
 * 
 */
public final class VirtualMachineScaleSetVMProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetVMProfileArgs Empty = new VirtualMachineScaleSetVMProfileArgs();

    /**
     * Specifies the billing related details of a Azure Spot VMSS. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     * 
     */
    @Import(name="billingProfile")
    private @Nullable Output<BillingProfileArgs> billingProfile;

    /**
     * @return Specifies the billing related details of a Azure Spot VMSS. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     * 
     */
    public Optional<Output<BillingProfileArgs>> billingProfile() {
        return Optional.ofNullable(this.billingProfile);
    }

    /**
     * Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum api-version: 2015-06-15.
     * 
     */
    @Import(name="diagnosticsProfile")
    private @Nullable Output<DiagnosticsProfileArgs> diagnosticsProfile;

    /**
     * @return Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum api-version: 2015-06-15.
     * 
     */
    public Optional<Output<DiagnosticsProfileArgs>> diagnosticsProfile() {
        return Optional.ofNullable(this.diagnosticsProfile);
    }

    /**
     * Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. &lt;br&gt;&lt;br&gt;For Azure Spot virtual machines, both &#39;Deallocate&#39; and &#39;Delete&#39; are supported and the minimum api-version is 2019-03-01. &lt;br&gt;&lt;br&gt;For Azure Spot scale sets, both &#39;Deallocate&#39; and &#39;Delete&#39; are supported and the minimum api-version is 2017-10-30-preview.
     * 
     */
    @Import(name="evictionPolicy")
    private @Nullable Output<Either<String,VirtualMachineEvictionPolicyTypes>> evictionPolicy;

    /**
     * @return Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. &lt;br&gt;&lt;br&gt;For Azure Spot virtual machines, both &#39;Deallocate&#39; and &#39;Delete&#39; are supported and the minimum api-version is 2019-03-01. &lt;br&gt;&lt;br&gt;For Azure Spot scale sets, both &#39;Deallocate&#39; and &#39;Delete&#39; are supported and the minimum api-version is 2017-10-30-preview.
     * 
     */
    public Optional<Output<Either<String,VirtualMachineEvictionPolicyTypes>>> evictionPolicy() {
        return Optional.ofNullable(this.evictionPolicy);
    }

    /**
     * Specifies a collection of settings for extensions installed on virtual machines in the scale set.
     * 
     */
    @Import(name="extensionProfile")
    private @Nullable Output<VirtualMachineScaleSetExtensionProfileArgs> extensionProfile;

    /**
     * @return Specifies a collection of settings for extensions installed on virtual machines in the scale set.
     * 
     */
    public Optional<Output<VirtualMachineScaleSetExtensionProfileArgs>> extensionProfile() {
        return Optional.ofNullable(this.extensionProfile);
    }

    /**
     * Specifies that the image or disk that is being used was licensed on-premises. &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are: &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<String> licenseType;

    /**
     * @return Specifies that the image or disk that is being used was licensed on-premises. &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are: &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15
     * 
     */
    public Optional<Output<String>> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    /**
     * Specifies properties of the network interfaces of the virtual machines in the scale set.
     * 
     */
    @Import(name="networkProfile")
    private @Nullable Output<VirtualMachineScaleSetNetworkProfileArgs> networkProfile;

    /**
     * @return Specifies properties of the network interfaces of the virtual machines in the scale set.
     * 
     */
    public Optional<Output<VirtualMachineScaleSetNetworkProfileArgs>> networkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }

    /**
     * Specifies the operating system settings for the virtual machines in the scale set.
     * 
     */
    @Import(name="osProfile")
    private @Nullable Output<VirtualMachineScaleSetOSProfileArgs> osProfile;

    /**
     * @return Specifies the operating system settings for the virtual machines in the scale set.
     * 
     */
    public Optional<Output<VirtualMachineScaleSetOSProfileArgs>> osProfile() {
        return Optional.ofNullable(this.osProfile);
    }

    /**
     * Specifies the priority for the virtual machines in the scale set. &lt;br&gt;&lt;br&gt;Minimum api-version: 2017-10-30-preview
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Either<String,VirtualMachinePriorityTypes>> priority;

    /**
     * @return Specifies the priority for the virtual machines in the scale set. &lt;br&gt;&lt;br&gt;Minimum api-version: 2017-10-30-preview
     * 
     */
    public Optional<Output<Either<String,VirtualMachinePriorityTypes>>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Specifies Scheduled Event related configurations.
     * 
     */
    @Import(name="scheduledEventsProfile")
    private @Nullable Output<ScheduledEventsProfileArgs> scheduledEventsProfile;

    /**
     * @return Specifies Scheduled Event related configurations.
     * 
     */
    public Optional<Output<ScheduledEventsProfileArgs>> scheduledEventsProfile() {
        return Optional.ofNullable(this.scheduledEventsProfile);
    }

    /**
     * Specifies the Security related profile settings for the virtual machines in the scale set.
     * 
     */
    @Import(name="securityProfile")
    private @Nullable Output<SecurityProfileArgs> securityProfile;

    /**
     * @return Specifies the Security related profile settings for the virtual machines in the scale set.
     * 
     */
    public Optional<Output<SecurityProfileArgs>> securityProfile() {
        return Optional.ofNullable(this.securityProfile);
    }

    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
     */
    @Import(name="storageProfile")
    private @Nullable Output<VirtualMachineScaleSetStorageProfileArgs> storageProfile;

    /**
     * @return Specifies the storage settings for the virtual machine disks.
     * 
     */
    public Optional<Output<VirtualMachineScaleSetStorageProfileArgs>> storageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }

    /**
     * UserData for the virtual machines in the scale set, which must be base-64 encoded. Customer should not pass any secrets in here. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-03-01
     * 
     */
    @Import(name="userData")
    private @Nullable Output<String> userData;

    /**
     * @return UserData for the virtual machines in the scale set, which must be base-64 encoded. Customer should not pass any secrets in here. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-03-01
     * 
     */
    public Optional<Output<String>> userData() {
        return Optional.ofNullable(this.userData);
    }

    private VirtualMachineScaleSetVMProfileArgs() {}

    private VirtualMachineScaleSetVMProfileArgs(VirtualMachineScaleSetVMProfileArgs $) {
        this.billingProfile = $.billingProfile;
        this.diagnosticsProfile = $.diagnosticsProfile;
        this.evictionPolicy = $.evictionPolicy;
        this.extensionProfile = $.extensionProfile;
        this.licenseType = $.licenseType;
        this.networkProfile = $.networkProfile;
        this.osProfile = $.osProfile;
        this.priority = $.priority;
        this.scheduledEventsProfile = $.scheduledEventsProfile;
        this.securityProfile = $.securityProfile;
        this.storageProfile = $.storageProfile;
        this.userData = $.userData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineScaleSetVMProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineScaleSetVMProfileArgs $;

        public Builder() {
            $ = new VirtualMachineScaleSetVMProfileArgs();
        }

        public Builder(VirtualMachineScaleSetVMProfileArgs defaults) {
            $ = new VirtualMachineScaleSetVMProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param billingProfile Specifies the billing related details of a Azure Spot VMSS. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
         * 
         * @return builder
         * 
         */
        public Builder billingProfile(@Nullable Output<BillingProfileArgs> billingProfile) {
            $.billingProfile = billingProfile;
            return this;
        }

        /**
         * @param billingProfile Specifies the billing related details of a Azure Spot VMSS. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
         * 
         * @return builder
         * 
         */
        public Builder billingProfile(BillingProfileArgs billingProfile) {
            return billingProfile(Output.of(billingProfile));
        }

        /**
         * @param diagnosticsProfile Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum api-version: 2015-06-15.
         * 
         * @return builder
         * 
         */
        public Builder diagnosticsProfile(@Nullable Output<DiagnosticsProfileArgs> diagnosticsProfile) {
            $.diagnosticsProfile = diagnosticsProfile;
            return this;
        }

        /**
         * @param diagnosticsProfile Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum api-version: 2015-06-15.
         * 
         * @return builder
         * 
         */
        public Builder diagnosticsProfile(DiagnosticsProfileArgs diagnosticsProfile) {
            return diagnosticsProfile(Output.of(diagnosticsProfile));
        }

        /**
         * @param evictionPolicy Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. &lt;br&gt;&lt;br&gt;For Azure Spot virtual machines, both &#39;Deallocate&#39; and &#39;Delete&#39; are supported and the minimum api-version is 2019-03-01. &lt;br&gt;&lt;br&gt;For Azure Spot scale sets, both &#39;Deallocate&#39; and &#39;Delete&#39; are supported and the minimum api-version is 2017-10-30-preview.
         * 
         * @return builder
         * 
         */
        public Builder evictionPolicy(@Nullable Output<Either<String,VirtualMachineEvictionPolicyTypes>> evictionPolicy) {
            $.evictionPolicy = evictionPolicy;
            return this;
        }

        /**
         * @param evictionPolicy Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. &lt;br&gt;&lt;br&gt;For Azure Spot virtual machines, both &#39;Deallocate&#39; and &#39;Delete&#39; are supported and the minimum api-version is 2019-03-01. &lt;br&gt;&lt;br&gt;For Azure Spot scale sets, both &#39;Deallocate&#39; and &#39;Delete&#39; are supported and the minimum api-version is 2017-10-30-preview.
         * 
         * @return builder
         * 
         */
        public Builder evictionPolicy(Either<String,VirtualMachineEvictionPolicyTypes> evictionPolicy) {
            return evictionPolicy(Output.of(evictionPolicy));
        }

        /**
         * @param evictionPolicy Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. &lt;br&gt;&lt;br&gt;For Azure Spot virtual machines, both &#39;Deallocate&#39; and &#39;Delete&#39; are supported and the minimum api-version is 2019-03-01. &lt;br&gt;&lt;br&gt;For Azure Spot scale sets, both &#39;Deallocate&#39; and &#39;Delete&#39; are supported and the minimum api-version is 2017-10-30-preview.
         * 
         * @return builder
         * 
         */
        public Builder evictionPolicy(String evictionPolicy) {
            return evictionPolicy(Either.ofLeft(evictionPolicy));
        }

        /**
         * @param evictionPolicy Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. &lt;br&gt;&lt;br&gt;For Azure Spot virtual machines, both &#39;Deallocate&#39; and &#39;Delete&#39; are supported and the minimum api-version is 2019-03-01. &lt;br&gt;&lt;br&gt;For Azure Spot scale sets, both &#39;Deallocate&#39; and &#39;Delete&#39; are supported and the minimum api-version is 2017-10-30-preview.
         * 
         * @return builder
         * 
         */
        public Builder evictionPolicy(VirtualMachineEvictionPolicyTypes evictionPolicy) {
            return evictionPolicy(Either.ofRight(evictionPolicy));
        }

        /**
         * @param extensionProfile Specifies a collection of settings for extensions installed on virtual machines in the scale set.
         * 
         * @return builder
         * 
         */
        public Builder extensionProfile(@Nullable Output<VirtualMachineScaleSetExtensionProfileArgs> extensionProfile) {
            $.extensionProfile = extensionProfile;
            return this;
        }

        /**
         * @param extensionProfile Specifies a collection of settings for extensions installed on virtual machines in the scale set.
         * 
         * @return builder
         * 
         */
        public Builder extensionProfile(VirtualMachineScaleSetExtensionProfileArgs extensionProfile) {
            return extensionProfile(Output.of(extensionProfile));
        }

        /**
         * @param licenseType Specifies that the image or disk that is being used was licensed on-premises. &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are: &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15
         * 
         * @return builder
         * 
         */
        public Builder licenseType(@Nullable Output<String> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        /**
         * @param licenseType Specifies that the image or disk that is being used was licensed on-premises. &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are: &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15
         * 
         * @return builder
         * 
         */
        public Builder licenseType(String licenseType) {
            return licenseType(Output.of(licenseType));
        }

        /**
         * @param networkProfile Specifies properties of the network interfaces of the virtual machines in the scale set.
         * 
         * @return builder
         * 
         */
        public Builder networkProfile(@Nullable Output<VirtualMachineScaleSetNetworkProfileArgs> networkProfile) {
            $.networkProfile = networkProfile;
            return this;
        }

        /**
         * @param networkProfile Specifies properties of the network interfaces of the virtual machines in the scale set.
         * 
         * @return builder
         * 
         */
        public Builder networkProfile(VirtualMachineScaleSetNetworkProfileArgs networkProfile) {
            return networkProfile(Output.of(networkProfile));
        }

        /**
         * @param osProfile Specifies the operating system settings for the virtual machines in the scale set.
         * 
         * @return builder
         * 
         */
        public Builder osProfile(@Nullable Output<VirtualMachineScaleSetOSProfileArgs> osProfile) {
            $.osProfile = osProfile;
            return this;
        }

        /**
         * @param osProfile Specifies the operating system settings for the virtual machines in the scale set.
         * 
         * @return builder
         * 
         */
        public Builder osProfile(VirtualMachineScaleSetOSProfileArgs osProfile) {
            return osProfile(Output.of(osProfile));
        }

        /**
         * @param priority Specifies the priority for the virtual machines in the scale set. &lt;br&gt;&lt;br&gt;Minimum api-version: 2017-10-30-preview
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Either<String,VirtualMachinePriorityTypes>> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Specifies the priority for the virtual machines in the scale set. &lt;br&gt;&lt;br&gt;Minimum api-version: 2017-10-30-preview
         * 
         * @return builder
         * 
         */
        public Builder priority(Either<String,VirtualMachinePriorityTypes> priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param priority Specifies the priority for the virtual machines in the scale set. &lt;br&gt;&lt;br&gt;Minimum api-version: 2017-10-30-preview
         * 
         * @return builder
         * 
         */
        public Builder priority(String priority) {
            return priority(Either.ofLeft(priority));
        }

        /**
         * @param priority Specifies the priority for the virtual machines in the scale set. &lt;br&gt;&lt;br&gt;Minimum api-version: 2017-10-30-preview
         * 
         * @return builder
         * 
         */
        public Builder priority(VirtualMachinePriorityTypes priority) {
            return priority(Either.ofRight(priority));
        }

        /**
         * @param scheduledEventsProfile Specifies Scheduled Event related configurations.
         * 
         * @return builder
         * 
         */
        public Builder scheduledEventsProfile(@Nullable Output<ScheduledEventsProfileArgs> scheduledEventsProfile) {
            $.scheduledEventsProfile = scheduledEventsProfile;
            return this;
        }

        /**
         * @param scheduledEventsProfile Specifies Scheduled Event related configurations.
         * 
         * @return builder
         * 
         */
        public Builder scheduledEventsProfile(ScheduledEventsProfileArgs scheduledEventsProfile) {
            return scheduledEventsProfile(Output.of(scheduledEventsProfile));
        }

        /**
         * @param securityProfile Specifies the Security related profile settings for the virtual machines in the scale set.
         * 
         * @return builder
         * 
         */
        public Builder securityProfile(@Nullable Output<SecurityProfileArgs> securityProfile) {
            $.securityProfile = securityProfile;
            return this;
        }

        /**
         * @param securityProfile Specifies the Security related profile settings for the virtual machines in the scale set.
         * 
         * @return builder
         * 
         */
        public Builder securityProfile(SecurityProfileArgs securityProfile) {
            return securityProfile(Output.of(securityProfile));
        }

        /**
         * @param storageProfile Specifies the storage settings for the virtual machine disks.
         * 
         * @return builder
         * 
         */
        public Builder storageProfile(@Nullable Output<VirtualMachineScaleSetStorageProfileArgs> storageProfile) {
            $.storageProfile = storageProfile;
            return this;
        }

        /**
         * @param storageProfile Specifies the storage settings for the virtual machine disks.
         * 
         * @return builder
         * 
         */
        public Builder storageProfile(VirtualMachineScaleSetStorageProfileArgs storageProfile) {
            return storageProfile(Output.of(storageProfile));
        }

        /**
         * @param userData UserData for the virtual machines in the scale set, which must be base-64 encoded. Customer should not pass any secrets in here. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-03-01
         * 
         * @return builder
         * 
         */
        public Builder userData(@Nullable Output<String> userData) {
            $.userData = userData;
            return this;
        }

        /**
         * @param userData UserData for the virtual machines in the scale set, which must be base-64 encoded. Customer should not pass any secrets in here. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-03-01
         * 
         * @return builder
         * 
         */
        public Builder userData(String userData) {
            return userData(Output.of(userData));
        }

        public VirtualMachineScaleSetVMProfileArgs build() {
            return $;
        }
    }

}
