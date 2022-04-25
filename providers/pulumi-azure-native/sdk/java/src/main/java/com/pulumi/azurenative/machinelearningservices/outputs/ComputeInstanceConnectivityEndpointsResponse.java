// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ComputeInstanceConnectivityEndpointsResponse {
    /**
     * @return Private IP Address of this ComputeInstance (local to the VNET in which the compute instance is deployed).
     * 
     */
    private final String privateIpAddress;
    /**
     * @return Public IP Address of this ComputeInstance.
     * 
     */
    private final String publicIpAddress;

    @CustomType.Constructor
    private ComputeInstanceConnectivityEndpointsResponse(
        @CustomType.Parameter("privateIpAddress") String privateIpAddress,
        @CustomType.Parameter("publicIpAddress") String publicIpAddress) {
        this.privateIpAddress = privateIpAddress;
        this.publicIpAddress = publicIpAddress;
    }

    /**
     * @return Private IP Address of this ComputeInstance (local to the VNET in which the compute instance is deployed).
     * 
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * @return Public IP Address of this ComputeInstance.
     * 
     */
    public String publicIpAddress() {
        return this.publicIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstanceConnectivityEndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateIpAddress;
        private String publicIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeInstanceConnectivityEndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.publicIpAddress = defaults.publicIpAddress;
        }

        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        public Builder publicIpAddress(String publicIpAddress) {
            this.publicIpAddress = Objects.requireNonNull(publicIpAddress);
            return this;
        }        public ComputeInstanceConnectivityEndpointsResponse build() {
            return new ComputeInstanceConnectivityEndpointsResponse(privateIpAddress, publicIpAddress);
        }
    }
}
