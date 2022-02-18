// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT.
     * 
     */
    @EnumType
    public enum RegionNetworkEndpointGroupNetworkEndpointType {
        /**
         * The network endpoint is represented by an IP address.
         * 
         */
        GceVmIp("GCE_VM_IP"),
        /**
         * The network endpoint is represented by IP address and port pair.
         * 
         */
        GceVmIpPort("GCE_VM_IP_PORT"),
        /**
         * The network endpoint is the primary IP address on any network interface of a VM in Compute Engine.
         * 
         */
        GceVmPrimaryIp("GCE_VM_PRIMARY_IP"),
        /**
         * The network endpoint is represented by fully qualified domain name and port.
         * 
         */
        InternetFqdnPort("INTERNET_FQDN_PORT"),
        /**
         * The network endpoint is represented by an internet IP address and port.
         * 
         */
        InternetIpPort("INTERNET_IP_PORT"),
        /**
         * The network endpoint is represented by an IP address and port. The endpoint belongs to a VM or pod running in a customer's on-premises.
         * 
         */
        NonGcpPrivateIpPort("NON_GCP_PRIVATE_IP_PORT"),
        /**
         * The network endpoint is either public Google APIs or services exposed by other GCP Project with a Service Attachment. The connection is set up by private service connect
         * 
         */
        PrivateServiceConnect("PRIVATE_SERVICE_CONNECT"),
        /**
         * The network endpoint is handled by specified serverless infrastructure.
         * 
         */
        Serverless("SERVERLESS");

        private final String value;

        RegionNetworkEndpointGroupNetworkEndpointType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RegionNetworkEndpointGroupNetworkEndpointType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
