// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InterconnectCircuitInfoResponse {
    /**
     * @return Customer-side demarc ID for this circuit.
     * 
     */
    private final String customerDemarcId;
    /**
     * @return Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
     * 
     */
    private final String googleCircuitId;
    /**
     * @return Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
     * 
     */
    private final String googleDemarcId;

    @CustomType.Constructor
    private InterconnectCircuitInfoResponse(
        @CustomType.Parameter("customerDemarcId") String customerDemarcId,
        @CustomType.Parameter("googleCircuitId") String googleCircuitId,
        @CustomType.Parameter("googleDemarcId") String googleDemarcId) {
        this.customerDemarcId = customerDemarcId;
        this.googleCircuitId = googleCircuitId;
        this.googleDemarcId = googleDemarcId;
    }

    /**
     * @return Customer-side demarc ID for this circuit.
     * 
     */
    public String customerDemarcId() {
        return this.customerDemarcId;
    }
    /**
     * @return Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
     * 
     */
    public String googleCircuitId() {
        return this.googleCircuitId;
    }
    /**
     * @return Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
     * 
     */
    public String googleDemarcId() {
        return this.googleDemarcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectCircuitInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customerDemarcId;
        private String googleCircuitId;
        private String googleDemarcId;

        public Builder() {
    	      // Empty
        }

        public Builder(InterconnectCircuitInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerDemarcId = defaults.customerDemarcId;
    	      this.googleCircuitId = defaults.googleCircuitId;
    	      this.googleDemarcId = defaults.googleDemarcId;
        }

        public Builder customerDemarcId(String customerDemarcId) {
            this.customerDemarcId = Objects.requireNonNull(customerDemarcId);
            return this;
        }
        public Builder googleCircuitId(String googleCircuitId) {
            this.googleCircuitId = Objects.requireNonNull(googleCircuitId);
            return this;
        }
        public Builder googleDemarcId(String googleDemarcId) {
            this.googleDemarcId = Objects.requireNonNull(googleDemarcId);
            return this;
        }        public InterconnectCircuitInfoResponse build() {
            return new InterconnectCircuitInfoResponse(customerDemarcId, googleCircuitId, googleDemarcId);
        }
    }
}
