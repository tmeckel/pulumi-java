// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * cluster_dns indicates which in-cluster DNS provider should be used.
     * 
     */
    @EnumType
    public enum DNSConfigClusterDns {
        /**
         * Default value
         * 
         */
        ProviderUnspecified("PROVIDER_UNSPECIFIED"),
        /**
         * Use GKE default DNS provider(kube-dns) for DNS resolution.
         * 
         */
        PlatformDefault("PLATFORM_DEFAULT"),
        /**
         * Use CloudDNS for DNS resolution.
         * 
         */
        CloudDns("CLOUD_DNS");

        private final String value;

        DNSConfigClusterDns(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DNSConfigClusterDns[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
