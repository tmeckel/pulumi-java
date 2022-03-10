// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1beta1.inputs.ClientCertificateConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The authentication information for accessing the master endpoint. Authentication can be done using HTTP basic auth or using client certificates.
 * 
 */
public final class MasterAuthArgs extends io.pulumi.resources.ResourceArgs {

    public static final MasterAuthArgs Empty = new MasterAuthArgs();

    /**
     * Configuration for client certificate authentication on the cluster. For clusters before v1.12, if no configuration is specified, a client certificate is issued.
     * 
     */
    @InputImport(name="clientCertificateConfig")
      private final @Nullable Input<ClientCertificateConfigArgs> clientCertificateConfig;

    public Input<ClientCertificateConfigArgs> getClientCertificateConfig() {
        return this.clientCertificateConfig == null ? Input.empty() : this.clientCertificateConfig;
    }

    @InputImport(name="clusterCaCertificate")
      private final @Nullable Input<String> clusterCaCertificate;

    public Input<String> getClusterCaCertificate() {
        return this.clusterCaCertificate == null ? Input.empty() : this.clusterCaCertificate;
    }

    /**
     * The password to use for HTTP basic authentication to the master endpoint. Because the master endpoint is open to the Internet, you should create a strong password. If a password is provided for cluster creation, username must be non-empty. Warning: basic authentication is deprecated, and will be removed in GKE control plane versions 1.19 and newer. For a list of recommended authentication methods, see: https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The username to use for HTTP basic authentication to the master endpoint. For clusters v1.6.0 and later, basic authentication can be disabled by leaving username unspecified (or setting it to the empty string). Warning: basic authentication is deprecated, and will be removed in GKE control plane versions 1.19 and newer. For a list of recommended authentication methods, see: https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication
     * 
     */
    @InputImport(name="username")
      private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public MasterAuthArgs(
        @Nullable Input<ClientCertificateConfigArgs> clientCertificateConfig,
        @Nullable Input<String> clusterCaCertificate,
        @Nullable Input<String> password,
        @Nullable Input<String> username) {
        this.clientCertificateConfig = clientCertificateConfig;
        this.clusterCaCertificate = clusterCaCertificate;
        this.password = password;
        this.username = username;
    }

    private MasterAuthArgs() {
        this.clientCertificateConfig = Input.empty();
        this.clusterCaCertificate = Input.empty();
        this.password = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MasterAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClientCertificateConfigArgs> clientCertificateConfig;
        private @Nullable Input<String> clusterCaCertificate;
        private @Nullable Input<String> password;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(MasterAuthArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCertificateConfig = defaults.clientCertificateConfig;
    	      this.clusterCaCertificate = defaults.clusterCaCertificate;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder clientCertificateConfig(@Nullable Input<ClientCertificateConfigArgs> clientCertificateConfig) {
            this.clientCertificateConfig = clientCertificateConfig;
            return this;
        }

        public Builder clientCertificateConfig(@Nullable ClientCertificateConfigArgs clientCertificateConfig) {
            this.clientCertificateConfig = Input.ofNullable(clientCertificateConfig);
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

        public Builder password(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder username(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }
        public MasterAuthArgs build() {
            return new MasterAuthArgs(clientCertificateConfig, clusterCaCertificate, password, username);
        }
    }
}
