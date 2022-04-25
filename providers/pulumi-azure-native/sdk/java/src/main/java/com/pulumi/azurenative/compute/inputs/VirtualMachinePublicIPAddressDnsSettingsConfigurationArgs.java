// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a virtual machines network configuration&#39;s DNS settings.
 * 
 */
public final class VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs Empty = new VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs();

    /**
     * The Domain name label prefix of the PublicIPAddress resources that will be created. The generated name label is the concatenation of the domain name label and vm network profile unique ID.
     * 
     */
    @Import(name="domainNameLabel", required=true)
    private Output<String> domainNameLabel;

    /**
     * @return The Domain name label prefix of the PublicIPAddress resources that will be created. The generated name label is the concatenation of the domain name label and vm network profile unique ID.
     * 
     */
    public Output<String> domainNameLabel() {
        return this.domainNameLabel;
    }

    private VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs() {}

    private VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs(VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs $) {
        this.domainNameLabel = $.domainNameLabel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs $;

        public Builder() {
            $ = new VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs();
        }

        public Builder(VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs defaults) {
            $ = new VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainNameLabel The Domain name label prefix of the PublicIPAddress resources that will be created. The generated name label is the concatenation of the domain name label and vm network profile unique ID.
         * 
         * @return builder
         * 
         */
        public Builder domainNameLabel(Output<String> domainNameLabel) {
            $.domainNameLabel = domainNameLabel;
            return this;
        }

        /**
         * @param domainNameLabel The Domain name label prefix of the PublicIPAddress resources that will be created. The generated name label is the concatenation of the domain name label and vm network profile unique ID.
         * 
         * @return builder
         * 
         */
        public Builder domainNameLabel(String domainNameLabel) {
            return domainNameLabel(Output.of(domainNameLabel));
        }

        public VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs build() {
            $.domainNameLabel = Objects.requireNonNull($.domainNameLabel, "expected parameter 'domainNameLabel' to be non-null");
            return $;
        }
    }

}
