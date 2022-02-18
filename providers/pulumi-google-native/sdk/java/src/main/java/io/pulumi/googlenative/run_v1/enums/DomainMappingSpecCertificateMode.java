// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The mode of the certificate.
     * 
     */
    @EnumType
    public enum DomainMappingSpecCertificateMode {
        CertificateModeUnspecified("CERTIFICATE_MODE_UNSPECIFIED"),
        /**
         * Do not provision an HTTPS certificate.
         * 
         */
        None("NONE"),
        /**
         * Automatically provisions an HTTPS certificate via GoogleCA or LetsEncrypt.
         * 
         */
        Automatic("AUTOMATIC");

        private final String value;

        DomainMappingSpecCertificateMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DomainMappingSpecCertificateMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
