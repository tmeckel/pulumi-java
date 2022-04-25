// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.azurenative.servicefabric.inputs.SubResourceArgs;
import com.pulumi.azurenative.servicefabric.inputs.VaultCertificateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * Specifies set of certificates that should be installed onto the virtual machines.
 * 
 */
public final class VaultSecretGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final VaultSecretGroupArgs Empty = new VaultSecretGroupArgs();

    /**
     * The relative URL of the Key Vault containing all of the certificates in VaultCertificates.
     * 
     */
    @Import(name="sourceVault", required=true)
    private Output<SubResourceArgs> sourceVault;

    /**
     * @return The relative URL of the Key Vault containing all of the certificates in VaultCertificates.
     * 
     */
    public Output<SubResourceArgs> sourceVault() {
        return this.sourceVault;
    }

    /**
     * The list of key vault references in SourceVault which contain certificates.
     * 
     */
    @Import(name="vaultCertificates", required=true)
    private Output<List<VaultCertificateArgs>> vaultCertificates;

    /**
     * @return The list of key vault references in SourceVault which contain certificates.
     * 
     */
    public Output<List<VaultCertificateArgs>> vaultCertificates() {
        return this.vaultCertificates;
    }

    private VaultSecretGroupArgs() {}

    private VaultSecretGroupArgs(VaultSecretGroupArgs $) {
        this.sourceVault = $.sourceVault;
        this.vaultCertificates = $.vaultCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VaultSecretGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VaultSecretGroupArgs $;

        public Builder() {
            $ = new VaultSecretGroupArgs();
        }

        public Builder(VaultSecretGroupArgs defaults) {
            $ = new VaultSecretGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sourceVault The relative URL of the Key Vault containing all of the certificates in VaultCertificates.
         * 
         * @return builder
         * 
         */
        public Builder sourceVault(Output<SubResourceArgs> sourceVault) {
            $.sourceVault = sourceVault;
            return this;
        }

        /**
         * @param sourceVault The relative URL of the Key Vault containing all of the certificates in VaultCertificates.
         * 
         * @return builder
         * 
         */
        public Builder sourceVault(SubResourceArgs sourceVault) {
            return sourceVault(Output.of(sourceVault));
        }

        /**
         * @param vaultCertificates The list of key vault references in SourceVault which contain certificates.
         * 
         * @return builder
         * 
         */
        public Builder vaultCertificates(Output<List<VaultCertificateArgs>> vaultCertificates) {
            $.vaultCertificates = vaultCertificates;
            return this;
        }

        /**
         * @param vaultCertificates The list of key vault references in SourceVault which contain certificates.
         * 
         * @return builder
         * 
         */
        public Builder vaultCertificates(List<VaultCertificateArgs> vaultCertificates) {
            return vaultCertificates(Output.of(vaultCertificates));
        }

        /**
         * @param vaultCertificates The list of key vault references in SourceVault which contain certificates.
         * 
         * @return builder
         * 
         */
        public Builder vaultCertificates(VaultCertificateArgs... vaultCertificates) {
            return vaultCertificates(List.of(vaultCertificates));
        }

        public VaultSecretGroupArgs build() {
            $.sourceVault = Objects.requireNonNull($.sourceVault, "expected parameter 'sourceVault' to be non-null");
            $.vaultCertificates = Objects.requireNonNull($.vaultCertificates, "expected parameter 'vaultCertificates' to be non-null");
            return $;
        }
    }

}
