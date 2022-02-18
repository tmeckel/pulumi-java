// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class SslCertificateManagedSslCertificateResponse {
    /**
     * [Output only] Detailed statuses of the domains specified for managed certificate resource.
     * 
     */
    private final Map<String,String> domainStatus;
    /**
     * The domains for which a managed SSL certificate will be generated. Each Google-managed SSL certificate supports up to the [maximum number of domains per Google-managed SSL certificate](/load-balancing/docs/quotas#ssl_certificates).
     * 
     */
    private final List<String> domains;
    /**
     * [Output only] Status of the managed certificate resource.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"domainStatus","domains","status"})
    private SslCertificateManagedSslCertificateResponse(
        Map<String,String> domainStatus,
        List<String> domains,
        String status) {
        this.domainStatus = Objects.requireNonNull(domainStatus);
        this.domains = Objects.requireNonNull(domains);
        this.status = Objects.requireNonNull(status);
    }

    /**
     * [Output only] Detailed statuses of the domains specified for managed certificate resource.
     * 
     */
    public Map<String,String> getDomainStatus() {
        return this.domainStatus;
    }
    /**
     * The domains for which a managed SSL certificate will be generated. Each Google-managed SSL certificate supports up to the [maximum number of domains per Google-managed SSL certificate](/load-balancing/docs/quotas#ssl_certificates).
     * 
     */
    public List<String> getDomains() {
        return this.domains;
    }
    /**
     * [Output only] Status of the managed certificate resource.
     * 
     */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslCertificateManagedSslCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> domainStatus;
        private List<String> domains;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(SslCertificateManagedSslCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainStatus = defaults.domainStatus;
    	      this.domains = defaults.domains;
    	      this.status = defaults.status;
        }

        public Builder setDomainStatus(Map<String,String> domainStatus) {
            this.domainStatus = Objects.requireNonNull(domainStatus);
            return this;
        }

        public Builder setDomains(List<String> domains) {
            this.domains = Objects.requireNonNull(domains);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public SslCertificateManagedSslCertificateResponse build() {
            return new SslCertificateManagedSslCertificateResponse(domainStatus, domains, status);
        }
    }
}
