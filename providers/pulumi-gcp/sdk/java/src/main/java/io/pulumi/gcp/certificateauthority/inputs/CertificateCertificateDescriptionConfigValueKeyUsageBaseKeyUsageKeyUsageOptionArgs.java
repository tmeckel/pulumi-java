// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs Empty = new CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs();

    /**
     * The key may be used to sign certificates.
     * 
     */
    @Import(name="certSign")
      private final @Nullable Output<Boolean> certSign;

    public Output<Boolean> getCertSign() {
        return this.certSign == null ? Codegen.empty() : this.certSign;
    }

    /**
     * The key may be used for cryptographic commitments. Note that this may also be referred to as "non-repudiation".
     * 
     */
    @Import(name="contentCommitment")
      private final @Nullable Output<Boolean> contentCommitment;

    public Output<Boolean> getContentCommitment() {
        return this.contentCommitment == null ? Codegen.empty() : this.contentCommitment;
    }

    /**
     * The key may be used sign certificate revocation lists.
     * 
     */
    @Import(name="crlSign")
      private final @Nullable Output<Boolean> crlSign;

    public Output<Boolean> getCrlSign() {
        return this.crlSign == null ? Codegen.empty() : this.crlSign;
    }

    /**
     * The key may be used to encipher data.
     * 
     */
    @Import(name="dataEncipherment")
      private final @Nullable Output<Boolean> dataEncipherment;

    public Output<Boolean> getDataEncipherment() {
        return this.dataEncipherment == null ? Codegen.empty() : this.dataEncipherment;
    }

    /**
     * The key may be used to decipher only.
     * 
     */
    @Import(name="decipherOnly")
      private final @Nullable Output<Boolean> decipherOnly;

    public Output<Boolean> getDecipherOnly() {
        return this.decipherOnly == null ? Codegen.empty() : this.decipherOnly;
    }

    /**
     * The key may be used for digital signatures.
     * 
     */
    @Import(name="digitalSignature")
      private final @Nullable Output<Boolean> digitalSignature;

    public Output<Boolean> getDigitalSignature() {
        return this.digitalSignature == null ? Codegen.empty() : this.digitalSignature;
    }

    /**
     * The key may be used to encipher only.
     * 
     */
    @Import(name="encipherOnly")
      private final @Nullable Output<Boolean> encipherOnly;

    public Output<Boolean> getEncipherOnly() {
        return this.encipherOnly == null ? Codegen.empty() : this.encipherOnly;
    }

    /**
     * The key may be used in a key agreement protocol.
     * 
     */
    @Import(name="keyAgreement")
      private final @Nullable Output<Boolean> keyAgreement;

    public Output<Boolean> getKeyAgreement() {
        return this.keyAgreement == null ? Codegen.empty() : this.keyAgreement;
    }

    /**
     * The key may be used to encipher other keys.
     * 
     */
    @Import(name="keyEncipherment")
      private final @Nullable Output<Boolean> keyEncipherment;

    public Output<Boolean> getKeyEncipherment() {
        return this.keyEncipherment == null ? Codegen.empty() : this.keyEncipherment;
    }

    public CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs(
        @Nullable Output<Boolean> certSign,
        @Nullable Output<Boolean> contentCommitment,
        @Nullable Output<Boolean> crlSign,
        @Nullable Output<Boolean> dataEncipherment,
        @Nullable Output<Boolean> decipherOnly,
        @Nullable Output<Boolean> digitalSignature,
        @Nullable Output<Boolean> encipherOnly,
        @Nullable Output<Boolean> keyAgreement,
        @Nullable Output<Boolean> keyEncipherment) {
        this.certSign = certSign;
        this.contentCommitment = contentCommitment;
        this.crlSign = crlSign;
        this.dataEncipherment = dataEncipherment;
        this.decipherOnly = decipherOnly;
        this.digitalSignature = digitalSignature;
        this.encipherOnly = encipherOnly;
        this.keyAgreement = keyAgreement;
        this.keyEncipherment = keyEncipherment;
    }

    private CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs() {
        this.certSign = Codegen.empty();
        this.contentCommitment = Codegen.empty();
        this.crlSign = Codegen.empty();
        this.dataEncipherment = Codegen.empty();
        this.decipherOnly = Codegen.empty();
        this.digitalSignature = Codegen.empty();
        this.encipherOnly = Codegen.empty();
        this.keyAgreement = Codegen.empty();
        this.keyEncipherment = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> certSign;
        private @Nullable Output<Boolean> contentCommitment;
        private @Nullable Output<Boolean> crlSign;
        private @Nullable Output<Boolean> dataEncipherment;
        private @Nullable Output<Boolean> decipherOnly;
        private @Nullable Output<Boolean> digitalSignature;
        private @Nullable Output<Boolean> encipherOnly;
        private @Nullable Output<Boolean> keyAgreement;
        private @Nullable Output<Boolean> keyEncipherment;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certSign = defaults.certSign;
    	      this.contentCommitment = defaults.contentCommitment;
    	      this.crlSign = defaults.crlSign;
    	      this.dataEncipherment = defaults.dataEncipherment;
    	      this.decipherOnly = defaults.decipherOnly;
    	      this.digitalSignature = defaults.digitalSignature;
    	      this.encipherOnly = defaults.encipherOnly;
    	      this.keyAgreement = defaults.keyAgreement;
    	      this.keyEncipherment = defaults.keyEncipherment;
        }

        public Builder certSign(@Nullable Output<Boolean> certSign) {
            this.certSign = certSign;
            return this;
        }
        public Builder certSign(@Nullable Boolean certSign) {
            this.certSign = Codegen.ofNullable(certSign);
            return this;
        }
        public Builder contentCommitment(@Nullable Output<Boolean> contentCommitment) {
            this.contentCommitment = contentCommitment;
            return this;
        }
        public Builder contentCommitment(@Nullable Boolean contentCommitment) {
            this.contentCommitment = Codegen.ofNullable(contentCommitment);
            return this;
        }
        public Builder crlSign(@Nullable Output<Boolean> crlSign) {
            this.crlSign = crlSign;
            return this;
        }
        public Builder crlSign(@Nullable Boolean crlSign) {
            this.crlSign = Codegen.ofNullable(crlSign);
            return this;
        }
        public Builder dataEncipherment(@Nullable Output<Boolean> dataEncipherment) {
            this.dataEncipherment = dataEncipherment;
            return this;
        }
        public Builder dataEncipherment(@Nullable Boolean dataEncipherment) {
            this.dataEncipherment = Codegen.ofNullable(dataEncipherment);
            return this;
        }
        public Builder decipherOnly(@Nullable Output<Boolean> decipherOnly) {
            this.decipherOnly = decipherOnly;
            return this;
        }
        public Builder decipherOnly(@Nullable Boolean decipherOnly) {
            this.decipherOnly = Codegen.ofNullable(decipherOnly);
            return this;
        }
        public Builder digitalSignature(@Nullable Output<Boolean> digitalSignature) {
            this.digitalSignature = digitalSignature;
            return this;
        }
        public Builder digitalSignature(@Nullable Boolean digitalSignature) {
            this.digitalSignature = Codegen.ofNullable(digitalSignature);
            return this;
        }
        public Builder encipherOnly(@Nullable Output<Boolean> encipherOnly) {
            this.encipherOnly = encipherOnly;
            return this;
        }
        public Builder encipherOnly(@Nullable Boolean encipherOnly) {
            this.encipherOnly = Codegen.ofNullable(encipherOnly);
            return this;
        }
        public Builder keyAgreement(@Nullable Output<Boolean> keyAgreement) {
            this.keyAgreement = keyAgreement;
            return this;
        }
        public Builder keyAgreement(@Nullable Boolean keyAgreement) {
            this.keyAgreement = Codegen.ofNullable(keyAgreement);
            return this;
        }
        public Builder keyEncipherment(@Nullable Output<Boolean> keyEncipherment) {
            this.keyEncipherment = keyEncipherment;
            return this;
        }
        public Builder keyEncipherment(@Nullable Boolean keyEncipherment) {
            this.keyEncipherment = Codegen.ofNullable(keyEncipherment);
            return this;
        }        public CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs build() {
            return new CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs(certSign, contentCommitment, crlSign, dataEncipherment, decipherOnly, digitalSignature, encipherOnly, keyAgreement, keyEncipherment);
        }
    }
}
