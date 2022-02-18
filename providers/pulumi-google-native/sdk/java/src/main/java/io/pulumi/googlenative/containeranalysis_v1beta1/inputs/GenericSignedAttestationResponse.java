// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.SignatureResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An attestation wrapper that uses the Grafeas `Signature` message. This attestation must define the `serialized_payload` that the `signatures` verify and any metadata necessary to interpret that plaintext. The signatures should always be over the `serialized_payload` bytestring.
 * 
 */
public final class GenericSignedAttestationResponse extends io.pulumi.resources.InvokeArgs {

    public static final GenericSignedAttestationResponse Empty = new GenericSignedAttestationResponse();

    /**
     * Type (for example schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation payload is a valid instantiation of that type (for example by validating a JSON schema).
     * 
     */
    @InputImport(name="contentType", required=true)
    private final String contentType;

    public String getContentType() {
        return this.contentType;
    }

    /**
     * The serialized payload that is verified by one or more `signatures`. The encoding and semantic meaning of this payload must match what is set in `content_type`.
     * 
     */
    @InputImport(name="serializedPayload", required=true)
    private final String serializedPayload;

    public String getSerializedPayload() {
        return this.serializedPayload;
    }

    /**
     * One or more signatures over `serialized_payload`. Verifier implementations should consider this attestation message verified if at least one `signature` verifies `serialized_payload`. See `Signature` in common.proto for more details on signature structure and verification.
     * 
     */
    @InputImport(name="signatures", required=true)
    private final List<SignatureResponse> signatures;

    public List<SignatureResponse> getSignatures() {
        return this.signatures;
    }

    public GenericSignedAttestationResponse(
        String contentType,
        String serializedPayload,
        List<SignatureResponse> signatures) {
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.serializedPayload = Objects.requireNonNull(serializedPayload, "expected parameter 'serializedPayload' to be non-null");
        this.signatures = Objects.requireNonNull(signatures, "expected parameter 'signatures' to be non-null");
    }

    private GenericSignedAttestationResponse() {
        this.contentType = null;
        this.serializedPayload = null;
        this.signatures = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GenericSignedAttestationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentType;
        private String serializedPayload;
        private List<SignatureResponse> signatures;

        public Builder() {
    	      // Empty
        }

        public Builder(GenericSignedAttestationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.serializedPayload = defaults.serializedPayload;
    	      this.signatures = defaults.signatures;
        }

        public Builder setContentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder setSerializedPayload(String serializedPayload) {
            this.serializedPayload = Objects.requireNonNull(serializedPayload);
            return this;
        }

        public Builder setSignatures(List<SignatureResponse> signatures) {
            this.signatures = Objects.requireNonNull(signatures);
            return this;
        }

        public GenericSignedAttestationResponse build() {
            return new GenericSignedAttestationResponse(contentType, serializedPayload, signatures);
        }
    }
}
