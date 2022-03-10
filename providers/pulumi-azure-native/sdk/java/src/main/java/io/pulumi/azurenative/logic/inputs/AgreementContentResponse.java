// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.AS2AgreementContentResponse;
import io.pulumi.azurenative.logic.inputs.EdifactAgreementContentResponse;
import io.pulumi.azurenative.logic.inputs.X12AgreementContentResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The integration account agreement content.
 * 
 */
public final class AgreementContentResponse extends io.pulumi.resources.InvokeArgs {

    public static final AgreementContentResponse Empty = new AgreementContentResponse();

    /**
     * The AS2 agreement content.
     * 
     */
    @InputImport(name="aS2")
      private final @Nullable AS2AgreementContentResponse aS2;

    public Optional<AS2AgreementContentResponse> getAS2() {
        return this.aS2 == null ? Optional.empty() : Optional.ofNullable(this.aS2);
    }

    /**
     * The EDIFACT agreement content.
     * 
     */
    @InputImport(name="edifact")
      private final @Nullable EdifactAgreementContentResponse edifact;

    public Optional<EdifactAgreementContentResponse> getEdifact() {
        return this.edifact == null ? Optional.empty() : Optional.ofNullable(this.edifact);
    }

    /**
     * The X12 agreement content.
     * 
     */
    @InputImport(name="x12")
      private final @Nullable X12AgreementContentResponse x12;

    public Optional<X12AgreementContentResponse> getX12() {
        return this.x12 == null ? Optional.empty() : Optional.ofNullable(this.x12);
    }

    public AgreementContentResponse(
        @Nullable AS2AgreementContentResponse aS2,
        @Nullable EdifactAgreementContentResponse edifact,
        @Nullable X12AgreementContentResponse x12) {
        this.aS2 = aS2;
        this.edifact = edifact;
        this.x12 = x12;
    }

    private AgreementContentResponse() {
        this.aS2 = null;
        this.edifact = null;
        this.x12 = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgreementContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AS2AgreementContentResponse aS2;
        private @Nullable EdifactAgreementContentResponse edifact;
        private @Nullable X12AgreementContentResponse x12;

        public Builder() {
    	      // Empty
        }

        public Builder(AgreementContentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aS2 = defaults.aS2;
    	      this.edifact = defaults.edifact;
    	      this.x12 = defaults.x12;
        }

        public Builder aS2(@Nullable AS2AgreementContentResponse aS2) {
            this.aS2 = aS2;
            return this;
        }

        public Builder edifact(@Nullable EdifactAgreementContentResponse edifact) {
            this.edifact = edifact;
            return this;
        }

        public Builder x12(@Nullable X12AgreementContentResponse x12) {
            this.x12 = x12;
            return this;
        }
        public AgreementContentResponse build() {
            return new AgreementContentResponse(aS2, edifact, x12);
        }
    }
}
