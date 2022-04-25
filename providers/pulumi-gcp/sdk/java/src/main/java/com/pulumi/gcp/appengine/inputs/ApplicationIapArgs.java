// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationIapArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationIapArgs Empty = new ApplicationIapArgs();

    /**
     * (Optional) Whether the serving infrastructure will authenticate and authorize all incoming requests.
     * (default is false)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return (Optional) Whether the serving infrastructure will authenticate and authorize all incoming requests.
     * (default is false)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * OAuth2 client ID to use for the authentication flow.
     * 
     */
    @Import(name="oauth2ClientId", required=true)
    private Output<String> oauth2ClientId;

    /**
     * @return OAuth2 client ID to use for the authentication flow.
     * 
     */
    public Output<String> oauth2ClientId() {
        return this.oauth2ClientId;
    }

    /**
     * OAuth2 client secret to use for the authentication flow.
     * The SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field.
     * 
     */
    @Import(name="oauth2ClientSecret", required=true)
    private Output<String> oauth2ClientSecret;

    /**
     * @return OAuth2 client secret to use for the authentication flow.
     * The SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field.
     * 
     */
    public Output<String> oauth2ClientSecret() {
        return this.oauth2ClientSecret;
    }

    /**
     * Hex-encoded SHA-256 hash of the client secret.
     * 
     */
    @Import(name="oauth2ClientSecretSha256")
    private @Nullable Output<String> oauth2ClientSecretSha256;

    /**
     * @return Hex-encoded SHA-256 hash of the client secret.
     * 
     */
    public Optional<Output<String>> oauth2ClientSecretSha256() {
        return Optional.ofNullable(this.oauth2ClientSecretSha256);
    }

    private ApplicationIapArgs() {}

    private ApplicationIapArgs(ApplicationIapArgs $) {
        this.enabled = $.enabled;
        this.oauth2ClientId = $.oauth2ClientId;
        this.oauth2ClientSecret = $.oauth2ClientSecret;
        this.oauth2ClientSecretSha256 = $.oauth2ClientSecretSha256;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationIapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationIapArgs $;

        public Builder() {
            $ = new ApplicationIapArgs();
        }

        public Builder(ApplicationIapArgs defaults) {
            $ = new ApplicationIapArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled (Optional) Whether the serving infrastructure will authenticate and authorize all incoming requests.
         * (default is false)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled (Optional) Whether the serving infrastructure will authenticate and authorize all incoming requests.
         * (default is false)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param oauth2ClientId OAuth2 client ID to use for the authentication flow.
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientId(Output<String> oauth2ClientId) {
            $.oauth2ClientId = oauth2ClientId;
            return this;
        }

        /**
         * @param oauth2ClientId OAuth2 client ID to use for the authentication flow.
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientId(String oauth2ClientId) {
            return oauth2ClientId(Output.of(oauth2ClientId));
        }

        /**
         * @param oauth2ClientSecret OAuth2 client secret to use for the authentication flow.
         * The SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field.
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientSecret(Output<String> oauth2ClientSecret) {
            $.oauth2ClientSecret = oauth2ClientSecret;
            return this;
        }

        /**
         * @param oauth2ClientSecret OAuth2 client secret to use for the authentication flow.
         * The SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field.
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientSecret(String oauth2ClientSecret) {
            return oauth2ClientSecret(Output.of(oauth2ClientSecret));
        }

        /**
         * @param oauth2ClientSecretSha256 Hex-encoded SHA-256 hash of the client secret.
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientSecretSha256(@Nullable Output<String> oauth2ClientSecretSha256) {
            $.oauth2ClientSecretSha256 = oauth2ClientSecretSha256;
            return this;
        }

        /**
         * @param oauth2ClientSecretSha256 Hex-encoded SHA-256 hash of the client secret.
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientSecretSha256(String oauth2ClientSecretSha256) {
            return oauth2ClientSecretSha256(Output.of(oauth2ClientSecretSha256));
        }

        public ApplicationIapArgs build() {
            $.oauth2ClientId = Objects.requireNonNull($.oauth2ClientId, "expected parameter 'oauth2ClientId' to be non-null");
            $.oauth2ClientSecret = Objects.requireNonNull($.oauth2ClientSecret, "expected parameter 'oauth2ClientSecret' to be non-null");
            return $;
        }
    }

}
