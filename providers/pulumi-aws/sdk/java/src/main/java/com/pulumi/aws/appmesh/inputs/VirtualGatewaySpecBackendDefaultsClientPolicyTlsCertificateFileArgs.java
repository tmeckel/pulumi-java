// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs Empty = new VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs();

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

    /**
     * The private key for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="privateKey", required=true)
    private Output<String> privateKey;

    /**
     * @return The private key for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
    }

    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs() {}

    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs(VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs $) {
        this.certificateChain = $.certificateChain;
        this.privateKey = $.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs $;

        public Builder() {
            $ = new VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs();
        }

        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs defaults) {
            $ = new VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param privateKey The private key for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey The private key for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        public VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs build() {
            $.certificateChain = Objects.requireNonNull($.certificateChain, "expected parameter 'certificateChain' to be non-null");
            $.privateKey = Objects.requireNonNull($.privateKey, "expected parameter 'privateKey' to be non-null");
            return $;
        }
    }

}
