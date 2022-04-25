// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acmpca;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateAuthorityCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityCertificateArgs Empty = new CertificateAuthorityCertificateArgs();

    /**
     * The PEM-encoded certificate for the Certificate Authority.
     * 
     */
    @Import(name="certificate", required=true)
    private Output<String> certificate;

    /**
     * @return The PEM-encoded certificate for the Certificate Authority.
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }

    /**
     * Amazon Resource Name (ARN) of the Certificate Authority.
     * 
     */
    @Import(name="certificateAuthorityArn", required=true)
    private Output<String> certificateAuthorityArn;

    /**
     * @return Amazon Resource Name (ARN) of the Certificate Authority.
     * 
     */
    public Output<String> certificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA. Required for subordinate Certificate Authorities. Not allowed for root Certificate Authorities.
     * 
     */
    @Import(name="certificateChain")
    private @Nullable Output<String> certificateChain;

    /**
     * @return The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA. Required for subordinate Certificate Authorities. Not allowed for root Certificate Authorities.
     * 
     */
    public Optional<Output<String>> certificateChain() {
        return Optional.ofNullable(this.certificateChain);
    }

    private CertificateAuthorityCertificateArgs() {}

    private CertificateAuthorityCertificateArgs(CertificateAuthorityCertificateArgs $) {
        this.certificate = $.certificate;
        this.certificateAuthorityArn = $.certificateAuthorityArn;
        this.certificateChain = $.certificateChain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateAuthorityCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateAuthorityCertificateArgs $;

        public Builder() {
            $ = new CertificateAuthorityCertificateArgs();
        }

        public Builder(CertificateAuthorityCertificateArgs defaults) {
            $ = new CertificateAuthorityCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate The PEM-encoded certificate for the Certificate Authority.
         * 
         * @return builder
         * 
         */
        public Builder certificate(Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate The PEM-encoded certificate for the Certificate Authority.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param certificateAuthorityArn Amazon Resource Name (ARN) of the Certificate Authority.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityArn(Output<String> certificateAuthorityArn) {
            $.certificateAuthorityArn = certificateAuthorityArn;
            return this;
        }

        /**
         * @param certificateAuthorityArn Amazon Resource Name (ARN) of the Certificate Authority.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityArn(String certificateAuthorityArn) {
            return certificateAuthorityArn(Output.of(certificateAuthorityArn));
        }

        /**
         * @param certificateChain The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA. Required for subordinate Certificate Authorities. Not allowed for root Certificate Authorities.
         * 
         * @return builder
         * 
         */
        public Builder certificateChain(@Nullable Output<String> certificateChain) {
            $.certificateChain = certificateChain;
            return this;
        }

        /**
         * @param certificateChain The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA. Required for subordinate Certificate Authorities. Not allowed for root Certificate Authorities.
         * 
         * @return builder
         * 
         */
        public Builder certificateChain(String certificateChain) {
            return certificateChain(Output.of(certificateChain));
        }

        public CertificateAuthorityCertificateArgs build() {
            $.certificate = Objects.requireNonNull($.certificate, "expected parameter 'certificate' to be non-null");
            $.certificateAuthorityArn = Objects.requireNonNull($.certificateAuthorityArn, "expected parameter 'certificateAuthorityArn' to be non-null");
            return $;
        }
    }

}
