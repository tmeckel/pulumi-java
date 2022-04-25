// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudidentity_v1beta1.inputs.CertificateTemplateResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Stores information about a certificate.
 * 
 */
public final class CertificateAttributesResponse extends com.pulumi.resources.InvokeArgs {

    public static final CertificateAttributesResponse Empty = new CertificateAttributesResponse();

    /**
     * The X.509 extension for CertificateTemplate.
     * 
     */
    @Import(name="certificateTemplate", required=true)
    private CertificateTemplateResponse certificateTemplate;

    /**
     * @return The X.509 extension for CertificateTemplate.
     * 
     */
    public CertificateTemplateResponse certificateTemplate() {
        return this.certificateTemplate;
    }

    /**
     * The encoded certificate fingerprint.
     * 
     */
    @Import(name="fingerprint", required=true)
    private String fingerprint;

    /**
     * @return The encoded certificate fingerprint.
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }

    /**
     * The name of the issuer of this certificate.
     * 
     */
    @Import(name="issuer", required=true)
    private String issuer;

    /**
     * @return The name of the issuer of this certificate.
     * 
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Serial number of the certificate, Example: &#34;123456789&#34;.
     * 
     */
    @Import(name="serialNumber", required=true)
    private String serialNumber;

    /**
     * @return Serial number of the certificate, Example: &#34;123456789&#34;.
     * 
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * The subject name of this certificate.
     * 
     */
    @Import(name="subject", required=true)
    private String subject;

    /**
     * @return The subject name of this certificate.
     * 
     */
    public String subject() {
        return this.subject;
    }

    /**
     * The certificate thumbprint.
     * 
     */
    @Import(name="thumbprint", required=true)
    private String thumbprint;

    /**
     * @return The certificate thumbprint.
     * 
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Validation state of this certificate.
     * 
     */
    @Import(name="validationState", required=true)
    private String validationState;

    /**
     * @return Validation state of this certificate.
     * 
     */
    public String validationState() {
        return this.validationState;
    }

    /**
     * Certificate not valid at or after this timestamp.
     * 
     */
    @Import(name="validityExpirationTime", required=true)
    private String validityExpirationTime;

    /**
     * @return Certificate not valid at or after this timestamp.
     * 
     */
    public String validityExpirationTime() {
        return this.validityExpirationTime;
    }

    /**
     * Certificate not valid before this timestamp.
     * 
     */
    @Import(name="validityStartTime", required=true)
    private String validityStartTime;

    /**
     * @return Certificate not valid before this timestamp.
     * 
     */
    public String validityStartTime() {
        return this.validityStartTime;
    }

    private CertificateAttributesResponse() {}

    private CertificateAttributesResponse(CertificateAttributesResponse $) {
        this.certificateTemplate = $.certificateTemplate;
        this.fingerprint = $.fingerprint;
        this.issuer = $.issuer;
        this.serialNumber = $.serialNumber;
        this.subject = $.subject;
        this.thumbprint = $.thumbprint;
        this.validationState = $.validationState;
        this.validityExpirationTime = $.validityExpirationTime;
        this.validityStartTime = $.validityStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateAttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateAttributesResponse $;

        public Builder() {
            $ = new CertificateAttributesResponse();
        }

        public Builder(CertificateAttributesResponse defaults) {
            $ = new CertificateAttributesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateTemplate The X.509 extension for CertificateTemplate.
         * 
         * @return builder
         * 
         */
        public Builder certificateTemplate(CertificateTemplateResponse certificateTemplate) {
            $.certificateTemplate = certificateTemplate;
            return this;
        }

        /**
         * @param fingerprint The encoded certificate fingerprint.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(String fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        /**
         * @param issuer The name of the issuer of this certificate.
         * 
         * @return builder
         * 
         */
        public Builder issuer(String issuer) {
            $.issuer = issuer;
            return this;
        }

        /**
         * @param serialNumber Serial number of the certificate, Example: &#34;123456789&#34;.
         * 
         * @return builder
         * 
         */
        public Builder serialNumber(String serialNumber) {
            $.serialNumber = serialNumber;
            return this;
        }

        /**
         * @param subject The subject name of this certificate.
         * 
         * @return builder
         * 
         */
        public Builder subject(String subject) {
            $.subject = subject;
            return this;
        }

        /**
         * @param thumbprint The certificate thumbprint.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param validationState Validation state of this certificate.
         * 
         * @return builder
         * 
         */
        public Builder validationState(String validationState) {
            $.validationState = validationState;
            return this;
        }

        /**
         * @param validityExpirationTime Certificate not valid at or after this timestamp.
         * 
         * @return builder
         * 
         */
        public Builder validityExpirationTime(String validityExpirationTime) {
            $.validityExpirationTime = validityExpirationTime;
            return this;
        }

        /**
         * @param validityStartTime Certificate not valid before this timestamp.
         * 
         * @return builder
         * 
         */
        public Builder validityStartTime(String validityStartTime) {
            $.validityStartTime = validityStartTime;
            return this;
        }

        public CertificateAttributesResponse build() {
            $.certificateTemplate = Objects.requireNonNull($.certificateTemplate, "expected parameter 'certificateTemplate' to be non-null");
            $.fingerprint = Objects.requireNonNull($.fingerprint, "expected parameter 'fingerprint' to be non-null");
            $.issuer = Objects.requireNonNull($.issuer, "expected parameter 'issuer' to be non-null");
            $.serialNumber = Objects.requireNonNull($.serialNumber, "expected parameter 'serialNumber' to be non-null");
            $.subject = Objects.requireNonNull($.subject, "expected parameter 'subject' to be non-null");
            $.thumbprint = Objects.requireNonNull($.thumbprint, "expected parameter 'thumbprint' to be non-null");
            $.validationState = Objects.requireNonNull($.validationState, "expected parameter 'validationState' to be non-null");
            $.validityExpirationTime = Objects.requireNonNull($.validityExpirationTime, "expected parameter 'validityExpirationTime' to be non-null");
            $.validityStartTime = Objects.requireNonNull($.validityStartTime, "expected parameter 'validityStartTime' to be non-null");
            return $;
        }
    }

}
