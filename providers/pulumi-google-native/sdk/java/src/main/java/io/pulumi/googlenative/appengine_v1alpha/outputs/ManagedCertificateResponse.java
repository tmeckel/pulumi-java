// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ManagedCertificateResponse {
    /**
     * Time at which the certificate was last renewed. The renewal process is fully managed. Certificate renewal will automatically occur before the certificate expires. Renewal errors can be tracked via ManagementStatus.
     * 
     */
    private final String lastRenewalTime;
    /**
     * Status of certificate management. Refers to the most recent certificate acquisition or renewal attempt.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"lastRenewalTime","status"})
    private ManagedCertificateResponse(
        String lastRenewalTime,
        String status) {
        this.lastRenewalTime = Objects.requireNonNull(lastRenewalTime);
        this.status = Objects.requireNonNull(status);
    }

    /**
     * Time at which the certificate was last renewed. The renewal process is fully managed. Certificate renewal will automatically occur before the certificate expires. Renewal errors can be tracked via ManagementStatus.
     * 
     */
    public String getLastRenewalTime() {
        return this.lastRenewalTime;
    }
    /**
     * Status of certificate management. Refers to the most recent certificate acquisition or renewal attempt.
     * 
     */
    public String getStatus() {
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

        public Builder setLastRenewalTime(String lastRenewalTime) {
            this.lastRenewalTime = Objects.requireNonNull(lastRenewalTime);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public ManagedCertificateResponse build() {
            return new ManagedCertificateResponse(lastRenewalTime, status);
        }
    }
}
