// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VPN client revoked certificate of virtual network gateway.
 * 
 */
public final class VpnClientRevokedCertificateResponse extends io.pulumi.resources.InvokeArgs {

    public static final VpnClientRevokedCertificateResponse Empty = new VpnClientRevokedCertificateResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the VPN client revoked certificate resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The revoked VPN client certificate thumbprint.
     * 
     */
    @InputImport(name="thumbprint")
      private final @Nullable String thumbprint;

    public Optional<String> getThumbprint() {
        return this.thumbprint == null ? Optional.empty() : Optional.ofNullable(this.thumbprint);
    }

    public VpnClientRevokedCertificateResponse(
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        @Nullable String thumbprint) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.thumbprint = thumbprint;
    }

    private VpnClientRevokedCertificateResponse() {
        this.etag = null;
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.thumbprint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnClientRevokedCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnClientRevokedCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        public VpnClientRevokedCertificateResponse build() {
            return new VpnClientRevokedCertificateResponse(etag, id, name, provisioningState, thumbprint);
        }
    }
}
