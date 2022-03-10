// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SecurityAssessmentPartnerDataResponse {
    /**
     * Name of the company of the partner
     * 
     */
    private final String partnerName;
    /**
     * secret to authenticate the partner - write only
     * 
     */
    private final String secret;

    @OutputCustomType.Constructor
    private SecurityAssessmentPartnerDataResponse(
        @OutputCustomType.Parameter("partnerName") String partnerName,
        @OutputCustomType.Parameter("secret") String secret) {
        this.partnerName = partnerName;
        this.secret = secret;
    }

    /**
     * Name of the company of the partner
     * 
    */
    public String getPartnerName() {
        return this.partnerName;
    }
    /**
     * secret to authenticate the partner - write only
     * 
    */
    public String getSecret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityAssessmentPartnerDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String partnerName;
        private String secret;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityAssessmentPartnerDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partnerName = defaults.partnerName;
    	      this.secret = defaults.secret;
        }

        public Builder partnerName(String partnerName) {
            this.partnerName = Objects.requireNonNull(partnerName);
            return this;
        }

        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        public SecurityAssessmentPartnerDataResponse build() {
            return new SecurityAssessmentPartnerDataResponse(partnerName, secret);
        }
    }
}
