// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Client Certificate definition.
 * 
 */
public final class ClientCertificateResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClientCertificateResponse Empty = new ClientCertificateResponse();

    /**
     * Certificate Common name.
     * 
     */
    @InputImport(name="commonName")
      private final @Nullable String commonName;

    public Optional<String> getCommonName() {
        return this.commonName == null ? Optional.empty() : Optional.ofNullable(this.commonName);
    }

    /**
     * Whether the certificate is admin or not.
     * 
     */
    @InputImport(name="isAdmin", required=true)
      private final Boolean isAdmin;

    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    /**
     * Issuer thumbprint for the certificate. Only used together with CommonName.
     * 
     */
    @InputImport(name="issuerThumbprint")
      private final @Nullable String issuerThumbprint;

    public Optional<String> getIssuerThumbprint() {
        return this.issuerThumbprint == null ? Optional.empty() : Optional.ofNullable(this.issuerThumbprint);
    }

    /**
     * Certificate Thumbprint.
     * 
     */
    @InputImport(name="thumbprint")
      private final @Nullable String thumbprint;

    public Optional<String> getThumbprint() {
        return this.thumbprint == null ? Optional.empty() : Optional.ofNullable(this.thumbprint);
    }

    public ClientCertificateResponse(
        @Nullable String commonName,
        Boolean isAdmin,
        @Nullable String issuerThumbprint,
        @Nullable String thumbprint) {
        this.commonName = commonName;
        this.isAdmin = Objects.requireNonNull(isAdmin, "expected parameter 'isAdmin' to be non-null");
        this.issuerThumbprint = issuerThumbprint;
        this.thumbprint = thumbprint;
    }

    private ClientCertificateResponse() {
        this.commonName = null;
        this.isAdmin = null;
        this.issuerThumbprint = null;
        this.thumbprint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String commonName;
        private Boolean isAdmin;
        private @Nullable String issuerThumbprint;
        private @Nullable String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonName = defaults.commonName;
    	      this.isAdmin = defaults.isAdmin;
    	      this.issuerThumbprint = defaults.issuerThumbprint;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder commonName(@Nullable String commonName) {
            this.commonName = commonName;
            return this;
        }

        public Builder isAdmin(Boolean isAdmin) {
            this.isAdmin = Objects.requireNonNull(isAdmin);
            return this;
        }

        public Builder issuerThumbprint(@Nullable String issuerThumbprint) {
            this.issuerThumbprint = issuerThumbprint;
            return this;
        }

        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        public ClientCertificateResponse build() {
            return new ClientCertificateResponse(commonName, isAdmin, issuerThumbprint, thumbprint);
        }
    }
}
