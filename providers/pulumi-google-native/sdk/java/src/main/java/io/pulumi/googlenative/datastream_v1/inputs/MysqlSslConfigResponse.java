// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * MySQL SSL configuration information.
 * 
 */
public final class MysqlSslConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final MysqlSslConfigResponse Empty = new MysqlSslConfigResponse();

    /**
     * Input only. PEM-encoded certificate of the CA that signed the source database server's certificate.
     * 
     */
    @InputImport(name="caCertificate", required=true)
      private final String caCertificate;

    public String getCaCertificate() {
        return this.caCertificate;
    }

    /**
     * Indicates whether the ca_certificate field is set.
     * 
     */
    @InputImport(name="caCertificateSet", required=true)
      private final Boolean caCertificateSet;

    public Boolean getCaCertificateSet() {
        return this.caCertificateSet;
    }

    /**
     * Input only. PEM-encoded certificate that will be used by the replica to authenticate against the source database server. If this field is used then the 'client_key' and the 'ca_certificate' fields are mandatory.
     * 
     */
    @InputImport(name="clientCertificate", required=true)
      private final String clientCertificate;

    public String getClientCertificate() {
        return this.clientCertificate;
    }

    /**
     * Indicates whether the client_certificate field is set.
     * 
     */
    @InputImport(name="clientCertificateSet", required=true)
      private final Boolean clientCertificateSet;

    public Boolean getClientCertificateSet() {
        return this.clientCertificateSet;
    }

    /**
     * Input only. PEM-encoded private key associated with the Client Certificate. If this field is used then the 'client_certificate' and the 'ca_certificate' fields are mandatory.
     * 
     */
    @InputImport(name="clientKey", required=true)
      private final String clientKey;

    public String getClientKey() {
        return this.clientKey;
    }

    /**
     * Indicates whether the client_key field is set.
     * 
     */
    @InputImport(name="clientKeySet", required=true)
      private final Boolean clientKeySet;

    public Boolean getClientKeySet() {
        return this.clientKeySet;
    }

    public MysqlSslConfigResponse(
        String caCertificate,
        Boolean caCertificateSet,
        String clientCertificate,
        Boolean clientCertificateSet,
        String clientKey,
        Boolean clientKeySet) {
        this.caCertificate = Objects.requireNonNull(caCertificate, "expected parameter 'caCertificate' to be non-null");
        this.caCertificateSet = Objects.requireNonNull(caCertificateSet, "expected parameter 'caCertificateSet' to be non-null");
        this.clientCertificate = Objects.requireNonNull(clientCertificate, "expected parameter 'clientCertificate' to be non-null");
        this.clientCertificateSet = Objects.requireNonNull(clientCertificateSet, "expected parameter 'clientCertificateSet' to be non-null");
        this.clientKey = Objects.requireNonNull(clientKey, "expected parameter 'clientKey' to be non-null");
        this.clientKeySet = Objects.requireNonNull(clientKeySet, "expected parameter 'clientKeySet' to be non-null");
    }

    private MysqlSslConfigResponse() {
        this.caCertificate = null;
        this.caCertificateSet = null;
        this.clientCertificate = null;
        this.clientCertificateSet = null;
        this.clientKey = null;
        this.clientKeySet = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlSslConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String caCertificate;
        private Boolean caCertificateSet;
        private String clientCertificate;
        private Boolean clientCertificateSet;
        private String clientKey;
        private Boolean clientKeySet;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlSslConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificate = defaults.caCertificate;
    	      this.caCertificateSet = defaults.caCertificateSet;
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientCertificateSet = defaults.clientCertificateSet;
    	      this.clientKey = defaults.clientKey;
    	      this.clientKeySet = defaults.clientKeySet;
        }

        public Builder caCertificate(String caCertificate) {
            this.caCertificate = Objects.requireNonNull(caCertificate);
            return this;
        }

        public Builder caCertificateSet(Boolean caCertificateSet) {
            this.caCertificateSet = Objects.requireNonNull(caCertificateSet);
            return this;
        }

        public Builder clientCertificate(String clientCertificate) {
            this.clientCertificate = Objects.requireNonNull(clientCertificate);
            return this;
        }

        public Builder clientCertificateSet(Boolean clientCertificateSet) {
            this.clientCertificateSet = Objects.requireNonNull(clientCertificateSet);
            return this;
        }

        public Builder clientKey(String clientKey) {
            this.clientKey = Objects.requireNonNull(clientKey);
            return this;
        }

        public Builder clientKeySet(Boolean clientKeySet) {
            this.clientKeySet = Objects.requireNonNull(clientKeySet);
            return this;
        }
        public MysqlSslConfigResponse build() {
            return new MysqlSslConfigResponse(caCertificate, caCertificateSet, clientCertificate, clientCertificateSet, clientKey, clientKeySet);
        }
    }
}
