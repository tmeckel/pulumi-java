// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.LinuxPatchSettingsResponse;
import com.pulumi.azurenative.compute.inputs.SshConfigurationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the Linux operating system settings on the virtual machine. &lt;br&gt;&lt;br&gt;For a list of supported Linux distributions, see [Linux on Azure-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/linux/endorsed-distros).
 * 
 */
public final class LinuxConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final LinuxConfigurationResponse Empty = new LinuxConfigurationResponse();

    /**
     * Specifies whether password authentication should be disabled.
     * 
     */
    @Import(name="disablePasswordAuthentication")
    private @Nullable Boolean disablePasswordAuthentication;

    /**
     * @return Specifies whether password authentication should be disabled.
     * 
     */
    public Optional<Boolean> disablePasswordAuthentication() {
        return Optional.ofNullable(this.disablePasswordAuthentication);
    }

    /**
     * [Preview Feature] Specifies settings related to VM Guest Patching on Linux.
     * 
     */
    @Import(name="patchSettings")
    private @Nullable LinuxPatchSettingsResponse patchSettings;

    /**
     * @return [Preview Feature] Specifies settings related to VM Guest Patching on Linux.
     * 
     */
    public Optional<LinuxPatchSettingsResponse> patchSettings() {
        return Optional.ofNullable(this.patchSettings);
    }

    /**
     * Indicates whether virtual machine agent should be provisioned on the virtual machine. &lt;br&gt;&lt;br&gt; When this property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     * 
     */
    @Import(name="provisionVMAgent")
    private @Nullable Boolean provisionVMAgent;

    /**
     * @return Indicates whether virtual machine agent should be provisioned on the virtual machine. &lt;br&gt;&lt;br&gt; When this property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     * 
     */
    public Optional<Boolean> provisionVMAgent() {
        return Optional.ofNullable(this.provisionVMAgent);
    }

    /**
     * Specifies the ssh key configuration for a Linux OS.
     * 
     */
    @Import(name="ssh")
    private @Nullable SshConfigurationResponse ssh;

    /**
     * @return Specifies the ssh key configuration for a Linux OS.
     * 
     */
    public Optional<SshConfigurationResponse> ssh() {
        return Optional.ofNullable(this.ssh);
    }

    private LinuxConfigurationResponse() {}

    private LinuxConfigurationResponse(LinuxConfigurationResponse $) {
        this.disablePasswordAuthentication = $.disablePasswordAuthentication;
        this.patchSettings = $.patchSettings;
        this.provisionVMAgent = $.provisionVMAgent;
        this.ssh = $.ssh;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxConfigurationResponse $;

        public Builder() {
            $ = new LinuxConfigurationResponse();
        }

        public Builder(LinuxConfigurationResponse defaults) {
            $ = new LinuxConfigurationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param disablePasswordAuthentication Specifies whether password authentication should be disabled.
         * 
         * @return builder
         * 
         */
        public Builder disablePasswordAuthentication(@Nullable Boolean disablePasswordAuthentication) {
            $.disablePasswordAuthentication = disablePasswordAuthentication;
            return this;
        }

        /**
         * @param patchSettings [Preview Feature] Specifies settings related to VM Guest Patching on Linux.
         * 
         * @return builder
         * 
         */
        public Builder patchSettings(@Nullable LinuxPatchSettingsResponse patchSettings) {
            $.patchSettings = patchSettings;
            return this;
        }

        /**
         * @param provisionVMAgent Indicates whether virtual machine agent should be provisioned on the virtual machine. &lt;br&gt;&lt;br&gt; When this property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
         * 
         * @return builder
         * 
         */
        public Builder provisionVMAgent(@Nullable Boolean provisionVMAgent) {
            $.provisionVMAgent = provisionVMAgent;
            return this;
        }

        /**
         * @param ssh Specifies the ssh key configuration for a Linux OS.
         * 
         * @return builder
         * 
         */
        public Builder ssh(@Nullable SshConfigurationResponse ssh) {
            $.ssh = ssh;
            return this;
        }

        public LinuxConfigurationResponse build() {
            return $;
        }
    }

}
