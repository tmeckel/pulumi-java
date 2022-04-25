// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.azurenative.containerservice.inputs.ContainerServiceSshPublicKeyResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * SSH configuration for Linux-based VMs running on Azure.
 * 
 */
public final class ContainerServiceSshConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContainerServiceSshConfigurationResponse Empty = new ContainerServiceSshConfigurationResponse();

    /**
     * The list of SSH public keys used to authenticate with Linux-based VMs. Only expect one key specified.
     * 
     */
    @Import(name="publicKeys", required=true)
    private List<ContainerServiceSshPublicKeyResponse> publicKeys;

    /**
     * @return The list of SSH public keys used to authenticate with Linux-based VMs. Only expect one key specified.
     * 
     */
    public List<ContainerServiceSshPublicKeyResponse> publicKeys() {
        return this.publicKeys;
    }

    private ContainerServiceSshConfigurationResponse() {}

    private ContainerServiceSshConfigurationResponse(ContainerServiceSshConfigurationResponse $) {
        this.publicKeys = $.publicKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerServiceSshConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerServiceSshConfigurationResponse $;

        public Builder() {
            $ = new ContainerServiceSshConfigurationResponse();
        }

        public Builder(ContainerServiceSshConfigurationResponse defaults) {
            $ = new ContainerServiceSshConfigurationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param publicKeys The list of SSH public keys used to authenticate with Linux-based VMs. Only expect one key specified.
         * 
         * @return builder
         * 
         */
        public Builder publicKeys(List<ContainerServiceSshPublicKeyResponse> publicKeys) {
            $.publicKeys = publicKeys;
            return this;
        }

        /**
         * @param publicKeys The list of SSH public keys used to authenticate with Linux-based VMs. Only expect one key specified.
         * 
         * @return builder
         * 
         */
        public Builder publicKeys(ContainerServiceSshPublicKeyResponse... publicKeys) {
            return publicKeys(List.of(publicKeys));
        }

        public ContainerServiceSshConfigurationResponse build() {
            $.publicKeys = Objects.requireNonNull($.publicKeys, "expected parameter 'publicKeys' to be non-null");
            return $;
        }
    }

}
