// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration and status of a self-managed SSL certificate.
 * 
 */
public final class SslCertificateSelfManagedSslCertificateResponse extends io.pulumi.resources.InvokeArgs {

    public static final SslCertificateSelfManagedSslCertificateResponse Empty = new SslCertificateSelfManagedSslCertificateResponse();

    /**
     * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * 
     */
    @InputImport(name="certificate", required=true)
    private final String certificate;

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * A write-only private key in PEM format. Only insert requests will include this field.
     * 
     */
    @InputImport(name="privateKey", required=true)
    private final String privateKey;

    public String getPrivateKey() {
        return this.privateKey;
    }

    public SslCertificateSelfManagedSslCertificateResponse(
        String certificate,
        String privateKey) {
        this.certificate = Objects.requireNonNull(certificate, "expected parameter 'certificate' to be non-null");
        this.privateKey = Objects.requireNonNull(privateKey, "expected parameter 'privateKey' to be non-null");
    }

    private SslCertificateSelfManagedSslCertificateResponse() {
        this.certificate = null;
        this.privateKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslCertificateSelfManagedSslCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificate;
        private String privateKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SslCertificateSelfManagedSslCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.privateKey = defaults.privateKey;
        }

        public Builder setCertificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder setPrivateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }

        public SslCertificateSelfManagedSslCertificateResponse build() {
            return new SslCertificateSelfManagedSslCertificateResponse(certificate, privateKey);
        }
    }
}
