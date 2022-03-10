// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.GetClusterMasterAuthClientCertificateConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetClusterMasterAuth extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterMasterAuth Empty = new GetClusterMasterAuth();

    @InputImport(name="clientCertificate", required=true)
      private final String clientCertificate;

    public String getClientCertificate() {
        return this.clientCertificate;
    }

    @InputImport(name="clientCertificateConfigs", required=true)
      private final List<GetClusterMasterAuthClientCertificateConfig> clientCertificateConfigs;

    public List<GetClusterMasterAuthClientCertificateConfig> getClientCertificateConfigs() {
        return this.clientCertificateConfigs;
    }

    @InputImport(name="clientKey", required=true)
      private final String clientKey;

    public String getClientKey() {
        return this.clientKey;
    }

    @InputImport(name="clusterCaCertificate", required=true)
      private final String clusterCaCertificate;

    public String getClusterCaCertificate() {
        return this.clusterCaCertificate;
    }

    public GetClusterMasterAuth(
        String clientCertificate,
        List<GetClusterMasterAuthClientCertificateConfig> clientCertificateConfigs,
        String clientKey,
        String clusterCaCertificate) {
        this.clientCertificate = Objects.requireNonNull(clientCertificate, "expected parameter 'clientCertificate' to be non-null");
        this.clientCertificateConfigs = Objects.requireNonNull(clientCertificateConfigs, "expected parameter 'clientCertificateConfigs' to be non-null");
        this.clientKey = Objects.requireNonNull(clientKey, "expected parameter 'clientKey' to be non-null");
        this.clusterCaCertificate = Objects.requireNonNull(clusterCaCertificate, "expected parameter 'clusterCaCertificate' to be non-null");
    }

    private GetClusterMasterAuth() {
        this.clientCertificate = null;
        this.clientCertificateConfigs = List.of();
        this.clientKey = null;
        this.clusterCaCertificate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterMasterAuth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientCertificate;
        private List<GetClusterMasterAuthClientCertificateConfig> clientCertificateConfigs;
        private String clientKey;
        private String clusterCaCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterMasterAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientCertificateConfigs = defaults.clientCertificateConfigs;
    	      this.clientKey = defaults.clientKey;
    	      this.clusterCaCertificate = defaults.clusterCaCertificate;
        }

        public Builder clientCertificate(String clientCertificate) {
            this.clientCertificate = Objects.requireNonNull(clientCertificate);
            return this;
        }

        public Builder clientCertificateConfigs(List<GetClusterMasterAuthClientCertificateConfig> clientCertificateConfigs) {
            this.clientCertificateConfigs = Objects.requireNonNull(clientCertificateConfigs);
            return this;
        }

        public Builder clientKey(String clientKey) {
            this.clientKey = Objects.requireNonNull(clientKey);
            return this;
        }

        public Builder clusterCaCertificate(String clusterCaCertificate) {
            this.clusterCaCertificate = Objects.requireNonNull(clusterCaCertificate);
            return this;
        }
        public GetClusterMasterAuth build() {
            return new GetClusterMasterAuth(clientCertificate, clientCertificateConfigs, clientKey, clusterCaCertificate);
        }
    }
}
