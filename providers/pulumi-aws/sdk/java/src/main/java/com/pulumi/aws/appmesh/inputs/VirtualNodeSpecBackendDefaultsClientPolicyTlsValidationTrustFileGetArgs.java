// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs();

    /**
     * The certificate trust chain for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="certificateChain", required=true)
    private Output<String> certificateChain;

    /**
     * @return The certificate trust chain for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> certificateChain() {
        return this.certificateChain;
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs() {}

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs $) {
        this.certificateChain = $.certificateChain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs $;

        public Builder() {
            $ = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs();
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs defaults) {
            $ = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateChain The certificate trust chain for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder certificateChain(Output<String> certificateChain) {
            $.certificateChain = certificateChain;
            return this;
        }

        /**
         * @param certificateChain The certificate trust chain for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder certificateChain(String certificateChain) {
            return certificateChain(Output.of(certificateChain));
        }

        public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs build() {
            $.certificateChain = Objects.requireNonNull($.certificateChain, "expected parameter 'certificateChain' to be non-null");
            return $;
        }
    }

}
