// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.binaryauthorization_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.binaryauthorization_v1beta1.enums.PkixPublicKeySignatureAlgorithm;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A public key in the PkixPublicKey format (see https://tools.ietf.org/html/rfc5280#section-4.1.2.7 for details). Public keys of this type are typically textually encoded using the PEM format.
 * 
 */
public final class PkixPublicKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PkixPublicKeyArgs Empty = new PkixPublicKeyArgs();

    /**
     * A PEM-encoded public key, as described in https://tools.ietf.org/html/rfc7468#section-13
     * 
     */
    @InputImport(name="publicKeyPem")
    private final @Nullable Input<String> publicKeyPem;

    public Input<String> getPublicKeyPem() {
        return this.publicKeyPem == null ? Input.empty() : this.publicKeyPem;
    }

    /**
     * The signature algorithm used to verify a message against a signature using this key. These signature algorithm must match the structure and any object identifiers encoded in `public_key_pem` (i.e. this algorithm must match that of the public key).
     * 
     */
    @InputImport(name="signatureAlgorithm")
    private final @Nullable Input<PkixPublicKeySignatureAlgorithm> signatureAlgorithm;

    public Input<PkixPublicKeySignatureAlgorithm> getSignatureAlgorithm() {
        return this.signatureAlgorithm == null ? Input.empty() : this.signatureAlgorithm;
    }

    public PkixPublicKeyArgs(
        @Nullable Input<String> publicKeyPem,
        @Nullable Input<PkixPublicKeySignatureAlgorithm> signatureAlgorithm) {
        this.publicKeyPem = publicKeyPem;
        this.signatureAlgorithm = signatureAlgorithm;
    }

    private PkixPublicKeyArgs() {
        this.publicKeyPem = Input.empty();
        this.signatureAlgorithm = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PkixPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> publicKeyPem;
        private @Nullable Input<PkixPublicKeySignatureAlgorithm> signatureAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(PkixPublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyPem = defaults.publicKeyPem;
    	      this.signatureAlgorithm = defaults.signatureAlgorithm;
        }

        public Builder setPublicKeyPem(@Nullable Input<String> publicKeyPem) {
            this.publicKeyPem = publicKeyPem;
            return this;
        }

        public Builder setPublicKeyPem(@Nullable String publicKeyPem) {
            this.publicKeyPem = Input.ofNullable(publicKeyPem);
            return this;
        }

        public Builder setSignatureAlgorithm(@Nullable Input<PkixPublicKeySignatureAlgorithm> signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            return this;
        }

        public Builder setSignatureAlgorithm(@Nullable PkixPublicKeySignatureAlgorithm signatureAlgorithm) {
            this.signatureAlgorithm = Input.ofNullable(signatureAlgorithm);
            return this;
        }

        public PkixPublicKeyArgs build() {
            return new PkixPublicKeyArgs(publicKeyPem, signatureAlgorithm);
        }
    }
}
