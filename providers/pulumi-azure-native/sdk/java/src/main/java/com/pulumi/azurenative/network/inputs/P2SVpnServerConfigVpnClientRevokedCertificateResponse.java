// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VPN client revoked certificate of P2SVpnServerConfiguration.
 * 
 */
public final class P2SVpnServerConfigVpnClientRevokedCertificateResponse extends com.pulumi.resources.InvokeArgs {

    public static final P2SVpnServerConfigVpnClientRevokedCertificateResponse Empty = new P2SVpnServerConfigVpnClientRevokedCertificateResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag")
    private @Nullable String etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the VPN client revoked certificate resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return The provisioning state of the VPN client revoked certificate resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The revoked VPN client certificate thumbprint.
     * 
     */
    @Import(name="thumbprint")
    private @Nullable String thumbprint;

    /**
     * @return The revoked VPN client certificate thumbprint.
     * 
     */
    public Optional<String> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    private P2SVpnServerConfigVpnClientRevokedCertificateResponse() {}

    private P2SVpnServerConfigVpnClientRevokedCertificateResponse(P2SVpnServerConfigVpnClientRevokedCertificateResponse $) {
        this.etag = $.etag;
        this.id = $.id;
        this.name = $.name;
        this.provisioningState = $.provisioningState;
        this.thumbprint = $.thumbprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(P2SVpnServerConfigVpnClientRevokedCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private P2SVpnServerConfigVpnClientRevokedCertificateResponse $;

        public Builder() {
            $ = new P2SVpnServerConfigVpnClientRevokedCertificateResponse();
        }

        public Builder(P2SVpnServerConfigVpnClientRevokedCertificateResponse defaults) {
            $ = new P2SVpnServerConfigVpnClientRevokedCertificateResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param etag A unique read-only string that changes whenever the resource is updated.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable String etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param provisioningState The provisioning state of the VPN client revoked certificate resource.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param thumbprint The revoked VPN client certificate thumbprint.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(@Nullable String thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        public P2SVpnServerConfigVpnClientRevokedCertificateResponse build() {
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
