// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1TlsInfoCommonNameResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1TlsInfoResponse {
    /**
     * The SSL/TLS cipher suites to be used. Must be one of the cipher suite names listed in: http://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#ciphersuites
     * 
     */
    private final List<String> ciphers;
    /**
     * Optional. Enables two-way TLS.
     * 
     */
    private final Boolean clientAuthEnabled;
    /**
     * The TLS Common Name of the certificate.
     * 
     */
    private final GoogleCloudApigeeV1TlsInfoCommonNameResponse commonName;
    /**
     * Enables TLS. If false, neither one-way nor two-way TLS will be enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * If true, Edge ignores TLS certificate errors. Valid when configuring TLS for target servers and target endpoints, and when configuring virtual hosts that use 2-way TLS. When used with a target endpoint/target server, if the backend system uses SNI and returns a cert with a subject Distinguished Name (DN) that does not match the hostname, there is no way to ignore the error and the connection fails.
     * 
     */
    private final Boolean ignoreValidationErrors;
    /**
     * Required if `client_auth_enabled` is true. The resource ID for the alias containing the private key and cert.
     * 
     */
    private final String keyAlias;
    /**
     * Required if `client_auth_enabled` is true. The resource ID of the keystore.
     * 
     */
    private final String keyStore;
    /**
     * The TLS versioins to be used.
     * 
     */
    private final List<String> protocols;
    /**
     * The resource ID of the truststore.
     * 
     */
    private final String trustStore;

    @OutputCustomType.Constructor({"ciphers","clientAuthEnabled","commonName","enabled","ignoreValidationErrors","keyAlias","keyStore","protocols","trustStore"})
    private GoogleCloudApigeeV1TlsInfoResponse(
        List<String> ciphers,
        Boolean clientAuthEnabled,
        GoogleCloudApigeeV1TlsInfoCommonNameResponse commonName,
        Boolean enabled,
        Boolean ignoreValidationErrors,
        String keyAlias,
        String keyStore,
        List<String> protocols,
        String trustStore) {
        this.ciphers = Objects.requireNonNull(ciphers);
        this.clientAuthEnabled = Objects.requireNonNull(clientAuthEnabled);
        this.commonName = Objects.requireNonNull(commonName);
        this.enabled = Objects.requireNonNull(enabled);
        this.ignoreValidationErrors = Objects.requireNonNull(ignoreValidationErrors);
        this.keyAlias = Objects.requireNonNull(keyAlias);
        this.keyStore = Objects.requireNonNull(keyStore);
        this.protocols = Objects.requireNonNull(protocols);
        this.trustStore = Objects.requireNonNull(trustStore);
    }

    /**
     * The SSL/TLS cipher suites to be used. Must be one of the cipher suite names listed in: http://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#ciphersuites
     * 
     */
    public List<String> getCiphers() {
        return this.ciphers;
    }
    /**
     * Optional. Enables two-way TLS.
     * 
     */
    public Boolean getClientAuthEnabled() {
        return this.clientAuthEnabled;
    }
    /**
     * The TLS Common Name of the certificate.
     * 
     */
    public GoogleCloudApigeeV1TlsInfoCommonNameResponse getCommonName() {
        return this.commonName;
    }
    /**
     * Enables TLS. If false, neither one-way nor two-way TLS will be enabled.
     * 
     */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * If true, Edge ignores TLS certificate errors. Valid when configuring TLS for target servers and target endpoints, and when configuring virtual hosts that use 2-way TLS. When used with a target endpoint/target server, if the backend system uses SNI and returns a cert with a subject Distinguished Name (DN) that does not match the hostname, there is no way to ignore the error and the connection fails.
     * 
     */
    public Boolean getIgnoreValidationErrors() {
        return this.ignoreValidationErrors;
    }
    /**
     * Required if `client_auth_enabled` is true. The resource ID for the alias containing the private key and cert.
     * 
     */
    public String getKeyAlias() {
        return this.keyAlias;
    }
    /**
     * Required if `client_auth_enabled` is true. The resource ID of the keystore.
     * 
     */
    public String getKeyStore() {
        return this.keyStore;
    }
    /**
     * The TLS versioins to be used.
     * 
     */
    public List<String> getProtocols() {
        return this.protocols;
    }
    /**
     * The resource ID of the truststore.
     * 
     */
    public String getTrustStore() {
        return this.trustStore;
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

        public Builder setCiphers(List<String> ciphers) {
            this.ciphers = Objects.requireNonNull(ciphers);
            return this;
        }

        public Builder setClientAuthEnabled(Boolean clientAuthEnabled) {
            this.clientAuthEnabled = Objects.requireNonNull(clientAuthEnabled);
            return this;
        }

        public Builder setCommonName(GoogleCloudApigeeV1TlsInfoCommonNameResponse commonName) {
            this.commonName = Objects.requireNonNull(commonName);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setIgnoreValidationErrors(Boolean ignoreValidationErrors) {
            this.ignoreValidationErrors = Objects.requireNonNull(ignoreValidationErrors);
            return this;
        }

        public Builder setKeyAlias(String keyAlias) {
            this.keyAlias = Objects.requireNonNull(keyAlias);
            return this;
        }

        public Builder setKeyStore(String keyStore) {
            this.keyStore = Objects.requireNonNull(keyStore);
            return this;
        }

        public Builder setProtocols(List<String> protocols) {
            this.protocols = Objects.requireNonNull(protocols);
            return this;
        }

        public Builder setTrustStore(String trustStore) {
            this.trustStore = Objects.requireNonNull(trustStore);
            return this;
        }

        public GoogleCloudApigeeV1TlsInfoResponse build() {
            return new GoogleCloudApigeeV1TlsInfoResponse(ciphers, clientAuthEnabled, commonName, enabled, ignoreValidationErrors, keyAlias, keyStore, protocols, trustStore);
        }
    }
}
