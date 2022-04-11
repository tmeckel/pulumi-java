// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.binaryauthorization_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.binaryauthorization_v1.inputs.PkixPublicKeyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An attestor public key that will be used to verify attestations signed by this attestor.
 * 
 */
public final class AttestorPublicKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttestorPublicKeyArgs Empty = new AttestorPublicKeyArgs();

    /**
     * ASCII-armored representation of a PGP public key, as the entire output by the command `gpg --export --armor foo@example.com` (either LF or CRLF line endings). When using this field, `id` should be left blank. The BinAuthz API handlers will calculate the ID and fill it in automatically. BinAuthz computes this ID as the OpenPGP RFC4880 V4 fingerprint, represented as upper-case hex. If `id` is provided by the caller, it will be overwritten by the API-calculated ID.
     * 
     */
    @Import(name="asciiArmoredPgpPublicKey")
      private final @Nullable Output<String> asciiArmoredPgpPublicKey;

    public Output<String> getAsciiArmoredPgpPublicKey() {
        return this.asciiArmoredPgpPublicKey == null ? Codegen.empty() : this.asciiArmoredPgpPublicKey;
    }

    /**
     * Optional. A descriptive comment. This field may be updated.
     * 
     */
    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> getComment() {
        return this.comment == null ? Codegen.empty() : this.comment;
    }

    /**
     * The ID of this public key. Signatures verified by BinAuthz must include the ID of the public key that can be used to verify them, and that ID must match the contents of this field exactly. Additional restrictions on this field can be imposed based on which public key type is encapsulated. See the documentation on `public_key` cases below for details.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * A raw PKIX SubjectPublicKeyInfo format public key. NOTE: `id` may be explicitly provided by the caller when using this type of public key, but it MUST be a valid RFC3986 URI. If `id` is left blank, a default one will be computed based on the digest of the DER encoding of the public key.
     * 
     */
    @Import(name="pkixPublicKey")
      private final @Nullable Output<PkixPublicKeyArgs> pkixPublicKey;

    public Output<PkixPublicKeyArgs> getPkixPublicKey() {
        return this.pkixPublicKey == null ? Codegen.empty() : this.pkixPublicKey;
    }

    public AttestorPublicKeyArgs(
        @Nullable Output<String> asciiArmoredPgpPublicKey,
        @Nullable Output<String> comment,
        @Nullable Output<String> id,
        @Nullable Output<PkixPublicKeyArgs> pkixPublicKey) {
        this.asciiArmoredPgpPublicKey = asciiArmoredPgpPublicKey;
        this.comment = comment;
        this.id = id;
        this.pkixPublicKey = pkixPublicKey;
    }

    private AttestorPublicKeyArgs() {
        this.asciiArmoredPgpPublicKey = Codegen.empty();
        this.comment = Codegen.empty();
        this.id = Codegen.empty();
        this.pkixPublicKey = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestorPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> asciiArmoredPgpPublicKey;
        private @Nullable Output<String> comment;
        private @Nullable Output<String> id;
        private @Nullable Output<PkixPublicKeyArgs> pkixPublicKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestorPublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asciiArmoredPgpPublicKey = defaults.asciiArmoredPgpPublicKey;
    	      this.comment = defaults.comment;
    	      this.id = defaults.id;
    	      this.pkixPublicKey = defaults.pkixPublicKey;
        }

        public Builder asciiArmoredPgpPublicKey(@Nullable Output<String> asciiArmoredPgpPublicKey) {
            this.asciiArmoredPgpPublicKey = asciiArmoredPgpPublicKey;
            return this;
        }
        public Builder asciiArmoredPgpPublicKey(@Nullable String asciiArmoredPgpPublicKey) {
            this.asciiArmoredPgpPublicKey = Codegen.ofNullable(asciiArmoredPgpPublicKey);
            return this;
        }
        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }
        public Builder comment(@Nullable String comment) {
            this.comment = Codegen.ofNullable(comment);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder pkixPublicKey(@Nullable Output<PkixPublicKeyArgs> pkixPublicKey) {
            this.pkixPublicKey = pkixPublicKey;
            return this;
        }
        public Builder pkixPublicKey(@Nullable PkixPublicKeyArgs pkixPublicKey) {
            this.pkixPublicKey = Codegen.ofNullable(pkixPublicKey);
            return this;
        }        public AttestorPublicKeyArgs build() {
            return new AttestorPublicKeyArgs(asciiArmoredPgpPublicKey, comment, id, pkixPublicKey);
        }
    }
}
