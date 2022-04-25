// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.GenericSignedAttestationResponse;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.PgpSignedAttestationResponse;
import java.util.Objects;

@CustomType
public final class AttestationResponse {
    private final GenericSignedAttestationResponse genericSignedAttestation;
    /**
     * @return A PGP signed attestation.
     * 
     */
    private final PgpSignedAttestationResponse pgpSignedAttestation;

    @CustomType.Constructor
    private AttestationResponse(
        @CustomType.Parameter("genericSignedAttestation") GenericSignedAttestationResponse genericSignedAttestation,
        @CustomType.Parameter("pgpSignedAttestation") PgpSignedAttestationResponse pgpSignedAttestation) {
        this.genericSignedAttestation = genericSignedAttestation;
        this.pgpSignedAttestation = pgpSignedAttestation;
    }

    public GenericSignedAttestationResponse genericSignedAttestation() {
        return this.genericSignedAttestation;
    }
    /**
     * @return A PGP signed attestation.
     * 
     */
    public PgpSignedAttestationResponse pgpSignedAttestation() {
        return this.pgpSignedAttestation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GenericSignedAttestationResponse genericSignedAttestation;
        private PgpSignedAttestationResponse pgpSignedAttestation;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.genericSignedAttestation = defaults.genericSignedAttestation;
    	      this.pgpSignedAttestation = defaults.pgpSignedAttestation;
        }

        public Builder genericSignedAttestation(GenericSignedAttestationResponse genericSignedAttestation) {
            this.genericSignedAttestation = Objects.requireNonNull(genericSignedAttestation);
            return this;
        }
        public Builder pgpSignedAttestation(PgpSignedAttestationResponse pgpSignedAttestation) {
            this.pgpSignedAttestation = Objects.requireNonNull(pgpSignedAttestation);
            return this;
        }        public AttestationResponse build() {
            return new AttestationResponse(genericSignedAttestation, pgpSignedAttestation);
        }
    }
}
