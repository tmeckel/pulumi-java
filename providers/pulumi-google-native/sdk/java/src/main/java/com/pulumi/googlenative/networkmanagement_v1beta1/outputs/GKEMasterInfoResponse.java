// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GKEMasterInfoResponse {
    /**
     * @return URI of a GKE cluster network.
     * 
     */
    private final String clusterNetworkUri;
    /**
     * @return URI of a GKE cluster.
     * 
     */
    private final String clusterUri;
    /**
     * @return External IP address of a GKE cluster master.
     * 
     */
    private final String externalIp;
    /**
     * @return Internal IP address of a GKE cluster master.
     * 
     */
    private final String internalIp;

    @CustomType.Constructor
    private GKEMasterInfoResponse(
        @CustomType.Parameter("clusterNetworkUri") String clusterNetworkUri,
        @CustomType.Parameter("clusterUri") String clusterUri,
        @CustomType.Parameter("externalIp") String externalIp,
        @CustomType.Parameter("internalIp") String internalIp) {
        this.clusterNetworkUri = clusterNetworkUri;
        this.clusterUri = clusterUri;
        this.externalIp = externalIp;
        this.internalIp = internalIp;
    }

    /**
     * @return URI of a GKE cluster network.
     * 
     */
    public String clusterNetworkUri() {
        return this.clusterNetworkUri;
    }
    /**
     * @return URI of a GKE cluster.
     * 
     */
    public String clusterUri() {
        return this.clusterUri;
    }
    /**
     * @return External IP address of a GKE cluster master.
     * 
     */
    public String externalIp() {
        return this.externalIp;
    }
    /**
     * @return Internal IP address of a GKE cluster master.
     * 
     */
    public String internalIp() {
        return this.internalIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GKEMasterInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterNetworkUri;
        private String clusterUri;
        private String externalIp;
        private String internalIp;

        public Builder() {
    	      // Empty
        }

        public Builder(GKEMasterInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterNetworkUri = defaults.clusterNetworkUri;
    	      this.clusterUri = defaults.clusterUri;
    	      this.externalIp = defaults.externalIp;
    	      this.internalIp = defaults.internalIp;
        }

        public Builder clusterNetworkUri(String clusterNetworkUri) {
            this.clusterNetworkUri = Objects.requireNonNull(clusterNetworkUri);
            return this;
        }
        public Builder clusterUri(String clusterUri) {
            this.clusterUri = Objects.requireNonNull(clusterUri);
            return this;
        }
        public Builder externalIp(String externalIp) {
            this.externalIp = Objects.requireNonNull(externalIp);
            return this;
        }
        public Builder internalIp(String internalIp) {
            this.internalIp = Objects.requireNonNull(internalIp);
            return this;
        }        public GKEMasterInfoResponse build() {
            return new GKEMasterInfoResponse(clusterNetworkUri, clusterUri, externalIp, internalIp);
        }
    }
}
