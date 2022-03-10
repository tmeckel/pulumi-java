// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionApiConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionApiConfigGetArgs Empty = new FlexibleAppVersionApiConfigGetArgs();

    /**
     * Action to take when users access resources that require authentication.
     * Default value is `AUTH_FAIL_ACTION_REDIRECT`.
     * Possible values are `AUTH_FAIL_ACTION_REDIRECT` and `AUTH_FAIL_ACTION_UNAUTHORIZED`.
     * 
     */
    @InputImport(name="authFailAction")
      private final @Nullable Input<String> authFailAction;

    public Input<String> getAuthFailAction() {
        return this.authFailAction == null ? Input.empty() : this.authFailAction;
    }

    /**
     * Level of login required to access this resource.
     * Default value is `LOGIN_OPTIONAL`.
     * Possible values are `LOGIN_OPTIONAL`, `LOGIN_ADMIN`, and `LOGIN_REQUIRED`.
     * 
     */
    @InputImport(name="login")
      private final @Nullable Input<String> login;

    public Input<String> getLogin() {
        return this.login == null ? Input.empty() : this.login;
    }

    /**
     * Path to the script from the application root directory.
     * 
     */
    @InputImport(name="script", required=true)
      private final Input<String> script;

    public Input<String> getScript() {
        return this.script;
    }

    /**
     * Security (HTTPS) enforcement for this URL.
     * Possible values are `SECURE_DEFAULT`, `SECURE_NEVER`, `SECURE_OPTIONAL`, and `SECURE_ALWAYS`.
     * 
     */
    @InputImport(name="securityLevel")
      private final @Nullable Input<String> securityLevel;

    public Input<String> getSecurityLevel() {
        return this.securityLevel == null ? Input.empty() : this.securityLevel;
    }

    /**
     * URL to serve the endpoint at.
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public FlexibleAppVersionApiConfigGetArgs(
        @Nullable Input<String> authFailAction,
        @Nullable Input<String> login,
        Input<String> script,
        @Nullable Input<String> securityLevel,
        @Nullable Input<String> url) {
        this.authFailAction = authFailAction;
        this.login = login;
        this.script = Objects.requireNonNull(script, "expected parameter 'script' to be non-null");
        this.securityLevel = securityLevel;
        this.url = url;
    }

    private FlexibleAppVersionApiConfigGetArgs() {
        this.authFailAction = Input.empty();
        this.login = Input.empty();
        this.script = Input.empty();
        this.securityLevel = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionApiConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authFailAction;
        private @Nullable Input<String> login;
        private Input<String> script;
        private @Nullable Input<String> securityLevel;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionApiConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authFailAction = defaults.authFailAction;
    	      this.login = defaults.login;
    	      this.script = defaults.script;
    	      this.securityLevel = defaults.securityLevel;
    	      this.url = defaults.url;
        }

        public Builder authFailAction(@Nullable Input<String> authFailAction) {
            this.authFailAction = authFailAction;
            return this;
        }

        public Builder authFailAction(@Nullable String authFailAction) {
            this.authFailAction = Input.ofNullable(authFailAction);
            return this;
        }

        public Builder login(@Nullable Input<String> login) {
            this.login = login;
            return this;
        }

        public Builder login(@Nullable String login) {
            this.login = Input.ofNullable(login);
            return this;
        }

        public Builder script(Input<String> script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }

        public Builder script(String script) {
            this.script = Input.of(Objects.requireNonNull(script));
            return this;
        }

        public Builder securityLevel(@Nullable Input<String> securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }

        public Builder securityLevel(@Nullable String securityLevel) {
            this.securityLevel = Input.ofNullable(securityLevel);
            return this;
        }

        public Builder url(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }
        public FlexibleAppVersionApiConfigGetArgs build() {
            return new FlexibleAppVersionApiConfigGetArgs(authFailAction, login, script, securityLevel, url);
        }
    }
}
