// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AttestorAttestationAuthorityNotePublicKeyPkixPublicKey {
    /**
     * A PEM-encoded public key, as described in
     * `https://tools.ietf.org/html/rfc7468#section-13`
     * 
     */
    private final @Nullable String publicKeyPem;
    /**
     * The signature algorithm used to verify a message against
     * a signature using this key. These signature algorithm must
     * match the structure and any object identifiers encoded in
     * publicKeyPem (i.e. this algorithm must match that of the
     * public key).
     * 
     */
    private final @Nullable String signatureAlgorithm;

    @OutputCustomType.Constructor
    private AttestorAttestationAuthorityNotePublicKeyPkixPublicKey(
        @OutputCustomType.Parameter("publicKeyPem") @Nullable String publicKeyPem,
        @OutputCustomType.Parameter("signatureAlgorithm") @Nullable String signatureAlgorithm) {
        this.publicKeyPem = publicKeyPem;
        this.signatureAlgorithm = signatureAlgorithm;
    }

    /**
     * A PEM-encoded public key, as described in
     * `https://tools.ietf.org/html/rfc7468#section-13`
     * 
    */
    public Optional<String> getPublicKeyPem() {
        return Optional.ofNullable(this.publicKeyPem);
    }
    /**
     * The signature algorithm used to verify a message against
     * a signature using this key. These signature algorithm must
     * match the structure and any object identifiers encoded in
     * publicKeyPem (i.e. this algorithm must match that of the
     * public key).
     * 
    */
    public Optional<String> getSignatureAlgorithm() {
        return Optional.ofNullable(this.signatureAlgorithm);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestorAttestationAuthorityNotePublicKeyPkixPublicKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String publicKeyPem;
        private @Nullable String signatureAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestorAttestationAuthorityNotePublicKeyPkixPublicKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyPem = defaults.publicKeyPem;
    	      this.signatureAlgorithm = defaults.signatureAlgorithm;
        }

        public Builder publicKeyPem(@Nullable String publicKeyPem) {
            this.publicKeyPem = publicKeyPem;
            return this;
        }

        public Builder signatureAlgorithm(@Nullable String signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            return this;
        }
        public AttestorAttestationAuthorityNotePublicKeyPkixPublicKey build() {
            return new AttestorAttestationAuthorityNotePublicKeyPkixPublicKey(publicKeyPem, signatureAlgorithm);
        }
    }
}
