// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AccessUrlsResponse {
    /**
     * The URL where this CertificateAuthority's CA certificate is published. This will only be set for CAs that have been activated.
     * 
     */
    private final String caCertificateAccessUrl;
    /**
     * The URL where this CertificateAuthority's CRLs are published. This will only be set for CAs that have been activated.
     * 
     */
    private final String crlAccessUrl;

    @OutputCustomType.Constructor({"caCertificateAccessUrl","crlAccessUrl"})
    private AccessUrlsResponse(
        String caCertificateAccessUrl,
        String crlAccessUrl) {
        this.caCertificateAccessUrl = Objects.requireNonNull(caCertificateAccessUrl);
        this.crlAccessUrl = Objects.requireNonNull(crlAccessUrl);
    }

    /**
     * The URL where this CertificateAuthority's CA certificate is published. This will only be set for CAs that have been activated.
     * 
     */
    public String getCaCertificateAccessUrl() {
        return this.caCertificateAccessUrl;
    }
    /**
     * The URL where this CertificateAuthority's CRLs are published. This will only be set for CAs that have been activated.
     * 
     */
    public String getCrlAccessUrl() {
        return this.crlAccessUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessUrlsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String caCertificateAccessUrl;
        private String crlAccessUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessUrlsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificateAccessUrl = defaults.caCertificateAccessUrl;
    	      this.crlAccessUrl = defaults.crlAccessUrl;
        }

        public Builder setCaCertificateAccessUrl(String caCertificateAccessUrl) {
            this.caCertificateAccessUrl = Objects.requireNonNull(caCertificateAccessUrl);
            return this;
        }

        public Builder setCrlAccessUrl(String crlAccessUrl) {
            this.crlAccessUrl = Objects.requireNonNull(crlAccessUrl);
            return this;
        }

        public AccessUrlsResponse build() {
            return new AccessUrlsResponse(caCertificateAccessUrl, crlAccessUrl);
        }
    }
}
