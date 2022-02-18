// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1beta1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. Privacy setting for the contacts associated with the `Registration`.
     * 
     */
    @EnumType
    public enum ContactSettingsPrivacy {
        /**
         * The contact privacy settings are undefined.
         * 
         */
        ContactPrivacyUnspecified("CONTACT_PRIVACY_UNSPECIFIED"),
        /**
         * All the data from `ContactSettings` is publicly available. When setting this option, you must also provide a `PUBLIC_CONTACT_DATA_ACKNOWLEDGEMENT` in the `contact_notices` field of the request.
         * 
         */
        PublicContactData("PUBLIC_CONTACT_DATA"),
        /**
         * None of the data from `ContactSettings` is publicly available. Instead, proxy contact data is published for your domain. Email sent to the proxy email address is forwarded to the registrant's email address. Cloud Domains provides this privacy proxy service at no additional cost.
         * 
         */
        PrivateContactData("PRIVATE_CONTACT_DATA"),
        /**
         * Some data from `ContactSettings` is publicly available. The actual information redacted depends on the domain. For details, see [the registration privacy article](https://support.google.com/domains/answer/3251242).
         * 
         */
        RedactedContactData("REDACTED_CONTACT_DATA");

        private final String value;

        ContactSettingsPrivacy(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ContactSettingsPrivacy[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
