// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrestoLinkedServiceResponse {
    private final @Nullable Object allowHostNameCNMismatch;
    private final @Nullable Object allowSelfSignedServerCert;
    private final @Nullable List<Object> annotations;
    private final String authenticationType;
    private final Object catalog;
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    private final @Nullable String description;
    private final @Nullable Object enableSsl;
    private final @Nullable Object encryptedCredential;
    private final Object host;
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    private final @Nullable Object port;
    private final Object serverVersion;
    private final @Nullable Object timeZoneID;
    private final @Nullable Object trustedCertPath;
    private final String type;
    private final @Nullable Object useSystemTrustStore;
    private final @Nullable Object username;

    @OutputCustomType.Constructor({"allowHostNameCNMismatch","allowSelfSignedServerCert","annotations","authenticationType","catalog","connectVia","description","enableSsl","encryptedCredential","host","parameters","password","port","serverVersion","timeZoneID","trustedCertPath","type","useSystemTrustStore","username"})
    private PrestoLinkedServiceResponse(
        @Nullable Object allowHostNameCNMismatch,
        @Nullable Object allowSelfSignedServerCert,
        @Nullable List<Object> annotations,
        String authenticationType,
        Object catalog,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object enableSsl,
        @Nullable Object encryptedCredential,
        Object host,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Object port,
        Object serverVersion,
        @Nullable Object timeZoneID,
        @Nullable Object trustedCertPath,
        String type,
        @Nullable Object useSystemTrustStore,
        @Nullable Object username) {
        this.allowHostNameCNMismatch = allowHostNameCNMismatch;
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        this.annotations = annotations;
        this.authenticationType = Objects.requireNonNull(authenticationType);
        this.catalog = Objects.requireNonNull(catalog);
        this.connectVia = connectVia;
        this.description = description;
        this.enableSsl = enableSsl;
        this.encryptedCredential = encryptedCredential;
        this.host = Objects.requireNonNull(host);
        this.parameters = parameters;
        this.password = password;
        this.port = port;
        this.serverVersion = Objects.requireNonNull(serverVersion);
        this.timeZoneID = timeZoneID;
        this.trustedCertPath = trustedCertPath;
        this.type = Objects.requireNonNull(type);
        this.useSystemTrustStore = useSystemTrustStore;
        this.username = username;
    }

    public Optional<Object> getAllowHostNameCNMismatch() {
        return Optional.ofNullable(this.allowHostNameCNMismatch);
    }
    public Optional<Object> getAllowSelfSignedServerCert() {
        return Optional.ofNullable(this.allowSelfSignedServerCert);
    }
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }
    public Object getCatalog() {
        return this.catalog;
    }
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Object> getEnableSsl() {
        return Optional.ofNullable(this.enableSsl);
    }
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    public Object getHost() {
        return this.host;
    }
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPassword() {
        return Optional.ofNullable(this.password);
    }
    public Optional<Object> getPort() {
        return Optional.ofNullable(this.port);
    }
    public Object getServerVersion() {
        return this.serverVersion;
    }
    public Optional<Object> getTimeZoneID() {
        return Optional.ofNullable(this.timeZoneID);
    }
    public Optional<Object> getTrustedCertPath() {
        return Optional.ofNullable(this.trustedCertPath);
    }
    public String getType() {
        return this.type;
    }
    public Optional<Object> getUseSystemTrustStore() {
        return Optional.ofNullable(this.useSystemTrustStore);
    }
    public Optional<Object> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrestoLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object allowHostNameCNMismatch;
        private @Nullable Object allowSelfSignedServerCert;
        private @Nullable List<Object> annotations;
        private String authenticationType;
        private Object catalog;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object enableSsl;
        private @Nullable Object encryptedCredential;
        private Object host;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Object port;
        private Object serverVersion;
        private @Nullable Object timeZoneID;
        private @Nullable Object trustedCertPath;
        private String type;
        private @Nullable Object useSystemTrustStore;
        private @Nullable Object username;

        public Builder() {
    	      // Empty
        }

        public Builder(PrestoLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowHostNameCNMismatch = defaults.allowHostNameCNMismatch;
    	      this.allowSelfSignedServerCert = defaults.allowSelfSignedServerCert;
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.catalog = defaults.catalog;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.enableSsl = defaults.enableSsl;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.serverVersion = defaults.serverVersion;
    	      this.timeZoneID = defaults.timeZoneID;
    	      this.trustedCertPath = defaults.trustedCertPath;
    	      this.type = defaults.type;
    	      this.useSystemTrustStore = defaults.useSystemTrustStore;
    	      this.username = defaults.username;
        }

        public Builder setAllowHostNameCNMismatch(@Nullable Object allowHostNameCNMismatch) {
            this.allowHostNameCNMismatch = allowHostNameCNMismatch;
            return this;
        }

        public Builder setAllowSelfSignedServerCert(@Nullable Object allowSelfSignedServerCert) {
            this.allowSelfSignedServerCert = allowSelfSignedServerCert;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAuthenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setCatalog(Object catalog) {
            this.catalog = Objects.requireNonNull(catalog);
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEnableSsl(@Nullable Object enableSsl) {
            this.enableSsl = enableSsl;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setHost(Object host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }

        public Builder setPort(@Nullable Object port) {
            this.port = port;
            return this;
        }

        public Builder setServerVersion(Object serverVersion) {
            this.serverVersion = Objects.requireNonNull(serverVersion);
            return this;
        }

        public Builder setTimeZoneID(@Nullable Object timeZoneID) {
            this.timeZoneID = timeZoneID;
            return this;
        }

        public Builder setTrustedCertPath(@Nullable Object trustedCertPath) {
            this.trustedCertPath = trustedCertPath;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUseSystemTrustStore(@Nullable Object useSystemTrustStore) {
            this.useSystemTrustStore = useSystemTrustStore;
            return this;
        }

        public Builder setUsername(@Nullable Object username) {
            this.username = username;
            return this;
        }

        public PrestoLinkedServiceResponse build() {
            return new PrestoLinkedServiceResponse(allowHostNameCNMismatch, allowSelfSignedServerCert, annotations, authenticationType, catalog, connectVia, description, enableSsl, encryptedCredential, host, parameters, password, port, serverVersion, timeZoneID, trustedCertPath, type, useSystemTrustStore, username);
        }
    }
}
