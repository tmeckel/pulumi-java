// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networksecurity_v1beta1.inputs.ValidationCAResponse;
import java.util.List;
import java.util.Objects;


/**
 * Specification of the MTLSPolicy.
 * 
 */
public final class MTLSPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final MTLSPolicyResponse Empty = new MTLSPolicyResponse();

    /**
     *  Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
     * 
     */
    @Import(name="clientValidationCa", required=true)
    private List<ValidationCAResponse> clientValidationCa;

    /**
     * @return  Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
     * 
     */
    public List<ValidationCAResponse> clientValidationCa() {
        return this.clientValidationCa;
    }

    private MTLSPolicyResponse() {}

    private MTLSPolicyResponse(MTLSPolicyResponse $) {
        this.clientValidationCa = $.clientValidationCa;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MTLSPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MTLSPolicyResponse $;

        public Builder() {
            $ = new MTLSPolicyResponse();
        }

        public Builder(MTLSPolicyResponse defaults) {
            $ = new MTLSPolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientValidationCa  Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
         * 
         * @return builder
         * 
         */
        public Builder clientValidationCa(List<ValidationCAResponse> clientValidationCa) {
            $.clientValidationCa = clientValidationCa;
            return this;
        }

        /**
         * @param clientValidationCa  Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
         * 
         * @return builder
         * 
         */
        public Builder clientValidationCa(ValidationCAResponse... clientValidationCa) {
            return clientValidationCa(List.of(clientValidationCa));
        }

        public MTLSPolicyResponse build() {
            $.clientValidationCa = Objects.requireNonNull($.clientValidationCa, "expected parameter 'clientValidationCa' to be non-null");
            return $;
        }
    }

}
