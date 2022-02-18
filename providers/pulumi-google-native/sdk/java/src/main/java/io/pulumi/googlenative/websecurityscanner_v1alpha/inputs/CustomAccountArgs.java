// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes authentication configuration that uses a custom account.
 * 
 */
public final class CustomAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomAccountArgs Empty = new CustomAccountArgs();

    /**
     * The login form URL of the website.
     * 
     */
    @InputImport(name="loginUrl", required=true)
    private final Input<String> loginUrl;

    public Input<String> getLoginUrl() {
        return this.loginUrl;
    }

    /**
     * Input only. The password of the custom account. The credential is stored encrypted and not returned in any response nor included in audit logs.
     * 
     */
    @InputImport(name="password", required=true)
    private final Input<String> password;

    public Input<String> getPassword() {
        return this.password;
    }

    /**
     * The user name of the custom account.
     * 
     */
    @InputImport(name="username", required=true)
    private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public CustomAccountArgs(
        Input<String> loginUrl,
        Input<String> password,
        Input<String> username) {
        this.loginUrl = Objects.requireNonNull(loginUrl, "expected parameter 'loginUrl' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private CustomAccountArgs() {
        this.loginUrl = Input.empty();
        this.password = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> loginUrl;
        private Input<String> password;
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loginUrl = defaults.loginUrl;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setLoginUrl(Input<String> loginUrl) {
            this.loginUrl = Objects.requireNonNull(loginUrl);
            return this;
        }

        public Builder setLoginUrl(String loginUrl) {
            this.loginUrl = Input.of(Objects.requireNonNull(loginUrl));
            return this;
        }

        public Builder setPassword(Input<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Input.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder setUsername(Input<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }

        public CustomAccountArgs build() {
            return new CustomAccountArgs(loginUrl, password, username);
        }
    }
}
