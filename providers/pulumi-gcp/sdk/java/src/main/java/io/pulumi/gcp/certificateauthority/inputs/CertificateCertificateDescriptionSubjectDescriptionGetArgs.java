// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionSubjectDescriptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionSubjectDescriptionGetArgs Empty = new CertificateCertificateDescriptionSubjectDescriptionGetArgs();

    @InputImport(name="hexSerialNumber")
      private final @Nullable Input<String> hexSerialNumber;

    public Input<String> getHexSerialNumber() {
        return this.hexSerialNumber == null ? Input.empty() : this.hexSerialNumber;
    }

    /**
     * The desired lifetime of the CA certificate. Used to create the "notBeforeTime" and
     * "notAfterTime" fields inside an X.509 certificate. A duration in seconds with up to nine
     * fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @InputImport(name="lifetime")
      private final @Nullable Input<String> lifetime;

    public Input<String> getLifetime() {
        return this.lifetime == null ? Input.empty() : this.lifetime;
    }

    @InputImport(name="notAfterTime")
      private final @Nullable Input<String> notAfterTime;

    public Input<String> getNotAfterTime() {
        return this.notAfterTime == null ? Input.empty() : this.notAfterTime;
    }

    @InputImport(name="notBeforeTime")
      private final @Nullable Input<String> notBeforeTime;

    public Input<String> getNotBeforeTime() {
        return this.notBeforeTime == null ? Input.empty() : this.notBeforeTime;
    }

    /**
     * The subject alternative name fields.
     * Structure is documented below.
     * 
     */
    @InputImport(name="subjectAltNames")
      private final @Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameGetArgs>> subjectAltNames;

    public Input<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameGetArgs>> getSubjectAltNames() {
        return this.subjectAltNames == null ? Input.empty() : this.subjectAltNames;
    }

    /**
     * Contains distinguished name fields such as the location and organization.
     * Structure is documented below.
     * 
     */
    @InputImport(name="subjects")
      private final @Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionSubjectGetArgs>> subjects;

    public Input<List<CertificateCertificateDescriptionSubjectDescriptionSubjectGetArgs>> getSubjects() {
        return this.subjects == null ? Input.empty() : this.subjects;
    }

    public CertificateCertificateDescriptionSubjectDescriptionGetArgs(
        @Nullable Input<String> hexSerialNumber,
        @Nullable Input<String> lifetime,
        @Nullable Input<String> notAfterTime,
        @Nullable Input<String> notBeforeTime,
        @Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameGetArgs>> subjectAltNames,
        @Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionSubjectGetArgs>> subjects) {
        this.hexSerialNumber = hexSerialNumber;
        this.lifetime = lifetime;
        this.notAfterTime = notAfterTime;
        this.notBeforeTime = notBeforeTime;
        this.subjectAltNames = subjectAltNames;
        this.subjects = subjects;
    }

    private CertificateCertificateDescriptionSubjectDescriptionGetArgs() {
        this.hexSerialNumber = Input.empty();
        this.lifetime = Input.empty();
        this.notAfterTime = Input.empty();
        this.notBeforeTime = Input.empty();
        this.subjectAltNames = Input.empty();
        this.subjects = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionSubjectDescriptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> hexSerialNumber;
        private @Nullable Input<String> lifetime;
        private @Nullable Input<String> notAfterTime;
        private @Nullable Input<String> notBeforeTime;
        private @Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameGetArgs>> subjectAltNames;
        private @Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionSubjectGetArgs>> subjects;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionSubjectDescriptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hexSerialNumber = defaults.hexSerialNumber;
    	      this.lifetime = defaults.lifetime;
    	      this.notAfterTime = defaults.notAfterTime;
    	      this.notBeforeTime = defaults.notBeforeTime;
    	      this.subjectAltNames = defaults.subjectAltNames;
    	      this.subjects = defaults.subjects;
        }

        public Builder hexSerialNumber(@Nullable Input<String> hexSerialNumber) {
            this.hexSerialNumber = hexSerialNumber;
            return this;
        }

        public Builder hexSerialNumber(@Nullable String hexSerialNumber) {
            this.hexSerialNumber = Input.ofNullable(hexSerialNumber);
            return this;
        }

        public Builder lifetime(@Nullable Input<String> lifetime) {
            this.lifetime = lifetime;
            return this;
        }

        public Builder lifetime(@Nullable String lifetime) {
            this.lifetime = Input.ofNullable(lifetime);
            return this;
        }

        public Builder notAfterTime(@Nullable Input<String> notAfterTime) {
            this.notAfterTime = notAfterTime;
            return this;
        }

        public Builder notAfterTime(@Nullable String notAfterTime) {
            this.notAfterTime = Input.ofNullable(notAfterTime);
            return this;
        }

        public Builder notBeforeTime(@Nullable Input<String> notBeforeTime) {
            this.notBeforeTime = notBeforeTime;
            return this;
        }

        public Builder notBeforeTime(@Nullable String notBeforeTime) {
            this.notBeforeTime = Input.ofNullable(notBeforeTime);
            return this;
        }

        public Builder subjectAltNames(@Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameGetArgs>> subjectAltNames) {
            this.subjectAltNames = subjectAltNames;
            return this;
        }

        public Builder subjectAltNames(@Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameGetArgs> subjectAltNames) {
            this.subjectAltNames = Input.ofNullable(subjectAltNames);
            return this;
        }

        public Builder subjects(@Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionSubjectGetArgs>> subjects) {
            this.subjects = subjects;
            return this;
        }

        public Builder subjects(@Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectGetArgs> subjects) {
            this.subjects = Input.ofNullable(subjects);
            return this;
        }
        public CertificateCertificateDescriptionSubjectDescriptionGetArgs build() {
            return new CertificateCertificateDescriptionSubjectDescriptionGetArgs(hexSerialNumber, lifetime, notAfterTime, notBeforeTime, subjectAltNames, subjects);
        }
    }
}
