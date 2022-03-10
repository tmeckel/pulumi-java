// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes authentication configuration that uses a custom account.
 * 
 */
public final class CustomAccountResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomAccountResponse Empty = new CustomAccountResponse();

    /**
     * The login form URL of the website.
     * 
     */
    @InputImport(name="loginUrl", required=true)
      private final String loginUrl;

    public String getLoginUrl() {
        return this.loginUrl;
    }

    /**
     * Input only. The password of the custom account. The credential is stored encrypted and not returned in any response nor included in audit logs.
     * 
     */
    @InputImport(name="password", required=true)
      private final String password;

    public String getPassword() {
        return this.password;
    }

    /**
     * The user name of the custom account.
     * 
     */
    @InputImport(name="username", required=true)
      private final String username;

    public String getUsername() {
        return this.username;
    }

    public CustomAccountResponse(
        String loginUrl,
        String password,
        String username) {
        this.loginUrl = Objects.requireNonNull(loginUrl, "expected parameter 'loginUrl' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private CustomAccountResponse() {
        this.loginUrl = null;
        this.password = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String loginUrl;
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loginUrl = defaults.loginUrl;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder loginUrl(String loginUrl) {
            this.loginUrl = Objects.requireNonNull(loginUrl);
            return this;
        }

        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public CustomAccountResponse build() {
            return new CustomAccountResponse(loginUrl, password, username);
        }
    }
}
