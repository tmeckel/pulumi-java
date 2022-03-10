// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Authority encodes how Google will recognize identities from this Membership. See the workload identity documentation for more details: https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
 * 
 */
public final class AuthorityArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorityArgs Empty = new AuthorityArgs();

    /**
     * Optional. A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://` and be a valid URL with length <2000 characters. If set, then Google will allow valid OIDC tokens from this issuer to authenticate within the workload_identity_pool. OIDC discovery will be performed on this URI to validate tokens from the issuer. Clearing `issuer` disables Workload Identity. `issuer` cannot be directly modified; it must be cleared (and Workload Identity disabled) before using a new issuer (and re-enabling Workload Identity).
     * 
     */
    @InputImport(name="issuer")
      private final @Nullable Input<String> issuer;

    public Input<String> getIssuer() {
        return this.issuer == null ? Input.empty() : this.issuer;
    }

    /**
     * Optional. OIDC verification keys for this Membership in JWKS format (RFC 7517). When this field is set, OIDC discovery will NOT be performed on `issuer`, and instead OIDC tokens will be validated using this field.
     * 
     */
    @InputImport(name="oidcJwks")
      private final @Nullable Input<String> oidcJwks;

    public Input<String> getOidcJwks() {
        return this.oidcJwks == null ? Input.empty() : this.oidcJwks;
    }

    public AuthorityArgs(
        @Nullable Input<String> issuer,
        @Nullable Input<String> oidcJwks) {
        this.issuer = issuer;
        this.oidcJwks = oidcJwks;
    }

    private AuthorityArgs() {
        this.issuer = Input.empty();
        this.oidcJwks = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> issuer;
        private @Nullable Input<String> oidcJwks;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuer = defaults.issuer;
    	      this.oidcJwks = defaults.oidcJwks;
        }

        public Builder issuer(@Nullable Input<String> issuer) {
            this.issuer = issuer;
            return this;
        }

        public Builder issuer(@Nullable String issuer) {
            this.issuer = Input.ofNullable(issuer);
            return this;
        }

        public Builder oidcJwks(@Nullable Input<String> oidcJwks) {
            this.oidcJwks = oidcJwks;
            return this;
        }

        public Builder oidcJwks(@Nullable String oidcJwks) {
            this.oidcJwks = Input.ofNullable(oidcJwks);
            return this;
        }
        public AuthorityArgs build() {
            return new AuthorityArgs(issuer, oidcJwks);
        }
    }
}
