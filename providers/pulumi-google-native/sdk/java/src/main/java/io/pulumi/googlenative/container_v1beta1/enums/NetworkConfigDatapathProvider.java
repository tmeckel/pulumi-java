// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The desired datapath provider for this cluster. By default, uses the IPTables-based kube-proxy implementation.
     * 
     */
    @EnumType
    public enum NetworkConfigDatapathProvider {
        /**
         * Default value.
         * 
         */
        DatapathProviderUnspecified("DATAPATH_PROVIDER_UNSPECIFIED"),
        /**
         * Use the IPTables implementation based on kube-proxy.
         * 
         */
        LegacyDatapath("LEGACY_DATAPATH"),
        /**
         * Use the eBPF based GKE Dataplane V2 with additional features. See the [GKE Dataplane V2 documentation](https://cloud.google.com/kubernetes-engine/docs/how-to/dataplane-v2) for more.
         * 
         */
        AdvancedDatapath("ADVANCED_DATAPATH");

        private final String value;

        NetworkConfigDatapathProvider(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NetworkConfigDatapathProvider[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
