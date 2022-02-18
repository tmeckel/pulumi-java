// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.sqladmin_v1.inputs.InstanceReferenceResponse;
import java.lang.String;
import java.util.Objects;


/**
 * On-premises instance configuration.
 * 
 */
public final class OnPremisesConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final OnPremisesConfigurationResponse Empty = new OnPremisesConfigurationResponse();

    /**
     * PEM representation of the trusted CA's x509 certificate.
     * 
     */
    @InputImport(name="caCertificate", required=true)
    private final String caCertificate;

    public String getCaCertificate() {
        return this.caCertificate;
    }

    /**
     * PEM representation of the replica's x509 certificate.
     * 
     */
    @InputImport(name="clientCertificate", required=true)
    private final String clientCertificate;

    public String getClientCertificate() {
        return this.clientCertificate;
    }

    /**
     * PEM representation of the replica's private key. The corresponsing public key is encoded in the client's certificate.
     * 
     */
    @InputImport(name="clientKey", required=true)
    private final String clientKey;

    public String getClientKey() {
        return this.clientKey;
    }

    /**
     * The dump file to create the Cloud SQL replica.
     * 
     */
    @InputImport(name="dumpFilePath", required=true)
    private final String dumpFilePath;

    public String getDumpFilePath() {
        return this.dumpFilePath;
    }

    /**
     * The host and port of the on-premises instance in host:port format
     * 
     */
    @InputImport(name="hostPort", required=true)
    private final String hostPort;

    public String getHostPort() {
        return this.hostPort;
    }

    /**
     * This is always `sql#onPremisesConfiguration`.
     * 
     */
    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * The password for connecting to on-premises instance.
     * 
     */
    @InputImport(name="password", required=true)
    private final String password;

    public String getPassword() {
        return this.password;
    }

    /**
     * The reference to Cloud SQL instance if the source is Cloud SQL.
     * 
     */
    @InputImport(name="sourceInstance", required=true)
    private final InstanceReferenceResponse sourceInstance;

    public InstanceReferenceResponse getSourceInstance() {
        return this.sourceInstance;
    }

    /**
     * The username for connecting to on-premises instance.
     * 
     */
    @InputImport(name="username", required=true)
    private final String username;

    public String getUsername() {
        return this.username;
    }

    public OnPremisesConfigurationResponse(
        String caCertificate,
        String clientCertificate,
        String clientKey,
        String dumpFilePath,
        String hostPort,
        String kind,
        String password,
        InstanceReferenceResponse sourceInstance,
        String username) {
        this.caCertificate = Objects.requireNonNull(caCertificate, "expected parameter 'caCertificate' to be non-null");
        this.clientCertificate = Objects.requireNonNull(clientCertificate, "expected parameter 'clientCertificate' to be non-null");
        this.clientKey = Objects.requireNonNull(clientKey, "expected parameter 'clientKey' to be non-null");
        this.dumpFilePath = Objects.requireNonNull(dumpFilePath, "expected parameter 'dumpFilePath' to be non-null");
        this.hostPort = Objects.requireNonNull(hostPort, "expected parameter 'hostPort' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.sourceInstance = Objects.requireNonNull(sourceInstance, "expected parameter 'sourceInstance' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private OnPremisesConfigurationResponse() {
        this.caCertificate = null;
        this.clientCertificate = null;
        this.clientKey = null;
        this.dumpFilePath = null;
        this.hostPort = null;
        this.kind = null;
        this.password = null;
        this.sourceInstance = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnPremisesConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String caCertificate;
        private String clientCertificate;
        private String clientKey;
        private String dumpFilePath;
        private String hostPort;
        private String kind;
        private String password;
        private InstanceReferenceResponse sourceInstance;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(OnPremisesConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificate = defaults.caCertificate;
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientKey = defaults.clientKey;
    	      this.dumpFilePath = defaults.dumpFilePath;
    	      this.hostPort = defaults.hostPort;
    	      this.kind = defaults.kind;
    	      this.password = defaults.password;
    	      this.sourceInstance = defaults.sourceInstance;
    	      this.username = defaults.username;
        }

        public Builder setCaCertificate(String caCertificate) {
            this.caCertificate = Objects.requireNonNull(caCertificate);
            return this;
        }

        public Builder setClientCertificate(String clientCertificate) {
            this.clientCertificate = Objects.requireNonNull(clientCertificate);
            return this;
        }

        public Builder setClientKey(String clientKey) {
            this.clientKey = Objects.requireNonNull(clientKey);
            return this;
        }

        public Builder setDumpFilePath(String dumpFilePath) {
            this.dumpFilePath = Objects.requireNonNull(dumpFilePath);
            return this;
        }

        public Builder setHostPort(String hostPort) {
            this.hostPort = Objects.requireNonNull(hostPort);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setSourceInstance(InstanceReferenceResponse sourceInstance) {
            this.sourceInstance = Objects.requireNonNull(sourceInstance);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public OnPremisesConfigurationResponse build() {
            return new OnPremisesConfigurationResponse(caCertificate, clientCertificate, clientKey, dumpFilePath, hostPort, kind, password, sourceInstance, username);
        }
    }
}
