// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * String mnemonic specifying the DNSSEC algorithm of this key.
     * 
     */
    @EnumType
    public enum DnsKeySpecAlgorithm {
        Rsasha1("rsasha1"),
        Rsasha256("rsasha256"),
        Rsasha512("rsasha512"),
        Ecdsap256sha256("ecdsap256sha256"),
        Ecdsap384sha384("ecdsap384sha384");

        private final String value;

        DnsKeySpecAlgorithm(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DnsKeySpecAlgorithm[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
