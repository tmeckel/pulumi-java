// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudidentity_v1beta1.outputs.CertificateTemplateResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CertificateAttributesResponse {
    /**
     * @return The X.509 extension for CertificateTemplate.
     * 
     */
    private final CertificateTemplateResponse certificateTemplate;
    /**
     * @return The encoded certificate fingerprint.
     * 
     */
    private final String fingerprint;
    /**
     * @return The name of the issuer of this certificate.
     * 
     */
    private final String issuer;
    /**
     * @return Serial number of the certificate, Example: &#34;123456789&#34;.
     * 
     */
    private final String serialNumber;
    /**
     * @return The subject name of this certificate.
     * 
     */
    private final String subject;
    /**
     * @return The certificate thumbprint.
     * 
     */
    private final String thumbprint;
    /**
     * @return Validation state of this certificate.
     * 
     */
    private final String validationState;
    /**
     * @return Certificate not valid at or after this timestamp.
     * 
     */
    private final String validityExpirationTime;
    /**
     * @return Certificate not valid before this timestamp.
     * 
     */
    private final String validityStartTime;

    @CustomType.Constructor
    private CertificateAttributesResponse(
        @CustomType.Parameter("certificateTemplate") CertificateTemplateResponse certificateTemplate,
        @CustomType.Parameter("fingerprint") String fingerprint,
        @CustomType.Parameter("issuer") String issuer,
        @CustomType.Parameter("serialNumber") String serialNumber,
        @CustomType.Parameter("subject") String subject,
        @CustomType.Parameter("thumbprint") String thumbprint,
        @CustomType.Parameter("validationState") String validationState,
        @CustomType.Parameter("validityExpirationTime") String validityExpirationTime,
        @CustomType.Parameter("validityStartTime") String validityStartTime) {
        this.certificateTemplate = certificateTemplate;
        this.fingerprint = fingerprint;
        this.issuer = issuer;
        this.serialNumber = serialNumber;
        this.subject = subject;
        this.thumbprint = thumbprint;
        this.validationState = validationState;
        this.validityExpirationTime = validityExpirationTime;
        this.validityStartTime = validityStartTime;
    }

    /**
     * @return The X.509 extension for CertificateTemplate.
     * 
     */
    public CertificateTemplateResponse certificateTemplate() {
        return this.certificateTemplate;
    }
    /**
     * @return The encoded certificate fingerprint.
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return The name of the issuer of this certificate.
     * 
     */
    public String issuer() {
        return this.issuer;
    }
    /**
     * @return Serial number of the certificate, Example: &#34;123456789&#34;.
     * 
     */
    public String serialNumber() {
        return this.serialNumber;
    }
    /**
     * @return The subject name of this certificate.
     * 
     */
    public String subject() {
        return this.subject;
    }
    /**
     * @return The certificate thumbprint.
     * 
     */
    public String thumbprint() {
        return this.thumbprint;
    }
    /**
     * @return Validation state of this certificate.
     * 
     */
    public String validationState() {
        return this.validationState;
    }
    /**
     * @return Certificate not valid at or after this timestamp.
     * 
     */
    public String validityExpirationTime() {
        return this.validityExpirationTime;
    }
    /**
     * @return Certificate not valid before this timestamp.
     * 
     */
    public String validityStartTime() {
        return this.validityStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateTemplateResponse certificateTemplate;
        private String fingerprint;
        private String issuer;
        private String serialNumber;
        private String subject;
        private String thumbprint;
        private String validationState;
        private String validityExpirationTime;
        private String validityStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAttributesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateTemplate = defaults.certificateTemplate;
    	      this.fingerprint = defaults.fingerprint;
    	      this.issuer = defaults.issuer;
    	      this.serialNumber = defaults.serialNumber;
    	      this.subject = defaults.subject;
    	      this.thumbprint = defaults.thumbprint;
    	      this.validationState = defaults.validationState;
    	      this.validityExpirationTime = defaults.validityExpirationTime;
    	      this.validityStartTime = defaults.validityStartTime;
        }

        public Builder certificateTemplate(CertificateTemplateResponse certificateTemplate) {
            this.certificateTemplate = Objects.requireNonNull(certificateTemplate);
            return this;
        }
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }
        public Builder subject(String subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }
        public Builder thumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }
        public Builder validationState(String validationState) {
            this.validationState = Objects.requireNonNull(validationState);
            return this;
        }
        public Builder validityExpirationTime(String validityExpirationTime) {
            this.validityExpirationTime = Objects.requireNonNull(validityExpirationTime);
            return this;
        }
        public Builder validityStartTime(String validityStartTime) {
            this.validityStartTime = Objects.requireNonNull(validityStartTime);
            return this;
        }        public CertificateAttributesResponse build() {
            return new CertificateAttributesResponse(certificateTemplate, fingerprint, issuer, serialNumber, subject, thumbprint, validationState, validityExpirationTime, validityStartTime);
        }
    }
}
