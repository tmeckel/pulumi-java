// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of session affinity to use. The default is NONE. Only NONE and HEADER_FIELD are supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true. For more details, see: [Session Affinity](https://cloud.google.com/load-balancing/docs/backend-service#session_affinity).
     * 
     */
    @EnumType
    public enum BackendServiceSessionAffinity {
        /**
         * 2-tuple hash on packet's source and destination IP addresses. Connections from the same source IP address to the same destination IP address will be served by the same backend VM while that VM remains healthy.
         * 
         */
        ClientIp("CLIENT_IP"),
        /**
         * 1-tuple hash only on packet's source IP address. Connections from the same source IP address will be served by the same backend VM while that VM remains healthy. This option can only be used for Internal TCP/UDP Load Balancing.
         * 
         */
        ClientIpNoDestination("CLIENT_IP_NO_DESTINATION"),
        /**
         * 5-tuple hash on packet's source and destination IP addresses, IP protocol, and source and destination ports. Connections for the same IP protocol from the same source IP address and port to the same destination IP address and port will be served by the same backend VM while that VM remains healthy. This option cannot be used for HTTP(S) load balancing.
         * 
         */
        ClientIpPortProto("CLIENT_IP_PORT_PROTO"),
        /**
         * 3-tuple hash on packet's source and destination IP addresses, and IP protocol. Connections for the same IP protocol from the same source IP address to the same destination IP address will be served by the same backend VM while that VM remains healthy. This option cannot be used for HTTP(S) load balancing.
         * 
         */
        ClientIpProto("CLIENT_IP_PROTO"),
        /**
         * Hash based on a cookie generated by the L7 loadbalancer. Only valid for HTTP(S) load balancing.
         * 
         */
        GeneratedCookie("GENERATED_COOKIE"),
        /**
         * The hash is based on a user specified header field.
         * 
         */
        HeaderField("HEADER_FIELD"),
        /**
         * The hash is based on a user provided cookie.
         * 
         */
        HttpCookie("HTTP_COOKIE"),
        /**
         * No session affinity. Connections from the same client IP may go to any instance in the pool.
         * 
         */
        None("NONE");

        private final String value;

        BackendServiceSessionAffinity(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BackendServiceSessionAffinity[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
