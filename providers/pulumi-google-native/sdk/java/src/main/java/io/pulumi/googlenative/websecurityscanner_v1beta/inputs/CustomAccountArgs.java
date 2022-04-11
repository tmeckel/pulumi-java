// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="loginUrl", required=true)
      private final Output<String> loginUrl;

    public Output<String> getLoginUrl() {
        return this.loginUrl;
    }

    /**
     * Input only. The password of the custom account. The credential is stored encrypted and not returned in any response nor included in audit logs.
     * 
     */
    @Import(name="password", required=true)
      private final Output<String> password;

    public Output<String> getPassword() {
        return this.password;
    }

    /**
     * The user name of the custom account.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> getUsername() {
        return this.username;
    }

    public CustomAccountArgs(
        Output<String> loginUrl,
        Output<String> password,
        Output<String> username) {
        this.loginUrl = Objects.requireNonNull(loginUrl, "expected parameter 'loginUrl' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private CustomAccountArgs() {
        this.loginUrl = Codegen.empty();
        this.password = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> loginUrl;
        private Output<String> password;
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loginUrl = defaults.loginUrl;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder loginUrl(Output<String> loginUrl) {
            this.loginUrl = Objects.requireNonNull(loginUrl);
            return this;
        }
        public Builder loginUrl(String loginUrl) {
            this.loginUrl = Output.of(Objects.requireNonNull(loginUrl));
            return this;
        }
        public Builder password(Output<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder password(String password) {
            this.password = Output.of(Objects.requireNonNull(password));
            return this;
        }
        public Builder username(Output<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public Builder username(String username) {
            this.username = Output.of(Objects.requireNonNull(username));
            return this;
        }        public CustomAccountArgs build() {
            return new CustomAccountArgs(loginUrl, password, username);
        }
    }
}
