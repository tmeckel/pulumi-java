// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudiot_v1.inputs.X509CertificateDetailsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A public key certificate format and data.
 * 
 */
public final class PublicKeyCertificateResponse extends io.pulumi.resources.InvokeArgs {

    public static final PublicKeyCertificateResponse Empty = new PublicKeyCertificateResponse();

    /**
     * The certificate data.
     * 
     */
    @InputImport(name="certificate", required=true)
    private final String certificate;

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * The certificate format.
     * 
     */
    @InputImport(name="format", required=true)
    private final String format;

    public String getFormat() {
        return this.format;
    }

    /**
     * [Output only] The certificate details. Used only for X.509 certificates.
     * 
     */
    @InputImport(name="x509Details", required=true)
    private final X509CertificateDetailsResponse x509Details;

    public X509CertificateDetailsResponse getX509Details() {
        return this.x509Details;
    }

    public PublicKeyCertificateResponse(
        String certificate,
        String format,
        X509CertificateDetailsResponse x509Details) {
        this.certificate = Objects.requireNonNull(certificate, "expected parameter 'certificate' to be non-null");
        this.format = Objects.requireNonNull(format, "expected parameter 'format' to be non-null");
        this.x509Details = Objects.requireNonNull(x509Details, "expected parameter 'x509Details' to be non-null");
    }

    private PublicKeyCertificateResponse() {
        this.certificate = null;
        this.format = null;
        this.x509Details = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicKeyCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificate;
        private String format;
        private X509CertificateDetailsResponse x509Details;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicKeyCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.format = defaults.format;
    	      this.x509Details = defaults.x509Details;
        }

        public Builder setCertificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder setFormat(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder setX509Details(X509CertificateDetailsResponse x509Details) {
            this.x509Details = Objects.requireNonNull(x509Details);
            return this;
        }

        public PublicKeyCertificateResponse build() {
            return new PublicKeyCertificateResponse(certificate, format, x509Details);
        }
    }
}
