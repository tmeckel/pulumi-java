// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.AS2OneWayAgreementResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class AS2AgreementContentResponse {
    /**
     * The AS2 one-way receive agreement.
     * 
     */
    private final AS2OneWayAgreementResponse receiveAgreement;
    /**
     * The AS2 one-way send agreement.
     * 
     */
    private final AS2OneWayAgreementResponse sendAgreement;

    @OutputCustomType.Constructor
    private AS2AgreementContentResponse(
        @OutputCustomType.Parameter("receiveAgreement") AS2OneWayAgreementResponse receiveAgreement,
        @OutputCustomType.Parameter("sendAgreement") AS2OneWayAgreementResponse sendAgreement) {
        this.receiveAgreement = receiveAgreement;
        this.sendAgreement = sendAgreement;
    }

    /**
     * The AS2 one-way receive agreement.
     * 
    */
    public AS2OneWayAgreementResponse getReceiveAgreement() {
        return this.receiveAgreement;
    }
    /**
     * The AS2 one-way send agreement.
     * 
    */
    public AS2OneWayAgreementResponse getSendAgreement() {
        return this.sendAgreement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2AgreementContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AS2OneWayAgreementResponse receiveAgreement;
        private AS2OneWayAgreementResponse sendAgreement;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2AgreementContentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.receiveAgreement = defaults.receiveAgreement;
    	      this.sendAgreement = defaults.sendAgreement;
        }

        public Builder receiveAgreement(AS2OneWayAgreementResponse receiveAgreement) {
            this.receiveAgreement = Objects.requireNonNull(receiveAgreement);
            return this;
        }

        public Builder sendAgreement(AS2OneWayAgreementResponse sendAgreement) {
            this.sendAgreement = Objects.requireNonNull(sendAgreement);
            return this;
        }
        public AS2AgreementContentResponse build() {
            return new AS2AgreementContentResponse(receiveAgreement, sendAgreement);
        }
    }
}
