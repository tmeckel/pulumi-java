// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1TlsInfoCommonNameResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * TLS configuration information for virtual hosts and TargetServers.
 * 
 */
public final class GoogleCloudApigeeV1TlsInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1TlsInfoResponse Empty = new GoogleCloudApigeeV1TlsInfoResponse();

    /**
     * The SSL/TLS cipher suites to be used. Must be one of the cipher suite names listed in: http://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#ciphersuites
     * 
     */
    @InputImport(name="ciphers", required=true)
      private final List<String> ciphers;

    public List<String> getCiphers() {
        return this.ciphers;
    }

    /**
     * Optional. Enables two-way TLS.
     * 
     */
    @InputImport(name="clientAuthEnabled", required=true)
      private final Boolean clientAuthEnabled;

    public Boolean getClientAuthEnabled() {
        return this.clientAuthEnabled;
    }

    /**
     * The TLS Common Name of the certificate.
     * 
     */
    @InputImport(name="commonName", required=true)
      private final GoogleCloudApigeeV1TlsInfoCommonNameResponse commonName;

    public GoogleCloudApigeeV1TlsInfoCommonNameResponse getCommonName() {
        return this.commonName;
    }

    /**
     * Enables TLS. If false, neither one-way nor two-way TLS will be enabled.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * If true, Edge ignores TLS certificate errors. Valid when configuring TLS for target servers and target endpoints, and when configuring virtual hosts that use 2-way TLS. When used with a target endpoint/target server, if the backend system uses SNI and returns a cert with a subject Distinguished Name (DN) that does not match the hostname, there is no way to ignore the error and the connection fails.
     * 
     */
    @InputImport(name="ignoreValidationErrors", required=true)
      private final Boolean ignoreValidationErrors;

    public Boolean getIgnoreValidationErrors() {
        return this.ignoreValidationErrors;
    }

    /**
     * Required if `client_auth_enabled` is true. The resource ID for the alias containing the private key and cert.
     * 
     */
    @InputImport(name="keyAlias", required=true)
      private final String keyAlias;

    public String getKeyAlias() {
        return this.keyAlias;
    }

    /**
     * Required if `client_auth_enabled` is true. The resource ID of the keystore.
     * 
     */
    @InputImport(name="keyStore", required=true)
      private final String keyStore;

    public String getKeyStore() {
        return this.keyStore;
    }

    /**
     * The TLS versioins to be used.
     * 
     */
    @InputImport(name="protocols", required=true)
      private final List<String> protocols;

    public List<String> getProtocols() {
        return this.protocols;
    }

    /**
     * The resource ID of the truststore.
     * 
     */
    @InputImport(name="trustStore", required=true)
      private final String trustStore;

    public String getTrustStore() {
        return this.trustStore;
    }

    public GoogleCloudApigeeV1TlsInfoResponse(
        List<String> ciphers,
        Boolean clientAuthEnabled,
        GoogleCloudApigeeV1TlsInfoCommonNameResponse commonName,
        Boolean enabled,
        Boolean ignoreValidationErrors,
        String keyAlias,
        String keyStore,
        List<String> protocols,
        String trustStore) {
        this.ciphers = Objects.requireNonNull(ciphers, "expected parameter 'ciphers' to be non-null");
        this.clientAuthEnabled = Objects.requireNonNull(clientAuthEnabled, "expected parameter 'clientAuthEnabled' to be non-null");
        this.commonName = Objects.requireNonNull(commonName, "expected parameter 'commonName' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.ignoreValidationErrors = Objects.requireNonNull(ignoreValidationErrors, "expected parameter 'ignoreValidationErrors' to be non-null");
        this.keyAlias = Objects.requireNonNull(keyAlias, "expected parameter 'keyAlias' to be non-null");
        this.keyStore = Objects.requireNonNull(keyStore, "expected parameter 'keyStore' to be non-null");
        this.protocols = Objects.requireNonNull(protocols, "expected parameter 'protocols' to be non-null");
        this.trustStore = Objects.requireNonNull(trustStore, "expected parameter 'trustStore' to be non-null");
    }

    private GoogleCloudApigeeV1TlsInfoResponse() {
        this.ciphers = List.of();
        this.clientAuthEnabled = null;
        this.commonName = null;
        this.enabled = null;
        this.ignoreValidationErrors = null;
        this.keyAlias = null;
        this.keyStore = null;
        this.protocols = List.of();
        this.trustStore = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1TlsInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> ciphers;
        private Boolean clientAuthEnabled;
        private GoogleCloudApigeeV1TlsInfoCommonNameResponse commonName;
        private Boolean enabled;
        private Boolean ignoreValidationErrors;
        private String keyAlias;
        private String keyStore;
        private List<String> protocols;
        private String trustStore;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1TlsInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ciphers = defaults.ciphers;
    	      this.clientAuthEnabled = defaults.clientAuthEnabled;
    	      this.commonName = defaults.commonName;
    	      this.enabled = defaults.enabled;
    	      this.ignoreValidationErrors = defaults.ignoreValidationErrors;
    	      this.keyAlias = defaults.keyAlias;
    	      this.keyStore = defaults.keyStore;
    	      this.protocols = defaults.protocols;
    	      this.trustStore = defaults.trustStore;
        }

        public Builder ciphers(List<String> ciphers) {
            this.ciphers = Objects.requireNonNull(ciphers);
            return this;
        }

        public Builder clientAuthEnabled(Boolean clientAuthEnabled) {
            this.clientAuthEnabled = Objects.requireNonNull(clientAuthEnabled);
            return this;
        }

        public Builder commonName(GoogleCloudApigeeV1TlsInfoCommonNameResponse commonName) {
            this.commonName = Objects.requireNonNull(commonName);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder ignoreValidationErrors(Boolean ignoreValidationErrors) {
            this.ignoreValidationErrors = Objects.requireNonNull(ignoreValidationErrors);
            return this;
        }

        public Builder keyAlias(String keyAlias) {
            this.keyAlias = Objects.requireNonNull(keyAlias);
            return this;
        }

        public Builder keyStore(String keyStore) {
            this.keyStore = Objects.requireNonNull(keyStore);
            return this;
        }

        public Builder protocols(List<String> protocols) {
            this.protocols = Objects.requireNonNull(protocols);
            return this;
        }

        public Builder trustStore(String trustStore) {
            this.trustStore = Objects.requireNonNull(trustStore);
            return this;
        }
        public GoogleCloudApigeeV1TlsInfoResponse build() {
            return new GoogleCloudApigeeV1TlsInfoResponse(ciphers, clientAuthEnabled, commonName, enabled, ignoreValidationErrors, keyAlias, keyStore, protocols, trustStore);
        }
    }
}
