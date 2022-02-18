// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Identity-Aware Proxy
 * 
 */
public final class BackendServiceIAPResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackendServiceIAPResponse Empty = new BackendServiceIAPResponse();

    /**
     * Whether the serving infrastructure will authenticate and authorize all incoming requests. If true, the oauth2ClientId and oauth2ClientSecret fields must be non-empty.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * OAuth2 client ID to use for the authentication flow.
     * 
     */
    @InputImport(name="oauth2ClientId", required=true)
    private final String oauth2ClientId;

    public String getOauth2ClientId() {
        return this.oauth2ClientId;
    }

    /**
     * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. @InputOnly
     * 
     */
    @InputImport(name="oauth2ClientSecret", required=true)
    private final String oauth2ClientSecret;

    public String getOauth2ClientSecret() {
        return this.oauth2ClientSecret;
    }

    /**
     * SHA256 hash value for the field oauth2_client_secret above.
     * 
     */
    @InputImport(name="oauth2ClientSecretSha256", required=true)
    private final String oauth2ClientSecretSha256;

    public String getOauth2ClientSecretSha256() {
        return this.oauth2ClientSecretSha256;
    }

    public BackendServiceIAPResponse(
        Boolean enabled,
        String oauth2ClientId,
        String oauth2ClientSecret,
        String oauth2ClientSecretSha256) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.oauth2ClientId = Objects.requireNonNull(oauth2ClientId, "expected parameter 'oauth2ClientId' to be non-null");
        this.oauth2ClientSecret = Objects.requireNonNull(oauth2ClientSecret, "expected parameter 'oauth2ClientSecret' to be non-null");
        this.oauth2ClientSecretSha256 = Objects.requireNonNull(oauth2ClientSecretSha256, "expected parameter 'oauth2ClientSecretSha256' to be non-null");
    }

    private BackendServiceIAPResponse() {
        this.enabled = null;
        this.oauth2ClientId = null;
        this.oauth2ClientSecret = null;
        this.oauth2ClientSecretSha256 = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceIAPResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String oauth2ClientId;
        private String oauth2ClientSecret;
        private String oauth2ClientSecretSha256;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceIAPResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.oauth2ClientId = defaults.oauth2ClientId;
    	      this.oauth2ClientSecret = defaults.oauth2ClientSecret;
    	      this.oauth2ClientSecretSha256 = defaults.oauth2ClientSecretSha256;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setOauth2ClientId(String oauth2ClientId) {
            this.oauth2ClientId = Objects.requireNonNull(oauth2ClientId);
            return this;
        }

        public Builder setOauth2ClientSecret(String oauth2ClientSecret) {
            this.oauth2ClientSecret = Objects.requireNonNull(oauth2ClientSecret);
            return this;
        }

        public Builder setOauth2ClientSecretSha256(String oauth2ClientSecretSha256) {
            this.oauth2ClientSecretSha256 = Objects.requireNonNull(oauth2ClientSecretSha256);
            return this;
        }

        public BackendServiceIAPResponse build() {
            return new BackendServiceIAPResponse(enabled, oauth2ClientId, oauth2ClientSecret, oauth2ClientSecretSha256);
        }
    }
}
