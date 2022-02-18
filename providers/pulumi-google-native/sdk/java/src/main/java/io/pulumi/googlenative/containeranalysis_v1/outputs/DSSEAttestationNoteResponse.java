// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.DSSEHintResponse;
import java.util.Objects;

@OutputCustomType
public final class DSSEAttestationNoteResponse {
    /**
     * DSSEHint hints at the purpose of the attestation authority.
     * 
     */
    private final DSSEHintResponse hint;

    @OutputCustomType.Constructor({"hint"})
    private DSSEAttestationNoteResponse(DSSEHintResponse hint) {
        this.hint = Objects.requireNonNull(hint);
    }

    /**
     * DSSEHint hints at the purpose of the attestation authority.
     * 
     */
    public DSSEHintResponse getHint() {
        return this.hint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DSSEAttestationNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DSSEHintResponse hint;

        public Builder() {
    	      // Empty
        }

        public Builder(DSSEAttestationNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hint = defaults.hint;
        }

        public Builder setHint(DSSEHintResponse hint) {
            this.hint = Objects.requireNonNull(hint);
            return this;
        }

        public DSSEAttestationNoteResponse build() {
            return new DSSEAttestationNoteResponse(hint);
        }
    }
}
