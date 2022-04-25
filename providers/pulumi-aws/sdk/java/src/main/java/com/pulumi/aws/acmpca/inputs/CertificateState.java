// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acmpca.inputs;

import com.pulumi.aws.acmpca.inputs.CertificateValidityGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateState extends com.pulumi.resources.ResourceArgs {

    public static final CertificateState Empty = new CertificateState();

    /**
     * Amazon Resource Name (ARN) of the certificate.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the certificate.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The PEM-encoded certificate value.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return The PEM-encoded certificate value.
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * Amazon Resource Name (ARN) of the certificate authority.
     * 
     */
    @Import(name="certificateAuthorityArn")
    private @Nullable Output<String> certificateAuthorityArn;

    /**
     * @return Amazon Resource Name (ARN) of the certificate authority.
     * 
     */
    public Optional<Output<String>> certificateAuthorityArn() {
        return Optional.ofNullable(this.certificateAuthorityArn);
    }

    /**
     * The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA.
     * 
     */
    @Import(name="certificateChain")
    private @Nullable Output<String> certificateChain;

    /**
     * @return The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA.
     * 
     */
    public Optional<Output<String>> certificateChain() {
        return Optional.ofNullable(this.certificateChain);
    }

    /**
     * Certificate Signing Request in PEM format.
     * 
     */
    @Import(name="certificateSigningRequest")
    private @Nullable Output<String> certificateSigningRequest;

    /**
     * @return Certificate Signing Request in PEM format.
     * 
     */
    public Optional<Output<String>> certificateSigningRequest() {
        return Optional.ofNullable(this.certificateSigningRequest);
    }

    /**
     * Algorithm to use to sign certificate requests. Valid values: `SHA256WITHRSA`, `SHA256WITHECDSA`, `SHA384WITHRSA`, `SHA384WITHECDSA`, `SHA512WITHRSA`, `SHA512WITHECDSA`
     * 
     */
    @Import(name="signingAlgorithm")
    private @Nullable Output<String> signingAlgorithm;

    /**
     * @return Algorithm to use to sign certificate requests. Valid values: `SHA256WITHRSA`, `SHA256WITHECDSA`, `SHA384WITHRSA`, `SHA384WITHECDSA`, `SHA512WITHRSA`, `SHA512WITHECDSA`
     * 
     */
    public Optional<Output<String>> signingAlgorithm() {
        return Optional.ofNullable(this.signingAlgorithm);
    }

    /**
     * The template to use when issuing a certificate. See [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html) for more information.
     * 
     */
    @Import(name="templateArn")
    private @Nullable Output<String> templateArn;

    /**
     * @return The template to use when issuing a certificate. See [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html) for more information.
     * 
     */
    public Optional<Output<String>> templateArn() {
        return Optional.ofNullable(this.templateArn);
    }

    /**
     * Configures end of the validity period for the certificate. See validity block below.
     * 
     */
    @Import(name="validity")
    private @Nullable Output<CertificateValidityGetArgs> validity;

    /**
     * @return Configures end of the validity period for the certificate. See validity block below.
     * 
     */
    public Optional<Output<CertificateValidityGetArgs>> validity() {
        return Optional.ofNullable(this.validity);
    }

    private CertificateState() {}

    private CertificateState(CertificateState $) {
        this.arn = $.arn;
        this.certificate = $.certificate;
        this.certificateAuthorityArn = $.certificateAuthorityArn;
        this.certificateChain = $.certificateChain;
        this.certificateSigningRequest = $.certificateSigningRequest;
        this.signingAlgorithm = $.signingAlgorithm;
        this.templateArn = $.templateArn;
        this.validity = $.validity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateState $;

        public Builder() {
            $ = new CertificateState();
        }

        public Builder(CertificateState defaults) {
            $ = new CertificateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param certificate The PEM-encoded certificate value.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate The PEM-encoded certificate value.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param certificateAuthorityArn Amazon Resource Name (ARN) of the certificate authority.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityArn(@Nullable Output<String> certificateAuthorityArn) {
            $.certificateAuthorityArn = certificateAuthorityArn;
            return this;
        }

        /**
         * @param certificateAuthorityArn Amazon Resource Name (ARN) of the certificate authority.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityArn(String certificateAuthorityArn) {
            return certificateAuthorityArn(Output.of(certificateAuthorityArn));
        }

        /**
         * @param certificateChain The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA.
         * 
         * @return builder
         * 
         */
        public Builder certificateChain(@Nullable Output<String> certificateChain) {
            $.certificateChain = certificateChain;
            return this;
        }

        /**
         * @param certificateChain The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA.
         * 
         * @return builder
         * 
         */
        public Builder certificateChain(String certificateChain) {
            return certificateChain(Output.of(certificateChain));
        }

        /**
         * @param certificateSigningRequest Certificate Signing Request in PEM format.
         * 
         * @return builder
         * 
         */
        public Builder certificateSigningRequest(@Nullable Output<String> certificateSigningRequest) {
            $.certificateSigningRequest = certificateSigningRequest;
            return this;
        }

        /**
         * @param certificateSigningRequest Certificate Signing Request in PEM format.
         * 
         * @return builder
         * 
         */
        public Builder certificateSigningRequest(String certificateSigningRequest) {
            return certificateSigningRequest(Output.of(certificateSigningRequest));
        }

        /**
         * @param signingAlgorithm Algorithm to use to sign certificate requests. Valid values: `SHA256WITHRSA`, `SHA256WITHECDSA`, `SHA384WITHRSA`, `SHA384WITHECDSA`, `SHA512WITHRSA`, `SHA512WITHECDSA`
         * 
         * @return builder
         * 
         */
        public Builder signingAlgorithm(@Nullable Output<String> signingAlgorithm) {
            $.signingAlgorithm = signingAlgorithm;
            return this;
        }

        /**
         * @param signingAlgorithm Algorithm to use to sign certificate requests. Valid values: `SHA256WITHRSA`, `SHA256WITHECDSA`, `SHA384WITHRSA`, `SHA384WITHECDSA`, `SHA512WITHRSA`, `SHA512WITHECDSA`
         * 
         * @return builder
         * 
         */
        public Builder signingAlgorithm(String signingAlgorithm) {
            return signingAlgorithm(Output.of(signingAlgorithm));
        }

        /**
         * @param templateArn The template to use when issuing a certificate. See [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder templateArn(@Nullable Output<String> templateArn) {
            $.templateArn = templateArn;
            return this;
        }

        /**
         * @param templateArn The template to use when issuing a certificate. See [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder templateArn(String templateArn) {
            return templateArn(Output.of(templateArn));
        }

        /**
         * @param validity Configures end of the validity period for the certificate. See validity block below.
         * 
         * @return builder
         * 
         */
        public Builder validity(@Nullable Output<CertificateValidityGetArgs> validity) {
            $.validity = validity;
            return this;
        }

        /**
         * @param validity Configures end of the validity period for the certificate. See validity block below.
         * 
         * @return builder
         * 
         */
        public Builder validity(CertificateValidityGetArgs validity) {
            return validity(Output.of(validity));
        }

        public CertificateState build() {
            return $;
        }
    }

}
