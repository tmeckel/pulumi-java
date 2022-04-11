// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca;

import io.pulumi.aws.acmpca.inputs.CertificateValidityArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * Amazon Resource Name (ARN) of the certificate authority.
     * 
     */
    @Import(name="certificateAuthorityArn", required=true)
      private final Output<String> certificateAuthorityArn;

    public Output<String> getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * Certificate Signing Request in PEM format.
     * 
     */
    @Import(name="certificateSigningRequest", required=true)
      private final Output<String> certificateSigningRequest;

    public Output<String> getCertificateSigningRequest() {
        return this.certificateSigningRequest;
    }

    /**
     * Algorithm to use to sign certificate requests. Valid values: `SHA256WITHRSA`, `SHA256WITHECDSA`, `SHA384WITHRSA`, `SHA384WITHECDSA`, `SHA512WITHRSA`, `SHA512WITHECDSA`
     * 
     */
    @Import(name="signingAlgorithm", required=true)
      private final Output<String> signingAlgorithm;

    public Output<String> getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    /**
     * The template to use when issuing a certificate. See [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html) for more information.
     * 
     */
    @Import(name="templateArn")
      private final @Nullable Output<String> templateArn;

    public Output<String> getTemplateArn() {
        return this.templateArn == null ? Codegen.empty() : this.templateArn;
    }

    /**
     * Configures end of the validity period for the certificate. See validity block below.
     * 
     */
    @Import(name="validity", required=true)
      private final Output<CertificateValidityArgs> validity;

    public Output<CertificateValidityArgs> getValidity() {
        return this.validity;
    }

    public CertificateArgs(
        Output<String> certificateAuthorityArn,
        Output<String> certificateSigningRequest,
        Output<String> signingAlgorithm,
        @Nullable Output<String> templateArn,
        Output<CertificateValidityArgs> validity) {
        this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn, "expected parameter 'certificateAuthorityArn' to be non-null");
        this.certificateSigningRequest = Objects.requireNonNull(certificateSigningRequest, "expected parameter 'certificateSigningRequest' to be non-null");
        this.signingAlgorithm = Objects.requireNonNull(signingAlgorithm, "expected parameter 'signingAlgorithm' to be non-null");
        this.templateArn = templateArn;
        this.validity = Objects.requireNonNull(validity, "expected parameter 'validity' to be non-null");
    }

    private CertificateArgs() {
        this.certificateAuthorityArn = Codegen.empty();
        this.certificateSigningRequest = Codegen.empty();
        this.signingAlgorithm = Codegen.empty();
        this.templateArn = Codegen.empty();
        this.validity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificateAuthorityArn;
        private Output<String> certificateSigningRequest;
        private Output<String> signingAlgorithm;
        private @Nullable Output<String> templateArn;
        private Output<CertificateValidityArgs> validity;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthorityArn = defaults.certificateAuthorityArn;
    	      this.certificateSigningRequest = defaults.certificateSigningRequest;
    	      this.signingAlgorithm = defaults.signingAlgorithm;
    	      this.templateArn = defaults.templateArn;
    	      this.validity = defaults.validity;
        }

        public Builder certificateAuthorityArn(Output<String> certificateAuthorityArn) {
            this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn);
            return this;
        }
        public Builder certificateAuthorityArn(String certificateAuthorityArn) {
            this.certificateAuthorityArn = Output.of(Objects.requireNonNull(certificateAuthorityArn));
            return this;
        }
        public Builder certificateSigningRequest(Output<String> certificateSigningRequest) {
            this.certificateSigningRequest = Objects.requireNonNull(certificateSigningRequest);
            return this;
        }
        public Builder certificateSigningRequest(String certificateSigningRequest) {
            this.certificateSigningRequest = Output.of(Objects.requireNonNull(certificateSigningRequest));
            return this;
        }
        public Builder signingAlgorithm(Output<String> signingAlgorithm) {
            this.signingAlgorithm = Objects.requireNonNull(signingAlgorithm);
            return this;
        }
        public Builder signingAlgorithm(String signingAlgorithm) {
            this.signingAlgorithm = Output.of(Objects.requireNonNull(signingAlgorithm));
            return this;
        }
        public Builder templateArn(@Nullable Output<String> templateArn) {
            this.templateArn = templateArn;
            return this;
        }
        public Builder templateArn(@Nullable String templateArn) {
            this.templateArn = Codegen.ofNullable(templateArn);
            return this;
        }
        public Builder validity(Output<CertificateValidityArgs> validity) {
            this.validity = Objects.requireNonNull(validity);
            return this;
        }
        public Builder validity(CertificateValidityArgs validity) {
            this.validity = Output.of(Objects.requireNonNull(validity));
            return this;
        }        public CertificateArgs build() {
            return new CertificateArgs(certificateAuthorityArn, certificateSigningRequest, signingAlgorithm, templateArn, validity);
        }
    }
}
