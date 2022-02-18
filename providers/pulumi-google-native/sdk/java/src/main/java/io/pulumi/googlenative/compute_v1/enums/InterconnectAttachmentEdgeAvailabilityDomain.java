// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Desired availability domain for the attachment. Only available for type PARTNER, at creation time, and can take one of the following values: - AVAILABILITY_DOMAIN_ANY - AVAILABILITY_DOMAIN_1 - AVAILABILITY_DOMAIN_2 For improved reliability, customers should configure a pair of attachments, one per availability domain. The selected availability domain will be provided to the Partner via the pairing key, so that the provisioned circuit will lie in the specified domain. If not specified, the value will default to AVAILABILITY_DOMAIN_ANY.
     * 
     */
    @EnumType
    public enum InterconnectAttachmentEdgeAvailabilityDomain {
        AvailabilityDomain1("AVAILABILITY_DOMAIN_1"),
        AvailabilityDomain2("AVAILABILITY_DOMAIN_2"),
        AvailabilityDomainAny("AVAILABILITY_DOMAIN_ANY");

        private final String value;

        InterconnectAttachmentEdgeAvailabilityDomain(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InterconnectAttachmentEdgeAvailabilityDomain[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
