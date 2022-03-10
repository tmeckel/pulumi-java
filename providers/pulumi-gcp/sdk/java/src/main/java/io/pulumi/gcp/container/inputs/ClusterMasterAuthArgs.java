// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.ClusterMasterAuthClientCertificateConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterMasterAuthArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMasterAuthArgs Empty = new ClusterMasterAuthArgs();

    @InputImport(name="clientCertificate")
      private final @Nullable Input<String> clientCertificate;

    public Input<String> getClientCertificate() {
        return this.clientCertificate == null ? Input.empty() : this.clientCertificate;
    }

    /**
     * Whether client certificate authorization is enabled for this cluster.  For example:
     * 
     */
    @InputImport(name="clientCertificateConfig", required=true)
      private final Input<ClusterMasterAuthClientCertificateConfigArgs> clientCertificateConfig;

    public Input<ClusterMasterAuthClientCertificateConfigArgs> getClientCertificateConfig() {
        return this.clientCertificateConfig;
    }

    @InputImport(name="clientKey")
      private final @Nullable Input<String> clientKey;

    public Input<String> getClientKey() {
        return this.clientKey == null ? Input.empty() : this.clientKey;
    }

    @InputImport(name="clusterCaCertificate")
      private final @Nullable Input<String> clusterCaCertificate;

    public Input<String> getClusterCaCertificate() {
        return this.clusterCaCertificate == null ? Input.empty() : this.clusterCaCertificate;
    }

    public ClusterMasterAuthArgs(
        @Nullable Input<String> clientCertificate,
        Input<ClusterMasterAuthClientCertificateConfigArgs> clientCertificateConfig,
        @Nullable Input<String> clientKey,
        @Nullable Input<String> clusterCaCertificate) {
        this.clientCertificate = clientCertificate;
        this.clientCertificateConfig = Objects.requireNonNull(clientCertificateConfig, "expected parameter 'clientCertificateConfig' to be non-null");
        this.clientKey = clientKey;
        this.clusterCaCertificate = clusterCaCertificate;
    }

    private ClusterMasterAuthArgs() {
        this.clientCertificate = Input.empty();
        this.clientCertificateConfig = Input.empty();
        this.clientKey = Input.empty();
        this.clusterCaCertificate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientCertificate;
        private Input<ClusterMasterAuthClientCertificateConfigArgs> clientCertificateConfig;
        private @Nullable Input<String> clientKey;
        private @Nullable Input<String> clusterCaCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterAuthArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientCertificateConfig = defaults.clientCertificateConfig;
    	      this.clientKey = defaults.clientKey;
    	      this.clusterCaCertificate = defaults.clusterCaCertificate;
        }

        public Builder clientCertificate(@Nullable Input<String> clientCertificate) {
            this.clientCertificate = clientCertificate;
            return this;
        }

        public Builder clientCertificate(@Nullable String clientCertificate) {
            this.clientCertificate = Input.ofNullable(clientCertificate);
            return this;
        }

        public Builder clientCertificateConfig(Input<ClusterMasterAuthClientCertificateConfigArgs> clientCertificateConfig) {
            this.clientCertificateConfig = Objects.requireNonNull(clientCertificateConfig);
            return this;
        }

        public Builder clientCertificateConfig(ClusterMasterAuthClientCertificateConfigArgs clientCertificateConfig) {
            this.clientCertificateConfig = Input.of(Objects.requireNonNull(clientCertificateConfig));
            return this;
        }

        public Builder clientKey(@Nullable Input<String> clientKey) {
            this.clientKey = clientKey;
            return this;
        }

        public Builder clientKey(@Nullable String clientKey) {
            this.clientKey = Input.ofNullable(clientKey);
            return this;
        }

        public Builder clusterCaCertificate(@Nullable Input<String> clusterCaCertificate) {
            this.clusterCaCertificate = clusterCaCertificate;
            return this;
        }

        public Builder clusterCaCertificate(@Nullable String clusterCaCertificate) {
            this.clusterCaCertificate = Input.ofNullable(clusterCaCertificate);
            return this;
        }
        public ClusterMasterAuthArgs build() {
            return new ClusterMasterAuthArgs(clientCertificate, clientCertificateConfig, clientKey, clusterCaCertificate);
        }
    }
}
