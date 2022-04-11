// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.CookieExpirationArgs;
import io.pulumi.azurenative.web.inputs.LoginRoutesArgs;
import io.pulumi.azurenative.web.inputs.NonceArgs;
import io.pulumi.azurenative.web.inputs.TokenStoreArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the login flow of users using App Service Authentication/Authorization.
 * 
 */
public final class LoginArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoginArgs Empty = new LoginArgs();

    /**
     * External URLs that can be redirected to as part of logging in or logging out of the app. Note that the query string part of the URL is ignored.
     * This is an advanced setting typically only needed by Windows Store application backends.
     * Note that URLs within the current domain are always implicitly allowed.
     * 
     */
    @Import(name="allowedExternalRedirectUrls")
      private final @Nullable Output<List<String>> allowedExternalRedirectUrls;

    public Output<List<String>> getAllowedExternalRedirectUrls() {
        return this.allowedExternalRedirectUrls == null ? Codegen.empty() : this.allowedExternalRedirectUrls;
    }

    /**
     * The configuration settings of the session cookie's expiration.
     * 
     */
    @Import(name="cookieExpiration")
      private final @Nullable Output<CookieExpirationArgs> cookieExpiration;

    public Output<CookieExpirationArgs> getCookieExpiration() {
        return this.cookieExpiration == null ? Codegen.empty() : this.cookieExpiration;
    }

    /**
     * The configuration settings of the nonce used in the login flow.
     * 
     */
    @Import(name="nonce")
      private final @Nullable Output<NonceArgs> nonce;

    public Output<NonceArgs> getNonce() {
        return this.nonce == null ? Codegen.empty() : this.nonce;
    }

    /**
     * <code>true</code> if the fragments from the request are preserved after the login request is made; otherwise, <code>false</code>.
     * 
     */
    @Import(name="preserveUrlFragmentsForLogins")
      private final @Nullable Output<Boolean> preserveUrlFragmentsForLogins;

    public Output<Boolean> getPreserveUrlFragmentsForLogins() {
        return this.preserveUrlFragmentsForLogins == null ? Codegen.empty() : this.preserveUrlFragmentsForLogins;
    }

    /**
     * The routes that specify the endpoints used for login and logout requests.
     * 
     */
    @Import(name="routes")
      private final @Nullable Output<LoginRoutesArgs> routes;

    public Output<LoginRoutesArgs> getRoutes() {
        return this.routes == null ? Codegen.empty() : this.routes;
    }

    /**
     * The configuration settings of the token store.
     * 
     */
    @Import(name="tokenStore")
      private final @Nullable Output<TokenStoreArgs> tokenStore;

    public Output<TokenStoreArgs> getTokenStore() {
        return this.tokenStore == null ? Codegen.empty() : this.tokenStore;
    }

    public LoginArgs(
        @Nullable Output<List<String>> allowedExternalRedirectUrls,
        @Nullable Output<CookieExpirationArgs> cookieExpiration,
        @Nullable Output<NonceArgs> nonce,
        @Nullable Output<Boolean> preserveUrlFragmentsForLogins,
        @Nullable Output<LoginRoutesArgs> routes,
        @Nullable Output<TokenStoreArgs> tokenStore) {
        this.allowedExternalRedirectUrls = allowedExternalRedirectUrls;
        this.cookieExpiration = cookieExpiration;
        this.nonce = nonce;
        this.preserveUrlFragmentsForLogins = preserveUrlFragmentsForLogins;
        this.routes = routes;
        this.tokenStore = tokenStore;
    }

    private LoginArgs() {
        this.allowedExternalRedirectUrls = Codegen.empty();
        this.cookieExpiration = Codegen.empty();
        this.nonce = Codegen.empty();
        this.preserveUrlFragmentsForLogins = Codegen.empty();
        this.routes = Codegen.empty();
        this.tokenStore = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedExternalRedirectUrls;
        private @Nullable Output<CookieExpirationArgs> cookieExpiration;
        private @Nullable Output<NonceArgs> nonce;
        private @Nullable Output<Boolean> preserveUrlFragmentsForLogins;
        private @Nullable Output<LoginRoutesArgs> routes;
        private @Nullable Output<TokenStoreArgs> tokenStore;

        public Builder() {
    	      // Empty
        }

        public Builder(LoginArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExternalRedirectUrls = defaults.allowedExternalRedirectUrls;
    	      this.cookieExpiration = defaults.cookieExpiration;
    	      this.nonce = defaults.nonce;
    	      this.preserveUrlFragmentsForLogins = defaults.preserveUrlFragmentsForLogins;
    	      this.routes = defaults.routes;
    	      this.tokenStore = defaults.tokenStore;
        }

        public Builder allowedExternalRedirectUrls(@Nullable Output<List<String>> allowedExternalRedirectUrls) {
            this.allowedExternalRedirectUrls = allowedExternalRedirectUrls;
            return this;
        }
        public Builder allowedExternalRedirectUrls(@Nullable List<String> allowedExternalRedirectUrls) {
            this.allowedExternalRedirectUrls = Codegen.ofNullable(allowedExternalRedirectUrls);
            return this;
        }
        public Builder allowedExternalRedirectUrls(String... allowedExternalRedirectUrls) {
            return allowedExternalRedirectUrls(List.of(allowedExternalRedirectUrls));
        }
        public Builder cookieExpiration(@Nullable Output<CookieExpirationArgs> cookieExpiration) {
            this.cookieExpiration = cookieExpiration;
            return this;
        }
        public Builder cookieExpiration(@Nullable CookieExpirationArgs cookieExpiration) {
            this.cookieExpiration = Codegen.ofNullable(cookieExpiration);
            return this;
        }
        public Builder nonce(@Nullable Output<NonceArgs> nonce) {
            this.nonce = nonce;
            return this;
        }
        public Builder nonce(@Nullable NonceArgs nonce) {
            this.nonce = Codegen.ofNullable(nonce);
            return this;
        }
        public Builder preserveUrlFragmentsForLogins(@Nullable Output<Boolean> preserveUrlFragmentsForLogins) {
            this.preserveUrlFragmentsForLogins = preserveUrlFragmentsForLogins;
            return this;
        }
        public Builder preserveUrlFragmentsForLogins(@Nullable Boolean preserveUrlFragmentsForLogins) {
            this.preserveUrlFragmentsForLogins = Codegen.ofNullable(preserveUrlFragmentsForLogins);
            return this;
        }
        public Builder routes(@Nullable Output<LoginRoutesArgs> routes) {
            this.routes = routes;
            return this;
        }
        public Builder routes(@Nullable LoginRoutesArgs routes) {
            this.routes = Codegen.ofNullable(routes);
            return this;
        }
        public Builder tokenStore(@Nullable Output<TokenStoreArgs> tokenStore) {
            this.tokenStore = tokenStore;
            return this;
        }
        public Builder tokenStore(@Nullable TokenStoreArgs tokenStore) {
            this.tokenStore = Codegen.ofNullable(tokenStore);
            return this;
        }        public LoginArgs build() {
            return new LoginArgs(allowedExternalRedirectUrls, cookieExpiration, nonce, preserveUrlFragmentsForLogins, routes, tokenStore);
        }
    }
}
