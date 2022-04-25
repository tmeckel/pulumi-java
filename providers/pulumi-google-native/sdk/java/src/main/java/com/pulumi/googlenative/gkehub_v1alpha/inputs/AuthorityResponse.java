// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Authority encodes how Google will recognize identities from this Membership. See the workload identity documentation for more details: https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
 * 
 */
public final class AuthorityResponse extends com.pulumi.resources.InvokeArgs {

    public static final AuthorityResponse Empty = new AuthorityResponse();

    /**
     * An identity provider that reflects the `issuer` in the workload identity pool.
     * 
     */
    @Import(name="identityProvider", required=true)
    private String identityProvider;

    /**
     * @return An identity provider that reflects the `issuer` in the workload identity pool.
     * 
     */
    public String identityProvider() {
        return this.identityProvider;
    }

    /**
     * Optional. A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://` and be a valid URL with length &lt;2000 characters. If set, then Google will allow valid OIDC tokens from this issuer to authenticate within the workload_identity_pool. OIDC discovery will be performed on this URI to validate tokens from the issuer. Clearing `issuer` disables Workload Identity. `issuer` cannot be directly modified; it must be cleared (and Workload Identity disabled) before using a new issuer (and re-enabling Workload Identity).
     * 
     */
    @Import(name="issuer", required=true)
    private String issuer;

    /**
     * @return Optional. A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://` and be a valid URL with length &lt;2000 characters. If set, then Google will allow valid OIDC tokens from this issuer to authenticate within the workload_identity_pool. OIDC discovery will be performed on this URI to validate tokens from the issuer. Clearing `issuer` disables Workload Identity. `issuer` cannot be directly modified; it must be cleared (and Workload Identity disabled) before using a new issuer (and re-enabling Workload Identity).
     * 
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Optional. OIDC verification keys for this Membership in JWKS format (RFC 7517). When this field is set, OIDC discovery will NOT be performed on `issuer`, and instead OIDC tokens will be validated using this field.
     * 
     */
    @Import(name="oidcJwks", required=true)
    private String oidcJwks;

    /**
     * @return Optional. OIDC verification keys for this Membership in JWKS format (RFC 7517). When this field is set, OIDC discovery will NOT be performed on `issuer`, and instead OIDC tokens will be validated using this field.
     * 
     */
    public String oidcJwks() {
        return this.oidcJwks;
    }

    /**
     * The name of the workload identity pool in which `issuer` will be recognized. There is a single Workload Identity Pool per Hub that is shared between all Memberships that belong to that Hub. For a Hub hosted in {PROJECT_ID}, the workload pool format is `{PROJECT_ID}.hub.id.goog`, although this is subject to change in newer versions of this API.
     * 
     */
    @Import(name="workloadIdentityPool", required=true)
    private String workloadIdentityPool;

    /**
     * @return The name of the workload identity pool in which `issuer` will be recognized. There is a single Workload Identity Pool per Hub that is shared between all Memberships that belong to that Hub. For a Hub hosted in {PROJECT_ID}, the workload pool format is `{PROJECT_ID}.hub.id.goog`, although this is subject to change in newer versions of this API.
     * 
     */
    public String workloadIdentityPool() {
        return this.workloadIdentityPool;
    }

    private AuthorityResponse() {}

    private AuthorityResponse(AuthorityResponse $) {
        this.identityProvider = $.identityProvider;
        this.issuer = $.issuer;
        this.oidcJwks = $.oidcJwks;
        this.workloadIdentityPool = $.workloadIdentityPool;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthorityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorityResponse $;

        public Builder() {
            $ = new AuthorityResponse();
        }

        public Builder(AuthorityResponse defaults) {
            $ = new AuthorityResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityProvider An identity provider that reflects the `issuer` in the workload identity pool.
         * 
         * @return builder
         * 
         */
        public Builder identityProvider(String identityProvider) {
            $.identityProvider = identityProvider;
            return this;
        }

        /**
         * @param issuer Optional. A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://` and be a valid URL with length &lt;2000 characters. If set, then Google will allow valid OIDC tokens from this issuer to authenticate within the workload_identity_pool. OIDC discovery will be performed on this URI to validate tokens from the issuer. Clearing `issuer` disables Workload Identity. `issuer` cannot be directly modified; it must be cleared (and Workload Identity disabled) before using a new issuer (and re-enabling Workload Identity).
         * 
         * @return builder
         * 
         */
        public Builder issuer(String issuer) {
            $.issuer = issuer;
            return this;
        }

        /**
         * @param oidcJwks Optional. OIDC verification keys for this Membership in JWKS format (RFC 7517). When this field is set, OIDC discovery will NOT be performed on `issuer`, and instead OIDC tokens will be validated using this field.
         * 
         * @return builder
         * 
         */
        public Builder oidcJwks(String oidcJwks) {
            $.oidcJwks = oidcJwks;
            return this;
        }

        /**
         * @param workloadIdentityPool The name of the workload identity pool in which `issuer` will be recognized. There is a single Workload Identity Pool per Hub that is shared between all Memberships that belong to that Hub. For a Hub hosted in {PROJECT_ID}, the workload pool format is `{PROJECT_ID}.hub.id.goog`, although this is subject to change in newer versions of this API.
         * 
         * @return builder
         * 
         */
        public Builder workloadIdentityPool(String workloadIdentityPool) {
            $.workloadIdentityPool = workloadIdentityPool;
            return this;
        }

        public AuthorityResponse build() {
            $.identityProvider = Objects.requireNonNull($.identityProvider, "expected parameter 'identityProvider' to be non-null");
            $.issuer = Objects.requireNonNull($.issuer, "expected parameter 'issuer' to be non-null");
            $.oidcJwks = Objects.requireNonNull($.oidcJwks, "expected parameter 'oidcJwks' to be non-null");
            $.workloadIdentityPool = Objects.requireNonNull($.workloadIdentityPool, "expected parameter 'workloadIdentityPool' to be non-null");
            return $;
        }
    }

}
