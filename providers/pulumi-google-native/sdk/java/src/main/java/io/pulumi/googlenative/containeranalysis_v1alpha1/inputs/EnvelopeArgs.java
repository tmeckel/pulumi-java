// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.EnvelopeSignatureArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MUST match https://github.com/secure-systems-lab/dsse/blob/master/envelope.proto. An authenticated message of arbitrary type.
 * 
 */
public final class EnvelopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvelopeArgs Empty = new EnvelopeArgs();

    /**
     * The bytes being signed
     * 
     */
    @InputImport(name="payload")
      private final @Nullable Input<String> payload;

    public Input<String> getPayload() {
        return this.payload == null ? Input.empty() : this.payload;
    }

    /**
     * The type of payload being signed
     * 
     */
    @InputImport(name="payloadType")
      private final @Nullable Input<String> payloadType;

    public Input<String> getPayloadType() {
        return this.payloadType == null ? Input.empty() : this.payloadType;
    }

    /**
     * The signatures over the payload
     * 
     */
    @InputImport(name="signatures")
      private final @Nullable Input<List<EnvelopeSignatureArgs>> signatures;

    public Input<List<EnvelopeSignatureArgs>> getSignatures() {
        return this.signatures == null ? Input.empty() : this.signatures;
    }

    public EnvelopeArgs(
        @Nullable Input<String> payload,
        @Nullable Input<String> payloadType,
        @Nullable Input<List<EnvelopeSignatureArgs>> signatures) {
        this.payload = payload;
        this.payloadType = payloadType;
        this.signatures = signatures;
    }

    private EnvelopeArgs() {
        this.payload = Input.empty();
        this.payloadType = Input.empty();
        this.signatures = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvelopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> payload;
        private @Nullable Input<String> payloadType;
        private @Nullable Input<List<EnvelopeSignatureArgs>> signatures;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvelopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payload = defaults.payload;
    	      this.payloadType = defaults.payloadType;
    	      this.signatures = defaults.signatures;
        }

        public Builder payload(@Nullable Input<String> payload) {
            this.payload = payload;
            return this;
        }

        public Builder payload(@Nullable String payload) {
            this.payload = Input.ofNullable(payload);
            return this;
        }

        public Builder payloadType(@Nullable Input<String> payloadType) {
            this.payloadType = payloadType;
            return this;
        }

        public Builder payloadType(@Nullable String payloadType) {
            this.payloadType = Input.ofNullable(payloadType);
            return this;
        }

        public Builder signatures(@Nullable Input<List<EnvelopeSignatureArgs>> signatures) {
            this.signatures = signatures;
            return this;
        }

        public Builder signatures(@Nullable List<EnvelopeSignatureArgs> signatures) {
            this.signatures = Input.ofNullable(signatures);
            return this;
        }
        public EnvelopeArgs build() {
            return new EnvelopeArgs(payload, payloadType, signatures);
        }
    }
}
