// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.azurenative.logic.outputs.BusinessIdentityResponse;
import com.pulumi.azurenative.logic.outputs.X12ProtocolSettingsResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class X12OneWayAgreementResponse {
    /**
     * @return The X12 protocol settings.
     * 
     */
    private final X12ProtocolSettingsResponse protocolSettings;
    /**
     * @return The receiver business identity
     * 
     */
    private final BusinessIdentityResponse receiverBusinessIdentity;
    /**
     * @return The sender business identity
     * 
     */
    private final BusinessIdentityResponse senderBusinessIdentity;

    @CustomType.Constructor
    private X12OneWayAgreementResponse(
        @CustomType.Parameter("protocolSettings") X12ProtocolSettingsResponse protocolSettings,
        @CustomType.Parameter("receiverBusinessIdentity") BusinessIdentityResponse receiverBusinessIdentity,
        @CustomType.Parameter("senderBusinessIdentity") BusinessIdentityResponse senderBusinessIdentity) {
        this.protocolSettings = protocolSettings;
        this.receiverBusinessIdentity = receiverBusinessIdentity;
        this.senderBusinessIdentity = senderBusinessIdentity;
    }

    /**
     * @return The X12 protocol settings.
     * 
     */
    public X12ProtocolSettingsResponse protocolSettings() {
        return this.protocolSettings;
    }
    /**
     * @return The receiver business identity
     * 
     */
    public BusinessIdentityResponse receiverBusinessIdentity() {
        return this.receiverBusinessIdentity;
    }
    /**
     * @return The sender business identity
     * 
     */
    public BusinessIdentityResponse senderBusinessIdentity() {
        return this.senderBusinessIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12OneWayAgreementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12ProtocolSettingsResponse protocolSettings;
        private BusinessIdentityResponse receiverBusinessIdentity;
        private BusinessIdentityResponse senderBusinessIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(X12OneWayAgreementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocolSettings = defaults.protocolSettings;
    	      this.receiverBusinessIdentity = defaults.receiverBusinessIdentity;
    	      this.senderBusinessIdentity = defaults.senderBusinessIdentity;
        }

        public Builder protocolSettings(X12ProtocolSettingsResponse protocolSettings) {
            this.protocolSettings = Objects.requireNonNull(protocolSettings);
            return this;
        }
        public Builder receiverBusinessIdentity(BusinessIdentityResponse receiverBusinessIdentity) {
            this.receiverBusinessIdentity = Objects.requireNonNull(receiverBusinessIdentity);
            return this;
        }
        public Builder senderBusinessIdentity(BusinessIdentityResponse senderBusinessIdentity) {
            this.senderBusinessIdentity = Objects.requireNonNull(senderBusinessIdentity);
            return this;
        }        public X12OneWayAgreementResponse build() {
            return new X12OneWayAgreementResponse(protocolSettings, receiverBusinessIdentity, senderBusinessIdentity);
        }
    }
}
