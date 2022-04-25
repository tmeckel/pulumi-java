// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudiot_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudiot_v1.inputs.X509CertificateDetailsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A public key certificate format and data.
 * 
 */
public final class PublicKeyCertificateResponse extends com.pulumi.resources.InvokeArgs {

    public static final PublicKeyCertificateResponse Empty = new PublicKeyCertificateResponse();

    /**
     * The certificate data.
     * 
     */
    @Import(name="certificate", required=true)
    private String certificate;

    /**
     * @return The certificate data.
     * 
     */
    public String certificate() {
        return this.certificate;
    }

    /**
     * The certificate format.
     * 
     */
    @Import(name="format", required=true)
    private String format;

    /**
     * @return The certificate format.
     * 
     */
    public String format() {
        return this.format;
    }

    /**
     * [Output only] The certificate details. Used only for X.509 certificates.
     * 
     */
    @Import(name="x509Details", required=true)
    private X509CertificateDetailsResponse x509Details;

    /**
     * @return [Output only] The certificate details. Used only for X.509 certificates.
     * 
     */
    public X509CertificateDetailsResponse x509Details() {
        return this.x509Details;
    }

    private PublicKeyCertificateResponse() {}

    private PublicKeyCertificateResponse(PublicKeyCertificateResponse $) {
        this.certificate = $.certificate;
        this.format = $.format;
        this.x509Details = $.x509Details;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublicKeyCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicKeyCertificateResponse $;

        public Builder() {
            $ = new PublicKeyCertificateResponse();
        }

        public Builder(PublicKeyCertificateResponse defaults) {
            $ = new PublicKeyCertificateResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate The certificate data.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param format The certificate format.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            $.format = format;
            return this;
        }

        /**
         * @param x509Details [Output only] The certificate details. Used only for X.509 certificates.
         * 
         * @return builder
         * 
         */
        public Builder x509Details(X509CertificateDetailsResponse x509Details) {
            $.x509Details = x509Details;
            return this;
        }

        public PublicKeyCertificateResponse build() {
            $.certificate = Objects.requireNonNull($.certificate, "expected parameter 'certificate' to be non-null");
            $.format = Objects.requireNonNull($.format, "expected parameter 'format' to be non-null");
            $.x509Details = Objects.requireNonNull($.x509Details, "expected parameter 'x509Details' to be non-null");
            return $;
        }
    }

}
