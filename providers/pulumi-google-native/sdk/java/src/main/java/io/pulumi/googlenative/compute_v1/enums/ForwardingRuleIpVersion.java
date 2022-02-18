// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The IP Version that will be used by this forwarding rule. Valid options are IPV4 or IPV6. This can only be specified for an external global forwarding rule.
     * 
     */
    @EnumType
    public enum ForwardingRuleIpVersion {
        Ipv4("IPV4"),
        Ipv6("IPV6"),
        UnspecifiedVersion("UNSPECIFIED_VERSION");

        private final String value;

        ForwardingRuleIpVersion(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ForwardingRuleIpVersion[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
