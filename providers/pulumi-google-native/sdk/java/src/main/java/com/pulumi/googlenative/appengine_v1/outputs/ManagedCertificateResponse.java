// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedCertificateResponse {
    /**
     * @return Time at which the certificate was last renewed. The renewal process is fully managed. Certificate renewal will automatically occur before the certificate expires. Renewal errors can be tracked via ManagementStatus.
     * 
     */
    private final String lastRenewalTime;
    /**
     * @return Status of certificate management. Refers to the most recent certificate acquisition or renewal attempt.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private ManagedCertificateResponse(
        @CustomType.Parameter("lastRenewalTime") String lastRenewalTime,
        @CustomType.Parameter("status") String status) {
        this.lastRenewalTime = lastRenewalTime;
        this.status = status;
    }

    /**
     * @return Time at which the certificate was last renewed. The renewal process is fully managed. Certificate renewal will automatically occur before the certificate expires. Renewal errors can be tracked via ManagementStatus.
     * 
     */
    public String lastRenewalTime() {
        return this.lastRenewalTime;
    }
    /**
     * @return Status of certificate management. Refers to the most recent certificate acquisition or renewal attempt.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastRenewalTime;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastRenewalTime = defaults.lastRenewalTime;
    	      this.status = defaults.status;
        }

        public Builder lastRenewalTime(String lastRenewalTime) {
            this.lastRenewalTime = Objects.requireNonNull(lastRenewalTime);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public ManagedCertificateResponse build() {
            return new ManagedCertificateResponse(lastRenewalTime, status);
        }
    }
}
