// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the client certificate details using common name.
 * 
 */
public final class ClientCertificateCommonNameResponse extends com.pulumi.resources.InvokeArgs {

    public static final ClientCertificateCommonNameResponse Empty = new ClientCertificateCommonNameResponse();

    /**
     * The common name of the client certificate.
     * 
     */
    @Import(name="certificateCommonName", required=true)
    private String certificateCommonName;

    /**
     * @return The common name of the client certificate.
     * 
     */
    public String certificateCommonName() {
        return this.certificateCommonName;
    }

    /**
     * The issuer thumbprint of the client certificate.
     * 
     */
    @Import(name="certificateIssuerThumbprint", required=true)
    private String certificateIssuerThumbprint;

    /**
     * @return The issuer thumbprint of the client certificate.
     * 
     */
    public String certificateIssuerThumbprint() {
        return this.certificateIssuerThumbprint;
    }

    /**
     * Indicates if the client certificate has admin access to the cluster. Non admin clients can perform only read only operations on the cluster.
     * 
     */
    @Import(name="isAdmin", required=true)
    private Boolean isAdmin;

    /**
     * @return Indicates if the client certificate has admin access to the cluster. Non admin clients can perform only read only operations on the cluster.
     * 
     */
    public Boolean isAdmin() {
        return this.isAdmin;
    }

    private ClientCertificateCommonNameResponse() {}

    private ClientCertificateCommonNameResponse(ClientCertificateCommonNameResponse $) {
        this.certificateCommonName = $.certificateCommonName;
        this.certificateIssuerThumbprint = $.certificateIssuerThumbprint;
        this.isAdmin = $.isAdmin;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientCertificateCommonNameResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientCertificateCommonNameResponse $;

        public Builder() {
            $ = new ClientCertificateCommonNameResponse();
        }

        public Builder(ClientCertificateCommonNameResponse defaults) {
            $ = new ClientCertificateCommonNameResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateCommonName The common name of the client certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateCommonName(String certificateCommonName) {
            $.certificateCommonName = certificateCommonName;
            return this;
        }

        /**
         * @param certificateIssuerThumbprint The issuer thumbprint of the client certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateIssuerThumbprint(String certificateIssuerThumbprint) {
            $.certificateIssuerThumbprint = certificateIssuerThumbprint;
            return this;
        }

        /**
         * @param isAdmin Indicates if the client certificate has admin access to the cluster. Non admin clients can perform only read only operations on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder isAdmin(Boolean isAdmin) {
            $.isAdmin = isAdmin;
            return this;
        }

        public ClientCertificateCommonNameResponse build() {
            $.certificateCommonName = Objects.requireNonNull($.certificateCommonName, "expected parameter 'certificateCommonName' to be non-null");
            $.certificateIssuerThumbprint = Objects.requireNonNull($.certificateIssuerThumbprint, "expected parameter 'certificateIssuerThumbprint' to be non-null");
            $.isAdmin = Objects.requireNonNull($.isAdmin, "expected parameter 'isAdmin' to be non-null");
            return $;
        }
    }

}
