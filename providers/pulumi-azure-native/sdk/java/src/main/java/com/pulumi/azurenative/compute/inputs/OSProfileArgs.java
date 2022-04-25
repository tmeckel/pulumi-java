// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.LinuxConfigurationArgs;
import com.pulumi.azurenative.compute.inputs.VaultSecretGroupArgs;
import com.pulumi.azurenative.compute.inputs.WindowsConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the operating system settings for the virtual machine. Some of the settings cannot be changed once VM is provisioned.
 * 
 */
public final class OSProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSProfileArgs Empty = new OSProfileArgs();

    /**
     * Specifies the password of the administrator account. &lt;br&gt;&lt;br&gt; **Minimum-length (Windows):** 8 characters &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 6 characters &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 123 characters &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 72 characters &lt;br&gt;&lt;br&gt; **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled &lt;br&gt; Has lower characters &lt;br&gt;Has upper characters &lt;br&gt; Has a digit &lt;br&gt; Has a special character (Regex match [\W_]) &lt;br&gt;&lt;br&gt; **Disallowed values:** &#34;abc@123&#34;, &#34;P@$$w0rd&#34;, &#34;P@ssw0rd&#34;, &#34;P@ssword123&#34;, &#34;Pa$$word&#34;, &#34;pass@word1&#34;, &#34;Password!&#34;, &#34;Password1&#34;, &#34;Password22&#34;, &#34;iloveyou!&#34; &lt;br&gt;&lt;br&gt; For resetting the password, see [How to reset the Remote Desktop service or its login password in a Windows VM](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/reset-rdp) &lt;br&gt;&lt;br&gt; For resetting root password, see [Manage users, SSH, and check or repair disks on Azure Linux VMs using the VMAccess Extension](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/troubleshoot-ssh-connection)
     * 
     */
    @Import(name="adminPassword")
    private @Nullable Output<String> adminPassword;

    /**
     * @return Specifies the password of the administrator account. &lt;br&gt;&lt;br&gt; **Minimum-length (Windows):** 8 characters &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 6 characters &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 123 characters &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 72 characters &lt;br&gt;&lt;br&gt; **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled &lt;br&gt; Has lower characters &lt;br&gt;Has upper characters &lt;br&gt; Has a digit &lt;br&gt; Has a special character (Regex match [\W_]) &lt;br&gt;&lt;br&gt; **Disallowed values:** &#34;abc@123&#34;, &#34;P@$$w0rd&#34;, &#34;P@ssw0rd&#34;, &#34;P@ssword123&#34;, &#34;Pa$$word&#34;, &#34;pass@word1&#34;, &#34;Password!&#34;, &#34;Password1&#34;, &#34;Password22&#34;, &#34;iloveyou!&#34; &lt;br&gt;&lt;br&gt; For resetting the password, see [How to reset the Remote Desktop service or its login password in a Windows VM](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/reset-rdp) &lt;br&gt;&lt;br&gt; For resetting root password, see [Manage users, SSH, and check or repair disks on Azure Linux VMs using the VMAccess Extension](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/troubleshoot-ssh-connection)
     * 
     */
    public Optional<Output<String>> adminPassword() {
        return Optional.ofNullable(this.adminPassword);
    }

    /**
     * Specifies the name of the administrator account. &lt;br&gt;&lt;br&gt; This property cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; **Windows-only restriction:** Cannot end in &#34;.&#34; &lt;br&gt;&lt;br&gt; **Disallowed values:** &#34;administrator&#34;, &#34;admin&#34;, &#34;user&#34;, &#34;user1&#34;, &#34;test&#34;, &#34;user2&#34;, &#34;test1&#34;, &#34;user3&#34;, &#34;admin1&#34;, &#34;1&#34;, &#34;123&#34;, &#34;a&#34;, &#34;actuser&#34;, &#34;adm&#34;, &#34;admin2&#34;, &#34;aspnet&#34;, &#34;backup&#34;, &#34;console&#34;, &#34;david&#34;, &#34;guest&#34;, &#34;john&#34;, &#34;owner&#34;, &#34;root&#34;, &#34;server&#34;, &#34;sql&#34;, &#34;support&#34;, &#34;support_388945a0&#34;, &#34;sys&#34;, &#34;test2&#34;, &#34;test3&#34;, &#34;user4&#34;, &#34;user5&#34;. &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 1  character &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 64 characters &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 20 characters.
     * 
     */
    @Import(name="adminUsername")
    private @Nullable Output<String> adminUsername;

    /**
     * @return Specifies the name of the administrator account. &lt;br&gt;&lt;br&gt; This property cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; **Windows-only restriction:** Cannot end in &#34;.&#34; &lt;br&gt;&lt;br&gt; **Disallowed values:** &#34;administrator&#34;, &#34;admin&#34;, &#34;user&#34;, &#34;user1&#34;, &#34;test&#34;, &#34;user2&#34;, &#34;test1&#34;, &#34;user3&#34;, &#34;admin1&#34;, &#34;1&#34;, &#34;123&#34;, &#34;a&#34;, &#34;actuser&#34;, &#34;adm&#34;, &#34;admin2&#34;, &#34;aspnet&#34;, &#34;backup&#34;, &#34;console&#34;, &#34;david&#34;, &#34;guest&#34;, &#34;john&#34;, &#34;owner&#34;, &#34;root&#34;, &#34;server&#34;, &#34;sql&#34;, &#34;support&#34;, &#34;support_388945a0&#34;, &#34;sys&#34;, &#34;test2&#34;, &#34;test3&#34;, &#34;user4&#34;, &#34;user5&#34;. &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 1  character &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 64 characters &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 20 characters.
     * 
     */
    public Optional<Output<String>> adminUsername() {
        return Optional.ofNullable(this.adminUsername);
    }

    /**
     * Specifies whether extension operations should be allowed on the virtual machine. &lt;br&gt;&lt;br&gt;This may only be set to False when no extensions are present on the virtual machine.
     * 
     */
    @Import(name="allowExtensionOperations")
    private @Nullable Output<Boolean> allowExtensionOperations;

    /**
     * @return Specifies whether extension operations should be allowed on the virtual machine. &lt;br&gt;&lt;br&gt;This may only be set to False when no extensions are present on the virtual machine.
     * 
     */
    public Optional<Output<Boolean>> allowExtensionOperations() {
        return Optional.ofNullable(this.allowExtensionOperations);
    }

    /**
     * Specifies the host OS name of the virtual machine. &lt;br&gt;&lt;br&gt; This name cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 15 characters &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 64 characters. &lt;br&gt;&lt;br&gt; For naming conventions and restrictions see [Azure infrastructure services implementation guidelines](https://docs.microsoft.com/azure/azure-resource-manager/management/resource-name-rules).
     * 
     */
    @Import(name="computerName")
    private @Nullable Output<String> computerName;

    /**
     * @return Specifies the host OS name of the virtual machine. &lt;br&gt;&lt;br&gt; This name cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 15 characters &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 64 characters. &lt;br&gt;&lt;br&gt; For naming conventions and restrictions see [Azure infrastructure services implementation guidelines](https://docs.microsoft.com/azure/azure-resource-manager/management/resource-name-rules).
     * 
     */
    public Optional<Output<String>> computerName() {
        return Optional.ofNullable(this.computerName);
    }

    /**
     * Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the Virtual Machine. The maximum length of the binary array is 65535 bytes. &lt;br&gt;&lt;br&gt; **Note: Do not pass any secrets or passwords in customData property** &lt;br&gt;&lt;br&gt; This property cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; customData is passed to the VM to be saved as a file, for more information see [Custom Data on Azure VMs](https://azure.microsoft.com/blog/custom-data-and-cloud-init-on-windows-azure/) &lt;br&gt;&lt;br&gt; For using cloud-init for your Linux VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/linux/using-cloud-init)
     * 
     */
    @Import(name="customData")
    private @Nullable Output<String> customData;

    /**
     * @return Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the Virtual Machine. The maximum length of the binary array is 65535 bytes. &lt;br&gt;&lt;br&gt; **Note: Do not pass any secrets or passwords in customData property** &lt;br&gt;&lt;br&gt; This property cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; customData is passed to the VM to be saved as a file, for more information see [Custom Data on Azure VMs](https://azure.microsoft.com/blog/custom-data-and-cloud-init-on-windows-azure/) &lt;br&gt;&lt;br&gt; For using cloud-init for your Linux VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/linux/using-cloud-init)
     * 
     */
    public Optional<Output<String>> customData() {
        return Optional.ofNullable(this.customData);
    }

    /**
     * Specifies the Linux operating system settings on the virtual machine. &lt;br&gt;&lt;br&gt;For a list of supported Linux distributions, see [Linux on Azure-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/linux/endorsed-distros).
     * 
     */
    @Import(name="linuxConfiguration")
    private @Nullable Output<LinuxConfigurationArgs> linuxConfiguration;

    /**
     * @return Specifies the Linux operating system settings on the virtual machine. &lt;br&gt;&lt;br&gt;For a list of supported Linux distributions, see [Linux on Azure-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/linux/endorsed-distros).
     * 
     */
    public Optional<Output<LinuxConfigurationArgs>> linuxConfiguration() {
        return Optional.ofNullable(this.linuxConfiguration);
    }

    /**
     * Specifies whether the guest provision signal is required to infer provision success of the virtual machine.  **Note: This property is for private testing only, and all customers must not set the property to false.**
     * 
     */
    @Import(name="requireGuestProvisionSignal")
    private @Nullable Output<Boolean> requireGuestProvisionSignal;

    /**
     * @return Specifies whether the guest provision signal is required to infer provision success of the virtual machine.  **Note: This property is for private testing only, and all customers must not set the property to false.**
     * 
     */
    public Optional<Output<Boolean>> requireGuestProvisionSignal() {
        return Optional.ofNullable(this.requireGuestProvisionSignal);
    }

    /**
     * Specifies set of certificates that should be installed onto the virtual machine. To install certificates on a virtual machine it is recommended to use the [Azure Key Vault virtual machine extension for Linux](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-linux) or the [Azure Key Vault virtual machine extension for Windows](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-windows).
     * 
     */
    @Import(name="secrets")
    private @Nullable Output<List<VaultSecretGroupArgs>> secrets;

    /**
     * @return Specifies set of certificates that should be installed onto the virtual machine. To install certificates on a virtual machine it is recommended to use the [Azure Key Vault virtual machine extension for Linux](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-linux) or the [Azure Key Vault virtual machine extension for Windows](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-windows).
     * 
     */
    public Optional<Output<List<VaultSecretGroupArgs>>> secrets() {
        return Optional.ofNullable(this.secrets);
    }

    /**
     * Specifies Windows operating system settings on the virtual machine.
     * 
     */
    @Import(name="windowsConfiguration")
    private @Nullable Output<WindowsConfigurationArgs> windowsConfiguration;

    /**
     * @return Specifies Windows operating system settings on the virtual machine.
     * 
     */
    public Optional<Output<WindowsConfigurationArgs>> windowsConfiguration() {
        return Optional.ofNullable(this.windowsConfiguration);
    }

    private OSProfileArgs() {}

    private OSProfileArgs(OSProfileArgs $) {
        this.adminPassword = $.adminPassword;
        this.adminUsername = $.adminUsername;
        this.allowExtensionOperations = $.allowExtensionOperations;
        this.computerName = $.computerName;
        this.customData = $.customData;
        this.linuxConfiguration = $.linuxConfiguration;
        this.requireGuestProvisionSignal = $.requireGuestProvisionSignal;
        this.secrets = $.secrets;
        this.windowsConfiguration = $.windowsConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSProfileArgs $;

        public Builder() {
            $ = new OSProfileArgs();
        }

        public Builder(OSProfileArgs defaults) {
            $ = new OSProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminPassword Specifies the password of the administrator account. &lt;br&gt;&lt;br&gt; **Minimum-length (Windows):** 8 characters &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 6 characters &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 123 characters &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 72 characters &lt;br&gt;&lt;br&gt; **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled &lt;br&gt; Has lower characters &lt;br&gt;Has upper characters &lt;br&gt; Has a digit &lt;br&gt; Has a special character (Regex match [\W_]) &lt;br&gt;&lt;br&gt; **Disallowed values:** &#34;abc@123&#34;, &#34;P@$$w0rd&#34;, &#34;P@ssw0rd&#34;, &#34;P@ssword123&#34;, &#34;Pa$$word&#34;, &#34;pass@word1&#34;, &#34;Password!&#34;, &#34;Password1&#34;, &#34;Password22&#34;, &#34;iloveyou!&#34; &lt;br&gt;&lt;br&gt; For resetting the password, see [How to reset the Remote Desktop service or its login password in a Windows VM](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/reset-rdp) &lt;br&gt;&lt;br&gt; For resetting root password, see [Manage users, SSH, and check or repair disks on Azure Linux VMs using the VMAccess Extension](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/troubleshoot-ssh-connection)
         * 
         * @return builder
         * 
         */
        public Builder adminPassword(@Nullable Output<String> adminPassword) {
            $.adminPassword = adminPassword;
            return this;
        }

        /**
         * @param adminPassword Specifies the password of the administrator account. &lt;br&gt;&lt;br&gt; **Minimum-length (Windows):** 8 characters &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 6 characters &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 123 characters &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 72 characters &lt;br&gt;&lt;br&gt; **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled &lt;br&gt; Has lower characters &lt;br&gt;Has upper characters &lt;br&gt; Has a digit &lt;br&gt; Has a special character (Regex match [\W_]) &lt;br&gt;&lt;br&gt; **Disallowed values:** &#34;abc@123&#34;, &#34;P@$$w0rd&#34;, &#34;P@ssw0rd&#34;, &#34;P@ssword123&#34;, &#34;Pa$$word&#34;, &#34;pass@word1&#34;, &#34;Password!&#34;, &#34;Password1&#34;, &#34;Password22&#34;, &#34;iloveyou!&#34; &lt;br&gt;&lt;br&gt; For resetting the password, see [How to reset the Remote Desktop service or its login password in a Windows VM](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/reset-rdp) &lt;br&gt;&lt;br&gt; For resetting root password, see [Manage users, SSH, and check or repair disks on Azure Linux VMs using the VMAccess Extension](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/troubleshoot-ssh-connection)
         * 
         * @return builder
         * 
         */
        public Builder adminPassword(String adminPassword) {
            return adminPassword(Output.of(adminPassword));
        }

        /**
         * @param adminUsername Specifies the name of the administrator account. &lt;br&gt;&lt;br&gt; This property cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; **Windows-only restriction:** Cannot end in &#34;.&#34; &lt;br&gt;&lt;br&gt; **Disallowed values:** &#34;administrator&#34;, &#34;admin&#34;, &#34;user&#34;, &#34;user1&#34;, &#34;test&#34;, &#34;user2&#34;, &#34;test1&#34;, &#34;user3&#34;, &#34;admin1&#34;, &#34;1&#34;, &#34;123&#34;, &#34;a&#34;, &#34;actuser&#34;, &#34;adm&#34;, &#34;admin2&#34;, &#34;aspnet&#34;, &#34;backup&#34;, &#34;console&#34;, &#34;david&#34;, &#34;guest&#34;, &#34;john&#34;, &#34;owner&#34;, &#34;root&#34;, &#34;server&#34;, &#34;sql&#34;, &#34;support&#34;, &#34;support_388945a0&#34;, &#34;sys&#34;, &#34;test2&#34;, &#34;test3&#34;, &#34;user4&#34;, &#34;user5&#34;. &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 1  character &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 64 characters &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 20 characters.
         * 
         * @return builder
         * 
         */
        public Builder adminUsername(@Nullable Output<String> adminUsername) {
            $.adminUsername = adminUsername;
            return this;
        }

        /**
         * @param adminUsername Specifies the name of the administrator account. &lt;br&gt;&lt;br&gt; This property cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; **Windows-only restriction:** Cannot end in &#34;.&#34; &lt;br&gt;&lt;br&gt; **Disallowed values:** &#34;administrator&#34;, &#34;admin&#34;, &#34;user&#34;, &#34;user1&#34;, &#34;test&#34;, &#34;user2&#34;, &#34;test1&#34;, &#34;user3&#34;, &#34;admin1&#34;, &#34;1&#34;, &#34;123&#34;, &#34;a&#34;, &#34;actuser&#34;, &#34;adm&#34;, &#34;admin2&#34;, &#34;aspnet&#34;, &#34;backup&#34;, &#34;console&#34;, &#34;david&#34;, &#34;guest&#34;, &#34;john&#34;, &#34;owner&#34;, &#34;root&#34;, &#34;server&#34;, &#34;sql&#34;, &#34;support&#34;, &#34;support_388945a0&#34;, &#34;sys&#34;, &#34;test2&#34;, &#34;test3&#34;, &#34;user4&#34;, &#34;user5&#34;. &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 1  character &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 64 characters &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 20 characters.
         * 
         * @return builder
         * 
         */
        public Builder adminUsername(String adminUsername) {
            return adminUsername(Output.of(adminUsername));
        }

        /**
         * @param allowExtensionOperations Specifies whether extension operations should be allowed on the virtual machine. &lt;br&gt;&lt;br&gt;This may only be set to False when no extensions are present on the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder allowExtensionOperations(@Nullable Output<Boolean> allowExtensionOperations) {
            $.allowExtensionOperations = allowExtensionOperations;
            return this;
        }

        /**
         * @param allowExtensionOperations Specifies whether extension operations should be allowed on the virtual machine. &lt;br&gt;&lt;br&gt;This may only be set to False when no extensions are present on the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder allowExtensionOperations(Boolean allowExtensionOperations) {
            return allowExtensionOperations(Output.of(allowExtensionOperations));
        }

        /**
         * @param computerName Specifies the host OS name of the virtual machine. &lt;br&gt;&lt;br&gt; This name cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 15 characters &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 64 characters. &lt;br&gt;&lt;br&gt; For naming conventions and restrictions see [Azure infrastructure services implementation guidelines](https://docs.microsoft.com/azure/azure-resource-manager/management/resource-name-rules).
         * 
         * @return builder
         * 
         */
        public Builder computerName(@Nullable Output<String> computerName) {
            $.computerName = computerName;
            return this;
        }

        /**
         * @param computerName Specifies the host OS name of the virtual machine. &lt;br&gt;&lt;br&gt; This name cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 15 characters &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 64 characters. &lt;br&gt;&lt;br&gt; For naming conventions and restrictions see [Azure infrastructure services implementation guidelines](https://docs.microsoft.com/azure/azure-resource-manager/management/resource-name-rules).
         * 
         * @return builder
         * 
         */
        public Builder computerName(String computerName) {
            return computerName(Output.of(computerName));
        }

        /**
         * @param customData Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the Virtual Machine. The maximum length of the binary array is 65535 bytes. &lt;br&gt;&lt;br&gt; **Note: Do not pass any secrets or passwords in customData property** &lt;br&gt;&lt;br&gt; This property cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; customData is passed to the VM to be saved as a file, for more information see [Custom Data on Azure VMs](https://azure.microsoft.com/blog/custom-data-and-cloud-init-on-windows-azure/) &lt;br&gt;&lt;br&gt; For using cloud-init for your Linux VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/linux/using-cloud-init)
         * 
         * @return builder
         * 
         */
        public Builder customData(@Nullable Output<String> customData) {
            $.customData = customData;
            return this;
        }

        /**
         * @param customData Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the Virtual Machine. The maximum length of the binary array is 65535 bytes. &lt;br&gt;&lt;br&gt; **Note: Do not pass any secrets or passwords in customData property** &lt;br&gt;&lt;br&gt; This property cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; customData is passed to the VM to be saved as a file, for more information see [Custom Data on Azure VMs](https://azure.microsoft.com/blog/custom-data-and-cloud-init-on-windows-azure/) &lt;br&gt;&lt;br&gt; For using cloud-init for your Linux VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/linux/using-cloud-init)
         * 
         * @return builder
         * 
         */
        public Builder customData(String customData) {
            return customData(Output.of(customData));
        }

        /**
         * @param linuxConfiguration Specifies the Linux operating system settings on the virtual machine. &lt;br&gt;&lt;br&gt;For a list of supported Linux distributions, see [Linux on Azure-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/linux/endorsed-distros).
         * 
         * @return builder
         * 
         */
        public Builder linuxConfiguration(@Nullable Output<LinuxConfigurationArgs> linuxConfiguration) {
            $.linuxConfiguration = linuxConfiguration;
            return this;
        }

        /**
         * @param linuxConfiguration Specifies the Linux operating system settings on the virtual machine. &lt;br&gt;&lt;br&gt;For a list of supported Linux distributions, see [Linux on Azure-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/linux/endorsed-distros).
         * 
         * @return builder
         * 
         */
        public Builder linuxConfiguration(LinuxConfigurationArgs linuxConfiguration) {
            return linuxConfiguration(Output.of(linuxConfiguration));
        }

        /**
         * @param requireGuestProvisionSignal Specifies whether the guest provision signal is required to infer provision success of the virtual machine.  **Note: This property is for private testing only, and all customers must not set the property to false.**
         * 
         * @return builder
         * 
         */
        public Builder requireGuestProvisionSignal(@Nullable Output<Boolean> requireGuestProvisionSignal) {
            $.requireGuestProvisionSignal = requireGuestProvisionSignal;
            return this;
        }

        /**
         * @param requireGuestProvisionSignal Specifies whether the guest provision signal is required to infer provision success of the virtual machine.  **Note: This property is for private testing only, and all customers must not set the property to false.**
         * 
         * @return builder
         * 
         */
        public Builder requireGuestProvisionSignal(Boolean requireGuestProvisionSignal) {
            return requireGuestProvisionSignal(Output.of(requireGuestProvisionSignal));
        }

        /**
         * @param secrets Specifies set of certificates that should be installed onto the virtual machine. To install certificates on a virtual machine it is recommended to use the [Azure Key Vault virtual machine extension for Linux](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-linux) or the [Azure Key Vault virtual machine extension for Windows](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-windows).
         * 
         * @return builder
         * 
         */
        public Builder secrets(@Nullable Output<List<VaultSecretGroupArgs>> secrets) {
            $.secrets = secrets;
            return this;
        }

        /**
         * @param secrets Specifies set of certificates that should be installed onto the virtual machine. To install certificates on a virtual machine it is recommended to use the [Azure Key Vault virtual machine extension for Linux](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-linux) or the [Azure Key Vault virtual machine extension for Windows](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-windows).
         * 
         * @return builder
         * 
         */
        public Builder secrets(List<VaultSecretGroupArgs> secrets) {
            return secrets(Output.of(secrets));
        }

        /**
         * @param secrets Specifies set of certificates that should be installed onto the virtual machine. To install certificates on a virtual machine it is recommended to use the [Azure Key Vault virtual machine extension for Linux](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-linux) or the [Azure Key Vault virtual machine extension for Windows](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-windows).
         * 
         * @return builder
         * 
         */
        public Builder secrets(VaultSecretGroupArgs... secrets) {
            return secrets(List.of(secrets));
        }

        /**
         * @param windowsConfiguration Specifies Windows operating system settings on the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder windowsConfiguration(@Nullable Output<WindowsConfigurationArgs> windowsConfiguration) {
            $.windowsConfiguration = windowsConfiguration;
            return this;
        }

        /**
         * @param windowsConfiguration Specifies Windows operating system settings on the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder windowsConfiguration(WindowsConfigurationArgs windowsConfiguration) {
            return windowsConfiguration(Output.of(windowsConfiguration));
        }

        public OSProfileArgs build() {
            return $;
        }
    }

}
