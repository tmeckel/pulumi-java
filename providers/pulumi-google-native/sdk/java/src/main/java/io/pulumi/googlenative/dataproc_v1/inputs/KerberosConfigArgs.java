// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies Kerberos related configuration.
 * 
 */
public final class KerberosConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final KerberosConfigArgs Empty = new KerberosConfigArgs();

    /**
     * Optional. The admin server (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    @Import(name="crossRealmTrustAdminServer")
      private final @Nullable Output<String> crossRealmTrustAdminServer;

    public Output<String> getCrossRealmTrustAdminServer() {
        return this.crossRealmTrustAdminServer == null ? Codegen.empty() : this.crossRealmTrustAdminServer;
    }

    /**
     * Optional. The KDC (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    @Import(name="crossRealmTrustKdc")
      private final @Nullable Output<String> crossRealmTrustKdc;

    public Output<String> getCrossRealmTrustKdc() {
        return this.crossRealmTrustKdc == null ? Codegen.empty() : this.crossRealmTrustKdc;
    }

    /**
     * Optional. The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross realm trust.
     * 
     */
    @Import(name="crossRealmTrustRealm")
      private final @Nullable Output<String> crossRealmTrustRealm;

    public Output<String> getCrossRealmTrustRealm() {
        return this.crossRealmTrustRealm == null ? Codegen.empty() : this.crossRealmTrustRealm;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the shared password between the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust relationship.
     * 
     */
    @Import(name="crossRealmTrustSharedPasswordUri")
      private final @Nullable Output<String> crossRealmTrustSharedPasswordUri;

    public Output<String> getCrossRealmTrustSharedPasswordUri() {
        return this.crossRealmTrustSharedPasswordUri == null ? Codegen.empty() : this.crossRealmTrustSharedPasswordUri;
    }

    /**
     * Optional. Flag to indicate whether to Kerberize the cluster (default: false). Set this field to true to enable Kerberos on a cluster.
     * 
     */
    @Import(name="enableKerberos")
      private final @Nullable Output<Boolean> enableKerberos;

    public Output<Boolean> getEnableKerberos() {
        return this.enableKerberos == null ? Codegen.empty() : this.enableKerberos;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC database.
     * 
     */
    @Import(name="kdcDbKeyUri")
      private final @Nullable Output<String> kdcDbKeyUri;

    public Output<String> getKdcDbKeyUri() {
        return this.kdcDbKeyUri == null ? Codegen.empty() : this.kdcDbKeyUri;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided key. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    @Import(name="keyPasswordUri")
      private final @Nullable Output<String> keyPasswordUri;

    public Output<String> getKeyPasswordUri() {
        return this.keyPasswordUri == null ? Codegen.empty() : this.keyPasswordUri;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided keystore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    @Import(name="keystorePasswordUri")
      private final @Nullable Output<String> keystorePasswordUri;

    public Output<String> getKeystorePasswordUri() {
        return this.keystorePasswordUri == null ? Codegen.empty() : this.keystorePasswordUri;
    }

    /**
     * Optional. The Cloud Storage URI of the keystore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    @Import(name="keystoreUri")
      private final @Nullable Output<String> keystoreUri;

    public Output<String> getKeystoreUri() {
        return this.keystoreUri == null ? Codegen.empty() : this.keystoreUri;
    }

    /**
     * Optional. The uri of the KMS key used to encrypt various sensitive files.
     * 
     */
    @Import(name="kmsKeyUri")
      private final @Nullable Output<String> kmsKeyUri;

    public Output<String> getKmsKeyUri() {
        return this.kmsKeyUri == null ? Codegen.empty() : this.kmsKeyUri;
    }

    /**
     * Optional. The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of hostnames will be the realm.
     * 
     */
    @Import(name="realm")
      private final @Nullable Output<String> realm;

    public Output<String> getRealm() {
        return this.realm == null ? Codegen.empty() : this.realm;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the root principal password.
     * 
     */
    @Import(name="rootPrincipalPasswordUri")
      private final @Nullable Output<String> rootPrincipalPasswordUri;

    public Output<String> getRootPrincipalPasswordUri() {
        return this.rootPrincipalPasswordUri == null ? Codegen.empty() : this.rootPrincipalPasswordUri;
    }

    /**
     * Optional. The lifetime of the ticket granting ticket, in hours. If not specified, or user specifies 0, then default value 10 will be used.
     * 
     */
    @Import(name="tgtLifetimeHours")
      private final @Nullable Output<Integer> tgtLifetimeHours;

    public Output<Integer> getTgtLifetimeHours() {
        return this.tgtLifetimeHours == null ? Codegen.empty() : this.tgtLifetimeHours;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided truststore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    @Import(name="truststorePasswordUri")
      private final @Nullable Output<String> truststorePasswordUri;

    public Output<String> getTruststorePasswordUri() {
        return this.truststorePasswordUri == null ? Codegen.empty() : this.truststorePasswordUri;
    }

    /**
     * Optional. The Cloud Storage URI of the truststore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    @Import(name="truststoreUri")
      private final @Nullable Output<String> truststoreUri;

    public Output<String> getTruststoreUri() {
        return this.truststoreUri == null ? Codegen.empty() : this.truststoreUri;
    }

    public KerberosConfigArgs(
        @Nullable Output<String> crossRealmTrustAdminServer,
        @Nullable Output<String> crossRealmTrustKdc,
        @Nullable Output<String> crossRealmTrustRealm,
        @Nullable Output<String> crossRealmTrustSharedPasswordUri,
        @Nullable Output<Boolean> enableKerberos,
        @Nullable Output<String> kdcDbKeyUri,
        @Nullable Output<String> keyPasswordUri,
        @Nullable Output<String> keystorePasswordUri,
        @Nullable Output<String> keystoreUri,
        @Nullable Output<String> kmsKeyUri,
        @Nullable Output<String> realm,
        @Nullable Output<String> rootPrincipalPasswordUri,
        @Nullable Output<Integer> tgtLifetimeHours,
        @Nullable Output<String> truststorePasswordUri,
        @Nullable Output<String> truststoreUri) {
        this.crossRealmTrustAdminServer = crossRealmTrustAdminServer;
        this.crossRealmTrustKdc = crossRealmTrustKdc;
        this.crossRealmTrustRealm = crossRealmTrustRealm;
        this.crossRealmTrustSharedPasswordUri = crossRealmTrustSharedPasswordUri;
        this.enableKerberos = enableKerberos;
        this.kdcDbKeyUri = kdcDbKeyUri;
        this.keyPasswordUri = keyPasswordUri;
        this.keystorePasswordUri = keystorePasswordUri;
        this.keystoreUri = keystoreUri;
        this.kmsKeyUri = kmsKeyUri;
        this.realm = realm;
        this.rootPrincipalPasswordUri = rootPrincipalPasswordUri;
        this.tgtLifetimeHours = tgtLifetimeHours;
        this.truststorePasswordUri = truststorePasswordUri;
        this.truststoreUri = truststoreUri;
    }

    private KerberosConfigArgs() {
        this.crossRealmTrustAdminServer = Codegen.empty();
        this.crossRealmTrustKdc = Codegen.empty();
        this.crossRealmTrustRealm = Codegen.empty();
        this.crossRealmTrustSharedPasswordUri = Codegen.empty();
        this.enableKerberos = Codegen.empty();
        this.kdcDbKeyUri = Codegen.empty();
        this.keyPasswordUri = Codegen.empty();
        this.keystorePasswordUri = Codegen.empty();
        this.keystoreUri = Codegen.empty();
        this.kmsKeyUri = Codegen.empty();
        this.realm = Codegen.empty();
        this.rootPrincipalPasswordUri = Codegen.empty();
        this.tgtLifetimeHours = Codegen.empty();
        this.truststorePasswordUri = Codegen.empty();
        this.truststoreUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KerberosConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> crossRealmTrustAdminServer;
        private @Nullable Output<String> crossRealmTrustKdc;
        private @Nullable Output<String> crossRealmTrustRealm;
        private @Nullable Output<String> crossRealmTrustSharedPasswordUri;
        private @Nullable Output<Boolean> enableKerberos;
        private @Nullable Output<String> kdcDbKeyUri;
        private @Nullable Output<String> keyPasswordUri;
        private @Nullable Output<String> keystorePasswordUri;
        private @Nullable Output<String> keystoreUri;
        private @Nullable Output<String> kmsKeyUri;
        private @Nullable Output<String> realm;
        private @Nullable Output<String> rootPrincipalPasswordUri;
        private @Nullable Output<Integer> tgtLifetimeHours;
        private @Nullable Output<String> truststorePasswordUri;
        private @Nullable Output<String> truststoreUri;

        public Builder() {
    	      // Empty
        }

        public Builder(KerberosConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crossRealmTrustAdminServer = defaults.crossRealmTrustAdminServer;
    	      this.crossRealmTrustKdc = defaults.crossRealmTrustKdc;
    	      this.crossRealmTrustRealm = defaults.crossRealmTrustRealm;
    	      this.crossRealmTrustSharedPasswordUri = defaults.crossRealmTrustSharedPasswordUri;
    	      this.enableKerberos = defaults.enableKerberos;
    	      this.kdcDbKeyUri = defaults.kdcDbKeyUri;
    	      this.keyPasswordUri = defaults.keyPasswordUri;
    	      this.keystorePasswordUri = defaults.keystorePasswordUri;
    	      this.keystoreUri = defaults.keystoreUri;
    	      this.kmsKeyUri = defaults.kmsKeyUri;
    	      this.realm = defaults.realm;
    	      this.rootPrincipalPasswordUri = defaults.rootPrincipalPasswordUri;
    	      this.tgtLifetimeHours = defaults.tgtLifetimeHours;
    	      this.truststorePasswordUri = defaults.truststorePasswordUri;
    	      this.truststoreUri = defaults.truststoreUri;
        }

        public Builder crossRealmTrustAdminServer(@Nullable Output<String> crossRealmTrustAdminServer) {
            this.crossRealmTrustAdminServer = crossRealmTrustAdminServer;
            return this;
        }
        public Builder crossRealmTrustAdminServer(@Nullable String crossRealmTrustAdminServer) {
            this.crossRealmTrustAdminServer = Codegen.ofNullable(crossRealmTrustAdminServer);
            return this;
        }
        public Builder crossRealmTrustKdc(@Nullable Output<String> crossRealmTrustKdc) {
            this.crossRealmTrustKdc = crossRealmTrustKdc;
            return this;
        }
        public Builder crossRealmTrustKdc(@Nullable String crossRealmTrustKdc) {
            this.crossRealmTrustKdc = Codegen.ofNullable(crossRealmTrustKdc);
            return this;
        }
        public Builder crossRealmTrustRealm(@Nullable Output<String> crossRealmTrustRealm) {
            this.crossRealmTrustRealm = crossRealmTrustRealm;
            return this;
        }
        public Builder crossRealmTrustRealm(@Nullable String crossRealmTrustRealm) {
            this.crossRealmTrustRealm = Codegen.ofNullable(crossRealmTrustRealm);
            return this;
        }
        public Builder crossRealmTrustSharedPasswordUri(@Nullable Output<String> crossRealmTrustSharedPasswordUri) {
            this.crossRealmTrustSharedPasswordUri = crossRealmTrustSharedPasswordUri;
            return this;
        }
        public Builder crossRealmTrustSharedPasswordUri(@Nullable String crossRealmTrustSharedPasswordUri) {
            this.crossRealmTrustSharedPasswordUri = Codegen.ofNullable(crossRealmTrustSharedPasswordUri);
            return this;
        }
        public Builder enableKerberos(@Nullable Output<Boolean> enableKerberos) {
            this.enableKerberos = enableKerberos;
            return this;
        }
        public Builder enableKerberos(@Nullable Boolean enableKerberos) {
            this.enableKerberos = Codegen.ofNullable(enableKerberos);
            return this;
        }
        public Builder kdcDbKeyUri(@Nullable Output<String> kdcDbKeyUri) {
            this.kdcDbKeyUri = kdcDbKeyUri;
            return this;
        }
        public Builder kdcDbKeyUri(@Nullable String kdcDbKeyUri) {
            this.kdcDbKeyUri = Codegen.ofNullable(kdcDbKeyUri);
            return this;
        }
        public Builder keyPasswordUri(@Nullable Output<String> keyPasswordUri) {
            this.keyPasswordUri = keyPasswordUri;
            return this;
        }
        public Builder keyPasswordUri(@Nullable String keyPasswordUri) {
            this.keyPasswordUri = Codegen.ofNullable(keyPasswordUri);
            return this;
        }
        public Builder keystorePasswordUri(@Nullable Output<String> keystorePasswordUri) {
            this.keystorePasswordUri = keystorePasswordUri;
            return this;
        }
        public Builder keystorePasswordUri(@Nullable String keystorePasswordUri) {
            this.keystorePasswordUri = Codegen.ofNullable(keystorePasswordUri);
            return this;
        }
        public Builder keystoreUri(@Nullable Output<String> keystoreUri) {
            this.keystoreUri = keystoreUri;
            return this;
        }
        public Builder keystoreUri(@Nullable String keystoreUri) {
            this.keystoreUri = Codegen.ofNullable(keystoreUri);
            return this;
        }
        public Builder kmsKeyUri(@Nullable Output<String> kmsKeyUri) {
            this.kmsKeyUri = kmsKeyUri;
            return this;
        }
        public Builder kmsKeyUri(@Nullable String kmsKeyUri) {
            this.kmsKeyUri = Codegen.ofNullable(kmsKeyUri);
            return this;
        }
        public Builder realm(@Nullable Output<String> realm) {
            this.realm = realm;
            return this;
        }
        public Builder realm(@Nullable String realm) {
            this.realm = Codegen.ofNullable(realm);
            return this;
        }
        public Builder rootPrincipalPasswordUri(@Nullable Output<String> rootPrincipalPasswordUri) {
            this.rootPrincipalPasswordUri = rootPrincipalPasswordUri;
            return this;
        }
        public Builder rootPrincipalPasswordUri(@Nullable String rootPrincipalPasswordUri) {
            this.rootPrincipalPasswordUri = Codegen.ofNullable(rootPrincipalPasswordUri);
            return this;
        }
        public Builder tgtLifetimeHours(@Nullable Output<Integer> tgtLifetimeHours) {
            this.tgtLifetimeHours = tgtLifetimeHours;
            return this;
        }
        public Builder tgtLifetimeHours(@Nullable Integer tgtLifetimeHours) {
            this.tgtLifetimeHours = Codegen.ofNullable(tgtLifetimeHours);
            return this;
        }
        public Builder truststorePasswordUri(@Nullable Output<String> truststorePasswordUri) {
            this.truststorePasswordUri = truststorePasswordUri;
            return this;
        }
        public Builder truststorePasswordUri(@Nullable String truststorePasswordUri) {
            this.truststorePasswordUri = Codegen.ofNullable(truststorePasswordUri);
            return this;
        }
        public Builder truststoreUri(@Nullable Output<String> truststoreUri) {
            this.truststoreUri = truststoreUri;
            return this;
        }
        public Builder truststoreUri(@Nullable String truststoreUri) {
            this.truststoreUri = Codegen.ofNullable(truststoreUri);
            return this;
        }        public KerberosConfigArgs build() {
            return new KerberosConfigArgs(crossRealmTrustAdminServer, crossRealmTrustKdc, crossRealmTrustRealm, crossRealmTrustSharedPasswordUri, enableKerberos, kdcDbKeyUri, keyPasswordUri, keystorePasswordUri, keystoreUri, kmsKeyUri, realm, rootPrincipalPasswordUri, tgtLifetimeHours, truststorePasswordUri, truststoreUri);
        }
    }
}
