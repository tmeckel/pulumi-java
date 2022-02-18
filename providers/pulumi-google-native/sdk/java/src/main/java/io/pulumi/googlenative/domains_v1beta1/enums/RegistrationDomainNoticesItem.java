// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1beta1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum RegistrationDomainNoticesItem {
        /**
         * The notice is undefined.
         * 
         */
        DomainNoticeUnspecified("DOMAIN_NOTICE_UNSPECIFIED"),
        /**
         * Indicates that the domain is preloaded on the HTTP Strict Transport Security list in browsers. Serving a website on such domain requires an SSL certificate. For details, see [how to get an SSL certificate](https://support.google.com/domains/answer/7638036).
         * 
         */
        HstsPreloaded("HSTS_PRELOADED");

        private final String value;

        RegistrationDomainNoticesItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RegistrationDomainNoticesItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
