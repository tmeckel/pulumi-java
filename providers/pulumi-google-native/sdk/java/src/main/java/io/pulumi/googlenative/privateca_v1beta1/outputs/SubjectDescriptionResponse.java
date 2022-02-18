// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.privateca_v1beta1.outputs.SubjectAltNamesResponse;
import io.pulumi.googlenative.privateca_v1beta1.outputs.SubjectResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SubjectDescriptionResponse {
    /**
     * The "common name" of the distinguished name.
     * 
     */
    private final String commonName;
    /**
     * The serial number encoded in lowercase hexadecimal.
     * 
     */
    private final String hexSerialNumber;
    /**
     * For convenience, the actual lifetime of an issued certificate. Corresponds to 'not_after_time' - 'not_before_time'.
     * 
     */
    private final String lifetime;
    /**
     * The time at which the certificate expires.
     * 
     */
    private final String notAfterTime;
    /**
     * The time at which the certificate becomes valid.
     * 
     */
    private final String notBeforeTime;
    /**
     * Contains distinguished name fields such as the location and organization.
     * 
     */
    private final SubjectResponse subject;
    /**
     * The subject alternative name fields.
     * 
     */
    private final SubjectAltNamesResponse subjectAltName;

    @OutputCustomType.Constructor({"commonName","hexSerialNumber","lifetime","notAfterTime","notBeforeTime","subject","subjectAltName"})
    private SubjectDescriptionResponse(
        String commonName,
        String hexSerialNumber,
        String lifetime,
        String notAfterTime,
        String notBeforeTime,
        SubjectResponse subject,
        SubjectAltNamesResponse subjectAltName) {
        this.commonName = Objects.requireNonNull(commonName);
        this.hexSerialNumber = Objects.requireNonNull(hexSerialNumber);
        this.lifetime = Objects.requireNonNull(lifetime);
        this.notAfterTime = Objects.requireNonNull(notAfterTime);
        this.notBeforeTime = Objects.requireNonNull(notBeforeTime);
        this.subject = Objects.requireNonNull(subject);
        this.subjectAltName = Objects.requireNonNull(subjectAltName);
    }

    /**
     * The "common name" of the distinguished name.
     * 
     */
    public String getCommonName() {
        return this.commonName;
    }
    /**
     * The serial number encoded in lowercase hexadecimal.
     * 
     */
    public String getHexSerialNumber() {
        return this.hexSerialNumber;
    }
    /**
     * For convenience, the actual lifetime of an issued certificate. Corresponds to 'not_after_time' - 'not_before_time'.
     * 
     */
    public String getLifetime() {
        return this.lifetime;
    }
    /**
     * The time at which the certificate expires.
     * 
     */
    public String getNotAfterTime() {
        return this.notAfterTime;
    }
    /**
     * The time at which the certificate becomes valid.
     * 
     */
    public String getNotBeforeTime() {
        return this.notBeforeTime;
    }
    /**
     * Contains distinguished name fields such as the location and organization.
     * 
     */
    public SubjectResponse getSubject() {
        return this.subject;
    }
    /**
     * The subject alternative name fields.
     * 
     */
    public SubjectAltNamesResponse getSubjectAltName() {
        return this.subjectAltName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commonName;
        private String hexSerialNumber;
        private String lifetime;
        private String notAfterTime;
        private String notBeforeTime;
        private SubjectResponse subject;
        private SubjectAltNamesResponse subjectAltName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonName = defaults.commonName;
    	      this.hexSerialNumber = defaults.hexSerialNumber;
    	      this.lifetime = defaults.lifetime;
    	      this.notAfterTime = defaults.notAfterTime;
    	      this.notBeforeTime = defaults.notBeforeTime;
    	      this.subject = defaults.subject;
    	      this.subjectAltName = defaults.subjectAltName;
        }

        public Builder setCommonName(String commonName) {
            this.commonName = Objects.requireNonNull(commonName);
            return this;
        }

        public Builder setHexSerialNumber(String hexSerialNumber) {
            this.hexSerialNumber = Objects.requireNonNull(hexSerialNumber);
            return this;
        }

        public Builder setLifetime(String lifetime) {
            this.lifetime = Objects.requireNonNull(lifetime);
            return this;
        }

        public Builder setNotAfterTime(String notAfterTime) {
            this.notAfterTime = Objects.requireNonNull(notAfterTime);
            return this;
        }

        public Builder setNotBeforeTime(String notBeforeTime) {
            this.notBeforeTime = Objects.requireNonNull(notBeforeTime);
            return this;
        }

        public Builder setSubject(SubjectResponse subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }

        public Builder setSubjectAltName(SubjectAltNamesResponse subjectAltName) {
            this.subjectAltName = Objects.requireNonNull(subjectAltName);
            return this;
        }

        public SubjectDescriptionResponse build() {
            return new SubjectDescriptionResponse(commonName, hexSerialNumber, lifetime, notAfterTime, notBeforeTime, subject, subjectAltName);
        }
    }
}
