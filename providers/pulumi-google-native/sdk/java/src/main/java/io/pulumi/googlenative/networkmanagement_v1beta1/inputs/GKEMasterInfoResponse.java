// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * For display only. Metadata associated with a Google Kubernetes Engine (GKE) cluster master.
 * 
 */
public final class GKEMasterInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final GKEMasterInfoResponse Empty = new GKEMasterInfoResponse();

    /**
     * URI of a GKE cluster network.
     * 
     */
    @InputImport(name="clusterNetworkUri", required=true)
    private final String clusterNetworkUri;

    public String getClusterNetworkUri() {
        return this.clusterNetworkUri;
    }

    /**
     * URI of a GKE cluster.
     * 
     */
    @InputImport(name="clusterUri", required=true)
    private final String clusterUri;

    public String getClusterUri() {
        return this.clusterUri;
    }

    /**
     * External IP address of a GKE cluster master.
     * 
     */
    @InputImport(name="externalIp", required=true)
    private final String externalIp;

    public String getExternalIp() {
        return this.externalIp;
    }

    /**
     * Internal IP address of a GKE cluster master.
     * 
     */
    @InputImport(name="internalIp", required=true)
    private final String internalIp;

    public String getInternalIp() {
        return this.internalIp;
    }

    public GKEMasterInfoResponse(
        String clusterNetworkUri,
        String clusterUri,
        String externalIp,
        String internalIp) {
        this.clusterNetworkUri = Objects.requireNonNull(clusterNetworkUri, "expected parameter 'clusterNetworkUri' to be non-null");
        this.clusterUri = Objects.requireNonNull(clusterUri, "expected parameter 'clusterUri' to be non-null");
        this.externalIp = Objects.requireNonNull(externalIp, "expected parameter 'externalIp' to be non-null");
        this.internalIp = Objects.requireNonNull(internalIp, "expected parameter 'internalIp' to be non-null");
    }

    private GKEMasterInfoResponse() {
        this.clusterNetworkUri = null;
        this.clusterUri = null;
        this.externalIp = null;
        this.internalIp = null;
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

        public Builder setClusterNetworkUri(String clusterNetworkUri) {
            this.clusterNetworkUri = Objects.requireNonNull(clusterNetworkUri);
            return this;
        }

        public Builder setClusterUri(String clusterUri) {
            this.clusterUri = Objects.requireNonNull(clusterUri);
            return this;
        }

        public Builder setExternalIp(String externalIp) {
            this.externalIp = Objects.requireNonNull(externalIp);
            return this;
        }

        public Builder setInternalIp(String internalIp) {
            this.internalIp = Objects.requireNonNull(internalIp);
            return this;
        }

        public GKEMasterInfoResponse build() {
            return new GKEMasterInfoResponse(clusterNetworkUri, clusterUri, externalIp, internalIp);
        }
    }
}
