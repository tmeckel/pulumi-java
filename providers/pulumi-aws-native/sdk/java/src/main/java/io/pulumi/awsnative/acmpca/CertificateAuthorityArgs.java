// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca;

import io.pulumi.awsnative.acmpca.inputs.CertificateAuthorityCsrExtensionsArgs;
import io.pulumi.awsnative.acmpca.inputs.CertificateAuthorityRevocationConfigurationArgs;
import io.pulumi.awsnative.acmpca.inputs.CertificateAuthoritySubjectArgs;
import io.pulumi.awsnative.acmpca.inputs.CertificateAuthorityTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateAuthorityArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityArgs Empty = new CertificateAuthorityArgs();

    /**
     * Structure that contains CSR pass through extension information used by the CreateCertificateAuthority action.
     * 
     */
    @InputImport(name="csrExtensions")
      private final @Nullable Input<CertificateAuthorityCsrExtensionsArgs> csrExtensions;

    public Input<CertificateAuthorityCsrExtensionsArgs> getCsrExtensions() {
        return this.csrExtensions == null ? Input.empty() : this.csrExtensions;
    }

    /**
     * Public key algorithm and size, in bits, of the key pair that your CA creates when it issues a certificate.
     * 
     */
    @InputImport(name="keyAlgorithm", required=true)
      private final Input<String> keyAlgorithm;

    public Input<String> getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * KeyStorageSecurityStadard defines a cryptographic key management compliance standard used for handling CA keys.
     * 
     */
    @InputImport(name="keyStorageSecurityStandard")
      private final @Nullable Input<String> keyStorageSecurityStandard;

    public Input<String> getKeyStorageSecurityStandard() {
        return this.keyStorageSecurityStandard == null ? Input.empty() : this.keyStorageSecurityStandard;
    }

    /**
     * Certificate revocation information used by the CreateCertificateAuthority and UpdateCertificateAuthority actions.
     * 
     */
    @InputImport(name="revocationConfiguration")
      private final @Nullable Input<CertificateAuthorityRevocationConfigurationArgs> revocationConfiguration;

    public Input<CertificateAuthorityRevocationConfigurationArgs> getRevocationConfiguration() {
        return this.revocationConfiguration == null ? Input.empty() : this.revocationConfiguration;
    }

    /**
     * Algorithm your CA uses to sign certificate requests.
     * 
     */
    @InputImport(name="signingAlgorithm", required=true)
      private final Input<String> signingAlgorithm;

    public Input<String> getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    /**
     * Structure that contains X.500 distinguished name information for your CA.
     * 
     */
    @InputImport(name="subject", required=true)
      private final Input<CertificateAuthoritySubjectArgs> subject;

    public Input<CertificateAuthoritySubjectArgs> getSubject() {
        return this.subject;
    }

    @InputImport(name="tags")
      private final @Nullable Input<List<CertificateAuthorityTagArgs>> tags;

    public Input<List<CertificateAuthorityTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The type of the certificate authority.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public CertificateAuthorityArgs(
        @Nullable Input<CertificateAuthorityCsrExtensionsArgs> csrExtensions,
        Input<String> keyAlgorithm,
        @Nullable Input<String> keyStorageSecurityStandard,
        @Nullable Input<CertificateAuthorityRevocationConfigurationArgs> revocationConfiguration,
        Input<String> signingAlgorithm,
        Input<CertificateAuthoritySubjectArgs> subject,
        @Nullable Input<List<CertificateAuthorityTagArgs>> tags,
        Input<String> type) {
        this.csrExtensions = csrExtensions;
        this.keyAlgorithm = Objects.requireNonNull(keyAlgorithm, "expected parameter 'keyAlgorithm' to be non-null");
        this.keyStorageSecurityStandard = keyStorageSecurityStandard;
        this.revocationConfiguration = revocationConfiguration;
        this.signingAlgorithm = Objects.requireNonNull(signingAlgorithm, "expected parameter 'signingAlgorithm' to be non-null");
        this.subject = Objects.requireNonNull(subject, "expected parameter 'subject' to be non-null");
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CertificateAuthorityArgs() {
        this.csrExtensions = Input.empty();
        this.keyAlgorithm = Input.empty();
        this.keyStorageSecurityStandard = Input.empty();
        this.revocationConfiguration = Input.empty();
        this.signingAlgorithm = Input.empty();
        this.subject = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CertificateAuthorityCsrExtensionsArgs> csrExtensions;
        private Input<String> keyAlgorithm;
        private @Nullable Input<String> keyStorageSecurityStandard;
        private @Nullable Input<CertificateAuthorityRevocationConfigurationArgs> revocationConfiguration;
        private Input<String> signingAlgorithm;
        private Input<CertificateAuthoritySubjectArgs> subject;
        private @Nullable Input<List<CertificateAuthorityTagArgs>> tags;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csrExtensions = defaults.csrExtensions;
    	      this.keyAlgorithm = defaults.keyAlgorithm;
    	      this.keyStorageSecurityStandard = defaults.keyStorageSecurityStandard;
    	      this.revocationConfiguration = defaults.revocationConfiguration;
    	      this.signingAlgorithm = defaults.signingAlgorithm;
    	      this.subject = defaults.subject;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder csrExtensions(@Nullable Input<CertificateAuthorityCsrExtensionsArgs> csrExtensions) {
            this.csrExtensions = csrExtensions;
            return this;
        }

        public Builder csrExtensions(@Nullable CertificateAuthorityCsrExtensionsArgs csrExtensions) {
            this.csrExtensions = Input.ofNullable(csrExtensions);
            return this;
        }

        public Builder keyAlgorithm(Input<String> keyAlgorithm) {
            this.keyAlgorithm = Objects.requireNonNull(keyAlgorithm);
            return this;
        }

        public Builder keyAlgorithm(String keyAlgorithm) {
            this.keyAlgorithm = Input.of(Objects.requireNonNull(keyAlgorithm));
            return this;
        }

        public Builder keyStorageSecurityStandard(@Nullable Input<String> keyStorageSecurityStandard) {
            this.keyStorageSecurityStandard = keyStorageSecurityStandard;
            return this;
        }

        public Builder keyStorageSecurityStandard(@Nullable String keyStorageSecurityStandard) {
            this.keyStorageSecurityStandard = Input.ofNullable(keyStorageSecurityStandard);
            return this;
        }

        public Builder revocationConfiguration(@Nullable Input<CertificateAuthorityRevocationConfigurationArgs> revocationConfiguration) {
            this.revocationConfiguration = revocationConfiguration;
            return this;
        }

        public Builder revocationConfiguration(@Nullable CertificateAuthorityRevocationConfigurationArgs revocationConfiguration) {
            this.revocationConfiguration = Input.ofNullable(revocationConfiguration);
            return this;
        }

        public Builder signingAlgorithm(Input<String> signingAlgorithm) {
            this.signingAlgorithm = Objects.requireNonNull(signingAlgorithm);
            return this;
        }

        public Builder signingAlgorithm(String signingAlgorithm) {
            this.signingAlgorithm = Input.of(Objects.requireNonNull(signingAlgorithm));
            return this;
        }

        public Builder subject(Input<CertificateAuthoritySubjectArgs> subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }

        public Builder subject(CertificateAuthoritySubjectArgs subject) {
            this.subject = Input.of(Objects.requireNonNull(subject));
            return this;
        }

        public Builder tags(@Nullable Input<List<CertificateAuthorityTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<CertificateAuthorityTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public CertificateAuthorityArgs build() {
            return new CertificateAuthorityArgs(csrExtensions, keyAlgorithm, keyStorageSecurityStandard, revocationConfiguration, signingAlgorithm, subject, tags, type);
        }
    }
}
