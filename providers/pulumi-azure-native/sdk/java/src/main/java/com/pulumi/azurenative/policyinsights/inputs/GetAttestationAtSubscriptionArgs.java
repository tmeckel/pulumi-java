// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.policyinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAttestationAtSubscriptionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAttestationAtSubscriptionArgs Empty = new GetAttestationAtSubscriptionArgs();

    /**
     * The name of the attestation.
     * 
     */
    @Import(name="attestationName", required=true)
    private String attestationName;

    /**
     * @return The name of the attestation.
     * 
     */
    public String attestationName() {
        return this.attestationName;
    }

    private GetAttestationAtSubscriptionArgs() {}

    private GetAttestationAtSubscriptionArgs(GetAttestationAtSubscriptionArgs $) {
        this.attestationName = $.attestationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAttestationAtSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAttestationAtSubscriptionArgs $;

        public Builder() {
            $ = new GetAttestationAtSubscriptionArgs();
        }

        public Builder(GetAttestationAtSubscriptionArgs defaults) {
            $ = new GetAttestationAtSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attestationName The name of the attestation.
         * 
         * @return builder
         * 
         */
        public Builder attestationName(String attestationName) {
            $.attestationName = attestationName;
            return this;
        }

        public GetAttestationAtSubscriptionArgs build() {
            $.attestationName = Objects.requireNonNull($.attestationName, "expected parameter 'attestationName' to be non-null");
            return $;
        }
    }

}
